package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzamc extends RuntimeException {
    private final List<String> zza;

    public final zzajj zza() {
        return new zzajj(getMessage());
    }

    public zzamc(zzakk zzakkVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.zza = null;
    }
}
