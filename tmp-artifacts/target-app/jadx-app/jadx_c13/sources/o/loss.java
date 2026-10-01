package o;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class loss implements Parcelable {
    protected byte[] onNavigationEvent;
    private static final char[] onWarmupCompleted = "0123456789ABCDEF".toCharArray();
    public static final Parcelable.Creator<loss> CREATOR = new Parcelable.Creator<loss>() { // from class: o.loss.4
        @Override // android.os.Parcelable.Creator
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public loss createFromParcel(Parcel parcel) {
            return new loss(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public loss[] newArray(int i) {
            return new loss[i];
        }
    };

    private static int IAuthTabCallback(byte b) {
        return b & 255;
    }

    public static int IAuthTabCallback(int i) {
        return i & 15;
    }

    private static int onWarmupCompleted(int i, int i2) {
        int i3 = 1 << (i2 - 1);
        return (i & i3) != 0 ? -(i3 - (i & (i3 - 1))) : i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public loss() {
        this.onNavigationEvent = null;
    }

    public loss(@Nullable byte[] bArr) {
        this.onNavigationEvent = bArr;
    }

    public byte[] onNavigationEvent() {
        return this.onNavigationEvent;
    }

    public int onExtraCallback() {
        byte[] bArr = this.onNavigationEvent;
        if (bArr != null) {
            return bArr.length;
        }
        return 0;
    }

    public String toString() {
        if (onExtraCallback() == 0) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        char[] cArr = new char[(this.onNavigationEvent.length * 3) - 1];
        int i = 0;
        while (true) {
            byte[] bArr = this.onNavigationEvent;
            if (i < bArr.length) {
                byte b = bArr[i];
                int i2 = i * 3;
                char[] cArr2 = onWarmupCompleted;
                cArr[i2] = cArr2[(b & 255) >>> 4];
                cArr[i2 + 1] = cArr2[b & 15];
                if (i != bArr.length - 1) {
                    cArr[i2 + 2] = '-';
                }
                i++;
            } else {
                return "(0x) " + new String(cArr);
            }
        }
    }

    public Integer onExtraCallbackWithResult(int i, int i2) {
        if (IAuthTabCallback(i) + i2 > onExtraCallback()) {
            return null;
        }
        switch (i) {
            case 17:
                break;
            case 18:
                byte[] bArr = this.onNavigationEvent;
                break;
            case 19:
                byte[] bArr2 = this.onNavigationEvent;
                break;
            case 20:
                byte[] bArr3 = this.onNavigationEvent;
                break;
            default:
                switch (i) {
                    case 33:
                        break;
                    case 34:
                        byte[] bArr4 = this.onNavigationEvent;
                        break;
                    case 35:
                        byte[] bArr5 = this.onNavigationEvent;
                        break;
                    case 36:
                        byte[] bArr6 = this.onNavigationEvent;
                        break;
                    default:
                        switch (i) {
                            case 274:
                                byte[] bArr7 = this.onNavigationEvent;
                                break;
                            case 275:
                                byte[] bArr8 = this.onNavigationEvent;
                                break;
                            case 276:
                                byte[] bArr9 = this.onNavigationEvent;
                                break;
                            default:
                                switch (i) {
                                    case 290:
                                        byte[] bArr10 = this.onNavigationEvent;
                                        break;
                                    case 291:
                                        byte[] bArr11 = this.onNavigationEvent;
                                        break;
                                    case 292:
                                        byte[] bArr12 = this.onNavigationEvent;
                                        break;
                                }
                        }
                }
        }
        return null;
    }

    private static int onExtraCallback(byte b, byte b2) {
        return IAuthTabCallback(b) + (IAuthTabCallback(b2) << 8);
    }

    private static int onNavigationEvent(byte b, byte b2, byte b3, byte b4) {
        return IAuthTabCallback(b) + (IAuthTabCallback(b2) << 8) + (IAuthTabCallback(b3) << 16) + (IAuthTabCallback(b4) << 24);
    }

    protected loss(Parcel parcel) {
        this.onNavigationEvent = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.onNavigationEvent);
    }
}
