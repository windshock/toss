package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.LoanProductStatus;
import viva.republica.toss.network.model.loan.PeerInfo;
import viva.republica.toss.network.model.loan.RequestResultGroup;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ProducerSequenceFactoryExternalSyntheticLambda15 implements Parcelable {
    public static final Parcelable.Creator<ProducerSequenceFactoryExternalSyntheticLambda15> CREATOR = new onWarmupCompleted();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;

    @SerializedName("approvalProbabilityForAllRejected")
    private final String approvalProbabilityForAllRejected;

    @SerializedName("automobileBannerInfo")
    private final BufferedDiskCacheExternalSyntheticLambda3 automobileBannerInfo;

    @SerializedName("betterThanBeforeInfo")
    private final BufferedDiskCacheExternalSyntheticLambda5 betterThanBeforeInfo;

    @SerializedName("couponBannerInfo")
    private final RotationOptionsRotation couponBannerInfo;

    @SerializedName("creditAppliedLoanCount")
    private final long creditAppliedLoanCount;

    @SerializedName("currentPreScreenType")
    private final onExtraCallbackWithResult currentPreScreenType;

    @SerializedName("defaultSortType")
    private final String decidedSortingType;
    private ProducerSequenceFactoryExternalSyntheticLambda8 defaultSortingType;

    @SerializedName("disclaimer")
    private final String disclaimer;
    private Throwable error;

    @SerializedName("existingHighestInterestLoanInfo")
    private final getHigherPriority existingHighestInterestLoanInfo;

    @SerializedName("isAllRejected")
    private final boolean isAllRejected;

    @SerializedName("jeonseAppliedLoanCount")
    private final long jeonseAppliedLoanCount;

    @SerializedName("livingStabilizationTitle")
    private final String livingStabilizationTitle;

    @SerializedName("loanApplyRemainSecond")
    private final long loanApplyRemainSecond;

    @SerializedName("loanStatus")
    private final LoanProductStatus loanStatus;

    @SerializedName("notPreScreenedCompaniesCount")
    private final long notPreScreenedCompaniesCount;

    @SerializedName("peerInfo")
    private final PeerInfo peerInfo;

    @SerializedName("previousPrescreenInfo")
    private final ProducerSequenceFactoryExternalSyntheticLambda2 previousPrescreenInfo;

    @SerializedName("requestGroupType")
    private final String requestGroupType;

    @SerializedName("requestResultGroup")
    private final List<RequestResultGroup> requestResultGroup;

    @SerializedName("secondApplyRewardInfo")
    private final ProducerSequenceFactoryExternalSyntheticLambda7 secondApplyRewardInfo;

    @SerializedName("tip")
    private final String tip;

    @SerializedName("totalAppliedLoanCount")
    private final int totalAppliedLoanCount;

    public static final class onWarmupCompleted implements Parcelable.Creator<ProducerSequenceFactoryExternalSyntheticLambda15> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ ProducerSequenceFactoryExternalSyntheticLambda15 createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 59;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            ProducerSequenceFactoryExternalSyntheticLambda15 producerSequenceFactoryExternalSyntheticLambda15OnNavigationEvent = onNavigationEvent(parcel);
            int i4 = onExtraCallback + 85;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return producerSequenceFactoryExternalSyntheticLambda15OnNavigationEvent;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ ProducerSequenceFactoryExternalSyntheticLambda15[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 77;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            ProducerSequenceFactoryExternalSyntheticLambda15[] producerSequenceFactoryExternalSyntheticLambda15ArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            int i5 = onExtraCallback + 43;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return producerSequenceFactoryExternalSyntheticLambda15ArrOnExtraCallbackWithResult;
            }
            throw null;
        }

        public final ProducerSequenceFactoryExternalSyntheticLambda15[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 71;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            int i5 = i3 % 2;
            ProducerSequenceFactoryExternalSyntheticLambda15[] producerSequenceFactoryExternalSyntheticLambda15Arr = new ProducerSequenceFactoryExternalSyntheticLambda15[i];
            int i6 = i4 + 1;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                return producerSequenceFactoryExternalSyntheticLambda15Arr;
            }
            throw null;
        }

        public final ProducerSequenceFactoryExternalSyntheticLambda15 onNavigationEvent(Parcel parcel) {
            BufferedDiskCacheExternalSyntheticLambda5 bufferedDiskCacheExternalSyntheticLambda5CreateFromParcel;
            PeerInfo peerInfo;
            onExtraCallbackWithResult onextracallbackwithresult;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i2 = parcel.readInt();
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            long j3 = parcel.readLong();
            long j4 = parcel.readLong();
            int i3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i3);
            int i4 = 0;
            while (i4 != i3) {
                int i5 = onExtraCallback + 19;
                int i6 = i3;
                onWarmupCompleted = i5 % 128;
                int i7 = i5 % 2;
                arrayList.add(RequestResultGroup.CREATOR.createFromParcel(parcel));
                i4 = i7 != 0 ? i4 + 112 : i4 + 1;
                i3 = i6;
            }
            boolean z = parcel.readInt() != 0;
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i8 = onWarmupCompleted + 125;
                onExtraCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 42 / 0;
                }
                bufferedDiskCacheExternalSyntheticLambda5CreateFromParcel = null;
            } else {
                bufferedDiskCacheExternalSyntheticLambda5CreateFromParcel = BufferedDiskCacheExternalSyntheticLambda5.CREATOR.createFromParcel(parcel);
            }
            BufferedDiskCacheExternalSyntheticLambda5 bufferedDiskCacheExternalSyntheticLambda5 = bufferedDiskCacheExternalSyntheticLambda5CreateFromParcel;
            if (parcel.readInt() == 0) {
                peerInfo = null;
            } else {
                PeerInfo peerInfoCreateFromParcel = PeerInfo.CREATOR.createFromParcel(parcel);
                int i10 = onExtraCallback + 33;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
                peerInfo = peerInfoCreateFromParcel;
            }
            PeerInfo peerInfo2 = peerInfo;
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            ProducerSequenceFactoryExternalSyntheticLambda7 producerSequenceFactoryExternalSyntheticLambda7CreateFromParcel = parcel.readInt() == 0 ? null : ProducerSequenceFactoryExternalSyntheticLambda7.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                int i12 = onExtraCallback + 101;
                onWarmupCompleted = i12 % 128;
                if (i12 % 2 != 0) {
                    int i13 = 3 / 5;
                }
                onextracallbackwithresult = null;
            } else {
                onExtraCallbackWithResult onextracallbackwithresultValueOf = onExtraCallbackWithResult.valueOf(parcel.readString());
                int i14 = onWarmupCompleted + 55;
                onExtraCallback = i14 % 128;
                if (i14 % 2 == 0) {
                    int i15 = 3 / 3;
                }
                onextracallbackwithresult = onextracallbackwithresultValueOf;
            }
            return new ProducerSequenceFactoryExternalSyntheticLambda15(string, i2, j, j2, j3, j4, arrayList, z, string2, bufferedDiskCacheExternalSyntheticLambda5, peerInfo2, string3, string4, producerSequenceFactoryExternalSyntheticLambda7CreateFromParcel, onextracallbackwithresult, parcel.readInt() == 0 ? null : LoanProductStatus.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BufferedDiskCacheExternalSyntheticLambda3.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RotationOptionsRotation.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : getHigherPriority.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ProducerSequenceFactoryExternalSyntheticLambda2.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }
    }

    static {
        int i = onWarmupCompleted + 107;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ProducerSequenceFactoryExternalSyntheticLambda15() {
        this(null, 0, 0L, 0L, 0L, 0L, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194303, null);
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i6;
        int i9 = ~(i7 | i8 | i);
        int i10 = ~((~i) | i8 | i2);
        int i11 = i9 | i10;
        int i12 = ~(i8 | i2);
        int i13 = (~(i | i7)) | (~(i7 | i6)) | i10;
        int i14 = i2 + i6 + i4 + (1787548100 * i3) + (1101416392 * i5);
        int i15 = i14 * i14;
        int i16 = (((-61410478) * i2) - 623378432) + (561581232 * i6) + (i11 * (-311495855)) + ((-311495855) * i12) + (311495855 * i13) + (250085376 * i4) + ((-778043392) * i3) + ((-46137344) * i5) + (324403200 * i15);
        int i17 = (i2 * (-930662234)) + 656878810 + (i6 * (-930660720)) + (i11 * (-757)) + (i12 * (-757)) + (i13 * 757) + (i4 * (-930661477)) + (i3 * 2052861356) + (i5 * 749768216) + (i15 * (-2028863488));
        int i18 = i16 + (i17 * i17 * (-1850081280));
        return i18 != 1 ? i18 != 2 ? i18 != 3 ? onNavigationEvent(objArr) : onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr) : onExtraCallback(objArr);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        String str;
        BufferedDiskCacheExternalSyntheticLambda5 bufferedDiskCacheExternalSyntheticLambda5;
        ProducerSequenceFactoryExternalSyntheticLambda15 producerSequenceFactoryExternalSyntheticLambda15 = (ProducerSequenceFactoryExternalSyntheticLambda15) objArr[0];
        String str2 = (String) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        long jLongValue = ((Number) objArr[3]).longValue();
        long jLongValue2 = ((Number) objArr[4]).longValue();
        long jLongValue3 = ((Number) objArr[5]).longValue();
        long jLongValue4 = ((Number) objArr[6]).longValue();
        List<RequestResultGroup> list = (List) objArr[7];
        boolean zBooleanValue = ((Boolean) objArr[8]).booleanValue();
        String str3 = (String) objArr[9];
        BufferedDiskCacheExternalSyntheticLambda5 bufferedDiskCacheExternalSyntheticLambda52 = (BufferedDiskCacheExternalSyntheticLambda5) objArr[10];
        PeerInfo peerInfo = (PeerInfo) objArr[11];
        String str4 = (String) objArr[12];
        String str5 = (String) objArr[13];
        ProducerSequenceFactoryExternalSyntheticLambda7 producerSequenceFactoryExternalSyntheticLambda7 = (ProducerSequenceFactoryExternalSyntheticLambda7) objArr[14];
        onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) objArr[15];
        LoanProductStatus loanProductStatus = (LoanProductStatus) objArr[16];
        BufferedDiskCacheExternalSyntheticLambda3 bufferedDiskCacheExternalSyntheticLambda3 = (BufferedDiskCacheExternalSyntheticLambda3) objArr[17];
        RotationOptionsRotation rotationOptionsRotation = (RotationOptionsRotation) objArr[18];
        getHigherPriority gethigherpriority = (getHigherPriority) objArr[19];
        ProducerSequenceFactoryExternalSyntheticLambda2 producerSequenceFactoryExternalSyntheticLambda2 = (ProducerSequenceFactoryExternalSyntheticLambda2) objArr[20];
        String str6 = (String) objArr[21];
        String str7 = (String) objArr[22];
        int iIntValue2 = ((Number) objArr[23]).intValue();
        Object obj = objArr[24];
        int i = 2 % 2;
        if ((iIntValue2 & 1) != 0) {
            int i2 = onExtraCallback + 9;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                String str8 = producerSequenceFactoryExternalSyntheticLambda15.tip;
                throw null;
            }
            str2 = producerSequenceFactoryExternalSyntheticLambda15.tip;
        }
        if ((iIntValue2 & 2) != 0) {
            int i3 = onExtraCallback + 43;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            iIntValue = producerSequenceFactoryExternalSyntheticLambda15.totalAppliedLoanCount;
        }
        if ((iIntValue2 & 4) != 0) {
            jLongValue = producerSequenceFactoryExternalSyntheticLambda15.creditAppliedLoanCount;
        }
        if ((iIntValue2 & 8) != 0) {
            jLongValue2 = producerSequenceFactoryExternalSyntheticLambda15.jeonseAppliedLoanCount;
        }
        if ((iIntValue2 & 16) != 0) {
            jLongValue3 = producerSequenceFactoryExternalSyntheticLambda15.notPreScreenedCompaniesCount;
        }
        if ((iIntValue2 & 32) != 0) {
            jLongValue4 = producerSequenceFactoryExternalSyntheticLambda15.loanApplyRemainSecond;
        }
        if ((iIntValue2 & 64) != 0) {
            list = producerSequenceFactoryExternalSyntheticLambda15.requestResultGroup;
        }
        if ((iIntValue2 & 128) != 0) {
            zBooleanValue = producerSequenceFactoryExternalSyntheticLambda15.isAllRejected;
        }
        String str9 = (iIntValue2 & 256) != 0 ? producerSequenceFactoryExternalSyntheticLambda15.requestGroupType : str3;
        if ((iIntValue2 & 512) != 0) {
            int i5 = onExtraCallback + 113;
            str = str9;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                bufferedDiskCacheExternalSyntheticLambda5 = producerSequenceFactoryExternalSyntheticLambda15.betterThanBeforeInfo;
                int i6 = 88 / 0;
            } else {
                bufferedDiskCacheExternalSyntheticLambda5 = producerSequenceFactoryExternalSyntheticLambda15.betterThanBeforeInfo;
            }
            bufferedDiskCacheExternalSyntheticLambda52 = bufferedDiskCacheExternalSyntheticLambda5;
        } else {
            str = str9;
        }
        if ((iIntValue2 & 1024) != 0) {
            PeerInfo peerInfo2 = producerSequenceFactoryExternalSyntheticLambda15.peerInfo;
            int i7 = onExtraCallbackWithResult + 69;
            peerInfo = peerInfo2;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
        }
        if ((iIntValue2 & 2048) != 0) {
            int i9 = onExtraCallbackWithResult + 77;
            onExtraCallback = i9 % 128;
            if (i9 % 2 == 0) {
                String str10 = producerSequenceFactoryExternalSyntheticLambda15.disclaimer;
                throw null;
            }
            str4 = producerSequenceFactoryExternalSyntheticLambda15.disclaimer;
        }
        if ((iIntValue2 & 4096) != 0) {
            int i10 = onExtraCallbackWithResult + 99;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            str5 = producerSequenceFactoryExternalSyntheticLambda15.approvalProbabilityForAllRejected;
        }
        if ((iIntValue2 & 8192) != 0) {
            producerSequenceFactoryExternalSyntheticLambda7 = producerSequenceFactoryExternalSyntheticLambda15.secondApplyRewardInfo;
        }
        if ((iIntValue2 & 16384) != 0) {
            int i12 = onExtraCallbackWithResult + 37;
            onExtraCallback = i12 % 128;
            int i13 = i12 % 2;
            onextracallbackwithresult = producerSequenceFactoryExternalSyntheticLambda15.currentPreScreenType;
        }
        if ((32768 & iIntValue2) != 0) {
            loanProductStatus = producerSequenceFactoryExternalSyntheticLambda15.loanStatus;
        }
        if ((65536 & iIntValue2) != 0) {
            bufferedDiskCacheExternalSyntheticLambda3 = producerSequenceFactoryExternalSyntheticLambda15.automobileBannerInfo;
        }
        if ((131072 & iIntValue2) != 0) {
            rotationOptionsRotation = producerSequenceFactoryExternalSyntheticLambda15.couponBannerInfo;
        }
        if ((262144 & iIntValue2) != 0) {
            gethigherpriority = producerSequenceFactoryExternalSyntheticLambda15.existingHighestInterestLoanInfo;
        }
        if ((524288 & iIntValue2) != 0) {
            producerSequenceFactoryExternalSyntheticLambda2 = producerSequenceFactoryExternalSyntheticLambda15.previousPrescreenInfo;
        }
        if ((1048576 & iIntValue2) != 0) {
            str6 = producerSequenceFactoryExternalSyntheticLambda15.decidedSortingType;
        }
        return producerSequenceFactoryExternalSyntheticLambda15.onWarmupCompleted(str2, iIntValue, jLongValue, jLongValue2, jLongValue3, jLongValue4, list, zBooleanValue, str, bufferedDiskCacheExternalSyntheticLambda52, peerInfo, str4, str5, producerSequenceFactoryExternalSyntheticLambda7, onextracallbackwithresult, loanProductStatus, bufferedDiskCacheExternalSyntheticLambda3, rotationOptionsRotation, gethigherpriority, producerSequenceFactoryExternalSyntheticLambda2, str6, (iIntValue2 & 2097152) != 0 ? producerSequenceFactoryExternalSyntheticLambda15.livingStabilizationTitle : str7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        onExtraCallback = i2 % 128;
        return i2 % 2 == 0 ? 1 : 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProducerSequenceFactoryExternalSyntheticLambda15)) {
            return false;
        }
        ProducerSequenceFactoryExternalSyntheticLambda15 producerSequenceFactoryExternalSyntheticLambda15 = (ProducerSequenceFactoryExternalSyntheticLambda15) obj;
        if (!Intrinsics.areEqual(this.tip, producerSequenceFactoryExternalSyntheticLambda15.tip)) {
            int i2 = onExtraCallbackWithResult + 23;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (this.totalAppliedLoanCount != producerSequenceFactoryExternalSyntheticLambda15.totalAppliedLoanCount) {
            int i4 = onExtraCallbackWithResult + 89;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.creditAppliedLoanCount != producerSequenceFactoryExternalSyntheticLambda15.creditAppliedLoanCount) {
            int i6 = onExtraCallback + 89;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.jeonseAppliedLoanCount != producerSequenceFactoryExternalSyntheticLambda15.jeonseAppliedLoanCount) {
            return false;
        }
        if (this.notPreScreenedCompaniesCount != producerSequenceFactoryExternalSyntheticLambda15.notPreScreenedCompaniesCount) {
            int i8 = onExtraCallbackWithResult + 95;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (this.loanApplyRemainSecond != producerSequenceFactoryExternalSyntheticLambda15.loanApplyRemainSecond) {
            int i10 = onExtraCallbackWithResult + 115;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.requestResultGroup, producerSequenceFactoryExternalSyntheticLambda15.requestResultGroup) || this.isAllRejected != producerSequenceFactoryExternalSyntheticLambda15.isAllRejected || !Intrinsics.areEqual(this.requestGroupType, producerSequenceFactoryExternalSyntheticLambda15.requestGroupType) || !Intrinsics.areEqual(this.betterThanBeforeInfo, producerSequenceFactoryExternalSyntheticLambda15.betterThanBeforeInfo) || !Intrinsics.areEqual(this.peerInfo, producerSequenceFactoryExternalSyntheticLambda15.peerInfo) || !Intrinsics.areEqual(this.disclaimer, producerSequenceFactoryExternalSyntheticLambda15.disclaimer) || !Intrinsics.areEqual(this.approvalProbabilityForAllRejected, producerSequenceFactoryExternalSyntheticLambda15.approvalProbabilityForAllRejected) || !Intrinsics.areEqual(this.secondApplyRewardInfo, producerSequenceFactoryExternalSyntheticLambda15.secondApplyRewardInfo) || this.currentPreScreenType != producerSequenceFactoryExternalSyntheticLambda15.currentPreScreenType || this.loanStatus != producerSequenceFactoryExternalSyntheticLambda15.loanStatus || !Intrinsics.areEqual(this.automobileBannerInfo, producerSequenceFactoryExternalSyntheticLambda15.automobileBannerInfo)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.couponBannerInfo, producerSequenceFactoryExternalSyntheticLambda15.couponBannerInfo)) {
            int i12 = onExtraCallback + 85;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.existingHighestInterestLoanInfo, producerSequenceFactoryExternalSyntheticLambda15.existingHighestInterestLoanInfo) || !Intrinsics.areEqual(this.previousPrescreenInfo, producerSequenceFactoryExternalSyntheticLambda15.previousPrescreenInfo)) {
            return false;
        }
        if (Intrinsics.areEqual(this.decidedSortingType, producerSequenceFactoryExternalSyntheticLambda15.decidedSortingType)) {
            return Intrinsics.areEqual(this.livingStabilizationTitle, producerSequenceFactoryExternalSyntheticLambda15.livingStabilizationTitle);
        }
        int i14 = onExtraCallback + 37;
        onExtraCallbackWithResult = i14 % 128;
        int i15 = i14 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i;
        int iHashCode5;
        int i2;
        int iHashCode6;
        int i3;
        int iHashCode7;
        int i4 = 2 % 2;
        String str = this.tip;
        if (str == null) {
            int i5 = onExtraCallback + 23;
            onExtraCallbackWithResult = i5 % 128;
            iHashCode = i5 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iHashCode8 = Integer.hashCode(this.totalAppliedLoanCount);
        int iHashCode9 = Long.hashCode(this.creditAppliedLoanCount);
        int iHashCode10 = Long.hashCode(this.jeonseAppliedLoanCount);
        int iHashCode11 = Long.hashCode(this.notPreScreenedCompaniesCount);
        int iHashCode12 = Long.hashCode(this.loanApplyRemainSecond);
        int iHashCode13 = this.requestResultGroup.hashCode();
        int iHashCode14 = Boolean.hashCode(this.isAllRejected);
        int iHashCode15 = this.requestGroupType.hashCode();
        BufferedDiskCacheExternalSyntheticLambda5 bufferedDiskCacheExternalSyntheticLambda5 = this.betterThanBeforeInfo;
        if (bufferedDiskCacheExternalSyntheticLambda5 == null) {
            int i6 = onExtraCallback + 49;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = bufferedDiskCacheExternalSyntheticLambda5.hashCode();
        }
        PeerInfo peerInfo = this.peerInfo;
        if (peerInfo == null) {
            int i8 = onExtraCallback + 81;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = peerInfo.hashCode();
        }
        String str2 = this.disclaimer;
        if (str2 == null) {
            int i10 = onExtraCallback + 39;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str2.hashCode();
        }
        String str3 = this.approvalProbabilityForAllRejected;
        int iHashCode16 = str3 == null ? 0 : str3.hashCode();
        ProducerSequenceFactoryExternalSyntheticLambda7 producerSequenceFactoryExternalSyntheticLambda7 = this.secondApplyRewardInfo;
        if (producerSequenceFactoryExternalSyntheticLambda7 == null) {
            int i12 = onExtraCallbackWithResult + 55;
            i = iHashCode16;
            onExtraCallback = i12 % 128;
            iHashCode5 = i12 % 2 == 0 ? 1 : 0;
        } else {
            i = iHashCode16;
            iHashCode5 = producerSequenceFactoryExternalSyntheticLambda7.hashCode();
        }
        onExtraCallbackWithResult onextracallbackwithresult = this.currentPreScreenType;
        int iHashCode17 = onextracallbackwithresult == null ? 0 : onextracallbackwithresult.hashCode();
        LoanProductStatus loanProductStatus = this.loanStatus;
        int iHashCode18 = loanProductStatus == null ? 0 : loanProductStatus.hashCode();
        BufferedDiskCacheExternalSyntheticLambda3 bufferedDiskCacheExternalSyntheticLambda3 = this.automobileBannerInfo;
        int iHashCode19 = bufferedDiskCacheExternalSyntheticLambda3 == null ? 0 : bufferedDiskCacheExternalSyntheticLambda3.hashCode();
        RotationOptionsRotation rotationOptionsRotation = this.couponBannerInfo;
        if (rotationOptionsRotation == null) {
            int i13 = onExtraCallbackWithResult + 13;
            i2 = iHashCode17;
            onExtraCallback = i13 % 128;
            int i14 = i13 % 2;
            iHashCode6 = 0;
        } else {
            i2 = iHashCode17;
            iHashCode6 = rotationOptionsRotation.hashCode();
        }
        getHigherPriority gethigherpriority = this.existingHighestInterestLoanInfo;
        int iHashCode20 = gethigherpriority == null ? 0 : gethigherpriority.hashCode();
        ProducerSequenceFactoryExternalSyntheticLambda2 producerSequenceFactoryExternalSyntheticLambda2 = this.previousPrescreenInfo;
        int iHashCode21 = producerSequenceFactoryExternalSyntheticLambda2 == null ? 0 : producerSequenceFactoryExternalSyntheticLambda2.hashCode();
        String str4 = this.decidedSortingType;
        if (str4 == null) {
            int i15 = onExtraCallback + 51;
            i3 = iHashCode6;
            onExtraCallbackWithResult = i15 % 128;
            iHashCode7 = i15 % 2 != 0 ? 1 : 0;
        } else {
            i3 = iHashCode6;
            iHashCode7 = str4.hashCode();
        }
        String str5 = this.livingStabilizationTitle;
        return (((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + i) * 31) + iHashCode5) * 31) + i2) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + i3) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode7) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    public final ProducerSequenceFactoryExternalSyntheticLambda15 onWarmupCompleted(@Nullable String str, int i, long j, long j2, long j3, long j4, @NotNull List<RequestResultGroup> list, boolean z, @NotNull String str2, @Nullable BufferedDiskCacheExternalSyntheticLambda5 bufferedDiskCacheExternalSyntheticLambda5, @Nullable PeerInfo peerInfo, @Nullable String str3, @Nullable String str4, @Nullable ProducerSequenceFactoryExternalSyntheticLambda7 producerSequenceFactoryExternalSyntheticLambda7, @Nullable onExtraCallbackWithResult onextracallbackwithresult, @Nullable LoanProductStatus loanProductStatus, @Nullable BufferedDiskCacheExternalSyntheticLambda3 bufferedDiskCacheExternalSyntheticLambda3, @Nullable RotationOptionsRotation rotationOptionsRotation, @Nullable getHigherPriority gethigherpriority, @Nullable ProducerSequenceFactoryExternalSyntheticLambda2 producerSequenceFactoryExternalSyntheticLambda2, @Nullable String str5, @Nullable String str6) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        ProducerSequenceFactoryExternalSyntheticLambda15 producerSequenceFactoryExternalSyntheticLambda15 = new ProducerSequenceFactoryExternalSyntheticLambda15(str, i, j, j2, j3, j4, list, z, str2, bufferedDiskCacheExternalSyntheticLambda5, peerInfo, str3, str4, producerSequenceFactoryExternalSyntheticLambda7, onextracallbackwithresult, loanProductStatus, bufferedDiskCacheExternalSyntheticLambda3, rotationOptionsRotation, gethigherpriority, producerSequenceFactoryExternalSyntheticLambda2, str5, str6);
        int i3 = onExtraCallback + 9;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return producerSequenceFactoryExternalSyntheticLambda15;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PreScreeningResult(tip=" + this.tip + ", totalAppliedLoanCount=" + this.totalAppliedLoanCount + ", creditAppliedLoanCount=" + this.creditAppliedLoanCount + ", jeonseAppliedLoanCount=" + this.jeonseAppliedLoanCount + ", notPreScreenedCompaniesCount=" + this.notPreScreenedCompaniesCount + ", loanApplyRemainSecond=" + this.loanApplyRemainSecond + ", requestResultGroup=" + this.requestResultGroup + ", isAllRejected=" + this.isAllRejected + ", requestGroupType=" + this.requestGroupType + ", betterThanBeforeInfo=" + this.betterThanBeforeInfo + ", peerInfo=" + this.peerInfo + ", disclaimer=" + this.disclaimer + ", approvalProbabilityForAllRejected=" + this.approvalProbabilityForAllRejected + ", secondApplyRewardInfo=" + this.secondApplyRewardInfo + ", currentPreScreenType=" + this.currentPreScreenType + ", loanStatus=" + this.loanStatus + ", automobileBannerInfo=" + this.automobileBannerInfo + ", couponBannerInfo=" + this.couponBannerInfo + ", existingHighestInterestLoanInfo=" + this.existingHighestInterestLoanInfo + ", previousPrescreenInfo=" + this.previousPrescreenInfo + ", decidedSortingType=" + this.decidedSortingType + ", livingStabilizationTitle=" + this.livingStabilizationTitle + ")";
        int i2 = onExtraCallbackWithResult + 121;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 5;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.tip);
        parcel.writeInt(this.totalAppliedLoanCount);
        parcel.writeLong(this.creditAppliedLoanCount);
        parcel.writeLong(this.jeonseAppliedLoanCount);
        parcel.writeLong(this.notPreScreenedCompaniesCount);
        parcel.writeLong(this.loanApplyRemainSecond);
        List<RequestResultGroup> list = this.requestResultGroup;
        parcel.writeInt(list.size());
        Iterator<RequestResultGroup> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isAllRejected ? 1 : 0);
        parcel.writeString(this.requestGroupType);
        BufferedDiskCacheExternalSyntheticLambda5 bufferedDiskCacheExternalSyntheticLambda5 = this.betterThanBeforeInfo;
        if (bufferedDiskCacheExternalSyntheticLambda5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bufferedDiskCacheExternalSyntheticLambda5.writeToParcel(parcel, i);
        }
        PeerInfo peerInfo = this.peerInfo;
        if (peerInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            peerInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.disclaimer);
        parcel.writeString(this.approvalProbabilityForAllRejected);
        ProducerSequenceFactoryExternalSyntheticLambda7 producerSequenceFactoryExternalSyntheticLambda7 = this.secondApplyRewardInfo;
        if (producerSequenceFactoryExternalSyntheticLambda7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            producerSequenceFactoryExternalSyntheticLambda7.writeToParcel(parcel, i);
        }
        onExtraCallbackWithResult onextracallbackwithresult = this.currentPreScreenType;
        if (onextracallbackwithresult == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(onextracallbackwithresult.name());
        }
        LoanProductStatus loanProductStatus = this.loanStatus;
        if (loanProductStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            loanProductStatus.writeToParcel(parcel, i);
        }
        BufferedDiskCacheExternalSyntheticLambda3 bufferedDiskCacheExternalSyntheticLambda3 = this.automobileBannerInfo;
        if (bufferedDiskCacheExternalSyntheticLambda3 == null) {
            int i5 = onExtraCallbackWithResult + 99;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                parcel.writeInt(1);
            } else {
                parcel.writeInt(0);
            }
        } else {
            parcel.writeInt(1);
            bufferedDiskCacheExternalSyntheticLambda3.writeToParcel(parcel, i);
        }
        RotationOptionsRotation rotationOptionsRotation = this.couponBannerInfo;
        if (rotationOptionsRotation == null) {
            int i6 = onExtraCallbackWithResult + 23;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            parcel.writeInt(0);
            int i8 = onExtraCallbackWithResult + 17;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
        } else {
            parcel.writeInt(1);
            rotationOptionsRotation.writeToParcel(parcel, i);
        }
        getHigherPriority gethigherpriority = this.existingHighestInterestLoanInfo;
        if (gethigherpriority == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gethigherpriority.writeToParcel(parcel, i);
        }
        ProducerSequenceFactoryExternalSyntheticLambda2 producerSequenceFactoryExternalSyntheticLambda2 = this.previousPrescreenInfo;
        if (producerSequenceFactoryExternalSyntheticLambda2 == null) {
            int i10 = onExtraCallback + 65;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            producerSequenceFactoryExternalSyntheticLambda2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.decidedSortingType);
        parcel.writeString(this.livingStabilizationTitle);
    }

    public ProducerSequenceFactoryExternalSyntheticLambda15(@Nullable String str, int i, long j, long j2, long j3, long j4, @NotNull List<RequestResultGroup> list, boolean z, @NotNull String str2, @Nullable BufferedDiskCacheExternalSyntheticLambda5 bufferedDiskCacheExternalSyntheticLambda5, @Nullable PeerInfo peerInfo, @Nullable String str3, @Nullable String str4, @Nullable ProducerSequenceFactoryExternalSyntheticLambda7 producerSequenceFactoryExternalSyntheticLambda7, @Nullable onExtraCallbackWithResult onextracallbackwithresult, @Nullable LoanProductStatus loanProductStatus, @Nullable BufferedDiskCacheExternalSyntheticLambda3 bufferedDiskCacheExternalSyntheticLambda3, @Nullable RotationOptionsRotation rotationOptionsRotation, @Nullable getHigherPriority gethigherpriority, @Nullable ProducerSequenceFactoryExternalSyntheticLambda2 producerSequenceFactoryExternalSyntheticLambda2, @Nullable String str5, @Nullable String str6) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.tip = str;
        this.totalAppliedLoanCount = i;
        this.creditAppliedLoanCount = j;
        this.jeonseAppliedLoanCount = j2;
        this.notPreScreenedCompaniesCount = j3;
        this.loanApplyRemainSecond = j4;
        this.requestResultGroup = list;
        this.isAllRejected = z;
        this.requestGroupType = str2;
        this.betterThanBeforeInfo = bufferedDiskCacheExternalSyntheticLambda5;
        this.peerInfo = peerInfo;
        this.disclaimer = str3;
        this.approvalProbabilityForAllRejected = str4;
        this.secondApplyRewardInfo = producerSequenceFactoryExternalSyntheticLambda7;
        this.currentPreScreenType = onextracallbackwithresult;
        this.loanStatus = loanProductStatus;
        this.automobileBannerInfo = bufferedDiskCacheExternalSyntheticLambda3;
        this.couponBannerInfo = rotationOptionsRotation;
        this.existingHighestInterestLoanInfo = gethigherpriority;
        this.previousPrescreenInfo = producerSequenceFactoryExternalSyntheticLambda2;
        this.decidedSortingType = str5;
        this.livingStabilizationTitle = str6;
    }

    public final String access000() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.tip;
        int i5 = i3 + 15;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final long onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        long j = this.loanApplyRemainSecond;
        int i5 = i3 + 55;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final List<RequestResultGroup> IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<RequestResultGroup> list = this.requestResultGroup;
        int i4 = i3 + 53;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 25 / 0;
        }
        return list;
    }

    public final boolean getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        boolean z = this.isAllRejected;
        int i5 = i3 + 75;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ProducerSequenceFactoryExternalSyntheticLambda15(String str, int i, long j, long j2, long j3, long j4, List list, boolean z, String str2, BufferedDiskCacheExternalSyntheticLambda5 bufferedDiskCacheExternalSyntheticLambda5, PeerInfo peerInfo, String str3, String str4, ProducerSequenceFactoryExternalSyntheticLambda7 producerSequenceFactoryExternalSyntheticLambda7, onExtraCallbackWithResult onextracallbackwithresult, LoanProductStatus loanProductStatus, BufferedDiskCacheExternalSyntheticLambda3 bufferedDiskCacheExternalSyntheticLambda3, RotationOptionsRotation rotationOptionsRotation, getHigherPriority gethigherpriority, ProducerSequenceFactoryExternalSyntheticLambda2 producerSequenceFactoryExternalSyntheticLambda2, String str5, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        int i3;
        long j5;
        String str7;
        BufferedDiskCacheExternalSyntheticLambda5 bufferedDiskCacheExternalSyntheticLambda52;
        PeerInfo peerInfo2;
        PeerInfo peerInfo3;
        String str8;
        BufferedDiskCacheExternalSyntheticLambda3 bufferedDiskCacheExternalSyntheticLambda32;
        onExtraCallbackWithResult onextracallbackwithresult2;
        String str9;
        Object obj = null;
        String str10 = (i2 & 1) != 0 ? null : str;
        if ((i2 & 2) != 0) {
            int i4 = onExtraCallback + 119;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            i3 = -1;
        } else {
            i3 = i;
        }
        long j6 = (i2 & 4) != 0 ? -1L : j;
        if ((i2 & 8) != 0) {
            int i5 = 2 % 2;
            j5 = -1;
        } else {
            j5 = j2;
        }
        long j7 = (i2 & 16) != 0 ? -1L : j3;
        long j8 = (i2 & 32) == 0 ? j4 : -1L;
        List listEmptyList = (i2 & 64) != 0 ? CollectionsKt.emptyList() : list;
        boolean z2 = (i2 & 128) != 0 ? false : z;
        if ((i2 & 256) != 0) {
            int i6 = onExtraCallback + 61;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int i7 = 2 % 2;
            str7 = "";
        } else {
            str7 = str2;
        }
        if ((i2 & 512) != 0) {
            int i8 = 2 % 2;
            bufferedDiskCacheExternalSyntheticLambda52 = null;
        } else {
            bufferedDiskCacheExternalSyntheticLambda52 = bufferedDiskCacheExternalSyntheticLambda5;
        }
        BufferedDiskCacheExternalSyntheticLambda5 bufferedDiskCacheExternalSyntheticLambda53 = bufferedDiskCacheExternalSyntheticLambda52;
        if ((i2 & 1024) != 0) {
            int i9 = 2 % 2;
            peerInfo2 = null;
        } else {
            peerInfo2 = peerInfo;
        }
        if ((i2 & 2048) != 0) {
            int i10 = onExtraCallback + 9;
            peerInfo3 = peerInfo2;
            onExtraCallbackWithResult = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 26 / 0;
            }
            str8 = null;
        } else {
            peerInfo3 = peerInfo2;
            str8 = str3;
        }
        String str11 = (i2 & 4096) != 0 ? null : str4;
        ProducerSequenceFactoryExternalSyntheticLambda7 producerSequenceFactoryExternalSyntheticLambda72 = (i2 & 8192) != 0 ? null : producerSequenceFactoryExternalSyntheticLambda7;
        onExtraCallbackWithResult onextracallbackwithresult3 = (i2 & 16384) != 0 ? null : onextracallbackwithresult;
        LoanProductStatus loanProductStatus2 = (i2 & 32768) != 0 ? null : loanProductStatus;
        if ((i2 & 65536) != 0) {
            int i12 = 2 % 2;
            bufferedDiskCacheExternalSyntheticLambda32 = null;
        } else {
            bufferedDiskCacheExternalSyntheticLambda32 = bufferedDiskCacheExternalSyntheticLambda3;
        }
        RotationOptionsRotation rotationOptionsRotation2 = (i2 & 131072) != 0 ? null : rotationOptionsRotation;
        getHigherPriority gethigherpriority2 = (i2 & 262144) != 0 ? null : gethigherpriority;
        ProducerSequenceFactoryExternalSyntheticLambda2 producerSequenceFactoryExternalSyntheticLambda22 = (i2 & 524288) != 0 ? null : producerSequenceFactoryExternalSyntheticLambda2;
        String str12 = (i2 & 1048576) != 0 ? null : str5;
        if ((i2 & 2097152) != 0) {
            int i13 = onExtraCallbackWithResult + 5;
            onextracallbackwithresult2 = onextracallbackwithresult3;
            onExtraCallback = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 45 / 0;
            }
            str9 = null;
        } else {
            onextracallbackwithresult2 = onextracallbackwithresult3;
            str9 = str6;
        }
        this(str10, i3, j6, j5, j7, j8, listEmptyList, z2, str7, bufferedDiskCacheExternalSyntheticLambda53, peerInfo3, str8, str11, producerSequenceFactoryExternalSyntheticLambda72, onextracallbackwithresult2, loanProductStatus2, bufferedDiskCacheExternalSyntheticLambda32, rotationOptionsRotation2, gethigherpriority2, producerSequenceFactoryExternalSyntheticLambda22, str12, str9);
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 23;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.disclaimer;
        int i4 = i2 + 71;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.approvalProbabilityForAllRejected;
        int i4 = i3 + 45;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final ProducerSequenceFactoryExternalSyntheticLambda7 IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        ProducerSequenceFactoryExternalSyntheticLambda7 producerSequenceFactoryExternalSyntheticLambda7 = this.secondApplyRewardInfo;
        int i4 = i3 + 15;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return producerSequenceFactoryExternalSyntheticLambda7;
        }
        throw null;
    }

    public final BufferedDiskCacheExternalSyntheticLambda3 onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.automobileBannerInfo;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final RotationOptionsRotation onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 19;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        RotationOptionsRotation rotationOptionsRotation = this.couponBannerInfo;
        int i5 = i2 + 115;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return rotationOptionsRotation;
    }

    public final getHigherPriority asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.existingHighestInterestLoanInfo;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ProducerSequenceFactoryExternalSyntheticLambda2 IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ProducerSequenceFactoryExternalSyntheticLambda2 producerSequenceFactoryExternalSyntheticLambda2 = this.previousPrescreenInfo;
        int i4 = i3 + 19;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return producerSequenceFactoryExternalSyntheticLambda2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        ProducerSequenceFactoryExternalSyntheticLambda15 producerSequenceFactoryExternalSyntheticLambda15 = (ProducerSequenceFactoryExternalSyntheticLambda15) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = producerSequenceFactoryExternalSyntheticLambda15.livingStabilizationTitle;
        int i5 = i3 + 11;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void onExtraCallback(@Nullable ProducerSequenceFactoryExternalSyntheticLambda8 producerSequenceFactoryExternalSyntheticLambda8) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        this.defaultSortingType = producerSequenceFactoryExternalSyntheticLambda8;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        ProducerSequenceFactoryExternalSyntheticLambda15 producerSequenceFactoryExternalSyntheticLambda15 = (ProducerSequenceFactoryExternalSyntheticLambda15) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = producerSequenceFactoryExternalSyntheticLambda15.decidedSortingType;
        if (str != null) {
            int i5 = i3 + 71;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            ProducerSequenceFactoryExternalSyntheticLambda8 producerSequenceFactoryExternalSyntheticLambda8OnExtraCallbackWithResult = ProducerSequenceFactoryExternalSyntheticLambda8.Companion.onExtraCallbackWithResult(str);
            if (producerSequenceFactoryExternalSyntheticLambda8OnExtraCallbackWithResult != null) {
                int i7 = onExtraCallback + 11;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                return producerSequenceFactoryExternalSyntheticLambda8OnExtraCallbackWithResult;
            }
        }
        ProducerSequenceFactoryExternalSyntheticLambda8 producerSequenceFactoryExternalSyntheticLambda8 = producerSequenceFactoryExternalSyntheticLambda15.defaultSortingType;
        int i9 = onExtraCallbackWithResult + 115;
        onExtraCallback = i9 % 128;
        int i10 = i9 % 2;
        return producerSequenceFactoryExternalSyntheticLambda8;
    }

    public final List<RequestResultGroup> onExtraCallbackWithResult(@NotNull RequestResultGroup.GroupType groupType) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(groupType, "");
        List<RequestResultGroup> list = this.requestResultGroup;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            int i2 = onExtraCallback + 107;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            RequestResultGroup requestResultGroup = (RequestResultGroup) obj;
            if (!(!Intrinsics.areEqual(requestResultGroup.onNavigationEvent().getSectionName(), groupType.getSectionName()))) {
                int i4 = onExtraCallback + 95;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    requestResultGroup.onExtraCallbackWithResult().isEmpty();
                    throw null;
                }
                if (!requestResultGroup.onExtraCallbackWithResult().isEmpty()) {
                    arrayList.add(obj);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        int i5 = onExtraCallbackWithResult + 107;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return arrayList;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        ProducerSequenceFactoryExternalSyntheticLambda15 producerSequenceFactoryExternalSyntheticLambda15 = (ProducerSequenceFactoryExternalSyntheticLambda15) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        LoanProductStatus loanProductStatus = producerSequenceFactoryExternalSyntheticLambda15.loanStatus;
        if (i3 != 0) {
            LoanProductStatus loanProductStatus2 = LoanProductStatus.PRE_SCREENING_REQUEST;
            obj.hashCode();
            throw null;
        }
        if (loanProductStatus == LoanProductStatus.PRE_SCREENING_REQUEST) {
            return true;
        }
        int i4 = onExtraCallbackWithResult + 65;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zContains = CollectionsKt.contains(CollectionsKt.listOf(new LoanProductStatus[]{LoanProductStatus.PRE_SCREENING_APPROVE, LoanProductStatus.PRE_SCREENING_DONE, LoanProductStatus.PRE_SCREENING_FAIL, LoanProductStatus.PRE_SCREENING_DROP}), this.loanStatus);
        int i4 = onExtraCallbackWithResult + 101;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return zContains;
        }
        throw null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallbackWithResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallbackWithResult[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        public static final onExtraCallbackWithResult PRE_SCREEN = new onExtraCallbackWithResult("PRE_SCREEN", 0);
        public static final onExtraCallbackWithResult AUTOMOBILE_PRE_SCREEN_RETRY = new onExtraCallbackWithResult("AUTOMOBILE_PRE_SCREEN_RETRY", 1);

        private static final /* synthetic */ onExtraCallbackWithResult[] $values() {
            onExtraCallbackWithResult[] onextracallbackwithresultArr;
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 73;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                onExtraCallbackWithResult onextracallbackwithresult = PRE_SCREEN;
                onExtraCallbackWithResult onextracallbackwithresult2 = AUTOMOBILE_PRE_SCREEN_RETRY;
                onextracallbackwithresultArr = new onExtraCallbackWithResult[4];
                onextracallbackwithresultArr[1] = onextracallbackwithresult;
                onextracallbackwithresultArr[0] = onextracallbackwithresult2;
            } else {
                onextracallbackwithresultArr = new onExtraCallbackWithResult[]{PRE_SCREEN, AUTOMOBILE_PRE_SCREEN_RETRY};
            }
            int i4 = i2 + 101;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 83 / 0;
            }
            return onextracallbackwithresultArr;
        }

        public static EnumEntries<onExtraCallbackWithResult> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 17;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<onExtraCallbackWithResult> enumEntries = $ENTRIES;
            int i5 = i2 + 105;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 60 / 0;
            }
            return enumEntries;
        }

        public static onExtraCallbackWithResult valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 75;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) Enum.valueOf(onExtraCallbackWithResult.class, str);
            if (i3 == 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = onExtraCallback + 45;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return onextracallbackwithresult;
            }
            throw null;
        }

        public static onExtraCallbackWithResult[] values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 123;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = $VALUES;
            if (i3 != 0) {
                return (onExtraCallbackWithResult[]) onextracallbackwithresultArr.clone();
            }
            int i4 = 10 / 0;
            return (onExtraCallbackWithResult[]) onextracallbackwithresultArr.clone();
        }

        private onExtraCallbackWithResult(String str, int i) {
        }

        static {
            onExtraCallbackWithResult[] onextracallbackwithresultArr$values = $values();
            $VALUES = onextracallbackwithresultArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackwithresultArr$values);
            int i = onNavigationEvent + 15;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
    }

    public static /* synthetic */ ProducerSequenceFactoryExternalSyntheticLambda15 onNavigationEvent(ProducerSequenceFactoryExternalSyntheticLambda15 producerSequenceFactoryExternalSyntheticLambda15, String str, int i, long j, long j2, long j3, long j4, List list, boolean z, String str2, BufferedDiskCacheExternalSyntheticLambda5 bufferedDiskCacheExternalSyntheticLambda5, PeerInfo peerInfo, String str3, String str4, ProducerSequenceFactoryExternalSyntheticLambda7 producerSequenceFactoryExternalSyntheticLambda7, onExtraCallbackWithResult onextracallbackwithresult, LoanProductStatus loanProductStatus, BufferedDiskCacheExternalSyntheticLambda3 bufferedDiskCacheExternalSyntheticLambda3, RotationOptionsRotation rotationOptionsRotation, getHigherPriority gethigherpriority, ProducerSequenceFactoryExternalSyntheticLambda2 producerSequenceFactoryExternalSyntheticLambda2, String str5, String str6, int i2, Object obj) {
        Object[] objArr = {producerSequenceFactoryExternalSyntheticLambda15, str, Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), list, Boolean.valueOf(z), str2, bufferedDiskCacheExternalSyntheticLambda5, peerInfo, str3, str4, producerSequenceFactoryExternalSyntheticLambda7, onextracallbackwithresult, loanProductStatus, bufferedDiskCacheExternalSyntheticLambda3, rotationOptionsRotation, gethigherpriority, producerSequenceFactoryExternalSyntheticLambda2, str5, str6, Integer.valueOf(i2), obj};
        return (ProducerSequenceFactoryExternalSyntheticLambda15) IAuthTabCallback(DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 899461033, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -899461032);
    }

    public final ProducerSequenceFactoryExternalSyntheticLambda8 onWarmupCompleted() {
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (ProducerSequenceFactoryExternalSyntheticLambda8) IAuthTabCallback(iOnWarmupCompleted, 1859902994, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{this}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -1859902991);
    }

    public final String asBinder() {
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (String) IAuthTabCallback(iOnWarmupCompleted, -428927086, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{this}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 428927088);
    }

    public final boolean access100() {
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return ((Boolean) IAuthTabCallback(iOnWarmupCompleted, 938281641, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{this}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -938281641)).booleanValue();
    }
}
