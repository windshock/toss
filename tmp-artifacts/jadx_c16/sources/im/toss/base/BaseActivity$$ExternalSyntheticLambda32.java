package im.toss.base;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.onAdViewAdDisplayFailed;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseActivity$$ExternalSyntheticLambda32 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ BaseActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) BaseActivity.onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -1544066914, new Object[]{this.f$0, (String) obj}, 1544066922, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult());
        int i4 = onExtraCallbackWithResult + 103;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
