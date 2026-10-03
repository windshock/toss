package viva.republica.toss.contact;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.UST_CERT_GetPathLength;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_AppBridgeSelectContactActivity extends BaseActivity {
    private boolean asInterface;

    Hilt_AppBridgeSelectContactActivity() {
        this.asInterface = false;
        IAuthTabCallback();
    }

    Hilt_AppBridgeSelectContactActivity(int i) {
        super(i);
        this.asInterface = false;
        IAuthTabCallback();
    }

    private void IAuthTabCallback() {
        addOnContextAvailableListener(new writeTypedList() { // from class: viva.republica.toss.contact.Hilt_AppBridgeSelectContactActivity.2
            public void onContextAvailable(Context context) {
                Hilt_AppBridgeSelectContactActivity.this.aR_();
            }
        });
    }

    public void aR_() {
        if (this.asInterface) {
            return;
        }
        this.asInterface = true;
        ((UST_CERT_GetPathLength) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).IAuthTabCallback((AppBridgeSelectContactActivity) animate.onExtraCallbackWithResult(this));
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
