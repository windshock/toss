package im.toss.rn.toss.core.legacy.bundle.v2;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.access13800;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class ReactBundleRepositoryImpl$getBundleForBytesMode$1 extends ContinuationImpl {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ReactBundleRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReactBundleRepositoryImpl$getBundleForBytesMode$1(ReactBundleRepositoryImpl reactBundleRepositoryImpl, access13800<? super ReactBundleRepositoryImpl$getBundleForBytesMode$1> access13800Var) {
        super(access13800Var);
        this.this$0 = reactBundleRepositoryImpl;
    }

    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objOnWarmupCompleted = ReactBundleRepositoryImpl.onWarmupCompleted(this.this$0, null, false, null, null, null, null, this);
        int i4 = onExtraCallbackWithResult + 33;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return objOnWarmupCompleted;
    }
}
