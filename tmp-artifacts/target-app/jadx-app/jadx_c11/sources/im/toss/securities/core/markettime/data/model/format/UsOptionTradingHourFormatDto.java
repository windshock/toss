package im.toss.securities.core.markettime.data.model.format;

import j$.time.LocalDate;
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
import o.r8lambdaMUWFviAwG63NAOXs5uRjhC8duTA;
import o.showCmp;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class UsOptionTradingHourFormatDto implements showCmp<r8lambdaMUWFviAwG63NAOXs5uRjhC8duTA> {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final String afterEnd;
    private final String afterStart;
    private final String date;
    private final String endTime;
    private final LocalDate localDate;
    private final String preEnd;
    private final String preStart;
    private final String startTime;

    static {
        int i = onExtraCallback + 59;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public UsOptionTradingHourFormatDto() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 5;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof UsOptionTradingHourFormatDto)) {
            return false;
        }
        UsOptionTradingHourFormatDto usOptionTradingHourFormatDto = (UsOptionTradingHourFormatDto) obj;
        if (!Intrinsics.areEqual(this.date, usOptionTradingHourFormatDto.date) || !Intrinsics.areEqual(this.preStart, usOptionTradingHourFormatDto.preStart)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.preEnd, usOptionTradingHourFormatDto.preEnd)) {
            int i4 = IAuthTabCallback + 7;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.startTime, usOptionTradingHourFormatDto.startTime)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.endTime, usOptionTradingHourFormatDto.endTime)) {
            int i6 = onWarmupCompleted + 37;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (!Intrinsics.areEqual(this.afterStart, usOptionTradingHourFormatDto.afterStart)) {
            int i7 = onWarmupCompleted + 11;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.afterEnd, usOptionTradingHourFormatDto.afterEnd)) {
            return true;
        }
        int i9 = IAuthTabCallback + 87;
        onWarmupCompleted = i9 % 128;
        return i9 % 2 == 0;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.date;
        int iHashCode2 = 0;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.preStart;
        if (str2 == null) {
            int i2 = IAuthTabCallback + 45;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        String str3 = this.preEnd;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.startTime;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.endTime;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.afterStart;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.afterEnd;
        if (str7 != null) {
            int i4 = onWarmupCompleted + 3;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = str7.hashCode();
        }
        return (((((((((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UsOptionTradingHourFormatDto(date=" + this.date + ", preStart=" + this.preStart + ", preEnd=" + this.preEnd + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", afterStart=" + this.afterStart + ", afterEnd=" + this.afterEnd + ")";
        int i2 = IAuthTabCallback + 49;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 33 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<UsOptionTradingHourFormatDto> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 43;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            UsOptionTradingHourFormatDto$$serializer usOptionTradingHourFormatDto$$serializer = UsOptionTradingHourFormatDto$$serializer.INSTANCE;
            int i4 = onNavigationEvent + 19;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return usOptionTradingHourFormatDto$$serializer;
        }
    }

    public /* synthetic */ UsOptionTradingHourFormatDto(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, okycx okycxVar) {
        LocalDate localDate = null;
        if ((i & 1) == 0) {
            this.date = null;
        } else {
            this.date = str;
        }
        if ((i & 2) == 0) {
            this.preStart = null;
        } else {
            this.preStart = str2;
            int i2 = onWarmupCompleted + 29;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 3 % 4;
            } else {
                int i4 = 2 % 2;
            }
        }
        if ((i & 4) == 0) {
            int i5 = onWarmupCompleted + 109;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            this.preEnd = null;
        } else {
            this.preEnd = str3;
        }
        if ((i & 8) == 0) {
            int i7 = IAuthTabCallback + 37;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            this.startTime = null;
            if (i8 == 0) {
                int i9 = 0 / 0;
            }
        } else {
            this.startTime = str4;
        }
        if ((i & 16) == 0) {
            this.endTime = null;
        } else {
            this.endTime = str5;
        }
        if ((i & 32) == 0) {
            this.afterStart = null;
        } else {
            this.afterStart = str6;
            int i10 = IAuthTabCallback + 51;
            onWarmupCompleted = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 2 % 2;
            }
        }
        if ((i & 64) == 0) {
            this.afterEnd = null;
        } else {
            this.afterEnd = str7;
            int i12 = IAuthTabCallback + 77;
            onWarmupCompleted = i12 % 128;
            int i13 = i12 % 2;
        }
        int i14 = 2 % 2;
        String str8 = this.date;
        if (str8 != null) {
            localDate = LocalDate.parse(str8);
            int i15 = 2 % 2;
        }
        this.localDate = localDate;
    }

    public UsOptionTradingHourFormatDto(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        LocalDate localDate;
        this.date = str;
        this.preStart = str2;
        this.preEnd = str3;
        this.startTime = str4;
        this.endTime = str5;
        this.afterStart = str6;
        this.afterEnd = str7;
        if (str != null) {
            localDate = LocalDate.parse(str);
        } else {
            int i = onWarmupCompleted + 105;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
            localDate = null;
        }
        this.localDate = localDate;
        int i4 = IAuthTabCallback + 81;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onNavigationEvent(UsOptionTradingHourFormatDto usOptionTradingHourFormatDto, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || usOptionTradingHourFormatDto.date != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, usOptionTradingHourFormatDto.date);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || usOptionTradingHourFormatDto.preStart != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, usOptionTradingHourFormatDto.preStart);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i2 = IAuthTabCallback + 79;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (usOptionTradingHourFormatDto.preEnd != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, usOptionTradingHourFormatDto.preEnd);
                int i4 = IAuthTabCallback + 43;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
            int i6 = IAuthTabCallback + 55;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                String str = usOptionTradingHourFormatDto.startTime;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (usOptionTradingHourFormatDto.startTime != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, usOptionTradingHourFormatDto.startTime);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 4) || usOptionTradingHourFormatDto.endTime != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, usOptionTradingHourFormatDto.endTime);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 5) || usOptionTradingHourFormatDto.afterStart != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, usOptionTradingHourFormatDto.afterStart);
            int i7 = IAuthTabCallback + 33;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 6) || usOptionTradingHourFormatDto.afterEnd != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, usOptionTradingHourFormatDto.afterEnd);
        }
    }

    @Override // o.showCmp
    public /* synthetic */ r8lambdaMUWFviAwG63NAOXs5uRjhC8duTA IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent();
        }
        onNavigationEvent();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ UsOptionTradingHourFormatDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str8;
        String str9;
        String str10 = null;
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted;
            int i3 = i2 + 97;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 29;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            str = null;
        }
        String str11 = (i & 2) != 0 ? null : str2;
        String str12 = (i & 4) != 0 ? null : str3;
        if ((i & 8) != 0) {
            int i7 = 2 % 2;
            str8 = null;
        } else {
            str8 = str4;
        }
        String str13 = (i & 16) != 0 ? null : str5;
        if ((i & 32) != 0) {
            int i8 = 2 % 2;
            str9 = null;
        } else {
            str9 = str6;
        }
        if ((i & 64) != 0) {
            int i9 = 2 % 2;
        } else {
            str10 = str7;
        }
        this(str, str11, str12, str8, str13, str9, str10);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r8lambdaMUWFviAwG63NAOXs5uRjhC8duTA onNavigationEvent() {
        ZonedDateTime zonedDateTime;
        ZonedDateTime zonedDateTimeOnNavigationEvent;
        ZonedDateTime zonedDateTimeOnExtraCallbackWithResult;
        ZonedDateTime zonedDateTimeOnNavigationEvent2;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String str = this.startTime;
        ZonedDateTime zonedDateTimeOnExtraCallbackWithResult2 = null;
        ZonedDateTime zonedDateTimeOnNavigationEvent3 = str != null ? onFlowLoaded.onNavigationEvent(str, this.localDate) : null;
        LocalDate localDate = this.localDate;
        ZonedDateTime zonedDateTimeOnNavigationEvent4 = localDate != null ? isCivilized.onWarmupCompleted.onNavigationEvent(localDate) : null;
        String str2 = this.preStart;
        if (str2 != null) {
            ZonedDateTime zonedDateTimeOnNavigationEvent5 = onFlowLoaded.onNavigationEvent(str2, this.localDate);
            int i4 = onWarmupCompleted + 81;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            zonedDateTime = zonedDateTimeOnNavigationEvent5;
        } else {
            zonedDateTime = null;
        }
        String str3 = this.preEnd;
        if (str3 != null) {
            int i6 = IAuthTabCallback + 121;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                onFlowLoaded.onNavigationEvent(str3, this.localDate);
                throw null;
            }
            zonedDateTimeOnNavigationEvent = onFlowLoaded.onNavigationEvent(str3, this.localDate);
        } else {
            zonedDateTimeOnNavigationEvent = null;
        }
        String str4 = this.endTime;
        if (str4 != null) {
            int i7 = onWarmupCompleted + 107;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            ZonedDateTime zonedDateTimeOnNavigationEvent6 = onFlowLoaded.onNavigationEvent(str4, this.localDate);
            zonedDateTimeOnExtraCallbackWithResult = zonedDateTimeOnNavigationEvent6 != null ? onFlowLoaded.onExtraCallbackWithResult(zonedDateTimeOnNavigationEvent6, zonedDateTimeOnNavigationEvent3) : null;
        }
        String str5 = this.afterStart;
        ZonedDateTime zonedDateTimeOnExtraCallbackWithResult3 = (str5 == null || (zonedDateTimeOnNavigationEvent2 = onFlowLoaded.onNavigationEvent(str5, this.localDate)) == null) ? null : onFlowLoaded.onExtraCallbackWithResult(zonedDateTimeOnNavigationEvent2, zonedDateTimeOnNavigationEvent3);
        String str6 = this.afterEnd;
        if (str6 != null) {
            int i9 = IAuthTabCallback + 41;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            ZonedDateTime zonedDateTimeOnNavigationEvent7 = onFlowLoaded.onNavigationEvent(str6, this.localDate);
            if (zonedDateTimeOnNavigationEvent7 != null) {
                zonedDateTimeOnExtraCallbackWithResult2 = onFlowLoaded.onExtraCallbackWithResult(zonedDateTimeOnNavigationEvent7, zonedDateTimeOnNavigationEvent3);
                int i11 = IAuthTabCallback + 119;
                onWarmupCompleted = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 5 / 3;
                }
            }
        }
        return new r8lambdaMUWFviAwG63NAOXs5uRjhC8duTA(zonedDateTimeOnNavigationEvent4, zonedDateTime, zonedDateTimeOnNavigationEvent, zonedDateTimeOnNavigationEvent3, zonedDateTimeOnExtraCallbackWithResult, zonedDateTimeOnExtraCallbackWithResult3, zonedDateTimeOnExtraCallbackWithResult2);
    }
}
