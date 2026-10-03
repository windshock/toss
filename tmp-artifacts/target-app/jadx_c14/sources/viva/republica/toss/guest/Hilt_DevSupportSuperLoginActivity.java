package viva.republica.toss.guest;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.Streams;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
abstract class Hilt_DevSupportSuperLoginActivity extends BaseActivity {
    private boolean onTransact;

    Hilt_DevSupportSuperLoginActivity() {
        this.onTransact = false;
        onNavigationEvent();
    }

    Hilt_DevSupportSuperLoginActivity(int i) {
        super(i);
        this.onTransact = false;
        onNavigationEvent();
    }

    private void onNavigationEvent() {
        addOnContextAvailableListener(new writeTypedList() { // from class: viva.republica.toss.guest.Hilt_DevSupportSuperLoginActivity.5
            public void onContextAvailable(Context context) {
                Hilt_DevSupportSuperLoginActivity.this.aR_();
            }
        });
    }

    public void aR_() {
        if (this.onTransact) {
            return;
        }
        this.onTransact = true;
        ((Streams) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onNavigationEvent((DevSupportSuperLoginActivity) animate.onExtraCallbackWithResult(this));
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
