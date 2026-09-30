package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzafe {
    private List<zzafb> zza;

    public final List<zzafb> zza() {
        return this.zza;
    }

    public zzafe() {
        this.zza = new ArrayList();
    }

    public zzafe(List<zzafb> list) {
        this.zza = Collections.unmodifiableList(list);
    }
}
