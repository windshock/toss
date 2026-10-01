package o;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import im.toss.TossApplication;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tds.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinNativeAdImplExternalSyntheticLambda0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.HighSpeedResolverExternalSyntheticLambda2;
import o.QuirksExternalSyntheticBackport0;
import o.getPrivacyIconUri;
import o.handleNativeAdClick;
import o.setPrivacyIconUri;
import o.toPreviewOnlyRange;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getPrivacyIconUri {
    private static int extraCallback = 1;
    private static int extraCallbackWithResult = 0;
    private static int readTypedObject = 0;
    private static int writeTypedObject = 1;
    public static final getPrivacyIconUri IAuthTabCallback = new getPrivacyIconUri();
    private static getBacktraceNote<AppLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackStub = ForwardingCameraControl.onExtraCallbackWithResult(1363660914, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.atom.asset.ComposableSingletons$TdsAssetV2Kt$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 123;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0 = (AppLovinNativeAdImplExternalSyntheticLambda0) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            int iIntValue = ((Integer) obj3).intValue();
            if (i3 == 0) {
                return getPrivacyIconUri.onTransact(appLovinNativeAdImplExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            }
            getPrivacyIconUri.onTransact(appLovinNativeAdImplExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            Object obj4 = null;
            obj4.hashCode();
            throw null;
        }
    });
    private static getBacktraceNote<AppLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsCallback = ForwardingCameraControl.onExtraCallbackWithResult(975618819, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.atom.asset.ComposableSingletons$TdsAssetV2Kt$$ExternalSyntheticLambda6
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 75;
            onExtraCallback = i2 % 128;
            AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0 = (AppLovinNativeAdImplExternalSyntheticLambda0) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            if (i2 % 2 != 0) {
                return (Unit) getPrivacyIconUri.onWarmupCompleted(886725914, new Object[]{appLovinNativeAdImplExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((Integer) obj3).intValue())}, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), -886725911, TossApplication.onSessionEnded.onExtraCallback());
            }
            throw null;
        }
    });
    private static getBacktraceNote<AppLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> asBinder = ForwardingCameraControl.onExtraCallbackWithResult(1239315844, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.atom.asset.ComposableSingletons$TdsAssetV2Kt$$ExternalSyntheticLambda7
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 57;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0 = (AppLovinNativeAdImplExternalSyntheticLambda0) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            Integer numValueOf = Integer.valueOf(((Integer) obj3).intValue());
            if (i3 == 0) {
                throw null;
            }
            Unit unit = (Unit) getPrivacyIconUri.onWarmupCompleted(-1806028048, new Object[]{appLovinNativeAdImplExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, numValueOf}, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), 1806028048, TossApplication.onSessionEnded.onExtraCallback());
            int i4 = onWarmupCompleted + 11;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 95 / 0;
            }
            return unit;
        }
    });
    private static getBacktraceNote<AppLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> access100 = ForwardingCameraControl.onExtraCallbackWithResult(1503012869, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.atom.asset.ComposableSingletons$TdsAssetV2Kt$$ExternalSyntheticLambda8
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 51;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallbackStub = getPrivacyIconUri.IAuthTabCallbackStub((AppLovinNativeAdImplExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            if (i3 == 0) {
                int i4 = 94 / 0;
            }
            return unitIAuthTabCallbackStub;
        }
    });
    private static getBacktraceNote<AppLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> access000 = ForwardingCameraControl.onExtraCallbackWithResult(1766709894, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.atom.asset.ComposableSingletons$TdsAssetV2Kt$$ExternalSyntheticLambda9
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallbackWithResult = getPrivacyIconUri.onExtraCallbackWithResult((AppLovinNativeAdImplExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = onNavigationEvent + 49;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return unitOnExtraCallbackWithResult;
            }
            Object obj4 = null;
            obj4.hashCode();
            throw null;
        }
    });
    private static getBacktraceNote<HighSpeedResolverExternalSyntheticLambda2, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(-1746928238, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.atom.asset.ComposableSingletons$TdsAssetV2Kt$$ExternalSyntheticLambda10
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 37;
            onExtraCallback = i2 % 128;
            HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2 = (HighSpeedResolverExternalSyntheticLambda2) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            if (i2 % 2 == 0) {
                getPrivacyIconUri.onWarmupCompleted(highSpeedResolverExternalSyntheticLambda2, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                throw null;
            }
            Unit unitOnWarmupCompleted = getPrivacyIconUri.onWarmupCompleted(highSpeedResolverExternalSyntheticLambda2, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
            int i3 = onNavigationEvent + 63;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 20 / 0;
            }
            return unitOnWarmupCompleted;
        }
    });
    private static getBacktraceNote<setPrivacyIconUri, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackStubProxy = ForwardingCameraControl.onExtraCallbackWithResult(410665905, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.atom.asset.ComposableSingletons$TdsAssetV2Kt$$ExternalSyntheticLambda11
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 73;
            onWarmupCompleted = i2 % 128;
            setPrivacyIconUri setprivacyiconuri = (setPrivacyIconUri) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            if (i2 % 2 != 0) {
                return getPrivacyIconUri.onExtraCallbackWithResult(setprivacyiconuri, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
            }
            getPrivacyIconUri.onExtraCallbackWithResult(setprivacyiconuri, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
            throw null;
        }
    });
    private static getBacktraceNote<HighSpeedResolverExternalSyntheticLambda2, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent = ForwardingCameraControl.onExtraCallbackWithResult(-1373562738, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.atom.asset.ComposableSingletons$TdsAssetV2Kt$$ExternalSyntheticLambda12
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 57;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnNavigationEvent = getPrivacyIconUri.onNavigationEvent((HighSpeedResolverExternalSyntheticLambda2) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = onNavigationEvent + 45;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unitOnNavigationEvent;
        }
    });
    private static getBacktraceNote<setPrivacyIconUri, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackDefault = ForwardingCameraControl.onExtraCallbackWithResult(1327966735, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.atom.asset.ComposableSingletons$TdsAssetV2Kt$$ExternalSyntheticLambda13
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 107;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallback = getPrivacyIconUri.IAuthTabCallback((setPrivacyIconUri) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = IAuthTabCallback + 77;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unitIAuthTabCallback;
        }
    });
    private static getBacktraceNote<AppLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback = ForwardingCameraControl.onExtraCallbackWithResult(-200129076, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.atom.asset.ComposableSingletons$TdsAssetV2Kt$$ExternalSyntheticLambda14
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 101;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallback = getPrivacyIconUri.onExtraCallback((AppLovinNativeAdImplExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = onExtraCallback + 11;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unitOnExtraCallback;
        }
    });
    private static getBacktraceNote<AppLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback_Parcel = ForwardingCameraControl.onExtraCallbackWithResult(721942581, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.atom.asset.ComposableSingletons$TdsAssetV2Kt$$ExternalSyntheticLambda1
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 81;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object obj4 = null;
            AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0 = (AppLovinNativeAdImplExternalSyntheticLambda0) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            int iIntValue = ((Integer) obj3).intValue();
            if (i3 != 0) {
                getPrivacyIconUri.IAuthTabCallbackDefault(appLovinNativeAdImplExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                throw null;
            }
            Unit unitIAuthTabCallbackDefault = getPrivacyIconUri.IAuthTabCallbackDefault(appLovinNativeAdImplExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            int i4 = onWarmupCompleted + 77;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return unitIAuthTabCallbackDefault;
            }
            obj4.hashCode();
            throw null;
        }
    });
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onTransact = ForwardingCameraControl.onExtraCallbackWithResult(-76927117, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.atom.asset.ComposableSingletons$TdsAssetV2Kt$$ExternalSyntheticLambda2
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 45;
            onExtraCallbackWithResult = i2 % 128;
            RowScope rowScope = (RowScope) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            if (i2 % 2 == 0) {
                return getPrivacyIconUri.onWarmupCompleted(rowScope, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
            }
            getPrivacyIconUri.onWarmupCompleted(rowScope, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
            throw null;
        }
    });
    private static getBacktraceNote<AppLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted = ForwardingCameraControl.onExtraCallbackWithResult(-2090904189, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.atom.asset.ComposableSingletons$TdsAssetV2Kt$$ExternalSyntheticLambda3
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 55;
            onExtraCallbackWithResult = i2 % 128;
            AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0 = (AppLovinNativeAdImplExternalSyntheticLambda0) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            if (i2 % 2 != 0) {
                getPrivacyIconUri.onWarmupCompleted(appLovinNativeAdImplExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
            Unit unitOnWarmupCompleted = getPrivacyIconUri.onWarmupCompleted(appLovinNativeAdImplExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
            int i3 = onExtraCallbackWithResult + 21;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return unitOnWarmupCompleted;
        }
    });
    private static getBacktraceNote<AppLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> asInterface = ForwardingCameraControl.onExtraCallbackWithResult(-743304788, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.atom.asset.ComposableSingletons$TdsAssetV2Kt$$ExternalSyntheticLambda4
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 115;
            onExtraCallbackWithResult = i2 % 128;
            AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0 = (AppLovinNativeAdImplExternalSyntheticLambda0) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            if (i2 % 2 != 0) {
                return getPrivacyIconUri.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
            }
            getPrivacyIconUri.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
            throw null;
        }
    });
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getInterfaceDescriptor = ForwardingCameraControl.onExtraCallbackWithResult(342061418, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.atom.asset.ComposableSingletons$TdsAssetV2Kt$$ExternalSyntheticLambda5
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 45;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnNavigationEvent = getPrivacyIconUri.onNavigationEvent((RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = onExtraCallbackWithResult + 43;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unitOnNavigationEvent;
        }
    });

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0 = (AppLovinNativeAdImplExternalSyntheticLambda0) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = writeTypedObject + 51;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(appLovinNativeAdImplExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = writeTypedObject + 57;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
        return unitAsBinder;
    }

    public static /* synthetic */ Unit IAuthTabCallback(setPrivacyIconUri setprivacyiconuri, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 63;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Integer numValueOf = Integer.valueOf(i);
        if (i4 == 0) {
            return (Unit) onWarmupCompleted(-1851430631, new Object[]{setprivacyiconuri, cameraCaptureResultEmptyCameraCaptureResult, numValueOf}, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), 1851430637, TossApplication.onSessionEnded.onExtraCallback());
        }
        Unit unit = (Unit) onWarmupCompleted(-1851430631, new Object[]{setprivacyiconuri, cameraCaptureResultEmptyCameraCaptureResult, numValueOf}, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), 1851430637, TossApplication.onSessionEnded.onExtraCallback());
        int i5 = 14 / 0;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 97;
        writeTypedObject = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            IAuthTabCallbackStubProxy(appLovinNativeAdImplExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(appLovinNativeAdImplExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = writeTypedObject + 57;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallbackStubProxy;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 61;
        writeTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            return getInterfaceDescriptor(appLovinNativeAdImplExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        getInterfaceDescriptor(appLovinNativeAdImplExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 51;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return writeTypedObject(appLovinNativeAdImplExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        writeTypedObject(appLovinNativeAdImplExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 61;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return ICustomTabsCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 97;
        writeTypedObject = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            access100(appLovinNativeAdImplExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitAccess100 = access100(appLovinNativeAdImplExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = extraCallbackWithResult + 111;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return unitAccess100;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(setPrivacyIconUri setprivacyiconuri, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 9;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = (Unit) onWarmupCompleted(-1534159164, new Object[]{setprivacyiconuri, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), 1534159166, TossApplication.onSessionEnded.onExtraCallback());
        int i5 = writeTypedObject + 11;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 55;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Integer numValueOf = Integer.valueOf(i);
        if (i4 != 0) {
            throw null;
        }
        Unit unit = (Unit) onWarmupCompleted(-1523728642, new Object[]{rowScope, cameraCaptureResultEmptyCameraCaptureResult, numValueOf}, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), 1523728646, TossApplication.onSessionEnded.onExtraCallback());
        int i5 = extraCallbackWithResult + 37;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 63;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit typedObject = readTypedObject(appLovinNativeAdImplExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = extraCallbackWithResult + 31;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return typedObject;
    }

    public static /* synthetic */ Unit onNavigationEvent(HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 23;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(highSpeedResolverExternalSyntheticLambda2, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = extraCallbackWithResult + 115;
        writeTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onTransact(AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 81;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAccess000 = access000(appLovinNativeAdImplExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = extraCallbackWithResult + 53;
        writeTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 2 / 0;
        }
        return unitAccess000;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~(i7 | i3);
        int i9 = ~i3;
        int i10 = i8 | (~(i9 | i));
        int i11 = (~(i3 | i)) | (~((~i) | i7 | i9));
        int i12 = i7 | i | i9;
        int i13 = i + i5 + i6 + (1362283521 * i2) + ((-853422242) * i4);
        int i14 = i13 * i13;
        int i15 = ((1713903284 * i) - 1228931072) + ((-782767794) * i5) + (i10 * 1248335539) + (1248335539 * i11) + ((-1248335539) * i12) + (i6 * 465567744) + (465567744 * i2) + (1887436800 * i4) + ((-1154482176) * i14);
        int i16 = ((i * 722868660) - 41817558) + (i5 * 722869710) + (i10 * (-525)) + (i11 * (-525)) + (i12 * 525) + (i6 * 722869185) + (i2 * 1172694977) + (i4 * (-747618338)) + (i14 * 791674880);
        int i17 = i15 + (i16 * i16 * 751828992);
        boolean z = false;
        switch (i17) {
            case 1:
                return onWarmupCompleted(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0 = (AppLovinNativeAdImplExternalSyntheticLambda0) objArr[0];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int i18 = 2 % 2;
                int i19 = extraCallbackWithResult + 85;
                writeTypedObject = i19 % 128;
                int i20 = i19 % 2;
                Unit unitIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(appLovinNativeAdImplExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                int i21 = writeTypedObject + 87;
                extraCallbackWithResult = i21 % 128;
                int i22 = i21 % 2;
                return unitIAuthTabCallback_Parcel;
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return onExtraCallbackWithResult(objArr);
            case 6:
                setPrivacyIconUri setprivacyiconuri = (setPrivacyIconUri) objArr[0];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
                int iIntValue2 = ((Number) objArr[2]).intValue();
                int i23 = 2 % 2;
                Intrinsics.checkNotNullParameter(setprivacyiconuri, "");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(setprivacyiconuri) ? 4 : 2;
                }
                if ((iIntValue2 & 19) != 18) {
                    int i24 = writeTypedObject + 33;
                    extraCallbackWithResult = i24 % 128;
                    int i25 = i24 % 2;
                    z = true;
                }
                if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(z, iIntValue2 & 1)) {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1327966735, iIntValue2, -1, "im.toss.tds.compose.component.atom.asset.ComposableSingletons$TdsAssetV2Kt.lambda$1327966735.<anonymous> (TdsAssetV2.kt:945)");
                        int i26 = writeTypedObject + 13;
                        extraCallbackWithResult = i26 % 128;
                        int i27 = i26 % 2;
                    }
                    setprivacyiconuri.onWarmupCompleted(handleNativeAdClick.onExtraCallbackWithResult.Companion.onExtraCallback(), RoundedCornerShapeKt.onWarmupCompleted(), onNavigationEvent, cameraCaptureResultEmptyCameraCaptureResult2, ((iIntValue2 << 9) & 7168) | 390, 0);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i28 = writeTypedObject + 3;
                        extraCallbackWithResult = i28 % 128;
                        int i29 = i28 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                    int i30 = extraCallbackWithResult + 91;
                    writeTypedObject = i30 % 128;
                    int i31 = i30 % 2;
                }
                return Unit.INSTANCE;
            default:
                return IAuthTabCallback(objArr);
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 105;
        writeTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getBacktraceNote<AppLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = IAuthTabCallbackStub;
        int i4 = i2 + 15;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return getbacktracenote;
    }

    public static /* synthetic */ Unit onWarmupCompleted(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 93;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = extraCallbackWithResult + 91;
        writeTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 54 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 25;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitExtraCallback = extraCallback(appLovinNativeAdImplExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 57 / 0;
        }
        int i6 = writeTypedObject + 9;
        extraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            return unitExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 85;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(highSpeedResolverExternalSyntheticLambda2, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = extraCallbackWithResult + 35;
        writeTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getBacktraceNote<AppLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 29;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        getBacktraceNote<AppLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = asBinder;
        if (i3 == 0) {
            int i4 = 6 / 0;
        }
        return getbacktracenote;
    }

    public final getBacktraceNote<AppLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 31;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<AppLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = access000;
        int i5 = i2 + 21;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public final getBacktraceNote<setPrivacyIconUri, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> asBinder() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 75;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<setPrivacyIconUri, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = IAuthTabCallbackStubProxy;
        int i5 = i2 + 27;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public final getBacktraceNote<setPrivacyIconUri, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 105;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        getBacktraceNote<setPrivacyIconUri, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = IAuthTabCallbackDefault;
        int i4 = i3 + 13;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return getbacktracenote;
        }
        obj.hashCode();
        throw null;
    }

    public final getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 101;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onTransact;
        int i5 = i2 + 101;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public final getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onTransact() {
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 5;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = getInterfaceDescriptor;
        int i5 = i2 + 1;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public final getBacktraceNote<AppLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 97;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        int i4 = i2 % 2;
        getBacktraceNote<AppLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = access100;
        int i5 = i3 + 11;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    static {
        int i = extraCallback + 51;
        readTypedObject = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit access000(AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        y3ExternalSyntheticLambda0 y3externalsyntheticlambda0;
        long jExtraCallback;
        int i3;
        int i4 = 2 % 2;
        int i5 = extraCallbackWithResult + 27;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda0, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda0)) {
                int i7 = extraCallbackWithResult + 41;
                writeTypedObject = i7 % 128;
                i3 = i7 % 2 == 0 ? 5 : 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i8 = writeTypedObject + 65;
            extraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            z = true;
        } else {
            int i10 = writeTypedObject + 65;
            extraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i12 = extraCallbackWithResult + 99;
            writeTypedObject = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 66 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1363660914, i2, -1, "im.toss.tds.compose.component.atom.asset.ComposableSingletons$TdsAssetV2Kt.lambda$1363660914.<anonymous> (TdsAssetV2.kt:869)");
                }
                int i14 = R.drawable.icon_check_mono;
                deprecated_eventListenerFactory deprecated_eventlistenerfactory = deprecated_eventListenerFactory.Image;
                y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(513121274);
                    jExtraCallback = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).extraCallback();
                } else {
                    int i15 = extraCallbackWithResult + 79;
                    writeTypedObject = i15 % 128;
                    int i16 = i15 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(513120282);
                    jExtraCallback = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                int i17 = extraCallbackWithResult + 57;
                writeTypedObject = i17 % 128;
                int i18 = i17 % 2;
                appLovinNativeAdImplExternalSyntheticLambda0.onNavigationEvent(i14, deprecated_eventlistenerfactory, (QuirksExternalSyntheticBackport0) null, jExtraCallback, 0, 0.0f, (handleNativeAdClick.onWarmupCompleted) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 24) & 234881024) | 48, 244);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i19 = writeTypedObject + 41;
                    extraCallbackWithResult = i19 % 128;
                    int i20 = i19 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                int i142 = R.drawable.icon_check_mono;
                deprecated_eventListenerFactory deprecated_eventlistenerfactory2 = deprecated_eventListenerFactory.Image;
                y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                int i172 = extraCallbackWithResult + 57;
                writeTypedObject = i172 % 128;
                int i182 = i172 % 2;
                appLovinNativeAdImplExternalSyntheticLambda0.onNavigationEvent(i142, deprecated_eventlistenerfactory2, (QuirksExternalSyntheticBackport0) null, jExtraCallback, 0, 0.0f, (handleNativeAdClick.onWarmupCompleted) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 24) & 234881024) | 48, 244);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback_Parcel(AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda0, "");
        if ((i & 6) == 0) {
            int i4 = extraCallbackWithResult + 19;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda0) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i6 = writeTypedObject + 51;
            extraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(975618819, i2, -1, "im.toss.tds.compose.component.atom.asset.ComposableSingletons$TdsAssetV2Kt.lambda$975618819.<anonymous> (TdsAssetV2.kt:905)");
                int i7 = writeTypedObject + 77;
                extraCallbackWithResult = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 3 % 2;
                }
            }
            appLovinNativeAdImplExternalSyntheticLambda0.onExtraCallbackWithResult("오늘", null, null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 18) & 3670016) | 6, 62);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = extraCallbackWithResult + 7;
                writeTypedObject = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit asBinder(AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = writeTypedObject + 59;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda0, "");
            if ((i & 44) == 0) {
                i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda0) ? 4 : 2);
            } else {
                i2 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda0, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i2 & 19) != 18) {
            int i5 = extraCallbackWithResult + 101;
            writeTypedObject = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1239315844, i2, -1, "im.toss.tds.compose.component.atom.asset.ComposableSingletons$TdsAssetV2Kt.lambda$1239315844.<anonymous> (TdsAssetV2.kt:908)");
            }
            appLovinNativeAdImplExternalSyntheticLambda0.onExtraCallbackWithResult("오늘오늘", null, null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 18) & 3670016) | 6, 62);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i7 = writeTypedObject + 13;
                extraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit getInterfaceDescriptor(AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = writeTypedObject + 115;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda0, "");
            if ((i & 20) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda0)) {
                    int i6 = writeTypedObject + 61;
                    extraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda0, "");
            if ((i & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 19) != 18, i3 & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i8 = writeTypedObject + 73;
                extraCallbackWithResult = i8 % 128;
                if (i8 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1503012869, i3, -1, "im.toss.tds.compose.component.atom.asset.ComposableSingletons$TdsAssetV2Kt.lambda$1503012869.<anonymous> (TdsAssetV2.kt:911)");
                    int i9 = 8 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1503012869, i3, -1, "im.toss.tds.compose.component.atom.asset.ComposableSingletons$TdsAssetV2Kt.lambda$1503012869.<anonymous> (TdsAssetV2.kt:911)");
                }
            }
            appLovinNativeAdImplExternalSyntheticLambda0.onNavigationEvent(im.toss.tds.compose.R.drawable.icn_star_mono, deprecated_eventListenerFactory.Icon, (QuirksExternalSyntheticBackport0) null, 0L, 0, 0.0f, (handleNativeAdClick.onWarmupCompleted) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult, ((i3 << 24) & 234881024) | 48, 252);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit access100(AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = writeTypedObject + 41;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda0, "");
        if ((i & 6) == 0) {
            int i6 = writeTypedObject + 123;
            extraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda0);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i2 = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i7 = extraCallbackWithResult + 39;
            writeTypedObject = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1766709894, i2, -1, "im.toss.tds.compose.component.atom.asset.ComposableSingletons$TdsAssetV2Kt.lambda$1766709894.<anonymous> (TdsAssetV2.kt:917)");
            }
            appLovinNativeAdImplExternalSyntheticLambda0.onNavigationEvent(im.toss.tds.compose.R.drawable.icn_star_mono, deprecated_eventListenerFactory.Image, (QuirksExternalSyntheticBackport0) null, 0L, 0, 0.0f, (handleNativeAdClick.onWarmupCompleted) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 24) & 234881024) | 48, 252);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = extraCallbackWithResult + 53;
                writeTypedObject = i9 % 128;
                if (i9 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i10 = 30 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i11 = writeTypedObject + 29;
            extraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        long jExtraCallback;
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 51;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(highSpeedResolverExternalSyntheticLambda2, "");
        if ((i & 17) != 16) {
            int i5 = extraCallbackWithResult + 9;
            writeTypedObject = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i7 = writeTypedObject + 111;
            extraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1746928238, i, -1, "im.toss.tds.compose.component.atom.asset.ComposableSingletons$TdsAssetV2Kt.lambda$-1746928238.<anonymous> (TdsAssetV2.kt:929)");
                int i8 = extraCallbackWithResult + 97;
                writeTypedObject = i8 % 128;
                int i9 = i8 % 2;
            }
            QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback = QuirkSettingsLoader.Companion.onExtraCallback();
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(534183642);
                jExtraCallback = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsCallback();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(534184634);
                jExtraCallback = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).extraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = verifyDrawable.onExtraCallback(quirksExternalSyntheticBackport0OnNavigationEvent, jExtraCallback, (toMetersPerSecond) null, 2, (Object) null);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderOnExtraCallback, false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i10 = extraCallbackWithResult + 99;
                writeTypedObject = i10 % 128;
                int i11 = i10 % 2;
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            AppLovinNativeAdImplc.onExtraCallback(R.drawable.icon_check_mono, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(onextracallback, 0.75f), y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).IPostMessageService_Parcel(), null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 48, 504);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i;
        setPrivacyIconUri setprivacyiconuri = (setPrivacyIconUri) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(setprivacyiconuri, "");
        if ((iIntValue & 6) == 0) {
            int i3 = writeTypedObject + 69;
            extraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(setprivacyiconuri);
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(setprivacyiconuri)) {
                int i4 = writeTypedObject + 11;
                extraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                i = 4;
            } else {
                i = 2;
            }
            iIntValue |= i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 19) != 18, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(410665905, iIntValue, -1, "im.toss.tds.compose.component.atom.asset.ComposableSingletons$TdsAssetV2Kt.lambda$410665905.<anonymous> (TdsAssetV2.kt:925)");
            }
            setprivacyiconuri.onWarmupCompleted(handleNativeAdClick.onExtraCallbackWithResult.Companion.IAuthTabCallback(), RoundedCornerShapeKt.onWarmupCompleted(), onExtraCallbackWithResult, cameraCaptureResultEmptyCameraCaptureResult, ((iIntValue << 9) & 7168) | 390, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = writeTypedObject + 73;
                extraCallbackWithResult = i6 % 128;
                if (i6 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i7 = extraCallbackWithResult + 51;
            writeTypedObject = i7 % 128;
            int i8 = i7 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        long jExtraCallback;
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 35;
        writeTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(highSpeedResolverExternalSyntheticLambda2, "");
            z = (i & 37) != 26;
        } else {
            Intrinsics.checkNotNullParameter(highSpeedResolverExternalSyntheticLambda2, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i4 = writeTypedObject + 55;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1373562738, i, -1, "im.toss.tds.compose.component.atom.asset.ComposableSingletons$TdsAssetV2Kt.lambda$-1373562738.<anonymous> (TdsAssetV2.kt:949)");
            }
            QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback = QuirkSettingsLoader.Companion.onExtraCallback();
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1438823722);
                jExtraCallback = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsCallback();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1438822730);
                jExtraCallback = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).extraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = verifyDrawable.onExtraCallback(quirksExternalSyntheticBackport0OnNavigationEvent, jExtraCallback, (toMetersPerSecond) null, 2, (Object) null);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderOnExtraCallback, false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                int i6 = writeTypedObject + 31;
                extraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            AppLovinNativeAdImplc.onExtraCallback(R.drawable.icon_check_mono, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(onextracallback, 0.75f), y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).IPostMessageService_Parcel(), null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 48, 504);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i8 = extraCallbackWithResult + 11;
                writeTypedObject = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 5 % 2;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit writeTypedObject(AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = writeTypedObject + 15;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda0, "");
            if ((i & 96) == 0) {
                i2 = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda0) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda0, "");
            if ((i & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = extraCallbackWithResult + 75;
                writeTypedObject = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-200129076, i2, -1, "im.toss.tds.compose.component.atom.asset.ComposableSingletons$TdsAssetV2Kt.lambda$-200129076.<anonymous> (TdsAssetV2.kt:1077)");
            }
            appLovinNativeAdImplExternalSyntheticLambda0.onNavigationEvent(im.toss.tds.compose.R.drawable.icn_star_mono, deprecated_eventListenerFactory.Icon, (QuirksExternalSyntheticBackport0) null, 0L, 0, 0.0f, handleNativeAdClick.onWarmupCompleted.Auto, (String) null, cameraCaptureResultEmptyCameraCaptureResult, 1572912 | ((i2 << 24) & 234881024), 188);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = writeTypedObject + 47;
                extraCallbackWithResult = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackStubProxy(AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = writeTypedObject + 81;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda0, "");
        boolean z = true;
        if ((i & 6) == 0) {
            i2 = (!(cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda0) ^ true) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i6 = writeTypedObject + 65;
            extraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i8 = writeTypedObject + 43;
            extraCallbackWithResult = i8 % 128;
            if (i8 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(721942581, i2, -1, "im.toss.tds.compose.component.atom.asset.ComposableSingletons$TdsAssetV2Kt.lambda$721942581.<anonymous> (TdsAssetV2.kt:1086)");
            }
            appLovinNativeAdImplExternalSyntheticLambda0.onNavigationEvent(im.toss.tds.compose.R.drawable.icn_star_mono, deprecated_eventListenerFactory.Icon, (QuirksExternalSyntheticBackport0) null, 0L, 0, 0.0f, handleNativeAdClick.onWarmupCompleted.Fill, (String) null, cameraCaptureResultEmptyCameraCaptureResult, 1572912 | ((i2 << 24) & 234881024), 188);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 103;
        writeTypedObject = i3 % 128;
        boolean z = false;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 4) != 56) {
                int i4 = extraCallbackWithResult + 47;
                writeTypedObject = i4 % 128;
                if (i4 % 2 != 0) {
                    z = true;
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-76927117, i, -1, "im.toss.tds.compose.component.atom.asset.ComposableSingletons$TdsAssetV2Kt.lambda$-76927117.<anonymous> (TdsAssetV2.kt:1074)");
            }
            handleNativeAdClick.onExtraCallback.onExtraCallbackWithResult.onWarmupCompleted onwarmupcompleted = handleNativeAdClick.onExtraCallback.onExtraCallbackWithResult.Companion;
            setMainImageUri.onExtraCallbackWithResult(null, onwarmupcompleted.IAuthTabCallback(), 0L, null, 0.0f, null, null, onExtraCallback, cameraCaptureResultEmptyCameraCaptureResult, 12582960, 125);
            setMainImageUri.onExtraCallbackWithResult(null, onwarmupcompleted.IAuthTabCallback(), 0L, null, 0.0f, null, null, IAuthTabCallback_Parcel, cameraCaptureResultEmptyCameraCaptureResult, 12582960, 125);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i5 = writeTypedObject + 71;
            extraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit extraCallback(AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda0, "");
        if ((i & 6) == 0) {
            int i5 = writeTypedObject + 53;
            extraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda0)) {
                int i7 = writeTypedObject + 11;
                extraCallbackWithResult = i7 % 128;
                i3 = i7 % 2 != 0 ? 3 : 4;
            } else {
                int i8 = extraCallbackWithResult + 53;
                writeTypedObject = i8 % 128;
                int i9 = i8 % 2;
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        boolean z = false;
        if ((i2 & 19) != 18) {
            int i10 = writeTypedObject + 41;
            extraCallbackWithResult = i10 % 128;
            if (i10 % 2 == 0) {
                z = true;
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2090904189, i2, -1, "im.toss.tds.compose.component.atom.asset.ComposableSingletons$TdsAssetV2Kt.lambda$-2090904189.<anonymous> (TdsAssetV2.kt:1099)");
            }
            appLovinNativeAdImplExternalSyntheticLambda0.onNavigationEvent(im.toss.tds.compose.R.drawable.icn_star_mono, deprecated_eventListenerFactory.Image, (QuirksExternalSyntheticBackport0) null, 0L, 0, 0.0f, handleNativeAdClick.onWarmupCompleted.Auto, (String) null, cameraCaptureResultEmptyCameraCaptureResult, 1572912 | ((i2 << 24) & 234881024), 188);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = writeTypedObject + 9;
                extraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i13 = writeTypedObject + 31;
            extraCallbackWithResult = i13 % 128;
            int i14 = i13 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit readTypedObject(AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda0, "");
        boolean z = false;
        if ((i & 6) == 0) {
            int i5 = writeTypedObject + 73;
            extraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 46 / 0;
                i3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda0) ? 4 : 2;
            } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda0)) {
            }
            i2 = i3 | i;
            int i7 = writeTypedObject + 81;
            extraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            int i9 = writeTypedObject + 55;
            extraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-743304788, i2, -1, "im.toss.tds.compose.component.atom.asset.ComposableSingletons$TdsAssetV2Kt.lambda$-743304788.<anonymous> (TdsAssetV2.kt:1108)");
            }
            appLovinNativeAdImplExternalSyntheticLambda0.onNavigationEvent(im.toss.tds.compose.R.drawable.icn_star_mono, deprecated_eventListenerFactory.Image, (QuirksExternalSyntheticBackport0) null, 0L, 0, 0.0f, handleNativeAdClick.onWarmupCompleted.Fill, (String) null, cameraCaptureResultEmptyCameraCaptureResult, 1572912 | ((i2 << 24) & 234881024), 188);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i11 = extraCallbackWithResult + 31;
                writeTypedObject = i11 % 128;
                int i12 = i11 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        boolean z;
        RowScope rowScope = (RowScope) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((iIntValue & 17) != 16) {
            int i2 = extraCallbackWithResult + 7;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        } else {
            int i4 = writeTypedObject + 1;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = writeTypedObject + 5;
                extraCallbackWithResult = i6 % 128;
                if (i6 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(342061418, iIntValue, -1, "im.toss.tds.compose.component.atom.asset.ComposableSingletons$TdsAssetV2Kt.lambda$342061418.<anonymous> (TdsAssetV2.kt:1096)");
                    int i7 = 64 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(342061418, iIntValue, -1, "im.toss.tds.compose.component.atom.asset.ComposableSingletons$TdsAssetV2Kt.lambda$342061418.<anonymous> (TdsAssetV2.kt:1096)");
                }
            }
            handleNativeAdClick.onExtraCallback.onExtraCallbackWithResult.onWarmupCompleted onwarmupcompleted = handleNativeAdClick.onExtraCallback.onExtraCallbackWithResult.Companion;
            setMainImageUri.onExtraCallbackWithResult(null, onwarmupcompleted.IAuthTabCallback(), 0L, null, 0.0f, null, null, onWarmupCompleted, cameraCaptureResultEmptyCameraCaptureResult, 12582960, 125);
            setMainImageUri.onExtraCallbackWithResult(null, onwarmupcompleted.IAuthTabCallback(), 0L, null, 0.0f, null, null, asInterface, cameraCaptureResultEmptyCameraCaptureResult, 12582960, 125);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit IAuthTabCallback(AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(-1806028048, new Object[]{appLovinNativeAdImplExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), 1806028048, TossApplication.onSessionEnded.onExtraCallback());
    }

    public static /* synthetic */ Unit asInterface(AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(886725914, new Object[]{appLovinNativeAdImplExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), -886725911, TossApplication.onSessionEnded.onExtraCallback());
    }

    private static final Unit onWarmupCompleted(setPrivacyIconUri setprivacyiconuri, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(-1851430631, new Object[]{setprivacyiconuri, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), 1851430637, TossApplication.onSessionEnded.onExtraCallback());
    }

    private static final Unit onExtraCallbackWithResult(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(-1523728642, new Object[]{rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), 1523728646, TossApplication.onSessionEnded.onExtraCallback());
    }

    private static final Unit onExtraCallback(setPrivacyIconUri setprivacyiconuri, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(-1534159164, new Object[]{setprivacyiconuri, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), 1534159166, TossApplication.onSessionEnded.onExtraCallback());
    }

    public final getBacktraceNote<AppLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback() {
        return (getBacktraceNote) onWarmupCompleted(-1711767460, new Object[]{this}, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), 1711767461, TossApplication.onSessionEnded.onExtraCallback());
    }

    public final getBacktraceNote<AppLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackDefault() {
        return (getBacktraceNote) onWarmupCompleted(1135623359, new Object[]{this}, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), -1135623354, TossApplication.onSessionEnded.onExtraCallback());
    }
}
