package im.toss.securities.core.markettime.data.model.format;

import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZonedDateTime;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.isCivilized;
import o.liq;
import o.okycx;
import o.onFlowLoaded;
import o.r8lambdaslmmX5Wu6GwiDJZDdHNz7ptcmRg;
import o.showCmp;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class UsTradingHourFormatDto implements showCmp<r8lambdaslmmX5Wu6GwiDJZDdHNz7ptcmRg> {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final String afterEnd;
    private final String afterStart;
    private final String date;
    private final String dayMarketEnd;
    private final String dayMarketStart;
    private final String endTime;
    private final String extendedStartTime;
    private final LocalDate localDate;
    private final String officialExtendedStartTime;
    private final String startTime;
    private final String usAfterMarketEnd;

    static {
        int i = IAuthTabCallback + 71;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public UsTradingHourFormatDto() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 37;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof UsTradingHourFormatDto)) {
            int i4 = onNavigationEvent + 29;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        UsTradingHourFormatDto usTradingHourFormatDto = (UsTradingHourFormatDto) obj;
        if (!Intrinsics.areEqual(this.date, usTradingHourFormatDto.date) || !Intrinsics.areEqual(this.afterStart, usTradingHourFormatDto.afterStart) || !Intrinsics.areEqual(this.afterEnd, usTradingHourFormatDto.afterEnd) || !Intrinsics.areEqual(this.dayMarketStart, usTradingHourFormatDto.dayMarketStart) || !Intrinsics.areEqual(this.dayMarketEnd, usTradingHourFormatDto.dayMarketEnd) || (!Intrinsics.areEqual(this.extendedStartTime, usTradingHourFormatDto.extendedStartTime)) || !Intrinsics.areEqual(this.officialExtendedStartTime, usTradingHourFormatDto.officialExtendedStartTime) || !Intrinsics.areEqual(this.startTime, usTradingHourFormatDto.startTime)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.endTime, usTradingHourFormatDto.endTime)) {
            int i6 = onNavigationEvent + 85;
            onExtraCallbackWithResult = i6 % 128;
            return i6 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.usAfterMarketEnd, usTradingHourFormatDto.usAfterMarketEnd)) {
            return false;
        }
        int i7 = onNavigationEvent + 105;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        String str = this.date;
        int iHashCode4 = 0;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.afterStart;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.afterEnd;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.dayMarketStart;
        if (str4 == null) {
            int i2 = onNavigationEvent + 93;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str4.hashCode();
        }
        String str5 = this.dayMarketEnd;
        int iHashCode8 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.extendedStartTime;
        if (str6 == null) {
            int i4 = onNavigationEvent + 103;
            onExtraCallbackWithResult = i4 % 128;
            iHashCode2 = i4 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode2 = str6.hashCode();
        }
        String str7 = this.officialExtendedStartTime;
        int iHashCode9 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.startTime;
        if (str8 == null) {
            int i5 = onNavigationEvent + 57;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str8.hashCode();
        }
        String str9 = this.endTime;
        int iHashCode10 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.usAfterMarketEnd;
        if (str10 != null) {
            int i7 = onExtraCallbackWithResult + 83;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            iHashCode4 = str10.hashCode();
        }
        return (((((((((((((((((iHashCode5 * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode) * 31) + iHashCode8) * 31) + iHashCode2) * 31) + iHashCode9) * 31) + iHashCode3) * 31) + iHashCode10) * 31) + iHashCode4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UsTradingHourFormatDto(date=" + this.date + ", afterStart=" + this.afterStart + ", afterEnd=" + this.afterEnd + ", dayMarketStart=" + this.dayMarketStart + ", dayMarketEnd=" + this.dayMarketEnd + ", extendedStartTime=" + this.extendedStartTime + ", officialExtendedStartTime=" + this.officialExtendedStartTime + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", usAfterMarketEnd=" + this.usAfterMarketEnd + ")";
        int i2 = onNavigationEvent + 119;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<UsTradingHourFormatDto> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 51;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                UsTradingHourFormatDto$$serializer usTradingHourFormatDto$$serializer = UsTradingHourFormatDto$$serializer.INSTANCE;
                throw null;
            }
            UsTradingHourFormatDto$$serializer usTradingHourFormatDto$$serializer2 = UsTradingHourFormatDto$$serializer.INSTANCE;
            int i3 = onWarmupCompleted + 27;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return usTradingHourFormatDto$$serializer2;
            }
            throw null;
        }
    }

    public /* synthetic */ UsTradingHourFormatDto(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, okycx okycxVar) {
        Object obj = null;
        if ((i & 1) == 0) {
            this.date = null;
        } else {
            this.date = str;
        }
        if ((i & 2) == 0) {
            int i2 = onNavigationEvent;
            int i3 = i2 + 71;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            this.afterStart = null;
            int i5 = i2 + 107;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        } else {
            this.afterStart = str2;
        }
        if ((i & 4) == 0) {
            int i8 = onExtraCallbackWithResult + 57;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            this.afterEnd = null;
            if (i9 != 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            this.afterEnd = str3;
        }
        if ((i & 8) == 0) {
            this.dayMarketStart = null;
        } else {
            this.dayMarketStart = str4;
        }
        if ((i & 16) == 0) {
            this.dayMarketEnd = null;
            int i10 = 2 % 2;
        } else {
            this.dayMarketEnd = str5;
        }
        if ((i & 32) == 0) {
            this.extendedStartTime = null;
            int i11 = onNavigationEvent + 5;
            onExtraCallbackWithResult = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 2 % 2;
            }
        } else {
            this.extendedStartTime = str6;
        }
        if ((i & 64) == 0) {
            int i13 = onNavigationEvent + 45;
            onExtraCallbackWithResult = i13 % 128;
            int i14 = i13 % 2;
            this.officialExtendedStartTime = null;
            if (i14 == 0) {
                throw null;
            }
        } else {
            this.officialExtendedStartTime = str7;
        }
        if ((i & 128) == 0) {
            int i15 = onExtraCallbackWithResult + 37;
            int i16 = i15 % 128;
            onNavigationEvent = i16;
            int i17 = i15 % 2;
            this.startTime = null;
            int i18 = i16 + 65;
            onExtraCallbackWithResult = i18 % 128;
            int i19 = i18 % 2;
            int i20 = 2 % 2;
        } else {
            this.startTime = str8;
        }
        if ((i & 256) == 0) {
            this.endTime = null;
        } else {
            this.endTime = str9;
            int i21 = 2 % 2;
        }
        if ((i & 512) == 0) {
            this.usAfterMarketEnd = null;
        } else {
            this.usAfterMarketEnd = str10;
        }
        LocalDate localDate = LocalDate.parse(this.date);
        Intrinsics.checkNotNullExpressionValue(localDate, "");
        this.localDate = localDate;
    }

    public UsTradingHourFormatDto(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10) {
        this.date = str;
        this.afterStart = str2;
        this.afterEnd = str3;
        this.dayMarketStart = str4;
        this.dayMarketEnd = str5;
        this.extendedStartTime = str6;
        this.officialExtendedStartTime = str7;
        this.startTime = str8;
        this.endTime = str9;
        this.usAfterMarketEnd = str10;
        LocalDate localDate = LocalDate.parse(str);
        Intrinsics.checkNotNullExpressionValue(localDate, "");
        this.localDate = localDate;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c3  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallback(UsTradingHourFormatDto usTradingHourFormatDto, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || usTradingHourFormatDto.date != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, usTradingHourFormatDto.date);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i2 = onNavigationEvent + 7;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 22 / 0;
                if (usTradingHourFormatDto.afterStart != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, usTradingHourFormatDto.afterStart);
                }
            } else if (usTradingHourFormatDto.afterStart != null) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || usTradingHourFormatDto.afterEnd != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, usTradingHourFormatDto.afterEnd);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
            int i4 = onNavigationEvent + 83;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            if (usTradingHourFormatDto.dayMarketStart != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, usTradingHourFormatDto.dayMarketStart);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 4) || usTradingHourFormatDto.dayMarketEnd != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, usTradingHourFormatDto.dayMarketEnd);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 5) || usTradingHourFormatDto.extendedStartTime != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, usTradingHourFormatDto.extendedStartTime);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 6) || usTradingHourFormatDto.officialExtendedStartTime != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, usTradingHourFormatDto.officialExtendedStartTime);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 7) || usTradingHourFormatDto.startTime != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 7, getWriggleLayout.onNavigationEvent, usTradingHourFormatDto.startTime);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 8)) {
            int i6 = onExtraCallbackWithResult + 97;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            if (usTradingHourFormatDto.endTime != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 8, getWriggleLayout.onNavigationEvent, usTradingHourFormatDto.endTime);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 9) || usTradingHourFormatDto.usAfterMarketEnd != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 9, getWriggleLayout.onNavigationEvent, usTradingHourFormatDto.usAfterMarketEnd);
        }
    }

    @Override // o.showCmp
    public /* synthetic */ r8lambdaslmmX5Wu6GwiDJZDdHNz7ptcmRg IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaslmmX5Wu6GwiDJZDdHNz7ptcmRg r8lambdaslmmx5wu6gwidjzddhnz7ptcmrgOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = onExtraCallbackWithResult + 15;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return r8lambdaslmmx5wu6gwidjzddhnz7ptcmrgOnExtraCallbackWithResult;
        }
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ UsTradingHourFormatDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str11;
        String str12;
        String str13;
        String str14;
        String str15 = null;
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 49;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            str11 = null;
        } else {
            str11 = str;
        }
        if ((i & 2) != 0) {
            int i3 = 2 % 2;
            str12 = null;
        } else {
            str12 = str2;
        }
        String str16 = (i & 4) != 0 ? null : str3;
        String str17 = (i & 8) != 0 ? null : str4;
        if ((i & 16) != 0) {
            int i4 = onNavigationEvent + 9;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            str13 = null;
        } else {
            str13 = str5;
        }
        String str18 = (i & 32) != 0 ? null : str6;
        String str19 = (i & 64) != 0 ? null : str7;
        if ((i & 128) != 0) {
            int i5 = onExtraCallbackWithResult;
            int i6 = i5 + 57;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 45;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            str14 = null;
        } else {
            str14 = str8;
        }
        String str20 = (i & 256) != 0 ? null : str9;
        if ((i & 512) != 0) {
            int i11 = onNavigationEvent + 117;
            onExtraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
            int i13 = 2 % 2;
        } else {
            str15 = str10;
        }
        this(str11, str12, str16, str17, str13, str18, str19, str14, str20, str15);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r8lambdaslmmX5Wu6GwiDJZDdHNz7ptcmRg onExtraCallbackWithResult() {
        ZonedDateTime zonedDateTimeOnExtraCallbackWithResult;
        ZonedDateTime zonedDateTimeOnExtraCallbackWithResult2;
        ZonedDateTime zonedDateTimeOnNavigationEvent;
        ZonedDateTime zonedDateTime;
        LocalDateTime localDateTime;
        ZonedDateTime zonedDateTimeOnNavigationEvent2;
        ZonedDateTime zonedDateTimeOnNavigationEvent3;
        int i = 2 % 2;
        String str = this.startTime;
        ZonedDateTime zonedDateTimeOnExtraCallbackWithResult3 = null;
        ZonedDateTime zonedDateTimeOnNavigationEvent4 = str != null ? onFlowLoaded.onNavigationEvent(str, this.localDate) : null;
        String str2 = this.endTime;
        ZonedDateTime zonedDateTimeOnExtraCallbackWithResult4 = (str2 == null || (zonedDateTimeOnNavigationEvent3 = onFlowLoaded.onNavigationEvent(str2, this.localDate)) == null) ? null : onFlowLoaded.onExtraCallbackWithResult(zonedDateTimeOnNavigationEvent3, zonedDateTimeOnNavigationEvent4);
        isCivilized iscivilized = isCivilized.onWarmupCompleted;
        ZonedDateTime zonedDateTimeOnNavigationEvent5 = iscivilized.onNavigationEvent(this.localDate);
        String str3 = this.afterStart;
        if (str3 != null) {
            int i2 = onExtraCallbackWithResult + 101;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                LocalDateTime.parse(str3, isCivilized.onNavigationEvent.onExtraCallbackWithResult.onExtraCallback());
                throw null;
            }
            LocalDateTime localDateTime2 = LocalDateTime.parse(str3, isCivilized.onNavigationEvent.onExtraCallbackWithResult.onExtraCallback());
            if (localDateTime2 != null) {
                zonedDateTimeOnExtraCallbackWithResult = iscivilized.onExtraCallbackWithResult(localDateTime2);
            } else {
                int i3 = onNavigationEvent + 73;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                zonedDateTimeOnExtraCallbackWithResult = null;
            }
        }
        String str4 = this.afterEnd;
        if (str4 != null) {
            int i5 = onNavigationEvent + 15;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                LocalDateTime.parse(str4, isCivilized.onNavigationEvent.onExtraCallbackWithResult.onExtraCallback());
                throw null;
            }
            LocalDateTime localDateTime3 = LocalDateTime.parse(str4, isCivilized.onNavigationEvent.onExtraCallbackWithResult.onExtraCallback());
            if (localDateTime3 != null) {
                int i6 = onExtraCallbackWithResult + 91;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                zonedDateTimeOnExtraCallbackWithResult2 = iscivilized.onExtraCallbackWithResult(localDateTime3);
            } else {
                zonedDateTimeOnExtraCallbackWithResult2 = null;
            }
        }
        String str5 = this.dayMarketStart;
        if (str5 != null) {
            zonedDateTimeOnNavigationEvent = onFlowLoaded.onNavigationEvent(str5, this.localDate);
        } else {
            int i8 = onNavigationEvent + 77;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            zonedDateTimeOnNavigationEvent = null;
        }
        String str6 = this.dayMarketEnd;
        ZonedDateTime zonedDateTimeOnNavigationEvent6 = str6 != null ? onFlowLoaded.onNavigationEvent(str6, this.localDate) : null;
        String str7 = this.extendedStartTime;
        if (str7 != null) {
            int i10 = onNavigationEvent + 101;
            onExtraCallbackWithResult = i10 % 128;
            if (i10 % 2 == 0) {
                zonedDateTimeOnNavigationEvent2 = onFlowLoaded.onNavigationEvent(str7, this.localDate);
                int i11 = 25 / 0;
            } else {
                zonedDateTimeOnNavigationEvent2 = onFlowLoaded.onNavigationEvent(str7, this.localDate);
            }
            zonedDateTime = zonedDateTimeOnNavigationEvent2;
        } else {
            zonedDateTime = null;
        }
        String str8 = this.officialExtendedStartTime;
        ZonedDateTime zonedDateTimeOnNavigationEvent7 = str8 != null ? onFlowLoaded.onNavigationEvent(str8, this.localDate) : null;
        String str9 = this.usAfterMarketEnd;
        if (str9 != null && (localDateTime = LocalDateTime.parse(str9, isCivilized.onNavigationEvent.onExtraCallbackWithResult.onExtraCallback())) != null) {
            zonedDateTimeOnExtraCallbackWithResult3 = iscivilized.onExtraCallbackWithResult(localDateTime);
        }
        return new r8lambdaslmmX5Wu6GwiDJZDdHNz7ptcmRg(zonedDateTimeOnNavigationEvent5, zonedDateTimeOnExtraCallbackWithResult, zonedDateTimeOnExtraCallbackWithResult2, zonedDateTimeOnNavigationEvent, zonedDateTimeOnNavigationEvent6, zonedDateTime, zonedDateTimeOnNavigationEvent7, zonedDateTimeOnNavigationEvent4, zonedDateTimeOnExtraCallbackWithResult4, zonedDateTimeOnExtraCallbackWithResult3);
    }
}
