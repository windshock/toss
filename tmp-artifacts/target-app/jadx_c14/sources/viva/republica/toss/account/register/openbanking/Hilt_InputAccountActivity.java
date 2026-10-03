package viva.republica.toss.account.register.openbanking;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.BERGenerator;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_InputAccountActivity extends BaseActivity {
    private boolean asBinder;

    Hilt_InputAccountActivity() {
        this.asBinder = false;
        onNavigationEvent();
    }

    Hilt_InputAccountActivity(int i) {
        super(i);
        this.asBinder = false;
        onNavigationEvent();
    }

    private void onNavigationEvent() {
        addOnContextAvailableListener(new writeTypedList() { // from class: viva.republica.toss.account.register.openbanking.Hilt_InputAccountActivity.2
            public void onContextAvailable(Context context) {
                Hilt_InputAccountActivity.this.aR_();
            }
        });
    }

    public void aR_() {
        if (this.asBinder) {
            return;
        }
        this.asBinder = true;
        ((BERGenerator) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onExtraCallbackWithResult((InputAccountActivity) animate.onExtraCallbackWithResult(this));
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
