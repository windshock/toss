package com.alibaba.ariver.engine.common.extension.bind;

import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.exthub.base.ExtHubApp;
import com.alibaba.exthub.base.ExtHubPage;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ExtHubNodeBinder implements Binder<BindingNode, Node> {
    private String mAppId;
    private Page mPage;

    public ExtHubNodeBinder(String str, Page page) {
        this.mAppId = str;
        this.mPage = page;
    }

    @Override // com.alibaba.ariver.engine.common.extension.bind.Binder
    public Node bind(Class<Node> cls, BindingNode bindingNode) throws BindException {
        if (bindingNode.value() == App.class) {
            Page page = this.mPage;
            if (page == null) {
                return new ExtHubApp(this.mAppId);
            }
            App app = page.getApp();
            return app == null ? new ExtHubApp(this.mAppId) : app;
        }
        if (bindingNode.value() != Page.class) {
            return null;
        }
        Page page2 = this.mPage;
        return page2 == null ? new ExtHubPage(this.mAppId) : page2;
    }
}
