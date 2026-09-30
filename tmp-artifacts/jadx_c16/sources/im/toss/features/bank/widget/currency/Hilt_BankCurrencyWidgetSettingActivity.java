package im.toss.features.bank.widget.currency;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.BluetoothPermissionUtils;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_BankCurrencyWidgetSettingActivity extends BaseActivity {
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private boolean onTransact;

    Hilt_BankCurrencyWidgetSettingActivity() {
        this.onTransact = false;
        IAuthTabCallback();
    }

    Hilt_BankCurrencyWidgetSettingActivity(int i) {
        super(i);
        this.onTransact = false;
        IAuthTabCallback();
    }

    private void IAuthTabCallback() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.features.bank.widget.currency.Hilt_BankCurrencyWidgetSettingActivity.1
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 21;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Hilt_BankCurrencyWidgetSettingActivity.this.aR_();
                int i5 = onWarmupCompleted + 77;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i2 = asInterface + 43;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    public void aR_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 57;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        if (this.onTransact) {
            return;
        }
        int i5 = i2 + 29;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        this.onTransact = true;
        ((BluetoothPermissionUtils) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onExtraCallbackWithResult((BankCurrencyWidgetSettingActivity) animate.onExtraCallbackWithResult(this));
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
