package viva.republica.toss.account.group;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.ASN1Choice;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_InputEventAmountActivity extends BaseActivity {
    private boolean asBinder;

    Hilt_InputEventAmountActivity() {
        this.asBinder = false;
        onNavigationEvent();
    }

    Hilt_InputEventAmountActivity(int i) {
        super(i);
        this.asBinder = false;
        onNavigationEvent();
    }

    private void onNavigationEvent() {
        addOnContextAvailableListener(new writeTypedList() { // from class: viva.republica.toss.account.group.Hilt_InputEventAmountActivity.4
            public void onContextAvailable(Context context) {
                Hilt_InputEventAmountActivity.this.aR_();
            }
        });
    }

    public void aR_() {
        if (this.asBinder) {
            return;
        }
        this.asBinder = true;
        ((ASN1Choice) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onWarmupCompleted((InputEventAmountActivity) animate.onExtraCallbackWithResult(this));
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
