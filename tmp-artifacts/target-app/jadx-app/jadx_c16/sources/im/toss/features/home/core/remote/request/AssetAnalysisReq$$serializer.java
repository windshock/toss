package im.toss.features.home.core.remote.request;

import im.toss.features.home.core.remote.model.IncludeAssetRequest;
import im.toss.features.home.core.remote.model.IncludeAssetRequest$$serializer;
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
public final /* synthetic */ class AssetAnalysisReq$$serializer implements aeu2<AssetAnalysisReq> {
    private static int IAuthTabCallback = 0;
    public static final AssetAnalysisReq$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 39;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 49;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 73 / 0;
        }
        return serialDescriptor;
    }

    static {
        AssetAnalysisReq$$serializer assetAnalysisReq$$serializer = new AssetAnalysisReq$$serializer();
        INSTANCE = assetAnalysisReq$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.request.AssetAnalysisReq", assetAnalysisReq$$serializer, 1);
        setanimationsloop.onWarmupCompleted("totalAsset", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 123;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private AssetAnalysisReq$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {IncludeAssetRequest$$serializer.INSTANCE};
        int i4 = onWarmupCompleted + 115;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final AssetAnalysisReq deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        IncludeAssetRequest includeAssetRequest;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i4 = 1;
        Object obj = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            includeAssetRequest = (IncludeAssetRequest) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, IncludeAssetRequest$$serializer.INSTANCE, (Object) null);
        } else {
            int i5 = onNavigationEvent + 91;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 0;
            boolean z = true;
            IncludeAssetRequest includeAssetRequest2 = null;
            while (z) {
                int i8 = onNavigationEvent + 25;
                onWarmupCompleted = i8 % 128;
                if (i8 % 2 != 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    obj.hashCode();
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else {
                    if (iOnNavigationEvent != 0) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    includeAssetRequest2 = (IncludeAssetRequest) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, IncludeAssetRequest$$serializer.INSTANCE, includeAssetRequest2);
                    i7 = 1;
                }
            }
            includeAssetRequest = includeAssetRequest2;
            i4 = i7;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new AssetAnalysisReq(i4, includeAssetRequest, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m605deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        AssetAnalysisReq assetAnalysisReqDeserialize = deserialize(decoder);
        if (i3 == 0) {
            int i4 = 92 / 0;
        }
        int i5 = onNavigationEvent + 11;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return assetAnalysisReqDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AssetAnalysisReq assetAnalysisReq) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(assetAnalysisReq, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        AssetAnalysisReq.onNavigationEvent(assetAnalysisReq, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 51;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AssetAnalysisReq) obj);
        int i4 = onWarmupCompleted + 39;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onNavigationEvent + 67;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}
