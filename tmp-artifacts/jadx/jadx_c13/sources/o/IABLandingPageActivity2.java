package o;

import android.bluetooth.BluetoothDevice;
import androidx.annotation.NonNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface IABLandingPageActivity2 {
    void IAuthTabCallback();

    void onNavigationEvent(@NonNull BluetoothDevice bluetoothDevice);

    void onWarmupCompleted(@NonNull BluetoothDevice bluetoothDevice);
}
