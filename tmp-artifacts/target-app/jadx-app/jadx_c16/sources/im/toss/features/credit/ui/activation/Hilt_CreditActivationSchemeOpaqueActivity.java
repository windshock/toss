package im.toss.features.credit.ui.activation;

import android.content.Context;
import android.os.Bundle;
import o.animate;
import o.captureEndValues;
import o.decodeToPath;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_CreditActivationSchemeOpaqueActivity extends CreditActivationSchemeActivity {
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private boolean asInterface = false;

    Hilt_CreditActivationSchemeOpaqueActivity() {
        ICustomTabsServiceStubProxy();
    }

    private void ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.features.credit.ui.activation.Hilt_CreditActivationSchemeOpaqueActivity.5
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 111;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    Hilt_CreditActivationSchemeOpaqueActivity.this.aR_();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Hilt_CreditActivationSchemeOpaqueActivity.this.aR_();
                int i4 = onExtraCallback + 7;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 99 / 0;
                }
            }
        });
        int i2 = asBinder + 77;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 73 / 0;
        }
    }

    public void aR_() {
        int i = 2 % 2;
        if (!this.asInterface) {
            int i2 = asBinder + 121;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            this.asInterface = true;
            ((decodeToPath) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).IAuthTabCallback((CreditActivationSchemeOpaqueActivity) animate.onExtraCallbackWithResult(this));
        }
        int i4 = IAuthTabCallbackDefault + 1;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 49 / 0;
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
