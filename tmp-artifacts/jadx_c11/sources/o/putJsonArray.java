package o;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import im.toss.tds.compose.component.compound.agreement.v4.payment.TdsPaymentAgreementScreenContentKt$;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirkSettingsLoader;
import o.putJsonArray;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class putJsonArray {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public static /* synthetic */ Unit IAuthTabCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 41;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = IAuthTabCallback + 87;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, putJSONObjectIfValid putjsonobjectifvalid, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 13;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(quirksExternalSyntheticBackport0, putjsonobjectifvalid, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 27;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static final Unit onExtraCallbackWithResult(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 37;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallback + 11;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, putJSONObjectIfValid putjsonobjectifvalid, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 33;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallback(quirksExternalSyntheticBackport0, putjsonobjectifvalid, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallback + 45;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, putJSONObjectIfValid putjsonobjectifvalid, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 99;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(quirksExternalSyntheticBackport0, putjsonobjectifvalid, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        if (i6 == 0) {
            int i7 = 31 / 0;
        }
        int i8 = onExtraCallbackWithResult + 7;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static final Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, putJSONObjectIfValid putjsonobjectifvalid, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 109;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            Object obj = null;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i5 = IAuthTabCallback + 87;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1666803953, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.payment.TdsPaymentAgreementScreen.<anonymous> (TdsPaymentAgreementScreenContent.kt:32)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1666803953, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.payment.TdsPaymentAgreementScreen.<anonymous> (TdsPaymentAgreementScreenContent.kt:32)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport0, 0.0f, 1, (Object) null), (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), 0.0f, 2, (Object) null);
            component5 component5VarOnExtraCallback = RowKt.onExtraCallback(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onNavigationEvent(), QuirkSettingsLoader.Companion.IAuthTabCallbackDefault(), cameraCaptureResultEmptyCameraCaptureResult, 54);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnExtraCallback, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
            Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2OnExtraCallback = putjsonobjectifvalid.onExtraCallback();
            if (function2OnExtraCallback == null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-2032826514);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-204122381);
                function2OnExtraCallback.invoke(cameraCaptureResultEmptyCameraCaptureResult, 0);
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onExtraCallbackWithResult + 33;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallbackWithResult + 71;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(@Nullable final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable final putJSONObjectIfValid putjsonobjectifvalid, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        boolean z;
        int i4 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1569524785);
        int i5 = i2 & 1;
        if (i5 != 0) {
            int i6 = IAuthTabCallback;
            int i7 = i6 + 51;
            onExtraCallbackWithResult = i7 % 128;
            i3 = i7 % 2 == 0 ? i | 89 : i | 6;
            int i8 = i6 + 55;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
        } else if ((i & 6) == 0) {
            int i10 = onExtraCallbackWithResult + 67;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            i3 = (!(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ^ true) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(putjsonobjectifvalid)) ? 32 : 16;
        }
        if ((i3 & 19) != 18) {
            int i12 = onExtraCallbackWithResult + 95;
            IAuthTabCallback = i12 % 128;
            z = i12 % 2 == 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
            int i13 = IAuthTabCallback + 57;
            onExtraCallbackWithResult = i13 % 128;
            if (i13 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                if ((i & 1) != 0 && !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i14 = onExtraCallbackWithResult + 35;
                        IAuthTabCallback = i14 % 128;
                        int i15 = i14 % 2;
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1569524785, i3, -1, "im.toss.tds.compose.component.compound.agreement.v4.payment.TdsPaymentAgreementScreen (TdsPaymentAgreementScreenContent.kt:22)");
                    }
                    setPostviewFormatSelector.onNavigationEvent(needCorrectJpegMetadata.onWarmupCompleted().onExtraCallback(VirtualCameraAdapterVirtualCameraCaptureCallback.onExtraCallbackWithResult(((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).IAuthTabCallback(), Math.min(((Configuration) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallbackWithResult())).fontScale, 1.35f))), ForwardingCameraControl.onExtraCallback(-1666803953, true, new Function2() { // from class: im.toss.tds.compose.component.compound.agreement.v4.payment.TdsPaymentAgreementScreenContentKt$$ExternalSyntheticLambda1
                        private static int onExtraCallback = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj, Object obj2) {
                            int i16 = 2 % 2;
                            int i17 = onExtraCallback + 35;
                            onNavigationEvent = i17 % 128;
                            int i18 = i17 % 2;
                            Unit unitOnExtraCallback = putJsonArray.onExtraCallback(quirksExternalSyntheticBackport0, putjsonobjectifvalid, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            int i19 = onNavigationEvent + 43;
                            onExtraCallback = i19 % 128;
                            int i20 = i19 % 2;
                            return unitOnExtraCallback;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, accessgetCameraFactoryp.onNavigationEvent | 48);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            }
            if (i5 != 0) {
                quirksExternalSyntheticBackport0 = QuirksExternalSyntheticBackport0.Companion;
            }
            if ((i2 & 2) != 0) {
                int i16 = IAuthTabCallback + 47;
                onExtraCallbackWithResult = i16 % 128;
                int i17 = i16 % 2;
                putjsonobjectifvalid = putJSONObject.onExtraCallback(null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 3);
                i3 &= -113;
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            }
            setPostviewFormatSelector.onNavigationEvent(needCorrectJpegMetadata.onWarmupCompleted().onExtraCallback(VirtualCameraAdapterVirtualCameraCaptureCallback.onExtraCallbackWithResult(((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).IAuthTabCallback(), Math.min(((Configuration) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallbackWithResult())).fontScale, 1.35f))), ForwardingCameraControl.onExtraCallback(-1666803953, true, new Function2() { // from class: im.toss.tds.compose.component.compound.agreement.v4.payment.TdsPaymentAgreementScreenContentKt$$ExternalSyntheticLambda1
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj, Object obj2) {
                    int i162 = 2 % 2;
                    int i172 = onExtraCallback + 35;
                    onNavigationEvent = i172 % 128;
                    int i18 = i172 % 2;
                    Unit unitOnExtraCallback = putJsonArray.onExtraCallback(quirksExternalSyntheticBackport0, putjsonobjectifvalid, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i19 = onNavigationEvent + 43;
                    onExtraCallback = i19 % 128;
                    int i20 = i19 % 2;
                    return unitOnExtraCallback;
                }
            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, accessgetCameraFactoryp.onNavigationEvent | 48);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            int i18 = onExtraCallbackWithResult + 75;
            IAuthTabCallback = i18 % 128;
            int i19 = i18 % 2;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.agreement.v4.payment.TdsPaymentAgreementScreenContentKt$$ExternalSyntheticLambda2
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj, Object obj2) {
                    int i20 = 2 % 2;
                    int i21 = onWarmupCompleted + 109;
                    onExtraCallbackWithResult = i21 % 128;
                    int i22 = i21 % 2;
                    Unit unitOnWarmupCompleted = putJsonArray.onWarmupCompleted(quirksExternalSyntheticBackport0, putjsonobjectifvalid, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i23 = onWarmupCompleted + 35;
                    onExtraCallbackWithResult = i23 % 128;
                    int i24 = i23 % 2;
                    return unitOnWarmupCompleted;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onWarmupCompleted(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 93;
        IAuthTabCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1347001268);
            obj.hashCode();
            throw null;
        }
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1347001268);
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i != 0, i & 1)) {
            int i4 = IAuthTabCallback + 119;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 35 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i6 = IAuthTabCallback + 97;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1347001268, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.payment.TdsTossPayAgreementScreenPreview (TdsPaymentAgreementScreenContent.kt:44)");
                }
                onExtraCallback(null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 3);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i8 = IAuthTabCallback + 87;
                    onExtraCallbackWithResult = i8 % 128;
                    if (i8 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        int i9 = 91 / 0;
                    } else {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                onExtraCallback(null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 3);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsPaymentAgreementScreenContentKt$.ExternalSyntheticLambda0(i));
        }
    }
}
