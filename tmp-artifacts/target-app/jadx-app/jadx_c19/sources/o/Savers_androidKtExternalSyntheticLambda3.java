package o;

import android.graphics.Bitmap;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class Savers_androidKtExternalSyntheticLambda3 implements Savers_androidKtExternalSyntheticLambda5 {
    @Override // o.Savers_androidKtExternalSyntheticLambda5
    public void onExtraCallback() {
    }

    @Override // o.Savers_androidKtExternalSyntheticLambda5
    public void onNavigationEvent(int i2) {
    }

    @Override // o.Savers_androidKtExternalSyntheticLambda5
    public void onWarmupCompleted(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // o.Savers_androidKtExternalSyntheticLambda5
    public Bitmap onNavigationEvent(int i2, int i3, Bitmap.Config config) {
        return Bitmap.createBitmap(i2, i3, config);
    }

    @Override // o.Savers_androidKtExternalSyntheticLambda5
    public Bitmap onExtraCallbackWithResult(int i2, int i3, Bitmap.Config config) {
        return onNavigationEvent(i2, i3, config);
    }
}
