package viva.republica.toss.account.notification;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.animate;
import o.captureEndValues;
import o.getOctetStream;
import o.writeTypedList;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_AccountNotificationSuggestActivity extends BaseActivity {
    private boolean IAuthTabCallbackDefault;

    Hilt_AccountNotificationSuggestActivity() {
        this.IAuthTabCallbackDefault = false;
        IAuthTabCallback();
    }

    Hilt_AccountNotificationSuggestActivity(int i) {
        super(i);
        this.IAuthTabCallbackDefault = false;
        IAuthTabCallback();
    }

    private void IAuthTabCallback() {
        addOnContextAvailableListener(new writeTypedList() { // from class: viva.republica.toss.account.notification.Hilt_AccountNotificationSuggestActivity.3
            public void onContextAvailable(Context context) {
                Hilt_AccountNotificationSuggestActivity.this.aR_();
            }
        });
    }

    public void aR_() {
        if (this.IAuthTabCallbackDefault) {
            return;
        }
        this.IAuthTabCallbackDefault = true;
        ((getOctetStream) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).IAuthTabCallback((AccountNotificationSuggestActivity) animate.onExtraCallbackWithResult(this));
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
