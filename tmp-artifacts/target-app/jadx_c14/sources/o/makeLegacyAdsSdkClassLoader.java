package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class makeLegacyAdsSdkClassLoader implements makeLoaderUnsafe, Parcelable {
    public static final Parcelable.Creator<makeLegacyAdsSdkClassLoader> CREATOR = new IAuthTabCallback();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private final String type;

    public static final class IAuthTabCallback implements Parcelable.Creator<makeLegacyAdsSdkClassLoader> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ makeLegacyAdsSdkClassLoader createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 101;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onNavigationEvent(parcel);
            }
            onNavigationEvent(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ makeLegacyAdsSdkClassLoader[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 111;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            makeLegacyAdsSdkClassLoader[] makelegacyadssdkclassloaderArrOnWarmupCompleted = onWarmupCompleted(i);
            int i5 = onExtraCallbackWithResult + 83;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return makelegacyadssdkclassloaderArrOnWarmupCompleted;
        }

        public final makeLegacyAdsSdkClassLoader onNavigationEvent(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            makeLegacyAdsSdkClassLoader makelegacyadssdkclassloader = new makeLegacyAdsSdkClassLoader(parcel.readString());
            int i2 = onExtraCallbackWithResult + 31;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return makelegacyadssdkclassloader;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final makeLegacyAdsSdkClassLoader[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 123;
            onExtraCallbackWithResult = i3 % 128;
            makeLegacyAdsSdkClassLoader[] makelegacyadssdkclassloaderArr = new makeLegacyAdsSdkClassLoader[i];
            if (i3 % 2 != 0) {
                int i4 = 54 / 0;
            }
            return makelegacyadssdkclassloaderArr;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 67;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 15;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2 != 0 ? 1 : 0;
        int i5 = i2 + 83;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof makeLegacyAdsSdkClassLoader)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.type, ((makeLegacyAdsSdkClassLoader) obj).type))) {
            return true;
        }
        int i3 = IAuthTabCallback + 67;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            this.type.hashCode();
            throw null;
        }
        int iHashCode = this.type.hashCode();
        int i3 = IAuthTabCallback + 19;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 63 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LineTypeModel(type=" + this.type + ")";
        int i2 = IAuthTabCallback + 43;
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
        int i3 = onNavigationEvent + 59;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        int i5 = onNavigationEvent + 5;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public makeLegacyAdsSdkClassLoader(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.type = str;
    }
}
