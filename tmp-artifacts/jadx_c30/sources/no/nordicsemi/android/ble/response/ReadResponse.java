package no.nordicsemi.android.ble.response;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import o.TTAdConstantNETWORK_STATE;
import o.loss;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class ReadResponse implements TTAdConstantNETWORK_STATE, Parcelable {
    public static final Parcelable.Creator<ReadResponse> CREATOR = new Parcelable.Creator<ReadResponse>() { // from class: no.nordicsemi.android.ble.response.ReadResponse.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public ReadResponse createFromParcel(Parcel parcel) {
            return new ReadResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public ReadResponse[] newArray(int i) {
            return new ReadResponse[i];
        }
    };
    private loss onNavigationEvent;
    private BluetoothDevice onWarmupCompleted;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ReadResponse() {
    }

    public void onDataReceived(@NonNull BluetoothDevice bluetoothDevice, @NonNull loss lossVar) {
        this.onWarmupCompleted = bluetoothDevice;
        this.onNavigationEvent = lossVar;
    }

    protected ReadResponse(Parcel parcel) {
        this.onWarmupCompleted = (BluetoothDevice) parcel.readParcelable(BluetoothDevice.class.getClassLoader());
        this.onNavigationEvent = parcel.readParcelable(loss.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.onWarmupCompleted, i);
        parcel.writeParcelable(this.onNavigationEvent, i);
    }
}
