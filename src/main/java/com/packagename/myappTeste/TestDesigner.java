package com.packagename.myappTeste;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the test-designer template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("test-designer")
@Route(value="testdesigner", layout = MainView.class)
@HtmlImport("styles.html")
@HtmlImport("test-designer.html")
public class TestDesigner extends PolymerTemplate<TestDesigner.TestDesignerModel> {
	private static final long serialVersionUID = 1L;
	
	@Id("vaadinVerticalLayout")
	private VerticalLayout vaadinVerticalLayout;
	@Id("btnTest")
	private Button btnTest;

	public TestDesigner() {
        // You can initialise any data required for the connected UI components here.
		btnTest.addClassName("bgg");
    }

    /**
     * This model binds properties between TestDesigner and test-designer
     */
    public interface TestDesignerModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
