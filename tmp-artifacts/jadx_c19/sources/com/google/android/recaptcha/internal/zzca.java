package com.google.android.recaptcha.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import o.access13800;
import o.access14300;
import o.findRes;
import o.findResAndMsg;
import o.maybeUpdateAnimatable;
import o.setRandomHost;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzca implements zzbu {
    public static final zzbv zza = new zzbv(null);
    private final findResAndMsg zzb;
    private final zzcl zzc;
    private final zzee zzd;
    private final Map zze;
    private final Map zzf;

    public zzca(@NotNull findResAndMsg findresandmsg, @NotNull zzcl zzclVar, @NotNull zzee zzeeVar, @NotNull Map map) {
        this.zzb = findresandmsg;
        this.zzc = zzclVar;
        this.zzd = zzeeVar;
        this.zze = map;
        this.zzf = zzclVar.zzb().zzc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzg(List list, zzcj zzcjVar, access13800 access13800Var) {
        Object objOnExtraCallbackWithResult = findRes.onExtraCallbackWithResult(new zzbx(zzcjVar, list, this, (access13800) null), access13800Var);
        return objOnExtraCallbackWithResult == access14300.onWarmupCompleted() ? objOnExtraCallbackWithResult : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzh(Exception exc, zzcj zzcjVar, access13800 access13800Var) {
        Object objOnExtraCallbackWithResult = findRes.onExtraCallbackWithResult(new zzby(exc, zzcjVar, this, (access13800) null), access13800Var);
        return objOnExtraCallbackWithResult == access14300.onWarmupCompleted() ? objOnExtraCallbackWithResult : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzae */
    public final void zzi(zzpr zzprVar, zzcj zzcjVar) throws zzae {
        zzfh zzfhVarZzb = zzfh.zzb();
        int iZza = zzcjVar.zza();
        zzdd zzddVar = (zzdd) this.zze.get(Integer.valueOf(zzprVar.zzf()));
        if (zzddVar == null) {
            throw new zzae(5, 2, (Throwable) null);
        }
        int iZzg = zzprVar.zzg();
        zzpq[] zzpqVarArr = (zzpq[]) zzprVar.zzj().toArray(new zzpq[0]);
        zzddVar.zza(iZzg, zzcjVar, (zzpq[]) Arrays.copyOf(zzpqVarArr, zzpqVarArr.length));
        if (iZza == zzcjVar.zza()) {
            zzcjVar.zzg(zzcjVar.zza() + 1);
        }
        zzfhVarZzb.zzf();
        long jZza = zzfhVarZzb.zza(TimeUnit.MICROSECONDS);
        int iZzk = zzprVar.zzk();
        if (iZzk == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzv.zza(iZzk - 2, jZza);
        zzprVar.zzk();
        zzprVar.zzg();
        CollectionsKt.joinToString$default(zzprVar.zzj(), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new zzbw(this), 31, (Object) null);
    }

    @Override // com.google.android.recaptcha.internal.zzbu
    public final void zza(@NotNull String str) {
        maybeUpdateAnimatable.onNavigationEvent(this.zzb, (CoroutineContext) null, (setRandomHost) null, new zzbz(new zzcj(this.zzc), this, str, (access13800) null), 3, (Object) null);
    }
}
