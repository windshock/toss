package im.toss.features.foreigner.home.data.model;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getDynamicHeight;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MoneySprinkleQuota$$serializer implements aeu2<MoneySprinkleQuota> {
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final MoneySprinkleQuota$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 29;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return serialDescriptor;
        }
        obj.hashCode();
        throw null;
    }

    static {
        MoneySprinkleQuota$$serializer moneySprinkleQuota$$serializer = new MoneySprinkleQuota$$serializer();
        INSTANCE = moneySprinkleQuota$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.foreigner.home.data.model.MoneySprinkleQuota", moneySprinkleQuota$$serializer, 2);
        setanimationsloop.onWarmupCompleted("dailyLimit", false);
        setanimationsloop.onWarmupCompleted("remaining", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 109;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private MoneySprinkleQuota$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerArr = new KSerializer[3];
            getDynamicHeight getdynamicheight = getDynamicHeight.onWarmupCompleted;
            kSerializerArr[0] = getdynamicheight;
            kSerializerArr[0] = getdynamicheight;
        } else {
            getDynamicHeight getdynamicheight2 = getDynamicHeight.onWarmupCompleted;
            kSerializerArr = new KSerializer[]{getdynamicheight2, getdynamicheight2};
        }
        int i3 = onExtraCallbackWithResult + 103;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final MoneySprinkleQuota deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int iOnTransact;
        int iOnTransact2;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
            iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 1);
            i = 3;
        } else {
            boolean z = true;
            int iOnTransact3 = 0;
            int iOnTransact4 = 0;
            int i3 = 0;
            while (z) {
                int i4 = onExtraCallbackWithResult + 21;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    iOnTransact3 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
                    i3 |= 1;
                } else {
                    if (iOnNavigationEvent != 1) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i6 = onNavigationEvent + 27;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    iOnTransact4 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 1);
                    i3 |= 2;
                    int i8 = onExtraCallbackWithResult + 97;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                }
            }
            iOnTransact = iOnTransact3;
            iOnTransact2 = iOnTransact4;
            i = i3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new MoneySprinkleQuota(i, iOnTransact, iOnTransact2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m247deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            deserialize(decoder);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        MoneySprinkleQuota moneySprinkleQuotaDeserialize = deserialize(decoder);
        int i3 = onNavigationEvent + 113;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return moneySprinkleQuotaDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull MoneySprinkleQuota moneySprinkleQuota) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(moneySprinkleQuota, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            MoneySprinkleQuota.onExtraCallback(moneySprinkleQuota, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(moneySprinkleQuota, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        MoneySprinkleQuota.onExtraCallback(moneySprinkleQuota, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (MoneySprinkleQuota) obj);
        int i4 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 != 0) {
            int i4 = 62 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
