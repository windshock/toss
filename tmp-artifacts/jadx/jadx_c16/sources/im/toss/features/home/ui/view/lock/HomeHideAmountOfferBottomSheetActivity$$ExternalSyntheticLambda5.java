package im.toss.features.home.ui.view.lock;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getTypedExportedConstants;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeHideAmountOfferBottomSheetActivity$$ExternalSyntheticLambda5 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ HomeHideAmountOfferBottomSheetActivity f$0;
    public final /* synthetic */ getTypedExportedConstants f$1;

    public /* synthetic */ HomeHideAmountOfferBottomSheetActivity$$ExternalSyntheticLambda5(HomeHideAmountOfferBottomSheetActivity homeHideAmountOfferBottomSheetActivity, getTypedExportedConstants gettypedexportedconstants) {
        this.f$0 = homeHideAmountOfferBottomSheetActivity;
        this.f$1 = gettypedexportedconstants;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 97;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = HomeHideAmountOfferBottomSheetActivity.onExtraCallback(this.f$0, this.f$1, (View) obj);
        int i4 = onExtraCallbackWithResult + 59;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
