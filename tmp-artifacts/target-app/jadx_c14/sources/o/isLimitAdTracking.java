package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class isLimitAdTracking implements Parcelable {
    public static final Parcelable.Creator<isLimitAdTracking> CREATOR = new IAuthTabCallback();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final boolean isEnabled;
    private final String url;

    public static final class IAuthTabCallback implements Parcelable.Creator<isLimitAdTracking> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public final isLimitAdTracking IAuthTabCallback(Parcel parcel) {
            boolean z;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() != 0) {
                int i2 = onExtraCallbackWithResult + 123;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                z = true;
            } else {
                z = false;
            }
            isLimitAdTracking islimitadtracking = new isLimitAdTracking(z, parcel.readString());
            int i4 = onExtraCallbackWithResult + 53;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return islimitadtracking;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ isLimitAdTracking createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 17;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            isLimitAdTracking islimitadtrackingIAuthTabCallback = IAuthTabCallback(parcel);
            int i4 = onExtraCallbackWithResult + 19;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return islimitadtrackingIAuthTabCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ isLimitAdTracking[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 51;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            isLimitAdTracking[] islimitadtrackingArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            int i5 = onWarmupCompleted + 111;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 3 / 0;
            }
            return islimitadtrackingArrOnExtraCallbackWithResult;
        }

        public final isLimitAdTracking[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 125;
            int i4 = i3 % 128;
            onExtraCallbackWithResult = i4;
            int i5 = i3 % 2;
            isLimitAdTracking[] islimitadtrackingArr = new isLimitAdTracking[i];
            int i6 = i4 + 79;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return islimitadtrackingArr;
        }
    }

    static {
        int i = IAuthTabCallback + 69;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public isLimitAdTracking() {
        String str = null;
        this(false, str, 3, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 79;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 95;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 79 / 0;
        }
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        Object obj2 = null;
        if (this == obj) {
            int i2 = onNavigationEvent + 49;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 33;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return true;
            }
            obj2.hashCode();
            throw null;
        }
        if (!(!(obj instanceof isLimitAdTracking))) {
            if (this.isEnabled != ((isLimitAdTracking) obj).isEnabled) {
                int i6 = onNavigationEvent + 101;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    return false;
                }
                obj2.hashCode();
                throw null;
            }
            if (!(!Intrinsics.areEqual(this.url, r7.url))) {
                return true;
            }
            int i7 = onNavigationEvent + 33;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iHashCode = Boolean.hashCode(this.isEnabled);
        String str = this.url;
        if (str == null) {
            int i3 = onNavigationEvent + 9;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            i = 0;
        } else {
            int iHashCode2 = str.hashCode();
            int i5 = onWarmupCompleted + 111;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            i = iHashCode2;
        }
        return (iHashCode * 31) + i;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "IssueDateScrapingInfo(isEnabled=" + this.isEnabled + ", url=" + this.url + ")";
        int i2 = onWarmupCompleted + 111;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 33;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.isEnabled ? 1 : 0);
        parcel.writeString(this.url);
        int i5 = onWarmupCompleted + 85;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public isLimitAdTracking(boolean z, @Nullable String str) {
        this.isEnabled = z;
        this.url = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ isLimitAdTracking(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 123;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 / 4;
            } else {
                int i4 = 2 % 2;
            }
            z = false;
        }
        if ((i & 2) != 0) {
            int i5 = onWarmupCompleted + 13;
            int i6 = i5 % 128;
            onNavigationEvent = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 89;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 2 % 3;
            } else {
                int i10 = 2 % 2;
            }
            str = null;
        }
        this(z, str);
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.isEnabled;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onNavigationEvent() {
        String str;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            str = this.url;
            int i4 = 89 / 0;
        } else {
            str = this.url;
        }
        int i5 = i3 + 29;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 47 / 0;
        }
        return str;
    }
}
