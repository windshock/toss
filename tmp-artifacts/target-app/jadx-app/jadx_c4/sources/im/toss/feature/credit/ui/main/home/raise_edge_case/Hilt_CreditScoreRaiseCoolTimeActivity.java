package im.toss.feature.credit.ui.main.home.raise_edge_case;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.animate;
import o.captureEndValues;
import o.overlayInstallation;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class Hilt_CreditScoreRaiseCoolTimeActivity extends BaseActivity {
    private static int IAuthTabCallbackDefault = 0;
    private static int onTransact = 1;
    private boolean asInterface;

    Hilt_CreditScoreRaiseCoolTimeActivity() {
        this.asInterface = false;
        onNavigationEvent();
    }

    Hilt_CreditScoreRaiseCoolTimeActivity(int i) {
        super(i);
        this.asInterface = false;
        onNavigationEvent();
    }

    private void onNavigationEvent() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.feature.credit.ui.main.home.raise_edge_case.Hilt_CreditScoreRaiseCoolTimeActivity.1
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 33;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Hilt_CreditScoreRaiseCoolTimeActivity.this.aR_();
                int i5 = onExtraCallbackWithResult + 21;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = onTransact + 91;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // im.toss.base.Hilt_BaseActivity
    public void aR_() {
        int i = 2 % 2;
        if (!this.asInterface) {
            int i2 = IAuthTabCallbackDefault + 125;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            this.asInterface = true;
            ((overlayInstallation) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onExtraCallback((CreditScoreRaiseCoolTimeActivity) animate.onExtraCallbackWithResult(this));
        }
        int i4 = onTransact + 47;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onCreate(Bundle bundle) throws Throwable {
        super.onCreate(bundle);
    }

    @Override // im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onStart() {
        super.onStart();
    }

    @Override // im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onResume() {
        super.onResume();
    }

    @Override // im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onPause() {
        super.onPause();
    }

    @Override // im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
