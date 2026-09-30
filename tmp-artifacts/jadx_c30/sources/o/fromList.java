package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class fromList implements fromJavaArgs, Parcelable {
    public static final Parcelable.Creator<fromList> CREATOR = new IAuthTabCallback();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final String id;
    private final makeNativeArray type;
    private final String url;

    public static final class IAuthTabCallback implements Parcelable.Creator<fromList> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public final fromList[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 95;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            fromList[] fromlistArr = new fromList[i];
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i4 + 9;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return fromlistArr;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ fromList createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 101;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult(parcel);
            }
            onExtraCallbackWithResult(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ fromList[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 13;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                IAuthTabCallback(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            fromList[] fromlistArrIAuthTabCallback = IAuthTabCallback(i);
            int i4 = onExtraCallbackWithResult + 115;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 48 / 0;
            }
            return fromlistArrIAuthTabCallback;
        }

        public final fromList onExtraCallbackWithResult(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
            fromList fromlist = new fromList(makeNativeArray.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
            int i2 = IAuthTabCallback + 109;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return fromlist;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onWarmupCompleted + 59;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public fromList() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 93;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 92 / 0;
        }
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 67;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof fromList)) {
            int i4 = onExtraCallback + 81;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.type == ((fromList) obj).type && !(!Intrinsics.areEqual(this.id, r6.id))) {
            if (!(!Intrinsics.areEqual(this.url, r6.url))) {
                int i6 = onNavigationEvent + 7;
                onExtraCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    return true;
                }
                throw null;
            }
            int i7 = onExtraCallback + 45;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.type.hashCode() * 31) + this.id.hashCode()) * 31) + this.url.hashCode();
        int i4 = onExtraCallback + 87;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "JumpToSchemeAction(type=" + this.type + ", id=" + this.id + ", url=" + this.url + ")";
        int i2 = onNavigationEvent + 69;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 35 / 0;
        }
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 41;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
        if (i4 != 0) {
            parcel.writeString(this.type.name());
            parcel.writeString(this.id);
            parcel.writeString(this.url);
            int i5 = 60 / 0;
        } else {
            parcel.writeString(this.type.name());
            parcel.writeString(this.id);
            parcel.writeString(this.url);
        }
        int i6 = onExtraCallback + 75;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public fromList(@NotNull makeNativeArray makenativearray, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(makenativearray, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        this.type = makenativearray;
        this.id = str;
        this.url = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ fromList(makeNativeArray makenativearray, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 125;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            makenativearray = makeNativeArray.JUMP_TO_SCHEME;
            int i4 = onNavigationEvent + 27;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        }
        if ((i & 2) != 0) {
            int i6 = onNavigationEvent + 51;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            str = BuildConfig.FLAVOR;
        }
        this(makenativearray, str, (i & 4) != 0 ? BuildConfig.FLAVOR : str2);
    }
}
