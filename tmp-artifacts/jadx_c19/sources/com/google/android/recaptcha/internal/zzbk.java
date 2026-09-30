package com.google.android.recaptcha.internal;

import java.util.Timer;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.access13800;
import o.findResAndMsg;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzbk extends SuspendLambda implements Function2 {
    final /* synthetic */ zzbm zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbk(zzbm zzbmVar, access13800 access13800Var) {
        super(2, access13800Var);
        this.zza = zzbmVar;
    }

    public final access13800 create(@Nullable Object obj, @NotNull access13800 access13800Var) {
        return new zzbk(this.zza, access13800Var);
    }

    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create((findResAndMsg) obj, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(@NotNull Object obj) {
        Unit unit;
        ResultKt.onNavigationEvent(obj);
        zzbm zzbmVar = this.zza;
        synchronized (zzbh.class) {
            zzaz zzazVar = zzbmVar.zze;
            if (zzazVar != null && zzazVar.zzb() == 0) {
                Timer timer = zzbm.zzb;
                if (timer != null) {
                    timer.cancel();
                }
                zzbm.zzb = null;
            }
            zzbmVar.zzg();
            unit = Unit.INSTANCE;
        }
        return unit;
    }
}
