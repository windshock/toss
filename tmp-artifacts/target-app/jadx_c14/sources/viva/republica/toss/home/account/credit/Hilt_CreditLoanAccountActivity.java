package viva.republica.toss.home.account.credit;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.animate;
import o.captureEndValues;
import o.setMinScale;
import o.writeTypedList;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_CreditLoanAccountActivity extends BaseActivity {
    private boolean IAuthTabCallbackStub;

    Hilt_CreditLoanAccountActivity() {
        this.IAuthTabCallbackStub = false;
        IAuthTabCallback();
    }

    Hilt_CreditLoanAccountActivity(int i) {
        super(i);
        this.IAuthTabCallbackStub = false;
        IAuthTabCallback();
    }

    private void IAuthTabCallback() {
        addOnContextAvailableListener(new writeTypedList() { // from class: viva.republica.toss.home.account.credit.Hilt_CreditLoanAccountActivity.5
            public void onContextAvailable(Context context) {
                Hilt_CreditLoanAccountActivity.this.aR_();
            }
        });
    }

    public void aR_() {
        if (this.IAuthTabCallbackStub) {
            return;
        }
        this.IAuthTabCallbackStub = true;
        ((setMinScale) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onNavigationEvent((CreditLoanAccountActivity) animate.onExtraCallbackWithResult(this));
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
