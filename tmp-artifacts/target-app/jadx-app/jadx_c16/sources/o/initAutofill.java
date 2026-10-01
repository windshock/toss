package o;

import android.app.Activity;
import android.app.ActivityManager;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class initAutofill {
    public findMinMaxChildLayoutPositions IAuthTabCallback = null;
    public Activity onWarmupCompleted;

    public static String onExtraCallbackWithResult(String str) {
        int length = str.length();
        char[] cArr = new char[length];
        int i = length - 1;
        while (i >= 0) {
            int i2 = i - 1;
            cArr[i] = (char) (str.charAt(i) ^ 'z');
            if (i2 < 0) {
                break;
            }
            i -= 2;
            cArr[i2] = (char) (str.charAt(i2) ^ '1');
        }
        return new String(cArr);
    }

    public initAutofill(Activity activity) {
        this.onWarmupCompleted = activity;
    }

    public boolean IAuthTabCallback(boolean z) {
        findMinMaxChildLayoutPositions findminmaxchildlayoutpositions = new findMinMaxChildLayoutPositions(this.onWarmupCompleted);
        this.IAuthTabCallback = findminmaxchildlayoutpositions;
        if (findminmaxchildlayoutpositions.onNavigationEvent()) {
            if (this.IAuthTabCallback.onExtraCallbackWithResult()) {
                this.onWarmupCompleted.getIntent().putExtra(dispatchLayoutStep2.onWarmupCompleted("7\t<\u00127\u0003"), false);
                return false;
            }
            if (onWarmupCompleted()) {
                this.onWarmupCompleted.getIntent().putExtra(dispatchLayoutStep2.onWarmupCompleted("7\t<\u00127\u0003"), true);
                return true;
            }
            if (!z) {
                this.onWarmupCompleted.getIntent().putExtra(dispatchLayoutStep2.onWarmupCompleted("7\t<\u00127\u0003"), false);
                return false;
            }
            this.IAuthTabCallback.onWarmupCompleted();
            this.onWarmupCompleted.getIntent().putExtra(dispatchLayoutStep1.onExtraCallback("^FU]^L"), true);
            return true;
        }
        this.onWarmupCompleted.getIntent().putExtra(dispatchLayoutStep1.onExtraCallback("^FU]^L"), false);
        return false;
    }

    private /* synthetic */ boolean onWarmupCompleted() throws SecurityException {
        List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) this.onWarmupCompleted.getSystemService(dispatchLayoutStep2.onWarmupCompleted("2\u0018'\u0012%\u0012'\u0002"))).getRunningServices(50);
        for (int i = 0; i < runningServices.size(); i++) {
            if (runningServices.get(i).service.getClassName().equals(dispatchLayoutStep1.onExtraCallback("WUY\u0014UTPH[SP\u0014PH[SP\u0014L\u0014G_FL]YQ\u0014pH[SPbuT@SBSFOG"))) {
                return true;
            }
        }
        return false;
    }
}
