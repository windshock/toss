package viva.republica.toss.card.notification;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.animate;
import o.captureEndValues;
import o.getEncryptedKey;
import o.writeTypedList;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_CardNotificationFailedActivity extends BaseActivity {
    private boolean asInterface;

    Hilt_CardNotificationFailedActivity() {
        this.asInterface = false;
        IAuthTabCallback();
    }

    Hilt_CardNotificationFailedActivity(int i) {
        super(i);
        this.asInterface = false;
        IAuthTabCallback();
    }

    private void IAuthTabCallback() {
        addOnContextAvailableListener(new writeTypedList() { // from class: viva.republica.toss.card.notification.Hilt_CardNotificationFailedActivity.2
            public void onContextAvailable(Context context) {
                Hilt_CardNotificationFailedActivity.this.aR_();
            }
        });
    }

    public void aR_() {
        if (this.asInterface) {
            return;
        }
        this.asInterface = true;
        ((getEncryptedKey) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onExtraCallback((CardNotificationFailedActivity) animate.onExtraCallbackWithResult(this));
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
