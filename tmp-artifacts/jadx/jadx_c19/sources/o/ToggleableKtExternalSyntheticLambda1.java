package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import o.ToggleableNodeExternalSyntheticLambda1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ToggleableKtExternalSyntheticLambda1 {

    static final class onNavigationEvent extends Lambda implements Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ getBacktraceNote<AndroidCursorHandle_androidKtExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> $content;
        final /* synthetic */ int $horizontalAlignment;
        final /* synthetic */ RulerAlignmentKtExternalSyntheticLambda5 $modifier;
        final /* synthetic */ int $verticalAlignment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        onNavigationEvent(RulerAlignmentKtExternalSyntheticLambda5 rulerAlignmentKtExternalSyntheticLambda5, int i2, int i3, getBacktraceNote<? super AndroidCursorHandle_androidKtExternalSyntheticLambda0, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, int i4, int i5) {
            super(2);
            this.$modifier = rulerAlignmentKtExternalSyntheticLambda5;
            this.$verticalAlignment = i2;
            this.$horizontalAlignment = i3;
            this.$content = getbacktracenote;
            this.$$changed = i4;
            this.$$default = i5;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            onExtraCallbackWithResult((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void onExtraCallbackWithResult(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
            ToggleableKtExternalSyntheticLambda1.onExtraCallback(this.$modifier, this.$verticalAlignment, this.$horizontalAlignment, this.$content, cameraCaptureResultEmptyCameraCaptureResult, this.$$changed | 1, this.$$default);
        }
    }

    public static final void onExtraCallback(@Nullable RulerAlignmentKtExternalSyntheticLambda5 rulerAlignmentKtExternalSyntheticLambda5, int i2, int i3, @NotNull getBacktraceNote<? super AndroidCursorHandle_androidKtExternalSyntheticLambda0, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4, int i5) {
        int i6;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1883910253);
        int i7 = i5 & 1;
        if (i7 != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i6 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(rulerAlignmentKtExternalSyntheticLambda5) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i8 = i5 & 2;
        if (i8 != 0) {
            i6 |= 48;
        } else if ((i4 & 48) == 0) {
            i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i2) ? 32 : 16;
        }
        int i9 = i5 & 4;
        if (i9 != 0) {
            i6 |= 384;
        } else if ((i4 & 384) == 0) {
            i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i3) ? 256 : 128;
        }
        if ((i5 & 8) != 0) {
            i6 |= 3072;
        } else if ((i4 & 3072) == 0) {
            i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getbacktracenote) ? 2048 : 1024;
        }
        if ((i6 & 1171) != 1170 || !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMessageChannelReady()) {
            if (i7 != 0) {
                rulerAlignmentKtExternalSyntheticLambda5 = RulerAlignmentKtExternalSyntheticLambda5.Companion;
            }
            if (i8 != 0) {
                i2 = ToggleableNodeExternalSyntheticLambda1.Companion.asBinder();
            }
            if (i9 != 0) {
                i3 = ToggleableNodeExternalSyntheticLambda1.Companion.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1883910253, i6, -1, "androidx.glance.layout.Column (Column.kt:87)");
            }
            IAuthTabCallback iAuthTabCallback = IAuthTabCallback.onExtraCallback;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(578571862);
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(-548224868);
            if (!(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() instanceof RowColumnMeasurePolicy)) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onRelationshipValidationResult();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(iAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, rulerAlignmentKtExternalSyntheticLambda5, onExtraCallback.onExtraCallbackWithResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, ToggleableNodeExternalSyntheticLambda1.onWarmupCompleted.onNavigationEvent(i3), onExtraCallbackWithResult.IAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, ToggleableNodeExternalSyntheticLambda1.IAuthTabCallback.onExtraCallback(i2), onWarmupCompleted.IAuthTabCallback);
            getbacktracenote.invoke(RoundedCornerShape.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(((i6 >> 6) & 112) | 6));
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
        int i10 = i2;
        int i11 = i3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new onNavigationEvent(rulerAlignmentKtExternalSyntheticLambda52, i10, i11, getbacktracenote, i4, i5));
        }
    }

    final /* synthetic */ class IAuthTabCallback extends FunctionReferenceImpl implements Function0<TriStateToggleableNodeExternalSyntheticLambda0> {
        public static final IAuthTabCallback onExtraCallback = new IAuthTabCallback();

        IAuthTabCallback() {
            super(0, TriStateToggleableNodeExternalSyntheticLambda0.class, "<init>", "<init>()V", 0);
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final TriStateToggleableNodeExternalSyntheticLambda0 invoke() {
            return new TriStateToggleableNodeExternalSyntheticLambda0();
        }
    }

    static final class onExtraCallback extends Lambda implements Function2<TriStateToggleableNodeExternalSyntheticLambda0, RulerAlignmentKtExternalSyntheticLambda5, Unit> {
        public static final onExtraCallback onExtraCallbackWithResult = new onExtraCallback();

        onExtraCallback() {
            super(2);
        }

        public final void IAuthTabCallback(@NotNull TriStateToggleableNodeExternalSyntheticLambda0 triStateToggleableNodeExternalSyntheticLambda0, @NotNull RulerAlignmentKtExternalSyntheticLambda5 rulerAlignmentKtExternalSyntheticLambda5) {
            triStateToggleableNodeExternalSyntheticLambda0.IAuthTabCallback(rulerAlignmentKtExternalSyntheticLambda5);
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            IAuthTabCallback((TriStateToggleableNodeExternalSyntheticLambda0) obj, (RulerAlignmentKtExternalSyntheticLambda5) obj2);
            return Unit.INSTANCE;
        }
    }

    static final class onExtraCallbackWithResult extends Lambda implements Function2<TriStateToggleableNodeExternalSyntheticLambda0, ToggleableNodeExternalSyntheticLambda1.onWarmupCompleted, Unit> {
        public static final onExtraCallbackWithResult IAuthTabCallback = new onExtraCallbackWithResult();

        onExtraCallbackWithResult() {
            super(2);
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            onNavigationEvent((TriStateToggleableNodeExternalSyntheticLambda0) obj, ((ToggleableNodeExternalSyntheticLambda1.onWarmupCompleted) obj2).onNavigationEvent());
            return Unit.INSTANCE;
        }

        public final void onNavigationEvent(@NotNull TriStateToggleableNodeExternalSyntheticLambda0 triStateToggleableNodeExternalSyntheticLambda0, int i2) {
            triStateToggleableNodeExternalSyntheticLambda0.IAuthTabCallback(i2);
        }
    }

    static final class onWarmupCompleted extends Lambda implements Function2<TriStateToggleableNodeExternalSyntheticLambda0, ToggleableNodeExternalSyntheticLambda1.IAuthTabCallback, Unit> {
        public static final onWarmupCompleted IAuthTabCallback = new onWarmupCompleted();

        onWarmupCompleted() {
            super(2);
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            onExtraCallbackWithResult((TriStateToggleableNodeExternalSyntheticLambda0) obj, ((ToggleableNodeExternalSyntheticLambda1.IAuthTabCallback) obj2).onWarmupCompleted());
            return Unit.INSTANCE;
        }

        public final void onExtraCallbackWithResult(@NotNull TriStateToggleableNodeExternalSyntheticLambda0 triStateToggleableNodeExternalSyntheticLambda0, int i2) {
            triStateToggleableNodeExternalSyntheticLambda0.onWarmupCompleted(i2);
        }
    }
}
