package im.toss.features.leave.domain.response;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CancellationServicesResponse$$serializer implements aeu2<CancellationServicesResponse> {
    public static final CancellationServicesResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 87;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        CancellationServicesResponse$$serializer cancellationServicesResponse$$serializer = new CancellationServicesResponse$$serializer();
        INSTANCE = cancellationServicesResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.leave.domain.response.CancellationServicesResponse", cancellationServicesResponse$$serializer, 2);
        setanimationsloop.onWarmupCompleted("immediateCancellation", true);
        setanimationsloop.onWarmupCompleted("postLeaveCancellation", true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 43;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private CancellationServicesResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            CancellationServiceSectionsResponse$$serializer cancellationServiceSectionsResponse$$serializer = CancellationServiceSectionsResponse$$serializer.INSTANCE;
            return new KSerializer[]{sp.IAuthTabCallback(cancellationServiceSectionsResponse$$serializer), sp.IAuthTabCallback(cancellationServiceSectionsResponse$$serializer)};
        }
        CancellationServiceSectionsResponse$$serializer cancellationServiceSectionsResponse$$serializer2 = CancellationServiceSectionsResponse$$serializer.INSTANCE;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(cancellationServiceSectionsResponse$$serializer2);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(cancellationServiceSectionsResponse$$serializer2);
        KSerializer<?>[] kSerializerArr = new KSerializer[2];
        kSerializerArr[0] = kSerializerIAuthTabCallback;
        kSerializerArr[0] = kSerializerIAuthTabCallback2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CancellationServicesResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        CancellationServiceSectionsResponse cancellationServiceSectionsResponse;
        CancellationServiceSectionsResponse cancellationServiceSectionsResponse2;
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 7;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            decoder.onWarmupCompleted(descriptor).extraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            CancellationServiceSectionsResponse$$serializer cancellationServiceSectionsResponse$$serializer = CancellationServiceSectionsResponse$$serializer.INSTANCE;
            cancellationServiceSectionsResponse2 = (CancellationServiceSectionsResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, cancellationServiceSectionsResponse$$serializer, (Object) null);
            cancellationServiceSectionsResponse = (CancellationServiceSectionsResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, cancellationServiceSectionsResponse$$serializer, (Object) null);
            i = 3;
        } else {
            CancellationServiceSectionsResponse cancellationServiceSectionsResponse3 = null;
            CancellationServiceSectionsResponse cancellationServiceSectionsResponse4 = null;
            int i4 = 0;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i5 = onWarmupCompleted + 17;
                    int i6 = i5 % 128;
                    onExtraCallbackWithResult = i6;
                    int i7 = i5 % 2;
                    if (iOnNavigationEvent == 0) {
                        cancellationServiceSectionsResponse4 = (CancellationServiceSectionsResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, CancellationServiceSectionsResponse$$serializer.INSTANCE, cancellationServiceSectionsResponse4);
                        i4 |= 1;
                    } else {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i8 = i6 + 39;
                        onWarmupCompleted = i8 % 128;
                        int i9 = i8 % 2;
                        cancellationServiceSectionsResponse3 = (CancellationServiceSectionsResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, CancellationServiceSectionsResponse$$serializer.INSTANCE, cancellationServiceSectionsResponse3);
                        i4 |= 2;
                    }
                } else {
                    z = false;
                }
            }
            cancellationServiceSectionsResponse = cancellationServiceSectionsResponse3;
            cancellationServiceSectionsResponse2 = cancellationServiceSectionsResponse4;
            i = i4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CancellationServicesResponse(i, cancellationServiceSectionsResponse2, cancellationServiceSectionsResponse, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m650deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        CancellationServicesResponse cancellationServicesResponseDeserialize = deserialize(decoder);
        int i4 = onWarmupCompleted + 31;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return cancellationServicesResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CancellationServicesResponse cancellationServicesResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(cancellationServicesResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        CancellationServicesResponse.onExtraCallback(cancellationServicesResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallbackWithResult + 71;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        serialize(encoder, (CancellationServicesResponse) obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onWarmupCompleted + 91;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onExtraCallbackWithResult + 99;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
