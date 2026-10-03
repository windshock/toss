package viva.republica.toss.inappupdate;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.animate;
import o.captureEndValues;
import o.withEasing;
import o.writeTypedList;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_InAppUpdateLauncherActivity extends BaseActivity {
    private boolean IAuthTabCallbackDefault;

    Hilt_InAppUpdateLauncherActivity() {
        this.IAuthTabCallbackDefault = false;
        onNavigationEvent();
    }

    Hilt_InAppUpdateLauncherActivity(int i) {
        super(i);
        this.IAuthTabCallbackDefault = false;
        onNavigationEvent();
    }

    private void onNavigationEvent() {
        addOnContextAvailableListener(new writeTypedList() { // from class: viva.republica.toss.inappupdate.Hilt_InAppUpdateLauncherActivity.3
            public void onContextAvailable(Context context) {
                Hilt_InAppUpdateLauncherActivity.this.aR_();
            }
        });
    }

    public void aR_() {
        if (this.IAuthTabCallbackDefault) {
            return;
        }
        this.IAuthTabCallbackDefault = true;
        ((withEasing) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onNavigationEvent((InAppUpdateLauncherActivity) animate.onExtraCallbackWithResult(this));
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
