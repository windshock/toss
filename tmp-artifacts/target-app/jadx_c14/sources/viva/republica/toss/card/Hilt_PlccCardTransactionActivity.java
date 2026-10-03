package viva.republica.toss.card;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.animate;
import o.captureEndValues;
import o.hasMoreTokens;
import o.writeTypedList;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_PlccCardTransactionActivity extends BaseActivity {
    private boolean onTransact;

    Hilt_PlccCardTransactionActivity() {
        this.onTransact = false;
        onNavigationEvent();
    }

    Hilt_PlccCardTransactionActivity(int i) {
        super(i);
        this.onTransact = false;
        onNavigationEvent();
    }

    private void onNavigationEvent() {
        addOnContextAvailableListener(new writeTypedList() { // from class: viva.republica.toss.card.Hilt_PlccCardTransactionActivity.2
            public void onContextAvailable(Context context) {
                Hilt_PlccCardTransactionActivity.this.aR_();
            }
        });
    }

    public void aR_() {
        if (this.onTransact) {
            return;
        }
        this.onTransact = true;
        ((hasMoreTokens) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onExtraCallbackWithResult((PlccCardTransactionActivity) animate.onExtraCallbackWithResult(this));
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
