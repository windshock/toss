package im.toss.ads_sdk.ui.activity;

import android.content.Context;
import android.os.Bundle;
import o.RestrictionAllowlistConfigTask;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes4.dex */
abstract class Hilt_NativeAdsShortVideoActivity extends NativeAdsBaseActivity {
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private boolean asBinder = false;

    Hilt_NativeAdsShortVideoActivity() {
        IAuthTabCallback_Parcel();
    }

    private void IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.ads_sdk.ui.activity.Hilt_NativeAdsShortVideoActivity.4
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 63;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    Hilt_NativeAdsShortVideoActivity.this.IAuthTabCallback();
                    throw null;
                }
                Hilt_NativeAdsShortVideoActivity.this.IAuthTabCallback();
                int i4 = onNavigationEvent + 97;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        int i2 = IAuthTabCallbackDefault + 101;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.ads_sdk.ui.activity.Hilt_NativeAdsBaseActivity
    protected void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 19;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        if (this.asBinder) {
            return;
        }
        int i5 = i2 + 39;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        this.asBinder = true;
        ((RestrictionAllowlistConfigTask) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onExtraCallback((NativeAdsShortVideoActivity) animate.onExtraCallbackWithResult(this));
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
