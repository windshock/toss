package im.toss.features.credit.data.legacy.detail;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditTipV2$$serializer implements aeu2<CreditTipV2> {
    private static int IAuthTabCallback = 1;
    public static final CreditTipV2$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        CreditTipV2$$serializer creditTipV2$$serializer = new CreditTipV2$$serializer();
        INSTANCE = creditTipV2$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.legacy.detail.CreditTipV2", creditTipV2$$serializer, 4);
        setanimationsloop.onWarmupCompleted("card", false);
        setanimationsloop.onWarmupCompleted("guarantee", false);
        setanimationsloop.onWarmupCompleted("loan", false);
        setanimationsloop.onWarmupCompleted("overdue", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 89;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private CreditTipV2$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Tips$$serializer tips$$serializer = Tips$$serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {tips$$serializer, tips$$serializer, tips$$serializer, tips$$serializer};
        int i4 = onExtraCallbackWithResult + 73;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CreditTipV2 deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        Tips tips;
        Tips tips2;
        Tips tips3;
        Tips tips4;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onExtraCallbackWithResult + 81;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Tips$$serializer tips$$serializer = Tips$$serializer.INSTANCE;
            Tips tips5 = (Tips) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, tips$$serializer, (Object) null);
            Tips tips6 = (Tips) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, tips$$serializer, (Object) null);
            tips3 = (Tips) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, tips$$serializer, (Object) null);
            tips4 = (Tips) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, tips$$serializer, (Object) null);
            i = 15;
            tips = tips5;
            tips2 = tips6;
        } else {
            i = 0;
            boolean z = true;
            Tips tips7 = null;
            Tips tips8 = null;
            tips = null;
            tips2 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i5 = onExtraCallbackWithResult;
                    int i6 = i5 + 9;
                    onExtraCallback = i6 % 128;
                    if (i6 % 2 == 0) {
                        throw null;
                    }
                    if (iOnNavigationEvent == 0) {
                        tips = (Tips) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, Tips$$serializer.INSTANCE, tips);
                        i |= 1;
                    } else if (iOnNavigationEvent == 1) {
                        tips2 = (Tips) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, Tips$$serializer.INSTANCE, tips2);
                        i |= 2;
                    } else if (iOnNavigationEvent != 2) {
                        int i7 = i5 + 43;
                        onExtraCallback = i7 % 128;
                        if (i7 % 2 == 0) {
                            if (iOnNavigationEvent != 5) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            tips8 = (Tips) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, Tips$$serializer.INSTANCE, tips8);
                            i |= 8;
                        } else {
                            if (iOnNavigationEvent != 3) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            tips8 = (Tips) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, Tips$$serializer.INSTANCE, tips8);
                            i |= 8;
                        }
                    } else {
                        tips7 = (Tips) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, Tips$$serializer.INSTANCE, tips7);
                        i |= 4;
                    }
                } else {
                    z = false;
                }
            }
            tips3 = tips7;
            tips4 = tips8;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CreditTipV2(i, tips, tips2, tips3, tips4, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m113deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CreditTipV2 creditTipV2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(creditTipV2, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        CreditTipV2.IAuthTabCallback(creditTipV2, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 99;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CreditTipV2) obj);
        int i4 = onExtraCallback + 85;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 94 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 117;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
