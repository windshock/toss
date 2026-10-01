package com.alibaba.ariver.kernel.common.log;

import com.alibaba.ariver.kernel.api.annotation.DefaultImpl;
import com.alibaba.ariver.kernel.common.Proxiable;

@DefaultImpl("com.alibaba.ariver.kernel.common.log.DefaultAppLoggerImpl")
/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface AppLoggerProxy extends Proxiable {
    String getBizType();

    int getQosLevel();

    void log(BaseAppLog baseAppLog);
}
