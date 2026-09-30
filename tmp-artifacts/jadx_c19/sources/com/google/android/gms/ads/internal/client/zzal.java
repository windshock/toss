package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbvu;
import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzal extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzr zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzbvu zzd;
    final /* synthetic */ zzaw zze;

    zzal(zzaw zzawVar, Context context, zzr zzrVar, String str, zzbvu zzbvuVar) {
        this.zza = context;
        this.zzb = zzrVar;
        this.zzc = str;
        this.zzd = zzbvuVar;
        Objects.requireNonNull(zzawVar);
        this.zze = zzawVar;
    }

    public final /* synthetic */ Object zza() {
        zzaw.zzl(this.zza, "banner");
        return new zzfh();
    }

    public final /* synthetic */ Object zzb() throws RemoteException {
        return this.zze.zzm().zza(this.zza, this.zzb, this.zzc, this.zzd, 1);
    }

    public final /* synthetic */ Object zzc(zzco zzcoVar) throws RemoteException {
        return zzcoVar.zza(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, this.zzd, 262180000);
    }
}
