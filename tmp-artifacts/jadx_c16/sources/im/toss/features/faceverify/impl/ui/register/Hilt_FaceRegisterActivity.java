package im.toss.features.faceverify.impl.ui.register;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.animate;
import o.captureEndValues;
import o.closeSocket;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_FaceRegisterActivity extends BaseActivity {
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder;
    private boolean asInterface;

    Hilt_FaceRegisterActivity() {
        this.asInterface = false;
        IAuthTabCallback();
    }

    Hilt_FaceRegisterActivity(int i) {
        super(i);
        this.asInterface = false;
        IAuthTabCallback();
    }

    private void IAuthTabCallback() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.features.faceverify.impl.ui.register.Hilt_FaceRegisterActivity.1
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 37;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Hilt_FaceRegisterActivity.this.aR_();
                int i5 = onNavigationEvent + 37;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i2 = asBinder + 15;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
    }

    public void aR_() {
        int i = 2 % 2;
        if (!this.asInterface) {
            int i2 = asBinder + 37;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            this.asInterface = true;
            ((closeSocket) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onWarmupCompleted((FaceRegisterActivity) animate.onExtraCallbackWithResult(this));
            int i4 = IAuthTabCallbackDefault + 87;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
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
