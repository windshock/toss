package im.toss.ads_sdk.ui.v2.view;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsThumbnailVideoV2View$$ExternalSyntheticLambda1 implements Function0 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ Context f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Context context = this.f$0;
        if (i3 == 0) {
            return NativeAdsThumbnailVideoV2View.onWarmupCompleted(context);
        }
        NativeAdsThumbnailVideoV2View.onWarmupCompleted(context);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
