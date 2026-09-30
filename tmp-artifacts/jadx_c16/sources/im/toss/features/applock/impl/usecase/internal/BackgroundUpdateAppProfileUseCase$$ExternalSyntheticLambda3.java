package im.toss.features.applock.impl.usecase.internal;

import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import kotlin.jvm.functions.Function1;
import o.RVServerMsgHandler;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BackgroundUpdateAppProfileUseCase$$ExternalSyntheticLambda3 implements deserializeFloat {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, obj};
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        if (i3 == 0) {
            RVServerMsgHandler.onExtraCallback(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1912644221, 1912644221, objArr);
        } else {
            RVServerMsgHandler.onExtraCallback(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1912644221, 1912644221, objArr);
            throw null;
        }
    }
}
