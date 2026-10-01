package im.toss.features.foreigner.home.ui.test;

import im.toss.inventory_sdk.InventoryAdManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.findResAndMsg;
import o.getSupportedHighSpeedResolutionsFor;
import o.setCallUrl;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ForeignerHomeTestScreenKt$$ExternalSyntheticLambda25 implements Function2 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ findResAndMsg f$0;
    public final /* synthetic */ InventoryAdManager f$1;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$2;

    public /* synthetic */ ForeignerHomeTestScreenKt$$ExternalSyntheticLambda25(findResAndMsg findresandmsg, InventoryAdManager inventoryAdManager, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        this.f$0 = findresandmsg;
        this.f$1 = inventoryAdManager;
        this.f$2 = getsupportedhighspeedresolutionsfor;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = setCallUrl.onWarmupCompleted(this.f$0, this.f$1, this.f$2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = onWarmupCompleted + 89;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }
}
