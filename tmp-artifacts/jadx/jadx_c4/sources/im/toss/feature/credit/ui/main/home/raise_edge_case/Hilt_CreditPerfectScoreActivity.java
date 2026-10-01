package im.toss.feature.credit.ui.main.home.raise_edge_case;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.animate;
import o.captureEndValues;
import o.runtimeDumpWhenTinyStart;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class Hilt_CreditPerfectScoreActivity extends BaseActivity {
    private static int asBinder = 1;
    private static int onTransact;
    private boolean IAuthTabCallbackStub;

    Hilt_CreditPerfectScoreActivity() {
        this.IAuthTabCallbackStub = false;
        IAuthTabCallback();
    }

    Hilt_CreditPerfectScoreActivity(int i) {
        super(i);
        this.IAuthTabCallbackStub = false;
        IAuthTabCallback();
    }

    private void IAuthTabCallback() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.feature.credit.ui.main.home.raise_edge_case.Hilt_CreditPerfectScoreActivity.4
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 75;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Hilt_CreditPerfectScoreActivity.this.aR_();
                int i5 = onWarmupCompleted + 79;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = asBinder + 95;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // im.toss.base.Hilt_BaseActivity
    public void aR_() {
        int i = 2 % 2;
        if (!this.IAuthTabCallbackStub) {
            int i2 = asBinder + 81;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            this.IAuthTabCallbackStub = true;
            ((runtimeDumpWhenTinyStart) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).IAuthTabCallback((CreditPerfectScoreActivity) animate.onExtraCallbackWithResult(this));
            int i4 = onTransact + 55;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = asBinder + 15;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
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
