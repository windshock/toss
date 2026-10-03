package viva.republica.toss.send;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.JavaOnlyArrayCompanionWhenMappings;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_SendActivity extends BaseActivity {
    private boolean asInterface;

    Hilt_SendActivity() {
        this.asInterface = false;
        onNavigationEvent();
    }

    Hilt_SendActivity(int i) {
        super(i);
        this.asInterface = false;
        onNavigationEvent();
    }

    private void onNavigationEvent() {
        addOnContextAvailableListener(new writeTypedList() { // from class: viva.republica.toss.send.Hilt_SendActivity.5
            public void onContextAvailable(Context context) {
                Hilt_SendActivity.this.aR_();
            }
        });
    }

    public void aR_() {
        if (this.asInterface) {
            return;
        }
        this.asInterface = true;
        ((JavaOnlyArrayCompanionWhenMappings) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onNavigationEvent((SendActivity) animate.onExtraCallbackWithResult(this));
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
