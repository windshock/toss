package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzaat extends zzacw<zzafj, Void> {
    private final zzxz zzy;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzadh
    public final String zza() {
        return "getRecaptchaConfig";
    }

    public zzaat(@Nullable String str, String str2) {
        super(10);
        Preconditions.checkNotEmpty(str2);
        this.zzy = new zzxz(str, str2);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzacw
    public final void zzb() {
        zzb(this.zzt);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzadh
    public final void zza(TaskCompletionSource taskCompletionSource, zzace zzaceVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaceVar.zza(this.zzy, this.zzb);
    }
}
