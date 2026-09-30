package com.google.ads.mediation;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzd extends FullScreenContentCallback {
    final AbstractAdViewAdapter zza;
    final MediationInterstitialListener zzb;

    public zzd(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
        this.zza = abstractAdViewAdapter;
        this.zzb = mediationInterstitialListener;
    }

    public final void onAdDismissedFullScreenContent() {
        this.zzb.onAdClosed(this.zza);
    }

    public final void onAdShowedFullScreenContent() {
        this.zzb.onAdOpened(this.zza);
    }
}
