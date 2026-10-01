package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.property.PaddingLocal;
import im.toss.features.home.core.local.model.dst.property.PaddingLocal$$serializer;
import im.toss.features.home.core.local.model.dst.widget.YearMonthSelectorAttributeLocal;
import im.toss.features.home.core.local.model.dst.widget.YearMonthSelectorAttributeLocal$;
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
public final /* synthetic */ class YearMonthSelectorLocal$$serializer implements aeu2<YearMonthSelectorLocal> {
    public static final YearMonthSelectorLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 119;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 1;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 64 / 0;
        }
        return serialDescriptor;
    }

    static {
        YearMonthSelectorLocal$$serializer yearMonthSelectorLocal$$serializer = new YearMonthSelectorLocal$$serializer();
        INSTANCE = yearMonthSelectorLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.YearMonthSelectorLocal", yearMonthSelectorLocal$$serializer, 2);
        setanimationsloop.onWarmupCompleted("yearMonthSelector", false);
        setanimationsloop.onWarmupCompleted("padding", false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 67;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private YearMonthSelectorLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {YearMonthSelectorAttributeLocal$.serializer.INSTANCE, PaddingLocal$$serializer.INSTANCE};
        int i4 = onExtraCallback + 121;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final YearMonthSelectorLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        YearMonthSelectorAttributeLocal yearMonthSelectorAttributeLocal;
        PaddingLocal paddingLocal;
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 99;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            yearMonthSelectorAttributeLocal = (YearMonthSelectorAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, YearMonthSelectorAttributeLocal$.serializer.INSTANCE, (Object) null);
            paddingLocal = (PaddingLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, PaddingLocal$$serializer.INSTANCE, (Object) null);
            i = 3;
        } else {
            int i5 = 0;
            boolean z = true;
            YearMonthSelectorAttributeLocal yearMonthSelectorAttributeLocal2 = null;
            PaddingLocal paddingLocal2 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i6 = onExtraCallback + 5;
                    onExtraCallbackWithResult = i6 % 128;
                    if (i6 % 2 == 0) {
                        throw null;
                    }
                    if (iOnNavigationEvent == 0) {
                        yearMonthSelectorAttributeLocal2 = (YearMonthSelectorAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, YearMonthSelectorAttributeLocal$.serializer.INSTANCE, yearMonthSelectorAttributeLocal2);
                        i5 |= 1;
                    } else {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        paddingLocal2 = (PaddingLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, PaddingLocal$$serializer.INSTANCE, paddingLocal2);
                        i5 |= 2;
                    }
                } else {
                    int i7 = onExtraCallbackWithResult + 85;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    z = false;
                }
            }
            yearMonthSelectorAttributeLocal = yearMonthSelectorAttributeLocal2;
            paddingLocal = paddingLocal2;
            i = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new YearMonthSelectorLocal(i, yearMonthSelectorAttributeLocal, paddingLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m421deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        YearMonthSelectorLocal yearMonthSelectorLocalDeserialize = deserialize(decoder);
        int i4 = onExtraCallback + 71;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return yearMonthSelectorLocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull YearMonthSelectorLocal yearMonthSelectorLocal) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(yearMonthSelectorLocal, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            YearMonthSelectorLocal.IAuthTabCallback(yearMonthSelectorLocal, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(yearMonthSelectorLocal, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        YearMonthSelectorLocal.IAuthTabCallback(yearMonthSelectorLocal, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (YearMonthSelectorLocal) obj);
        int i4 = onExtraCallbackWithResult + 45;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onExtraCallback + 37;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 3 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
