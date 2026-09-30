package im.toss.features.deadaccount.impl;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.H5IOUtils;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes16.dex */
abstract class Hilt_DeadAccountActivity extends BaseActivity {
    private static int IAuthTabCallbackDefault = 1;
    private static int onTransact;
    private boolean asBinder;

    Hilt_DeadAccountActivity() {
        this.asBinder = false;
        onNavigationEvent();
    }

    Hilt_DeadAccountActivity(int i) {
        super(i);
        this.asBinder = false;
        onNavigationEvent();
    }

    private void onNavigationEvent() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.features.deadaccount.impl.Hilt_DeadAccountActivity.3
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 93;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Hilt_DeadAccountActivity.this.aR_();
                if (i4 != 0) {
                    int i5 = 17 / 0;
                }
            }
        });
        int i2 = onTransact + 95;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public void aR_() {
        int i = 2 % 2;
        if (this.asBinder) {
            return;
        }
        int i2 = onTransact + 87;
        IAuthTabCallbackDefault = i2 % 128;
        this.asBinder = i2 % 2 != 0;
        ((H5IOUtils) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onWarmupCompleted((DeadAccountActivity) animate.onExtraCallbackWithResult(this));
        int i3 = onTransact + 75;
        IAuthTabCallbackDefault = i3 % 128;
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
