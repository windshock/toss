package im.toss.feature.credit.ui.main.intro;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.MemoryGradeJudgement;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class Hilt_CreditIntroActivity extends BaseActivity {
    private static int IAuthTabCallbackDefault = 1;
    private static int onTransact;
    private boolean asBinder;

    Hilt_CreditIntroActivity() {
        this.asBinder = false;
        onNavigationEvent();
    }

    Hilt_CreditIntroActivity(int i) {
        super(i);
        this.asBinder = false;
        onNavigationEvent();
    }

    private void onNavigationEvent() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.feature.credit.ui.main.intro.Hilt_CreditIntroActivity.2
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 9;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Hilt_CreditIntroActivity.this.aR_();
                if (i4 == 0) {
                    int i5 = 60 / 0;
                }
            }
        });
        int i2 = IAuthTabCallbackDefault + 9;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.base.Hilt_BaseActivity
    public void aR_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 63;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        if (this.asBinder) {
            return;
        }
        int i5 = i2 + 81;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        this.asBinder = true;
        ((MemoryGradeJudgement) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onWarmupCompleted((CreditIntroActivity) animate.onExtraCallbackWithResult(this));
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
