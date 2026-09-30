package im.toss.feature.credit.ui.kcbsurvey;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.animate;
import o.captureEndValues;
import o.setSwitchListener;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class Hilt_KcbSurveyIntroActivity extends BaseActivity {
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder;
    private boolean onTransact;

    Hilt_KcbSurveyIntroActivity() {
        this.onTransact = false;
        IAuthTabCallback();
    }

    Hilt_KcbSurveyIntroActivity(int i) {
        super(i);
        this.onTransact = false;
        IAuthTabCallback();
    }

    private void IAuthTabCallback() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.feature.credit.ui.kcbsurvey.Hilt_KcbSurveyIntroActivity.2
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 115;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Hilt_KcbSurveyIntroActivity.this.aR_();
                int i5 = onNavigationEvent + 91;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i2 = IAuthTabCallbackStub + 13;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // im.toss.base.Hilt_BaseActivity
    public void aR_() {
        int i = 2 % 2;
        if (!this.onTransact) {
            int i2 = asBinder + 43;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            this.onTransact = true;
            ((setSwitchListener) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).IAuthTabCallback((KcbSurveyIntroActivity) animate.onExtraCallbackWithResult(this));
            int i4 = asBinder + 95;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        }
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
