package o;

import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.features.loan.comparison.result.view.LoanComparisonResultWarningNoticeView;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tds.compose.foundation.TdsRippleKt$;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.addAppOpenAdapter;
import o.addRewardedAdapter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class addRewardedAdapter {
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static int asInterface = 1;
    private static final AppLovinAdClickListener onWarmupCompleted = new AppLovinAdClickListener(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f), null);
    private static final addAppOpenAdapter onExtraCallback = new addAppOpenAdapter(AppLovinAdVideoPlaybackListener.onWarmupCompleted.onUnminimized(), null, 2, null);
    private static final addAppOpenAdapter onExtraCallbackWithResult = new addAppOpenAdapter(AppLovinAdRewardListener.onExtraCallbackWithResult.onRelationshipValidationResult(), null, 2, null);
    private static final addAppOpenAdapter onNavigationEvent = new addAppOpenAdapter(0, null, 3, null);
    private static final accessisMonitoringp<addAppOpenAdapter> IAuthTabCallback = setPostviewFormatSelector.IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda0) null, new Function0() { // from class: im.toss.tds.compose.foundation.TdsRippleKt$$ExternalSyntheticLambda0
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 49;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            addAppOpenAdapter addappopenadapterOnExtraCallbackWithResult = addRewardedAdapter.onExtraCallbackWithResult();
            int i4 = onNavigationEvent + 123;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return addappopenadapterOnExtraCallbackWithResult;
        }
    }, 1, (Object) null);

    public static /* synthetic */ Unit onExtraCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = asBinder + 37;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = IAuthTabCallbackStub + 63;
        asBinder = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 97 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ addAppOpenAdapter onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 5;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return asInterface();
        }
        asInterface();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ RippleAlpha onNavigationEvent(float f) {
        int i = 2 % 2;
        int i2 = asBinder + 97;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {Float.valueOf(f)};
        if (i3 == 0) {
            return (RippleAlpha) onWarmupCompleted(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), objArr, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 961808141, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -961808141);
        }
        int i4 = 33 / 0;
        return (RippleAlpha) onWarmupCompleted(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), objArr, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 961808141, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -961808141);
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~(i7 | i4);
        int i9 = (~(i7 | i2)) | i8 | (~(i4 | i2));
        int i10 = (~((~i4) | i6)) | (~(i6 | i2));
        int i11 = (~((~i2) | i7)) | i8;
        int i12 = i6 + i4 + i3 + (1821889583 * i) + ((-349070011) * i5);
        int i13 = i12 * i12;
        int i14 = (575745661 * i6) + 325058560 + (1920428227 * i4) + (i9 * 448227522) + ((-448227522) * i10) + (448227522 * i11) + (1472200704 * i3) + (473956352 * i) + (1723858944 * i5) + ((-1436549120) * i13);
        int i15 = (i6 * 921699331) + 387174459 + (i4 * 921699517) + (i9 * 62) + (i10 * (-62)) + (i11 * 62) + (i3 * 921699455) + (i * 347275089) + (i5 * 1925323067) + (i13 * 94371840);
        int i16 = i14 + (i15 * i15 * (-174063616));
        return i16 != 1 ? i16 != 2 ? onNavigationEvent(objArr) : onWarmupCompleted(objArr) : onExtraCallback(objArr);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        setOrientationDegrees setorientationdegrees = (setOrientationDegrees) objArr[0];
        toMetersPerSecond tometerspersecond = (toMetersPerSecond) objArr[1];
        long jLongValue = ((Number) objArr[2]).longValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 87;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(setorientationdegrees, tometerspersecond, jLongValue);
        }
        onWarmupCompleted(setorientationdegrees, tometerspersecond, jLongValue);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = asBinder + 21;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallbackStub + 3;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ getTitleMarginEnd onWarmupCompleted(long j, toMetersPerSecond tometerspersecond, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 105;
        asBinder = i3 % 128;
        if (i3 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            j = setByteOrder.Companion.onTransact();
        }
        if ((i & 2) != 0) {
            tometerspersecond = null;
        }
        if ((i & 4) != 0) {
            int i4 = IAuthTabCallbackStub + 81;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            deviceQuirksExternalSyntheticLambda0 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f));
        }
        if ((i & 8) != 0) {
            int i6 = asBinder + 17;
            IAuthTabCallbackStub = i6 % 128;
            deviceQuirksExternalSyntheticLambda02 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(i6 % 2 != 0 ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f) : VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f));
        }
        return IAuthTabCallback(j, tometerspersecond, deviceQuirksExternalSyntheticLambda0, deviceQuirksExternalSyntheticLambda02);
    }

    public static final getTitleMarginEnd IAuthTabCallback(long j, @Nullable toMetersPerSecond tometerspersecond, @NotNull DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, @NotNull DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda02, "");
        addAdViewAdapter addadviewadapter = new addAdViewAdapter(tometerspersecond, j, deviceQuirksExternalSyntheticLambda0, deviceQuirksExternalSyntheticLambda02, (DefaultConstructorMarker) null);
        int i2 = asBinder + 71;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return addadviewadapter;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        float fFloatValue = ((Number) objArr[0]).floatValue();
        int i = 2 % 2;
        RippleAlpha rippleAlpha = new RippleAlpha(fFloatValue, fFloatValue, fFloatValue, fFloatValue);
        int i2 = asBinder + 63;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return rippleAlpha;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final removeTimestamp onWarmupCompleted(setOrientationDegrees setorientationdegrees, toMetersPerSecond tometerspersecond, long j) {
        int i = 2 % 2;
        int i2 = asBinder + 103;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {tometerspersecond.IAuthTabCallback(j, setorientationdegrees.onExtraCallbackWithResult(), setorientationdegrees)};
        if (i3 == 0) {
            return (removeTimestamp) onWarmupCompleted(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), objArr, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -1463166203, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 1463166204);
        }
        int i4 = 89 / 0;
        return (removeTimestamp) onWarmupCompleted(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), objArr, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -1463166203, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 1463166204);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        rotate rotateVar = (rotate) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 11;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        removeTimestamp removetimestampOnWarmupCompleted = getMappingAreaSize.onWarmupCompleted();
        setDescription.onWarmupCompleted(removetimestampOnWarmupCompleted, rotateVar);
        int i4 = asBinder + 61;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return removetimestampOnWarmupCompleted;
    }

    public static final addAppOpenAdapter onNavigationEvent(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 3;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            CameraConfigExternalSyntheticLambda0.asBinder();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1218067876, i, -1, "im.toss.tds.compose.foundation.tdsRippleConfiguration (TdsRipple.kt:303)");
            int i4 = IAuthTabCallbackStub + 103;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
        }
        addAppOpenAdapter addappopenadapterOnExtraCallbackWithResult = onExtraCallbackWithResult(addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i6 = IAuthTabCallbackStub + 43;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return addappopenadapterOnExtraCallbackWithResult;
    }

    public static final addAppOpenAdapter onExtraCallbackWithResult(boolean z) {
        int i = 2 % 2;
        if (!z) {
            return onExtraCallback;
        }
        int i2 = asBinder;
        int i3 = i2 + 5;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        addAppOpenAdapter addappopenadapter = onExtraCallbackWithResult;
        int i5 = i2 + 85;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return addappopenadapter;
    }

    public static final AppLovinAdClickListener onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 101;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        AppLovinAdClickListener appLovinAdClickListener = onWarmupCompleted;
        if (i3 != 0) {
            int i4 = 96 / 0;
        }
        return appLovinAdClickListener;
    }

    public static final addAppOpenAdapter IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 93;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        addAppOpenAdapter addappopenadapter = onExtraCallback;
        int i5 = i3 + 31;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return addappopenadapter;
    }

    public static final addAppOpenAdapter onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 69;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult;
        }
        throw null;
    }

    private static final addAppOpenAdapter asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 35;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        addAppOpenAdapter addappopenadapter = onNavigationEvent;
        int i5 = i2 + 19;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return addappopenadapter;
        }
        throw null;
    }

    public static final accessisMonitoringp<addAppOpenAdapter> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 67;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        accessisMonitoringp<addAppOpenAdapter> accessismonitoringp = IAuthTabCallback;
        int i5 = i3 + 89;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return accessismonitoringp;
    }

    private static final void onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        long jMediaMetadataCompat;
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1256037519);
        if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i != 0, i & 1))) {
            int i3 = IAuthTabCallbackStub + 61;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1256037519, i, -1, "im.toss.tds.compose.foundation.TdsRipplePreview (TdsRipple.kt:344)");
            }
            accessisMonitoringp<addAppOpenAdapter> accessismonitoringp = IAuthTabCallback;
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                int i5 = IAuthTabCallbackStub + 35;
                asBinder = i5 % 128;
                if (i5 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-166239590);
                    jMediaMetadataCompat = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 10).AudioAttributesImplBaseParcelizer();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-166239590);
                    jMediaMetadataCompat = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).AudioAttributesImplBaseParcelizer();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-166238566);
                jMediaMetadataCompat = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).MediaMetadataCompat();
            }
            long j = jMediaMetadataCompat;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            int i6 = asBinder + 69;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            setPostviewFormatSelector.onNavigationEvent(accessismonitoringp.onExtraCallback(new addAppOpenAdapter(j, null, 2, null)), createDrawableFuture.onWarmupCompleted.onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, accessgetCameraFactoryp.onNavigationEvent | 48);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsRippleKt$.ExternalSyntheticLambda1(i));
        }
    }

    static {
        int i = asInterface + 53;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static final RippleAlpha onWarmupCompleted(float f) {
        Object[] objArr = {Float.valueOf(f)};
        return (RippleAlpha) onWarmupCompleted(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), objArr, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 961808141, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -961808141);
    }

    public static final /* synthetic */ removeTimestamp onExtraCallbackWithResult(setOrientationDegrees setorientationdegrees, toMetersPerSecond tometerspersecond, long j) {
        Object[] objArr = {setorientationdegrees, tometerspersecond, Long.valueOf(j)};
        return (removeTimestamp) onWarmupCompleted(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), objArr, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 341822050, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -341822048);
    }

    private static final removeTimestamp onExtraCallbackWithResult(rotate rotateVar) {
        int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        return (removeTimestamp) onWarmupCompleted(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{rotateVar}, iOnWarmupCompleted2, -1463166203, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 1463166204);
    }
}
