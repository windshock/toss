package im.toss.ads_sdk.ui.view;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AdsCircularCountdownLayout$$ExternalSyntheticLambda2 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ Context f$0;

    public final Object invoke() {
        Float fValueOf;
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            fValueOf = Float.valueOf(AdsCircularCountdownLayout.onExtraCallbackWithResult(this.f$0));
            int i3 = 31 / 0;
        } else {
            fValueOf = Float.valueOf(AdsCircularCountdownLayout.onExtraCallbackWithResult(this.f$0));
        }
        int i4 = onExtraCallback + 3;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return fValueOf;
    }
}
