package viva.republica.toss.guest;

import android.content.Context;
import android.os.Bundle;
import o.UrlBase64;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_ConfirmPasswordActivity extends LoginBaseActivity {
    private boolean IAuthTabCallbackDefault = false;

    Hilt_ConfirmPasswordActivity() {
        onNavigationEvent();
    }

    private void onNavigationEvent() {
        addOnContextAvailableListener(new writeTypedList() { // from class: viva.republica.toss.guest.Hilt_ConfirmPasswordActivity.2
            public void onContextAvailable(Context context) {
                Hilt_ConfirmPasswordActivity.this.aR_();
            }
        });
    }

    @Override // viva.republica.toss.guest.Hilt_LoginBaseActivity
    public void aR_() {
        if (this.IAuthTabCallbackDefault) {
            return;
        }
        this.IAuthTabCallbackDefault = true;
        ((UrlBase64) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onExtraCallbackWithResult((ConfirmPasswordActivity) animate.onExtraCallbackWithResult(this));
    }

    @Override // viva.republica.toss.guest.LoginBaseActivity, viva.republica.toss.guest.Hilt_LoginBaseActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // viva.republica.toss.guest.LoginBaseActivity, viva.republica.toss.guest.Hilt_LoginBaseActivity
    public void onStart() {
        super.onStart();
    }

    @Override // viva.republica.toss.guest.LoginBaseActivity, viva.republica.toss.guest.Hilt_LoginBaseActivity
    public void onResume() {
        super.onResume();
    }

    @Override // viva.republica.toss.guest.LoginBaseActivity, viva.republica.toss.guest.Hilt_LoginBaseActivity
    public void onPause() {
        super.onPause();
    }

    @Override // viva.republica.toss.guest.LoginBaseActivity, viva.republica.toss.guest.Hilt_LoginBaseActivity
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
