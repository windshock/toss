package o;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import no.nordicsemi.android.ble.Request;
import no.nordicsemi.android.ble.RequestHandler;
import no.nordicsemi.android.ble.WriteRequest$;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class InitConfig extends onInterstitialImpression<isSupportMultiProcess> {
    private static final getLayoutView readTypedObject = new getDislikeManager();
    private final int ICustomTabsCallbackDefault;
    private boolean extraCallbackWithResult;
    private int onActivityLayout;
    private byte[] onActivityResized;
    private final byte[] onMessageChannelReady;
    private getLayoutView onMinimized;
    private byte[] onPostMessage;
    private TTClientBidding onUnminimized;

    public InitConfig(@NonNull Request.Type type) {
        this(type, null);
    }

    InitConfig(@NonNull Request.Type type, @Nullable BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        super(type, bluetoothGattCharacteristic);
        this.onActivityLayout = 0;
        this.onMessageChannelReady = null;
        this.ICustomTabsCallbackDefault = 0;
        this.extraCallbackWithResult = true;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public InitConfig onNavigationEvent(@NonNull RequestHandler requestHandler) {
        super.onNavigationEvent(requestHandler);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public InitConfig onExtraCallbackWithResult(@Nullable Handler handler) {
        super.onExtraCallbackWithResult(handler);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public InitConfig onExtraCallbackWithResult(@NonNull TTC ttc) {
        super.onExtraCallbackWithResult(ttc);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public InitConfig onNavigationEvent(@NonNull TTAdConstant tTAdConstant) {
        super.onNavigationEvent(tTAdConstant);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public InitConfig onExtraCallbackWithResult(@NonNull isUseTextureView isusetextureview) {
        super.onExtraCallbackWithResult(isusetextureview);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public InitConfig onWarmupCompleted(@NonNull setIsSelected setisselected) {
        super.onWarmupCompleted(setisselected);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public InitConfig onExtraCallback(@NonNull getPA getpa) {
        super.onExtraCallback(getpa);
        return this;
    }

    @Override // o.onInterstitialImpression
    public InitConfig onExtraCallbackWithResult(@NonNull isSupportMultiProcess issupportmultiprocess) {
        super.onExtraCallbackWithResult((InitConfig) issupportmultiprocess);
        return this;
    }

    byte[] onNavigationEvent(int i) {
        byte[] bArr;
        getLayoutView getlayoutview = this.onMinimized;
        if (getlayoutview == null || (bArr = this.onMessageChannelReady) == null) {
            this.extraCallbackWithResult = true;
            byte[] bArr2 = this.onMessageChannelReady;
            this.onActivityResized = bArr2;
            return bArr2 != null ? bArr2 : new byte[0];
        }
        int i2 = this.ICustomTabsCallbackDefault != 4 ? i - 3 : i - 12;
        byte[] bArrOnWarmupCompleted = this.onPostMessage;
        if (bArrOnWarmupCompleted == null) {
            bArrOnWarmupCompleted = getlayoutview.onWarmupCompleted(bArr, this.onActivityLayout, i2);
        }
        if (bArrOnWarmupCompleted != null) {
            this.onPostMessage = this.onMinimized.onWarmupCompleted(this.onMessageChannelReady, this.onActivityLayout + 1, i2);
        }
        if (this.onPostMessage == null) {
            this.extraCallbackWithResult = true;
        }
        this.onActivityResized = bArrOnWarmupCompleted;
        return bArrOnWarmupCompleted != null ? bArrOnWarmupCompleted : new byte[0];
    }

    public boolean onNavigationEvent(@NonNull BluetoothDevice bluetoothDevice, @Nullable byte[] bArr) {
        this.asInterface.onExtraCallbackWithResult(new WriteRequest$.ExternalSyntheticLambda0(this, bluetoothDevice));
        this.onActivityLayout++;
        if (this.extraCallbackWithResult) {
            this.asInterface.onExtraCallbackWithResult(new WriteRequest$.ExternalSyntheticLambda1(this, bluetoothDevice));
        }
        if (this.ICustomTabsCallbackDefault == 2) {
            return Arrays.equals(bArr, this.onActivityResized);
        }
        return true;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(InitConfig initConfig, BluetoothDevice bluetoothDevice) {
        TTClientBidding tTClientBidding = initConfig.onUnminimized;
        if (tTClientBidding != null) {
            try {
                tTClientBidding.onPacketSent(bluetoothDevice, initConfig.onActivityResized, initConfig.onActivityLayout);
            } catch (Throwable unused) {
            }
        }
    }

    public static /* synthetic */ void onNavigationEvent(InitConfig initConfig, BluetoothDevice bluetoothDevice) {
        T t = initConfig.writeTypedObject;
        if (t != 0) {
            try {
                ((isSupportMultiProcess) t).onDataSent(bluetoothDevice, new loss(initConfig.onMessageChannelReady));
            } catch (Throwable unused) {
            }
        }
    }

    public boolean onExtraCallbackWithResult() {
        return !this.extraCallbackWithResult;
    }

    int onNavigationEvent() {
        return this.ICustomTabsCallbackDefault;
    }
}
