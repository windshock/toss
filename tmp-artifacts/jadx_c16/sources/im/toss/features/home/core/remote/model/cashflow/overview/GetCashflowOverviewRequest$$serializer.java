package im.toss.features.home.core.remote.model.cashflow.overview;

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
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class GetCashflowOverviewRequest$$serializer implements aeu2<GetCashflowOverviewRequest> {
    public static final GetCashflowOverviewRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        GetCashflowOverviewRequest$$serializer getCashflowOverviewRequest$$serializer = new GetCashflowOverviewRequest$$serializer();
        INSTANCE = getCashflowOverviewRequest$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.cashflow.overview.GetCashflowOverviewRequest", getCashflowOverviewRequest$$serializer, 3);
        setanimationsloop.onWarmupCompleted("schemeParams", false);
        setanimationsloop.onWarmupCompleted("initialState", true);
        setanimationsloop.onWarmupCompleted("currentState", true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 73;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private GetCashflowOverviewRequest$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnNavigationEvent = GetCashflowOverviewRequest.onNavigationEvent();
        KSerializer<?>[] kSerializerArr = {lazyArrOnNavigationEvent[0].getValue(), lazyArrOnNavigationEvent[1].getValue(), lazyArrOnNavigationEvent[2].getValue()};
        int i4 = onExtraCallbackWithResult + 11;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final GetCashflowOverviewRequest deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        Map map;
        Map map2;
        Map map3;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = GetCashflowOverviewRequest.onNavigationEvent();
        Map map4 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onNavigationEvent + 95;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Map map5 = (Map) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnNavigationEvent[0].getValue(), (Object) null);
            Map map6 = (Map) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnNavigationEvent[1].getValue(), (Object) null);
            map2 = (Map) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrOnNavigationEvent[2].getValue(), (Object) null);
            i = 7;
            map3 = map5;
            map = map6;
        } else {
            int i5 = 0;
            Map map7 = null;
            Map map8 = null;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    map8 = (Map) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnNavigationEvent[0].getValue(), map8);
                    i5 |= 1;
                } else if (iOnNavigationEvent == 1) {
                    map4 = (Map) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnNavigationEvent[1].getValue(), map4);
                    i5 |= 2;
                } else {
                    if (iOnNavigationEvent != 2) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i6 = onExtraCallbackWithResult + 37;
                    onNavigationEvent = i6 % 128;
                    if (i6 % 2 == 0) {
                        map7 = (Map) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, (jp) lazyArrOnNavigationEvent[4].getValue(), map7);
                        i5 |= 5;
                    } else {
                        map7 = (Map) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrOnNavigationEvent[2].getValue(), map7);
                        i5 |= 4;
                    }
                }
            }
            i = i5;
            map = map4;
            map2 = map7;
            map3 = map8;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new GetCashflowOverviewRequest(i, map3, map, map2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m567deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull GetCashflowOverviewRequest getCashflowOverviewRequest) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(getCashflowOverviewRequest, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            GetCashflowOverviewRequest.IAuthTabCallback(getCashflowOverviewRequest, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(getCashflowOverviewRequest, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        GetCashflowOverviewRequest.IAuthTabCallback(getCashflowOverviewRequest, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (GetCashflowOverviewRequest) obj);
        int i4 = onNavigationEvent + 91;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 == 0) {
            int i4 = 42 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
