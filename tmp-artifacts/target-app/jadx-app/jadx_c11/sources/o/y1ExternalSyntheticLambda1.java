package o;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class y1ExternalSyntheticLambda1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final r8lambdaDHTEMgjZGPjMLXAfOa2eIWlxu7w onNavigationEvent(@NotNull r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, boolean z, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, "");
        boolean z2 = true;
        if ((i2 & 2) != 0) {
            z = true;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i4 = onExtraCallback + 33;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1792524596, i, -1, "im.toss.tds.compose.component.compound.toast.v1.rememberTdsToastV1TransitionState (TdsToastV1TransitionState.kt:47)");
        }
        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
        Configuration configuration = (Configuration) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallbackWithResult());
        if (((i & 14) ^ 6) > 4) {
            int i6 = IAuthTabCallback + 117;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4);
            if (i7 == 0 ? !zOnNavigationEvent : !zOnNavigationEvent) {
                if ((i & 6) != 4) {
                    z2 = false;
                }
            }
        }
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (z2 || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            r8lambdaurh7WZhT8H99g_JSNfSrdxCR3k r8lambdaurh7wzht8h99g_jsnfsrdxcr3k = new r8lambdaurh7WZhT8H99g_JSNfSrdxCR3k(r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4.asBinder(), r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(configuration.screenWidthDp)), r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(configuration.screenHeightDp)), z);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(r8lambdaurh7wzht8h99g_jsnfsrdxcr3k);
            objOnMinimized = r8lambdaurh7wzht8h99g_jsnfsrdxcr3k;
        }
        r8lambdaurh7WZhT8H99g_JSNfSrdxCR3k r8lambdaurh7wzht8h99g_jsnfsrdxcr3k2 = (r8lambdaurh7WZhT8H99g_JSNfSrdxCR3k) objOnMinimized;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return r8lambdaurh7wzht8h99g_jsnfsrdxcr3k2;
    }
}
