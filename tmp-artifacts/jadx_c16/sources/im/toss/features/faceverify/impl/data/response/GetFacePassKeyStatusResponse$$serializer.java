package im.toss.features.faceverify.impl.data.response;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getBgColor;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class GetFacePassKeyStatusResponse$$serializer implements aeu2<GetFacePassKeyStatusResponse> {
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final GetFacePassKeyStatusResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 15;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 123;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        GetFacePassKeyStatusResponse$$serializer getFacePassKeyStatusResponse$$serializer = new GetFacePassKeyStatusResponse$$serializer();
        INSTANCE = getFacePassKeyStatusResponse$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.faceverify.impl.data.response.GetFacePassKeyStatusResponse", getFacePassKeyStatusResponse$$serializer, 2);
        setanimationsloop.onWarmupCompleted("issued", false);
        setanimationsloop.onWarmupCompleted("faceAuthKeyHash", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 101;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private GetFacePassKeyStatusResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {getBgColor.IAuthTabCallback, sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent)};
        int i4 = onExtraCallback + 125;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final GetFacePassKeyStatusResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        boolean zOnExtraCallbackWithResult;
        String str;
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 31;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, (Object) null);
            i = 3;
        } else {
            String str2 = null;
            boolean zOnExtraCallbackWithResult2 = false;
            int i5 = 0;
            boolean z = true;
            while (z) {
                int i6 = onWarmupCompleted + 7;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
                    i5 |= 1;
                } else {
                    if (iOnNavigationEvent != 1) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str2);
                    i5 |= 2;
                }
            }
            zOnExtraCallbackWithResult = zOnExtraCallbackWithResult2;
            str = str2;
            i = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new GetFacePassKeyStatusResponse(i, zOnExtraCallbackWithResult, str, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m239deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        GetFacePassKeyStatusResponse getFacePassKeyStatusResponseDeserialize = deserialize(decoder);
        int i4 = onExtraCallback + 37;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return getFacePassKeyStatusResponseDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull GetFacePassKeyStatusResponse getFacePassKeyStatusResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(getFacePassKeyStatusResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        GetFacePassKeyStatusResponse.onNavigationEvent(getFacePassKeyStatusResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 63;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (GetFacePassKeyStatusResponse) obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 71;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 19 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
