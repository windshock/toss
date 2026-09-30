package o;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.semantics.Role;
import com.skt.usp.UCPApiConstants;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.WebViewClientCompat;
import o.flipHorizontally;
import o.isQueryRefinementEnabled;
import o.setUseCaseAttached;
import o.useAndConfigureProgramWithTexture;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class WebViewClientCompat {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public static /* synthetic */ Unit IAuthTabCallback(Function0 function0, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(function0, useandconfigureprogramwithtexture);
        int i4 = onExtraCallbackWithResult + 77;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(isQueryRefinementEnabled isqueryrefinementenabled, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(isqueryrefinementenabled, fliphorizontally);
        if (i3 == 0) {
            int i4 = 17 / 0;
        }
        int i5 = onExtraCallbackWithResult + 125;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean onExtraCallback(Function0 function0) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = IAuthTabCallback(function0);
        int i4 = onWarmupCompleted + 41;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return zIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final isQueryRefinementEnabled<Float, onSuggestionsKey> onNavigationEvent(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i3 = onWarmupCompleted + 39;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-724580559, i, -1, "im.toss.ads_sdk.ui.compose.rememberNativeAdsClickScale (NativeAdsClick.kt:18)");
                int i4 = 70 / 0;
            } else {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-724580559, i, -1, "im.toss.ads_sdk.ui.compose.rememberNativeAdsClickScale (NativeAdsClick.kt:18)");
            }
        }
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            int i5 = onWarmupCompleted + 69;
            onExtraCallbackWithResult = i5 % 128;
            objOnMinimized = i5 % 2 == 0 ? isIconified.onWarmupCompleted(0.0f, 0.0f, 3, (Object) null) : isIconified.onWarmupCompleted(1.0f, 0.0f, 2, (Object) null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled = (isQueryRefinementEnabled) objOnMinimized;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i6 = onExtraCallbackWithResult + 97;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i7 = 2 / 0;
            } else {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            int i8 = onExtraCallbackWithResult + 125;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
        }
        return isqueryrefinementenabled;
    }

    public static final QuirksExternalSyntheticBackport0 onNavigationEvent(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull final isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(isqueryrefinementenabled, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport0, new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsClickKt$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 55;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                isQueryRefinementEnabled isqueryrefinementenabled2 = isqueryrefinementenabled;
                flipHorizontally fliphorizontally = (flipHorizontally) obj;
                if (i4 != 0) {
                    return WebViewClientCompat.onExtraCallback(isqueryrefinementenabled2, fliphorizontally);
                }
                WebViewClientCompat.onExtraCallback(isqueryrefinementenabled2, fliphorizontally);
                throw null;
            }
        });
        int i2 = onWarmupCompleted + 83;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return quirksExternalSyntheticBackport0IAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(isQueryRefinementEnabled isqueryrefinementenabled, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fliphorizontally, "");
        fliphorizontally.IAuthTabCallbackStubProxy(((Number) isqueryrefinementenabled.IAuthTabCallback()).floatValue());
        fliphorizontally.getInterfaceDescriptor(((Number) isqueryrefinementenabled.IAuthTabCallback()).floatValue());
        fliphorizontally.asInterface(createUShort.Companion.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 109;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final boolean IAuthTabCallback(Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        int i4 = onExtraCallbackWithResult + 37;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    private static final Unit onNavigationEvent(final Function0 function0, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        unregisterOutputSurface.IAuthTabCallback(useandconfigureprogramwithtexture, Role.Companion.onWarmupCompleted());
        unregisterOutputSurface.asInterface(useandconfigureprogramwithtexture, (String) null, new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsClickKt$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 121;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                boolean zOnExtraCallback = WebViewClientCompat.onExtraCallback(function0);
                if (i4 == 0) {
                    return Boolean.valueOf(zOnExtraCallback);
                }
                Boolean.valueOf(zOnExtraCallback);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, 1, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onWarmupCompleted + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public static final class onNavigationEvent implements PointerInputEventHandler {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> IAuthTabCallback;
        final /* synthetic */ Function0<Unit> onExtraCallback;

        onNavigationEvent(isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, Function0<Unit> function0) {
            this.IAuthTabCallback = isqueryrefinementenabled;
            this.onExtraCallback = function0;
        }

        public static /* synthetic */ Unit onExtraCallback(Function0 function0, setUseCaseAttached setusecaseattached) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 33;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                onExtraCallbackWithResult(function0, setusecaseattached);
                throw null;
            }
            Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function0, setusecaseattached);
            int i3 = onExtraCallbackWithResult + 23;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 19 / 0;
            }
            return unitOnExtraCallbackWithResult;
        }

        public final Object invoke(HighPriorityExecutor highPriorityExecutor, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.IAuthTabCallback, null);
            final Function0<Unit> function0 = this.onExtraCallback;
            Object objOnNavigationEvent = Camera2CameraInfoImplExternalSyntheticLambda0.onNavigationEvent(highPriorityExecutor, (Function1) null, (Function1) null, anonymousClass3, new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsClickKt$nativeAdsSlotClick$2$$ExternalSyntheticLambda0
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallbackWithResult + 39;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    Unit unitOnExtraCallback = WebViewClientCompat.onNavigationEvent.onExtraCallback(function0, (setUseCaseAttached) obj);
                    int i5 = onExtraCallbackWithResult + 27;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        return unitOnExtraCallback;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }, access13800Var, 3, (Object) null);
            if (objOnNavigationEvent != access14300.onWarmupCompleted()) {
                return Unit.INSTANCE;
            }
            int i2 = onNavigationEvent + 99;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 != 0) {
                int i4 = 17 / 0;
            }
            int i5 = i3 + 25;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return objOnNavigationEvent;
        }

        /* renamed from: o.WebViewClientCompat$onNavigationEvent$3, reason: invalid class name */
        static final class AnonymousClass3 extends SuspendLambda implements getBacktraceNote<Camera2CameraImplExternalSyntheticLambda0, setUseCaseAttached, access13800<? super Unit>, Object> {
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;
            final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $scale;
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, access13800<? super AnonymousClass3> access13800Var) {
                super(3, access13800Var);
                this.$scale = isqueryrefinementenabled;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 59;
                onWarmupCompleted = i2 % 128;
                Camera2CameraImplExternalSyntheticLambda0 camera2CameraImplExternalSyntheticLambda0 = (Camera2CameraImplExternalSyntheticLambda0) obj;
                setUseCaseAttached setusecaseattached = (setUseCaseAttached) obj2;
                if (i2 % 2 == 0) {
                    return onExtraCallbackWithResult(camera2CameraImplExternalSyntheticLambda0, setusecaseattached.onExtraCallback(), (access13800) obj3);
                }
                onExtraCallbackWithResult(camera2CameraImplExternalSyntheticLambda0, setusecaseattached.onExtraCallback(), (access13800) obj3);
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }

            public final Object onExtraCallbackWithResult(Camera2CameraImplExternalSyntheticLambda0 camera2CameraImplExternalSyntheticLambda0, long j, access13800<? super Unit> access13800Var) throws Throwable {
                int i = 2 % 2;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$scale, access13800Var);
                anonymousClass3.L$0 = camera2CameraImplExternalSyntheticLambda0;
                Object objInvokeSuspend = anonymousClass3.invokeSuspend(Unit.INSTANCE);
                int i2 = onExtraCallbackWithResult + 3;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    return objInvokeSuspend;
                }
                throw null;
            }

            /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:4|(1:25)(1:(2:10|(3:20|33|34)(1:(2:17|42)(2:18|19)))(8:48|21|22|30|31|(4:35|44|(1:46)|47)|33|34)))(5:26|(0)(1:43)|44|(0)|47)|50|28|(5:30|31|(0)|33|34)(1:36)|44|(0)|47|(1:(0))) */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x00dc, code lost:
            
                r0 = th;
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x00dd, code lost:
            
                r3 = 6;
                r8 = 0;
                r16 = 3;
             */
            /* JADX WARN: Removed duplicated region for block: B:35:0x00d4  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x0115  */
            /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Throwable {
                setOnQueryTextListener setonquerytextlistener;
                int i;
                int i2;
                Object objOnNavigationEvent;
                isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled;
                Float fOnExtraCallbackWithResult;
                getThumbPosition getthumbpositionOnExtraCallbackWithResult;
                int i3 = 2 % 2;
                Camera2CameraImplExternalSyntheticLambda0 camera2CameraImplExternalSyntheticLambda0 = (Camera2CameraImplExternalSyntheticLambda0) this.L$0;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i4 = this.label;
                if (i4 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled2 = this.$scale;
                    Float fOnExtraCallbackWithResult2 = access14000.onExtraCallbackWithResult(0.99f);
                    getThumbPosition getthumbpositionOnExtraCallbackWithResult2 = onQueryRefine.onExtraCallbackWithResult(80, 0, (setOnQueryTextListener) null, 6, (Object) null);
                    this.L$0 = camera2CameraImplExternalSyntheticLambda0;
                    this.label = 1;
                    setonquerytextlistener = null;
                    if (isQueryRefinementEnabled.onWarmupCompleted(isqueryrefinementenabled2, fOnExtraCallbackWithResult2, getthumbpositionOnExtraCallbackWithResult2, (Object) null, (Function1) null, this, 12, (Object) null) == objOnWarmupCompleted) {
                        i = 3;
                    }
                    i2 = onExtraCallbackWithResult + 47;
                    onWarmupCompleted = i2 % 128;
                    if (i2 % 2 != 0) {
                    }
                    return objOnWarmupCompleted;
                }
                int i5 = onWarmupCompleted;
                int i6 = i5 + 123;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 != 0 ? i4 != 1 : i4 != 1) {
                    if (i4 != 2) {
                        int i7 = i5 + 75;
                        onExtraCallbackWithResult = i7 % 128;
                        if (i7 % 2 != 0 ? i4 == 3 : i4 == 5) {
                            ResultKt.onNavigationEvent(obj);
                            return Unit.INSTANCE;
                        }
                        if (i4 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Throwable th = (Throwable) this.L$1;
                        ResultKt.onNavigationEvent(obj);
                        int i8 = onWarmupCompleted + 81;
                        onExtraCallbackWithResult = i8 % 128;
                        int i9 = i8 % 2;
                        throw th;
                    }
                    try {
                        ResultKt.onNavigationEvent(obj);
                        objOnNavigationEvent = obj;
                        setonquerytextlistener = null;
                        isqueryrefinementenabled = this.$scale;
                        fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(1.0f);
                        getthumbpositionOnExtraCallbackWithResult = onQueryRefine.onExtraCallbackWithResult(UCPApiConstants.ARAM_TIME_OUT, 0, setonquerytextlistener, 6, setonquerytextlistener);
                        this.L$0 = access15400.onNavigationEvent(camera2CameraImplExternalSyntheticLambda0);
                        this.label = 3;
                    } catch (Throwable th2) {
                        Throwable th3 = th2;
                        setonquerytextlistener = null;
                        int i10 = 6;
                        i = 3;
                        int i11 = 0;
                        isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled3 = this.$scale;
                        Float fOnExtraCallbackWithResult3 = access14000.onExtraCallbackWithResult(1.0f);
                        getThumbPosition getthumbpositionOnExtraCallbackWithResult3 = onQueryRefine.onExtraCallbackWithResult(UCPApiConstants.ARAM_TIME_OUT, i11, setonquerytextlistener, i10, setonquerytextlistener);
                        this.L$0 = access15400.onNavigationEvent(camera2CameraImplExternalSyntheticLambda0);
                        this.L$1 = th3;
                        this.label = 4;
                        if (isQueryRefinementEnabled.onWarmupCompleted(isqueryrefinementenabled3, fOnExtraCallbackWithResult3, getthumbpositionOnExtraCallbackWithResult3, (Object) null, (Function1) null, this, 12, (Object) null) != objOnWarmupCompleted) {
                            throw th3;
                        }
                        i2 = onExtraCallbackWithResult + 47;
                        onWarmupCompleted = i2 % 128;
                        if (i2 % 2 != 0) {
                        }
                        return objOnWarmupCompleted;
                    }
                    if (isQueryRefinementEnabled.onWarmupCompleted(isqueryrefinementenabled, fOnExtraCallbackWithResult, getthumbpositionOnExtraCallbackWithResult, (Object) null, (Function1) null, this, 12, (Object) null) == objOnWarmupCompleted) {
                        i = 3;
                        i2 = onExtraCallbackWithResult + 47;
                        onWarmupCompleted = i2 % 128;
                        if (i2 % 2 != 0) {
                            int i12 = i / 0;
                        }
                        return objOnWarmupCompleted;
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.onNavigationEvent(obj);
                setonquerytextlistener = null;
                this.L$0 = access15400.onNavigationEvent(camera2CameraImplExternalSyntheticLambda0);
                this.label = 2;
                objOnNavigationEvent = camera2CameraImplExternalSyntheticLambda0.onNavigationEvent(this);
                if (objOnNavigationEvent != objOnWarmupCompleted) {
                    isqueryrefinementenabled = this.$scale;
                    fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(1.0f);
                    getthumbpositionOnExtraCallbackWithResult = onQueryRefine.onExtraCallbackWithResult(UCPApiConstants.ARAM_TIME_OUT, 0, setonquerytextlistener, 6, setonquerytextlistener);
                    this.L$0 = access15400.onNavigationEvent(camera2CameraImplExternalSyntheticLambda0);
                    this.label = 3;
                    if (isQueryRefinementEnabled.onWarmupCompleted(isqueryrefinementenabled, fOnExtraCallbackWithResult, getthumbpositionOnExtraCallbackWithResult, (Object) null, (Function1) null, this, 12, (Object) null) == objOnWarmupCompleted) {
                    }
                    return Unit.INSTANCE;
                }
                i = 3;
                i2 = onExtraCallbackWithResult + 47;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                }
                return objOnWarmupCompleted;
            }
        }

        private static final Unit onExtraCallbackWithResult(Function0 function0, setUseCaseAttached setusecaseattached) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 93;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            function0.invoke();
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 115;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 10 / 0;
            }
            return unit;
        }
    }

    public static final QuirksExternalSyntheticBackport0 IAuthTabCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, @NotNull final Function0<Unit> function0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(isqueryrefinementenabled, "");
        Intrinsics.checkNotNullParameter(function0, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = SequentialExecutorWorkerRunningState.onExtraCallbackWithResult(getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, false, new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsClickKt$$ExternalSyntheticLambda2
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 61;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitIAuthTabCallback = WebViewClientCompat.IAuthTabCallback(function0, (useAndConfigureProgramWithTexture) obj);
                int i5 = onExtraCallback + 121;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return unitIAuthTabCallback;
            }
        }, 1, (Object) null), isqueryrefinementenabled, function0, new onNavigationEvent(isqueryrefinementenabled, function0));
        int i2 = onWarmupCompleted + 121;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 43 / 0;
        }
        return quirksExternalSyntheticBackport0OnExtraCallbackWithResult;
    }
}
