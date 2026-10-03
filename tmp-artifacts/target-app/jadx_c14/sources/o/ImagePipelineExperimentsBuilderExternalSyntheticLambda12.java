package o;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import im.toss.tosssecurities.features.main.ui.TossSecMainViewModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.LoanFunnelType;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ImagePipelineExperimentsBuilderExternalSyntheticLambda12 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    @SerializedName("agreeIdentifyInfo")
    private final boolean agreeIdentifyInfo;

    @SerializedName("agreePersonalCreditInfo")
    private final boolean agreePersonalCreditInfo;

    @SerializedName("agreeTermsTime")
    private String agreeTermsTime;

    @SerializedName("authSmsTime")
    private String authSmsTime;

    @SerializedName("automobileInfo")
    private JsonObject automobileInfo;

    @SerializedName("automobileNumber")
    private String automobileNumber;

    @SerializedName("businessType")
    private final String businessType;

    @SerializedName("corporateName")
    private final String corporateName;

    @SerializedName("corporateNumber")
    private final String corporateNumber;

    @SerializedName("employeeType")
    private final String employeeType;

    @SerializedName("expectedAmount")
    private final Integer expectedAmount;

    @SerializedName("fromRefinancing")
    private final boolean fromRefinancing;

    @SerializedName("healthPayerType")
    private String healthPayerType;

    @SerializedName("householderType")
    private String householderType;

    @SerializedName("jobType")
    private String jobType;

    @SerializedName("joinDate")
    private final String joinDate;

    @SerializedName("openDate")
    private final String openDate;

    @SerializedName("rrn")
    private String rrn;

    @SerializedName("salary")
    private final String salary;

    @SerializedName("scrapedData")
    private JsonObject scrapedData;

    @SerializedName("type")
    private final LoanFunnelType type;

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~(i5 | i);
        int i8 = ~i5;
        int i9 = ~i;
        int i10 = i8 | i9;
        int i11 = i7 | (~(i10 | i3));
        int i12 = i9 | i5;
        int i13 = (~i10) | i3;
        int i14 = i3 + i5 + i2 + ((-1587644119) * i6) + (1302866265 * i4);
        int i15 = i14 * i14;
        int i16 = (i3 * (-1579585154)) + 1163788288 + ((-1579585154) * i5) + ((-914001539) * i11) + (i12 * 914001539) + (914001539 * i13) + ((-665583616) * i2) + (1500774400 * i6) + ((-1456209920) * i4) + ((-2144468992) * i15);
        int i17 = ((i3 * (-855313886)) - 1253577507) + (i5 * (-855313886)) + (i11 * (-13)) + (i12 * 13) + (i13 * 13) + (i2 * (-855313873)) + (i6 * (-1467678585)) + (i4 * 593082711) + (i15 * 74579968);
        int i18 = i16 + (i17 * i17 * (-1668153344));
        return i18 != 1 ? i18 != 2 ? i18 != 3 ? onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr) : IAuthTabCallback(objArr);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[2]).booleanValue();
        String str = (String) objArr[3];
        String str2 = (String) objArr[4];
        String str3 = (String) objArr[5];
        String str4 = (String) objArr[6];
        String str5 = (String) objArr[7];
        String str6 = (String) objArr[8];
        String str7 = (String) objArr[9];
        String str8 = (String) objArr[10];
        String str9 = (String) objArr[11];
        String str10 = (String) objArr[12];
        String str11 = (String) objArr[13];
        Integer num = (Integer) objArr[14];
        String str12 = (String) objArr[15];
        String str13 = (String) objArr[16];
        String str14 = (String) objArr[17];
        JsonObject jsonObject = (JsonObject) objArr[18];
        JsonObject jsonObject2 = (JsonObject) objArr[19];
        LoanFunnelType loanFunnelType = (LoanFunnelType) objArr[20];
        boolean zBooleanValue3 = ((Boolean) objArr[21]).booleanValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        ImagePipelineExperimentsBuilderExternalSyntheticLambda12 imagePipelineExperimentsBuilderExternalSyntheticLambda12 = new ImagePipelineExperimentsBuilderExternalSyntheticLambda12(zBooleanValue, zBooleanValue2, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, num, str12, str13, str14, jsonObject, jsonObject2, loanFunnelType, zBooleanValue3);
        int i2 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return imagePipelineExperimentsBuilderExternalSyntheticLambda12;
    }

    public static /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda12 onWarmupCompleted(ImagePipelineExperimentsBuilderExternalSyntheticLambda12 imagePipelineExperimentsBuilderExternalSyntheticLambda12, boolean z, boolean z2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, String str12, String str13, String str14, JsonObject jsonObject, JsonObject jsonObject2, LoanFunnelType loanFunnelType, boolean z3, int i, Object obj) {
        boolean z4;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        JsonObject jsonObject3;
        JsonObject jsonObject4;
        JsonObject jsonObject5;
        LoanFunnelType loanFunnelType2;
        boolean z5;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 7;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        boolean z6 = (i3 % 2 == 0 || (i & 1) == 0) ? z : imagePipelineExperimentsBuilderExternalSyntheticLambda12.agreePersonalCreditInfo;
        if ((i & 2) != 0) {
            int i5 = i4 + 37;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                boolean z7 = imagePipelineExperimentsBuilderExternalSyntheticLambda12.agreeIdentifyInfo;
                throw null;
            }
            z4 = imagePipelineExperimentsBuilderExternalSyntheticLambda12.agreeIdentifyInfo;
        } else {
            z4 = z2;
        }
        String str23 = (i & 4) != 0 ? imagePipelineExperimentsBuilderExternalSyntheticLambda12.authSmsTime : str;
        String str24 = (i & 8) != 0 ? imagePipelineExperimentsBuilderExternalSyntheticLambda12.agreeTermsTime : str2;
        String str25 = (i & 16) != 0 ? imagePipelineExperimentsBuilderExternalSyntheticLambda12.rrn : str3;
        if ((i & 32) != 0) {
            str15 = imagePipelineExperimentsBuilderExternalSyntheticLambda12.salary;
            int i6 = i4 + 109;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 4 % 4;
            }
        } else {
            str15 = str4;
        }
        String str26 = (i & 64) != 0 ? imagePipelineExperimentsBuilderExternalSyntheticLambda12.jobType : str5;
        if ((i & 128) != 0) {
            int i8 = onNavigationEvent + 17;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            str16 = imagePipelineExperimentsBuilderExternalSyntheticLambda12.businessType;
        } else {
            str16 = str6;
        }
        String str27 = (i & 256) != 0 ? imagePipelineExperimentsBuilderExternalSyntheticLambda12.employeeType : str7;
        String str28 = (i & 512) != 0 ? imagePipelineExperimentsBuilderExternalSyntheticLambda12.joinDate : str8;
        String str29 = (i & 1024) != 0 ? imagePipelineExperimentsBuilderExternalSyntheticLambda12.openDate : str9;
        String str30 = (i & 2048) != 0 ? imagePipelineExperimentsBuilderExternalSyntheticLambda12.corporateNumber : str10;
        String str31 = (i & 4096) != 0 ? imagePipelineExperimentsBuilderExternalSyntheticLambda12.corporateName : str11;
        Integer num2 = (i & 8192) != 0 ? imagePipelineExperimentsBuilderExternalSyntheticLambda12.expectedAmount : num;
        String str32 = (i & 16384) != 0 ? imagePipelineExperimentsBuilderExternalSyntheticLambda12.healthPayerType : str12;
        if ((i & 32768) != 0) {
            str17 = str32;
            int i10 = onExtraCallbackWithResult + 75;
            str18 = str31;
            onNavigationEvent = i10 % 128;
            if (i10 % 2 != 0) {
                str19 = imagePipelineExperimentsBuilderExternalSyntheticLambda12.householderType;
                int i11 = 36 / 0;
            } else {
                str19 = imagePipelineExperimentsBuilderExternalSyntheticLambda12.householderType;
            }
        } else {
            str17 = str32;
            str18 = str31;
            str19 = str13;
        }
        if ((65536 & i) != 0) {
            int i12 = onExtraCallbackWithResult + 9;
            str20 = str19;
            onNavigationEvent = i12 % 128;
            if (i12 % 2 != 0) {
                String str33 = imagePipelineExperimentsBuilderExternalSyntheticLambda12.automobileNumber;
                throw null;
            }
            str21 = imagePipelineExperimentsBuilderExternalSyntheticLambda12.automobileNumber;
        } else {
            str20 = str19;
            str21 = str14;
        }
        if ((131072 & i) != 0) {
            int i13 = onExtraCallbackWithResult + 119;
            str22 = str21;
            onNavigationEvent = i13 % 128;
            if (i13 % 2 != 0) {
                JsonObject jsonObject6 = imagePipelineExperimentsBuilderExternalSyntheticLambda12.automobileInfo;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            jsonObject3 = imagePipelineExperimentsBuilderExternalSyntheticLambda12.automobileInfo;
        } else {
            str22 = str21;
            jsonObject3 = jsonObject;
        }
        JsonObject jsonObject7 = (262144 & i) != 0 ? imagePipelineExperimentsBuilderExternalSyntheticLambda12.scrapedData : jsonObject2;
        if ((i & 524288) != 0) {
            jsonObject5 = jsonObject7;
            int i14 = onNavigationEvent + 3;
            jsonObject4 = jsonObject3;
            onExtraCallbackWithResult = i14 % 128;
            if (i14 % 2 == 0) {
                LoanFunnelType loanFunnelType3 = imagePipelineExperimentsBuilderExternalSyntheticLambda12.type;
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            loanFunnelType2 = imagePipelineExperimentsBuilderExternalSyntheticLambda12.type;
        } else {
            jsonObject4 = jsonObject3;
            jsonObject5 = jsonObject7;
            loanFunnelType2 = loanFunnelType;
        }
        if ((i & 1048576) != 0) {
            int i15 = onExtraCallbackWithResult + 41;
            onNavigationEvent = i15 % 128;
            int i16 = i15 % 2;
            z5 = imagePipelineExperimentsBuilderExternalSyntheticLambda12.fromRefinancing;
        } else {
            z5 = z3;
        }
        return (ImagePipelineExperimentsBuilderExternalSyntheticLambda12) IAuthTabCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 2018135702, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -2018135701, new Object[]{imagePipelineExperimentsBuilderExternalSyntheticLambda12, Boolean.valueOf(z6), Boolean.valueOf(z4), str23, str24, str25, str15, str26, str16, str27, str28, str29, str30, str18, num2, str17, str20, str22, jsonObject4, jsonObject5, loanFunnelType2, Boolean.valueOf(z5)}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 17;
            onNavigationEvent = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof ImagePipelineExperimentsBuilderExternalSyntheticLambda12)) {
            return false;
        }
        ImagePipelineExperimentsBuilderExternalSyntheticLambda12 imagePipelineExperimentsBuilderExternalSyntheticLambda12 = (ImagePipelineExperimentsBuilderExternalSyntheticLambda12) obj;
        if (this.agreePersonalCreditInfo != imagePipelineExperimentsBuilderExternalSyntheticLambda12.agreePersonalCreditInfo || this.agreeIdentifyInfo != imagePipelineExperimentsBuilderExternalSyntheticLambda12.agreeIdentifyInfo || !Intrinsics.areEqual(this.authSmsTime, imagePipelineExperimentsBuilderExternalSyntheticLambda12.authSmsTime) || !Intrinsics.areEqual(this.agreeTermsTime, imagePipelineExperimentsBuilderExternalSyntheticLambda12.agreeTermsTime)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.rrn, imagePipelineExperimentsBuilderExternalSyntheticLambda12.rrn)) {
            int i3 = onNavigationEvent + 3;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.salary, imagePipelineExperimentsBuilderExternalSyntheticLambda12.salary) || !Intrinsics.areEqual(this.jobType, imagePipelineExperimentsBuilderExternalSyntheticLambda12.jobType) || !Intrinsics.areEqual(this.businessType, imagePipelineExperimentsBuilderExternalSyntheticLambda12.businessType)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.employeeType, imagePipelineExperimentsBuilderExternalSyntheticLambda12.employeeType)) {
            int i5 = onExtraCallbackWithResult + 31;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.joinDate, imagePipelineExperimentsBuilderExternalSyntheticLambda12.joinDate)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.openDate, imagePipelineExperimentsBuilderExternalSyntheticLambda12.openDate)) {
            int i7 = onExtraCallbackWithResult + 7;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.corporateNumber, imagePipelineExperimentsBuilderExternalSyntheticLambda12.corporateNumber)) {
            int i9 = onExtraCallbackWithResult + 35;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.corporateName, imagePipelineExperimentsBuilderExternalSyntheticLambda12.corporateName) || !Intrinsics.areEqual(this.expectedAmount, imagePipelineExperimentsBuilderExternalSyntheticLambda12.expectedAmount)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.healthPayerType, imagePipelineExperimentsBuilderExternalSyntheticLambda12.healthPayerType)) {
            int i11 = onExtraCallbackWithResult + 121;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.householderType, imagePipelineExperimentsBuilderExternalSyntheticLambda12.householderType) || !Intrinsics.areEqual(this.automobileNumber, imagePipelineExperimentsBuilderExternalSyntheticLambda12.automobileNumber) || !Intrinsics.areEqual(this.automobileInfo, imagePipelineExperimentsBuilderExternalSyntheticLambda12.automobileInfo) || !Intrinsics.areEqual(this.scrapedData, imagePipelineExperimentsBuilderExternalSyntheticLambda12.scrapedData)) {
            return false;
        }
        if (this.type == imagePipelineExperimentsBuilderExternalSyntheticLambda12.type) {
            return this.fromRefinancing == imagePipelineExperimentsBuilderExternalSyntheticLambda12.fromRefinancing;
        }
        int i13 = onNavigationEvent + 89;
        onExtraCallbackWithResult = i13 % 128;
        int i14 = i13 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i;
        int iHashCode2;
        int i2;
        int iHashCode3;
        int i3 = 2 % 2;
        int iHashCode4 = Boolean.hashCode(this.agreePersonalCreditInfo);
        int iHashCode5 = Boolean.hashCode(this.agreeIdentifyInfo);
        int iHashCode6 = this.authSmsTime.hashCode();
        int iHashCode7 = this.agreeTermsTime.hashCode();
        String str = this.rrn;
        int iHashCode8 = str == null ? 0 : str.hashCode();
        String str2 = this.salary;
        int iHashCode9 = str2 == null ? 0 : str2.hashCode();
        int iHashCode10 = this.jobType.hashCode();
        String str3 = this.businessType;
        int iHashCode11 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.employeeType;
        int iHashCode12 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.joinDate;
        if (str5 == null) {
            int i4 = onExtraCallbackWithResult + 29;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str5.hashCode();
        }
        String str6 = this.openDate;
        int iHashCode13 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.corporateNumber;
        int iHashCode14 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.corporateName;
        int iHashCode15 = str8 == null ? 0 : str8.hashCode();
        Integer num = this.expectedAmount;
        if (num == null) {
            int i6 = onExtraCallbackWithResult + 15;
            i = iHashCode15;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            i = iHashCode15;
            iHashCode2 = num.hashCode();
        }
        String str9 = this.healthPayerType;
        int iHashCode16 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.householderType;
        int iHashCode17 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.automobileNumber;
        int iHashCode18 = str11 == null ? 0 : str11.hashCode();
        JsonObject jsonObject = this.automobileInfo;
        int iHashCode19 = jsonObject == null ? 0 : jsonObject.hashCode();
        JsonObject jsonObject2 = this.scrapedData;
        int iHashCode20 = jsonObject2 == null ? 0 : jsonObject2.hashCode();
        LoanFunnelType loanFunnelType = this.type;
        if (loanFunnelType != null) {
            int i8 = onNavigationEvent + 65;
            i2 = iHashCode16;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 == 0) {
                loanFunnelType.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            iHashCode3 = loanFunnelType.hashCode();
        } else {
            i2 = iHashCode16;
            iHashCode3 = 0;
        }
        return (((((((((((((((((((((((((((((((((((((((iHashCode4 * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + i) * 31) + iHashCode2) * 31) + i2) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode3) * 31) + Boolean.hashCode(this.fromRefinancing);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanComparisonPreScreenRequest(agreePersonalCreditInfo=" + this.agreePersonalCreditInfo + ", agreeIdentifyInfo=" + this.agreeIdentifyInfo + ", authSmsTime=" + this.authSmsTime + ", agreeTermsTime=" + this.agreeTermsTime + ", rrn=" + this.rrn + ", salary=" + this.salary + ", jobType=" + this.jobType + ", businessType=" + this.businessType + ", employeeType=" + this.employeeType + ", joinDate=" + this.joinDate + ", openDate=" + this.openDate + ", corporateNumber=" + this.corporateNumber + ", corporateName=" + this.corporateName + ", expectedAmount=" + this.expectedAmount + ", healthPayerType=" + this.healthPayerType + ", householderType=" + this.householderType + ", automobileNumber=" + this.automobileNumber + ", automobileInfo=" + this.automobileInfo + ", scrapedData=" + this.scrapedData + ", type=" + this.type + ", fromRefinancing=" + this.fromRefinancing + ")";
        int i2 = onExtraCallbackWithResult + 113;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ImagePipelineExperimentsBuilderExternalSyntheticLambda12(boolean z, boolean z2, @NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, @NotNull String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable Integer num, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable JsonObject jsonObject, @Nullable JsonObject jsonObject2, @Nullable LoanFunnelType loanFunnelType, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.agreePersonalCreditInfo = z;
        this.agreeIdentifyInfo = z2;
        this.authSmsTime = str;
        this.agreeTermsTime = str2;
        this.rrn = str3;
        this.salary = str4;
        this.jobType = str5;
        this.businessType = str6;
        this.employeeType = str7;
        this.joinDate = str8;
        this.openDate = str9;
        this.corporateNumber = str10;
        this.corporateName = str11;
        this.expectedAmount = num;
        this.healthPayerType = str12;
        this.householderType = str13;
        this.automobileNumber = str14;
        this.automobileInfo = jsonObject;
        this.scrapedData = jsonObject2;
        this.type = loanFunnelType;
        this.fromRefinancing = z3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda12(boolean z, boolean z2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, String str12, String str13, String str14, JsonObject jsonObject, JsonObject jsonObject2, LoanFunnelType loanFunnelType, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z4;
        boolean z5;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        JsonObject jsonObject3;
        LoanFunnelType loanFunnelType2;
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            z4 = true;
        } else {
            z4 = z;
        }
        if ((i & 2) != 0) {
            int i3 = onNavigationEvent + 123;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            z5 = true;
        } else {
            z5 = z2;
        }
        String str23 = (i & 16) != 0 ? null : str3;
        if ((i & 32) != 0) {
            int i5 = 2 % 2;
            str15 = null;
        } else {
            str15 = str4;
        }
        if ((i & 128) != 0) {
            int i6 = onExtraCallbackWithResult + 33;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            str16 = null;
        } else {
            str16 = str6;
        }
        if ((i & 256) != 0) {
            int i8 = onNavigationEvent + 77;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            str17 = null;
        } else {
            str17 = str7;
        }
        if ((i & 512) != 0) {
            int i11 = onNavigationEvent + 125;
            onExtraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
            str18 = null;
        } else {
            str18 = str8;
        }
        String str24 = (i & 1024) != 0 ? null : str9;
        if ((i & 2048) != 0) {
            int i13 = onExtraCallbackWithResult + 73;
            onNavigationEvent = i13 % 128;
            int i14 = i13 % 2;
            str19 = null;
        } else {
            str19 = str10;
        }
        String str25 = (i & 4096) != 0 ? null : str11;
        Integer num2 = (i & 8192) != 0 ? null : num;
        if ((i & 16384) != 0) {
            int i15 = onExtraCallbackWithResult + 75;
            onNavigationEvent = i15 % 128;
            int i16 = i15 % 2;
            str20 = null;
        } else {
            str20 = str12;
        }
        if ((32768 & i) != 0) {
            int i17 = onExtraCallbackWithResult + 1;
            onNavigationEvent = i17 % 128;
            int i18 = i17 % 2;
            str21 = null;
        } else {
            str21 = str13;
        }
        if ((65536 & i) != 0) {
            int i19 = 2 % 2;
            str22 = null;
        } else {
            str22 = str14;
        }
        if ((131072 & i) != 0) {
            int i20 = onExtraCallbackWithResult + 71;
            onNavigationEvent = i20 % 128;
            int i21 = i20 % 2;
            jsonObject3 = null;
        } else {
            jsonObject3 = jsonObject;
        }
        JsonObject jsonObject4 = (262144 & i) != 0 ? null : jsonObject2;
        if ((524288 & i) != 0) {
            int i22 = onNavigationEvent + 25;
            onExtraCallbackWithResult = i22 % 128;
            int i23 = i22 % 2;
            loanFunnelType2 = null;
        } else {
            loanFunnelType2 = loanFunnelType;
        }
        this(z4, z5, str, str2, str23, str15, str5, str16, str17, str18, str24, str19, str25, num2, str20, str21, str22, jsonObject3, jsonObject4, loanFunnelType2, (i & 1048576) != 0 ? false : z3);
    }

    public final void IAuthTabCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.authSmsTime = str;
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.authSmsTime = str;
        int i3 = onNavigationEvent + 125;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 87;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.authSmsTime;
        int i5 = i2 + 121;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        ImagePipelineExperimentsBuilderExternalSyntheticLambda12 imagePipelineExperimentsBuilderExternalSyntheticLambda12 = (ImagePipelineExperimentsBuilderExternalSyntheticLambda12) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            imagePipelineExperimentsBuilderExternalSyntheticLambda12.agreeTermsTime = str;
            return null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        imagePipelineExperimentsBuilderExternalSyntheticLambda12.agreeTermsTime = str;
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.agreeTermsTime;
        int i4 = i3 + 83;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        ImagePipelineExperimentsBuilderExternalSyntheticLambda12 imagePipelineExperimentsBuilderExternalSyntheticLambda12 = (ImagePipelineExperimentsBuilderExternalSyntheticLambda12) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = imagePipelineExperimentsBuilderExternalSyntheticLambda12.rrn;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 33;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 72 / 0;
        }
        return str;
    }

    public final void IAuthTabCallbackStub(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 53;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        this.rrn = str;
        if (i4 != 0) {
            int i5 = 77 / 0;
        }
        int i6 = i2 + 69;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
    }

    public final String access100() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.salary;
        int i5 = i3 + 35;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 73;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.jobType;
        int i4 = i2 + 63;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final void onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.jobType = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.jobType = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.businessType;
        int i5 = i3 + 19;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String asBinder() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 63;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.employeeType;
        int i5 = i2 + 7;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return this.joinDate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.openDate;
        int i4 = i3 + 119;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 93 / 0;
        }
        return str;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.corporateNumber;
        int i4 = i3 + 67;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.corporateName;
        int i4 = i3 + 119;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallback(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        this.healthPayerType = str;
        int i5 = i3 + 83;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = this.healthPayerType;
        if (i3 != 0) {
            int i4 = 37 / 0;
        }
        return str;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = this.householderType;
        if (i3 != 0) {
            int i4 = 40 / 0;
        }
        return str;
    }

    public final void onExtraCallbackWithResult(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        this.automobileNumber = str;
        int i5 = i3 + 75;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 91 / 0;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        ImagePipelineExperimentsBuilderExternalSyntheticLambda12 imagePipelineExperimentsBuilderExternalSyntheticLambda12 = (ImagePipelineExperimentsBuilderExternalSyntheticLambda12) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 77;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        JsonObject jsonObject = imagePipelineExperimentsBuilderExternalSyntheticLambda12.automobileInfo;
        int i5 = i2 + 57;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return jsonObject;
    }

    public final JsonObject access000() {
        JsonObject jsonObject;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            jsonObject = this.scrapedData;
            int i4 = 60 / 0;
        } else {
            jsonObject = this.scrapedData;
        }
        int i5 = i3 + 83;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return jsonObject;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final LoanFunnelType writeTypedObject() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return this.type;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ImagePipelineExperimentsBuilderExternalSyntheticLambda12 IAuthTabCallback(boolean z, boolean z2, @NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, @NotNull String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable Integer num, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable JsonObject jsonObject, @Nullable JsonObject jsonObject2, @Nullable LoanFunnelType loanFunnelType, boolean z3) {
        Object[] objArr = {this, Boolean.valueOf(z), Boolean.valueOf(z2), str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, num, str12, str13, str14, jsonObject, jsonObject2, loanFunnelType, Boolean.valueOf(z3)};
        return (ImagePipelineExperimentsBuilderExternalSyntheticLambda12) IAuthTabCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 2018135702, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -2018135701, objArr, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
    }

    public final JsonObject onNavigationEvent() {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (JsonObject) IAuthTabCallback(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, -2133875257, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 2133875259, new Object[]{this}, iOnExtraCallbackWithResult3);
    }

    public final String IAuthTabCallback_Parcel() {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (String) IAuthTabCallback(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, 1108693426, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1108693426, new Object[]{this}, iOnExtraCallbackWithResult3);
    }

    public final void onNavigationEvent(@NotNull String str) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        IAuthTabCallback(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, 2015180206, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -2015180203, new Object[]{this, str}, iOnExtraCallbackWithResult3);
    }
}
