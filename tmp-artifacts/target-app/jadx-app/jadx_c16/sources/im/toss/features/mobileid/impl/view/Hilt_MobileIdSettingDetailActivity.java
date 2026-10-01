package im.toss.features.mobileid.impl.view;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.animate;
import o.captureEndValues;
import o.endArray;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_MobileIdSettingDetailActivity extends BaseActivity {
    private static int asBinder = 0;
    private static int onTransact = 1;
    private boolean IAuthTabCallbackStub;

    Hilt_MobileIdSettingDetailActivity() {
        this.IAuthTabCallbackStub = false;
        IAuthTabCallback();
    }

    Hilt_MobileIdSettingDetailActivity(int i) {
        super(i);
        this.IAuthTabCallbackStub = false;
        IAuthTabCallback();
    }

    private void IAuthTabCallback() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.features.mobileid.impl.view.Hilt_MobileIdSettingDetailActivity.1
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 91;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Hilt_MobileIdSettingDetailActivity.this.aR_();
                int i5 = onNavigationEvent + 37;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i2 = onTransact + 111;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 64 / 0;
        }
    }

    public void aR_() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 5;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            if (this.IAuthTabCallbackStub) {
                return;
            }
            int i4 = i2 + 99;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            this.IAuthTabCallbackStub = true;
            ((endArray) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onNavigationEvent((MobileIdSettingDetailActivity) animate.onExtraCallbackWithResult(this));
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
