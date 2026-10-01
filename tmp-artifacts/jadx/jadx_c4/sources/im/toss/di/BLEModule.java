package im.toss.di;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class BLEModule {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public static final BLEModule onNavigationEvent = new BLEModule();
    private static int onWarmupCompleted;

    static {
        int i = onWarmupCompleted + 53;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 58 / 0;
        }
    }

    private BLEModule() {
    }

    public final BluetoothAdapter onNavigationEvent(@NotNull Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        BluetoothManager bluetoothManager = (BluetoothManager) ContextCompat.getSystemService(context, BluetoothManager.class);
        if (bluetoothManager != null) {
            int i2 = onExtraCallback + 51;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return bluetoothManager.getAdapter();
        }
        int i4 = onExtraCallbackWithResult + 55;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }
}
