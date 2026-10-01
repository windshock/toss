package im.toss.features.kyc.network.model;

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
import o.oty1;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ManualVerifyEddRequest$$serializer implements aeu2<ManualVerifyEddRequest> {
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final ManualVerifyEddRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 81;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 99;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 24 / 0;
        }
        return serialDescriptor;
    }

    static {
        ManualVerifyEddRequest$$serializer manualVerifyEddRequest$$serializer = new ManualVerifyEddRequest$$serializer();
        INSTANCE = manualVerifyEddRequest$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.kyc.network.model.ManualVerifyEddRequest", manualVerifyEddRequest$$serializer, 4);
        setanimationsloop.onWarmupCompleted("kycKey", false);
        setanimationsloop.onWarmupCompleted("capitalSource", false);
        setanimationsloop.onWarmupCompleted("transactionPurposes", false);
        setanimationsloop.onWarmupCompleted("manualVerifyIdCardId", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 45;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private ManualVerifyEddRequest$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        oty1 oty1Var = oty1.onExtraCallback;
        KSerializer<?>[] kSerializerArr = {getWriggleLayout.onNavigationEvent, oty1Var, oty1Var, oty1Var};
        int i4 = onNavigationEvent + 89;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ManualVerifyEddRequest deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        String str;
        long jIAuthTabCallbackDefault;
        long jIAuthTabCallbackDefault2;
        long jIAuthTabCallbackDefault3;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 19;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            i = 15;
            str = strAsInterface;
            jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 1);
            jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 2);
            jIAuthTabCallbackDefault3 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 3);
        } else {
            int i5 = onExtraCallback + 125;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            boolean z = true;
            long jIAuthTabCallbackDefault4 = 0;
            long jIAuthTabCallbackDefault5 = 0;
            long jIAuthTabCallbackDefault6 = 0;
            String strAsInterface2 = null;
            int i7 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i8 = onExtraCallback + 103;
                    int i9 = i8 % 128;
                    onNavigationEvent = i9;
                    if (i8 % 2 != 0 ? iOnNavigationEvent == 1 : iOnNavigationEvent == 1) {
                        jIAuthTabCallbackDefault6 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 1);
                        i7 |= 2;
                    } else if (iOnNavigationEvent == 2) {
                        jIAuthTabCallbackDefault4 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 2);
                        i7 |= 4;
                        int i10 = onNavigationEvent + 79;
                        onExtraCallback = i10 % 128;
                        int i11 = i10 % 2;
                    } else {
                        if (iOnNavigationEvent != 3) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i12 = i9 + 111;
                        onExtraCallback = i12 % 128;
                        if (i12 % 2 != 0) {
                            jIAuthTabCallbackDefault5 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 4);
                            i7 |= 77;
                        } else {
                            jIAuthTabCallbackDefault5 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 3);
                            i7 |= 8;
                        }
                    }
                } else {
                    strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                    i7 |= 1;
                }
            }
            i = i7;
            str = strAsInterface2;
            jIAuthTabCallbackDefault = jIAuthTabCallbackDefault6;
            jIAuthTabCallbackDefault2 = jIAuthTabCallbackDefault4;
            jIAuthTabCallbackDefault3 = jIAuthTabCallbackDefault5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ManualVerifyEddRequest(i, str, jIAuthTabCallbackDefault, jIAuthTabCallbackDefault2, jIAuthTabCallbackDefault3, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m634deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ManualVerifyEddRequest manualVerifyEddRequestDeserialize = deserialize(decoder);
        int i4 = onNavigationEvent + 9;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return manualVerifyEddRequestDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ManualVerifyEddRequest manualVerifyEddRequest) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(manualVerifyEddRequest, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            ManualVerifyEddRequest.onWarmupCompleted(manualVerifyEddRequest, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 81 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(manualVerifyEddRequest, "");
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            ManualVerifyEddRequest.onWarmupCompleted(manualVerifyEddRequest, vylVarOnExtraCallback2, serialDescriptor2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = onExtraCallback + 81;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 83 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ManualVerifyEddRequest) obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onNavigationEvent + 115;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
