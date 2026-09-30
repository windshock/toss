package im.toss.features.faceverify.impl.ui.test;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.DebugConsoleExtension1;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_FacePayTestActivity extends BaseActivity {
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder;
    private boolean onTransact;

    Hilt_FacePayTestActivity() {
        this.onTransact = false;
        onNavigationEvent();
    }

    Hilt_FacePayTestActivity(int i) {
        super(i);
        this.onTransact = false;
        onNavigationEvent();
    }

    private void onNavigationEvent() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.features.faceverify.impl.ui.test.Hilt_FacePayTestActivity.1
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 95;
                onExtraCallback = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    Hilt_FacePayTestActivity.this.aR_();
                    throw null;
                }
                Hilt_FacePayTestActivity.this.aR_();
                int i4 = IAuthTabCallback + 37;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        });
        int i2 = asBinder + 105;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public void aR_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 103;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            if (!this.onTransact) {
                int i4 = i2 + 81;
                asBinder = i4 % 128;
                if (i4 % 2 != 0) {
                    this.onTransact = false;
                } else {
                    this.onTransact = true;
                }
                ((DebugConsoleExtension1) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onWarmupCompleted((FacePayTestActivity) animate.onExtraCallbackWithResult(this));
                return;
            }
            return;
        }
        throw null;
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
