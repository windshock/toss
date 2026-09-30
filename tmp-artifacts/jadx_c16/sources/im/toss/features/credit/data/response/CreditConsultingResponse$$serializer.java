package im.toss.features.credit.data.response;

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
public final /* synthetic */ class CreditConsultingResponse$$serializer implements aeu2<CreditConsultingResponse> {
    private static int IAuthTabCallback = 0;
    public static final CreditConsultingResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 65;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 31;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 68 / 0;
        }
        return serialDescriptor;
    }

    static {
        CreditConsultingResponse$$serializer creditConsultingResponse$$serializer = new CreditConsultingResponse$$serializer();
        INSTANCE = creditConsultingResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.CreditConsultingResponse", creditConsultingResponse$$serializer, 1);
        setanimationsloop.onWarmupCompleted("categories", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 93;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 15 / 0;
        }
    }

    private CreditConsultingResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        onWarmupCompleted = i2 % 128;
        return i2 % 2 != 0 ? new KSerializer[]{CreditConsultingResponse.onWarmupCompleted()[0].getValue()} : new KSerializer[]{CreditConsultingResponse.onWarmupCompleted()[0].getValue()};
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049 A[PHI: r0 r1 r11
      0x0049: PHI (r0v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r0v2 kotlinx.serialization.descriptors.SerialDescriptor), (r0v6 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0038, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x0049: PHI (r1v12 kotlin.Lazy[]) = (r1v4 kotlin.Lazy[]), (r1v14 kotlin.Lazy[]) binds: [B:8:0x0038, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x0049: PHI (r11v5 o.yw) = (r11v1 o.yw), (r11v7 o.yw) binds: [B:8:0x0038, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a A[PHI: r0 r1 r11
      0x003a: PHI (r0v3 kotlinx.serialization.descriptors.SerialDescriptor) = (r0v2 kotlinx.serialization.descriptors.SerialDescriptor), (r0v6 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0038, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x003a: PHI (r1v5 kotlin.Lazy[]) = (r1v4 kotlin.Lazy[]), (r1v14 kotlin.Lazy[]) binds: [B:8:0x0038, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x003a: PHI (r11v2 o.yw) = (r11v1 o.yw), (r11v7 o.yw) binds: [B:8:0x0038, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CreditConsultingResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        Lazy[] lazyArrOnWarmupCompleted;
        List list;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = 1;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnWarmupCompleted = CreditConsultingResponse.onWarmupCompleted();
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnWarmupCompleted[0].getValue(), (Object) null);
            } else {
                List list2 = null;
                boolean z = true;
                int i4 = 0;
                while (z) {
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent == -1) {
                        z = false;
                    } else {
                        if (iOnNavigationEvent != 0) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i5 = onExtraCallbackWithResult + 43;
                        onWarmupCompleted = i5 % 128;
                        list2 = (List) (i5 % 2 != 0 ? ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnWarmupCompleted[1].getValue(), list2) : ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnWarmupCompleted[0].getValue(), list2));
                        i4 = 1;
                    }
                }
                list = list2;
                i3 = i4;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnWarmupCompleted = CreditConsultingResponse.onWarmupCompleted();
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CreditConsultingResponse(i3, list, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m141deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CreditConsultingResponse creditConsultingResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(creditConsultingResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            CreditConsultingResponse.onExtraCallback(creditConsultingResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(creditConsultingResponse, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        CreditConsultingResponse.onExtraCallback(creditConsultingResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CreditConsultingResponse) obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }
}
