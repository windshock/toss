package com.google.android.recaptcha.internal;

import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.access13800;
import o.access14300;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzas extends ContinuationImpl {
    /* synthetic */ Object zza;
    final /* synthetic */ zzaw zzb;
    int zzc;
    zzaw zzd;
    zzbd zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzas(zzaw zzawVar, access13800 access13800Var) {
        super(access13800Var);
        this.zzb = zzawVar;
    }

    public final Object invokeSuspend(@NotNull Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objZzk = this.zzb.zzk(null, 0L, this);
        return objZzk == access14300.onWarmupCompleted() ? objZzk : Result.IAuthTabCallback(objZzk);
    }
}
