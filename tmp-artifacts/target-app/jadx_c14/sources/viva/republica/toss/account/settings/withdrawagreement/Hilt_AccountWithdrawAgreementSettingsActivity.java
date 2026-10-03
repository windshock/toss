package viva.republica.toss.account.settings.withdrawagreement;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.BERSequence;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_AccountWithdrawAgreementSettingsActivity extends BaseActivity {
    private boolean asBinder;

    Hilt_AccountWithdrawAgreementSettingsActivity() {
        this.asBinder = false;
        IAuthTabCallback();
    }

    Hilt_AccountWithdrawAgreementSettingsActivity(int i) {
        super(i);
        this.asBinder = false;
        IAuthTabCallback();
    }

    private void IAuthTabCallback() {
        addOnContextAvailableListener(new writeTypedList() { // from class: viva.republica.toss.account.settings.withdrawagreement.Hilt_AccountWithdrawAgreementSettingsActivity.1
            public void onContextAvailable(Context context) {
                Hilt_AccountWithdrawAgreementSettingsActivity.this.aR_();
            }
        });
    }

    public void aR_() {
        if (this.asBinder) {
            return;
        }
        this.asBinder = true;
        ((BERSequence) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onExtraCallback((AccountWithdrawAgreementSettingsActivity) animate.onExtraCallbackWithResult(this));
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
