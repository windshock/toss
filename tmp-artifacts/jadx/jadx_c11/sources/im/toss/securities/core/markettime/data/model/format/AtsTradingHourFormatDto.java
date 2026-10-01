package im.toss.securities.core.markettime.data.model.format;

import j$.time.LocalDate;
import j$.time.ZonedDateTime;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.CmpServiceImple;
import o.CmpServiceImplf;
import o.getWriggleLayout;
import o.isCivilized;
import o.liq;
import o.okycx;
import o.r8lambda33yZb1Yb9XyIB5h4msmQWceHb7I;
import o.showCmp;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AtsTradingHourFormatDto implements showCmp<r8lambda33yZb1Yb9XyIB5h4msmQWceHb7I> {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final String date;
    private final KrxTradingHourFormatDto krxEntireTradingHours;
    private final LocalDate localDate;
    private final NxtTradingHourFormatDto nxtEntireTradingHours;

    static {
        int i = onExtraCallback + 77;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            int i2 = 25 / 0;
        }
    }

    public AtsTradingHourFormatDto() {
        this((String) null, (KrxTradingHourFormatDto) null, (NxtTradingHourFormatDto) null, 7, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 63;
            onExtraCallbackWithResult = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof AtsTradingHourFormatDto)) {
            int i3 = onExtraCallbackWithResult + 121;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        AtsTradingHourFormatDto atsTradingHourFormatDto = (AtsTradingHourFormatDto) obj;
        if (!Intrinsics.areEqual(this.date, atsTradingHourFormatDto.date)) {
            int i5 = onExtraCallbackWithResult + 11;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.krxEntireTradingHours, atsTradingHourFormatDto.krxEntireTradingHours)) {
            return false;
        }
        if (Intrinsics.areEqual(this.nxtEntireTradingHours, atsTradingHourFormatDto.nxtEntireTradingHours)) {
            return true;
        }
        int i7 = onExtraCallbackWithResult + 117;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.date;
        int iHashCode2 = 0;
        if (str == null) {
            int i2 = onExtraCallbackWithResult + 115;
            IAuthTabCallback = i2 % 128;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        KrxTradingHourFormatDto krxTradingHourFormatDto = this.krxEntireTradingHours;
        int iHashCode3 = krxTradingHourFormatDto == null ? 0 : krxTradingHourFormatDto.hashCode();
        NxtTradingHourFormatDto nxtTradingHourFormatDto = this.nxtEntireTradingHours;
        if (nxtTradingHourFormatDto != null) {
            int i3 = onExtraCallbackWithResult + 53;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            iHashCode2 = nxtTradingHourFormatDto.hashCode();
        }
        return (((iHashCode * 31) + iHashCode3) * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AtsTradingHourFormatDto(date=" + this.date + ", krxEntireTradingHours=" + this.krxEntireTradingHours + ", nxtEntireTradingHours=" + this.nxtEntireTradingHours + ")";
        int i2 = onExtraCallbackWithResult + 21;
        IAuthTabCallback = i2 % 128;
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

        public final KSerializer<AtsTradingHourFormatDto> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 105;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            AtsTradingHourFormatDto$$serializer atsTradingHourFormatDto$$serializer = AtsTradingHourFormatDto$$serializer.INSTANCE;
            int i4 = onNavigationEvent + 111;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return atsTradingHourFormatDto$$serializer;
        }
    }

    public /* synthetic */ AtsTradingHourFormatDto(int i, String str, KrxTradingHourFormatDto krxTradingHourFormatDto, NxtTradingHourFormatDto nxtTradingHourFormatDto, okycx okycxVar) {
        LocalDate localDate = null;
        if ((i & 1) == 0) {
            this.date = null;
        } else {
            this.date = str;
            int i2 = onExtraCallbackWithResult + 85;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 5 / 3;
            } else {
                int i4 = 2 % 2;
            }
        }
        if ((i & 2) == 0) {
            this.krxEntireTradingHours = null;
            int i5 = 2 % 2;
        } else {
            this.krxEntireTradingHours = krxTradingHourFormatDto;
        }
        if ((i & 4) == 0) {
            this.nxtEntireTradingHours = null;
        } else {
            this.nxtEntireTradingHours = nxtTradingHourFormatDto;
        }
        String str2 = this.date;
        if (str2 != null) {
            localDate = LocalDate.parse(str2);
            int i6 = onExtraCallbackWithResult + 73;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 2;
            }
        }
        this.localDate = localDate;
    }

    public AtsTradingHourFormatDto(@Nullable String str, @Nullable KrxTradingHourFormatDto krxTradingHourFormatDto, @Nullable NxtTradingHourFormatDto nxtTradingHourFormatDto) {
        LocalDate localDate;
        this.date = str;
        this.krxEntireTradingHours = krxTradingHourFormatDto;
        this.nxtEntireTradingHours = nxtTradingHourFormatDto;
        if (str != null) {
            localDate = LocalDate.parse(str);
        } else {
            int i = onExtraCallbackWithResult + 105;
            IAuthTabCallback = i % 128;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
            localDate = null;
        }
        this.localDate = localDate;
        int i3 = IAuthTabCallback + 79;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onNavigationEvent(AtsTradingHourFormatDto atsTradingHourFormatDto, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i2 = onExtraCallbackWithResult + 15;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (atsTradingHourFormatDto.date != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, atsTradingHourFormatDto.date);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || atsTradingHourFormatDto.krxEntireTradingHours != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, KrxTradingHourFormatDto$$serializer.INSTANCE, atsTradingHourFormatDto.krxEntireTradingHours);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || atsTradingHourFormatDto.nxtEntireTradingHours != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, NxtTradingHourFormatDto$$serializer.INSTANCE, atsTradingHourFormatDto.nxtEntireTradingHours);
        }
        int i4 = onExtraCallbackWithResult + 75;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.showCmp
    public /* synthetic */ r8lambda33yZb1Yb9XyIB5h4msmQWceHb7I IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        r8lambda33yZb1Yb9XyIB5h4msmQWceHb7I r8lambda33yzb1yb9xyib5h4msmqwcehb7iOnExtraCallback = onExtraCallback();
        int i4 = onExtraCallbackWithResult + 57;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return r8lambda33yzb1yb9xyib5h4msmqwcehb7iOnExtraCallback;
        }
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AtsTradingHourFormatDto(String str, KrxTradingHourFormatDto krxTradingHourFormatDto, NxtTradingHourFormatDto nxtTradingHourFormatDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 3;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            str = null;
        }
        if ((i & 2) != 0) {
            int i3 = onExtraCallbackWithResult;
            int i4 = i3 + 79;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 81;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            krxTradingHourFormatDto = null;
        }
        this(str, krxTradingHourFormatDto, (i & 4) != 0 ? null : nxtTradingHourFormatDto);
    }

    public r8lambda33yZb1Yb9XyIB5h4msmQWceHb7I onExtraCallback() {
        ZonedDateTime zonedDateTimeOnNavigationEvent;
        CmpServiceImplf cmpServiceImplfOnExtraCallback;
        int i = 2 % 2;
        LocalDate localDate = this.localDate;
        CmpServiceImple cmpServiceImpleOnNavigationEvent = null;
        if (localDate != null) {
            zonedDateTimeOnNavigationEvent = isCivilized.onWarmupCompleted.onNavigationEvent(localDate);
        } else {
            int i2 = IAuthTabCallback + 27;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            zonedDateTimeOnNavigationEvent = null;
        }
        KrxTradingHourFormatDto krxTradingHourFormatDto = this.krxEntireTradingHours;
        if (krxTradingHourFormatDto != null) {
            int i4 = onExtraCallbackWithResult + 45;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                krxTradingHourFormatDto.onExtraCallback(this.localDate);
                throw null;
            }
            cmpServiceImplfOnExtraCallback = krxTradingHourFormatDto.onExtraCallback(this.localDate);
        } else {
            cmpServiceImplfOnExtraCallback = null;
        }
        NxtTradingHourFormatDto nxtTradingHourFormatDto = this.nxtEntireTradingHours;
        if (nxtTradingHourFormatDto != null) {
            int i5 = IAuthTabCallback + 23;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            cmpServiceImpleOnNavigationEvent = nxtTradingHourFormatDto.onNavigationEvent(this.localDate);
        }
        return new r8lambda33yZb1Yb9XyIB5h4msmQWceHb7I(zonedDateTimeOnNavigationEvent, cmpServiceImplfOnExtraCallback, cmpServiceImpleOnNavigationEvent);
    }
}
