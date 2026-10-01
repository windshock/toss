package com.google.firebase.auth.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzat implements Runnable {
    final /* synthetic */ zzaq zza;
    private final String zzb;

    zzat(zzaq zzaqVar, String str) {
        this.zza = zzaqVar;
        this.zzb = Preconditions.checkNotEmpty(str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(FirebaseApp.getInstance(this.zzb));
        if (firebaseAuth.getCurrentUser() != null) {
            Task accessToken = firebaseAuth.getAccessToken(true);
            zzaq.zzc.v("Token refreshing started", new Object[0]);
            accessToken.addOnFailureListener(new zzas(this));
        }
    }
}
