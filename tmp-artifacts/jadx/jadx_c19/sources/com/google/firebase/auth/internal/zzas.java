package com.google.firebase.auth.internal;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.FirebaseNetworkException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzas implements OnFailureListener {
    private final /* synthetic */ zzat zza;

    zzas(zzat zzatVar) {
        this.zza = zzatVar;
    }

    public final void onFailure(Exception exc) {
        if (exc instanceof FirebaseNetworkException) {
            zzaq.zzc.v("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            this.zza.zza.zzd();
        }
    }
}
