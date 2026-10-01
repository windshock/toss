package im.toss.securities.core.markettime.data.model;

import im.toss.securities.core.markettime.data.model.IntegratedTradingHoursDto$;
import im.toss.securities.core.markettime.data.model.TradingHourDto;
import im.toss.securities.core.markettime.data.model.format.AtsTradingHourFormatDto;
import im.toss.securities.core.markettime.data.model.format.AtsTradingHourFormatDto$$serializer;
import im.toss.securities.core.markettime.data.model.format.UsOptionTradingHourFormatDto;
import im.toss.securities.core.markettime.data.model.format.UsOptionTradingHourFormatDto$$serializer;
import im.toss.securities.core.markettime.data.model.format.UsTradingHourFormatDto;
import im.toss.securities.core.markettime.data.model.format.UsTradingHourFormatDto$$serializer;
import im.toss.splittarget.impl.fsm.AppStateImpl$$ExternalSyntheticLambda11;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.CmpServiceImpla;
import o.TombstoneProtosMemoryMappingBuilder;
import o.liq;
import o.okycx;
import o.py;
import o.r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class IntegratedTradingHoursDto {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final TradingHourDto<AtsTradingHourFormatDto> ats;
    private final TradingHourDto<UsTradingHourFormatDto> us;
    private final TradingHourDto<UsOptionTradingHourFormatDto> usOption;

    public IntegratedTradingHoursDto() {
        this((TradingHourDto) null, (TradingHourDto) null, (TradingHourDto) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerAsBinder = asBinder();
        int i4 = onExtraCallback + 13;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerAsBinder;
    }

    public static /* synthetic */ r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI IAuthTabCallback(IntegratedTradingHoursDto integratedTradingHoursDto) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI r8lambda2j9lipp92ma1c2mcw_pcdv6p7wiOnWarmupCompleted = onWarmupCompleted(integratedTradingHoursDto);
        if (i3 == 0) {
            int i4 = 89 / 0;
        }
        int i5 = onExtraCallbackWithResult + 13;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return r8lambda2j9lipp92ma1c2mcw_pcdv6p7wiOnWarmupCompleted;
    }

    private static final /* synthetic */ KSerializer asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerSerializer = TradingHourDto.Companion.serializer(UsOptionTradingHourFormatDto$$serializer.INSTANCE);
        int i4 = onExtraCallbackWithResult + 43;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerSerializer;
    }

    private static final /* synthetic */ KSerializer asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        TradingHourDto.Companion companion = TradingHourDto.Companion;
        if (i3 == 0) {
            return companion.serializer(UsTradingHourFormatDto$$serializer.INSTANCE);
        }
        companion.serializer(UsTradingHourFormatDto$$serializer.INSTANCE);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnTransact = onTransact();
        if (i3 == 0) {
            int i4 = 60 / 0;
        }
        return kSerializerOnTransact;
    }

    public static /* synthetic */ r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI onExtraCallback(IntegratedTradingHoursDto integratedTradingHoursDto) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI r8lambda2j9lipp92ma1c2mcw_pcdv6p7wiIAuthTabCallbackStub = IAuthTabCallbackStub(integratedTradingHoursDto);
        int i4 = onExtraCallbackWithResult + 79;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return r8lambda2j9lipp92ma1c2mcw_pcdv6p7wiIAuthTabCallbackStub;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        KSerializer kSerializerAsInterface;
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerAsInterface = asInterface();
            int i3 = 78 / 0;
        } else {
            kSerializerAsInterface = asInterface();
        }
        int i4 = onExtraCallback + 19;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerAsInterface;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i;
        int i8 = (~(i7 | i4)) | i2;
        int i9 = ~i4;
        int i10 = i7 | i2;
        int i11 = (~(i | i9 | i2)) | (~(i10 | i4));
        int i12 = (~i10) | (~(i9 | (~i2)));
        int i13 = i2 + i4 + i3 + (1353909401 * i6) + ((-1351514252) * i5);
        int i14 = i13 * i13;
        int i15 = (1883508457 * i2) + 799145984 + ((-1483212659) * i4) + (2050486552 * i8) + (i11 * 1122240372) + (1122240372 * i12) + ((-360972288) * i3) + (337379328 * i6) + ((-1540358144) * i5) + (669122560 * i14);
        int i16 = ((i2 * 521834465) - 1171472169) + (i4 * 521833829) + (i8 * (-424)) + (i11 * 212) + (i12 * 212) + (i3 * 521834041) + (i6 * 1123214353) + (i5 * (-684621612)) + (i14 * 1028784128);
        int i17 = i15 + (i16 * i16 * 1635647488);
        return i17 != 1 ? i17 != 2 ? IAuthTabCallback(objArr) : onWarmupCompleted(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI onNavigationEvent(IntegratedTradingHoursDto integratedTradingHoursDto) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(integratedTradingHoursDto);
        }
        onExtraCallbackWithResult(integratedTradingHoursDto);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ KSerializer onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TradingHourDto.Companion companion = TradingHourDto.Companion;
        if (i3 != 0) {
            return companion.serializer(AtsTradingHourFormatDto$$serializer.INSTANCE);
        }
        int i4 = 71 / 0;
        return companion.serializer(AtsTradingHourFormatDto$$serializer.INSTANCE);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        String str = (String) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, th);
        if (i3 != 0) {
            int i4 = 88 / 0;
        }
        return unitIAuthTabCallback;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 63;
            onExtraCallbackWithResult = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof IntegratedTradingHoursDto)) {
            return false;
        }
        IntegratedTradingHoursDto integratedTradingHoursDto = (IntegratedTradingHoursDto) obj;
        if (!Intrinsics.areEqual(this.us, integratedTradingHoursDto.us)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.ats, integratedTradingHoursDto.ats)) {
            int i3 = onExtraCallback + 63;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.usOption, integratedTradingHoursDto.usOption)) {
            return true;
        }
        int i5 = onExtraCallbackWithResult + 37;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        TradingHourDto<UsTradingHourFormatDto> tradingHourDto = this.us;
        int iHashCode3 = 0;
        if (tradingHourDto == null) {
            int i2 = onExtraCallbackWithResult + 17;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = tradingHourDto.hashCode();
        }
        TradingHourDto<AtsTradingHourFormatDto> tradingHourDto2 = this.ats;
        if (tradingHourDto2 == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = tradingHourDto2.hashCode();
            int i4 = onExtraCallbackWithResult + 13;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        TradingHourDto<UsOptionTradingHourFormatDto> tradingHourDto3 = this.usOption;
        if (tradingHourDto3 != null) {
            int i6 = onExtraCallbackWithResult + 51;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            iHashCode3 = tradingHourDto3.hashCode();
        }
        int i8 = (((iHashCode * 31) + iHashCode2) * 31) + iHashCode3;
        int i9 = onExtraCallbackWithResult + 53;
        onExtraCallback = i9 % 128;
        if (i9 % 2 == 0) {
            return i8;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "IntegratedTradingHoursDto(us=" + this.us + ", ats=" + this.ats + ", usOption=" + this.usOption + ")";
        int i2 = onExtraCallback + 111;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 58 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<IntegratedTradingHoursDto> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 31;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            IntegratedTradingHoursDto$.serializer serializerVar = IntegratedTradingHoursDto$.serializer.INSTANCE;
            if (i3 == 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.securities.core.markettime.data.model.IntegratedTradingHoursDto$$ExternalSyntheticLambda3
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 7;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnExtraCallbackWithResult = IntegratedTradingHoursDto.onExtraCallbackWithResult();
                int i4 = onExtraCallbackWithResult + 19;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnExtraCallbackWithResult;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.securities.core.markettime.data.model.IntegratedTradingHoursDto$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 55;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = new Object[0];
                int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
                int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
                int iOnWarmupCompleted3 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
                int iOnWarmupCompleted4 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
                if (i3 != 0) {
                    throw null;
                }
                KSerializer kSerializer = (KSerializer) IntegratedTradingHoursDto.onNavigationEvent(iOnWarmupCompleted, 294066860, iOnWarmupCompleted2, -294066859, iOnWarmupCompleted4, iOnWarmupCompleted3, objArr);
                int i4 = onExtraCallbackWithResult + 47;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return kSerializer;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.securities.core.markettime.data.model.IntegratedTradingHoursDto$$ExternalSyntheticLambda5
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 97;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerIAuthTabCallback = IntegratedTradingHoursDto.IAuthTabCallback();
                int i4 = onExtraCallback + 9;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerIAuthTabCallback;
            }
        })};
        int i = onNavigationEvent + 115;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ IntegratedTradingHoursDto(int i, TradingHourDto tradingHourDto, TradingHourDto tradingHourDto2, TradingHourDto tradingHourDto3, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.us = null;
            int i2 = onExtraCallback + 43;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        } else {
            this.us = tradingHourDto;
        }
        if ((i & 2) == 0) {
            this.ats = null;
        } else {
            this.ats = tradingHourDto2;
        }
        if ((i & 4) != 0) {
            this.usOption = tradingHourDto3;
            return;
        }
        this.usOption = null;
        int i4 = onExtraCallback + 57;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 81 / 0;
        }
    }

    public IntegratedTradingHoursDto(@Nullable TradingHourDto<UsTradingHourFormatDto> tradingHourDto, @Nullable TradingHourDto<AtsTradingHourFormatDto> tradingHourDto2, @Nullable TradingHourDto<UsOptionTradingHourFormatDto> tradingHourDto3) {
        this.us = tradingHourDto;
        this.ats = tradingHourDto2;
        this.usOption = tradingHourDto3;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        IntegratedTradingHoursDto integratedTradingHoursDto = (IntegratedTradingHoursDto) objArr[0];
        vyl vylVar = (vyl) objArr[1];
        SerialDescriptor serialDescriptor = (SerialDescriptor) objArr[2];
        int i = 2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || integratedTradingHoursDto.us != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, (py) lazyArr[0].getValue(), integratedTradingHoursDto.us);
        }
        Object obj = null;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i2 = onExtraCallback + 13;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                TradingHourDto<AtsTradingHourFormatDto> tradingHourDto = integratedTradingHoursDto.ats;
                obj.hashCode();
                throw null;
            }
            if (integratedTradingHoursDto.ats != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 1, (py) lazyArr[1].getValue(), integratedTradingHoursDto.ats);
                int i3 = onExtraCallback + 115;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        if (!(true ^ vylVar.onWarmupCompleted(serialDescriptor, 2)) || integratedTradingHoursDto.usOption != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, (py) lazyArr[2].getValue(), integratedTradingHoursDto.usOption);
        }
        int i5 = onExtraCallback + 53;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 38 / 0;
        }
        return null;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (i3 == 0) {
            int i4 = 46 / 0;
        }
        return lazyArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ IntegratedTradingHoursDto(TradingHourDto tradingHourDto, TradingHourDto tradingHourDto2, TradingHourDto tradingHourDto3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = null;
        tradingHourDto = (i & 1) != 0 ? null : tradingHourDto;
        if ((i & 2) != 0) {
            int i2 = onExtraCallbackWithResult + 49;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i3 = 2 % 2;
            tradingHourDto2 = null;
        }
        if ((i & 4) != 0) {
            int i4 = onExtraCallbackWithResult + 95;
            int i5 = i4 % 128;
            onExtraCallback = i5;
            if (i4 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i6 = i5 + 75;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 2;
            }
            tradingHourDto3 = null;
        }
        this(tradingHourDto, tradingHourDto2, tradingHourDto3);
    }

    public final CmpServiceImpla onNavigationEvent() {
        r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi;
        r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI r8lambda2j9lipp92ma1c2mcw_pcdv6p7wiOnNavigationEvent;
        int i = 2 % 2;
        TradingHourDto<UsTradingHourFormatDto> tradingHourDto = this.us;
        Object obj = null;
        r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI r8lambda2j9lipp92ma1c2mcw_pcdv6p7wiOnNavigationEvent2 = tradingHourDto != null ? tradingHourDto.onNavigationEvent() : null;
        TradingHourDto<AtsTradingHourFormatDto> tradingHourDto2 = this.ats;
        r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI r8lambda2j9lipp92ma1c2mcw_pcdv6p7wiOnNavigationEvent3 = tradingHourDto2 != null ? tradingHourDto2.onNavigationEvent() : null;
        TradingHourDto<UsOptionTradingHourFormatDto> tradingHourDto3 = this.usOption;
        if (tradingHourDto3 != null) {
            int i2 = onExtraCallbackWithResult + 51;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                r8lambda2j9lipp92ma1c2mcw_pcdv6p7wiOnNavigationEvent = tradingHourDto3.onNavigationEvent();
                int i3 = 18 / 0;
            } else {
                r8lambda2j9lipp92ma1c2mcw_pcdv6p7wiOnNavigationEvent = tradingHourDto3.onNavigationEvent();
            }
            r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi = r8lambda2j9lipp92ma1c2mcw_pcdv6p7wiOnNavigationEvent;
        } else {
            r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi = null;
        }
        CmpServiceImpla cmpServiceImpla = new CmpServiceImpla(r8lambda2j9lipp92ma1c2mcw_pcdv6p7wiOnNavigationEvent2, r8lambda2j9lipp92ma1c2mcw_pcdv6p7wiOnNavigationEvent3, r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi, null, 8, null);
        int i4 = onExtraCallback + 91;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return cmpServiceImpla;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(String str, Throwable th) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 75;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final <T> T onExtraCallbackWithResult(Set<String> set, Function2<? super String, ? super Throwable, Unit> function2, String str, Function0<? extends T> function0) {
        T t;
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            t = (T) Result.constructor-impl(function0.invoke());
            int i4 = onExtraCallback + 113;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            t = (T) Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(t);
        if (th2 != null) {
            int i6 = onExtraCallbackWithResult + 37;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            set.add(str);
            function2.invoke(str, th2);
        }
        if (!Result.onExtraCallback(t)) {
            return t;
        }
        int i8 = onExtraCallback + 101;
        onExtraCallbackWithResult = i8 % 128;
        int i9 = i8 % 2;
        return null;
    }

    private static final r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI onExtraCallbackWithResult(IntegratedTradingHoursDto integratedTradingHoursDto) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 41;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        TradingHourDto<UsTradingHourFormatDto> tradingHourDto = integratedTradingHoursDto.us;
        if (tradingHourDto == null) {
            return null;
        }
        int i5 = i2 + 75;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return tradingHourDto.onNavigationEvent();
    }

    private static final r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI onWarmupCompleted(IntegratedTradingHoursDto integratedTradingHoursDto) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        TradingHourDto<AtsTradingHourFormatDto> tradingHourDto = integratedTradingHoursDto.ats;
        if (tradingHourDto == null) {
            return null;
        }
        int i5 = i3 + 123;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return tradingHourDto.onNavigationEvent();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        r1 = r1 + 83;
        im.toss.securities.core.markettime.data.model.IntegratedTradingHoursDto.onExtraCallbackWithResult = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if ((r1 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        r0 = 63 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r4 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r4 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        return r4.onNavigationEvent();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI IAuthTabCallbackStub(IntegratedTradingHoursDto integratedTradingHoursDto) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 89;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        TradingHourDto<UsOptionTradingHourFormatDto> tradingHourDto = integratedTradingHoursDto.usOption;
        if (i4 == 0) {
            int i5 = 4 / 0;
        }
    }

    public final CmpServiceImpla onNavigationEvent(@NotNull Function2<? super String, ? super Throwable, Unit> function2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function2, "");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        CmpServiceImpla cmpServiceImpla = new CmpServiceImpla((r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI) onExtraCallbackWithResult(linkedHashSet, function2, "us", new Function0() { // from class: im.toss.securities.core.markettime.data.model.IntegratedTradingHoursDto$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 119;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI r8lambda2j9lipp92ma1c2mcw_pcdv6p7wiOnNavigationEvent = IntegratedTradingHoursDto.onNavigationEvent(this.f$0);
                if (i4 == 0) {
                    int i5 = 64 / 0;
                }
                return r8lambda2j9lipp92ma1c2mcw_pcdv6p7wiOnNavigationEvent;
            }
        }), (r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI) onExtraCallbackWithResult(linkedHashSet, function2, "ats", new Function0() { // from class: im.toss.securities.core.markettime.data.model.IntegratedTradingHoursDto$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 113;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI r8lambda2j9lipp92ma1c2mcw_pcdv6p7wiIAuthTabCallback = IntegratedTradingHoursDto.IAuthTabCallback(this.f$0);
                int i5 = onExtraCallbackWithResult + 119;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    return r8lambda2j9lipp92ma1c2mcw_pcdv6p7wiIAuthTabCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }), (r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI) onExtraCallbackWithResult(linkedHashSet, function2, "us_option", new Function0() { // from class: im.toss.securities.core.markettime.data.model.IntegratedTradingHoursDto$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 123;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI r8lambda2j9lipp92ma1c2mcw_pcdv6p7wiOnExtraCallback = IntegratedTradingHoursDto.onExtraCallback(this.f$0);
                if (i4 != 0) {
                    int i5 = 29 / 0;
                }
                return r8lambda2j9lipp92ma1c2mcw_pcdv6p7wiOnExtraCallback;
            }
        }), linkedHashSet);
        int i2 = onExtraCallbackWithResult + 5;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return cmpServiceImpla;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        return (KSerializer) onNavigationEvent(iOnWarmupCompleted, 294066860, iOnWarmupCompleted2, -294066859, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, new Object[0]);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, Throwable th) {
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) onNavigationEvent(iOnWarmupCompleted, -1113359247, iOnWarmupCompleted2, 1113359249, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{str, th});
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(IntegratedTradingHoursDto integratedTradingHoursDto, vyl vylVar, SerialDescriptor serialDescriptor) {
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        onNavigationEvent(iOnWarmupCompleted, 402349289, iOnWarmupCompleted2, -402349289, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{integratedTradingHoursDto, vylVar, serialDescriptor});
    }
}
