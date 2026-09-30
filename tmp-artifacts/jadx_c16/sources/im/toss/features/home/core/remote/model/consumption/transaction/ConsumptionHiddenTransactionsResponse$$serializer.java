package im.toss.features.home.core.remote.model.consumption.transaction;

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
public final /* synthetic */ class ConsumptionHiddenTransactionsResponse$$serializer implements aeu2<ConsumptionHiddenTransactionsResponse> {
    private static int IAuthTabCallback = 0;
    public static final ConsumptionHiddenTransactionsResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 87;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 111;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        ConsumptionHiddenTransactionsResponse$$serializer consumptionHiddenTransactionsResponse$$serializer = new ConsumptionHiddenTransactionsResponse$$serializer();
        INSTANCE = consumptionHiddenTransactionsResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.consumption.transaction.ConsumptionHiddenTransactionsResponse", consumptionHiddenTransactionsResponse$$serializer, 1);
        setanimationsloop.onWarmupCompleted("transactions", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 25;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private ConsumptionHiddenTransactionsResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlinx.serialization.KSerializer[]] */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlinx.serialization.KSerializer[]] */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onWarmupCompleted = i2 % 128;
        KSerializer<?>[] kSerializerArr = i2 % 2 == 0 ? new KSerializer[]{ConsumptionHiddenTransactionsResponse.IAuthTabCallback()[0].getValue()} : new KSerializer[]{ConsumptionHiddenTransactionsResponse.IAuthTabCallback()[0].getValue()};
        int i3 = IAuthTabCallback + 15;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082 A[PHI: r1 r2 r13
      0x0082: PHI (r1v7 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v8 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0039, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x0082: PHI (r2v4 kotlin.Lazy[]) = (r2v2 kotlin.Lazy[]), (r2v5 kotlin.Lazy[]) binds: [B:8:0x0039, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x0082: PHI (r13v6 o.yw) = (r13v1 o.yw), (r13v7 o.yw) binds: [B:8:0x0039, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003b A[PHI: r1 r2 r13
      0x003b: PHI (r1v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v8 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0039, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x003b: PHI (r2v3 kotlin.Lazy[]) = (r2v2 kotlin.Lazy[]), (r2v5 kotlin.Lazy[]) binds: [B:8:0x0039, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x003b: PHI (r13v2 o.yw) = (r13v1 o.yw), (r13v7 o.yw) binds: [B:8:0x0039, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ConsumptionHiddenTransactionsResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        Lazy[] lazyArrIAuthTabCallback;
        List list;
        int iOnNavigationEvent;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onWarmupCompleted = i2 % 128;
        int i3 = 1;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrIAuthTabCallback = ConsumptionHiddenTransactionsResponse.IAuthTabCallback();
            if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                list = null;
                boolean z = true;
                int i4 = 0;
                while (z) {
                    int i5 = onWarmupCompleted + 101;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                        int i6 = 82 / 0;
                        if (iOnNavigationEvent == -1) {
                            z = false;
                        } else {
                            if (iOnNavigationEvent == 0) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), list);
                            int i7 = onWarmupCompleted + 57;
                            IAuthTabCallback = i7 % 128;
                            int i8 = i7 % 2;
                            i4 = 1;
                        }
                    } else {
                        iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                        if (iOnNavigationEvent == -1) {
                            z = false;
                        } else if (iOnNavigationEvent == 0) {
                        }
                    }
                }
                i3 = i4;
            } else {
                list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), (Object) null);
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrIAuthTabCallback = ConsumptionHiddenTransactionsResponse.IAuthTabCallback();
            if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ConsumptionHiddenTransactionsResponse(i3, list, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m587deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            obj.hashCode();
            throw null;
        }
        ConsumptionHiddenTransactionsResponse consumptionHiddenTransactionsResponseDeserialize = deserialize(decoder);
        int i3 = onWarmupCompleted + 77;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return consumptionHiddenTransactionsResponseDeserialize;
        }
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ConsumptionHiddenTransactionsResponse consumptionHiddenTransactionsResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(consumptionHiddenTransactionsResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        ConsumptionHiddenTransactionsResponse.onNavigationEvent(consumptionHiddenTransactionsResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 11;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        serialize(encoder, (ConsumptionHiddenTransactionsResponse) obj);
        if (i3 != 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = onWarmupCompleted + 87;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = IAuthTabCallback + 49;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
