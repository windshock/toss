package o;

import com.initech.xsafe.cert.INIXSAFEProtocolException;
import im.toss.features.home.feature.asset_home.R;
import im.toss.features.home.feature.asset_home.activity.ComposableSingletons$AssetHomeMydataIntroActivityKt$;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0;
import o.mExternalSyntheticApiModelOutline1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class SecurityUtils {
    private static int asBinder = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public static final SecurityUtils IAuthTabCallback = new SecurityUtils();
    private static getBacktraceNote<mc, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(-74401727, false, new ComposableSingletons$AssetHomeMydataIntroActivityKt$.ExternalSyntheticLambda0());

    public static /* synthetic */ Unit onExtraCallback(mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 107;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return onExtraCallbackWithResult(mcVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onExtraCallbackWithResult(mcVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public final getBacktraceNote<mc, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult;
        }
        throw null;
    }

    static {
        int i = asBinder + 75;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 9 / 0;
        }
    }

    private static final Unit onExtraCallbackWithResult(mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(mcVar, "");
        boolean z = true;
        if ((i & 6) == 0) {
            if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(mcVar)) {
                i3 = 2;
            } else {
                int i5 = onExtraCallback + 39;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i7 = onExtraCallback + 21;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-74401727, i2, -1, "im.toss.features.home.feature.asset_home.activity.ComposableSingletons$AssetHomeMydataIntroActivityKt.lambda$-74401727.<anonymous> (AssetHomeMydataIntroActivity.kt:112)");
            }
            mcVar.IAuthTabCallback(CollectionsKt.listOf(new String[]{DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.home_v2_feature_asset_home_mydata_register_intro_title_1, cameraCaptureResultEmptyCameraCaptureResult, 0), DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.home_v2_feature_asset_home_mydata_register_intro_title_2, cameraCaptureResultEmptyCameraCaptureResult, 0), DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.home_v2_feature_asset_home_mydata_register_intro_title_3, cameraCaptureResultEmptyCameraCaptureResult, 0)}), ((mExternalSyntheticApiModelOutline1.IAuthTabCallback.IAuthTabCallbackStubProxy) mExternalSyntheticApiModelOutline1.asInterface.onExtraCallback.IAuthTabCallback(-129908653, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 129908653, new Object[]{mExternalSyntheticApiModelOutline1.asInterface.Companion}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted())).onWarmupCompleted(), (QuirksExternalSyntheticBackport0) null, Integer.MAX_VALUE, 300, INIXSAFEProtocolException.IO_EXCEPTION, false, (getHumanReadableName) null, 0L, 0L, 0L, 0.0f, (bindChildren) null, (use) null, 0L, (GraphicDeviceInfo) null, (mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult) null, (Object) null, cameraCaptureResultEmptyCameraCaptureResult, 224256, (i2 << 24) & 234881024, 262084);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }
}
