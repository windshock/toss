package im.toss.features.home.ui.view.lock;

import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeAppLockOfferBottomSheetActivity$$ExternalSyntheticLambda14 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ HomeAppLockOfferBottomSheetActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        HomeAppLockOfferBottomSheetActivity homeAppLockOfferBottomSheetActivity = this.f$0;
        SetDetectableSize setDetectableSize = (SetDetectableSize) obj;
        if (i3 != 0) {
            return HomeAppLockOfferBottomSheetActivity.IAuthTabCallback(homeAppLockOfferBottomSheetActivity, setDetectableSize);
        }
        HomeAppLockOfferBottomSheetActivity.IAuthTabCallback(homeAppLockOfferBottomSheetActivity, setDetectableSize);
        throw null;
    }
}
