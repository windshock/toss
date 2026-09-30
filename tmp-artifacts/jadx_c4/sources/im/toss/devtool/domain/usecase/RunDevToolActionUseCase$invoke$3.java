package im.toss.devtool.domain.usecase;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.access13800;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
final class RunDevToolActionUseCase$invoke$3 extends ContinuationImpl {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RunDevToolActionUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RunDevToolActionUseCase$invoke$3(RunDevToolActionUseCase runDevToolActionUseCase, access13800<? super RunDevToolActionUseCase$invoke$3> access13800Var) {
        super(access13800Var);
        this.this$0 = runDevToolActionUseCase;
    }

    public final Object invokeSuspend(@NotNull Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = (-2) - ((((i2 | 6) << 1) - (i2 ^ 6)) ^ (-1));
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        this.result = obj;
        int i5 = this.label;
        if (i4 != 0) {
            this.label = (i5 & Integer.MIN_VALUE) | (i5 ^ Integer.MIN_VALUE);
            throw null;
        }
        this.label = (i5 & Integer.MIN_VALUE) | (i5 ^ Integer.MIN_VALUE);
        int i6 = (-2) - (((i2 & 70) + (i2 | 70)) ^ (-1));
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        Object objOnNavigationEvent$1a5f36f3 = this.this$0.onNavigationEvent$1a5f36f3(null, null, null, this);
        int i8 = IAuthTabCallback;
        int i9 = i8 & 3;
        int i10 = -(-((i8 ^ 3) | i9));
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        onNavigationEvent = i11 % 128;
        int i12 = i11 % 2;
        return objOnNavigationEvent$1a5f36f3;
    }
}
