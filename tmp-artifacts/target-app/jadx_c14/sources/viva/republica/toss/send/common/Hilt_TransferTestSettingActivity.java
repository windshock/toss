package viva.republica.toss.send.common;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.accessgetBackingMapp;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_TransferTestSettingActivity extends BaseActivity {
    private boolean asBinder;

    Hilt_TransferTestSettingActivity() {
        this.asBinder = false;
        IAuthTabCallback();
    }

    Hilt_TransferTestSettingActivity(int i) {
        super(i);
        this.asBinder = false;
        IAuthTabCallback();
    }

    private void IAuthTabCallback() {
        addOnContextAvailableListener(new writeTypedList() { // from class: viva.republica.toss.send.common.Hilt_TransferTestSettingActivity.2
            public void onContextAvailable(Context context) {
                Hilt_TransferTestSettingActivity.this.aR_();
            }
        });
    }

    public void aR_() {
        if (this.asBinder) {
            return;
        }
        this.asBinder = true;
        ((accessgetBackingMapp) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onExtraCallback((TransferTestSettingActivity) animate.onExtraCallbackWithResult(this));
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
