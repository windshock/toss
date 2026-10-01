package im.toss.feature.credit.ui.kcbsurvey;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.animate;
import o.captureEndValues;
import o.stackSampleInterval;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class Hilt_KcbSurveyLabActivity extends BaseActivity {
    private static int IAuthTabCallbackStub = 1;
    private static int onTransact;
    private boolean asInterface;

    Hilt_KcbSurveyLabActivity() {
        this.asInterface = false;
        updateVisuals();
    }

    Hilt_KcbSurveyLabActivity(int i) {
        super(i);
        this.asInterface = false;
        updateVisuals();
    }

    private void updateVisuals() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.feature.credit.ui.kcbsurvey.Hilt_KcbSurveyLabActivity.5
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 45;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Hilt_KcbSurveyLabActivity.this.aR_();
                int i5 = onWarmupCompleted + 77;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }
        });
        int i2 = IAuthTabCallbackStub + 79;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // im.toss.base.Hilt_BaseActivity
    public void aR_() {
        int i = 2 % 2;
        if (!this.asInterface) {
            this.asInterface = true;
            ((stackSampleInterval) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onNavigationEvent((KcbSurveyLabActivity) animate.onExtraCallbackWithResult(this));
            int i2 = onTransact + 79;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = onTransact + 115;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
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
