package im.toss.feature.credit.ui.main.report;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.animate;
import o.captureEndValues;
import o.isLowPowerModeOn;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class Hilt_CreditHighInterestComparisonActivity extends BaseActivity {
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private boolean onTransact;

    Hilt_CreditHighInterestComparisonActivity() {
        this.onTransact = false;
        ICustomTabsServiceStub();
    }

    Hilt_CreditHighInterestComparisonActivity(int i) {
        super(i);
        this.onTransact = false;
        ICustomTabsServiceStub();
    }

    private void ICustomTabsServiceStub() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.feature.credit.ui.main.report.Hilt_CreditHighInterestComparisonActivity.4
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 53;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    Hilt_CreditHighInterestComparisonActivity.this.aR_();
                    int i4 = 2 / 0;
                } else {
                    Hilt_CreditHighInterestComparisonActivity.this.aR_();
                }
                int i5 = onNavigationEvent + 55;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 97 / 0;
                }
            }
        });
        int i2 = IAuthTabCallbackDefault + 111;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // im.toss.base.Hilt_BaseActivity
    public void aR_() {
        int i = 2 % 2;
        int i2 = asBinder + 71;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (!this.onTransact) {
            this.onTransact = true;
            ((isLowPowerModeOn) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onExtraCallbackWithResult((CreditHighInterestComparisonActivity) animate.onExtraCallbackWithResult(this));
        }
        int i3 = asBinder + 101;
        IAuthTabCallbackDefault = i3 % 128;
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
