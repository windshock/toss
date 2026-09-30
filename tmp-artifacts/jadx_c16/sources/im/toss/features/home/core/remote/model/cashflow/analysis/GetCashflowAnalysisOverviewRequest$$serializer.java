package im.toss.features.home.core.remote.model.cashflow.analysis;

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
public final /* synthetic */ class GetCashflowAnalysisOverviewRequest$$serializer implements aeu2<GetCashflowAnalysisOverviewRequest> {
    private static int IAuthTabCallback = 0;
    public static final GetCashflowAnalysisOverviewRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        GetCashflowAnalysisOverviewRequest$$serializer getCashflowAnalysisOverviewRequest$$serializer = new GetCashflowAnalysisOverviewRequest$$serializer();
        INSTANCE = getCashflowAnalysisOverviewRequest$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.cashflow.analysis.GetCashflowAnalysisOverviewRequest", getCashflowAnalysisOverviewRequest$$serializer, 1);
        setanimationsloop.onWarmupCompleted("schemeParams", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 5;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private GetCashflowAnalysisOverviewRequest$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlinx.serialization.KSerializer[]] */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlinx.serialization.KSerializer[]] */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        IAuthTabCallback = i2 % 128;
        KSerializer<?>[] kSerializerArr = i2 % 2 != 0 ? new KSerializer[]{GetCashflowAnalysisOverviewRequest.onExtraCallbackWithResult()[0].getValue()} : new KSerializer[]{GetCashflowAnalysisOverviewRequest.onExtraCallbackWithResult()[0].getValue()};
        int i3 = onNavigationEvent + 61;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final GetCashflowAnalysisOverviewRequest deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        Map map;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallbackWithResult = GetCashflowAnalysisOverviewRequest.onExtraCallbackWithResult();
        int i2 = 1;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            map = (Map) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallbackWithResult[0].getValue(), (Object) null);
        } else {
            Map map2 = null;
            boolean z = true;
            int i3 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i4 = IAuthTabCallback + 105;
                    int i5 = i4 % 128;
                    onNavigationEvent = i5;
                    int i6 = i4 % 2;
                    if (iOnNavigationEvent != 0) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i7 = i5 + 23;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    map2 = (Map) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallbackWithResult[0].getValue(), map2);
                    i3 = 1;
                } else {
                    z = false;
                }
            }
            map = map2;
            i2 = i3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new GetCashflowAnalysisOverviewRequest(i2, map, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m560deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 83;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull GetCashflowAnalysisOverviewRequest getCashflowAnalysisOverviewRequest) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(getCashflowAnalysisOverviewRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        GetCashflowAnalysisOverviewRequest.onExtraCallback(getCashflowAnalysisOverviewRequest, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 9;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (GetCashflowAnalysisOverviewRequest) obj);
        int i4 = onNavigationEvent + 71;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }
}
