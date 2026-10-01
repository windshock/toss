package im.toss.features.home.ui.dst.view.asset;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import im.toss.features.home.core.ui.base.BaseHomeActivity;
import kotlin.jvm.functions.Function1;
import o.AutoCallback;
import o.JsApiHandler1;
import o.RVManifestIProxyManifest;
import o.SearchBarKtExternalSyntheticLambda5;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_AssetActivity<B extends SearchBarKtExternalSyntheticLambda5, VM extends AutoCallback, LM extends RVManifestIProxyManifest> extends BaseHomeActivity<B, VM, LM> {
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private boolean onTransact;

    Hilt_AssetActivity(Function1<? super LayoutInflater, ? extends B> function1) {
        super(function1);
        this.onTransact = false;
        onNavigationEvent();
    }

    private void onNavigationEvent() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.features.home.ui.dst.view.asset.Hilt_AssetActivity.5
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 101;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    Hilt_AssetActivity.this.aR_();
                    throw null;
                }
                Hilt_AssetActivity.this.aR_();
                int i4 = onExtraCallback + 41;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 52 / 0;
                }
            }
        });
        int i2 = asBinder + 37;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void aR_() {
        JsApiHandler1 jsApiHandler1;
        Object objOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 101;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        if (!this.onTransact) {
            int i5 = i3 + 59;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                this.onTransact = true;
                jsApiHandler1 = (JsApiHandler1) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent();
                objOnExtraCallbackWithResult = animate.onExtraCallbackWithResult(this);
            } else {
                this.onTransact = true;
                jsApiHandler1 = (JsApiHandler1) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent();
                objOnExtraCallbackWithResult = animate.onExtraCallbackWithResult(this);
            }
            jsApiHandler1.IAuthTabCallback((AssetActivity) objOnExtraCallbackWithResult);
            int i6 = asBinder + 111;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
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
