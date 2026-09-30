package im.toss.global.features.leave.test;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.access13800;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class GlobalLeaveTestActivity$asInterface extends ContinuationImpl {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public int I$0;
    public int I$1;
    public int I$2;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ GlobalLeaveTestActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalLeaveTestActivity$asInterface(GlobalLeaveTestActivity globalLeaveTestActivity, access13800<? super GlobalLeaveTestActivity$asInterface> access13800Var) {
        super(access13800Var);
        this.this$0 = globalLeaveTestActivity;
    }

    public final Object invokeSuspend(@NotNull Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objIAuthTabCallback = GlobalLeaveTestActivity.IAuthTabCallback(this.this$0, this);
        int i4 = onWarmupCompleted + 109;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return objIAuthTabCallback;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
