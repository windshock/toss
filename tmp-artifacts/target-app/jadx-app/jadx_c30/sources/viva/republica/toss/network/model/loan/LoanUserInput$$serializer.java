package viva.republica.toss.network.model.loan;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import net.sf.scuba.smartcards.BuildConfig;
import o.ImagePipelineExternalSyntheticLambda5;
import o.aeu2;
import o.getWriggleLayout;
import o.oty1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class LoanUserInput$$serializer implements aeu2<LoanUserInput> {
    private static int IAuthTabCallback = 1;
    public static final LoanUserInput$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 65;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return serialDescriptor;
        }
        obj.hashCode();
        throw null;
    }

    static {
        LoanUserInput$$serializer loanUserInput$$serializer = new LoanUserInput$$serializer();
        INSTANCE = loanUserInput$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.loan.LoanUserInput", loanUserInput$$serializer, 9);
        setanimationsloop.onWarmupCompleted(ImagePipelineExternalSyntheticLambda5.KEY_INPUT_JOB_TYPE, false);
        setanimationsloop.onWarmupCompleted(ImagePipelineExternalSyntheticLambda5.KEY_HOUSE_HOLDER_TYPE, false);
        setanimationsloop.onWarmupCompleted(ImagePipelineExternalSyntheticLambda5.KEY_PAYER_TYPE, false);
        setanimationsloop.onWarmupCompleted(ImagePipelineExternalSyntheticLambda5.PARAM_AUTO_MOBILE_NUM, false);
        setanimationsloop.onWarmupCompleted(ImagePipelineExternalSyntheticLambda5.KEY_COMPANY_NUMBER, false);
        setanimationsloop.onWarmupCompleted(ImagePipelineExternalSyntheticLambda5.KEY_COMPANY_NAME, false);
        setanimationsloop.onWarmupCompleted(ImagePipelineExternalSyntheticLambda5.KEY_INPUT_EMPLOYEE_JOIN_DATE, false);
        setanimationsloop.onWarmupCompleted(ImagePipelineExternalSyntheticLambda5.KEY_INPUT_BUSINESS_OPEN_DATE, false);
        setanimationsloop.onWarmupCompleted(ImagePipelineExternalSyntheticLambda5.KEY_INPUT_SALARY, false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 103;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private LoanUserInput$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {kSerializer, sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(oty1.onExtraCallback)};
        int i4 = onExtraCallbackWithResult + 61;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        throw null;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return m68deserialize(decoder);
        }
        m68deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final LoanUserInput m68deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Long l;
        String str7;
        String str8;
        char c;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i3 = 7;
        int i4 = 6;
        String str9 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i5 = onExtraCallbackWithResult + 89;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str10 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            String str11 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, (Object) null);
            String str12 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getwrigglelayout, (Object) null);
            String str13 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getwrigglelayout, (Object) null);
            String str14 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getwrigglelayout, (Object) null);
            String str15 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, getwrigglelayout, (Object) null);
            l = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, oty1.onExtraCallback, (Object) null);
            str3 = str12;
            str4 = str13;
            str5 = str11;
            str8 = strAsInterface;
            i = 511;
            str = str14;
            str2 = str10;
            str7 = str15;
        } else {
            i = 0;
            boolean z = true;
            String str16 = null;
            str = null;
            String str17 = null;
            String str18 = null;
            Long l2 = null;
            String str19 = null;
            String str20 = null;
            String strAsInterface2 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        i3 = 7;
                        i4 = 6;
                    case 0:
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i |= 1;
                        str20 = str20;
                        i3 = 7;
                        i4 = 6;
                    case 1:
                        str20 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str20);
                        i |= 2;
                        i3 = 7;
                        i4 = 6;
                    case 2:
                        c = 2;
                        str9 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str9);
                        i |= 4;
                        i3 = 7;
                        i4 = 6;
                    case 3:
                        c = 2;
                        str18 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str18);
                        i |= 8;
                        i3 = 7;
                        i4 = 6;
                    case 4:
                        str16 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, str16);
                        i |= 16;
                        int i7 = IAuthTabCallback + 91;
                        onExtraCallbackWithResult = i7 % 128;
                        int i8 = i7 % 2;
                        i3 = 7;
                    case 5:
                        str17 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, str17);
                        i |= 32;
                    case 6:
                        str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4, getWriggleLayout.onNavigationEvent, str);
                        i |= 64;
                    case 7:
                        str19 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, getWriggleLayout.onNavigationEvent, str19);
                        i |= 128;
                    case 8:
                        l2 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, oty1.onExtraCallback, l2);
                        i |= 256;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            str2 = str20;
            str3 = str16;
            str4 = str17;
            str5 = str9;
            str6 = str18;
            l = l2;
            str7 = str19;
            str8 = strAsInterface2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new LoanUserInput(i, str8, str2, str5, str6, str3, str4, str, str7, l, null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (LoanUserInput) obj);
        int i4 = onExtraCallbackWithResult + 67;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull LoanUserInput loanUserInput) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(loanUserInput, BuildConfig.FLAVOR);
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            LoanUserInput.IAuthTabCallback(loanUserInput, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(loanUserInput, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        LoanUserInput.IAuthTabCallback(loanUserInput, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 35;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
