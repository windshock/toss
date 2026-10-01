package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class BufferedDiskCacheExternalSyntheticLambda2 implements Parcelable {
    public static final Parcelable.Creator<BufferedDiskCacheExternalSyntheticLambda2> CREATOR = new onExtraCallback();
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    @SerializedName("ctaTitle")
    private final String ctaTitle;

    @SerializedName("landingType")
    private String landingType;

    @SerializedName("landingUrl")
    private String landingUrl;

    @SerializedName("showCta")
    private final boolean showCta;

    @SerializedName("transitionPopup")
    private final BytesRangeExternalSyntheticLambda0 transitionPopup;

    public static final class onExtraCallback implements Parcelable.Creator<BufferedDiskCacheExternalSyntheticLambda2> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public final BufferedDiskCacheExternalSyntheticLambda2 IAuthTabCallback(Parcel parcel) {
            boolean z;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 113;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i4 = onNavigationEvent + 87;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            } else {
                int i6 = onNavigationEvent + 107;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                z = false;
            }
            return new BufferedDiskCacheExternalSyntheticLambda2(string, string2, z, parcel.readString(), (BytesRangeExternalSyntheticLambda0) BytesRangeExternalSyntheticLambda0.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ BufferedDiskCacheExternalSyntheticLambda2 createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 69;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            BufferedDiskCacheExternalSyntheticLambda2 bufferedDiskCacheExternalSyntheticLambda2IAuthTabCallback = IAuthTabCallback(parcel);
            if (i3 == 0) {
                int i4 = 87 / 0;
            }
            return bufferedDiskCacheExternalSyntheticLambda2IAuthTabCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ BufferedDiskCacheExternalSyntheticLambda2[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 113;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                return onExtraCallbackWithResult(i);
            }
            onExtraCallbackWithResult(i);
            throw null;
        }

        public final BufferedDiskCacheExternalSyntheticLambda2[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult;
            int i4 = i3 + 119;
            onNavigationEvent = i4 % 128;
            BufferedDiskCacheExternalSyntheticLambda2[] bufferedDiskCacheExternalSyntheticLambda2Arr = new BufferedDiskCacheExternalSyntheticLambda2[i];
            if (i4 % 2 != 0) {
                throw null;
            }
            int i5 = i3 + 29;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return bufferedDiskCacheExternalSyntheticLambda2Arr;
            }
            throw null;
        }
    }

    static {
        int i = onWarmupCompleted + 87;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public BufferedDiskCacheExternalSyntheticLambda2() {
        this(null, null, false, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 87;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 93;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BufferedDiskCacheExternalSyntheticLambda2)) {
            int i5 = i3 + 29;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        BufferedDiskCacheExternalSyntheticLambda2 bufferedDiskCacheExternalSyntheticLambda2 = (BufferedDiskCacheExternalSyntheticLambda2) obj;
        if (!Intrinsics.areEqual(this.landingType, bufferedDiskCacheExternalSyntheticLambda2.landingType)) {
            int i7 = onExtraCallbackWithResult + 35;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.landingUrl, bufferedDiskCacheExternalSyntheticLambda2.landingUrl)) {
            int i9 = onExtraCallbackWithResult + 39;
            onNavigationEvent = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 4 / 0;
            }
            return false;
        }
        if (this.showCta != bufferedDiskCacheExternalSyntheticLambda2.showCta) {
            int i11 = onNavigationEvent + 3;
            onExtraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.ctaTitle, bufferedDiskCacheExternalSyntheticLambda2.ctaTitle)) {
            int i13 = onNavigationEvent + 17;
            onExtraCallbackWithResult = i13 % 128;
            int i14 = i13 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.transitionPopup, bufferedDiskCacheExternalSyntheticLambda2.transitionPopup)) {
            return false;
        }
        int i15 = onExtraCallbackWithResult + 89;
        onNavigationEvent = i15 % 128;
        int i16 = i15 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.landingType.hashCode() * 31) + this.landingUrl.hashCode()) * 31) + Boolean.hashCode(this.showCta)) * 31) + this.ctaTitle.hashCode()) * 31) + this.transitionPopup.hashCode();
        int i4 = onExtraCallbackWithResult + 11;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ApplyLanding(landingType=" + this.landingType + ", landingUrl=" + this.landingUrl + ", showCta=" + this.showCta + ", ctaTitle=" + this.ctaTitle + ", transitionPopup=" + this.transitionPopup + ")";
        int i2 = onExtraCallbackWithResult + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 3;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
        parcel.writeString(this.landingType);
        parcel.writeString(this.landingUrl);
        parcel.writeInt(this.showCta ? 1 : 0);
        parcel.writeString(this.ctaTitle);
        this.transitionPopup.writeToParcel(parcel, i);
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public BufferedDiskCacheExternalSyntheticLambda2(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, @NotNull BytesRangeExternalSyntheticLambda0 bytesRangeExternalSyntheticLambda0) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str3, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(bytesRangeExternalSyntheticLambda0, BuildConfig.FLAVOR);
        this.landingType = str;
        this.landingUrl = str2;
        this.showCta = z;
        this.ctaTitle = str3;
        this.transitionPopup = bytesRangeExternalSyntheticLambda0;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BufferedDiskCacheExternalSyntheticLambda2(String str, String str2, boolean z, String str3, BytesRangeExternalSyntheticLambda0 bytesRangeExternalSyntheticLambda0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str4;
        boolean z2;
        int i2 = i & 1;
        String str5 = BuildConfig.FLAVOR;
        String str6 = i2 != 0 ? BuildConfig.FLAVOR : str;
        if ((i & 2) != 0) {
            int i3 = onNavigationEvent + 37;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 18 / 0;
            }
            int i5 = 2 % 2;
            str4 = BuildConfig.FLAVOR;
        } else {
            str4 = str2;
        }
        if ((i & 4) != 0) {
            int i6 = 2 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i & 8) != 0) {
            int i7 = onNavigationEvent + 99;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 17 / 0;
            }
            int i9 = 2 % 2;
        } else {
            str5 = str3;
        }
        this(str6, str4, z2, str5, (i & 16) != 0 ? new BytesRangeExternalSyntheticLambda0((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : bytesRangeExternalSyntheticLambda0);
    }
}
