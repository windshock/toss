package im.toss.features.ble.service;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.WorkerParameters;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AdvertisingBLEGattService$$ExternalSyntheticLambda3 implements Function0 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ AdvertisingBLEGattService f$0;
    public final /* synthetic */ WorkerParameters f$1;

    public /* synthetic */ AdvertisingBLEGattService$$ExternalSyntheticLambda3(AdvertisingBLEGattService advertisingBLEGattService, WorkerParameters workerParameters) {
        this.f$0 = advertisingBLEGattService;
        this.f$1 = workerParameters;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = AdvertisingBLEGattService.onNavigationEvent(this.f$0, this.f$1);
        int i4 = onNavigationEvent + 49;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
