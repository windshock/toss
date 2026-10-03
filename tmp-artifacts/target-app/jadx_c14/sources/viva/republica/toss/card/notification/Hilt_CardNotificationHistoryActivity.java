package viva.republica.toss.card.notification;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.KEKRecipientInfo;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_CardNotificationHistoryActivity extends BaseActivity {
    private boolean asInterface;

    Hilt_CardNotificationHistoryActivity() {
        this.asInterface = false;
        IAuthTabCallback();
    }

    Hilt_CardNotificationHistoryActivity(int i) {
        super(i);
        this.asInterface = false;
        IAuthTabCallback();
    }

    private void IAuthTabCallback() {
        addOnContextAvailableListener(new writeTypedList() { // from class: viva.republica.toss.card.notification.Hilt_CardNotificationHistoryActivity.5
            public void onContextAvailable(Context context) {
                Hilt_CardNotificationHistoryActivity.this.aR_();
            }
        });
    }

    public void aR_() {
        if (this.asInterface) {
            return;
        }
        this.asInterface = true;
        ((KEKRecipientInfo) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onWarmupCompleted((CardNotificationHistoryActivity) animate.onExtraCallbackWithResult(this));
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
