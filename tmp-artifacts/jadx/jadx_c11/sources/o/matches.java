package o;

import android.graphics.fonts.Font;
import android.os.SystemClock;
import java.io.File;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class matches {
    private static int IAuthTabCallback = 1;
    public static int onExtraCallback;
    private static int onNavigationEvent;
    public static int onWarmupCompleted;

    public static /* synthetic */ Font.Builder rh_(File file) {
        int i = 2 % 2;
        Font.Builder builder = new Font.Builder(file);
        int i2 = IAuthTabCallback + 5;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return builder;
        }
        throw null;
    }

    public static int onExtraCallback() {
        int i = onWarmupCompleted;
        int i2 = i % 7409537;
        onWarmupCompleted = i + 1;
        if (i2 != 0) {
            return onExtraCallback;
        }
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        onExtraCallback = iUptimeMillis;
        return iUptimeMillis;
    }
}
