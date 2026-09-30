package o;

import android.os.ParcelUuid;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TTAppOpenAdActivity3 {
    private final byte[] IAuthTabCallback;
    private final List<ParcelUuid> IAuthTabCallbackStub;
    private final int asBinder;
    private final String onExtraCallback;
    private final Map<ParcelUuid, byte[]> onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private final SparseArray<byte[]> onWarmupCompleted;

    public List<ParcelUuid> onExtraCallback() {
        return this.IAuthTabCallbackStub;
    }

    public byte[] onExtraCallbackWithResult(int i) {
        SparseArray<byte[]> sparseArray = this.onWarmupCompleted;
        if (sparseArray == null) {
            return null;
        }
        return sparseArray.get(i);
    }

    public Map<ParcelUuid, byte[]> onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult;
    }

    public byte[] onExtraCallbackWithResult(@NonNull ParcelUuid parcelUuid) {
        Map<ParcelUuid, byte[]> map;
        if (parcelUuid == null || (map = this.onExtraCallbackWithResult) == null) {
            return null;
        }
        return map.get(parcelUuid);
    }

    public String IAuthTabCallback() {
        return this.onExtraCallback;
    }

    public byte[] onNavigationEvent() {
        return this.IAuthTabCallback;
    }

    private TTAppOpenAdActivity3(@Nullable List<ParcelUuid> list, @Nullable SparseArray<byte[]> sparseArray, @Nullable Map<ParcelUuid, byte[]> map, int i, int i2, String str, byte[] bArr) {
        this.IAuthTabCallbackStub = list;
        this.onWarmupCompleted = sparseArray;
        this.onExtraCallbackWithResult = map;
        this.onExtraCallback = str;
        this.onNavigationEvent = i;
        this.asBinder = i2;
        this.IAuthTabCallback = bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static TTAppOpenAdActivity3 IAuthTabCallback(@Nullable byte[] bArr) {
        int i;
        if (bArr == null) {
            return null;
        }
        int i2 = 0;
        HashMap map = null;
        String str = null;
        int i3 = -1;
        byte b = -2147483648;
        ArrayList arrayList = null;
        SparseArray sparseArray = null;
        while (i2 < bArr.length && (i = bArr[i2] & 255) != 0) {
            try {
                int i4 = i - 1;
                int i5 = i2 + 2;
                int i6 = bArr[i2 + 1] & 255;
                if (i6 == 22) {
                    int i7 = i6 == 32 ? 4 : i6 == 33 ? 16 : 2;
                    ParcelUuid parcelUuidOnWarmupCompleted = IABLandingPageActivity8.onWarmupCompleted(IAuthTabCallback(bArr, i5, i7));
                    byte[] bArrIAuthTabCallback = IAuthTabCallback(bArr, i5 + i7, i4 - i7);
                    if (map == null) {
                        map = new HashMap();
                    }
                    map.put(parcelUuidOnWarmupCompleted, bArrIAuthTabCallback);
                } else if (i6 == 255) {
                    byte b2 = bArr[i2 + 3];
                    byte b3 = bArr[i5];
                    byte[] bArrIAuthTabCallback2 = IAuthTabCallback(bArr, i2 + 4, i - 3);
                    if (sparseArray == null) {
                        sparseArray = new SparseArray();
                    }
                    sparseArray.put(((b2 & 255) << 8) + (255 & b3), bArrIAuthTabCallback2);
                } else if (i6 != 32 && i6 != 33) {
                    switch (i6) {
                        case 1:
                            i3 = bArr[i5] & 255;
                            break;
                        case 2:
                        case 3:
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            IAuthTabCallback(bArr, i5, i4, 2, arrayList);
                            break;
                        case 4:
                        case 5:
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            IAuthTabCallback(bArr, i5, i4, 4, arrayList);
                            break;
                        case 6:
                        case 7:
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            IAuthTabCallback(bArr, i5, i4, 16, arrayList);
                            break;
                        case 8:
                        case 9:
                            str = new String(IAuthTabCallback(bArr, i5, i4));
                            break;
                        case 10:
                            b = bArr[i5];
                            break;
                    }
                }
                i2 = i5 + i4;
            } catch (Exception unused) {
                Arrays.toString(bArr);
                return new TTAppOpenAdActivity3(null, null, null, -1, Integer.MIN_VALUE, null, bArr);
            }
        }
        return new TTAppOpenAdActivity3(arrayList, sparseArray, map, i3, b, str, bArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TTAppOpenAdActivity3.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.IAuthTabCallback, ((TTAppOpenAdActivity3) obj).IAuthTabCallback);
    }

    public String toString() {
        return "ScanRecord [advertiseFlags=" + this.onNavigationEvent + ", serviceUuids=" + this.IAuthTabCallbackStub + ", manufacturerSpecificData=" + IABLandingPageActivitysya.onExtraCallbackWithResult(this.onWarmupCompleted) + ", serviceData=" + IABLandingPageActivitysya.IAuthTabCallback(this.onExtraCallbackWithResult) + ", txPowerLevel=" + this.asBinder + ", deviceName=" + this.onExtraCallback + "]";
    }

    private static int IAuthTabCallback(@NonNull byte[] bArr, int i, int i2, int i3, @NonNull List<ParcelUuid> list) {
        while (i2 > 0) {
            list.add(IABLandingPageActivity8.onWarmupCompleted(IAuthTabCallback(bArr, i, i3)));
            i2 -= i3;
            i += i3;
        }
        return i;
    }

    private static byte[] IAuthTabCallback(@NonNull byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }
}
