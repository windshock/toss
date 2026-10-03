package viva.republica.toss.cardrecommend.issuev2.ui;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.GOST3410ParamSetParameters;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_CardIssueFinCertSignActivity extends BaseActivity {
    private boolean IAuthTabCallbackDefault;

    Hilt_CardIssueFinCertSignActivity() {
        this.IAuthTabCallbackDefault = false;
        onNavigationEvent();
    }

    Hilt_CardIssueFinCertSignActivity(int i) {
        super(i);
        this.IAuthTabCallbackDefault = false;
        onNavigationEvent();
    }

    private void onNavigationEvent() {
        addOnContextAvailableListener(new writeTypedList() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.Hilt_CardIssueFinCertSignActivity.1
            public void onContextAvailable(Context context) {
                Hilt_CardIssueFinCertSignActivity.this.aR_();
            }
        });
    }

    public void aR_() {
        if (this.IAuthTabCallbackDefault) {
            return;
        }
        this.IAuthTabCallbackDefault = true;
        ((GOST3410ParamSetParameters) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).IAuthTabCallback((CardIssueFinCertSignActivity) animate.onExtraCallbackWithResult(this));
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
