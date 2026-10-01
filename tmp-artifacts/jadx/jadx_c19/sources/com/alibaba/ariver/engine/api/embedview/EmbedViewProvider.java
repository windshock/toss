package com.alibaba.ariver.engine.api.embedview;

import com.alibaba.ariver.kernel.api.annotation.DefaultImpl;
import com.alibaba.ariver.kernel.common.Proxiable;

@DefaultImpl("com.alibaba.ariver.integration.embedview.DefaultEmbedViewProvider")
/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface EmbedViewProvider extends Proxiable {
    IEmbedView createEmbedView(String str);
}
