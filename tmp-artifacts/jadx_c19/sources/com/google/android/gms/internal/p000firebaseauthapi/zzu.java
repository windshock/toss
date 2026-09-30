package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzu extends zzs implements Serializable {
    private final Pattern zza;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzs
    public final zzp zza(CharSequence charSequence) {
        return new zzt(this.zza.matcher(charSequence));
    }

    public final String toString() {
        return this.zza.toString();
    }

    zzu(Pattern pattern) {
        this.zza = (Pattern) zzz.zza(pattern);
    }
}
