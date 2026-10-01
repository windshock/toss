package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.internal.zzbk;
import com.google.firebase.auth.zzd;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzyi {
    private String zza;
    private List<zzafq> zzb;
    private zzd zzc;

    public final zzd zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zza;
    }

    public final List<MultiFactorInfo> zzc() {
        return zzbk.zza(this.zzb);
    }

    public zzyi(String str, List<zzafq> list, @Nullable zzd zzdVar) {
        this.zza = str;
        this.zzb = list;
        this.zzc = zzdVar;
    }
}
