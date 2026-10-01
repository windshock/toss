package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzro {
    private HashMap<String, String> zza = new HashMap<>();

    public final zzrl zza() {
        HashMap<String, String> map = this.zza;
        if (map == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        zzrl zzrlVar = new zzrl(Collections.unmodifiableMap(map));
        this.zza = null;
        return zzrlVar;
    }
}
