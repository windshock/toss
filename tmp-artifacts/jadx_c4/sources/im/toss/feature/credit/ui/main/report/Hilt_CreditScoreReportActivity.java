package im.toss.feature.credit.ui.main.report;

import android.content.Context;
import android.os.Bundle;
import im.toss.features.credit.CreditBaseActivity;
import o.NetworkGradeJudgement;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class Hilt_CreditScoreReportActivity extends CreditBaseActivity {
    private static int IAuthTabCallbackDefault = 1;
    private static int onTransact;
    private boolean asBinder = false;

    Hilt_CreditScoreReportActivity() {
        onNavigationEvent();
    }

    private void onNavigationEvent() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.feature.credit.ui.main.report.Hilt_CreditScoreReportActivity.4
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 1;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    Hilt_CreditScoreReportActivity.this.aR_();
                    throw null;
                }
                Hilt_CreditScoreReportActivity.this.aR_();
                int i4 = IAuthTabCallback + 3;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        int i2 = onTransact + 111;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 86 / 0;
        }
    }

    public void aR_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 73;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        if (this.asBinder) {
            return;
        }
        int i5 = i3 + 37;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        this.asBinder = true;
        ((NetworkGradeJudgement) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onWarmupCompleted((CreditScoreReportActivity) animate.onExtraCallbackWithResult(this));
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
