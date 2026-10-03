package viva.republica.toss.account.group;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.animate;
import o.captureEndValues;
import o.fromByteArray;
import o.writeTypedList;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_SchemeGroupAccountActivity extends BaseActivity {
    private boolean asInterface;

    Hilt_SchemeGroupAccountActivity() {
        this.asInterface = false;
        IAuthTabCallback();
    }

    Hilt_SchemeGroupAccountActivity(int i) {
        super(i);
        this.asInterface = false;
        IAuthTabCallback();
    }

    private void IAuthTabCallback() {
        addOnContextAvailableListener(new writeTypedList() { // from class: viva.republica.toss.account.group.Hilt_SchemeGroupAccountActivity.2
            public void onContextAvailable(Context context) {
                Hilt_SchemeGroupAccountActivity.this.aR_();
            }
        });
    }

    public void aR_() {
        if (this.asInterface) {
            return;
        }
        this.asInterface = true;
        ((fromByteArray) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onWarmupCompleted((SchemeGroupAccountActivity) animate.onExtraCallbackWithResult(this));
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
