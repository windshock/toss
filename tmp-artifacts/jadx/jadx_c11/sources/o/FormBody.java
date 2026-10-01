package o;

import im.toss.tds.icon.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class FormBody {
    private static int IAuthTabCallback = 0;
    private static deprecated_followRedirects onNavigationEvent = null;
    private static int onWarmupCompleted = 1;

    public static final deprecated_followRedirects onExtraCallback(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onNavigationEvent == null) {
            onNavigationEvent = new accessgetDEFAULT_PROTOCOLScp(R.drawable.icon_arrow_right_mono);
            int i2 = IAuthTabCallback + 7;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
        }
        deprecated_followRedirects deprecated_followredirects = onNavigationEvent;
        Intrinsics.checkNotNull(deprecated_followredirects);
        int i4 = onWarmupCompleted + 47;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return deprecated_followredirects;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
