package im.toss.features.credit.data.response;

import com.iap.android.mppclient.mpm.utils.TradePayResultUtils;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.dj3;
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditScoreResponse$$serializer implements aeu2<CreditScoreResponse> {
    private static int IAuthTabCallback = 1;
    public static final CreditScoreResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 33;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        CreditScoreResponse$$serializer creditScoreResponse$$serializer = new CreditScoreResponse$$serializer();
        INSTANCE = creditScoreResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.CreditScoreResponse", creditScoreResponse$$serializer, 3);
        setanimationsloop.onWarmupCompleted("accumulateRank", true);
        setanimationsloop.onWarmupCompleted("score", true);
        setanimationsloop.onWarmupCompleted(TradePayResultUtils.RESULT_CODE_KEY, true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 11;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 56 / 0;
        }
    }

    private CreditScoreResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return new KSerializer[]{dj3.onWarmupCompleted, getDynamicHeight.onWarmupCompleted, sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent)};
        }
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent);
        KSerializer<?>[] kSerializerArr = new KSerializer[2];
        kSerializerArr[0] = dj3.onWarmupCompleted;
        kSerializerArr[0] = getDynamicHeight.onWarmupCompleted;
        kSerializerArr[2] = kSerializerIAuthTabCallback;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048 A[PHI: r1 r15
      0x0048: PHI (r1v8 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x0048: PHI (r15v5 o.yw) = (r15v1 o.yw), (r15v7 o.yw) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035 A[PHI: r1 r15
      0x0035: PHI (r1v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r15v2 o.yw) = (r15v1 o.yw), (r15v7 o.yw) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CreditScoreResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        float fOnWarmupCompleted;
        int iOnTransact;
        String str;
        int i = 2 % 2;
        int i2 = 7;
        int i3 = onWarmupCompleted + 7;
        IAuthTabCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            int i4 = 31 / 0;
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                fOnWarmupCompleted = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 0);
                iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 1);
                str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, (Object) null);
            } else {
                float fOnWarmupCompleted2 = 0.0f;
                String str2 = null;
                int i5 = 0;
                int iOnTransact2 = 0;
                boolean z = true;
                while (z) {
                    int i6 = onWarmupCompleted + 121;
                    IAuthTabCallback = i6 % 128;
                    if (i6 % 2 == 0) {
                        ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                        obj.hashCode();
                        throw null;
                    }
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent == -1) {
                        z = false;
                    } else if (iOnNavigationEvent == 0) {
                        fOnWarmupCompleted2 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 0);
                        i5 |= 1;
                    } else if (iOnNavigationEvent != 1) {
                        int i7 = IAuthTabCallback;
                        int i8 = i7 + 1;
                        onWarmupCompleted = i8 % 128;
                        if (i8 % 2 != 0) {
                            if (iOnNavigationEvent != 5) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            int i9 = i7 + 43;
                            onWarmupCompleted = i9 % 128;
                            int i10 = i9 % 2;
                            str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str2);
                            i5 = i10 == 0 ? i5 | 2 : i5 | 4;
                        } else {
                            if (iOnNavigationEvent != 2) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            int i92 = i7 + 43;
                            onWarmupCompleted = i92 % 128;
                            int i102 = i92 % 2;
                            str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str2);
                            if (i102 == 0) {
                            }
                        }
                    } else {
                        iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 1);
                        i5 |= 2;
                        int i11 = onWarmupCompleted + 29;
                        IAuthTabCallback = i11 % 128;
                        int i12 = i11 % 2;
                    }
                }
                str = str2;
                i2 = i5;
                fOnWarmupCompleted = fOnWarmupCompleted2;
                iOnTransact = iOnTransact2;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CreditScoreResponse(i2, fOnWarmupCompleted, iOnTransact, str, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m173deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        CreditScoreResponse creditScoreResponseDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallback + 19;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return creditScoreResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CreditScoreResponse creditScoreResponse) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(creditScoreResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        CreditScoreResponse.IAuthTabCallback(creditScoreResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 51;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CreditScoreResponse) obj);
        int i4 = onWarmupCompleted + 3;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
            int i3 = 65 / 0;
        } else {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        }
        int i4 = onWarmupCompleted + 1;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
