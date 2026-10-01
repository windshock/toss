package im.toss.ads_sdk.ui.v2.activity;

import android.content.Context;
import android.os.Bundle;
import im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity;
import o.ExtensionWindowAreaStatusRequirements;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes4.dex */
abstract class Hilt_NativeAdsShortVideoV2Activity extends NativeAdsBaseActivity {
    private static int IAuthTabCallbackDefault = 1;
    private static int asInterface;
    private boolean IAuthTabCallbackStub = false;

    Hilt_NativeAdsShortVideoV2Activity() {
        IAuthTabCallback_Parcel();
    }

    private void IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.ads_sdk.ui.v2.activity.Hilt_NativeAdsShortVideoV2Activity.2
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 13;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Hilt_NativeAdsShortVideoV2Activity.this.IAuthTabCallback();
                if (i4 != 0) {
                    throw null;
                }
            }
        });
        int i2 = IAuthTabCallbackDefault + 105;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // im.toss.ads_sdk.ui.activity.Hilt_NativeAdsBaseActivity
    public void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 15;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (!this.IAuthTabCallbackStub) {
            this.IAuthTabCallbackStub = true;
            ((ExtensionWindowAreaStatusRequirements) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).IAuthTabCallback((NativeAdsShortVideoV2Activity) animate.onExtraCallbackWithResult(this));
        }
        int i3 = asInterface + 57;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
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
