package com.samsung.android.ssiframework.sdk.api;

import android.os.Bundle;
import com.samsung.android.ssiframework.sdk.AuthResultListener;
import com.samsung.android.ssiframework.sdk.AuthSignal;
import o.access13800;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class SsiApiClient$DefaultImpls {
    public static /* synthetic */ AuthSignal authenticateFingerprint$default(SsiApiClient ssiApiClient, Bundle bundle, AuthResultListener authResultListener, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: authenticateFingerprint");
        }
        if ((i & 1) != 0) {
            bundle = new Bundle();
        }
        return ssiApiClient.authenticateFingerprint(bundle, authResultListener);
    }

    public static /* synthetic */ Object checkSupportedAndUpdateV10$default(SsiApiClient ssiApiClient, boolean z, boolean z2, access13800 access13800Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkSupportedAndUpdateV10");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return ssiApiClient.checkSupportedAndUpdateV10(z, z2, access13800Var);
    }

    public static /* synthetic */ Object getVcListV11$default(SsiApiClient ssiApiClient, String str, boolean z, access13800 access13800Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getVcListV11");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return ssiApiClient.getVcListV11(str, z, access13800Var);
    }
}
