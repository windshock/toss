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
public final /* synthetic */ class AtsTradingHourFormatDto$$serializer implements aeu2<AtsTradingHourFormatDto> {
    private static int IAuthTabCallback = 1;
    public static final AtsTradingHourFormatDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        AtsTradingHourFormatDto$$serializer atsTradingHourFormatDto$$serializer = new AtsTradingHourFormatDto$$serializer();
        INSTANCE = atsTradingHourFormatDto$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.securities.core.markettime.data.model.format.AtsTradingHourFormatDto", atsTradingHourFormatDto$$serializer, 3);
        setanimationsloop.onWarmupCompleted("date", true);
        setanimationsloop.onWarmupCompleted("krxEntireTradingHours", true);
        setanimationsloop.onWarmupCompleted("nxtEntireTradingHours", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 95;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private AtsTradingHourFormatDto$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return new KSerializer[]{sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent), sp.IAuthTabCallback(KrxTradingHourFormatDto$$serializer.INSTANCE), sp.IAuthTabCallback(NxtTradingHourFormatDto$$serializer.INSTANCE)};
        }
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(KrxTradingHourFormatDto$$serializer.INSTANCE);
        KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(NxtTradingHourFormatDto$$serializer.INSTANCE);
        KSerializer<?>[] kSerializerArr = new KSerializer[3];
        kSerializerArr[1] = kSerializerIAuthTabCallback;
        kSerializerArr[1] = kSerializerIAuthTabCallback2;
        kSerializerArr[4] = kSerializerIAuthTabCallback3;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AtsTradingHourFormatDto deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        KrxTradingHourFormatDto krxTradingHourFormatDto;
        NxtTradingHourFormatDto nxtTradingHourFormatDto;
        int i;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        KrxTradingHourFormatDto krxTradingHourFormatDto2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i4 = onExtraCallback + 119;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            String str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, (Object) null);
            KrxTradingHourFormatDto krxTradingHourFormatDto3 = (KrxTradingHourFormatDto) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, KrxTradingHourFormatDto$$serializer.INSTANCE, (Object) null);
            nxtTradingHourFormatDto = (NxtTradingHourFormatDto) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, NxtTradingHourFormatDto$$serializer.INSTANCE, (Object) null);
            str = str2;
            krxTradingHourFormatDto = krxTradingHourFormatDto3;
            i = 7;
        } else {
            int i6 = 0;
            String str3 = null;
            NxtTradingHourFormatDto nxtTradingHourFormatDto2 = null;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i7 = onExtraCallback;
                    int i8 = i7 + 61;
                    IAuthTabCallback = i8 % 128;
                    if (i8 % 2 == 0) {
                        if (iOnNavigationEvent != 1) {
                            i2 = i7 + 17;
                            IAuthTabCallback = i2 % 128;
                            if (i2 % 2 != 0) {
                                if (iOnNavigationEvent != 2) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                nxtTradingHourFormatDto2 = (NxtTradingHourFormatDto) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, NxtTradingHourFormatDto$$serializer.INSTANCE, nxtTradingHourFormatDto2);
                                i6 |= 4;
                            } else {
                                if (iOnNavigationEvent != 2) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                nxtTradingHourFormatDto2 = (NxtTradingHourFormatDto) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, NxtTradingHourFormatDto$$serializer.INSTANCE, nxtTradingHourFormatDto2);
                                i6 |= 4;
                            }
                        } else {
                            krxTradingHourFormatDto2 = (KrxTradingHourFormatDto) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, KrxTradingHourFormatDto$$serializer.INSTANCE, krxTradingHourFormatDto2);
                            i6 |= 2;
                        }
                    } else if (iOnNavigationEvent != 1) {
                        i2 = i7 + 17;
                        IAuthTabCallback = i2 % 128;
                        if (i2 % 2 != 0) {
                        }
                    } else {
                        krxTradingHourFormatDto2 = (KrxTradingHourFormatDto) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, KrxTradingHourFormatDto$$serializer.INSTANCE, krxTradingHourFormatDto2);
                        i6 |= 2;
                    }
                } else {
                    str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str3);
                    i6 |= 1;
                }
            }
            str = str3;
            krxTradingHourFormatDto = krxTradingHourFormatDto2;
            nxtTradingHourFormatDto = nxtTradingHourFormatDto2;
            i = i6;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new AtsTradingHourFormatDto(i, str, krxTradingHourFormatDto, nxtTradingHourFormatDto, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m15deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        AtsTradingHourFormatDto atsTradingHourFormatDtoDeserialize = deserialize(decoder);
        int i4 = onExtraCallback + 67;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return atsTradingHourFormatDtoDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AtsTradingHourFormatDto atsTradingHourFormatDto) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(atsTradingHourFormatDto, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        AtsTradingHourFormatDto.onNavigationEvent(atsTradingHourFormatDto, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 125;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AtsTradingHourFormatDto) obj);
        if (i3 != 0) {
            int i4 = 30 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 59;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}
