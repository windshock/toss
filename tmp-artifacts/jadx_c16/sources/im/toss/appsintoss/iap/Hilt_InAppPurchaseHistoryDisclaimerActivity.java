package im.toss.appsintoss.iap;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda10;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_InAppPurchaseHistoryDisclaimerActivity extends BaseActivity {
    private static int asInterface = 1;
    private static int onTransact;
    private boolean IAuthTabCallbackStub;

    Hilt_InAppPurchaseHistoryDisclaimerActivity() {
        this.IAuthTabCallbackStub = false;
        onNavigationEvent();
    }

    Hilt_InAppPurchaseHistoryDisclaimerActivity(int i) {
        super(i);
        this.IAuthTabCallbackStub = false;
        onNavigationEvent();
    }

    private void onNavigationEvent() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.appsintoss.iap.Hilt_InAppPurchaseHistoryDisclaimerActivity.2
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 69;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Hilt_InAppPurchaseHistoryDisclaimerActivity.this.aR_();
                int i5 = onWarmupCompleted + 5;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 45 / 0;
                }
            }
        });
        int i2 = onTransact + 111;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public void aR_() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 29;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        if (!(!this.IAuthTabCallbackStub)) {
            return;
        }
        int i5 = i2 + 49;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            this.IAuthTabCallbackStub = false;
        } else {
            this.IAuthTabCallbackStub = true;
        }
        ((SafeActivityEmbeddingComponentProviderExternalSyntheticLambda10) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onWarmupCompleted((InAppPurchaseHistoryDisclaimerActivity) animate.onExtraCallbackWithResult(this));
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
