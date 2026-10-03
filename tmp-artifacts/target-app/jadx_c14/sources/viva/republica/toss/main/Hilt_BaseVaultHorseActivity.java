package viva.republica.toss.main;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.SubsamplingScaleImageViewOnStateChangedListener;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_BaseVaultHorseActivity extends BaseActivity {
    private boolean asBinder;

    Hilt_BaseVaultHorseActivity() {
        this.asBinder = false;
        IAuthTabCallback();
    }

    Hilt_BaseVaultHorseActivity(int i) {
        super(i);
        this.asBinder = false;
        IAuthTabCallback();
    }

    private void IAuthTabCallback() {
        addOnContextAvailableListener(new writeTypedList() { // from class: viva.republica.toss.main.Hilt_BaseVaultHorseActivity.3
            public void onContextAvailable(Context context) {
                Hilt_BaseVaultHorseActivity.this.aR_();
            }
        });
    }

    public void aR_() {
        if (this.asBinder) {
            return;
        }
        this.asBinder = true;
        ((SubsamplingScaleImageViewOnStateChangedListener) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).IAuthTabCallback((BaseVaultHorseActivity) animate.onExtraCallbackWithResult(this));
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
