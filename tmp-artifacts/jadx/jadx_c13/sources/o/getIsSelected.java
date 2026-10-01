package o;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import no.nordicsemi.android.ble.Request;
import no.nordicsemi.android.ble.RequestHandler;
import o.getIsSelected;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class getIsSelected extends Request {
    public boolean extraCallbackWithResult;
    private Runnable readTypedObject;
    protected long writeTypedObject;

    public getIsSelected(@NonNull Request.Type type) {
        super(type);
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public getIsSelected onNavigationEvent(@NonNull RequestHandler requestHandler) {
        super.onNavigationEvent(requestHandler);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public getIsSelected onExtraCallbackWithResult(@Nullable Handler handler) {
        super.onExtraCallbackWithResult(handler);
        return this;
    }

    public void cw_() {
        if (!this.IAuthTabCallback_Parcel) {
            this.extraCallbackWithResult = true;
            this.onTransact = true;
        } else {
            if (this.onTransact) {
                return;
            }
            this.extraCallbackWithResult = true;
            this.access000.ITrustedWebActivityCallback();
        }
    }

    @Override // no.nordicsemi.android.ble.Request
    public final void extraCallback() {
        super.extraCallback();
    }

    @Override // no.nordicsemi.android.ble.Request
    public void onExtraCallback(@NonNull final BluetoothDevice bluetoothDevice) {
        if (this.writeTypedObject > 0) {
            Runnable runnable = new Runnable() { // from class: no.nordicsemi.android.ble.TimeoutableRequest$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    getIsSelected.IAuthTabCallback(this.f$0, bluetoothDevice);
                }
            };
            this.readTypedObject = runnable;
            this.asInterface.onNavigationEvent(runnable, this.writeTypedObject);
        }
        super.onExtraCallback(bluetoothDevice);
    }

    public static /* synthetic */ void IAuthTabCallback(getIsSelected getisselected, BluetoothDevice bluetoothDevice) {
        getisselected.readTypedObject = null;
        if (getisselected.onTransact) {
            return;
        }
        getisselected.access000.onWarmupCompleted(bluetoothDevice, getisselected);
    }

    @Override // no.nordicsemi.android.ble.Request
    public boolean onNavigationEvent(@NonNull BluetoothDevice bluetoothDevice) {
        Runnable runnable = this.readTypedObject;
        if (runnable != null) {
            this.asInterface.onWarmupCompleted(runnable);
            this.readTypedObject = null;
        }
        return super.onNavigationEvent(bluetoothDevice);
    }

    @Override // no.nordicsemi.android.ble.Request
    public void onExtraCallbackWithResult(@NonNull BluetoothDevice bluetoothDevice, int i) {
        Runnable runnable = this.readTypedObject;
        if (runnable != null) {
            this.asInterface.onWarmupCompleted(runnable);
            this.readTypedObject = null;
        }
        super.onExtraCallbackWithResult(bluetoothDevice, i);
    }

    @Override // no.nordicsemi.android.ble.Request
    public void writeTypedObject() {
        Runnable runnable = this.readTypedObject;
        if (runnable != null) {
            this.asInterface.onWarmupCompleted(runnable);
            this.readTypedObject = null;
        }
        super.writeTypedObject();
    }

    public final boolean readTypedObject() {
        return this.extraCallbackWithResult;
    }
}
