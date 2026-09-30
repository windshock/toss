package im.toss.features.home.ui.dst.view.asset.edit;

import im.toss.features.home.ui.dst.view.asset.edit.AssetEditBottomSheetActivity;
import im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetEditBottomSheetActivity$AssetSummaryEditType$$ExternalSyntheticLambda0 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ Function2 f$0;
    public final /* synthetic */ TdsListRowV1View f$1;

    public /* synthetic */ AssetEditBottomSheetActivity$AssetSummaryEditType$$ExternalSyntheticLambda0(Function2 function2, TdsListRowV1View tdsListRowV1View) {
        this.f$0 = function2;
        this.f$1 = tdsListRowV1View;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit$r8$lambda$kRSBM7dvXVN36laYlgRIWAZkc5k = AssetEditBottomSheetActivity.onWarmupCompleted.$r8$lambda$kRSBM7dvXVN36laYlgRIWAZkc5k(this.f$0, this.f$1, (TdsCheckBoxV2View) obj, ((Boolean) obj2).booleanValue());
        int i4 = onExtraCallback + 29;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit$r8$lambda$kRSBM7dvXVN36laYlgRIWAZkc5k;
    }
}
