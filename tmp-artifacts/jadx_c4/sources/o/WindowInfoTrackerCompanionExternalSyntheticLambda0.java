package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class WindowInfoTrackerCompanionExternalSyntheticLambda0 implements Parcelable {
    public static final Parcelable.Creator<WindowInfoTrackerCompanionExternalSyntheticLambda0> CREATOR = new onExtraCallbackWithResult();
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private final String IAuthTabCallback;
    private final Integer onNavigationEvent;
    private final String onWarmupCompleted;

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<WindowInfoTrackerCompanionExternalSyntheticLambda0> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ WindowInfoTrackerCompanionExternalSyntheticLambda0 createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 117;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                onNavigationEvent(parcel);
                throw null;
            }
            WindowInfoTrackerCompanionExternalSyntheticLambda0 windowInfoTrackerCompanionExternalSyntheticLambda0OnNavigationEvent = onNavigationEvent(parcel);
            int i3 = onNavigationEvent + 111;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return windowInfoTrackerCompanionExternalSyntheticLambda0OnNavigationEvent;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ WindowInfoTrackerCompanionExternalSyntheticLambda0[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 51;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            WindowInfoTrackerCompanionExternalSyntheticLambda0[] windowInfoTrackerCompanionExternalSyntheticLambda0ArrOnWarmupCompleted = onWarmupCompleted(i);
            if (i4 == 0) {
                int i5 = 47 / 0;
            }
            return windowInfoTrackerCompanionExternalSyntheticLambda0ArrOnWarmupCompleted;
        }

        public final WindowInfoTrackerCompanionExternalSyntheticLambda0 onNavigationEvent(Parcel parcel) {
            Integer numValueOf;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i2 = onWarmupCompleted;
                int i3 = i2 + 7;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 3 / 0;
                }
                int i5 = i2 + 19;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new WindowInfoTrackerCompanionExternalSyntheticLambda0(string, string2, numValueOf);
        }

        public final WindowInfoTrackerCompanionExternalSyntheticLambda0[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted;
            int i4 = i3 + 49;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            WindowInfoTrackerCompanionExternalSyntheticLambda0[] windowInfoTrackerCompanionExternalSyntheticLambda0Arr = new WindowInfoTrackerCompanionExternalSyntheticLambda0[i];
            int i6 = i3 + 117;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return windowInfoTrackerCompanionExternalSyntheticLambda0Arr;
        }
    }

    static {
        int i = onExtraCallback + 67;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public WindowInfoTrackerCompanionExternalSyntheticLambda0() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 77;
        asInterface = i3 % 128;
        int i4 = i3 % 2 == 0 ? 1 : 0;
        int i5 = i2 + 73;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 109;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 9;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof WindowInfoTrackerCompanionExternalSyntheticLambda0)) {
            return false;
        }
        WindowInfoTrackerCompanionExternalSyntheticLambda0 windowInfoTrackerCompanionExternalSyntheticLambda0 = (WindowInfoTrackerCompanionExternalSyntheticLambda0) obj;
        if (!Intrinsics.areEqual(this.IAuthTabCallback, windowInfoTrackerCompanionExternalSyntheticLambda0.IAuthTabCallback)) {
            int i7 = asBinder + 1;
            asInterface = i7 % 128;
            return i7 % 2 == 0;
        }
        if (Intrinsics.areEqual(this.onWarmupCompleted, windowInfoTrackerCompanionExternalSyntheticLambda0.onWarmupCompleted)) {
            return !(Intrinsics.areEqual(this.onNavigationEvent, windowInfoTrackerCompanionExternalSyntheticLambda0.onNavigationEvent) ^ true);
        }
        int i8 = asBinder + 33;
        asInterface = i8 % 128;
        return i8 % 2 == 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.IAuthTabCallback;
        int iHashCode3 = 0;
        if (str == null) {
            int i2 = asInterface + 13;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.onWarmupCompleted;
        if (str2 == null) {
            int i4 = asBinder + 43;
            asInterface = i4 % 128;
            iHashCode2 = i4 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        Integer num = this.onNavigationEvent;
        if (num != null) {
            iHashCode3 = num.hashCode();
            int i5 = asBinder + 79;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
        }
        return (((iHashCode * 31) + iHashCode2) * 31) + iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MiniAppInfo(deploymentId=" + this.IAuthTabCallback + ", appName=" + this.onWarmupCompleted + ", appId=" + this.onNavigationEvent + ")";
        int i2 = asInterface + 47;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 43;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.IAuthTabCallback);
            parcel.writeString(this.onWarmupCompleted);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.IAuthTabCallback);
        parcel.writeString(this.onWarmupCompleted);
        Integer num = this.onNavigationEvent;
        if (num == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(num.intValue());
        int i4 = asBinder + 75;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 41 / 0;
        }
    }

    public WindowInfoTrackerCompanionExternalSyntheticLambda0(@Nullable String str, @Nullable String str2, @Nullable Integer num) {
        this.IAuthTabCallback = str;
        this.onWarmupCompleted = str2;
        this.onNavigationEvent = num;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WindowInfoTrackerCompanionExternalSyntheticLambda0(String str, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = asBinder + 109;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 37 / 0;
            }
            int i4 = 2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i5 = asBinder + 33;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            str2 = null;
        }
        if ((i & 4) != 0) {
            int i6 = asInterface + 13;
            asBinder = i6 % 128;
            if (i6 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            num = null;
        }
        this(str, str2, num);
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 11;
        int i3 = i2 % 128;
        asBinder = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.IAuthTabCallback;
        int i4 = i3 + 123;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 39;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onWarmupCompleted;
        int i5 = i2 + 103;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
