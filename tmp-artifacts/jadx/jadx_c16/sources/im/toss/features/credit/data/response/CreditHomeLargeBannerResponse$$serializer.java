package im.toss.features.credit.data.response;

import im.toss.features.credit.data.response.CreditHomeLargeBannerResponse;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
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
public final /* synthetic */ class CreditHomeLargeBannerResponse$$serializer implements aeu2<CreditHomeLargeBannerResponse> {
    private static int IAuthTabCallback = 1;
    public static final CreditHomeLargeBannerResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 65;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 121;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        CreditHomeLargeBannerResponse$$serializer creditHomeLargeBannerResponse$$serializer = new CreditHomeLargeBannerResponse$$serializer();
        INSTANCE = creditHomeLargeBannerResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.CreditHomeLargeBannerResponse", creditHomeLargeBannerResponse$$serializer, 7);
        setanimationsloop.onWarmupCompleted("bannerType", true);
        setanimationsloop.onWarmupCompleted("logType", false);
        setanimationsloop.onWarmupCompleted("contents", false);
        setanimationsloop.onWarmupCompleted("dualColumnContents", false);
        setanimationsloop.onWarmupCompleted("dualCtaContents", false);
        setanimationsloop.onWarmupCompleted("dualRowContents", false);
        setanimationsloop.onWarmupCompleted("cta", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 23;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private CreditHomeLargeBannerResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {CreditHomeLargeBannerResponse.onNavigationEvent()[0].getValue(), sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent), sp.IAuthTabCallback(CreditHomeLargeBannerResponse$Content$$serializer.INSTANCE), sp.IAuthTabCallback(CreditHomeLargeBannerResponse$DualColumnContents$$serializer.INSTANCE), sp.IAuthTabCallback(CreditHomeLargeBannerResponse$DualCtaContents$$serializer.INSTANCE), sp.IAuthTabCallback(CreditHomeLargeBannerResponse$DualRowContents$$serializer.INSTANCE), sp.IAuthTabCallback(CreditHomeLargeBannerResponse$Cta$$serializer.INSTANCE)};
        int i4 = onNavigationEvent + 29;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 39 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CreditHomeLargeBannerResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        CreditHomeLargeBannerResponse.DualRowContents dualRowContents;
        CreditHomeLargeBannerResponse.Content content;
        CreditHomeLargeBannerResponse.DualCtaContents dualCtaContents;
        CreditHomeLargeBannerResponse.DualColumnContents dualColumnContents;
        CreditHomeLargeBannerType creditHomeLargeBannerType;
        CreditHomeLargeBannerResponse.Cta cta;
        String str;
        int i;
        char c;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 105;
        IAuthTabCallback = i3 % 128;
        CreditHomeLargeBannerResponse.DualRowContents dualRowContents2 = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor);
            CreditHomeLargeBannerResponse.onNavigationEvent();
            ywVarOnWarmupCompleted.extraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted2 = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = CreditHomeLargeBannerResponse.onNavigationEvent();
        int i4 = 6;
        if (ywVarOnWarmupCompleted2.extraCallbackWithResult()) {
            CreditHomeLargeBannerType creditHomeLargeBannerType2 = (CreditHomeLargeBannerType) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnNavigationEvent[0].getValue(), (Object) null);
            String str2 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, (Object) null);
            CreditHomeLargeBannerResponse.Content content2 = (CreditHomeLargeBannerResponse.Content) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 2, CreditHomeLargeBannerResponse$Content$$serializer.INSTANCE, (Object) null);
            CreditHomeLargeBannerResponse.DualColumnContents dualColumnContents2 = (CreditHomeLargeBannerResponse.DualColumnContents) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 3, CreditHomeLargeBannerResponse$DualColumnContents$$serializer.INSTANCE, (Object) null);
            CreditHomeLargeBannerResponse.DualCtaContents dualCtaContents2 = (CreditHomeLargeBannerResponse.DualCtaContents) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 4, CreditHomeLargeBannerResponse$DualCtaContents$$serializer.INSTANCE, (Object) null);
            CreditHomeLargeBannerResponse.DualRowContents dualRowContents3 = (CreditHomeLargeBannerResponse.DualRowContents) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 5, CreditHomeLargeBannerResponse$DualRowContents$$serializer.INSTANCE, (Object) null);
            content = content2;
            creditHomeLargeBannerType = creditHomeLargeBannerType2;
            cta = (CreditHomeLargeBannerResponse.Cta) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 6, CreditHomeLargeBannerResponse$Cta$$serializer.INSTANCE, (Object) null);
            str = str2;
            i = 127;
            dualRowContents = dualRowContents3;
            dualColumnContents = dualColumnContents2;
            dualCtaContents = dualCtaContents2;
        } else {
            CreditHomeLargeBannerResponse.Content content3 = null;
            CreditHomeLargeBannerType creditHomeLargeBannerType3 = null;
            CreditHomeLargeBannerResponse.Cta cta2 = null;
            String str3 = null;
            boolean z = true;
            int i5 = 0;
            CreditHomeLargeBannerResponse.DualCtaContents dualCtaContents3 = null;
            CreditHomeLargeBannerResponse.DualColumnContents dualColumnContents3 = null;
            while (z) {
                int i6 = IAuthTabCallback + 69;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 != 0) {
                    ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                    case 0:
                        creditHomeLargeBannerType3 = (CreditHomeLargeBannerType) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnNavigationEvent[0].getValue(), creditHomeLargeBannerType3);
                        i5 |= 1;
                        i4 = 6;
                    case 1:
                        str3 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str3);
                        i5 |= 2;
                        i4 = 6;
                    case 2:
                        c = 3;
                        content3 = (CreditHomeLargeBannerResponse.Content) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 2, CreditHomeLargeBannerResponse$Content$$serializer.INSTANCE, content3);
                        i5 |= 4;
                        i4 = 6;
                    case 3:
                        c = 3;
                        dualColumnContents3 = (CreditHomeLargeBannerResponse.DualColumnContents) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 3, CreditHomeLargeBannerResponse$DualColumnContents$$serializer.INSTANCE, dualColumnContents3);
                        i5 |= 8;
                        i4 = 6;
                    case 4:
                        dualCtaContents3 = (CreditHomeLargeBannerResponse.DualCtaContents) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 4, CreditHomeLargeBannerResponse$DualCtaContents$$serializer.INSTANCE, dualCtaContents3);
                        i5 |= 16;
                    case 5:
                        dualRowContents2 = (CreditHomeLargeBannerResponse.DualRowContents) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 5, CreditHomeLargeBannerResponse$DualRowContents$$serializer.INSTANCE, dualRowContents2);
                        i5 |= 32;
                    case 6:
                        cta2 = (CreditHomeLargeBannerResponse.Cta) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, i4, CreditHomeLargeBannerResponse$Cta$$serializer.INSTANCE, cta2);
                        i5 |= 64;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            int i7 = IAuthTabCallback + 41;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            dualRowContents = dualRowContents2;
            content = content3;
            dualCtaContents = dualCtaContents3;
            dualColumnContents = dualColumnContents3;
            creditHomeLargeBannerType = creditHomeLargeBannerType3;
            cta = cta2;
            str = str3;
            i = i5;
        }
        ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor);
        return new CreditHomeLargeBannerResponse(i, creditHomeLargeBannerType, str, content, dualColumnContents, dualCtaContents, dualRowContents, cta, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m155deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        CreditHomeLargeBannerResponse creditHomeLargeBannerResponseDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallback + 115;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return creditHomeLargeBannerResponseDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CreditHomeLargeBannerResponse creditHomeLargeBannerResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(creditHomeLargeBannerResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        CreditHomeLargeBannerResponse.onExtraCallback(creditHomeLargeBannerResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 87;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CreditHomeLargeBannerResponse) obj);
        if (i3 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onNavigationEvent + 95;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}
