package im.toss.core.tracker.entry;

import java.util.List;
import java.util.Map;
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
public final /* synthetic */ class TrackView$$serializer implements aeu2<TrackView> {
    private static int IAuthTabCallback = 1;
    public static final TrackView$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        TrackView$$serializer trackView$$serializer = new TrackView$$serializer();
        INSTANCE = trackView$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.core.tracker.entry.TrackView", trackView$$serializer, 3);
        setanimationsloop.onWarmupCompleted("view", true);
        setanimationsloop.onWarmupCompleted("params", true);
        setanimationsloop.onWarmupCompleted("_trackers", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 51;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 63 / 0;
        }
    }

    private TrackView$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrAsBinder = TrackView.asBinder();
        KSerializer<?>[] kSerializerArr = {getWriggleLayout.onNavigationEvent, lazyArrAsBinder[1].getValue(), sp.IAuthTabCallback((KSerializer) lazyArrAsBinder[2].getValue())};
        int i4 = onNavigationEvent + 73;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final TrackView deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        List list;
        int i;
        String str;
        Map map;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrAsBinder = TrackView.asBinder();
        Object obj = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            Map map2 = (Map) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrAsBinder[1].getValue(), (Object) null);
            list = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrAsBinder[2].getValue(), (Object) null);
            i = 7;
            str = strAsInterface;
            map = map2;
        } else {
            int i3 = 0;
            boolean z = true;
            List list2 = null;
            String strAsInterface2 = null;
            Map map3 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i4 = onExtraCallbackWithResult;
                    int i5 = i4 + 91;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (iOnNavigationEvent == 0) {
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i3 |= 1;
                    } else if (iOnNavigationEvent != 1) {
                        int i6 = i4 + 33;
                        onNavigationEvent = i6 % 128;
                        int i7 = i6 % 2;
                        if (iOnNavigationEvent != 2) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        list2 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrAsBinder[2].getValue(), list2);
                        i3 |= 4;
                    } else {
                        map3 = (Map) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrAsBinder[1].getValue(), map3);
                        i3 |= 2;
                    }
                } else {
                    z = false;
                }
            }
            list = list2;
            i = i3;
            str = strAsInterface2;
            map = map3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TrackView(i, str, map, list, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m59deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TrackView trackView) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(trackView, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            TrackView.onWarmupCompleted(trackView, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(trackView, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        TrackView.onWarmupCompleted(trackView, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TrackView) obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onNavigationEvent + 115;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onNavigationEvent + 3;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
