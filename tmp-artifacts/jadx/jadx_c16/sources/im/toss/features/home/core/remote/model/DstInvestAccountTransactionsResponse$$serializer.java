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
public final /* synthetic */ class DstInvestAccountTransactionsResponse$$serializer implements aeu2<DstInvestAccountTransactionsResponse> {
    private static int IAuthTabCallback = 1;
    public static final DstInvestAccountTransactionsResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 69;
        IAuthTabCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 99;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return serialDescriptor;
        }
        obj.hashCode();
        throw null;
    }

    static {
        DstInvestAccountTransactionsResponse$$serializer dstInvestAccountTransactionsResponse$$serializer = new DstInvestAccountTransactionsResponse$$serializer();
        INSTANCE = dstInvestAccountTransactionsResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.DstInvestAccountTransactionsResponse", dstInvestAccountTransactionsResponse$$serializer, 3);
        setanimationsloop.onWarmupCompleted("sections", true);
        setanimationsloop.onWarmupCompleted("backgroundColor", true);
        setanimationsloop.onWarmupCompleted("refreshGuide", true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 39;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private DstInvestAccountTransactionsResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnExtraCallback = DstInvestAccountTransactionsResponse.onExtraCallback();
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback((KSerializer) lazyArrOnExtraCallback[0].getValue()), sp.IAuthTabCallback(ColorAttributeResponse$.serializer.INSTANCE), sp.IAuthTabCallback((KSerializer) lazyArrOnExtraCallback[2].getValue())};
        int i4 = onNavigationEvent + 55;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final DstInvestAccountTransactionsResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        Map map;
        int i;
        List list;
        ColorAttributeResponse colorAttributeResponse;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallback = DstInvestAccountTransactionsResponse.onExtraCallback();
        Object obj = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            List list2 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrOnExtraCallback[0].getValue(), (Object) null);
            ColorAttributeResponse colorAttributeResponse2 = (ColorAttributeResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, ColorAttributeResponse$.serializer.INSTANCE, (Object) null);
            map = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrOnExtraCallback[2].getValue(), (Object) null);
            i = 7;
            list = list2;
            colorAttributeResponse = colorAttributeResponse2;
        } else {
            int i3 = IAuthTabCallback + 101;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            boolean z = true;
            int i5 = 0;
            Map map2 = null;
            List list3 = null;
            ColorAttributeResponse colorAttributeResponse3 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i6 = IAuthTabCallback + 29;
                    int i7 = i6 % 128;
                    onNavigationEvent = i7;
                    if (i6 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (iOnNavigationEvent != 0) {
                        int i8 = i7 + 57;
                        IAuthTabCallback = i8 % 128;
                        int i9 = i8 % 2;
                        if (iOnNavigationEvent == 1) {
                            colorAttributeResponse3 = (ColorAttributeResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, ColorAttributeResponse$.serializer.INSTANCE, colorAttributeResponse3);
                            i5 |= 2;
                        } else {
                            if (iOnNavigationEvent != 2) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            int i10 = i7 + 73;
                            IAuthTabCallback = i10 % 128;
                            if (i10 % 2 == 0) {
                                map2 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, (jp) lazyArrOnExtraCallback[2].getValue(), map2);
                                i5 |= 3;
                            } else {
                                map2 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrOnExtraCallback[2].getValue(), map2);
                                i5 |= 4;
                            }
                        }
                    } else {
                        list3 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrOnExtraCallback[0].getValue(), list3);
                        i5 |= 1;
                    }
                } else {
                    z = false;
                }
            }
            map = map2;
            i = i5;
            list = list3;
            colorAttributeResponse = colorAttributeResponse3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new DstInvestAccountTransactionsResponse(i, list, colorAttributeResponse, map, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m534deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        DstInvestAccountTransactionsResponse dstInvestAccountTransactionsResponseDeserialize = deserialize(decoder);
        int i4 = onNavigationEvent + 81;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 45 / 0;
        }
        return dstInvestAccountTransactionsResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull DstInvestAccountTransactionsResponse dstInvestAccountTransactionsResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(dstInvestAccountTransactionsResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        DstInvestAccountTransactionsResponse.onNavigationEvent(dstInvestAccountTransactionsResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 103;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (DstInvestAccountTransactionsResponse) obj);
        int i4 = onNavigationEvent + 7;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = IAuthTabCallback + 77;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 58 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
