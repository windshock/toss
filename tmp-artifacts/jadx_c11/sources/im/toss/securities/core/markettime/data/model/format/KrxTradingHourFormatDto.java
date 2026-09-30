package im.toss.securities.core.markettime.data.model.format;

import j$.time.LocalDate;
import j$.time.ZonedDateTime;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.CmpServiceImplf;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.onFlowLoaded;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class KrxTradingHourFormatDto {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final String afterExtraSinglePriceOrderStartTime;
    private final String afterMarketEndTime;
    private final String afterMarketStartTime;
    private final String endTime;
    private final String extendedStartTime;
    private final String krxPreMarketEndTime;
    private final String krxPreMarketStartTime;
    private final String officialExtendedStartTime;
    private final String preLastPriceOrderEndTime;
    private final String startTime;

    static {
        int i = onExtraCallbackWithResult + 45;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 3 / 0;
        }
    }

    public KrxTradingHourFormatDto() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KrxTradingHourFormatDto)) {
            return false;
        }
        KrxTradingHourFormatDto krxTradingHourFormatDto = (KrxTradingHourFormatDto) obj;
        if (!Intrinsics.areEqual(this.krxPreMarketStartTime, krxTradingHourFormatDto.krxPreMarketStartTime)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.krxPreMarketEndTime, krxTradingHourFormatDto.krxPreMarketEndTime)) {
            int i4 = onExtraCallback + 91;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.extendedStartTime, krxTradingHourFormatDto.extendedStartTime)) {
            int i6 = onWarmupCompleted + 71;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.officialExtendedStartTime, krxTradingHourFormatDto.officialExtendedStartTime) || !Intrinsics.areEqual(this.preLastPriceOrderEndTime, krxTradingHourFormatDto.preLastPriceOrderEndTime)) {
            return false;
        }
        if (Intrinsics.areEqual(this.startTime, krxTradingHourFormatDto.startTime)) {
            return !(Intrinsics.areEqual(this.afterMarketStartTime, krxTradingHourFormatDto.afterMarketStartTime) ^ true) && Intrinsics.areEqual(this.endTime, krxTradingHourFormatDto.endTime) && Intrinsics.areEqual(this.afterExtraSinglePriceOrderStartTime, krxTradingHourFormatDto.afterExtraSinglePriceOrderStartTime) && Intrinsics.areEqual(this.afterMarketEndTime, krxTradingHourFormatDto.afterMarketEndTime);
        }
        int i8 = onExtraCallback + 115;
        int i9 = i8 % 128;
        onWarmupCompleted = i9;
        int i10 = i8 % 2;
        int i11 = i9 + 83;
        onExtraCallback = i11 % 128;
        if (i11 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int i = 2 % 2;
        String str = this.krxPreMarketStartTime;
        if (str == null) {
            int i2 = onExtraCallback + 107;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.krxPreMarketEndTime;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.extendedStartTime;
        if (str3 == null) {
            int i4 = onExtraCallback + 35;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str3.hashCode();
        }
        String str4 = this.officialExtendedStartTime;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.preLastPriceOrderEndTime;
        if (str5 == null) {
            int i6 = onWarmupCompleted + 27;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str5.hashCode();
        }
        String str6 = this.startTime;
        if (str6 == null) {
            int i8 = onWarmupCompleted + 61;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str6.hashCode();
        }
        String str7 = this.afterMarketStartTime;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.endTime;
        if (str8 == null) {
            int i10 = onWarmupCompleted + 79;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            iHashCode5 = 0;
        } else {
            iHashCode5 = str8.hashCode();
        }
        String str9 = this.afterExtraSinglePriceOrderStartTime;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.afterMarketEndTime;
        return (((((((((((((((((iHashCode * 31) + iHashCode6) * 31) + iHashCode2) * 31) + iHashCode7) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode8) * 31) + iHashCode5) * 31) + iHashCode9) * 31) + (str10 != null ? str10.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "KrxTradingHourFormatDto(krxPreMarketStartTime=" + this.krxPreMarketStartTime + ", krxPreMarketEndTime=" + this.krxPreMarketEndTime + ", extendedStartTime=" + this.extendedStartTime + ", officialExtendedStartTime=" + this.officialExtendedStartTime + ", preLastPriceOrderEndTime=" + this.preLastPriceOrderEndTime + ", startTime=" + this.startTime + ", afterMarketStartTime=" + this.afterMarketStartTime + ", endTime=" + this.endTime + ", afterExtraSinglePriceOrderStartTime=" + this.afterExtraSinglePriceOrderStartTime + ", afterMarketEndTime=" + this.afterMarketEndTime + ")";
        int i2 = onWarmupCompleted + 81;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 4 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<KrxTradingHourFormatDto> serializer() {
            KrxTradingHourFormatDto$$serializer krxTradingHourFormatDto$$serializer;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 65;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                krxTradingHourFormatDto$$serializer = KrxTradingHourFormatDto$$serializer.INSTANCE;
                int i3 = 51 / 0;
            } else {
                krxTradingHourFormatDto$$serializer = KrxTradingHourFormatDto$$serializer.INSTANCE;
            }
            int i4 = IAuthTabCallback + 87;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return krxTradingHourFormatDto$$serializer;
        }
    }

    public /* synthetic */ KrxTradingHourFormatDto(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, okycx okycxVar) {
        Object obj = null;
        if ((i & 1) == 0) {
            this.krxPreMarketStartTime = null;
        } else {
            this.krxPreMarketStartTime = str;
        }
        if ((i & 2) == 0) {
            this.krxPreMarketEndTime = null;
        } else {
            this.krxPreMarketEndTime = str2;
            int i2 = onExtraCallback + 19;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        if ((i & 4) == 0) {
            int i5 = onWarmupCompleted + 39;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            this.extendedStartTime = null;
            if (i6 != 0) {
                int i7 = 7 / 0;
            }
            int i8 = 2 % 2;
        } else {
            this.extendedStartTime = str3;
        }
        if ((i & 8) == 0) {
            this.officialExtendedStartTime = null;
        } else {
            this.officialExtendedStartTime = str4;
        }
        if ((i & 16) == 0) {
            this.preLastPriceOrderEndTime = null;
        } else {
            this.preLastPriceOrderEndTime = str5;
        }
        if ((i & 32) == 0) {
            int i9 = onExtraCallback + 113;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            this.startTime = null;
            if (i10 == 0) {
                throw null;
            }
        } else {
            this.startTime = str6;
            int i11 = 2 % 2;
        }
        if ((i & 64) == 0) {
            int i12 = onExtraCallback + 91;
            onWarmupCompleted = i12 % 128;
            int i13 = i12 % 2;
            this.afterMarketStartTime = null;
        } else {
            this.afterMarketStartTime = str7;
        }
        if ((i & 128) == 0) {
            int i14 = onExtraCallback + 115;
            onWarmupCompleted = i14 % 128;
            int i15 = i14 % 2;
            this.endTime = null;
            int i16 = 2 % 2;
        } else {
            this.endTime = str8;
        }
        if ((i & 256) == 0) {
            int i17 = onExtraCallback + 73;
            onWarmupCompleted = i17 % 128;
            int i18 = i17 % 2;
            this.afterExtraSinglePriceOrderStartTime = null;
        } else {
            this.afterExtraSinglePriceOrderStartTime = str9;
        }
        if ((i & 512) != 0) {
            this.afterMarketEndTime = str10;
            return;
        }
        int i19 = onExtraCallback + 81;
        onWarmupCompleted = i19 % 128;
        int i20 = i19 % 2;
        this.afterMarketEndTime = null;
        if (i20 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public KrxTradingHourFormatDto(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10) {
        this.krxPreMarketStartTime = str;
        this.krxPreMarketEndTime = str2;
        this.extendedStartTime = str3;
        this.officialExtendedStartTime = str4;
        this.preLastPriceOrderEndTime = str5;
        this.startTime = str6;
        this.afterMarketStartTime = str7;
        this.endTime = str8;
        this.afterExtraSinglePriceOrderStartTime = str9;
        this.afterMarketEndTime = str10;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void IAuthTabCallback(KrxTradingHourFormatDto krxTradingHourFormatDto, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (!(!vylVar.onWarmupCompleted(serialDescriptor, 0)) || krxTradingHourFormatDto.krxPreMarketStartTime != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, krxTradingHourFormatDto.krxPreMarketStartTime);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i2 = onExtraCallback + 81;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (krxTradingHourFormatDto.krxPreMarketEndTime != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, krxTradingHourFormatDto.krxPreMarketEndTime);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || krxTradingHourFormatDto.extendedStartTime != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, krxTradingHourFormatDto.extendedStartTime);
            int i4 = onWarmupCompleted + 45;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || krxTradingHourFormatDto.officialExtendedStartTime != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, krxTradingHourFormatDto.officialExtendedStartTime);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 4) || krxTradingHourFormatDto.preLastPriceOrderEndTime != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, krxTradingHourFormatDto.preLastPriceOrderEndTime);
            int i6 = onExtraCallback + 91;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
        }
        if (!(!vylVar.onWarmupCompleted(serialDescriptor, 5)) || krxTradingHourFormatDto.startTime != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, krxTradingHourFormatDto.startTime);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 6) || krxTradingHourFormatDto.afterMarketStartTime != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, krxTradingHourFormatDto.afterMarketStartTime);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 7) || krxTradingHourFormatDto.endTime != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 7, getWriggleLayout.onNavigationEvent, krxTradingHourFormatDto.endTime);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 8) || krxTradingHourFormatDto.afterExtraSinglePriceOrderStartTime != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 8, getWriggleLayout.onNavigationEvent, krxTradingHourFormatDto.afterExtraSinglePriceOrderStartTime);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 9) || krxTradingHourFormatDto.afterMarketEndTime != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 9, getWriggleLayout.onNavigationEvent, krxTradingHourFormatDto.afterMarketEndTime);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ KrxTradingHourFormatDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17 = (i & 1) != 0 ? null : str;
        String str18 = (i & 2) != 0 ? null : str2;
        if ((i & 4) != 0) {
            int i2 = onExtraCallback + 29;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str11 = null;
        } else {
            str11 = str3;
        }
        if ((i & 8) != 0) {
            int i5 = onExtraCallback + 55;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            str12 = null;
        } else {
            str12 = str4;
        }
        String str19 = (i & 16) != 0 ? null : str5;
        if ((i & 32) != 0) {
            int i7 = onExtraCallback + 13;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            str13 = null;
        } else {
            str13 = str6;
        }
        if ((i & 64) != 0) {
            int i9 = onWarmupCompleted + 7;
            onExtraCallback = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 67 / 0;
            }
            int i11 = 2 % 2;
            str14 = null;
        } else {
            str14 = str7;
        }
        if ((i & 128) != 0) {
            int i12 = onWarmupCompleted + 79;
            onExtraCallback = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
            int i13 = 2 % 2;
            str15 = null;
        } else {
            str15 = str8;
        }
        if ((i & 256) != 0) {
            int i14 = onWarmupCompleted + 85;
            onExtraCallback = i14 % 128;
            int i15 = i14 % 2;
            int i16 = 2 % 2;
            str16 = null;
        } else {
            str16 = str9;
        }
        this(str17, str18, str11, str12, str19, str13, str14, str15, str16, (i & 512) == 0 ? str10 : null);
    }

    public final CmpServiceImplf onExtraCallback(@Nullable LocalDate localDate) {
        ZonedDateTime zonedDateTime;
        ZonedDateTime zonedDateTime2;
        ZonedDateTime zonedDateTimeOnNavigationEvent;
        ZonedDateTime zonedDateTimeOnNavigationEvent2;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.krxPreMarketStartTime;
        ZonedDateTime zonedDateTimeOnNavigationEvent3 = str != null ? onFlowLoaded.onNavigationEvent(str, localDate) : null;
        String str2 = this.krxPreMarketEndTime;
        ZonedDateTime zonedDateTimeOnNavigationEvent4 = str2 != null ? onFlowLoaded.onNavigationEvent(str2, localDate) : null;
        String str3 = this.extendedStartTime;
        ZonedDateTime zonedDateTimeOnNavigationEvent5 = str3 != null ? onFlowLoaded.onNavigationEvent(str3, localDate) : null;
        String str4 = this.officialExtendedStartTime;
        if (str4 != null) {
            ZonedDateTime zonedDateTimeOnNavigationEvent6 = onFlowLoaded.onNavigationEvent(str4, localDate);
            int i3 = onExtraCallback + 105;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            zonedDateTime = zonedDateTimeOnNavigationEvent6;
        } else {
            zonedDateTime = null;
        }
        String str5 = this.preLastPriceOrderEndTime;
        ZonedDateTime zonedDateTimeOnNavigationEvent7 = str5 != null ? onFlowLoaded.onNavigationEvent(str5, localDate) : null;
        String str6 = this.startTime;
        ZonedDateTime zonedDateTimeOnNavigationEvent8 = str6 != null ? onFlowLoaded.onNavigationEvent(str6, localDate) : null;
        String str7 = this.afterMarketStartTime;
        ZonedDateTime zonedDateTimeOnNavigationEvent9 = str7 != null ? onFlowLoaded.onNavigationEvent(str7, localDate) : null;
        String str8 = this.endTime;
        if (str8 != null) {
            int i5 = onWarmupCompleted + 71;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                zonedDateTimeOnNavigationEvent2 = onFlowLoaded.onNavigationEvent(str8, localDate);
                int i6 = 17 / 0;
            } else {
                zonedDateTimeOnNavigationEvent2 = onFlowLoaded.onNavigationEvent(str8, localDate);
            }
            zonedDateTime2 = zonedDateTimeOnNavigationEvent2;
        } else {
            zonedDateTime2 = null;
        }
        String str9 = this.afterExtraSinglePriceOrderStartTime;
        if (str9 != null) {
            int i7 = onWarmupCompleted + 69;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            zonedDateTimeOnNavigationEvent = onFlowLoaded.onNavigationEvent(str9, localDate);
        } else {
            int i9 = onExtraCallback + 33;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            zonedDateTimeOnNavigationEvent = null;
        }
        String str10 = this.afterMarketEndTime;
        return new CmpServiceImplf(zonedDateTimeOnNavigationEvent3, zonedDateTimeOnNavigationEvent4, zonedDateTimeOnNavigationEvent5, zonedDateTime, zonedDateTimeOnNavigationEvent7, zonedDateTimeOnNavigationEvent8, zonedDateTimeOnNavigationEvent9, zonedDateTime2, zonedDateTimeOnNavigationEvent, str10 != null ? onFlowLoaded.onNavigationEvent(str10, localDate) : null);
    }
}
