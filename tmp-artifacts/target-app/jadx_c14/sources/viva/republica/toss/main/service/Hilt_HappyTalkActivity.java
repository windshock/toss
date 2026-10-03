package viva.republica.toss.main.service;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.animate;
import o.captureEndValues;
import o.onAdEvent;
import o.writeTypedList;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_HappyTalkActivity extends BaseActivity {
    private boolean onTransact;

    Hilt_HappyTalkActivity() {
        this.onTransact = false;
        onNavigationEvent();
    }

    Hilt_HappyTalkActivity(int i) {
        super(i);
        this.onTransact = false;
        onNavigationEvent();
    }

    private void onNavigationEvent() {
        addOnContextAvailableListener(new writeTypedList() { // from class: viva.republica.toss.main.service.Hilt_HappyTalkActivity.2
            public void onContextAvailable(Context context) {
                Hilt_HappyTalkActivity.this.aR_();
            }
        });
    }

    public void aR_() {
        if (this.onTransact) {
            return;
        }
        this.onTransact = true;
        ((onAdEvent) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).IAuthTabCallback((HappyTalkActivity) animate.onExtraCallbackWithResult(this));
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
