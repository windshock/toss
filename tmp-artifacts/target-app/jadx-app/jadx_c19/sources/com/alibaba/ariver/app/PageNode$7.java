package com.alibaba.ariver.app;

import com.alibaba.ariver.app.api.AppContext;
import com.alibaba.ariver.engine.api.bridge.model.GoBackCallback;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class PageNode$7 implements GoBackCallback {
    final /* synthetic */ PageNode this$0;

    PageNode$7(PageNode pageNode) {
        this.this$0 = pageNode;
    }

    public void afterProcess(final boolean z) {
        ExecutorUtils.runOnMain(new Runnable() { // from class: com.alibaba.ariver.app.PageNode$7.1
            @Override // java.lang.Runnable
            public void run() {
                if (PageNode$7.this.this$0.getApp() == null) {
                    RVLogger.d("AriverApp:Page", "goBack afterProcess but app is null!");
                    return;
                }
                boolean booleanValue = PageNode$7.this.this$0.getApp().getBooleanValue("receivedPrepareFinish");
                RVLogger.d("AriverApp:Page", "goBack afterProcess intercept: " + z + ", receivedPrepareFinish: " + booleanValue);
                if (!z && booleanValue) {
                    AppContext appContext = PageNode$7.this.this$0.getApp().getAppContext();
                    if (PageNode$7.this.this$0.getApp().getChildCount() == 1 && appContext != null && appContext.getContext() != null && appContext.isTaskRoot() && appContext.moveToBackground()) {
                        RVLogger.d("AriverApp:Page", "goBack keep alive intercept");
                        return;
                    }
                }
                if (z || PageNode.access$300(PageNode$7.this.this$0).get()) {
                    return;
                }
                PageNode$7.this.this$0.performBack();
            }
        });
    }
}
