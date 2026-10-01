package im.toss.features.loan.refinancing.funnel.input;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.animate;
import o.captureEndValues;
import o.getAppxStartupBaseTime;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_LoanRefinancingScrapingHandleActivity extends BaseActivity {
    private static int IAuthTabCallbackDefault = 0;
    private static int asInterface = 1;
    private boolean asBinder;

    Hilt_LoanRefinancingScrapingHandleActivity() {
        this.asBinder = false;
        onNavigationEvent();
    }

    Hilt_LoanRefinancingScrapingHandleActivity(int i) {
        super(i);
        this.asBinder = false;
        onNavigationEvent();
    }

    private void onNavigationEvent() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.features.loan.refinancing.funnel.input.Hilt_LoanRefinancingScrapingHandleActivity.4
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 67;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Hilt_LoanRefinancingScrapingHandleActivity.this.aR_();
                int i5 = onExtraCallback + 31;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = asInterface + 67;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
    }

    public void aR_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 101;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            if (!(!this.asBinder)) {
                return;
            }
            this.asBinder = true;
            ((getAppxStartupBaseTime) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onExtraCallbackWithResult((LoanRefinancingScrapingHandleActivity) animate.onExtraCallbackWithResult(this));
            int i3 = asInterface + 91;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
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
