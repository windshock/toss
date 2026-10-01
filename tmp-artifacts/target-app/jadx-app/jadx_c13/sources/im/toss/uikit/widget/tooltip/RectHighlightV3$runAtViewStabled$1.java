package im.toss.uikit.widget.tooltip;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.access13800;
import o.access14100;
import o.findResAndMsg;
import o.formatMsgs;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class RectHighlightV3$runAtViewStabled$1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    final /* synthetic */ Function0<Unit> $runnable;
    int label;
    final /* synthetic */ RectHighlightV3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RectHighlightV3$runAtViewStabled$1(RectHighlightV3 rectHighlightV3, Function0<Unit> function0, access13800<? super RectHighlightV3$runAtViewStabled$1> access13800Var) {
        super(2, access13800Var);
        this.this$0 = rectHighlightV3;
        this.$runnable = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        RectHighlightV3$runAtViewStabled$1 rectHighlightV3$runAtViewStabled$1 = new RectHighlightV3$runAtViewStabled$1(this.this$0, this.$runnable, access13800Var);
        int i2 = IAuthTabCallback + 75;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return rectHighlightV3$runAtViewStabled$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onWarmupCompleted = i2 % 128;
        findResAndMsg findresandmsg2 = findresandmsg;
        access13800<? super Unit> access13800Var2 = access13800Var;
        if (i2 % 2 != 0) {
            onWarmupCompleted(findresandmsg2, access13800Var2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg2, access13800Var2);
        int i3 = IAuthTabCallback + 125;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 4 / 0;
        }
        return objOnWarmupCompleted;
    }

    public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = ((RectHighlightV3$runAtViewStabled$1) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
        if (i3 == 0) {
            int i4 = 54 / 0;
        }
        int i5 = onWarmupCompleted + 43;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = this.label;
        if (i2 != 0) {
            int i3 = onWarmupCompleted + 123;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
        } else {
            ResultKt.onNavigationEvent(obj);
            this.label = 1;
            if (formatMsgs.onWarmupCompleted(100L, this) == objOnExtraCallback) {
                int i5 = onWarmupCompleted + 105;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return objOnExtraCallback;
            }
        }
        if (RectHighlightV3.asInterface(this.this$0)) {
            this.$runnable.invoke();
            int i7 = onWarmupCompleted + 87;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
        } else {
            RectHighlightV3.onNavigationEvent(this.this$0, this.$runnable);
        }
        return Unit.INSTANCE;
    }
}
