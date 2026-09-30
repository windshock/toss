package im.toss.devtool.runtime.data.util;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.access13800;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class DevToolActionActivity$onWarmupCompleted extends ContinuationImpl {
    static int onNavigationEvent = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(DevToolActionActivity$onWarmupCompleted.class);
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ DevToolActionActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DevToolActionActivity$onWarmupCompleted(DevToolActionActivity devToolActionActivity, access13800<? super DevToolActionActivity$onWarmupCompleted> access13800Var) {
        super(access13800Var);
        this.this$0 = devToolActionActivity;
    }

    public final Object invokeSuspend(@NotNull Object obj) {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4169);
        this.result = obj;
        int i2 = this.label;
        this.label = (i2 & Integer.MIN_VALUE) | (i2 ^ Integer.MIN_VALUE);
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5161);
        Object objOnExtraCallbackWithResult = DevToolActionActivity.onExtraCallbackWithResult(this.this$0, this);
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3887);
        return objOnExtraCallbackWithResult;
    }
}
