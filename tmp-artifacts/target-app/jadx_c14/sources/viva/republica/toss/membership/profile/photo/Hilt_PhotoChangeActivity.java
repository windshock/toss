package viva.republica.toss.membership.profile.photo;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.animate;
import o.captureEndValues;
import o.getTestAdType;
import o.writeTypedList;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_PhotoChangeActivity extends BaseActivity {
    private boolean IAuthTabCallbackStub;

    Hilt_PhotoChangeActivity() {
        this.IAuthTabCallbackStub = false;
        IAuthTabCallback();
    }

    Hilt_PhotoChangeActivity(int i) {
        super(i);
        this.IAuthTabCallbackStub = false;
        IAuthTabCallback();
    }

    private void IAuthTabCallback() {
        addOnContextAvailableListener(new writeTypedList() { // from class: viva.republica.toss.membership.profile.photo.Hilt_PhotoChangeActivity.1
            public void onContextAvailable(Context context) {
                Hilt_PhotoChangeActivity.this.aR_();
            }
        });
    }

    public void aR_() {
        if (this.IAuthTabCallbackStub) {
            return;
        }
        this.IAuthTabCallbackStub = true;
        ((getTestAdType) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).IAuthTabCallback((PhotoChangeActivity) animate.onExtraCallbackWithResult(this));
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
