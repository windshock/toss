package o;

import android.bluetooth.BluetoothDevice;
import androidx.annotation.NonNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface onMonitorUpload {
    @Deprecated
    default boolean onExtraCallbackWithResult(@NonNull BluetoothDevice bluetoothDevice) {
        return false;
    }
}
