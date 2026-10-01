package im.toss.feature.credit.ui.history.detail.latest;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.adNewPageExtensionOptEnable;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class Hilt_CreditHistoryLoanDisclaimerActivity extends BaseActivity {
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder;
    private boolean onTransact;

    Hilt_CreditHistoryLoanDisclaimerActivity() {
        this.onTransact = false;
        onNavigationEvent();
    }

    Hilt_CreditHistoryLoanDisclaimerActivity(int i) {
        super(i);
        this.onTransact = false;
        onNavigationEvent();
    }

    private void onNavigationEvent() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.feature.credit.ui.history.detail.latest.Hilt_CreditHistoryLoanDisclaimerActivity.4
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 81;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    Hilt_CreditHistoryLoanDisclaimerActivity.this.aR_();
                    int i4 = 41 / 0;
                } else {
                    Hilt_CreditHistoryLoanDisclaimerActivity.this.aR_();
                }
                int i5 = IAuthTabCallback + 41;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 38 / 0;
                }
            }
        });
        int i2 = asBinder + 53;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // im.toss.base.Hilt_BaseActivity
    public void aR_() {
        int i = 2 % 2;
        if (!this.onTransact) {
            int i2 = asBinder + 41;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                this.onTransact = false;
            } else {
                this.onTransact = true;
            }
            ((adNewPageExtensionOptEnable) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onExtraCallbackWithResult((CreditHistoryLoanDisclaimerActivity) animate.onExtraCallbackWithResult(this));
        }
        int i3 = asBinder + 29;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
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
