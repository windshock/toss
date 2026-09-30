package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.Camera2CapturePipelineTorchTaskExternalSyntheticLambda4;
import o.QuirksExternalSyntheticBackport0;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class getVersionString extends QuirksExternalSyntheticBackport0.onWarmupCompleted implements flipY {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private Camera2CapturePipelineTorchTaskExternalSyntheticLambda4.onWarmupCompleted onNavigationEvent;
    private Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 onWarmupCompleted;

    public boolean I_() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 23;
        IAuthTabCallback = i3 % 128;
        boolean z = i3 % 2 != 0;
        int i4 = i2 + 53;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 67 / 0;
        }
        return z;
    }

    public getVersionString(@NotNull Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2) {
        Intrinsics.checkNotNullParameter(camera2CapturePipelineTorchTaskExternalSyntheticLambda2, "");
        this.onWarmupCompleted = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
    }

    public final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = this.onWarmupCompleted;
        int i5 = i3 + 17;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
    }

    public final void onNavigationEvent(@NotNull Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(camera2CapturePipelineTorchTaskExternalSyntheticLambda2, "");
            this.onWarmupCompleted = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
        } else {
            Intrinsics.checkNotNullParameter(camera2CapturePipelineTorchTaskExternalSyntheticLambda2, "");
            this.onWarmupCompleted = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
            int i3 = 44 / 0;
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Camera2CapturePipelineTorchTaskExternalSyntheticLambda4.onWarmupCompleted $press;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(Camera2CapturePipelineTorchTaskExternalSyntheticLambda4.onWarmupCompleted onwarmupcompleted, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$press = onwarmupcompleted;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = getVersionString.this.new onNavigationEvent(this.$press, access13800Var);
            int i2 = onWarmupCompleted + 29;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 113;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 125;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 35;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 83;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2IAuthTabCallbackStub = getVersionString.this.IAuthTabCallbackStub();
                Camera2CapturePipelineTorchTaskExternalSyntheticLambda4.onWarmupCompleted onwarmupcompleted = this.$press;
                this.label = 1;
                if (camera2CapturePipelineTorchTaskExternalSyntheticLambda2IAuthTabCallbackStub.onExtraCallbackWithResult(onwarmupcompleted, this) == objOnWarmupCompleted) {
                    int i3 = onWarmupCompleted + 21;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = onWarmupCompleted + 115;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    ResultKt.onNavigationEvent(obj);
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
            }
            Unit unit = Unit.INSTANCE;
            int i6 = onNavigationEvent + 21;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                return unit;
            }
            throw null;
        }
    }

    public void onNavigationEvent(@NotNull newHandlerExecutor newhandlerexecutor, @NotNull createPostFailedException createpostfailedexception, long j) {
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda4.onWarmupCompleted onwarmupcompleted;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(newhandlerexecutor, "");
        Intrinsics.checkNotNullParameter(createpostfailedexception, "");
        if (createpostfailedexception == createPostFailedException.Initial) {
            int i2 = IAuthTabCallback + 103;
            onExtraCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                boolean z = newhandlerexecutor.onExtraCallbackWithResult() instanceof Collection;
                obj.hashCode();
                throw null;
            }
            List listOnExtraCallbackWithResult = newhandlerexecutor.onExtraCallbackWithResult();
            if (!(listOnExtraCallbackWithResult instanceof Collection) || !listOnExtraCallbackWithResult.isEmpty()) {
                Iterator it = listOnExtraCallbackWithResult.iterator();
                int i3 = onExtraCallback + 5;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 4 / 4;
                }
                while (it.hasNext()) {
                    if (((HandlerScheduledExecutorService2) it.next()).IAuthTabCallback_Parcel()) {
                        return;
                    }
                }
            }
            for (HandlerScheduledExecutorService2 handlerScheduledExecutorService2 : newhandlerexecutor.onExtraCallbackWithResult()) {
                int i5 = onExtraCallback + 57;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                if (handlerScheduledExecutorService2.IAuthTabCallbackStub()) {
                    int i7 = IAuthTabCallback + 117;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    if (this.onNavigationEvent == null) {
                        Camera2CapturePipelineTorchTaskExternalSyntheticLambda4.onWarmupCompleted onwarmupcompleted2 = new Camera2CapturePipelineTorchTaskExternalSyntheticLambda4.onWarmupCompleted(handlerScheduledExecutorService2.IAuthTabCallback(), (DefaultConstructorMarker) null);
                        this.onNavigationEvent = onwarmupcompleted2;
                        maybeUpdateAnimatable.onNavigationEvent(onMessageChannelReady(), (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(onwarmupcompleted2, null), 3, (Object) null);
                    }
                }
                if (!handlerScheduledExecutorService2.IAuthTabCallbackStub() && (onwarmupcompleted = this.onNavigationEvent) != null) {
                    Intrinsics.checkNotNull(onwarmupcompleted);
                    this.onNavigationEvent = null;
                    maybeUpdateAnimatable.onNavigationEvent(onMessageChannelReady(), (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(onwarmupcompleted, null), 3, (Object) null);
                }
            }
        }
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Camera2CapturePipelineTorchTaskExternalSyntheticLambda4.onWarmupCompleted $press;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(Camera2CapturePipelineTorchTaskExternalSyntheticLambda4.onWarmupCompleted onwarmupcompleted, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$press = onwarmupcompleted;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = getVersionString.this.new onExtraCallbackWithResult(this.$press, access13800Var);
            int i2 = onExtraCallback + 105;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 27;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 9;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 89 / 0;
            }
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 43;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 125;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 77 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 63;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2IAuthTabCallbackStub = getVersionString.this.IAuthTabCallbackStub();
                Camera2CapturePipelineTorchTaskExternalSyntheticLambda4.onExtraCallback onextracallback = new Camera2CapturePipelineTorchTaskExternalSyntheticLambda4.onExtraCallback(this.$press);
                this.label = 1;
                if (camera2CapturePipelineTorchTaskExternalSyntheticLambda2IAuthTabCallbackStub.onExtraCallbackWithResult(onextracallback, this) == objOnWarmupCompleted) {
                    int i5 = onExtraCallback + 7;
                    int i6 = i5 % 128;
                    onExtraCallbackWithResult = i6;
                    int i7 = i5 % 2;
                    int i8 = i6 + 85;
                    onExtraCallback = i8 % 128;
                    if (i8 % 2 != 0) {
                        return objOnWarmupCompleted;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i9 = onExtraCallbackWithResult + 21;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c A[PHI: r1
      0x001c: PHI (r1v5 o.Camera2CapturePipelineTorchTaskExternalSyntheticLambda4$onWarmupCompleted) = 
      (r1v4 o.Camera2CapturePipelineTorchTaskExternalSyntheticLambda4$onWarmupCompleted)
      (r1v9 o.Camera2CapturePipelineTorchTaskExternalSyntheticLambda4$onWarmupCompleted)
     binds: [B:8:0x001a, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void access000() {
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda4.onWarmupCompleted onwarmupcompleted;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onwarmupcompleted = this.onNavigationEvent;
            int i3 = 33 / 0;
            if (onwarmupcompleted != null) {
                this.onNavigationEvent = null;
                maybeUpdateAnimatable.onNavigationEvent(onMessageChannelReady(), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(onwarmupcompleted, null), 3, (Object) null);
            }
        } else {
            onwarmupcompleted = this.onNavigationEvent;
            if (onwarmupcompleted != null) {
            }
        }
        int i4 = IAuthTabCallback + 123;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Camera2CapturePipelineTorchTaskExternalSyntheticLambda4.onWarmupCompleted $press;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(Camera2CapturePipelineTorchTaskExternalSyntheticLambda4.onWarmupCompleted onwarmupcompleted, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$press = onwarmupcompleted;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = getVersionString.this.new IAuthTabCallback(this.$press, access13800Var);
            int i2 = onWarmupCompleted + 3;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 23;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onExtraCallback(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
            int i3 = IAuthTabCallback + 109;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 77;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 76 / 0;
            }
            int i5 = IAuthTabCallback + 123;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 56 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 105;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = IAuthTabCallback + 31;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0 ? i4 != 1 : i4 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2IAuthTabCallbackStub = getVersionString.this.IAuthTabCallbackStub();
                Camera2CapturePipelineTorchTaskExternalSyntheticLambda4.onNavigationEvent onnavigationevent = new Camera2CapturePipelineTorchTaskExternalSyntheticLambda4.onNavigationEvent(this.$press);
                this.label = 1;
                if (camera2CapturePipelineTorchTaskExternalSyntheticLambda2IAuthTabCallbackStub.onExtraCallbackWithResult(onnavigationevent, this) == objOnWarmupCompleted) {
                    int i6 = onWarmupCompleted + 17;
                    IAuthTabCallback = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 72 / 0;
                    }
                    return objOnWarmupCompleted;
                }
            }
            return Unit.INSTANCE;
        }
    }
}
