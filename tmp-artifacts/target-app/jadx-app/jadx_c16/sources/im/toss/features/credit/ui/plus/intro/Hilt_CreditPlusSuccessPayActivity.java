package im.toss.features.credit.ui.plus.intro;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.animate;
import o.captureEndValues;
import o.localPathToSharedPath;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_CreditPlusSuccessPayActivity extends BaseActivity {
    private static int IAuthTabCallbackDefault = 0;
    private static int asInterface = 1;
    private boolean IAuthTabCallbackStub;

    Hilt_CreditPlusSuccessPayActivity() {
        this.IAuthTabCallbackStub = false;
        ICustomTabsServiceStub();
    }

    Hilt_CreditPlusSuccessPayActivity(int i) {
        super(i);
        this.IAuthTabCallbackStub = false;
        ICustomTabsServiceStub();
    }

    private void ICustomTabsServiceStub() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.features.credit.ui.plus.intro.Hilt_CreditPlusSuccessPayActivity.4
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 123;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Hilt_CreditPlusSuccessPayActivity.this.aR_();
                int i5 = onExtraCallbackWithResult + 107;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = IAuthTabCallbackDefault + 85;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    public void aR_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 5;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.IAuthTabCallbackStub) {
            return;
        }
        this.IAuthTabCallbackStub = true;
        ((localPathToSharedPath) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onWarmupCompleted((CreditPlusSuccessPayActivity) animate.onExtraCallbackWithResult(this));
        int i3 = IAuthTabCallbackDefault + 57;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
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
