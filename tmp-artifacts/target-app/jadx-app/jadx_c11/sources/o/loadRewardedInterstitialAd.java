package o;

import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tds.compose.R;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.MaxAppOpenAdapterListener;
import o.MaxRewardedInterstitialAdapterListener;
import o.QuirksExternalSyntheticBackport0;
import o.loadRewardedInterstitialAd;
import o.toPreviewOnlyRange;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class loadRewardedInterstitialAd {
    private static int IAuthTabCallbackStubProxy = 1;
    private static int access000 = 0;
    private static int access100 = 1;
    private static int getInterfaceDescriptor;
    public static final loadRewardedInterstitialAd onExtraCallback = new loadRewardedInterstitialAd();
    private static getBacktraceNote<MaxRewardedInterstitialAdapterListener, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onTransact = ForwardingCameraControl.onExtraCallbackWithResult(641636271, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.util.navigation.ComposableSingletons$TdsNavigationV1Kt$$ExternalSyntheticLambda8
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            Unit unit;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 21;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {(MaxRewardedInterstitialAdapterListener) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
            if (i3 == 0) {
                unit = (Unit) loadRewardedInterstitialAd.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1685177264, -1685177260, objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
                int i4 = 81 / 0;
            } else {
                unit = (Unit) loadRewardedInterstitialAd.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1685177264, -1685177260, objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
            }
            int i5 = IAuthTabCallback + 89;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            Object obj4 = null;
            obj4.hashCode();
            throw null;
        }
    });
    private static getBacktraceNote<MaxRewardedInterstitialAdapterListener, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback = ForwardingCameraControl.onExtraCallbackWithResult(-725323594, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.util.navigation.ComposableSingletons$TdsNavigationV1Kt$$ExternalSyntheticLambda9
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 37;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener = (MaxRewardedInterstitialAdapterListener) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            int iIntValue = ((Integer) obj3).intValue();
            if (i3 == 0) {
                loadRewardedInterstitialAd.onNavigationEvent(maxRewardedInterstitialAdapterListener, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                throw null;
            }
            Unit unitOnNavigationEvent = loadRewardedInterstitialAd.onNavigationEvent(maxRewardedInterstitialAdapterListener, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            int i4 = IAuthTabCallback + 89;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return unitOnNavigationEvent;
        }
    });
    private static getBacktraceNote<MaxAppOpenAdapterListener, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackDefault = ForwardingCameraControl.onExtraCallbackWithResult(1180294809, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.util.navigation.ComposableSingletons$TdsNavigationV1Kt$$ExternalSyntheticLambda10
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 109;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallbackWithResult = loadRewardedInterstitialAd.onExtraCallbackWithResult((MaxAppOpenAdapterListener) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = onExtraCallback + 57;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unitOnExtraCallbackWithResult;
        }
    });
    private static getBacktraceNote<MaxRewardedInterstitialAdapterListener, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent = ForwardingCameraControl.onExtraCallbackWithResult(-1736872800, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.util.navigation.ComposableSingletons$TdsNavigationV1Kt$$ExternalSyntheticLambda11
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 59;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnWarmupCompleted = loadRewardedInterstitialAd.onWarmupCompleted((MaxRewardedInterstitialAdapterListener) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = onWarmupCompleted + 87;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return unitOnWarmupCompleted;
        }
    });
    private static getBacktraceNote<MaxAppOpenAdapterListener, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> asBinder = ForwardingCameraControl.onExtraCallbackWithResult(820212674, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.util.navigation.ComposableSingletons$TdsNavigationV1Kt$$ExternalSyntheticLambda12
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallback + 103;
            onNavigationEvent = i2 % 128;
            Object obj4 = null;
            MaxAppOpenAdapterListener maxAppOpenAdapterListener = (MaxAppOpenAdapterListener) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            if (i2 % 2 == 0) {
                loadRewardedInterstitialAd.onExtraCallback(maxAppOpenAdapterListener, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                obj4.hashCode();
                throw null;
            }
            Unit unitOnExtraCallback = loadRewardedInterstitialAd.onExtraCallback(maxAppOpenAdapterListener, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
            int i3 = onNavigationEvent + 11;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return unitOnExtraCallback;
            }
            throw null;
        }
    });
    private static getBacktraceNote<MaxRewardedInterstitialAdapterListener, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> asInterface = ForwardingCameraControl.onExtraCallbackWithResult(2035784713, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.util.navigation.ComposableSingletons$TdsNavigationV1Kt$$ExternalSyntheticLambda13
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
            Unit unitIAuthTabCallback;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 9;
            IAuthTabCallback = i2 % 128;
            MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener = (MaxRewardedInterstitialAdapterListener) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            if (i2 % 2 == 0) {
                unitIAuthTabCallback = loadRewardedInterstitialAd.IAuthTabCallback(maxRewardedInterstitialAdapterListener, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                int i3 = 98 / 0;
            } else {
                unitIAuthTabCallback = loadRewardedInterstitialAd.IAuthTabCallback(maxRewardedInterstitialAdapterListener, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
            }
            int i4 = onNavigationEvent + 25;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return unitIAuthTabCallback;
            }
            throw null;
        }
    });
    private static getBacktraceNote<MaxAppOpenAdapterListener, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackStub = ForwardingCameraControl.onExtraCallbackWithResult(1063749537, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.util.navigation.ComposableSingletons$TdsNavigationV1Kt$$ExternalSyntheticLambda14
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 87;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallback = loadRewardedInterstitialAd.IAuthTabCallback((MaxAppOpenAdapterListener) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            if (i3 == 0) {
                int i4 = 13 / 0;
            }
            return unitIAuthTabCallback;
        }
    });
    private static getBacktraceNote<MaxRewardedInterstitialAdapterListener, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted = ForwardingCameraControl.onExtraCallbackWithResult(-2015645720, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.util.navigation.ComposableSingletons$TdsNavigationV1Kt$$ExternalSyntheticLambda15
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 37;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallback = loadRewardedInterstitialAd.onExtraCallback((MaxRewardedInterstitialAdapterListener) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = onExtraCallback + 31;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unitOnExtraCallback;
        }
    });
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(-1631842035, false, new Function2() { // from class: im.toss.tds.compose.component.util.navigation.ComposableSingletons$TdsNavigationV1Kt$$ExternalSyntheticLambda16
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 69;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnNavigationEvent = loadRewardedInterstitialAd.onNavigationEvent((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            int i4 = onNavigationEvent + 85;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return unitOnNavigationEvent;
            }
            throw null;
        }
    });

    public static /* synthetic */ Unit IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 27;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnActivityResized = onActivityResized();
        int i4 = IAuthTabCallbackStubProxy + 61;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnActivityResized;
    }

    public static /* synthetic */ Unit IAuthTabCallback(MaxAppOpenAdapterListener maxAppOpenAdapterListener, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = access000 + 121;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            return onNavigationEvent(maxAppOpenAdapterListener, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onNavigationEvent(maxAppOpenAdapterListener, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 95;
        access000 = i3 % 128;
        if (i3 % 2 == 0) {
            return asInterface(maxRewardedInterstitialAdapterListener, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        asInterface(maxRewardedInterstitialAdapterListener, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = access000 + 13;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            onMinimized();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnMinimized = onMinimized();
        int i3 = IAuthTabCallbackStubProxy + 39;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 11 / 0;
        }
        return unitOnMinimized;
    }

    public static /* synthetic */ Unit IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = access000 + 51;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1445977414, 1445977421, new Object[0], NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
        int i4 = IAuthTabCallbackStubProxy + 35;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 5;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitExtraCallbackWithResult = extraCallbackWithResult();
        int i4 = IAuthTabCallbackStubProxy + 57;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unitExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 51;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            return writeTypedObject();
        }
        writeTypedObject();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(MaxAppOpenAdapterListener maxAppOpenAdapterListener, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = access000 + 39;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnTransact = onTransact(maxAppOpenAdapterListener, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 78 / 0;
        }
        int i6 = IAuthTabCallbackStubProxy + 93;
        access000 = i6 % 128;
        if (i6 % 2 == 0) {
            return unitOnTransact;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = access000 + 17;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnTransact = onTransact(maxRewardedInterstitialAdapterListener, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = access000 + 21;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 86 / 0;
        }
        return unitOnTransact;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        long jIEngagementSignalsCallbackStub;
        int i7 = ~i3;
        int i8 = ~i;
        int i9 = (~(i7 | i8)) | (~(i7 | i4)) | (~(i8 | i4));
        int i10 = ~(i | i7);
        int i11 = i4 | i10 | (~(i8 | i3));
        int i12 = i4 + i3 + i2 + (1997535707 * i6) + (1930545336 * i5);
        int i13 = i12 * i12;
        int i14 = ((-1352905585) * i4) + 1468203008 + ((-417352845) * i3) + (i9 * 1679707278) + (1679707278 * i10) + ((-1679707278) * i11) + (1262354432 * i2) + ((-1408630784) * i6) + ((-2070937600) * i5) + (392888320 * i13);
        int i15 = ((-2054695253) * i4) + 138751921 + (i3 * (-2054693473)) + (i9 * (-890)) + (i10 * (-890)) + (i11 * 890) + ((-2054694363) * i2) + (1502648999 * i6) + (931574424 * i5) + (i13 * (-2139684864));
        boolean z = true;
        switch (i14 + (i15 * i15 * (-174260224))) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener = (MaxRewardedInterstitialAdapterListener) objArr[0];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int i16 = 2 % 2;
                int i17 = IAuthTabCallbackStubProxy + 83;
                access000 = i17 % 128;
                int i18 = i17 % 2;
                Unit unit = (Unit) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1507891790, 1507891793, new Object[]{maxRewardedInterstitialAdapterListener, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
                int i19 = IAuthTabCallbackStubProxy + 81;
                access000 = i19 % 128;
                int i20 = i19 % 2;
                return unit;
            case 5:
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[0];
                int iIntValue2 = ((Number) objArr[1]).intValue();
                int i21 = 2 % 2;
                if ((iIntValue2 & 3) != 2) {
                    int i22 = IAuthTabCallbackStubProxy + 99;
                    access000 = i22 % 128;
                    int i23 = i22 % 2;
                } else {
                    z = false;
                }
                if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(z, iIntValue2 & 1)) {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1631842035, iIntValue2, -1, "im.toss.tds.compose.component.util.navigation.ComposableSingletons$TdsNavigationV1Kt.lambda$-1631842035.<anonymous> (TdsNavigationV1.kt:204)");
                    }
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                    component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult2, 0);
                    int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult2.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, onextracallback);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResult2.access100() == null) {
                        getAwbState.onExtraCallback();
                        int i24 = IAuthTabCallbackStubProxy + 115;
                        access000 = i24 % 128;
                        int i25 = i24 % 2;
                    }
                    cameraCaptureResultEmptyCameraCaptureResult2.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResult2.onActivityLayout()) {
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                    LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                    CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                    if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized = new Function0() { // from class: im.toss.tds.compose.component.util.navigation.ComposableSingletons$TdsNavigationV1Kt$$ExternalSyntheticLambda3
                            private static int IAuthTabCallback = 0;
                            private static int onNavigationEvent = 1;

                            public final Object invoke() {
                                int i26 = 2 % 2;
                                int i27 = onNavigationEvent + 89;
                                IAuthTabCallback = i27 % 128;
                                int i28 = i27 % 2;
                                Unit unitIAuthTabCallbackStub = loadRewardedInterstitialAd.IAuthTabCallbackStub();
                                int i29 = onNavigationEvent + 95;
                                IAuthTabCallback = i29 % 128;
                                if (i29 % 2 != 0) {
                                    int i30 = 2 / 0;
                                }
                                return unitIAuthTabCallbackStub;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized);
                    }
                    MaxAdViewAdapterListener.onWarmupCompleted((Function0) objOnMinimized, null, null, 0L, 0L, null, IAuthTabCallbackDefault, onNavigationEvent, cameraCaptureResultEmptyCameraCaptureResult2, 14155782, 62);
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                    if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized2 = new Function0() { // from class: im.toss.tds.compose.component.util.navigation.ComposableSingletons$TdsNavigationV1Kt$$ExternalSyntheticLambda4
                            private static int onNavigationEvent = 1;
                            private static int onWarmupCompleted;

                            public final Object invoke() {
                                int i26 = 2 % 2;
                                int i27 = onWarmupCompleted + 85;
                                onNavigationEvent = i27 % 128;
                                if (i27 % 2 != 0) {
                                    return loadRewardedInterstitialAd.onExtraCallbackWithResult();
                                }
                                loadRewardedInterstitialAd.onExtraCallbackWithResult();
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized2);
                    }
                    MaxAdViewAdapterListener.onWarmupCompleted((Function0) objOnMinimized2, null, null, 0L, 0L, null, asBinder, asInterface, cameraCaptureResultEmptyCameraCaptureResult2, 14155782, 62);
                    y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                    if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult2, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                        int i26 = IAuthTabCallbackStubProxy + 93;
                        access000 = i26 % 128;
                        if (i26 % 2 != 0) {
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-798737475);
                            jIEngagementSignalsCallbackStub = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 2)}, -1572738860, OverseasRrnInputTextField.IAuthTabCallback(), 1572738861)).longValue();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-798737475);
                            jIEngagementSignalsCallbackStub = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6)}, -1572738860, OverseasRrnInputTextField.IAuthTabCallback(), 1572738861)).longValue();
                        }
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-798736547);
                        jIEngagementSignalsCallbackStub = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).IEngagementSignalsCallbackStub();
                    }
                    long j = jIEngagementSignalsCallbackStub;
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    int i27 = access000 + 67;
                    IAuthTabCallbackStubProxy = i27 % 128;
                    int i28 = i27 % 2;
                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                    if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized3 = new Function0() { // from class: im.toss.tds.compose.component.util.navigation.ComposableSingletons$TdsNavigationV1Kt$$ExternalSyntheticLambda5
                            private static int IAuthTabCallback = 1;
                            private static int onNavigationEvent;

                            public final Object invoke() {
                                int i29 = 2 % 2;
                                int i30 = IAuthTabCallback + 125;
                                onNavigationEvent = i30 % 128;
                                int i31 = i30 % 2;
                                Unit unitIAuthTabCallback_Parcel = loadRewardedInterstitialAd.IAuthTabCallback_Parcel();
                                int i32 = IAuthTabCallback + 117;
                                onNavigationEvent = i32 % 128;
                                if (i32 % 2 == 0) {
                                    return unitIAuthTabCallback_Parcel;
                                }
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized3);
                    }
                    MaxAdViewAdapterListener.onWarmupCompleted((Function0) objOnMinimized3, null, null, j, 0L, null, IAuthTabCallbackStub, onWarmupCompleted, cameraCaptureResultEmptyCameraCaptureResult2, 14155782, 54);
                    cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                }
                return Unit.INSTANCE;
            case 6:
                int i29 = 2 % 2;
                int i30 = IAuthTabCallbackStubProxy + 31;
                access000 = i30 % 128;
                int i31 = i30 % 2;
                Unit typedObject = readTypedObject();
                int i32 = access000 + 57;
                IAuthTabCallbackStubProxy = i32 % 128;
                int i33 = i32 % 2;
                return typedObject;
            case 7:
                return onWarmupCompleted(objArr);
            default:
                return IAuthTabCallback(objArr);
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i = 2 % 2;
        int i2 = access000 + 31;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess000 = access000();
        int i4 = access000 + 95;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unitAccess000;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = access000 + 49;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1915046917, 1915046917, new Object[0], NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
        int i4 = IAuthTabCallbackStubProxy + 27;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(MaxAppOpenAdapterListener maxAppOpenAdapterListener, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 81;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(maxAppOpenAdapterListener, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallbackStubProxy + 117;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 26 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access000 + 39;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return extraCallback();
        }
        extraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 15;
        access000 = i3 % 128;
        if (i3 % 2 == 0) {
            return (Unit) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1955060456, -1955060451, new Object[]{cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = access000 + 65;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(maxRewardedInterstitialAdapterListener, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallbackStubProxy + 63;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 93 / 0;
        }
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onTransact() {
        int i = 2 % 2;
        int i2 = access000 + 15;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsCallback = ICustomTabsCallback();
        if (i3 == 0) {
            int i4 = 91 / 0;
        }
        return unitICustomTabsCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 125;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            return onPostMessage();
        }
        onPostMessage();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = access000 + 117;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(maxRewardedInterstitialAdapterListener, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 7 / 0;
        }
        return unitIAuthTabCallbackDefault;
    }

    public final getBacktraceNote<MaxRewardedInterstitialAdapterListener, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = access000 + 45;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        getBacktraceNote<MaxRewardedInterstitialAdapterListener, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = IAuthTabCallback;
        if (i3 == 0) {
            int i4 = 16 / 0;
        }
        return getbacktracenote;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> access100() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 39;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = onExtraCallbackWithResult;
        int i5 = i2 + 71;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return function2;
    }

    public final getBacktraceNote<MaxRewardedInterstitialAdapterListener, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 51;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getBacktraceNote<MaxRewardedInterstitialAdapterListener, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onTransact;
        int i4 = i2 + 57;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return getbacktracenote;
    }

    static {
        int i = getInterfaceDescriptor + 75;
        access100 = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        boolean z = false;
        MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener = (MaxRewardedInterstitialAdapterListener) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = access000 + 45;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(maxRewardedInterstitialAdapterListener, "");
        if ((iIntValue & 17) != 16) {
            int i4 = access000 + 47;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            int i6 = access000 + 103;
            IAuthTabCallbackStubProxy = i6 % 128;
            if (i6 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(641636271, iIntValue, -1, "im.toss.tds.compose.component.util.navigation.ComposableSingletons$TdsNavigationV1Kt.lambda$641636271.<anonymous> (TdsNavigationV1.kt:76)");
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallbackStub(MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 105;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(maxRewardedInterstitialAdapterListener, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            int i5 = IAuthTabCallbackStubProxy + 125;
            access000 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 7 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i7 = IAuthTabCallbackStubProxy + 83;
                    access000 = i7 % 128;
                    int i8 = i7 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-725323594, i, -1, "im.toss.tds.compose.component.util.navigation.ComposableSingletons$TdsNavigationV1Kt.lambda$-725323594.<anonymous> (TdsNavigationV1.kt:111)");
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i9 = IAuthTabCallbackStubProxy + 65;
                    access000 = i9 % 128;
                    int i10 = i9 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    if (i10 != 0) {
                        throw null;
                    }
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i11 = IAuthTabCallbackStubProxy + 83;
        access000 = i11 % 128;
        int i12 = i11 % 2;
        return unit;
    }

    private static final Unit onMinimized() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 111;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            int i4 = 65 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallbackDefault(MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(maxRewardedInterstitialAdapterListener, "");
        if ((i & 6) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(maxRewardedInterstitialAdapterListener) ? 4 : 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = IAuthTabCallbackStubProxy + 125;
                access000 = i3 % 128;
                int i4 = i3 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1736872800, i, -1, "im.toss.tds.compose.component.util.navigation.ComposableSingletons$TdsNavigationV1Kt.lambda$-1736872800.<anonymous> (TdsNavigationV1.kt:208)");
            }
            maxRewardedInterstitialAdapterListener.onExtraCallback("타이틀", null, 0L, cameraCaptureResultEmptyCameraCaptureResult, ((i << 9) & 7168) | 6, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = IAuthTabCallbackStubProxy + 45;
                access000 = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallbackStubProxy + 11;
        access000 = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 0 / 0;
        }
        return unit;
    }

    private static final Unit writeTypedObject() {
        Unit unit;
        int i = 2 % 2;
        int i2 = access000 + 125;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            unit = Unit.INSTANCE;
            int i3 = 33 / 0;
        } else {
            unit = Unit.INSTANCE;
        }
        int i4 = access000 + 25;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit readTypedObject() {
        int i = 2 % 2;
        int i2 = access000 + 73;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(MaxAppOpenAdapterListener maxAppOpenAdapterListener, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        long jMediaMetadataCompat;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(maxAppOpenAdapterListener, "");
        if ((i & 6) == 0) {
            int i5 = IAuthTabCallbackStubProxy + 101;
            access000 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 16 / 0;
                i3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(maxAppOpenAdapterListener) ? 4 : 2;
            } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(maxAppOpenAdapterListener)) {
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = access000 + 107;
                IAuthTabCallbackStubProxy = i7 % 128;
                if (i7 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1180294809, i2, -1, "im.toss.tds.compose.component.util.navigation.ComposableSingletons$TdsNavigationV1Kt.lambda$1180294809.<anonymous> (TdsNavigationV1.kt:211)");
                    int i8 = 63 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1180294809, i2, -1, "im.toss.tds.compose.component.util.navigation.ComposableSingletons$TdsNavigationV1Kt.lambda$1180294809.<anonymous> (TdsNavigationV1.kt:211)");
                }
            }
            int i9 = R.drawable.icn_star_mono;
            deprecated_followRedirects deprecated_followredirectsOnWarmupCompleted = deprecated_followSslRedirects.onWarmupCompleted(i9);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = new Function0() { // from class: im.toss.tds.compose.component.util.navigation.ComposableSingletons$TdsNavigationV1Kt$$ExternalSyntheticLambda6
                    private static int onExtraCallbackWithResult = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke() {
                        int i10 = 2 % 2;
                        int i11 = onExtraCallbackWithResult + 85;
                        onNavigationEvent = i11 % 128;
                        if (i11 % 2 != 0) {
                            return (Unit) loadRewardedInterstitialAd.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1910372744, -1910372743, new Object[0], NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
                        }
                        int i12 = 75 / 0;
                        return (Unit) loadRewardedInterstitialAd.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1910372744, -1910372743, new Object[0], NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            int i10 = ((i2 << 21) & 29360128) | 432;
            maxAppOpenAdapterListener.onExtraCallbackWithResult(deprecated_followredirectsOnWarmupCompleted, (Function0<Unit>) objOnMinimized, "즐겨찾기", (QuirksExternalSyntheticBackport0) null, 0L, false, (String) null, cameraCaptureResultEmptyCameraCaptureResult, i10, 120);
            deprecated_followRedirects deprecated_followredirectsOnWarmupCompleted2 = deprecated_followSslRedirects.onWarmupCompleted(i9);
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                int i11 = access000 + 45;
                IAuthTabCallbackStubProxy = i11 % 128;
                if (i11 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(391960130);
                    jMediaMetadataCompat = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 86).AudioAttributesImplBaseParcelizer();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(391960130);
                    jMediaMetadataCompat = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).AudioAttributesImplBaseParcelizer();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(391961154);
                jMediaMetadataCompat = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).MediaMetadataCompat();
            }
            long j = jMediaMetadataCompat;
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            Object obj = objOnMinimized2;
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                Object obj2 = new Function0() { // from class: im.toss.tds.compose.component.util.navigation.ComposableSingletons$TdsNavigationV1Kt$$ExternalSyntheticLambda7
                    private static int IAuthTabCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke() {
                        int i12 = 2 % 2;
                        int i13 = IAuthTabCallback + 105;
                        onWarmupCompleted = i13 % 128;
                        int i14 = i13 % 2;
                        Object obj3 = null;
                        Object[] objArr = new Object[0];
                        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                        if (i14 == 0) {
                            throw null;
                        }
                        Unit unit = (Unit) loadRewardedInterstitialAd.onExtraCallbackWithResult(iIAuthTabCallback, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1267934191, -1267934185, objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
                        int i15 = IAuthTabCallback + 43;
                        onWarmupCompleted = i15 % 128;
                        if (i15 % 2 != 0) {
                            return unit;
                        }
                        obj3.hashCode();
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(obj2);
                obj = obj2;
            }
            maxAppOpenAdapterListener.onExtraCallbackWithResult(deprecated_followredirectsOnWarmupCompleted2, (Function0<Unit>) obj, "즐겨찾기", (QuirksExternalSyntheticBackport0) null, j, false, (String) null, cameraCaptureResultEmptyCameraCaptureResult, i10, 104);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = access000 + 23;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 53;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit asInterface(MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStubProxy + 47;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(maxRewardedInterstitialAdapterListener, "");
        Object obj = null;
        if ((i & 6) == 0) {
            int i6 = IAuthTabCallbackStubProxy + 47;
            access000 = i6 % 128;
            if (i6 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(maxRewardedInterstitialAdapterListener);
                obj.hashCode();
                throw null;
            }
            i2 = (!(cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(maxRewardedInterstitialAdapterListener) ^ true) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = access000 + 95;
                IAuthTabCallbackStubProxy = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2035784713, i2, -1, "im.toss.tds.compose.component.util.navigation.ComposableSingletons$TdsNavigationV1Kt.lambda$2035784713.<anonymous> (TdsNavigationV1.kt:229)");
            }
            maxRewardedInterstitialAdapterListener.onExtraCallback("타이틀이 무진장 길어질 때에에에에에에에에에에", null, 0L, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 9) & 7168) | 6, 6);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i9 = access000 + 33;
                IAuthTabCallbackStubProxy = i9 % 128;
                if (i9 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 95;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 67;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onPostMessage() {
        Unit unit;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 27;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            unit = Unit.INSTANCE;
            int i3 = 65 / 0;
        } else {
            unit = Unit.INSTANCE;
        }
        int i4 = access000 + 41;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onActivityResized() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 89;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onTransact(MaxAppOpenAdapterListener maxAppOpenAdapterListener, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        long jMediaMetadataCompat;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(maxAppOpenAdapterListener, "");
        if ((i & 6) == 0) {
            int i4 = IAuthTabCallbackStubProxy + 125;
            access000 = i4 % 128;
            if (i4 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(maxAppOpenAdapterListener);
                throw null;
            }
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(maxAppOpenAdapterListener) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i5 = IAuthTabCallbackStubProxy + 15;
            access000 = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = IAuthTabCallbackStubProxy + 57;
                access000 = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(820212674, i2, -1, "im.toss.tds.compose.component.util.navigation.ComposableSingletons$TdsNavigationV1Kt.lambda$820212674.<anonymous> (TdsNavigationV1.kt:232)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(820212674, i2, -1, "im.toss.tds.compose.component.util.navigation.ComposableSingletons$TdsNavigationV1Kt.lambda$820212674.<anonymous> (TdsNavigationV1.kt:232)");
            }
            int i8 = R.drawable.icn_star_mono;
            deprecated_followRedirects deprecated_followredirectsOnWarmupCompleted = deprecated_followSslRedirects.onWarmupCompleted(i8);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            Object obj = objOnMinimized;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                Object obj2 = new Function0() { // from class: im.toss.tds.compose.component.util.navigation.ComposableSingletons$TdsNavigationV1Kt$$ExternalSyntheticLambda17
                    private static int IAuthTabCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke() {
                        int i9 = 2 % 2;
                        int i10 = onWarmupCompleted + 55;
                        IAuthTabCallback = i10 % 128;
                        int i11 = i10 % 2;
                        Unit unitAsBinder = loadRewardedInterstitialAd.asBinder();
                        int i12 = IAuthTabCallback + 33;
                        onWarmupCompleted = i12 % 128;
                        if (i12 % 2 != 0) {
                            int i13 = 55 / 0;
                        }
                        return unitAsBinder;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(obj2);
                obj = obj2;
            }
            int i9 = ((i2 << 21) & 29360128) | 432;
            int i10 = i2;
            maxAppOpenAdapterListener.onExtraCallbackWithResult(deprecated_followredirectsOnWarmupCompleted, (Function0<Unit>) obj, "즐겨찾기", (QuirksExternalSyntheticBackport0) null, 0L, false, (String) null, cameraCaptureResultEmptyCameraCaptureResult, i9, 120);
            deprecated_followRedirects deprecated_followredirectsOnWarmupCompleted2 = deprecated_followSslRedirects.onWarmupCompleted(i8);
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                int i11 = access000 + 73;
                IAuthTabCallbackStubProxy = i11 % 128;
                int i12 = i11 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-2049587925);
                jMediaMetadataCompat = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).AudioAttributesImplBaseParcelizer();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-2049586901);
                jMediaMetadataCompat = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).MediaMetadataCompat();
            }
            long j = jMediaMetadataCompat;
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            int i13 = IAuthTabCallbackStubProxy + 45;
            access000 = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 4 % 2;
            }
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            Object obj3 = objOnMinimized2;
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                Object obj4 = new Function0() { // from class: im.toss.tds.compose.component.util.navigation.ComposableSingletons$TdsNavigationV1Kt$$ExternalSyntheticLambda18
                    private static int onExtraCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke() {
                        Unit unitOnWarmupCompleted;
                        int i15 = 2 % 2;
                        int i16 = onExtraCallback + 1;
                        onWarmupCompleted = i16 % 128;
                        if (i16 % 2 == 0) {
                            unitOnWarmupCompleted = loadRewardedInterstitialAd.onWarmupCompleted();
                            int i17 = 46 / 0;
                        } else {
                            unitOnWarmupCompleted = loadRewardedInterstitialAd.onWarmupCompleted();
                        }
                        int i18 = onWarmupCompleted + 47;
                        onExtraCallback = i18 % 128;
                        int i19 = i18 % 2;
                        return unitOnWarmupCompleted;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(obj4);
                obj3 = obj4;
            }
            maxAppOpenAdapterListener.onExtraCallbackWithResult(deprecated_followredirectsOnWarmupCompleted2, (Function0<Unit>) obj3, "즐겨찾기", (QuirksExternalSyntheticBackport0) null, j, false, (String) null, cameraCaptureResultEmptyCameraCaptureResult, i9, 104);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized3 = new Function0() { // from class: im.toss.tds.compose.component.util.navigation.ComposableSingletons$TdsNavigationV1Kt$$ExternalSyntheticLambda19
                    private static int onExtraCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke() {
                        int i15 = 2 % 2;
                        int i16 = onWarmupCompleted + 13;
                        onExtraCallback = i16 % 128;
                        int i17 = i16 % 2;
                        Unit unitIAuthTabCallback = loadRewardedInterstitialAd.IAuthTabCallback();
                        int i18 = onWarmupCompleted + 69;
                        onExtraCallback = i18 % 128;
                        if (i18 % 2 == 0) {
                            int i19 = 82 / 0;
                        }
                        return unitIAuthTabCallback;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
            }
            MaxAppOpenAdapterListener.IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 207608401, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -207608398, new Object[]{maxAppOpenAdapterListener, "설정", (Function0) objOnMinimized3, null, false, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i10 << 15) & 458752) | 54), 28}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Unit unit;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 119;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            unit = Unit.INSTANCE;
            int i3 = 23 / 0;
        } else {
            unit = Unit.INSTANCE;
        }
        int i4 = IAuthTabCallbackStubProxy + 29;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onTransact(MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(maxRewardedInterstitialAdapterListener, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(maxRewardedInterstitialAdapterListener)) {
                int i4 = access000 + 49;
                IAuthTabCallbackStubProxy = i4 % 128;
                i2 = i4 % 2 == 0 ? 5 : 4;
            } else {
                i2 = 2;
            }
            i |= i2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = IAuthTabCallbackStubProxy + 15;
                access000 = i5 % 128;
                if (i5 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2015645720, i, -1, "im.toss.tds.compose.component.util.navigation.ComposableSingletons$TdsNavigationV1Kt.lambda$-2015645720.<anonymous> (TdsNavigationV1.kt:252)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2015645720, i, -1, "im.toss.tds.compose.component.util.navigation.ComposableSingletons$TdsNavigationV1Kt.lambda$-2015645720.<anonymous> (TdsNavigationV1.kt:252)");
            }
            maxRewardedInterstitialAdapterListener.onExtraCallback("타이틀이 무진장 길어질 때에에에에에에에에에에", null, 0L, cameraCaptureResultEmptyCameraCaptureResult, ((i << 9) & 7168) | 6, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit access000() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 1;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 57;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit extraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 63;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 39;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 59;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(MaxAppOpenAdapterListener maxAppOpenAdapterListener, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        boolean z;
        long jAudioAttributesImplBaseParcelizer;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStubProxy + 57;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(maxAppOpenAdapterListener, "");
            if ((i & 80) == 0) {
                i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(maxAppOpenAdapterListener) ? 4 : 2);
            } else {
                i2 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(maxAppOpenAdapterListener, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i2 & 19) != 18) {
            int i5 = IAuthTabCallbackStubProxy + 37;
            access000 = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = IAuthTabCallbackStubProxy + 63;
                access000 = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1063749537, i2, -1, "im.toss.tds.compose.component.util.navigation.ComposableSingletons$TdsNavigationV1Kt.lambda$1063749537.<anonymous> (TdsNavigationV1.kt:255)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1063749537, i2, -1, "im.toss.tds.compose.component.util.navigation.ComposableSingletons$TdsNavigationV1Kt.lambda$1063749537.<anonymous> (TdsNavigationV1.kt:255)");
            }
            int i8 = R.drawable.icn_star_mono;
            deprecated_followRedirects deprecated_followredirectsOnWarmupCompleted = deprecated_followSslRedirects.onWarmupCompleted(i8);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            Object obj2 = objOnMinimized;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                Object obj3 = new Function0() { // from class: im.toss.tds.compose.component.util.navigation.ComposableSingletons$TdsNavigationV1Kt$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke() {
                        int i9 = 2 % 2;
                        int i10 = onNavigationEvent + 9;
                        IAuthTabCallback = i10 % 128;
                        int i11 = i10 % 2;
                        Unit unit = (Unit) loadRewardedInterstitialAd.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 2027876263, -2027876261, new Object[0], NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
                        int i12 = IAuthTabCallback + 53;
                        onNavigationEvent = i12 % 128;
                        int i13 = i12 % 2;
                        return unit;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(obj3);
                obj2 = obj3;
            }
            int i9 = ((i2 << 21) & 29360128) | 432;
            maxAppOpenAdapterListener.onExtraCallbackWithResult(deprecated_followredirectsOnWarmupCompleted, (Function0<Unit>) obj2, "즐겨찾기", (QuirksExternalSyntheticBackport0) null, 0L, false, (String) null, cameraCaptureResultEmptyCameraCaptureResult, i9, 120);
            deprecated_followRedirects deprecated_followredirectsOnWarmupCompleted2 = deprecated_followSslRedirects.onWarmupCompleted(i8);
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            if (!((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(61104458);
                jAudioAttributesImplBaseParcelizer = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).MediaMetadataCompat();
                int i10 = access000 + 83;
                IAuthTabCallbackStubProxy = i10 % 128;
                int i11 = i10 % 2;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(61103434);
                jAudioAttributesImplBaseParcelizer = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).AudioAttributesImplBaseParcelizer();
            }
            long j = jAudioAttributesImplBaseParcelizer;
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            int i12 = access000 + 79;
            IAuthTabCallbackStubProxy = i12 % 128;
            int i13 = i12 % 2;
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            Object obj4 = objOnMinimized2;
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                Object obj5 = new Function0() { // from class: im.toss.tds.compose.component.util.navigation.ComposableSingletons$TdsNavigationV1Kt$$ExternalSyntheticLambda1
                    private static int onExtraCallbackWithResult = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke() {
                        int i14 = 2 % 2;
                        int i15 = onWarmupCompleted + 121;
                        onExtraCallbackWithResult = i15 % 128;
                        if (i15 % 2 != 0) {
                            return loadRewardedInterstitialAd.onNavigationEvent();
                        }
                        loadRewardedInterstitialAd.onNavigationEvent();
                        Object obj6 = null;
                        obj6.hashCode();
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(obj5);
                obj4 = obj5;
            }
            maxAppOpenAdapterListener.onExtraCallbackWithResult(deprecated_followredirectsOnWarmupCompleted2, (Function0<Unit>) obj4, "즐겨찾기", (QuirksExternalSyntheticBackport0) null, j, false, (String) null, cameraCaptureResultEmptyCameraCaptureResult, i9, 104);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized3 = new Function0() { // from class: im.toss.tds.compose.component.util.navigation.ComposableSingletons$TdsNavigationV1Kt$$ExternalSyntheticLambda2
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke() {
                        int i14 = 2 % 2;
                        int i15 = onWarmupCompleted + 31;
                        onNavigationEvent = i15 % 128;
                        int i16 = i15 % 2;
                        Unit unitOnTransact = loadRewardedInterstitialAd.onTransact();
                        int i17 = onNavigationEvent + 85;
                        onWarmupCompleted = i17 % 128;
                        int i18 = i17 % 2;
                        return unitOnTransact;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
            }
            MaxAppOpenAdapterListener.IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 207608401, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -207608398, new Object[]{maxAppOpenAdapterListener, "설정", (Function0) objOnMinimized3, null, false, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 15) & 458752) | 54), 28}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {maxRewardedInterstitialAdapterListener, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1685177264, -1685177260, objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onExtraCallback() {
        return (Unit) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 2027876263, -2027876261, new Object[0], NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }

    public static /* synthetic */ Unit asInterface() {
        return (Unit) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1267934191, -1267934185, new Object[0], NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault() {
        return (Unit) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1910372744, -1910372743, new Object[0], NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }

    private static final Unit asBinder(MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {maxRewardedInterstitialAdapterListener, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1507891790, 1507891793, objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }

    private static final Unit IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1955060456, -1955060451, objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }

    private static final Unit onActivityLayout() {
        return (Unit) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1915046917, 1915046917, new Object[0], NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }

    private static final Unit onMessageChannelReady() {
        return (Unit) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1445977414, 1445977421, new Object[0], NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }
}
