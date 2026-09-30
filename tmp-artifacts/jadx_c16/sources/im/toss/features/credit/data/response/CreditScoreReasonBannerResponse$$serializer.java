package im.toss.features.credit.data.response;

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
public final /* synthetic */ class CreditScoreReasonBannerResponse$$serializer implements aeu2<CreditScoreReasonBannerResponse> {
    private static int IAuthTabCallback = 1;
    public static final CreditScoreReasonBannerResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 59;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        CreditScoreReasonBannerResponse$$serializer creditScoreReasonBannerResponse$$serializer = new CreditScoreReasonBannerResponse$$serializer();
        INSTANCE = creditScoreReasonBannerResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.CreditScoreReasonBannerResponse", creditScoreReasonBannerResponse$$serializer, 1);
        setanimationsloop.onWarmupCompleted("bannerInfo", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 79;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private CreditScoreReasonBannerResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(CreditScoreReasonBanner$$serializer.INSTANCE)};
        int i4 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003b A[PHI: r1 r11
      0x003b: PHI (r1v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v11 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0030, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
      0x003b: PHI (r11v2 o.yw) = (r11v1 o.yw), (r11v7 o.yw) binds: [B:8:0x0030, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032 A[PHI: r1 r11
      0x0032: PHI (r1v10 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v11 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0030, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
      0x0032: PHI (r11v6 o.yw) = (r11v1 o.yw), (r11v7 o.yw) binds: [B:8:0x0030, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CreditScoreReasonBannerResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        CreditScoreReasonBanner creditScoreReasonBanner;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        onNavigationEvent = i2 % 128;
        int i3 = 1;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                int i4 = 0;
                boolean z = true;
                creditScoreReasonBanner = null;
                while (z) {
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent == -1) {
                        z = false;
                    } else {
                        if (iOnNavigationEvent != 0) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        creditScoreReasonBanner = (CreditScoreReasonBanner) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, CreditScoreReasonBanner$$serializer.INSTANCE, creditScoreReasonBanner);
                        i4 = 1;
                    }
                }
                i3 = i4;
            } else {
                creditScoreReasonBanner = (CreditScoreReasonBanner) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, CreditScoreReasonBanner$$serializer.INSTANCE, (Object) null);
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        CreditScoreReasonBannerResponse creditScoreReasonBannerResponse = new CreditScoreReasonBannerResponse(i3, creditScoreReasonBanner, (okycx) null);
        int i5 = onNavigationEvent + 89;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return creditScoreReasonBannerResponse;
        }
        obj.hashCode();
        throw null;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m172deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        CreditScoreReasonBannerResponse creditScoreReasonBannerResponseDeserialize = deserialize(decoder);
        if (i3 == 0) {
            int i4 = 90 / 0;
        }
        return creditScoreReasonBannerResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CreditScoreReasonBannerResponse creditScoreReasonBannerResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(creditScoreReasonBannerResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        CreditScoreReasonBannerResponse.onExtraCallback(creditScoreReasonBannerResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallbackWithResult + 33;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CreditScoreReasonBannerResponse) obj);
        int i4 = onExtraCallbackWithResult + 83;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 != 0) {
            int i4 = 85 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
