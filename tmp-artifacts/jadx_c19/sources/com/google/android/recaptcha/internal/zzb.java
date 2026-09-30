package com.google.android.recaptcha.internal;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.access13800;
import o.access14300;
import o.findResAndMsg;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzb extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ zza zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzb(zza zzaVar, String str, long j, access13800 access13800Var) {
        super(2, access13800Var);
        this.zzb = zzaVar;
        this.zzc = str;
        this.zzd = j;
    }

    public final access13800 create(@Nullable Object obj, @NotNull access13800 access13800Var) {
        return new zzb(this.zzb, this.zzc, this.zzd, access13800Var);
    }

    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create((findResAndMsg) obj, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(@NotNull Object obj) throws zzp {
        Object objZza;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = this.zza;
        ResultKt.onNavigationEvent(obj);
        if (i2 != 0) {
            objZza = ((Result) obj).onNavigationEvent();
        } else {
            zza zzaVar = this.zzb;
            String str = this.zzc;
            long j = this.zzd;
            this.zza = 1;
            objZza = zzaVar.zza(str, j, this);
            if (objZza == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        }
        return Result.IAuthTabCallback(objZza);
    }
}
