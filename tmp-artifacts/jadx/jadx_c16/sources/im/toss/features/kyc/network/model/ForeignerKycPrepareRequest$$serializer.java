package im.toss.features.kyc.network.model;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getBgColor;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ForeignerKycPrepareRequest$$serializer implements aeu2<ForeignerKycPrepareRequest> {
    public static final int $stable;
    public static final ForeignerKycPrepareRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 123;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 103;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 56 / 0;
        }
        return serialDescriptor;
    }

    static {
        ForeignerKycPrepareRequest$$serializer foreignerKycPrepareRequest$$serializer = new ForeignerKycPrepareRequest$$serializer();
        INSTANCE = foreignerKycPrepareRequest$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.kyc.network.model.ForeignerKycPrepareRequest", foreignerKycPrepareRequest$$serializer, 1);
        setanimationsloop.onWarmupCompleted("canUseTossCert", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 107;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 23 / 0;
        }
    }

    private ForeignerKycPrepareRequest$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        onExtraCallbackWithResult = i2 % 128;
        KSerializer<?>[] kSerializerArr = i2 % 2 == 0 ? new KSerializer[]{getBgColor.IAuthTabCallback} : new KSerializer[]{getBgColor.IAuthTabCallback};
        int i3 = onExtraCallbackWithResult + 115;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 31 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0037 A[PHI: r1 r11
      0x0037: PHI (r1v7 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v8 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0030, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
      0x0037: PHI (r11v5 o.yw) = (r11v1 o.yw), (r11v7 o.yw) binds: [B:8:0x0030, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032 A[PHI: r1 r11
      0x0032: PHI (r1v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v8 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0030, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
      0x0032: PHI (r11v2 o.yw) = (r11v1 o.yw), (r11v7 o.yw) binds: [B:8:0x0030, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ForeignerKycPrepareRequest deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        boolean zOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        int i3 = 1;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
            } else {
                boolean z = true;
                boolean zOnExtraCallbackWithResult2 = false;
                int i4 = 0;
                while (z) {
                    int i5 = onExtraCallbackWithResult + 67;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 != 0) {
                        ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                        obj.hashCode();
                        throw null;
                    }
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent != -1) {
                        int i6 = onExtraCallbackWithResult + 47;
                        onNavigationEvent = i6 % 128;
                        int i7 = i6 % 2;
                        if (iOnNavigationEvent != 0) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
                        i4 = 1;
                    } else {
                        int i8 = onNavigationEvent + 61;
                        onExtraCallbackWithResult = i8 % 128;
                        int i9 = i8 % 2;
                        z = false;
                    }
                }
                zOnExtraCallbackWithResult = zOnExtraCallbackWithResult2;
                i3 = i4;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ForeignerKycPrepareRequest(i3, zOnExtraCallbackWithResult, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m632deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ForeignerKycPrepareRequest foreignerKycPrepareRequestDeserialize = deserialize(decoder);
        if (i3 == 0) {
            int i4 = 14 / 0;
        }
        return foreignerKycPrepareRequestDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ForeignerKycPrepareRequest foreignerKycPrepareRequest) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(foreignerKycPrepareRequest, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            ForeignerKycPrepareRequest.IAuthTabCallback(foreignerKycPrepareRequest, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 43 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(foreignerKycPrepareRequest, "");
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            ForeignerKycPrepareRequest.IAuthTabCallback(foreignerKycPrepareRequest, vylVarOnExtraCallback2, serialDescriptor2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = onExtraCallbackWithResult + 85;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ForeignerKycPrepareRequest) obj);
        if (i3 != 0) {
            int i4 = 75 / 0;
        }
        int i5 = onNavigationEvent + 83;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallbackWithResult + 81;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
