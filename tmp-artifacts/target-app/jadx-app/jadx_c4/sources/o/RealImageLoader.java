package o;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.RealImageLoader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RealImageLoader {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public static /* synthetic */ Unit onExtraCallback(getBorderRadius getborderradius) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(getborderradius);
        if (i3 == 0) {
            int i4 = 15 / 0;
        }
        int i5 = onExtraCallbackWithResult + 63;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 49 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ Function0 onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Function0<Unit> function0IAuthTabCallback = IAuthTabCallback(cameraPresenceProviderExternalSyntheticLambda6);
        int i4 = onWarmupCompleted + 39;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return function0IAuthTabCallback;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6<Function0<Unit>> $currentDoOnAction$delegate;
        final /* synthetic */ long $duration;
        final /* synthetic */ getBorderRadius<Unit> $internalFlow;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(getBorderRadius<Unit> getborderradius, long j, CameraPresenceProviderExternalSyntheticLambda6<? extends Function0<Unit>> cameraPresenceProviderExternalSyntheticLambda6, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$internalFlow = getborderradius;
            this.$duration = j;
            this.$currentDoOnAction$delegate = cameraPresenceProviderExternalSyntheticLambda6;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$internalFlow, this.$duration, this.$currentDoOnAction$delegate, access13800Var);
            int i2 = onExtraCallback + 7;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return onextracallbackwithresult;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 87;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onNavigationEvent(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
            int i3 = onExtraCallback + 109;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 107;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                onextracallbackwithresultCreate.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onextracallbackwithresultCreate.invokeSuspend(unit);
            int i4 = onExtraCallback + 51;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* renamed from: o.RealImageLoader$onExtraCallbackWithResult$2, reason: invalid class name */
        static final class AnonymousClass2 extends SuspendLambda implements Function2<Unit, access13800<? super Unit>, Object> {
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;
            final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6<Function0<Unit>> $currentDoOnAction$delegate;
            final /* synthetic */ long $duration;
            final /* synthetic */ Ref.LongRef $lastThrottleTimeMillis;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Ref.LongRef longRef, long j, CameraPresenceProviderExternalSyntheticLambda6<? extends Function0<Unit>> cameraPresenceProviderExternalSyntheticLambda6, access13800<? super AnonymousClass2> access13800Var) {
                super(2, access13800Var);
                this.$lastThrottleTimeMillis = longRef;
                this.$duration = j;
                this.$currentDoOnAction$delegate = cameraPresenceProviderExternalSyntheticLambda6;
            }

            public final Object IAuthTabCallback(Unit unit, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 27;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(unit, access13800Var).invokeSuspend(Unit.INSTANCE);
                if (i3 != 0) {
                    int i4 = 33 / 0;
                }
                return objInvokeSuspend;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$lastThrottleTimeMillis, this.$duration, this.$currentDoOnAction$delegate, access13800Var);
                int i2 = onWarmupCompleted + 79;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass2;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 97;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object objIAuthTabCallback = IAuthTabCallback((Unit) obj, (access13800) obj2);
                int i4 = onWarmupCompleted + 65;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return objIAuthTabCallback;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i2 = onWarmupCompleted + 31;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                ResultKt.onNavigationEvent(obj);
                long jCurrentTimeMillis = System.currentTimeMillis();
                Ref.LongRef longRef = this.$lastThrottleTimeMillis;
                if (jCurrentTimeMillis - longRef.element > this.$duration) {
                    int i4 = onWarmupCompleted + 123;
                    IAuthTabCallback = i4 % 128;
                    if (i4 % 2 == 0) {
                        longRef.element = jCurrentTimeMillis;
                        RealImageLoader.onNavigationEvent(this.$currentDoOnAction$delegate).invoke();
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    longRef.element = jCurrentTimeMillis;
                    RealImageLoader.onNavigationEvent(this.$currentDoOnAction$delegate).invoke();
                }
                return Unit.INSTANCE;
            }
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 43;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                Ref.LongRef longRef = new Ref.LongRef();
                getBorderRadius<Unit> getborderradius = this.$internalFlow;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(longRef, this.$duration, this.$currentDoOnAction$delegate, null);
                this.L$0 = access15400.onNavigationEvent(longRef);
                this.label = 1;
                if (ycxycx.onWarmupCompleted(getborderradius, anonymousClass2, this) == objOnWarmupCompleted) {
                    int i5 = onWarmupCompleted + 13;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 != 0) {
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
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    private static final Unit onExtraCallbackWithResult(getBorderRadius getborderradius) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        getborderradius.onNavigationEvent(unit);
        int i4 = onWarmupCompleted + 51;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 62 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Function0<Unit> onWarmupCompleted(long j, @NotNull Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        boolean z = true;
        if ((i2 & 1) != 0) {
            int i4 = onWarmupCompleted + 15;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            j = 500;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1297193749, i, -1, "im.toss.components.compose.extensions.throttleFirst (Throttle.kt:27)");
        }
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(function0, cameraCaptureResultEmptyCameraCaptureResult, (i >> 3) & 14);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
        if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized = getShine.onExtraCallback(0, 1, CloseableUtils.DROP_OLDEST);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        final getBorderRadius getborderradius = (getBorderRadius) objOnMinimized;
        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(getborderradius);
        int i6 = i & 14;
        if ((i6 ^ 6) > 4) {
            int i7 = onWarmupCompleted + 105;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(j)) {
                    z = false;
                }
            } else if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(j)) {
            }
            if ((i & 6) != 4) {
                int i8 = onWarmupCompleted + 79;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
            }
        } else if ((i & 6) != 4) {
        }
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(zOnNavigationEvent | z | zOnExtraCallback)) {
            int i10 = onWarmupCompleted + 109;
            onExtraCallbackWithResult = i10 % 128;
            if (i10 % 2 == 0) {
                onwarmupcompleted.onExtraCallback();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(getborderradius, j, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback, null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(onextracallbackwithresult);
                objOnMinimized2 = onextracallbackwithresult;
            }
        }
        isZslDisabledByByUserCaseConfig.onNavigationEvent(Long.valueOf(j), (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, i6);
        boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(getborderradius);
        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!zOnExtraCallback2) {
            int i11 = onExtraCallbackWithResult + 43;
            onWarmupCompleted = i11 % 128;
            int i12 = i11 % 2;
            if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized3 = new Function0() { // from class: im.toss.components.compose.extensions.ThrottleKt$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallback = 1;

                    public final Object invoke() {
                        int i13 = 2 % 2;
                        int i14 = onExtraCallback + 101;
                        IAuthTabCallback = i14 % 128;
                        int i15 = i14 % 2;
                        Unit unitOnExtraCallback = RealImageLoader.onExtraCallback(getborderradius);
                        int i16 = onExtraCallback + 117;
                        IAuthTabCallback = i16 % 128;
                        if (i16 % 2 == 0) {
                            return unitOnExtraCallback;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
            }
        }
        Function0<Unit> function02 = (Function0) objOnMinimized3;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return function02;
    }

    private static final Function0<Unit> IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6<? extends Function0<Unit>> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Function0<Unit> function0 = (Function0) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 == 0) {
            int i4 = 78 / 0;
        }
        return function0;
    }
}
