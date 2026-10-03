package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class createNativeAdBaseFromBidPayload implements createNativeAdRatingApi {
    public static final Parcelable.Creator<createNativeAdBaseFromBidPayload> CREATOR = new onExtraCallbackWithResult();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    private final createAdSizeApi action;
    private final boolean arrow;
    private final String key;
    private final IAuthTabCallback leftIcon;
    private final String title;
    private final String type;

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<createNativeAdBaseFromBidPayload> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final createNativeAdBaseFromBidPayload[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 95;
            onExtraCallbackWithResult = i3 % 128;
            createNativeAdBaseFromBidPayload[] createnativeadbasefrombidpayloadArr = new createNativeAdBaseFromBidPayload[i];
            if (i3 % 2 == 0) {
                int i4 = 52 / 0;
            }
            return createnativeadbasefrombidpayloadArr;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createNativeAdBaseFromBidPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 49;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            createNativeAdBaseFromBidPayload createnativeadbasefrombidpayloadOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
            int i4 = onExtraCallbackWithResult + 1;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return createnativeadbasefrombidpayloadOnExtraCallbackWithResult;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createNativeAdBaseFromBidPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 33;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                IAuthTabCallback(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            createNativeAdBaseFromBidPayload[] createnativeadbasefrombidpayloadArrIAuthTabCallback = IAuthTabCallback(i);
            int i4 = onExtraCallback + 39;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return createnativeadbasefrombidpayloadArrIAuthTabCallback;
        }

        public final createNativeAdBaseFromBidPayload onExtraCallbackWithResult(Parcel parcel) {
            IAuthTabCallback iAuthTabCallbackCreateFromParcel;
            boolean z;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i2 = onExtraCallback + 3;
                onExtraCallbackWithResult = i2 % 128;
                iAuthTabCallbackCreateFromParcel = null;
                if (i2 % 2 == 0) {
                    iAuthTabCallbackCreateFromParcel.hashCode();
                    throw null;
                }
            } else {
                iAuthTabCallbackCreateFromParcel = IAuthTabCallback.CREATOR.createFromParcel(parcel);
            }
            IAuthTabCallback iAuthTabCallback = iAuthTabCallbackCreateFromParcel;
            if (parcel.readInt() != 0) {
                int i3 = onExtraCallback + 71;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                z = true;
            } else {
                z = false;
            }
            return new createNativeAdBaseFromBidPayload(string, string2, string3, iAuthTabCallback, z, (createAdSizeApi) parcel.readParcelable(createNativeAdBaseFromBidPayload.class.getClassLoader()));
        }
    }

    static {
        int i = onWarmupCompleted + 99;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 107;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 61;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 65;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof createNativeAdBaseFromBidPayload)) {
            int i4 = onExtraCallbackWithResult + 9;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        createNativeAdBaseFromBidPayload createnativeadbasefrombidpayload = (createNativeAdBaseFromBidPayload) obj;
        if (!Intrinsics.areEqual(this.key, createnativeadbasefrombidpayload.key)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.type, createnativeadbasefrombidpayload.type)) {
            int i6 = onExtraCallbackWithResult + 29;
            onExtraCallback = i6 % 128;
            return i6 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.title, createnativeadbasefrombidpayload.title)) {
            int i7 = onExtraCallbackWithResult + 83;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.leftIcon, createnativeadbasefrombidpayload.leftIcon)) {
            int i9 = onExtraCallbackWithResult + 27;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (this.arrow != createnativeadbasefrombidpayload.arrow) {
            return false;
        }
        if (Intrinsics.areEqual(this.action, createnativeadbasefrombidpayload.action)) {
            return true;
        }
        int i11 = onExtraCallbackWithResult + 101;
        onExtraCallback = i11 % 128;
        return i11 % 2 == 0;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.key.hashCode();
        int iHashCode3 = this.type.hashCode();
        int iHashCode4 = this.title.hashCode();
        IAuthTabCallback iAuthTabCallback = this.leftIcon;
        if (iAuthTabCallback == null) {
            int i2 = onExtraCallback + 123;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = iAuthTabCallback.hashCode();
        }
        int iHashCode5 = Boolean.hashCode(this.arrow);
        createAdSizeApi createadsizeapi = this.action;
        int iHashCode6 = (((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode5) * 31) + (createadsizeapi != null ? createadsizeapi.hashCode() : 0);
        int i4 = onExtraCallback + 61;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode6;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ListRowField(key=" + this.key + ", type=" + this.type + ", title=" + this.title + ", leftIcon=" + this.leftIcon + ", arrow=" + this.arrow + ", action=" + this.action + ")";
        int i2 = onExtraCallbackWithResult + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 29;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i4 != 0) {
            parcel.writeString(this.key);
            parcel.writeString(this.type);
            parcel.writeString(this.title);
            throw null;
        }
        parcel.writeString(this.key);
        parcel.writeString(this.type);
        parcel.writeString(this.title);
        IAuthTabCallback iAuthTabCallback = this.leftIcon;
        if (iAuthTabCallback == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iAuthTabCallback.writeToParcel(parcel, i);
            int i5 = onExtraCallbackWithResult + 11;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        parcel.writeInt(this.arrow ? 1 : 0);
        parcel.writeParcelable(this.action, i);
    }

    public createNativeAdBaseFromBidPayload(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable IAuthTabCallback iAuthTabCallback, boolean z, @Nullable createAdSizeApi createadsizeapi) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.key = str;
        this.type = str2;
        this.title = str3;
        this.leftIcon = iAuthTabCallback;
        this.arrow = z;
        this.action = createadsizeapi;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 111;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final IAuthTabCallback onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback iAuthTabCallback = this.leftIcon;
        if (i3 == 0) {
            int i4 = 60 / 0;
        }
        return iAuthTabCallback;
    }

    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 121;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        boolean z = this.arrow;
        int i4 = i2 + 81;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 50 / 0;
        }
        return z;
    }

    public final createAdSizeApi IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        createAdSizeApi createadsizeapi = this.action;
        int i5 = i3 + 9;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return createadsizeapi;
    }

    public static final class IAuthTabCallback implements Parcelable {
        public static final Parcelable.Creator<IAuthTabCallback> CREATOR = new onNavigationEvent();
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final String url;

        public static final class onNavigationEvent implements Parcelable.Creator<IAuthTabCallback> {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final IAuthTabCallback[] IAuthTabCallback(int i) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 99;
                onExtraCallback = i3 % 128;
                IAuthTabCallback[] iAuthTabCallbackArr = new IAuthTabCallback[i];
                if (i3 % 2 == 0) {
                    return iAuthTabCallbackArr;
                }
                throw null;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ IAuthTabCallback createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 39;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return onWarmupCompleted(parcel);
                }
                onWarmupCompleted(parcel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ IAuthTabCallback[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 17;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    IAuthTabCallback(i);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                IAuthTabCallback[] iAuthTabCallbackArrIAuthTabCallback = IAuthTabCallback(i);
                int i4 = onExtraCallback + 51;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return iAuthTabCallbackArrIAuthTabCallback;
            }

            public final IAuthTabCallback onWarmupCompleted(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(parcel.readString());
                int i2 = IAuthTabCallback + 63;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return iAuthTabCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        static {
            int i = onNavigationEvent + 125;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public IAuthTabCallback() {
            String str = null;
            this(str, 1, str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 9;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 65;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 83;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            if (this == obj) {
                int i5 = i3 + 67;
                onExtraCallbackWithResult = i5 % 128;
                return i5 % 2 == 0;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                int i6 = i3 + 51;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.url, ((IAuthTabCallback) obj).url)) {
                return true;
            }
            int i8 = IAuthTabCallback + 5;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 119;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            String str = this.url;
            if (i3 == 0) {
                return str.hashCode();
            }
            str.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ListRowLeftIcon(url=" + this.url + ")";
            int i2 = onExtraCallbackWithResult + 43;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 53;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.url);
            int i5 = IAuthTabCallback + 97;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
        }

        public IAuthTabCallback(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ IAuthTabCallback(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onExtraCallbackWithResult + 123;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i3 = 2 % 2;
                str = "";
            }
            this(str);
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 51;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return this.url;
            }
            throw null;
        }
    }
}
