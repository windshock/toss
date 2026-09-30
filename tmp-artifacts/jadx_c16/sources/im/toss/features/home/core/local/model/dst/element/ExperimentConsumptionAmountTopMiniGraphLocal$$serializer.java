package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.element.ExperimentConsumptionAmountTopMiniGraphLocal;
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
public final /* synthetic */ class ExperimentConsumptionAmountTopMiniGraphLocal$$serializer implements aeu2<ExperimentConsumptionAmountTopMiniGraphLocal> {
    private static int IAuthTabCallback = 0;
    public static final ExperimentConsumptionAmountTopMiniGraphLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        ExperimentConsumptionAmountTopMiniGraphLocal$$serializer experimentConsumptionAmountTopMiniGraphLocal$$serializer = new ExperimentConsumptionAmountTopMiniGraphLocal$$serializer();
        INSTANCE = experimentConsumptionAmountTopMiniGraphLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.ExperimentConsumptionAmountTopMiniGraphLocal", experimentConsumptionAmountTopMiniGraphLocal$$serializer, 3);
        setanimationsloop.onWarmupCompleted("amount", false);
        setanimationsloop.onWarmupCompleted("descriptions", false);
        setanimationsloop.onWarmupCompleted("graph", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 31;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private ExperimentConsumptionAmountTopMiniGraphLocal$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {ExperimentConsumptionAmountTopMiniGraphLocal$Amount$$serializer.INSTANCE, ExperimentConsumptionAmountTopMiniGraphLocal.onWarmupCompleted()[1].getValue(), ExperimentConsumptionAmountTopMiniGraphLocal$Graph$$serializer.INSTANCE};
        int i4 = onExtraCallbackWithResult + 13;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ExperimentConsumptionAmountTopMiniGraphLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        List list;
        ExperimentConsumptionAmountTopMiniGraphLocal.Graph graph;
        ExperimentConsumptionAmountTopMiniGraphLocal.Amount amount;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnWarmupCompleted = ExperimentConsumptionAmountTopMiniGraphLocal.onWarmupCompleted();
        List list2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onExtraCallbackWithResult + 63;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            ExperimentConsumptionAmountTopMiniGraphLocal.Amount amount2 = (ExperimentConsumptionAmountTopMiniGraphLocal.Amount) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, ExperimentConsumptionAmountTopMiniGraphLocal$Amount$$serializer.INSTANCE, (Object) null);
            List list3 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), (Object) null);
            graph = (ExperimentConsumptionAmountTopMiniGraphLocal.Graph) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, ExperimentConsumptionAmountTopMiniGraphLocal$Graph$$serializer.INSTANCE, (Object) null);
            list = list3;
            amount = amount2;
            i = 7;
        } else {
            int i5 = 0;
            ExperimentConsumptionAmountTopMiniGraphLocal.Graph graph2 = null;
            ExperimentConsumptionAmountTopMiniGraphLocal.Amount amount3 = null;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i6 = IAuthTabCallback + 81;
                    onExtraCallbackWithResult = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 67 / 0;
                        if (iOnNavigationEvent == 0) {
                            amount3 = (ExperimentConsumptionAmountTopMiniGraphLocal.Amount) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, ExperimentConsumptionAmountTopMiniGraphLocal$Amount$$serializer.INSTANCE, amount3);
                            i5 |= 1;
                        } else if (iOnNavigationEvent != 1) {
                            list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), list2);
                            i5 |= 2;
                        } else {
                            if (iOnNavigationEvent != 2) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            graph2 = (ExperimentConsumptionAmountTopMiniGraphLocal.Graph) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, ExperimentConsumptionAmountTopMiniGraphLocal$Graph$$serializer.INSTANCE, graph2);
                            i5 |= 4;
                        }
                    } else if (iOnNavigationEvent == 0) {
                        amount3 = (ExperimentConsumptionAmountTopMiniGraphLocal.Amount) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, ExperimentConsumptionAmountTopMiniGraphLocal$Amount$$serializer.INSTANCE, amount3);
                        i5 |= 1;
                    } else if (iOnNavigationEvent != 1) {
                    }
                } else {
                    int i8 = onExtraCallbackWithResult + 11;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                    z = false;
                }
            }
            i = i5;
            list = list2;
            graph = graph2;
            amount = amount3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ExperimentConsumptionAmountTopMiniGraphLocal(i, amount, list, graph, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m343deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ExperimentConsumptionAmountTopMiniGraphLocal experimentConsumptionAmountTopMiniGraphLocalDeserialize = deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 97;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return experimentConsumptionAmountTopMiniGraphLocalDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ExperimentConsumptionAmountTopMiniGraphLocal experimentConsumptionAmountTopMiniGraphLocal) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(experimentConsumptionAmountTopMiniGraphLocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        ExperimentConsumptionAmountTopMiniGraphLocal.onExtraCallbackWithResult(experimentConsumptionAmountTopMiniGraphLocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallbackWithResult + 79;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ExperimentConsumptionAmountTopMiniGraphLocal) obj);
        int i4 = onExtraCallbackWithResult + 37;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
            int i3 = 19 / 0;
        } else {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        }
        int i4 = onExtraCallbackWithResult + 7;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
