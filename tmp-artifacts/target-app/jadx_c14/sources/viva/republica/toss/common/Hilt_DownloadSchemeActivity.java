package viva.republica.toss.common;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.AttCertIssuer;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_DownloadSchemeActivity extends BaseActivity {
    private boolean IAuthTabCallbackDefault;

    Hilt_DownloadSchemeActivity() {
        this.IAuthTabCallbackDefault = false;
        onNavigationEvent();
    }

    Hilt_DownloadSchemeActivity(int i) {
        super(i);
        this.IAuthTabCallbackDefault = false;
        onNavigationEvent();
    }

    private void onNavigationEvent() {
        addOnContextAvailableListener(new writeTypedList() { // from class: viva.republica.toss.common.Hilt_DownloadSchemeActivity.4
            public void onContextAvailable(Context context) {
                Hilt_DownloadSchemeActivity.this.aR_();
            }
        });
    }

    public void aR_() {
        if (this.IAuthTabCallbackDefault) {
            return;
        }
        this.IAuthTabCallbackDefault = true;
        ((AttCertIssuer) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onExtraCallback((DownloadSchemeActivity) animate.onExtraCallbackWithResult(this));
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
