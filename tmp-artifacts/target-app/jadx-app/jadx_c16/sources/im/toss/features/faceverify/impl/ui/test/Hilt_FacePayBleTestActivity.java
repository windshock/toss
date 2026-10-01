package im.toss.features.faceverify.impl.ui.test;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.animate;
import o.captureEndValues;
import o.sendMsgToConsoleView;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_FacePayBleTestActivity extends BaseActivity {
    private static int asBinder = 1;
    private static int onTransact;
    private boolean asInterface;

    Hilt_FacePayBleTestActivity() {
        this.asInterface = false;
        IAuthTabCallback();
    }

    Hilt_FacePayBleTestActivity(int i) {
        super(i);
        this.asInterface = false;
        IAuthTabCallback();
    }

    private void IAuthTabCallback() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.features.faceverify.impl.ui.test.Hilt_FacePayBleTestActivity.4
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 21;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    Hilt_FacePayBleTestActivity.this.aR_();
                    int i4 = 20 / 0;
                } else {
                    Hilt_FacePayBleTestActivity.this.aR_();
                }
                int i5 = onNavigationEvent + 49;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 15 / 0;
                }
            }
        });
        int i2 = asBinder + 111;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public void aR_() {
        int i = 2 % 2;
        if (this.asInterface) {
            return;
        }
        int i2 = onTransact + 13;
        asBinder = i2 % 128;
        this.asInterface = i2 % 2 != 0;
        ((sendMsgToConsoleView) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onNavigationEvent((FacePayBleTestActivity) animate.onExtraCallbackWithResult(this));
        int i3 = onTransact + 67;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 4 / 2;
        }
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
