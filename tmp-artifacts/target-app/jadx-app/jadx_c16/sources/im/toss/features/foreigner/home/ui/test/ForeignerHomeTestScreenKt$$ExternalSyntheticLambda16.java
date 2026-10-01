package im.toss.features.foreigner.home.ui.test;

import im.toss.inventory_sdk.InventoryAdManager;
import im.toss.rn.appsintoss.api.model.contacts_common.PushInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.setCallUrl;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ForeignerHomeTestScreenKt$$ExternalSyntheticLambda16 implements Function2 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ InventoryAdManager f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ ForeignerHomeTestScreenKt$$ExternalSyntheticLambda16(InventoryAdManager inventoryAdManager, int i) {
        this.f$0 = inventoryAdManager;
        this.f$1 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        InventoryAdManager inventoryAdManager = this.f$0;
        int i4 = this.f$1;
        int iIntValue = ((Integer) obj2).intValue();
        Object[] objArr = {inventoryAdManager, Integer.valueOf(i4), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)};
        Unit unit = (Unit) setCallUrl.onExtraCallback(1814901241, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), -1814901239, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), objArr);
        int i5 = onNavigationEvent + 9;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }
}
