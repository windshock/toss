package o;

import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxSegmentCollection {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    public static final MaxSegmentCollection onExtraCallbackWithResult = new MaxSegmentCollection();
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    static {
        int i = onExtraCallback + 71;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private MaxSegmentCollection() {
    }

    public final MappingRedirectableLiveDataExternalSyntheticLambda1 onNavigationEvent(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        getSpecialFeatureOptInStatus getspecialfeatureoptinstatus;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 95;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = onWarmupCompleted + 83;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-837601229, i, -1, "im.toss.tds.compose.component.token.ProgressStepperShadowTokens.<get-Progress> (ProgressStepperShadowTokens.kt:21)");
        }
        accessgetORDER_BY_NAMEcp accessgetorder_by_namecpOnExtraCallback = bExternalSyntheticLambda7.IAuthTabCallback.onExtraCallback();
        if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
            getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
        } else {
            getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i7 = IAuthTabCallback + 83;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
        }
        float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(accessgetorder_by_namecpOnExtraCallback.onWarmupCompleted());
        long jOnExtraCallback = ByteOrderedDataOutputStream.onExtraCallback(accessgetorder_by_namecpOnExtraCallback.onNavigationEvent().onNavigationEvent(getspecialfeatureoptinstatus));
        float fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(accessgetorder_by_namecpOnExtraCallback.onExtraCallback());
        float fIAuthTabCallback3 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(accessgetorder_by_namecpOnExtraCallback.onExtraCallbackWithResult());
        MappingRedirectableLiveDataExternalSyntheticLambda1 mappingRedirectableLiveDataExternalSyntheticLambda1 = new MappingRedirectableLiveDataExternalSyntheticLambda1(fIAuthTabCallback, jOnExtraCallback, fIAuthTabCallback2, r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onExtraCallback((Float.floatToRawIntBits(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(accessgetorder_by_namecpOnExtraCallback.asBinder())) & 4294967295L) | (Float.floatToRawIntBits(fIAuthTabCallback3) << 32)), 0.0f, 0, 48, (DefaultConstructorMarker) null);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return mappingRedirectableLiveDataExternalSyntheticLambda1;
    }
}
