package im.toss.feature.credit.ui.quiz.mypage;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.AppCreateMenuPoint;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class Hilt_CreditQuizMyPageActivity extends BaseActivity {
    private static int asBinder = 1;
    private static int onTransact;
    private boolean IAuthTabCallbackDefault;

    Hilt_CreditQuizMyPageActivity() {
        this.IAuthTabCallbackDefault = false;
        onNavigationEvent();
    }

    Hilt_CreditQuizMyPageActivity(int i) {
        super(i);
        this.IAuthTabCallbackDefault = false;
        onNavigationEvent();
    }

    private void onNavigationEvent() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.feature.credit.ui.quiz.mypage.Hilt_CreditQuizMyPageActivity.4
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 75;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Hilt_CreditQuizMyPageActivity.this.aR_();
                if (i4 != 0) {
                    int i5 = 45 / 0;
                }
            }
        });
        int i2 = asBinder + 91;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 82 / 0;
        }
    }

    @Override // im.toss.base.Hilt_BaseActivity
    public void aR_() {
        int i = 2 % 2;
        if (this.IAuthTabCallbackDefault) {
            return;
        }
        int i2 = onTransact + 109;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallbackDefault = true;
        ((AppCreateMenuPoint) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onExtraCallbackWithResult((CreditQuizMyPageActivity) animate.onExtraCallbackWithResult(this));
        int i4 = onTransact + 17;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 2 % 5;
        }
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
