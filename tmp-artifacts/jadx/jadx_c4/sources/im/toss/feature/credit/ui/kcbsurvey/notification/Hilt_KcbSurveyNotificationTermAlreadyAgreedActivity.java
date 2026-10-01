package im.toss.feature.credit.ui.kcbsurvey.notification;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.animate;
import o.captureEndValues;
import o.h5AppDownloadManagerV2Opt;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class Hilt_KcbSurveyNotificationTermAlreadyAgreedActivity extends BaseActivity {
    private static int asInterface = 0;
    private static int onTransact = 1;
    private boolean asBinder;

    Hilt_KcbSurveyNotificationTermAlreadyAgreedActivity() {
        this.asBinder = false;
        updateVisuals();
    }

    Hilt_KcbSurveyNotificationTermAlreadyAgreedActivity(int i) {
        super(i);
        this.asBinder = false;
        updateVisuals();
    }

    private void updateVisuals() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.feature.credit.ui.kcbsurvey.notification.Hilt_KcbSurveyNotificationTermAlreadyAgreedActivity.1
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 95;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    Hilt_KcbSurveyNotificationTermAlreadyAgreedActivity.this.aR_();
                    throw null;
                }
                Hilt_KcbSurveyNotificationTermAlreadyAgreedActivity.this.aR_();
                int i4 = onWarmupCompleted + 93;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 47 / 0;
                }
            }
        });
        int i2 = onTransact + 59;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // im.toss.base.Hilt_BaseActivity
    public void aR_() {
        int i = 2 % 2;
        int i2 = asInterface + 55;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        if (!(!this.asBinder)) {
            return;
        }
        int i5 = i3 + 49;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        this.asBinder = true;
        ((h5AppDownloadManagerV2Opt) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).IAuthTabCallback((KcbSurveyNotificationTermAlreadyAgreedActivity) animate.onExtraCallbackWithResult(this));
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
