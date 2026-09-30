package im.toss.feature.credit.ui.kcbsurvey;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.animate;
import o.captureEndValues;
import o.runtimeSampler;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class Hilt_KcbSurveyErrorActivity extends BaseActivity {
    private static int asBinder = 1;
    private static int asInterface;
    private boolean onTransact;

    Hilt_KcbSurveyErrorActivity() {
        this.onTransact = false;
        updateVisuals();
    }

    Hilt_KcbSurveyErrorActivity(int i) {
        super(i);
        this.onTransact = false;
        updateVisuals();
    }

    private void updateVisuals() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.feature.credit.ui.kcbsurvey.Hilt_KcbSurveyErrorActivity.2
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 19;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Hilt_KcbSurveyErrorActivity.this.aR_();
                if (i4 != 0) {
                    int i5 = 46 / 0;
                }
            }
        });
        int i2 = asBinder + 15;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // im.toss.base.Hilt_BaseActivity
    public void aR_() {
        int i = 2 % 2;
        int i2 = asBinder + 5;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 5 / 0;
            if (!(!this.onTransact)) {
                return;
            }
        } else if (!(!this.onTransact)) {
            return;
        }
        this.onTransact = true;
        ((runtimeSampler) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onExtraCallbackWithResult((KcbSurveyErrorActivity) animate.onExtraCallbackWithResult(this));
        int i4 = asBinder + 61;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onCreate(Bundle bundle) throws Throwable {
        super.onCreate(bundle);
    }

    @Override // im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onStart() {
        super.onStart();
    }

    @Override // im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onResume() {
        super.onResume();
    }

    @Override // im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onPause() {
        super.onPause();
    }

    @Override // im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
