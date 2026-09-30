package im.toss.features.home.ui.view.currency.select;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import im.toss.features.home.core.ui.base.BaseHomeActivity;
import kotlin.jvm.functions.Function1;
import o.AutoCallback;
import o.RVManifestIProxyManifest;
import o.SearchBarKtExternalSyntheticLambda5;
import o.animate;
import o.captureEndValues;
import o.teardown;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_CurrencySelectActivity<B extends SearchBarKtExternalSyntheticLambda5, VM extends AutoCallback, LM extends RVManifestIProxyManifest> extends BaseHomeActivity<B, VM, LM> {
    private static int asBinder = 1;
    private static int onTransact;
    private boolean asInterface;

    Hilt_CurrencySelectActivity(Function1<? super LayoutInflater, ? extends B> function1) {
        super(function1);
        this.asInterface = false;
        onNavigationEvent();
    }

    private void onNavigationEvent() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.features.home.ui.view.currency.select.Hilt_CurrencySelectActivity.1
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 17;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Hilt_CurrencySelectActivity.this.aR_();
                int i5 = onExtraCallback + 113;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 60 / 0;
                }
            }
        });
        int i2 = asBinder + 15;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    public void aR_() {
        int i = 2 % 2;
        if (this.asInterface) {
            return;
        }
        int i2 = onTransact + 75;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        this.asInterface = true;
        ((teardown) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onExtraCallbackWithResult((CurrencySelectActivity) animate.onExtraCallbackWithResult(this));
        int i4 = onTransact + 77;
        asBinder = i4 % 128;
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
