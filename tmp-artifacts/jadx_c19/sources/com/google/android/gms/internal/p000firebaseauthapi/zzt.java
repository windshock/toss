package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.regex.Matcher;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzt extends zzp {
    private final Matcher zza;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzp
    public final int zza() {
        return this.zza.end();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzp
    public final int zzb() {
        return this.zza.start();
    }

    zzt(Matcher matcher) {
        this.zza = (Matcher) zzz.zza(matcher);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzp
    public final boolean zza(int i2) {
        return this.zza.find(i2);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzp
    public final boolean zzc() {
        return this.zza.matches();
    }
}
