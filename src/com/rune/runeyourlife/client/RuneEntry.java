package com.rune.runeyourlife.client;

import com.rune.runeyourlife.client.*;
import com.google.gwt.core.client.EntryPoint;

import java.util.Formatter;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.Window.Navigator;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.Frame;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PushButton;
import com.google.gwt.user.client.ui.ResizeLayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.googlecode.mgwt.*;
import com.googlecode.mgwt.ui.client.MGWT;
import com.googlecode.mgwt.ui.client.MGWTSettings;
import com.googlecode.mgwt.ui.client.animation.AnimationHelper;
import com.googlecode.mgwt.ui.client.widget.animation.Animations;
import com.googlecode.mgwt.ui.client.widget.panel.Panel;
import com.googlecode.mgwt.ui.client.widget.*;
import com.googlecode.mgwt.ui.client.widget.panel.flex.FlexPanel;
import com.googlecode.mgwt.ui.client.widget.panel.flex.RootFlexPanel;
import com.googlecode.mgwt.ui.client.widget.panel.scroll.ScrollPanel;

@SuppressWarnings("unused")
public class RuneEntry implements EntryPoint {

	@Override
	public void onModuleLoad() {
		// TODO Auto-generated method stub
		Image pic = new Image("/img/pic.jpg");
		if((Navigator.getPlatform() == "iPhone") || (Navigator.getPlatform() == "iPad") || (Navigator.getPlatform() == "Android") || (Navigator.getPlatform() == "Linux armv7l") || (Navigator.getPlatform() == "null")){
			MGWT.applySettings(MGWTSettings.getAppSetting());
			AnimationHelper animationHelper = new AnimationHelper();
		    RootPanel.get().add(animationHelper);
		 // build some UI
		    ScrollPanel spanel = new ScrollPanel();
//		    spanel.setHeight("2000px");
		    spanel.setScrollingEnabledY(true);
		    spanel.setAutoHandleResize(true);
		    Panel panel = new Panel();
		    RootFlexPanel rootFlexPanel = new RootFlexPanel();
//		    rootFlexPanel.setHeight("3000px");
			WorkPanel w = new WorkPanel();
			w.setHeight("50px");
			BioPanel b = new BioPanel(spanel);
			b.setHeight("50px");
			ContactPanel c = new ContactPanel();
			c.setHeight("50px");
		    panel.add(w);
		    panel.add(b);
		    panel.add(c);
//		    panel.add(new Image("/img/pic.jpg"));
//		    Image pic = new Image("/img/pic.jpg");
		    //pic.setSize("200px","200px");
		    pic.setSize("275px","275px");
		    //panel.add(pic);
//		    panel.setHeight("2000px");
		    spanel.add(panel);
		    spanel.setMinScrollY(3000);
//		    ResizeLayoutPanel r = new ResizeLayoutPanel();
//		    r.add(spanel);
		    rootFlexPanel.add(spanel);
		    animationHelper.goTo(rootFlexPanel, Animations.SLIDE);
			
		}
		else{
			WorkPanel w = new WorkPanel();
//			w.setHeight("50px");
			BioPanel b = new BioPanel(null);
//			b.setHeight("50px");
			ContactPanel c = new ContactPanel();
//			c.setHeight("50px");
			RootPanel.get("stuff").add(w);
			RootPanel.get("stuff").add(b);
			RootPanel.get("stuff").add(c);
//			pic.setSize("200px","200px");
			//RootPanel.get("bg_panel").add(pic);
		}

	}

}
