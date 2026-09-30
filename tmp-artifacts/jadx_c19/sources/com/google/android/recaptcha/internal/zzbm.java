package com.google.android.recaptcha.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import o.findResAndMsg;
import o.maybeUpdateAnimatable;
import o.setRandomHost;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzbm implements zzbh {
    public static final zzbi zza = new zzbi(null);
    private static Timer zzb;
    private final zzbn zzc;
    private final findResAndMsg zzd;
    private final zzaz zze;

    public zzbm(@NotNull Context context, @NotNull zzbn zzbnVar, @NotNull findResAndMsg findresandmsg) {
        this.zzc = zzbnVar;
        this.zzd = findresandmsg;
        zzaz zzazVar = null;
        try {
            zzaz zzazVar2 = zzaz.zzc;
            zzazVar2 = zzazVar2 == null ? new zzaz(context, null) : zzazVar2;
            zzaz.zzc = zzazVar2;
            zzazVar = zzazVar2;
        } catch (Exception unused) {
        }
        this.zze = zzazVar;
        zzh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        zzaz zzazVar;
        zzpd zzpdVarZzk;
        int iZzJ;
        int i2;
        zzaz zzazVar2 = this.zze;
        if (zzazVar2 != null) {
            for (List<zzba> list : CollectionsKt.windowed(zzazVar2.zzd(), 20, 20, true)) {
                zznh zznhVarZzi = zzni.zzi();
                ArrayList arrayList = new ArrayList();
                for (zzba zzbaVar : list) {
                    try {
                        zzpdVarZzk = zzpd.zzk(zzfy.zzg().zzj(zzbaVar.zzc()));
                        iZzJ = zzpdVarZzk.zzJ();
                        i2 = iZzJ - 1;
                    } catch (Exception unused) {
                        zzaz zzazVar3 = this.zze;
                        if (zzazVar3 != null) {
                            zzazVar3.zzf(zzbaVar);
                        }
                    }
                    if (iZzJ == 0) {
                        throw null;
                    }
                    if (i2 == 0) {
                        zznhVarZzi.zzp(zzpdVarZzk.zzf());
                    } else if (i2 == 1) {
                        zznhVarZzi.zzq(zzpdVarZzk.zzg());
                    }
                    arrayList.add(zzbaVar);
                }
                if (zznhVarZzi.zzd() + zznhVarZzi.zze() != 0) {
                    if (this.zzc.zza(((zzni) zznhVarZzi.zzj()).zzd()) && (zzazVar = this.zze) != null) {
                        zzazVar.zza(arrayList);
                    }
                }
            }
        }
    }

    private final void zzh() {
        if (zzb == null) {
            Timer timer = new Timer();
            zzb = timer;
            timer.schedule(new zzbj(this), 120000L, 120000L);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzbh
    public final void zza(@NotNull zzpd zzpdVar) {
        maybeUpdateAnimatable.onNavigationEvent(this.zzd, (CoroutineContext) null, (setRandomHost) null, new zzbl(this, zzpdVar, null), 3, (Object) null);
        zzh();
    }
}
