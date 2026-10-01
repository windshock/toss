package im.toss.features.benefit.dto;

import im.toss.features.benefit.dto.BenefitActivationIntelligence;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getBgColor;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitActivationIntelligence$Type2$$serializer implements aeu2<BenefitActivationIntelligence.Type2> {
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final BenefitActivationIntelligence$Type2$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 1;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        BenefitActivationIntelligence$Type2$$serializer benefitActivationIntelligence$Type2$$serializer = new BenefitActivationIntelligence$Type2$$serializer();
        INSTANCE = benefitActivationIntelligence$Type2$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.benefit.dto.BenefitActivationIntelligence.Type2", benefitActivationIntelligence$Type2$$serializer, 8);
        setanimationsloop.onWarmupCompleted("id", true);
        setanimationsloop.onWarmupCompleted("logType", true);
        setanimationsloop.onWarmupCompleted("headerMessage", true);
        setanimationsloop.onWarmupCompleted("topParagraph", true);
        setanimationsloop.onWarmupCompleted("bottomParagraph", true);
        setanimationsloop.onWarmupCompleted("buttonTitle", true);
        setanimationsloop.onWarmupCompleted("buttonLandingUrl", true);
        setanimationsloop.onWarmupCompleted("showAd", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 23;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private BenefitActivationIntelligence$Type2$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(kSerializer);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(kSerializer);
        KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(kSerializer);
        BenefitActivationIntelligence$ParagraphBlock$$serializer benefitActivationIntelligence$ParagraphBlock$$serializer = BenefitActivationIntelligence$ParagraphBlock$$serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {kSerializerIAuthTabCallback, kSerializerIAuthTabCallback2, kSerializerIAuthTabCallback3, sp.IAuthTabCallback(benefitActivationIntelligence$ParagraphBlock$$serializer), sp.IAuthTabCallback(benefitActivationIntelligence$ParagraphBlock$$serializer), kSerializer, kSerializer, getBgColor.IAuthTabCallback};
        int i4 = onExtraCallback + 19;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final BenefitActivationIntelligence.Type2 deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        BenefitActivationIntelligence.ParagraphBlock paragraphBlock;
        String str2;
        String str3;
        String str4;
        BenefitActivationIntelligence.ParagraphBlock paragraphBlock2;
        String str5;
        int i;
        boolean zOnExtraCallbackWithResult;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 95;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i5 = 7;
        int i6 = 6;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            String str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            String str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            BenefitActivationIntelligence$ParagraphBlock$$serializer benefitActivationIntelligence$ParagraphBlock$$serializer = BenefitActivationIntelligence$ParagraphBlock$$serializer.INSTANCE;
            paragraphBlock = (BenefitActivationIntelligence.ParagraphBlock) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, benefitActivationIntelligence$ParagraphBlock$$serializer, (Object) null);
            BenefitActivationIntelligence.ParagraphBlock paragraphBlock3 = (BenefitActivationIntelligence.ParagraphBlock) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, benefitActivationIntelligence$ParagraphBlock$$serializer, (Object) null);
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7);
            str = str6;
            str3 = strAsInterface2;
            str2 = str7;
            str4 = strAsInterface;
            str5 = str8;
            i = 255;
            paragraphBlock2 = paragraphBlock3;
        } else {
            int i7 = onExtraCallback + 107;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            boolean z = true;
            boolean zOnExtraCallbackWithResult2 = false;
            BenefitActivationIntelligence.ParagraphBlock paragraphBlock4 = null;
            String strAsInterface3 = null;
            String strAsInterface4 = null;
            BenefitActivationIntelligence.ParagraphBlock paragraphBlock5 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            int i9 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        i5 = 7;
                        i6 = 6;
                    case 0:
                        str10 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str10);
                        i9 |= 1;
                        i5 = 7;
                        i6 = 6;
                    case 1:
                        str11 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str11);
                        i9 |= 2;
                        i5 = 7;
                    case 2:
                        str9 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str9);
                        i9 |= 4;
                        i5 = 7;
                    case 3:
                        paragraphBlock4 = (BenefitActivationIntelligence.ParagraphBlock) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, BenefitActivationIntelligence$ParagraphBlock$$serializer.INSTANCE, paragraphBlock4);
                        i9 |= 8;
                    case 4:
                        paragraphBlock5 = (BenefitActivationIntelligence.ParagraphBlock) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, BenefitActivationIntelligence$ParagraphBlock$$serializer.INSTANCE, paragraphBlock5);
                        i9 |= 16;
                    case 5:
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
                        i9 |= 32;
                    case 6:
                        strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i6);
                        i9 |= 64;
                    case 7:
                        zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5);
                        i9 |= 128;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            str = str10;
            paragraphBlock = paragraphBlock4;
            str2 = str11;
            str3 = strAsInterface3;
            str4 = strAsInterface4;
            paragraphBlock2 = paragraphBlock5;
            str5 = str9;
            i = i9;
            zOnExtraCallbackWithResult = zOnExtraCallbackWithResult2;
        }
        int i10 = i;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new BenefitActivationIntelligence.Type2(i10, str, str2, str5, paragraphBlock, paragraphBlock2, str4, str3, zOnExtraCallbackWithResult, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m90deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        BenefitActivationIntelligence.Type2 type2Deserialize = deserialize(decoder);
        int i4 = onExtraCallback + 107;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return type2Deserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull BenefitActivationIntelligence.Type2 type2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(type2, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            BenefitActivationIntelligence.Type2.onNavigationEvent(type2, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(type2, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        BenefitActivationIntelligence.Type2.onNavigationEvent(type2, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (BenefitActivationIntelligence.Type2) obj);
        int i4 = onExtraCallback + 25;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }
}
