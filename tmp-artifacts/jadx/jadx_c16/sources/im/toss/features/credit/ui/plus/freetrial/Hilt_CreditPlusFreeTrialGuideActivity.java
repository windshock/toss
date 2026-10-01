package im.toss.features.credit.ui.plus.freetrial;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.AudioMatcher7;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_CreditPlusFreeTrialGuideActivity extends BaseActivity {
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface;
    private boolean onTransact;

    Hilt_CreditPlusFreeTrialGuideActivity() {
        this.onTransact = false;
        updateVisuals();
    }

    Hilt_CreditPlusFreeTrialGuideActivity(int i) {
        super(i);
        this.onTransact = false;
        updateVisuals();
    }

    private void updateVisuals() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.features.credit.ui.plus.freetrial.Hilt_CreditPlusFreeTrialGuideActivity.1
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 49;
                onWarmupCompleted = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    Hilt_CreditPlusFreeTrialGuideActivity.this.aR_();
                    throw null;
                }
                Hilt_CreditPlusFreeTrialGuideActivity.this.aR_();
                int i4 = onWarmupCompleted + 3;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        });
        int i2 = asInterface + 95;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public void aR_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 87;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (!this.onTransact) {
            this.onTransact = true;
            ((AudioMatcher7) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).IAuthTabCallback((CreditPlusFreeTrialGuideActivity) animate.onExtraCallbackWithResult(this));
        }
        int i3 = asInterface + 71;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
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
