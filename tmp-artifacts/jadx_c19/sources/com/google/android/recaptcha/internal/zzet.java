package com.google.android.recaptcha.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.access13800;
import o.access14300;
import o.findResAndMsg;
import o.getPackageType;
import o.getResRootDir;
import o.maybeUpdateAnimatable;
import o.pauseMyRequest;
import o.setRandomHost;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzet extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzez zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzet(String str, zzez zzezVar, access13800 access13800Var) {
        super(2, access13800Var);
        this.zzb = str;
        this.zzc = zzezVar;
    }

    public final access13800 create(@Nullable Object obj, @NotNull access13800 access13800Var) {
        return new zzet(this.zzb, this.zzc, access13800Var);
    }

    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create((findResAndMsg) obj, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(@NotNull Object obj) {
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = this.zza;
        ResultKt.onNavigationEvent(obj);
        if (i2 != 0) {
            return obj;
        }
        zzez zzezVar = this.zzc;
        String str = this.zzb;
        pauseMyRequest pausemyrequestOnExtraCallback = getResRootDir.onExtraCallback((getPackageType) null, 1, (Object) null);
        zzezVar.zzl.put(str, pausemyrequestOnExtraCallback);
        String str2 = this.zzb;
        zzou zzouVarZzf = zzov.zzf();
        zzouVarZzf.zzd(str2);
        byte[] bArrZzd = ((zzov) zzouVarZzf.zzj()).zzd();
        maybeUpdateAnimatable.onNavigationEvent(this.zzc.zzq.zzb(), (CoroutineContext) null, (setRandomHost) null, new zzes(this.zzc, zzfy.zzh().zzi(bArrZzd, 0, bArrZzd.length), null), 3, (Object) null);
        this.zza = 1;
        Object objIAuthTabCallback = pausemyrequestOnExtraCallback.IAuthTabCallback(this);
        return objIAuthTabCallback == objOnWarmupCompleted ? objOnWarmupCompleted : objIAuthTabCallback;
    }
}
