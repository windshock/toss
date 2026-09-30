package im.toss.features.home.ui.dst.view.asset.edit;

import android.view.View;
import im.toss.features.home.ui.dst.view.asset.edit.AssetEditBottomSheetActivity;
import im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetEditBottomSheetActivity$AssetSummaryEditType$$ExternalSyntheticLambda1 implements View.OnClickListener {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ TdsCheckBoxV2View f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        AssetEditBottomSheetActivity.onWarmupCompleted.$r8$lambda$5lo0TmprMPs9HkRvo9tCWcyv91c(this.f$0, view);
        int i4 = onWarmupCompleted + 5;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }
}
