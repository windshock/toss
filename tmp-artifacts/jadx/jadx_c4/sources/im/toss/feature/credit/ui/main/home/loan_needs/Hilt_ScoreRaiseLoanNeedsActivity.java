package im.toss.feature.credit.ui.main.home.loan_needs;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.RuntimeUtils;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class Hilt_ScoreRaiseLoanNeedsActivity extends BaseActivity {
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface;
    private boolean onTransact;

    Hilt_ScoreRaiseLoanNeedsActivity() {
        this.onTransact = false;
        IAuthTabCallback();
    }

    Hilt_ScoreRaiseLoanNeedsActivity(int i) {
        super(i);
        this.onTransact = false;
        IAuthTabCallback();
    }

    private void IAuthTabCallback() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.feature.credit.ui.main.home.loan_needs.Hilt_ScoreRaiseLoanNeedsActivity.3
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 25;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Hilt_ScoreRaiseLoanNeedsActivity.this.aR_();
                int i5 = onNavigationEvent + 101;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }
        });
        int i2 = IAuthTabCallbackStub + 119;
        asInterface = i2 % 128;
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
        int i2 = IAuthTabCallbackStub + 67;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        if (this.onTransact) {
            return;
        }
        int i5 = i3 + 73;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        this.onTransact = true;
        ((RuntimeUtils) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onWarmupCompleted((ScoreRaiseLoanNeedsActivity) animate.onExtraCallbackWithResult(this));
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
