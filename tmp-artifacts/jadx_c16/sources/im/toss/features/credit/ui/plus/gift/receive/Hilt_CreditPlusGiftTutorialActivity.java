package im.toss.features.credit.ui.plus.gift.receive;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.ImageMatcher;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_CreditPlusGiftTutorialActivity extends BaseActivity {
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder;
    private boolean asInterface;

    Hilt_CreditPlusGiftTutorialActivity() {
        this.asInterface = false;
        ICustomTabsServiceStub();
    }

    Hilt_CreditPlusGiftTutorialActivity(int i) {
        super(i);
        this.asInterface = false;
        ICustomTabsServiceStub();
    }

    private void ICustomTabsServiceStub() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.features.credit.ui.plus.gift.receive.Hilt_CreditPlusGiftTutorialActivity.4
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 83;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    Hilt_CreditPlusGiftTutorialActivity.this.aR_();
                    throw null;
                }
                Hilt_CreditPlusGiftTutorialActivity.this.aR_();
                int i4 = onExtraCallback + 63;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        int i2 = IAuthTabCallbackStub + 107;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void aR_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 65;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (!(!this.asInterface)) {
            return;
        }
        this.asInterface = true;
        ((ImageMatcher) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onWarmupCompleted((CreditPlusGiftTutorialActivity) animate.onExtraCallbackWithResult(this));
        int i4 = asBinder + 23;
        IAuthTabCallbackStub = i4 % 128;
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
