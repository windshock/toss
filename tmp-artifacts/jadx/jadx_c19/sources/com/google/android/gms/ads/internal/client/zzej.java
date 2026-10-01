package com.google.android.gms.ads.internal.client;

import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final /* synthetic */ class zzej implements Runnable {
    private final /* synthetic */ zzek zza;
    private final /* synthetic */ IObjectWrapper zzb;

    /* synthetic */ zzej(zzek zzekVar, IObjectWrapper iObjectWrapper) {
        this.zza = zzekVar;
        this.zzb = iObjectWrapper;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        this.zza.zzD(this.zzb);
    }
}
