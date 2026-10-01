package im.toss.feature.credit.ui.kcbsurvey.result;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.animate;
import o.captureEndValues;
import o.getOptimizeConfig;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class Hilt_KcbSurveyResultActivity extends BaseActivity {
    private static int asBinder = 1;
    private static int onTransact;
    private boolean asInterface;

    Hilt_KcbSurveyResultActivity() {
        this.asInterface = false;
        IAuthTabCallback();
    }

    Hilt_KcbSurveyResultActivity(int i) {
        super(i);
        this.asInterface = false;
        IAuthTabCallback();
    }

    private void IAuthTabCallback() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.feature.credit.ui.kcbsurvey.result.Hilt_KcbSurveyResultActivity.1
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 53;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    Hilt_KcbSurveyResultActivity.this.aR_();
                    int i4 = 13 / 0;
                } else {
                    Hilt_KcbSurveyResultActivity.this.aR_();
                }
                int i5 = onNavigationEvent + 109;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = onTransact + 91;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // im.toss.base.Hilt_BaseActivity
    public void aR_() {
        int i = 2 % 2;
        int i2 = asBinder + 43;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (!this.asInterface) {
            this.asInterface = true;
            ((getOptimizeConfig) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).IAuthTabCallback((KcbSurveyResultActivity) animate.onExtraCallbackWithResult(this));
        }
        int i3 = asBinder + 41;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
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
