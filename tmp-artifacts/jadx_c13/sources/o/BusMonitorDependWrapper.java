package o;

import android.content.Context;
import android.view.Display;
import android.view.WindowManager;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class BusMonitorDependWrapper {
    public static int IAuthTabCallback(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (defaultDisplay.getWidth() == defaultDisplay.getHeight()) {
            return 3;
        }
        return defaultDisplay.getWidth() < defaultDisplay.getHeight() ? 1 : 2;
    }
}
