package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.toCircle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class NativeJpegTranscoder implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<NativeJpegTranscoder> CREATOR = new onExtraCallback();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;

    @SerializedName("designCode")
    private toCircle.IAuthTabCallback designCode;

    @SerializedName("driveLicenseNo")
    private String driveLicenseNo;

    @SerializedName("englishFirstName")
    private String englishFirstName;

    @SerializedName("englishLastName")
    private String englishLastName;

    @SerializedName("identificationIssueName")
    private String identificationIssueName;

    @SerializedName("identificationNo")
    private String identificationNo;

    @SerializedName("identificationPathCode")
    private String identificationPathCode;

    @SerializedName("name")
    private String name;

    @SerializedName("ocr")
    private Boolean ocr;

    @SerializedName("rrn")
    private String rrn;

    @SerializedName("traffic")
    private Boolean traffic;

    public static final class onExtraCallback implements Parcelable.Creator<NativeJpegTranscoder> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ NativeJpegTranscoder createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 109;
            IAuthTabCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                onWarmupCompleted(parcel);
                obj.hashCode();
                throw null;
            }
            NativeJpegTranscoder nativeJpegTranscoderOnWarmupCompleted = onWarmupCompleted(parcel);
            int i3 = IAuthTabCallback + 21;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                return nativeJpegTranscoderOnWarmupCompleted;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ NativeJpegTranscoder[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 69;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            NativeJpegTranscoder[] nativeJpegTranscoderArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            int i5 = onNavigationEvent + 43;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return nativeJpegTranscoderArrOnExtraCallbackWithResult;
            }
            throw null;
        }

        public final NativeJpegTranscoder[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback;
            int i4 = i3 + 99;
            onNavigationEvent = i4 % 128;
            NativeJpegTranscoder[] nativeJpegTranscoderArr = new NativeJpegTranscoder[i];
            if (i4 % 2 != 0) {
                int i5 = 30 / 0;
            }
            int i6 = i3 + 1;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                return nativeJpegTranscoderArr;
            }
            throw null;
        }

        public final NativeJpegTranscoder onWarmupCompleted(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            toCircle.IAuthTabCallback iAuthTabCallback = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                int i2 = onNavigationEvent + 95;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                int i3 = onNavigationEvent + 81;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    toCircle.IAuthTabCallback.valueOf(parcel.readString());
                    iAuthTabCallback.hashCode();
                    throw null;
                }
                toCircle.IAuthTabCallback iAuthTabCallbackValueOf = toCircle.IAuthTabCallback.valueOf(parcel.readString());
                int i4 = IAuthTabCallback + 117;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                iAuthTabCallback = iAuthTabCallbackValueOf;
            }
            return new NativeJpegTranscoder(string, string2, string3, string4, string5, string6, string7, boolValueOf, boolValueOf2, iAuthTabCallback, parcel.readString());
        }
    }

    static {
        int i = onExtraCallback + 51;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public NativeJpegTranscoder() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 9;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NativeJpegTranscoder)) {
            return false;
        }
        NativeJpegTranscoder nativeJpegTranscoder = (NativeJpegTranscoder) obj;
        if (!Intrinsics.areEqual(this.name, nativeJpegTranscoder.name)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.englishFirstName, nativeJpegTranscoder.englishFirstName)) {
            int i2 = onExtraCallbackWithResult + 37;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.englishLastName, nativeJpegTranscoder.englishLastName)) {
            int i4 = IAuthTabCallback + 77;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.identificationPathCode, nativeJpegTranscoder.identificationPathCode)) {
            int i6 = onExtraCallbackWithResult + 61;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.identificationNo, nativeJpegTranscoder.identificationNo)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.driveLicenseNo, nativeJpegTranscoder.driveLicenseNo)) {
            int i8 = onExtraCallbackWithResult + 53;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.identificationIssueName, nativeJpegTranscoder.identificationIssueName) || !Intrinsics.areEqual(this.traffic, nativeJpegTranscoder.traffic)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.ocr, nativeJpegTranscoder.ocr)) {
            int i10 = onExtraCallbackWithResult + 55;
            IAuthTabCallback = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 69 / 0;
            }
            return false;
        }
        if (this.designCode != nativeJpegTranscoder.designCode) {
            return false;
        }
        if (Intrinsics.areEqual(this.rrn, nativeJpegTranscoder.rrn)) {
            return true;
        }
        int i12 = onExtraCallbackWithResult + 43;
        IAuthTabCallback = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode3 = this.name.hashCode();
        String str = this.englishFirstName;
        if (str == null) {
            int i4 = IAuthTabCallback + 41;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.englishLastName;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.identificationPathCode;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.identificationNo;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.driveLicenseNo;
        int iHashCode7 = 1;
        if (str5 == null) {
            int i6 = IAuthTabCallback + 39;
            onExtraCallbackWithResult = i6 % 128;
            iHashCode2 = i6 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode2 = str5.hashCode();
        }
        String str6 = this.identificationIssueName;
        int iHashCode8 = str6 == null ? 0 : str6.hashCode();
        Boolean bool = this.traffic;
        if (bool == null) {
            int i7 = IAuthTabCallback + 93;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                iHashCode7 = 0;
            }
        } else {
            iHashCode7 = bool.hashCode();
        }
        Boolean bool2 = this.ocr;
        int iHashCode9 = bool2 == null ? 0 : bool2.hashCode();
        toCircle.IAuthTabCallback iAuthTabCallback = this.designCode;
        int iHashCode10 = iAuthTabCallback == null ? 0 : iAuthTabCallback.hashCode();
        String str7 = this.rrn;
        return (((((((((((((((((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode2) * 31) + iHashCode8) * 31) + iHashCode7) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PlccAuditIdCheckReq(name=" + this.name + ", englishFirstName=" + this.englishFirstName + ", englishLastName=" + this.englishLastName + ", identificationPathCode=" + this.identificationPathCode + ", identificationNo=" + this.identificationNo + ", driveLicenseNo=" + this.driveLicenseNo + ", identificationIssueName=" + this.identificationIssueName + ", traffic=" + this.traffic + ", ocr=" + this.ocr + ", designCode=" + this.designCode + ", rrn=" + this.rrn + ")";
        int i2 = IAuthTabCallback + 107;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
        parcel.writeString(this.name);
        parcel.writeString(this.englishFirstName);
        parcel.writeString(this.englishLastName);
        parcel.writeString(this.identificationPathCode);
        parcel.writeString(this.identificationNo);
        parcel.writeString(this.driveLicenseNo);
        parcel.writeString(this.identificationIssueName);
        Boolean bool = this.traffic;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
            int i3 = IAuthTabCallback + 63;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
        }
        Boolean bool2 = this.ocr;
        if (bool2 == null) {
            int i5 = onExtraCallbackWithResult + 75;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                parcel.writeInt(1);
            } else {
                parcel.writeInt(0);
            }
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
            int i6 = IAuthTabCallback + 67;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        }
        toCircle.IAuthTabCallback iAuthTabCallback = this.designCode;
        if (iAuthTabCallback == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(iAuthTabCallback.name());
        }
        parcel.writeString(this.rrn);
    }

    public NativeJpegTranscoder(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable toCircle.IAuthTabCallback iAuthTabCallback, @Nullable String str8) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        this.name = str;
        this.englishFirstName = str2;
        this.englishLastName = str3;
        this.identificationPathCode = str4;
        this.identificationNo = str5;
        this.driveLicenseNo = str6;
        this.identificationIssueName = str7;
        this.traffic = bool;
        this.ocr = bool2;
        this.designCode = iAuthTabCallback;
        this.rrn = str8;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NativeJpegTranscoder(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, toCircle.IAuthTabCallback iAuthTabCallback, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String strOnPostMessage;
        String str9;
        if ((i & 1) != 0) {
            strOnPostMessage = PlayerErrorCode.onPostMessage();
            int i2 = 2 % 2;
        } else {
            strOnPostMessage = str;
        }
        String str10 = null;
        String str11 = (i & 2) != 0 ? null : str2;
        String str12 = (i & 4) != 0 ? null : str3;
        String str13 = (i & 8) != 0 ? null : str4;
        if ((i & 16) != 0) {
            int i3 = IAuthTabCallback + 35;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            str9 = null;
        } else {
            str9 = str5;
        }
        String str14 = (i & 32) != 0 ? null : str6;
        String str15 = (i & 64) != 0 ? null : str7;
        Boolean bool3 = (i & 128) != 0 ? null : bool;
        Boolean bool4 = (i & 256) != 0 ? null : bool2;
        toCircle.IAuthTabCallback iAuthTabCallback2 = (i & 512) != 0 ? null : iAuthTabCallback;
        if ((i & 1024) != 0) {
            int i6 = onExtraCallbackWithResult + 41;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        } else {
            str10 = str8;
        }
        this(strOnPostMessage, str11, str12, str13, str9, str14, str15, bool3, bool4, iAuthTabCallback2, str10);
    }
}
