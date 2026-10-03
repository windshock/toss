package o;

import android.content.Context;
import viva.republica.toss.ads.AdsHiddenLabActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DERNumericString implements setSize<AdsHiddenLabActivity> {
    public static int onExtraCallback;
    public static int onExtraCallbackWithResult;

    public static int IAuthTabCallback() {
        int i = onExtraCallbackWithResult;
        int i2 = i % 8693448;
        onExtraCallbackWithResult = i + 1;
        if (i2 != 0) {
            return onExtraCallback;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
        onExtraCallback = i3;
        return i3;
    }
}
