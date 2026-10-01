package o;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import no.nordicsemi.android.ble.RequestHandler;
import no.nordicsemi.android.ble.WaitForReadRequest$;
import o.FilterWord;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class FilterWord extends getOnceLogInterval<isSupportMultiProcess> {
    private static final getLayoutView onActivityLayout = new getDislikeManager();
    private byte[] ICustomTabsCallbackStubProxy;
    private int onActivityResized;
    private getLayoutView onMessageChannelReady;
    private byte[] onMinimized;
    private boolean onPostMessage;
    private TTClientBidding onRelationshipValidationResult;

    void onWarmupCompleted(@Nullable byte[] bArr) {
        if (this.onMinimized == null) {
            this.onMinimized = bArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.getIsSelected, no.nordicsemi.android.ble.Request
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public FilterWord onNavigationEvent(@NonNull RequestHandler requestHandler) {
        super.onNavigationEvent(requestHandler);
        return this;
    }

    @Override // o.getIsSelected, no.nordicsemi.android.ble.Request
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public FilterWord onExtraCallbackWithResult(@Nullable Handler handler) {
        super.onExtraCallbackWithResult(handler);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public FilterWord onExtraCallbackWithResult(@NonNull TTC ttc) {
        super.onExtraCallbackWithResult(ttc);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public FilterWord onNavigationEvent(@NonNull TTAdConstant tTAdConstant) {
        super.onNavigationEvent(tTAdConstant);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public FilterWord onExtraCallbackWithResult(@NonNull isUseTextureView isusetextureview) {
        super.onExtraCallbackWithResult(isusetextureview);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public FilterWord onWarmupCompleted(@NonNull setIsSelected setisselected) {
        super.onWarmupCompleted(setisselected);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public FilterWord onExtraCallback(@NonNull getPA getpa) {
        super.onExtraCallback(getpa);
        return this;
    }

    byte[] onExtraCallbackWithResult(int i) {
        byte[] bArr;
        getLayoutView getlayoutview = this.onMessageChannelReady;
        if (getlayoutview == null || (bArr = this.onMinimized) == null) {
            this.onPostMessage = true;
            byte[] bArr2 = this.onMinimized;
            return bArr2 != null ? bArr2 : new byte[0];
        }
        int i2 = i - 1;
        byte[] bArrOnWarmupCompleted = this.ICustomTabsCallbackStubProxy;
        if (bArrOnWarmupCompleted == null) {
            bArrOnWarmupCompleted = getlayoutview.onWarmupCompleted(bArr, this.onActivityResized, i2);
        }
        if (bArrOnWarmupCompleted != null) {
            this.ICustomTabsCallbackStubProxy = this.onMessageChannelReady.onWarmupCompleted(this.onMinimized, this.onActivityResized + 1, i2);
        }
        if (this.ICustomTabsCallbackStubProxy == null) {
            this.onPostMessage = true;
        }
        return bArrOnWarmupCompleted != null ? bArrOnWarmupCompleted : new byte[0];
    }

    void IAuthTabCallback(@NonNull BluetoothDevice bluetoothDevice, @Nullable byte[] bArr) {
        this.asInterface.onExtraCallbackWithResult(new WaitForReadRequest$.ExternalSyntheticLambda0(this, bluetoothDevice, bArr));
        this.onActivityResized++;
    }

    public static /* synthetic */ void onNavigationEvent(FilterWord filterWord, BluetoothDevice bluetoothDevice, byte[] bArr) {
        TTClientBidding tTClientBidding = filterWord.onRelationshipValidationResult;
        if (tTClientBidding != null) {
            try {
                tTClientBidding.onPacketSent(bluetoothDevice, bArr, filterWord.onActivityResized);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // o.getIsSelected, no.nordicsemi.android.ble.Request
    public boolean onNavigationEvent(@NonNull final BluetoothDevice bluetoothDevice) {
        this.asInterface.onExtraCallbackWithResult(new Runnable() { // from class: no.nordicsemi.android.ble.WaitForReadRequest$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                FilterWord.onExtraCallback(this.f$0, bluetoothDevice);
            }
        });
        return super.onNavigationEvent(bluetoothDevice);
    }

    public static /* synthetic */ void onExtraCallback(FilterWord filterWord, BluetoothDevice bluetoothDevice) {
        T t = ((addOption) filterWord).readTypedObject;
        if (t != 0) {
            try {
                ((isSupportMultiProcess) t).onDataSent(bluetoothDevice, new loss(filterWord.onMinimized));
            } catch (Throwable unused) {
            }
        }
    }

    boolean onWarmupCompleted() {
        return !this.onPostMessage;
    }
}
