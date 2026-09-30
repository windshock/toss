package com.google.android.recaptcha.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.access13800;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzs extends SuspendLambda implements Function2 {
    zzs(access13800 access13800Var) {
        super(2, access13800Var);
    }

    public final access13800 create(@Nullable Object obj, @NotNull access13800 access13800Var) {
        return new zzs(access13800Var);
    }

    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new zzs((access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(@NotNull Object obj) {
        ResultKt.onNavigationEvent(obj);
        Thread.currentThread().setPriority(8);
        return Unit.INSTANCE;
    }
}
