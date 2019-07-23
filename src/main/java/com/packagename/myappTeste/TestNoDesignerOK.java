package com.packagename.myappTeste;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value="testnodesignerok", layout = MainView.class)
public class TestNoDesignerOK extends VerticalLayout{
	private static final long serialVersionUID = 1L;

	public TestNoDesignerOK() {
		Button btnOK = new Button("btnOK");
		btnOK.addClassName("bgg");
		add(btnOK);
	}

}
