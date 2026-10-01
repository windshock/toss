package im.toss.features.manualselfie.impl.controller;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.ExthubBigDataTunnelManager;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_ManualSelfieVerifyActivity extends BaseActivity {
    private static int asBinder = 0;
    private static int onTransact = 1;
    private boolean IAuthTabCallbackDefault;

    Hilt_ManualSelfieVerifyActivity() {
        this.IAuthTabCallbackDefault = false;
        IAuthTabCallback();
    }

    Hilt_ManualSelfieVerifyActivity(int i) {
        super(i);
        this.IAuthTabCallbackDefault = false;
        IAuthTabCallback();
    }

    private void IAuthTabCallback() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.features.manualselfie.impl.controller.Hilt_ManualSelfieVerifyActivity.5
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 17;
                onExtraCallbackWithResult = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    Hilt_ManualSelfieVerifyActivity.this.aR_();
                    obj.hashCode();
                    throw null;
                }
                Hilt_ManualSelfieVerifyActivity.this.aR_();
                int i4 = onWarmupCompleted + 37;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        });
        int i2 = asBinder + 25;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    public void aR_() {
        int i = 2 % 2;
        int i2 = onTransact + 115;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (this.IAuthTabCallbackDefault) {
            return;
        }
        this.IAuthTabCallbackDefault = true;
        ((ExthubBigDataTunnelManager) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).IAuthTabCallback((ManualSelfieVerifyActivity) animate.onExtraCallbackWithResult(this));
        int i4 = onTransact + 15;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
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
