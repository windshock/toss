package o;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TTAppOpenAdActivity2 implements Parcelable {
    public static final Parcelable.Creator<TTAppOpenAdActivity2> CREATOR = new Parcelable.Creator<TTAppOpenAdActivity2>() { // from class: o.TTAppOpenAdActivity2.3
        @Override // android.os.Parcelable.Creator
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public TTAppOpenAdActivity2 createFromParcel(Parcel parcel) {
            return new TTAppOpenAdActivity2(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public TTAppOpenAdActivity2[] newArray(int i) {
            return new TTAppOpenAdActivity2[i];
        }
    };
    private final int IAuthTabCallback;
    private final int IAuthTabCallbackDefault;
    private TTAppOpenAdActivity3 IAuthTabCallbackStub;
    private final long asBinder;
    private final int asInterface;
    private final BluetoothDevice onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private final int onTransact;
    private final int onWarmupCompleted;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public TTAppOpenAdActivity2(@NonNull BluetoothDevice bluetoothDevice, @Nullable TTAppOpenAdActivity3 tTAppOpenAdActivity3, int i, long j) {
        this.onExtraCallback = bluetoothDevice;
        this.IAuthTabCallbackStub = tTAppOpenAdActivity3;
        this.onTransact = i;
        this.asBinder = j;
        this.onWarmupCompleted = 17;
        this.onNavigationEvent = 1;
        this.IAuthTabCallbackDefault = 0;
        this.IAuthTabCallback = 255;
        this.asInterface = 127;
        this.onExtraCallbackWithResult = 0;
    }

    public TTAppOpenAdActivity2(@NonNull BluetoothDevice bluetoothDevice, int i, int i2, int i3, int i4, int i5, int i6, int i7, @Nullable TTAppOpenAdActivity3 tTAppOpenAdActivity3, long j) {
        this.onExtraCallback = bluetoothDevice;
        this.onWarmupCompleted = i;
        this.onNavigationEvent = i2;
        this.IAuthTabCallbackDefault = i3;
        this.IAuthTabCallback = i4;
        this.asInterface = i5;
        this.onTransact = i6;
        this.onExtraCallbackWithResult = i7;
        this.IAuthTabCallbackStub = tTAppOpenAdActivity3;
        this.asBinder = j;
    }

    private TTAppOpenAdActivity2(Parcel parcel) {
        this.onExtraCallback = (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(parcel);
        if (parcel.readInt() == 1) {
            this.IAuthTabCallbackStub = TTAppOpenAdActivity3.IAuthTabCallback(parcel.createByteArray());
        }
        this.onTransact = parcel.readInt();
        this.asBinder = parcel.readLong();
        this.onWarmupCompleted = parcel.readInt();
        this.onNavigationEvent = parcel.readInt();
        this.IAuthTabCallbackDefault = parcel.readInt();
        this.IAuthTabCallback = parcel.readInt();
        this.asInterface = parcel.readInt();
        this.onExtraCallbackWithResult = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        this.onExtraCallback.writeToParcel(parcel, i);
        if (this.IAuthTabCallbackStub != null) {
            parcel.writeInt(1);
            parcel.writeByteArray(this.IAuthTabCallbackStub.onNavigationEvent());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.onTransact);
        parcel.writeLong(this.asBinder);
        parcel.writeInt(this.onWarmupCompleted);
        parcel.writeInt(this.onNavigationEvent);
        parcel.writeInt(this.IAuthTabCallbackDefault);
        parcel.writeInt(this.IAuthTabCallback);
        parcel.writeInt(this.asInterface);
        parcel.writeInt(this.onExtraCallbackWithResult);
    }

    public BluetoothDevice IAuthTabCallback() {
        return this.onExtraCallback;
    }

    public TTAppOpenAdActivity3 onExtraCallback() {
        return this.IAuthTabCallbackStub;
    }

    public int onExtraCallbackWithResult() {
        return this.onTransact;
    }

    public long onNavigationEvent() {
        return this.asBinder;
    }

    public int hashCode() {
        BluetoothDevice bluetoothDevice = this.onExtraCallback;
        int i = this.onTransact;
        return TTAdActivity.onNavigationEvent(bluetoothDevice, Integer.valueOf(i), this.IAuthTabCallbackStub, Long.valueOf(this.asBinder), Integer.valueOf(this.onWarmupCompleted), Integer.valueOf(this.onNavigationEvent), Integer.valueOf(this.IAuthTabCallbackDefault), Integer.valueOf(this.IAuthTabCallback), Integer.valueOf(this.asInterface), Integer.valueOf(this.onExtraCallbackWithResult));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TTAppOpenAdActivity2.class != obj.getClass()) {
            return false;
        }
        TTAppOpenAdActivity2 tTAppOpenAdActivity2 = (TTAppOpenAdActivity2) obj;
        return TTAdActivity.onExtraCallback(this.onExtraCallback, tTAppOpenAdActivity2.onExtraCallback) && this.onTransact == tTAppOpenAdActivity2.onTransact && TTAdActivity.onExtraCallback(this.IAuthTabCallbackStub, tTAppOpenAdActivity2.IAuthTabCallbackStub) && this.asBinder == tTAppOpenAdActivity2.asBinder && this.onWarmupCompleted == tTAppOpenAdActivity2.onWarmupCompleted && this.onNavigationEvent == tTAppOpenAdActivity2.onNavigationEvent && this.IAuthTabCallbackDefault == tTAppOpenAdActivity2.IAuthTabCallbackDefault && this.IAuthTabCallback == tTAppOpenAdActivity2.IAuthTabCallback && this.asInterface == tTAppOpenAdActivity2.asInterface && this.onExtraCallbackWithResult == tTAppOpenAdActivity2.onExtraCallbackWithResult;
    }

    public String toString() {
        return "ScanResult{device=" + this.onExtraCallback + ", scanRecord=" + TTAdActivity.onNavigationEvent(this.IAuthTabCallbackStub) + ", rssi=" + this.onTransact + ", timestampNanos=" + this.asBinder + ", eventType=" + this.onWarmupCompleted + ", primaryPhy=" + this.onNavigationEvent + ", secondaryPhy=" + this.IAuthTabCallbackDefault + ", advertisingSid=" + this.IAuthTabCallback + ", txPower=" + this.asInterface + ", periodicAdvertisingInterval=" + this.onExtraCallbackWithResult + '}';
    }
}
