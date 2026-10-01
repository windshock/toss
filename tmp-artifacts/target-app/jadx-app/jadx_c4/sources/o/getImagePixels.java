package o;

import im.toss.features.ble.web.CheckBLEPermissionMessageHandler;
import im.toss.features.ble.web.RequestBLEPermissionMessageHandler;
import im.toss.features.ble.web.RequestBleLocationTurnOnHandler;
import im.toss.features.ble.web.RequestBluetoothOnHandler;
import im.toss.features.ble.web.RequestBluetoothTurnOnMessageHandler;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getImagePixels implements ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private final Map<String, Class<? extends drawTextBox>> onExtraCallback;
    private final Map<Class<? extends drawTextBox>, List<String>> onExtraCallbackWithResult;
    private final int onWarmupCompleted;

    public getImagePixels() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.onExtraCallback = linkedHashMap;
        this.onExtraCallbackWithResult = access8100.onNavigationEvent();
        this.onWarmupCompleted = linkedHashMap.size();
        linkedHashMap.put("startBackgroundBLE", DevicePerformanceFieldGroup.class);
        linkedHashMap.put("updateNotiRewardBLE", DevicePerformanceFieldGroup.class);
        linkedHashMap.put("scanBackgroundBLE", DevicePerformanceFieldGroup.class);
        linkedHashMap.put("stopBackgroundBLE", DevicePerformanceFieldGroup.class);
        linkedHashMap.put("checkBLEPermission", CheckBLEPermissionMessageHandler.class);
        linkedHashMap.put("checkBluetoothStatus", initSystem.class);
        linkedHashMap.put("requestBleLocationTurnOn", RequestBleLocationTurnOnHandler.class);
        linkedHashMap.put("requestBLEPermission", RequestBLEPermissionMessageHandler.class);
        linkedHashMap.put("requestBluetoothOn", RequestBluetoothOnHandler.class);
        linkedHashMap.put("requestBluetoothTurnOn", RequestBluetoothTurnOnMessageHandler.class);
        linkedHashMap.put("startScanBLEDevices", DeviceStorageFieldGroup.class);
        linkedHashMap.put("stopScanBLEDevices", DeviceStorageFieldGroup.class);
    }

    @Override // o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1
    public Map<Class<? extends drawTextBox>, List<String>> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1
    public drawTextBox IAuthTabCallback(@NotNull String str) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            Class<? extends drawTextBox> cls = this.onExtraCallback.get(str);
            if (cls == null) {
                return null;
            }
            return cls.newInstance();
        }
    }

    @Override // o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1
    public Set<String> onExtraCallbackWithResult() {
        Set<String> setKeySet;
        synchronized (this) {
            setKeySet = this.onExtraCallback.keySet();
        }
        return setKeySet;
    }
}
