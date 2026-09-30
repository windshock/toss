package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgcodecs.Imgcodecs;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setSubmitTimestamp extends getLandingPageClickEnd {
    public static final setSubmitTimestamp onNavigationEvent = new setSubmitTimestamp();

    private setSubmitTimestamp() {
    }

    public final byte[] onExtraCallbackWithResult() {
        return super.onNavigationEvent(Imgcodecs.IMWRITE_AVIF_QUALITY);
    }

    public final void onWarmupCompleted(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        IAuthTabCallback(bArr);
    }
}
