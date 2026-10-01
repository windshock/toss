package im.toss.feature.credit.ui.main.test;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.RVNativePermissionRequestProxy;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class Hilt_CreditTestActivity extends BaseActivity {
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder;
    private boolean asInterface;

    Hilt_CreditTestActivity() {
        this.asInterface = false;
        onNavigationEvent();
    }

    Hilt_CreditTestActivity(int i) {
        super(i);
        this.asInterface = false;
        onNavigationEvent();
    }

    private void onNavigationEvent() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.feature.credit.ui.main.test.Hilt_CreditTestActivity.4
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 101;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Hilt_CreditTestActivity.this.aR_();
                int i5 = onExtraCallbackWithResult + 93;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = IAuthTabCallbackDefault + 29;
        asBinder = i2 % 128;
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
        int i2 = IAuthTabCallbackDefault + 63;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (!this.asInterface) {
            this.asInterface = true;
            ((RVNativePermissionRequestProxy) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).IAuthTabCallback((CreditTestActivity) animate.onExtraCallbackWithResult(this));
        }
        int i4 = asBinder + 81;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
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
