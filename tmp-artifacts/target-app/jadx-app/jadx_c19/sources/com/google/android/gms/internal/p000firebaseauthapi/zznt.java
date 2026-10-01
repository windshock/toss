package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zznt {
    private static final zznt zza = new zznt();
    private final Map<String, zzci> zzb = new HashMap();

    public static zznt zza() {
        return zza;
    }

    zznt() {
    }

    private final void zza(String str, zzci zzciVar) throws GeneralSecurityException {
        synchronized (this) {
            if (this.zzb.containsKey(str)) {
                if (this.zzb.get(str).equals(zzciVar)) {
                    return;
                }
                throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + String.valueOf(this.zzb.get(str)) + "), cannot insert " + String.valueOf(zzciVar));
            }
            this.zzb.put(str, zzciVar);
        }
    }

    public final void zza(Map<String, zzci> map) throws GeneralSecurityException {
        synchronized (this) {
            for (Map.Entry<String, zzci> entry : map.entrySet()) {
                zza(entry.getKey(), entry.getValue());
            }
        }
    }
}
