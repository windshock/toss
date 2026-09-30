package im.toss.appsintoss.iap;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.RuleControllerCompanion;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class Hilt_InAppPurchaseHistoryActivity extends BaseActivity {
    private static int asInterface = 0;
    private static int onTransact = 1;
    private boolean asBinder;

    Hilt_InAppPurchaseHistoryActivity() {
        this.asBinder = false;
        onNavigationEvent();
    }

    Hilt_InAppPurchaseHistoryActivity(int i) {
        super(i);
        this.asBinder = false;
        onNavigationEvent();
    }

    private void onNavigationEvent() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.appsintoss.iap.Hilt_InAppPurchaseHistoryActivity.4
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 101;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Hilt_InAppPurchaseHistoryActivity.this.aR_();
                int i5 = onNavigationEvent + 5;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 19 / 0;
                }
            }
        });
        int i2 = asInterface + 119;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // im.toss.base.Hilt_BaseActivity
    public void aR_() {
        int i = 2 % 2;
        int i2 = onTransact + 61;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 == 0) {
            if (this.asBinder) {
                return;
            }
            int i4 = i3 + 121;
            onTransact = i4 % 128;
            this.asBinder = i4 % 2 != 0;
            ((RuleControllerCompanion) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onExtraCallback((InAppPurchaseHistoryActivity) animate.onExtraCallbackWithResult(this));
            return;
        }
        Object obj = null;
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
