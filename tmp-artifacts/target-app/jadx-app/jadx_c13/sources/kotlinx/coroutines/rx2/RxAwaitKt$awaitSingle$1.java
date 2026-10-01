package kotlinx.coroutines.rx2;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.access13800;
import o.writeAscii;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class RxAwaitKt$awaitSingle$1<T> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    RxAwaitKt$awaitSingle$1(access13800<? super RxAwaitKt$awaitSingle$1> access13800Var) {
        super(access13800Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return RxAwaitKt.onNavigationEvent((writeAscii) null, this);
    }
}
