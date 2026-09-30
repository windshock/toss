package com.alibaba.ariver.app.api.ui;

import android.view.View;
import android.view.ViewGroup;
import com.alibaba.ariver.app.api.Page;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface PageContainer {
    void addRenderView(View view);

    void attachPage(Page page);

    ViewGroup getView();
}
