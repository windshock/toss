package im.toss.features.home.feature.asset_home.activity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import im.toss.features.home.core.ui.base.dst.BaseHomeDstActivity;
import kotlin.jvm.functions.Function1;
import o.NativePermissionRequire;
import o.RVManifestIProxyManifest;
import o.SearchBarKtExternalSyntheticLambda5;
import o.animate;
import o.captureEndValues;
import o.getTimeCost;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_AssetHomeListActivity<B extends SearchBarKtExternalSyntheticLambda5, VM extends NativePermissionRequire, LM extends RVManifestIProxyManifest> extends BaseHomeDstActivity<B, VM, LM> {
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private boolean onTransact;

    Hilt_AssetHomeListActivity(Function1<? super LayoutInflater, ? extends B> function1) {
        super(function1);
        this.onTransact = false;
        onNavigationEvent();
    }

    private void onNavigationEvent() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.features.home.feature.asset_home.activity.Hilt_AssetHomeListActivity.2
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 47;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Hilt_AssetHomeListActivity.this.aR_();
                if (i4 == 0) {
                    throw null;
                }
            }
        });
        int i2 = IAuthTabCallbackStub + 103;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
    }

    public void aR_() {
        int i = 2 % 2;
        if (!this.onTransact) {
            int i2 = IAuthTabCallbackDefault + 59;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            this.onTransact = true;
            ((getTimeCost) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onWarmupCompleted((AssetHomeListActivity) animate.onExtraCallbackWithResult(this));
        }
        int i4 = IAuthTabCallbackStub + 31;
        IAuthTabCallbackDefault = i4 % 128;
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
