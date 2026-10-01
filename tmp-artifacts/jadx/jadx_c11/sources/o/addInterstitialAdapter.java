package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.addInterstitialAdapter;
import o.getSwitchMinWidth;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class addInterstitialAdapter {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public static /* synthetic */ float IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6);
        int i4 = onExtraCallback + 23;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return fOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ float onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6);
        }
        onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CameraPresenceProviderExternalSyntheticLambda6<Float> onNavigationEvent(float f, @NotNull onItemClicked<Float> onitemclicked, float f2, @Nullable String str, @Nullable Function1<? super Float, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        float f3;
        String str2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(onitemclicked, "");
        Object obj = null;
        if ((i2 & 4) != 0) {
            int i4 = onExtraCallback + 59;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            f3 = 0.01f;
        } else {
            f3 = f2;
        }
        if ((i2 & 8) != 0) {
            int i5 = onNavigationEvent + 7;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            str2 = "AlphaAnimation";
        } else {
            str2 = str;
        }
        Function1<? super Float, Unit> function12 = (i2 & 16) != 0 ? null : function1;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i6 = onNavigationEvent + 29;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1584008434, i, -1, "im.toss.tds.compose.foundation.anim.animateAlphaAsState (AnimateState.kt:20)");
                int i7 = 15 / 0;
            } else {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1584008434, i, -1, "im.toss.tds.compose.foundation.anim.animateAlphaAsState (AnimateState.kt:20)");
            }
        }
        final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = isSubmitButtonEnabled.IAuthTabCallback(f, onitemclicked, f3, str2, function12, cameraCaptureResultEmptyCameraCaptureResult, i & 65534, 0);
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!zOnNavigationEvent) {
            int i8 = onExtraCallback + 55;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 != 0) {
                CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                throw null;
            }
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.compose.foundation.anim.AnimateStateKt$$ExternalSyntheticLambda0
                    private static int onExtraCallbackWithResult = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke() {
                        int i9 = 2 % 2;
                        int i10 = onNavigationEvent + 95;
                        onExtraCallbackWithResult = i10 % 128;
                        int i11 = i10 % 2;
                        Float fValueOf = Float.valueOf(addInterstitialAdapter.IAuthTabCallback(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback));
                        int i12 = onNavigationEvent + 3;
                        onExtraCallbackWithResult = i12 % 128;
                        int i13 = i12 % 2;
                        return fValueOf;
                    }
                });
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
        }
        CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i9 = onNavigationEvent + 93;
            onExtraCallback = i9 % 128;
            if (i9 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return cameraPresenceProviderExternalSyntheticLambda6;
    }

    private static final float onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Number number = (Number) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        return i3 != 0 ? RangesKt.coerceIn(number.floatValue(), 2.0f, 0.0f) : RangesKt.coerceIn(number.floatValue(), 0.0f, 1.0f);
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    public static final class IAuthTabCallback<S> implements getBacktraceNote<getSwitchMinWidth.onExtraCallback<S>, CameraCaptureResultEmptyCameraCaptureResult, Integer, updateFocusedState<Float>> {
        public static final IAuthTabCallback IAuthTabCallback = new IAuthTabCallback();
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onNavigationEvent + 111;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 81;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            updateFocusedState<Float> updatefocusedstateOnExtraCallback = onExtraCallback((getSwitchMinWidth.onExtraCallback) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Number) obj3).intValue());
            int i4 = onExtraCallbackWithResult + 63;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return updatefocusedstateOnExtraCallback;
        }

        public final updateFocusedState<Float> onExtraCallback(getSwitchMinWidth.onExtraCallback<S> onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(onextracallback, "");
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-161939245);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = onExtraCallbackWithResult + 69;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-161939245, i, -1, "im.toss.tds.compose.foundation.anim.animateAlpha.<anonymous> (AnimateState.kt:39)");
                if (i4 == 0) {
                    int i5 = 44 / 0;
                }
            }
            getCompoundPaddingRight getcompoundpaddingrightOnExtraCallback = onQueryRefine.onExtraCallback(0.0f, 0.0f, (Object) null, 7, (Object) null);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i6 = onExtraCallbackWithResult + 93;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            return getcompoundpaddingrightOnExtraCallback;
        }
    }

    public static final class onExtraCallback implements Function0<Float> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6<Float> onExtraCallbackWithResult;

        public onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda6) {
            this.onExtraCallbackWithResult = cameraPresenceProviderExternalSyntheticLambda6;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 11;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Float fOnWarmupCompleted = onWarmupCompleted();
            if (i3 == 0) {
                int i4 = 79 / 0;
            }
            return fOnWarmupCompleted;
        }

        public final Float onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 47;
            IAuthTabCallback = i2 % 128;
            return Float.valueOf(RangesKt.coerceIn(i2 % 2 == 0 ? ((Number) this.onExtraCallbackWithResult.onExtraCallbackWithResult()).floatValue() : ((Number) this.onExtraCallbackWithResult.onExtraCallbackWithResult()).floatValue(), 0.0f, 1.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CameraPresenceProviderExternalSyntheticLambda6<Float> onWarmupCompleted(@NotNull doTransformForOnOffText dotransformforonofftext, float f, float f2, @NotNull SwitchCompat<Float> switchCompat, @Nullable String str, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        String str2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(dotransformforonofftext, "");
        Intrinsics.checkNotNullParameter(switchCompat, "");
        if ((i2 & 8) != 0) {
            int i4 = onNavigationEvent + 123;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 % 4;
            }
            str2 = "AlphaAnimation";
        } else {
            str2 = str;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1370016332, i, -1, "im.toss.tds.compose.foundation.anim.animateAlpha (AnimateState.kt:58)");
        }
        final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnWarmupCompleted = cancelSuperTouch.onWarmupCompleted(dotransformforonofftext, f, f2, switchCompat, str2, cameraCaptureResultEmptyCameraCaptureResult, doTransformForOnOffText.onWarmupCompleted | (i & 14) | (i & 112) | (i & 896) | (SwitchCompat.onExtraCallback << 9) | (i & 7168) | (i & 57344), 0);
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6OnWarmupCompleted);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!zOnNavigationEvent) {
            int i6 = onNavigationEvent + 93;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.compose.foundation.anim.AnimateStateKt$$ExternalSyntheticLambda1
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke() {
                        int i8 = 2 % 2;
                        int i9 = onNavigationEvent + 103;
                        onWarmupCompleted = i9 % 128;
                        int i10 = i9 % 2;
                        Float fValueOf = Float.valueOf(addInterstitialAdapter.onExtraCallbackWithResult(cameraPresenceProviderExternalSyntheticLambda6OnWarmupCompleted));
                        int i11 = onWarmupCompleted + 115;
                        onNavigationEvent = i11 % 128;
                        int i12 = i11 % 2;
                        return fValueOf;
                    }
                });
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
        }
        CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i8 = onExtraCallback + 91;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i10 = onNavigationEvent + 1;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
        }
        return cameraPresenceProviderExternalSyntheticLambda6;
    }

    private static final float onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        float fFloatValue = ((Number) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).floatValue();
        float fCoerceIn = i3 == 0 ? RangesKt.coerceIn(fFloatValue, 1.0f, 0.0f) : RangesKt.coerceIn(fFloatValue, 0.0f, 1.0f);
        int i4 = onExtraCallback + 115;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return fCoerceIn;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onTransact implements Function0<Float> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6<Float> IAuthTabCallback;

        public onTransact(CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda6) {
            this.IAuthTabCallback = cameraPresenceProviderExternalSyntheticLambda6;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 89;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Float fOnExtraCallbackWithResult = onExtraCallbackWithResult();
            if (i3 == 0) {
                int i4 = 30 / 0;
            }
            return fOnExtraCallbackWithResult;
        }

        public final Float onExtraCallbackWithResult() {
            float fFloatValue;
            float f;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 89;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                fFloatValue = ((Number) this.IAuthTabCallback.onExtraCallbackWithResult()).floatValue();
                f = 2.0f;
            } else {
                fFloatValue = ((Number) this.IAuthTabCallback.onExtraCallbackWithResult()).floatValue();
                f = 0.0f;
            }
            Float fValueOf = Float.valueOf(RangesKt.coerceAtLeast(fFloatValue, f));
            int i3 = onExtraCallbackWithResult + 119;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return fValueOf;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    public static final class onExtraCallbackWithResult<S> implements Function0<S> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ getSwitchMinWidth onNavigationEvent;

        public onExtraCallbackWithResult(getSwitchMinWidth getswitchminwidth) {
            this.onNavigationEvent = getswitchminwidth;
        }

        public final S invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 115;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                this.onNavigationEvent.access000();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            S s = (S) this.onNavigationEvent.access000();
            int i3 = onWarmupCompleted + 121;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return s;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    public static final class onNavigationEvent<S> implements Function0<S> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ getSwitchMinWidth onExtraCallback;

        public onNavigationEvent(getSwitchMinWidth getswitchminwidth) {
            this.onExtraCallback = getswitchminwidth;
        }

        public final S invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 105;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            S s = (S) this.onExtraCallback.access000();
            int i4 = IAuthTabCallback + 115;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 45 / 0;
            }
            return s;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    public static final class asInterface<S> implements Function0<getSwitchMinWidth.onExtraCallback<S>> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ getSwitchMinWidth onExtraCallback;

        public asInterface(getSwitchMinWidth getswitchminwidth) {
            this.onExtraCallback = getswitchminwidth;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 79;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth.onExtraCallback<S> onExtraCallback = onExtraCallback();
            int i4 = onWarmupCompleted + 15;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return onExtraCallback;
        }

        public final getSwitchMinWidth.onExtraCallback<S> onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 37;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth.onExtraCallback<S> onextracallbackIAuthTabCallbackDefault = this.onExtraCallback.IAuthTabCallbackDefault();
            if (i3 == 0) {
                int i4 = 40 / 0;
            }
            return onextracallbackIAuthTabCallbackDefault;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    public static final class onWarmupCompleted<S> implements Function0<getSwitchMinWidth.onExtraCallback<S>> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ getSwitchMinWidth onExtraCallbackWithResult;

        public onWarmupCompleted(getSwitchMinWidth getswitchminwidth) {
            this.onExtraCallbackWithResult = getswitchminwidth;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 111;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth.onExtraCallback<S> onextracallbackOnNavigationEvent = onNavigationEvent();
            int i4 = onWarmupCompleted + 107;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 81 / 0;
            }
            return onextracallbackOnNavigationEvent;
        }

        public final getSwitchMinWidth.onExtraCallback<S> onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 25;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth.onExtraCallback<S> onextracallbackIAuthTabCallbackDefault = this.onExtraCallbackWithResult.IAuthTabCallbackDefault();
            int i4 = onWarmupCompleted + 41;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return onextracallbackIAuthTabCallbackDefault;
            }
            throw null;
        }
    }
}
