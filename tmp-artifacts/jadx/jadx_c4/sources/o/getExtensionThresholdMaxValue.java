package o;

import java.util.Collection;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getExtensionThresholdMaxValue {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    private final addLifeCycleBlockOptimizeEvent onNavigationEvent;

    static final class IAuthTabCallback extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 27;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object obj2 = null;
            Object objOnExtraCallback = getExtensionThresholdMaxValue.this.onExtraCallback(null, this);
            int i4 = IAuthTabCallback + 59;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnExtraCallback;
            }
            obj2.hashCode();
            throw null;
        }
    }

    @Inject
    public getExtensionThresholdMaxValue(@NotNull addLifeCycleBlockOptimizeEvent addlifecycleblockoptimizeevent) {
        Intrinsics.checkNotNullParameter(addlifecycleblockoptimizeevent, "");
        this.onNavigationEvent = addlifecycleblockoptimizeevent;
    }

    public static /* synthetic */ Object onExtraCallback(getExtensionThresholdMaxValue getextensionthresholdmaxvalue, CrashOptimizeSwitch crashOptimizeSwitch, access13800 access13800Var, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 123;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 13;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            crashOptimizeSwitch = CrashOptimizeSwitch.CREDIT_HOME;
        }
        return getextensionthresholdmaxvalue.onExtraCallback(crashOptimizeSwitch, access13800Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onExtraCallback(@NotNull CrashOptimizeSwitch crashOptimizeSwitch, @NotNull access13800<? super Boolean> access13800Var) {
        IAuthTabCallback iAuthTabCallback;
        Object objOnWarmupCompleted;
        int i = 2 % 2;
        if (access13800Var instanceof IAuthTabCallback) {
            iAuthTabCallback = (IAuthTabCallback) access13800Var;
            int i2 = iAuthTabCallback.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallback.label = i2 - 2147483648;
            } else {
                iAuthTabCallback = new IAuthTabCallback(access13800Var);
            }
        }
        Object obj = iAuthTabCallback.result;
        Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
        int i3 = iAuthTabCallback.label;
        if (i3 != 0) {
            int i4 = IAuthTabCallback;
            int i5 = i4 + 43;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i7 = i4 + 63;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            ResultKt.onNavigationEvent(obj);
            objOnWarmupCompleted = ((kotlin.Result) obj).onNavigationEvent();
        } else {
            ResultKt.onNavigationEvent(obj);
            addLifeCycleBlockOptimizeEvent addlifecycleblockoptimizeevent = this.onNavigationEvent;
            iAuthTabCallback.L$0 = access15400.onNavigationEvent(crashOptimizeSwitch);
            iAuthTabCallback.label = 1;
            objOnWarmupCompleted = addlifecycleblockoptimizeevent.onWarmupCompleted(crashOptimizeSwitch, iAuthTabCallback);
            if (objOnWarmupCompleted == objOnWarmupCompleted2) {
                return objOnWarmupCompleted2;
            }
        }
        Object obj2 = null;
        if (kotlin.Result.onExtraCallback(objOnWarmupCompleted)) {
            int i9 = IAuthTabCallback + 109;
            onExtraCallbackWithResult = i9 % 128;
            if (i9 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            objOnWarmupCompleted = null;
        }
        Collection collection = (Collection) objOnWarmupCompleted;
        Boolean boolOnNavigationEvent = access14000.onNavigationEvent(collection == null || collection.isEmpty());
        int i10 = IAuthTabCallback + 1;
        onExtraCallbackWithResult = i10 % 128;
        if (i10 % 2 == 0) {
            return boolOnNavigationEvent;
        }
        throw null;
    }
}
