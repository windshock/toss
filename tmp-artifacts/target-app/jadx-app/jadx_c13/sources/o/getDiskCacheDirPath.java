package o;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothGattServerCallback;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.UUID;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class getDiskCacheDirPath {
    private List<BluetoothGattCharacteristic> IAuthTabCallbackDefault;
    private BluetoothGattServer IAuthTabCallbackStub;
    private List<BluetoothGattDescriptor> access100;
    private IABLandingPageActivity2 asBinder;
    private Queue<BluetoothGattService> asInterface;
    private final Context onNavigationEvent;
    private static final UUID onExtraCallback = UUID.fromString("00002900-0000-1000-8000-00805f9b34fb");
    private static final UUID onWarmupCompleted = UUID.fromString("00002901-0000-1000-8000-00805f9b34fb");
    private static final UUID IAuthTabCallback = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");
    private final List<getReflectContext> onTransact = new ArrayList();
    private final BluetoothGattServerCallback onExtraCallbackWithResult = new BluetoothGattServerCallback() { // from class: o.getDiskCacheDirPath.5
        @Override // android.bluetooth.BluetoothGattServerCallback
        public void onServiceAdded(int i, @NonNull BluetoothGattService bluetoothGattService) {
            if (i == 0) {
                try {
                    getDiskCacheDirPath.this.IAuthTabCallbackStub.addService((BluetoothGattService) getDiskCacheDirPath.this.asInterface.remove());
                } catch (Exception unused) {
                    if (getDiskCacheDirPath.this.asBinder != null) {
                        getDiskCacheDirPath.this.asBinder.IAuthTabCallback();
                    }
                    getDiskCacheDirPath.this.asInterface = null;
                }
            }
        }

        @Override // android.bluetooth.BluetoothGattServerCallback
        public void onConnectionStateChange(@NonNull BluetoothDevice bluetoothDevice, int i, int i2) {
            if (i != 0 || i2 != 2) {
                if (i == 0) {
                    bluetoothDevice.getAddress();
                } else {
                    bluetoothDevice.getAddress();
                }
                if (getDiskCacheDirPath.this.asBinder != null) {
                    getDiskCacheDirPath.this.asBinder.onNavigationEvent(bluetoothDevice);
                    return;
                }
                return;
            }
            bluetoothDevice.getAddress();
            if (getDiskCacheDirPath.this.asBinder != null) {
                getDiskCacheDirPath.this.asBinder.onWarmupCompleted(bluetoothDevice);
            }
        }

        @Override // android.bluetooth.BluetoothGattServerCallback
        public void onCharacteristicReadRequest(@NonNull BluetoothDevice bluetoothDevice, int i, int i2, @NonNull BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            BusMonitorDependWrapper1 busMonitorDependWrapper1OnExtraCallbackWithResult = getDiskCacheDirPath.this.onExtraCallbackWithResult(bluetoothDevice);
            if (busMonitorDependWrapper1OnExtraCallbackWithResult != null) {
                busMonitorDependWrapper1OnExtraCallbackWithResult.onExtraCallback(getDiskCacheDirPath.this.IAuthTabCallbackStub, bluetoothDevice, i, i2, bluetoothGattCharacteristic);
            }
        }

        @Override // android.bluetooth.BluetoothGattServerCallback
        public void onCharacteristicWriteRequest(@NonNull BluetoothDevice bluetoothDevice, int i, @NonNull BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z, boolean z2, int i2, @NonNull byte[] bArr) {
            BusMonitorDependWrapper1 busMonitorDependWrapper1OnExtraCallbackWithResult = getDiskCacheDirPath.this.onExtraCallbackWithResult(bluetoothDevice);
            if (busMonitorDependWrapper1OnExtraCallbackWithResult != null) {
                busMonitorDependWrapper1OnExtraCallbackWithResult.onExtraCallbackWithResult(getDiskCacheDirPath.this.IAuthTabCallbackStub, bluetoothDevice, i, bluetoothGattCharacteristic, z, z2, i2, bArr);
            }
        }

        @Override // android.bluetooth.BluetoothGattServerCallback
        public void onDescriptorReadRequest(@NonNull BluetoothDevice bluetoothDevice, int i, int i2, @NonNull BluetoothGattDescriptor bluetoothGattDescriptor) {
            BusMonitorDependWrapper1 busMonitorDependWrapper1OnExtraCallbackWithResult = getDiskCacheDirPath.this.onExtraCallbackWithResult(bluetoothDevice);
            if (busMonitorDependWrapper1OnExtraCallbackWithResult != null) {
                busMonitorDependWrapper1OnExtraCallbackWithResult.onExtraCallbackWithResult(getDiskCacheDirPath.this.IAuthTabCallbackStub, bluetoothDevice, i, i2, bluetoothGattDescriptor);
            }
        }

        @Override // android.bluetooth.BluetoothGattServerCallback
        public void onDescriptorWriteRequest(@NonNull BluetoothDevice bluetoothDevice, int i, @NonNull BluetoothGattDescriptor bluetoothGattDescriptor, boolean z, boolean z2, int i2, @NonNull byte[] bArr) {
            BusMonitorDependWrapper1 busMonitorDependWrapper1OnExtraCallbackWithResult = getDiskCacheDirPath.this.onExtraCallbackWithResult(bluetoothDevice);
            if (busMonitorDependWrapper1OnExtraCallbackWithResult != null) {
                busMonitorDependWrapper1OnExtraCallbackWithResult.onNavigationEvent(getDiskCacheDirPath.this.IAuthTabCallbackStub, bluetoothDevice, i, bluetoothGattDescriptor, z, z2, i2, bArr);
            }
        }

        @Override // android.bluetooth.BluetoothGattServerCallback
        public void onExecuteWrite(@NonNull BluetoothDevice bluetoothDevice, int i, boolean z) {
            BusMonitorDependWrapper1 busMonitorDependWrapper1OnExtraCallbackWithResult = getDiskCacheDirPath.this.onExtraCallbackWithResult(bluetoothDevice);
            if (busMonitorDependWrapper1OnExtraCallbackWithResult != null) {
                busMonitorDependWrapper1OnExtraCallbackWithResult.IAuthTabCallback(getDiskCacheDirPath.this.IAuthTabCallbackStub, bluetoothDevice, i, z);
            }
        }

        @Override // android.bluetooth.BluetoothGattServerCallback
        public void onNotificationSent(@NonNull BluetoothDevice bluetoothDevice, int i) {
            BusMonitorDependWrapper1 busMonitorDependWrapper1OnExtraCallbackWithResult = getDiskCacheDirPath.this.onExtraCallbackWithResult(bluetoothDevice);
            if (busMonitorDependWrapper1OnExtraCallbackWithResult != null) {
                busMonitorDependWrapper1OnExtraCallbackWithResult.onExtraCallbackWithResult(getDiskCacheDirPath.this.IAuthTabCallbackStub, bluetoothDevice, i);
            }
        }

        @Override // android.bluetooth.BluetoothGattServerCallback
        public void onMtuChanged(@NonNull BluetoothDevice bluetoothDevice, int i) {
            BusMonitorDependWrapper1 busMonitorDependWrapper1OnExtraCallbackWithResult = getDiskCacheDirPath.this.onExtraCallbackWithResult(bluetoothDevice);
            if (busMonitorDependWrapper1OnExtraCallbackWithResult != null) {
                busMonitorDependWrapper1OnExtraCallbackWithResult.onWarmupCompleted(getDiskCacheDirPath.this.IAuthTabCallbackStub, bluetoothDevice, i);
            }
        }
    };

    protected abstract List<BluetoothGattService> IAuthTabCallback();

    public getDiskCacheDirPath(@NonNull Context context) {
        this.onNavigationEvent = context;
    }

    public final boolean onExtraCallback() {
        if (this.IAuthTabCallbackStub != null) {
            return true;
        }
        this.asInterface = new LinkedList(IAuthTabCallback());
        BluetoothManager bluetoothManager = (BluetoothManager) this.onNavigationEvent.getSystemService("bluetooth");
        if (bluetoothManager != null) {
            this.IAuthTabCallbackStub = bluetoothManager.openGattServer(this.onNavigationEvent, this.onExtraCallbackWithResult);
        }
        if (this.IAuthTabCallbackStub != null) {
            try {
                this.IAuthTabCallbackStub.addService(this.asInterface.remove());
            } catch (NoSuchElementException unused) {
                IABLandingPageActivity2 iABLandingPageActivity2 = this.asBinder;
                if (iABLandingPageActivity2 != null) {
                    iABLandingPageActivity2.IAuthTabCallback();
                }
            } catch (Exception unused2) {
                onExtraCallbackWithResult();
                return false;
            }
            return true;
        }
        this.asInterface = null;
        return false;
    }

    public final void onExtraCallbackWithResult() {
        BluetoothGattServer bluetoothGattServer = this.IAuthTabCallbackStub;
        if (bluetoothGattServer != null) {
            bluetoothGattServer.close();
            this.IAuthTabCallbackStub = null;
        }
        this.asInterface = null;
        for (getReflectContext getreflectcontext : this.onTransact) {
            getreflectcontext.asInterface();
            getreflectcontext.onWarmupCompleted();
        }
        this.onTransact.clear();
    }

    public final void onExtraCallbackWithResult(@Nullable IABLandingPageActivity2 iABLandingPageActivity2) {
        this.asBinder = iABLandingPageActivity2;
    }

    final BluetoothGattServer onNavigationEvent() {
        return this.IAuthTabCallbackStub;
    }

    final void IAuthTabCallback(@NonNull getReflectContext getreflectcontext) {
        if (this.onTransact.contains(getreflectcontext)) {
            return;
        }
        this.onTransact.add(getreflectcontext);
    }

    final void onExtraCallbackWithResult(@NonNull getReflectContext getreflectcontext) {
        this.onTransact.remove(getreflectcontext);
    }

    final boolean onExtraCallback(@NonNull BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        List<BluetoothGattCharacteristic> list = this.IAuthTabCallbackDefault;
        return list != null && list.contains(bluetoothGattCharacteristic);
    }

    final boolean onNavigationEvent(@NonNull BluetoothGattDescriptor bluetoothGattDescriptor) {
        List<BluetoothGattDescriptor> list = this.access100;
        return list != null && list.contains(bluetoothGattDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BusMonitorDependWrapper1 onExtraCallbackWithResult(@NonNull BluetoothDevice bluetoothDevice) {
        for (getReflectContext getreflectcontext : this.onTransact) {
            if (bluetoothDevice.equals(getreflectcontext.onNavigationEvent())) {
                return getreflectcontext.asBinder;
            }
        }
        return null;
    }

    public final BluetoothGattService onWarmupCompleted(@NonNull UUID uuid, BluetoothGattCharacteristic... bluetoothGattCharacteristicArr) {
        BluetoothGattService bluetoothGattService = new BluetoothGattService(uuid, 0);
        for (BluetoothGattCharacteristic bluetoothGattCharacteristic : bluetoothGattCharacteristicArr) {
            bluetoothGattService.addCharacteristic(bluetoothGattCharacteristic);
        }
        return bluetoothGattService;
    }

    protected final BluetoothGattCharacteristic onExtraCallbackWithResult(@NonNull UUID uuid, int i, int i2, @Nullable byte[] bArr, BluetoothGattDescriptor... bluetoothGattDescriptorArr) {
        int i3 = i;
        BluetoothGattDescriptor bluetoothGattDescriptor = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (BluetoothGattDescriptor bluetoothGattDescriptor2 : bluetoothGattDescriptorArr) {
            if (IAuthTabCallback.equals(bluetoothGattDescriptor2.getUuid())) {
                z2 = true;
            } else if (onWarmupCompleted.equals(bluetoothGattDescriptor2.getUuid()) && (bluetoothGattDescriptor2.getPermissions() & 112) != 0) {
                z = true;
            } else if (onExtraCallback.equals(bluetoothGattDescriptor2.getUuid())) {
                z3 = true;
                bluetoothGattDescriptor = bluetoothGattDescriptor2;
            }
        }
        if (z) {
            if (bluetoothGattDescriptor == null) {
                bluetoothGattDescriptor = new BluetoothGattDescriptor(onExtraCallback, 1);
                bluetoothGattDescriptor.setValue(new byte[]{2, 0});
            } else if (bluetoothGattDescriptor.getValue() != null && bluetoothGattDescriptor.getValue().length == 2) {
                byte[] value = bluetoothGattDescriptor.getValue();
                value[0] = (byte) (value[0] | 2);
            } else {
                bluetoothGattDescriptor.setValue(new byte[]{2, 0});
            }
        }
        boolean z4 = (i3 & 48) != 0;
        boolean z5 = (bluetoothGattDescriptor == null || bluetoothGattDescriptor.getValue() == null || bluetoothGattDescriptor.getValue().length != 2 || (bluetoothGattDescriptor.getValue()[0] & 1) == 0) ? false : true;
        if (z || z5) {
            i3 |= 128;
        }
        if ((i3 & 128) != 0 && bluetoothGattDescriptor == null) {
            bluetoothGattDescriptor = new BluetoothGattDescriptor(onExtraCallback, 1);
            bluetoothGattDescriptor.setValue(new byte[]{0, 0});
        }
        BluetoothGattCharacteristic bluetoothGattCharacteristic = new BluetoothGattCharacteristic(uuid, i3, i2);
        if (z4 && !z2) {
            bluetoothGattCharacteristic.addDescriptor(onWarmupCompleted());
        }
        for (BluetoothGattDescriptor bluetoothGattDescriptor3 : bluetoothGattDescriptorArr) {
            bluetoothGattCharacteristic.addDescriptor(bluetoothGattDescriptor3);
        }
        if (bluetoothGattDescriptor != null && !z3) {
            bluetoothGattCharacteristic.addDescriptor(bluetoothGattDescriptor);
        }
        bluetoothGattCharacteristic.setValue(bArr);
        return bluetoothGattCharacteristic;
    }

    public final BluetoothGattCharacteristic IAuthTabCallback(@NonNull UUID uuid, int i, int i2, @Nullable loss lossVar, BluetoothGattDescriptor... bluetoothGattDescriptorArr) {
        return onExtraCallbackWithResult(uuid, i, i2, lossVar != null ? lossVar.onNavigationEvent() : null, bluetoothGattDescriptorArr);
    }

    protected final BluetoothGattDescriptor onExtraCallback(@NonNull UUID uuid, int i, @Nullable byte[] bArr) {
        BluetoothGattDescriptor bluetoothGattDescriptor = new BluetoothGattDescriptor(uuid, i);
        bluetoothGattDescriptor.setValue(bArr);
        return bluetoothGattDescriptor;
    }

    protected final BluetoothGattDescriptor onWarmupCompleted() {
        return onExtraCallback(IAuthTabCallback, 17, new byte[]{0, 0});
    }
}
