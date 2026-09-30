package im.toss.features.ble.service;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.WorkerParameters;
import o.access;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AdvertisingBLEGattService$$ExternalSyntheticLambda2 implements Function0 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ AdvertisingBLEGattService f$0;
    public final /* synthetic */ WorkerParameters f$1;

    public /* synthetic */ AdvertisingBLEGattService$$ExternalSyntheticLambda2(AdvertisingBLEGattService advertisingBLEGattService, WorkerParameters workerParameters) {
        this.f$0 = advertisingBLEGattService;
        this.f$1 = workerParameters;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, this.f$1};
        Unit unit = (Unit) AdvertisingBLEGattService.IAuthTabCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -573765402, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 573765404, objArr);
        int i4 = onNavigationEvent + 47;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
