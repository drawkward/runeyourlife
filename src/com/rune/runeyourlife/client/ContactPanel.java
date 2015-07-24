package com.rune.runeyourlife.client;

import com.google.gwt.user.client.ui.DisclosurePanel;
import com.google.gwt.user.client.ui.HTML;
//import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class ContactPanel extends VerticalPanel{

	public ContactPanel(){
		this.setTitle("NO HATE MAIL");
        
        final DisclosurePanel contactDisclosurePanel = new DisclosurePanel("Contact");
        contactDisclosurePanel.setOpen(false);
        contactDisclosurePanel.setHeader(new HTML("Contact"));
        contactDisclosurePanel.getHeader().setStyleName("disclosureHeader");
        contactDisclosurePanel.setAnimationEnabled(true);
        this.add(contactDisclosurePanel);
        
        final VerticalPanel contactPanel = new VerticalPanel();
        contactPanel.setSize("100px", "25px");

        contactPanel.add(new HTML("<font face='Menlo' size='medium'><a href='mailto:ryan@runeengineering.com'>say hey</a></font>"));
        contactDisclosurePanel.add(contactPanel);
       
	}
}
