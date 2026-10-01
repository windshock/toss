package im.toss.feature.credit.ui.kcbsurvey;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.animate;
import o.captureEndValues;
import o.preRVInitializerOpt;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class Hilt_KcbSurveyConfirmExitActivity extends BaseActivity {
    private static int IAuthTabCallbackDefault = 0;
    private static int onTransact = 1;
    private boolean asInterface;

    Hilt_KcbSurveyConfirmExitActivity() {
        this.asInterface = false;
        updateVisuals();
    }

    Hilt_KcbSurveyConfirmExitActivity(int i) {
        super(i);
        this.asInterface = false;
        updateVisuals();
    }

    private void updateVisuals() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.feature.credit.ui.kcbsurvey.Hilt_KcbSurveyConfirmExitActivity.1
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 87;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    Hilt_KcbSurveyConfirmExitActivity.this.aR_();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Hilt_KcbSurveyConfirmExitActivity.this.aR_();
                int i4 = onNavigationEvent + 115;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 32 / 0;
                }
            }
        });
        int i2 = onTransact + 55;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 32 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    @Override // im.toss.base.Hilt_BaseActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void aR_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 105;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 97 / 0;
            if (!this.asInterface) {
                this.asInterface = true;
                ((preRVInitializerOpt) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onExtraCallbackWithResult((KcbSurveyConfirmExitActivity) animate.onExtraCallbackWithResult(this));
            }
        } else if (!this.asInterface) {
        }
        int i4 = onTransact + 125;
        IAuthTabCallbackDefault = i4 % 128;
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
