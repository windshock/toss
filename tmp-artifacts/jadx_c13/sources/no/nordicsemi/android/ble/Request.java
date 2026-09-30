package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.os.ConditionVariable;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o.CustomEventInterstitialListener;
import o.InitConfig;
import o.TTAdConstant;
import o.TTC;
import o.getPA;
import o.getRootDir;
import o.isMonitorOpen;
import o.isUseTextureView;
import o.onInterstitialClicked;
import o.onInterstitialShown;
import o.onLeaveApplication;
import o.setIsSelected;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class Request {
    public final BluetoothGattDescriptor IAuthTabCallback;
    public TTAdConstant IAuthTabCallbackDefault;
    setIsSelected IAuthTabCallbackStub;
    public TTC IAuthTabCallbackStubProxy;
    public boolean IAuthTabCallback_Parcel;
    public final ConditionVariable ICustomTabsCallback;
    public RequestHandler access000;
    public TTC access100;
    public TTAdConstant asBinder;
    public isMonitorOpen asInterface;
    public final Type extraCallback;
    public isUseTextureView getInterfaceDescriptor;
    getPA onExtraCallback;
    public boolean onExtraCallbackWithResult;
    setIsSelected onNavigationEvent;
    public boolean onTransact;
    public final BluetoothGattCharacteristic onWarmupCompleted;

    public enum Type {
        SET,
        CONNECT,
        DISCONNECT,
        CREATE_BOND,
        ENSURE_BOND,
        REMOVE_BOND,
        WRITE,
        NOTIFY,
        INDICATE,
        READ,
        WRITE_DESCRIPTOR,
        READ_DESCRIPTOR,
        BEGIN_RELIABLE_WRITE,
        EXECUTE_RELIABLE_WRITE,
        ABORT_RELIABLE_WRITE,
        ENABLE_NOTIFICATIONS,
        ENABLE_INDICATIONS,
        DISABLE_NOTIFICATIONS,
        DISABLE_INDICATIONS,
        WAIT_FOR_NOTIFICATION,
        WAIT_FOR_INDICATION,
        WAIT_FOR_READ,
        WAIT_FOR_WRITE,
        WAIT_FOR_CONDITION,
        SET_VALUE,
        SET_DESCRIPTOR_VALUE,
        READ_BATTERY_LEVEL,
        ENABLE_BATTERY_LEVEL_NOTIFICATIONS,
        DISABLE_BATTERY_LEVEL_NOTIFICATIONS,
        ENABLE_SERVICE_CHANGED_INDICATIONS,
        REQUEST_MTU,
        REQUEST_CONNECTION_PRIORITY,
        SET_PREFERRED_PHY,
        READ_PHY,
        READ_RSSI,
        REFRESH_CACHE,
        SLEEP
    }

    public Request(@NonNull Type type) {
        this.extraCallback = type;
        this.onWarmupCompleted = null;
        this.IAuthTabCallback = null;
        this.ICustomTabsCallback = new ConditionVariable(true);
    }

    public Request(@NonNull Type type, @Nullable BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        this.extraCallback = type;
        this.onWarmupCompleted = bluetoothGattCharacteristic;
        this.IAuthTabCallback = null;
        this.ICustomTabsCallback = new ConditionVariable(true);
    }

    public Request onNavigationEvent(@NonNull RequestHandler requestHandler) {
        this.access000 = requestHandler;
        if (this.asInterface == null) {
            this.asInterface = requestHandler;
        }
        return this;
    }

    public Request onExtraCallbackWithResult(@Nullable final Handler handler) {
        this.asInterface = new isMonitorOpen() { // from class: no.nordicsemi.android.ble.Request.1
            @Override // o.isMonitorOpen
            public void onExtraCallbackWithResult(@NonNull Runnable runnable) {
                Handler handler2 = handler;
                if (handler2 != null) {
                    handler2.post(runnable);
                } else {
                    runnable.run();
                }
            }

            @Override // o.isMonitorOpen
            public void onNavigationEvent(@NonNull Runnable runnable, long j) {
                Handler handler2 = handler;
                if (handler2 != null) {
                    handler2.postDelayed(runnable, j);
                } else {
                    Request.this.access000.onNavigationEvent(runnable, j);
                }
            }

            @Override // o.isMonitorOpen
            public void onWarmupCompleted(@NonNull Runnable runnable) {
                Handler handler2 = handler;
                if (handler2 != null) {
                    handler2.removeCallbacks(runnable);
                } else {
                    Request.this.access000.onWarmupCompleted(runnable);
                }
            }
        };
        return this;
    }

    public static CustomEventInterstitialListener onExtraCallbackWithResult(@NonNull BluetoothDevice bluetoothDevice) {
        return new CustomEventInterstitialListener(Type.CONNECT, bluetoothDevice);
    }

    public static getRootDir IAuthTabCallbackDefault() {
        return new getRootDir(Type.DISCONNECT);
    }

    @Deprecated
    public static onInterstitialShown IAuthTabCallbackStub() {
        return new onInterstitialShown(Type.CREATE_BOND);
    }

    @Deprecated
    public static onInterstitialShown extraCallbackWithResult() {
        return new onInterstitialShown(Type.REMOVE_BOND);
    }

    @Deprecated
    public static ReadRequest onExtraCallback(@Nullable BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return new ReadRequest(Type.READ, bluetoothGattCharacteristic);
    }

    static onInterstitialShown getInterfaceDescriptor() {
        return new onInterstitialShown(Type.BEGIN_RELIABLE_WRITE);
    }

    static onInterstitialShown access100() {
        return new onInterstitialShown(Type.EXECUTE_RELIABLE_WRITE);
    }

    static onInterstitialShown onTransact() {
        return new onInterstitialShown(Type.ABORT_RELIABLE_WRITE);
    }

    public static onLeaveApplication onExtraCallbackWithResult(@Nullable BluetoothGattCharacteristic bluetoothGattCharacteristic, @Nullable byte[] bArr) {
        return new onLeaveApplication(Type.SET_VALUE, bluetoothGattCharacteristic, bArr, 0, bArr != null ? bArr.length : 0);
    }

    @Deprecated
    public static ReadRequest IAuthTabCallbackStubProxy() {
        return new ReadRequest(Type.READ_BATTERY_LEVEL);
    }

    @Deprecated
    public static InitConfig access000() {
        return new InitConfig(Type.ENABLE_BATTERY_LEVEL_NOTIFICATIONS);
    }

    static InitConfig IAuthTabCallback_Parcel() {
        return new InitConfig(Type.ENABLE_SERVICE_CHANGED_INDICATIONS);
    }

    @Deprecated
    public static onInterstitialClicked onWarmupCompleted(int i) {
        return new onInterstitialClicked(Type.REQUEST_MTU, i);
    }

    public Request onExtraCallbackWithResult(@NonNull TTC ttc) {
        this.access100 = ttc;
        return this;
    }

    public Request onNavigationEvent(@NonNull TTAdConstant tTAdConstant) {
        this.IAuthTabCallbackDefault = tTAdConstant;
        return this;
    }

    public Request onExtraCallbackWithResult(@NonNull isUseTextureView isusetextureview) {
        this.getInterfaceDescriptor = isusetextureview;
        return this;
    }

    public Request onWarmupCompleted(@NonNull setIsSelected setisselected) {
        this.onNavigationEvent = setisselected;
        return this;
    }

    public Request onExtraCallback(@NonNull getPA getpa) {
        this.onExtraCallback = getpa;
        return this;
    }

    public void extraCallback() {
        this.access000.onExtraCallback(this);
    }

    public void onExtraCallback(@NonNull final BluetoothDevice bluetoothDevice) {
        if (this.IAuthTabCallback_Parcel) {
            return;
        }
        this.IAuthTabCallback_Parcel = true;
        setIsSelected setisselected = this.IAuthTabCallbackStub;
        if (setisselected != null) {
            setisselected.onRequestStarted(bluetoothDevice);
        }
        this.asInterface.onExtraCallbackWithResult(new Runnable() { // from class: no.nordicsemi.android.ble.Request$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Request.onExtraCallback(this.f$0, bluetoothDevice);
            }
        });
    }

    public static /* synthetic */ void onExtraCallback(Request request, BluetoothDevice bluetoothDevice) {
        setIsSelected setisselected = request.onNavigationEvent;
        if (setisselected != null) {
            try {
                setisselected.onRequestStarted(bluetoothDevice);
            } catch (Throwable unused) {
            }
        }
    }

    public boolean onNavigationEvent(@NonNull final BluetoothDevice bluetoothDevice) {
        if (this.onTransact) {
            return false;
        }
        this.onTransact = true;
        TTC ttc = this.IAuthTabCallbackStubProxy;
        if (ttc != null) {
            ttc.onRequestCompleted(bluetoothDevice);
        }
        this.asInterface.onExtraCallbackWithResult(new Runnable() { // from class: no.nordicsemi.android.ble.Request$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                Request.onWarmupCompleted(this.f$0, bluetoothDevice);
            }
        });
        return true;
    }

    public static /* synthetic */ void onWarmupCompleted(Request request, BluetoothDevice bluetoothDevice) {
        TTC ttc = request.access100;
        if (ttc != null) {
            try {
                ttc.onRequestCompleted(bluetoothDevice);
            } catch (Throwable unused) {
            }
        }
        getPA getpa = request.onExtraCallback;
        if (getpa != null) {
            try {
                getpa.onRequestFinished(bluetoothDevice);
            } catch (Throwable unused2) {
            }
        }
    }

    public void onExtraCallbackWithResult(@NonNull final BluetoothDevice bluetoothDevice, final int i) {
        if (this.onTransact) {
            return;
        }
        this.onTransact = true;
        TTAdConstant tTAdConstant = this.asBinder;
        if (tTAdConstant != null) {
            tTAdConstant.onRequestFailed(bluetoothDevice, i);
        }
        this.asInterface.onExtraCallbackWithResult(new Runnable() { // from class: no.nordicsemi.android.ble.Request$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Request.onNavigationEvent(this.f$0, bluetoothDevice, i);
            }
        });
    }

    public static /* synthetic */ void onNavigationEvent(Request request, BluetoothDevice bluetoothDevice, int i) {
        TTAdConstant tTAdConstant = request.IAuthTabCallbackDefault;
        if (tTAdConstant != null) {
            try {
                tTAdConstant.onRequestFailed(bluetoothDevice, i);
            } catch (Throwable unused) {
            }
        }
        getPA getpa = request.onExtraCallback;
        if (getpa != null) {
            try {
                getpa.onRequestFinished(bluetoothDevice);
            } catch (Throwable unused2) {
            }
        }
    }

    public void writeTypedObject() {
        if (this.onTransact) {
            return;
        }
        this.onTransact = true;
        this.asInterface.onExtraCallbackWithResult(new Runnable() { // from class: no.nordicsemi.android.ble.Request$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                Request.onExtraCallbackWithResult(this.f$0);
            }
        });
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Request request) {
        isUseTextureView isusetextureview = request.getInterfaceDescriptor;
        if (isusetextureview != null) {
            try {
                isusetextureview.onInvalidRequest();
            } catch (Throwable unused) {
            }
        }
    }
}
