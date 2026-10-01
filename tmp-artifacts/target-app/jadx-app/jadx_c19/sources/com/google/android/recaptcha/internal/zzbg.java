package com.google.android.recaptcha.internal;

import android.content.Context;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzbg {
    private final String zza;
    private final Context zzb;
    private final zzab zzc;
    private final zzbh zzd;
    private final HashMap zze = new HashMap();
    private final zzt zzf;

    public zzbg(@NotNull String str, @NotNull Context context, @NotNull zzab zzabVar, @NotNull zzt zztVar, @NotNull zzbh zzbhVar) {
        this.zza = str;
        this.zzb = context;
        this.zzc = zzabVar;
        this.zzf = zztVar;
        this.zzd = zzbhVar;
    }

    public final void zza(@NotNull zzbb zzbbVar) {
        zze(zzbbVar, 3, null);
    }

    public final void zzb(@NotNull zzbb zzbbVar, @NotNull zzp zzpVar, @Nullable String str) {
        int iZza = zzpVar.zzb().zza();
        int iZza2 = zzpVar.zza().zza();
        String strZzd = zzpVar.zzd();
        zzmq zzmqVarZzg = zzmr.zzg();
        zzmqVarZzg.zzp(String.valueOf(iZza));
        zzmqVarZzg.zzd(iZza2);
        if (strZzd != null) {
            zzmqVarZzg.zze(strZzd);
        }
        zze(zzbbVar, 4, (zzmr) zzmqVarZzg.zzj());
    }

    public final void zzd(@NotNull zzpd zzpdVar) {
        this.zzd.zza(zzpdVar);
    }

    protected final void zze(@NotNull zzbb zzbbVar, @NotNull int i2, @Nullable zzmr zzmrVar) {
        zzx zzxVar;
        zzbf zzbfVar = (zzbf) this.zze.get(zzbbVar);
        if (zzbfVar != null) {
            zznf zznfVarZza = zzbfVar.zza(i2, zzmrVar, this.zzb);
            zzpc zzpcVarZzi = zzpd.zzi();
            zzpcVarZzi.zzd(zznfVarZza);
            zzpd zzpdVar = (zzpd) zzpcVarZzi.zzj();
            zzne zzneVarZza = zzbbVar.zza();
            long jZzf = zznfVarZza.zzf();
            int iOrdinal = zzneVarZza.ordinal();
            if (iOrdinal == 1) {
                zzxVar = zzx.zzd;
            } else if (iOrdinal == 2) {
                zzxVar = zzx.zze;
            } else if (iOrdinal == 5) {
                zzxVar = zzx.zzf;
            } else if (iOrdinal == 6) {
                zzxVar = zzx.zzg;
            } else if (iOrdinal != 24) {
                switch (iOrdinal) {
                    case 12:
                        zzxVar = zzx.zzh;
                        break;
                    case 13:
                        zzxVar = zzx.zzi;
                        break;
                    case 14:
                        zzxVar = zzx.zzj;
                        break;
                    default:
                        zzxVar = zzx.zzb;
                        break;
                }
            } else {
                zzxVar = zzx.zzk;
            }
            zzv.zza(zzxVar.zza(), jZzf * 1000);
            this.zzd.zza(zzpdVar);
        }
    }
}
