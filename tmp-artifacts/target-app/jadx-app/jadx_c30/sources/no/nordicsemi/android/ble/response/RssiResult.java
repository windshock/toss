package no.nordicsemi.android.ble.response;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import no.nordicsemi.android.ble.callback.RssiCallback;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class RssiResult implements RssiCallback, Parcelable {
    public static final Parcelable.Creator<RssiResult> CREATOR = new Parcelable.Creator<RssiResult>() { // from class: no.nordicsemi.android.ble.response.RssiResult.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public RssiResult createFromParcel(Parcel parcel) {
            return new RssiResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public RssiResult[] newArray(int i) {
            return new RssiResult[i];
        }
    };
    private BluetoothDevice onExtraCallback;
    private int onExtraCallbackWithResult;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public RssiResult() {
    }

    public void onRssiRead(@NonNull BluetoothDevice bluetoothDevice, int i) {
        this.onExtraCallback = bluetoothDevice;
        this.onExtraCallbackWithResult = i;
    }

    protected RssiResult(Parcel parcel) {
        this.onExtraCallback = (BluetoothDevice) parcel.readParcelable(BluetoothDevice.class.getClassLoader());
        this.onExtraCallbackWithResult = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.onExtraCallback, i);
        parcel.writeInt(this.onExtraCallbackWithResult);
    }
}
