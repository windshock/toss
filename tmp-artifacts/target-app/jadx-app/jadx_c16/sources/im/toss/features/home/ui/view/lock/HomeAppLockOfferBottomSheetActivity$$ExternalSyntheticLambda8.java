package im.toss.features.home.ui.view.lock;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getTypedExportedConstants;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeAppLockOfferBottomSheetActivity$$ExternalSyntheticLambda8 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ HomeAppLockOfferBottomSheetActivity f$0;
    public final /* synthetic */ getTypedExportedConstants f$1;

    public /* synthetic */ HomeAppLockOfferBottomSheetActivity$$ExternalSyntheticLambda8(HomeAppLockOfferBottomSheetActivity homeAppLockOfferBottomSheetActivity, getTypedExportedConstants gettypedexportedconstants) {
        this.f$0 = homeAppLockOfferBottomSheetActivity;
        this.f$1 = gettypedexportedconstants;
    }

    public final Object invoke(Object obj) {
        Unit unitOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnNavigationEvent = HomeAppLockOfferBottomSheetActivity.onNavigationEvent(this.f$0, this.f$1, (View) obj);
            int i3 = 33 / 0;
        } else {
            unitOnNavigationEvent = HomeAppLockOfferBottomSheetActivity.onNavigationEvent(this.f$0, this.f$1, (View) obj);
        }
        int i4 = onWarmupCompleted + 13;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }
}
