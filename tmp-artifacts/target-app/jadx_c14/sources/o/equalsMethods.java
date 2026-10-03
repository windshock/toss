package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class equalsMethods implements Parcelable {
    public static final Parcelable.Creator<equalsMethods> CREATOR = new IAuthTabCallback();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final String content;
    private final String title;

    public static final class IAuthTabCallback implements Parcelable.Creator<equalsMethods> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public final equalsMethods[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback;
            int i4 = i3 + 119;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            equalsMethods[] equalsmethodsArr = new equalsMethods[i];
            int i6 = i3 + 27;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return equalsmethodsArr;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ equalsMethods createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 47;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            equalsMethods equalsmethodsOnWarmupCompleted = onWarmupCompleted(parcel);
            int i4 = IAuthTabCallback + 65;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return equalsmethodsOnWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ equalsMethods[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 71;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            equalsMethods[] equalsmethodsArrIAuthTabCallback = IAuthTabCallback(i);
            int i5 = onExtraCallback + 21;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return equalsmethodsArrIAuthTabCallback;
        }

        public final equalsMethods onWarmupCompleted(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            equalsMethods equalsmethods = new equalsMethods(parcel.readString(), parcel.readString());
            int i2 = IAuthTabCallback + 25;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return equalsmethods;
            }
            throw null;
        }
    }

    static {
        int i = onWarmupCompleted + 57;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onExtraCallbackWithResult = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 37;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof equalsMethods)) {
            return false;
        }
        equalsMethods equalsmethods = (equalsMethods) obj;
        if (!Intrinsics.areEqual(this.title, equalsmethods.title) || !Intrinsics.areEqual(this.content, equalsmethods.content)) {
            return false;
        }
        int i4 = IAuthTabCallback + 93;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.title;
        int iHashCode2 = 0;
        if (str == null) {
            int i2 = IAuthTabCallback + 87;
            onExtraCallbackWithResult = i2 % 128;
            iHashCode = i2 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.content;
        if (str2 != null) {
            iHashCode2 = str2.hashCode();
            int i3 = onExtraCallbackWithResult + 81;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        return (iHashCode * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TableDescriptionContent(title=" + this.title + ", content=" + this.content + ")";
        int i2 = onExtraCallbackWithResult + 85;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 49;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i4 != 0) {
            parcel.writeString(this.title);
            parcel.writeString(this.content);
            throw null;
        }
        parcel.writeString(this.title);
        parcel.writeString(this.content);
        int i5 = IAuthTabCallback + 121;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public equalsMethods(@Nullable String str, @Nullable String str2) {
        this.title = str;
        this.content = str2;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 47;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.title;
        int i5 = i2 + 19;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 97;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.content;
        int i5 = i3 + 67;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
