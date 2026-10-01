package im.toss.rn.toss.core.legacy.bundle.v2;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.access13800;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class ReactBundleRepositoryImpl$invalidateCachedOldBundle$1 extends ContinuationImpl {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ReactBundleRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReactBundleRepositoryImpl$invalidateCachedOldBundle$1(ReactBundleRepositoryImpl reactBundleRepositoryImpl, access13800<? super ReactBundleRepositoryImpl$invalidateCachedOldBundle$1> access13800Var) {
        super(access13800Var);
        this.this$0 = reactBundleRepositoryImpl;
    }

    public final Object invokeSuspend(@NotNull Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objOnExtraCallbackWithResult = this.this$0.onExtraCallbackWithResult(null, this);
        if (i3 != 0) {
            int i4 = 73 / 0;
        }
        int i5 = onWarmupCompleted + 75;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return objOnExtraCallbackWithResult;
    }
}
