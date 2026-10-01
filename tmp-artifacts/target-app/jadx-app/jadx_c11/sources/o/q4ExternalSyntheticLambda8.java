package o;

import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.q4ExternalSyntheticLambda10;
import o.q4ExternalSyntheticLambda2;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class q4ExternalSyntheticLambda8 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    static final class onWarmupCompleted extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 53;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return i3 == 0 ? q4ExternalSyntheticLambda8.onExtraCallbackWithResult(null, null, true, false, this) : q4ExternalSyntheticLambda8.onExtraCallbackWithResult(null, null, false, false, this);
        }
    }

    public static final /* synthetic */ void IAuthTabCallback(q4ExternalSyntheticLambda10 q4externalsyntheticlambda10, Function1 function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(q4externalsyntheticlambda10, function1);
        if (i3 != 0) {
            int i4 = 67 / 0;
        }
        int i5 = IAuthTabCallback + 45;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final getPackageType onWarmupCompleted(@NotNull r8lambdaVVxSP2UZRJb9NT4EwemUyyGVI r8lambdavvxsp2uzrjb9nt4ewemuyygvi, boolean z, @NotNull Function0<q4ExternalSyntheticLambda3> function0, @NotNull Function1<? super q4ExternalSyntheticLambda10, Unit> function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdavvxsp2uzrjb9nt4ewemuyygvi, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (!z) {
            int i4 = IAuthTabCallback + 83;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return null;
            }
            throw null;
        }
        q4ExternalSyntheticLambda4 q4externalsyntheticlambda4 = new q4ExternalSyntheticLambda4(function0, function1);
        if (!(!(r8lambdavvxsp2uzrjb9nt4ewemuyygvi instanceof q4ExternalSyntheticLambda5))) {
            int i5 = onExtraCallback + 103;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return ((q4ExternalSyntheticLambda5) r8lambdavvxsp2uzrjb9nt4ewemuyygvi).IAuthTabCallback(q4externalsyntheticlambda4);
        }
        getPackageType getpackagetypeOnNavigationEvent = maybeUpdateAnimatable.onNavigationEvent(r8lambdavvxsp2uzrjb9nt4ewemuyygvi.IAuthTabCallback(), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(r8lambdavvxsp2uzrjb9nt4ewemuyygvi, q4externalsyntheticlambda4, null), 3, (Object) null);
        int i7 = IAuthTabCallback + 29;
        onExtraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return getpackagetypeOnNavigationEvent;
        }
        throw null;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ q4ExternalSyntheticLambda4 $request;
        final /* synthetic */ r8lambdaVVxSP2UZRJb9NT4EwemUyyGVI $this_launchMonitoringEvent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(r8lambdaVVxSP2UZRJb9NT4EwemUyyGVI r8lambdavvxsp2uzrjb9nt4ewemuyygvi, q4ExternalSyntheticLambda4 q4externalsyntheticlambda4, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$this_launchMonitoringEvent = r8lambdavvxsp2uzrjb9nt4ewemuyygvi;
            this.$request = q4externalsyntheticlambda4;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$this_launchMonitoringEvent, this.$request, access13800Var);
            int i2 = onNavigationEvent + 67;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 19;
            onNavigationEvent = i2 % 128;
            Object obj3 = null;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onNavigationEvent(findresandmsg, access13800Var);
                obj3.hashCode();
                throw null;
            }
            Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
            int i3 = onExtraCallback + 21;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return objOnNavigationEvent;
            }
            obj3.hashCode();
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 61;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 91;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 87;
            onNavigationEvent = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                access14300.onWarmupCompleted();
                obj2.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                r8lambdaVVxSP2UZRJb9NT4EwemUyyGVI r8lambdavvxsp2uzrjb9nt4ewemuyygvi = this.$this_launchMonitoringEvent;
                q4ExternalSyntheticLambda4 q4externalsyntheticlambda4 = this.$request;
                this.label = 1;
                if (q4ExternalSyntheticLambda8.onExtraCallback(r8lambdavvxsp2uzrjb9nt4ewemuyygvi, q4externalsyntheticlambda4, false, false, this, 6, null) == objOnWarmupCompleted) {
                    int i4 = onNavigationEvent + 15;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 == 0) {
                        return objOnWarmupCompleted;
                    }
                    obj2.hashCode();
                    throw null;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ Object onExtraCallback(r8lambdaVVxSP2UZRJb9NT4EwemUyyGVI r8lambdavvxsp2uzrjb9nt4ewemuyygvi, q4ExternalSyntheticLambda4 q4externalsyntheticlambda4, boolean z, boolean z2, access13800 access13800Var, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 9;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 2) != 0) {
            int i6 = i3 + 35;
            int i7 = i6 % 128;
            IAuthTabCallback = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 55;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        return onExtraCallbackWithResult(r8lambdavvxsp2uzrjb9nt4ewemuyygvi, q4externalsyntheticlambda4, z, z2, access13800Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object onExtraCallbackWithResult(@NotNull r8lambdaVVxSP2UZRJb9NT4EwemUyyGVI r8lambdavvxsp2uzrjb9nt4ewemuyygvi, @NotNull q4ExternalSyntheticLambda4 q4externalsyntheticlambda4, boolean z, boolean z2, @NotNull access13800<? super Unit> access13800Var) {
        onWarmupCompleted onwarmupcompleted;
        int i = 2 % 2;
        if (access13800Var instanceof onWarmupCompleted) {
            onwarmupcompleted = (onWarmupCompleted) access13800Var;
            int i2 = onwarmupcompleted.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = onExtraCallback + 105;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                onwarmupcompleted.label = i2 - 2147483648;
            } else {
                onwarmupcompleted = new onWarmupCompleted(access13800Var);
            }
        }
        onWarmupCompleted onwarmupcompleted2 = onwarmupcompleted;
        Object objOnExtraCallback = onwarmupcompleted2.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = onwarmupcompleted2.label;
        try {
            if (i5 == 0) {
                ResultKt.onNavigationEvent(objOnExtraCallback);
                try {
                    q4ExternalSyntheticLambda3 q4externalsyntheticlambda3OnExtraCallbackWithResult = q4externalsyntheticlambda4.onExtraCallbackWithResult();
                    onwarmupcompleted2.L$0 = access15400.onNavigationEvent(r8lambdavvxsp2uzrjb9nt4ewemuyygvi);
                    onwarmupcompleted2.L$1 = q4externalsyntheticlambda4;
                    onwarmupcompleted2.L$2 = access15400.onNavigationEvent(q4externalsyntheticlambda3OnExtraCallbackWithResult);
                    onwarmupcompleted2.Z$0 = z;
                    onwarmupcompleted2.Z$1 = z2;
                    onwarmupcompleted2.label = 1;
                    objOnExtraCallback = r8lambdaRbKaoSHYhlhce4ckketI4frIfDE.onExtraCallback(r8lambdavvxsp2uzrjb9nt4ewemuyygvi, q4externalsyntheticlambda3OnExtraCallbackWithResult, null, onwarmupcompleted2, 2, null);
                    if (objOnExtraCallback == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } catch (Throwable th) {
                    if (onExtraCallback(th, z, z2)) {
                        throw th;
                    }
                    q4externalsyntheticlambda4.onNavigationEvent(new q4ExternalSyntheticLambda10.onExtraCallback(th));
                    return Unit.INSTANCE;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z3 = onwarmupcompleted2.Z$1;
                boolean z4 = onwarmupcompleted2.Z$0;
                q4externalsyntheticlambda4 = (q4ExternalSyntheticLambda4) onwarmupcompleted2.L$1;
                ResultKt.onNavigationEvent(objOnExtraCallback);
                int i6 = onExtraCallback + 87;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
            }
            q4ExternalSyntheticLambda2 q4externalsyntheticlambda2 = (q4ExternalSyntheticLambda2) objOnExtraCallback;
            if (!(q4externalsyntheticlambda2 instanceof q4ExternalSyntheticLambda2.onExtraCallback)) {
                if (!(q4externalsyntheticlambda2 instanceof q4ExternalSyntheticLambda2.onExtraCallbackWithResult)) {
                    throw new NoWhenBranchMatchedException();
                }
                q4externalsyntheticlambda4.onNavigationEvent(new q4ExternalSyntheticLambda10.onExtraCallbackWithResult((q4ExternalSyntheticLambda2.onExtraCallbackWithResult) q4externalsyntheticlambda2));
            }
        } catch (Throwable th2) {
            if (onExtraCallback(th2, z, z2)) {
                throw th2;
            }
            q4externalsyntheticlambda4.onNavigationEvent(new q4ExternalSyntheticLambda10.onNavigationEvent(th2));
        }
        Unit unit = Unit.INSTANCE;
        int i8 = IAuthTabCallback + 101;
        onExtraCallback = i8 % 128;
        if (i8 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final void onWarmupCompleted(q4ExternalSyntheticLambda10 q4externalsyntheticlambda10, Function1<? super q4ExternalSyntheticLambda10, Unit> function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        onExtraCallback = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                function1.invoke(q4externalsyntheticlambda10);
            } else {
                function1.invoke(q4externalsyntheticlambda10);
                throw null;
            }
        } catch (Throwable th) {
            if (!onExtraCallback(th, false, false, 3, null)) {
                int i3 = IAuthTabCallback + 99;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            throw th;
        }
    }

    static /* synthetic */ boolean onExtraCallback(Throwable th, boolean z, boolean z2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 41;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            int i5 = i4 + 39;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            z2 = true;
        }
        return onExtraCallback(th, z, z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if ((!r5) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (r5 == false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final boolean onExtraCallback(Throwable th, boolean z, boolean z2) {
        int i;
        int i2 = 2 % 2;
        if (z2) {
            int i3 = IAuthTabCallback + 49;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            if (!(th instanceof CancellationException)) {
                if (!(th instanceof VirtualMachineError)) {
                    int i5 = onExtraCallback;
                    int i6 = i5 + 53;
                    IAuthTabCallback = i6 % 128;
                    Object obj = null;
                    if (i6 % 2 != 0) {
                        if (!(th instanceof ThreadDeath)) {
                            int i7 = i5 + 33;
                            int i8 = i7 % 128;
                            IAuthTabCallback = i8;
                            if (i7 % 2 == 0) {
                                int i9 = 24 / 0;
                                if (z) {
                                    int i10 = i8 + 125;
                                    onExtraCallback = i10 % 128;
                                    boolean z3 = th instanceof LinkageError;
                                    if (i10 % 2 != 0) {
                                        int i11 = 38 / 0;
                                    }
                                }
                                i = i8 + 119;
                                onExtraCallback = i % 128;
                                if (i % 2 != 0) {
                                    return false;
                                }
                                obj.hashCode();
                                throw null;
                            }
                            if (z) {
                            }
                            i = i8 + 119;
                            onExtraCallback = i % 128;
                            if (i % 2 != 0) {
                            }
                        }
                    } else {
                        boolean z4 = th instanceof ThreadDeath;
                        throw null;
                    }
                }
            }
        }
        return true;
    }
}
