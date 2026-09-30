package im.toss.ads_sdk.model;

import im.toss.ads_sdk.model.NativeAdsDto;
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
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class NativeAdsDto$Creative$EndCard$Gradient$$serializer implements aeu2<NativeAdsDto.Creative.EndCard.Gradient> {
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final NativeAdsDto$Creative$EndCard$Gradient$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 115;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 19;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 76 / 0;
        }
        return serialDescriptor;
    }

    static {
        NativeAdsDto$Creative$EndCard$Gradient$$serializer nativeAdsDto$Creative$EndCard$Gradient$$serializer = new NativeAdsDto$Creative$EndCard$Gradient$$serializer();
        INSTANCE = nativeAdsDto$Creative$EndCard$Gradient$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.ads_sdk.model.NativeAdsDto.Creative.EndCard.Gradient", nativeAdsDto$Creative$EndCard$Gradient$$serializer, 2);
        setanimationsloop.onWarmupCompleted("startColor", true);
        setanimationsloop.onWarmupCompleted("endColor", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 111;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            int i2 = 80 / 0;
        }
    }

    private NativeAdsDto$Creative$EndCard$Gradient$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            return new KSerializer[]{getwrigglelayout, getwrigglelayout};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[3];
        getWriggleLayout getwrigglelayout2 = getWriggleLayout.onNavigationEvent;
        kSerializerArr[1] = getwrigglelayout2;
        kSerializerArr[0] = getwrigglelayout2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final NativeAdsDto.Creative.EndCard.Gradient deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        String strAsInterface2;
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 21;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            i = 3;
        } else {
            String strAsInterface3 = null;
            String strAsInterface4 = null;
            int i5 = 0;
            boolean z = true;
            while (z) {
                int i6 = IAuthTabCallback + 121;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i8 = IAuthTabCallback + 5;
                    onExtraCallback = i8 % 128;
                    int i9 = i8 % 2;
                    if (iOnNavigationEvent == 0) {
                        strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i5 |= 1;
                        int i10 = onExtraCallback + 103;
                        IAuthTabCallback = i10 % 128;
                        int i11 = i10 % 2;
                    } else {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i5 |= 2;
                    }
                } else {
                    z = false;
                }
            }
            strAsInterface = strAsInterface3;
            strAsInterface2 = strAsInterface4;
            i = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new NativeAdsDto.Creative.EndCard.Gradient(i, strAsInterface, strAsInterface2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m19deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsDto.Creative.EndCard.Gradient gradientDeserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 14 / 0;
        }
        int i5 = IAuthTabCallback + 97;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return gradientDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull NativeAdsDto.Creative.EndCard.Gradient gradient) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(gradient, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            NativeAdsDto.Creative.EndCard.Gradient.IAuthTabCallback(gradient, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(gradient, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        NativeAdsDto.Creative.EndCard.Gradient.IAuthTabCallback(gradient, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onExtraCallback + 43;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (NativeAdsDto.Creative.EndCard.Gradient) obj);
        int i4 = IAuthTabCallback + 121;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 91 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 95;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}
