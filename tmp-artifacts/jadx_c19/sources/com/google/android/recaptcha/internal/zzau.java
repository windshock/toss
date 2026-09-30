package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
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
final class zzau extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ zzaw zzb;
    final /* synthetic */ RecaptchaAction zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzau(zzaw zzawVar, RecaptchaAction recaptchaAction, long j, access13800 access13800Var) {
        super(2, access13800Var);
        this.zzb = zzawVar;
        this.zzc = recaptchaAction;
        this.zzd = j;
    }

    public final access13800 create(@Nullable Object obj, @NotNull access13800 access13800Var) {
        return new zzau(this.zzb, this.zzc, this.zzd, access13800Var);
    }

    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create((findResAndMsg) obj, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(@NotNull Object obj) {
        Object objZzk;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = this.zza;
        ResultKt.onNavigationEvent(obj);
        if (i2 != 0) {
            objZzk = ((Result) obj).onNavigationEvent();
        } else {
            zzaw zzawVar = this.zzb;
            RecaptchaAction recaptchaAction = this.zzc;
            long j = this.zzd;
            this.zza = 1;
            objZzk = zzawVar.zzk(recaptchaAction, j, this);
            if (objZzk == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        }
        ResultKt.onNavigationEvent(objZzk);
        return objZzk;
    }
}
