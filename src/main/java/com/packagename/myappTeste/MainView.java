package com.packagename.myappTeste;

import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.server.PWA;

/**
 * The main view contains a button and a click listener.
 */
@Route("")
@HtmlImport("styles.html")
@PWA(name = "Project Base for Vaadin Flow", shortName = "Project Base")
public class MainView extends VerticalLayout implements RouterLayout{
	private static final long serialVersionUID = 1L;
	
	private FlexLayout childWrapper = new FlexLayout();

	public MainView() {
		setSizeFull();
		
        Button button = new Button("Click me",
                event -> Notification.show("Clicked!"));
        button.addClassName("bgg");
        add(button);
        
        childWrapper.setSizeFull();
		add(childWrapper);
		expand(childWrapper);
    }
	
	@Override
    public void showRouterLayoutContent(HasElement content) {//-------------------------------------------------------------------------------------------------------------------------
          System.out.println(" ----------- showRouterLayoutContent()");
          //content.getElement().getStyle().set("width", "100%");
          //content.getElement().getStyle().set("height", "100%");
          
          //showRouterLayoutContent(content);
          childWrapper.getElement().appendChild(content.getElement());
    }
}
