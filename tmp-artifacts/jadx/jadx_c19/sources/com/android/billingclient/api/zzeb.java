package com.android.billingclient.api;

import o.IEngagementSignalsCallbackDefault;
import o.onSessionEnded;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class zzeb implements onSessionEnded {
    public final /* synthetic */ ProxyBillingActivityV2 zza;

    public final void onActivityResult(Object obj) {
        this.zza.IAuthTabCallbackStub((IEngagementSignalsCallbackDefault) obj);
    }
}
