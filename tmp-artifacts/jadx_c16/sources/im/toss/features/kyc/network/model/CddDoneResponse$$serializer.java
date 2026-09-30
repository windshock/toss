package im.toss.features.kyc.network.model;

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
public final /* synthetic */ class CddDoneResponse$$serializer implements aeu2<CddDoneResponse> {
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final CddDoneResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 != 0) {
            int i4 = 56 / 0;
        }
        return serialDescriptor;
    }

    static {
        CddDoneResponse$$serializer cddDoneResponse$$serializer = new CddDoneResponse$$serializer();
        INSTANCE = cddDoneResponse$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.kyc.network.model.CddDoneResponse", cddDoneResponse$$serializer, 3);
        setanimationsloop.onWarmupCompleted("eddNeeded", true);
        setanimationsloop.onWarmupCompleted("kycKey", true);
        setanimationsloop.onWarmupCompleted("eddProcessType", true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 79;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private CddDoneResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback((KSerializer) CddDoneResponse.onExtraCallback()[5].getValue());
            kSerializerArr = new KSerializer[5];
            kSerializerArr[0] = getBgColor.IAuthTabCallback;
            kSerializerArr[0] = getWriggleLayout.onNavigationEvent;
            kSerializerArr[5] = kSerializerIAuthTabCallback;
        } else {
            kSerializerArr = new KSerializer[]{getBgColor.IAuthTabCallback, getWriggleLayout.onNavigationEvent, sp.IAuthTabCallback((KSerializer) CddDoneResponse.onExtraCallback()[2].getValue())};
        }
        int i3 = IAuthTabCallback + 99;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0057 A[PHI: r1 r2 r14
      0x0057: PHI (r1v8 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x0057: PHI (r2v10 kotlin.Lazy[]) = (r2v2 kotlin.Lazy[]), (r2v12 kotlin.Lazy[]) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x0057: PHI (r14v5 o.yw) = (r14v1 o.yw), (r14v7 o.yw) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d A[PHI: r1 r2 r14
      0x003d: PHI (r1v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x003d: PHI (r2v3 kotlin.Lazy[]) = (r2v2 kotlin.Lazy[]), (r2v12 kotlin.Lazy[]) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x003d: PHI (r14v2 o.yw) = (r14v1 o.yw), (r14v7 o.yw) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CddDoneResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        Lazy[] lazyArrOnExtraCallback;
        boolean zOnExtraCallbackWithResult;
        int i;
        String str;
        EddProcessType eddProcessType;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 107;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnExtraCallback = CddDoneResponse.onExtraCallback();
            int i4 = 64 / 0;
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
                String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                EddProcessType eddProcessType2 = (EddProcessType) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrOnExtraCallback[2].getValue(), (Object) null);
                i = 7;
                str = strAsInterface;
                eddProcessType = eddProcessType2;
            } else {
                EddProcessType eddProcessType3 = null;
                String strAsInterface2 = null;
                boolean z = true;
                int i5 = 0;
                boolean zOnExtraCallbackWithResult2 = false;
                while (z) {
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent != -1) {
                        int i6 = onNavigationEvent + 11;
                        IAuthTabCallback = i6 % 128;
                        int i7 = i6 % 2;
                        if (iOnNavigationEvent == 0) {
                            zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
                            i5 |= 1;
                        } else if (iOnNavigationEvent == 1) {
                            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                            i5 |= 2;
                        } else {
                            if (iOnNavigationEvent != 2) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            eddProcessType3 = (EddProcessType) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrOnExtraCallback[2].getValue(), eddProcessType3);
                            i5 |= 4;
                        }
                    } else {
                        z = false;
                    }
                }
                i = i5;
                eddProcessType = eddProcessType3;
                str = strAsInterface2;
                zOnExtraCallbackWithResult = zOnExtraCallbackWithResult2;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnExtraCallback = CddDoneResponse.onExtraCallback();
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CddDoneResponse(i, zOnExtraCallbackWithResult, str, eddProcessType, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m626deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        CddDoneResponse cddDoneResponseDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallback + 109;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 21 / 0;
        }
        return cddDoneResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CddDoneResponse cddDoneResponse) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(cddDoneResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        CddDoneResponse.onNavigationEvent(cddDoneResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 9;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 60 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CddDoneResponse) obj);
        int i4 = onNavigationEvent + 115;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 10 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 49;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
