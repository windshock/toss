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
public final /* synthetic */ class NxtTradingHourFormatDto$$serializer implements aeu2<NxtTradingHourFormatDto> {
    public static final NxtTradingHourFormatDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 55;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        NxtTradingHourFormatDto$$serializer nxtTradingHourFormatDto$$serializer = new NxtTradingHourFormatDto$$serializer();
        INSTANCE = nxtTradingHourFormatDto$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.securities.core.markettime.data.model.format.NxtTradingHourFormatDto", nxtTradingHourFormatDto$$serializer, 9);
        setanimationsloop.onWarmupCompleted("preMarketStartTime", true);
        setanimationsloop.onWarmupCompleted("preMarketEndTime", true);
        setanimationsloop.onWarmupCompleted("startTime", true);
        setanimationsloop.onWarmupCompleted("endTime", true);
        setanimationsloop.onWarmupCompleted("afterMarketStartTime", true);
        setanimationsloop.onWarmupCompleted("afterMarketSinglePriceEndTime", true);
        setanimationsloop.onWarmupCompleted("afterMarketEndTime", true);
        setanimationsloop.onWarmupCompleted("closingPriceStartTime", true);
        setanimationsloop.onWarmupCompleted("closingPriceEndTime", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 31;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private NxtTradingHourFormatDto$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout)};
        int i4 = onWarmupCompleted + 67;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final NxtTradingHourFormatDto deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
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
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 1;
        onWarmupCompleted = i4 % 128;
        String str10 = null;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            decoder.onWarmupCompleted(descriptor).extraCallbackWithResult();
            str10.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i5 = 7;
        int i6 = 6;
        int i7 = 5;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str11 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            String str12 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            String str13 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            String str14 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, (Object) null);
            String str15 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getwrigglelayout, (Object) null);
            String str16 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getwrigglelayout, (Object) null);
            String str17 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getwrigglelayout, (Object) null);
            String str18 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, getwrigglelayout, (Object) null);
            String str19 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, getwrigglelayout, (Object) null);
            int i8 = onWarmupCompleted + 9;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            i = 511;
            str8 = str12;
            str5 = str19;
            str6 = str18;
            str3 = str17;
            str2 = str16;
            str4 = str14;
            str7 = str15;
            str9 = str11;
            str = str13;
        } else {
            boolean z = true;
            String str20 = null;
            String str21 = null;
            String str22 = null;
            String str23 = null;
            String str24 = null;
            String str25 = null;
            String str26 = null;
            int i10 = 0;
            String str27 = null;
            while (!(!z)) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        int i11 = onWarmupCompleted + 115;
                        onExtraCallbackWithResult = i11 % 128;
                        int i12 = i11 % 2;
                        str25 = str25;
                        str24 = str24;
                        str26 = str26;
                        i2 = 2;
                        i5 = 7;
                        i6 = 6;
                        i7 = 5;
                        z = false;
                    case 0:
                        str26 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str26);
                        i10 |= 1;
                        i2 = 2;
                        i5 = 7;
                        i6 = 6;
                        i7 = 5;
                    case 1:
                        i10 |= 2;
                        str25 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str25);
                        i2 = 2;
                        i5 = 7;
                        i6 = 6;
                    case 2:
                        str10 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i2, getWriggleLayout.onNavigationEvent, str10);
                        i10 |= 4;
                        i5 = 7;
                        i6 = 6;
                    case 3:
                        str21 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str21);
                        i10 |= 8;
                        i5 = 7;
                        i6 = 6;
                    case 4:
                        str24 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, str24);
                        i10 |= 16;
                        i5 = 7;
                    case 5:
                        str20 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i7, getWriggleLayout.onNavigationEvent, str20);
                        i10 |= 32;
                        i5 = 7;
                    case 6:
                        str27 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i6, getWriggleLayout.onNavigationEvent, str27);
                        i10 |= 64;
                        int i13 = onExtraCallbackWithResult + 63;
                        onWarmupCompleted = i13 % 128;
                        int i14 = i13 % i2;
                        i5 = 7;
                    case 7:
                        str23 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, getWriggleLayout.onNavigationEvent, str23);
                        i10 |= 128;
                    case 8:
                        str22 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, getWriggleLayout.onNavigationEvent, str22);
                        i10 |= 256;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            i = i10;
            str = str10;
            str2 = str20;
            str3 = str27;
            str4 = str21;
            str5 = str22;
            str6 = str23;
            str7 = str24;
            str8 = str25;
            str9 = str26;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new NxtTradingHourFormatDto(i, str9, str8, str, str4, str7, str2, str3, str6, str5, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m17deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        NxtTradingHourFormatDto nxtTradingHourFormatDtoDeserialize = deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 27;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return nxtTradingHourFormatDtoDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull NxtTradingHourFormatDto nxtTradingHourFormatDto) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(nxtTradingHourFormatDto, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        NxtTradingHourFormatDto.onExtraCallback(nxtTradingHourFormatDto, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 123;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (NxtTradingHourFormatDto) obj);
        int i4 = onWarmupCompleted + 81;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onWarmupCompleted + 89;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
