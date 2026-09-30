package im.toss.features.credit.data.response.membership;

import im.toss.features.credit.data.response.Disclaimer;
import im.toss.features.credit.data.response.Disclaimer$$serializer;
import im.toss.features.credit.data.response.membership.Feature$;
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
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusHomeResponse$$serializer implements aeu2<CreditPlusHomeResponse> {
    private static int IAuthTabCallback = 1;
    public static final CreditPlusHomeResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 107;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 / 0;
        }
        return serialDescriptor;
    }

    static {
        CreditPlusHomeResponse$$serializer creditPlusHomeResponse$$serializer = new CreditPlusHomeResponse$$serializer();
        INSTANCE = creditPlusHomeResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.membership.CreditPlusHomeResponse", creditPlusHomeResponse$$serializer, 8);
        setanimationsloop.onWarmupCompleted("subscribeStateDescription", true);
        setanimationsloop.onWarmupCompleted("intelligenceSection", true);
        setanimationsloop.onWarmupCompleted("freeTrialStatusSection", true);
        setanimationsloop.onWarmupCompleted("topSection", true);
        setanimationsloop.onWarmupCompleted("middleSection", true);
        setanimationsloop.onWarmupCompleted("bottomSection", true);
        setanimationsloop.onWarmupCompleted("insuranceStatusSection", true);
        setanimationsloop.onWarmupCompleted("disclaimer", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 59;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private CreditPlusHomeResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent), sp.IAuthTabCallback(Feature$.serializer.INSTANCE), sp.IAuthTabCallback(FreeTrialStatusSection$$serializer.INSTANCE), sp.IAuthTabCallback(TopSection$$serializer.INSTANCE), sp.IAuthTabCallback(MiddleSection$$serializer.INSTANCE), sp.IAuthTabCallback(BottomSection$$serializer.INSTANCE), sp.IAuthTabCallback(InsuranceStatusSection$$serializer.INSTANCE), sp.IAuthTabCallback(Disclaimer$$serializer.INSTANCE)};
        int i4 = onExtraCallbackWithResult + 27;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 46 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CreditPlusHomeResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        FreeTrialStatusSection freeTrialStatusSection;
        Feature feature;
        MiddleSection middleSection;
        TopSection topSection;
        String str;
        Disclaimer disclaimer;
        InsuranceStatusSection insuranceStatusSection;
        BottomSection bottomSection;
        char c;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i3 = 7;
        int i4 = 6;
        int i5 = 5;
        TopSection topSection2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, (Object) null);
            Feature feature2 = (Feature) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, Feature$.serializer.INSTANCE, (Object) null);
            FreeTrialStatusSection freeTrialStatusSection2 = (FreeTrialStatusSection) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, FreeTrialStatusSection$$serializer.INSTANCE, (Object) null);
            TopSection topSection3 = (TopSection) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, TopSection$$serializer.INSTANCE, (Object) null);
            MiddleSection middleSection2 = (MiddleSection) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, MiddleSection$$serializer.INSTANCE, (Object) null);
            BottomSection bottomSection2 = (BottomSection) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, BottomSection$$serializer.INSTANCE, (Object) null);
            InsuranceStatusSection insuranceStatusSection2 = (InsuranceStatusSection) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, InsuranceStatusSection$$serializer.INSTANCE, (Object) null);
            Disclaimer disclaimer2 = (Disclaimer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, Disclaimer$$serializer.INSTANCE, (Object) null);
            int i6 = onNavigationEvent + 29;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            i = 255;
            str = str2;
            disclaimer = disclaimer2;
            insuranceStatusSection = insuranceStatusSection2;
            bottomSection = bottomSection2;
            topSection = topSection3;
            middleSection = middleSection2;
            feature = feature2;
            freeTrialStatusSection = freeTrialStatusSection2;
        } else {
            int i8 = 0;
            boolean z = true;
            MiddleSection middleSection3 = null;
            String str3 = null;
            Disclaimer disclaimer3 = null;
            InsuranceStatusSection insuranceStatusSection3 = null;
            BottomSection bottomSection3 = null;
            Feature feature3 = null;
            FreeTrialStatusSection freeTrialStatusSection3 = null;
            while (z) {
                int i9 = onNavigationEvent + 1;
                onExtraCallbackWithResult = i9 % 128;
                if (i9 % 2 == 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        c = 3;
                        z = false;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                    case 0:
                        c = 3;
                        str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str3);
                        i8 |= 1;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                    case 1:
                        i8 |= 2;
                        feature3 = (Feature) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, Feature$.serializer.INSTANCE, feature3);
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                    case 2:
                        freeTrialStatusSection3 = (FreeTrialStatusSection) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, FreeTrialStatusSection$$serializer.INSTANCE, freeTrialStatusSection3);
                        i8 |= 4;
                        i3 = 7;
                    case 3:
                        topSection2 = (TopSection) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, TopSection$$serializer.INSTANCE, topSection2);
                        i8 |= 8;
                    case 4:
                        middleSection3 = (MiddleSection) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, MiddleSection$$serializer.INSTANCE, middleSection3);
                        i8 |= 16;
                        int i10 = onExtraCallbackWithResult + 89;
                        onNavigationEvent = i10 % 128;
                        int i11 = i10 % 2;
                    case 5:
                        bottomSection3 = (BottomSection) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, BottomSection$$serializer.INSTANCE, bottomSection3);
                        i8 |= 32;
                    case 6:
                        insuranceStatusSection3 = (InsuranceStatusSection) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4, InsuranceStatusSection$$serializer.INSTANCE, insuranceStatusSection3);
                        i8 |= 64;
                    case 7:
                        disclaimer3 = (Disclaimer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, Disclaimer$$serializer.INSTANCE, disclaimer3);
                        i8 |= 128;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            Feature feature4 = feature3;
            int i12 = onNavigationEvent + 53;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
            i = i8;
            freeTrialStatusSection = freeTrialStatusSection3;
            feature = feature4;
            middleSection = middleSection3;
            topSection = topSection2;
            str = str3;
            disclaimer = disclaimer3;
            insuranceStatusSection = insuranceStatusSection3;
            bottomSection = bottomSection3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CreditPlusHomeResponse(i, str, feature, freeTrialStatusSection, topSection, middleSection, bottomSection, insuranceStatusSection, disclaimer, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m217deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            throw null;
        }
        CreditPlusHomeResponse creditPlusHomeResponseDeserialize = deserialize(decoder);
        int i3 = onExtraCallbackWithResult + 35;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 55 / 0;
        }
        return creditPlusHomeResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CreditPlusHomeResponse creditPlusHomeResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(creditPlusHomeResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        CreditPlusHomeResponse.IAuthTabCallback(creditPlusHomeResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 85;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CreditPlusHomeResponse) obj);
        int i4 = onNavigationEvent + 89;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 == 0) {
            int i4 = 78 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
