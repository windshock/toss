package com.google.android.recaptcha;

import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.access13800;
import o.access14300;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class Recaptcha$getClient$1 extends ContinuationImpl {
    /* synthetic */ Object zza;
    final /* synthetic */ Recaptcha zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Recaptcha$getClient$1(Recaptcha recaptcha, access13800 access13800Var) {
        super(access13800Var);
        this.zzb = recaptcha;
    }

    public final Object invokeSuspend(@NotNull Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objM57getClientBWLJW6A = this.zzb.m57getClientBWLJW6A(null, null, 0L, this);
        return objM57getClientBWLJW6A == access14300.onWarmupCompleted() ? objM57getClientBWLJW6A : Result.IAuthTabCallback(objM57getClientBWLJW6A);
    }
}
