package viva.republica.toss.account.notification.join;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.ASN1Sequence;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_AccountNotificationJoinActivity extends BaseActivity {
    private boolean asBinder;

    Hilt_AccountNotificationJoinActivity() {
        this.asBinder = false;
        onNavigationEvent();
    }

    Hilt_AccountNotificationJoinActivity(int i) {
        super(i);
        this.asBinder = false;
        onNavigationEvent();
    }

    private void onNavigationEvent() {
        addOnContextAvailableListener(new writeTypedList() { // from class: viva.republica.toss.account.notification.join.Hilt_AccountNotificationJoinActivity.1
            public void onContextAvailable(Context context) {
                Hilt_AccountNotificationJoinActivity.this.aR_();
            }
        });
    }

    public void aR_() {
        if (this.asBinder) {
            return;
        }
        this.asBinder = true;
        ((ASN1Sequence) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).IAuthTabCallback((AccountNotificationJoinActivity) animate.onExtraCallbackWithResult(this));
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
