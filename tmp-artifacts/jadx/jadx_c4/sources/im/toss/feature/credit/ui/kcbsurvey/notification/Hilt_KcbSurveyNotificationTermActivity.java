package im.toss.feature.credit.ui.kcbsurvey.notification;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.animate;
import o.captureEndValues;
import o.h5SingleThreadExecutorForLogOpt;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class Hilt_KcbSurveyNotificationTermActivity extends BaseActivity {
    private static int asBinder = 1;
    private static int asInterface;
    private boolean IAuthTabCallbackStub;

    Hilt_KcbSurveyNotificationTermActivity() {
        this.IAuthTabCallbackStub = false;
        updateVisuals();
    }

    Hilt_KcbSurveyNotificationTermActivity(int i) {
        super(i);
        this.IAuthTabCallbackStub = false;
        updateVisuals();
    }

    private void updateVisuals() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.feature.credit.ui.kcbsurvey.notification.Hilt_KcbSurveyNotificationTermActivity.2
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 85;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    Hilt_KcbSurveyNotificationTermActivity.this.aR_();
                    throw null;
                }
                Hilt_KcbSurveyNotificationTermActivity.this.aR_();
                int i4 = onNavigationEvent + 15;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        int i2 = asInterface + 77;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 6 / 0;
        }
    }

    @Override // im.toss.base.Hilt_BaseActivity
    public void aR_() {
        int i = 2 % 2;
        int i2 = asBinder + 3;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            if (!this.IAuthTabCallbackStub) {
                this.IAuthTabCallbackStub = true;
                ((h5SingleThreadExecutorForLogOpt) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onExtraCallbackWithResult((KcbSurveyNotificationTermActivity) animate.onExtraCallbackWithResult(this));
            }
            int i3 = asBinder + 61;
            asInterface = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 78 / 0;
                return;
            }
            return;
        }
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
