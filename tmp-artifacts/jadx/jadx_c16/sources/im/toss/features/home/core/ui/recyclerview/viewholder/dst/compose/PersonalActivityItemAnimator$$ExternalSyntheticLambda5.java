package im.toss.features.home.core.ui.recyclerview.viewholder.dst.compose;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.GeckoHubImp;
import o.isGetMethod;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class PersonalActivityItemAnimator$$ExternalSyntheticLambda5 implements Function0 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ isGetMethod f$0;

    public final Object invoke() {
        Unit unit;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 97;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = {this.f$0};
            unit = (Unit) isGetMethod.onNavigationEvent(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1997354375, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1997354374, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), objArr, GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
            int i3 = 16 / 0;
        } else {
            Object[] objArr2 = {this.f$0};
            unit = (Unit) isGetMethod.onNavigationEvent(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1997354375, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1997354374, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), objArr2, GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
        }
        int i4 = onNavigationEvent + 81;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
