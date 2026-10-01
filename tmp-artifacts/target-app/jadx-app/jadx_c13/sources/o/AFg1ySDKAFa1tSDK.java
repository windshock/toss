package o;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class AFg1ySDKAFa1tSDK extends CancellationException {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    private final int itemOffset;
    private final onTextFocusChanged<Float, onSuggestionsKey> previousAnimation;

    public AFg1ySDKAFa1tSDK(int i, @NotNull onTextFocusChanged<Float, onSuggestionsKey> ontextfocuschanged) {
        Intrinsics.checkNotNullParameter(ontextfocuschanged, "");
        this.itemOffset = i;
        this.previousAnimation = ontextfocuschanged;
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        int i5 = this.itemOffset;
        int i6 = i3 + Imgproc.COLOR_YUV2RGBA_YVYU;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final onTextFocusChanged<Float, onSuggestionsKey> onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.previousAnimation;
        }
        throw null;
    }
}
