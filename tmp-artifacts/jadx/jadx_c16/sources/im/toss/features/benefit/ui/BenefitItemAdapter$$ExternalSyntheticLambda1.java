package im.toss.features.benefit.ui;

import android.view.View;
import im.toss.features.benefit.ui.component.InventoryBenefitCardView;
import o.SensorBridgeExtension1;
import o.getNameByOperatorName;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitItemAdapter$$ExternalSyntheticLambda1 implements View.OnClickListener {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ SensorBridgeExtension1 f$0;
    public final /* synthetic */ getNameByOperatorName f$1;
    public final /* synthetic */ InventoryBenefitCardView f$2;

    public /* synthetic */ BenefitItemAdapter$$ExternalSyntheticLambda1(SensorBridgeExtension1 sensorBridgeExtension1, getNameByOperatorName getnamebyoperatorname, InventoryBenefitCardView inventoryBenefitCardView) {
        this.f$0 = sensorBridgeExtension1;
        this.f$1 = getnamebyoperatorname;
        this.f$2 = inventoryBenefitCardView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            getNameByOperatorName.onNavigationEvent(this.f$0, this.f$1, this.f$2, view);
            throw null;
        }
        getNameByOperatorName.onNavigationEvent(this.f$0, this.f$1, this.f$2, view);
        int i3 = onNavigationEvent + 47;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
    }
}
