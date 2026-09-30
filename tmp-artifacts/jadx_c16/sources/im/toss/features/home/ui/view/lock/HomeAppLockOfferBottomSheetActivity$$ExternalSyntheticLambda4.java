package im.toss.features.home.ui.view.lock;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeAppLockOfferBottomSheetActivity$$ExternalSyntheticLambda4 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ HomeAppLockOfferBottomSheetActivity$$ExternalSyntheticLambda4(String str, String str2) {
        this.f$0 = str;
        this.f$1 = str2;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            HomeAppLockOfferBottomSheetActivity.onExtraCallback(this.f$0, this.f$1, (SetDetectableSize) obj);
            throw null;
        }
        Unit unitOnExtraCallback = HomeAppLockOfferBottomSheetActivity.onExtraCallback(this.f$0, this.f$1, (SetDetectableSize) obj);
        int i3 = onExtraCallbackWithResult + 51;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 27 / 0;
        }
        return unitOnExtraCallback;
    }
}
