package mozilla.components.support.utils;

import java.util.Iterator;
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
final class RunWhenReadyQueue$ready$1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    int label;
    final /* synthetic */ RunWhenReadyQueue this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RunWhenReadyQueue$ready$1(RunWhenReadyQueue runWhenReadyQueue, access13800 access13800Var) {
        super(2, access13800Var);
        this.this$0 = runWhenReadyQueue;
    }

    public final access13800<Unit> create(@Nullable Object obj, @NotNull access13800<?> access13800Var) {
        Intrinsics.checkNotNullParameter(access13800Var, BuildConfig.FLAVOR);
        return new RunWhenReadyQueue$ready$1(this.this$0, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create(obj, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(@NotNull Object obj) {
        Unit unit;
        if (this.label == 0) {
            ResultKt.onNavigationEvent(obj);
            synchronized (this.this$0.onExtraCallbackWithResult) {
                Iterator it = this.this$0.onExtraCallbackWithResult.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                this.this$0.onExtraCallbackWithResult.clear();
                unit = Unit.INSTANCE;
            }
            return unit;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
