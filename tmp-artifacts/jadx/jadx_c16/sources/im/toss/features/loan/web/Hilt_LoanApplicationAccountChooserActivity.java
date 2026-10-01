package im.toss.features.loan.web;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.animate;
import o.captureEndValues;
import o.sendByteArray;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_LoanApplicationAccountChooserActivity extends BaseActivity {
    private static int IAuthTabCallbackStub = 1;
    private static int onTransact;
    private boolean asBinder;

    Hilt_LoanApplicationAccountChooserActivity() {
        this.asBinder = false;
        IAuthTabCallback();
    }

    Hilt_LoanApplicationAccountChooserActivity(int i) {
        super(i);
        this.asBinder = false;
        IAuthTabCallback();
    }

    private void IAuthTabCallback() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.features.loan.web.Hilt_LoanApplicationAccountChooserActivity.4
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 115;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Hilt_LoanApplicationAccountChooserActivity.this.aR_();
                if (i4 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i2 = onTransact + 75;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    public void aR_() {
        int i = 2 % 2;
        if (!this.asBinder) {
            int i2 = IAuthTabCallbackStub + 31;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            this.asBinder = true;
            ((sendByteArray) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onExtraCallbackWithResult((LoanApplicationAccountChooserActivity) animate.onExtraCallbackWithResult(this));
        }
        int i4 = IAuthTabCallbackStub + 87;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
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
