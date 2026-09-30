package o;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import no.nordicsemi.android.ble.PhyRequest$;
import no.nordicsemi.android.ble.RequestHandler;
import o.onInterstitialDismissed;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class onInterstitialDismissed extends onInterstitialImpression<TTAdConstantORIENTATION_STATE> {
    private final int extraCallbackWithResult;
    private final int onMessageChannelReady;
    private final int readTypedObject;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public onInterstitialDismissed onNavigationEvent(@NonNull RequestHandler requestHandler) {
        super.onNavigationEvent(requestHandler);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public onInterstitialDismissed onExtraCallbackWithResult(@Nullable Handler handler) {
        super.onExtraCallbackWithResult(handler);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public onInterstitialDismissed onExtraCallbackWithResult(@NonNull TTC ttc) {
        super.onExtraCallbackWithResult(ttc);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public onInterstitialDismissed onNavigationEvent(@NonNull TTAdConstant tTAdConstant) {
        super.onNavigationEvent(tTAdConstant);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public onInterstitialDismissed onExtraCallbackWithResult(@NonNull isUseTextureView isusetextureview) {
        super.onExtraCallbackWithResult(isusetextureview);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public onInterstitialDismissed onWarmupCompleted(@NonNull setIsSelected setisselected) {
        super.onWarmupCompleted(setisselected);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public onInterstitialDismissed onExtraCallback(@NonNull getPA getpa) {
        super.onExtraCallback(getpa);
        return this;
    }

    @Override // o.onInterstitialImpression
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public onInterstitialDismissed onExtraCallbackWithResult(@NonNull TTAdConstantORIENTATION_STATE tTAdConstantORIENTATION_STATE) {
        super.onExtraCallbackWithResult((onInterstitialDismissed) tTAdConstantORIENTATION_STATE);
        return this;
    }

    public void IAuthTabCallback(@NonNull BluetoothDevice bluetoothDevice, int i, int i2) {
        this.asInterface.onExtraCallbackWithResult(new PhyRequest$.ExternalSyntheticLambda0(this, bluetoothDevice, i, i2));
    }

    public static /* synthetic */ void onNavigationEvent(onInterstitialDismissed oninterstitialdismissed, BluetoothDevice bluetoothDevice, int i, int i2) {
        T t = oninterstitialdismissed.writeTypedObject;
        if (t != 0) {
            try {
                ((TTAdConstantORIENTATION_STATE) t).onPhyChanged(bluetoothDevice, i, i2);
            } catch (Throwable unused) {
            }
        }
    }

    void onWarmupCompleted(@NonNull final BluetoothDevice bluetoothDevice) {
        this.asInterface.onExtraCallbackWithResult(new Runnable() { // from class: no.nordicsemi.android.ble.PhyRequest$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                onInterstitialDismissed.onNavigationEvent(this.f$0, bluetoothDevice);
            }
        });
    }

    public static /* synthetic */ void onNavigationEvent(onInterstitialDismissed oninterstitialdismissed, BluetoothDevice bluetoothDevice) {
        T t = oninterstitialdismissed.writeTypedObject;
        if (t != 0) {
            try {
                ((TTAdConstantORIENTATION_STATE) t).onPhyChanged(bluetoothDevice, 1, 1);
            } catch (Throwable unused) {
            }
        }
    }

    int onNavigationEvent() {
        return this.onMessageChannelReady;
    }

    int onExtraCallback() {
        return this.extraCallbackWithResult;
    }

    int IAuthTabCallback() {
        return this.readTypedObject;
    }
}
