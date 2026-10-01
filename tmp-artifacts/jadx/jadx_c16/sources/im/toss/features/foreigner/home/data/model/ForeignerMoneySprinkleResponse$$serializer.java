package im.toss.features.foreigner.home.data.model;

import java.util.List;
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
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ForeignerMoneySprinkleResponse$$serializer implements aeu2<ForeignerMoneySprinkleResponse> {
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final ForeignerMoneySprinkleResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 59;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 17;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        ForeignerMoneySprinkleResponse$$serializer foreignerMoneySprinkleResponse$$serializer = new ForeignerMoneySprinkleResponse$$serializer();
        INSTANCE = foreignerMoneySprinkleResponse$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.foreigner.home.data.model.ForeignerMoneySprinkleResponse", foreignerMoneySprinkleResponse$$serializer, 2);
        setanimationsloop.onWarmupCompleted("quota", false);
        setanimationsloop.onWarmupCompleted("receivableRewards", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 83;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private ForeignerMoneySprinkleResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return new KSerializer[]{MoneySprinkleQuota$$serializer.INSTANCE, ForeignerMoneySprinkleResponse.IAuthTabCallback()[1].getValue()};
        }
        Lazy[] lazyArrIAuthTabCallback = ForeignerMoneySprinkleResponse.IAuthTabCallback();
        KSerializer<?>[] kSerializerArr = new KSerializer[4];
        kSerializerArr[0] = MoneySprinkleQuota$$serializer.INSTANCE;
        kSerializerArr[0] = lazyArrIAuthTabCallback[0].getValue();
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ForeignerMoneySprinkleResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        List list;
        MoneySprinkleQuota moneySprinkleQuota;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrIAuthTabCallback = ForeignerMoneySprinkleResponse.IAuthTabCallback();
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            moneySprinkleQuota = (MoneySprinkleQuota) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, MoneySprinkleQuota$$serializer.INSTANCE, (Object) null);
            list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrIAuthTabCallback[1].getValue(), (Object) null);
            i = 3;
        } else {
            int i3 = 0;
            List list2 = null;
            MoneySprinkleQuota moneySprinkleQuota2 = null;
            boolean z = true;
            while (!(!z)) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i4 = IAuthTabCallback;
                    int i5 = i4 + 113;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 == 0) {
                        throw null;
                    }
                    if (iOnNavigationEvent == 0) {
                        moneySprinkleQuota2 = (MoneySprinkleQuota) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, MoneySprinkleQuota$$serializer.INSTANCE, moneySprinkleQuota2);
                        i3 |= 1;
                        int i6 = IAuthTabCallback + 95;
                        onWarmupCompleted = i6 % 128;
                        int i7 = i6 % 2;
                    } else {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i8 = i4 + 43;
                        onWarmupCompleted = i8 % 128;
                        list2 = (List) (i8 % 2 == 0 ? ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrIAuthTabCallback[1].getValue(), list2) : ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrIAuthTabCallback[1].getValue(), list2));
                        i3 |= 2;
                    }
                } else {
                    int i9 = IAuthTabCallback + 119;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                    z = false;
                }
            }
            list = list2;
            moneySprinkleQuota = moneySprinkleQuota2;
            i = i3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        ForeignerMoneySprinkleResponse foreignerMoneySprinkleResponse = new ForeignerMoneySprinkleResponse(i, moneySprinkleQuota, list, (okycx) null);
        int i11 = onWarmupCompleted + 121;
        IAuthTabCallback = i11 % 128;
        int i12 = i11 % 2;
        return foreignerMoneySprinkleResponse;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m245deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ForeignerMoneySprinkleResponse foreignerMoneySprinkleResponse) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(foreignerMoneySprinkleResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            ForeignerMoneySprinkleResponse.onWarmupCompleted(foreignerMoneySprinkleResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(foreignerMoneySprinkleResponse, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        ForeignerMoneySprinkleResponse.onWarmupCompleted(foreignerMoneySprinkleResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ForeignerMoneySprinkleResponse) obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = IAuthTabCallback + 39;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 99 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 83;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onWarmupCompleted + 73;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
