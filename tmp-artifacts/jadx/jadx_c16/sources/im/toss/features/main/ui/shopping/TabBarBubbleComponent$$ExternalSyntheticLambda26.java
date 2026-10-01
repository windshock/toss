package im.toss.features.main.ui.shopping;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TabBarBubbleComponent$$ExternalSyntheticLambda26 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ TabBarBubbleComponent f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            TabBarBubbleComponent.asBinder(this.f$0);
            throw null;
        }
        Unit unitAsBinder = TabBarBubbleComponent.asBinder(this.f$0);
        int i3 = onExtraCallbackWithResult + 63;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitAsBinder;
    }
}
