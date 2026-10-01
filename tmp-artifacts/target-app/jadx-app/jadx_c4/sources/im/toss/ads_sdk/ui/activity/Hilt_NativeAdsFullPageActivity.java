package im.toss.ads_sdk.ui.activity;

import android.content.Context;
import android.os.Bundle;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes4.dex */
abstract class Hilt_NativeAdsFullPageActivity extends NativeAdsBaseActivity {
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private boolean asInterface = false;

    Hilt_NativeAdsFullPageActivity() {
        access100();
    }

    private void access100() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.ads_sdk.ui.activity.Hilt_NativeAdsFullPageActivity.1
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 93;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Hilt_NativeAdsFullPageActivity.this.IAuthTabCallback();
                int i5 = onNavigationEvent + 117;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = asBinder + 27;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // im.toss.ads_sdk.ui.activity.Hilt_NativeAdsBaseActivity
    protected void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 21;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        if (!(!this.asInterface)) {
            return;
        }
        int i5 = i2 + 103;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            this.asInterface = false;
        } else {
            this.asInterface = true;
        }
    }

    @Override // im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity, im.toss.ads_sdk.ui.activity.Hilt_NativeAdsBaseActivity
    public void onCreate(Bundle bundle) throws Throwable {
        super.onCreate(bundle);
    }

    @Override // im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity, im.toss.ads_sdk.ui.activity.Hilt_NativeAdsBaseActivity
    public void onStart() {
        super.onStart();
    }

    @Override // im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity, im.toss.ads_sdk.ui.activity.Hilt_NativeAdsBaseActivity
    public void onResume() {
        super.onResume();
    }

    @Override // im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity, im.toss.ads_sdk.ui.activity.Hilt_NativeAdsBaseActivity
    public void onPause() {
        super.onPause();
    }

    @Override // im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity, im.toss.ads_sdk.ui.activity.Hilt_NativeAdsBaseActivity
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
