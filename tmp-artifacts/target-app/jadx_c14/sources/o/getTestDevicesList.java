package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getTestDevicesList implements RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1 {
    public static final Parcelable.Creator<getTestDevicesList> CREATOR = new onExtraCallbackWithResult();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final String readTs;

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<getTestDevicesList> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final getTestDevicesList[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback;
            int i4 = i3 + 35;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            getTestDevicesList[] gettestdeviceslistArr = new getTestDevicesList[i];
            int i6 = i3 + 59;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                return gettestdeviceslistArr;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ getTestDevicesList createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 45;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return onWarmupCompleted(parcel);
            }
            onWarmupCompleted(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ getTestDevicesList[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 117;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                IAuthTabCallback(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            getTestDevicesList[] gettestdeviceslistArrIAuthTabCallback = IAuthTabCallback(i);
            int i4 = onExtraCallbackWithResult + 7;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return gettestdeviceslistArrIAuthTabCallback;
        }

        public final getTestDevicesList onWarmupCompleted(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            getTestDevicesList gettestdeviceslist = new getTestDevicesList(parcel.readString());
            int i2 = IAuthTabCallback + 85;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return gettestdeviceslist;
        }
    }

    static {
        int i = onExtraCallback + 9;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            int i2 = 61 / 0;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 21;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 51 / 0;
        }
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 83;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 57;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (obj instanceof getTestDevicesList) {
            return Intrinsics.areEqual(this.readTs, ((getTestDevicesList) obj).readTs);
        }
        int i8 = i2 + 43;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        int i10 = i2 + 123;
        onNavigationEvent = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            iHashCode = this.readTs.hashCode();
            int i3 = 95 / 0;
        } else {
            iHashCode = this.readTs.hashCode();
        }
        int i4 = onNavigationEvent + 91;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DescriptionDownloadFormValue(readTs=" + this.readTs + ")";
        int i2 = IAuthTabCallback + 11;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 5;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i4 == 0) {
            parcel.writeString(this.readTs);
            int i5 = 61 / 0;
        } else {
            parcel.writeString(this.readTs);
        }
        int i6 = onNavigationEvent + 75;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    public getTestDevicesList(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.readTs = str;
    }
}
