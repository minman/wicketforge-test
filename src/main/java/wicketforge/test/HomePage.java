package wicketforge.test;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

/**
 * HomePage
 */
public class HomePage extends WebPage {
    public HomePage() {
        add(new Label("label", "Hello World"));
    }
}
