package o;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import no.nordicsemi.android.support.v18.scanner.BluetoothLeScannerImplLollipop$ScanCallbackWrapperLollipop$1$;
import o.IABLandingPageActivity5;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class IABLandingPageActivity6 extends IABLandingPageActivity5 {
    private final IABLandingPageActivityycx<IAuthTabCallback> onExtraCallback = new IABLandingPageActivityycx<>();

    IABLandingPageActivity6() {
    }

    @Override // o.IABLandingPageActivity5
    void onWarmupCompleted(@NonNull List<TTAppOpenAdActivity> list, @NonNull TTAppOpenAdActivity5 tTAppOpenAdActivity5, @NonNull onScrollChange onscrollchange, @NonNull Handler handler) {
        IAuthTabCallback iAuthTabCallback;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        BluetoothLeScanner bluetoothLeScanner = defaultAdapter.getBluetoothLeScanner();
        if (bluetoothLeScanner == null) {
            throw new IllegalStateException("BT le scanner not available");
        }
        boolean zIsOffloadedScanBatchingSupported = defaultAdapter.isOffloadedScanBatchingSupported();
        boolean zIsOffloadedFilteringSupported = defaultAdapter.isOffloadedFilteringSupported();
        synchronized (this.onExtraCallback) {
            if (this.onExtraCallback.IAuthTabCallback(onscrollchange)) {
                throw new IllegalArgumentException("scanner already started with given callback");
            }
            iAuthTabCallback = new IAuthTabCallback(zIsOffloadedScanBatchingSupported, zIsOffloadedFilteringSupported, list, tTAppOpenAdActivity5, new TTAppOpenAdActivity4(onscrollchange), handler);
            this.onExtraCallback.onExtraCallback((IABLandingPageActivityycx<IAuthTabCallback>) iAuthTabCallback);
        }
        bluetoothLeScanner.startScan((!list.isEmpty() && zIsOffloadedFilteringSupported && tTAppOpenAdActivity5.access000()) ? onWarmupCompleted(list) : null, onWarmupCompleted(defaultAdapter, tTAppOpenAdActivity5, false), iAuthTabCallback.onExtraCallback);
    }

    @Override // o.IABLandingPageActivity5
    void onExtraCallbackWithResult(@NonNull onScrollChange onscrollchange) {
        IAuthTabCallback iAuthTabCallback;
        BluetoothLeScanner bluetoothLeScanner;
        synchronized (this.onExtraCallback) {
            iAuthTabCallback = (IAuthTabCallback) this.onExtraCallback.onExtraCallback(onscrollchange);
        }
        if (iAuthTabCallback != null) {
            iAuthTabCallback.onWarmupCompleted();
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter == null || (bluetoothLeScanner = defaultAdapter.getBluetoothLeScanner()) == null) {
                return;
            }
            bluetoothLeScanner.stopScan(iAuthTabCallback.onExtraCallback);
        }
    }

    ScanSettings onWarmupCompleted(@NonNull BluetoothAdapter bluetoothAdapter, @NonNull TTAppOpenAdActivity5 tTAppOpenAdActivity5, boolean z) {
        ScanSettings.Builder builder = new ScanSettings.Builder();
        if (z || (bluetoothAdapter.isOffloadedScanBatchingSupported() && tTAppOpenAdActivity5.IAuthTabCallback_Parcel())) {
            builder.setReportDelay(tTAppOpenAdActivity5.access100());
        }
        if (tTAppOpenAdActivity5.getInterfaceDescriptor() != -1) {
            builder.setScanMode(tTAppOpenAdActivity5.getInterfaceDescriptor());
        } else {
            builder.setScanMode(0);
        }
        tTAppOpenAdActivity5.IAuthTabCallback();
        return builder.build();
    }

    ArrayList<ScanFilter> onWarmupCompleted(@NonNull List<TTAppOpenAdActivity> list) {
        ArrayList<ScanFilter> arrayList = new ArrayList<>();
        Iterator<TTAppOpenAdActivity> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(IAuthTabCallback(it.next()));
        }
        return arrayList;
    }

    ScanFilter IAuthTabCallback(@NonNull TTAppOpenAdActivity tTAppOpenAdActivity) {
        ScanFilter.Builder builder = new ScanFilter.Builder();
        builder.setServiceUuid(tTAppOpenAdActivity.IAuthTabCallbackDefault(), tTAppOpenAdActivity.onTransact()).setManufacturerData(tTAppOpenAdActivity.onExtraCallbackWithResult(), tTAppOpenAdActivity.onExtraCallback(), tTAppOpenAdActivity.IAuthTabCallback());
        if (tTAppOpenAdActivity.onNavigationEvent() != null) {
            builder.setDeviceAddress(tTAppOpenAdActivity.onNavigationEvent());
        }
        if (tTAppOpenAdActivity.onWarmupCompleted() != null) {
            builder.setDeviceName(tTAppOpenAdActivity.onWarmupCompleted());
        }
        if (tTAppOpenAdActivity.asInterface() != null) {
            builder.setServiceData(tTAppOpenAdActivity.asInterface(), tTAppOpenAdActivity.asBinder(), tTAppOpenAdActivity.IAuthTabCallbackStub());
        }
        return builder.build();
    }

    TTAppOpenAdActivity2 IAuthTabCallback(@NonNull ScanResult scanResult) {
        return new TTAppOpenAdActivity2(scanResult.getDevice(), TTAppOpenAdActivity3.IAuthTabCallback(scanResult.getScanRecord() != null ? scanResult.getScanRecord().getBytes() : null), scanResult.getRssi(), scanResult.getTimestampNanos());
    }

    public ArrayList<TTAppOpenAdActivity2> IAuthTabCallback(@NonNull List<ScanResult> list) {
        ArrayList<TTAppOpenAdActivity2> arrayList = new ArrayList<>();
        Iterator<ScanResult> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(IAuthTabCallback(it.next()));
        }
        return arrayList;
    }

    static class IAuthTabCallback extends IABLandingPageActivity5.onExtraCallback {
        private final ScanCallback onExtraCallback;

        private IAuthTabCallback(boolean z, boolean z2, @NonNull List<TTAppOpenAdActivity> list, @NonNull TTAppOpenAdActivity5 tTAppOpenAdActivity5, @NonNull onScrollChange onscrollchange, @NonNull Handler handler) {
            super(z, z2, list, tTAppOpenAdActivity5, onscrollchange, handler);
            this.onExtraCallback = new ScanCallback() { // from class: o.IABLandingPageActivity6.IAuthTabCallback.2
                private long onWarmupCompleted;

                @Override // android.bluetooth.le.ScanCallback
                public void onScanResult(int i, ScanResult scanResult) {
                    IAuthTabCallback.this.onWarmupCompleted.post(new BluetoothLeScannerImplLollipop$ScanCallbackWrapperLollipop$1$.ExternalSyntheticLambda2(this, scanResult, i));
                }

                @Override // android.bluetooth.le.ScanCallback
                public void onBatchScanResults(List<ScanResult> list2) {
                    IAuthTabCallback.this.onWarmupCompleted.post(new BluetoothLeScannerImplLollipop$ScanCallbackWrapperLollipop$1$.ExternalSyntheticLambda1(this, list2));
                }

                public static /* synthetic */ void onNavigationEvent(AnonymousClass2 anonymousClass2, List list2) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    if (anonymousClass2.onWarmupCompleted > (jElapsedRealtime - IAuthTabCallback.this.IAuthTabCallback.access100()) + 5) {
                        return;
                    }
                    anonymousClass2.onWarmupCompleted = jElapsedRealtime;
                    IAuthTabCallback.this.IAuthTabCallback(((IABLandingPageActivity6) IABLandingPageActivity5.onNavigationEvent()).IAuthTabCallback((List<ScanResult>) list2));
                }

                @Override // android.bluetooth.le.ScanCallback
                public void onScanFailed(int i) {
                    IAuthTabCallback.this.onWarmupCompleted.post(new BluetoothLeScannerImplLollipop$ScanCallbackWrapperLollipop$1$.ExternalSyntheticLambda0(this, i));
                }

                public static /* synthetic */ void onExtraCallbackWithResult(AnonymousClass2 anonymousClass2, int i) {
                    if (IAuthTabCallback.this.IAuthTabCallback.IAuthTabCallbackStubProxy() && IAuthTabCallback.this.IAuthTabCallback.onWarmupCompleted() != 1) {
                        IAuthTabCallback.this.IAuthTabCallback.IAuthTabCallback();
                        IABLandingPageActivity5 iABLandingPageActivity5OnNavigationEvent = IABLandingPageActivity5.onNavigationEvent();
                        try {
                            iABLandingPageActivity5OnNavigationEvent.onWarmupCompleted(IAuthTabCallback.this.onNavigationEvent);
                        } catch (Exception unused) {
                        }
                        try {
                            IAuthTabCallback iAuthTabCallback = IAuthTabCallback.this;
                            iABLandingPageActivity5OnNavigationEvent.onWarmupCompleted(iAuthTabCallback.onExtraCallbackWithResult, iAuthTabCallback.IAuthTabCallback, iAuthTabCallback.onNavigationEvent, iAuthTabCallback.onWarmupCompleted);
                            return;
                        } catch (Exception unused2) {
                            return;
                        }
                    }
                    IAuthTabCallback.this.IAuthTabCallback(i);
                }
            };
        }
    }
}
