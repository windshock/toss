package o;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TTAppOpenAdActivity implements Parcelable {
    private final byte[] IAuthTabCallback;
    private final byte[] IAuthTabCallbackDefault;
    private final ParcelUuid IAuthTabCallbackStub;
    private final ParcelUuid IAuthTabCallback_Parcel;
    private final ParcelUuid asBinder;
    private final int asInterface;
    private final String onExtraCallbackWithResult;
    private final byte[] onNavigationEvent;
    private final byte[] onTransact;
    private final String onWarmupCompleted;
    private static final TTAppOpenAdActivity onExtraCallback = new onExtraCallbackWithResult().onNavigationEvent();
    public static final Parcelable.Creator<TTAppOpenAdActivity> CREATOR = new Parcelable.Creator<TTAppOpenAdActivity>() { // from class: o.TTAppOpenAdActivity.4
        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public TTAppOpenAdActivity[] newArray(int i) {
            return new TTAppOpenAdActivity[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public TTAppOpenAdActivity createFromParcel(Parcel parcel) {
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult();
            if (parcel.readInt() == 1) {
                onextracallbackwithresult.IAuthTabCallback(parcel.readString());
            }
            if (parcel.readInt() == 1) {
                onextracallbackwithresult.onExtraCallback(parcel.readString());
            }
            if (parcel.readInt() == 1) {
                ParcelUuid parcelUuid = (ParcelUuid) parcel.readParcelable(ParcelUuid.class.getClassLoader());
                onextracallbackwithresult.IAuthTabCallback(parcelUuid);
                if (parcel.readInt() == 1) {
                    onextracallbackwithresult.onWarmupCompleted(parcelUuid, (ParcelUuid) parcel.readParcelable(ParcelUuid.class.getClassLoader()));
                }
            }
            if (parcel.readInt() == 1) {
                ParcelUuid parcelUuid2 = (ParcelUuid) parcel.readParcelable(ParcelUuid.class.getClassLoader());
                if (parcel.readInt() == 1) {
                    byte[] bArr = new byte[parcel.readInt()];
                    parcel.readByteArray(bArr);
                    if (parcel.readInt() == 0) {
                        onextracallbackwithresult.onWarmupCompleted(parcelUuid2, bArr);
                    } else {
                        byte[] bArr2 = new byte[parcel.readInt()];
                        parcel.readByteArray(bArr2);
                        onextracallbackwithresult.onExtraCallback(parcelUuid2, bArr, bArr2);
                    }
                }
            }
            int i = parcel.readInt();
            if (parcel.readInt() == 1) {
                byte[] bArr3 = new byte[parcel.readInt()];
                parcel.readByteArray(bArr3);
                if (parcel.readInt() == 0) {
                    onextracallbackwithresult.onExtraCallbackWithResult(i, bArr3);
                } else {
                    byte[] bArr4 = new byte[parcel.readInt()];
                    parcel.readByteArray(bArr4);
                    onextracallbackwithresult.IAuthTabCallback(i, bArr3, bArr4);
                }
            }
            return onextracallbackwithresult.onNavigationEvent();
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TTAppOpenAdActivity(@Nullable String str, @Nullable String str2, @Nullable ParcelUuid parcelUuid, @Nullable ParcelUuid parcelUuid2, @Nullable ParcelUuid parcelUuid3, @Nullable byte[] bArr, @Nullable byte[] bArr2, int i, @Nullable byte[] bArr3, @Nullable byte[] bArr4) {
        this.onExtraCallbackWithResult = str;
        this.asBinder = parcelUuid;
        this.IAuthTabCallback_Parcel = parcelUuid2;
        this.onWarmupCompleted = str2;
        this.IAuthTabCallbackStub = parcelUuid3;
        this.IAuthTabCallbackDefault = bArr;
        this.onTransact = bArr2;
        this.asInterface = i;
        this.IAuthTabCallback = bArr3;
        this.onNavigationEvent = bArr4;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.onExtraCallbackWithResult == null ? 0 : 1);
        String str = this.onExtraCallbackWithResult;
        if (str != null) {
            parcel.writeString(str);
        }
        parcel.writeInt(this.onWarmupCompleted == null ? 0 : 1);
        String str2 = this.onWarmupCompleted;
        if (str2 != null) {
            parcel.writeString(str2);
        }
        parcel.writeInt(this.asBinder == null ? 0 : 1);
        ParcelUuid parcelUuid = this.asBinder;
        if (parcelUuid != null) {
            parcel.writeParcelable(parcelUuid, i);
            parcel.writeInt(this.IAuthTabCallback_Parcel == null ? 0 : 1);
            ParcelUuid parcelUuid2 = this.IAuthTabCallback_Parcel;
            if (parcelUuid2 != null) {
                parcel.writeParcelable(parcelUuid2, i);
            }
        }
        parcel.writeInt(this.IAuthTabCallbackStub == null ? 0 : 1);
        ParcelUuid parcelUuid3 = this.IAuthTabCallbackStub;
        if (parcelUuid3 != null) {
            parcel.writeParcelable(parcelUuid3, i);
            parcel.writeInt(this.IAuthTabCallbackDefault == null ? 0 : 1);
            byte[] bArr = this.IAuthTabCallbackDefault;
            if (bArr != null) {
                parcel.writeInt(bArr.length);
                parcel.writeByteArray(this.IAuthTabCallbackDefault);
                parcel.writeInt(this.onTransact == null ? 0 : 1);
                byte[] bArr2 = this.onTransact;
                if (bArr2 != null) {
                    parcel.writeInt(bArr2.length);
                    parcel.writeByteArray(this.onTransact);
                }
            }
        }
        parcel.writeInt(this.asInterface);
        parcel.writeInt(this.IAuthTabCallback == null ? 0 : 1);
        byte[] bArr3 = this.IAuthTabCallback;
        if (bArr3 != null) {
            parcel.writeInt(bArr3.length);
            parcel.writeByteArray(this.IAuthTabCallback);
            parcel.writeInt(this.onNavigationEvent != null ? 1 : 0);
            byte[] bArr4 = this.onNavigationEvent;
            if (bArr4 != null) {
                parcel.writeInt(bArr4.length);
                parcel.writeByteArray(this.onNavigationEvent);
            }
        }
    }

    public String onWarmupCompleted() {
        return this.onExtraCallbackWithResult;
    }

    public ParcelUuid IAuthTabCallbackDefault() {
        return this.asBinder;
    }

    public ParcelUuid onTransact() {
        return this.IAuthTabCallback_Parcel;
    }

    public String onNavigationEvent() {
        return this.onWarmupCompleted;
    }

    public byte[] asBinder() {
        return this.IAuthTabCallbackDefault;
    }

    public byte[] IAuthTabCallbackStub() {
        return this.onTransact;
    }

    public ParcelUuid asInterface() {
        return this.IAuthTabCallbackStub;
    }

    public int onExtraCallbackWithResult() {
        return this.asInterface;
    }

    public byte[] onExtraCallback() {
        return this.IAuthTabCallback;
    }

    public byte[] IAuthTabCallback() {
        return this.onNavigationEvent;
    }

    public boolean onExtraCallbackWithResult(@Nullable TTAppOpenAdActivity2 tTAppOpenAdActivity2) {
        if (tTAppOpenAdActivity2 == null) {
            return false;
        }
        BluetoothDevice bluetoothDeviceIAuthTabCallback = tTAppOpenAdActivity2.IAuthTabCallback();
        String str = this.onWarmupCompleted;
        if (str != null && !str.equals(bluetoothDeviceIAuthTabCallback.getAddress())) {
            return false;
        }
        TTAppOpenAdActivity3 tTAppOpenAdActivity3OnExtraCallback = tTAppOpenAdActivity2.onExtraCallback();
        if (tTAppOpenAdActivity3OnExtraCallback == null && (this.onExtraCallbackWithResult != null || this.asBinder != null || this.IAuthTabCallback != null || this.IAuthTabCallbackDefault != null)) {
            return false;
        }
        String str2 = this.onExtraCallbackWithResult;
        if (str2 != null && !str2.equals(tTAppOpenAdActivity3OnExtraCallback.IAuthTabCallback())) {
            return false;
        }
        ParcelUuid parcelUuid = this.asBinder;
        if (parcelUuid != null && !onExtraCallbackWithResult(parcelUuid, this.IAuthTabCallback_Parcel, tTAppOpenAdActivity3OnExtraCallback.onExtraCallback())) {
            return false;
        }
        ParcelUuid parcelUuid2 = this.IAuthTabCallbackStub;
        if (parcelUuid2 != null && tTAppOpenAdActivity3OnExtraCallback != null && !onNavigationEvent(this.IAuthTabCallbackDefault, this.onTransact, tTAppOpenAdActivity3OnExtraCallback.onExtraCallbackWithResult(parcelUuid2))) {
            return false;
        }
        int i = this.asInterface;
        return i < 0 || tTAppOpenAdActivity3OnExtraCallback == null || onNavigationEvent(this.IAuthTabCallback, this.onNavigationEvent, tTAppOpenAdActivity3OnExtraCallback.onExtraCallbackWithResult(i));
    }

    private static boolean onExtraCallbackWithResult(@Nullable ParcelUuid parcelUuid, @Nullable ParcelUuid parcelUuid2, @Nullable List<ParcelUuid> list) {
        if (parcelUuid == null) {
            return true;
        }
        if (list == null) {
            return false;
        }
        Iterator<ParcelUuid> it = list.iterator();
        while (it.hasNext()) {
            if (onExtraCallback(parcelUuid.getUuid(), parcelUuid2 == null ? null : parcelUuid2.getUuid(), it.next().getUuid())) {
                return true;
            }
        }
        return false;
    }

    private static boolean onExtraCallback(@NonNull UUID uuid, @Nullable UUID uuid2, @NonNull UUID uuid3) {
        if (uuid2 == null) {
            return uuid.equals(uuid3);
        }
        if ((uuid.getLeastSignificantBits() & uuid2.getLeastSignificantBits()) != (uuid3.getLeastSignificantBits() & uuid2.getLeastSignificantBits())) {
            return false;
        }
        return (uuid.getMostSignificantBits() & uuid2.getMostSignificantBits()) == (uuid2.getMostSignificantBits() & uuid3.getMostSignificantBits());
    }

    private boolean onNavigationEvent(@Nullable byte[] bArr, @Nullable byte[] bArr2, @Nullable byte[] bArr3) {
        if (bArr == null) {
            return bArr3 != null;
        }
        if (bArr3 == null || bArr3.length < bArr.length) {
            return false;
        }
        if (bArr2 == null) {
            for (int i = 0; i < bArr.length; i++) {
                if (bArr3[i] != bArr[i]) {
                    return false;
                }
            }
            return true;
        }
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b = bArr2[i2];
            if ((bArr3[i2] & b) != (b & bArr[i2])) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return "BluetoothLeScanFilter [deviceName=" + this.onExtraCallbackWithResult + ", deviceAddress=" + this.onWarmupCompleted + ", mUuid=" + this.asBinder + ", uuidMask=" + this.IAuthTabCallback_Parcel + ", serviceDataUuid=" + TTAdActivity.onNavigationEvent(this.IAuthTabCallbackStub) + ", serviceData=" + Arrays.toString(this.IAuthTabCallbackDefault) + ", serviceDataMask=" + Arrays.toString(this.onTransact) + ", manufacturerId=" + this.asInterface + ", manufacturerData=" + Arrays.toString(this.IAuthTabCallback) + ", manufacturerDataMask=" + Arrays.toString(this.onNavigationEvent) + "]";
    }

    public int hashCode() {
        String str = this.onExtraCallbackWithResult;
        String str2 = this.onWarmupCompleted;
        int i = this.asInterface;
        int iHashCode = Arrays.hashCode(this.IAuthTabCallback);
        int iHashCode2 = Arrays.hashCode(this.onNavigationEvent);
        ParcelUuid parcelUuid = this.IAuthTabCallbackStub;
        int iHashCode3 = Arrays.hashCode(this.IAuthTabCallbackDefault);
        int iHashCode4 = Arrays.hashCode(this.onTransact);
        return TTAdActivity.onNavigationEvent(str, str2, Integer.valueOf(i), Integer.valueOf(iHashCode), Integer.valueOf(iHashCode2), parcelUuid, Integer.valueOf(iHashCode3), Integer.valueOf(iHashCode4), this.asBinder, this.IAuthTabCallback_Parcel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TTAppOpenAdActivity.class != obj.getClass()) {
            return false;
        }
        TTAppOpenAdActivity tTAppOpenAdActivity = (TTAppOpenAdActivity) obj;
        return TTAdActivity.onExtraCallback(this.onExtraCallbackWithResult, tTAppOpenAdActivity.onExtraCallbackWithResult) && TTAdActivity.onExtraCallback(this.onWarmupCompleted, tTAppOpenAdActivity.onWarmupCompleted) && this.asInterface == tTAppOpenAdActivity.asInterface && TTAdActivity.IAuthTabCallback(this.IAuthTabCallback, tTAppOpenAdActivity.IAuthTabCallback) && TTAdActivity.IAuthTabCallback(this.onNavigationEvent, tTAppOpenAdActivity.onNavigationEvent) && TTAdActivity.onExtraCallback(this.IAuthTabCallbackStub, tTAppOpenAdActivity.IAuthTabCallbackStub) && TTAdActivity.IAuthTabCallback(this.IAuthTabCallbackDefault, tTAppOpenAdActivity.IAuthTabCallbackDefault) && TTAdActivity.IAuthTabCallback(this.onTransact, tTAppOpenAdActivity.onTransact) && TTAdActivity.onExtraCallback(this.asBinder, tTAppOpenAdActivity.asBinder) && TTAdActivity.onExtraCallback(this.IAuthTabCallback_Parcel, tTAppOpenAdActivity.IAuthTabCallback_Parcel);
    }

    public static final class onExtraCallbackWithResult {
        private int IAuthTabCallback = -1;
        private ParcelUuid IAuthTabCallbackDefault;
        private ParcelUuid IAuthTabCallbackStub;
        private ParcelUuid asBinder;
        private byte[] asInterface;
        private String onExtraCallback;
        private String onExtraCallbackWithResult;
        private byte[] onNavigationEvent;
        private byte[] onTransact;
        private byte[] onWarmupCompleted;

        public onExtraCallbackWithResult IAuthTabCallback(@Nullable String str) {
            this.onExtraCallbackWithResult = str;
            return this;
        }

        public onExtraCallbackWithResult onExtraCallback(@Nullable String str) {
            if (str != null && !BluetoothAdapter.checkBluetoothAddress(str)) {
                throw new IllegalArgumentException("invalid device address " + str);
            }
            this.onExtraCallback = str;
            return this;
        }

        public onExtraCallbackWithResult IAuthTabCallback(@Nullable ParcelUuid parcelUuid) {
            this.IAuthTabCallbackDefault = parcelUuid;
            this.asBinder = null;
            return this;
        }

        public onExtraCallbackWithResult onWarmupCompleted(@Nullable ParcelUuid parcelUuid, @Nullable ParcelUuid parcelUuid2) {
            if (parcelUuid2 != null && parcelUuid == null) {
                throw new IllegalArgumentException("uuid is null while uuidMask is not null!");
            }
            this.IAuthTabCallbackDefault = parcelUuid;
            this.asBinder = parcelUuid2;
            return this;
        }

        public onExtraCallbackWithResult onWarmupCompleted(@NonNull ParcelUuid parcelUuid, @Nullable byte[] bArr) {
            if (parcelUuid == null) {
                throw new IllegalArgumentException("serviceDataUuid is null!");
            }
            this.IAuthTabCallbackStub = parcelUuid;
            this.onTransact = bArr;
            this.asInterface = null;
            return this;
        }

        public onExtraCallbackWithResult onExtraCallback(@NonNull ParcelUuid parcelUuid, @Nullable byte[] bArr, @Nullable byte[] bArr2) {
            if (parcelUuid == null) {
                throw new IllegalArgumentException("serviceDataUuid is null");
            }
            if (bArr2 != null) {
                if (bArr == null) {
                    throw new IllegalArgumentException("serviceData is null while serviceDataMask is not null");
                }
                if (bArr.length != bArr2.length) {
                    throw new IllegalArgumentException("size mismatch for service data and service data mask");
                }
            }
            this.IAuthTabCallbackStub = parcelUuid;
            this.onTransact = bArr;
            this.asInterface = bArr2;
            return this;
        }

        public onExtraCallbackWithResult onExtraCallbackWithResult(int i, @Nullable byte[] bArr) {
            if (bArr != null && i < 0) {
                throw new IllegalArgumentException("invalid manufacture id");
            }
            this.IAuthTabCallback = i;
            this.onNavigationEvent = bArr;
            this.onWarmupCompleted = null;
            return this;
        }

        public onExtraCallbackWithResult IAuthTabCallback(int i, @Nullable byte[] bArr, @Nullable byte[] bArr2) {
            if (bArr != null && i < 0) {
                throw new IllegalArgumentException("invalid manufacture id");
            }
            if (bArr2 != null) {
                if (bArr == null) {
                    throw new IllegalArgumentException("manufacturerData is null while manufacturerDataMask is not null");
                }
                if (bArr.length != bArr2.length) {
                    throw new IllegalArgumentException("size mismatch for manufacturerData and manufacturerDataMask");
                }
            }
            this.IAuthTabCallback = i;
            this.onNavigationEvent = bArr;
            this.onWarmupCompleted = bArr2;
            return this;
        }

        public TTAppOpenAdActivity onNavigationEvent() {
            return new TTAppOpenAdActivity(this.onExtraCallbackWithResult, this.onExtraCallback, this.IAuthTabCallbackDefault, this.asBinder, this.IAuthTabCallbackStub, this.onTransact, this.asInterface, this.IAuthTabCallback, this.onNavigationEvent, this.onWarmupCompleted);
        }
    }
}
