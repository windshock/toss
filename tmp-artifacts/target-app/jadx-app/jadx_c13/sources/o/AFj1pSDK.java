package o;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFj1pSDK {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    public static final String onExtraCallbackWithResult(@NotNull L_ l_) {
        Object objM31constructorimpl;
        int i = 2 % 2;
        int i2 = onNavigationEvent + Imgproc.COLOR_YUV2RGB_YVYU;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(l_, "");
        try {
            Result.Companion companion = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(l_.getScreenName());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(th));
        }
        Object obj = null;
        if (Result.onExtraCallback(objM31constructorimpl)) {
            int i4 = IAuthTabCallback + 57;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            objM31constructorimpl = null;
        }
        if (!Intrinsics.areEqual((String) objM31constructorimpl, _UrlKt.FRAGMENT_ENCODE_SET)) {
            int i6 = IAuthTabCallback + 73;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            obj = objM31constructorimpl;
        }
        String str = (String) obj;
        if (str != null) {
            return str;
        }
        String simpleName = l_.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        return simpleName;
    }
}
