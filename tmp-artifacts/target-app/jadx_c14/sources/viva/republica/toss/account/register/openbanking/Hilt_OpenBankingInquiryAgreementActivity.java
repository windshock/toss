package viva.republica.toss.account.register.openbanking;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.BEROctetStringGeneratora;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_OpenBankingInquiryAgreementActivity extends BaseActivity {
    private boolean asBinder;

    Hilt_OpenBankingInquiryAgreementActivity() {
        this.asBinder = false;
        onNavigationEvent();
    }

    Hilt_OpenBankingInquiryAgreementActivity(int i) {
        super(i);
        this.asBinder = false;
        onNavigationEvent();
    }

    private void onNavigationEvent() {
        addOnContextAvailableListener(new writeTypedList() { // from class: viva.republica.toss.account.register.openbanking.Hilt_OpenBankingInquiryAgreementActivity.2
            public void onContextAvailable(Context context) {
                Hilt_OpenBankingInquiryAgreementActivity.this.aR_();
            }
        });
    }

    public void aR_() {
        if (this.asBinder) {
            return;
        }
        this.asBinder = true;
        ((BEROctetStringGeneratora) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onNavigationEvent((OpenBankingInquiryAgreementActivity) animate.onExtraCallbackWithResult(this));
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
