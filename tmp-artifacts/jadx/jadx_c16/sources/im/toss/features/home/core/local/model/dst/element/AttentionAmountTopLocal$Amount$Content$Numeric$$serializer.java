package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.element.AttentionAmountTopLocal;
import im.toss.features.home.core.local.model.dst.widget.NumericContentLocal;
import im.toss.features.home.core.local.model.dst.widget.NumericContentLocal$;
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
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AttentionAmountTopLocal$Amount$Content$Numeric$$serializer implements aeu2<AttentionAmountTopLocal.Amount.Content.Numeric> {
    private static int IAuthTabCallback = 1;
    public static final AttentionAmountTopLocal$Amount$Content$Numeric$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 13;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return serialDescriptor;
        }
        obj.hashCode();
        throw null;
    }

    static {
        AttentionAmountTopLocal$Amount$Content$Numeric$$serializer attentionAmountTopLocal$Amount$Content$Numeric$$serializer = new AttentionAmountTopLocal$Amount$Content$Numeric$$serializer();
        INSTANCE = attentionAmountTopLocal$Amount$Content$Numeric$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.AttentionAmountTopLocal.Amount.Content.Numeric", attentionAmountTopLocal$Amount$Content$Numeric$$serializer, 1);
        setanimationsloop.onWarmupCompleted("content", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 3;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private AttentionAmountTopLocal$Amount$Content$Numeric$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(NumericContentLocal$.serializer.INSTANCE)};
        int i4 = onNavigationEvent + 33;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final AttentionAmountTopLocal.Amount.Content.Numeric deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        NumericContentLocal numericContentLocal;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i4 = 1;
        Object obj = null;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean z = true;
            int i5 = 0;
            numericContentLocal = null;
            while (z) {
                int i6 = onNavigationEvent + 63;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 != 0) {
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
                    numericContentLocal = (NumericContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, NumericContentLocal$.serializer.INSTANCE, numericContentLocal);
                    i5 = 1;
                }
            }
            i4 = i5;
        } else {
            numericContentLocal = (NumericContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, NumericContentLocal$.serializer.INSTANCE, (Object) null);
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        AttentionAmountTopLocal.Amount.Content.Numeric numeric = new AttentionAmountTopLocal.Amount.Content.Numeric(i4, numericContentLocal, (okycx) null);
        int i7 = onWarmupCompleted + 45;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return numeric;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m280deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        AttentionAmountTopLocal.Amount.Content.Numeric numericDeserialize = deserialize(decoder);
        int i4 = onWarmupCompleted + 49;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return numericDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AttentionAmountTopLocal.Amount.Content.Numeric numeric) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(numeric, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            AttentionAmountTopLocal.Amount.Content.Numeric.onExtraCallbackWithResult(numeric, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(numeric, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        AttentionAmountTopLocal.Amount.Content.Numeric.onExtraCallbackWithResult(numeric, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onWarmupCompleted + 51;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AttentionAmountTopLocal.Amount.Content.Numeric) obj);
        int i4 = onWarmupCompleted + 121;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
