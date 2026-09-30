package im.toss.devtool.domain.usecase;

import java.lang.reflect.InvocationTargetException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.access13800;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
final class RunDevToolActionUseCase$resolve$1 extends ContinuationImpl {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RunDevToolActionUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RunDevToolActionUseCase$resolve$1(RunDevToolActionUseCase runDevToolActionUseCase, access13800<? super RunDevToolActionUseCase$resolve$1> access13800Var) {
        super(access13800Var);
        this.this$0 = runDevToolActionUseCase;
    }

    public final Object invokeSuspend(@NotNull Object obj) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 & 15;
        int i4 = (i2 ^ 15) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        Object obj2 = null;
        this.result = obj;
        if (i6 != 0) {
            obj2.hashCode();
            throw null;
        }
        int i7 = this.label;
        this.label = (i7 & Integer.MIN_VALUE) | (i7 ^ Integer.MIN_VALUE);
        Object objIAuthTabCallback = this.this$0.IAuthTabCallback(null, this);
        int i8 = IAuthTabCallback;
        int i9 = i8 & 87;
        int i10 = -(-(i8 | 87));
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        onExtraCallbackWithResult = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 81 / 0;
        }
        return objIAuthTabCallback;
    }
}
