package o;

import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import o.TTAppOpenAdActivity;
import o.TTAppOpenAdActivity5;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class IABLandingPageActivity9 extends IABLandingPageActivity7 {
    private final HashMap<PendingIntent, onExtraCallback> onExtraCallbackWithResult = new HashMap<>();

    IABLandingPageActivity9() {
    }

    public onExtraCallback onNavigationEvent(@NonNull PendingIntent pendingIntent) {
        synchronized (this.onExtraCallbackWithResult) {
            if (!this.onExtraCallbackWithResult.containsKey(pendingIntent)) {
                return null;
            }
            onExtraCallback onextracallback = this.onExtraCallbackWithResult.get(pendingIntent);
            if (onextracallback != null) {
                return onextracallback;
            }
            throw new IllegalStateException("Scanning has been stopped");
        }
    }

    public void onNavigationEvent(@NonNull PendingIntent pendingIntent, @NonNull onExtraCallback onextracallback) {
        synchronized (this.onExtraCallbackWithResult) {
            this.onExtraCallbackWithResult.put(pendingIntent, onextracallback);
        }
    }

    @Override // o.IABLandingPageActivity7, o.IABLandingPageActivity6
    ScanSettings onWarmupCompleted(@NonNull BluetoothAdapter bluetoothAdapter, @NonNull TTAppOpenAdActivity5 tTAppOpenAdActivity5, boolean z) {
        ScanSettings.Builder builder = new ScanSettings.Builder();
        if (z || (bluetoothAdapter.isOffloadedScanBatchingSupported() && tTAppOpenAdActivity5.IAuthTabCallback_Parcel())) {
            builder.setReportDelay(tTAppOpenAdActivity5.access100());
        }
        if (z || tTAppOpenAdActivity5.IAuthTabCallbackStubProxy()) {
            builder.setCallbackType(tTAppOpenAdActivity5.onWarmupCompleted()).setMatchMode(tTAppOpenAdActivity5.asBinder()).setNumOfMatches(tTAppOpenAdActivity5.IAuthTabCallbackStub());
        }
        builder.setScanMode(tTAppOpenAdActivity5.getInterfaceDescriptor()).setLegacy(tTAppOpenAdActivity5.onExtraCallback()).setPhy(tTAppOpenAdActivity5.IAuthTabCallbackDefault());
        return builder.build();
    }

    public TTAppOpenAdActivity5 IAuthTabCallback(@NonNull ScanSettings scanSettings, boolean z, boolean z2, boolean z3, long j, long j2, int i, int i2) {
        return new TTAppOpenAdActivity5.onNavigationEvent().onWarmupCompleted(scanSettings.getLegacy()).onWarmupCompleted(scanSettings.getPhy()).onNavigationEvent(scanSettings.getCallbackType()).IAuthTabCallback(scanSettings.getScanMode()).onExtraCallback(scanSettings.getReportDelayMillis()).onExtraCallback(z).onNavigationEvent(z2).IAuthTabCallback(z3).IAuthTabCallback(j, j2).onExtraCallback(i).onExtraCallbackWithResult(i2).onExtraCallback();
    }

    public ArrayList<TTAppOpenAdActivity> onExtraCallback(@NonNull List<ScanFilter> list) {
        ArrayList<TTAppOpenAdActivity> arrayList = new ArrayList<>();
        Iterator<ScanFilter> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(onExtraCallbackWithResult(it.next()));
        }
        return arrayList;
    }

    TTAppOpenAdActivity onExtraCallbackWithResult(@NonNull ScanFilter scanFilter) {
        TTAppOpenAdActivity.onExtraCallbackWithResult onextracallbackwithresult = new TTAppOpenAdActivity.onExtraCallbackWithResult();
        onextracallbackwithresult.onExtraCallback(scanFilter.getDeviceAddress()).IAuthTabCallback(scanFilter.getDeviceName()).onWarmupCompleted(scanFilter.getServiceUuid(), scanFilter.getServiceUuidMask()).IAuthTabCallback(scanFilter.getManufacturerId(), scanFilter.getManufacturerData(), scanFilter.getManufacturerDataMask());
        if (scanFilter.getServiceDataUuid() != null) {
            onextracallbackwithresult.onExtraCallback(scanFilter.getServiceDataUuid(), scanFilter.getServiceData(), scanFilter.getServiceDataMask());
        }
        return onextracallbackwithresult.onNavigationEvent();
    }

    @Override // o.IABLandingPageActivity6
    TTAppOpenAdActivity2 IAuthTabCallback(@NonNull ScanResult scanResult) {
        int dataStatus = scanResult.getDataStatus();
        int i = scanResult.isLegacy() ? 16 : 0;
        return new TTAppOpenAdActivity2(scanResult.getDevice(), (dataStatus << 5) | i | scanResult.isConnectable(), scanResult.getPrimaryPhy(), scanResult.getSecondaryPhy(), scanResult.getAdvertisingSid(), scanResult.getTxPower(), scanResult.getRssi(), scanResult.getPeriodicAdvertisingInterval(), TTAppOpenAdActivity3.IAuthTabCallback(scanResult.getScanRecord() != null ? scanResult.getScanRecord().getBytes() : null), scanResult.getTimestampNanos());
    }
}
