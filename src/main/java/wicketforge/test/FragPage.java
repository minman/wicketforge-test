package wicketforge.test;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.Loop;
import org.apache.wicket.markup.html.list.LoopItem;
import org.apache.wicket.markup.html.panel.Fragment;

public class FragPage extends WebPage {
    public FragPage() {


/*
        Loop loop = new Loop("list", 5) {
            protected void populateItem(LoopItem item) {
                if (item.getIndex() % 2 == 0) {
                    item.add(new Fragment("panel", "frag1", FragPage.this) {
                        @Override
                        protected void onInitialize() {
                            super.onInitialize();
                            add(new Label("fraglabel1", "frag label 1"));
                        }
                    });
                } else {
                    Fragment fragment = new Fragment("panel", "frag2", FragPage.this);
                    item.add(fragment);
                    fragment.add(new Label("fraglabel2", "frag label 2"));
                }
            }
        };
        add(loop);
*/

        add(new Fragment("usage1", "frag1", FragPage.this) {
            @Override
            protected void onInitialize() {
                super.onInitialize();
                add(new Label("fraglabel1", "frag label 1"));
            }
        });
        add(new Fragment("usage2", "frag1", FragPage.this) {
            @Override
            protected void onInitialize() {
                super.onInitialize();
                add(new Fragment("fraglabel1", "nestedfrag1", FragPage.this) {
                    @Override
                    protected void onInitialize() {
                        super.onInitialize();
                        add(new Label("nestedfraglabel1", "nested frag label 1"));
                    }
                });
            }
        });

    }
}
