package o;

import im.toss.features.ble.service.AdvertisingBLEGattService;
import im.toss.splittarget.spec.fsm.AppState;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getRefreshRateOpen implements setSize<AdvertisingBLEGattService> {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public static void onNavigationEvent(AdvertisingBLEGattService advertisingBLEGattService, RescheduleReceiver rescheduleReceiver) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        advertisingBLEGattService.tossBleScanner = rescheduleReceiver;
        int i4 = onExtraCallback + 47;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 16 / 0;
        }
    }

    public static void onWarmupCompleted(AdvertisingBLEGattService advertisingBLEGattService, RunnableScheduler runnableScheduler) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        advertisingBLEGattService.tossBackgroundAdvertiser = runnableScheduler;
        int i4 = onExtraCallbackWithResult + 21;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 35 / 0;
        }
    }

    public static void onWarmupCompleted(AdvertisingBLEGattService advertisingBLEGattService, onAccuracyChanged onaccuracychanged) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        advertisingBLEGattService.badNotificationCrashRecorder = onaccuracychanged;
        int i4 = onExtraCallbackWithResult + 43;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void IAuthTabCallback(AdvertisingBLEGattService advertisingBLEGattService, zzag zzagVar) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        advertisingBLEGattService.tossClock = zzagVar;
        int i4 = onExtraCallbackWithResult + 85;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void IAuthTabCallback(AdvertisingBLEGattService advertisingBLEGattService, isBlackSafeArea isblacksafearea) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        advertisingBLEGattService.bleScanResultHandler = isblacksafearea;
        if (i3 != 0) {
            int i4 = 62 / 0;
        }
        int i5 = onExtraCallback + 37;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static void onExtraCallbackWithResult(AdvertisingBLEGattService advertisingBLEGattService, AppState appState) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        advertisingBLEGattService.appState = appState;
        int i4 = onExtraCallback + 97;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void onExtraCallbackWithResult(AdvertisingBLEGattService advertisingBLEGattService, DeviceInfoFieldGroup deviceInfoFieldGroup) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        advertisingBLEGattService.airdropRepository = deviceInfoFieldGroup;
        if (i3 != 0) {
            int i4 = 73 / 0;
        }
        int i5 = onExtraCallbackWithResult + 17;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public static void onExtraCallback(AdvertisingBLEGattService advertisingBLEGattService, removeTabBarModel removetabbarmodel) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        advertisingBLEGattService.airdropTermsManager = removetabbarmodel;
        int i4 = onExtraCallback + 33;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }
}
