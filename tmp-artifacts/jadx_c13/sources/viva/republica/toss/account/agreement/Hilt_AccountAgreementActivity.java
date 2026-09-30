package viva.republica.toss.account.agreement;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.LogUtil;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class Hilt_AccountAgreementActivity extends BaseActivity {
    private boolean onTransact;

    Hilt_AccountAgreementActivity() {
        this.onTransact = false;
        onNavigationEvent();
    }

    Hilt_AccountAgreementActivity(int i) {
        super(i);
        this.onTransact = false;
        onNavigationEvent();
    }

    private void onNavigationEvent() {
        addOnContextAvailableListener(new writeTypedList() { // from class: viva.republica.toss.account.agreement.Hilt_AccountAgreementActivity.5
            public void onContextAvailable(Context context) {
                Hilt_AccountAgreementActivity.this.aR_();
            }
        });
    }

    public void aR_() {
        if (this.onTransact) {
            return;
        }
        this.onTransact = true;
        ((LogUtil) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onNavigationEvent((AccountAgreementActivity) animate.onExtraCallbackWithResult(this));
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
