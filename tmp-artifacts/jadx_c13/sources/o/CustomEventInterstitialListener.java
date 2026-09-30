package o;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import no.nordicsemi.android.ble.Request;
import no.nordicsemi.android.ble.RequestHandler;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class CustomEventInterstitialListener extends getIsSelected {
    private int onActivityLayout;
    private int onActivityResized;
    private boolean onMessageChannelReady;
    private int onMinimized;
    private final BluetoothDevice onPostMessage;
    private int readTypedObject;

    public CustomEventInterstitialListener(@NonNull Request.Type type, @NonNull BluetoothDevice bluetoothDevice) {
        super(type);
        this.readTypedObject = 0;
        this.onActivityLayout = 0;
        this.onMinimized = 0;
        this.onMessageChannelReady = false;
        this.onPostMessage = bluetoothDevice;
        this.onActivityResized = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.getIsSelected, no.nordicsemi.android.ble.Request
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public CustomEventInterstitialListener onNavigationEvent(@NonNull RequestHandler requestHandler) {
        super.onNavigationEvent(requestHandler);
        return this;
    }

    @Override // o.getIsSelected, no.nordicsemi.android.ble.Request
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public CustomEventInterstitialListener onExtraCallbackWithResult(@Nullable Handler handler) {
        super.onExtraCallbackWithResult(handler);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public CustomEventInterstitialListener onExtraCallbackWithResult(@NonNull TTC ttc) {
        super.onExtraCallbackWithResult(ttc);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public CustomEventInterstitialListener onNavigationEvent(@NonNull TTAdConstant tTAdConstant) {
        super.onNavigationEvent(tTAdConstant);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public CustomEventInterstitialListener onExtraCallbackWithResult(@NonNull isUseTextureView isusetextureview) {
        super.onExtraCallbackWithResult(isusetextureview);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public CustomEventInterstitialListener onWarmupCompleted(@NonNull setIsSelected setisselected) {
        super.onWarmupCompleted(setisselected);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public CustomEventInterstitialListener onExtraCallback(@NonNull getPA getpa) {
        super.onExtraCallback(getpa);
        return this;
    }

    public CustomEventInterstitialListener IAuthTabCallback(boolean z) {
        this.onMessageChannelReady = z;
        return this;
    }

    @Override // o.getIsSelected
    public void cw_() {
        if (!this.IAuthTabCallback_Parcel) {
            this.extraCallbackWithResult = true;
            this.onTransact = true;
        } else {
            if (this.onTransact) {
                return;
            }
            this.extraCallbackWithResult = true;
            this.access000.IPostMessageServiceStubProxy();
        }
    }

    public BluetoothDevice IAuthTabCallback() {
        return this.onPostMessage;
    }

    int onExtraCallback() {
        return this.onActivityResized;
    }

    public boolean onWarmupCompleted() {
        int i = this.onActivityLayout;
        if (i <= 0) {
            return false;
        }
        this.onActivityLayout = i - 1;
        return true;
    }

    boolean asBinder() {
        int i = this.readTypedObject;
        this.readTypedObject = i + 1;
        return i == 0;
    }

    public int onExtraCallbackWithResult() {
        return this.onMinimized;
    }

    public boolean asInterface() {
        return this.onMessageChannelReady;
    }
}
