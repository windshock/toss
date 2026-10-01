package im.toss.feature.credit.ui.main.home;

import android.content.Context;
import android.os.Bundle;
import im.toss.features.credit.CreditBaseActivity;
import o.animate;
import o.captureEndValues;
import o.toFlameGraphText;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class Hilt_CreditHomeActivity extends CreditBaseActivity {
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder;
    private boolean onTransact = false;

    Hilt_CreditHomeActivity() {
        IAuthTabCallback();
    }

    private void IAuthTabCallback() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.feature.credit.ui.main.home.Hilt_CreditHomeActivity.5
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 109;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Hilt_CreditHomeActivity.this.aR_();
                int i5 = onExtraCallback + 67;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 89 / 0;
                }
            }
        });
        int i2 = asBinder + 29;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 66 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void aR_() {
        toFlameGraphText toflamegraphtext;
        Object objOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 59;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 68 / 0;
            if (!this.onTransact) {
                int i5 = i2 + 63;
                asBinder = i5 % 128;
                if (i5 % 2 != 0) {
                    this.onTransact = false;
                    toflamegraphtext = (toFlameGraphText) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent();
                    objOnExtraCallbackWithResult = animate.onExtraCallbackWithResult(this);
                } else {
                    this.onTransact = true;
                    toflamegraphtext = (toFlameGraphText) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent();
                    objOnExtraCallbackWithResult = animate.onExtraCallbackWithResult(this);
                }
                toflamegraphtext.onWarmupCompleted((CreditHomeActivity) objOnExtraCallbackWithResult);
            }
        } else if (!this.onTransact) {
        }
        int i6 = IAuthTabCallbackDefault + 89;
        asBinder = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
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
