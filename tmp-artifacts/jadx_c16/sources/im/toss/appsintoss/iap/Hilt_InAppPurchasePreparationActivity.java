package im.toss.appsintoss.iap;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda19;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_InAppPurchasePreparationActivity extends BaseActivity {
    private static int asBinder = 1;
    private static int asInterface;
    private boolean onTransact;

    Hilt_InAppPurchasePreparationActivity() {
        this.onTransact = false;
        onNavigationEvent();
    }

    Hilt_InAppPurchasePreparationActivity(int i) {
        super(i);
        this.onTransact = false;
        onNavigationEvent();
    }

    private void onNavigationEvent() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.appsintoss.iap.Hilt_InAppPurchasePreparationActivity.5
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 53;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    Hilt_InAppPurchasePreparationActivity.this.aR_();
                    int i4 = 6 / 0;
                } else {
                    Hilt_InAppPurchasePreparationActivity.this.aR_();
                }
                int i5 = onWarmupCompleted + 59;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = asBinder + 45;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    public void aR_() {
        int i = 2 % 2;
        int i2 = asBinder + 93;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            if (!this.onTransact) {
                this.onTransact = true;
                ((SafeActivityEmbeddingComponentProviderExternalSyntheticLambda19) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onExtraCallback((InAppPurchasePreparationActivity) animate.onExtraCallbackWithResult(this));
            }
            int i3 = asBinder + 47;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public void onStart() {
        super.onStart();
    }

    public void onResume() {
        super.onResume();
    }

    public void onPause() {
        super.onPause();
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
