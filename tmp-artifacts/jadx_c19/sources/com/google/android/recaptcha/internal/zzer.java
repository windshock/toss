package com.google.android.recaptcha.internal;

import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.access13800;
import o.access14300;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzer extends ContinuationImpl {
    /* synthetic */ Object zza;
    final /* synthetic */ zzez zzb;
    int zzc;
    zzez zzd;
    String zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzer(zzez zzezVar, access13800 access13800Var) {
        super(access13800Var);
        this.zzb = zzezVar;
    }

    public final Object invokeSuspend(@NotNull Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objZza = this.zzb.zza(null, 0L, this);
        return objZza == access14300.onWarmupCompleted() ? objZza : Result.IAuthTabCallback(objZza);
    }
}
