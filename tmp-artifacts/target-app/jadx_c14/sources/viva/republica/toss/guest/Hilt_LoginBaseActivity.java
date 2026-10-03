package viva.republica.toss.guest;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.access6000;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_LoginBaseActivity extends BaseActivity {
    private boolean onTransact;

    Hilt_LoginBaseActivity() {
        this.onTransact = false;
        onNavigationEvent();
    }

    Hilt_LoginBaseActivity(int i) {
        super(i);
        this.onTransact = false;
        onNavigationEvent();
    }

    private void onNavigationEvent() {
        addOnContextAvailableListener(new writeTypedList() { // from class: viva.republica.toss.guest.Hilt_LoginBaseActivity.1
            public void onContextAvailable(Context context) {
                Hilt_LoginBaseActivity.this.aR_();
            }
        });
    }

    public void aR_() {
        if (this.onTransact) {
            return;
        }
        this.onTransact = true;
        ((access6000) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onExtraCallback((LoginBaseActivity) animate.onExtraCallbackWithResult(this));
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
