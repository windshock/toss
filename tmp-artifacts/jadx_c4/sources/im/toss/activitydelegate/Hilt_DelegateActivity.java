package im.toss.activitydelegate;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.Visibility;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class Hilt_DelegateActivity extends BaseActivity {
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub;
    private boolean onTransact;

    Hilt_DelegateActivity() {
        this.onTransact = false;
        onNavigationEvent();
    }

    Hilt_DelegateActivity(int i) {
        super(i);
        this.onTransact = false;
        onNavigationEvent();
    }

    private void onNavigationEvent() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.activitydelegate.Hilt_DelegateActivity.3
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 31;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Hilt_DelegateActivity.this.aR_();
                int i5 = onExtraCallbackWithResult + 123;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 7 / 0;
                }
            }
        });
        int i2 = IAuthTabCallbackDefault + 7;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    @Override // im.toss.base.Hilt_BaseActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void aR_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 31;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 17 / 0;
            if (!this.onTransact) {
                this.onTransact = true;
                ((Visibility) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onWarmupCompleted((DelegateActivity) animate.onExtraCallbackWithResult(this));
            }
        } else if (!this.onTransact) {
        }
        int i4 = IAuthTabCallbackStub + 27;
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
