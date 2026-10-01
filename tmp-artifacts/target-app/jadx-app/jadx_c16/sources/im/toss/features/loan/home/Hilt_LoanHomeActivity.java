package im.toss.features.loan.home;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.RuntimeVersionChecker;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_LoanHomeActivity extends BaseActivity {
    private static int asBinder = 1;
    private static int asInterface;
    private boolean onTransact;

    Hilt_LoanHomeActivity() {
        this.onTransact = false;
        IAuthTabCallback();
    }

    Hilt_LoanHomeActivity(int i) {
        super(i);
        this.onTransact = false;
        IAuthTabCallback();
    }

    private void IAuthTabCallback() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.features.loan.home.Hilt_LoanHomeActivity.1
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 111;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Hilt_LoanHomeActivity.this.aR_();
                int i5 = onExtraCallback + 45;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = asBinder + 89;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    public void aR_() {
        int i = 2 % 2;
        int i2 = asInterface + 57;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.onTransact) {
            return;
        }
        int i4 = i3 + 49;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        this.onTransact = true;
        ((RuntimeVersionChecker) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onExtraCallback((LoanHomeActivity) animate.onExtraCallbackWithResult(this));
        int i6 = asInterface + 105;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
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
