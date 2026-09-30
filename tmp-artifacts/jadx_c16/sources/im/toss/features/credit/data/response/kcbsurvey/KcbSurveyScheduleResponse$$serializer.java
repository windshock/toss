package im.toss.features.credit.data.response.kcbsurvey;

import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.AOMPFileConstant;
import o.aeu2;
import o.getDynamicHeight;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class KcbSurveyScheduleResponse$$serializer implements aeu2<KcbSurveyScheduleResponse> {
    private static int IAuthTabCallback = 1;
    public static final KcbSurveyScheduleResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 87;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        KcbSurveyScheduleResponse$$serializer kcbSurveyScheduleResponse$$serializer = new KcbSurveyScheduleResponse$$serializer();
        INSTANCE = kcbSurveyScheduleResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.kcbsurvey.KcbSurveyScheduleResponse", kcbSurveyScheduleResponse$$serializer, 3);
        setanimationsloop.onWarmupCompleted("previousRound", true);
        setanimationsloop.onWarmupCompleted("schedule", false);
        setanimationsloop.onWarmupCompleted("state", false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 111;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 37 / 0;
        }
    }

    private KcbSurveyScheduleResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Lazy[] lazyArrOnExtraCallbackWithResult = KcbSurveyScheduleResponse.onExtraCallbackWithResult();
            return new KSerializer[]{sp.IAuthTabCallback(getDynamicHeight.onWarmupCompleted), lazyArrOnExtraCallbackWithResult[1].getValue(), lazyArrOnExtraCallbackWithResult[2].getValue()};
        }
        Lazy[] lazyArrOnExtraCallbackWithResult2 = KcbSurveyScheduleResponse.onExtraCallbackWithResult();
        KSerializer<?>[] kSerializerArr = new KSerializer[2];
        kSerializerArr[1] = sp.IAuthTabCallback(getDynamicHeight.onWarmupCompleted);
        kSerializerArr[0] = lazyArrOnExtraCallbackWithResult2[1].getValue();
        kSerializerArr[3] = lazyArrOnExtraCallbackWithResult2[3].getValue();
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x006e A[PHI: r1 r2 r14
      0x006e: PHI (r1v8 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x006e: PHI (r2v10 kotlin.Lazy[]) = (r2v2 kotlin.Lazy[]), (r2v12 kotlin.Lazy[]) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x006e: PHI (r14v5 o.yw) = (r14v1 o.yw), (r14v7 o.yw) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d A[PHI: r1 r2 r14
      0x003d: PHI (r1v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x003d: PHI (r2v3 kotlin.Lazy[]) = (r2v2 kotlin.Lazy[]), (r2v12 kotlin.Lazy[]) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x003d: PHI (r14v2 o.yw) = (r14v1 o.yw), (r14v7 o.yw) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final KcbSurveyScheduleResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        Lazy[] lazyArrOnExtraCallbackWithResult;
        Integer num;
        List list;
        int i;
        AOMPFileConstant aOMPFileConstant;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 13;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnExtraCallbackWithResult = KcbSurveyScheduleResponse.onExtraCallbackWithResult();
            int i4 = 50 / 0;
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                int i5 = IAuthTabCallback + 65;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                num = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getDynamicHeight.onWarmupCompleted, (Object) null);
                list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnExtraCallbackWithResult[1].getValue(), (Object) null);
                AOMPFileConstant aOMPFileConstant2 = (AOMPFileConstant) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrOnExtraCallbackWithResult[2].getValue(), (Object) null);
                i = 7;
                aOMPFileConstant = aOMPFileConstant2;
            } else {
                List list2 = null;
                AOMPFileConstant aOMPFileConstant3 = null;
                Integer num2 = null;
                boolean z = true;
                int i7 = 0;
                while (z) {
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent == -1) {
                        int i8 = onExtraCallbackWithResult + 117;
                        IAuthTabCallback = i8 % 128;
                        int i9 = i8 % 2;
                        z = false;
                    } else if (iOnNavigationEvent != 0) {
                        int i10 = IAuthTabCallback + 5;
                        onExtraCallbackWithResult = i10 % 128;
                        if (i10 % 2 != 0) {
                            if (iOnNavigationEvent == 1) {
                                list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnExtraCallbackWithResult[1].getValue(), list2);
                                i7 |= 2;
                            } else {
                                if (iOnNavigationEvent == 2) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                aOMPFileConstant3 = (AOMPFileConstant) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrOnExtraCallbackWithResult[2].getValue(), aOMPFileConstant3);
                                i7 |= 4;
                            }
                        } else if (iOnNavigationEvent == 1) {
                            list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnExtraCallbackWithResult[1].getValue(), list2);
                            i7 |= 2;
                        } else if (iOnNavigationEvent == 2) {
                        }
                    } else {
                        num2 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getDynamicHeight.onWarmupCompleted, num2);
                        i7 |= 1;
                    }
                }
                i = i7;
                list = list2;
                aOMPFileConstant = aOMPFileConstant3;
                num = num2;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnExtraCallbackWithResult = KcbSurveyScheduleResponse.onExtraCallbackWithResult();
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new KcbSurveyScheduleResponse(i, num, list, aOMPFileConstant, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m197deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KcbSurveyScheduleResponse kcbSurveyScheduleResponseDeserialize = deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 83;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kcbSurveyScheduleResponseDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull KcbSurveyScheduleResponse kcbSurveyScheduleResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(kcbSurveyScheduleResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            KcbSurveyScheduleResponse.IAuthTabCallback(kcbSurveyScheduleResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(kcbSurveyScheduleResponse, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        KcbSurveyScheduleResponse.IAuthTabCallback(kcbSurveyScheduleResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (KcbSurveyScheduleResponse) obj);
        int i4 = IAuthTabCallback + 9;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 89;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 40 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
