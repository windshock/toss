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
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CashflowMutateVariableResponse$$serializer implements aeu2<CashflowMutateVariableResponse> {
    private static int IAuthTabCallback = 1;
    public static final CashflowMutateVariableResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 != 0) {
            int i4 = 7 / 0;
        }
        return serialDescriptor;
    }

    static {
        CashflowMutateVariableResponse$$serializer cashflowMutateVariableResponse$$serializer = new CashflowMutateVariableResponse$$serializer();
        INSTANCE = cashflowMutateVariableResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.cashflow.overview.CashflowMutateVariableResponse", cashflowMutateVariableResponse$$serializer, 1);
        setanimationsloop.onWarmupCompleted("mergeState", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 61;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private CashflowMutateVariableResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onExtraCallback + 53;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerArr = new KSerializer[0];
            kSerializerArr[0] = sp.IAuthTabCallback((KSerializer) CashflowMutateVariableResponse.onWarmupCompleted()[0].getValue());
        } else {
            kSerializerArr = new KSerializer[]{sp.IAuthTabCallback((KSerializer) CashflowMutateVariableResponse.onWarmupCompleted()[0].getValue())};
        }
        int i3 = onExtraCallback + 43;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0098 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CashflowMutateVariableResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        Lazy[] lazyArrOnWarmupCompleted;
        boolean z;
        Map map;
        int iOnNavigationEvent;
        int i;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 25;
        onExtraCallback = i3 % 128;
        int i4 = 1;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnWarmupCompleted = CashflowMutateVariableResponse.onWarmupCompleted();
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                i4 = 0;
                map = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrOnWarmupCompleted[0].getValue(), (Object) null);
            }
            int i5 = onExtraCallback + 77;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            z = true;
            Map map2 = null;
            int i7 = 0;
            while (z) {
                int i8 = onExtraCallback + 41;
                onWarmupCompleted = i8 % 128;
                if (i8 % 2 == 0) {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    int i9 = 8 / 0;
                    if (iOnNavigationEvent != -1) {
                        i = onExtraCallback + 45;
                        onWarmupCompleted = i % 128;
                        if (i % 2 != 0) {
                            throw null;
                        }
                        if (iOnNavigationEvent != 0) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        map2 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrOnWarmupCompleted[0].getValue(), map2);
                        i7 = 1;
                    } else {
                        z = false;
                    }
                } else {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent != -1) {
                        i = onExtraCallback + 45;
                        onWarmupCompleted = i % 128;
                        if (i % 2 != 0) {
                        }
                    } else {
                        z = false;
                    }
                }
            }
            map = map2;
            i4 = i7;
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnWarmupCompleted = CashflowMutateVariableResponse.onWarmupCompleted();
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                map = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrOnWarmupCompleted[0].getValue(), (Object) null);
            } else {
                int i52 = onExtraCallback + 77;
                onWarmupCompleted = i52 % 128;
                int i62 = i52 % 2;
                z = true;
                Map map22 = null;
                int i72 = 0;
                while (z) {
                }
                map = map22;
                i4 = i72;
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CashflowMutateVariableResponse(i4, map, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m566deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        CashflowMutateVariableResponse cashflowMutateVariableResponseDeserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 17 / 0;
        }
        return cashflowMutateVariableResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CashflowMutateVariableResponse cashflowMutateVariableResponse) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(cashflowMutateVariableResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        CashflowMutateVariableResponse.onNavigationEvent(cashflowMutateVariableResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 103;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CashflowMutateVariableResponse) obj);
        int i4 = onExtraCallback + 93;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 43;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}
