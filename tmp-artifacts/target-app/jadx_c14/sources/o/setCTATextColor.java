package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class setCTATextColor implements Parcelable {
    public static final Parcelable.Creator<setCTATextColor> CREATOR = new onExtraCallback();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final Integer height;
    private final String url;
    private final Integer width;

    public static final class onExtraCallback implements Parcelable.Creator<setCTATextColor> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ setCTATextColor createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 101;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            setCTATextColor setctatextcolorOnNavigationEvent = onNavigationEvent(parcel);
            if (i3 != 0) {
                int i4 = 42 / 0;
            }
            return setctatextcolorOnNavigationEvent;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ setCTATextColor[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 103;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return onWarmupCompleted(i);
            }
            onWarmupCompleted(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final setCTATextColor onNavigationEvent(Parcel parcel) {
            Integer numValueOf;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 25;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                int i4 = IAuthTabCallback + 37;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                int i6 = onNavigationEvent + 1;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 98 / 0;
                }
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new setCTATextColor(string, numValueOf, numValueOf2);
        }

        public final setCTATextColor[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 53;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            int i5 = i3 % 2;
            setCTATextColor[] setctatextcolorArr = new setCTATextColor[i];
            int i6 = i4 + 43;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return setctatextcolorArr;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 85;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 43;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof setCTATextColor)) {
            return false;
        }
        setCTATextColor setctatextcolor = (setCTATextColor) obj;
        if (!Intrinsics.areEqual(this.url, setctatextcolor.url)) {
            int i4 = onExtraCallback + 21;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.width, setctatextcolor.width)) {
            return false;
        }
        if (Intrinsics.areEqual(this.height, setctatextcolor.height)) {
            return true;
        }
        int i6 = IAuthTabCallback + 21;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iHashCode = this.url.hashCode();
        Integer num = this.width;
        if (num == null) {
            int i3 = onExtraCallback + 111;
            IAuthTabCallback = i3 % 128;
            i = i3 % 2 != 0 ? 1 : 0;
        } else {
            int iHashCode2 = num.hashCode();
            int i4 = IAuthTabCallback + 29;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            i = iHashCode2;
        }
        Integer num2 = this.height;
        return (((iHashCode * 31) + i) * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardIssueImageResp(url=" + this.url + ", width=" + this.width + ", height=" + this.height + ")";
        int i2 = onExtraCallback + 69;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 69;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.url);
            throw null;
        }
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.url);
        Integer num = this.width;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
            int i4 = onExtraCallback + 25;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        Integer num2 = this.height;
        if (num2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        } else {
            int i6 = IAuthTabCallback + 91;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            parcel.writeInt(0);
        }
    }

    public setCTATextColor(@NotNull String str, @Nullable Integer num, @Nullable Integer num2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.url = str;
        this.width = num;
        this.height = num2;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 73;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.url;
        int i5 = i2 + 55;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 7 / 0;
        }
        return str;
    }

    public final Integer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.width;
        if (i3 == 0) {
            int i4 = 93 / 0;
        }
        return num;
    }

    public final Integer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        Integer num = this.height;
        int i5 = i3 + 11;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }
}
