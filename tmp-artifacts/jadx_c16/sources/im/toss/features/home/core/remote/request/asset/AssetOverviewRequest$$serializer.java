package im.toss.features.home.core.remote.request.asset;

import java.util.Map;
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
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetOverviewRequest$$serializer implements aeu2<AssetOverviewRequest> {
    private static int IAuthTabCallback = 1;
    public static final AssetOverviewRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 61;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 77;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        AssetOverviewRequest$$serializer assetOverviewRequest$$serializer = new AssetOverviewRequest$$serializer();
        INSTANCE = assetOverviewRequest$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.request.asset.AssetOverviewRequest", assetOverviewRequest$$serializer, 3);
        setanimationsloop.onWarmupCompleted("schemeParams", false);
        setanimationsloop.onWarmupCompleted("initialState", true);
        setanimationsloop.onWarmupCompleted("currentState", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 59;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private AssetOverviewRequest$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnExtraCallbackWithResult = AssetOverviewRequest.onExtraCallbackWithResult();
        KSerializer<?>[] kSerializerArr = {lazyArrOnExtraCallbackWithResult[0].getValue(), sp.IAuthTabCallback((KSerializer) lazyArrOnExtraCallbackWithResult[1].getValue()), sp.IAuthTabCallback((KSerializer) lazyArrOnExtraCallbackWithResult[2].getValue())};
        int i4 = onWarmupCompleted + 21;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final AssetOverviewRequest deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        Map map;
        Map map2;
        Map map3;
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 15;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallbackWithResult = AssetOverviewRequest.onExtraCallbackWithResult();
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            Map map4 = (Map) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallbackWithResult[0].getValue(), (Object) null);
            Map map5 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrOnExtraCallbackWithResult[1].getValue(), (Object) null);
            Map map6 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrOnExtraCallbackWithResult[2].getValue(), (Object) null);
            int i5 = onWarmupCompleted + 67;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 % 5;
            }
            map = map6;
            map2 = map4;
            map3 = map5;
            i = 7;
        } else {
            int i7 = 0;
            boolean z = true;
            Map map7 = null;
            Map map8 = null;
            Map map9 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i8 = onWarmupCompleted + 43;
                    int i9 = i8 % 128;
                    IAuthTabCallback = i9;
                    if (i8 % 2 == 0) {
                        throw null;
                    }
                    if (iOnNavigationEvent == 0) {
                        map8 = (Map) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallbackWithResult[0].getValue(), map8);
                        i7 |= 1;
                    } else if (iOnNavigationEvent != 1) {
                        int i10 = i9 + 69;
                        onWarmupCompleted = i10 % 128;
                        if (i10 % 2 != 0) {
                            if (iOnNavigationEvent != 3) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            map7 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrOnExtraCallbackWithResult[2].getValue(), map7);
                            i7 |= 4;
                        } else {
                            if (iOnNavigationEvent != 2) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            map7 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrOnExtraCallbackWithResult[2].getValue(), map7);
                            i7 |= 4;
                        }
                    } else {
                        map9 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrOnExtraCallbackWithResult[1].getValue(), map9);
                        i7 |= 2;
                    }
                } else {
                    z = false;
                }
            }
            map = map7;
            map2 = map8;
            map3 = map9;
            i = i7;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        AssetOverviewRequest assetOverviewRequest = new AssetOverviewRequest(i, map2, map3, map, (okycx) null);
        int i11 = onWarmupCompleted + 65;
        IAuthTabCallback = i11 % 128;
        int i12 = i11 % 2;
        return assetOverviewRequest;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m612deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        AssetOverviewRequest assetOverviewRequestDeserialize = deserialize(decoder);
        if (i3 == 0) {
            int i4 = 67 / 0;
        }
        int i5 = IAuthTabCallback + 89;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return assetOverviewRequestDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AssetOverviewRequest assetOverviewRequest) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(assetOverviewRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        AssetOverviewRequest.onExtraCallback(assetOverviewRequest, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 7;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AssetOverviewRequest) obj);
        int i4 = onWarmupCompleted + 79;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
            int i3 = 10 / 0;
        } else {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        }
        int i4 = onWarmupCompleted + 17;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
