package im.toss.appsintoss.data.remote.model;

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
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class AppsInTossAvailableProductListResponse$$serializer implements aeu2<AppsInTossAvailableProductListResponse> {
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final AppsInTossAvailableProductListResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;

    public final SerialDescriptor getDescriptor() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 41;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        AppsInTossAvailableProductListResponse$$serializer appsInTossAvailableProductListResponse$$serializer = new AppsInTossAvailableProductListResponse$$serializer();
        INSTANCE = appsInTossAvailableProductListResponse$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.appsintoss.data.remote.model.AppsInTossAvailableProductListResponse", appsInTossAvailableProductListResponse$$serializer, 1);
        setanimationsloop.onWarmupCompleted("products", false);
        descriptor = setanimationsloop;
        int i2 = onExtraCallback + 45;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    private AppsInTossAvailableProductListResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlinx.serialization.KSerializer[]] */
    /* JADX WARN: Type inference failed for: r4v2, types: [kotlinx.serialization.KSerializer[]] */
    public final KSerializer<?>[] childSerializers() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 43;
        IAuthTabCallback = i3 % 128;
        KSerializer<?>[] kSerializerArr = i3 % 2 != 0 ? new KSerializer[]{AppsInTossAvailableProductListResponse.onNavigationEvent()[0].getValue()} : new KSerializer[]{AppsInTossAvailableProductListResponse.onNavigationEvent()[0].getValue()};
        int i4 = onNavigationEvent + 1;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final AppsInTossAvailableProductListResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        List list;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = AppsInTossAvailableProductListResponse.onNavigationEvent();
        int i3 = 1;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnNavigationEvent[0].getValue(), (Object) null);
            int i4 = onNavigationEvent + 47;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        } else {
            List list2 = null;
            boolean z = true;
            int i6 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    int i7 = IAuthTabCallback + 89;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    z = false;
                } else {
                    if (iOnNavigationEvent != 0) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnNavigationEvent[0].getValue(), list2);
                    i6 = 1;
                }
            }
            list = list2;
            i3 = i6;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new AppsInTossAvailableProductListResponse(i3, list, null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m161deserialize(Decoder decoder) throws UnknownFieldException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 101;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        AppsInTossAvailableProductListResponse appsInTossAvailableProductListResponseDeserialize = deserialize(decoder);
        int i5 = onNavigationEvent + 17;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return appsInTossAvailableProductListResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AppsInTossAvailableProductListResponse appsInTossAvailableProductListResponse) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 3;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(appsInTossAvailableProductListResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        AppsInTossAvailableProductListResponse.onExtraCallbackWithResult(appsInTossAvailableProductListResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i5 = IAuthTabCallback + 81;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 103;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        serialize(encoder, (AppsInTossAvailableProductListResponse) obj);
        int i5 = IAuthTabCallback + 5;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 66 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 125;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i5 = onNavigationEvent + 91;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
