package im.toss.features.credit.ui.plus.setting;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.SafeLibCore;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_CreditPlusUnsubscribeBenefitActivity extends BaseActivity {
    private static int asBinder = 1;
    private static int onTransact;
    private boolean IAuthTabCallbackDefault;

    Hilt_CreditPlusUnsubscribeBenefitActivity() {
        this.IAuthTabCallbackDefault = false;
        updateVisuals();
    }

    Hilt_CreditPlusUnsubscribeBenefitActivity(int i) {
        super(i);
        this.IAuthTabCallbackDefault = false;
        updateVisuals();
    }

    private void updateVisuals() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.features.credit.ui.plus.setting.Hilt_CreditPlusUnsubscribeBenefitActivity.1
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 3;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    Hilt_CreditPlusUnsubscribeBenefitActivity.this.aR_();
                    int i4 = 4 / 0;
                } else {
                    Hilt_CreditPlusUnsubscribeBenefitActivity.this.aR_();
                }
                int i5 = onExtraCallbackWithResult + 31;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 13 / 0;
                }
            }
        });
        int i2 = asBinder + 69;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public void aR_() {
        SafeLibCore safeLibCore;
        Object objOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 45;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        if (this.IAuthTabCallbackDefault) {
            return;
        }
        int i5 = i2 + 113;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            this.IAuthTabCallbackDefault = true;
            safeLibCore = (SafeLibCore) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent();
            objOnExtraCallbackWithResult = animate.onExtraCallbackWithResult(this);
        } else {
            this.IAuthTabCallbackDefault = true;
            safeLibCore = (SafeLibCore) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent();
            objOnExtraCallbackWithResult = animate.onExtraCallbackWithResult(this);
        }
        safeLibCore.onNavigationEvent((CreditPlusUnsubscribeBenefitActivity) objOnExtraCallbackWithResult);
        int i6 = onTransact + 41;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
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
