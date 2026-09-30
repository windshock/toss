package com.google.android.recaptcha.internal;

import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.access13800;
import o.access14300;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzev extends ContinuationImpl {
    long zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzez zzc;
    int zzd;
    zzez zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzev(zzez zzezVar, access13800 access13800Var) {
        super(access13800Var);
        this.zzc = zzezVar;
    }

    public final Object invokeSuspend(@NotNull Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        Object objZzb = this.zzc.zzb(0L, null, this);
        return objZzb == access14300.onWarmupCompleted() ? objZzb : Result.IAuthTabCallback(objZzb);
    }
}
