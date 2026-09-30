package mozilla.components.support.utils;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.access13800;
import o.findResAndMsg;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class RunWhenReadyQueue$runIfReadyOrQueue$1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    final /* synthetic */ Function0 $task;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RunWhenReadyQueue$runIfReadyOrQueue$1(Function0 function0, access13800 access13800Var) {
        super(2, access13800Var);
        this.$task = function0;
    }

    public final access13800<Unit> create(@Nullable Object obj, @NotNull access13800<?> access13800Var) {
        Intrinsics.checkNotNullParameter(access13800Var, BuildConfig.FLAVOR);
        return new RunWhenReadyQueue$runIfReadyOrQueue$1(this.$task, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create(obj, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(@NotNull Object obj) {
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.onNavigationEvent(obj);
        this.$task.invoke();
        return Unit.INSTANCE;
    }
}
