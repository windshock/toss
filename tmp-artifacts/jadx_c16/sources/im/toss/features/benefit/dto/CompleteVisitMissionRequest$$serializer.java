package im.toss.features.benefit.dto;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CompleteVisitMissionRequest$$serializer implements aeu2<CompleteVisitMissionRequest> {
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final CompleteVisitMissionRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public final SerialDescriptor getDescriptor() {
        SerialDescriptor serialDescriptor;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 45;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            serialDescriptor = descriptor;
            int i4 = 62 / 0;
        } else {
            serialDescriptor = descriptor;
        }
        int i5 = i2 + 87;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        CompleteVisitMissionRequest$$serializer completeVisitMissionRequest$$serializer = new CompleteVisitMissionRequest$$serializer();
        INSTANCE = completeVisitMissionRequest$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.benefit.dto.CompleteVisitMissionRequest", completeVisitMissionRequest$$serializer, 1);
        setanimationsloop.onWarmupCompleted("card", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 125;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private CompleteVisitMissionRequest$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerArr = new KSerializer[1];
            kSerializerArr[1] = getWriggleLayout.onNavigationEvent;
        } else {
            kSerializerArr = new KSerializer[]{getWriggleLayout.onNavigationEvent};
        }
        int i3 = onExtraCallbackWithResult + 1;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CompleteVisitMissionRequest deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Object obj = null;
        int i2 = 1;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onExtraCallbackWithResult + 43;
            IAuthTabCallback = i3 % 128;
            strAsInterface = i3 % 2 != 0 ? ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1) : ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
        } else {
            int i4 = 0;
            strAsInterface = null;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i5 = onExtraCallbackWithResult + 119;
                    int i6 = i5 % 128;
                    IAuthTabCallback = i6;
                    if (i5 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (iOnNavigationEvent != 0) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i7 = i6 + 49;
                    onExtraCallbackWithResult = i7 % 128;
                    if (i7 % 2 == 0) {
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i4 = 0;
                    } else {
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i4 = 1;
                    }
                } else {
                    z = false;
                }
            }
            i2 = i4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        CompleteVisitMissionRequest completeVisitMissionRequest = new CompleteVisitMissionRequest(i2, strAsInterface, (okycx) null);
        int i8 = IAuthTabCallback + 61;
        onExtraCallbackWithResult = i8 % 128;
        if (i8 % 2 != 0) {
            return completeVisitMissionRequest;
        }
        obj.hashCode();
        throw null;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m96deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        CompleteVisitMissionRequest completeVisitMissionRequestDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallback + 59;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return completeVisitMissionRequestDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CompleteVisitMissionRequest completeVisitMissionRequest) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(completeVisitMissionRequest, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            CompleteVisitMissionRequest.IAuthTabCallback(completeVisitMissionRequest, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(completeVisitMissionRequest, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        CompleteVisitMissionRequest.IAuthTabCallback(completeVisitMissionRequest, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CompleteVisitMissionRequest) obj);
        if (i3 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 1;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallbackWithResult + 81;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
