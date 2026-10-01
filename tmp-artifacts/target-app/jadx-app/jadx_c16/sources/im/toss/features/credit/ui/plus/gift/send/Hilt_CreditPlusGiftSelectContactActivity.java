package im.toss.features.credit.ui.plus.gift.send;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.ImageMatcher6;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_CreditPlusGiftSelectContactActivity extends BaseActivity {
    private static int asInterface = 1;
    private static int onTransact;
    private boolean IAuthTabCallbackStub;

    Hilt_CreditPlusGiftSelectContactActivity() {
        this.IAuthTabCallbackStub = false;
        updateVisuals();
    }

    Hilt_CreditPlusGiftSelectContactActivity(int i) {
        super(i);
        this.IAuthTabCallbackStub = false;
        updateVisuals();
    }

    private void updateVisuals() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.features.credit.ui.plus.gift.send.Hilt_CreditPlusGiftSelectContactActivity.5
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 9;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Hilt_CreditPlusGiftSelectContactActivity.this.aR_();
                int i5 = IAuthTabCallback + 125;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = asInterface + 75;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public void aR_() {
        int i = 2 % 2;
        int i2 = asInterface + 15;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 55 / 0;
            if (this.IAuthTabCallbackStub) {
                return;
            }
        } else if (this.IAuthTabCallbackStub) {
            return;
        }
        this.IAuthTabCallbackStub = true;
        ((ImageMatcher6) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onExtraCallbackWithResult((CreditPlusGiftSelectContactActivity) animate.onExtraCallbackWithResult(this));
        int i4 = asInterface + 89;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
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
