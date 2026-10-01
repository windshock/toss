package im.toss.features.ble.service;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.WorkerParameters;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AdvertisingBLEGattService$$ExternalSyntheticLambda4 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ AdvertisingBLEGattService f$0;
    public final /* synthetic */ WorkerParameters f$1;

    public /* synthetic */ AdvertisingBLEGattService$$ExternalSyntheticLambda4(AdvertisingBLEGattService advertisingBLEGattService, WorkerParameters workerParameters) {
        this.f$0 = advertisingBLEGattService;
        this.f$1 = workerParameters;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = AdvertisingBLEGattService.onExtraCallbackWithResult(this.f$0, this.f$1);
        int i4 = onNavigationEvent + 37;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
