package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.element.FullTooltipLocal;
import im.toss.features.home.core.local.model.dst.widget.FullTooltipAttributeLocal;
import im.toss.features.home.core.local.model.dst.widget.FullTooltipAttributeLocal$$serializer;
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
public final /* synthetic */ class FullTooltipLocal$$serializer implements aeu2<FullTooltipLocal> {
    public static final FullTooltipLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 125;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        FullTooltipLocal$$serializer fullTooltipLocal$$serializer = new FullTooltipLocal$$serializer();
        INSTANCE = fullTooltipLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.FullTooltipLocal", fullTooltipLocal$$serializer, 3);
        setanimationsloop.onWarmupCompleted("fullTooltip", false);
        setanimationsloop.onWarmupCompleted("arrowAlignment", false);
        setanimationsloop.onWarmupCompleted("arrowDirection", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 81;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private FullTooltipLocal$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnExtraCallbackWithResult = FullTooltipLocal.onExtraCallbackWithResult();
        KSerializer<?>[] kSerializerArr = {FullTooltipAttributeLocal$$serializer.INSTANCE, lazyArrOnExtraCallbackWithResult[1].getValue(), lazyArrOnExtraCallbackWithResult[2].getValue()};
        int i4 = onNavigationEvent + 99;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 69 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final FullTooltipLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        FullTooltipLocal.onWarmupCompleted onwarmupcompleted;
        int i;
        FullTooltipAttributeLocal fullTooltipAttributeLocal;
        FullTooltipLocal.onExtraCallbackWithResult onextracallbackwithresult;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallbackWithResult = FullTooltipLocal.onExtraCallbackWithResult();
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            FullTooltipAttributeLocal fullTooltipAttributeLocal2 = (FullTooltipAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, FullTooltipAttributeLocal$$serializer.INSTANCE, (Object) null);
            FullTooltipLocal.onExtraCallbackWithResult onextracallbackwithresult2 = (FullTooltipLocal.onExtraCallbackWithResult) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnExtraCallbackWithResult[1].getValue(), (Object) null);
            onwarmupcompleted = (FullTooltipLocal.onWarmupCompleted) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrOnExtraCallbackWithResult[2].getValue(), (Object) null);
            i = 7;
            fullTooltipAttributeLocal = fullTooltipAttributeLocal2;
            onextracallbackwithresult = onextracallbackwithresult2;
        } else {
            int i3 = 0;
            boolean z = true;
            FullTooltipLocal.onWarmupCompleted onwarmupcompleted2 = null;
            FullTooltipAttributeLocal fullTooltipAttributeLocal3 = null;
            FullTooltipLocal.onExtraCallbackWithResult onextracallbackwithresult3 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i4 = onWarmupCompleted + 29;
                    int i5 = i4 % 128;
                    onNavigationEvent = i5;
                    if (i4 % 2 != 0) {
                        throw null;
                    }
                    if (iOnNavigationEvent == 0) {
                        fullTooltipAttributeLocal3 = (FullTooltipAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, FullTooltipAttributeLocal$$serializer.INSTANCE, fullTooltipAttributeLocal3);
                        i3 |= 1;
                        int i6 = onNavigationEvent + 61;
                        onWarmupCompleted = i6 % 128;
                        int i7 = i6 % 2;
                    } else if (iOnNavigationEvent == 1) {
                        onextracallbackwithresult3 = (FullTooltipLocal.onExtraCallbackWithResult) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnExtraCallbackWithResult[1].getValue(), onextracallbackwithresult3);
                        i3 |= 2;
                    } else {
                        if (iOnNavigationEvent != 2) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i8 = i5 + 97;
                        onWarmupCompleted = i8 % 128;
                        onwarmupcompleted2 = (FullTooltipLocal.onWarmupCompleted) (i8 % 2 == 0 ? ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrOnExtraCallbackWithResult[3].getValue(), onwarmupcompleted2) : ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrOnExtraCallbackWithResult[2].getValue(), onwarmupcompleted2));
                        i3 |= 4;
                    }
                } else {
                    z = false;
                }
            }
            onwarmupcompleted = onwarmupcompleted2;
            i = i3;
            fullTooltipAttributeLocal = fullTooltipAttributeLocal3;
            onextracallbackwithresult = onextracallbackwithresult3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new FullTooltipLocal(i, fullTooltipAttributeLocal, onextracallbackwithresult, onwarmupcompleted, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m374deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        FullTooltipLocal fullTooltipLocalDeserialize = deserialize(decoder);
        int i4 = onWarmupCompleted + 5;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return fullTooltipLocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull FullTooltipLocal fullTooltipLocal) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(fullTooltipLocal, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            FullTooltipLocal.onNavigationEvent(fullTooltipLocal, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(fullTooltipLocal, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        FullTooltipLocal.onNavigationEvent(fullTooltipLocal, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onNavigationEvent + 97;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (FullTooltipLocal) obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onWarmupCompleted + 71;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }
}
