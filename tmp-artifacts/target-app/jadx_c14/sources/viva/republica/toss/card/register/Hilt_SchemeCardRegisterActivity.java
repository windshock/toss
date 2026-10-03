package viva.republica.toss.card.register;

import android.content.Context;
import android.os.Bundle;
import o.animate;
import o.captureEndValues;
import o.getRecipientEncryptedKeys;
import o.writeTypedList;
import viva.republica.toss.card.CardBaseActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_SchemeCardRegisterActivity extends CardBaseActivity {
    private boolean asBinder = false;

    Hilt_SchemeCardRegisterActivity() {
        IAuthTabCallback();
    }

    private void IAuthTabCallback() {
        addOnContextAvailableListener(new writeTypedList() { // from class: viva.republica.toss.card.register.Hilt_SchemeCardRegisterActivity.1
            public void onContextAvailable(Context context) {
                Hilt_SchemeCardRegisterActivity.this.aR_();
            }
        });
    }

    public void aR_() {
        if (this.asBinder) {
            return;
        }
        this.asBinder = true;
        ((getRecipientEncryptedKeys) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onExtraCallbackWithResult((SchemeCardRegisterActivity) animate.onExtraCallbackWithResult(this));
    }

    @Override // viva.republica.toss.card.CardBaseActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // viva.republica.toss.card.CardBaseActivity
    public void onStart() {
        super.onStart();
    }

    @Override // viva.republica.toss.card.CardBaseActivity
    public void onResume() {
        super.onResume();
    }

    @Override // viva.republica.toss.card.CardBaseActivity
    public void onPause() {
        super.onPause();
    }

    @Override // viva.republica.toss.card.CardBaseActivity
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
