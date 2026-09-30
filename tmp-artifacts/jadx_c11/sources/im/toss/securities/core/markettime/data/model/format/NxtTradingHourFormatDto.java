package im.toss.securities.core.markettime.data.model.format;

import j$.time.LocalDate;
import j$.time.ZonedDateTime;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.CmpServiceImple;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.onFlowLoaded;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class NxtTradingHourFormatDto {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final String afterMarketEndTime;
    private final String afterMarketSinglePriceEndTime;
    private final String afterMarketStartTime;
    private final String closingPriceEndTime;
    private final String closingPriceStartTime;
    private final String endTime;
    private final String preMarketEndTime;
    private final String preMarketStartTime;
    private final String startTime;

    static {
        int i = onWarmupCompleted + 109;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public NxtTradingHourFormatDto() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 511, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 65;
        onNavigationEvent = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 113;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i2 + 43;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                return true;
            }
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof NxtTradingHourFormatDto)) {
            return false;
        }
        NxtTradingHourFormatDto nxtTradingHourFormatDto = (NxtTradingHourFormatDto) obj;
        if (!Intrinsics.areEqual(this.preMarketStartTime, nxtTradingHourFormatDto.preMarketStartTime)) {
            int i7 = onNavigationEvent + 13;
            onExtraCallbackWithResult = i7 % 128;
            return i7 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.preMarketEndTime, nxtTradingHourFormatDto.preMarketEndTime)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.startTime, nxtTradingHourFormatDto.startTime)) {
            int i8 = onNavigationEvent + 17;
            onExtraCallbackWithResult = i8 % 128;
            return i8 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.endTime, nxtTradingHourFormatDto.endTime)) {
            int i9 = onExtraCallbackWithResult + 39;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.afterMarketStartTime, nxtTradingHourFormatDto.afterMarketStartTime)) {
            return Intrinsics.areEqual(this.afterMarketSinglePriceEndTime, nxtTradingHourFormatDto.afterMarketSinglePriceEndTime) && Intrinsics.areEqual(this.afterMarketEndTime, nxtTradingHourFormatDto.afterMarketEndTime) && Intrinsics.areEqual(this.closingPriceStartTime, nxtTradingHourFormatDto.closingPriceStartTime) && Intrinsics.areEqual(this.closingPriceEndTime, nxtTradingHourFormatDto.closingPriceEndTime);
        }
        int i11 = onNavigationEvent + 59;
        onExtraCallbackWithResult = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        String str = this.preMarketStartTime;
        int iHashCode4 = 0;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.preMarketEndTime;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.startTime;
        if (str3 == null) {
            int i2 = onExtraCallbackWithResult + 23;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str3.hashCode();
        }
        String str4 = this.endTime;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.afterMarketStartTime;
        int iHashCode8 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.afterMarketSinglePriceEndTime;
        if (str6 == null) {
            int i4 = onExtraCallbackWithResult + 47;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str6.hashCode();
        }
        String str7 = this.afterMarketEndTime;
        int iHashCode9 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.closingPriceStartTime;
        if (str8 == null) {
            iHashCode3 = 1;
            int i6 = onNavigationEvent + 1;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                iHashCode3 = 0;
            }
        } else {
            iHashCode3 = str8.hashCode();
        }
        String str9 = this.closingPriceEndTime;
        if (str9 != null) {
            int i7 = onNavigationEvent + 117;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                str9.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            iHashCode4 = str9.hashCode();
        }
        return (((((((((((((((iHashCode5 * 31) + iHashCode6) * 31) + iHashCode) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode2) * 31) + iHashCode9) * 31) + iHashCode3) * 31) + iHashCode4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "NxtTradingHourFormatDto(preMarketStartTime=" + this.preMarketStartTime + ", preMarketEndTime=" + this.preMarketEndTime + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", afterMarketStartTime=" + this.afterMarketStartTime + ", afterMarketSinglePriceEndTime=" + this.afterMarketSinglePriceEndTime + ", afterMarketEndTime=" + this.afterMarketEndTime + ", closingPriceStartTime=" + this.closingPriceStartTime + ", closingPriceEndTime=" + this.closingPriceEndTime + ")";
        int i2 = onExtraCallbackWithResult + 39;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<NxtTradingHourFormatDto> serializer() {
            NxtTradingHourFormatDto$$serializer nxtTradingHourFormatDto$$serializer;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 59;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                nxtTradingHourFormatDto$$serializer = NxtTradingHourFormatDto$$serializer.INSTANCE;
                int i3 = 2 / 0;
            } else {
                nxtTradingHourFormatDto$$serializer = NxtTradingHourFormatDto$$serializer.INSTANCE;
            }
            int i4 = onExtraCallback + 107;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 44 / 0;
            }
            return nxtTradingHourFormatDto$$serializer;
        }
    }

    public /* synthetic */ NxtTradingHourFormatDto(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.preMarketStartTime = null;
            int i2 = 2 % 2;
        } else {
            this.preMarketStartTime = str;
        }
        if ((i & 2) == 0) {
            this.preMarketEndTime = null;
        } else {
            this.preMarketEndTime = str2;
            int i3 = 2 % 2;
        }
        if ((i & 4) == 0) {
            int i4 = onNavigationEvent + 111;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            this.startTime = null;
            if (i5 != 0) {
                int i6 = 33 / 0;
            }
        } else {
            this.startTime = str3;
        }
        if ((i & 8) == 0) {
            this.endTime = null;
            int i7 = 2 % 2;
        } else {
            this.endTime = str4;
        }
        if ((i & 16) == 0) {
            int i8 = onNavigationEvent + 9;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            this.afterMarketStartTime = null;
            if (i9 != 0) {
                throw null;
            }
        } else {
            this.afterMarketStartTime = str5;
            int i10 = 2 % 2;
        }
        if ((i & 32) == 0) {
            this.afterMarketSinglePriceEndTime = null;
        } else {
            this.afterMarketSinglePriceEndTime = str6;
        }
        if ((i & 64) == 0) {
            this.afterMarketEndTime = null;
        } else {
            this.afterMarketEndTime = str7;
        }
        if ((i & 128) == 0) {
            int i11 = onNavigationEvent + 65;
            onExtraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
            this.closingPriceStartTime = null;
            if (i12 != 0) {
                int i13 = 32 / 0;
            }
        } else {
            this.closingPriceStartTime = str8;
        }
        if ((i & 256) != 0) {
            this.closingPriceEndTime = str9;
            return;
        }
        int i14 = onExtraCallbackWithResult + 21;
        int i15 = i14 % 128;
        onNavigationEvent = i15;
        int i16 = i14 % 2;
        this.closingPriceEndTime = null;
        int i17 = i15 + 107;
        onExtraCallbackWithResult = i17 % 128;
        if (i17 % 2 != 0) {
            throw null;
        }
    }

    public NxtTradingHourFormatDto(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        this.preMarketStartTime = str;
        this.preMarketEndTime = str2;
        this.startTime = str3;
        this.endTime = str4;
        this.afterMarketStartTime = str5;
        this.afterMarketSinglePriceEndTime = str6;
        this.afterMarketEndTime = str7;
        this.closingPriceStartTime = str8;
        this.closingPriceEndTime = str9;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bf  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallback(NxtTradingHourFormatDto nxtTradingHourFormatDto, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || nxtTradingHourFormatDto.preMarketStartTime != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, nxtTradingHourFormatDto.preMarketStartTime);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || nxtTradingHourFormatDto.preMarketEndTime != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, nxtTradingHourFormatDto.preMarketEndTime);
            int i4 = onExtraCallbackWithResult + 5;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || nxtTradingHourFormatDto.startTime != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, nxtTradingHourFormatDto.startTime);
            int i6 = onExtraCallbackWithResult + 83;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || nxtTradingHourFormatDto.endTime != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, nxtTradingHourFormatDto.endTime);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 4) || nxtTradingHourFormatDto.afterMarketStartTime != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, nxtTradingHourFormatDto.afterMarketStartTime);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 5) || nxtTradingHourFormatDto.afterMarketSinglePriceEndTime != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, nxtTradingHourFormatDto.afterMarketSinglePriceEndTime);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 6)) {
            int i8 = onExtraCallbackWithResult + 15;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            if (nxtTradingHourFormatDto.afterMarketEndTime != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, nxtTradingHourFormatDto.afterMarketEndTime);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 7)) {
            int i10 = onNavigationEvent + 69;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            String str = nxtTradingHourFormatDto.closingPriceStartTime;
            if (i11 != 0) {
                int i12 = 37 / 0;
                if (str != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 7, getWriggleLayout.onNavigationEvent, nxtTradingHourFormatDto.closingPriceStartTime);
                }
            } else if (str != null) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 8) || nxtTradingHourFormatDto.closingPriceEndTime != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 8, getWriggleLayout.onNavigationEvent, nxtTradingHourFormatDto.closingPriceEndTime);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NxtTradingHourFormatDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15 = null;
        String str16 = (i & 1) != 0 ? null : str;
        if ((i & 2) != 0) {
            int i2 = onExtraCallbackWithResult + 125;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str10 = null;
        } else {
            str10 = str2;
        }
        if ((i & 4) != 0) {
            int i5 = 2 % 2;
            str11 = null;
        } else {
            str11 = str3;
        }
        String str17 = (i & 8) != 0 ? null : str4;
        if ((i & 16) != 0) {
            int i6 = onNavigationEvent + 25;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                str15.hashCode();
                throw null;
            }
            str12 = null;
        } else {
            str12 = str5;
        }
        if ((i & 32) != 0) {
            int i7 = onNavigationEvent + 119;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            str13 = null;
        } else {
            str13 = str6;
        }
        if ((i & 64) != 0) {
            int i10 = onExtraCallbackWithResult + 5;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            str14 = null;
        } else {
            str14 = str7;
        }
        String str18 = (i & 128) != 0 ? null : str8;
        if ((i & 256) != 0) {
            int i12 = onNavigationEvent + 109;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
            int i14 = 2 % 2;
        } else {
            str15 = str9;
        }
        this(str16, str10, str11, str17, str12, str13, str14, str18, str15);
    }

    public final CmpServiceImple onNavigationEvent(@Nullable LocalDate localDate) {
        ZonedDateTime zonedDateTime;
        ZonedDateTime zonedDateTimeOnNavigationEvent;
        ZonedDateTime zonedDateTimeOnNavigationEvent2;
        int i = 2 % 2;
        String str = this.preMarketStartTime;
        ZonedDateTime zonedDateTimeOnNavigationEvent3 = null;
        if (str != null) {
            int i2 = onExtraCallbackWithResult + 125;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                zonedDateTimeOnNavigationEvent2 = onFlowLoaded.onNavigationEvent(str, localDate);
                int i3 = 0 / 0;
            } else {
                zonedDateTimeOnNavigationEvent2 = onFlowLoaded.onNavigationEvent(str, localDate);
            }
            int i4 = onNavigationEvent + 93;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            zonedDateTime = zonedDateTimeOnNavigationEvent2;
        } else {
            zonedDateTime = null;
        }
        String str2 = this.preMarketEndTime;
        ZonedDateTime zonedDateTimeOnNavigationEvent4 = str2 != null ? onFlowLoaded.onNavigationEvent(str2, localDate) : null;
        String str3 = this.startTime;
        ZonedDateTime zonedDateTimeOnNavigationEvent5 = str3 != null ? onFlowLoaded.onNavigationEvent(str3, localDate) : null;
        String str4 = this.endTime;
        ZonedDateTime zonedDateTimeOnNavigationEvent6 = str4 != null ? onFlowLoaded.onNavigationEvent(str4, localDate) : null;
        String str5 = this.afterMarketStartTime;
        if (str5 != null) {
            int i6 = onExtraCallbackWithResult + 7;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            zonedDateTimeOnNavigationEvent = onFlowLoaded.onNavigationEvent(str5, localDate);
        } else {
            zonedDateTimeOnNavigationEvent = null;
        }
        String str6 = this.afterMarketSinglePriceEndTime;
        ZonedDateTime zonedDateTimeOnNavigationEvent7 = str6 != null ? onFlowLoaded.onNavigationEvent(str6, localDate) : null;
        String str7 = this.afterMarketEndTime;
        ZonedDateTime zonedDateTimeOnNavigationEvent8 = str7 != null ? onFlowLoaded.onNavigationEvent(str7, localDate) : null;
        String str8 = this.closingPriceStartTime;
        ZonedDateTime zonedDateTimeOnNavigationEvent9 = str8 != null ? onFlowLoaded.onNavigationEvent(str8, localDate) : null;
        String str9 = this.closingPriceEndTime;
        if (str9 != null) {
            int i8 = onExtraCallbackWithResult + 123;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            zonedDateTimeOnNavigationEvent3 = onFlowLoaded.onNavigationEvent(str9, localDate);
        }
        return new CmpServiceImple(zonedDateTime, zonedDateTimeOnNavigationEvent4, zonedDateTimeOnNavigationEvent5, zonedDateTimeOnNavigationEvent6, zonedDateTimeOnNavigationEvent, zonedDateTimeOnNavigationEvent9, zonedDateTimeOnNavigationEvent7, zonedDateTimeOnNavigationEvent3, zonedDateTimeOnNavigationEvent8);
    }
}
