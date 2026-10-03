package viva.republica.toss.network.model.loan;

import android.os.Parcel;
import android.os.Parcelable;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.ImagePipelineExperimentsBuilderExternalSyntheticLambda14;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.LoanComparisonDetailProductInfo$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class LoanComparisonDetailProductInfo implements Parcelable {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final Parcelable.Creator<LoanComparisonDetailProductInfo> CREATOR = new onNavigationEvent();
    public static final Companion Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final List<Disclaimer> aiDisclaimers;
    private final String benefitComment;
    private final String caution;
    private final String companyLogoUrl;
    private final String companyName;
    private final String ctaTitle;
    private final String deliberation;
    private final List<Disclaimer> disclaimers;
    private final List<DetailFeature> features;
    private final String firstMonthRepayAmountType;
    private boolean isWebViewInToss;
    private String landingType;
    private String landingUrl;
    private final String loanProductId;
    private final long maxPeriod;
    private final long minPeriod;
    private final LoanProductBadge productBadge;
    private final String productName;
    private final long recentApplicationCount;
    private final String referenceId;
    private final List<String> repayMethods;

    public static final class onNavigationEvent implements Parcelable.Creator<LoanComparisonDetailProductInfo> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public final LoanComparisonDetailProductInfo[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult;
            int i4 = i3 + 21;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            LoanComparisonDetailProductInfo[] loanComparisonDetailProductInfoArr = new LoanComparisonDetailProductInfo[i];
            int i6 = i3 + 119;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return loanComparisonDetailProductInfoArr;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ LoanComparisonDetailProductInfo createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 25;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                onWarmupCompleted(parcel);
                obj.hashCode();
                throw null;
            }
            LoanComparisonDetailProductInfo loanComparisonDetailProductInfoOnWarmupCompleted = onWarmupCompleted(parcel);
            int i3 = onWarmupCompleted + 65;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                return loanComparisonDetailProductInfoOnWarmupCompleted;
            }
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ LoanComparisonDetailProductInfo[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 87;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            LoanComparisonDetailProductInfo[] loanComparisonDetailProductInfoArrIAuthTabCallback = IAuthTabCallback(i);
            int i5 = onExtraCallbackWithResult + 49;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return loanComparisonDetailProductInfoArrIAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final LoanComparisonDetailProductInfo onWarmupCompleted(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 73;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i3 == 0) {
                parcel.readString();
                parcel.readString();
                parcel.readString();
                parcel.readString();
                parcel.readLong();
                parcel.readString();
                parcel.readInt();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            long j = parcel.readLong();
            String string5 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            int i4 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i4);
            int i5 = 0;
            while (i5 != i4) {
                int i6 = i4;
                int i7 = onExtraCallbackWithResult + 41;
                String str = string9;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 != 0) {
                    arrayList.add(DetailFeature.CREATOR.createFromParcel(parcel));
                    i5 += 70;
                } else {
                    arrayList.add(DetailFeature.CREATOR.createFromParcel(parcel));
                    i5++;
                }
                string9 = str;
                i4 = i6;
            }
            String str2 = string9;
            LoanProductBadge loanProductBadgeCreateFromParcel = LoanProductBadge.CREATOR.createFromParcel(parcel);
            int i8 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i8);
            int i9 = 0;
            while (i9 != i8) {
                arrayList2.add(Disclaimer.CREATOR.createFromParcel(parcel));
                i9++;
                i8 = i8;
            }
            int i10 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i10);
            int i11 = 0;
            while (i11 != i10) {
                arrayList3.add(Disclaimer.CREATOR.createFromParcel(parcel));
                i11++;
                i10 = i10;
            }
            return new LoanComparisonDetailProductInfo(string, string2, string3, string4, j, string5, z, string6, string7, string8, str2, string10, arrayList, loanProductBadgeCreateFromParcel, arrayList2, arrayList3, parcel.readLong(), parcel.readLong(), parcel.createStringArrayList(), parcel.readString(), parcel.readString());
        }
    }

    public LoanComparisonDetailProductInfo() {
        this((String) null, (String) null, (String) null, (String) null, 0L, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (LoanProductBadge) null, (List) null, (List) null, 0L, 0L, (List) null, (String) null, (String) null, 2097151, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = (~(i | i2)) | i3;
        int i8 = i2 | i | i3;
        int i9 = ~i;
        int i10 = i + i3 + i4 + ((-421447895) * i5) + ((-859425246) * i6);
        int i11 = i10 * i10;
        int i12 = (i * (-629045104)) + 1817116672 + ((-629045104) * i3) + (i7 * (-1407420559)) + ((-1407420559) * i8) + (1407420559 * i9) + ((-2036465664) * i4) + ((-2125594624) * i5) + (888930304 * i6) + (441384960 * i11);
        int i13 = (i * 1303038832) + 2077918271 + (i3 * 1303038832) + (i7 * (-49)) + (i8 * (-49)) + (i9 * 49) + (i4 * 1303038783) + (i5 * 1583617559) + (i6 * (-1102559138)) + (i11 * 510722048);
        int i14 = i12 + (i13 * i13 * 607191040);
        return i14 != 1 ? i14 != 2 ? i14 != 3 ? i14 != 4 ? i14 != 5 ? onWarmupCompleted(objArr) : asBinder(objArr) : onExtraCallback(objArr) : IAuthTabCallback(objArr) : onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(LoanComparisonDetailProductInfo$DetailFeature$$serializer.INSTANCE);
        int i2 = onNavigationEvent + 93;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return checkcanopenlandingpage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerICustomTabsCallbackStubProxy = ICustomTabsCallbackStubProxy();
        int i4 = onNavigationEvent + 45;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerICustomTabsCallbackStubProxy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ KSerializer ICustomTabsCallbackStubProxy() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
        int i2 = onNavigationEvent + 57;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            onMinimized();
            throw null;
        }
        KSerializer kSerializerOnMinimized = onMinimized();
        int i3 = onNavigationEvent + 125;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerOnMinimized;
    }

    private static final /* synthetic */ KSerializer onMinimized() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(Disclaimer$$serializer.INSTANCE);
        int i2 = onExtraCallbackWithResult + 55;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return checkcanopenlandingpage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializer = (KSerializer) IAuthTabCallback(-194989357, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 194989360, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[0], InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
        int i4 = onExtraCallbackWithResult + 43;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnRelationshipValidationResult = onRelationshipValidationResult();
        int i4 = onNavigationEvent + 105;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerOnRelationshipValidationResult;
        }
        throw null;
    }

    private static final /* synthetic */ KSerializer onRelationshipValidationResult() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(Disclaimer$$serializer.INSTANCE);
        int i2 = onExtraCallbackWithResult + 89;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2 == 0 ? 1 : 0;
        int i5 = i3 + 19;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoanComparisonDetailProductInfo)) {
            return false;
        }
        LoanComparisonDetailProductInfo loanComparisonDetailProductInfo = (LoanComparisonDetailProductInfo) obj;
        if (!Intrinsics.areEqual(this.loanProductId, loanComparisonDetailProductInfo.loanProductId)) {
            int i2 = onExtraCallbackWithResult + 75;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.companyName, loanComparisonDetailProductInfo.companyName)) {
            int i4 = onNavigationEvent + 27;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.companyLogoUrl, loanComparisonDetailProductInfo.companyLogoUrl)) {
            int i6 = onNavigationEvent + 97;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.productName, loanComparisonDetailProductInfo.productName)) {
            int i8 = onNavigationEvent + 77;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (this.recentApplicationCount != loanComparisonDetailProductInfo.recentApplicationCount) {
            return false;
        }
        if (!Intrinsics.areEqual(this.landingUrl, loanComparisonDetailProductInfo.landingUrl)) {
            int i10 = onExtraCallbackWithResult + 83;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (this.isWebViewInToss != loanComparisonDetailProductInfo.isWebViewInToss) {
            int i12 = onExtraCallbackWithResult + 117;
            onNavigationEvent = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.landingType, loanComparisonDetailProductInfo.landingType) || !Intrinsics.areEqual(this.deliberation, loanComparisonDetailProductInfo.deliberation)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.benefitComment, loanComparisonDetailProductInfo.benefitComment)) {
            int i14 = onNavigationEvent + 25;
            onExtraCallbackWithResult = i14 % 128;
            int i15 = i14 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.caution, loanComparisonDetailProductInfo.caution)) {
            int i16 = onNavigationEvent + 111;
            onExtraCallbackWithResult = i16 % 128;
            int i17 = i16 % 2;
            return false;
        }
        if (!(!Intrinsics.areEqual(this.ctaTitle, loanComparisonDetailProductInfo.ctaTitle))) {
            if (!Intrinsics.areEqual(this.features, loanComparisonDetailProductInfo.features)) {
                int i18 = onNavigationEvent + 69;
                onExtraCallbackWithResult = i18 % 128;
                int i19 = i18 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.productBadge, loanComparisonDetailProductInfo.productBadge) || !Intrinsics.areEqual(this.disclaimers, loanComparisonDetailProductInfo.disclaimers) || !Intrinsics.areEqual(this.aiDisclaimers, loanComparisonDetailProductInfo.aiDisclaimers) || this.minPeriod != loanComparisonDetailProductInfo.minPeriod || this.maxPeriod != loanComparisonDetailProductInfo.maxPeriod || !Intrinsics.areEqual(this.repayMethods, loanComparisonDetailProductInfo.repayMethods)) {
                return false;
            }
            if (!(!Intrinsics.areEqual(this.referenceId, loanComparisonDetailProductInfo.referenceId))) {
                return Intrinsics.areEqual(this.firstMonthRepayAmountType, loanComparisonDetailProductInfo.firstMonthRepayAmountType);
            }
            int i20 = onNavigationEvent + 111;
            onExtraCallbackWithResult = i20 % 128;
            int i21 = i20 % 2;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i;
        int iHashCode2;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 3;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode3 = this.loanProductId.hashCode();
        int iHashCode4 = this.companyName.hashCode();
        int iHashCode5 = this.companyLogoUrl.hashCode();
        int iHashCode6 = this.productName.hashCode();
        int iHashCode7 = Long.hashCode(this.recentApplicationCount);
        int iHashCode8 = this.landingUrl.hashCode();
        int iHashCode9 = Boolean.hashCode(this.isWebViewInToss);
        int iHashCode10 = this.landingType.hashCode();
        int iHashCode11 = this.deliberation.hashCode();
        String str = this.benefitComment;
        if (str == null) {
            int i5 = onExtraCallbackWithResult + 21;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iHashCode12 = this.caution.hashCode();
        int iHashCode13 = this.ctaTitle.hashCode();
        int iHashCode14 = this.features.hashCode();
        int iHashCode15 = this.productBadge.hashCode();
        int iHashCode16 = this.disclaimers.hashCode();
        int iHashCode17 = this.aiDisclaimers.hashCode();
        int iHashCode18 = Long.hashCode(this.minPeriod);
        int iHashCode19 = Long.hashCode(this.maxPeriod);
        int iHashCode20 = this.repayMethods.hashCode();
        int iHashCode21 = this.referenceId.hashCode();
        String str2 = this.firstMonthRepayAmountType;
        if (str2 != null) {
            int i7 = onNavigationEvent + 123;
            i = iHashCode19;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            iHashCode2 = str2.hashCode();
        } else {
            i = iHashCode19;
            iHashCode2 = 0;
        }
        return (((((((((((((((((((((((((((((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + i) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanComparisonDetailProductInfo(loanProductId=" + this.loanProductId + ", companyName=" + this.companyName + ", companyLogoUrl=" + this.companyLogoUrl + ", productName=" + this.productName + ", recentApplicationCount=" + this.recentApplicationCount + ", landingUrl=" + this.landingUrl + ", isWebViewInToss=" + this.isWebViewInToss + ", landingType=" + this.landingType + ", deliberation=" + this.deliberation + ", benefitComment=" + this.benefitComment + ", caution=" + this.caution + ", ctaTitle=" + this.ctaTitle + ", features=" + this.features + ", productBadge=" + this.productBadge + ", disclaimers=" + this.disclaimers + ", aiDisclaimers=" + this.aiDisclaimers + ", minPeriod=" + this.minPeriod + ", maxPeriod=" + this.maxPeriod + ", repayMethods=" + this.repayMethods + ", referenceId=" + this.referenceId + ", firstMonthRepayAmountType=" + this.firstMonthRepayAmountType + ")";
        int i2 = onExtraCallbackWithResult + 81;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 59;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.loanProductId);
        parcel.writeString(this.companyName);
        parcel.writeString(this.companyLogoUrl);
        parcel.writeString(this.productName);
        parcel.writeLong(this.recentApplicationCount);
        parcel.writeString(this.landingUrl);
        parcel.writeInt(this.isWebViewInToss ? 1 : 0);
        parcel.writeString(this.landingType);
        parcel.writeString(this.deliberation);
        parcel.writeString(this.benefitComment);
        parcel.writeString(this.caution);
        parcel.writeString(this.ctaTitle);
        List<DetailFeature> list = this.features;
        parcel.writeInt(list.size());
        Iterator<DetailFeature> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        this.productBadge.writeToParcel(parcel, i);
        List<Disclaimer> list2 = this.disclaimers;
        parcel.writeInt(list2.size());
        Iterator<Disclaimer> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
            int i5 = onExtraCallbackWithResult + 9;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }
        List<Disclaimer> list3 = this.aiDisclaimers;
        parcel.writeInt(list3.size());
        Iterator<Disclaimer> it3 = list3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
        parcel.writeLong(this.minPeriod);
        parcel.writeLong(this.maxPeriod);
        parcel.writeStringList(this.repayMethods);
        parcel.writeString(this.referenceId);
        parcel.writeString(this.firstMonthRepayAmountType);
        int i7 = onExtraCallbackWithResult + 75;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LoanComparisonDetailProductInfo> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 9;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            LoanComparisonDetailProductInfo$.serializer serializerVar = LoanComparisonDetailProductInfo$.serializer.INSTANCE;
            int i4 = onNavigationEvent + 29;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.loan.LoanComparisonDetailProductInfo$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 117;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializer = (KSerializer) LoanComparisonDetailProductInfo.IAuthTabCallback(450569277, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -450569275, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[0], InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
                int i4 = onWarmupCompleted + 125;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return kSerializer;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }), null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.loan.LoanComparisonDetailProductInfo$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 19;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnExtraCallbackWithResult = LoanComparisonDetailProductInfo.onExtraCallbackWithResult();
                int i4 = onNavigationEvent + 23;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return kSerializerOnExtraCallbackWithResult;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.loan.LoanComparisonDetailProductInfo$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                KSerializer kSerializerOnNavigationEvent;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 71;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    kSerializerOnNavigationEvent = LoanComparisonDetailProductInfo.onNavigationEvent();
                    int i3 = 84 / 0;
                } else {
                    kSerializerOnNavigationEvent = LoanComparisonDetailProductInfo.onNavigationEvent();
                }
                int i4 = onExtraCallbackWithResult + 117;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 1 / 0;
                }
                return kSerializerOnNavigationEvent;
            }
        }), null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.loan.LoanComparisonDetailProductInfo$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 121;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerIAuthTabCallback = LoanComparisonDetailProductInfo.IAuthTabCallback();
                if (i3 == 0) {
                    int i4 = 73 / 0;
                }
                return kSerializerIAuthTabCallback;
            }
        }), null, null};
        int i = onExtraCallback + 39;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public /* synthetic */ LoanComparisonDetailProductInfo(int i, String str, String str2, String str3, String str4, long j, String str5, boolean z, String str6, String str7, String str8, String str9, String str10, List list, LoanProductBadge loanProductBadge, List list2, List list3, long j2, long j3, List list4, String str11, String str12, okycx okycxVar) {
        List listEmptyList;
        long j4;
        List listEmptyList2;
        if ((i & 1) == 0) {
            this.loanProductId = "";
        } else {
            this.loanProductId = str;
        }
        if ((i & 2) == 0) {
            this.companyName = "";
        } else {
            this.companyName = str2;
        }
        if ((i & 4) == 0) {
            this.companyLogoUrl = "";
        } else {
            this.companyLogoUrl = str3;
        }
        if ((i & 8) == 0) {
            int i2 = onNavigationEvent + 57;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.productName = "";
        } else {
            this.productName = str4;
        }
        if ((i & 16) == 0) {
            this.recentApplicationCount = 0L;
            int i4 = onNavigationEvent + 67;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 % 5;
            } else {
                int i6 = 2 % 2;
            }
        } else {
            this.recentApplicationCount = j;
        }
        if ((i & 32) == 0) {
            this.landingUrl = "";
        } else {
            this.landingUrl = str5;
        }
        if ((i & 64) == 0) {
            int i7 = onNavigationEvent + 77;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            this.isWebViewInToss = false;
        } else {
            this.isWebViewInToss = z;
        }
        if ((i & 128) == 0) {
            int i9 = onExtraCallbackWithResult + 85;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            this.landingType = "";
        } else {
            this.landingType = str6;
        }
        if ((i & 256) == 0) {
            int i11 = onExtraCallbackWithResult + 115;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
            this.deliberation = "";
        } else {
            this.deliberation = str7;
            int i13 = onExtraCallbackWithResult + 9;
            onNavigationEvent = i13 % 128;
            int i14 = i13 % 2;
            int i15 = 2 % 2;
        }
        Object obj = null;
        if ((i & 512) == 0) {
            this.benefitComment = null;
            int i16 = onNavigationEvent + 61;
            onExtraCallbackWithResult = i16 % 128;
            if (i16 % 2 == 0) {
                int i17 = 2 % 2;
            }
        } else {
            this.benefitComment = str8;
        }
        if ((i & 1024) == 0) {
            this.caution = "";
        } else {
            this.caution = str9;
        }
        if ((i & 2048) == 0) {
            this.ctaTitle = "";
        } else {
            this.ctaTitle = str10;
        }
        this.features = (i & 4096) == 0 ? CollectionsKt.emptyList() : list;
        int i18 = onExtraCallbackWithResult + 47;
        onNavigationEvent = i18 % 128;
        this.productBadge = (i18 % 2 != 0 ? (i & 8192) != 0 : (i & 29572) != 0) ? loanProductBadge : new LoanProductBadge((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        this.disclaimers = (i & 16384) == 0 ? CollectionsKt.emptyList() : list2;
        if ((32768 & i) == 0) {
            int i19 = onExtraCallbackWithResult + 97;
            onNavigationEvent = i19 % 128;
            if (i19 % 2 == 0) {
                CollectionsKt.emptyList();
                obj.hashCode();
                throw null;
            }
            listEmptyList = CollectionsKt.emptyList();
        } else {
            listEmptyList = list3;
        }
        this.aiDisclaimers = listEmptyList;
        if ((65536 & i) == 0) {
            j4 = 12;
        } else {
            int i20 = 2 % 2;
            j4 = j2;
        }
        this.minPeriod = j4;
        this.maxPeriod = (131072 & i) == 0 ? 120L : j3;
        if ((262144 & i) == 0) {
            listEmptyList2 = CollectionsKt.emptyList();
        } else {
            int i21 = 2 % 2;
            listEmptyList2 = list4;
        }
        this.repayMethods = listEmptyList2;
        int i22 = onNavigationEvent + 69;
        onExtraCallbackWithResult = i22 % 128;
        int i23 = i22 % 2;
        if ((524288 & i) == 0) {
            this.referenceId = "";
        } else {
            this.referenceId = str11;
        }
        if ((i & 1048576) == 0) {
            this.firstMonthRepayAmountType = null;
        } else {
            this.firstMonthRepayAmountType = str12;
        }
    }

    public LoanComparisonDetailProductInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j, @NotNull String str5, boolean z, @NotNull String str6, @NotNull String str7, @Nullable String str8, @NotNull String str9, @NotNull String str10, @NotNull List<DetailFeature> list, @NotNull LoanProductBadge loanProductBadge, @NotNull List<Disclaimer> list2, @NotNull List<Disclaimer> list3, long j2, long j3, @NotNull List<String> list4, @NotNull String str11, @Nullable String str12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(loanProductBadge, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(str11, "");
        this.loanProductId = str;
        this.companyName = str2;
        this.companyLogoUrl = str3;
        this.productName = str4;
        this.recentApplicationCount = j;
        this.landingUrl = str5;
        this.isWebViewInToss = z;
        this.landingType = str6;
        this.deliberation = str7;
        this.benefitComment = str8;
        this.caution = str9;
        this.ctaTitle = str10;
        this.features = list;
        this.productBadge = loanProductBadge;
        this.disclaimers = list2;
        this.aiDisclaimers = list3;
        this.minPeriod = j2;
        this.maxPeriod = j3;
        this.repayMethods = list4;
        this.referenceId = str11;
        this.firstMonthRepayAmountType = str12;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object asBinder(java.lang.Object[] r17) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanComparisonDetailProductInfo.asBinder(java.lang.Object[]):java.lang.Object");
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 47;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i4 = i2 + 93;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return lazyArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LoanComparisonDetailProductInfo(String str, String str2, String str3, String str4, long j, String str5, boolean z, String str6, String str7, String str8, String str9, String str10, List list, LoanProductBadge loanProductBadge, List list2, List list3, long j2, long j3, List list4, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str13;
        String str14;
        String str15;
        String str16;
        boolean z2;
        String str17;
        String str18;
        String str19;
        String str20;
        List list5;
        List listEmptyList;
        List list6;
        List listEmptyList2;
        String str21;
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 89;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
            str13 = "";
        } else {
            str13 = str;
        }
        if ((i & 2) != 0) {
            int i4 = onExtraCallbackWithResult + 95;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            str14 = "";
        } else {
            str14 = str2;
        }
        if ((i & 4) != 0) {
            int i6 = onNavigationEvent + 67;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            str15 = "";
        } else {
            str15 = str3;
        }
        String str22 = (i & 8) != 0 ? "" : str4;
        long j4 = (i & 16) != 0 ? 0L : j;
        if ((i & 32) != 0) {
            int i7 = onExtraCallbackWithResult + 45;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
            str16 = "";
        } else {
            str16 = str5;
        }
        if ((i & 64) != 0) {
            int i8 = onNavigationEvent + 119;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        String str23 = (i & 128) != 0 ? "" : str6;
        if ((i & 256) != 0) {
            int i10 = onExtraCallbackWithResult + 29;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            str17 = "";
        } else {
            str17 = str7;
        }
        if ((i & 512) != 0) {
            int i12 = onNavigationEvent + 9;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
            int i14 = 2 % 2;
            str18 = null;
        } else {
            str18 = str8;
        }
        String str24 = (i & 1024) != 0 ? "" : str9;
        if ((i & 2048) != 0) {
            int i15 = onExtraCallbackWithResult + 93;
            str19 = "";
            onNavigationEvent = i15 % 128;
            if (i15 % 2 == 0) {
                int i16 = 32 / 0;
            }
            int i17 = 2 % 2;
            str20 = str19;
        } else {
            str19 = "";
            str20 = str10;
        }
        List listEmptyList3 = (i & 4096) != 0 ? CollectionsKt.emptyList() : list;
        LoanProductBadge loanProductBadge2 = (i & 8192) != 0 ? new LoanProductBadge((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null) : loanProductBadge;
        if ((i & 16384) != 0) {
            int i18 = onExtraCallbackWithResult + 93;
            list5 = listEmptyList3;
            onNavigationEvent = i18 % 128;
            if (i18 % 2 == 0) {
                CollectionsKt.emptyList();
                throw null;
            }
            listEmptyList = CollectionsKt.emptyList();
        } else {
            list5 = listEmptyList3;
            listEmptyList = list2;
        }
        if ((i & 32768) != 0) {
            listEmptyList2 = CollectionsKt.emptyList();
            int i19 = onExtraCallbackWithResult + 111;
            list6 = listEmptyList;
            onNavigationEvent = i19 % 128;
            if (i19 % 2 == 0) {
                int i20 = 2 % 4;
            } else {
                int i21 = 2 % 2;
            }
        } else {
            list6 = listEmptyList;
            listEmptyList2 = list3;
        }
        long j5 = (65536 & i) != 0 ? 12L : j2;
        long j6 = (131072 & i) != 0 ? 120L : j3;
        List listEmptyList4 = (262144 & i) != 0 ? CollectionsKt.emptyList() : list4;
        if ((524288 & i) != 0) {
            int i22 = 2 % 2;
            str21 = str19;
        } else {
            str21 = str11;
        }
        this(str13, str14, str15, str22, j4, str16, z2, str23, str17, str18, str24, str20, list5, loanProductBadge2, list6, listEmptyList2, j5, j6, listEmptyList4, str21, (i & 1048576) != 0 ? null : str12);
    }

    public final String IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.loanProductId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallbackStub() {
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 47;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.companyName;
            int i4 = 70 / 0;
        } else {
            str = this.companyName;
        }
        int i5 = i2 + 83;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallbackDefault() {
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 87;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.companyLogoUrl;
            int i4 = 40 / 0;
        } else {
            str = this.companyLogoUrl;
        }
        int i5 = i2 + 41;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 7;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.productName;
        int i5 = i2 + 73;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        LoanComparisonDetailProductInfo loanComparisonDetailProductInfo = (LoanComparisonDetailProductInfo) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            long j = loanComparisonDetailProductInfo.recentApplicationCount;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j2 = loanComparisonDetailProductInfo.recentApplicationCount;
        int i4 = i3 + 115;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return Long.valueOf(j2);
    }

    public final String getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 59;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.landingUrl;
        int i5 = i2 + 31;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean onPostMessage() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.isWebViewInToss;
        }
        throw null;
    }

    public final String access000() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = this.deliberation;
        if (i3 != 0) {
            int i4 = 30 / 0;
        }
        return str;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.benefitComment;
        int i5 = i3 + 15;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String asBinder() {
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 65;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.caution;
            int i4 = 25 / 0;
        } else {
            str = this.caution;
        }
        int i5 = i2 + 111;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        LoanComparisonDetailProductInfo loanComparisonDetailProductInfo = (LoanComparisonDetailProductInfo) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        LoanProductBadge loanProductBadge = loanComparisonDetailProductInfo.productBadge;
        if (i4 != 0) {
            int i5 = 98 / 0;
        }
        int i6 = i3 + 83;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return loanProductBadge;
    }

    public final List<Disclaimer> IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 47;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        List<Disclaimer> list = this.disclaimers;
        int i5 = i2 + 25;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 14 / 0;
        }
        return list;
    }

    public final List<Disclaimer> asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        List<Disclaimer> list = this.aiDisclaimers;
        int i5 = i3 + 17;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final long extraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        long j = this.minPeriod;
        int i5 = i3 + 11;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        throw null;
    }

    public final long ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.maxPeriod;
        }
        int i3 = 17 / 0;
        return this.maxPeriod;
    }

    public final List<String> onActivityResized() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        List<String> list = this.repayMethods;
        int i5 = i3 + 37;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final String onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 93;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.referenceId;
        int i4 = i2 + 13;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final ImagePipelineExperimentsBuilderExternalSyntheticLambda14 access100() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        ImagePipelineExperimentsBuilderExternalSyntheticLambda14 imagePipelineExperimentsBuilderExternalSyntheticLambda14IAuthTabCallback = ImagePipelineExperimentsBuilderExternalSyntheticLambda14.onExtraCallback.IAuthTabCallback(ImagePipelineExperimentsBuilderExternalSyntheticLambda14.Companion, this.landingType, false, 2, null);
        int i4 = onNavigationEvent + 73;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return imagePipelineExperimentsBuilderExternalSyntheticLambda14IAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    @liq
    public static final class DetailFeature implements Parcelable {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final String htmlText;
        private final String iconUrl;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<DetailFeature> CREATOR = new IAuthTabCallback();

        public static final class IAuthTabCallback implements Parcelable.Creator<DetailFeature> {
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ DetailFeature createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 49;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                DetailFeature detailFeatureOnWarmupCompleted = onWarmupCompleted(parcel);
                int i4 = IAuthTabCallback + 79;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return detailFeatureOnWarmupCompleted;
                }
                throw null;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ DetailFeature[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 51;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                DetailFeature[] detailFeatureArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
                int i5 = onNavigationEvent + 1;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return detailFeatureArrOnExtraCallbackWithResult;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final DetailFeature[] onExtraCallbackWithResult(int i) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 75;
                int i4 = i3 % 128;
                onNavigationEvent = i4;
                int i5 = i3 % 2;
                DetailFeature[] detailFeatureArr = new DetailFeature[i];
                int i6 = i4 + 73;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 57 / 0;
                }
                return detailFeatureArr;
            }

            public final DetailFeature onWarmupCompleted(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                DetailFeature detailFeature = new DetailFeature(parcel.readString(), parcel.readString());
                int i2 = IAuthTabCallback + 101;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return detailFeature;
            }
        }

        static {
            int i = onExtraCallbackWithResult + 99;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public DetailFeature() {
            String str = null;
            this(str, str, 3, (DefaultConstructorMarker) str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 99;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 43;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 / 0;
            }
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IAuthTabCallback + 3;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof DetailFeature)) {
                int i4 = onWarmupCompleted + 37;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 79 / 0;
                }
                return false;
            }
            DetailFeature detailFeature = (DetailFeature) obj;
            if (!Intrinsics.areEqual(this.iconUrl, detailFeature.iconUrl) || !Intrinsics.areEqual(this.htmlText, detailFeature.htmlText)) {
                return false;
            }
            int i6 = IAuthTabCallback + 11;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 1;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (this.iconUrl.hashCode() * 31) + this.htmlText.hashCode();
            int i4 = IAuthTabCallback + 29;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "DetailFeature(iconUrl=" + this.iconUrl + ", htmlText=" + this.htmlText + ")";
            int i2 = IAuthTabCallback + 45;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 37;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i4 == 0) {
                parcel.writeString(this.iconUrl);
                parcel.writeString(this.htmlText);
                throw null;
            }
            parcel.writeString(this.iconUrl);
            parcel.writeString(this.htmlText);
            int i5 = onWarmupCompleted + 103;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }

        public static final class Companion {
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<DetailFeature> serializer() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 51;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    LoanComparisonDetailProductInfo$DetailFeature$$serializer loanComparisonDetailProductInfo$DetailFeature$$serializer = LoanComparisonDetailProductInfo$DetailFeature$$serializer.INSTANCE;
                    throw null;
                }
                LoanComparisonDetailProductInfo$DetailFeature$$serializer loanComparisonDetailProductInfo$DetailFeature$$serializer2 = LoanComparisonDetailProductInfo$DetailFeature$$serializer.INSTANCE;
                int i3 = onWarmupCompleted + 33;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return loanComparisonDetailProductInfo$DetailFeature$$serializer2;
            }
        }

        public /* synthetic */ DetailFeature(int i, String str, String str2, okycx okycxVar) {
            if ((i & 1) == 0) {
                this.iconUrl = "";
                int i2 = IAuthTabCallback + 31;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } else {
                this.iconUrl = str;
            }
            if ((i & 2) != 0) {
                this.htmlText = str2;
                return;
            }
            int i5 = onWarmupCompleted + 93;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            this.htmlText = "";
            if (i6 != 0) {
                int i7 = 54 / 0;
            }
        }

        public DetailFeature(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.iconUrl = str;
            this.htmlText = str2;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void onExtraCallbackWithResult(viva.republica.toss.network.model.loan.LoanComparisonDetailProductInfo.DetailFeature r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
            /*
                r0 = 2
                int r1 = r0 % r0
                r1 = 0
                boolean r2 = r6.onWarmupCompleted(r7, r1)
                java.lang.String r3 = ""
                if (r2 != 0) goto L27
                int r2 = viva.republica.toss.network.model.loan.LoanComparisonDetailProductInfo.DetailFeature.onWarmupCompleted
                int r2 = r2 + 73
                int r4 = r2 % 128
                viva.republica.toss.network.model.loan.LoanComparisonDetailProductInfo.DetailFeature.IAuthTabCallback = r4
                int r2 = r2 % r0
                if (r2 != 0) goto L20
                java.lang.String r2 = r5.iconUrl
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
                if (r2 != 0) goto L2c
                goto L27
            L20:
                java.lang.String r5 = r5.iconUrl
                kotlin.jvm.internal.Intrinsics.areEqual(r5, r3)
                r5 = 0
                throw r5
            L27:
                java.lang.String r2 = r5.iconUrl
                r6.onExtraCallback(r7, r1, r2)
            L2c:
                r1 = 1
                boolean r2 = r6.onWarmupCompleted(r7, r1)
                if (r2 != 0) goto L46
                int r2 = viva.republica.toss.network.model.loan.LoanComparisonDetailProductInfo.DetailFeature.IAuthTabCallback
                int r2 = r2 + 113
                int r4 = r2 % 128
                viva.republica.toss.network.model.loan.LoanComparisonDetailProductInfo.DetailFeature.onWarmupCompleted = r4
                int r2 = r2 % r0
                java.lang.String r2 = r5.htmlText
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
                r2 = r2 ^ r1
                if (r2 == r1) goto L46
                goto L58
            L46:
                java.lang.String r5 = r5.htmlText
                r6.onExtraCallback(r7, r1, r5)
                int r5 = viva.republica.toss.network.model.loan.LoanComparisonDetailProductInfo.DetailFeature.IAuthTabCallback
                int r5 = r5 + 53
                int r6 = r5 % 128
                viva.republica.toss.network.model.loan.LoanComparisonDetailProductInfo.DetailFeature.onWarmupCompleted = r6
                int r5 = r5 % r0
                if (r5 != 0) goto L58
                int r0 = r0 / 5
            L58:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanComparisonDetailProductInfo.DetailFeature.onExtraCallbackWithResult(viva.republica.toss.network.model.loan.LoanComparisonDetailProductInfo$DetailFeature, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ DetailFeature(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = IAuthTabCallback + 79;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                str = "";
            }
            if ((i & 2) != 0) {
                int i4 = onWarmupCompleted + 109;
                int i5 = i4 % 128;
                IAuthTabCallback = i5;
                if (i4 % 2 != 0) {
                    throw null;
                }
                int i6 = i5 + 53;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 2 % 2;
                }
                str2 = "";
            }
            this(str, str2);
        }
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        return (KSerializer) IAuthTabCallback(450569277, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -450569275, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[0], InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    private static final /* synthetic */ KSerializer onActivityLayout() {
        return (KSerializer) IAuthTabCallback(-194989357, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 194989360, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[0], InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    public static final /* synthetic */ Lazy[] onWarmupCompleted() {
        return (Lazy[]) IAuthTabCallback(-1340521658, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1340521662, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[0], InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    public final LoanProductBadge writeTypedObject() {
        return (LoanProductBadge) IAuthTabCallback(979830394, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -979830393, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    public final long readTypedObject() {
        return ((Long) IAuthTabCallback(-363922889, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 363922889, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted())).longValue();
    }
}
