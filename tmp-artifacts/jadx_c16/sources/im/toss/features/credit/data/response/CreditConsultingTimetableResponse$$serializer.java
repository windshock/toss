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
public final /* synthetic */ class CreditConsultingTimetableResponse$$serializer implements aeu2<CreditConsultingTimetableResponse> {
    private static int IAuthTabCallback = 1;
    public static final CreditConsultingTimetableResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 53;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 67;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        CreditConsultingTimetableResponse$$serializer creditConsultingTimetableResponse$$serializer = new CreditConsultingTimetableResponse$$serializer();
        INSTANCE = creditConsultingTimetableResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.CreditConsultingTimetableResponse", creditConsultingTimetableResponse$$serializer, 1);
        setanimationsloop.onWarmupCompleted("timetable", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 63;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private CreditConsultingTimetableResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlinx.serialization.KSerializer[]] */
    /* JADX WARN: Type inference failed for: r4v2, types: [kotlinx.serialization.KSerializer[]] */
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            ?? r4 = new KSerializer[0];
            r4[0] = CreditConsultingTimetableResponse.onExtraCallback()[1].getValue();
            kSerializerArr = r4;
        } else {
            kSerializerArr = new KSerializer[]{CreditConsultingTimetableResponse.onExtraCallback()[0].getValue()};
        }
        int i3 = onExtraCallbackWithResult + 85;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 32 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049 A[PHI: r1 r2 r13
      0x0049: PHI (r1v7 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v8 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0038, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x0049: PHI (r2v4 kotlin.Lazy[]) = (r2v2 kotlin.Lazy[]), (r2v5 kotlin.Lazy[]) binds: [B:8:0x0038, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x0049: PHI (r13v5 o.yw) = (r13v1 o.yw), (r13v7 o.yw) binds: [B:8:0x0038, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a A[PHI: r1 r2 r13
      0x003a: PHI (r1v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v8 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0038, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x003a: PHI (r2v3 kotlin.Lazy[]) = (r2v2 kotlin.Lazy[]), (r2v5 kotlin.Lazy[]) binds: [B:8:0x0038, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x003a: PHI (r13v2 o.yw) = (r13v1 o.yw), (r13v7 o.yw) binds: [B:8:0x0038, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CreditConsultingTimetableResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        Lazy[] lazyArrOnExtraCallback;
        List list;
        int iOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        IAuthTabCallback = i2 % 128;
        int i3 = 1;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnExtraCallback = CreditConsultingTimetableResponse.onExtraCallback();
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallback[0].getValue(), (Object) null);
            } else {
                int i4 = onExtraCallbackWithResult + 81;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                List list2 = null;
                boolean z = true;
                int i6 = 0;
                while (z) {
                    int i7 = IAuthTabCallback + 23;
                    onExtraCallbackWithResult = i7 % 128;
                    if (i7 % 2 != 0) {
                        iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                        int i8 = 30 / 0;
                        if (iOnNavigationEvent == -1) {
                            z = false;
                        } else {
                            if (iOnNavigationEvent == 0) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallback[0].getValue(), list2);
                            i6 = 1;
                        }
                    } else {
                        iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                        if (iOnNavigationEvent == -1) {
                            z = false;
                        } else if (iOnNavigationEvent == 0) {
                        }
                    }
                }
                list = list2;
                i3 = i6;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnExtraCallback = CreditConsultingTimetableResponse.onExtraCallback();
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CreditConsultingTimetableResponse(i3, list, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m144deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        CreditConsultingTimetableResponse creditConsultingTimetableResponseDeserialize = deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 85;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return creditConsultingTimetableResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CreditConsultingTimetableResponse creditConsultingTimetableResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(creditConsultingTimetableResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        CreditConsultingTimetableResponse.onExtraCallbackWithResult(creditConsultingTimetableResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 79;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CreditConsultingTimetableResponse) obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = IAuthTabCallback + 23;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
