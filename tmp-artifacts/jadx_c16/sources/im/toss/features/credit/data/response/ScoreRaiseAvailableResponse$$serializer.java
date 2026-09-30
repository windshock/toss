package im.toss.features.credit.data.response;

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
public final /* synthetic */ class ScoreRaiseAvailableResponse$$serializer implements aeu2<ScoreRaiseAvailableResponse> {
    private static int IAuthTabCallback = 1;
    public static final ScoreRaiseAvailableResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 21;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 71 / 0;
        }
        return serialDescriptor;
    }

    static {
        ScoreRaiseAvailableResponse$$serializer scoreRaiseAvailableResponse$$serializer = new ScoreRaiseAvailableResponse$$serializer();
        INSTANCE = scoreRaiseAvailableResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.ScoreRaiseAvailableResponse", scoreRaiseAvailableResponse$$serializer, 2);
        setanimationsloop.onWarmupCompleted("availableDate", true);
        setanimationsloop.onWarmupCompleted("status", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 121;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            int i2 = 42 / 0;
        }
    }

    private ScoreRaiseAvailableResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent), sp.IAuthTabCallback((KSerializer) ScoreRaiseAvailableResponse.onWarmupCompleted()[1].getValue())};
        int i4 = IAuthTabCallback + 89;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ScoreRaiseAvailableResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        ScoreRaiseStatusType scoreRaiseStatusType;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnWarmupCompleted = ScoreRaiseAvailableResponse.onWarmupCompleted();
        if (!(!ywVarOnWarmupCompleted.extraCallbackWithResult())) {
            int i3 = onExtraCallback + 75;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, (Object) null);
            if (i4 == 0) {
                scoreRaiseStatusType = (ScoreRaiseStatusType) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[0].getValue(), (Object) null);
                i = 4;
            } else {
                scoreRaiseStatusType = (ScoreRaiseStatusType) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), (Object) null);
                i = 3;
            }
        } else {
            boolean z = true;
            String str2 = null;
            ScoreRaiseStatusType scoreRaiseStatusType2 = null;
            int i5 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str2);
                    i5 |= 1;
                } else {
                    if (iOnNavigationEvent != 1) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i6 = IAuthTabCallback + 71;
                    onExtraCallback = i6 % 128;
                    scoreRaiseStatusType2 = (ScoreRaiseStatusType) (i6 % 2 != 0 ? ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrOnWarmupCompleted[0].getValue(), scoreRaiseStatusType2) : ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), scoreRaiseStatusType2));
                    i5 |= 2;
                }
            }
            str = str2;
            scoreRaiseStatusType = scoreRaiseStatusType2;
            i = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ScoreRaiseAvailableResponse(i, str, scoreRaiseStatusType, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m188deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        ScoreRaiseAvailableResponse scoreRaiseAvailableResponseDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallback + 101;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return scoreRaiseAvailableResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ScoreRaiseAvailableResponse scoreRaiseAvailableResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(scoreRaiseAvailableResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            ScoreRaiseAvailableResponse.IAuthTabCallback(scoreRaiseAvailableResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(scoreRaiseAvailableResponse, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        ScoreRaiseAvailableResponse.IAuthTabCallback(scoreRaiseAvailableResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = IAuthTabCallback + 41;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ScoreRaiseAvailableResponse) obj);
        int i4 = onExtraCallback + 105;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = IAuthTabCallback + 73;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 81 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
