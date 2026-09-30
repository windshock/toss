package o;

import im.toss.features.account_terminator.ui.util.ComposeUtilsKt$;
import im.toss.inventory_sdk.InventoryAdManager;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class DefaultEmbedViewManagerMessage {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static final accessisMonitoringp<InventoryAdManager> onWarmupCompleted = setPostviewFormatSelector.IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda0) null, new ComposeUtilsKt$.ExternalSyntheticLambda0(), 1, (Object) null);

    public static /* synthetic */ InventoryAdManager onWarmupCompleted() {
        InventoryAdManager inventoryAdManagerOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            inventoryAdManagerOnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i3 = 64 / 0;
        } else {
            inventoryAdManagerOnExtraCallbackWithResult = onExtraCallbackWithResult();
        }
        int i4 = IAuthTabCallback + 5;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return inventoryAdManagerOnExtraCallbackWithResult;
    }

    static {
        int i = onNavigationEvent + 57;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 49 / 0;
        }
    }

    private static final InventoryAdManager onExtraCallbackWithResult() {
        int i = 2 % 2;
        throw new IllegalStateException("InventoryAdManager is not provided");
    }

    public static final accessisMonitoringp<InventoryAdManager> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        accessisMonitoringp<InventoryAdManager> accessismonitoringp = onWarmupCompleted;
        if (i3 == 0) {
            int i4 = 18 / 0;
        }
        return accessismonitoringp;
    }
}
