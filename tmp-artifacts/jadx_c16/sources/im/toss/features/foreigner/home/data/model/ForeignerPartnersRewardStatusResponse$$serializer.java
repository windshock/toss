package im.toss.features.foreigner.home.data.model;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getBgColor;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ForeignerPartnersRewardStatusResponse$$serializer implements aeu2<ForeignerPartnersRewardStatusResponse> {
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final ForeignerPartnersRewardStatusResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        ForeignerPartnersRewardStatusResponse$$serializer foreignerPartnersRewardStatusResponse$$serializer = new ForeignerPartnersRewardStatusResponse$$serializer();
        INSTANCE = foreignerPartnersRewardStatusResponse$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.foreigner.home.data.model.ForeignerPartnersRewardStatusResponse", foreignerPartnersRewardStatusResponse$$serializer, 1);
        setanimationsloop.onWarmupCompleted("hasReceivedReward", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 9;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private ForeignerPartnersRewardStatusResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {getBgColor.IAuthTabCallback};
        int i4 = onExtraCallback + 57;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ForeignerPartnersRewardStatusResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        boolean zOnExtraCallbackWithResult;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i2 = 1;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onExtraCallback + 21;
            IAuthTabCallback = i3 % 128;
            zOnExtraCallbackWithResult = i3 % 2 == 0 ? ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1) : ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
        } else {
            boolean zOnExtraCallbackWithResult2 = false;
            int i4 = 0;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i5 = onExtraCallback + 39;
                    int i6 = i5 % 128;
                    IAuthTabCallback = i6;
                    int i7 = i5 % 2;
                    if (iOnNavigationEvent != 0) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i8 = i6 + 19;
                    onExtraCallback = i8 % 128;
                    zOnExtraCallbackWithResult2 = i8 % 2 != 0 ? ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1) : ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
                    i4 = 1;
                } else {
                    z = false;
                }
            }
            zOnExtraCallbackWithResult = zOnExtraCallbackWithResult2;
            i2 = i4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ForeignerPartnersRewardStatusResponse(i2, zOnExtraCallbackWithResult, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m246deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ForeignerPartnersRewardStatusResponse foreignerPartnersRewardStatusResponseDeserialize = deserialize(decoder);
        int i4 = onExtraCallback + 89;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return foreignerPartnersRewardStatusResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ForeignerPartnersRewardStatusResponse foreignerPartnersRewardStatusResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(foreignerPartnersRewardStatusResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        ForeignerPartnersRewardStatusResponse.onExtraCallback(foreignerPartnersRewardStatusResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 65;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 18 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ForeignerPartnersRewardStatusResponse) obj);
        if (i3 == 0) {
            int i4 = 10 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 121;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
