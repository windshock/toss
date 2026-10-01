package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.element.ExperimentConsumptionAmountTopMiniGraphLocal;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
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
import o.setAppxVersionInWorker;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ExperimentConsumptionAmountTopMiniGraphLocal$Graph$$serializer implements aeu2<ExperimentConsumptionAmountTopMiniGraphLocal.Graph> {
    private static int IAuthTabCallback = 0;
    public static final ExperimentConsumptionAmountTopMiniGraphLocal$Graph$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 113;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        ExperimentConsumptionAmountTopMiniGraphLocal$Graph$$serializer experimentConsumptionAmountTopMiniGraphLocal$Graph$$serializer = new ExperimentConsumptionAmountTopMiniGraphLocal$Graph$$serializer();
        INSTANCE = experimentConsumptionAmountTopMiniGraphLocal$Graph$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.ExperimentConsumptionAmountTopMiniGraphLocal.Graph", experimentConsumptionAmountTopMiniGraphLocal$Graph$$serializer, 3);
        setanimationsloop.onWarmupCompleted("base", false);
        setanimationsloop.onWarmupCompleted("comparison", false);
        setanimationsloop.onWarmupCompleted("handler", false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 23;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private ExperimentConsumptionAmountTopMiniGraphLocal$Graph$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(setAppxVersionInWorker.onExtraCallback);
        ExperimentConsumptionAmountTopMiniGraphLocal$Graph$GraphItem$$serializer experimentConsumptionAmountTopMiniGraphLocal$Graph$GraphItem$$serializer = ExperimentConsumptionAmountTopMiniGraphLocal$Graph$GraphItem$$serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {experimentConsumptionAmountTopMiniGraphLocal$Graph$GraphItem$$serializer, experimentConsumptionAmountTopMiniGraphLocal$Graph$GraphItem$$serializer, kSerializerIAuthTabCallback};
        int i4 = IAuthTabCallback + 7;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ExperimentConsumptionAmountTopMiniGraphLocal.Graph deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        HandlerLocal handlerLocal;
        ExperimentConsumptionAmountTopMiniGraphLocal.Graph.GraphItem graphItem;
        int i;
        ExperimentConsumptionAmountTopMiniGraphLocal.Graph.GraphItem graphItem2;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 87;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        ExperimentConsumptionAmountTopMiniGraphLocal.Graph.GraphItem graphItem3 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i5 = onExtraCallbackWithResult + 13;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            ExperimentConsumptionAmountTopMiniGraphLocal$Graph$GraphItem$$serializer experimentConsumptionAmountTopMiniGraphLocal$Graph$GraphItem$$serializer = ExperimentConsumptionAmountTopMiniGraphLocal$Graph$GraphItem$$serializer.INSTANCE;
            ExperimentConsumptionAmountTopMiniGraphLocal.Graph.GraphItem graphItem4 = (ExperimentConsumptionAmountTopMiniGraphLocal.Graph.GraphItem) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, experimentConsumptionAmountTopMiniGraphLocal$Graph$GraphItem$$serializer, (Object) null);
            graphItem = (ExperimentConsumptionAmountTopMiniGraphLocal.Graph.GraphItem) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, experimentConsumptionAmountTopMiniGraphLocal$Graph$GraphItem$$serializer, (Object) null);
            handlerLocal = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, setAppxVersionInWorker.onExtraCallback, (Object) null);
            i = 7;
            graphItem2 = graphItem4;
        } else {
            int i7 = 0;
            boolean z = true;
            HandlerLocal handlerLocal2 = null;
            ExperimentConsumptionAmountTopMiniGraphLocal.Graph.GraphItem graphItem5 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i8 = onExtraCallbackWithResult;
                    int i9 = i8 + 47;
                    IAuthTabCallback = i9 % 128;
                    if (i9 % 2 != 0) {
                        if (iOnNavigationEvent == 0) {
                            graphItem3 = (ExperimentConsumptionAmountTopMiniGraphLocal.Graph.GraphItem) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, ExperimentConsumptionAmountTopMiniGraphLocal$Graph$GraphItem$$serializer.INSTANCE, graphItem3);
                            i7 |= 2;
                        }
                        if (iOnNavigationEvent == 2) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i10 = i8 + 25;
                        IAuthTabCallback = i10 % 128;
                        int i11 = i10 % 2;
                        Object objOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, setAppxVersionInWorker.onExtraCallback, handlerLocal2);
                        if (i11 != 0) {
                            handlerLocal2 = (HandlerLocal) objOnExtraCallbackWithResult;
                            i7 |= 2;
                        } else {
                            handlerLocal2 = (HandlerLocal) objOnExtraCallbackWithResult;
                            i7 |= 4;
                        }
                    } else {
                        if (iOnNavigationEvent == 1) {
                            graphItem3 = (ExperimentConsumptionAmountTopMiniGraphLocal.Graph.GraphItem) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, ExperimentConsumptionAmountTopMiniGraphLocal$Graph$GraphItem$$serializer.INSTANCE, graphItem3);
                            i7 |= 2;
                        }
                        if (iOnNavigationEvent == 2) {
                        }
                    }
                } else {
                    graphItem5 = (ExperimentConsumptionAmountTopMiniGraphLocal.Graph.GraphItem) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, ExperimentConsumptionAmountTopMiniGraphLocal$Graph$GraphItem$$serializer.INSTANCE, graphItem5);
                    i7 |= 1;
                }
            }
            handlerLocal = handlerLocal2;
            graphItem = graphItem3;
            i = i7;
            graphItem2 = graphItem5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        ExperimentConsumptionAmountTopMiniGraphLocal.Graph graph = new ExperimentConsumptionAmountTopMiniGraphLocal.Graph(i, graphItem2, graphItem, handlerLocal, (okycx) null);
        int i12 = IAuthTabCallback + 55;
        onExtraCallbackWithResult = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 54 / 0;
        }
        return graph;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m345deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ExperimentConsumptionAmountTopMiniGraphLocal.Graph graphDeserialize = deserialize(decoder);
        if (i3 == 0) {
            int i4 = 23 / 0;
        }
        return graphDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ExperimentConsumptionAmountTopMiniGraphLocal.Graph graph) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(graph, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            ExperimentConsumptionAmountTopMiniGraphLocal.Graph.onNavigationEvent(graph, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 39 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(graph, "");
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            ExperimentConsumptionAmountTopMiniGraphLocal.Graph.onNavigationEvent(graph, vylVarOnExtraCallback2, serialDescriptor2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = IAuthTabCallback + 73;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 21 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ExperimentConsumptionAmountTopMiniGraphLocal.Graph) obj);
        int i4 = IAuthTabCallback + 107;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
