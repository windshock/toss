package com.google.firebase.auth;

import java.util.Iterator;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzx implements Runnable {
    private final /* synthetic */ FirebaseAuth zza;

    zzx(FirebaseAuth firebaseAuth) {
        this.zza = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = FirebaseAuth.zzg(this.zza).iterator();
        while (it.hasNext()) {
            ((FirebaseAuth$AuthStateListener) it.next()).onAuthStateChanged(this.zza);
        }
    }
}
