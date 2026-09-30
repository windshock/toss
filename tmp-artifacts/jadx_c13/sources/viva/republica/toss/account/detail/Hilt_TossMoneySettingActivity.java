package viva.republica.toss.account.detail;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.CommonOperation;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class Hilt_TossMoneySettingActivity extends BaseActivity {
    private boolean IAuthTabCallbackStub;

    Hilt_TossMoneySettingActivity() {
        this.IAuthTabCallbackStub = false;
        onNavigationEvent();
    }

    Hilt_TossMoneySettingActivity(int i) {
        super(i);
        this.IAuthTabCallbackStub = false;
        onNavigationEvent();
    }

    private void onNavigationEvent() {
        addOnContextAvailableListener(new writeTypedList() { // from class: viva.republica.toss.account.detail.Hilt_TossMoneySettingActivity.1
            public void onContextAvailable(Context context) {
                Hilt_TossMoneySettingActivity.this.aR_();
            }
        });
    }

    public void aR_() {
        if (this.IAuthTabCallbackStub) {
            return;
        }
        this.IAuthTabCallbackStub = true;
        ((CommonOperation) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onExtraCallback((TossMoneySettingActivity) animate.onExtraCallbackWithResult(this));
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
