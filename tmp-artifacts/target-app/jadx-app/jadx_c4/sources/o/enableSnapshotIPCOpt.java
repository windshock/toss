package o;

import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class enableSnapshotIPCOpt {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE IAuthTabCallback;

    static final class IAuthTabCallback extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 95;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            enableSnapshotIPCOpt enablesnapshotipcopt = enableSnapshotIPCOpt.this;
            if (i3 != 0) {
                enablesnapshotipcopt.IAuthTabCallback(this);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Object objIAuthTabCallback = enablesnapshotipcopt.IAuthTabCallback(this);
            int i4 = onExtraCallback + 95;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 93 / 0;
            }
            return objIAuthTabCallback;
        }
    }

    static final class onExtraCallback extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 9;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            enableSnapshotIPCOpt enablesnapshotipcopt = enableSnapshotIPCOpt.this;
            if (i3 != 0) {
                enablesnapshotipcopt.onWarmupCompleted(this);
                throw null;
            }
            Object objOnWarmupCompleted = enablesnapshotipcopt.onWarmupCompleted(this);
            int i4 = IAuthTabCallback + 67;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }
    }

    static final class onNavigationEvent extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object obj2 = null;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            enableSnapshotIPCOpt enablesnapshotipcopt = enableSnapshotIPCOpt.this;
            if (i3 == 0) {
                enablesnapshotipcopt.onExtraCallback(this);
                obj2.hashCode();
                throw null;
            }
            Object objOnExtraCallback = enablesnapshotipcopt.onExtraCallback(this);
            int i4 = onExtraCallbackWithResult + 57;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnExtraCallback;
            }
            throw null;
        }
    }

    @Inject
    public enableSnapshotIPCOpt(@NotNull r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE r8lambdackpzfvkcnb19lbykxqj6b3xvcwe) {
        Intrinsics.checkNotNullParameter(r8lambdackpzfvkcnb19lbykxqj6b3xvcwe, "");
        this.IAuthTabCallback = r8lambdackpzfvkcnb19lbykxqj6b3xvcwe;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onExtraCallback(@NotNull access13800<? super Boolean> access13800Var) {
        onNavigationEvent onnavigationevent;
        Object objOnNavigationEvent;
        int i = 2 % 2;
        if (access13800Var instanceof onNavigationEvent) {
            onnavigationevent = (onNavigationEvent) access13800Var;
            int i2 = onnavigationevent.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = onExtraCallbackWithResult + 123;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                onnavigationevent.label = i2 - 2147483648;
            } else {
                onnavigationevent = new onNavigationEvent(access13800Var);
            }
        }
        onNavigationEvent onnavigationevent2 = onnavigationevent;
        Object obj = onnavigationevent2.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = onnavigationevent2.label;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(obj);
            r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE r8lambdackpzfvkcnb19lbykxqj6b3xvcwe = this.IAuthTabCallback;
            onnavigationevent2.label = 1;
            objOnNavigationEvent = r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE.onNavigationEvent(r8lambdackpzfvkcnb19lbykxqj6b3xvcwe, "STD_3_CREDIT_HOME_CHECK_AGREED", false, onnavigationevent2, 2, (Object) null);
            if (objOnNavigationEvent == objOnWarmupCompleted) {
                int i6 = onExtraCallbackWithResult + 123;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 95 / 0;
                }
                return objOnWarmupCompleted;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            objOnNavigationEvent = ((kotlin.Result) obj).onNavigationEvent();
        }
        Boolean boolOnNavigationEvent = access14000.onNavigationEvent(false);
        if (kotlin.Result.onExtraCallback(objOnNavigationEvent)) {
            return boolOnNavigationEvent;
        }
        int i8 = onExtraCallbackWithResult + 107;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 == 0) {
            return objOnNavigationEvent;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[PHI: r1 r4
      0x002b: PHI (r1v15 o.enableSnapshotIPCOpt$IAuthTabCallback) = (r1v14 o.enableSnapshotIPCOpt$IAuthTabCallback), (r1v17 o.enableSnapshotIPCOpt$IAuthTabCallback) binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x002b: PHI (r4v4 int) = (r4v3 int), (r4v6 int) binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object IAuthTabCallback(@NotNull access13800<? super Boolean> access13800Var) {
        IAuthTabCallback iAuthTabCallback;
        Object objOnNavigationEvent;
        int i;
        int i2 = 2 % 2;
        if (access13800Var instanceof IAuthTabCallback) {
            int i3 = onExtraCallbackWithResult + 75;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                iAuthTabCallback = (IAuthTabCallback) access13800Var;
                i = iAuthTabCallback.label;
                int i4 = 39 / 0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    iAuthTabCallback.label = i - 2147483648;
                    int i5 = onNavigationEvent + 101;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    iAuthTabCallback = new IAuthTabCallback(access13800Var);
                }
            } else {
                iAuthTabCallback = (IAuthTabCallback) access13800Var;
                i = iAuthTabCallback.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                }
            }
        }
        IAuthTabCallback iAuthTabCallback2 = iAuthTabCallback;
        Object obj = iAuthTabCallback2.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i7 = iAuthTabCallback2.label;
        if (i7 != 0) {
            int i8 = onExtraCallbackWithResult;
            int i9 = i8 + 101;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i11 = i8 + 47;
            onNavigationEvent = i11 % 128;
            if (i11 % 2 != 0) {
                ResultKt.onNavigationEvent(obj);
                ((kotlin.Result) obj).onNavigationEvent();
                throw null;
            }
            ResultKt.onNavigationEvent(obj);
            objOnNavigationEvent = ((kotlin.Result) obj).onNavigationEvent();
        } else {
            ResultKt.onNavigationEvent(obj);
            r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE r8lambdackpzfvkcnb19lbykxqj6b3xvcwe = this.IAuthTabCallback;
            iAuthTabCallback2.label = 1;
            objOnNavigationEvent = r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE.onNavigationEvent(r8lambdackpzfvkcnb19lbykxqj6b3xvcwe, "STD_3_CREDIT_HOME_ONLY_KCB", false, iAuthTabCallback2, 2, (Object) null);
            if (objOnNavigationEvent == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        }
        return !(kotlin.Result.onExtraCallback(objOnNavigationEvent) ^ true) ? access14000.onNavigationEvent(false) : objOnNavigationEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onWarmupCompleted(@NotNull access13800<? super Boolean> access13800Var) {
        onExtraCallback onextracallback;
        Object objOnNavigationEvent;
        int i = 2 % 2;
        if (access13800Var instanceof onExtraCallback) {
            onextracallback = (onExtraCallback) access13800Var;
            int i2 = onextracallback.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = onExtraCallbackWithResult + 3;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    onextracallback.label = i2 * Integer.MIN_VALUE;
                } else {
                    onextracallback.label = i2 - 2147483648;
                }
            } else {
                onextracallback = new onExtraCallback(access13800Var);
                int i4 = onNavigationEvent + 125;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        onExtraCallback onextracallback2 = onextracallback;
        Object obj = onextracallback2.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i6 = onextracallback2.label;
        if (i6 == 0) {
            ResultKt.onNavigationEvent(obj);
            r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE r8lambdackpzfvkcnb19lbykxqj6b3xvcwe = this.IAuthTabCallback;
            onextracallback2.label = 1;
            objOnNavigationEvent = r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE.onNavigationEvent(r8lambdackpzfvkcnb19lbykxqj6b3xvcwe, "STD_3_NICE", false, onextracallback2, 2, (Object) null);
            if (objOnNavigationEvent == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i7 = onExtraCallbackWithResult + 73;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            ResultKt.onNavigationEvent(obj);
            objOnNavigationEvent = ((kotlin.Result) obj).onNavigationEvent();
        }
        Boolean boolOnNavigationEvent = access14000.onNavigationEvent(false);
        if (!kotlin.Result.onExtraCallback(objOnNavigationEvent)) {
            return objOnNavigationEvent;
        }
        int i9 = onExtraCallbackWithResult + 63;
        onNavigationEvent = i9 % 128;
        int i10 = i9 % 2;
        return boolOnNavigationEvent;
    }
}
