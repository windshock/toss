package o;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.ScanSettings;
import androidx.annotation.NonNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
class IABLandingPageActivity7 extends IABLandingPageActivity6 {
    IABLandingPageActivity7() {
    }

    @Override // o.IABLandingPageActivity6
    ScanSettings onWarmupCompleted(@NonNull BluetoothAdapter bluetoothAdapter, @NonNull TTAppOpenAdActivity5 tTAppOpenAdActivity5, boolean z) {
        ScanSettings.Builder builder = new ScanSettings.Builder();
        if (z || (bluetoothAdapter.isOffloadedScanBatchingSupported() && tTAppOpenAdActivity5.IAuthTabCallback_Parcel())) {
            builder.setReportDelay(tTAppOpenAdActivity5.access100());
        }
        if (z || tTAppOpenAdActivity5.IAuthTabCallbackStubProxy()) {
            builder.setCallbackType(tTAppOpenAdActivity5.onWarmupCompleted()).setMatchMode(tTAppOpenAdActivity5.asBinder()).setNumOfMatches(tTAppOpenAdActivity5.IAuthTabCallbackStub());
        }
        builder.setScanMode(tTAppOpenAdActivity5.getInterfaceDescriptor());
        return builder.build();
    }
}
