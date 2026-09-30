package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class enableEventTrackerAdd implements Parcelable {
    public static final Parcelable.Creator<enableEventTrackerAdd> CREATOR = new onNavigationEvent();
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int onTransact = 1;
    private final String IAuthTabCallback;
    private final String onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final String onWarmupCompleted;

    static {
        int i = IAuthTabCallbackStub + 125;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onTransact + 17;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 113;
        int i4 = i3 % 128;
        asBinder = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i2 + 91;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(obj instanceof enableEventTrackerAdd)) {
            int i8 = i4 + 125;
            onTransact = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        enableEventTrackerAdd enableeventtrackeradd = (enableEventTrackerAdd) obj;
        if (Intrinsics.areEqual(this.IAuthTabCallback, enableeventtrackeradd.IAuthTabCallback)) {
            if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, enableeventtrackeradd.onExtraCallbackWithResult)) {
                int i10 = asBinder;
                int i11 = i10 + 33;
                onTransact = i11 % 128;
                int i12 = i11 % 2;
                int i13 = i10 + 27;
                onTransact = i13 % 128;
                int i14 = i13 % 2;
                return false;
            }
            if (!(!Intrinsics.areEqual(this.onNavigationEvent, enableeventtrackeradd.onNavigationEvent))) {
                return ((Intrinsics.areEqual(this.onExtraCallback, enableeventtrackeradd.onExtraCallback) ^ true) || (Intrinsics.areEqual(this.onWarmupCompleted, enableeventtrackeradd.onWarmupCompleted) ^ true)) ? false : true;
            }
            int i15 = onTransact + 109;
            int i16 = i15 % 128;
            asBinder = i16;
            int i17 = i15 % 2;
            int i18 = i16 + 25;
            onTransact = i18 % 128;
            if (i18 % 2 == 0) {
                int i19 = 14 / 0;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = onTransact + 3;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = this.IAuthTabCallback.hashCode();
        int iHashCode2 = this.onExtraCallbackWithResult.hashCode();
        int iHashCode3 = this.onNavigationEvent.hashCode();
        int iHashCode4 = this.onExtraCallback.hashCode();
        String str = this.onWarmupCompleted;
        if (str == null) {
            i = 0;
        } else {
            int iHashCode5 = str.hashCode();
            int i5 = onTransact + 85;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            i = iHashCode5;
        }
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + i;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CreditQuizBanner(title=" + this.IAuthTabCallback + ", subtitle=" + this.onExtraCallbackWithResult + ", iconUrl=" + this.onNavigationEvent + ", linkUrl=" + this.onExtraCallback + ", ctaText=" + this.onWarmupCompleted + ")";
        int i2 = onTransact + 55;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 119;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i4 == 0) {
            parcel.writeString(this.IAuthTabCallback);
            parcel.writeString(this.onExtraCallbackWithResult);
            parcel.writeString(this.onNavigationEvent);
            parcel.writeString(this.onExtraCallback);
            parcel.writeString(this.onWarmupCompleted);
            obj.hashCode();
            throw null;
        }
        parcel.writeString(this.IAuthTabCallback);
        parcel.writeString(this.onExtraCallbackWithResult);
        parcel.writeString(this.onNavigationEvent);
        parcel.writeString(this.onExtraCallback);
        parcel.writeString(this.onWarmupCompleted);
        int i5 = asBinder + 71;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public enableEventTrackerAdd(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.IAuthTabCallback = str;
        this.onExtraCallbackWithResult = str2;
        this.onNavigationEvent = str3;
        this.onExtraCallback = str4;
        this.onWarmupCompleted = str5;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact + 119;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String str = this.IAuthTabCallback;
        if (i3 != 0) {
            int i4 = 46 / 0;
        }
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 53;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        String str = this.onExtraCallbackWithResult;
        int i5 = i3 + 23;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 21;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        String str = this.onNavigationEvent;
        int i5 = i3 + 93;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 5;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 13;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onWarmupCompleted;
        int i5 = i2 + 27;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
