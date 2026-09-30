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
public final /* synthetic */ class UsTradingHourFormatDto$$serializer implements aeu2<UsTradingHourFormatDto> {
    private static int IAuthTabCallback = 0;
    public static final UsTradingHourFormatDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 69;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 45 / 0;
        }
        return serialDescriptor;
    }

    static {
        UsTradingHourFormatDto$$serializer usTradingHourFormatDto$$serializer = new UsTradingHourFormatDto$$serializer();
        INSTANCE = usTradingHourFormatDto$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.securities.core.markettime.data.model.format.UsTradingHourFormatDto", usTradingHourFormatDto$$serializer, 10);
        setanimationsloop.onWarmupCompleted("date", true);
        setanimationsloop.onWarmupCompleted("afterStart", true);
        setanimationsloop.onWarmupCompleted("afterEnd", true);
        setanimationsloop.onWarmupCompleted("dayMarketStart", true);
        setanimationsloop.onWarmupCompleted("dayMarketEnd", true);
        setanimationsloop.onWarmupCompleted("extendedStartTime", true);
        setanimationsloop.onWarmupCompleted("officialExtendedStartTime", true);
        setanimationsloop.onWarmupCompleted("startTime", true);
        setanimationsloop.onWarmupCompleted("endTime", true);
        setanimationsloop.onWarmupCompleted("usAfterMarketEnd", true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 39;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private UsTradingHourFormatDto$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout)};
        int i4 = onExtraCallbackWithResult + 53;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final UsTradingHourFormatDto deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i3 = 9;
        int i4 = 7;
        int i5 = 6;
        int i6 = 8;
        String str12 = null;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean z = true;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            String str19 = null;
            String str20 = null;
            str = null;
            int i7 = 0;
            while (!(!z)) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                    case 0:
                        str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str);
                        i7 |= 1;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                    case 1:
                        str17 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str17);
                        i7 |= 2;
                        i3 = 9;
                        i4 = 7;
                        i6 = 8;
                    case 2:
                        str11 = str19;
                        str18 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str18);
                        i7 |= 4;
                        str20 = str20;
                        str19 = str11;
                        i3 = 9;
                        i4 = 7;
                        i6 = 8;
                    case 3:
                        str13 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str13);
                        i7 |= 8;
                        i3 = 9;
                        i4 = 7;
                        i6 = 8;
                    case 4:
                        str11 = str19;
                        i7 |= 16;
                        str20 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, str20);
                        str19 = str11;
                        i3 = 9;
                        i4 = 7;
                        i6 = 8;
                    case 5:
                        i7 |= 32;
                        str19 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, str19);
                        i3 = 9;
                        i6 = 8;
                    case 6:
                        str15 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, getWriggleLayout.onNavigationEvent, str15);
                        i7 |= 64;
                        i3 = 9;
                    case 7:
                        str12 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4, getWriggleLayout.onNavigationEvent, str12);
                        i7 |= 128;
                        int i8 = onExtraCallbackWithResult + 97;
                        onWarmupCompleted = i8 % 128;
                        int i9 = i8 % 2;
                        i3 = 9;
                    case 8:
                        str14 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i6, getWriggleLayout.onNavigationEvent, str14);
                        i7 |= 256;
                        i3 = 9;
                    case 9:
                        str16 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, getWriggleLayout.onNavigationEvent, str16);
                        i7 |= 512;
                        int i10 = onWarmupCompleted + 95;
                        onExtraCallbackWithResult = i10 % 128;
                        int i11 = i10 % 2;
                        i3 = 9;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            str2 = str13;
            i = i7;
            str6 = str14;
            str7 = str15;
            str8 = str16;
            str5 = str12;
            str9 = str17;
            str10 = str18;
            str4 = str19;
            str3 = str20;
        } else {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            String str21 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            String str22 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            String str23 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, (Object) null);
            String str24 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getwrigglelayout, (Object) null);
            String str25 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getwrigglelayout, (Object) null);
            String str26 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getwrigglelayout, (Object) null);
            str2 = str23;
            str3 = str24;
            str4 = str25;
            str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, getwrigglelayout, (Object) null);
            i = 1023;
            str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, getwrigglelayout, (Object) null);
            str7 = str26;
            str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, getwrigglelayout, (Object) null);
            str9 = str21;
            str10 = str22;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new UsTradingHourFormatDto(i, str, str9, str10, str2, str3, str4, str7, str5, str6, str8, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m19deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        UsTradingHourFormatDto usTradingHourFormatDtoDeserialize = deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 63;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return usTradingHourFormatDtoDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull UsTradingHourFormatDto usTradingHourFormatDto) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(usTradingHourFormatDto, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        UsTradingHourFormatDto.onExtraCallback(usTradingHourFormatDto, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallbackWithResult + 101;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 76 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (UsTradingHourFormatDto) obj);
        if (i3 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
