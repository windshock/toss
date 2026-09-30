package o;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ViewPager {
    public static final ViewPager IAuthTabCallback = new ViewPager();
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = onWarmupCompleted + 85;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 3 / 0;
        }
    }

    private ViewPager() {
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallback = IAuthTabCallback(System.currentTimeMillis());
        int i4 = onExtraCallbackWithResult + 55;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return strIAuthTabCallback;
    }

    public final String IAuthTabCallback(long j) {
        int i = 2 % 2;
        String str = CommonModule_closeView.onWarmupCompleted.getInterfaceDescriptor().format(new Date(j));
        Intrinsics.checkNotNullExpressionValue(str, "");
        int i2 = onExtraCallback + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
