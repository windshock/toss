package im.toss.features.credit.ui.plus.setting;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.animate;
import o.captureEndValues;
import o.stat;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_CreditPlusUnsubscribeCompletedActivity extends BaseActivity {
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private boolean asBinder;

    Hilt_CreditPlusUnsubscribeCompletedActivity() {
        this.asBinder = false;
        ICustomTabsServiceStub();
    }

    Hilt_CreditPlusUnsubscribeCompletedActivity(int i) {
        super(i);
        this.asBinder = false;
        ICustomTabsServiceStub();
    }

    private void ICustomTabsServiceStub() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.features.credit.ui.plus.setting.Hilt_CreditPlusUnsubscribeCompletedActivity.5
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 53;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Hilt_CreditPlusUnsubscribeCompletedActivity.this.aR_();
                if (i4 == 0) {
                    int i5 = 38 / 0;
                }
            }
        });
        int i2 = IAuthTabCallbackDefault + 81;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public void aR_() {
        int i = 2 % 2;
        if (!this.asBinder) {
            int i2 = IAuthTabCallbackDefault + 9;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            this.asBinder = true;
            ((stat) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onWarmupCompleted((CreditPlusUnsubscribeCompletedActivity) animate.onExtraCallbackWithResult(this));
        }
        int i4 = IAuthTabCallbackStub + 1;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public void onStart() {
        super.onStart();
    }

    public void onResume() {
        super.onResume();
    }

    public void onPause() {
        super.onPause();
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
