package im.toss.features.home.core.remote.model;

import im.toss.features.home.core.remote.model.TransactionToggleOptionResponse;
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
public final /* synthetic */ class TransactionToggleOptionResponse$$serializer implements aeu2<TransactionToggleOptionResponse> {
    private static int IAuthTabCallback = 1;
    public static final TransactionToggleOptionResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 35;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 37;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        TransactionToggleOptionResponse$$serializer transactionToggleOptionResponse$$serializer = new TransactionToggleOptionResponse$$serializer();
        INSTANCE = transactionToggleOptionResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.TransactionToggleOptionResponse", transactionToggleOptionResponse$$serializer, 3);
        setanimationsloop.onWarmupCompleted("on", false);
        setanimationsloop.onWarmupCompleted("off", false);
        setanimationsloop.onWarmupCompleted("currentStatus", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 63;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private TransactionToggleOptionResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            TransactionToggleOptionResponse$Option$$serializer transactionToggleOptionResponse$Option$$serializer = TransactionToggleOptionResponse$Option$$serializer.INSTANCE;
            return new KSerializer[]{transactionToggleOptionResponse$Option$$serializer, transactionToggleOptionResponse$Option$$serializer, getBgColor.IAuthTabCallback};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[2];
        TransactionToggleOptionResponse$Option$$serializer transactionToggleOptionResponse$Option$$serializer2 = TransactionToggleOptionResponse$Option$$serializer.INSTANCE;
        kSerializerArr[0] = transactionToggleOptionResponse$Option$$serializer2;
        kSerializerArr[0] = transactionToggleOptionResponse$Option$$serializer2;
        kSerializerArr[5] = getBgColor.IAuthTabCallback;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final TransactionToggleOptionResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        boolean zOnExtraCallbackWithResult;
        TransactionToggleOptionResponse.Option option;
        int i;
        TransactionToggleOptionResponse.Option option2;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 9;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            TransactionToggleOptionResponse$Option$$serializer transactionToggleOptionResponse$Option$$serializer = TransactionToggleOptionResponse$Option$$serializer.INSTANCE;
            TransactionToggleOptionResponse.Option option3 = (TransactionToggleOptionResponse.Option) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, transactionToggleOptionResponse$Option$$serializer, (Object) null);
            TransactionToggleOptionResponse.Option option4 = (TransactionToggleOptionResponse.Option) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, transactionToggleOptionResponse$Option$$serializer, (Object) null);
            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2);
            option = option4;
            i = 7;
            option2 = option3;
        } else {
            int i5 = onNavigationEvent + 17;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            TransactionToggleOptionResponse.Option option5 = null;
            TransactionToggleOptionResponse.Option option6 = null;
            boolean zOnExtraCallbackWithResult2 = false;
            int i7 = 0;
            boolean z = true;
            while (z) {
                int i8 = onNavigationEvent + 27;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 == 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i9 = onNavigationEvent;
                    int i10 = i9 + 117;
                    onExtraCallbackWithResult = i10 % 128;
                    int i11 = i10 % 2;
                    if (iOnNavigationEvent != 1) {
                        int i12 = i9 + 83;
                        onExtraCallbackWithResult = i12 % 128;
                        if (i12 % 2 == 0) {
                            if (iOnNavigationEvent != 5) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2);
                            i7 |= 4;
                        } else {
                            if (iOnNavigationEvent != 2) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2);
                            i7 |= 4;
                        }
                    } else {
                        option5 = (TransactionToggleOptionResponse.Option) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, TransactionToggleOptionResponse$Option$$serializer.INSTANCE, option5);
                        i7 |= 2;
                    }
                } else {
                    option6 = (TransactionToggleOptionResponse.Option) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, TransactionToggleOptionResponse$Option$$serializer.INSTANCE, option6);
                    i7 |= 1;
                }
            }
            zOnExtraCallbackWithResult = zOnExtraCallbackWithResult2;
            option = option5;
            i = i7;
            option2 = option6;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TransactionToggleOptionResponse(i, option2, option, zOnExtraCallbackWithResult, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m548deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            throw null;
        }
        TransactionToggleOptionResponse transactionToggleOptionResponseDeserialize = deserialize(decoder);
        int i3 = onExtraCallbackWithResult + 63;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return transactionToggleOptionResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TransactionToggleOptionResponse transactionToggleOptionResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(transactionToggleOptionResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            TransactionToggleOptionResponse.IAuthTabCallback(transactionToggleOptionResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(transactionToggleOptionResponse, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        TransactionToggleOptionResponse.IAuthTabCallback(transactionToggleOptionResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onNavigationEvent + 39;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        serialize(encoder, (TransactionToggleOptionResponse) obj);
        if (i3 != 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = onNavigationEvent + 39;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
