package o;

import im.toss.features.ble.service.AdvertisingBLEService;
import im.toss.splittarget.spec.fsm.AppState;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class initSdkInit implements setSize<AdvertisingBLEService> {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    public static void onExtraCallback(AdvertisingBLEService advertisingBLEService, getAppBaseInfoFieldGroup getappbaseinfofieldgroup) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        advertisingBLEService.bleApi = getappbaseinfofieldgroup;
        int i4 = onWarmupCompleted + 121;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void IAuthTabCallback(AdvertisingBLEService advertisingBLEService, AppState appState) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        advertisingBLEService.appState = appState;
        int i4 = onWarmupCompleted + 67;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void onExtraCallback(AdvertisingBLEService advertisingBLEService, zzag zzagVar) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        advertisingBLEService.tossClock = zzagVar;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
