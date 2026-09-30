package o;

import im.toss.tds.icon.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setEncodedQueryParameter {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static deprecated_followRedirects onWarmupCompleted;

    public static final deprecated_followRedirects onNavigationEvent(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onWarmupCompleted == null) {
            onWarmupCompleted = new accessgetDEFAULT_PROTOCOLScp(R.drawable.icon_plus_mono);
        }
        deprecated_followRedirects deprecated_followredirects = onWarmupCompleted;
        Intrinsics.checkNotNull(deprecated_followredirects);
        int i4 = onExtraCallbackWithResult + 77;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return deprecated_followredirects;
    }
}
