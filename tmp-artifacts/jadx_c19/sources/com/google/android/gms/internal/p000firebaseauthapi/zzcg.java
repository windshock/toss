package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzcg {
    private static final CopyOnWriteArrayList<zzcd> zza = new CopyOnWriteArrayList<>();

    @Deprecated
    public static zzcd zza(String str) throws GeneralSecurityException {
        Iterator<zzcd> it = zza.iterator();
        while (it.hasNext()) {
            zzcd next = it.next();
            if (next.zzb(str)) {
                return next;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: " + str);
    }
}
