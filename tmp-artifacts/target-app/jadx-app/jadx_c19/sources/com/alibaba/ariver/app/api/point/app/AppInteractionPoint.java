package com.alibaba.ariver.app.api.point.app;

import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.kernel.api.extension.Extension;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface AppInteractionPoint extends Extension {
    void onAppInteraction(App app);
}
