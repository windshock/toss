package viva.republica.toss.send.overpossession;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.LifecycleEventListener;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_TransferOverPossessionReceiveActivity extends BaseActivity {
    private boolean asBinder;

    Hilt_TransferOverPossessionReceiveActivity() {
        this.asBinder = false;
        IAuthTabCallback();
    }

    Hilt_TransferOverPossessionReceiveActivity(int i) {
        super(i);
        this.asBinder = false;
        IAuthTabCallback();
    }

    private void IAuthTabCallback() {
        addOnContextAvailableListener(new writeTypedList() { // from class: viva.republica.toss.send.overpossession.Hilt_TransferOverPossessionReceiveActivity.2
            public void onContextAvailable(Context context) {
                Hilt_TransferOverPossessionReceiveActivity.this.aR_();
            }
        });
    }

    public void aR_() {
        if (this.asBinder) {
            return;
        }
        this.asBinder = true;
        ((LifecycleEventListener) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onExtraCallback((TransferOverPossessionReceiveActivity) animate.onExtraCallbackWithResult(this));
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
