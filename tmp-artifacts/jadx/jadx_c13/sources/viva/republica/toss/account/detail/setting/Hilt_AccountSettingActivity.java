package viva.republica.toss.account.detail.setting;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.animate;
import o.captureEndValues;
import o.endHalf;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class Hilt_AccountSettingActivity extends BaseActivity {
    private boolean asInterface;

    Hilt_AccountSettingActivity() {
        this.asInterface = false;
        onNavigationEvent();
    }

    Hilt_AccountSettingActivity(int i) {
        super(i);
        this.asInterface = false;
        onNavigationEvent();
    }

    private void onNavigationEvent() {
        addOnContextAvailableListener(new writeTypedList() { // from class: viva.republica.toss.account.detail.setting.Hilt_AccountSettingActivity.2
            public void onContextAvailable(Context context) {
                Hilt_AccountSettingActivity.this.aR_();
            }
        });
    }

    public void aR_() {
        if (this.asInterface) {
            return;
        }
        this.asInterface = true;
        ((endHalf) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onExtraCallbackWithResult((AccountSettingActivity) animate.onExtraCallbackWithResult(this));
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
