package o;

import android.bluetooth.BluetoothGattCharacteristic;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import no.nordicsemi.android.ble.Request;
import no.nordicsemi.android.ble.RequestHandler;
import org.opencv.imgcodecs.Imgcodecs;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class onLeaveApplication extends onInterstitialShown {
    private final byte[] extraCallbackWithResult;
    private boolean readTypedObject;

    public onLeaveApplication(@NonNull Request.Type type, @Nullable BluetoothGattCharacteristic bluetoothGattCharacteristic, @Nullable byte[] bArr, int i, int i2) {
        super(type, bluetoothGattCharacteristic);
        this.readTypedObject = true;
        this.extraCallbackWithResult = CacheDirFactory.IAuthTabCallback(bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public onLeaveApplication onNavigationEvent(@NonNull RequestHandler requestHandler) {
        super.onNavigationEvent(requestHandler);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public onLeaveApplication onExtraCallbackWithResult(@Nullable Handler handler) {
        super.onExtraCallbackWithResult(handler);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public onLeaveApplication onExtraCallbackWithResult(@NonNull TTC ttc) {
        super.onExtraCallbackWithResult(ttc);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public onLeaveApplication onNavigationEvent(@NonNull TTAdConstant tTAdConstant) {
        super.onNavigationEvent(tTAdConstant);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public onLeaveApplication onExtraCallbackWithResult(@NonNull isUseTextureView isusetextureview) {
        super.onExtraCallbackWithResult(isusetextureview);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public onLeaveApplication onWarmupCompleted(@NonNull setIsSelected setisselected) {
        super.onWarmupCompleted(setisselected);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public onLeaveApplication onExtraCallback(@NonNull getPA getpa) {
        super.onExtraCallback(getpa);
        return this;
    }

    byte[] onExtraCallback(int i) {
        int i2 = this.readTypedObject ? Imgcodecs.IMWRITE_AVIF_QUALITY : i - 3;
        byte[] bArr = this.extraCallbackWithResult;
        return bArr.length < i2 ? bArr : CacheDirFactory.IAuthTabCallback(bArr, 0, i2);
    }
}
