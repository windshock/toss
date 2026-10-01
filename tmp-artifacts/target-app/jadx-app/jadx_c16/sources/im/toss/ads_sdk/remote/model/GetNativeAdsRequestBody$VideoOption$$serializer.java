package im.toss.ads_sdk.remote.model;

import im.toss.ads_sdk.remote.model.GetNativeAdsRequestBody;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class GetNativeAdsRequestBody$VideoOption$$serializer implements aeu2<GetNativeAdsRequestBody.VideoOption> {
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final GetNativeAdsRequestBody$VideoOption$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        SerialDescriptor serialDescriptor;
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 27;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            serialDescriptor = descriptor;
            int i4 = 59 / 0;
        } else {
            serialDescriptor = descriptor;
        }
        int i5 = i2 + 55;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        GetNativeAdsRequestBody$VideoOption$$serializer getNativeAdsRequestBody$VideoOption$$serializer = new GetNativeAdsRequestBody$VideoOption$$serializer();
        INSTANCE = getNativeAdsRequestBody$VideoOption$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.ads_sdk.remote.model.GetNativeAdsRequestBody.VideoOption", getNativeAdsRequestBody$VideoOption$$serializer, 1);
        setanimationsloop.onWarmupCompleted("maxDurationMs", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 45;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private GetNativeAdsRequestBody$VideoOption$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return new KSerializer[]{oty1.onExtraCallback};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[1];
        kSerializerArr[1] = oty1.onExtraCallback;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final GetNativeAdsRequestBody.VideoOption deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        long jIAuthTabCallbackDefault;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i2 = 1;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
        } else {
            int i3 = onExtraCallback + 19;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            long jIAuthTabCallbackDefault2 = 0;
            int i5 = 0;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else {
                    if (iOnNavigationEvent != 0) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i6 = onNavigationEvent + 115;
                    onExtraCallback = i6 % 128;
                    if (i6 % 2 != 0) {
                        jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 1);
                        i5 = 0;
                    } else {
                        jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
                        i5 = 1;
                    }
                }
            }
            i2 = i5;
            jIAuthTabCallbackDefault = jIAuthTabCallbackDefault2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new GetNativeAdsRequestBody.VideoOption(i2, jIAuthTabCallbackDefault, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m42deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        GetNativeAdsRequestBody.VideoOption videoOptionDeserialize = deserialize(decoder);
        if (i3 == 0) {
            int i4 = 58 / 0;
        }
        int i5 = onNavigationEvent + 119;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 99 / 0;
        }
        return videoOptionDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull GetNativeAdsRequestBody.VideoOption videoOption) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(videoOption, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            GetNativeAdsRequestBody.VideoOption.onNavigationEvent(videoOption, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(videoOption, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        GetNativeAdsRequestBody.VideoOption.onNavigationEvent(videoOption, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = 26 / 0;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (GetNativeAdsRequestBody.VideoOption) obj);
        int i4 = onExtraCallback + 49;
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
        int i2 = onExtraCallback + 53;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 55;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}
