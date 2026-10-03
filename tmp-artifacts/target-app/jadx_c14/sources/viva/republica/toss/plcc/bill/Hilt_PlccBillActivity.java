package viva.republica.toss.plcc.bill;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_FLOAT1;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_PlccBillActivity extends BaseActivity {
    private boolean IAuthTabCallbackDefault;

    Hilt_PlccBillActivity() {
        this.IAuthTabCallbackDefault = false;
        onNavigationEvent();
    }

    Hilt_PlccBillActivity(int i) {
        super(i);
        this.IAuthTabCallbackDefault = false;
        onNavigationEvent();
    }

    private void onNavigationEvent() {
        addOnContextAvailableListener(new writeTypedList() { // from class: viva.republica.toss.plcc.bill.Hilt_PlccBillActivity.1
            public void onContextAvailable(Context context) {
                Hilt_PlccBillActivity.this.aR_();
            }
        });
    }

    public void aR_() {
        if (this.IAuthTabCallbackDefault) {
            return;
        }
        this.IAuthTabCallbackDefault = true;
        ((JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_FLOAT1) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onWarmupCompleted((PlccBillActivity) animate.onExtraCallbackWithResult(this));
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
