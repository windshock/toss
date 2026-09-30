package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambda20pDhUQTphn51LRdi087HaV6uds implements Parcelable {
    public static final Parcelable.Creator<r8lambda20pDhUQTphn51LRdi087HaV6uds> CREATOR = new onExtraCallbackWithResult();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String onExtraCallbackWithResult;

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<r8lambda20pDhUQTphn51LRdi087HaV6uds> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ r8lambda20pDhUQTphn51LRdi087HaV6uds createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 93;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            r8lambda20pDhUQTphn51LRdi087HaV6uds r8lambda20pdhuqtphn51lrdi087hav6udsOnNavigationEvent = onNavigationEvent(parcel);
            if (i3 != 0) {
                int i4 = 14 / 0;
            }
            return r8lambda20pdhuqtphn51lrdi087hav6udsOnNavigationEvent;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ r8lambda20pDhUQTphn51LRdi087HaV6uds[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 7;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            r8lambda20pDhUQTphn51LRdi087HaV6uds[] r8lambda20pdhuqtphn51lrdi087hav6udsArrOnWarmupCompleted = onWarmupCompleted(i);
            int i5 = onNavigationEvent + 69;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return r8lambda20pdhuqtphn51lrdi087hav6udsArrOnWarmupCompleted;
        }

        public final r8lambda20pDhUQTphn51LRdi087HaV6uds onNavigationEvent(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            r8lambda20pDhUQTphn51LRdi087HaV6uds r8lambda20pdhuqtphn51lrdi087hav6uds = new r8lambda20pDhUQTphn51LRdi087HaV6uds(parcel.readString());
            int i2 = onWarmupCompleted + 87;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return r8lambda20pdhuqtphn51lrdi087hav6uds;
        }

        public final r8lambda20pDhUQTphn51LRdi087HaV6uds[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 9;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            int i5 = i3 % 2;
            r8lambda20pDhUQTphn51LRdi087HaV6uds[] r8lambda20pdhuqtphn51lrdi087hav6udsArr = new r8lambda20pDhUQTphn51LRdi087HaV6uds[i];
            int i6 = i4 + 11;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                return r8lambda20pdhuqtphn51lrdi087hav6udsArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = IAuthTabCallback + 19;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            int i2 = 68 / 0;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2 == 0 ? 1 : 0;
        int i5 = i3 + 51;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 78 / 0;
        }
        return i4;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 49;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof r8lambda20pDhUQTphn51LRdi087HaV6uds)) {
            int i3 = onWarmupCompleted + 59;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!(!Intrinsics.areEqual(this.onExtraCallbackWithResult, ((r8lambda20pDhUQTphn51LRdi087HaV6uds) obj).onExtraCallbackWithResult))) {
            return true;
        }
        int i5 = onWarmupCompleted + 103;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onExtraCallbackWithResult.hashCode();
        int i4 = onExtraCallback + 7;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "StandardTermsV2HandlingItem(code=" + this.onExtraCallbackWithResult + ")";
        int i2 = onExtraCallback + 55;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 51;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i4 != 0) {
            parcel.writeString(this.onExtraCallbackWithResult);
            int i5 = 90 / 0;
        } else {
            parcel.writeString(this.onExtraCallbackWithResult);
        }
        int i6 = onWarmupCompleted + 31;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public r8lambda20pDhUQTphn51LRdi087HaV6uds(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onExtraCallbackWithResult = str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.onExtraCallbackWithResult;
        int i5 = i3 + 103;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 71 / 0;
        }
        return str;
    }
}
