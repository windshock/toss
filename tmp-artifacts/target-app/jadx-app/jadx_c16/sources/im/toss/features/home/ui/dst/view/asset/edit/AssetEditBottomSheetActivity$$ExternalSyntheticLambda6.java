package im.toss.features.home.ui.dst.view.asset.edit;

import im.toss.features.home.ui.dst.view.asset.edit.AssetEditBottomSheetActivity;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetEditBottomSheetActivity$$ExternalSyntheticLambda6 implements Function2 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ AssetEditBottomSheetActivity f$0;
    public final /* synthetic */ AssetEditBottomSheetActivity.onWarmupCompleted f$1;

    public /* synthetic */ AssetEditBottomSheetActivity$$ExternalSyntheticLambda6(AssetEditBottomSheetActivity assetEditBottomSheetActivity, AssetEditBottomSheetActivity.onWarmupCompleted onwarmupcompleted) {
        this.f$0 = assetEditBottomSheetActivity;
        this.f$1 = onwarmupcompleted;
    }

    public final Object invoke(Object obj, Object obj2) {
        Unit unitOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            unitOnWarmupCompleted = AssetEditBottomSheetActivity.onWarmupCompleted(this.f$0, this.f$1, (TdsListRowV1View) obj, ((Boolean) obj2).booleanValue());
            int i3 = 72 / 0;
        } else {
            unitOnWarmupCompleted = AssetEditBottomSheetActivity.onWarmupCompleted(this.f$0, this.f$1, (TdsListRowV1View) obj, ((Boolean) obj2).booleanValue());
        }
        int i4 = onExtraCallbackWithResult + 89;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }
}
