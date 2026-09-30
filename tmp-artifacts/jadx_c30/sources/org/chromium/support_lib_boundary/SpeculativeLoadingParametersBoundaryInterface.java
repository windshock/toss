package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface SpeculativeLoadingParametersBoundaryInterface {
    Map<String, String> getAdditionalHeaders();

    InvocationHandler getNoVarySearchData();

    boolean isJavaScriptEnabled();
}
