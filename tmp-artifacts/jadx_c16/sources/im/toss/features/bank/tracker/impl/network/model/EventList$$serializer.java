package im.toss.features.bank.tracker.impl.network.model;

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
public final /* synthetic */ class EventList$$serializer implements aeu2<EventList> {
    private static int IAuthTabCallback = 1;
    public static final EventList$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 43;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 95;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 10 / 0;
        }
        return serialDescriptor;
    }

    static {
        EventList$$serializer eventList$$serializer = new EventList$$serializer();
        INSTANCE = eventList$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.bank.tracker.impl.network.model.EventList", eventList$$serializer, 1);
        setanimationsloop.onWarmupCompleted("eventList", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 53;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private EventList$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlinx.serialization.KSerializer[]] */
    /* JADX WARN: Type inference failed for: r4v2, types: [kotlinx.serialization.KSerializer[]] */
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            ?? r4 = new KSerializer[0];
            r4[1] = EventList.onNavigationEvent()[0].getValue();
            kSerializerArr = r4;
        } else {
            kSerializerArr = new KSerializer[]{EventList.onNavigationEvent()[0].getValue()};
        }
        int i3 = onWarmupCompleted + 19;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final EventList deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        List list;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = EventList.onNavigationEvent();
        int i2 = 1;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onWarmupCompleted + 65;
            onNavigationEvent = i3 % 128;
            list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, i3 % 2 == 0 ? (jp) lazyArrOnNavigationEvent[0].getValue() : (jp) lazyArrOnNavigationEvent[0].getValue(), (Object) null);
        } else {
            int i4 = onWarmupCompleted + 73;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            boolean z = true;
            List list2 = null;
            int i6 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i7 = onNavigationEvent + 9;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    if (iOnNavigationEvent != 0) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnNavigationEvent[0].getValue(), list2);
                    i6 = 1;
                } else {
                    int i9 = onWarmupCompleted + 63;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                    z = false;
                }
            }
            list = list2;
            i2 = i6;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new EventList(i2, list, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m77deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        EventList eventListDeserialize = deserialize(decoder);
        int i4 = onWarmupCompleted + 125;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return eventListDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull EventList eventList) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(eventList, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        EventList.IAuthTabCallback(eventList, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 87;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (EventList) obj);
        if (i3 == 0) {
            int i4 = 44 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onNavigationEvent + 67;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 78 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
