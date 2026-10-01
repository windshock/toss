package o;

import android.bluetooth.BluetoothGattCharacteristic;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import no.nordicsemi.android.ble.Request;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class onInterstitialShown extends Request {
    public onInterstitialShown(@NonNull Request.Type type) {
        super(type);
    }

    onInterstitialShown(@NonNull Request.Type type, @Nullable BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        super(type, bluetoothGattCharacteristic);
    }
}
