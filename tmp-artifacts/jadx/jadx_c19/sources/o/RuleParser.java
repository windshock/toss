package o;

import im.toss.appsintoss.R;
import im.toss.global.features.kyc.eu.main.cdd.ui.identity_confirm.GlobalKycEuIdentityConfirmViewModel;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.RuleParser;
import o.areCachedAdResourcesMissing;
import o.roundUpToNearestHalfInt;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class RuleParser {
    private static int IAuthTabCallback = 0;
    private static int asInterface = 0;
    private static int onExtraCallback = 1;
    private static int onTransact = 1;
    public static final RuleParser onExtraCallbackWithResult = new RuleParser();
    private static getBacktraceNote<areCachedAdResourcesMissing, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted = ForwardingCameraControl.onExtraCallbackWithResult(2082829651, false, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.ComposableSingletons$InAppPurchaseHistoryDisclaimerActivityKt$$ExternalSyntheticLambda0
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 17;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Unit unitOnNavigationEvent = RuleParser.onNavigationEvent((areCachedAdResourcesMissing) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i5 = onNavigationEvent + 15;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return unitOnNavigationEvent;
        }
    });
    private static getBacktraceNote<roundUpToNearestHalfInt, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent = ForwardingCameraControl.onExtraCallbackWithResult(1280930902, false, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.ComposableSingletons$InAppPurchaseHistoryDisclaimerActivityKt$$ExternalSyntheticLambda1
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 53;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Unit unitOnNavigationEvent = RuleParser.onNavigationEvent((roundUpToNearestHalfInt) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i5 = onWarmupCompleted + 69;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return unitOnNavigationEvent;
            }
            throw null;
        }
    });

    public static /* synthetic */ Unit onNavigationEvent(areCachedAdResourcesMissing arecachedadresourcesmissing, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 3;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(arecachedadresourcesmissing, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = IAuthTabCallback + 99;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(roundUpToNearestHalfInt rounduptonearesthalfint, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 83;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            onExtraCallbackWithResult(rounduptonearesthalfint, cameraCaptureResultEmptyCameraCaptureResult, i2);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(rounduptonearesthalfint, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = onExtraCallback + 41;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 46 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public final getBacktraceNote<roundUpToNearestHalfInt, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 5;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        getBacktraceNote<roundUpToNearestHalfInt, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onNavigationEvent;
        int i6 = i4 + 101;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return getbacktracenote;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i2 = onTransact + 57;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit IAuthTabCallback(areCachedAdResourcesMissing arecachedadresourcesmissing, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        boolean z;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(arecachedadresourcesmissing, "");
        if ((i2 & 6) == 0) {
            int i5 = onExtraCallback + 79;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(arecachedadresourcesmissing);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i3 = i2 | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(arecachedadresourcesmissing) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i3 & 19) != 18) {
            int i6 = IAuthTabCallback + 103;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i3 & 1))) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i8 = IAuthTabCallback + 19;
                onExtraCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2082829651, i3, -1, "im.toss.appsintoss.iap.ComposableSingletons$InAppPurchaseHistoryDisclaimerActivityKt.lambda$2082829651.<anonymous> (InAppPurchaseHistoryDisclaimerActivity.kt:57)");
                    int i9 = 51 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2082829651, i3, -1, "im.toss.appsintoss.iap.ComposableSingletons$InAppPurchaseHistoryDisclaimerActivityKt.lambda$2082829651.<anonymous> (InAppPurchaseHistoryDisclaimerActivity.kt:57)");
                }
            }
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_purchase_history_disclaimer_1, cameraCaptureResultEmptyCameraCaptureResult, 0);
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            int i10 = i3 & 14;
            arecachedadresourcesmissing.IAuthTabCallback(strOnExtraCallback, (QuirksExternalSyntheticBackport0) null, y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService(), (GraphicDeviceInfo) null, 0L, (GraphicDeviceInfo) null, (handshake) null, (Integer) null, 0, 0.0f, cameraCaptureResultEmptyCameraCaptureResult, 0, i10, 1018);
            arecachedadresourcesmissing.IAuthTabCallback(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_purchase_history_disclaimer_2, cameraCaptureResultEmptyCameraCaptureResult, 0), (QuirksExternalSyntheticBackport0) null, y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService(), (GraphicDeviceInfo) null, 0L, (GraphicDeviceInfo) null, (handshake) null, (Integer) null, 0, 0.0f, cameraCaptureResultEmptyCameraCaptureResult, 0, i10, 1018);
            arecachedadresourcesmissing.IAuthTabCallback(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_purchase_history_disclaimer_3, cameraCaptureResultEmptyCameraCaptureResult, 0), (QuirksExternalSyntheticBackport0) null, y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService(), (GraphicDeviceInfo) null, 0L, (GraphicDeviceInfo) null, (handshake) null, (Integer) null, 0, 0.0f, cameraCaptureResultEmptyCameraCaptureResult, 0, i10, 1018);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(roundUpToNearestHalfInt rounduptonearesthalfint, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(rounduptonearesthalfint, "");
        boolean z = true;
        if ((i2 & 6) == 0) {
            int i5 = onExtraCallback + 25;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rounduptonearesthalfint) ^ true ? 2 : 4;
            int i8 = onExtraCallback + 15;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            i3 = i2 | i7;
        } else {
            i3 = i2;
        }
        if ((i3 & 19) != 18) {
            int i10 = IAuthTabCallback + 23;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i12 = onExtraCallback + 67;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1280930902, i3, -1, "im.toss.appsintoss.iap.ComposableSingletons$InAppPurchaseHistoryDisclaimerActivityKt.lambda$1280930902.<anonymous> (InAppPurchaseHistoryDisclaimerActivity.kt:48)");
            }
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_purchase_history_disclaime_title, cameraCaptureResultEmptyCameraCaptureResult, 0);
            long jICustomTabsService = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService();
            getCombinedPathForAllStarsWithSide getcombinedpathforallstarswithside = getCombinedPathForAllStarsWithSide.onExtraCallbackWithResult;
            roundUpToNearestHalfInt.onNavigationEvent(-455205582, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 455205585, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), new Object[]{rounduptonearesthalfint, strOnExtraCallback, null, Long.valueOf(jICustomTabsService), null, null, 0, Float.valueOf(0.0f), getCombinedPathForAllStarsWithSide.IAuthTabCallback(getcombinedpathforallstarswithside, 0.0f, 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 7, (Object) null), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i3 << 24) & 234881024) | 12582912), 122}, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted());
            rounduptonearesthalfint.onExtraCallbackWithResult((QuirksExternalSyntheticBackport0) null, 0, 0.0f, 0L, (GraphicDeviceInfo) null, getCombinedPathForAllStarsWithSide.IAuthTabCallbackDefault(getcombinedpathforallstarswithside, 0.0f, 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 7, (Object) null), onWarmupCompleted, cameraCaptureResultEmptyCameraCaptureResult, ((i3 << 21) & 29360128) | 1769472, 31);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i14 = IAuthTabCallback + 61;
                onExtraCallback = i14 % 128;
                if (i14 % 2 == 0) {
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
}
