package o;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import no.nordicsemi.android.ble.RequestHandler;
import no.nordicsemi.android.ble.WaitForValueChangedRequest$;
import no.nordicsemi.android.ble.callback.ReadProgressCallback;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class hasSecondOptions extends getOnceLogInterval<TTAdConstantNETWORK_STATE> {
    private ReadProgressCallback ICustomTabsCallbackDefault;
    private getImageUrl ICustomTabsCallbackStubProxy;
    private boolean onActivityLayout;
    private win onActivityResized;
    private int onMessageChannelReady;
    private TTAdConstantTITLE_BAR_THEME onMinimized;
    private TTDislikeDialogAbstract onPostMessage;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.getIsSelected, no.nordicsemi.android.ble.Request
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public hasSecondOptions onNavigationEvent(@NonNull RequestHandler requestHandler) {
        super.onNavigationEvent(requestHandler);
        return this;
    }

    @Override // o.getIsSelected, no.nordicsemi.android.ble.Request
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public hasSecondOptions onExtraCallbackWithResult(@Nullable Handler handler) {
        super.onExtraCallbackWithResult(handler);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public hasSecondOptions onExtraCallbackWithResult(@NonNull TTC ttc) {
        super.onExtraCallbackWithResult(ttc);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public hasSecondOptions onNavigationEvent(@NonNull TTAdConstant tTAdConstant) {
        super.onNavigationEvent(tTAdConstant);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public hasSecondOptions onExtraCallbackWithResult(@NonNull isUseTextureView isusetextureview) {
        super.onExtraCallbackWithResult(isusetextureview);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public hasSecondOptions onWarmupCompleted(@NonNull setIsSelected setisselected) {
        super.onWarmupCompleted(setisselected);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public hasSecondOptions onExtraCallback(@NonNull getPA getpa) {
        super.onExtraCallback(getpa);
        return this;
    }

    public boolean onNavigationEvent(byte[] bArr) {
        TTAdConstantTITLE_BAR_THEME tTAdConstantTITLE_BAR_THEME = this.onMinimized;
        return tTAdConstantTITLE_BAR_THEME == null || tTAdConstantTITLE_BAR_THEME.onExtraCallback(bArr);
    }

    public void onExtraCallbackWithResult(BluetoothDevice bluetoothDevice, byte[] bArr) {
        getImageUrl getimageurl;
        TTAdConstantNETWORK_STATE tTAdConstantNETWORK_STATE = (TTAdConstantNETWORK_STATE) ((addOption) this).readTypedObject;
        if (tTAdConstantNETWORK_STATE == null) {
            getImageUrl getimageurl2 = this.ICustomTabsCallbackStubProxy;
            if (getimageurl2 == null || getimageurl2.IAuthTabCallback(bArr)) {
                this.onActivityLayout = true;
                return;
            }
            return;
        }
        if (this.onPostMessage == null && ((getimageurl = this.ICustomTabsCallbackStubProxy) == null || getimageurl.IAuthTabCallback(bArr))) {
            this.onActivityLayout = true;
            this.asInterface.onExtraCallbackWithResult(new WaitForValueChangedRequest$.ExternalSyntheticLambda0(tTAdConstantNETWORK_STATE, bluetoothDevice, new loss(bArr)));
            return;
        }
        this.asInterface.onExtraCallbackWithResult(new WaitForValueChangedRequest$.ExternalSyntheticLambda1(this, bluetoothDevice, bArr, this.onMessageChannelReady));
        if (this.onActivityResized == null) {
            this.onActivityResized = new win();
        }
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.onPostMessage;
        win winVar = this.onActivityResized;
        int i = this.onMessageChannelReady;
        this.onMessageChannelReady = i + 1;
        if (tTDislikeDialogAbstract.onExtraCallbackWithResult(winVar, bArr, i)) {
            byte[] bArrOnExtraCallbackWithResult = this.onActivityResized.onExtraCallbackWithResult();
            getImageUrl getimageurl3 = this.ICustomTabsCallbackStubProxy;
            if (getimageurl3 == null || getimageurl3.IAuthTabCallback(bArrOnExtraCallbackWithResult)) {
                this.onActivityLayout = true;
                this.asInterface.onExtraCallbackWithResult(new WaitForValueChangedRequest$.ExternalSyntheticLambda2(tTAdConstantNETWORK_STATE, bluetoothDevice, new loss(bArrOnExtraCallbackWithResult)));
            }
            this.onActivityResized = null;
            this.onMessageChannelReady = 0;
        }
    }

    public static /* synthetic */ void onWarmupCompleted(hasSecondOptions hassecondoptions, BluetoothDevice bluetoothDevice, byte[] bArr, int i) {
        ReadProgressCallback readProgressCallback = hassecondoptions.ICustomTabsCallbackDefault;
        if (readProgressCallback != null) {
            try {
                readProgressCallback.onPacketReceived(bluetoothDevice, bArr, i);
            } catch (Throwable unused) {
            }
        }
    }

    public boolean IAuthTabCallback() {
        return this.onActivityLayout;
    }
}
