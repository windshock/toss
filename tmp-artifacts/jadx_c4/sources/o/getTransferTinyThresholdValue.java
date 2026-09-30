package o;

import im.toss.feature.credit.terms.data.source.impl.RemoteCreditTermDataSource;
import javax.inject.Inject;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getTransferTinyThresholdValue implements setConfig {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final setSwitchJudgmentListener IAuthTabCallback;
    private final RemoteCreditTermDataSource onExtraCallback;

    static final class onNavigationEvent extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        int I$0;
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 85;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objIAuthTabCallback = getTransferTinyThresholdValue.this.IAuthTabCallback(false, null, this);
            if (objIAuthTabCallback != access14300.onWarmupCompleted()) {
                return kotlin.Result.IAuthTabCallback(objIAuthTabCallback);
            }
            int i4 = IAuthTabCallback + 113;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }
    }

    @Inject
    public getTransferTinyThresholdValue(@NotNull setSwitchJudgmentListener setswitchjudgmentlistener, @NotNull RemoteCreditTermDataSource remoteCreditTermDataSource) {
        Intrinsics.checkNotNullParameter(setswitchjudgmentlistener, "");
        Intrinsics.checkNotNullParameter(remoteCreditTermDataSource, "");
        this.IAuthTabCallback = setswitchjudgmentlistener;
        this.onExtraCallback = remoteCreditTermDataSource;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x010e, code lost:
    
        if (r8 == r2) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0 A[Catch: all -> 0x00f6, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00f6, blocks: (B:20:0x006a, B:33:0x00d5, B:36:0x00e4, B:37:0x00ec, B:30:0x00b0), top: B:51:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // o.setConfig
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object IAuthTabCallback(boolean z, @NotNull CrashOptimizeSwitch crashOptimizeSwitch, @NotNull access13800<? super kotlin.Result<enableSensorServiceContextOpt>> access13800Var) {
        onNavigationEvent onnavigationevent;
        Object objOnWarmupCompleted;
        Object objOnExtraCallback;
        Throwable th;
        Object objOnNavigationEvent;
        CrashOptimizeSwitch crashOptimizeSwitch2;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            boolean z2 = access13800Var instanceof onNavigationEvent;
            throw null;
        }
        if (access13800Var instanceof onNavigationEvent) {
            onnavigationevent = (onNavigationEvent) access13800Var;
            int i3 = onnavigationevent.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                onnavigationevent.label = i3 - 2147483648;
            } else {
                onnavigationevent = new onNavigationEvent(access13800Var);
            }
        }
        Object obj = onnavigationevent.result;
        Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
        int i4 = onnavigationevent.label;
        try {
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                if (z) {
                    setSwitchJudgmentListener setswitchjudgmentlistener = this.IAuthTabCallback;
                    onnavigationevent.L$0 = crashOptimizeSwitch;
                    onnavigationevent.Z$0 = z;
                    onnavigationevent.label = 1;
                    objOnExtraCallback = setswitchjudgmentlistener.onExtraCallback(crashOptimizeSwitch, onnavigationevent);
                    if (objOnExtraCallback != objOnWarmupCompleted2) {
                        th = kotlin.Result.exceptionOrNull-impl(objOnExtraCallback);
                        if (th != null) {
                        }
                    }
                } else {
                    RemoteCreditTermDataSource remoteCreditTermDataSource = this.onExtraCallback;
                    onnavigationevent.L$0 = crashOptimizeSwitch;
                    onnavigationevent.Z$0 = z;
                    onnavigationevent.label = 3;
                    objOnWarmupCompleted = remoteCreditTermDataSource.onWarmupCompleted(crashOptimizeSwitch, onnavigationevent);
                }
                return objOnWarmupCompleted2;
            }
            if (i4 == 1) {
                z = onnavigationevent.Z$0;
                crashOptimizeSwitch = (CrashOptimizeSwitch) onnavigationevent.L$0;
                ResultKt.onNavigationEvent(obj);
                objOnExtraCallback = ((kotlin.Result) obj).onNavigationEvent();
                int i5 = onWarmupCompleted + 103;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                th = kotlin.Result.exceptionOrNull-impl(objOnExtraCallback);
                if (th != null) {
                    return objOnExtraCallback;
                }
                Result.Companion companion = kotlin.Result.Companion;
                RemoteCreditTermDataSource remoteCreditTermDataSource2 = this.onExtraCallback;
                onnavigationevent.L$0 = crashOptimizeSwitch;
                onnavigationevent.L$1 = access15400.onNavigationEvent(th);
                onnavigationevent.Z$0 = z;
                onnavigationevent.I$0 = 0;
                onnavigationevent.label = 2;
                Object objOnWarmupCompleted3 = remoteCreditTermDataSource2.onWarmupCompleted(crashOptimizeSwitch, onnavigationevent);
                if (objOnWarmupCompleted3 != objOnWarmupCompleted2) {
                    int i7 = onWarmupCompleted + 105;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    CrashOptimizeSwitch crashOptimizeSwitch3 = crashOptimizeSwitch;
                    objOnNavigationEvent = objOnWarmupCompleted3;
                    crashOptimizeSwitch2 = crashOptimizeSwitch3;
                    if (kotlin.Result.onNavigationEvent(objOnNavigationEvent)) {
                    }
                    ResultKt.onNavigationEvent(objOnNavigationEvent);
                    return kotlin.Result.constructor-impl((enableSensorServiceContextOpt) objOnNavigationEvent);
                }
                return objOnWarmupCompleted2;
            }
            int i9 = onWarmupCompleted + 79;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            if (i4 != 2) {
                if (i4 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                crashOptimizeSwitch = (CrashOptimizeSwitch) onnavigationevent.L$0;
                ResultKt.onNavigationEvent(obj);
                objOnWarmupCompleted = ((kotlin.Result) obj).onNavigationEvent();
                int i11 = onWarmupCompleted + 57;
                onNavigationEvent = i11 % 128;
                int i12 = i11 % 2;
                if (kotlin.Result.onNavigationEvent(objOnWarmupCompleted)) {
                    this.IAuthTabCallback.onExtraCallbackWithResult(crashOptimizeSwitch, (enableSensorServiceContextOpt) objOnWarmupCompleted);
                }
                return objOnWarmupCompleted;
            }
            crashOptimizeSwitch2 = (CrashOptimizeSwitch) onnavigationevent.L$0;
            ResultKt.onNavigationEvent(obj);
            objOnNavigationEvent = ((kotlin.Result) obj).onNavigationEvent();
            int i13 = onWarmupCompleted + 85;
            onNavigationEvent = i13 % 128;
            int i14 = i13 % 2;
            if (kotlin.Result.onNavigationEvent(objOnNavigationEvent)) {
                int i15 = onNavigationEvent + 19;
                onWarmupCompleted = i15 % 128;
                int i16 = i15 % 2;
                this.IAuthTabCallback.onExtraCallbackWithResult(crashOptimizeSwitch2, (enableSensorServiceContextOpt) objOnNavigationEvent);
            }
            ResultKt.onNavigationEvent(objOnNavigationEvent);
            return kotlin.Result.constructor-impl((enableSensorServiceContextOpt) objOnNavigationEvent);
        } catch (Throwable th2) {
            Result.Companion companion2 = kotlin.Result.Companion;
            return kotlin.Result.constructor-impl(ResultKt.createFailure(th2));
        }
    }

    @Override // o.setConfig
    public Object onNavigationEvent(@NotNull access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            this.IAuthTabCallback.onNavigationEvent(access13800Var);
            access14300.onWarmupCompleted();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objOnNavigationEvent = this.IAuthTabCallback.onNavigationEvent(access13800Var);
        if (objOnNavigationEvent != access14300.onWarmupCompleted()) {
            return Unit.INSTANCE;
        }
        int i3 = onWarmupCompleted + 123;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 42 / 0;
        }
        return objOnNavigationEvent;
    }
}
