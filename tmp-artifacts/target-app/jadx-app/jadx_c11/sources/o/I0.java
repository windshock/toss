package o;

import android.app.Activity;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class I0 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    public static final String onExtraCallback(@Nullable Activity activity) {
        int i = 2 % 2;
        if (activity == null) {
            int i2 = IAuthTabCallback + 11;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        String strIAuthTabCallback = F0.Companion.onExtraCallback(activity).IAuthTabCallback(activity);
        int i4 = IAuthTabCallback + 91;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return strIAuthTabCallback;
    }
}
