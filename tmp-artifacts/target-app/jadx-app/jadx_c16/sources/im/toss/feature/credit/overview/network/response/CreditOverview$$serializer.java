package im.toss.feature.credit.overview.network.response;

import im.toss.feature.credit.overview.network.response.CardUsageStatus$;
import im.toss.feature.credit.overview.network.response.Difference$;
import im.toss.feature.credit.overview.network.response.GuaranteeStatus$;
import im.toss.feature.credit.overview.network.response.LoanStatus$;
import im.toss.feature.credit.overview.network.response.OverdueStatus$;
import im.toss.feature.credit.overview.network.response.SubstitutePaymentStatus$;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.dj3;
import o.getBgColor;
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.setApTextSize;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditOverview$$serializer implements aeu2<CreditOverview> {
    public static final CreditOverview$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 121;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        CreditOverview$$serializer creditOverview$$serializer = new CreditOverview$$serializer();
        INSTANCE = creditOverview$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.feature.credit.overview.network.response.CreditOverview", creditOverview$$serializer, 13);
        setanimationsloop.onWarmupCompleted("id", true);
        setanimationsloop.onWarmupCompleted("grade", true);
        setanimationsloop.onWarmupCompleted("score", true);
        setanimationsloop.onWarmupCompleted("topPercent", true);
        setanimationsloop.onWarmupCompleted("creditCardUsageStatus", true);
        setanimationsloop.onWarmupCompleted("checkCardUsageStatus", true);
        setanimationsloop.onWarmupCompleted("substitutePaymentStatus", true);
        setanimationsloop.onWarmupCompleted("loanStatus", true);
        setanimationsloop.onWarmupCompleted("overdueStatus", true);
        setanimationsloop.onWarmupCompleted("guaranteeStatus", true);
        setanimationsloop.onWarmupCompleted("referenceDate", true);
        setanimationsloop.onWarmupCompleted("diff", true);
        setanimationsloop.onWarmupCompleted("suggestRefresh", true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 71;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private CreditOverview$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getDynamicHeight getdynamicheight = getDynamicHeight.onWarmupCompleted;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(getdynamicheight);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(getdynamicheight);
        KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(dj3.onWarmupCompleted);
        CardUsageStatus$.serializer serializerVar = CardUsageStatus$.serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {oty1.onExtraCallback, kSerializerIAuthTabCallback, kSerializerIAuthTabCallback2, kSerializerIAuthTabCallback3, sp.IAuthTabCallback(serializerVar), sp.IAuthTabCallback(serializerVar), sp.IAuthTabCallback(SubstitutePaymentStatus$.serializer.INSTANCE), sp.IAuthTabCallback(LoanStatus$.serializer.INSTANCE), sp.IAuthTabCallback(OverdueStatus$.serializer.INSTANCE), sp.IAuthTabCallback(GuaranteeStatus$.serializer.INSTANCE), sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent), sp.IAuthTabCallback(Difference$.serializer.INSTANCE), sp.IAuthTabCallback(getBgColor.IAuthTabCallback)};
        int i4 = onExtraCallback + 95;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CreditOverview deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        String str;
        CardUsageStatus cardUsageStatus;
        Difference difference;
        OverdueStatus overdueStatus;
        LoanStatus loanStatus;
        Boolean bool;
        GuaranteeStatus guaranteeStatus;
        CardUsageStatus cardUsageStatus2;
        Float f;
        Integer num;
        SubstitutePaymentStatus substitutePaymentStatus;
        Integer num2;
        long j;
        CardUsageStatus cardUsageStatus3;
        CardUsageStatus cardUsageStatus4;
        SubstitutePaymentStatus substitutePaymentStatus2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i3 = 10;
        int i4 = 9;
        char c = '\b';
        String str2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i5 = onNavigationEvent + 35;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            long jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
            getDynamicHeight getdynamicheight = getDynamicHeight.onWarmupCompleted;
            Integer num3 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getdynamicheight, (Object) null);
            Integer num4 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getdynamicheight, (Object) null);
            Float f2 = (Float) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, dj3.onWarmupCompleted, (Object) null);
            CardUsageStatus$.serializer serializerVar = CardUsageStatus$.serializer.INSTANCE;
            CardUsageStatus cardUsageStatus5 = (CardUsageStatus) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, serializerVar, (Object) null);
            CardUsageStatus cardUsageStatus6 = (CardUsageStatus) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, serializerVar, (Object) null);
            SubstitutePaymentStatus substitutePaymentStatus3 = (SubstitutePaymentStatus) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, SubstitutePaymentStatus$.serializer.INSTANCE, (Object) null);
            LoanStatus loanStatus2 = (LoanStatus) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, LoanStatus$.serializer.INSTANCE, (Object) null);
            OverdueStatus overdueStatus2 = (OverdueStatus) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, OverdueStatus$.serializer.INSTANCE, (Object) null);
            GuaranteeStatus guaranteeStatus2 = (GuaranteeStatus) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, GuaranteeStatus$.serializer.INSTANCE, (Object) null);
            String str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 10, getWriggleLayout.onNavigationEvent, (Object) null);
            Difference difference2 = (Difference) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 11, Difference$.serializer.INSTANCE, (Object) null);
            Boolean bool2 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 12, getBgColor.IAuthTabCallback, (Object) null);
            int i7 = onNavigationEvent + 75;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            bool = bool2;
            str = str3;
            guaranteeStatus = guaranteeStatus2;
            loanStatus = loanStatus2;
            f = f2;
            overdueStatus = overdueStatus2;
            cardUsageStatus2 = cardUsageStatus5;
            difference = difference2;
            j = jIAuthTabCallbackDefault;
            num = num4;
            num2 = num3;
            substitutePaymentStatus = substitutePaymentStatus3;
            cardUsageStatus = cardUsageStatus6;
            i = 8191;
        } else {
            CardUsageStatus cardUsageStatus7 = null;
            Float f3 = null;
            Integer num5 = null;
            Difference difference3 = null;
            OverdueStatus overdueStatus3 = null;
            LoanStatus loanStatus3 = null;
            CardUsageStatus cardUsageStatus8 = null;
            Integer num6 = null;
            SubstitutePaymentStatus substitutePaymentStatus4 = null;
            i = 0;
            boolean z = true;
            long jIAuthTabCallbackDefault2 = 0;
            Boolean bool3 = null;
            GuaranteeStatus guaranteeStatus3 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        cardUsageStatus3 = cardUsageStatus7;
                        z = false;
                        cardUsageStatus7 = cardUsageStatus3;
                        i3 = 10;
                        i4 = 9;
                        c = '\b';
                    case 0:
                        cardUsageStatus3 = cardUsageStatus7;
                        jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
                        i |= 1;
                        cardUsageStatus7 = cardUsageStatus3;
                        i3 = 10;
                        i4 = 9;
                        c = '\b';
                    case 1:
                        cardUsageStatus3 = cardUsageStatus7;
                        num6 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getDynamicHeight.onWarmupCompleted, num6);
                        i |= 2;
                        cardUsageStatus7 = cardUsageStatus3;
                        i3 = 10;
                        i4 = 9;
                        c = '\b';
                    case 2:
                        num5 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getDynamicHeight.onWarmupCompleted, num5);
                        i |= 4;
                        i3 = 10;
                        i4 = 9;
                        c = '\b';
                    case 3:
                        f3 = (Float) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, dj3.onWarmupCompleted, f3);
                        i |= 8;
                        i3 = 10;
                        i4 = 9;
                        c = '\b';
                    case 4:
                        cardUsageStatus4 = cardUsageStatus8;
                        substitutePaymentStatus2 = substitutePaymentStatus4;
                        cardUsageStatus7 = (CardUsageStatus) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, CardUsageStatus$.serializer.INSTANCE, cardUsageStatus7);
                        i |= 16;
                        substitutePaymentStatus4 = substitutePaymentStatus2;
                        cardUsageStatus8 = cardUsageStatus4;
                        i3 = 10;
                        i4 = 9;
                        c = '\b';
                    case 5:
                        substitutePaymentStatus2 = substitutePaymentStatus4;
                        cardUsageStatus4 = (CardUsageStatus) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, CardUsageStatus$.serializer.INSTANCE, cardUsageStatus8);
                        i |= 32;
                        substitutePaymentStatus4 = substitutePaymentStatus2;
                        cardUsageStatus8 = cardUsageStatus4;
                        i3 = 10;
                        i4 = 9;
                        c = '\b';
                    case 6:
                        i |= 64;
                        substitutePaymentStatus4 = (SubstitutePaymentStatus) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, SubstitutePaymentStatus$.serializer.INSTANCE, substitutePaymentStatus4);
                        i3 = 10;
                        i4 = 9;
                        c = '\b';
                    case 7:
                        loanStatus3 = (LoanStatus) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, LoanStatus$.serializer.INSTANCE, loanStatus3);
                        i |= 128;
                        i3 = 10;
                        c = '\b';
                    case 8:
                        overdueStatus3 = (OverdueStatus) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, OverdueStatus$.serializer.INSTANCE, overdueStatus3);
                        i |= 256;
                        c = '\b';
                        i3 = 10;
                    case 9:
                        guaranteeStatus3 = (GuaranteeStatus) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4, GuaranteeStatus$.serializer.INSTANCE, guaranteeStatus3);
                        i |= 512;
                        c = '\b';
                    case 10:
                        str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, getWriggleLayout.onNavigationEvent, str2);
                        i |= 1024;
                        c = '\b';
                    case 11:
                        difference3 = (Difference) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 11, Difference$.serializer.INSTANCE, difference3);
                        i |= 2048;
                        c = '\b';
                    case 12:
                        bool3 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 12, getBgColor.IAuthTabCallback, bool3);
                        i |= 4096;
                        c = '\b';
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            CardUsageStatus cardUsageStatus9 = cardUsageStatus8;
            Integer num7 = num6;
            str = str2;
            cardUsageStatus = cardUsageStatus9;
            difference = difference3;
            overdueStatus = overdueStatus3;
            loanStatus = loanStatus3;
            bool = bool3;
            guaranteeStatus = guaranteeStatus3;
            cardUsageStatus2 = cardUsageStatus7;
            f = f3;
            num = num5;
            substitutePaymentStatus = substitutePaymentStatus4;
            num2 = num7;
            j = jIAuthTabCallbackDefault2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CreditOverview(i, j, num2, num, f, cardUsageStatus2, cardUsageStatus, substitutePaymentStatus, loanStatus, overdueStatus, guaranteeStatus, str, difference, bool, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m64deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        CreditOverview creditOverviewDeserialize = deserialize(decoder);
        int i4 = onNavigationEvent + 41;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return creditOverviewDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CreditOverview creditOverview) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(creditOverview, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        CreditOverview.onExtraCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, new Object[]{creditOverview, vylVarOnExtraCallback, serialDescriptor}, 1735998913, -1735998912, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent());
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 121;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CreditOverview) obj);
        int i4 = onNavigationEvent + 1;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
            int i3 = 92 / 0;
        } else {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        }
        int i4 = onNavigationEvent + 43;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}
