package im.toss.features.credit.data.response.kcbsurvey;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class KcbSurveyEndLogResponse$$serializer implements aeu2<KcbSurveyEndLogResponse> {
    private static int IAuthTabCallback = 1;
    public static final KcbSurveyEndLogResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 61;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return serialDescriptor;
        }
        obj.hashCode();
        throw null;
    }

    static {
        KcbSurveyEndLogResponse$$serializer kcbSurveyEndLogResponse$$serializer = new KcbSurveyEndLogResponse$$serializer();
        INSTANCE = kcbSurveyEndLogResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.kcbsurvey.KcbSurveyEndLogResponse", kcbSurveyEndLogResponse$$serializer, 2);
        setanimationsloop.onWarmupCompleted("raisedScore", true);
        setanimationsloop.onWarmupCompleted("finalScore", true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 7;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 15 / 0;
        }
    }

    private KcbSurveyEndLogResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            oty1 oty1Var = oty1.onExtraCallback;
            return new KSerializer[]{sp.IAuthTabCallback(oty1Var), sp.IAuthTabCallback(oty1Var)};
        }
        oty1 oty1Var2 = oty1.onExtraCallback;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(oty1Var2);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(oty1Var2);
        KSerializer<?>[] kSerializerArr = new KSerializer[2];
        kSerializerArr[1] = kSerializerIAuthTabCallback;
        kSerializerArr[1] = kSerializerIAuthTabCallback2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final KcbSurveyEndLogResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        Long l;
        Long l2;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            oty1 oty1Var = oty1.onExtraCallback;
            l2 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, oty1Var, (Object) null);
            l = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, oty1Var, (Object) null);
            i = 3;
        } else {
            int i3 = 0;
            Long l3 = null;
            Long l4 = null;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i4 = onExtraCallbackWithResult;
                    int i5 = i4 + 59;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    if (iOnNavigationEvent != 0) {
                        int i7 = i4 + 97;
                        IAuthTabCallback = i7 % 128;
                        if (i7 % 2 == 0) {
                            if (iOnNavigationEvent != 1) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            l3 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, oty1.onExtraCallback, l3);
                            i3 |= 2;
                            int i8 = IAuthTabCallback + 119;
                            onExtraCallbackWithResult = i8 % 128;
                            int i9 = i8 % 2;
                        } else {
                            if (iOnNavigationEvent != 1) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            l3 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, oty1.onExtraCallback, l3);
                            i3 |= 2;
                            int i82 = IAuthTabCallback + 119;
                            onExtraCallbackWithResult = i82 % 128;
                            int i92 = i82 % 2;
                        }
                    } else {
                        l4 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, oty1.onExtraCallback, l4);
                        i3 |= 1;
                    }
                } else {
                    z = false;
                }
            }
            l = l3;
            l2 = l4;
            i = i3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new KcbSurveyEndLogResponse(i, l2, l, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m195deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KcbSurveyEndLogResponse kcbSurveyEndLogResponseDeserialize = deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 9;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kcbSurveyEndLogResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull KcbSurveyEndLogResponse kcbSurveyEndLogResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(kcbSurveyEndLogResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        KcbSurveyEndLogResponse.IAuthTabCallback(kcbSurveyEndLogResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallbackWithResult + 17;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 26 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (KcbSurveyEndLogResponse) obj);
        int i4 = onExtraCallbackWithResult + 111;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallbackWithResult + 25;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
