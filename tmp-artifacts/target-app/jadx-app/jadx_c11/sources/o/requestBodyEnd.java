package o;

import im.toss.tds.icon.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class requestBodyEnd {
    private static int onExtraCallback = 1;
    private static deprecated_followRedirects onExtraCallbackWithResult;
    private static int onNavigationEvent;

    public static final deprecated_followRedirects onWarmupCompleted(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onExtraCallbackWithResult == null) {
            onExtraCallbackWithResult = new accessgetDEFAULT_PROTOCOLScp(R.drawable.icon_arrow_down_mono);
            int i4 = onNavigationEvent + 89;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        deprecated_followRedirects deprecated_followredirects = onExtraCallbackWithResult;
        Intrinsics.checkNotNull(deprecated_followredirects);
        return deprecated_followredirects;
    }
}
