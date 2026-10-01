package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzaju extends zzajt {
    private static <E> zzajg<E> zzc(Object obj, long j) {
        return (zzajg) zzamh.zze(obj, j);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzajt
    final <L> List<L> zza(Object obj, long j) {
        zzajg zzajgVarZzc = zzc(obj, j);
        if (zzajgVarZzc.zzc()) {
            return zzajgVarZzc;
        }
        int size = zzajgVarZzc.size();
        zzajg zzajgVarZza = zzajgVarZzc.zza(size == 0 ? 10 : size << 1);
        zzamh.zza(obj, j, zzajgVarZza);
        return zzajgVarZza;
    }

    private zzaju() {
        super();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzajt
    final void zzb(Object obj, long j) {
        zzc(obj, j).b_();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzajt
    final <E> void zza(Object obj, Object obj2, long j) {
        zzajg zzajgVarZzc = zzc(obj, j);
        zzajg zzajgVarZzc2 = zzc(obj2, j);
        int size = zzajgVarZzc.size();
        int size2 = zzajgVarZzc2.size();
        if (size > 0 && size2 > 0) {
            if (!zzajgVarZzc.zzc()) {
                zzajgVarZzc = zzajgVarZzc.zza(size2 + size);
            }
            zzajgVarZzc.addAll(zzajgVarZzc2);
        }
        if (size > 0) {
            zzajgVarZzc2 = zzajgVarZzc;
        }
        zzamh.zza(obj, j, zzajgVarZzc2);
    }
}
