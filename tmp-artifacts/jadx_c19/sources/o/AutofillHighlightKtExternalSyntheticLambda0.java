package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import o.WindowInsetsConnection_androidKtExternalSyntheticLambda1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AutofillHighlightKtExternalSyntheticLambda0 {

    static final class onWarmupCompleted extends Lambda implements Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ RulerAlignmentKtExternalSyntheticLambda5 $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(RulerAlignmentKtExternalSyntheticLambda5 rulerAlignmentKtExternalSyntheticLambda5, int i2, int i3) {
            super(2);
            this.$modifier = rulerAlignmentKtExternalSyntheticLambda5;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            onExtraCallbackWithResult((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void onExtraCallbackWithResult(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
            AutofillHighlightKtExternalSyntheticLambda0.onWarmupCompleted(this.$modifier, cameraCaptureResultEmptyCameraCaptureResult, this.$$changed | 1, this.$$default);
        }
    }

    public static final void onWarmupCompleted(@Nullable RulerAlignmentKtExternalSyntheticLambda5 rulerAlignmentKtExternalSyntheticLambda5, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) {
        int i4;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1380468206);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(rulerAlignmentKtExternalSyntheticLambda5) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i4 & 3) != 2 || !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMessageChannelReady()) {
            if (i5 != 0) {
                rulerAlignmentKtExternalSyntheticLambda5 = RulerAlignmentKtExternalSyntheticLambda5.Companion;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1380468206, i4, -1, "androidx.glance.layout.Spacer (Spacer.kt:42)");
            }
            onNavigationEvent onnavigationevent = onNavigationEvent.onExtraCallbackWithResult;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(-1115894518);
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(1886828752);
            if (!(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() instanceof RowColumnMeasurePolicy)) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onRelationshipValidationResult();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(new WindowInsetsConnection_androidKtExternalSyntheticLambda1.onWarmupCompleted(onnavigationevent));
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraProviderInitRetryPolicy1.onNavigationEvent(CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback), rulerAlignmentKtExternalSyntheticLambda5, onExtraCallbackWithResult.onExtraCallbackWithResult);
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new onWarmupCompleted(rulerAlignmentKtExternalSyntheticLambda5, i2, i3));
        }
    }

    final /* synthetic */ class onNavigationEvent extends FunctionReferenceImpl implements Function0<AndroidCursorHandle_androidKtExternalSyntheticLambda2> {
        public static final onNavigationEvent onExtraCallbackWithResult = new onNavigationEvent();

        onNavigationEvent() {
            super(0, AndroidCursorHandle_androidKtExternalSyntheticLambda2.class, "<init>", "<init>()V", 0);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final AndroidCursorHandle_androidKtExternalSyntheticLambda2 invoke() {
            return new AndroidCursorHandle_androidKtExternalSyntheticLambda2();
        }
    }

    static final class onExtraCallbackWithResult extends Lambda implements Function2<AndroidCursorHandle_androidKtExternalSyntheticLambda2, RulerAlignmentKtExternalSyntheticLambda5, Unit> {
        public static final onExtraCallbackWithResult onExtraCallbackWithResult = new onExtraCallbackWithResult();

        onExtraCallbackWithResult() {
            super(2);
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            onExtraCallback((AndroidCursorHandle_androidKtExternalSyntheticLambda2) obj, (RulerAlignmentKtExternalSyntheticLambda5) obj2);
            return Unit.INSTANCE;
        }

        public final void onExtraCallback(@NotNull AndroidCursorHandle_androidKtExternalSyntheticLambda2 androidCursorHandle_androidKtExternalSyntheticLambda2, @NotNull RulerAlignmentKtExternalSyntheticLambda5 rulerAlignmentKtExternalSyntheticLambda5) {
            androidCursorHandle_androidKtExternalSyntheticLambda2.IAuthTabCallback(rulerAlignmentKtExternalSyntheticLambda5);
        }
    }
}
