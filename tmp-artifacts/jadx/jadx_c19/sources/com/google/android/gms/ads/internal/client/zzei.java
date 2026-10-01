package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.LoadAdError;
import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzei extends zzaz {
    final /* synthetic */ zzek zza;

    zzei(zzek zzekVar) {
        Objects.requireNonNull(zzekVar);
        this.zza = zzekVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzaz
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        zzek zzekVar = this.zza;
        zzekVar.zzE().zza(zzekVar.zzz());
        super.onAdFailedToLoad(loadAdError);
    }

    @Override // com.google.android.gms.ads.internal.client.zzaz
    public final void onAdLoaded() {
        zzek zzekVar = this.zza;
        zzekVar.zzE().zza(zzekVar.zzz());
        super.onAdLoaded();
    }
}
