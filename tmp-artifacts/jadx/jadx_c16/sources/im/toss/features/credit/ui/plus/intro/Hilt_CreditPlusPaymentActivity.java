package im.toss.features.credit.ui.plus.intro;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.animate;
import o.canWrite;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_CreditPlusPaymentActivity extends BaseActivity {
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private boolean asBinder;

    Hilt_CreditPlusPaymentActivity() {
        this.asBinder = false;
        updateVisuals();
    }

    Hilt_CreditPlusPaymentActivity(int i) {
        super(i);
        this.asBinder = false;
        updateVisuals();
    }

    private void updateVisuals() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.features.credit.ui.plus.intro.Hilt_CreditPlusPaymentActivity.4
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 53;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Hilt_CreditPlusPaymentActivity.this.aR_();
                if (i4 != 0) {
                    int i5 = 48 / 0;
                }
            }
        });
        int i2 = IAuthTabCallbackStub + 75;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 68 / 0;
        }
    }

    public void aR_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 21;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 6 / 0;
            if (this.asBinder) {
                return;
            }
        } else if (this.asBinder) {
            return;
        }
        this.asBinder = true;
        ((canWrite) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onExtraCallback((CreditPlusPaymentActivity) animate.onExtraCallbackWithResult(this));
        int i4 = asInterface + 41;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
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
