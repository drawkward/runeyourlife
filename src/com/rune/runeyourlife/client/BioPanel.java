package com.rune.runeyourlife.client;
import com.google.gwt.event.logical.shared.OpenEvent;
import com.google.gwt.event.logical.shared.OpenHandler;
import com.google.gwt.user.client.ui.DisclosurePanel;
import com.google.gwt.user.client.ui.HTML;
//import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.googlecode.mgwt.ui.client.widget.panel.scroll.ScrollPanel;

public class BioPanel extends VerticalPanel{
	public BioPanel(final ScrollPanel p){
		this.setTitle("HISTORY IN THE MAKING");
		final DisclosurePanel bio = new DisclosurePanel("Bio");
		/*
		bio.addOpenHandler(new OpenHandler<DisclosurePanel>(){
			@Override
			public void onOpen(OpenEvent<DisclosurePanel> event) {
				if(p != null){
					p.refresh();
				}
			}
		});
		*/
	    bio.setOpen(false);
	    bio.setHeader(new HTML("Bio"));
	    bio.getHeader().setStyleName("disclosureHeader");
	    bio.setAnimationEnabled(true);
	    this.add(bio);
	    final VerticalPanel bioPanel = new VerticalPanel();
	    if(p == null){
	    	bioPanel.add(new HTML("<div style=\"background-color: #ffffff; opacity: 0.8; font-family:Menlo\">"
	        		+"<font face='Menlo' size='3'>"
	        		+"<p><a href=\"https://en.wikipedia.org/wiki/Runes\" target=\"_blank\">Rune</a>, LLC is an engineering firm based in Saint Louis, Missouri, USA,"
	        		+" with headquarters at 1957 Cherokee Street.  Our work includes mobile software, integrated electrical and computer engineering"
	        		+" solutions (some of you call this the \"Internet of Things\", though our capabilities in this realm are not limited to networked solutions),"
	        		+" consulting, concept development, and  more.  We at Rune all come"
	        		+" from various engineering backgrounds, and so can offer novel solutions in several different areas of discipline.  The name, Rune,"
	        		+" was inspired by the idea that what we do is often percieved as magic, and much of it is wrapped in various forms of code, so we"
	        		+" thought we'd take the name of an ancient code which has long been enshrouded in mystery and intrigue."
	        		+" Whether you're an individual with a wicked idea for the next big mobile app, or an existing company looking to develop a new solution,"
	        		+" we'd love to hear from you and talk about how we can help turn your vision into a reality.  Click the \"Contact\" link below to start"
	        		+" the conversation."
	        		+"</p>"
	        		+"</font></div>"));
	    }
	    else{
	    	bioPanel.add(new HTML("<div style=\"background-color: #ffffff; font-family:Menlo\">"
	        		+"<p><a href=\"https://en.wikipedia.org/wiki/Runes\" target=\"_blank\">Rune</a>, LLC is an engineering firm based in Saint Louis, Missouri, USA,"
	        		+" with headquarters at 1957 Cherokee Street.  Our work includes mobile software, integrated electrical and computer engineering"
	        		+" solutions (some of you call this the \"Internet of Things\", though our capabilities in this realm are not limited to networked solutions),"
	        		+" consulting, concept development, and  more."
	        		+" Whether you're an individual with a wicked idea for the next big mobile app, or an existing company looking to develop a new solution,"
	        		+" we'd love to hear from you and talk about how we can help turn your vision into a reality.  Click the \"Contact\" link below to start"
	        		+" the conversation."
	        		+"</p>"
	        		+"</font></div>"));
	    }
	    if(p != null){
	    	bioPanel.setSize("80vw","50vh");
	    	ScrollPanel sp = new ScrollPanel();
	    	sp.setAutoHandleResize(true);
	    	sp.setHeight("61vh");
	    	sp.setMinScrollY(3000);
	    	sp.setScrollingEnabledY(true);
	    	sp.add(bioPanel);
	    	bio.add(sp);
	    }
	    else{
	    	bioPanel.setSize("90vw", "80vh");
	    	bio.add(bioPanel);
	    }
	}
		
}
