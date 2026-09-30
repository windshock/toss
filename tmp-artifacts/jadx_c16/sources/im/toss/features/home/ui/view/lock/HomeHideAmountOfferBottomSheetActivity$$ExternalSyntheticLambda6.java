package im.toss.features.home.ui.view.lock;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getTypedExportedConstants;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeHideAmountOfferBottomSheetActivity$$ExternalSyntheticLambda6 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ HomeHideAmountOfferBottomSheetActivity f$0;
    public final /* synthetic */ getTypedExportedConstants f$1;

    public /* synthetic */ HomeHideAmountOfferBottomSheetActivity$$ExternalSyntheticLambda6(HomeHideAmountOfferBottomSheetActivity homeHideAmountOfferBottomSheetActivity, getTypedExportedConstants gettypedexportedconstants) {
        this.f$0 = homeHideAmountOfferBottomSheetActivity;
        this.f$1 = gettypedexportedconstants;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            HomeHideAmountOfferBottomSheetActivity.IAuthTabCallback(this.f$0, this.f$1, (View) obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = HomeHideAmountOfferBottomSheetActivity.IAuthTabCallback(this.f$0, this.f$1, (View) obj);
        int i3 = onExtraCallback + 113;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }
}
