package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class addLifeCycleBlockOptimizeEvent {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final setConfig IAuthTabCallback;

    static final class IAuthTabCallback extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 87;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnWarmupCompleted = addLifeCycleBlockOptimizeEvent.this.onWarmupCompleted(null, this);
            if (objOnWarmupCompleted != access14300.onWarmupCompleted()) {
                return kotlin.Result.IAuthTabCallback(objOnWarmupCompleted);
            }
            int i4 = onExtraCallbackWithResult + 115;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 28 / 0;
            }
            return objOnWarmupCompleted;
        }
    }

    @Inject
    public addLifeCycleBlockOptimizeEvent(@NotNull setConfig setconfig) {
        Intrinsics.checkNotNullParameter(setconfig, "");
        this.IAuthTabCallback = setconfig;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onWarmupCompleted(@NotNull CrashOptimizeSwitch crashOptimizeSwitch, @NotNull access13800<? super kotlin.Result<? extends List<LifeCycleBlockOptimizeEventTracker>>> access13800Var) {
        IAuthTabCallback iAuthTabCallback;
        Object objIAuthTabCallback;
        Object next;
        int i = 2 % 2;
        if (access13800Var instanceof IAuthTabCallback) {
            iAuthTabCallback = (IAuthTabCallback) access13800Var;
            int i2 = iAuthTabCallback.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = onWarmupCompleted + 91;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                iAuthTabCallback.label = i2 - 2147483648;
            } else {
                iAuthTabCallback = new IAuthTabCallback(access13800Var);
            }
        }
        Object obj = iAuthTabCallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = iAuthTabCallback.label;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(obj);
            setConfig setconfig = this.IAuthTabCallback;
            iAuthTabCallback.L$0 = access15400.onNavigationEvent(crashOptimizeSwitch);
            iAuthTabCallback.label = 1;
            objIAuthTabCallback = setconfig.IAuthTabCallback(true, crashOptimizeSwitch, iAuthTabCallback);
            if (objIAuthTabCallback == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            objIAuthTabCallback = ((kotlin.Result) obj).onNavigationEvent();
        }
        Throwable th = kotlin.Result.exceptionOrNull-impl(objIAuthTabCallback);
        if (th != null) {
            Result.Companion companion = kotlin.Result.Companion;
            return kotlin.Result.constructor-impl(ResultKt.createFailure(th));
        }
        Result.Companion companion2 = kotlin.Result.Companion;
        List<LifeCycleBlockOptimizeEventTracker> listOnExtraCallback = ((enableSensorServiceContextOpt) objIAuthTabCallback).onExtraCallback();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listOnExtraCallback.iterator();
        int i6 = onNavigationEvent + 107;
        onWarmupCompleted = i6 % 128;
        loop0: while (true) {
            int i7 = i6 % 2;
            while (it.hasNext()) {
                next = it.next();
                if (!((LifeCycleBlockOptimizeEventTracker) next).onExtraCallbackWithResult()) {
                    break;
                }
            }
            arrayList.add(next);
            i6 = onWarmupCompleted + 35;
            onNavigationEvent = i6 % 128;
        }
        Object obj2 = kotlin.Result.constructor-impl(arrayList);
        int i8 = onNavigationEvent + 33;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 26 / 0;
        }
        return obj2;
    }
}
