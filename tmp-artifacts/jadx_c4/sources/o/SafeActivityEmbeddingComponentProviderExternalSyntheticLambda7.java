package o;

import im.toss.appsintoss.iap.model.AppsInTossCashReceipt;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SafeActivityEmbeddingComponentProviderExternalSyntheticLambda7 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43 onWarmupCompleted;

    static final class IAuthTabCallback extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object obj2 = null;
            Object objOnNavigationEvent = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda7.this.onNavigationEvent(null, this);
            if (objOnNavigationEvent == access14300.onWarmupCompleted()) {
                int i2 = onNavigationEvent + 57;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return objOnNavigationEvent;
            }
            kotlin.Result resultIAuthTabCallback = kotlin.Result.IAuthTabCallback(objOnNavigationEvent);
            int i4 = onNavigationEvent + 93;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return resultIAuthTabCallback;
            }
            obj2.hashCode();
            throw null;
        }
    }

    public SafeActivityEmbeddingComponentProviderExternalSyntheticLambda7(@NotNull SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43 safeActivityEmbeddingComponentProviderExternalSyntheticLambda43) {
        Intrinsics.checkNotNullParameter(safeActivityEmbeddingComponentProviderExternalSyntheticLambda43, "");
        this.onWarmupCompleted = safeActivityEmbeddingComponentProviderExternalSyntheticLambda43;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onNavigationEvent(@NotNull String str, @NotNull access13800<? super kotlin.Result<AppsInTossCashReceipt>> access13800Var) {
        IAuthTabCallback iAuthTabCallback;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            boolean z = access13800Var instanceof IAuthTabCallback;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (access13800Var instanceof IAuthTabCallback) {
            iAuthTabCallback = (IAuthTabCallback) access13800Var;
            int i3 = iAuthTabCallback.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallback.label = i3 - 2147483648;
            } else {
                iAuthTabCallback = new IAuthTabCallback(access13800Var);
                int i4 = onExtraCallbackWithResult + 17;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        Object obj2 = iAuthTabCallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i6 = iAuthTabCallback.label;
        if (i6 != 0) {
            int i7 = onNavigationEvent + 59;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj2);
            return ((kotlin.Result) obj2).onNavigationEvent();
        }
        ResultKt.onNavigationEvent(obj2);
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43 safeActivityEmbeddingComponentProviderExternalSyntheticLambda43 = this.onWarmupCompleted;
        iAuthTabCallback.L$0 = access15400.onNavigationEvent(str);
        iAuthTabCallback.label = 1;
        Object objOnExtraCallbackWithResult = safeActivityEmbeddingComponentProviderExternalSyntheticLambda43.onExtraCallbackWithResult(str, iAuthTabCallback);
        if (objOnExtraCallbackWithResult != objOnWarmupCompleted) {
            return objOnExtraCallbackWithResult;
        }
        int i9 = onExtraCallbackWithResult + 111;
        onNavigationEvent = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 53 / 0;
        }
        return objOnWarmupCompleted;
    }
}
