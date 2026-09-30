package im.toss.features.home.ui.view.lock;

import kotlin.jvm.functions.Function1;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeAppLockOfferBottomSheetActivity$$ExternalSyntheticLambda11 implements deserializeFloat {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        HomeAppLockOfferBottomSheetActivity.onWarmupCompleted(this.f$0, obj);
        int i4 = onNavigationEvent + 63;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
