package im.toss.features.credit.data.response;

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
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NiceSohoBannerResponse$$serializer implements aeu2<NiceSohoBannerResponse> {
    private static int IAuthTabCallback = 1;
    public static final NiceSohoBannerResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 13;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 103;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        NiceSohoBannerResponse$$serializer niceSohoBannerResponse$$serializer = new NiceSohoBannerResponse$$serializer();
        INSTANCE = niceSohoBannerResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.NiceSohoBannerResponse", niceSohoBannerResponse$$serializer, 1);
        setanimationsloop.onWarmupCompleted("bannerInfo", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 27;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private NiceSohoBannerResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        IAuthTabCallback = i2 % 128;
        return i2 % 2 == 0 ? new KSerializer[]{sp.IAuthTabCallback(NiceSohoBanner$$serializer.INSTANCE)} : new KSerializer[]{sp.IAuthTabCallback(NiceSohoBanner$$serializer.INSTANCE)};
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final NiceSohoBannerResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        NiceSohoBanner niceSohoBanner;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i2 = 1;
        Object obj = null;
        if (!(!ywVarOnWarmupCompleted.extraCallbackWithResult())) {
            niceSohoBanner = (NiceSohoBanner) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, NiceSohoBanner$$serializer.INSTANCE, (Object) null);
        } else {
            boolean z = true;
            int i3 = 0;
            niceSohoBanner = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i4 = IAuthTabCallback + 119;
                    int i5 = i4 % 128;
                    onExtraCallback = i5;
                    if (i4 % 2 != 0) {
                        throw null;
                    }
                    if (iOnNavigationEvent != 0) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i6 = i5 + 47;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    niceSohoBanner = (NiceSohoBanner) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, NiceSohoBanner$$serializer.INSTANCE, niceSohoBanner);
                    i3 = 1;
                } else {
                    z = false;
                }
            }
            i2 = i3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        NiceSohoBannerResponse niceSohoBannerResponse = new NiceSohoBannerResponse(i2, niceSohoBanner, (okycx) null);
        int i8 = onExtraCallback + 31;
        IAuthTabCallback = i8 % 128;
        if (i8 % 2 != 0) {
            return niceSohoBannerResponse;
        }
        obj.hashCode();
        throw null;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m182deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull NiceSohoBannerResponse niceSohoBannerResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(niceSohoBannerResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            NiceSohoBannerResponse.onExtraCallbackWithResult(niceSohoBannerResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(niceSohoBannerResponse, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        NiceSohoBannerResponse.onExtraCallbackWithResult(niceSohoBannerResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (NiceSohoBannerResponse) obj);
        int i4 = onExtraCallback + 73;
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
        int i2 = IAuthTabCallback + 47;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = IAuthTabCallback + 121;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 45 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
