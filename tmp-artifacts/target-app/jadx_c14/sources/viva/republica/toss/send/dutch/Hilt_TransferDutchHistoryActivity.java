package viva.republica.toss.send.dutch;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.animate;
import o.captureEndValues;
import o.startSamplingProfiler;
import o.writeTypedList;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_TransferDutchHistoryActivity extends BaseActivity {
    private boolean IAuthTabCallbackDefault;

    Hilt_TransferDutchHistoryActivity() {
        this.IAuthTabCallbackDefault = false;
        IAuthTabCallback();
    }

    Hilt_TransferDutchHistoryActivity(int i) {
        super(i);
        this.IAuthTabCallbackDefault = false;
        IAuthTabCallback();
    }

    private void IAuthTabCallback() {
        addOnContextAvailableListener(new writeTypedList() { // from class: viva.republica.toss.send.dutch.Hilt_TransferDutchHistoryActivity.3
            public void onContextAvailable(Context context) {
                Hilt_TransferDutchHistoryActivity.this.aR_();
            }
        });
    }

    public void aR_() {
        if (this.IAuthTabCallbackDefault) {
            return;
        }
        this.IAuthTabCallbackDefault = true;
        ((startSamplingProfiler) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onWarmupCompleted((TransferDutchHistoryActivity) animate.onExtraCallbackWithResult(this));
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
