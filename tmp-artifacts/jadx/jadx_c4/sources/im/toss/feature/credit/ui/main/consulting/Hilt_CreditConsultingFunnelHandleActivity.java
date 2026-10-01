package im.toss.feature.credit.ui.main.consulting;

import android.content.Context;
import android.os.Bundle;
import im.toss.features.credit.CreditBaseActivity;
import o.animate;
import o.captureEndValues;
import o.openDLogForDebug;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class Hilt_CreditConsultingFunnelHandleActivity extends CreditBaseActivity {
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private boolean IAuthTabCallbackDefault = false;

    Hilt_CreditConsultingFunnelHandleActivity() {
        onNavigationEvent();
    }

    private void onNavigationEvent() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.feature.credit.ui.main.consulting.Hilt_CreditConsultingFunnelHandleActivity.2
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 3;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Hilt_CreditConsultingFunnelHandleActivity.this.aR_();
                int i5 = onExtraCallbackWithResult + 13;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = asBinder + 45;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    public void aR_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 45;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (!this.IAuthTabCallbackDefault) {
            this.IAuthTabCallbackDefault = true;
            ((openDLogForDebug) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onExtraCallbackWithResult((CreditConsultingFunnelHandleActivity) animate.onExtraCallbackWithResult(this));
            int i3 = IAuthTabCallbackStub + 15;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
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
