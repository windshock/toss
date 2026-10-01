package im.toss.feature.credit.ui.kcbsurvey;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.animate;
import o.captureEndValues;
import o.showReminderExtensionOptEnable;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class Hilt_KcbSurveySchemeActivity extends BaseActivity {
    private static int IAuthTabCallbackStub = 0;
    private static int onTransact = 1;
    private boolean asInterface;

    Hilt_KcbSurveySchemeActivity() {
        this.asInterface = false;
        onNavigationEvent();
    }

    Hilt_KcbSurveySchemeActivity(int i) {
        super(i);
        this.asInterface = false;
        onNavigationEvent();
    }

    private void onNavigationEvent() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.feature.credit.ui.kcbsurvey.Hilt_KcbSurveySchemeActivity.1
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 1;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Hilt_KcbSurveySchemeActivity.this.aR_();
                int i5 = onNavigationEvent + 41;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 64 / 0;
                }
            }
        });
        int i2 = onTransact + 115;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // im.toss.base.Hilt_BaseActivity
    public void aR_() {
        int i = 2 % 2;
        int i2 = onTransact + 91;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        if (!this.asInterface) {
            this.asInterface = true;
            ((showReminderExtensionOptEnable) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onExtraCallbackWithResult((KcbSurveySchemeActivity) animate.onExtraCallbackWithResult(this));
            int i4 = IAuthTabCallbackStub + 97;
            onTransact = i4 % 128;
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
