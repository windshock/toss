package im.toss.devtool.domain.usecase;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.access13800;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
final class RunDevToolActionUseCase$invoke$1 extends ContinuationImpl {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RunDevToolActionUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RunDevToolActionUseCase$invoke$1(RunDevToolActionUseCase runDevToolActionUseCase, access13800<? super RunDevToolActionUseCase$invoke$1> access13800Var) {
        super(access13800Var);
        this.this$0 = runDevToolActionUseCase;
    }

    public final Object invokeSuspend(@NotNull Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 87;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        this.result = obj;
        int i5 = this.label;
        int i6 = i5 ^ Integer.MIN_VALUE;
        int i7 = i5 & Integer.MIN_VALUE;
        this.label = (i7 & i6) | (i6 ^ i7);
        int i8 = i2 + 21;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        Object obj2 = null;
        RunDevToolActionUseCase runDevToolActionUseCase = this.this$0;
        if (i9 != 0) {
            return runDevToolActionUseCase.onWarmupCompleted(null, null, this);
        }
        runDevToolActionUseCase.onWarmupCompleted(null, null, this);
        obj2.hashCode();
        throw null;
    }
}
