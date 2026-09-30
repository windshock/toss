package im.toss.rn.toss.core.legacy.bundle.v2;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.access13800;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class ReactBundleRepositoryImpl$updateBuiltInBundles$1 extends ContinuationImpl {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ReactBundleRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReactBundleRepositoryImpl$updateBuiltInBundles$1(ReactBundleRepositoryImpl reactBundleRepositoryImpl, access13800<? super ReactBundleRepositoryImpl$updateBuiltInBundles$1> access13800Var) {
        super(access13800Var);
        this.this$0 = reactBundleRepositoryImpl;
    }

    public final Object invokeSuspend(@NotNull Object obj) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objOnExtraCallback = this.this$0.onExtraCallback((String) null, (String) null, (access13800<? super Unit>) this);
        int i4 = IAuthTabCallback + 41;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return objOnExtraCallback;
    }
}
