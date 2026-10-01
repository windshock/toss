package im.toss.features.home.core.remote.model.consumption.regular;

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
public final /* synthetic */ class RegularExpenseCandidateGroupResponse$$serializer implements aeu2<RegularExpenseCandidateGroupResponse> {
    private static int IAuthTabCallback = 0;
    public static final RegularExpenseCandidateGroupResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 == 0) {
            int i4 = 44 / 0;
        }
        return serialDescriptor;
    }

    static {
        RegularExpenseCandidateGroupResponse$$serializer regularExpenseCandidateGroupResponse$$serializer = new RegularExpenseCandidateGroupResponse$$serializer();
        INSTANCE = regularExpenseCandidateGroupResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.consumption.regular.RegularExpenseCandidateGroupResponse", regularExpenseCandidateGroupResponse$$serializer, 2);
        setanimationsloop.onWarmupCompleted("header", false);
        setanimationsloop.onWarmupCompleted("transactions", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 61;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private RegularExpenseCandidateGroupResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlinx.serialization.KSerializer[]] */
    /* JADX WARN: Type inference failed for: r3v2, types: [kotlinx.serialization.KSerializer[]] */
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Lazy[] lazyArrOnNavigationEvent = RegularExpenseCandidateGroupResponse.onNavigationEvent();
            ?? r3 = new KSerializer[2];
            r3[0] = RegularExpenseCandidateHeaderResponse$$serializer.INSTANCE;
            r3[0] = lazyArrOnNavigationEvent[0].getValue();
            kSerializerArr = r3;
        } else {
            kSerializerArr = new KSerializer[]{RegularExpenseCandidateHeaderResponse$$serializer.INSTANCE, RegularExpenseCandidateGroupResponse.onNavigationEvent()[1].getValue()};
        }
        int i3 = onNavigationEvent + 25;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final RegularExpenseCandidateGroupResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        RegularExpenseCandidateHeaderResponse regularExpenseCandidateHeaderResponse;
        List list;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor);
            RegularExpenseCandidateGroupResponse.onNavigationEvent();
            ywVarOnWarmupCompleted.extraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted2 = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = RegularExpenseCandidateGroupResponse.onNavigationEvent();
        int i3 = 3;
        if (ywVarOnWarmupCompleted2.extraCallbackWithResult()) {
            regularExpenseCandidateHeaderResponse = (RegularExpenseCandidateHeaderResponse) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 0, RegularExpenseCandidateHeaderResponse$$serializer.INSTANCE, (Object) null);
            list = (List) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnNavigationEvent[1].getValue(), (Object) null);
        } else {
            RegularExpenseCandidateHeaderResponse regularExpenseCandidateHeaderResponse2 = null;
            List list2 = null;
            int i4 = 0;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i5 = onWarmupCompleted + 87;
                    int i6 = i5 % 128;
                    onNavigationEvent = i6;
                    if (i5 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (iOnNavigationEvent == 0) {
                        regularExpenseCandidateHeaderResponse2 = (RegularExpenseCandidateHeaderResponse) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 0, RegularExpenseCandidateHeaderResponse$$serializer.INSTANCE, regularExpenseCandidateHeaderResponse2);
                        i4 |= 1;
                    } else {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i7 = i6 + 93;
                        onWarmupCompleted = i7 % 128;
                        if (i7 % 2 == 0) {
                            list2 = (List) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnNavigationEvent[1].getValue(), list2);
                            i4 = 3;
                        } else {
                            list2 = (List) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnNavigationEvent[1].getValue(), list2);
                            i4 |= 2;
                        }
                    }
                } else {
                    z = false;
                }
            }
            regularExpenseCandidateHeaderResponse = regularExpenseCandidateHeaderResponse2;
            list = list2;
            i3 = i4;
        }
        ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor);
        return new RegularExpenseCandidateGroupResponse(i3, regularExpenseCandidateHeaderResponse, list, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m585deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        RegularExpenseCandidateGroupResponse regularExpenseCandidateGroupResponseDeserialize = deserialize(decoder);
        int i4 = onWarmupCompleted + 85;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return regularExpenseCandidateGroupResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull RegularExpenseCandidateGroupResponse regularExpenseCandidateGroupResponse) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(regularExpenseCandidateGroupResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            RegularExpenseCandidateGroupResponse.IAuthTabCallback(regularExpenseCandidateGroupResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(regularExpenseCandidateGroupResponse, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        RegularExpenseCandidateGroupResponse.IAuthTabCallback(regularExpenseCandidateGroupResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = 82 / 0;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (RegularExpenseCandidateGroupResponse) obj);
        int i4 = onNavigationEvent + 73;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onNavigationEvent + 77;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
