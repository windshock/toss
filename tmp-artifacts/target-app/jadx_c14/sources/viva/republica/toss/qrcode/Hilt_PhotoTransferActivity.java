package viva.republica.toss.qrcode;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.JavaModuleWrapperCompanion;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_PhotoTransferActivity extends BaseActivity {
    private boolean asBinder;

    Hilt_PhotoTransferActivity() {
        this.asBinder = false;
        IAuthTabCallback();
    }

    Hilt_PhotoTransferActivity(int i) {
        super(i);
        this.asBinder = false;
        IAuthTabCallback();
    }

    private void IAuthTabCallback() {
        addOnContextAvailableListener(new writeTypedList() { // from class: viva.republica.toss.qrcode.Hilt_PhotoTransferActivity.2
            public void onContextAvailable(Context context) {
                Hilt_PhotoTransferActivity.this.aR_();
            }
        });
    }

    public void aR_() {
        if (this.asBinder) {
            return;
        }
        this.asBinder = true;
        ((JavaModuleWrapperCompanion) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).IAuthTabCallback((PhotoTransferActivity) animate.onExtraCallbackWithResult(this));
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
