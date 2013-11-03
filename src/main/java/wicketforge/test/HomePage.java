package wicketforge.test;

import org.apache.wicket.devutils.debugbar.DebugBar;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

/**
 * HomePage
 */
public class HomePage extends WebPage {
    public HomePage() {
        add(new DebugBar("debugBar"));

        add(new Label("label", "Hello World"));
    }
}
