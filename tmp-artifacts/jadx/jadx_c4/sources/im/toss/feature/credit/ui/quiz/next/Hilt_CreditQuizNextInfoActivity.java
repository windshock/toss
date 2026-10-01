package im.toss.feature.credit.ui.quiz.next;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.animate;
import o.captureEndValues;
import o.onAppDestroy;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class Hilt_CreditQuizNextInfoActivity extends BaseActivity {
    private static int IAuthTabCallbackDefault = 1;
    private static int onTransact;
    private boolean IAuthTabCallbackStub;

    Hilt_CreditQuizNextInfoActivity() {
        this.IAuthTabCallbackStub = false;
        onNavigationEvent();
    }

    Hilt_CreditQuizNextInfoActivity(int i) {
        super(i);
        this.IAuthTabCallbackStub = false;
        onNavigationEvent();
    }

    private void onNavigationEvent() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.feature.credit.ui.quiz.next.Hilt_CreditQuizNextInfoActivity.5
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 27;
                onExtraCallback = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    Hilt_CreditQuizNextInfoActivity.this.aR_();
                    throw null;
                }
                Hilt_CreditQuizNextInfoActivity.this.aR_();
                int i4 = onWarmupCompleted + 5;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        });
        int i2 = IAuthTabCallbackDefault + 81;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // im.toss.base.Hilt_BaseActivity
    public void aR_() {
        int i = 2 % 2;
        int i2 = onTransact + 105;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 68 / 0;
            if (this.IAuthTabCallbackStub) {
                return;
            }
        } else if (this.IAuthTabCallbackStub) {
            return;
        }
        this.IAuthTabCallbackStub = true;
        ((onAppDestroy) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onNavigationEvent((CreditQuizNextInfoActivity) animate.onExtraCallbackWithResult(this));
        int i4 = IAuthTabCallbackDefault + 113;
        onTransact = i4 % 128;
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
