package im.toss.features.home.core.ui.base.dst;

import android.view.View;
import kotlin.jvm.functions.Function0;
import o.IIpcChannelStubProxy;
import o.RVManifestLazyProxyManifest1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseHomeDstActivity$$ExternalSyntheticLambda2 implements Function0 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ IIpcChannelStubProxy f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ RVManifestLazyProxyManifest1 f$2;
    public final /* synthetic */ View f$3;
    public final /* synthetic */ float f$4;

    public /* synthetic */ BaseHomeDstActivity$$ExternalSyntheticLambda2(IIpcChannelStubProxy iIpcChannelStubProxy, int i, RVManifestLazyProxyManifest1 rVManifestLazyProxyManifest1, View view, float f) {
        this.f$0 = iIpcChannelStubProxy;
        this.f$1 = i;
        this.f$2 = rVManifestLazyProxyManifest1;
        this.f$3 = view;
        this.f$4 = f;
    }

    public final Object invoke() {
        Boolean boolValueOf;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            boolValueOf = Boolean.valueOf(BaseHomeDstActivity.onWarmupCompleted(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4));
            int i3 = 32 / 0;
        } else {
            boolValueOf = Boolean.valueOf(BaseHomeDstActivity.onWarmupCompleted(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4));
        }
        int i4 = onWarmupCompleted + 115;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return boolValueOf;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
