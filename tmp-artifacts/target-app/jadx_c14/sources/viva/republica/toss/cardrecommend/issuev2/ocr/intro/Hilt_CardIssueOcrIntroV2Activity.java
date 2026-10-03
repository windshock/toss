package viva.republica.toss.cardrecommend.issuev2.ocr.intro;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.animate;
import o.captureEndValues;
import o.getDigestEncryptionAlgorithm;
import o.writeTypedList;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_CardIssueOcrIntroV2Activity extends BaseActivity {
    private boolean IAuthTabCallbackDefault;

    Hilt_CardIssueOcrIntroV2Activity() {
        this.IAuthTabCallbackDefault = false;
        IAuthTabCallback();
    }

    Hilt_CardIssueOcrIntroV2Activity(int i) {
        super(i);
        this.IAuthTabCallbackDefault = false;
        IAuthTabCallback();
    }

    private void IAuthTabCallback() {
        addOnContextAvailableListener(new writeTypedList() { // from class: viva.republica.toss.cardrecommend.issuev2.ocr.intro.Hilt_CardIssueOcrIntroV2Activity.2
            public void onContextAvailable(Context context) {
                Hilt_CardIssueOcrIntroV2Activity.this.aR_();
            }
        });
    }

    public void aR_() {
        if (this.IAuthTabCallbackDefault) {
            return;
        }
        this.IAuthTabCallbackDefault = true;
        ((getDigestEncryptionAlgorithm) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onWarmupCompleted((CardIssueOcrIntroV2Activity) animate.onExtraCallbackWithResult(this));
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
