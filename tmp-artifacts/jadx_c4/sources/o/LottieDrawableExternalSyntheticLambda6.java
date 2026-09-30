package o;

import com.facebook.react.uimanager.LayoutShadowNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.LottieDrawableExternalSyntheticLambda6;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class LottieDrawableExternalSyntheticLambda6 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ Unit onNavigationEvent(LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda17, boolean z, Ref.FloatRef floatRef, Ref.FloatRef floatRef2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(lottieDrawableExternalSyntheticLambda17, z, floatRef, floatRef2);
        int i4 = onWarmupCompleted + 95;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static final /* synthetic */ Object onWarmupCompleted(LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda17, float f, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallback(lottieDrawableExternalSyntheticLambda17, f, access13800Var);
            obj.hashCode();
            throw null;
        }
        Object objOnExtraCallback = onExtraCallback(lottieDrawableExternalSyntheticLambda17, f, access13800Var);
        int i3 = onExtraCallback + 61;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return objOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    static final /* synthetic */ class onExtraCallbackWithResult extends AdaptedFunctionReference implements Function2<Float, access13800<? super Float>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        onExtraCallbackWithResult(Object obj) {
            super(2, obj, LottieDrawableExternalSyntheticLambda17.class, "onRelease", "onRelease$uikit_release(F)F", 4);
        }

        public final Object IAuthTabCallback(float f, access13800<? super Float> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 45;
            onExtraCallbackWithResult = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                LottieDrawableExternalSyntheticLambda6.onWarmupCompleted((LottieDrawableExternalSyntheticLambda17) ((AdaptedFunctionReference) this).receiver, f, access13800Var);
                obj.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = LottieDrawableExternalSyntheticLambda6.onWarmupCompleted((LottieDrawableExternalSyntheticLambda17) ((AdaptedFunctionReference) this).receiver, f, access13800Var);
            int i3 = onNavigationEvent + 49;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return objOnWarmupCompleted;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 111;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback(((Number) obj).floatValue(), (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 21;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return objIAuthTabCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
    }

    static final /* synthetic */ class onNavigationEvent extends FunctionReferenceImpl implements Function1<Float, Float> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        onNavigationEvent(Object obj) {
            super(1, obj, LottieDrawableExternalSyntheticLambda17.class, "onPull", "onPull$uikit_release(F)F", 0);
        }

        public final Float IAuthTabCallback(float f) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 59;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Float fValueOf = Float.valueOf(((LottieDrawableExternalSyntheticLambda17) ((CallableReference) this).receiver).IAuthTabCallback(f));
            int i4 = onNavigationEvent + 29;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 33 / 0;
            }
            return fValueOf;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 105;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Float fIAuthTabCallback = IAuthTabCallback(((Number) obj).floatValue());
            int i4 = onNavigationEvent + 53;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return fIAuthTabCallback;
        }
    }

    private static final /* synthetic */ Object onExtraCallback(LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda17, float f, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Float fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(lottieDrawableExternalSyntheticLambda17.onExtraCallback(f));
        if (i3 == 0) {
            int i4 = 44 / 0;
        }
        int i5 = onExtraCallback + 125;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 3 / 0;
        }
        return fOnExtraCallbackWithResult;
    }

    public static final QuirksExternalSyntheticBackport0 onExtraCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda17, boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(lottieDrawableExternalSyntheticLambda17, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = onNavigationEvent(quirksExternalSyntheticBackport0, new onNavigationEvent(lottieDrawableExternalSyntheticLambda17), new onExtraCallbackWithResult(lottieDrawableExternalSyntheticLambda17), z);
        int i2 = onWarmupCompleted + 71;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return quirksExternalSyntheticBackport0OnNavigationEvent;
        }
        throw null;
    }

    public static final QuirksExternalSyntheticBackport0 onNavigationEvent(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull Function1<? super Float, Float> function1, @NotNull Function2<? super Float, ? super access13800<? super Float>, ? extends Object> function2, boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function2, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = updateSensorToBufferTransform.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, new LottieDrawableExternalSyntheticLambda16(function1, function2, z), (reverseSizeF) null, 2, (Object) null);
        int i2 = onExtraCallback + 87;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return quirksExternalSyntheticBackport0OnExtraCallbackWithResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009f A[PHI: r8
      0x009f: PHI (r8v2 o.CameraCaptureResultEmptyCameraCaptureResult$onWarmupCompleted) = 
      (r8v1 o.CameraCaptureResultEmptyCameraCaptureResult$onWarmupCompleted)
      (r8v10 o.CameraCaptureResultEmptyCameraCaptureResult$onWarmupCompleted)
     binds: [B:28:0x009d, B:25:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final LottieDrawableExternalSyntheticLambda17 onNavigationEvent(final boolean z, boolean z2, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function0<Unit> function03, float f, float f2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        float fOnNavigationEvent;
        Object objOnMinimized;
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted;
        final Ref.FloatRef floatRef;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Intrinsics.checkNotNullParameter(function03, "");
        if ((i2 & 32) != 0) {
            int i4 = onExtraCallback + 49;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                fOnNavigationEvent = LottieDrawableExternalSyntheticLambda15.IAuthTabCallback.onNavigationEvent();
                int i5 = 33 / 0;
            } else {
                fOnNavigationEvent = LottieDrawableExternalSyntheticLambda15.IAuthTabCallback.onNavigationEvent();
            }
        } else {
            fOnNavigationEvent = f;
        }
        float fOnNavigationEvent2 = (i2 & 64) != 0 ? LottieDrawableExternalSyntheticLambda15.IAuthTabCallback.onNavigationEvent() : f2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i6 = onExtraCallback + 43;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(993530844, i, -1, "im.toss.compose.widget.ptr.rememberTdsPullRefreshState (TdsPullToRefresh.kt:92)");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(993530844, i, -1, "im.toss.compose.widget.ptr.rememberTdsPullRefreshState (TdsPullToRefresh.kt:92)");
        }
        if (VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(fOnNavigationEvent, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f)) <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i7 = onExtraCallback + 109;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            int i8 = 15 / 0;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = isZslDisabledByByUserCaseConfig.IAuthTabCallback(access13600.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
        } else {
            objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
            }
        }
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted2 = onwarmupcompleted;
        findResAndMsg findresandmsg = (findResAndMsg) objOnMinimized;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(function0, cameraCaptureResultEmptyCameraCaptureResult, (i >> 6) & 14);
        final Ref.FloatRef floatRef2 = new Ref.FloatRef();
        Ref.FloatRef floatRef3 = new Ref.FloatRef();
        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
        floatRef2.element = r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(fOnNavigationEvent);
        floatRef3.element = r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(fOnNavigationEvent2);
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(findresandmsg);
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (zOnNavigationEvent || objOnMinimized2 == onwarmupcompleted2.onExtraCallback()) {
            floatRef = floatRef3;
            LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda17 = new LottieDrawableExternalSyntheticLambda17(findresandmsg, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback, function02, function03, z2, floatRef3.element, floatRef2.element);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(lottieDrawableExternalSyntheticLambda17);
            objOnMinimized2 = lottieDrawableExternalSyntheticLambda17;
        } else {
            floatRef = floatRef3;
        }
        final LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda172 = (LottieDrawableExternalSyntheticLambda17) objOnMinimized2;
        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(lottieDrawableExternalSyntheticLambda172);
        boolean z3 = (((i & 14) ^ 6) > 4 && cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(z)) || (i & 6) == 4;
        boolean zIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(floatRef2.element);
        boolean zIAuthTabCallback2 = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(floatRef.element);
        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if ((z3 | zOnExtraCallback | zIAuthTabCallback | zIAuthTabCallback2) || objOnMinimized3 == onwarmupcompleted2.onExtraCallback()) {
            objOnMinimized3 = new Function0() { // from class: im.toss.compose.widget.ptr.TdsPullToRefreshKt$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke() {
                    int i9 = 2 % 2;
                    int i10 = IAuthTabCallback + 75;
                    onNavigationEvent = i10 % 128;
                    int i11 = i10 % 2;
                    Unit unitOnNavigationEvent = LottieDrawableExternalSyntheticLambda6.onNavigationEvent(lottieDrawableExternalSyntheticLambda172, z, floatRef2, floatRef);
                    int i12 = onNavigationEvent + 45;
                    IAuthTabCallback = i12 % 128;
                    if (i12 % 2 == 0) {
                        return unitOnNavigationEvent;
                    }
                    throw null;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
        }
        isZslDisabledByByUserCaseConfig.onNavigationEvent((Function0) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i9 = onWarmupCompleted + 69;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return lottieDrawableExternalSyntheticLambda172;
    }

    private static final Unit onWarmupCompleted(LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda17, boolean z, Ref.FloatRef floatRef, Ref.FloatRef floatRef2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        lottieDrawableExternalSyntheticLambda17.onExtraCallback(z);
        Object[] objArr = {lottieDrawableExternalSyntheticLambda17, Float.valueOf(floatRef.element)};
        LottieDrawableExternalSyntheticLambda17.onWarmupCompleted(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 2107662630, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), objArr, -2107662630);
        lottieDrawableExternalSyntheticLambda17.onNavigationEvent(floatRef2.element);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 91;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
