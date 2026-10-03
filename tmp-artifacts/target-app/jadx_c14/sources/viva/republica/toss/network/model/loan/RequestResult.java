package viva.republica.toss.network.model.loan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import im.toss.features.payment.ui.offline.compose.screen.TossPlaceTableOrderScreenKt$;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.OkHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0;
import o.ProducerSequenceFactoryExternalSyntheticLambda17;
import o.access15300;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RequestResult implements Parcelable {
    public static final Parcelable.Creator<RequestResult> CREATOR = new Creator();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    @SerializedName("additionalInformationBox")
    private final OkHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0 additionalInformationBox;

    @SerializedName("amount")
    private final long amount;

    @SerializedName("badges")
    private final List<NeoLoanProductBadge> badges;

    @SerializedName("companyName")
    private final String companyName;

    @SerializedName("detailLandingType")
    private final String detailLandingType;

    @SerializedName("filters")
    private final List<String> filters;

    @SerializedName("guaranteeOrg")
    private final String guaranteeOrg;

    @SerializedName("inAppApplication")
    private final boolean inAppApplication;

    @SerializedName("interestRate")
    private final float interestRate;

    @SerializedName("interestRateAnimationEnabled")
    private final boolean interestRateAnimationEnabled;

    @SerializedName("interestRateInformationBox")
    private final SupplementaryInformation interestRateInformationBox;

    @SerializedName("isMortgage")
    private final boolean isMortgage;

    @SerializedName("loanAppliedTs")
    private final String loanAppliedTs;
    private final ProductType logProductType;

    @SerializedName("logoFillImageUrl")
    private final String logoFillImageUrl;

    @SerializedName("logoImageUrl")
    private final String logoImageUrl;

    @SerializedName("mortgageScheme")
    private final String mortgageScheme;

    @SerializedName("period")
    private final int period;
    private int position;

    @SerializedName("primeRateInformation")
    private final ProducerSequenceFactoryExternalSyntheticLambda17 primeRateInformation;

    @SerializedName("product")
    private final LoanComparisonPreScreeningProduct product;

    @SerializedName("productBadge")
    private final LoanProductBadge productBadge;

    @SerializedName("productName")
    private final String productName;

    @SerializedName("requestInformation")
    private final String requestInformation;

    @SerializedName("sortInterestRate")
    private final Float sortInterestRate;

    @SerializedName("status")
    private final LoanProductStatus status;

    @SerializedName("statusMessage")
    private final String statusMessage;

    @SerializedName("supplementaryInformationBox")
    private final SupplementaryInformation supplementaryInformation;

    public static final class Creator implements Parcelable.Creator<RequestResult> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RequestResult createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 121;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            RequestResult requestResultOnNavigationEvent = onNavigationEvent(parcel);
            int i4 = onNavigationEvent + 109;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return requestResultOnNavigationEvent;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RequestResult[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 113;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            RequestResult[] requestResultArrOnNavigationEvent = onNavigationEvent(i);
            int i5 = onExtraCallback + 87;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return requestResultArrOnNavigationEvent;
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x0104  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final viva.republica.toss.network.model.loan.RequestResult onNavigationEvent(android.os.Parcel r36) {
            /*
                Method dump skipped, instructions count: 375
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.RequestResult.Creator.onNavigationEvent(android.os.Parcel):viva.republica.toss.network.model.loan.RequestResult");
        }

        public final RequestResult[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 51;
            int i4 = i3 % 128;
            onExtraCallback = i4;
            int i5 = i3 % 2;
            RequestResult[] requestResultArr = new RequestResult[i];
            int i6 = i4 + 99;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 86 / 0;
            }
            return requestResultArr;
        }
    }

    static {
        int i = IAuthTabCallback + 91;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public RequestResult() {
        this(0L, null, null, 0.0f, null, null, null, 0, null, null, null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, false, null, 134217727, null);
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i5;
        int i9 = ~(i7 | i8);
        int i10 = ~i6;
        int i11 = i9 | (~(i8 | i10));
        int i12 = ~(i6 | i | i5);
        int i13 = i11 | i12;
        int i14 = i10 | i;
        int i15 = i + i5 + i4 + (112060874 * i2) + ((-1891258303) * i3);
        int i16 = i15 * i15;
        int i17 = (i * 1286644997) + 1783103488 + (1286644997 * i5) + (i13 * (-1821943044)) + ((-651081208) * i12) + ((-1821943044) * i14) + ((-535298048) * i4) + ((-1427111936) * i2) + (1712848896 * i3) + (159514624 * i16);
        int i18 = ((i * (-1669307009)) - 1771304782) + (i5 * (-1669307009)) + (i13 * 564) + (i12 * (-1128)) + (i14 * 564) + (i4 * (-1669306445)) + (i2 * (-1582645698)) + (i3 * (-198941581)) + (i16 * (-203030528));
        int i19 = i17 + (i18 * i18 * (-2008154112));
        if (i19 == 1) {
            return onNavigationEvent(objArr);
        }
        if (i19 != 2) {
            return i19 != 3 ? i19 != 4 ? onExtraCallback(objArr) : onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr);
        }
        RequestResult requestResult = (RequestResult) objArr[0];
        int i20 = 2 % 2;
        int i21 = onWarmupCompleted;
        int i22 = i21 + 23;
        onExtraCallback = i22 % 128;
        int i23 = i22 % 2;
        List<NeoLoanProductBadge> list = requestResult.badges;
        int i24 = i21 + 29;
        onExtraCallback = i24 % 128;
        int i25 = i24 % 2;
        return list;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        float f;
        int i;
        String str;
        String str2;
        String str3;
        List<NeoLoanProductBadge> list;
        List<NeoLoanProductBadge> list2;
        boolean z;
        RequestResult requestResult = (RequestResult) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        String str4 = (String) objArr[2];
        String str5 = (String) objArr[3];
        float fFloatValue = ((Number) objArr[4]).floatValue();
        Float f2 = (Float) objArr[5];
        String str6 = (String) objArr[6];
        String str7 = (String) objArr[7];
        int iIntValue = ((Number) objArr[8]).intValue();
        LoanComparisonPreScreeningProduct loanComparisonPreScreeningProduct = (LoanComparisonPreScreeningProduct) objArr[9];
        LoanProductBadge loanProductBadge = (LoanProductBadge) objArr[10];
        String str8 = (String) objArr[11];
        String str9 = (String) objArr[12];
        LoanProductStatus loanProductStatus = (LoanProductStatus) objArr[13];
        String str10 = (String) objArr[14];
        boolean zBooleanValue = ((Boolean) objArr[15]).booleanValue();
        ProductType productType = (ProductType) objArr[16];
        ProducerSequenceFactoryExternalSyntheticLambda17 producerSequenceFactoryExternalSyntheticLambda17 = (ProducerSequenceFactoryExternalSyntheticLambda17) objArr[17];
        OkHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0 okHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0 = (OkHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0) objArr[18];
        List<NeoLoanProductBadge> list3 = (List) objArr[19];
        boolean zBooleanValue2 = ((Boolean) objArr[20]).booleanValue();
        String str11 = (String) objArr[21];
        List<String> list4 = (List) objArr[22];
        String str12 = (String) objArr[23];
        String str13 = (String) objArr[24];
        SupplementaryInformation supplementaryInformation = (SupplementaryInformation) objArr[25];
        boolean zBooleanValue3 = ((Boolean) objArr[26]).booleanValue();
        SupplementaryInformation supplementaryInformation2 = (SupplementaryInformation) objArr[27];
        int iIntValue2 = ((Number) objArr[28]).intValue();
        Object obj = objArr[29];
        int i2 = 2 % 2;
        if ((iIntValue2 & 1) != 0) {
            jLongValue = requestResult.amount;
        }
        if ((iIntValue2 & 2) != 0) {
            str4 = requestResult.companyName;
        }
        if ((iIntValue2 & 4) != 0) {
            int i3 = onWarmupCompleted + 29;
            f = fFloatValue;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            str5 = requestResult.guaranteeOrg;
        } else {
            f = fFloatValue;
        }
        float f3 = (iIntValue2 & 8) != 0 ? requestResult.interestRate : f;
        if ((iIntValue2 & 16) != 0) {
            f2 = requestResult.sortInterestRate;
        }
        if ((iIntValue2 & 32) != 0) {
            str6 = requestResult.logoImageUrl;
        }
        if ((iIntValue2 & 64) != 0) {
            int i5 = onWarmupCompleted + 13;
            i = iIntValue;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            str7 = requestResult.logoFillImageUrl;
        } else {
            i = iIntValue;
        }
        int i7 = (iIntValue2 & 128) != 0 ? requestResult.period : i;
        if ((iIntValue2 & 256) != 0) {
            loanComparisonPreScreeningProduct = requestResult.product;
        }
        if ((iIntValue2 & 512) != 0) {
            loanProductBadge = requestResult.productBadge;
        }
        if ((iIntValue2 & 1024) != 0) {
            int i8 = onWarmupCompleted + 39;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            str8 = requestResult.productName;
        }
        if ((iIntValue2 & 2048) != 0) {
            str9 = requestResult.requestInformation;
        }
        if ((iIntValue2 & 4096) != 0) {
            loanProductStatus = requestResult.status;
        }
        if ((iIntValue2 & 8192) != 0) {
            int i10 = onExtraCallback + 47;
            str = str9;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            str2 = requestResult.statusMessage;
        } else {
            str = str9;
            str2 = str10;
        }
        boolean z2 = (iIntValue2 & 16384) != 0 ? requestResult.inAppApplication : zBooleanValue;
        ProductType productType2 = (32768 & iIntValue2) != 0 ? requestResult.logProductType : productType;
        ProducerSequenceFactoryExternalSyntheticLambda17 producerSequenceFactoryExternalSyntheticLambda172 = (65536 & iIntValue2) != 0 ? requestResult.primeRateInformation : producerSequenceFactoryExternalSyntheticLambda17;
        OkHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0 okHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda02 = (131072 & iIntValue2) != 0 ? requestResult.additionalInformationBox : okHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0;
        if ((262144 & iIntValue2) != 0) {
            int i12 = onWarmupCompleted + 59;
            str3 = str2;
            onExtraCallback = i12 % 128;
            int i13 = i12 % 2;
            list = requestResult.badges;
            if (i13 != 0) {
                int i14 = 47 / 0;
            }
        } else {
            str3 = str2;
            list = list3;
        }
        if ((524288 & iIntValue2) != 0) {
            int i15 = onWarmupCompleted + 55;
            list2 = list;
            onExtraCallback = i15 % 128;
            int i16 = i15 % 2;
            z = requestResult.isMortgage;
        } else {
            list2 = list;
            z = zBooleanValue2;
        }
        return requestResult.onExtraCallback(jLongValue, str4, str5, f3, f2, str6, str7, i7, loanComparisonPreScreeningProduct, loanProductBadge, str8, str, loanProductStatus, str3, z2, productType2, producerSequenceFactoryExternalSyntheticLambda172, okHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda02, list2, z, (1048576 & iIntValue2) != 0 ? requestResult.mortgageScheme : str11, (2097152 & iIntValue2) != 0 ? requestResult.filters : list4, (4194304 & iIntValue2) != 0 ? requestResult.detailLandingType : str12, (8388608 & iIntValue2) != 0 ? requestResult.loanAppliedTs : str13, (16777216 & iIntValue2) != 0 ? requestResult.supplementaryInformation : supplementaryInformation, (33554432 & iIntValue2) != 0 ? requestResult.interestRateAnimationEnabled : zBooleanValue3, (iIntValue2 & 67108864) != 0 ? requestResult.interestRateInformationBox : supplementaryInformation2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x015f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.loanAppliedTs, r9.loanAppliedTs) != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0161, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x016a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.supplementaryInformation, r9.supplementaryInformation) != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x016c, code lost:
    
        r9 = viva.republica.toss.network.model.loan.RequestResult.onExtraCallback + 121;
        viva.republica.toss.network.model.loan.RequestResult.onWarmupCompleted = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0175, code lost:
    
        if ((r9 % 2) != 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0177, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0178, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x017d, code lost:
    
        if (r8.interestRateAnimationEnabled == r9.interestRateAnimationEnabled) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r9 instanceof viva.republica.toss.network.model.loan.RequestResult) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x017f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0188, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.interestRateInformationBox, r9.interestRateInformationBox) != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x018a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x018b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x018c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r9 = (viva.republica.toss.network.model.loan.RequestResult) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if (r8.amount == r9.amount) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.companyName, r9.companyName) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.guaranteeOrg, r9.guaranteeOrg) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        if (java.lang.Float.compare(r8.interestRate, r9.interestRate) == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.sortInterestRate, r9.sortInterestRate) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        r9 = viva.republica.toss.network.model.loan.RequestResult.onWarmupCompleted + 11;
        viva.republica.toss.network.model.loan.RequestResult.onExtraCallback = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if ((r9 % 2) != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0061, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.logoImageUrl, r9.logoImageUrl) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0075, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.logoFillImageUrl, r9.logoFillImageUrl) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0077, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007c, code lost:
    
        if (r8.period == r9.period) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0088, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r8.product, r9.product)) == true) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0092, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.productBadge, r9.productBadge) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0094, code lost:
    
        r9 = viva.republica.toss.network.model.loan.RequestResult.onWarmupCompleted + 35;
        viva.republica.toss.network.model.loan.RequestResult.onExtraCallback = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009d, code lost:
    
        if ((r9 % 2) == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a0, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a9, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.productName, r9.productName) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ab, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b4, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.requestInformation, r9.requestInformation) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b6, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00bb, code lost:
    
        if (r8.status == r9.status) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00bd, code lost:
    
        r9 = viva.republica.toss.network.model.loan.RequestResult.onExtraCallback + 95;
        viva.republica.toss.network.model.loan.RequestResult.onWarmupCompleted = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c6, code lost:
    
        if ((r9 % 2) != 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c8, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c9, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r8 == r9) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d2, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.statusMessage, r9.statusMessage) != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d4, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d9, code lost:
    
        if (r8.inAppApplication == r9.inAppApplication) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00db, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e0, code lost:
    
        if (r8.logProductType == r9.logProductType) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e2, code lost:
    
        r9 = viva.republica.toss.network.model.loan.RequestResult.onExtraCallback + 29;
        viva.republica.toss.network.model.loan.RequestResult.onWarmupCompleted = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00eb, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00f4, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.primeRateInformation, r9.primeRateInformation) != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f6, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ff, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.additionalInformationBox, r9.additionalInformationBox) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0101, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x010a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.badges, r9.badges) != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x010c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r8 == r9) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0111, code lost:
    
        if (r8.isMortgage == r9.isMortgage) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0113, code lost:
    
        r9 = viva.republica.toss.network.model.loan.RequestResult.onExtraCallback + 119;
        viva.republica.toss.network.model.loan.RequestResult.onWarmupCompleted = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x011c, code lost:
    
        if ((r9 % 2) != 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x011e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x011f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0128, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.mortgageScheme, r9.mortgageScheme) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x012a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0133, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.filters, r9.filters) != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0135, code lost:
    
        r9 = viva.republica.toss.network.model.loan.RequestResult.onWarmupCompleted + 93;
        viva.republica.toss.network.model.loan.RequestResult.onExtraCallback = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x013e, code lost:
    
        if ((r9 % 2) == 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0142, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x014b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.detailLandingType, r9.detailLandingType) != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x014d, code lost:
    
        r9 = viva.republica.toss.network.model.loan.RequestResult.onWarmupCompleted + 29;
        viva.republica.toss.network.model.loan.RequestResult.onExtraCallback = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0156, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.RequestResult.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b A[PHI: r2 r4 r5 r6 r7 r8
      0x004b: PHI (r2v59 int) = (r2v4 int), (r2v60 int) binds: [B:8:0x0047, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]
      0x004b: PHI (r4v5 int) = (r4v2 int), (r4v7 int) binds: [B:8:0x0047, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]
      0x004b: PHI (r5v4 int) = (r5v1 int), (r5v6 int) binds: [B:8:0x0047, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]
      0x004b: PHI (r6v4 int) = (r6v1 int), (r6v6 int) binds: [B:8:0x0047, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]
      0x004b: PHI (r7v3 java.lang.Float) = (r7v0 java.lang.Float), (r7v5 java.lang.Float) binds: [B:8:0x0047, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]
      0x004b: PHI (r8v34 int) = (r8v0 int), (r8v35 int) binds: [B:8:0x0047, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0049 A[PHI: r2 r4 r5 r6 r8
      0x0049: PHI (r2v5 int) = (r2v4 int), (r2v60 int) binds: [B:8:0x0047, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]
      0x0049: PHI (r4v3 int) = (r4v2 int), (r4v7 int) binds: [B:8:0x0047, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]
      0x0049: PHI (r5v2 int) = (r5v1 int), (r5v6 int) binds: [B:8:0x0047, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]
      0x0049: PHI (r6v2 int) = (r6v1 int), (r6v6 int) binds: [B:8:0x0047, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]
      0x0049: PHI (r8v1 int) = (r8v0 int), (r8v35 int) binds: [B:8:0x0047, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.RequestResult.hashCode():int");
    }

    public final RequestResult onExtraCallback(long j, @NotNull String str, @NotNull String str2, float f, @Nullable Float f2, @NotNull String str3, @NotNull String str4, int i, @NotNull LoanComparisonPreScreeningProduct loanComparisonPreScreeningProduct, @Nullable LoanProductBadge loanProductBadge, @NotNull String str5, @NotNull String str6, @NotNull LoanProductStatus loanProductStatus, @NotNull String str7, boolean z, @Nullable ProductType productType, @Nullable ProducerSequenceFactoryExternalSyntheticLambda17 producerSequenceFactoryExternalSyntheticLambda17, @Nullable OkHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0 okHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0, @NotNull List<NeoLoanProductBadge> list, boolean z2, @Nullable String str8, @NotNull List<String> list2, @Nullable String str9, @Nullable String str10, @Nullable SupplementaryInformation supplementaryInformation, boolean z3, @Nullable SupplementaryInformation supplementaryInformation2) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(loanComparisonPreScreeningProduct, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(loanProductStatus, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        RequestResult requestResult = new RequestResult(j, str, str2, f, f2, str3, str4, i, loanComparisonPreScreeningProduct, loanProductBadge, str5, str6, loanProductStatus, str7, z, productType, producerSequenceFactoryExternalSyntheticLambda17, okHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0, list, z2, str8, list2, str9, str10, supplementaryInformation, z3, supplementaryInformation2);
        int i3 = onExtraCallback + 37;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return requestResult;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RequestResult(amount=" + this.amount + ", companyName=" + this.companyName + ", guaranteeOrg=" + this.guaranteeOrg + ", interestRate=" + this.interestRate + ", sortInterestRate=" + this.sortInterestRate + ", logoImageUrl=" + this.logoImageUrl + ", logoFillImageUrl=" + this.logoFillImageUrl + ", period=" + this.period + ", product=" + this.product + ", productBadge=" + this.productBadge + ", productName=" + this.productName + ", requestInformation=" + this.requestInformation + ", status=" + this.status + ", statusMessage=" + this.statusMessage + ", inAppApplication=" + this.inAppApplication + ", logProductType=" + this.logProductType + ", primeRateInformation=" + this.primeRateInformation + ", additionalInformationBox=" + this.additionalInformationBox + ", badges=" + this.badges + ", isMortgage=" + this.isMortgage + ", mortgageScheme=" + this.mortgageScheme + ", filters=" + this.filters + ", detailLandingType=" + this.detailLandingType + ", loanAppliedTs=" + this.loanAppliedTs + ", supplementaryInformation=" + this.supplementaryInformation + ", interestRateAnimationEnabled=" + this.interestRateAnimationEnabled + ", interestRateInformationBox=" + this.interestRateInformationBox + ")";
        int i2 = onExtraCallback + 35;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.amount);
        parcel.writeString(this.companyName);
        parcel.writeString(this.guaranteeOrg);
        parcel.writeFloat(this.interestRate);
        Float f = this.sortInterestRate;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        parcel.writeString(this.logoImageUrl);
        parcel.writeString(this.logoFillImageUrl);
        parcel.writeInt(this.period);
        this.product.writeToParcel(parcel, i);
        LoanProductBadge loanProductBadge = this.productBadge;
        if (loanProductBadge == null) {
            int i3 = onWarmupCompleted + 97;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(0);
            }
        } else {
            parcel.writeInt(1);
            loanProductBadge.writeToParcel(parcel, i);
        }
        parcel.writeString(this.productName);
        parcel.writeString(this.requestInformation);
        this.status.writeToParcel(parcel, i);
        parcel.writeString(this.statusMessage);
        parcel.writeInt(this.inAppApplication ? 1 : 0);
        ProductType productType = this.logProductType;
        if (productType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            productType.writeToParcel(parcel, i);
        }
        ProducerSequenceFactoryExternalSyntheticLambda17 producerSequenceFactoryExternalSyntheticLambda17 = this.primeRateInformation;
        if (producerSequenceFactoryExternalSyntheticLambda17 == null) {
            parcel.writeInt(0);
            int i4 = onExtraCallback + 69;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        } else {
            parcel.writeInt(1);
            producerSequenceFactoryExternalSyntheticLambda17.writeToParcel(parcel, i);
        }
        OkHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0 okHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0 = this.additionalInformationBox;
        if (okHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            okHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0.writeToParcel(parcel, i);
        }
        List<NeoLoanProductBadge> list = this.badges;
        parcel.writeInt(list.size());
        Iterator<NeoLoanProductBadge> it = list.iterator();
        while (it.hasNext()) {
            int i6 = onWarmupCompleted + 29;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                it.next().writeToParcel(parcel, i);
                throw null;
            }
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isMortgage ? 1 : 0);
        parcel.writeString(this.mortgageScheme);
        parcel.writeStringList(this.filters);
        parcel.writeString(this.detailLandingType);
        parcel.writeString(this.loanAppliedTs);
        SupplementaryInformation supplementaryInformation = this.supplementaryInformation;
        if (supplementaryInformation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            supplementaryInformation.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.interestRateAnimationEnabled ? 1 : 0);
        SupplementaryInformation supplementaryInformation2 = this.interestRateInformationBox;
        if (supplementaryInformation2 != null) {
            parcel.writeInt(1);
            supplementaryInformation2.writeToParcel(parcel, i);
            return;
        }
        parcel.writeInt(0);
        int i7 = onExtraCallback + 85;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    public RequestResult(long j, @NotNull String str, @NotNull String str2, float f, @Nullable Float f2, @NotNull String str3, @NotNull String str4, int i, @NotNull LoanComparisonPreScreeningProduct loanComparisonPreScreeningProduct, @Nullable LoanProductBadge loanProductBadge, @NotNull String str5, @NotNull String str6, @NotNull LoanProductStatus loanProductStatus, @NotNull String str7, boolean z, @Nullable ProductType productType, @Nullable ProducerSequenceFactoryExternalSyntheticLambda17 producerSequenceFactoryExternalSyntheticLambda17, @Nullable OkHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0 okHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0, @NotNull List<NeoLoanProductBadge> list, boolean z2, @Nullable String str8, @NotNull List<String> list2, @Nullable String str9, @Nullable String str10, @Nullable SupplementaryInformation supplementaryInformation, boolean z3, @Nullable SupplementaryInformation supplementaryInformation2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(loanComparisonPreScreeningProduct, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(loanProductStatus, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.amount = j;
        this.companyName = str;
        this.guaranteeOrg = str2;
        this.interestRate = f;
        this.sortInterestRate = f2;
        this.logoImageUrl = str3;
        this.logoFillImageUrl = str4;
        this.period = i;
        this.product = loanComparisonPreScreeningProduct;
        this.productBadge = loanProductBadge;
        this.productName = str5;
        this.requestInformation = str6;
        this.status = loanProductStatus;
        this.statusMessage = str7;
        this.inAppApplication = z;
        this.logProductType = productType;
        this.primeRateInformation = producerSequenceFactoryExternalSyntheticLambda17;
        this.additionalInformationBox = okHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0;
        this.badges = list;
        this.isMortgage = z2;
        this.mortgageScheme = str8;
        this.filters = list2;
        this.detailLandingType = str9;
        this.loanAppliedTs = str10;
        this.supplementaryInformation = supplementaryInformation;
        this.interestRateAnimationEnabled = z3;
        this.interestRateInformationBox = supplementaryInformation2;
        this.position = -1;
    }

    public /* synthetic */ RequestResult(long j, String str, String str2, float f, Float f2, String str3, String str4, int i, LoanComparisonPreScreeningProduct loanComparisonPreScreeningProduct, LoanProductBadge loanProductBadge, String str5, String str6, LoanProductStatus loanProductStatus, String str7, boolean z, ProductType productType, ProducerSequenceFactoryExternalSyntheticLambda17 producerSequenceFactoryExternalSyntheticLambda17, OkHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0 okHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0, List list, boolean z2, String str8, List list2, String str9, String str10, SupplementaryInformation supplementaryInformation, boolean z3, SupplementaryInformation supplementaryInformation2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        float f3;
        Float f4;
        String str11;
        int i3;
        LoanComparisonPreScreeningProduct loanComparisonPreScreeningProduct2;
        boolean z4;
        boolean z5;
        LoanProductStatus loanProductStatus2;
        ProductType productType2;
        ProductType productType3;
        ProducerSequenceFactoryExternalSyntheticLambda17 producerSequenceFactoryExternalSyntheticLambda172;
        boolean z6;
        boolean z7;
        String str12;
        String str13;
        String str14;
        String str15;
        SupplementaryInformation supplementaryInformation3;
        boolean z8;
        SupplementaryInformation supplementaryInformation4;
        long j2 = (i2 & 1) != 0 ? 0L : j;
        String str16 = (i2 & 2) != 0 ? "" : str;
        String str17 = (i2 & 4) != 0 ? "" : str2;
        if ((i2 & 8) != 0) {
            int i4 = onExtraCallback + 53;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
            f3 = 0.0f;
        } else {
            f3 = f;
        }
        Object obj = null;
        if ((i2 & 16) != 0) {
            int i6 = 2 % 2;
            f4 = null;
        } else {
            f4 = f2;
        }
        String str18 = (i2 & 32) != 0 ? "" : str3;
        if ((i2 & 64) != 0) {
            int i7 = onExtraCallback + 119;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            str11 = "";
        } else {
            str11 = str4;
        }
        if ((i2 & 128) != 0) {
            int i8 = onExtraCallback + 45;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            i3 = 0;
        } else {
            i3 = i;
        }
        if ((i2 & 256) != 0) {
            loanComparisonPreScreeningProduct2 = new LoanComparisonPreScreeningProduct((String) null, (String) null, 3, (DefaultConstructorMarker) null);
            int i10 = 2 % 2;
        } else {
            loanComparisonPreScreeningProduct2 = loanComparisonPreScreeningProduct;
        }
        LoanProductBadge loanProductBadge2 = (i2 & 512) != 0 ? null : loanProductBadge;
        String str19 = (i2 & 1024) != 0 ? "" : str5;
        String str20 = (i2 & 2048) != 0 ? "" : str6;
        LoanProductStatus loanProductStatus3 = (i2 & 4096) != 0 ? LoanProductStatus.UNKNOWN : loanProductStatus;
        String str21 = (i2 & 8192) != 0 ? "" : str7;
        if ((i2 & 16384) != 0) {
            int i11 = 2 % 2;
            z4 = false;
        } else {
            z4 = z;
        }
        if ((i2 & 32768) != 0) {
            z5 = z4;
            int i12 = onWarmupCompleted + 103;
            loanProductStatus2 = loanProductStatus3;
            onExtraCallback = i12 % 128;
            int i13 = i12 % 2;
            productType2 = null;
        } else {
            z5 = z4;
            loanProductStatus2 = loanProductStatus3;
            productType2 = productType;
        }
        ProducerSequenceFactoryExternalSyntheticLambda17 producerSequenceFactoryExternalSyntheticLambda173 = (65536 & i2) != 0 ? null : producerSequenceFactoryExternalSyntheticLambda17;
        OkHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0 okHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda02 = (i2 & 131072) != 0 ? null : okHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0;
        List listEmptyList = (i2 & 262144) != 0 ? CollectionsKt.emptyList() : list;
        if ((i2 & 524288) != 0) {
            producerSequenceFactoryExternalSyntheticLambda172 = producerSequenceFactoryExternalSyntheticLambda173;
            int i14 = onWarmupCompleted + 81;
            productType3 = productType2;
            onExtraCallback = i14 % 128;
            int i15 = i14 % 2;
            z6 = false;
        } else {
            productType3 = productType2;
            producerSequenceFactoryExternalSyntheticLambda172 = producerSequenceFactoryExternalSyntheticLambda173;
            z6 = z2;
        }
        String str22 = (1048576 & i2) != 0 ? null : str8;
        List listEmptyList2 = (i2 & 2097152) != 0 ? CollectionsKt.emptyList() : list2;
        if ((i2 & 4194304) != 0) {
            str12 = str22;
            int i16 = onWarmupCompleted + 49;
            z7 = z6;
            onExtraCallback = i16 % 128;
            int i17 = i16 % 2;
            str13 = null;
        } else {
            z7 = z6;
            str12 = str22;
            str13 = str9;
        }
        String str23 = (8388608 & i2) != 0 ? null : str10;
        if ((i2 & 16777216) != 0) {
            str15 = str23;
            int i18 = onExtraCallback + 65;
            str14 = str13;
            onWarmupCompleted = i18 % 128;
            int i19 = i18 % 2;
            supplementaryInformation3 = null;
        } else {
            str14 = str13;
            str15 = str23;
            supplementaryInformation3 = supplementaryInformation;
        }
        boolean z9 = (33554432 & i2) != 0 ? false : z3;
        if ((i2 & 67108864) != 0) {
            int i20 = onWarmupCompleted + 53;
            z8 = z9;
            onExtraCallback = i20 % 128;
            int i21 = i20 % 2;
            int i22 = 2 % 2;
            supplementaryInformation4 = null;
        } else {
            z8 = z9;
            supplementaryInformation4 = supplementaryInformation2;
        }
        this(j2, str16, str17, f3, f4, str18, str11, i3, loanComparisonPreScreeningProduct2, loanProductBadge2, str19, str20, loanProductStatus2, str21, z5, productType3, producerSequenceFactoryExternalSyntheticLambda172, okHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda02, listEmptyList, z7, str12, listEmptyList2, str14, str15, supplementaryInformation3, z8, supplementaryInformation4);
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        long j = this.amount;
        int i4 = i3 + 91;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        RequestResult requestResult = (RequestResult) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = requestResult.companyName;
        if (i4 != 0) {
            int i5 = 9 / 0;
        }
        int i6 = i3 + 65;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        float f = this.interestRate;
        if (i3 == 0) {
            int i4 = 25 / 0;
        }
        return f;
    }

    public final Float writeTypedObject() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 5;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Float f = this.sortInterestRate;
        int i5 = i2 + 19;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 12 / 0;
        }
        return f;
    }

    public final String getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.logoImageUrl;
        }
        throw null;
    }

    public final LoanComparisonPreScreeningProduct ICustomTabsCallback() {
        LoanComparisonPreScreeningProduct loanComparisonPreScreeningProduct;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 61;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            loanComparisonPreScreeningProduct = this.product;
            int i4 = 25 / 0;
        } else {
            loanComparisonPreScreeningProduct = this.product;
        }
        int i5 = i2 + 9;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return loanComparisonPreScreeningProduct;
    }

    public final LoanProductBadge extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        LoanProductBadge loanProductBadge = this.productBadge;
        int i5 = i3 + 67;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return loanProductBadge;
        }
        throw null;
    }

    public final String readTypedObject() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 57;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.productName;
        int i5 = i2 + 9;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 40 / 0;
        }
        return str;
    }

    public final String extraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.requestInformation;
        int i5 = i3 + 9;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 97 / 0;
        }
        return str;
    }

    public final LoanProductStatus onMinimized() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        LoanProductStatus loanProductStatus = this.status;
        int i4 = i3 + 15;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return loanProductStatus;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        RequestResult requestResult = (RequestResult) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = requestResult.statusMessage;
        if (i3 != 0) {
            int i4 = 4 / 0;
        }
        return str;
    }

    public final boolean IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.inAppApplication;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        RequestResult requestResult = (RequestResult) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 83;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        ProducerSequenceFactoryExternalSyntheticLambda17 producerSequenceFactoryExternalSyntheticLambda17 = requestResult.primeRateInformation;
        int i5 = i2 + 15;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return producerSequenceFactoryExternalSyntheticLambda17;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final OkHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0 onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 95;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        OkHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0 okHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0 = this.additionalInformationBox;
        int i5 = i2 + 69;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return okHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0;
        }
        throw null;
    }

    public final boolean onActivityLayout() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 17;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.isMortgage;
        int i5 = i2 + 69;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String access000() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.mortgageScheme;
        int i5 = i3 + 73;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<String> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        List<String> list = this.filters;
        int i5 = i3 + 29;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.detailLandingType;
        int i5 = i3 + 111;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 74 / 0;
        }
        return str;
    }

    public final SupplementaryInformation onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 27;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        SupplementaryInformation supplementaryInformation = this.supplementaryInformation;
        int i5 = i2 + 67;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return supplementaryInformation;
    }

    public final boolean onTransact() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 65;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        boolean z = this.interestRateAnimationEnabled;
        int i4 = i2 + 69;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final SupplementaryInformation IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.interestRateInformationBox;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String asBinder() {
        int i = 2 % 2;
        String str = new DecimalFormat("#.####", DecimalFormatSymbols.getInstance(Locale.ENGLISH)).format(Float.valueOf(this.interestRate)) + "%";
        int i2 = onExtraCallback + 81;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final int IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 93;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.position;
        int i6 = i2 + 21;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public final void onExtraCallback(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 41;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        this.position = i;
        int i6 = i4 + 9;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ProductType implements Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ProductType[] $VALUES;
        public static final Parcelable.Creator<ProductType> CREATOR;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private final String logName;
        public static final ProductType LOWEST_INTEREST = new ProductType("LOWEST_INTEREST", 0, "lowest_interest");
        public static final ProductType HIGHEST_AMOUNT = new ProductType("HIGHEST_AMOUNT", 1, "highest_amount");
        public static final ProductType BEST_CONDITION = new ProductType("BEST_CONDITION", 2, "best_condition");

        public static final class Creator implements Parcelable.Creator<ProductType> {
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ ProductType createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 69;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                ProductType productTypeOnExtraCallback = onExtraCallback(parcel);
                if (i3 == 0) {
                    int i4 = 54 / 0;
                }
                return productTypeOnExtraCallback;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ ProductType[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 77;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    onExtraCallbackWithResult(i);
                    throw null;
                }
                ProductType[] productTypeArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
                int i4 = onNavigationEvent + 63;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return productTypeArrOnExtraCallbackWithResult;
                }
                throw null;
            }

            public final ProductType onExtraCallback(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 63;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                ProductType productTypeValueOf = ProductType.valueOf(parcel.readString());
                int i4 = onNavigationEvent + 97;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return productTypeValueOf;
                }
                throw null;
            }

            public final ProductType[] onExtraCallbackWithResult(int i) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 5;
                int i4 = i3 % 128;
                onNavigationEvent = i4;
                int i5 = i3 % 2;
                ProductType[] productTypeArr = new ProductType[i];
                int i6 = i4 + 45;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    return productTypeArr;
                }
                throw null;
            }
        }

        private static final /* synthetic */ ProductType[] $values() {
            ProductType[] productTypeArr;
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 109;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                ProductType productType = LOWEST_INTEREST;
                ProductType productType2 = HIGHEST_AMOUNT;
                ProductType productType3 = BEST_CONDITION;
                productTypeArr = new ProductType[3];
                productTypeArr[0] = productType;
                productTypeArr[0] = productType2;
                productTypeArr[5] = productType3;
            } else {
                productTypeArr = new ProductType[]{LOWEST_INTEREST, HIGHEST_AMOUNT, BEST_CONDITION};
            }
            int i4 = i2 + 59;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return productTypeArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static EnumEntries<ProductType> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 35;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return $ENTRIES;
            }
            throw null;
        }

        public static ProductType valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 37;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            ProductType productType = (ProductType) Enum.valueOf(ProductType.class, str);
            if (i3 == 0) {
                return productType;
            }
            throw null;
        }

        public static ProductType[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 87;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            ProductType[] productTypeArr = (ProductType[]) $VALUES.clone();
            int i4 = IAuthTabCallback + 95;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return productTypeArr;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 121;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 65;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 47;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(name());
            int i5 = onExtraCallbackWithResult + 41;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }

        private ProductType(String str, int i, String str2) {
            this.logName = str2;
        }

        public final String getLogName() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 125;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            String str = this.logName;
            int i5 = i3 + 101;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        static {
            ProductType[] productTypeArr$values = $values();
            $VALUES = productTypeArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(productTypeArr$values);
            CREATOR = new Creator();
            int i = onExtraCallback + 31;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                int i2 = 38 / 0;
            }
        }
    }

    public static final class SupplementaryInformation implements Parcelable {
        public static final Parcelable.Creator<SupplementaryInformation> CREATOR = new Creator();
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final String iconUrl;
        private final String text;

        public static final class Creator implements Parcelable.Creator<SupplementaryInformation> {
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ SupplementaryInformation createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 9;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                SupplementaryInformation supplementaryInformationOnWarmupCompleted = onWarmupCompleted(parcel);
                if (i3 != 0) {
                    int i4 = 53 / 0;
                }
                int i5 = onExtraCallback + 33;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    return supplementaryInformationOnWarmupCompleted;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ SupplementaryInformation[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 55;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                SupplementaryInformation[] supplementaryInformationArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
                int i5 = onExtraCallbackWithResult + 49;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return supplementaryInformationArrOnExtraCallbackWithResult;
                }
                throw null;
            }

            public final SupplementaryInformation[] onExtraCallbackWithResult(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 39;
                int i4 = i3 % 128;
                onExtraCallbackWithResult = i4;
                int i5 = i3 % 2;
                SupplementaryInformation[] supplementaryInformationArr = new SupplementaryInformation[i];
                int i6 = i4 + 93;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                return supplementaryInformationArr;
            }

            public final SupplementaryInformation onWarmupCompleted(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                SupplementaryInformation supplementaryInformation = new SupplementaryInformation(parcel.readString(), parcel.readString());
                int i2 = onExtraCallback + 83;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return supplementaryInformation;
            }
        }

        static {
            int i = onExtraCallbackWithResult + 67;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 53;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 117;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return 0;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SupplementaryInformation)) {
                return false;
            }
            SupplementaryInformation supplementaryInformation = (SupplementaryInformation) obj;
            if (!Intrinsics.areEqual(this.iconUrl, supplementaryInformation.iconUrl)) {
                return false;
            }
            if (Intrinsics.areEqual(this.text, supplementaryInformation.text)) {
                int i2 = IAuthTabCallback + 9;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            int i4 = IAuthTabCallback + 35;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 57;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            String str = this.iconUrl;
            if (str == null) {
                int i4 = i2 + 63;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            return (iHashCode * 31) + this.text.hashCode();
        }

        public String toString() {
            int i = 2 % 2;
            String str = "SupplementaryInformation(iconUrl=" + this.iconUrl + ", text=" + this.text + ")";
            int i2 = IAuthTabCallback + 71;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 53;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.iconUrl);
            parcel.writeString(this.text);
            int i5 = onNavigationEvent + 37;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }

        public SupplementaryInformation(@Nullable String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str2, "");
            this.iconUrl = str;
            this.text = str2;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 93;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            String str = this.iconUrl;
            int i5 = i3 + 23;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 87;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.text;
            int i4 = i2 + 37;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 29 / 0;
            }
            return str;
        }
    }

    public static /* synthetic */ RequestResult onExtraCallbackWithResult(RequestResult requestResult, long j, String str, String str2, float f, Float f2, String str3, String str4, int i, LoanComparisonPreScreeningProduct loanComparisonPreScreeningProduct, LoanProductBadge loanProductBadge, String str5, String str6, LoanProductStatus loanProductStatus, String str7, boolean z, ProductType productType, ProducerSequenceFactoryExternalSyntheticLambda17 producerSequenceFactoryExternalSyntheticLambda17, OkHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0 okHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0, List list, boolean z2, String str8, List list2, String str9, String str10, SupplementaryInformation supplementaryInformation, boolean z3, SupplementaryInformation supplementaryInformation2, int i2, Object obj) {
        Object[] objArr = {requestResult, Long.valueOf(j), str, str2, Float.valueOf(f), f2, str3, str4, Integer.valueOf(i), loanComparisonPreScreeningProduct, loanProductBadge, str5, str6, loanProductStatus, str7, Boolean.valueOf(z), productType, producerSequenceFactoryExternalSyntheticLambda17, okHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0, list, Boolean.valueOf(z2), str8, list2, str9, str10, supplementaryInformation, Boolean.valueOf(z3), supplementaryInformation2, Integer.valueOf(i2), obj};
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        return (RequestResult) onExtraCallbackWithResult(1649916718, objArr, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -1649916717, iOnWarmupCompleted);
    }

    public final List<NeoLoanProductBadge> onWarmupCompleted() {
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        return (List) onExtraCallbackWithResult(-1625506635, new Object[]{this}, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 1625506637, iOnWarmupCompleted);
    }

    public final String onExtraCallback() {
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        return (String) onExtraCallbackWithResult(-193903260, new Object[]{this}, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 193903260, iOnWarmupCompleted);
    }

    public final ProducerSequenceFactoryExternalSyntheticLambda17 access100() {
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        return (ProducerSequenceFactoryExternalSyntheticLambda17) onExtraCallbackWithResult(-1901701422, new Object[]{this}, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 1901701426, iOnWarmupCompleted);
    }

    public final String onActivityResized() {
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        return (String) onExtraCallbackWithResult(1450860607, new Object[]{this}, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -1450860604, iOnWarmupCompleted);
    }
}
