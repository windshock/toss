package viva.republica.toss.dashboard.onboarding;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.UST_PKCS5_PBKDF;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_TeensOnboardingTutorialActivity extends BaseActivity {
    private boolean IAuthTabCallbackStub;

    Hilt_TeensOnboardingTutorialActivity() {
        this.IAuthTabCallbackStub = false;
        onNavigationEvent();
    }

    Hilt_TeensOnboardingTutorialActivity(int i) {
        super(i);
        this.IAuthTabCallbackStub = false;
        onNavigationEvent();
    }

    private void onNavigationEvent() {
        addOnContextAvailableListener(new writeTypedList() { // from class: viva.republica.toss.dashboard.onboarding.Hilt_TeensOnboardingTutorialActivity.1
            public void onContextAvailable(Context context) {
                Hilt_TeensOnboardingTutorialActivity.this.aR_();
            }
        });
    }

    public void aR_() {
        if (this.IAuthTabCallbackStub) {
            return;
        }
        this.IAuthTabCallbackStub = true;
        ((UST_PKCS5_PBKDF) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onExtraCallbackWithResult((TeensOnboardingTutorialActivity) animate.onExtraCallbackWithResult(this));
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
