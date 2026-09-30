package im.toss.rn.toss.core.portal;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.animate;
import o.captureEndValues;
import o.onAdViewAdLoadFailed;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class Hilt_PortalServiceActivity extends BaseActivity {
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub;
    private boolean onTransact;

    Hilt_PortalServiceActivity() {
        this.onTransact = false;
        onNavigationEvent();
    }

    Hilt_PortalServiceActivity(int i) {
        super(i);
        this.onTransact = false;
        onNavigationEvent();
    }

    private void onNavigationEvent() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.rn.toss.core.portal.Hilt_PortalServiceActivity.2
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 9;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Hilt_PortalServiceActivity.this.aR_();
                if (i4 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i2 = IAuthTabCallbackStub + 75;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
    }

    public void aR_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 13;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (!this.onTransact) {
            this.onTransact = true;
            ((onAdViewAdLoadFailed) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onExtraCallbackWithResult((PortalServiceActivity) animate.onExtraCallbackWithResult(this));
        }
        int i3 = IAuthTabCallbackDefault + 57;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 26 / 0;
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
