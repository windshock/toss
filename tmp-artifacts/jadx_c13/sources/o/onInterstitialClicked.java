package o;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import no.nordicsemi.android.ble.Request;
import no.nordicsemi.android.ble.RequestHandler;
import o.onInterstitialClicked;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class onInterstitialClicked extends onInterstitialImpression<TTAdConstantNATIVE_AD_TYPE> {
    private final int extraCallbackWithResult;

    public onInterstitialClicked(@NonNull Request.Type type, int i) {
        super(type);
        i = i < 23 ? 23 : i;
        this.extraCallbackWithResult = i > 517 ? 517 : i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public onInterstitialClicked onNavigationEvent(@NonNull RequestHandler requestHandler) {
        super.onNavigationEvent(requestHandler);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public onInterstitialClicked onExtraCallbackWithResult(@Nullable Handler handler) {
        super.onExtraCallbackWithResult(handler);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public onInterstitialClicked onExtraCallbackWithResult(@NonNull TTC ttc) {
        super.onExtraCallbackWithResult(ttc);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public onInterstitialClicked onNavigationEvent(@NonNull TTAdConstant tTAdConstant) {
        super.onNavigationEvent(tTAdConstant);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public onInterstitialClicked onExtraCallbackWithResult(@NonNull isUseTextureView isusetextureview) {
        super.onExtraCallbackWithResult(isusetextureview);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public onInterstitialClicked onWarmupCompleted(@NonNull setIsSelected setisselected) {
        super.onWarmupCompleted(setisselected);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public onInterstitialClicked onExtraCallback(@NonNull getPA getpa) {
        super.onExtraCallback(getpa);
        return this;
    }

    @Override // o.onInterstitialImpression
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public onInterstitialClicked onExtraCallbackWithResult(@NonNull TTAdConstantNATIVE_AD_TYPE tTAdConstantNATIVE_AD_TYPE) {
        super.onExtraCallbackWithResult((onInterstitialClicked) tTAdConstantNATIVE_AD_TYPE);
        return this;
    }

    public void onWarmupCompleted(@NonNull final BluetoothDevice bluetoothDevice, final int i) {
        this.asInterface.onExtraCallbackWithResult(new Runnable() { // from class: no.nordicsemi.android.ble.MtuRequest$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                onInterstitialClicked.onWarmupCompleted(this.f$0, bluetoothDevice, i);
            }
        });
    }

    public static /* synthetic */ void onWarmupCompleted(onInterstitialClicked oninterstitialclicked, BluetoothDevice bluetoothDevice, int i) {
        T t = oninterstitialclicked.writeTypedObject;
        if (t != 0) {
            try {
                ((TTAdConstantNATIVE_AD_TYPE) t).onMtuChanged(bluetoothDevice, i);
            } catch (Throwable unused) {
            }
        }
    }

    int onWarmupCompleted() {
        return this.extraCallbackWithResult;
    }
}
