package im.toss.features.home.ui.view.lock;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getTypedExportedConstants;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeAppLockOfferBottomSheetActivity$$ExternalSyntheticLambda6 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ HomeAppLockOfferBottomSheetActivity f$0;
    public final /* synthetic */ getTypedExportedConstants f$1;

    public /* synthetic */ HomeAppLockOfferBottomSheetActivity$$ExternalSyntheticLambda6(HomeAppLockOfferBottomSheetActivity homeAppLockOfferBottomSheetActivity, getTypedExportedConstants gettypedexportedconstants) {
        this.f$0 = homeAppLockOfferBottomSheetActivity;
        this.f$1 = gettypedexportedconstants;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = HomeAppLockOfferBottomSheetActivity.onWarmupCompleted(this.f$0, this.f$1, (View) obj);
        int i4 = onExtraCallback + 7;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }
}
