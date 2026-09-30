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
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ExperimentConsumptionAmountTopMiniGraphLocal$Graph$GraphItem$$serializer implements aeu2<ExperimentConsumptionAmountTopMiniGraphLocal.Graph.GraphItem> {
    private static int IAuthTabCallback = 1;
    public static final ExperimentConsumptionAmountTopMiniGraphLocal$Graph$GraphItem$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 == 0) {
            int i4 = 31 / 0;
        }
        return serialDescriptor;
    }

    static {
        ExperimentConsumptionAmountTopMiniGraphLocal$Graph$GraphItem$$serializer experimentConsumptionAmountTopMiniGraphLocal$Graph$GraphItem$$serializer = new ExperimentConsumptionAmountTopMiniGraphLocal$Graph$GraphItem$$serializer();
        INSTANCE = experimentConsumptionAmountTopMiniGraphLocal$Graph$GraphItem$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.ExperimentConsumptionAmountTopMiniGraphLocal.Graph.GraphItem", experimentConsumptionAmountTopMiniGraphLocal$Graph$GraphItem$$serializer, 3);
        setanimationsloop.onWarmupCompleted("color", false);
        setanimationsloop.onWarmupCompleted("stringSeries", true);
        setanimationsloop.onWarmupCompleted("series", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 47;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private ExperimentConsumptionAmountTopMiniGraphLocal$Graph$GraphItem$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrIAuthTabCallback = ExperimentConsumptionAmountTopMiniGraphLocal.Graph.GraphItem.IAuthTabCallback();
        KSerializer<?>[] kSerializerArr = {getWriggleLayout.onNavigationEvent, sp.IAuthTabCallback((KSerializer) lazyArrIAuthTabCallback[1].getValue()), sp.IAuthTabCallback((KSerializer) lazyArrIAuthTabCallback[2].getValue())};
        int i4 = onWarmupCompleted + 123;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ExperimentConsumptionAmountTopMiniGraphLocal.Graph.GraphItem deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        List list;
        List list2;
        String str;
        int i2;
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 97;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrIAuthTabCallback = ExperimentConsumptionAmountTopMiniGraphLocal.Graph.GraphItem.IAuthTabCallback();
        List list3 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i6 = onWarmupCompleted + 73;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            List list4 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrIAuthTabCallback[1].getValue(), (Object) null);
            list2 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrIAuthTabCallback[2].getValue(), (Object) null);
            i = 7;
            str = strAsInterface;
            list = list4;
        } else {
            int i8 = 0;
            List list5 = null;
            String strAsInterface2 = null;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                    i8 |= 1;
                } else if (iOnNavigationEvent != 1) {
                    int i9 = onWarmupCompleted;
                    int i10 = i9 + 123;
                    onExtraCallbackWithResult = i10 % 128;
                    if (i10 % 2 != 0) {
                        if (iOnNavigationEvent != 4) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        i2 = i9 + 25;
                        onExtraCallbackWithResult = i2 % 128;
                        if (i2 % 2 == 0) {
                            list5 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, (jp) lazyArrIAuthTabCallback[3].getValue(), list5);
                            i8 |= 2;
                        } else {
                            list5 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrIAuthTabCallback[2].getValue(), list5);
                            i8 |= 4;
                        }
                        int i11 = onWarmupCompleted + 73;
                        onExtraCallbackWithResult = i11 % 128;
                        int i12 = i11 % 2;
                    } else {
                        if (iOnNavigationEvent != 2) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        i2 = i9 + 25;
                        onExtraCallbackWithResult = i2 % 128;
                        if (i2 % 2 == 0) {
                        }
                        int i112 = onWarmupCompleted + 73;
                        onExtraCallbackWithResult = i112 % 128;
                        int i122 = i112 % 2;
                    }
                } else {
                    list3 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrIAuthTabCallback[1].getValue(), list3);
                    i8 |= 2;
                }
            }
            i = i8;
            list = list3;
            list2 = list5;
            str = strAsInterface2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ExperimentConsumptionAmountTopMiniGraphLocal.Graph.GraphItem(i, str, list, list2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m346deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ExperimentConsumptionAmountTopMiniGraphLocal.Graph.GraphItem graphItemDeserialize = deserialize(decoder);
        int i4 = onWarmupCompleted + 49;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 7 / 0;
        }
        return graphItemDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ExperimentConsumptionAmountTopMiniGraphLocal.Graph.GraphItem graphItem) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(graphItem, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        ExperimentConsumptionAmountTopMiniGraphLocal.Graph.GraphItem.onNavigationEvent(graphItem, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallbackWithResult + 37;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ExperimentConsumptionAmountTopMiniGraphLocal.Graph.GraphItem) obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 25;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}
