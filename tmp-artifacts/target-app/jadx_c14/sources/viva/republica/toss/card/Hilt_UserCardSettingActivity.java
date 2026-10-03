package viva.republica.toss.card;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.AttributeTable;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_UserCardSettingActivity extends BaseActivity {
    private boolean onTransact;

    Hilt_UserCardSettingActivity() {
        this.onTransact = false;
        onNavigationEvent();
    }

    Hilt_UserCardSettingActivity(int i) {
        super(i);
        this.onTransact = false;
        onNavigationEvent();
    }

    private void onNavigationEvent() {
        addOnContextAvailableListener(new writeTypedList() { // from class: viva.republica.toss.card.Hilt_UserCardSettingActivity.5
            public void onContextAvailable(Context context) {
                Hilt_UserCardSettingActivity.this.aR_();
            }
        });
    }

    public void aR_() {
        if (this.onTransact) {
            return;
        }
        this.onTransact = true;
        ((AttributeTable) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).IAuthTabCallback((UserCardSettingActivity) animate.onExtraCallbackWithResult(this));
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
