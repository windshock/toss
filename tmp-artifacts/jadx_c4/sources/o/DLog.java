package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class DLog {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final setConfig onExtraCallbackWithResult;

    static final class onExtraCallback extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 119;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objIAuthTabCallback = DLog.this.IAuthTabCallback(this);
            int i4 = onWarmupCompleted + 79;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }
    }

    @Inject
    public DLog(@NotNull setConfig setconfig) {
        Intrinsics.checkNotNullParameter(setconfig, "");
        this.onExtraCallbackWithResult = setconfig;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object IAuthTabCallback(@NotNull access13800<? super Boolean> access13800Var) {
        onExtraCallback onextracallback;
        Object objIAuthTabCallback;
        int i = 2 % 2;
        boolean z = true;
        if (!(!(access13800Var instanceof onExtraCallback))) {
            int i2 = onNavigationEvent + 55;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = ((onExtraCallback) access13800Var).label;
                throw null;
            }
            onextracallback = (onExtraCallback) access13800Var;
            int i4 = onextracallback.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                onextracallback.label = i4 - 2147483648;
            } else {
                onextracallback = new onExtraCallback(access13800Var);
            }
        }
        Object obj = onextracallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = onextracallback.label;
        if (i5 != 0) {
            int i6 = onWarmupCompleted + 47;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            objIAuthTabCallback = ((kotlin.Result) obj).onNavigationEvent();
        } else {
            ResultKt.onNavigationEvent(obj);
            setConfig setconfig = this.onExtraCallbackWithResult;
            CrashOptimizeSwitch crashOptimizeSwitch = CrashOptimizeSwitch.CLICK_NICE_SCORE;
            onextracallback.label = 1;
            objIAuthTabCallback = setconfig.IAuthTabCallback(true, crashOptimizeSwitch, onextracallback);
            if (objIAuthTabCallback == objOnWarmupCompleted) {
                int i8 = onWarmupCompleted + 55;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                return objOnWarmupCompleted;
            }
        }
        if (kotlin.Result.exceptionOrNull-impl(objIAuthTabCallback) != null) {
            return access14000.onNavigationEvent(false);
        }
        List<LifeCycleBlockOptimizeEventTracker> listOnExtraCallbackWithResult = ((enableSensorServiceContextOpt) objIAuthTabCallback).onExtraCallbackWithResult();
        if (!(listOnExtraCallbackWithResult instanceof Collection) || !listOnExtraCallbackWithResult.isEmpty()) {
            Iterator<T> it = listOnExtraCallbackWithResult.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((LifeCycleBlockOptimizeEventTracker) it.next()).onWarmupCompleted() == setUcInitOpt.NICE) {
                    z = false;
                    break;
                }
            }
        }
        return access14000.onNavigationEvent(z);
    }
}
