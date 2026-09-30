package im.toss.features.home.core.model;

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
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BpsBackgroundColorDto$$serializer implements aeu2<BpsBackgroundColorDto> {
    private static int IAuthTabCallback = 0;
    public static final BpsBackgroundColorDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 63;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        BpsBackgroundColorDto$$serializer bpsBackgroundColorDto$$serializer = new BpsBackgroundColorDto$$serializer();
        INSTANCE = bpsBackgroundColorDto$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.model.BpsBackgroundColorDto", bpsBackgroundColorDto$$serializer, 3);
        setanimationsloop.onWarmupCompleted("dark", true);
        setanimationsloop.onWarmupCompleted("light", true);
        setanimationsloop.onWarmupCompleted("baseToken", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 7;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private BpsBackgroundColorDto$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
            return new KSerializer[]{kSerializer, kSerializer, sp.IAuthTabCallback(kSerializer)};
        }
        KSerializer<?> kSerializer2 = getWriggleLayout.onNavigationEvent;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(kSerializer2);
        KSerializer<?>[] kSerializerArr = new KSerializer[5];
        kSerializerArr[0] = kSerializer2;
        kSerializerArr[1] = kSerializer2;
        kSerializerArr[2] = kSerializerIAuthTabCallback;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0072 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final BpsBackgroundColorDto deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        String strAsInterface2;
        String str;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Object obj = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, (Object) null);
            i = 7;
        } else {
            int i3 = 0;
            boolean z = true;
            String strAsInterface3 = null;
            String strAsInterface4 = null;
            String str2 = null;
            while (z) {
                int i4 = onWarmupCompleted + 65;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i5 = onExtraCallback + 65;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 == 0) {
                        if (iOnNavigationEvent == 0) {
                            strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                            i3 |= 2;
                        } else {
                            if (iOnNavigationEvent == 2) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str2);
                            i3 |= 4;
                            int i6 = onExtraCallback + 29;
                            onWarmupCompleted = i6 % 128;
                            int i7 = i6 % 2;
                        }
                    } else if (iOnNavigationEvent == 1) {
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i3 |= 2;
                    } else if (iOnNavigationEvent == 2) {
                    }
                } else {
                    strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                    i3 |= 1;
                }
            }
            strAsInterface = strAsInterface3;
            strAsInterface2 = strAsInterface4;
            str = str2;
            i = i3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        BpsBackgroundColorDto bpsBackgroundColorDto = new BpsBackgroundColorDto(i, strAsInterface, strAsInterface2, str, (okycx) null);
        int i8 = onExtraCallback + 93;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 != 0) {
            return bpsBackgroundColorDto;
        }
        obj.hashCode();
        throw null;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m512deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        BpsBackgroundColorDto bpsBackgroundColorDtoDeserialize = deserialize(decoder);
        int i4 = onExtraCallback + 117;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return bpsBackgroundColorDtoDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull BpsBackgroundColorDto bpsBackgroundColorDto) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(bpsBackgroundColorDto, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            BpsBackgroundColorDto.IAuthTabCallback(bpsBackgroundColorDto, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(bpsBackgroundColorDto, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        BpsBackgroundColorDto.IAuthTabCallback(bpsBackgroundColorDto, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onWarmupCompleted + 43;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (BpsBackgroundColorDto) obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
            int i3 = 20 / 0;
        } else {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        }
        int i4 = onExtraCallback + 25;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}
