package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzrl {
    public static final zzrl zza = new zzro().zza();
    private final Map<String, String> zzb;

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final String toString() {
        return this.zzb.toString();
    }

    public final Map<String, String> zza() {
        return this.zzb;
    }

    private zzrl(Map<String, String> map) {
        this.zzb = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzrl) {
            return this.zzb.equals(((zzrl) obj).zzb);
        }
        return false;
    }
}
