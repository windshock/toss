package im.toss.features.credit.ui.plus.gift.send;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.ImageMatcher7;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_CreditPlusGiftLinkActivity extends BaseActivity {
    private static int IAuthTabCallbackDefault = 0;
    private static int asInterface = 1;
    private boolean IAuthTabCallbackStub;

    Hilt_CreditPlusGiftLinkActivity() {
        this.IAuthTabCallbackStub = false;
        ICustomTabsServiceStub();
    }

    Hilt_CreditPlusGiftLinkActivity(int i) {
        super(i);
        this.IAuthTabCallbackStub = false;
        ICustomTabsServiceStub();
    }

    private void ICustomTabsServiceStub() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.features.credit.ui.plus.gift.send.Hilt_CreditPlusGiftLinkActivity.2
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 71;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Hilt_CreditPlusGiftLinkActivity.this.aR_();
                if (i4 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i2 = IAuthTabCallbackDefault + 101;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void aR_() {
        int i = 2 % 2;
        int i2 = asInterface + 63;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 33 / 0;
            if (!this.IAuthTabCallbackStub) {
                this.IAuthTabCallbackStub = true;
                ((ImageMatcher7) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onNavigationEvent((CreditPlusGiftLinkActivity) animate.onExtraCallbackWithResult(this));
            }
        } else if (!this.IAuthTabCallbackStub) {
        }
        int i4 = IAuthTabCallbackDefault + 11;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
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
