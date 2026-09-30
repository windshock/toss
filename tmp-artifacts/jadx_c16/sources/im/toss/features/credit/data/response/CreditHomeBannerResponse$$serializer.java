package im.toss.features.credit.data.response;

import im.toss.features.credit.data.response.CreditHomeBannerResponse;
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
public final /* synthetic */ class CreditHomeBannerResponse$$serializer implements aeu2<CreditHomeBannerResponse> {
    public static final CreditHomeBannerResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 123;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        CreditHomeBannerResponse$$serializer creditHomeBannerResponse$$serializer = new CreditHomeBannerResponse$$serializer();
        INSTANCE = creditHomeBannerResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.CreditHomeBannerResponse", creditHomeBannerResponse$$serializer, 2);
        setanimationsloop.onWarmupCompleted("CARD", true);
        setanimationsloop.onWarmupCompleted("LOAN", true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 23;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 71 / 0;
        }
    }

    private CreditHomeBannerResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        CreditHomeBannerResponse$Banner$$serializer creditHomeBannerResponse$Banner$$serializer = CreditHomeBannerResponse$Banner$$serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(creditHomeBannerResponse$Banner$$serializer), sp.IAuthTabCallback(creditHomeBannerResponse$Banner$$serializer)};
        int i4 = onExtraCallbackWithResult + 85;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CreditHomeBannerResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        CreditHomeBannerResponse.Banner banner;
        int i;
        CreditHomeBannerResponse.Banner banner2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Object obj = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            CreditHomeBannerResponse$Banner$$serializer creditHomeBannerResponse$Banner$$serializer = CreditHomeBannerResponse$Banner$$serializer.INSTANCE;
            banner2 = (CreditHomeBannerResponse.Banner) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, creditHomeBannerResponse$Banner$$serializer, (Object) null);
            banner = (CreditHomeBannerResponse.Banner) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, creditHomeBannerResponse$Banner$$serializer, (Object) null);
            i = 3;
        } else {
            int i3 = 0;
            boolean z = true;
            banner = null;
            CreditHomeBannerResponse.Banner banner3 = null;
            while (z) {
                int i4 = onExtraCallbackWithResult + 15;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    obj.hashCode();
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i5 = onNavigationEvent;
                    int i6 = i5 + 21;
                    onExtraCallbackWithResult = i6 % 128;
                    if (i6 % 2 == 0) {
                        if (iOnNavigationEvent != 0) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i7 = i5 + 1;
                        onExtraCallbackWithResult = i7 % 128;
                        int i8 = i7 % 2;
                        banner = (CreditHomeBannerResponse.Banner) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, CreditHomeBannerResponse$Banner$$serializer.INSTANCE, banner);
                        i3 |= 2;
                    } else {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i72 = i5 + 1;
                        onExtraCallbackWithResult = i72 % 128;
                        int i82 = i72 % 2;
                        banner = (CreditHomeBannerResponse.Banner) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, CreditHomeBannerResponse$Banner$$serializer.INSTANCE, banner);
                        i3 |= 2;
                    }
                } else {
                    banner3 = (CreditHomeBannerResponse.Banner) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, CreditHomeBannerResponse$Banner$$serializer.INSTANCE, banner3);
                    i3 |= 1;
                }
            }
            i = i3;
            banner2 = banner3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        CreditHomeBannerResponse creditHomeBannerResponse = new CreditHomeBannerResponse(i, banner2, banner, (okycx) null);
        int i9 = onExtraCallbackWithResult + 83;
        onNavigationEvent = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 12 / 0;
        }
        return creditHomeBannerResponse;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m151deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        CreditHomeBannerResponse creditHomeBannerResponseDeserialize = deserialize(decoder);
        int i4 = onNavigationEvent + 121;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 36 / 0;
        }
        return creditHomeBannerResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CreditHomeBannerResponse creditHomeBannerResponse) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(creditHomeBannerResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            CreditHomeBannerResponse.IAuthTabCallback(creditHomeBannerResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(creditHomeBannerResponse, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        CreditHomeBannerResponse.IAuthTabCallback(creditHomeBannerResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = 29 / 0;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CreditHomeBannerResponse) obj);
        if (i3 == 0) {
            int i4 = 10 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallbackWithResult + 55;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
