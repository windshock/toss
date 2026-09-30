package im.toss.features.edoc.wallet.pkg;

import android.content.Context;
import android.os.Bundle;
import im.toss.features.edoc.wallet.EDocShareBaseActivity;
import o.FileBridgeExtension32;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_PackageResultActivity extends EDocShareBaseActivity {
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private boolean asBinder = false;

    Hilt_PackageResultActivity() {
        IAuthTabCallback();
    }

    private void IAuthTabCallback() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.features.edoc.wallet.pkg.Hilt_PackageResultActivity.4
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 79;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    Hilt_PackageResultActivity.this.aR_();
                    int i4 = 52 / 0;
                } else {
                    Hilt_PackageResultActivity.this.aR_();
                }
                int i5 = IAuthTabCallback + 11;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }
        });
        int i2 = asInterface + 113;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void aR_() {
        int i = 2 % 2;
        int i2 = asInterface + 105;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        if (!this.asBinder) {
            this.asBinder = true;
            ((FileBridgeExtension32) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onWarmupCompleted((PackageResultActivity) animate.onExtraCallbackWithResult(this));
        }
        int i4 = asInterface + 27;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
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
