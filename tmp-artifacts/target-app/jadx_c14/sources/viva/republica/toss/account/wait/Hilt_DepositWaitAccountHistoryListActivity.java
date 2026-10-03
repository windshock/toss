package viva.republica.toss.account.wait;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.animate;
import o.captureEndValues;
import o.isTrue;
import o.writeTypedList;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_DepositWaitAccountHistoryListActivity extends BaseActivity {
    private boolean asInterface;

    Hilt_DepositWaitAccountHistoryListActivity() {
        this.asInterface = false;
        onNavigationEvent();
    }

    Hilt_DepositWaitAccountHistoryListActivity(int i) {
        super(i);
        this.asInterface = false;
        onNavigationEvent();
    }

    private void onNavigationEvent() {
        addOnContextAvailableListener(new writeTypedList() { // from class: viva.republica.toss.account.wait.Hilt_DepositWaitAccountHistoryListActivity.2
            public void onContextAvailable(Context context) {
                Hilt_DepositWaitAccountHistoryListActivity.this.aR_();
            }
        });
    }

    public void aR_() {
        if (this.asInterface) {
            return;
        }
        this.asInterface = true;
        ((isTrue) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).IAuthTabCallback((DepositWaitAccountHistoryListActivity) animate.onExtraCallbackWithResult(this));
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
