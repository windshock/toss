package viva.republica.toss.ads;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.DEROutputStream;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_PlayableAdsPlayerActivity extends BaseActivity {
    private boolean asBinder;

    Hilt_PlayableAdsPlayerActivity() {
        this.asBinder = false;
        IAuthTabCallback();
    }

    Hilt_PlayableAdsPlayerActivity(int i) {
        super(i);
        this.asBinder = false;
        IAuthTabCallback();
    }

    private void IAuthTabCallback() {
        addOnContextAvailableListener(new writeTypedList() { // from class: viva.republica.toss.ads.Hilt_PlayableAdsPlayerActivity.5
            public void onContextAvailable(Context context) {
                Hilt_PlayableAdsPlayerActivity.this.aR_();
            }
        });
    }

    public void aR_() {
        if (this.asBinder) {
            return;
        }
        this.asBinder = true;
        ((DEROutputStream) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onExtraCallbackWithResult((PlayableAdsPlayerActivity) animate.onExtraCallbackWithResult(this));
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
