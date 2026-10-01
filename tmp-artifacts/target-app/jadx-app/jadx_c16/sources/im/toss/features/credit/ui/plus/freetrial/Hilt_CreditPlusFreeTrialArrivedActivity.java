package im.toss.features.credit.ui.plus.freetrial;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.AudioMatcher6;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_CreditPlusFreeTrialArrivedActivity extends BaseActivity {
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder;
    private boolean asInterface;

    Hilt_CreditPlusFreeTrialArrivedActivity() {
        this.asInterface = false;
        ICustomTabsServiceStub();
    }

    Hilt_CreditPlusFreeTrialArrivedActivity(int i) {
        super(i);
        this.asInterface = false;
        ICustomTabsServiceStub();
    }

    private void ICustomTabsServiceStub() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.features.credit.ui.plus.freetrial.Hilt_CreditPlusFreeTrialArrivedActivity.1
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 53;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Hilt_CreditPlusFreeTrialArrivedActivity.this.aR_();
                int i5 = IAuthTabCallback + 81;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i2 = IAuthTabCallbackStub + 97;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    public void aR_() {
        int i = 2 % 2;
        if (!this.asInterface) {
            this.asInterface = true;
            ((AudioMatcher6) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).IAuthTabCallback((CreditPlusFreeTrialArrivedActivity) animate.onExtraCallbackWithResult(this));
            int i2 = asBinder + 15;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = IAuthTabCallbackStub + 49;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 57 / 0;
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
