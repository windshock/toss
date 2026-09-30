package com.iap.ac.android.common.rpc.model;

import com.iap.ac.android.common.a.a;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class RpcExceptionInterceptResult {
    public boolean isHandled;
    public Object response;

    public String toString() {
        StringBuilder sbA = a.a("RpcExceptionInterceptResult{isHandled=");
        sbA.append(this.isHandled);
        sbA.append(", response=");
        sbA.append(this.response);
        sbA.append('}');
        return sbA.toString();
    }
}
