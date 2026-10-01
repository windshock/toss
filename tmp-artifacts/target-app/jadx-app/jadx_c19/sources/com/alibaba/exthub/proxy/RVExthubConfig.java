package com.alibaba.exthub.proxy;

import com.alibaba.ariver.kernel.api.annotation.DefaultImpl;
import com.alibaba.ariver.kernel.common.Proxiable;

@DefaultImpl("com.alibaba.exthub.utils.RVExthubConfigImpl")
/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface RVExthubConfig extends Proxiable {
    String getConfigCacheValue(String str, String str2);

    boolean getConfigCacheValue(String str, boolean z);

    boolean isCallbackPriority();
}
