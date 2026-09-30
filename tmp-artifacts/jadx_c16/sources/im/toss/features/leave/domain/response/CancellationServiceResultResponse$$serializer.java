package im.toss.features.leave.domain.response;

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
import o.getBgColor;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CancellationServiceResultResponse$$serializer implements aeu2<CancellationServiceResultResponse> {
    private static int IAuthTabCallback = 1;
    public static final CancellationServiceResultResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 51;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        CancellationServiceResultResponse$$serializer cancellationServiceResultResponse$$serializer = new CancellationServiceResultResponse$$serializer();
        INSTANCE = cancellationServiceResultResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.leave.domain.response.CancellationServiceResultResponse", cancellationServiceResultResponse$$serializer, 4);
        setanimationsloop.onWarmupCompleted("isSuccessAll", true);
        setanimationsloop.onWarmupCompleted("success", true);
        setanimationsloop.onWarmupCompleted("fail", true);
        setanimationsloop.onWarmupCompleted("postLeaveCancellation", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 121;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private CancellationServiceResultResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnWarmupCompleted = CancellationServiceResultResponse.onWarmupCompleted();
        KSerializer<?>[] kSerializerArr = {getBgColor.IAuthTabCallback, sp.IAuthTabCallback((KSerializer) lazyArrOnWarmupCompleted[1].getValue()), sp.IAuthTabCallback((KSerializer) lazyArrOnWarmupCompleted[2].getValue()), sp.IAuthTabCallback((KSerializer) lazyArrOnWarmupCompleted[3].getValue())};
        int i4 = onExtraCallbackWithResult + 31;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CancellationServiceResultResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        boolean z;
        int i;
        List list;
        List list2;
        List list3;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnWarmupCompleted = CancellationServiceResultResponse.onWarmupCompleted();
        List list4 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onWarmupCompleted + 5;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            boolean zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
            List list5 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), (Object) null);
            list = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrOnWarmupCompleted[2].getValue(), (Object) null);
            list2 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, (jp) lazyArrOnWarmupCompleted[3].getValue(), (Object) null);
            z = zOnExtraCallbackWithResult;
            i = 15;
            list3 = list5;
        } else {
            int i5 = onExtraCallbackWithResult + 15;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            boolean zOnExtraCallbackWithResult2 = false;
            int i7 = 0;
            List list6 = null;
            List list7 = null;
            boolean z2 = true;
            while (!(!z2)) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z2 = false;
                } else if (iOnNavigationEvent != 0) {
                    int i8 = onExtraCallbackWithResult + 89;
                    onWarmupCompleted = i8 % 128;
                    if (i8 % 2 == 0) {
                        if (iOnNavigationEvent == 1) {
                            list7 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), list7);
                            i7 |= 2;
                        } else if (iOnNavigationEvent != 2) {
                            list4 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrOnWarmupCompleted[2].getValue(), list4);
                            i7 |= 4;
                        } else {
                            if (iOnNavigationEvent != 3) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            list6 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, (jp) lazyArrOnWarmupCompleted[3].getValue(), list6);
                            i7 |= 8;
                        }
                    } else if (iOnNavigationEvent == 1) {
                        list7 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), list7);
                        i7 |= 2;
                    } else if (iOnNavigationEvent != 2) {
                    }
                } else {
                    zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
                    i7 |= 1;
                    int i9 = onWarmupCompleted + 97;
                    onExtraCallbackWithResult = i9 % 128;
                    int i10 = i9 % 2;
                }
            }
            z = zOnExtraCallbackWithResult2;
            i = i7;
            list = list4;
            list2 = list6;
            list3 = list7;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CancellationServiceResultResponse(i, z, list3, list, list2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m648deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        CancellationServiceResultResponse cancellationServiceResultResponseDeserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 57 / 0;
        }
        return cancellationServiceResultResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CancellationServiceResultResponse cancellationServiceResultResponse) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(cancellationServiceResultResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        CancellationServiceResultResponse.onWarmupCompleted(cancellationServiceResultResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallbackWithResult + 71;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CancellationServiceResultResponse) obj);
        if (i3 != 0) {
            int i4 = 15 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallbackWithResult + 103;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 88 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
