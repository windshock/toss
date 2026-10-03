package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class makeAdsSdkClassLoader implements makeLoaderUnsafe, Parcelable {
    public static final Parcelable.Creator<makeAdsSdkClassLoader> CREATOR = new onWarmupCompleted();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String subtitle;
    private final String title;
    private final String type;

    public static final class onWarmupCompleted implements Parcelable.Creator<makeAdsSdkClassLoader> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ makeAdsSdkClassLoader createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 29;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onExtraCallbackWithResult(parcel);
            }
            onExtraCallbackWithResult(parcel);
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ makeAdsSdkClassLoader[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 7;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            makeAdsSdkClassLoader[] makeadssdkclassloaderArrOnNavigationEvent = onNavigationEvent(i);
            int i5 = onExtraCallback + 121;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return makeadssdkclassloaderArrOnNavigationEvent;
        }

        public final makeAdsSdkClassLoader onExtraCallbackWithResult(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            makeAdsSdkClassLoader makeadssdkclassloader = new makeAdsSdkClassLoader(parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = onExtraCallback + 95;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return makeadssdkclassloader;
        }

        public final makeAdsSdkClassLoader[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 55;
            onExtraCallback = i3 % 128;
            makeAdsSdkClassLoader[] makeadssdkclassloaderArr = new makeAdsSdkClassLoader[i];
            if (i3 % 2 == 0) {
                return makeadssdkclassloaderArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onWarmupCompleted + 17;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 105;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 83;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof makeAdsSdkClassLoader)) {
            return false;
        }
        makeAdsSdkClassLoader makeadssdkclassloader = (makeAdsSdkClassLoader) obj;
        if (!Intrinsics.areEqual(this.title, makeadssdkclassloader.title)) {
            int i2 = IAuthTabCallback + 43;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.subtitle, makeadssdkclassloader.subtitle)) {
            int i4 = IAuthTabCallback + 51;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.type, makeadssdkclassloader.type)) {
            return true;
        }
        int i6 = onNavigationEvent + 51;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            this.title.hashCode();
            throw null;
        }
        int iHashCode2 = this.title.hashCode();
        String str = this.subtitle;
        if (str == null) {
            int i3 = onNavigationEvent + 71;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode) * 31) + this.type.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ListRowTypeModel(title=" + this.title + ", subtitle=" + this.subtitle + ", type=" + this.type + ")";
        int i2 = onNavigationEvent + 103;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 99;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        String str = this.title;
        if (i4 != 0) {
            parcel.writeString(str);
            parcel.writeString(this.subtitle);
            parcel.writeString(this.type);
        } else {
            parcel.writeString(str);
            parcel.writeString(this.subtitle);
            parcel.writeString(this.type);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public makeAdsSdkClassLoader(@NotNull String str, @Nullable String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.title = str;
        this.subtitle = str2;
        this.type = str3;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 95;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.title;
        int i5 = i2 + 67;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 69 / 0;
        }
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.subtitle;
        int i5 = i3 + 31;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
