package viva.republica.toss.network.model.loan;

import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import net.sf.scuba.smartcards.BuildConfig;
import o.aeu2;
import o.dj3;
import o.getBgColor;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.loan.ApplyAvailableDateTimeRange$;
import viva.republica.toss.network.model.loan.LoanAccountResponse$;
import viva.republica.toss.network.model.loan.LoanRefinancingPrimeRateInfo$;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class LoanRefinancingProductDetailResponse$$serializer implements aeu2<LoanRefinancingProductDetailResponse> {
    private static int IAuthTabCallback = 1;
    public static final LoanRefinancingProductDetailResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 121;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 32 / 0;
        }
        return serialDescriptor;
    }

    static {
        LoanRefinancingProductDetailResponse$$serializer loanRefinancingProductDetailResponse$$serializer = new LoanRefinancingProductDetailResponse$$serializer();
        INSTANCE = loanRefinancingProductDetailResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.loan.LoanRefinancingProductDetailResponse", loanRefinancingProductDetailResponse$$serializer, 20);
        setanimationsloop.onWarmupCompleted("accountInfo", true);
        setanimationsloop.onWarmupCompleted("loanProductId", true);
        setanimationsloop.onWarmupCompleted("loanReqNo", true);
        setanimationsloop.onWarmupCompleted("companyIconUrl", true);
        setanimationsloop.onWarmupCompleted("companyName", true);
        setanimationsloop.onWarmupCompleted("productName", true);
        setanimationsloop.onWarmupCompleted("limitAmount", true);
        setanimationsloop.onWarmupCompleted("commissionAmount", true);
        setanimationsloop.onWarmupCompleted("interestRate", true);
        setanimationsloop.onWarmupCompleted("period", true);
        setanimationsloop.onWarmupCompleted("status", true);
        setanimationsloop.onWarmupCompleted("landingUrl", true);
        setanimationsloop.onWarmupCompleted("disclaimers", true);
        setanimationsloop.onWarmupCompleted("deliberation", true);
        setanimationsloop.onWarmupCompleted("primeRateInfo", true);
        setanimationsloop.onWarmupCompleted("refinancingEventExposure", true);
        setanimationsloop.onWarmupCompleted("isMinusAccountAvailable", true);
        setanimationsloop.onWarmupCompleted("isFirstTierBank", true);
        setanimationsloop.onWarmupCompleted("isWebViewInToss", true);
        setanimationsloop.onWarmupCompleted("applyAvailableDateTimeRange", true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 7;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            int i2 = 73 / 0;
        }
    }

    private LoanRefinancingProductDetailResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnExtraCallbackWithResult = LoanRefinancingProductDetailResponse.onExtraCallbackWithResult();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        oty1 oty1Var = oty1.onExtraCallback;
        getBgColor getbgcolor = getBgColor.IAuthTabCallback;
        KSerializer<?>[] kSerializerArr = {LoanAccountResponse$.serializer.INSTANCE, getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout, oty1Var, oty1Var, dj3.onWarmupCompleted, oty1Var, getwrigglelayout, getwrigglelayout, lazyArrOnExtraCallbackWithResult[12].getValue(), getwrigglelayout, sp.IAuthTabCallback(LoanRefinancingPrimeRateInfo$.serializer.INSTANCE), getbgcolor, getbgcolor, getbgcolor, getbgcolor, sp.IAuthTabCallback(ApplyAvailableDateTimeRange$.serializer.INSTANCE)};
        int i4 = onExtraCallback + 1;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        LoanRefinancingProductDetailResponse loanRefinancingProductDetailResponseM65deserialize = m65deserialize(decoder);
        int i4 = IAuthTabCallback + 83;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 30 / 0;
        }
        return loanRefinancingProductDetailResponseM65deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final LoanRefinancingProductDetailResponse m65deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        boolean zOnExtraCallbackWithResult;
        boolean z;
        LoanRefinancingPrimeRateInfo loanRefinancingPrimeRateInfo;
        LoanAccountResponse loanAccountResponse;
        int i;
        boolean z2;
        String str;
        List list;
        boolean z3;
        String str2;
        String str3;
        float f;
        String str4;
        String str5;
        String str6;
        String str7;
        long j;
        String str8;
        long j2;
        ApplyAvailableDateTimeRange applyAvailableDateTimeRange;
        long j3;
        int i2;
        int i3;
        char c;
        char c2;
        char c3;
        char c4;
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 79;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallbackWithResult = LoanRefinancingProductDetailResponse.onExtraCallbackWithResult();
        int i7 = 9;
        int i8 = 8;
        int i9 = 0;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i10 = onExtraCallback + 75;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            LoanAccountResponse loanAccountResponse2 = (LoanAccountResponse) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, LoanAccountResponse$.serializer.INSTANCE, (Object) null);
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            String strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
            long jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 6);
            long jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 7);
            float fOnWarmupCompleted = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 8);
            long jIAuthTabCallbackDefault3 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 9);
            String strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 10);
            String strAsInterface7 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 11);
            loanAccountResponse = loanAccountResponse2;
            List list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 12, (jp) lazyArrOnExtraCallbackWithResult[12].getValue(), (Object) null);
            String strAsInterface8 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 13);
            LoanRefinancingPrimeRateInfo loanRefinancingPrimeRateInfo2 = (LoanRefinancingPrimeRateInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 14, LoanRefinancingPrimeRateInfo$.serializer.INSTANCE, (Object) null);
            boolean zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 15);
            boolean zOnExtraCallbackWithResult3 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 16);
            boolean zOnExtraCallbackWithResult4 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 17);
            boolean zOnExtraCallbackWithResult5 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 18);
            i = 1048575;
            applyAvailableDateTimeRange = (ApplyAvailableDateTimeRange) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 19, ApplyAvailableDateTimeRange$.serializer.INSTANCE, (Object) null);
            str5 = strAsInterface;
            str6 = strAsInterface5;
            z = zOnExtraCallbackWithResult5;
            zOnExtraCallbackWithResult = zOnExtraCallbackWithResult2;
            list = list2;
            loanRefinancingPrimeRateInfo = loanRefinancingPrimeRateInfo2;
            str7 = strAsInterface7;
            j3 = jIAuthTabCallbackDefault;
            j = jIAuthTabCallbackDefault3;
            j2 = jIAuthTabCallbackDefault2;
            str3 = strAsInterface4;
            str = strAsInterface2;
            z3 = zOnExtraCallbackWithResult3;
            str2 = strAsInterface8;
            z2 = zOnExtraCallbackWithResult4;
            str8 = strAsInterface6;
            f = fOnWarmupCompleted;
            str4 = strAsInterface3;
        } else {
            float fOnWarmupCompleted2 = 0.0f;
            boolean zOnExtraCallbackWithResult6 = false;
            zOnExtraCallbackWithResult = false;
            boolean zOnExtraCallbackWithResult7 = false;
            boolean z4 = true;
            long jIAuthTabCallbackDefault4 = 0;
            long jIAuthTabCallbackDefault5 = 0;
            long jIAuthTabCallbackDefault6 = 0;
            LoanRefinancingPrimeRateInfo loanRefinancingPrimeRateInfo3 = null;
            ApplyAvailableDateTimeRange applyAvailableDateTimeRange2 = null;
            String strAsInterface9 = null;
            List list3 = null;
            String strAsInterface10 = null;
            LoanAccountResponse loanAccountResponse3 = null;
            String strAsInterface11 = null;
            String strAsInterface12 = null;
            String strAsInterface13 = null;
            String strAsInterface14 = null;
            String strAsInterface15 = null;
            String strAsInterface16 = null;
            boolean zOnExtraCallbackWithResult8 = false;
            while (z4) {
                int i12 = onExtraCallback + 3;
                IAuthTabCallback = i12 % 128;
                if (i12 % 2 == 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        int i13 = IAuthTabCallback + 125;
                        onExtraCallback = i13 % 128;
                        int i14 = i13 % 2;
                        loanAccountResponse3 = loanAccountResponse3;
                        i8 = 8;
                        i7 = 9;
                        z4 = false;
                    case 0:
                        loanAccountResponse3 = (LoanAccountResponse) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, LoanAccountResponse$.serializer.INSTANCE, loanAccountResponse3);
                        i9 |= 1;
                        i8 = 8;
                        i7 = 9;
                    case 1:
                        c = 6;
                        strAsInterface13 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i9 |= 2;
                        i8 = 8;
                        i7 = 9;
                    case 2:
                        c2 = 3;
                        c3 = 6;
                        strAsInterface9 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i9 |= 4;
                        i8 = 8;
                        i7 = 9;
                    case 3:
                        c2 = 3;
                        c3 = 6;
                        strAsInterface12 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                        i9 |= 8;
                        i8 = 8;
                        i7 = 9;
                    case 4:
                        c = 6;
                        strAsInterface11 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                        i9 |= 16;
                        i8 = 8;
                        i7 = 9;
                    case 5:
                        c4 = 6;
                        strAsInterface14 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
                        i9 |= 32;
                        i7 = 9;
                    case 6:
                        c4 = 6;
                        jIAuthTabCallbackDefault5 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 6);
                        i9 |= 64;
                        i7 = 9;
                    case 7:
                        jIAuthTabCallbackDefault6 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 7);
                        i9 |= 128;
                        i7 = 9;
                    case 8:
                        fOnWarmupCompleted2 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, i8);
                        i9 |= 256;
                        i7 = 9;
                    case 9:
                        jIAuthTabCallbackDefault4 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, i7);
                        i9 |= 512;
                        int i15 = IAuthTabCallback + 57;
                        onExtraCallback = i15 % 128;
                        int i16 = i15 % 2;
                        i7 = 9;
                    case 10:
                        strAsInterface16 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 10);
                        i9 |= 1024;
                    case 11:
                        strAsInterface15 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 11);
                        i9 |= 2048;
                    case 12:
                        list3 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 12, (jp) lazyArrOnExtraCallbackWithResult[12].getValue(), list3);
                        i9 |= PKIFailureInfo.certConfirmed;
                    case 13:
                        strAsInterface10 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 13);
                        i9 |= PKIFailureInfo.certRevoked;
                    case 14:
                        loanRefinancingPrimeRateInfo3 = (LoanRefinancingPrimeRateInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 14, LoanRefinancingPrimeRateInfo$.serializer.INSTANCE, loanRefinancingPrimeRateInfo3);
                        i9 |= 16384;
                    case 15:
                        zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 15);
                        i2 = 32768;
                        i9 |= i2;
                    case 16:
                        zOnExtraCallbackWithResult7 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 16);
                        i2 = PKIFailureInfo.notAuthorized;
                        i9 |= i2;
                    case 17:
                        zOnExtraCallbackWithResult8 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 17);
                        i2 = PKIFailureInfo.unsupportedVersion;
                        i9 |= i2;
                    case 18:
                        zOnExtraCallbackWithResult6 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 18);
                        i3 = PKIFailureInfo.transactionIdInUse;
                        i9 |= i3;
                    case 19:
                        applyAvailableDateTimeRange2 = (ApplyAvailableDateTimeRange) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 19, ApplyAvailableDateTimeRange$.serializer.INSTANCE, applyAvailableDateTimeRange2);
                        i3 = PKIFailureInfo.signerNotTrusted;
                        i9 |= i3;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            z = zOnExtraCallbackWithResult6;
            loanRefinancingPrimeRateInfo = loanRefinancingPrimeRateInfo3;
            loanAccountResponse = loanAccountResponse3;
            i = i9;
            z2 = zOnExtraCallbackWithResult8;
            str = strAsInterface9;
            list = list3;
            z3 = zOnExtraCallbackWithResult7;
            str2 = strAsInterface10;
            str3 = strAsInterface11;
            f = fOnWarmupCompleted2;
            str4 = strAsInterface12;
            str5 = strAsInterface13;
            str6 = strAsInterface14;
            str7 = strAsInterface15;
            j = jIAuthTabCallbackDefault4;
            str8 = strAsInterface16;
            j2 = jIAuthTabCallbackDefault6;
            applyAvailableDateTimeRange = applyAvailableDateTimeRange2;
            j3 = jIAuthTabCallbackDefault5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new LoanRefinancingProductDetailResponse(i, loanAccountResponse, str5, str, str4, str3, str6, j3, j2, f, j, str8, str7, list, str2, loanRefinancingPrimeRateInfo, zOnExtraCallbackWithResult, z3, z2, z, applyAvailableDateTimeRange, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (LoanRefinancingProductDetailResponse) obj);
        int i4 = IAuthTabCallback + 71;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull LoanRefinancingProductDetailResponse loanRefinancingProductDetailResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(loanRefinancingProductDetailResponse, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        LoanRefinancingProductDetailResponse.IAuthTabCallback(loanRefinancingProductDetailResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 35;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 73;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
