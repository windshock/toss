package im.toss.features.credit.data.response;

import im.toss.features.credit.data.response.CreditLoanNeedsResponse;
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
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditLoanNeedsResponse$$serializer implements aeu2<CreditLoanNeedsResponse> {
    private static int IAuthTabCallback = 1;
    public static final CreditLoanNeedsResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 83;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 75;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        CreditLoanNeedsResponse$$serializer creditLoanNeedsResponse$$serializer = new CreditLoanNeedsResponse$$serializer();
        INSTANCE = creditLoanNeedsResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.CreditLoanNeedsResponse", creditLoanNeedsResponse$$serializer, 7);
        setanimationsloop.onWarmupCompleted("lowestInterestRates", true);
        setanimationsloop.onWarmupCompleted("loanApprovalRates", true);
        setanimationsloop.onWarmupCompleted("averageMaxLimit", true);
        setanimationsloop.onWarmupCompleted("isLoanNeedsUser", true);
        setanimationsloop.onWarmupCompleted("cta", true);
        setanimationsloop.onWarmupCompleted("estimatedLoanSummary", true);
        setanimationsloop.onWarmupCompleted("findLoanInfo", true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 25;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 46 / 0;
        }
    }

    private CreditLoanNeedsResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {dj3.onWarmupCompleted, sp.IAuthTabCallback(getDynamicHeight.onWarmupCompleted), sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent), getBgColor.IAuthTabCallback, sp.IAuthTabCallback(CreditLoanNeedsResponse$Cta$$serializer.INSTANCE), sp.IAuthTabCallback(CreditLoanNeedsResponse$EstimatedLoanSummary$$serializer.INSTANCE), sp.IAuthTabCallback(CreditLoanNeedsResponse$FindLoanInfo$$serializer.INSTANCE)};
        int i4 = onWarmupCompleted + 87;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CreditLoanNeedsResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        CreditLoanNeedsResponse.FindLoanInfo findLoanInfo;
        CreditLoanNeedsResponse.EstimatedLoanSummary estimatedLoanSummary;
        float f;
        boolean z;
        int i;
        Integer num;
        CreditLoanNeedsResponse.Cta cta;
        String str;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 99;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i5 = 6;
        int i6 = 5;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            float fOnWarmupCompleted = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 0);
            Integer num2 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getDynamicHeight.onWarmupCompleted, (Object) null);
            String str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, (Object) null);
            boolean zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3);
            CreditLoanNeedsResponse.Cta cta2 = (CreditLoanNeedsResponse.Cta) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, CreditLoanNeedsResponse$Cta$$serializer.INSTANCE, (Object) null);
            CreditLoanNeedsResponse.EstimatedLoanSummary estimatedLoanSummary2 = (CreditLoanNeedsResponse.EstimatedLoanSummary) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, CreditLoanNeedsResponse$EstimatedLoanSummary$$serializer.INSTANCE, (Object) null);
            i = 127;
            findLoanInfo = (CreditLoanNeedsResponse.FindLoanInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, CreditLoanNeedsResponse$FindLoanInfo$$serializer.INSTANCE, (Object) null);
            estimatedLoanSummary = estimatedLoanSummary2;
            z = zOnExtraCallbackWithResult;
            cta = cta2;
            num = num2;
            str = str2;
            f = fOnWarmupCompleted;
        } else {
            int i7 = onWarmupCompleted + 105;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            float f2 = 0.0f;
            boolean z2 = true;
            int i9 = 0;
            CreditLoanNeedsResponse.EstimatedLoanSummary estimatedLoanSummary3 = null;
            CreditLoanNeedsResponse.Cta cta3 = null;
            String str3 = null;
            Integer num3 = null;
            CreditLoanNeedsResponse.FindLoanInfo findLoanInfo2 = null;
            boolean zOnExtraCallbackWithResult2 = false;
            while (z2) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z2 = false;
                    case 0:
                        float fOnWarmupCompleted2 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 0);
                        i9 |= 1;
                        int i10 = onExtraCallback + 11;
                        onWarmupCompleted = i10 % 128;
                        int i11 = i10 % 2;
                        f2 = fOnWarmupCompleted2;
                        i5 = 6;
                        i6 = 5;
                    case 1:
                        num3 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getDynamicHeight.onWarmupCompleted, num3);
                        i9 |= 2;
                        i5 = 6;
                    case 2:
                        str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str3);
                        i9 |= 4;
                        i5 = 6;
                    case 3:
                        zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3);
                        i9 |= 8;
                        i5 = 6;
                    case 4:
                        cta3 = (CreditLoanNeedsResponse.Cta) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, CreditLoanNeedsResponse$Cta$$serializer.INSTANCE, cta3);
                        i9 |= 16;
                        i5 = 6;
                    case 5:
                        estimatedLoanSummary3 = (CreditLoanNeedsResponse.EstimatedLoanSummary) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i6, CreditLoanNeedsResponse$EstimatedLoanSummary$$serializer.INSTANCE, estimatedLoanSummary3);
                        i9 |= 32;
                        int i12 = onExtraCallback + 95;
                        onWarmupCompleted = i12 % 128;
                        int i13 = i12 % 2;
                        i5 = 6;
                    case 6:
                        findLoanInfo2 = (CreditLoanNeedsResponse.FindLoanInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, CreditLoanNeedsResponse$FindLoanInfo$$serializer.INSTANCE, findLoanInfo2);
                        i9 |= 64;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            findLoanInfo = findLoanInfo2;
            estimatedLoanSummary = estimatedLoanSummary3;
            f = f2;
            String str4 = str3;
            z = zOnExtraCallbackWithResult2;
            i = i9;
            num = num3;
            cta = cta3;
            str = str4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        CreditLoanNeedsResponse creditLoanNeedsResponse = new CreditLoanNeedsResponse(i, f, num, str, z, cta, estimatedLoanSummary, findLoanInfo, (okycx) null);
        int i14 = onWarmupCompleted + 89;
        onExtraCallback = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 98 / 0;
        }
        return creditLoanNeedsResponse;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m165deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        CreditLoanNeedsResponse creditLoanNeedsResponseDeserialize = deserialize(decoder);
        int i4 = onExtraCallback + 101;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return creditLoanNeedsResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CreditLoanNeedsResponse creditLoanNeedsResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(creditLoanNeedsResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            CreditLoanNeedsResponse.IAuthTabCallback(creditLoanNeedsResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(creditLoanNeedsResponse, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        CreditLoanNeedsResponse.IAuthTabCallback(creditLoanNeedsResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onExtraCallback + 51;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CreditLoanNeedsResponse) obj);
        if (i3 == 0) {
            int i4 = 47 / 0;
        }
        int i5 = onExtraCallback + 23;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 43;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
