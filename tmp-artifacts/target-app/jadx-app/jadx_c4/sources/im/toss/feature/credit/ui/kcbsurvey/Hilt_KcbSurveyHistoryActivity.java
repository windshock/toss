package im.toss.feature.credit.ui.kcbsurvey;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.animate;
import o.captureEndValues;
import o.runtimeSamplerThreshold;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class Hilt_KcbSurveyHistoryActivity extends BaseActivity {
    private static int asInterface = 1;
    private static int onTransact;
    private boolean asBinder;

    Hilt_KcbSurveyHistoryActivity() {
        this.asBinder = false;
        ICustomTabsServiceStub();
    }

    Hilt_KcbSurveyHistoryActivity(int i) {
        super(i);
        this.asBinder = false;
        ICustomTabsServiceStub();
    }

    private void ICustomTabsServiceStub() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.feature.credit.ui.kcbsurvey.Hilt_KcbSurveyHistoryActivity.4
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 49;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Hilt_KcbSurveyHistoryActivity.this.aR_();
                int i5 = IAuthTabCallback + 103;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }
        });
        int i2 = onTransact + 115;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // im.toss.base.Hilt_BaseActivity
    public void aR_() {
        int i = 2 % 2;
        if (!this.asBinder) {
            int i2 = asInterface + 121;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            this.asBinder = true;
            ((runtimeSamplerThreshold) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onWarmupCompleted((KcbSurveyHistoryActivity) animate.onExtraCallbackWithResult(this));
        }
        int i4 = asInterface + 47;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
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
