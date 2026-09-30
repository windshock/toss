package o;

import im.toss.components.alpha.accesstoken.AlphaEnvironmentAccessTokenProvider;
import im.toss.core.webkit.TossCoreWebView;
import kotlin.jvm.internal.Intrinsics;
import o.setByType;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class convertDeviceWithStatebugsnag_android_core_release implements surfaceChanged {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    public /* bridge */ void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        super.IAuthTabCallback();
        int i4 = IAuthTabCallback + Imgproc.COLOR_YUV2RGB_YVYU;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void IAuthTabCallback(@NotNull TossCoreWebView tossCoreWebView) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        super.IAuthTabCallback(tossCoreWebView);
        int i4 = IAuthTabCallback + 69;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ Object onNavigationEvent(@NotNull setByType setbytype, @NotNull access13800<? super setByType.onWarmupCompleted> access13800Var) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objOnNavigationEvent = super.onNavigationEvent(setbytype, access13800Var);
        int i4 = onNavigationEvent + 101;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return objOnNavigationEvent;
        }
        throw null;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull TossCoreWebView tossCoreWebView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        super.onWarmupCompleted(tossCoreWebView);
        int i4 = onNavigationEvent + 39;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 34 / 0;
        }
    }

    public void onExtraCallbackWithResult(@NotNull setLensFacing setlensfacing) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setlensfacing, "");
        if (!zzaj.onNavigationEvent().RemoteActionCompatParcelizer()) {
            return;
        }
        int i4 = onNavigationEvent + 69;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        setlensfacing.onWarmupCompleted("X-Toss-Alpha-Token", AlphaEnvironmentAccessTokenProvider.IAuthTabCallback.onNavigationEvent());
        int i6 = IAuthTabCallback + 103;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
    }
}
