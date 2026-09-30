package im.toss.feature.credit.overview.network.response;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.dj3;
import o.getDynamicHeight;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class Difference$$serializer implements aeu2<Difference> {
    private static int IAuthTabCallback = 1;
    public static final Difference$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 69;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 75 / 0;
        }
        return serialDescriptor;
    }

    static {
        Difference$$serializer difference$$serializer = new Difference$$serializer();
        INSTANCE = difference$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.feature.credit.overview.network.response.Difference", difference$$serializer, 8);
        setanimationsloop.onWarmupCompleted("score", true);
        setanimationsloop.onWarmupCompleted("grade", true);
        setanimationsloop.onWarmupCompleted("topPercentInPeers", true);
        setanimationsloop.onWarmupCompleted("cardUsedAmount", true);
        setanimationsloop.onWarmupCompleted("cardDiffBaseMonth", true);
        setanimationsloop.onWarmupCompleted("loanRemainAmount", true);
        setanimationsloop.onWarmupCompleted("overdueRemainAmount", true);
        setanimationsloop.onWarmupCompleted("guaranteeAmount", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 89;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 68 / 0;
        }
    }

    private Difference$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getDynamicHeight getdynamicheight = getDynamicHeight.onWarmupCompleted;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(getdynamicheight);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(getdynamicheight);
        KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(dj3.onWarmupCompleted);
        oty1 oty1Var = oty1.onExtraCallback;
        KSerializer<?>[] kSerializerArr = {kSerializerIAuthTabCallback, kSerializerIAuthTabCallback2, kSerializerIAuthTabCallback3, sp.IAuthTabCallback(oty1Var), sp.IAuthTabCallback(oty1Var), sp.IAuthTabCallback(oty1Var), sp.IAuthTabCallback(oty1Var), sp.IAuthTabCallback(oty1Var)};
        int i4 = onNavigationEvent + 15;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final Difference deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        Long l;
        Long l2;
        Long l3;
        Float f;
        Integer num;
        int i;
        Integer num2;
        Long l4;
        Long l5;
        char c;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 109;
        onExtraCallbackWithResult = i3 % 128;
        Float f2 = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            decoder.onWarmupCompleted(descriptor).extraCallbackWithResult();
            f2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i4 = 7;
        int i5 = 6;
        int i6 = 5;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            getDynamicHeight getdynamicheight = getDynamicHeight.onWarmupCompleted;
            Integer num3 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getdynamicheight, (Object) null);
            Integer num4 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getdynamicheight, (Object) null);
            Float f3 = (Float) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, dj3.onWarmupCompleted, (Object) null);
            oty1 oty1Var = oty1.onExtraCallback;
            Long l6 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, oty1Var, (Object) null);
            Long l7 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, oty1Var, (Object) null);
            Long l8 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, oty1Var, (Object) null);
            Long l9 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, oty1Var, (Object) null);
            f = f3;
            num = num4;
            l = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, oty1Var, (Object) null);
            l2 = l9;
            l3 = l8;
            l5 = l6;
            l4 = l7;
            num2 = num3;
            i = 255;
        } else {
            Long l10 = null;
            Long l11 = null;
            Long l12 = null;
            Long l13 = null;
            Long l14 = null;
            Integer num5 = null;
            boolean z = true;
            int i7 = 0;
            Integer num6 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        Integer num7 = num5;
                        int i8 = onExtraCallbackWithResult + 59;
                        onNavigationEvent = i8 % 128;
                        if (i8 % 2 != 0) {
                            c = 3;
                            int i9 = 4 % 3;
                        } else {
                            c = 3;
                        }
                        num5 = num7;
                        i4 = 7;
                        i5 = 6;
                        i6 = 5;
                        z = false;
                    case 0:
                        num5 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getDynamicHeight.onWarmupCompleted, num5);
                        i7 |= 1;
                        i4 = 7;
                        i5 = 6;
                        i6 = 5;
                    case 1:
                        num6 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getDynamicHeight.onWarmupCompleted, num6);
                        i7 |= 2;
                        i4 = 7;
                    case 2:
                        f2 = (Float) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, dj3.onWarmupCompleted, f2);
                        i7 |= 4;
                        i4 = 7;
                    case 3:
                        l14 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, oty1.onExtraCallback, l14);
                        i7 |= 8;
                        i4 = 7;
                    case 4:
                        l13 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, oty1.onExtraCallback, l13);
                        i7 |= 16;
                        int i10 = onNavigationEvent + 31;
                        onExtraCallbackWithResult = i10 % 128;
                        int i11 = i10 % 2;
                        i4 = 7;
                    case 5:
                        l12 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i6, oty1.onExtraCallback, l12);
                        i7 |= 32;
                    case 6:
                        l11 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, oty1.onExtraCallback, l11);
                        i7 |= 64;
                    case 7:
                        l10 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4, oty1.onExtraCallback, l10);
                        i7 |= 128;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            Integer num8 = num5;
            l = l10;
            l2 = l11;
            l3 = l12;
            f = f2;
            num = num6;
            i = i7;
            num2 = num8;
            Long l15 = l14;
            l4 = l13;
            l5 = l15;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new Difference(i, num2, num, f, l5, l4, l3, l2, l, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m342deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            deserialize(decoder);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Difference differenceDeserialize = deserialize(decoder);
        int i3 = onNavigationEvent + 103;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return differenceDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull Difference difference) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(difference, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            Difference.onExtraCallback(difference, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(difference, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        Difference.onExtraCallback(difference, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (Difference) obj);
        int i4 = onNavigationEvent + 67;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallbackWithResult + 41;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
