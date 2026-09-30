package im.toss.core.tuba;

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
public final /* synthetic */ class TriggersResult$$serializer implements aeu2<TriggersResult> {
    private static int IAuthTabCallback = 0;
    public static final TriggersResult$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 119;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        TriggersResult$$serializer triggersResult$$serializer = new TriggersResult$$serializer();
        INSTANCE = triggersResult$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.core.tuba.TriggersResult", triggersResult$$serializer, 1);
        setanimationsloop.onWarmupCompleted("triggers", true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 63;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private TriggersResult$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        onExtraCallback = i2 % 128;
        return i2 % 2 == 0 ? new KSerializer[]{TriggersResult.onNavigationEvent()[1].getValue()} : new KSerializer[]{TriggersResult.onNavigationEvent()[0].getValue()};
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final TriggersResult deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        List list;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = TriggersResult.onNavigationEvent();
        int i2 = 1;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean z = true;
            list = null;
            int i3 = 0;
            while (z) {
                int i4 = onNavigationEvent + 55;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    int i6 = onExtraCallback + 53;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    z = false;
                } else {
                    if (iOnNavigationEvent != 0) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i8 = onExtraCallback + 123;
                    onNavigationEvent = i8 % 128;
                    list = (List) (i8 % 2 != 0 ? ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnNavigationEvent[0].getValue(), list) : ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnNavigationEvent[0].getValue(), list));
                    i3 = 1;
                }
            }
            i2 = i3;
        } else {
            list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnNavigationEvent[0].getValue(), (Object) null);
            int i9 = onNavigationEvent + 119;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TriggersResult(i2, list, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m60deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        TriggersResult triggersResultDeserialize = deserialize(decoder);
        int i4 = onExtraCallback + 67;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return triggersResultDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TriggersResult triggersResult) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(triggersResult, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            TriggersResult.onWarmupCompleted(triggersResult, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(triggersResult, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        TriggersResult.onWarmupCompleted(triggersResult, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TriggersResult) obj);
        int i4 = onExtraCallback + 53;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 != 0) {
            int i4 = 68 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
