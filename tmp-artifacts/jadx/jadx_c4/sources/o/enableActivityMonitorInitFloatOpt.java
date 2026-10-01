package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class enableActivityMonitorInitFloatOpt implements Parcelable {
    public static final Parcelable.Creator<enableActivityMonitorInitFloatOpt> CREATOR = new onExtraCallback();
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private static int onTransact;
    private final String IAuthTabCallback;
    private final String asBinder;
    private final String onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final String onWarmupCompleted;

    public static final class onExtraCallback implements Parcelable.Creator<enableActivityMonitorInitFloatOpt> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public final enableActivityMonitorInitFloatOpt IAuthTabCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            enableActivityMonitorInitFloatOpt enableactivitymonitorinitfloatopt = new enableActivityMonitorInitFloatOpt(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = onExtraCallback + 109;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 73 / 0;
            }
            return enableactivitymonitorinitfloatopt;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ enableActivityMonitorInitFloatOpt createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 119;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return IAuthTabCallback(parcel);
            }
            IAuthTabCallback(parcel);
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ enableActivityMonitorInitFloatOpt[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 109;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                onExtraCallback(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            enableActivityMonitorInitFloatOpt[] enableactivitymonitorinitfloatoptArrOnExtraCallback = onExtraCallback(i);
            int i4 = onWarmupCompleted + 77;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return enableactivitymonitorinitfloatoptArrOnExtraCallback;
        }

        public final enableActivityMonitorInitFloatOpt[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 95;
            onWarmupCompleted = i3 % 128;
            enableActivityMonitorInitFloatOpt[] enableactivitymonitorinitfloatoptArr = new enableActivityMonitorInitFloatOpt[i];
            if (i3 % 2 == 0) {
                int i4 = 7 / 0;
            }
            return enableactivitymonitorinitfloatoptArr;
        }
    }

    static {
        int i = asInterface + 5;
        onTransact = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 51;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2 != 0 ? 1 : 0;
        int i5 = i2 + 41;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof enableActivityMonitorInitFloatOpt)) {
            int i2 = IAuthTabCallbackDefault + 43;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 111;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 71 / 0;
            }
            return false;
        }
        enableActivityMonitorInitFloatOpt enableactivitymonitorinitfloatopt = (enableActivityMonitorInitFloatOpt) obj;
        if (!Intrinsics.areEqual(this.onNavigationEvent, enableactivitymonitorinitfloatopt.onNavigationEvent)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.asBinder, enableactivitymonitorinitfloatopt.asBinder)) {
            int i7 = IAuthTabCallbackStub + 57;
            IAuthTabCallbackDefault = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallback, enableactivitymonitorinitfloatopt.onExtraCallback)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onWarmupCompleted, enableactivitymonitorinitfloatopt.onWarmupCompleted)) {
            int i9 = IAuthTabCallbackStub + 105;
            IAuthTabCallbackDefault = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, enableactivitymonitorinitfloatopt.onExtraCallbackWithResult)) {
            int i11 = IAuthTabCallbackDefault + 39;
            IAuthTabCallbackStub = i11 % 128;
            return i11 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.IAuthTabCallback, enableactivitymonitorinitfloatopt.IAuthTabCallback)) {
            return true;
        }
        int i12 = IAuthTabCallbackDefault + 39;
        IAuthTabCallbackStub = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 19;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.onNavigationEvent.hashCode();
        int iHashCode3 = this.asBinder.hashCode();
        int iHashCode4 = this.onExtraCallback.hashCode();
        int iHashCode5 = this.onWarmupCompleted.hashCode();
        int iHashCode6 = this.onExtraCallbackWithResult.hashCode();
        String str = this.IAuthTabCallback;
        if (str == null) {
            int i4 = IAuthTabCallbackDefault + 53;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int i6 = (((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode;
        int i7 = IAuthTabCallbackDefault + 29;
        IAuthTabCallbackStub = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CptBanner(bannerId=" + this.onNavigationEvent + ", title=" + this.asBinder + ", subtitle=" + this.onExtraCallback + ", logoUrl=" + this.onWarmupCompleted + ", linkUrl=" + this.onExtraCallbackWithResult + ", deliberationText=" + this.IAuthTabCallback + ")";
        int i2 = IAuthTabCallbackDefault + 47;
        IAuthTabCallbackStub = i2 % 128;
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
        int i3 = IAuthTabCallbackDefault + 63;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.onNavigationEvent);
        parcel.writeString(this.asBinder);
        parcel.writeString(this.onExtraCallback);
        parcel.writeString(this.onWarmupCompleted);
        parcel.writeString(this.onExtraCallbackWithResult);
        parcel.writeString(this.IAuthTabCallback);
        int i5 = IAuthTabCallbackStub + 89;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public enableActivityMonitorInitFloatOpt(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @Nullable String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.onNavigationEvent = str;
        this.asBinder = str2;
        this.onExtraCallback = str3;
        this.onWarmupCompleted = str4;
        this.onExtraCallbackWithResult = str5;
        this.IAuthTabCallback = str6;
    }

    public final String onWarmupCompleted() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 107;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        if (i2 % 2 == 0) {
            str = this.onNavigationEvent;
            int i4 = 81 / 0;
        } else {
            str = this.onNavigationEvent;
        }
        int i5 = i3 + 19;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 53;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.asBinder;
        int i4 = i2 + 29;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 39 / 0;
        }
        return str;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 81;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onExtraCallback;
        int i5 = i2 + 43;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onNavigationEvent() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 5;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        if (i2 % 2 != 0) {
            str = this.onWarmupCompleted;
            int i4 = 39 / 0;
        } else {
            str = this.onWarmupCompleted;
        }
        int i5 = i3 + 117;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 109;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.onExtraCallbackWithResult;
        if (i3 == 0) {
            int i4 = 41 / 0;
        }
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 87;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.IAuthTabCallback;
        int i5 = i2 + 123;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r1
      0x001b: PHI (r1v5 java.lang.String) = (r1v4 java.lang.String), (r1v10 java.lang.String) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onExtraCallbackWithResult() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 85;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            str = this.IAuthTabCallback;
            int i3 = 55 / 0;
            if (str != null) {
                if (str.length() > 0) {
                    int i4 = IAuthTabCallbackDefault + 107;
                    IAuthTabCallbackStub = i4 % 128;
                    int i5 = i4 % 2;
                    return true;
                }
            }
        } else {
            str = this.IAuthTabCallback;
            if (str != null) {
            }
        }
        return false;
    }
}
