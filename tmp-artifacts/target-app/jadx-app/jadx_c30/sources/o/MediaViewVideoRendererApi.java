package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.bouncycastle.pqc.crypto.rainbow.util.GF2Field;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class MediaViewVideoRendererApi implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<MediaViewVideoRendererApi> CREATOR = new onNavigationEvent();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    @SerializedName("agreed")
    private final boolean agreed;

    @SerializedName("contentsUrl")
    private final String contentsUrl;

    @SerializedName("isOneTimeConsent")
    private final boolean isOneTimeConsent;

    @SerializedName("lastUpdateTime")
    private final String lastUpdateTime;

    @SerializedName("serviceTermsGroupId")
    private final long serviceTermsGroupId;

    @SerializedName("serviceTermsGroupTitle")
    private final String serviceTermsGroupTitle;

    @SerializedName("termsId")
    private final long termsId;

    @SerializedName("title")
    private final String title;

    public static final class onNavigationEvent implements Parcelable.Creator<MediaViewVideoRendererApi> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public final MediaViewVideoRendererApi IAuthTabCallback(Parcel parcel) {
            boolean z;
            boolean z2;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
            long j = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i2 = IAuthTabCallback + 49;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                z = true;
            } else {
                z = false;
            }
            String string3 = parcel.readString();
            long j2 = parcel.readLong();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i4 = onNavigationEvent + 29;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                z2 = false;
            } else {
                z2 = true;
            }
            return new MediaViewVideoRendererApi(j, string, string2, z, string3, j2, string4, z2);
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ MediaViewVideoRendererApi createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 25;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                IAuthTabCallback(parcel);
                throw null;
            }
            MediaViewVideoRendererApi mediaViewVideoRendererApiIAuthTabCallback = IAuthTabCallback(parcel);
            int i3 = IAuthTabCallback + 25;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return mediaViewVideoRendererApiIAuthTabCallback;
            }
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ MediaViewVideoRendererApi[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 103;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            MediaViewVideoRendererApi[] mediaViewVideoRendererApiArrOnNavigationEvent = onNavigationEvent(i);
            int i5 = IAuthTabCallback + 15;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return mediaViewVideoRendererApiArrOnNavigationEvent;
        }

        public final MediaViewVideoRendererApi[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 59;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            int i5 = i3 % 2;
            MediaViewVideoRendererApi[] mediaViewVideoRendererApiArr = new MediaViewVideoRendererApi[i];
            int i6 = i4 + 107;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                return mediaViewVideoRendererApiArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = IAuthTabCallback + 53;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public MediaViewVideoRendererApi() {
        this(0L, null, null, false, null, 0L, null, false, GF2Field.MASK, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 43;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 3;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaViewVideoRendererApi)) {
            int i2 = onExtraCallbackWithResult + 75;
            onNavigationEvent = i2 % 128;
            return i2 % 2 != 0;
        }
        MediaViewVideoRendererApi mediaViewVideoRendererApi = (MediaViewVideoRendererApi) obj;
        if (this.termsId != mediaViewVideoRendererApi.termsId) {
            int i3 = onNavigationEvent + 79;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.title, mediaViewVideoRendererApi.title)) {
            int i5 = onNavigationEvent + 79;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.contentsUrl, mediaViewVideoRendererApi.contentsUrl)) {
            return false;
        }
        if (this.agreed == mediaViewVideoRendererApi.agreed) {
            if (!Intrinsics.areEqual(this.lastUpdateTime, mediaViewVideoRendererApi.lastUpdateTime)) {
                return false;
            }
            if (this.serviceTermsGroupId == mediaViewVideoRendererApi.serviceTermsGroupId) {
                return Intrinsics.areEqual(this.serviceTermsGroupTitle, mediaViewVideoRendererApi.serviceTermsGroupTitle) && this.isOneTimeConsent == mediaViewVideoRendererApi.isOneTimeConsent;
            }
            int i7 = onNavigationEvent + 47;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        int i9 = onNavigationEvent;
        int i10 = i9 + 9;
        onExtraCallbackWithResult = i10 % 128;
        int i11 = i10 % 2;
        int i12 = i9 + 85;
        onExtraCallbackWithResult = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 65 / 0;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = Long.hashCode(this.termsId);
        String str = this.title;
        int iHashCode4 = 0;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.contentsUrl;
        if (str2 == null) {
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
            int i2 = onNavigationEvent + 81;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
        }
        int iHashCode6 = Boolean.hashCode(this.agreed);
        String str3 = this.lastUpdateTime;
        if (str3 == null) {
            int i4 = onExtraCallbackWithResult + 115;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str3.hashCode();
        }
        int iHashCode7 = Long.hashCode(this.serviceTermsGroupId);
        String str4 = this.serviceTermsGroupTitle;
        if (str4 != null) {
            int i6 = onExtraCallbackWithResult + 3;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            iHashCode4 = str4.hashCode();
        }
        return (((((((((((((iHashCode3 * 31) + iHashCode5) * 31) + iHashCode) * 31) + iHashCode6) * 31) + iHashCode2) * 31) + iHashCode7) * 31) + iHashCode4) * 31) + Boolean.hashCode(this.isOneTimeConsent);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardTerm(termsId=" + this.termsId + ", title=" + this.title + ", contentsUrl=" + this.contentsUrl + ", agreed=" + this.agreed + ", lastUpdateTime=" + this.lastUpdateTime + ", serviceTermsGroupId=" + this.serviceTermsGroupId + ", serviceTermsGroupTitle=" + this.serviceTermsGroupTitle + ", isOneTimeConsent=" + this.isOneTimeConsent + ")";
        int i2 = onNavigationEvent + 27;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
        parcel.writeLong(this.termsId);
        parcel.writeString(this.title);
        parcel.writeString(this.contentsUrl);
        parcel.writeInt(this.agreed ? 1 : 0);
        parcel.writeString(this.lastUpdateTime);
        parcel.writeLong(this.serviceTermsGroupId);
        parcel.writeString(this.serviceTermsGroupTitle);
        parcel.writeInt(this.isOneTimeConsent ? 1 : 0);
        int i5 = onNavigationEvent + 97;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public MediaViewVideoRendererApi(long j, @Nullable String str, @Nullable String str2, boolean z, @Nullable String str3, long j2, @Nullable String str4, boolean z2) {
        this.termsId = j;
        this.title = str;
        this.contentsUrl = str2;
        this.agreed = z;
        this.lastUpdateTime = str3;
        this.serviceTermsGroupId = j2;
        this.serviceTermsGroupTitle = str4;
        this.isOneTimeConsent = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MediaViewVideoRendererApi(long j, String str, String str2, boolean z, String str3, long j2, String str4, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long j3;
        String str5;
        long j4 = 0;
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            j3 = 0;
        } else {
            j3 = j;
        }
        String str6 = null;
        if ((i & 2) != 0) {
            int i3 = onNavigationEvent + 13;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            str5 = null;
        } else {
            str5 = str;
        }
        String str7 = (i & 4) != 0 ? null : str2;
        boolean z3 = (i & 8) != 0 ? false : z;
        String str8 = (i & 16) != 0 ? BuildConfig.FLAVOR : str3;
        if ((i & 32) != 0) {
            int i5 = onExtraCallbackWithResult + 55;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        } else {
            j4 = j2;
        }
        if ((i & 64) != 0) {
            int i7 = onExtraCallbackWithResult + 3;
            int i8 = i7 % 128;
            onNavigationEvent = i8;
            int i9 = i7 % 2;
            int i10 = i8 + 63;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 2 % 2;
        } else {
            str6 = str4;
        }
        this(j3, str5, str7, z3, str8, j4, str6, (i & 128) == 0 ? z2 : false);
    }
}
