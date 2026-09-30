package im.toss.feature.credit.ui.history.list;

import android.content.Context;
import android.os.Bundle;
import im.toss.features.credit.CreditBaseActivity;
import o.animate;
import o.captureEndValues;
import o.edgeAppExtensionOptEnabled;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class Hilt_CreditHistoryActivity extends CreditBaseActivity {
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private boolean asInterface = false;

    Hilt_CreditHistoryActivity() {
        IAuthTabCallback();
    }

    private void IAuthTabCallback() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.feature.credit.ui.history.list.Hilt_CreditHistoryActivity.2
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 59;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    Hilt_CreditHistoryActivity.this.aR_();
                    int i4 = 57 / 0;
                } else {
                    Hilt_CreditHistoryActivity.this.aR_();
                }
                int i5 = onExtraCallbackWithResult + 89;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = asBinder + 111;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void aR_() {
        int i = 2 % 2;
        if (!this.asInterface) {
            int i2 = asBinder + 49;
            IAuthTabCallbackDefault = i2 % 128;
            this.asInterface = i2 % 2 == 0;
            ((edgeAppExtensionOptEnabled) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onExtraCallbackWithResult((CreditHistoryActivity) animate.onExtraCallbackWithResult(this));
        }
        int i3 = IAuthTabCallbackDefault + 103;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
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
