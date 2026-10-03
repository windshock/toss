package viva.republica.toss.send.dutch;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.animate;
import o.captureEndValues;
import o.getJSModuleName;
import o.writeTypedList;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_TransferDutchInviteActivity extends BaseActivity {
    private boolean onTransact;

    Hilt_TransferDutchInviteActivity() {
        this.onTransact = false;
        onNavigationEvent();
    }

    Hilt_TransferDutchInviteActivity(int i) {
        super(i);
        this.onTransact = false;
        onNavigationEvent();
    }

    private void onNavigationEvent() {
        addOnContextAvailableListener(new writeTypedList() { // from class: viva.republica.toss.send.dutch.Hilt_TransferDutchInviteActivity.1
            public void onContextAvailable(Context context) {
                Hilt_TransferDutchInviteActivity.this.aR_();
            }
        });
    }

    public void aR_() {
        if (this.onTransact) {
            return;
        }
        this.onTransact = true;
        ((getJSModuleName) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onExtraCallbackWithResult((TransferDutchInviteActivity) animate.onExtraCallbackWithResult(this));
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
