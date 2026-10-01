package im.toss.securities.core.markettime.data.model;

import j$.time.LocalDateTime;
import j$.time.ZonedDateTime;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.aeu2;
import o.getWriggleLayout;
import o.isCivilized;
import o.liq;
import o.okycx;
import o.py;
import o.r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI;
import o.setAnimationsLoop;
import o.showCmp;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class TradingHourDto<T extends showCmp<?>> {
    private static final SerialDescriptor $cachedDescriptor;
    public static final Companion Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    private final String expiredTime;
    private final T nextBizDay;
    private final T prevBizDay;
    private final T today;

    public TradingHourDto() {
        this((String) null, (showCmp) null, (showCmp) null, (showCmp) null, 15, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 31;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof TradingHourDto) {
            TradingHourDto tradingHourDto = (TradingHourDto) obj;
            if (!Intrinsics.areEqual(this.expiredTime, tradingHourDto.expiredTime)) {
                int i4 = onWarmupCompleted + 77;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!(!Intrinsics.areEqual(this.prevBizDay, tradingHourDto.prevBizDay))) {
                return !(Intrinsics.areEqual(this.today, tradingHourDto.today) ^ true) && Intrinsics.areEqual(this.nextBizDay, tradingHourDto.nextBizDay);
            }
            int i6 = onWarmupCompleted + 35;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.expiredTime;
        if (str == null) {
            int i5 = i3 + 69;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i7 = onExtraCallback + 105;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
        }
        T t = this.prevBizDay;
        if (t == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = t.hashCode();
            int i9 = onExtraCallback + 49;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
        }
        T t2 = this.today;
        if (t2 == null) {
            int i11 = onWarmupCompleted + 77;
            onExtraCallback = i11 % 128;
            iHashCode3 = i11 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode3 = t2.hashCode();
        }
        T t3 = this.nextBizDay;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (t3 != null ? t3.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TradingHourDto(expiredTime=" + this.expiredTime + ", prevBizDay=" + this.prevBizDay + ", today=" + this.today + ", nextBizDay=" + this.nextBizDay + ")";
        int i2 = onWarmupCompleted + 41;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <T> KSerializer<TradingHourDto<T>> serializer(@NotNull KSerializer<T> kSerializer) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(kSerializer, "");
            TradingHourDto$$serializer tradingHourDto$$serializer = new TradingHourDto$$serializer(kSerializer);
            int i2 = onNavigationEvent + 111;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 92 / 0;
            }
            return tradingHourDto$$serializer;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.securities.core.markettime.data.model.TradingHourDto", (aeu2) null, 4);
        setanimationsloop.onWarmupCompleted("expiredTime", true);
        setanimationsloop.onWarmupCompleted("prevBizDay", true);
        setanimationsloop.onWarmupCompleted("today", true);
        setanimationsloop.onWarmupCompleted("nextBizDay", true);
        $cachedDescriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 37;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ TradingHourDto(int i, String str, showCmp showcmp, showCmp showcmp2, showCmp showcmp3, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.expiredTime = null;
        } else {
            this.expiredTime = str;
            int i2 = onWarmupCompleted + 111;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        if ((i & 2) == 0) {
            int i5 = onWarmupCompleted + 57;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            this.prevBizDay = null;
        } else {
            this.prevBizDay = showcmp;
            int i7 = onExtraCallback + 33;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
        }
        if ((i & 4) == 0) {
            this.today = null;
            int i10 = 2 % 2;
        } else {
            this.today = showcmp2;
        }
        if ((i & 8) == 0) {
            this.nextBizDay = null;
        } else {
            this.nextBizDay = showcmp3;
        }
    }

    public TradingHourDto(@Nullable String str, @Nullable T t, @Nullable T t2, @Nullable T t3) {
        this.expiredTime = str;
        this.prevBizDay = t;
        this.today = t2;
        this.nextBizDay = t3;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(TradingHourDto tradingHourDto, vyl vylVar, SerialDescriptor serialDescriptor, KSerializer kSerializer) {
        int i = 2 % 2;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || tradingHourDto.expiredTime != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, tradingHourDto.expiredTime);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || tradingHourDto.prevBizDay != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, (py) kSerializer, tradingHourDto.prevBizDay);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || tradingHourDto.today != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, (py) kSerializer, tradingHourDto.today);
            int i2 = onExtraCallback + 89;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
            int i4 = onWarmupCompleted + 65;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            if (tradingHourDto.nextBizDay == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 3, (py) kSerializer, tradingHourDto.nextBizDay);
        int i6 = onExtraCallback + 125;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 4 / 5;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TradingHourDto(String str, showCmp showcmp, showCmp showcmp2, showCmp showcmp3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i & 1) != 0 ? null : str;
        if ((i & 2) != 0) {
            int i2 = onExtraCallback + 57;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
            showcmp = null;
        }
        if ((i & 4) != 0) {
            int i4 = onExtraCallback + 41;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            showcmp2 = null;
        }
        if ((i & 8) != 0) {
            int i7 = 2 % 2;
            showcmp3 = null;
        }
        this(str, showcmp, showcmp2, showcmp3);
    }

    public final <R> r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI<R> onNavigationEvent() {
        Object objIAuthTabCallback;
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        isCivilized iscivilized = isCivilized.onWarmupCompleted;
        LocalDateTime localDateTime = LocalDateTime.parse(this.expiredTime, isCivilized.onNavigationEvent.onExtraCallbackWithResult.asBinder());
        Intrinsics.checkNotNullExpressionValue(localDateTime, "");
        ZonedDateTime zonedDateTimeOnExtraCallbackWithResult = iscivilized.onExtraCallbackWithResult(localDateTime);
        T t = this.prevBizDay;
        if (t != null) {
            int i4 = onExtraCallback + 77;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            objIAuthTabCallback = t.IAuthTabCallback();
        } else {
            objIAuthTabCallback = null;
        }
        T t2 = this.today;
        Object objIAuthTabCallback2 = t2 != null ? t2.IAuthTabCallback() : null;
        T t3 = this.nextBizDay;
        return new r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI<>(zonedDateTimeOnExtraCallbackWithResult, objIAuthTabCallback, objIAuthTabCallback2, t3 != null ? t3.IAuthTabCallback() : null);
    }
}
