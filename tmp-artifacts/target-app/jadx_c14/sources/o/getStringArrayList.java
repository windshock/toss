package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getStringArrayList implements RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1 {
    public static final Parcelable.Creator<getStringArrayList> CREATOR = new IAuthTabCallback();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final String first;
    private final String second;
    private final String third;

    public static final class IAuthTabCallback implements Parcelable.Creator<getStringArrayList> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ getStringArrayList createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 115;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            getStringArrayList getstringarraylistOnWarmupCompleted = onWarmupCompleted(parcel);
            int i4 = onNavigationEvent + 109;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return getstringarraylistOnWarmupCompleted;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ getStringArrayList[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 79;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            getStringArrayList[] getstringarraylistArrOnExtraCallback = onExtraCallback(i);
            int i5 = IAuthTabCallback + 117;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return getstringarraylistArrOnExtraCallback;
        }

        public final getStringArrayList[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 81;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            getStringArrayList[] getstringarraylistArr = new getStringArrayList[i];
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i4 + 23;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return getstringarraylistArr;
        }

        public final getStringArrayList onWarmupCompleted(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            getStringArrayList getstringarraylist = new getStringArrayList(parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = IAuthTabCallback + 51;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return getstringarraylist;
        }
    }

    static {
        int i = IAuthTabCallback + 1;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 70 / 0;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2 != 0 ? 1 : 0;
        int i5 = i3 + 27;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 49 / 0;
        }
        return i4;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 39;
            onExtraCallbackWithResult = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof getStringArrayList)) {
            return false;
        }
        getStringArrayList getstringarraylist = (getStringArrayList) obj;
        if (!Intrinsics.areEqual(this.first, getstringarraylist.first)) {
            int i3 = onNavigationEvent + 85;
            onExtraCallbackWithResult = i3 % 128;
            return i3 % 2 == 0;
        }
        if (Intrinsics.areEqual(this.second, getstringarraylist.second)) {
            return Intrinsics.areEqual(this.third, getstringarraylist.third);
        }
        int i4 = onExtraCallbackWithResult + 39;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.first.hashCode() * 31) + this.second.hashCode()) * 31) + this.third.hashCode();
        int i4 = onExtraCallbackWithResult + 115;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "YoloSelectFormValue(first=" + this.first + ", second=" + this.second + ", third=" + this.third + ")";
        int i2 = onExtraCallbackWithResult + 87;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 83;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.first);
        parcel.writeString(this.second);
        parcel.writeString(this.third);
        int i5 = onExtraCallbackWithResult + 13;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 48 / 0;
        }
    }

    public getStringArrayList(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.first = str;
        this.second = str2;
        this.third = str3;
    }
}
