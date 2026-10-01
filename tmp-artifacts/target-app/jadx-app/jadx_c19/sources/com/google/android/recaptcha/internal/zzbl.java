package com.google.android.recaptcha.internal;

import android.content.ContentValues;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.access13800;
import o.findResAndMsg;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzbl extends SuspendLambda implements Function2 {
    final /* synthetic */ zzbm zza;
    final /* synthetic */ zzpd zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbl(zzbm zzbmVar, zzpd zzpdVar, access13800 access13800Var) {
        super(2, access13800Var);
        this.zza = zzbmVar;
        this.zzb = zzpdVar;
    }

    public final access13800 create(@Nullable Object obj, @NotNull access13800 access13800Var) {
        return new zzbl(this.zza, this.zzb, access13800Var);
    }

    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create((findResAndMsg) obj, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(@NotNull Object obj) {
        Unit unit;
        ResultKt.onNavigationEvent(obj);
        zzbm zzbmVar = this.zza;
        zzpd zzpdVar = this.zzb;
        synchronized (zzbh.class) {
            if (zzbmVar.zze != null) {
                byte[] bArrZzd = zzpdVar.zzd();
                zzba zzbaVar = new zzba(zzfy.zzg().zzi(bArrZzd, 0, bArrZzd.length), System.currentTimeMillis(), 0);
                zzaz zzazVar = zzbmVar.zze;
                ContentValues contentValues = new ContentValues();
                contentValues.put("ss", zzbaVar.zzc());
                contentValues.put("ts", Long.valueOf(zzbaVar.zzb()));
                zzazVar.getWritableDatabase().insert("ce", null, contentValues);
                int iZzb = zzbmVar.zze.zzb() - 500;
                if (iZzb > 0) {
                    zzbmVar.zze.zza(CollectionsKt.take(zzbmVar.zze.zzd(), iZzb));
                }
                if (zzbmVar.zze.zzb() >= 20) {
                    zzbmVar.zzg();
                }
            }
            unit = Unit.INSTANCE;
        }
        return unit;
    }
}
