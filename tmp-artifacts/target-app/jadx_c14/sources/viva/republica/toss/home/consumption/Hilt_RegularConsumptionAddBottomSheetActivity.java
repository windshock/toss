package viva.republica.toss.home.consumption;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_RegularConsumptionAddBottomSheetActivity extends BaseActivity {
    private boolean onTransact;

    Hilt_RegularConsumptionAddBottomSheetActivity() {
        this.onTransact = false;
        onNavigationEvent();
    }

    Hilt_RegularConsumptionAddBottomSheetActivity(int i) {
        super(i);
        this.onTransact = false;
        onNavigationEvent();
    }

    private void onNavigationEvent() {
        addOnContextAvailableListener(new writeTypedList() { // from class: viva.republica.toss.home.consumption.Hilt_RegularConsumptionAddBottomSheetActivity.1
            public void onContextAvailable(Context context) {
                Hilt_RegularConsumptionAddBottomSheetActivity.this.aR_();
            }
        });
    }

    public void aR_() {
        if (this.onTransact) {
            return;
        }
        this.onTransact = true;
        ((RegularConsumptionAddBottomSheetActivity_GeneratedInjector) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onNavigationEvent((RegularConsumptionAddBottomSheetActivity) animate.onExtraCallbackWithResult(this));
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
