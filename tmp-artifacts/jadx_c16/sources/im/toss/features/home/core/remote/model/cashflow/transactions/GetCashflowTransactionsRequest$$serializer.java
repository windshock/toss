package im.toss.features.home.core.remote.model.cashflow.transactions;

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
public final /* synthetic */ class GetCashflowTransactionsRequest$$serializer implements aeu2<GetCashflowTransactionsRequest> {
    private static int IAuthTabCallback = 0;
    public static final GetCashflowTransactionsRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 81;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 49;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        GetCashflowTransactionsRequest$$serializer getCashflowTransactionsRequest$$serializer = new GetCashflowTransactionsRequest$$serializer();
        INSTANCE = getCashflowTransactionsRequest$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.cashflow.transactions.GetCashflowTransactionsRequest", getCashflowTransactionsRequest$$serializer, 1);
        setanimationsloop.onWarmupCompleted("schemeParams", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 15;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private GetCashflowTransactionsRequest$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onNavigationEvent = i2 % 128;
        return i2 % 2 == 0 ? new KSerializer[]{GetCashflowTransactionsRequest.IAuthTabCallback()[1].getValue()} : new KSerializer[]{GetCashflowTransactionsRequest.IAuthTabCallback()[0].getValue()};
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final GetCashflowTransactionsRequest deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        Map map;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrIAuthTabCallback = GetCashflowTransactionsRequest.IAuthTabCallback();
        int i2 = 1;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = IAuthTabCallback + 77;
            onNavigationEvent = i3 % 128;
            map = (Map) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) (i3 % 2 == 0 ? lazyArrIAuthTabCallback[0] : lazyArrIAuthTabCallback[0]).getValue(), (Object) null);
        } else {
            Map map2 = null;
            boolean z = true;
            int i4 = 0;
            while (z) {
                int i5 = IAuthTabCallback + 39;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i7 = onNavigationEvent;
                    int i8 = i7 + 83;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                    if (iOnNavigationEvent != 0) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i10 = i7 + 59;
                    IAuthTabCallback = i10 % 128;
                    map2 = (Map) (i10 % 2 != 0 ? ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrIAuthTabCallback[0].getValue(), map2) : ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), map2));
                    i4 = 1;
                } else {
                    z = false;
                }
            }
            map = map2;
            i2 = i4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new GetCashflowTransactionsRequest(i2, map, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m574deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull GetCashflowTransactionsRequest getCashflowTransactionsRequest) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(getCashflowTransactionsRequest, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            GetCashflowTransactionsRequest.onWarmupCompleted(getCashflowTransactionsRequest, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 25 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(getCashflowTransactionsRequest, "");
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            GetCashflowTransactionsRequest.onWarmupCompleted(getCashflowTransactionsRequest, vylVarOnExtraCallback2, serialDescriptor2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = onNavigationEvent + 55;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (GetCashflowTransactionsRequest) obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = IAuthTabCallback + 95;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = IAuthTabCallback + 33;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
