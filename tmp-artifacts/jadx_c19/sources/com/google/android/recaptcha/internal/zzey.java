package com.google.android.recaptcha.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.access13800;
import o.findResAndMsg;
import o.maybeUpdateAnimatable;
import o.setRandomHost;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzey extends SuspendLambda implements Function2 {
    final /* synthetic */ zzez zza;
    final /* synthetic */ zzoe zzb;
    final /* synthetic */ zzbb zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzey(zzez zzezVar, zzoe zzoeVar, zzbb zzbbVar, access13800 access13800Var) {
        super(2, access13800Var);
        this.zza = zzezVar;
        this.zzb = zzoeVar;
        this.zzc = zzbbVar;
    }

    public final access13800 create(@Nullable Object obj, @NotNull access13800 access13800Var) {
        return new zzey(this.zza, this.zzb, this.zzc, access13800Var);
    }

    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create((findResAndMsg) obj, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(@NotNull Object obj) throws Exception {
        ResultKt.onNavigationEvent(obj);
        try {
            zzez zzezVar = this.zza;
            maybeUpdateAnimatable.onNavigationEvent(this.zza.zzq.zzb(), (CoroutineContext) null, (setRandomHost) null, new zzex(this.zza, zzezVar.zzf().zzb(this.zzb, zzezVar.zzp), null), 3, (Object) null);
        } catch (zzp e) {
            zzez zzezVar2 = this.zza;
            zzezVar2.zzi.zzb(this.zzc, e, null);
            this.zza.zzk().onExtraCallback(e);
        }
        return Unit.INSTANCE;
    }
}
