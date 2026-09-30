package o;

import android.graphics.Bitmap;

/* loaded from: /tmp/toss_alldex/classes19.dex */
interface isSegmentInside {
    int IAuthTabCallback(Bitmap bitmap);

    Bitmap IAuthTabCallback();

    void onExtraCallbackWithResult(Bitmap bitmap);

    String onNavigationEvent(int i2, int i3, Bitmap.Config config);

    String onNavigationEvent(Bitmap bitmap);

    Bitmap onWarmupCompleted(int i2, int i3, Bitmap.Config config);
}
