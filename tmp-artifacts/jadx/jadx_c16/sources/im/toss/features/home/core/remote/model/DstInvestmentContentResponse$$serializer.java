package im.toss.features.home.core.remote.model;

import im.toss.features.home.core.remote.model.dst.property.ColorAttributeResponse;
import im.toss.features.home.core.remote.model.dst.property.ColorAttributeResponse$;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DstInvestmentContentResponse$$serializer implements aeu2<DstInvestmentContentResponse> {
    private static int IAuthTabCallback = 1;
    public static final DstInvestmentContentResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 97;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 17;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        DstInvestmentContentResponse$$serializer dstInvestmentContentResponse$$serializer = new DstInvestmentContentResponse$$serializer();
        INSTANCE = dstInvestmentContentResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.DstInvestmentContentResponse", dstInvestmentContentResponse$$serializer, 3);
        setanimationsloop.onWarmupCompleted("sections", false);
        setanimationsloop.onWarmupCompleted("backgroundColor", false);
        setanimationsloop.onWarmupCompleted("refreshGuide", true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 85;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private DstInvestmentContentResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrIAuthTabCallback = DstInvestmentContentResponse.IAuthTabCallback();
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback((KSerializer) lazyArrIAuthTabCallback[0].getValue()), sp.IAuthTabCallback(ColorAttributeResponse$.serializer.INSTANCE), sp.IAuthTabCallback((KSerializer) lazyArrIAuthTabCallback[2].getValue())};
        int i4 = onWarmupCompleted + 29;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final DstInvestmentContentResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        Map map;
        int i;
        List list;
        ColorAttributeResponse colorAttributeResponse;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrIAuthTabCallback = DstInvestmentContentResponse.IAuthTabCallback();
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            List list2 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), (Object) null);
            ColorAttributeResponse colorAttributeResponse2 = (ColorAttributeResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, ColorAttributeResponse$.serializer.INSTANCE, (Object) null);
            map = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrIAuthTabCallback[2].getValue(), (Object) null);
            i = 7;
            list = list2;
            colorAttributeResponse = colorAttributeResponse2;
        } else {
            boolean z = true;
            int i3 = 0;
            Map map2 = null;
            List list3 = null;
            ColorAttributeResponse colorAttributeResponse3 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i4 = onWarmupCompleted + 65;
                    int i5 = i4 % 128;
                    onNavigationEvent = i5;
                    if (i4 % 2 == 0) {
                        throw null;
                    }
                    if (iOnNavigationEvent == 0) {
                        list3 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), list3);
                        i3 |= 1;
                    } else if (iOnNavigationEvent != 1) {
                        int i6 = i5 + 15;
                        onWarmupCompleted = i6 % 128;
                        int i7 = i6 % 2;
                        if (iOnNavigationEvent != 2) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        map2 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrIAuthTabCallback[2].getValue(), map2);
                        i3 |= 4;
                    } else {
                        colorAttributeResponse3 = (ColorAttributeResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, ColorAttributeResponse$.serializer.INSTANCE, colorAttributeResponse3);
                        i3 |= 2;
                    }
                } else {
                    int i8 = onWarmupCompleted + 113;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    z = false;
                }
            }
            map = map2;
            i = i3;
            list = list3;
            colorAttributeResponse = colorAttributeResponse3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new DstInvestmentContentResponse(i, list, colorAttributeResponse, map, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m536deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            throw null;
        }
        DstInvestmentContentResponse dstInvestmentContentResponseDeserialize = deserialize(decoder);
        int i3 = onNavigationEvent + 99;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return dstInvestmentContentResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull DstInvestmentContentResponse dstInvestmentContentResponse) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(dstInvestmentContentResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            DstInvestmentContentResponse.onWarmupCompleted(dstInvestmentContentResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(dstInvestmentContentResponse, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        DstInvestmentContentResponse.onWarmupCompleted(dstInvestmentContentResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (DstInvestmentContentResponse) obj);
        int i4 = onWarmupCompleted + 11;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onNavigationEvent + 93;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 20 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
