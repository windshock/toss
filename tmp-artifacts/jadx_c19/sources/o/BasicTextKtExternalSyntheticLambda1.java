package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.WindowInsetsConnection_androidKtExternalSyntheticLambda1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class BasicTextKtExternalSyntheticLambda1 {

    static final class asBinder extends Lambda implements Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ int $maxLines;
        final /* synthetic */ RulerAlignmentKtExternalSyntheticLambda5 $modifier;
        final /* synthetic */ BasicTextKtExternalSyntheticLambda12 $style;
        final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asBinder(String str, RulerAlignmentKtExternalSyntheticLambda5 rulerAlignmentKtExternalSyntheticLambda5, BasicTextKtExternalSyntheticLambda12 basicTextKtExternalSyntheticLambda12, int i2, int i3, int i4) {
            super(2);
            this.$text = str;
            this.$modifier = rulerAlignmentKtExternalSyntheticLambda5;
            this.$style = basicTextKtExternalSyntheticLambda12;
            this.$maxLines = i2;
            this.$$changed = i3;
            this.$$default = i4;
        }

        public final void IAuthTabCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
            BasicTextKtExternalSyntheticLambda1.onExtraCallback(this.$text, this.$modifier, this.$style, this.$maxLines, cameraCaptureResultEmptyCameraCaptureResult, this.$$changed | 1, this.$$default);
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            IAuthTabCallback((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }
    }

    public static final void onExtraCallback(@NotNull String str, @Nullable RulerAlignmentKtExternalSyntheticLambda5 rulerAlignmentKtExternalSyntheticLambda5, @Nullable BasicTextKtExternalSyntheticLambda12 basicTextKtExternalSyntheticLambda12, int i2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3, int i4) {
        int i5;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-192911377);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i6 = i4 & 2;
        if (i6 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(rulerAlignmentKtExternalSyntheticLambda5) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= ((i4 & 4) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(basicTextKtExternalSyntheticLambda12)) ? 256 : 128;
        }
        int i7 = i4 & 8;
        if (i7 != 0) {
            i5 |= 3072;
        } else if ((i3 & 3072) == 0) {
            i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i2) ? 2048 : 1024;
        }
        if ((i5 & 1171) != 1170 || !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMessageChannelReady()) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
            if ((i3 & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                if (i6 != 0) {
                    rulerAlignmentKtExternalSyntheticLambda5 = RulerAlignmentKtExternalSyntheticLambda5.Companion;
                }
                if ((i4 & 4) != 0) {
                    basicTextKtExternalSyntheticLambda12 = BasicTextFieldKtExternalSyntheticLambda9.onExtraCallbackWithResult.onExtraCallbackWithResult();
                    i5 &= -897;
                }
                if (i7 != 0) {
                    i2 = Integer.MAX_VALUE;
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                if ((i4 & 4) != 0) {
                    i5 &= -897;
                }
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-192911377, i5, -1, "androidx.glance.text.Text (Text.kt:43)");
            }
            IAuthTabCallback iAuthTabCallback = IAuthTabCallback.onNavigationEvent;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(-1115894518);
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(1886828752);
            if (!(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() instanceof RowColumnMeasurePolicy)) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onRelationshipValidationResult();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(new WindowInsetsConnection_androidKtExternalSyntheticLambda1.onWarmupCompleted(iAuthTabCallback));
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, str, onExtraCallbackWithResult.IAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, rulerAlignmentKtExternalSyntheticLambda5, onNavigationEvent.onExtraCallbackWithResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, basicTextKtExternalSyntheticLambda12, onExtraCallback.onWarmupCompleted);
            onWarmupCompleted onwarmupcompleted = onWarmupCompleted.onNavigationEvent;
            if (cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult.onActivityLayout() || !Intrinsics.areEqual(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult.onMinimized(), Integer.valueOf(i2))) {
                cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult.onWarmupCompleted(Integer.valueOf(i2));
                cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult.onWarmupCompleted(Integer.valueOf(i2), onwarmupcompleted);
            }
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
        BasicTextKtExternalSyntheticLambda12 basicTextKtExternalSyntheticLambda122 = basicTextKtExternalSyntheticLambda12;
        int i8 = i2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new asBinder(str, rulerAlignmentKtExternalSyntheticLambda52, basicTextKtExternalSyntheticLambda122, i8, i3, i4));
        }
    }

    final /* synthetic */ class IAuthTabCallback extends FunctionReferenceImpl implements Function0<BasicTextFieldKtExternalSyntheticLambda3> {
        public static final IAuthTabCallback onNavigationEvent = new IAuthTabCallback();

        IAuthTabCallback() {
            super(0, BasicTextFieldKtExternalSyntheticLambda3.class, "<init>", "<init>()V", 0);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final BasicTextFieldKtExternalSyntheticLambda3 invoke() {
            return new BasicTextFieldKtExternalSyntheticLambda3();
        }
    }

    static final class onExtraCallbackWithResult extends Lambda implements Function2<BasicTextFieldKtExternalSyntheticLambda3, String, Unit> {
        public static final onExtraCallbackWithResult IAuthTabCallback = new onExtraCallbackWithResult();

        onExtraCallbackWithResult() {
            super(2);
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            onWarmupCompleted((BasicTextFieldKtExternalSyntheticLambda3) obj, (String) obj2);
            return Unit.INSTANCE;
        }

        public final void onWarmupCompleted(@NotNull BasicTextFieldKtExternalSyntheticLambda3 basicTextFieldKtExternalSyntheticLambda3, @NotNull String str) {
            basicTextFieldKtExternalSyntheticLambda3.onNavigationEvent(str);
        }
    }

    static final class onNavigationEvent extends Lambda implements Function2<BasicTextFieldKtExternalSyntheticLambda3, RulerAlignmentKtExternalSyntheticLambda5, Unit> {
        public static final onNavigationEvent onExtraCallbackWithResult = new onNavigationEvent();

        onNavigationEvent() {
            super(2);
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            onExtraCallback((BasicTextFieldKtExternalSyntheticLambda3) obj, (RulerAlignmentKtExternalSyntheticLambda5) obj2);
            return Unit.INSTANCE;
        }

        public final void onExtraCallback(@NotNull BasicTextFieldKtExternalSyntheticLambda3 basicTextFieldKtExternalSyntheticLambda3, @NotNull RulerAlignmentKtExternalSyntheticLambda5 rulerAlignmentKtExternalSyntheticLambda5) {
            basicTextFieldKtExternalSyntheticLambda3.IAuthTabCallback(rulerAlignmentKtExternalSyntheticLambda5);
        }
    }

    static final class onExtraCallback extends Lambda implements Function2<BasicTextFieldKtExternalSyntheticLambda3, BasicTextKtExternalSyntheticLambda12, Unit> {
        public static final onExtraCallback onWarmupCompleted = new onExtraCallback();

        onExtraCallback() {
            super(2);
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            onWarmupCompleted((BasicTextFieldKtExternalSyntheticLambda3) obj, (BasicTextKtExternalSyntheticLambda12) obj2);
            return Unit.INSTANCE;
        }

        public final void onWarmupCompleted(@NotNull BasicTextFieldKtExternalSyntheticLambda3 basicTextFieldKtExternalSyntheticLambda3, @NotNull BasicTextKtExternalSyntheticLambda12 basicTextKtExternalSyntheticLambda12) {
            basicTextFieldKtExternalSyntheticLambda3.onExtraCallback(basicTextKtExternalSyntheticLambda12);
        }
    }

    static final class onWarmupCompleted extends Lambda implements Function2<BasicTextFieldKtExternalSyntheticLambda3, Integer, Unit> {
        public static final onWarmupCompleted onNavigationEvent = new onWarmupCompleted();

        onWarmupCompleted() {
            super(2);
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            onWarmupCompleted((BasicTextFieldKtExternalSyntheticLambda3) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void onWarmupCompleted(@NotNull BasicTextFieldKtExternalSyntheticLambda3 basicTextFieldKtExternalSyntheticLambda3, int i2) {
            basicTextFieldKtExternalSyntheticLambda3.onNavigationEvent(i2);
        }
    }
}
