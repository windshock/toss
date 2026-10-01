package im.toss.features.feed.data.dto;

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
public final /* synthetic */ class GetUserInfoResp$$serializer implements aeu2<GetUserInfoResp> {
    public static final int $stable;
    public static final GetUserInfoResp$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        GetUserInfoResp$$serializer getUserInfoResp$$serializer = new GetUserInfoResp$$serializer();
        INSTANCE = getUserInfoResp$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.feed.data.dto.GetUserInfoResp", getUserInfoResp$$serializer, 1);
        setanimationsloop.onWarmupCompleted("unreadInboxCount", false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 59;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private GetUserInfoResp$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {getDynamicHeight.onWarmupCompleted};
        int i4 = onWarmupCompleted + 39;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final GetUserInfoResp deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int iOnTransact;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i2 = 1;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
        } else {
            boolean z = true;
            iOnTransact = 0;
            int i3 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i4 = onExtraCallback + 49;
                    int i5 = i4 % 128;
                    onWarmupCompleted = i5;
                    int i6 = i4 % 2;
                    if (iOnNavigationEvent != 0) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i7 = i5 + 27;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
                    i3 = i8 != 0 ? 0 : 1;
                } else {
                    z = false;
                }
            }
            i2 = i3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        GetUserInfoResp getUserInfoResp = new GetUserInfoResp(i2, iOnTransact, (okycx) null);
        int i9 = onWarmupCompleted + 91;
        onExtraCallback = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 30 / 0;
        }
        return getUserInfoResp;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m244deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        GetUserInfoResp getUserInfoRespDeserialize = deserialize(decoder);
        int i4 = onExtraCallback + 65;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return getUserInfoRespDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull GetUserInfoResp getUserInfoResp) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(getUserInfoResp, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        GetUserInfoResp.onWarmupCompleted(getUserInfoResp, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 21;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (GetUserInfoResp) obj);
        int i4 = onExtraCallback + 93;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onExtraCallback + 125;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        obj.hashCode();
        throw null;
    }
}
