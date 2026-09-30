package viva.republica.toss.account.detail;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.OperationHelperV3a;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class Hilt_UnconnectedBankAccountBridgeActivity extends BaseActivity {
    private boolean asInterface;

    Hilt_UnconnectedBankAccountBridgeActivity() {
        this.asInterface = false;
        IAuthTabCallback();
    }

    Hilt_UnconnectedBankAccountBridgeActivity(int i) {
        super(i);
        this.asInterface = false;
        IAuthTabCallback();
    }

    private void IAuthTabCallback() {
        addOnContextAvailableListener(new writeTypedList() { // from class: viva.republica.toss.account.detail.Hilt_UnconnectedBankAccountBridgeActivity.1
            public void onContextAvailable(Context context) {
                Hilt_UnconnectedBankAccountBridgeActivity.this.aR_();
            }
        });
    }

    public void aR_() {
        if (this.asInterface) {
            return;
        }
        this.asInterface = true;
        ((OperationHelperV3a) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onExtraCallbackWithResult((UnconnectedBankAccountBridgeActivity) animate.onExtraCallbackWithResult(this));
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
