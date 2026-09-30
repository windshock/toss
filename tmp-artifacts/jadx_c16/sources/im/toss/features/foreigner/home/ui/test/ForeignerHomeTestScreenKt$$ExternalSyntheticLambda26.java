package im.toss.features.foreigner.home.ui.test;

import im.toss.inventory_sdk.InventoryAdManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.setCallUrl;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ForeignerHomeTestScreenKt$$ExternalSyntheticLambda26 implements Function2 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ InventoryAdManager f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ ForeignerHomeTestScreenKt$$ExternalSyntheticLambda26(InventoryAdManager inventoryAdManager, int i) {
        this.f$0 = inventoryAdManager;
        this.f$1 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = setCallUrl.onNavigationEvent(this.f$0, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = onWarmupCompleted + 53;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }
}
