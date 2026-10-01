package im.toss.appsintoss.iap;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda1;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class Hilt_InAppPurchaseHistoryDetailActivity extends BaseActivity {
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder;
    private boolean IAuthTabCallbackDefault;

    Hilt_InAppPurchaseHistoryDetailActivity() {
        this.IAuthTabCallbackDefault = false;
        IAuthTabCallback();
    }

    Hilt_InAppPurchaseHistoryDetailActivity(int i) {
        super(i);
        this.IAuthTabCallbackDefault = false;
        IAuthTabCallback();
    }

    private void IAuthTabCallback() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.appsintoss.iap.Hilt_InAppPurchaseHistoryDetailActivity.1
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 119;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Hilt_InAppPurchaseHistoryDetailActivity.this.aR_();
                int i5 = onNavigationEvent + 113;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 60 / 0;
                }
            }
        });
        int i2 = IAuthTabCallbackStub + 37;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // im.toss.base.Hilt_BaseActivity
    public void aR_() {
        int i = 2 % 2;
        if (!this.IAuthTabCallbackDefault) {
            this.IAuthTabCallbackDefault = true;
            ((SafeActivityEmbeddingComponentProviderExternalSyntheticLambda1) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onExtraCallback((InAppPurchaseHistoryDetailActivity) animate.onExtraCallbackWithResult(this));
            int i2 = IAuthTabCallbackStub + 25;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = asBinder + 57;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
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
