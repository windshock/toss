package im.toss.ads_sdk.ui.v2.activity;

import android.content.Context;
import android.os.Bundle;
import im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes4.dex */
abstract class Hilt_NativeAdsFullPageV2Activity extends NativeAdsBaseActivity {
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private boolean asBinder = false;

    Hilt_NativeAdsFullPageV2Activity() {
        access100();
    }

    private void access100() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.ads_sdk.ui.v2.activity.Hilt_NativeAdsFullPageV2Activity.2
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 43;
                onExtraCallbackWithResult = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    Hilt_NativeAdsFullPageV2Activity.this.IAuthTabCallback();
                    throw null;
                }
                Hilt_NativeAdsFullPageV2Activity.this.IAuthTabCallback();
                int i4 = onExtraCallback + 29;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        });
        int i2 = asInterface + 7;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    @Override // im.toss.ads_sdk.ui.activity.Hilt_NativeAdsBaseActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 5;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 74 / 0;
            if (!this.asBinder) {
                this.asBinder = true;
            }
        } else if (!this.asBinder) {
        }
        int i4 = IAuthTabCallbackStub + 109;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 79 / 0;
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
