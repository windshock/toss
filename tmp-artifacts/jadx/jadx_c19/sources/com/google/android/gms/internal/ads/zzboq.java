package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzboq extends zzbnv {
    final /* synthetic */ zzbos zza;

    /* synthetic */ zzboq(zzbos zzbosVar, byte[] bArr) {
        Objects.requireNonNull(zzbosVar);
        this.zza = zzbosVar;
    }

    public final void zze(zzbnm zzbnmVar, String str) {
        zzbos zzbosVar = this.zza;
        if (zzbosVar.zzd() == null) {
            return;
        }
        zzbosVar.zzd().zzc(zzbosVar.zze(zzbnmVar), str);
    }
}
