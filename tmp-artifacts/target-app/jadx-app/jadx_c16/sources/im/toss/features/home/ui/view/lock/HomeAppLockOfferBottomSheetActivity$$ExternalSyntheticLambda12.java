package im.toss.features.home.ui.view.lock;

import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeAppLockOfferBottomSheetActivity$$ExternalSyntheticLambda12 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        onExtraCallbackWithResult = i2 % 128;
        Throwable th = (Throwable) obj;
        if (i2 % 2 == 0) {
            return HomeAppLockOfferBottomSheetActivity.onExtraCallbackWithResult(th);
        }
        HomeAppLockOfferBottomSheetActivity.onExtraCallbackWithResult(th);
        throw null;
    }
}
