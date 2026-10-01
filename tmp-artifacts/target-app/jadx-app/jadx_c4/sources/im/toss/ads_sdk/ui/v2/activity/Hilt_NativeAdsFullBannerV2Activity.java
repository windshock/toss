package im.toss.ads_sdk.ui.v2.activity;

import android.content.Context;
import android.os.Bundle;
import im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes4.dex */
abstract class Hilt_NativeAdsFullBannerV2Activity extends NativeAdsBaseActivity {
    private static int asBinder = 1;
    private static int asInterface;
    private boolean IAuthTabCallbackStub = false;

    Hilt_NativeAdsFullBannerV2Activity() {
        IAuthTabCallbackStubProxy();
    }

    private void IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.ads_sdk.ui.v2.activity.Hilt_NativeAdsFullBannerV2Activity.1
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 47;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Hilt_NativeAdsFullBannerV2Activity.this.IAuthTabCallback();
                if (i4 != 0) {
                    int i5 = 5 / 0;
                }
            }
        });
        int i2 = asBinder + 55;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 98 / 0;
        }
    }

    @Override // im.toss.ads_sdk.ui.activity.Hilt_NativeAdsBaseActivity
    public void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 27;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this.IAuthTabCallbackStub) {
            return;
        }
        int i4 = i3 + 5;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            this.IAuthTabCallbackStub = true;
        } else {
            this.IAuthTabCallbackStub = true;
        }
        int i5 = asBinder + 23;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
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
