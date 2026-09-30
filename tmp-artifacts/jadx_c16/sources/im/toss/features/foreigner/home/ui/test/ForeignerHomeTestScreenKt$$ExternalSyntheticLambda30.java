package im.toss.features.foreigner.home.ui.test;

import im.toss.inventory_sdk.InventoryAdManager;
import kotlin.jvm.functions.Function0;
import o.findResAndMsg;
import o.getSupportedHighSpeedResolutionsFor;
import o.setCallUrl;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ForeignerHomeTestScreenKt$$ExternalSyntheticLambda30 implements Function0 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ findResAndMsg f$0;
    public final /* synthetic */ InventoryAdManager f$1;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$2;

    public /* synthetic */ ForeignerHomeTestScreenKt$$ExternalSyntheticLambda30(findResAndMsg findresandmsg, InventoryAdManager inventoryAdManager, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        this.f$0 = findresandmsg;
        this.f$1 = inventoryAdManager;
        this.f$2 = getsupportedhighspeedresolutionsfor;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        findResAndMsg findresandmsg = this.f$0;
        if (i3 != 0) {
            return setCallUrl.onExtraCallback(findresandmsg, this.f$1, this.f$2);
        }
        int i4 = 89 / 0;
        return setCallUrl.onExtraCallback(findresandmsg, this.f$1, this.f$2);
    }
}
