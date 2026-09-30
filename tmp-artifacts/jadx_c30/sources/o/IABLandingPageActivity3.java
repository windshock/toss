package o;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.List;
import o.IABLandingPageActivity3;
import o.IABLandingPageActivity5;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class IABLandingPageActivity3 extends IABLandingPageActivity5 {
    private long onExtraCallback;
    private long onExtraCallbackWithResult;
    private HandlerThread onNavigationEvent;
    private Handler onWarmupCompleted;
    private final IABLandingPageActivityycx<IABLandingPageActivity5.onExtraCallback> IAuthTabCallbackStub = new IABLandingPageActivityycx<>();
    private final Runnable IAuthTabCallbackDefault = new Runnable() { // from class: o.IABLandingPageActivity3.1
        @Override // java.lang.Runnable
        public void run() {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter == null || IABLandingPageActivity3.this.onExtraCallback <= 0 || IABLandingPageActivity3.this.onExtraCallbackWithResult <= 0) {
                return;
            }
            defaultAdapter.stopLeScan(IABLandingPageActivity3.this.asBinder);
            IABLandingPageActivity3.this.onWarmupCompleted.postDelayed(IABLandingPageActivity3.this.IAuthTabCallback, IABLandingPageActivity3.this.onExtraCallback);
        }
    };
    private final Runnable IAuthTabCallback = new Runnable() { // from class: o.IABLandingPageActivity3.3
        @Override // java.lang.Runnable
        public void run() {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter == null || IABLandingPageActivity3.this.onExtraCallback <= 0 || IABLandingPageActivity3.this.onExtraCallbackWithResult <= 0) {
                return;
            }
            defaultAdapter.startLeScan(IABLandingPageActivity3.this.asBinder);
            IABLandingPageActivity3.this.onWarmupCompleted.postDelayed(IABLandingPageActivity3.this.IAuthTabCallbackDefault, IABLandingPageActivity3.this.onExtraCallbackWithResult);
        }
    };
    private final BluetoothAdapter.LeScanCallback asBinder = new BluetoothAdapter.LeScanCallback() { // from class: no.nordicsemi.android.support.v18.scanner.BluetoothLeScannerImplJB$$ExternalSyntheticLambda0
        @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
        public final void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
            IABLandingPageActivity3.IAuthTabCallback(this.f$0, bluetoothDevice, i, bArr);
        }
    };

    IABLandingPageActivity3() {
    }

    void onWarmupCompleted(@NonNull List<TTAppOpenAdActivity> list, @NonNull TTAppOpenAdActivity5 tTAppOpenAdActivity5, @NonNull onScrollChange onscrollchange, @NonNull Handler handler) {
        boolean zOnNavigationEvent;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        synchronized (this.IAuthTabCallbackStub) {
            if (this.IAuthTabCallbackStub.IAuthTabCallback(onscrollchange)) {
                throw new IllegalArgumentException("scanner already started with given scanCallback");
            }
            IABLandingPageActivity5.onExtraCallback onextracallback = new IABLandingPageActivity5.onExtraCallback(false, false, list, tTAppOpenAdActivity5, new TTAppOpenAdActivity4(onscrollchange), handler);
            zOnNavigationEvent = this.IAuthTabCallbackStub.onNavigationEvent();
            this.IAuthTabCallbackStub.onExtraCallback(onextracallback);
        }
        if (this.onNavigationEvent == null) {
            HandlerThread handlerThread = new HandlerThread(IABLandingPageActivity3.class.getName());
            this.onNavigationEvent = handlerThread;
            handlerThread.start();
            this.onWarmupCompleted = new Handler(this.onNavigationEvent.getLooper());
        }
        onExtraCallback();
        if (zOnNavigationEvent) {
            defaultAdapter.startLeScan(this.asBinder);
        }
    }

    void onExtraCallbackWithResult(@NonNull onScrollChange onscrollchange) {
        IABLandingPageActivity5.onExtraCallback onExtraCallback;
        boolean zOnNavigationEvent;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        synchronized (this.IAuthTabCallbackStub) {
            onExtraCallback = this.IAuthTabCallbackStub.onExtraCallback(onscrollchange);
            zOnNavigationEvent = this.IAuthTabCallbackStub.onNavigationEvent();
        }
        if (onExtraCallback != null) {
            onExtraCallback.onWarmupCompleted();
            onExtraCallback();
            if (zOnNavigationEvent) {
                defaultAdapter.stopLeScan(this.asBinder);
                Handler handler = this.onWarmupCompleted;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
                HandlerThread handlerThread = this.onNavigationEvent;
                if (handlerThread != null) {
                    handlerThread.quitSafely();
                    this.onNavigationEvent = null;
                }
            }
        }
    }

    private void onExtraCallback() {
        long jOnTransact;
        long jAsInterface;
        synchronized (this.IAuthTabCallbackStub) {
            Iterator it = this.IAuthTabCallbackStub.IAuthTabCallback().iterator();
            jOnTransact = Long.MAX_VALUE;
            jAsInterface = Long.MAX_VALUE;
            while (it.hasNext()) {
                TTAppOpenAdActivity5 tTAppOpenAdActivity5 = ((IABLandingPageActivity5.onExtraCallback) it.next()).IAuthTabCallback;
                if (tTAppOpenAdActivity5.extraCallback()) {
                    if (jOnTransact > tTAppOpenAdActivity5.onTransact()) {
                        jOnTransact = tTAppOpenAdActivity5.onTransact();
                    }
                    if (jAsInterface > tTAppOpenAdActivity5.asInterface()) {
                        jAsInterface = tTAppOpenAdActivity5.asInterface();
                    }
                }
            }
        }
        if (jOnTransact < Long.MAX_VALUE && jAsInterface < Long.MAX_VALUE) {
            this.onExtraCallback = jOnTransact;
            this.onExtraCallbackWithResult = jAsInterface;
            Handler handler = this.onWarmupCompleted;
            if (handler != null) {
                handler.removeCallbacks(this.IAuthTabCallback);
                this.onWarmupCompleted.removeCallbacks(this.IAuthTabCallbackDefault);
                this.onWarmupCompleted.postDelayed(this.IAuthTabCallbackDefault, this.onExtraCallbackWithResult);
                return;
            }
            return;
        }
        this.onExtraCallbackWithResult = 0L;
        this.onExtraCallback = 0L;
        Handler handler2 = this.onWarmupCompleted;
        if (handler2 != null) {
            handler2.removeCallbacks(this.IAuthTabCallback);
            this.onWarmupCompleted.removeCallbacks(this.IAuthTabCallbackDefault);
        }
    }

    public static /* synthetic */ void IAuthTabCallback(IABLandingPageActivity3 iABLandingPageActivity3, BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        final TTAppOpenAdActivity2 tTAppOpenAdActivity2 = new TTAppOpenAdActivity2(bluetoothDevice, TTAppOpenAdActivity3.IAuthTabCallback(bArr), i, SystemClock.elapsedRealtimeNanos());
        synchronized (iABLandingPageActivity3.IAuthTabCallbackStub) {
            for (final IABLandingPageActivity5.onExtraCallback onextracallback : iABLandingPageActivity3.IAuthTabCallbackStub.IAuthTabCallback()) {
                onextracallback.onWarmupCompleted.post(new Runnable() { // from class: no.nordicsemi.android.support.v18.scanner.BluetoothLeScannerImplJB$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        onextracallback.onExtraCallback(1, tTAppOpenAdActivity2);
                    }
                });
            }
        }
    }
}
