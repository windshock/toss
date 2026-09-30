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
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AvailableQuizResponse$$serializer implements aeu2<AvailableQuizResponse> {
    private static int IAuthTabCallback = 0;
    public static final AvailableQuizResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 49;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        AvailableQuizResponse$$serializer availableQuizResponse$$serializer = new AvailableQuizResponse$$serializer();
        INSTANCE = availableQuizResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.AvailableQuizResponse", availableQuizResponse$$serializer, 3);
        setanimationsloop.onWarmupCompleted("quizzes", true);
        setanimationsloop.onWarmupCompleted("rewardPoint", true);
        setanimationsloop.onWarmupCompleted("availableDate", true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 63;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private AvailableQuizResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback((KSerializer) AvailableQuizResponse.onWarmupCompleted()[0].getValue()), sp.IAuthTabCallback(oty1.onExtraCallback), sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent)};
        int i4 = IAuthTabCallback + 9;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final AvailableQuizResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        String str;
        List list;
        Long l;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnWarmupCompleted = AvailableQuizResponse.onWarmupCompleted();
        String str2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            List list2 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrOnWarmupCompleted[0].getValue(), (Object) null);
            Long l2 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, oty1.onExtraCallback, (Object) null);
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, (Object) null);
            list = list2;
            l = l2;
            i = 7;
        } else {
            boolean z = true;
            int i3 = 0;
            List list3 = null;
            Long l3 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    int i4 = onExtraCallbackWithResult + 23;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i6 = IAuthTabCallback;
                    int i7 = i6 + 57;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    if (iOnNavigationEvent == 1) {
                        l3 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, oty1.onExtraCallback, l3);
                        i3 |= 2;
                    } else {
                        if (iOnNavigationEvent != 2) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i9 = i6 + 17;
                        onExtraCallbackWithResult = i9 % 128;
                        int i10 = i9 % 2;
                        str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str2);
                        i3 |= 4;
                    }
                } else {
                    list3 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrOnWarmupCompleted[0].getValue(), list3);
                    i3 |= 1;
                }
            }
            i = i3;
            str = str2;
            list = list3;
            l = l3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new AvailableQuizResponse(i, list, l, str, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m136deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        AvailableQuizResponse availableQuizResponseDeserialize = deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 109;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return availableQuizResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AvailableQuizResponse availableQuizResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(availableQuizResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        AvailableQuizResponse.onNavigationEvent(availableQuizResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 83;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AvailableQuizResponse) obj);
        int i4 = onExtraCallbackWithResult + 125;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallbackWithResult + 123;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 59 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
