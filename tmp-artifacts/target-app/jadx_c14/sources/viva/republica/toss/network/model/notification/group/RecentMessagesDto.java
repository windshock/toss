package viva.republica.toss.network.model.notification.group;

import android.os.Parcel;
import android.os.Parcelable;
import im.toss.features.home.core.ui.compose.dst.HomeAssetSubCategoryHeaderKt$;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.MultiLineString;
import o.MultiPoint;
import o.MultiPolygon;
import o.getLatitude;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RecentMessagesDto implements Parcelable {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final String company;
    private final String contentId;
    private final String contentReachType;
    private final String contentType;
    private final String iconUri;
    private final boolean isSimilarBlock;
    private final String linkUri;
    private final String message;
    private final long messagePlanNo;
    private final String reachTs;
    private final boolean reached;
    private final boolean read;
    private final long serviceId;
    private final long templateNo;
    private final long templateSetNo;
    private final long termsId;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<RecentMessagesDto> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<RecentMessagesDto> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public final RecentMessagesDto[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 45;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            int i5 = i3 % 2;
            RecentMessagesDto[] recentMessagesDtoArr = new RecentMessagesDto[i];
            int i6 = i4 + 101;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return recentMessagesDtoArr;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RecentMessagesDto createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 69;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return onExtraCallbackWithResult(parcel);
            }
            onExtraCallbackWithResult(parcel);
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RecentMessagesDto[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 67;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                IAuthTabCallback(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            RecentMessagesDto[] recentMessagesDtoArrIAuthTabCallback = IAuthTabCallback(i);
            int i4 = onWarmupCompleted + 35;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return recentMessagesDtoArrIAuthTabCallback;
        }

        public final RecentMessagesDto onExtraCallbackWithResult(Parcel parcel) {
            boolean z;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 107;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            long j = parcel.readLong();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            long j2 = parcel.readLong();
            long j3 = parcel.readLong();
            if (parcel.readInt() != 0) {
                int i4 = IAuthTabCallback + 37;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            } else {
                z = false;
            }
            return new RecentMessagesDto(string, string2, j, string3, string4, j2, j3, z, !(parcel.readInt() == 0), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }
    }

    static {
        int i = onNavigationEvent + 3;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public RecentMessagesDto() {
        this((String) null, (String) null, 0L, (String) null, (String) null, 0L, 0L, false, false, 0L, 0L, (String) null, (String) null, (String) null, (String) null, (String) null, false, 131071, (DefaultConstructorMarker) null);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        String str;
        long j;
        long j2;
        long j3;
        String str2;
        RecentMessagesDto recentMessagesDto = (RecentMessagesDto) objArr[0];
        String str3 = (String) objArr[1];
        String str4 = (String) objArr[2];
        long jLongValue = ((Number) objArr[3]).longValue();
        String str5 = (String) objArr[4];
        String str6 = (String) objArr[5];
        long jLongValue2 = ((Number) objArr[6]).longValue();
        long jLongValue3 = ((Number) objArr[7]).longValue();
        boolean zBooleanValue = ((Boolean) objArr[8]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[9]).booleanValue();
        long jLongValue4 = ((Number) objArr[10]).longValue();
        long jLongValue5 = ((Number) objArr[11]).longValue();
        String str7 = (String) objArr[12];
        String str8 = (String) objArr[13];
        String str9 = (String) objArr[14];
        String str10 = (String) objArr[15];
        String str11 = (String) objArr[16];
        boolean zBooleanValue3 = ((Boolean) objArr[17]).booleanValue();
        int iIntValue = ((Number) objArr[18]).intValue();
        Object obj = objArr[19];
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 109;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = iIntValue & 1;
        if (i3 % 2 == 0 ? i4 == 0 : i4 == 0) {
            str = str3;
        } else {
            int i5 = i2 + 87;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            str = recentMessagesDto.contentId;
        }
        if ((iIntValue & 2) != 0) {
            int i7 = i2 + 83;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            str4 = recentMessagesDto.contentType;
        }
        Object obj2 = null;
        if ((iIntValue & 4) != 0) {
            int i9 = i2 + 73;
            onExtraCallbackWithResult = i9 % 128;
            if (i9 % 2 != 0) {
                long j4 = recentMessagesDto.templateSetNo;
                throw null;
            }
            jLongValue = recentMessagesDto.templateSetNo;
        }
        String str12 = (iIntValue & 8) != 0 ? recentMessagesDto.title : str5;
        String str13 = (iIntValue & 16) != 0 ? recentMessagesDto.message : str6;
        if ((iIntValue & 32) != 0) {
            int i10 = onExtraCallbackWithResult + 93;
            onWarmupCompleted = i10 % 128;
            if (i10 % 2 == 0) {
                long j5 = recentMessagesDto.serviceId;
                throw null;
            }
            j = recentMessagesDto.serviceId;
        } else {
            j = jLongValue2;
        }
        if ((iIntValue & 64) != 0) {
            int i11 = onWarmupCompleted + 3;
            onExtraCallbackWithResult = i11 % 128;
            if (i11 % 2 != 0) {
                long j6 = recentMessagesDto.termsId;
                obj2.hashCode();
                throw null;
            }
            j2 = recentMessagesDto.termsId;
        } else {
            j2 = jLongValue3;
        }
        boolean z = (iIntValue & 128) != 0 ? recentMessagesDto.reached : zBooleanValue;
        boolean z2 = (iIntValue & 256) != 0 ? recentMessagesDto.read : zBooleanValue2;
        if ((iIntValue & 512) != 0) {
            long j7 = recentMessagesDto.templateNo;
            int i12 = onWarmupCompleted + 83;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
            j3 = j7;
        } else {
            j3 = jLongValue4;
        }
        long j8 = j3;
        long j9 = (iIntValue & 1024) != 0 ? recentMessagesDto.messagePlanNo : jLongValue5;
        String str14 = (iIntValue & 2048) != 0 ? recentMessagesDto.reachTs : str7;
        String str15 = (iIntValue & 4096) != 0 ? recentMessagesDto.linkUri : str8;
        String str16 = (iIntValue & 8192) != 0 ? recentMessagesDto.iconUri : str9;
        String str17 = (iIntValue & 16384) != 0 ? recentMessagesDto.contentReachType : str10;
        if ((32768 & iIntValue) != 0) {
            int i14 = onExtraCallbackWithResult + 37;
            onWarmupCompleted = i14 % 128;
            if (i14 % 2 == 0) {
                String str18 = recentMessagesDto.company;
                throw null;
            }
            str2 = recentMessagesDto.company;
        } else {
            str2 = str11;
        }
        return recentMessagesDto.onNavigationEvent(str, str4, jLongValue, str12, str13, j, j2, z, z2, j8, j9, str14, str15, str16, str17, str2, (iIntValue & 65536) != 0 ? recentMessagesDto.isSimilarBlock : zBooleanValue3);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        RecentMessagesDto recentMessagesDto = (RecentMessagesDto) objArr[0];
        Parcel parcel = (Parcel) objArr[1];
        ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(recentMessagesDto.contentId);
        parcel.writeString(recentMessagesDto.contentType);
        parcel.writeLong(recentMessagesDto.templateSetNo);
        parcel.writeString(recentMessagesDto.title);
        parcel.writeString(recentMessagesDto.message);
        parcel.writeLong(recentMessagesDto.serviceId);
        parcel.writeLong(recentMessagesDto.termsId);
        parcel.writeInt(recentMessagesDto.reached ? 1 : 0);
        parcel.writeInt(recentMessagesDto.read ? 1 : 0);
        parcel.writeLong(recentMessagesDto.templateNo);
        parcel.writeLong(recentMessagesDto.messagePlanNo);
        parcel.writeString(recentMessagesDto.reachTs);
        parcel.writeString(recentMessagesDto.linkUri);
        parcel.writeString(recentMessagesDto.iconUri);
        parcel.writeString(recentMessagesDto.contentReachType);
        parcel.writeString(recentMessagesDto.company);
        parcel.writeInt(recentMessagesDto.isSimilarBlock ? 1 : 0);
        int i4 = onWarmupCompleted + 19;
        onExtraCallbackWithResult = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 25;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 13;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 51 / 0;
        }
        return 0;
    }

    public static /* synthetic */ Object onNavigationEvent(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i2 | i | (~i4);
        int i8 = (~((~i2) | i)) | (~(i2 | i4));
        int i9 = (~(i4 | (~i))) | i2;
        int i10 = i2 + i + i5 + ((-1069702238) * i3) + (1645725337 * i6);
        int i11 = i10 * i10;
        int i12 = ((i2 * 2084108943) - 1824784384) + (2084108943 * i) + (i7 * (-929364622)) + (929364622 * i8) + ((-929364622) * i9) + (1154744320 * i5) + ((-1977090048) * i3) + (448004096 * i6) + (1807155200 * i11);
        int i13 = (i2 * (-999696423)) + 1136243370 + (i * (-999696423)) + (i7 * 830) + (i8 * (-830)) + (i9 * 830) + (i5 * (-999695593)) + (i3 * 636963214) + (i6 * (-1077364033)) + (i11 * 980484096);
        int i14 = i12 + (i13 * i13 * 1287192576);
        return i14 != 1 ? i14 != 2 ? IAuthTabCallback(objArr) : onExtraCallback(objArr) : onNavigationEvent(objArr);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentMessagesDto)) {
            return false;
        }
        RecentMessagesDto recentMessagesDto = (RecentMessagesDto) obj;
        if (!Intrinsics.areEqual(this.contentId, recentMessagesDto.contentId) || !Intrinsics.areEqual(this.contentType, recentMessagesDto.contentType) || this.templateSetNo != recentMessagesDto.templateSetNo || !Intrinsics.areEqual(this.title, recentMessagesDto.title)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.message, recentMessagesDto.message)) {
            int i2 = onWarmupCompleted + 1;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (this.serviceId != recentMessagesDto.serviceId) {
            return false;
        }
        if (this.termsId != recentMessagesDto.termsId) {
            int i4 = onWarmupCompleted + 111;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.reached != recentMessagesDto.reached || this.read != recentMessagesDto.read) {
            return false;
        }
        if (this.templateNo != recentMessagesDto.templateNo) {
            int i6 = onExtraCallbackWithResult + 113;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.messagePlanNo != recentMessagesDto.messagePlanNo) {
            return false;
        }
        if (!Intrinsics.areEqual(this.reachTs, recentMessagesDto.reachTs)) {
            int i8 = onWarmupCompleted + 115;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (!(!Intrinsics.areEqual(this.linkUri, recentMessagesDto.linkUri))) {
            if (!Intrinsics.areEqual(this.iconUri, recentMessagesDto.iconUri)) {
                int i9 = onExtraCallbackWithResult + 65;
                onWarmupCompleted = i9 % 128;
                return i9 % 2 == 0;
            }
            if (Intrinsics.areEqual(this.contentReachType, recentMessagesDto.contentReachType)) {
                return Intrinsics.areEqual(this.company, recentMessagesDto.company) && this.isSimilarBlock == recentMessagesDto.isSimilarBlock;
            }
            int i10 = onWarmupCompleted + 7;
            onExtraCallbackWithResult = i10 % 128;
            if (i10 % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int iHashCode;
        int i2;
        int i3 = 2 % 2;
        int iHashCode2 = this.contentId.hashCode();
        int iHashCode3 = this.contentType.hashCode();
        int iHashCode4 = Long.hashCode(this.templateSetNo);
        int iHashCode5 = this.title.hashCode();
        int iHashCode6 = this.message.hashCode();
        int iHashCode7 = Long.hashCode(this.serviceId);
        int iHashCode8 = Long.hashCode(this.termsId);
        int iHashCode9 = Boolean.hashCode(this.reached);
        int iHashCode10 = Boolean.hashCode(this.read);
        int iHashCode11 = Long.hashCode(this.templateNo);
        int iHashCode12 = Long.hashCode(this.messagePlanNo);
        String str = this.reachTs;
        int iHashCode13 = str == null ? 0 : str.hashCode();
        int iHashCode14 = this.linkUri.hashCode();
        String str2 = this.iconUri;
        int iHashCode15 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.contentReachType;
        if (str3 == null) {
            int i4 = onExtraCallbackWithResult + 97;
            i = iHashCode15;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            i = iHashCode15;
            iHashCode = str3.hashCode();
        }
        String str4 = this.company;
        if (str4 != null) {
            int iHashCode16 = str4.hashCode();
            int i6 = onWarmupCompleted + 15;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            i2 = iHashCode16;
        } else {
            i2 = 0;
        }
        return (((((((((((((((((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + i) * 31) + iHashCode) * 31) + i2) * 31) + Boolean.hashCode(this.isSimilarBlock);
    }

    public final RecentMessagesDto onNavigationEvent(@NotNull String str, @NotNull String str2, long j, @NotNull String str3, @NotNull String str4, long j2, long j3, boolean z, boolean z2, long j4, long j5, @Nullable String str5, @NotNull String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, boolean z3) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str6, "");
        RecentMessagesDto recentMessagesDto = new RecentMessagesDto(str, str2, j, str3, str4, j2, j3, z, z2, j4, j5, str5, str6, str7, str8, str9, z3);
        int i2 = onExtraCallbackWithResult + 11;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 81 / 0;
        }
        return recentMessagesDto;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RecentMessagesDto(contentId=" + this.contentId + ", contentType=" + this.contentType + ", templateSetNo=" + this.templateSetNo + ", title=" + this.title + ", message=" + this.message + ", serviceId=" + this.serviceId + ", termsId=" + this.termsId + ", reached=" + this.reached + ", read=" + this.read + ", templateNo=" + this.templateNo + ", messagePlanNo=" + this.messagePlanNo + ", reachTs=" + this.reachTs + ", linkUri=" + this.linkUri + ", iconUri=" + this.iconUri + ", contentReachType=" + this.contentReachType + ", company=" + this.company + ", isSimilarBlock=" + this.isSimilarBlock + ")";
        int i2 = onExtraCallbackWithResult + 59;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ RecentMessagesDto(int i, String str, String str2, long j, String str3, String str4, long j2, long j3, boolean z, boolean z2, long j4, long j5, String str5, String str6, String str7, String str8, String str9, boolean z3, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.contentId = "";
        } else {
            this.contentId = str;
        }
        if ((i & 2) == 0) {
            this.contentType = "";
        } else {
            this.contentType = str2;
        }
        if ((i & 4) == 0) {
            this.templateSetNo = -1L;
        } else {
            this.templateSetNo = j;
        }
        if ((i & 8) == 0) {
            int i2 = onWarmupCompleted + 109;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.title = "";
        } else {
            this.title = str3;
        }
        if ((i & 16) == 0) {
            int i4 = onExtraCallbackWithResult + 91;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            this.message = "";
        } else {
            this.message = str4;
        }
        if ((i & 32) == 0) {
            this.serviceId = -1L;
        } else {
            this.serviceId = j2;
        }
        if ((i & 64) == 0) {
            this.termsId = -1L;
            int i6 = onExtraCallbackWithResult + 1;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
        } else {
            this.termsId = j3;
        }
        int i8 = 2 % 2;
        if ((i & 128) == 0) {
            this.reached = false;
        } else {
            this.reached = z;
        }
        if ((i & 256) == 0) {
            this.read = false;
        } else {
            this.read = z2;
            int i9 = 2 % 2;
        }
        if ((i & 512) == 0) {
            this.templateNo = -1L;
        } else {
            this.templateNo = j4;
        }
        if ((i & 1024) == 0) {
            this.messagePlanNo = -1L;
        } else {
            this.messagePlanNo = j5;
            int i10 = 2 % 2;
        }
        if ((i & 2048) == 0) {
            int i11 = onWarmupCompleted + 123;
            onExtraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
            this.reachTs = null;
        } else {
            this.reachTs = str5;
        }
        if ((i & 4096) == 0) {
            this.linkUri = "";
        } else {
            this.linkUri = str6;
        }
        if ((i & 8192) == 0) {
            this.iconUri = null;
        } else {
            this.iconUri = str7;
        }
        if ((i & 16384) == 0) {
            int i13 = onWarmupCompleted + 99;
            onExtraCallbackWithResult = i13 % 128;
            int i14 = i13 % 2;
            this.contentReachType = null;
            int i15 = 2 % 2;
        } else {
            this.contentReachType = str8;
        }
        if ((32768 & i) == 0) {
            this.company = null;
        } else {
            this.company = str9;
        }
        if ((i & 65536) == 0) {
            this.isSimilarBlock = false;
        } else {
            this.isSimilarBlock = z3;
        }
    }

    public RecentMessagesDto(@NotNull String str, @NotNull String str2, long j, @NotNull String str3, @NotNull String str4, long j2, long j3, boolean z, boolean z2, long j4, long j5, @Nullable String str5, @NotNull String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.contentId = str;
        this.contentType = str2;
        this.templateSetNo = j;
        this.title = str3;
        this.message = str4;
        this.serviceId = j2;
        this.termsId = j3;
        this.reached = z;
        this.read = z2;
        this.templateNo = j4;
        this.messagePlanNo = j5;
        this.reachTs = str5;
        this.linkUri = str6;
        this.iconUri = str7;
        this.contentReachType = str8;
        this.company = str9;
        this.isSimilarBlock = z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0153  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void IAuthTabCallback(viva.republica.toss.network.model.notification.group.RecentMessagesDto r11, o.vyl r12, kotlinx.serialization.descriptors.SerialDescriptor r13) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.notification.group.RecentMessagesDto.IAuthTabCallback(viva.republica.toss.network.model.notification.group.RecentMessagesDto, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RecentMessagesDto(String str, String str2, long j, String str3, String str4, long j2, long j3, boolean z, boolean z2, long j4, long j5, String str5, String str6, String str7, String str8, String str9, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str10;
        String str11;
        String str12;
        boolean z4;
        boolean z5;
        String str13;
        long j6;
        long j7;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        boolean z6;
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            str10 = "";
        } else {
            str10 = str;
        }
        if ((i & 2) != 0) {
            int i3 = onExtraCallbackWithResult + 83;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 83 / 0;
            }
            str11 = "";
        } else {
            str11 = str2;
        }
        long j8 = (i & 4) != 0 ? -1L : j;
        String str22 = (i & 8) != 0 ? "" : str3;
        if ((i & 16) != 0) {
            int i5 = onExtraCallbackWithResult + 65;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            str12 = "";
        } else {
            str12 = str4;
        }
        long j9 = (i & 32) != 0 ? -1L : j2;
        long j10 = (i & 64) != 0 ? -1L : j3;
        if ((i & 128) != 0) {
            int i7 = 2 % 2;
            z4 = false;
        } else {
            z4 = z;
        }
        if ((i & 256) != 0) {
            int i8 = onExtraCallbackWithResult + 85;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            z5 = false;
        } else {
            z5 = z2;
        }
        if ((i & 512) != 0) {
            int i10 = onWarmupCompleted + 9;
            str13 = "";
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 2 % 2;
            j6 = -1;
        } else {
            str13 = "";
            j6 = j4;
        }
        if ((i & 1024) != 0) {
            int i13 = 2 % 2;
            j7 = -1;
        } else {
            j7 = j5;
        }
        String str23 = (i & 2048) != 0 ? null : str5;
        if ((i & 4096) != 0) {
            int i14 = onWarmupCompleted + 113;
            str14 = str23;
            onExtraCallbackWithResult = i14 % 128;
            int i15 = i14 % 2;
            str15 = str13;
        } else {
            str14 = str23;
            str15 = str6;
        }
        if ((i & 8192) != 0) {
            int i16 = onWarmupCompleted + 19;
            str16 = str15;
            onExtraCallbackWithResult = i16 % 128;
            int i17 = i16 % 2;
            str17 = null;
        } else {
            str16 = str15;
            str17 = str7;
        }
        if ((i & 16384) != 0) {
            int i18 = onExtraCallbackWithResult + 19;
            str18 = str17;
            onWarmupCompleted = i18 % 128;
            str19 = null;
            if (i18 % 2 == 0) {
                str19.hashCode();
                throw null;
            }
            str20 = null;
        } else {
            str18 = str17;
            str19 = null;
            str20 = str8;
        }
        if ((i & 32768) != 0) {
            int i19 = 2 % 2;
        } else {
            str19 = str9;
        }
        if ((i & 65536) != 0) {
            int i20 = onWarmupCompleted + 11;
            str21 = str19;
            onExtraCallbackWithResult = i20 % 128;
            z6 = i20 % 2 != 0;
        } else {
            str21 = str19;
            z6 = z3;
        }
        this(str10, str11, j8, str22, str12, j9, j10, z4, z5, j6, j7, str14, str16, str18, str20, str21, z6);
    }

    public final String onNavigationEvent() {
        String str;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 45;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.contentId;
            int i4 = 91 / 0;
        } else {
            str = this.contentId;
        }
        int i5 = i2 + 119;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String asBinder() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.title;
        }
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 69;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.message;
        int i5 = i2 + 73;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final long IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 63;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        long j = this.serviceId;
        int i5 = i2 + 63;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long asInterface() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 15;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        long j = this.termsId;
        int i4 = i2 + 117;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return j;
        }
        obj.hashCode();
        throw null;
    }

    public final long IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.templateNo;
        }
        int i3 = 76 / 0;
        return this.templateNo;
    }

    public final boolean onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        boolean z = this.isSimilarBlock;
        int i5 = i3 + 85;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final MultiLineString IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        MultiLineString multiLineStringOnWarmupCompleted = getLatitude.onWarmupCompleted(this.contentReachType);
        int i4 = onWarmupCompleted + 77;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return multiLineStringOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final MultiPoint onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String str = this.company;
        if (i3 != 0) {
            return MultiPolygon.onExtraCallback(str);
        }
        MultiPolygon.onExtraCallback(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final MultiPoint onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = this.company;
        if (i3 == 0) {
            return MultiPolygon.onExtraCallback(str);
        }
        MultiPolygon.onExtraCallback(str);
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<RecentMessagesDto> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 95;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            RecentMessagesDto$$serializer recentMessagesDto$$serializer = RecentMessagesDto$$serializer.INSTANCE;
            if (i3 != 0) {
                return recentMessagesDto$$serializer;
            }
            throw null;
        }

        public final RecentMessagesDto onWarmupCompleted() {
            int i = 2 % 2;
            RecentMessagesDto recentMessagesDto = new RecentMessagesDto("", "", -1L, "", "", -1L, 0L, false, false, 0L, 0L, (String) null, "", (String) null, (String) null, (String) null, false, 126912, (DefaultConstructorMarker) null);
            int i2 = onWarmupCompleted + 5;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return recentMessagesDto;
        }
    }

    public static /* synthetic */ RecentMessagesDto onWarmupCompleted(RecentMessagesDto recentMessagesDto, String str, String str2, long j, String str3, String str4, long j2, long j3, boolean z, boolean z2, long j4, long j5, String str5, String str6, String str7, String str8, String str9, boolean z3, int i, Object obj) {
        return (RecentMessagesDto) onNavigationEvent(new Object[]{recentMessagesDto, str, str2, Long.valueOf(j), str3, str4, Long.valueOf(j2), Long.valueOf(j3), Boolean.valueOf(z), Boolean.valueOf(z2), Long.valueOf(j4), Long.valueOf(j5), str5, str6, str7, str8, str9, Boolean.valueOf(z3), Integer.valueOf(i), obj}, -1190020944, 1190020944, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return ((Integer) onNavigationEvent(new Object[]{this}, -1252220359, 1252220360, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback())).intValue();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        onNavigationEvent(new Object[]{this, parcel, Integer.valueOf(i)}, -1019075529, 1019075531, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
    }
}
