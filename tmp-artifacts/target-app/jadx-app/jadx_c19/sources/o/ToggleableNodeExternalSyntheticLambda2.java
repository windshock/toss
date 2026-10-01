package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ToggleableNodeExternalSyntheticLambda2 {

    static final class onExtraCallbackWithResult extends Lambda implements Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> $content;
        final /* synthetic */ ToggleableNodeExternalSyntheticLambda1 $contentAlignment;
        final /* synthetic */ RulerAlignmentKtExternalSyntheticLambda5 $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(RulerAlignmentKtExternalSyntheticLambda5 rulerAlignmentKtExternalSyntheticLambda5, ToggleableNodeExternalSyntheticLambda1 toggleableNodeExternalSyntheticLambda1, Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, int i2, int i3) {
            super(2);
            this.$modifier = rulerAlignmentKtExternalSyntheticLambda5;
            this.$contentAlignment = toggleableNodeExternalSyntheticLambda1;
            this.$content = function2;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void IAuthTabCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
            ToggleableNodeExternalSyntheticLambda2.onNavigationEvent(this.$modifier, this.$contentAlignment, this.$content, cameraCaptureResultEmptyCameraCaptureResult, this.$$changed | 1, this.$$default);
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            IAuthTabCallback((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }
    }

    public static final void onNavigationEvent(@Nullable RulerAlignmentKtExternalSyntheticLambda5 rulerAlignmentKtExternalSyntheticLambda5, @Nullable ToggleableNodeExternalSyntheticLambda1 toggleableNodeExternalSyntheticLambda1, @NotNull Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) {
        int i4;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1959221577);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(rulerAlignmentKtExternalSyntheticLambda5) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(toggleableNodeExternalSyntheticLambda1) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(function2) ? 256 : 128;
        }
        if ((i4 & 147) != 146 || !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMessageChannelReady()) {
            if (i5 != 0) {
                rulerAlignmentKtExternalSyntheticLambda5 = RulerAlignmentKtExternalSyntheticLambda5.Companion;
            }
            if (i6 != 0) {
                toggleableNodeExternalSyntheticLambda1 = ToggleableNodeExternalSyntheticLambda1.Companion.asInterface();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1959221577, i4, -1, "androidx.glance.layout.Box (Box.kt:64)");
            }
            onExtraCallback onextracallback = onExtraCallback.onNavigationEvent;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(578571862);
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(-548224868);
            if (!(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() instanceof RowColumnMeasurePolicy)) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onRelationshipValidationResult();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(onextracallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, rulerAlignmentKtExternalSyntheticLambda5, onWarmupCompleted.onNavigationEvent);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, toggleableNodeExternalSyntheticLambda1, onNavigationEvent.onExtraCallback);
            function2.invoke(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(((i4 & 896) >> 6) & 14));
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        RulerAlignmentKtExternalSyntheticLambda5 rulerAlignmentKtExternalSyntheticLambda52 = rulerAlignmentKtExternalSyntheticLambda5;
        ToggleableNodeExternalSyntheticLambda1 toggleableNodeExternalSyntheticLambda12 = toggleableNodeExternalSyntheticLambda1;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new onExtraCallbackWithResult(rulerAlignmentKtExternalSyntheticLambda52, toggleableNodeExternalSyntheticLambda12, function2, i2, i3));
        }
    }

    final /* synthetic */ class onExtraCallback extends FunctionReferenceImpl implements Function0<RoundedCornerShapeKt> {
        public static final onExtraCallback onNavigationEvent = new onExtraCallback();

        onExtraCallback() {
            super(0, RoundedCornerShapeKt.class, "<init>", "<init>()V", 0);
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final RoundedCornerShapeKt invoke() {
            return new RoundedCornerShapeKt();
        }
    }

    static final class onWarmupCompleted extends Lambda implements Function2<RoundedCornerShapeKt, RulerAlignmentKtExternalSyntheticLambda5, Unit> {
        public static final onWarmupCompleted onNavigationEvent = new onWarmupCompleted();

        onWarmupCompleted() {
            super(2);
        }

        public final void IAuthTabCallback(@NotNull RoundedCornerShapeKt roundedCornerShapeKt, @NotNull RulerAlignmentKtExternalSyntheticLambda5 rulerAlignmentKtExternalSyntheticLambda5) {
            roundedCornerShapeKt.IAuthTabCallback(rulerAlignmentKtExternalSyntheticLambda5);
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            IAuthTabCallback((RoundedCornerShapeKt) obj, (RulerAlignmentKtExternalSyntheticLambda5) obj2);
            return Unit.INSTANCE;
        }
    }

    static final class onNavigationEvent extends Lambda implements Function2<RoundedCornerShapeKt, ToggleableNodeExternalSyntheticLambda1, Unit> {
        public static final onNavigationEvent onExtraCallback = new onNavigationEvent();

        onNavigationEvent() {
            super(2);
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            onWarmupCompleted((RoundedCornerShapeKt) obj, (ToggleableNodeExternalSyntheticLambda1) obj2);
            return Unit.INSTANCE;
        }

        public final void onWarmupCompleted(@NotNull RoundedCornerShapeKt roundedCornerShapeKt, @NotNull ToggleableNodeExternalSyntheticLambda1 toggleableNodeExternalSyntheticLambda1) {
            roundedCornerShapeKt.onWarmupCompleted(toggleableNodeExternalSyntheticLambda1);
        }
    }
}
