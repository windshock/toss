package com.google.firebase.auth;

import com.google.firebase.auth.internal.IdTokenListener;
import com.google.firebase.internal.InternalTokenResult;
import java.util.Iterator;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzy implements Runnable {
    private final /* synthetic */ FirebaseAuth zza;
    private final /* synthetic */ InternalTokenResult zzb;

    zzy(FirebaseAuth firebaseAuth, InternalTokenResult internalTokenResult) {
        this.zza = firebaseAuth;
        this.zzb = internalTokenResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = FirebaseAuth.zzi(this.zza).iterator();
        while (it.hasNext()) {
            ((IdTokenListener) it.next()).onIdTokenChanged(this.zzb);
        }
        Iterator it2 = FirebaseAuth.zzh(this.zza).iterator();
        while (it2.hasNext()) {
            ((FirebaseAuth$IdTokenListener) it2.next()).onIdTokenChanged(this.zza);
        }
    }
}
