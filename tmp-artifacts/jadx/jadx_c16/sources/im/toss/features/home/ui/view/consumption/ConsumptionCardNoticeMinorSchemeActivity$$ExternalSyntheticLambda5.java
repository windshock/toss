package im.toss.features.home.ui.view.consumption;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getTypedExportedConstants;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ConsumptionCardNoticeMinorSchemeActivity$$ExternalSyntheticLambda5 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ ConsumptionCardNoticeMinorSchemeActivity f$0;
    public final /* synthetic */ getTypedExportedConstants f$1;

    public /* synthetic */ ConsumptionCardNoticeMinorSchemeActivity$$ExternalSyntheticLambda5(ConsumptionCardNoticeMinorSchemeActivity consumptionCardNoticeMinorSchemeActivity, getTypedExportedConstants gettypedexportedconstants) {
        this.f$0 = consumptionCardNoticeMinorSchemeActivity;
        this.f$1 = gettypedexportedconstants;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = ConsumptionCardNoticeMinorSchemeActivity.onExtraCallbackWithResult(this.f$0, this.f$1, (View) obj);
        int i4 = onExtraCallback + 111;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
