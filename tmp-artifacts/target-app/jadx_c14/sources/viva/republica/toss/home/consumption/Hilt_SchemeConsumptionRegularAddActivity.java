package viva.republica.toss.home.consumption;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.animate;
import o.captureEndValues;
import o.setPanLimit;
import o.writeTypedList;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_SchemeConsumptionRegularAddActivity extends BaseActivity {
    private boolean asInterface;

    Hilt_SchemeConsumptionRegularAddActivity() {
        this.asInterface = false;
        onNavigationEvent();
    }

    Hilt_SchemeConsumptionRegularAddActivity(int i) {
        super(i);
        this.asInterface = false;
        onNavigationEvent();
    }

    private void onNavigationEvent() {
        addOnContextAvailableListener(new writeTypedList() { // from class: viva.republica.toss.home.consumption.Hilt_SchemeConsumptionRegularAddActivity.4
            public void onContextAvailable(Context context) {
                Hilt_SchemeConsumptionRegularAddActivity.this.aR_();
            }
        });
    }

    public void aR_() {
        if (this.asInterface) {
            return;
        }
        this.asInterface = true;
        ((setPanLimit) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onExtraCallback((SchemeConsumptionRegularAddActivity) animate.onExtraCallbackWithResult(this));
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
