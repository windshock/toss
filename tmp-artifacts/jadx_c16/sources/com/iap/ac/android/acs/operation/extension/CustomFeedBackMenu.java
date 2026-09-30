package com.iap.ac.android.acs.operation.extension;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.griver.api.common.menu.GriverMenuItem;
import com.alibaba.griver.core.ui.menu.FeedbackMenu;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class CustomFeedBackMenu extends FeedbackMenu {
    public CustomFeedBackMenu() {
        ((GriverMenuItem) this).listener = null;
    }

    public boolean canShow(Page page) {
        return ((GriverMenuItem) this).show;
    }
}
