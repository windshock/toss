package o;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattServer;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.UUID;
import no.nordicsemi.android.ble.BleManager$;
import no.nordicsemi.android.ble.ReadRequest;
import no.nordicsemi.android.ble.Request;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class getReflectContext {
    TTUnifyWebActivity IAuthTabCallbackDefault;
    IABLandingPageActivity21 IAuthTabCallbackStub;
    private getDiskCacheDirPath IAuthTabCallbackStubProxy;
    private final BroadcastReceiver IAuthTabCallback_Parcel;
    final IAuthTabCallback asBinder;

    @Deprecated
    public onMonitorUpload asInterface;
    private final Context onTransact;
    public static final UUID onExtraCallback = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");
    static final UUID IAuthTabCallback = UUID.fromString("0000180F-0000-1000-8000-00805f9b34fb");
    static final UUID onWarmupCompleted = UUID.fromString("00002A19-0000-1000-8000-00805f9b34fb");
    static final UUID onExtraCallbackWithResult = UUID.fromString("00001801-0000-1000-8000-00805f9b34fb");
    static final UUID onNavigationEvent = UUID.fromString("00002A05-0000-1000-8000-00805f9b34fb");

    public static /* synthetic */ void IAuthTabCallback(getReflectContext getreflectcontext, BluetoothDevice bluetoothDevice) {
    }

    public static /* synthetic */ void onWarmupCompleted(getReflectContext getreflectcontext, BluetoothDevice bluetoothDevice) {
    }

    public int IAuthTabCallback() {
        return 4;
    }

    protected void IAuthTabCallback(@NonNull BluetoothGattServer bluetoothGattServer) {
    }

    protected boolean access000() {
        return false;
    }

    @Deprecated
    protected boolean getInterfaceDescriptor() {
        return false;
    }

    public void onExtraCallback() {
    }

    public int onExtraCallbackWithResult(boolean z) {
        return z ? 1600 : 300;
    }

    public void onExtraCallbackWithResult() {
    }

    public getReflectContext(@NonNull Context context) {
        this(context, new Handler(Looper.getMainLooper()));
    }

    public getReflectContext(@NonNull Context context, @NonNull Handler handler) {
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: o.getReflectContext.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                BluetoothDevice bluetoothDeviceITrustedWebActivityService = getReflectContext.this.asBinder.ITrustedWebActivityService();
                if (bluetoothDeviceITrustedWebActivityService == null || bluetoothDevice == null || !bluetoothDevice.getAddress().equals(bluetoothDeviceITrustedWebActivityService.getAddress())) {
                    return;
                }
                int intExtra = intent.getIntExtra("android.bluetooth.device.extra.PAIRING_VARIANT", 0);
                intent.getIntExtra("android.bluetooth.device.extra.PAIRING_KEY", -1);
                IABLandingPageActivity4.onExtraCallbackWithResult(intExtra);
            }
        };
        this.IAuthTabCallback_Parcel = broadcastReceiver;
        this.onTransact = context;
        IAuthTabCallback iAuthTabCallbackIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        this.asBinder = iAuthTabCallbackIAuthTabCallbackDefault;
        iAuthTabCallbackIAuthTabCallbackDefault.onExtraCallbackWithResult(this, handler);
        context.registerReceiver(broadcastReceiver, new IntentFilter("android.bluetooth.device.action.PAIRING_REQUEST"));
    }

    public boolean onExtraCallback(@NonNull BluetoothGatt bluetoothGatt) {
        return this.asBinder.onWarmupCompleted(bluetoothGatt);
    }

    public boolean onNavigationEvent(@NonNull BluetoothGatt bluetoothGatt) {
        return this.asBinder.onNavigationEvent(bluetoothGatt);
    }

    public void onWarmupCompleted() {
        try {
            this.onTransact.unregisterReceiver(this.IAuthTabCallback_Parcel);
        } catch (Exception unused) {
        }
        getDiskCacheDirPath getdiskcachedirpath = this.IAuthTabCallbackStubProxy;
        if (getdiskcachedirpath != null) {
            getdiskcachedirpath.onExtraCallbackWithResult(this);
        }
        this.asBinder.IPostMessageService_Parcel();
    }

    public final void onNavigationEvent(@NonNull getDiskCacheDirPath getdiskcachedirpath) {
        getDiskCacheDirPath getdiskcachedirpath2 = this.IAuthTabCallbackStubProxy;
        if (getdiskcachedirpath2 != null) {
            getdiskcachedirpath2.onExtraCallbackWithResult(this);
        }
        this.IAuthTabCallbackStubProxy = getdiskcachedirpath;
        getdiskcachedirpath.IAuthTabCallback(this);
        this.asBinder.onNavigationEvent(getdiskcachedirpath);
    }

    final void asInterface() {
        this.IAuthTabCallbackStubProxy = null;
        this.asBinder.onNavigationEvent((getDiskCacheDirPath) null);
    }

    @Deprecated
    protected IAuthTabCallback IAuthTabCallbackDefault() {
        return new IAuthTabCallback() { // from class: o.getReflectContext.3
            @Override // o.BusMonitorDependWrapper1
            protected boolean onWarmupCompleted(@NonNull BluetoothGatt bluetoothGatt) {
                return false;
            }
        };
    }

    protected final Context asBinder() {
        return this.onTransact;
    }

    public BluetoothDevice onNavigationEvent() {
        return this.asBinder.ITrustedWebActivityService();
    }

    public final CustomEventInterstitialListener onExtraCallback(@NonNull BluetoothDevice bluetoothDevice) {
        return Request.onExtraCallbackWithResult(bluetoothDevice).IAuthTabCallback(getInterfaceDescriptor()).onNavigationEvent(this.asBinder);
    }

    public final getRootDir onTransact() {
        return Request.IAuthTabCallbackDefault().onNavigationEvent(this.asBinder);
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(getReflectContext getreflectcontext, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        BluetoothGattDescriptor descriptor;
        byte[] bArrAsInterface;
        return (bluetoothGattCharacteristic == null || (descriptor = bluetoothGattCharacteristic.getDescriptor(onExtraCallback)) == null || (bArrAsInterface = getreflectcontext.asBinder.asInterface(descriptor)) == null || bArrAsInterface.length != 2 || (bArrAsInterface[0] & 1) != 1) ? false : true;
    }

    public static /* synthetic */ boolean IAuthTabCallback(getReflectContext getreflectcontext, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        BluetoothGattDescriptor descriptor;
        byte[] bArrAsInterface;
        return (bluetoothGattCharacteristic == null || (descriptor = bluetoothGattCharacteristic.getDescriptor(onExtraCallback)) == null || (bArrAsInterface = getreflectcontext.asBinder.asInterface(descriptor)) == null || bArrAsInterface.length != 2 || (bArrAsInterface[0] & 2) != 2) ? false : true;
    }

    public onLeaveApplication onNavigationEvent(@Nullable BluetoothGattCharacteristic bluetoothGattCharacteristic, @Nullable byte[] bArr) {
        return Request.onExtraCallbackWithResult(bluetoothGattCharacteristic, bArr).onNavigationEvent(this.asBinder);
    }

    public ReadRequest onExtraCallback(@Nullable BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return Request.onExtraCallback(bluetoothGattCharacteristic).onExtraCallbackWithResult(this.asBinder);
    }

    @Deprecated
    public void IAuthTabCallbackStubProxy() {
        Request.IAuthTabCallbackStubProxy().onExtraCallbackWithResult(this.asBinder).IAuthTabCallback(this.asBinder.ITrustedWebActivityCallbackDefault()).extraCallback();
    }

    @Deprecated
    public void IAuthTabCallbackStub() {
        Request.access000().onNavigationEvent(this.asBinder).onWarmupCompleted((setIsSelected) new BleManager$.ExternalSyntheticLambda2(this)).onExtraCallbackWithResult((TTC) new BleManager$.ExternalSyntheticLambda3(this)).extraCallback();
    }

    public onInterstitialClicked onExtraCallbackWithResult(int i) {
        return Request.onWarmupCompleted(i).onNavigationEvent(this.asBinder);
    }

    protected static abstract class IAuthTabCallback extends BusMonitorDependWrapper1 {
        protected IAuthTabCallback() {
        }
    }
}
