package viva.republica.toss.guest.certify;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.animate;
import o.captureEndValues;
import o.doubleTapZoom;
import o.writeTypedList;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_CertifyGuestOcrActivity extends BaseActivity {
    private boolean IAuthTabCallbackStub;

    Hilt_CertifyGuestOcrActivity() {
        this.IAuthTabCallbackStub = false;
        onNavigationEvent();
    }

    Hilt_CertifyGuestOcrActivity(int i) {
        super(i);
        this.IAuthTabCallbackStub = false;
        onNavigationEvent();
    }

    private void onNavigationEvent() {
        addOnContextAvailableListener(new writeTypedList() { // from class: viva.republica.toss.guest.certify.Hilt_CertifyGuestOcrActivity.5
            public void onContextAvailable(Context context) {
                Hilt_CertifyGuestOcrActivity.this.aR_();
            }
        });
    }

    public void aR_() {
        if (this.IAuthTabCallbackStub) {
            return;
        }
        this.IAuthTabCallbackStub = true;
        ((doubleTapZoom) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onExtraCallback((CertifyGuestOcrActivity) animate.onExtraCallbackWithResult(this));
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
