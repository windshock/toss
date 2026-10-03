package viva.republica.toss.account.group;

import android.content.Context;
import android.os.Bundle;
import o.ASN1Object;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;
import viva.republica.toss.send.AbsCompactSendActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_JointTransferActivity extends AbsCompactSendActivity {
    private boolean IAuthTabCallbackDefault = false;

    Hilt_JointTransferActivity() {
        onNavigationEvent();
    }

    private void onNavigationEvent() {
        addOnContextAvailableListener(new writeTypedList() { // from class: viva.republica.toss.account.group.Hilt_JointTransferActivity.5
            public void onContextAvailable(Context context) {
                Hilt_JointTransferActivity.this.aR_();
            }
        });
    }

    public void aR_() {
        if (this.IAuthTabCallbackDefault) {
            return;
        }
        this.IAuthTabCallbackDefault = true;
        ((ASN1Object) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onNavigationEvent((JointTransferActivity) animate.onExtraCallbackWithResult(this));
    }

    @Override // viva.republica.toss.send.AbsCompactSendActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // viva.republica.toss.send.AbsCompactSendActivity
    public void onStart() {
        super.onStart();
    }

    @Override // viva.republica.toss.send.AbsCompactSendActivity
    public void onResume() {
        super.onResume();
    }

    @Override // viva.republica.toss.send.AbsCompactSendActivity
    public void onPause() {
        super.onPause();
    }

    @Override // viva.republica.toss.send.AbsCompactSendActivity
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
