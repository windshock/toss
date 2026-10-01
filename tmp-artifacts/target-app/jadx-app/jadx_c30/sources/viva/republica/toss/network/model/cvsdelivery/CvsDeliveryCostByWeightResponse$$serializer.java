package viva.republica.toss.network.model.cvsdelivery;

import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import net.sf.scuba.smartcards.BuildConfig;
import o.aeu2;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class CvsDeliveryCostByWeightResponse$$serializer implements aeu2<CvsDeliveryCostByWeightResponse> {
    private static int IAuthTabCallback = 0;
    public static final CvsDeliveryCostByWeightResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 99;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 17 / 0;
        }
        return serialDescriptor;
    }

    static {
        CvsDeliveryCostByWeightResponse$$serializer cvsDeliveryCostByWeightResponse$$serializer = new CvsDeliveryCostByWeightResponse$$serializer();
        INSTANCE = cvsDeliveryCostByWeightResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.cvsdelivery.CvsDeliveryCostByWeightResponse", cvsDeliveryCostByWeightResponse$$serializer, 1);
        setanimationsloop.onWarmupCompleted("storeToStore", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 79;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private CvsDeliveryCostByWeightResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {CvsDeliveryCostByWeightResponse.onExtraCallbackWithResult()[0].getValue()};
        int i4 = onExtraCallbackWithResult + 55;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        CvsDeliveryCostByWeightResponse cvsDeliveryCostByWeightResponseM48deserialize = m48deserialize(decoder);
        if (i3 == 0) {
            int i4 = 23 / 0;
        }
        return cvsDeliveryCostByWeightResponseM48deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final CvsDeliveryCostByWeightResponse m48deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        List list;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallbackWithResult = CvsDeliveryCostByWeightResponse.onExtraCallbackWithResult();
        int i2 = 1;
        Object obj = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallbackWithResult[0].getValue(), (Object) null);
            int i3 = onExtraCallbackWithResult + 77;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
        } else {
            boolean z = true;
            List list2 = null;
            int i5 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i6 = onExtraCallback + 125;
                    onExtraCallbackWithResult = i6 % 128;
                    if (i6 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (iOnNavigationEvent != 0) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallbackWithResult[0].getValue(), list2);
                    i5 = 1;
                } else {
                    z = false;
                }
            }
            list = list2;
            i2 = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CvsDeliveryCostByWeightResponse(i2, list, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CvsDeliveryCostByWeightResponse) obj);
        if (i3 != 0) {
            int i4 = 26 / 0;
        }
        int i5 = onExtraCallback + 113;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 80 / 0;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CvsDeliveryCostByWeightResponse cvsDeliveryCostByWeightResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(cvsDeliveryCostByWeightResponse, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        CvsDeliveryCostByWeightResponse.onNavigationEvent(cvsDeliveryCostByWeightResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 85;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 94 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onExtraCallback + 79;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        obj.hashCode();
        throw null;
    }
}
