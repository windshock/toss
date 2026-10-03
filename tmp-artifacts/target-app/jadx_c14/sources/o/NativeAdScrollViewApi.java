package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NativeAdScrollViewApi implements Parcelable {
    public static final Parcelable.Creator<NativeAdScrollViewApi> CREATOR = new onWarmupCompleted();
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String errorMessage;
    private final String pattern;

    public static final class onWarmupCompleted implements Parcelable.Creator<NativeAdScrollViewApi> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public final NativeAdScrollViewApi[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent;
            int i4 = i3 + 71;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            NativeAdScrollViewApi[] nativeAdScrollViewApiArr = new NativeAdScrollViewApi[i];
            int i6 = i3 + 45;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                return nativeAdScrollViewApiArr;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ NativeAdScrollViewApi createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 111;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            NativeAdScrollViewApi nativeAdScrollViewApiOnWarmupCompleted = onWarmupCompleted(parcel);
            int i4 = onExtraCallbackWithResult + 85;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return nativeAdScrollViewApiOnWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ NativeAdScrollViewApi[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 23;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            NativeAdScrollViewApi[] nativeAdScrollViewApiArrIAuthTabCallback = IAuthTabCallback(i);
            int i5 = onNavigationEvent + 123;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 37 / 0;
            }
            return nativeAdScrollViewApiArrIAuthTabCallback;
        }

        public final NativeAdScrollViewApi onWarmupCompleted(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            NativeAdScrollViewApi nativeAdScrollViewApi = new NativeAdScrollViewApi(parcel.readString(), parcel.readString());
            int i2 = onNavigationEvent + 105;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return nativeAdScrollViewApi;
        }
    }

    static {
        int i = onExtraCallback + 57;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NativeAdScrollViewApi() {
        String str = null;
        this(str, str, 3, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onExtraCallbackWithResult = i2 % 128;
        return i2 % 2 == 0 ? 1 : 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 23;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NativeAdScrollViewApi)) {
            int i4 = i2 + 11;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        NativeAdScrollViewApi nativeAdScrollViewApi = (NativeAdScrollViewApi) obj;
        if (!Intrinsics.areEqual(this.pattern, nativeAdScrollViewApi.pattern)) {
            int i6 = onNavigationEvent + 83;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.errorMessage, nativeAdScrollViewApi.errorMessage)) {
            return false;
        }
        int i8 = onExtraCallbackWithResult + 81;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.pattern.hashCode() * 31) + this.errorMessage.hashCode();
        int i4 = onExtraCallbackWithResult + 17;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardIssueAddressRegexRule(pattern=" + this.pattern + ", errorMessage=" + this.errorMessage + ")";
        int i2 = onExtraCallbackWithResult + 101;
        onNavigationEvent = i2 % 128;
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
        int i3 = onNavigationEvent + 115;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.pattern);
        parcel.writeString(this.errorMessage);
        if (i4 == 0) {
            throw null;
        }
    }

    public NativeAdScrollViewApi(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.pattern = str;
        this.errorMessage = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NativeAdScrollViewApi(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 105;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i4 = onExtraCallbackWithResult + 105;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 23 / 0;
            }
            int i6 = 2 % 2;
            str2 = "";
        }
        this(str, str2);
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 81;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.pattern;
        int i5 = i2 + 31;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return this.errorMessage;
        }
        throw null;
    }
}
