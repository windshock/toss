package com.alibaba.ariver.engine.api;

import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.common.Proxiable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface EngineFactory extends Proxiable {
    RVEngine createEngine(String str, Node node, String str2);

    String getEngineType(String str);
}
