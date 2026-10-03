package viva.republica.toss.guest.certify;

import android.content.Context;
import android.os.Bundle;
import o.animate;
import o.captureEndValues;
import o.ease;
import o.writeTypedList;
import viva.republica.toss.guest.LoginBaseActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_CertifyGuestActivity extends LoginBaseActivity {
    private boolean asInterface = false;

    Hilt_CertifyGuestActivity() {
        IAuthTabCallback();
    }

    private void IAuthTabCallback() {
        addOnContextAvailableListener(new writeTypedList() { // from class: viva.republica.toss.guest.certify.Hilt_CertifyGuestActivity.5
            public void onContextAvailable(Context context) {
                Hilt_CertifyGuestActivity.this.aR_();
            }
        });
    }

    @Override // viva.republica.toss.guest.Hilt_LoginBaseActivity
    public void aR_() {
        if (this.asInterface) {
            return;
        }
        this.asInterface = true;
        ((ease) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onNavigationEvent((CertifyGuestActivity) animate.onExtraCallbackWithResult(this));
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
