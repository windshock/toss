package im.toss.feature.credit.ui.kcbsurvey.result;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.animate;
import o.captureEndValues;
import o.ipcMsgClientMsgOpt;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_KcbSurveyResultScoreRaisedActivity extends BaseActivity {
    private static int IAuthTabCallbackStub = 0;
    private static int onTransact = 1;
    private boolean asBinder;

    Hilt_KcbSurveyResultScoreRaisedActivity() {
        this.asBinder = false;
        updateVisuals();
    }

    Hilt_KcbSurveyResultScoreRaisedActivity(int i) {
        super(i);
        this.asBinder = false;
        updateVisuals();
    }

    private void updateVisuals() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.feature.credit.ui.kcbsurvey.result.Hilt_KcbSurveyResultScoreRaisedActivity.1
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 79;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    Hilt_KcbSurveyResultScoreRaisedActivity.this.aR_();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Hilt_KcbSurveyResultScoreRaisedActivity.this.aR_();
                int i4 = onExtraCallbackWithResult + 15;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        int i2 = IAuthTabCallbackStub + 17;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void aR_() {
        int i = 2 % 2;
        int i2 = onTransact + 43;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            if (!this.asBinder) {
                this.asBinder = true;
                ((ipcMsgClientMsgOpt) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onExtraCallbackWithResult((KcbSurveyResultScoreRaisedActivity) animate.onExtraCallbackWithResult(this));
                int i3 = onTransact + 117;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
            }
            int i5 = IAuthTabCallbackStub + 5;
            onTransact = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
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
