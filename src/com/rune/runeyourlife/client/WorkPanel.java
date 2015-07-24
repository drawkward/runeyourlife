package com.rune.runeyourlife.client;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.cellview.client.CellBrowser;
import com.google.gwt.user.cellview.client.CellBrowser.Builder;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.DisclosurePanel;
import com.google.gwt.user.client.ui.Frame;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.NativeVerticalScrollbar;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SplitLayoutPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.view.client.TreeViewModel;

@SuppressWarnings("unused")

public class WorkPanel extends VerticalPanel{
	
	public WorkPanel(){
		
		this.setTitle("WHAT WE'VE DONE");
		
		final DisclosurePanel workDisclosurePanel = new DisclosurePanel("Work");
        workDisclosurePanel.setOpen(false);
        workDisclosurePanel.setHeader(new HTML("Work"));
        workDisclosurePanel.getHeader().setStyleName("disclosureHeader");
        workDisclosurePanel.setAnimationEnabled(true);
        this.add(workDisclosurePanel);
        
        final VerticalPanel workPanel = new VerticalPanel();
		/*
        Frame makeway = new Frame("<a href=\"https://itunes.apple.com/sb/app/makeway-safety/id975036053?mt=8\" target=\"_blank\"><img src=\"/img/makewayicon.png\"></a>");
        makeway.setSize("175px", "175px");
        workPanel.add(makeway);
        
        Frame rank = new Frame("<a href=\"https://itunes.apple.com/sb/app/rank-order/id568758162?mt=8\" target=\"_blank\"><img src=\"/img/rankordericon.jpeg\"></a>");
        rank.setSize("175px", "175px");
        workPanel.add(rank);
        
        Frame cook = new Frame("<a href=\"https://itunes.apple.com/sb/app/get-cooking/id688949989?mt=8\" target=\"_blank\"><img src=\"/img/getcookingicon.jpeg\"></a>");
        cook.setSize("175px", "175px");
        workPanel.add(cook);
        */
        workPanel.add(new HTML("<div style='background-color: #ffffff; opacity: 0.8;'>"
        		+"<p><a href=\"https://itunes.apple.com/sb/app/makeway-safety/id975036053?mt=8\" target=\"_blank\"><img src=\"/img/makewayicon.png\"></a></p>"
        		+"<p><a href=\"https://itunes.apple.com/sb/app/rank-order/id568758162?mt=8\" target=\"_blank\"><img src=\"../img/rankordericon.jpeg\"></a></p>"
        		+"<p><a href=\"https://itunes.apple.com/sb/app/get-cooking/id688949989?mt=8\" target=\"_blank\"><img src=\"/img/getcookingicon.jpeg\"></a></p>"
        		+"</div>"));

        /*
        Frame helper = new Frame("<a href=\"https://itunes.apple.com/us/app/helper-helper/id670630951?mt=8\" target=\"_blank\"><img src=\"img/helpericon.jpeg\"></a>");
        helper.setSize("175px", "175px");
        workPanel.add(helper);
        */
        
        workDisclosurePanel.add(workPanel);
	}

}
