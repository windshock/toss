package o;

import androidx.compose.foundation.layout.RowScope;
import im.toss.appsintoss.R;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.features.verify.sms.impl.SmsVerifyInYourNameFragment$;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda48;
import o.y1a;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SafeActivityEmbeddingComponentProviderExternalSyntheticLambda48 {
    private static int asBinder = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onTransact;
    public static final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda48 IAuthTabCallback = new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda48();
    private static getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted = ForwardingCameraControl.onExtraCallbackWithResult(2141703535, false, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.ComposableSingletons$InAppPurchaseHistoryDetailRefundContentKt$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 79;
            IAuthTabCallback = i3 % 128;
            y1a y1aVar = (y1a) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            if (i3 % 2 == 0) {
                SafeActivityEmbeddingComponentProviderExternalSyntheticLambda48.onWarmupCompleted(y1aVar, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                throw null;
            }
            Unit unitOnWarmupCompleted = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda48.onWarmupCompleted(y1aVar, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
            int i4 = onWarmupCompleted + 23;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unitOnWarmupCompleted;
        }
    });
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent = ForwardingCameraControl.onExtraCallbackWithResult(-1477752996, false, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.ComposableSingletons$InAppPurchaseHistoryDetailRefundContentKt$$ExternalSyntheticLambda1
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 39;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Unit unitIAuthTabCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda48.IAuthTabCallback((RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i5 = IAuthTabCallback + 61;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return unitIAuthTabCallback;
        }
    });

    public static /* synthetic */ Unit IAuthTabCallback(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 13;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return onWarmupCompleted(rowScope, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        onWarmupCompleted(rowScope, cameraCaptureResultEmptyCameraCaptureResult, i2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 45;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallback = onExtraCallback(y1aVar, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallback + 113;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 87 / 0;
        }
        return unitOnExtraCallback;
    }

    public final getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 121;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onWarmupCompleted;
        int i6 = i4 + 1;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return getbacktracenote;
        }
        throw null;
    }

    public final getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 81;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onNavigationEvent;
        if (i4 == 0) {
            int i5 = 90 / 0;
        }
        return getbacktracenote;
    }

    static {
        int i2 = asBinder + 55;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 91;
        onExtraCallbackWithResult = i5 % 128;
        boolean z = true;
        if (i5 % 2 == 0) {
            Intrinsics.checkNotNullParameter(y1aVar, "");
            if ((i2 & 38) == 0) {
                i3 = (!(cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1aVar) ^ true) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
        } else {
            Intrinsics.checkNotNullParameter(y1aVar, "");
            if ((i2 & 6) == 0) {
            }
        }
        if ((i3 & 19) != 18) {
            int i6 = onExtraCallbackWithResult + 3;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
        } else {
            int i8 = onExtraCallback + 27;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onExtraCallbackWithResult + 41;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2141703535, i3, -1, "im.toss.appsintoss.iap.screen.ComposableSingletons$InAppPurchaseHistoryDetailRefundContentKt.lambda$2141703535.<anonymous> (InAppPurchaseHistoryDetailRefundContent.kt:48)");
            }
            y1a.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1254492509, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{y1aVar, DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_purchase_history_detail_refund_title, cameraCaptureResultEmptyCameraCaptureResult, 0), null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i3 << 15) & 458752) | 24576), 10}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1254492510);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i12 = onExtraCallbackWithResult + 9;
            onExtraCallback = i12 % 128;
            int i13 = i12 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        long jOnRelationshipValidationResult;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 17) != 16, i2 & 1)) {
            int i4 = onExtraCallbackWithResult + 81;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onExtraCallback + 85;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1477752996, i2, -1, "im.toss.appsintoss.iap.screen.ComposableSingletons$InAppPurchaseHistoryDetailRefundContentKt.lambda$-1477752996.<anonymous> (InAppPurchaseHistoryDetailRefundContent.kt:109)");
                    int i7 = 14 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1477752996, i2, -1, "im.toss.appsintoss.iap.screen.ComposableSingletons$InAppPurchaseHistoryDetailRefundContentKt.lambda$-1477752996.<anonymous> (InAppPurchaseHistoryDetailRefundContent.kt:109)");
                }
            }
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_purchase_history_detail_refund_etc_placeholder, cameraCaptureResultEmptyCameraCaptureResult, 0);
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                int i8 = onExtraCallbackWithResult + 89;
                onExtraCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1513554019);
                    jOnRelationshipValidationResult = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 88)}, -1444009137, OverseasRrnInputTextField.IAuthTabCallback(), 1444009151)).longValue();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1513554019);
                    jOnRelationshipValidationResult = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -1444009137, OverseasRrnInputTextField.IAuthTabCallback(), 1444009151)).longValue();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1513554979);
                jOnRelationshipValidationResult = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).onRelationshipValidationResult();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strOnExtraCallback, null, AppLovinPostbackService.onExtraCallbackWithResult.getInterfaceDescriptor(), Long.valueOf(jOnRelationshipValidationResult), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.onTransact(), null, cameraCaptureResultEmptyCameraCaptureResult, 0, 196608, 98290}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onExtraCallback + 27;
                onExtraCallbackWithResult = i9 % 128;
                if (i9 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i10 = onExtraCallbackWithResult + 71;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
        }
        return Unit.INSTANCE;
    }
}
