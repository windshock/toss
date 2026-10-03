package viva.republica.toss.account.savingbox;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.BEROctetStringGenerator;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_SavingAccountEditActivity extends BaseActivity {
    private boolean asInterface;

    Hilt_SavingAccountEditActivity() {
        this.asInterface = false;
        onNavigationEvent();
    }

    Hilt_SavingAccountEditActivity(int i) {
        super(i);
        this.asInterface = false;
        onNavigationEvent();
    }

    private void onNavigationEvent() {
        addOnContextAvailableListener(new writeTypedList() { // from class: viva.republica.toss.account.savingbox.Hilt_SavingAccountEditActivity.5
            public void onContextAvailable(Context context) {
                Hilt_SavingAccountEditActivity.this.aR_();
            }
        });
    }

    public void aR_() {
        if (this.asInterface) {
            return;
        }
        this.asInterface = true;
        ((BEROctetStringGenerator) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onWarmupCompleted((SavingAccountEditActivity) animate.onExtraCallbackWithResult(this));
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
