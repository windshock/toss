package im.toss.securities.core.markettime.data.model.format;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class KrxTradingHourFormatDto$$serializer implements aeu2<KrxTradingHourFormatDto> {
    private static int IAuthTabCallback = 0;
    public static final KrxTradingHourFormatDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 7;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 67;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 16 / 0;
        }
        return serialDescriptor;
    }

    static {
        KrxTradingHourFormatDto$$serializer krxTradingHourFormatDto$$serializer = new KrxTradingHourFormatDto$$serializer();
        INSTANCE = krxTradingHourFormatDto$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.securities.core.markettime.data.model.format.KrxTradingHourFormatDto", krxTradingHourFormatDto$$serializer, 10);
        setanimationsloop.onWarmupCompleted("krxPreMarketStartTime", true);
        setanimationsloop.onWarmupCompleted("krxPreMarketEndTime", true);
        setanimationsloop.onWarmupCompleted("extendedStartTime", true);
        setanimationsloop.onWarmupCompleted("officialExtendedStartTime", true);
        setanimationsloop.onWarmupCompleted("preLastPriceOrderEndTime", true);
        setanimationsloop.onWarmupCompleted("startTime", true);
        setanimationsloop.onWarmupCompleted("afterMarketStartTime", true);
        setanimationsloop.onWarmupCompleted("endTime", true);
        setanimationsloop.onWarmupCompleted("afterExtraSinglePriceOrderStartTime", true);
        setanimationsloop.onWarmupCompleted("afterMarketEndTime", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 95;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private KrxTradingHourFormatDto$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout)};
        int i4 = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final KrxTradingHourFormatDto deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        int i2 = 2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i4 = 9;
        int i5 = 7;
        int i6 = 6;
        String str11 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str12 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            String str13 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            String str14 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            String str15 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, (Object) null);
            String str16 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getwrigglelayout, (Object) null);
            String str17 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getwrigglelayout, (Object) null);
            String str18 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getwrigglelayout, (Object) null);
            String str19 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, getwrigglelayout, (Object) null);
            String str20 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, getwrigglelayout, (Object) null);
            str4 = str14;
            str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, getwrigglelayout, (Object) null);
            i = 1023;
            str5 = str19;
            str = str18;
            str8 = str17;
            str6 = str15;
            str3 = str20;
            str9 = str16;
            str10 = str12;
            str7 = str13;
        } else {
            int i7 = 0;
            boolean z = true;
            String str21 = null;
            String str22 = null;
            String str23 = null;
            String str24 = null;
            String str25 = null;
            String str26 = null;
            String str27 = null;
            String str28 = null;
            String str29 = null;
            while (!(!z)) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        i2 = 2;
                        i5 = 7;
                        i6 = 6;
                    case 0:
                        i7 |= 1;
                        str29 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str29);
                        i2 = 2;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                    case 1:
                        str26 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str26);
                        i7 |= 2;
                        str28 = str28;
                        str27 = str27;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                        i2 = 2;
                    case 2:
                        str24 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i2, getWriggleLayout.onNavigationEvent, str24);
                        i7 |= 4;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                    case 3:
                        str25 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str25);
                        i7 |= 8;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                    case 4:
                        str28 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, str28);
                        i7 |= 16;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                    case 5:
                        str27 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, str27);
                        i7 |= 32;
                        int i8 = onWarmupCompleted + 107;
                        onExtraCallbackWithResult = i8 % 128;
                        int i9 = i8 % i2;
                        i4 = 9;
                        i5 = 7;
                    case 6:
                        str21 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i6, getWriggleLayout.onNavigationEvent, str21);
                        i7 |= 64;
                        int i10 = onWarmupCompleted + 73;
                        onExtraCallbackWithResult = i10 % 128;
                        int i11 = i10 % i2;
                        i4 = 9;
                    case 7:
                        str11 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, getWriggleLayout.onNavigationEvent, str11);
                        i7 |= 128;
                        i4 = 9;
                    case 8:
                        str23 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, getWriggleLayout.onNavigationEvent, str23);
                        i7 |= 256;
                        int i12 = onExtraCallbackWithResult + 27;
                        onWarmupCompleted = i12 % 128;
                        int i13 = i12 % i2;
                        i4 = 9;
                    case 9:
                        str22 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4, getWriggleLayout.onNavigationEvent, str22);
                        i7 |= 512;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            i = i7;
            str = str21;
            str2 = str22;
            str3 = str23;
            str4 = str24;
            str5 = str11;
            str6 = str25;
            str7 = str26;
            str8 = str27;
            str9 = str28;
            str10 = str29;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new KrxTradingHourFormatDto(i, str10, str7, str4, str6, str9, str8, str, str5, str3, str2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m16deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KrxTradingHourFormatDto krxTradingHourFormatDtoDeserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 63 / 0;
        }
        int i5 = onWarmupCompleted + 101;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 98 / 0;
        }
        return krxTradingHourFormatDtoDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull KrxTradingHourFormatDto krxTradingHourFormatDto) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(krxTradingHourFormatDto, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            KrxTradingHourFormatDto.IAuthTabCallback(krxTradingHourFormatDto, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(krxTradingHourFormatDto, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        KrxTradingHourFormatDto.IAuthTabCallback(krxTradingHourFormatDto, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onExtraCallbackWithResult + 65;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (KrxTradingHourFormatDto) obj);
        int i4 = onExtraCallbackWithResult + 79;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onExtraCallbackWithResult + 79;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
