package com.tnkfactory.ad.rwd;

import android.content.Context;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class AdvertisingIdInfo {
    public final String a;
    public final boolean b;

    public AdvertisingIdInfo(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public static AdvertisingIdInfo requestIdInfo(Context context) {
        return AdvertisingIdService.INSTANCE.getAdvertisingIdInfo(context);
    }

    public String getId() {
        return this.a;
    }

    public boolean isLimited() {
        return this.b;
    }
}
