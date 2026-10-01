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
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.setAppxVersionInWorker;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ExperimentConsumptionAmountTopMiniGraphLocal$Amount$$serializer implements aeu2<ExperimentConsumptionAmountTopMiniGraphLocal.Amount> {
    private static int IAuthTabCallback = 0;
    public static final ExperimentConsumptionAmountTopMiniGraphLocal$Amount$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public final SerialDescriptor getDescriptor() {
        SerialDescriptor serialDescriptor;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            serialDescriptor = descriptor;
            int i4 = 13 / 0;
        } else {
            serialDescriptor = descriptor;
        }
        int i5 = i3 + 53;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        ExperimentConsumptionAmountTopMiniGraphLocal$Amount$$serializer experimentConsumptionAmountTopMiniGraphLocal$Amount$$serializer = new ExperimentConsumptionAmountTopMiniGraphLocal$Amount$$serializer();
        INSTANCE = experimentConsumptionAmountTopMiniGraphLocal$Amount$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.ExperimentConsumptionAmountTopMiniGraphLocal.Amount", experimentConsumptionAmountTopMiniGraphLocal$Amount$$serializer, 6);
        setanimationsloop.onWarmupCompleted("prefix", false);
        setanimationsloop.onWarmupCompleted("stringNumber", true);
        setanimationsloop.onWarmupCompleted("unit", false);
        setanimationsloop.onWarmupCompleted("handler", false);
        setanimationsloop.onWarmupCompleted("number", true);
        setanimationsloop.onWarmupCompleted("precision", true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 49;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ExperimentConsumptionAmountTopMiniGraphLocal$Amount$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(setAppxVersionInWorker.onExtraCallback), sp.IAuthTabCallback(oty1.onExtraCallback), sp.IAuthTabCallback(getDynamicHeight.onWarmupCompleted)};
        int i4 = onExtraCallback + 17;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ExperimentConsumptionAmountTopMiniGraphLocal.Amount deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        Long l;
        String str2;
        String str3;
        HandlerLocal handlerLocal;
        Integer num;
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 55;
        onExtraCallback = i3 % 128;
        Long l2 = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            decoder.onWarmupCompleted(descriptor).extraCallbackWithResult();
            l2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i4 = 4;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i5 = onExtraCallback + 33;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            String str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            String str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            HandlerLocal handlerLocal2 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, setAppxVersionInWorker.onExtraCallback, (Object) null);
            Long l3 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, oty1.onExtraCallback, (Object) null);
            str = str6;
            handlerLocal = handlerLocal2;
            num = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getDynamicHeight.onWarmupCompleted, (Object) null);
            i = 63;
            l = l3;
            str2 = str4;
            str3 = str5;
        } else {
            String str7 = null;
            String str8 = null;
            String str9 = null;
            HandlerLocal handlerLocal3 = null;
            Integer num2 = null;
            int i7 = 0;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                    case 0:
                        str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str8);
                        i7 |= 1;
                        i4 = 4;
                    case 1:
                        str9 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str9);
                        i7 |= 2;
                        i4 = 4;
                    case 2:
                        str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str7);
                        i7 |= 4;
                        i4 = 4;
                    case 3:
                        handlerLocal3 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, setAppxVersionInWorker.onExtraCallback, handlerLocal3);
                        i7 |= 8;
                        int i8 = onExtraCallback + 39;
                        IAuthTabCallback = i8 % 128;
                        if (i8 % 2 != 0) {
                            int i9 = 3 / 2;
                        }
                        i4 = 4;
                    case 4:
                        l2 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4, oty1.onExtraCallback, l2);
                        i7 |= 16;
                    case 5:
                        num2 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getDynamicHeight.onWarmupCompleted, num2);
                        i7 |= 32;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            int i10 = onExtraCallback + 87;
            IAuthTabCallback = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 5 % 3;
            }
            str = str7;
            l = l2;
            str2 = str8;
            str3 = str9;
            handlerLocal = handlerLocal3;
            num = num2;
            i = i7;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ExperimentConsumptionAmountTopMiniGraphLocal.Amount(i, str2, str3, str, handlerLocal, l, num, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m344deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            obj.hashCode();
            throw null;
        }
        ExperimentConsumptionAmountTopMiniGraphLocal.Amount amountDeserialize = deserialize(decoder);
        int i3 = onExtraCallback + 67;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return amountDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ExperimentConsumptionAmountTopMiniGraphLocal.Amount amount) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(amount, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            ExperimentConsumptionAmountTopMiniGraphLocal.Amount.IAuthTabCallback(amount, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 27 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(amount, "");
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            ExperimentConsumptionAmountTopMiniGraphLocal.Amount.IAuthTabCallback(amount, vylVarOnExtraCallback2, serialDescriptor2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = IAuthTabCallback + 89;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ExperimentConsumptionAmountTopMiniGraphLocal.Amount) obj);
        if (i3 == 0) {
            int i4 = 86 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 119;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
