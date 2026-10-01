package im.toss.rn.toss.core.remoteprocess;

import android.content.Context;
import android.os.Bundle;
import im.toss.rn.toss.core.ReactSchemeActivity;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class Hilt_RemoteProcessReactSchemeActivity extends ReactSchemeActivity {
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private boolean IAuthTabCallbackDefault = false;

    Hilt_RemoteProcessReactSchemeActivity() {
        areNotificationsEnabled();
    }

    private void areNotificationsEnabled() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.rn.toss.core.remoteprocess.Hilt_RemoteProcessReactSchemeActivity.2
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 101;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Hilt_RemoteProcessReactSchemeActivity.this.aR_();
                int i5 = IAuthTabCallback + 115;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = asInterface + 11;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    public void aR_() {
        RemoteProcessReactSchemeActivity_GeneratedInjector remoteProcessReactSchemeActivity_GeneratedInjector;
        Object objOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = asInterface + 13;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        if (!(!this.IAuthTabCallbackDefault)) {
            return;
        }
        int i5 = i3 + 121;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            this.IAuthTabCallbackDefault = false;
            remoteProcessReactSchemeActivity_GeneratedInjector = (RemoteProcessReactSchemeActivity_GeneratedInjector) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent();
            objOnExtraCallbackWithResult = animate.onExtraCallbackWithResult(this);
        } else {
            this.IAuthTabCallbackDefault = true;
            remoteProcessReactSchemeActivity_GeneratedInjector = (RemoteProcessReactSchemeActivity_GeneratedInjector) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent();
            objOnExtraCallbackWithResult = animate.onExtraCallbackWithResult(this);
        }
        remoteProcessReactSchemeActivity_GeneratedInjector.onExtraCallback((RemoteProcessReactSchemeActivity) objOnExtraCallbackWithResult);
    }

    @Override // im.toss.rn.toss.core.ReactSchemeActivity
    public void onCreate(Bundle bundle) throws Throwable {
        super.onCreate(bundle);
    }

    @Override // im.toss.rn.toss.core.ReactSchemeActivity
    public void onStart() {
        super.onStart();
    }

    @Override // im.toss.rn.toss.core.ReactSchemeActivity
    public void onResume() throws Throwable {
        super.onResume();
    }

    @Override // im.toss.rn.toss.core.ReactSchemeActivity
    public void onPause() {
        super.onPause();
    }

    @Override // im.toss.rn.toss.core.ReactSchemeActivity
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
