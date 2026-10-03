package viva.republica.toss.network.model.loan;

import android.os.Parcel;
import android.os.Parcelable;
import im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.GeckoHubImp;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.LoanComparisonDetailResponse$;
import viva.republica.toss.network.model.loan.LoanComparisonDetailResponse$LowApprovalRatioInfo$;
import viva.republica.toss.network.model.loan.LoanComparisonDetailResponse$LowApprovalRatioInfo$Banner$;
import viva.republica.toss.network.model.loan.LoanComparisonDetailResponse$RejectionInfo$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class LoanComparisonDetailResponse implements Parcelable {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final List<BottomContent> bottomContents;
    private final List<EventContent> eventContents;
    private final List<FeatureContent> featureContents;
    private final LowApprovalRatioInfo lowApprovalRatioInfo;
    private final PeerInfo peerInfo;
    private final LoanComparisonDetailProductInfo productInfo;
    private final RejectionInfo rejectionInfo;
    private final String reviewABTestType;
    private final ReviewContents reviewContents;
    private final LoanComparisonDetailScreeningInfo screeningInfo;
    private final LoanProductStatus status;
    private final TopBanner topBanner;
    private final String viewABTestType;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LoanComparisonDetailResponse> CREATOR = new IAuthTabCallback();

    public static final class IAuthTabCallback implements Parcelable.Creator<LoanComparisonDetailResponse> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public final LoanComparisonDetailResponse[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 33;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            LoanComparisonDetailResponse[] loanComparisonDetailResponseArr = new LoanComparisonDetailResponse[i];
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i4 + 79;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return loanComparisonDetailResponseArr;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ LoanComparisonDetailResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 7;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return onWarmupCompleted(parcel);
            }
            onWarmupCompleted(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ LoanComparisonDetailResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 17;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                return IAuthTabCallback(i);
            }
            IAuthTabCallback(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final LoanComparisonDetailResponse onWarmupCompleted(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            RejectionInfo rejectionInfoCreateFromParcel;
            LowApprovalRatioInfo lowApprovalRatioInfoCreateFromParcel;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            LoanComparisonDetailProductInfo loanComparisonDetailProductInfoCreateFromParcel = LoanComparisonDetailProductInfo.CREATOR.createFromParcel(parcel);
            LoanProductStatus loanProductStatusCreateFromParcel = LoanProductStatus.CREATOR.createFromParcel(parcel);
            LoanComparisonDetailScreeningInfo loanComparisonDetailScreeningInfoCreateFromParcel = LoanComparisonDetailScreeningInfo.CREATOR.createFromParcel(parcel);
            TopBanner topBannerCreateFromParcel = parcel.readInt() == 0 ? null : TopBanner.CREATOR.createFromParcel(parcel);
            int i2 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList3.add(BottomContent.CREATOR.createFromParcel(parcel));
            }
            ReviewContents reviewContentsCreateFromParcel = parcel.readInt() == 0 ? null : ReviewContents.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i4 = onExtraCallback + 13;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                arrayList = null;
            } else {
                int i6 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i6);
                for (int i7 = 0; i7 != i6; i7++) {
                    arrayList4.add(EventContent.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList4;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i8 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i8);
                for (int i9 = 0; i9 != i8; i9++) {
                    arrayList5.add(FeatureContent.CREATOR.createFromParcel(parcel));
                }
                arrayList2 = arrayList5;
            }
            if (parcel.readInt() == 0) {
                int i10 = onNavigationEvent + 49;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
                rejectionInfoCreateFromParcel = null;
            } else {
                rejectionInfoCreateFromParcel = RejectionInfo.CREATOR.createFromParcel(parcel);
            }
            RejectionInfo rejectionInfo = rejectionInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                int i12 = onNavigationEvent + 1;
                onExtraCallback = i12 % 128;
                int i13 = i12 % 2;
                lowApprovalRatioInfoCreateFromParcel = null;
            } else {
                lowApprovalRatioInfoCreateFromParcel = LowApprovalRatioInfo.CREATOR.createFromParcel(parcel);
            }
            return new LoanComparisonDetailResponse(loanComparisonDetailProductInfoCreateFromParcel, loanProductStatusCreateFromParcel, loanComparisonDetailScreeningInfoCreateFromParcel, topBannerCreateFromParcel, arrayList3, reviewContentsCreateFromParcel, string, string2, arrayList, arrayList2, rejectionInfo, lowApprovalRatioInfoCreateFromParcel, parcel.readInt() != 0 ? PeerInfo.CREATOR.createFromParcel(parcel) : null);
        }
    }

    public LoanComparisonDetailResponse() {
        this((LoanComparisonDetailProductInfo) null, (LoanProductStatus) null, (LoanComparisonDetailScreeningInfo) null, (TopBanner) null, (List) null, (ReviewContents) null, (String) null, (String) null, (List) null, (List) null, (RejectionInfo) null, (LowApprovalRatioInfo) null, (PeerInfo) null, 8191, (DefaultConstructorMarker) null);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            ICustomTabsCallback();
            throw null;
        }
        KSerializer kSerializerICustomTabsCallback = ICustomTabsCallback();
        int i3 = onWarmupCompleted + 95;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerICustomTabsCallback;
    }

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnActivityResized = onActivityResized();
        int i4 = onWarmupCompleted + 83;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnActivityResized;
    }

    private static final /* synthetic */ KSerializer ICustomTabsCallback() {
        KSerializer<LoanProductStatus> kSerializerSerializer;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerSerializer = LoanProductStatus.Companion.serializer();
            int i3 = 93 / 0;
        } else {
            kSerializerSerializer = LoanProductStatus.Companion.serializer();
        }
        int i4 = onNavigationEvent + 87;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerSerializer;
    }

    private static final /* synthetic */ KSerializer extraCallback() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(BottomContent$$serializer.INSTANCE);
        int i2 = onNavigationEvent + 61;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    private static final /* synthetic */ KSerializer onActivityResized() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(LoanComparisonDetailResponse$FeatureContent$$serializer.INSTANCE);
        int i2 = onWarmupCompleted + 85;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return checkcanopenlandingpage;
        }
        throw null;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerExtraCallback = extraCallback();
        if (i3 != 0) {
            int i4 = 72 / 0;
        }
        return kSerializerExtraCallback;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i2;
        int i8 = ~(i7 | i6);
        int i9 = ~(i2 | i6);
        int i10 = i7 | (~i6);
        int i11 = i9 | (~(i10 | i5));
        int i12 = (~i5) | i10;
        int i13 = i2 + i6 + i + (770105990 * i4) + ((-157043368) * i3);
        int i14 = i13 * i13;
        int i15 = ((315592168 * i2) - 1432092672) + ((-1000312294) * i6) + ((-1315904462) * i8) + ((-657952231) * i11) + (657952231 * i12) + ((-342360064) * i) + ((-2121269248) * i4) + (1950351360 * i3) + ((-66846720) * i14);
        int i16 = (i2 * 105828664) + 1394048361 + (i6 * 105827886) + (i8 * (-778)) + (i11 * (-389)) + (i12 * 389) + (i * 105828275) + (i4 * (-227623502)) + (i3 * 619312264) + (i14 * 1925971968);
        int i17 = i15 + (i16 * i16 * 261881856);
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? onWarmupCompleted(objArr) : onExtraCallback(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerWriteTypedObject = writeTypedObject();
        if (i3 == 0) {
            int i4 = 33 / 0;
        }
        return kSerializerWriteTypedObject;
    }

    private static final /* synthetic */ KSerializer writeTypedObject() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(LoanComparisonDetailResponse$EventContent$$serializer.INSTANCE);
        int i2 = onNavigationEvent + 81;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return checkcanopenlandingpage;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 23;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 1;
        onNavigationEvent = i5 % 128;
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
        if (!(obj instanceof LoanComparisonDetailResponse)) {
            int i2 = onNavigationEvent + 13;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        LoanComparisonDetailResponse loanComparisonDetailResponse = (LoanComparisonDetailResponse) obj;
        if (!Intrinsics.areEqual(this.productInfo, loanComparisonDetailResponse.productInfo)) {
            int i4 = onNavigationEvent + 45;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.status != loanComparisonDetailResponse.status || !Intrinsics.areEqual(this.screeningInfo, loanComparisonDetailResponse.screeningInfo)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.topBanner, loanComparisonDetailResponse.topBanner)) {
            int i6 = onWarmupCompleted + 1;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.bottomContents, loanComparisonDetailResponse.bottomContents)) {
            int i8 = onWarmupCompleted + 103;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.reviewContents, loanComparisonDetailResponse.reviewContents)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.reviewABTestType, loanComparisonDetailResponse.reviewABTestType)) {
            int i10 = onWarmupCompleted + 43;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.viewABTestType, loanComparisonDetailResponse.viewABTestType)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.eventContents, loanComparisonDetailResponse.eventContents)) {
            int i12 = onWarmupCompleted + 9;
            onNavigationEvent = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.featureContents, loanComparisonDetailResponse.featureContents)) {
            int i14 = onNavigationEvent + 95;
            onWarmupCompleted = i14 % 128;
            int i15 = i14 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.rejectionInfo, loanComparisonDetailResponse.rejectionInfo)) {
            int i16 = onWarmupCompleted + 95;
            onNavigationEvent = i16 % 128;
            int i17 = i16 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.lowApprovalRatioInfo, loanComparisonDetailResponse.lowApprovalRatioInfo)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.peerInfo, loanComparisonDetailResponse.peerInfo))) {
            return true;
        }
        int i18 = onWarmupCompleted + 39;
        onNavigationEvent = i18 % 128;
        return i18 % 2 == 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int iHashCode4 = this.productInfo.hashCode();
        int iHashCode5 = this.status.hashCode();
        int iHashCode6 = this.screeningInfo.hashCode();
        TopBanner topBanner = this.topBanner;
        int iHashCode7 = topBanner == null ? 0 : topBanner.hashCode();
        int iHashCode8 = this.bottomContents.hashCode();
        ReviewContents reviewContents = this.reviewContents;
        if (reviewContents == null) {
            int i2 = onNavigationEvent + 29;
            onWarmupCompleted = i2 % 128;
            iHashCode = i2 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = reviewContents.hashCode();
        }
        String str = this.reviewABTestType;
        int iHashCode9 = str == null ? 0 : str.hashCode();
        String str2 = this.viewABTestType;
        int iHashCode10 = str2 == null ? 0 : str2.hashCode();
        List<EventContent> list = this.eventContents;
        int iHashCode11 = list == null ? 0 : list.hashCode();
        List<FeatureContent> list2 = this.featureContents;
        if (list2 == null) {
            int i3 = onNavigationEvent + 113;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = list2.hashCode();
        }
        RejectionInfo rejectionInfo = this.rejectionInfo;
        int iHashCode12 = rejectionInfo == null ? 0 : rejectionInfo.hashCode();
        LowApprovalRatioInfo lowApprovalRatioInfo = this.lowApprovalRatioInfo;
        if (lowApprovalRatioInfo == null) {
            int i5 = onNavigationEvent + 11;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = lowApprovalRatioInfo.hashCode();
        }
        PeerInfo peerInfo = this.peerInfo;
        return (((((((((((((((((((((((iHashCode4 * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode2) * 31) + iHashCode12) * 31) + iHashCode3) * 31) + (peerInfo != null ? peerInfo.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanComparisonDetailResponse(productInfo=" + this.productInfo + ", status=" + this.status + ", screeningInfo=" + this.screeningInfo + ", topBanner=" + this.topBanner + ", bottomContents=" + this.bottomContents + ", reviewContents=" + this.reviewContents + ", reviewABTestType=" + this.reviewABTestType + ", viewABTestType=" + this.viewABTestType + ", eventContents=" + this.eventContents + ", featureContents=" + this.featureContents + ", rejectionInfo=" + this.rejectionInfo + ", lowApprovalRatioInfo=" + this.lowApprovalRatioInfo + ", peerInfo=" + this.peerInfo + ")";
        int i2 = onNavigationEvent + 35;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004f A[PHI: r1
      0x004f: PHI (r1v25 viva.republica.toss.network.model.loan.TopBanner) = (r1v7 viva.republica.toss.network.model.loan.TopBanner), (r1v29 viva.republica.toss.network.model.loan.TopBanner) binds: [B:8:0x0040, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0042  */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel r7, int r8) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanComparisonDetailResponse.writeToParcel(android.os.Parcel, int):void");
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LoanComparisonDetailResponse> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 31;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            LoanComparisonDetailResponse$.serializer serializerVar = LoanComparisonDetailResponse$.serializer.INSTANCE;
            int i4 = onExtraCallbackWithResult + 109;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.loan.LoanComparisonDetailResponse$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 81;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
                int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
                int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
                KSerializer kSerializer = (KSerializer) LoanComparisonDetailResponse.onNavigationEvent(iOnWarmupCompleted2, -1236920156, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, iOnWarmupCompleted, new Object[0], 1236920158);
                int i4 = onExtraCallbackWithResult + 75;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return kSerializer;
                }
                throw null;
            }
        }), null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.loan.LoanComparisonDetailResponse$$ExternalSyntheticLambda1
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 29;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnExtraCallbackWithResult = LoanComparisonDetailResponse.onExtraCallbackWithResult();
                int i4 = onWarmupCompleted + 67;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnExtraCallbackWithResult;
            }
        }), null, null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.loan.LoanComparisonDetailResponse$$ExternalSyntheticLambda2
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 49;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnNavigationEvent = LoanComparisonDetailResponse.onNavigationEvent();
                int i4 = onWarmupCompleted + 21;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return kSerializerOnNavigationEvent;
                }
                throw null;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.loan.LoanComparisonDetailResponse$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 93;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    LoanComparisonDetailResponse.IAuthTabCallback();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                KSerializer kSerializerIAuthTabCallback = LoanComparisonDetailResponse.IAuthTabCallback();
                int i3 = onExtraCallbackWithResult + 93;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return kSerializerIAuthTabCallback;
            }
        }), null, null, null};
        int i = IAuthTabCallback + 11;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ LoanComparisonDetailResponse(int r31, viva.republica.toss.network.model.loan.LoanComparisonDetailProductInfo r32, viva.republica.toss.network.model.loan.LoanProductStatus r33, viva.republica.toss.network.model.loan.LoanComparisonDetailScreeningInfo r34, viva.republica.toss.network.model.loan.TopBanner r35, java.util.List r36, viva.republica.toss.network.model.loan.ReviewContents r37, java.lang.String r38, java.lang.String r39, java.util.List r40, java.util.List r41, viva.republica.toss.network.model.loan.LoanComparisonDetailResponse.RejectionInfo r42, viva.republica.toss.network.model.loan.LoanComparisonDetailResponse.LowApprovalRatioInfo r43, viva.republica.toss.network.model.loan.PeerInfo r44, o.okycx r45) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanComparisonDetailResponse.<init>(int, viva.republica.toss.network.model.loan.LoanComparisonDetailProductInfo, viva.republica.toss.network.model.loan.LoanProductStatus, viva.republica.toss.network.model.loan.LoanComparisonDetailScreeningInfo, viva.republica.toss.network.model.loan.TopBanner, java.util.List, viva.republica.toss.network.model.loan.ReviewContents, java.lang.String, java.lang.String, java.util.List, java.util.List, viva.republica.toss.network.model.loan.LoanComparisonDetailResponse$RejectionInfo, viva.republica.toss.network.model.loan.LoanComparisonDetailResponse$LowApprovalRatioInfo, viva.republica.toss.network.model.loan.PeerInfo, o.okycx):void");
    }

    public LoanComparisonDetailResponse(@NotNull LoanComparisonDetailProductInfo loanComparisonDetailProductInfo, @NotNull LoanProductStatus loanProductStatus, @NotNull LoanComparisonDetailScreeningInfo loanComparisonDetailScreeningInfo, @Nullable TopBanner topBanner, @NotNull List<BottomContent> list, @Nullable ReviewContents reviewContents, @Nullable String str, @Nullable String str2, @Nullable List<EventContent> list2, @Nullable List<FeatureContent> list3, @Nullable RejectionInfo rejectionInfo, @Nullable LowApprovalRatioInfo lowApprovalRatioInfo, @Nullable PeerInfo peerInfo) {
        Intrinsics.checkNotNullParameter(loanComparisonDetailProductInfo, "");
        Intrinsics.checkNotNullParameter(loanProductStatus, "");
        Intrinsics.checkNotNullParameter(loanComparisonDetailScreeningInfo, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.productInfo = loanComparisonDetailProductInfo;
        this.status = loanProductStatus;
        this.screeningInfo = loanComparisonDetailScreeningInfo;
        this.topBanner = topBanner;
        this.bottomContents = list;
        this.reviewContents = reviewContents;
        this.reviewABTestType = str;
        this.viewABTestType = str2;
        this.eventContents = list2;
        this.featureContents = list3;
        this.rejectionInfo = rejectionInfo;
        this.lowApprovalRatioInfo = lowApprovalRatioInfo;
        this.peerInfo = peerInfo;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return $childSerializers;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0199  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(viva.republica.toss.network.model.loan.LoanComparisonDetailResponse r34, o.vyl r35, kotlinx.serialization.descriptors.SerialDescriptor r36) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanComparisonDetailResponse.onExtraCallbackWithResult(viva.republica.toss.network.model.loan.LoanComparisonDetailResponse, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public /* synthetic */ LoanComparisonDetailResponse(LoanComparisonDetailProductInfo loanComparisonDetailProductInfo, LoanProductStatus loanProductStatus, LoanComparisonDetailScreeningInfo loanComparisonDetailScreeningInfo, TopBanner topBanner, List list, ReviewContents reviewContents, String str, String str2, List list2, List list3, RejectionInfo rejectionInfo, LowApprovalRatioInfo lowApprovalRatioInfo, PeerInfo peerInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        LoanComparisonDetailProductInfo loanComparisonDetailProductInfo2;
        LoanComparisonDetailScreeningInfo loanComparisonDetailScreeningInfo2;
        TopBanner topBanner2;
        ReviewContents reviewContents2;
        String str3;
        String str4;
        RejectionInfo rejectionInfo2;
        LowApprovalRatioInfo lowApprovalRatioInfo2;
        if ((i & 1) != 0) {
            loanComparisonDetailProductInfo2 = new LoanComparisonDetailProductInfo((String) null, (String) null, (String) null, (String) null, 0L, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (LoanProductBadge) null, (List) null, (List) null, 0L, 0L, (List) null, (String) null, (String) null, 2097151, (DefaultConstructorMarker) null);
            int i2 = 2 % 2;
        } else {
            loanComparisonDetailProductInfo2 = loanComparisonDetailProductInfo;
        }
        LoanProductStatus loanProductStatus2 = (i & 2) != 0 ? LoanProductStatus.UNKNOWN : loanProductStatus;
        if ((i & 4) != 0) {
            loanComparisonDetailScreeningInfo2 = new LoanComparisonDetailScreeningInfo(0.0f, 0L, (Long) null, (Float) null, 0L, (String) null, 63, (DefaultConstructorMarker) null);
            int i3 = 2 % 2;
        } else {
            loanComparisonDetailScreeningInfo2 = loanComparisonDetailScreeningInfo;
        }
        if ((i & 8) != 0) {
            int i4 = onWarmupCompleted + 39;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            topBanner2 = null;
        } else {
            topBanner2 = topBanner;
        }
        List listEmptyList = (i & 16) != 0 ? CollectionsKt.emptyList() : list;
        if ((i & 32) != 0) {
            int i5 = onNavigationEvent;
            int i6 = i5 + 111;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 34 / 0;
            }
            int i8 = i5 + 99;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            reviewContents2 = null;
        } else {
            reviewContents2 = reviewContents;
        }
        if ((i & 64) != 0) {
            int i11 = onWarmupCompleted + 11;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
            str3 = null;
        } else {
            str3 = str;
        }
        if ((i & 128) != 0) {
            int i13 = onWarmupCompleted + 101;
            int i14 = i13 % 128;
            onNavigationEvent = i14;
            int i15 = i13 % 2;
            int i16 = i14 + 11;
            onWarmupCompleted = i16 % 128;
            int i17 = i16 % 2;
            int i18 = 2 % 2;
            str4 = null;
        } else {
            str4 = str2;
        }
        List listEmptyList2 = (i & 256) != 0 ? CollectionsKt.emptyList() : list2;
        List listEmptyList3 = (i & 512) != 0 ? CollectionsKt.emptyList() : list3;
        if ((i & 1024) != 0) {
            int i19 = onWarmupCompleted;
            int i20 = i19 + 25;
            onNavigationEvent = i20 % 128;
            int i21 = i20 % 2;
            int i22 = i19 + 51;
            onNavigationEvent = i22 % 128;
            int i23 = i22 % 2;
            int i24 = 2 % 2;
            rejectionInfo2 = null;
        } else {
            rejectionInfo2 = rejectionInfo;
        }
        if ((i & 2048) != 0) {
            int i25 = onWarmupCompleted + 17;
            onNavigationEvent = i25 % 128;
            if (i25 % 2 == 0) {
                peerInfo.hashCode();
                throw null;
            }
            lowApprovalRatioInfo2 = null;
        } else {
            lowApprovalRatioInfo2 = lowApprovalRatioInfo;
        }
        this(loanComparisonDetailProductInfo2, loanProductStatus2, loanComparisonDetailScreeningInfo2, topBanner2, listEmptyList, reviewContents2, str3, str4, listEmptyList2, listEmptyList3, rejectionInfo2, lowApprovalRatioInfo2, (i & 4096) == 0 ? peerInfo : null);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        LoanComparisonDetailResponse loanComparisonDetailResponse = (LoanComparisonDetailResponse) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        LoanComparisonDetailProductInfo loanComparisonDetailProductInfo = loanComparisonDetailResponse.productInfo;
        if (i3 != 0) {
            int i4 = 55 / 0;
        }
        return loanComparisonDetailProductInfo;
    }

    public final LoanProductStatus access000() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 51;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        LoanProductStatus loanProductStatus = this.status;
        int i4 = i2 + 97;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return loanProductStatus;
        }
        obj.hashCode();
        throw null;
    }

    public final LoanComparisonDetailScreeningInfo IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 61;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        LoanComparisonDetailScreeningInfo loanComparisonDetailScreeningInfo = this.screeningInfo;
        int i5 = i2 + 111;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return loanComparisonDetailScreeningInfo;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        LoanComparisonDetailResponse loanComparisonDetailResponse = (LoanComparisonDetailResponse) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        TopBanner topBanner = loanComparisonDetailResponse.topBanner;
        int i5 = i3 + 19;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return topBanner;
        }
        throw null;
    }

    public final List<BottomContent> asInterface() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        List<BottomContent> list = this.bottomContents;
        if (i3 != 0) {
            int i4 = 25 / 0;
        }
        return list;
    }

    public final ReviewContents IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        ReviewContents reviewContents = this.reviewContents;
        if (i3 == 0) {
            int i4 = 64 / 0;
        }
        return reviewContents;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        LoanComparisonDetailResponse loanComparisonDetailResponse = (LoanComparisonDetailResponse) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = loanComparisonDetailResponse.reviewABTestType;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 65;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String readTypedObject() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 69;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.viewABTestType;
        int i4 = i2 + 47;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final List<EventContent> asBinder() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        List<EventContent> list = this.eventContents;
        int i5 = i3 + 107;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final List<FeatureContent> IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 63;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        List<FeatureContent> list = this.featureContents;
        int i5 = i2 + 29;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final RejectionInfo access100() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 71;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        RejectionInfo rejectionInfo = this.rejectionInfo;
        int i5 = i2 + 83;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return rejectionInfo;
    }

    public final LowApprovalRatioInfo onTransact() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.lowApprovalRatioInfo;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @liq
    public static final class EventContent implements Parcelable {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;
        private final Long clickLogId;
        private final String helpText;
        private final String iconUrl;
        private final Long impressionLogId;
        private final String mainText;
        private final String scheme;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<EventContent> CREATOR = new onWarmupCompleted();

        public static final class onWarmupCompleted implements Parcelable.Creator<EventContent> {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ EventContent createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 125;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                EventContent eventContentOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
                int i4 = onExtraCallback + 23;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return eventContentOnExtraCallbackWithResult;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ EventContent[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 53;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    onExtraCallbackWithResult(i);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                EventContent[] eventContentArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
                int i4 = IAuthTabCallback + 21;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return eventContentArrOnExtraCallbackWithResult;
            }

            public final EventContent onExtraCallbackWithResult(Parcel parcel) {
                Long l;
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                if (parcel.readInt() == 0) {
                    int i2 = onExtraCallback + 27;
                    IAuthTabCallback = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i3 = 89 / 0;
                    }
                    l = null;
                } else {
                    Long lValueOf = Long.valueOf(parcel.readLong());
                    int i4 = IAuthTabCallback + 25;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    l = lValueOf;
                }
                return new EventContent(string, string2, string3, string4, l, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            }

            public final EventContent[] onExtraCallbackWithResult(int i) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 113;
                int i4 = i3 % 128;
                onExtraCallback = i4;
                int i5 = i3 % 2;
                EventContent[] eventContentArr = new EventContent[i];
                int i6 = i4 + 5;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                return eventContentArr;
            }
        }

        static {
            int i = onNavigationEvent + 115;
            IAuthTabCallback = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public EventContent() {
            this((String) null, (String) null, (String) null, (String) null, (Long) null, (Long) null, 63, (DefaultConstructorMarker) null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 93;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onWarmupCompleted + 109;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof EventContent)) {
                int i4 = onExtraCallback + 39;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return false;
                }
                throw null;
            }
            EventContent eventContent = (EventContent) obj;
            if (!(!Intrinsics.areEqual(this.iconUrl, eventContent.iconUrl))) {
                if (Intrinsics.areEqual(this.mainText, eventContent.mainText)) {
                    return Intrinsics.areEqual(this.scheme, eventContent.scheme) && Intrinsics.areEqual(this.helpText, eventContent.helpText) && !(Intrinsics.areEqual(this.impressionLogId, eventContent.impressionLogId) ^ true) && Intrinsics.areEqual(this.clickLogId, eventContent.clickLogId);
                }
                int i5 = onWarmupCompleted + 1;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            int i = 2 % 2;
            int iHashCode3 = this.iconUrl.hashCode();
            int iHashCode4 = this.mainText.hashCode();
            String str = this.scheme;
            if (str == null) {
                int i2 = onExtraCallback + 57;
                onWarmupCompleted = i2 % 128;
                iHashCode = i2 % 2 == 0 ? 1 : 0;
            } else {
                iHashCode = str.hashCode();
            }
            String str2 = this.helpText;
            int iHashCode5 = str2 == null ? 0 : str2.hashCode();
            Long l = this.impressionLogId;
            if (l == null) {
                int i3 = onExtraCallback + 7;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                iHashCode2 = 0;
            } else {
                iHashCode2 = l.hashCode();
            }
            Long l2 = this.clickLogId;
            int iHashCode6 = (((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode5) * 31) + iHashCode2) * 31) + (l2 != null ? l2.hashCode() : 0);
            int i5 = onWarmupCompleted + 33;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 99 / 0;
            }
            return iHashCode6;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "EventContent(iconUrl=" + this.iconUrl + ", mainText=" + this.mainText + ", scheme=" + this.scheme + ", helpText=" + this.helpText + ", impressionLogId=" + this.impressionLogId + ", clickLogId=" + this.clickLogId + ")";
            int i2 = onExtraCallback + 113;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 23;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.iconUrl);
            parcel.writeString(this.mainText);
            parcel.writeString(this.scheme);
            parcel.writeString(this.helpText);
            Long l = this.impressionLogId;
            if (l == null) {
                int i5 = onExtraCallback + 15;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l.longValue());
            }
            Long l2 = this.clickLogId;
            if (l2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l2.longValue());
            }
        }

        public static final class Companion {
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<EventContent> serializer() {
                LoanComparisonDetailResponse$EventContent$$serializer loanComparisonDetailResponse$EventContent$$serializer;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 5;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    loanComparisonDetailResponse$EventContent$$serializer = LoanComparisonDetailResponse$EventContent$$serializer.INSTANCE;
                    int i3 = 19 / 0;
                } else {
                    loanComparisonDetailResponse$EventContent$$serializer = LoanComparisonDetailResponse$EventContent$$serializer.INSTANCE;
                }
                int i4 = onWarmupCompleted + 69;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return loanComparisonDetailResponse$EventContent$$serializer;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ EventContent(int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.Long r8, java.lang.Long r9, o.okycx r10) {
            /*
                r2 = this;
                r2.<init>()
                r10 = r3 & 1
                java.lang.String r0 = ""
                if (r10 != 0) goto Lc
                r2.iconUrl = r0
                goto Le
            Lc:
                r2.iconUrl = r4
            Le:
                r4 = r3 & 2
                r10 = 0
                r1 = 2
                if (r4 != 0) goto L26
                int r4 = viva.republica.toss.network.model.loan.LoanComparisonDetailResponse.EventContent.onExtraCallback
                int r4 = r4 + 69
                int r5 = r4 % 128
                viva.republica.toss.network.model.loan.LoanComparisonDetailResponse.EventContent.onWarmupCompleted = r5
                int r4 = r4 % r1
                r2.mainText = r0
                if (r4 == 0) goto L22
                goto L2a
            L22:
                r10.hashCode()
                throw r10
            L26:
                r2.mainText = r5
                int r4 = r1 % r1
            L2a:
                r4 = r3 & 4
                if (r4 != 0) goto L3a
                int r4 = viva.republica.toss.network.model.loan.LoanComparisonDetailResponse.EventContent.onExtraCallback
                int r4 = r4 + 99
                int r5 = r4 % 128
                viva.republica.toss.network.model.loan.LoanComparisonDetailResponse.EventContent.onWarmupCompleted = r5
                int r4 = r4 % r1
                r2.scheme = r10
                goto L3c
            L3a:
                r2.scheme = r6
            L3c:
                r4 = r3 & 8
                if (r4 != 0) goto L44
                r2.helpText = r10
            L42:
                int r1 = r1 % r1
                goto L53
            L44:
                r2.helpText = r7
                int r4 = viva.republica.toss.network.model.loan.LoanComparisonDetailResponse.EventContent.onExtraCallback
                int r4 = r4 + 67
                int r5 = r4 % 128
                viva.republica.toss.network.model.loan.LoanComparisonDetailResponse.EventContent.onWarmupCompleted = r5
                int r4 = r4 % r1
                if (r4 != 0) goto L42
                int r1 = r1 % 3
            L53:
                r4 = r3 & 16
                if (r4 != 0) goto L5a
                r2.impressionLogId = r10
                goto L5c
            L5a:
                r2.impressionLogId = r8
            L5c:
                r3 = r3 & 32
                if (r3 != 0) goto L63
                r2.clickLogId = r10
                return
            L63:
                r2.clickLogId = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanComparisonDetailResponse.EventContent.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, o.okycx):void");
        }

        public EventContent(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, @Nullable Long l, @Nullable Long l2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.iconUrl = str;
            this.mainText = str2;
            this.scheme = str3;
            this.helpText = str4;
            this.impressionLogId = l;
            this.clickLogId = l2;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void onWarmupCompleted(viva.republica.toss.network.model.loan.LoanComparisonDetailResponse.EventContent r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
            /*
                r0 = 2
                int r1 = r0 % r0
                r1 = 0
                boolean r2 = r7.onWarmupCompleted(r8, r1)
                r3 = 0
                java.lang.String r4 = ""
                if (r2 != 0) goto L2a
                int r2 = viva.republica.toss.network.model.loan.LoanComparisonDetailResponse.EventContent.onExtraCallback
                int r2 = r2 + 87
                int r5 = r2 % 128
                viva.republica.toss.network.model.loan.LoanComparisonDetailResponse.EventContent.onWarmupCompleted = r5
                int r2 = r2 % r0
                if (r2 == 0) goto L21
                java.lang.String r2 = r6.iconUrl
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
                if (r2 == 0) goto L2a
                goto L2f
            L21:
                java.lang.String r6 = r6.iconUrl
                kotlin.jvm.internal.Intrinsics.areEqual(r6, r4)
                r3.hashCode()
                throw r3
            L2a:
                java.lang.String r2 = r6.iconUrl
                r7.onExtraCallback(r8, r1, r2)
            L2f:
                r1 = 1
                boolean r2 = r7.onWarmupCompleted(r8, r1)
                if (r2 != 0) goto L50
                int r2 = viva.republica.toss.network.model.loan.LoanComparisonDetailResponse.EventContent.onExtraCallback
                int r2 = r2 + 95
                int r5 = r2 % 128
                viva.republica.toss.network.model.loan.LoanComparisonDetailResponse.EventContent.onWarmupCompleted = r5
                int r2 = r2 % r0
                if (r2 == 0) goto L4a
                java.lang.String r2 = r6.mainText
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
                if (r2 != 0) goto L55
                goto L50
            L4a:
                java.lang.String r6 = r6.mainText
                kotlin.jvm.internal.Intrinsics.areEqual(r6, r4)
                throw r3
            L50:
                java.lang.String r2 = r6.mainText
                r7.onExtraCallback(r8, r1, r2)
            L55:
                boolean r1 = r7.onWarmupCompleted(r8, r0)
                if (r1 != 0) goto L5f
                java.lang.String r1 = r6.scheme
                if (r1 == 0) goto L66
            L5f:
                o.getWriggleLayout r1 = o.getWriggleLayout.onNavigationEvent
                java.lang.String r2 = r6.scheme
                r7.onExtraCallbackWithResult(r8, r0, r1, r2)
            L66:
                r1 = 3
                boolean r2 = r7.onWarmupCompleted(r8, r1)
                if (r2 != 0) goto L71
                java.lang.String r2 = r6.helpText
                if (r2 == 0) goto L78
            L71:
                o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
                java.lang.String r3 = r6.helpText
                r7.onExtraCallbackWithResult(r8, r1, r2, r3)
            L78:
                r1 = 4
                boolean r2 = r7.onWarmupCompleted(r8, r1)
                if (r2 != 0) goto L83
                java.lang.Long r2 = r6.impressionLogId
                if (r2 == 0) goto L8a
            L83:
                o.oty1 r2 = o.oty1.onExtraCallback
                java.lang.Long r3 = r6.impressionLogId
                r7.onExtraCallbackWithResult(r8, r1, r2, r3)
            L8a:
                r1 = 5
                boolean r2 = r7.onWarmupCompleted(r8, r1)
                if (r2 != 0) goto L9e
                int r2 = viva.republica.toss.network.model.loan.LoanComparisonDetailResponse.EventContent.onExtraCallback
                int r2 = r2 + 97
                int r3 = r2 % 128
                viva.republica.toss.network.model.loan.LoanComparisonDetailResponse.EventContent.onWarmupCompleted = r3
                int r2 = r2 % r0
                java.lang.Long r0 = r6.clickLogId
                if (r0 == 0) goto La5
            L9e:
                o.oty1 r0 = o.oty1.onExtraCallback
                java.lang.Long r6 = r6.clickLogId
                r7.onExtraCallbackWithResult(r8, r1, r0, r6)
            La5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanComparisonDetailResponse.EventContent.onWarmupCompleted(viva.republica.toss.network.model.loan.LoanComparisonDetailResponse$EventContent, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ EventContent(String str, String str2, String str3, String str4, Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            String str5;
            Long l3;
            String str6 = "";
            String str7 = (i & 1) != 0 ? "" : str;
            if ((i & 2) != 0) {
                int i2 = onExtraCallback + 51;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } else {
                str6 = str2;
            }
            if ((i & 4) != 0) {
                int i5 = onExtraCallback + 27;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
                str5 = null;
            } else {
                str5 = str3;
            }
            String str8 = (i & 8) != 0 ? null : str4;
            Long l4 = (i & 16) != 0 ? null : l;
            if ((i & 32) != 0) {
                int i8 = onWarmupCompleted + 97;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                int i10 = 2 % 2;
                l3 = null;
            } else {
                l3 = l2;
            }
            this(str7, str6, str5, str8, l4, l3);
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 91;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            String str = this.iconUrl;
            int i5 = i3 + 113;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 97;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.mainText;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 49;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            String str = this.scheme;
            int i4 = i3 + 119;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public final Long IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 111;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Long l = this.impressionLogId;
            int i5 = i2 + 47;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return l;
        }

        public final Long onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 61;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                throw null;
            }
            Long l = this.clickLogId;
            int i4 = i3 + 73;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return l;
            }
            obj.hashCode();
            throw null;
        }
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (KSerializer) onNavigationEvent(iOnWarmupCompleted2, -1236920156, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, iOnWarmupCompleted, new Object[0], 1236920158);
    }

    public final LoanComparisonDetailProductInfo IAuthTabCallbackStub() {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (LoanComparisonDetailProductInfo) onNavigationEvent(iOnWarmupCompleted2, 835622575, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, iOnWarmupCompleted, new Object[]{this}, -835622575);
    }

    public final String getInterfaceDescriptor() {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (String) onNavigationEvent(iOnWarmupCompleted2, 524107051, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, iOnWarmupCompleted, new Object[]{this}, -524107048);
    }

    public final TopBanner extraCallbackWithResult() {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (TopBanner) onNavigationEvent(iOnWarmupCompleted2, 1224358338, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, iOnWarmupCompleted, new Object[]{this}, -1224358337);
    }

    @liq
    public static final class FeatureContent implements Parcelable {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final Long clickLogId;
        private final String helpText;
        private final String iconUrl;
        private final Long impressionLogId;
        private final String mainText;
        private final RemainingTimeInfo remainTimeInfo;
        private final String scheme;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<FeatureContent> CREATOR = new onNavigationEvent();

        public static final class onNavigationEvent implements Parcelable.Creator<FeatureContent> {
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final FeatureContent[] IAuthTabCallback(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback;
                int i4 = i3 + 85;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                FeatureContent[] featureContentArr = new FeatureContent[i];
                int i6 = i3 + 47;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                return featureContentArr;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ FeatureContent createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 115;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                FeatureContent featureContentOnWarmupCompleted = onWarmupCompleted(parcel);
                int i4 = onExtraCallback + 41;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return featureContentOnWarmupCompleted;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ FeatureContent[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 3;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                FeatureContent[] featureContentArrIAuthTabCallback = IAuthTabCallback(i);
                if (i4 == 0) {
                    int i5 = 54 / 0;
                }
                int i6 = onExtraCallback + 65;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    return featureContentArrIAuthTabCallback;
                }
                throw null;
            }

            public final FeatureContent onWarmupCompleted(Parcel parcel) {
                Long lValueOf;
                Long lValueOf2;
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                RemainingTimeInfo remainingTimeInfoCreateFromParcel = null;
                if (parcel.readInt() == 0) {
                    int i2 = onExtraCallback + 67;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 != 0) {
                        throw null;
                    }
                    lValueOf = null;
                } else {
                    lValueOf = Long.valueOf(parcel.readLong());
                }
                if (parcel.readInt() == 0) {
                    int i3 = onExtraCallbackWithResult + 61;
                    onExtraCallback = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 62 / 0;
                    }
                    lValueOf2 = null;
                } else {
                    lValueOf2 = Long.valueOf(parcel.readLong());
                }
                if (parcel.readInt() == 0) {
                    int i5 = onExtraCallbackWithResult + 31;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        remainingTimeInfoCreateFromParcel.hashCode();
                        throw null;
                    }
                } else {
                    remainingTimeInfoCreateFromParcel = RemainingTimeInfo.CREATOR.createFromParcel(parcel);
                }
                return new FeatureContent(string, string2, string3, string4, lValueOf, lValueOf2, remainingTimeInfoCreateFromParcel);
            }
        }

        static {
            int i = IAuthTabCallback + 5;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        public FeatureContent() {
            this((String) null, (String) null, (String) null, (String) null, (Long) null, (Long) null, (RemainingTimeInfo) null, 127, (DefaultConstructorMarker) null);
        }

        private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 67;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 93;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 34 / 0;
            }
            return 0;
        }

        public static /* synthetic */ Object onWarmupCompleted(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
            int i7 = i5 | i2 | i4;
            int i8 = (~((~i4) | i2)) | i5;
            int i9 = ~((~i5) | i2);
            int i10 = i5 + i2 + i3 + (1132004924 * i6) + ((-2047965933) * i);
            int i11 = i10 * i10;
            int i12 = ((1650805025 * i5) - 289800192) + ((-1513965855) * i2) + ((-565098208) * i7) + (i8 * 565098208) + (565098208 * i9) + ((-2079064064) * i3) + (1823473664 * i6) + (830210048 * i) + ((-1143341056) * i11);
            int i13 = ((i5 * (-767560105)) - 1188649921) + (i2 * (-767559017)) + (i7 * (-544)) + (i8 * 544) + (i9 * 544) + (i3 * (-767559561)) + (i6 * 1544553956) + (i * (-1468578859)) + (i11 * (-2108293120));
            return i12 + ((i13 * i13) * (-2075787264)) != 1 ? IAuthTabCallback(objArr) : onWarmupCompleted(objArr);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onWarmupCompleted + 99;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof FeatureContent)) {
                return false;
            }
            FeatureContent featureContent = (FeatureContent) obj;
            if (!Intrinsics.areEqual(this.iconUrl, featureContent.iconUrl)) {
                int i4 = onExtraCallback + 41;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.mainText, featureContent.mainText)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.scheme, featureContent.scheme)) {
                int i6 = onExtraCallback + 119;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.helpText, featureContent.helpText)) {
                return Intrinsics.areEqual(this.impressionLogId, featureContent.impressionLogId) && Intrinsics.areEqual(this.clickLogId, featureContent.clickLogId) && Intrinsics.areEqual(this.remainTimeInfo, featureContent.remainTimeInfo);
            }
            int i8 = onWarmupCompleted + 81;
            int i9 = i8 % 128;
            onExtraCallback = i9;
            int i10 = i8 % 2;
            int i11 = i9 + 105;
            onWarmupCompleted = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x003b A[PHI: r1 r3 r4
          0x003b: PHI (r1v20 int) = (r1v5 int), (r1v22 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
          0x003b: PHI (r3v4 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
          0x003b: PHI (r4v6 java.lang.String) = (r4v0 java.lang.String), (r4v8 java.lang.String) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0030 A[PHI: r1 r3
          0x0030: PHI (r1v6 int) = (r1v5 int), (r1v22 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
          0x0030: PHI (r3v2 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int hashCode() {
            /*
                r9 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = viva.republica.toss.network.model.loan.LoanComparisonDetailResponse.FeatureContent.onExtraCallback
                int r1 = r1 + 17
                int r2 = r1 % 128
                viva.republica.toss.network.model.loan.LoanComparisonDetailResponse.FeatureContent.onWarmupCompleted = r2
                int r1 = r1 % r0
                r2 = 0
                if (r1 != 0) goto L20
                java.lang.String r1 = r9.iconUrl
                int r1 = r1.hashCode()
                java.lang.String r3 = r9.mainText
                int r3 = r3.hashCode()
                java.lang.String r4 = r9.scheme
                if (r4 != 0) goto L3b
                goto L30
            L20:
                java.lang.String r1 = r9.iconUrl
                int r1 = r1.hashCode()
                java.lang.String r3 = r9.mainText
                int r3 = r3.hashCode()
                java.lang.String r4 = r9.scheme
                if (r4 != 0) goto L3b
            L30:
                int r4 = viva.republica.toss.network.model.loan.LoanComparisonDetailResponse.FeatureContent.onExtraCallback
                int r4 = r4 + 63
                int r5 = r4 % 128
                viva.republica.toss.network.model.loan.LoanComparisonDetailResponse.FeatureContent.onWarmupCompleted = r5
                int r4 = r4 % r0
                r4 = r2
                goto L3f
            L3b:
                int r4 = r4.hashCode()
            L3f:
                java.lang.String r5 = r9.helpText
                if (r5 != 0) goto L45
                r5 = r2
                goto L49
            L45:
                int r5 = r5.hashCode()
            L49:
                java.lang.Long r6 = r9.impressionLogId
                if (r6 != 0) goto L4f
                r6 = r2
                goto L53
            L4f:
                int r6 = r6.hashCode()
            L53:
                java.lang.Long r7 = r9.clickLogId
                if (r7 != 0) goto L62
                int r7 = viva.republica.toss.network.model.loan.LoanComparisonDetailResponse.FeatureContent.onWarmupCompleted
                int r7 = r7 + 43
                int r8 = r7 % 128
                viva.republica.toss.network.model.loan.LoanComparisonDetailResponse.FeatureContent.onExtraCallback = r8
                int r7 = r7 % r0
                r0 = r2
                goto L66
            L62:
                int r0 = r7.hashCode()
            L66:
                viva.republica.toss.network.model.loan.RemainingTimeInfo r7 = r9.remainTimeInfo
                if (r7 == 0) goto L6e
                int r2 = r7.hashCode()
            L6e:
                int r1 = r1 * 31
                int r1 = r1 + r3
                int r1 = r1 * 31
                int r1 = r1 + r4
                int r1 = r1 * 31
                int r1 = r1 + r5
                int r1 = r1 * 31
                int r1 = r1 + r6
                int r1 = r1 * 31
                int r1 = r1 + r0
                int r1 = r1 * 31
                int r1 = r1 + r2
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanComparisonDetailResponse.FeatureContent.hashCode():int");
        }

        public String toString() {
            int i = 2 % 2;
            String str = "FeatureContent(iconUrl=" + this.iconUrl + ", mainText=" + this.mainText + ", scheme=" + this.scheme + ", helpText=" + this.helpText + ", impressionLogId=" + this.impressionLogId + ", clickLogId=" + this.clickLogId + ", remainTimeInfo=" + this.remainTimeInfo + ")";
            int i2 = onExtraCallback + 37;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.iconUrl);
            parcel.writeString(this.mainText);
            parcel.writeString(this.scheme);
            parcel.writeString(this.helpText);
            Long l = this.impressionLogId;
            if (l == null) {
                int i3 = onWarmupCompleted + 47;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l.longValue());
                int i5 = onExtraCallback + 23;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
            }
            Long l2 = this.clickLogId;
            if (l2 == null) {
                int i7 = onExtraCallback + 87;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l2.longValue());
            }
            RemainingTimeInfo remainingTimeInfo = this.remainTimeInfo;
            if (remainingTimeInfo != null) {
                parcel.writeInt(1);
                remainingTimeInfo.writeToParcel(parcel, i);
                return;
            }
            int i9 = onWarmupCompleted + 55;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            parcel.writeInt(0);
            int i11 = onWarmupCompleted + 67;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<FeatureContent> serializer() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 77;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                LoanComparisonDetailResponse$FeatureContent$$serializer loanComparisonDetailResponse$FeatureContent$$serializer = LoanComparisonDetailResponse$FeatureContent$$serializer.INSTANCE;
                int i4 = IAuthTabCallback + 85;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return loanComparisonDetailResponse$FeatureContent$$serializer;
            }
        }

        public /* synthetic */ FeatureContent(int i, String str, String str2, String str3, String str4, Long l, Long l2, RemainingTimeInfo remainingTimeInfo, okycx okycxVar) {
            if ((i & 1) == 0) {
                this.iconUrl = "";
            } else {
                this.iconUrl = str;
            }
            if ((i & 2) == 0) {
                int i2 = onExtraCallback + 65;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                this.mainText = "";
            } else {
                this.mainText = str2;
                int i4 = onExtraCallback + 69;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 2;
                }
            }
            if ((i & 4) == 0) {
                this.scheme = null;
                int i6 = onExtraCallback + 107;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 2 % 2;
                }
            } else {
                this.scheme = str3;
            }
            if ((i & 8) == 0) {
                int i8 = onExtraCallback + 93;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                this.helpText = null;
                if (i9 == 0) {
                    throw null;
                }
                int i10 = 2 % 2;
            } else {
                this.helpText = str4;
            }
            if ((i & 16) == 0) {
                this.impressionLogId = null;
            } else {
                this.impressionLogId = l;
            }
            if ((i & 32) == 0) {
                this.clickLogId = null;
            } else {
                this.clickLogId = l2;
            }
            int i11 = 2 % 2;
            if ((i & 64) == 0) {
                this.remainTimeInfo = null;
            } else {
                this.remainTimeInfo = remainingTimeInfo;
            }
        }

        public FeatureContent(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, @Nullable Long l, @Nullable Long l2, @Nullable RemainingTimeInfo remainingTimeInfo) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.iconUrl = str;
            this.mainText = str2;
            this.scheme = str3;
            this.helpText = str4;
            this.impressionLogId = l;
            this.clickLogId = l2;
            this.remainTimeInfo = remainingTimeInfo;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void onNavigationEvent(viva.republica.toss.network.model.loan.LoanComparisonDetailResponse.FeatureContent r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
            /*
                Method dump skipped, instructions count: 234
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanComparisonDetailResponse.FeatureContent.onNavigationEvent(viva.republica.toss.network.model.loan.LoanComparisonDetailResponse$FeatureContent, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ FeatureContent(String str, String str2, String str3, String str4, Long l, Long l2, RemainingTimeInfo remainingTimeInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
            String str5;
            Long l3;
            RemainingTimeInfo remainingTimeInfo2 = null;
            if ((i & 1) != 0) {
                int i2 = onExtraCallback + 23;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
                str = "";
            }
            String str6 = (i & 2) == 0 ? str2 : "";
            String str7 = (i & 4) != 0 ? null : str3;
            if ((i & 8) != 0) {
                int i3 = onExtraCallback + 73;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 87 / 0;
                }
                str5 = null;
            } else {
                str5 = str4;
            }
            Long l4 = (i & 16) != 0 ? null : l;
            if ((i & 32) != 0) {
                int i5 = onWarmupCompleted + 87;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
                l3 = null;
            } else {
                l3 = l2;
            }
            if ((i & 64) != 0) {
                int i6 = onExtraCallback + 33;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                int i8 = 2 % 2;
            } else {
                remainingTimeInfo2 = remainingTimeInfo;
            }
            this(str, str6, str7, str5, l4, l3, remainingTimeInfo2);
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 69;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.iconUrl;
            }
            throw null;
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 13;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            String str = this.mainText;
            int i5 = i2 + 1;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 29;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.scheme;
            int i4 = i2 + 19;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 43;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            String str = this.helpText;
            int i4 = i2 + 25;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 53 / 0;
            }
            return str;
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            FeatureContent featureContent = (FeatureContent) objArr[0];
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 109;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            Long l = featureContent.impressionLogId;
            int i5 = i3 + 1;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return l;
            }
            throw null;
        }

        public final Long IAuthTabCallback() {
            Long l;
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 45;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                l = this.clickLogId;
                int i4 = 38 / 0;
            } else {
                l = this.clickLogId;
            }
            int i5 = i2 + 119;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return l;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final RemainingTimeInfo onTransact() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 59;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            RemainingTimeInfo remainingTimeInfo = this.remainTimeInfo;
            int i5 = i3 + 73;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return remainingTimeInfo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            return ((Integer) onWarmupCompleted(new Object[]{this}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1630931865, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback, -1630931865, GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).intValue();
        }

        public final Long onExtraCallbackWithResult() {
            int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            return (Long) onWarmupCompleted(new Object[]{this}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1426611428, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback, -1426611427, GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
        }
    }

    @liq
    public static final class RejectionInfo implements Parcelable {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final int rejectionDaysBefore;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<RejectionInfo> CREATOR = new onNavigationEvent();

        public static final class onNavigationEvent implements Parcelable.Creator<RejectionInfo> {
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ RejectionInfo createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 115;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                RejectionInfo rejectionInfoOnExtraCallback = onExtraCallback(parcel);
                int i4 = onExtraCallback + 15;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return rejectionInfoOnExtraCallback;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ RejectionInfo[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 57;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                RejectionInfo[] rejectionInfoArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
                int i5 = onExtraCallbackWithResult + 11;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return rejectionInfoArrOnExtraCallbackWithResult;
            }

            public final RejectionInfo onExtraCallback(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                RejectionInfo rejectionInfo = new RejectionInfo(parcel.readInt());
                int i2 = onExtraCallbackWithResult + 25;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return rejectionInfo;
            }

            public final RejectionInfo[] onExtraCallbackWithResult(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult;
                int i4 = i3 + 21;
                onExtraCallback = i4 % 128;
                RejectionInfo[] rejectionInfoArr = new RejectionInfo[i];
                if (i4 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = i3 + 103;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return rejectionInfoArr;
            }
        }

        static {
            int i = IAuthTabCallback + 125;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RejectionInfo)) {
                int i2 = onWarmupCompleted + 95;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            if (this.rejectionDaysBefore != ((RejectionInfo) obj).rejectionDaysBefore) {
                return false;
            }
            int i4 = onNavigationEvent + 29;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 117;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = Integer.hashCode(this.rejectionDaysBefore);
            int i4 = onWarmupCompleted + 95;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "RejectionInfo(rejectionDaysBefore=" + this.rejectionDaysBefore + ")";
            int i2 = onWarmupCompleted + 7;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 53;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.rejectionDaysBefore);
            int i5 = onWarmupCompleted + 59;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final class Companion {
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<RejectionInfo> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 33;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                LoanComparisonDetailResponse$RejectionInfo$.serializer serializerVar = LoanComparisonDetailResponse$RejectionInfo$.serializer.INSTANCE;
                int i4 = onWarmupCompleted + 39;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 9 / 0;
                }
                return serializerVar;
            }
        }

        public RejectionInfo(int i) {
            this.rejectionDaysBefore = i;
        }

        public /* synthetic */ RejectionInfo(int i, int i2, okycx okycxVar) {
            if (1 != (i & 1)) {
                int i3 = onWarmupCompleted + 47;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                htf31.onExtraCallbackWithResult(i, 1, LoanComparisonDetailResponse$RejectionInfo$.serializer.INSTANCE.getDescriptor());
                int i5 = onNavigationEvent + 89;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 2 % 2;
                }
            }
            this.rejectionDaysBefore = i2;
        }

        @JvmStatic
        public static final /* synthetic */ void onExtraCallback(RejectionInfo rejectionInfo, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 47;
            onNavigationEvent = i2 % 128;
            vylVar.onExtraCallback(serialDescriptor, i2 % 2 == 0 ? 1 : 0, rejectionInfo.rejectionDaysBefore);
        }

        public final int onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 15;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            int i5 = this.rejectionDaysBefore;
            int i6 = i3 + 103;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                return i5;
            }
            throw null;
        }
    }

    @liq
    public static final class LowApprovalRatioInfo implements Parcelable {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final boolean isLowApprovalRatioCtaVisible;
        private final Banner lowApprovalRatioBannerInfo;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<LowApprovalRatioInfo> CREATOR = new IAuthTabCallback();

        public static final class IAuthTabCallback implements Parcelable.Creator<LowApprovalRatioInfo> {
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ LowApprovalRatioInfo createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 45;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                LowApprovalRatioInfo lowApprovalRatioInfoOnWarmupCompleted = onWarmupCompleted(parcel);
                if (i3 == 0) {
                    int i4 = 5 / 0;
                }
                return lowApprovalRatioInfoOnWarmupCompleted;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ LowApprovalRatioInfo[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 105;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                LowApprovalRatioInfo[] lowApprovalRatioInfoArrOnWarmupCompleted = onWarmupCompleted(i);
                int i5 = onWarmupCompleted + 43;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return lowApprovalRatioInfoArrOnWarmupCompleted;
            }

            public final LowApprovalRatioInfo onWarmupCompleted(Parcel parcel) {
                Banner bannerCreateFromParcel;
                boolean z;
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                if (parcel.readInt() == 0) {
                    int i2 = onWarmupCompleted;
                    int i3 = i2 + 105;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    int i5 = i2 + 55;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 4 / 2;
                    }
                    bannerCreateFromParcel = null;
                } else {
                    bannerCreateFromParcel = Banner.CREATOR.createFromParcel(parcel);
                }
                Banner banner = bannerCreateFromParcel;
                if (parcel.readInt() != 0) {
                    int i7 = onWarmupCompleted + 27;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    z = true;
                } else {
                    z = false;
                }
                return new LowApprovalRatioInfo(banner, z);
            }

            public final LowApprovalRatioInfo[] onWarmupCompleted(int i) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted;
                int i4 = i3 + 93;
                onNavigationEvent = i4 % 128;
                LowApprovalRatioInfo[] lowApprovalRatioInfoArr = new LowApprovalRatioInfo[i];
                if (i4 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = i3 + 27;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return lowApprovalRatioInfoArr;
            }
        }

        static {
            int i = onExtraCallback + 31;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public LowApprovalRatioInfo() {
            Banner banner = null;
            this(banner, false, 3, (DefaultConstructorMarker) banner);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 75;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 49;
            onNavigationEvent = i3 % 128;
            Object obj2 = null;
            if (i3 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            if (this == obj) {
                int i4 = i2 + 61;
                onNavigationEvent = i4 % 128;
                return i4 % 2 != 0;
            }
            if (!(obj instanceof LowApprovalRatioInfo)) {
                int i5 = i2 + 23;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            LowApprovalRatioInfo lowApprovalRatioInfo = (LowApprovalRatioInfo) obj;
            if (Intrinsics.areEqual(this.lowApprovalRatioBannerInfo, lowApprovalRatioInfo.lowApprovalRatioBannerInfo)) {
                if (this.isLowApprovalRatioCtaVisible == lowApprovalRatioInfo.isLowApprovalRatioCtaVisible) {
                    return true;
                }
                int i7 = onNavigationEvent + 65;
                onWarmupCompleted = i7 % 128;
                return i7 % 2 != 0;
            }
            int i8 = onNavigationEvent + 11;
            int i9 = i8 % 128;
            onWarmupCompleted = i9;
            boolean z = i8 % 2 != 0;
            int i10 = i9 + 89;
            onNavigationEvent = i10 % 128;
            if (i10 % 2 != 0) {
                return z;
            }
            throw null;
        }

        public int hashCode() {
            int i;
            int i2 = 2 % 2;
            Banner banner = this.lowApprovalRatioBannerInfo;
            if (banner == null) {
                int i3 = onNavigationEvent + 95;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                i = 0;
            } else {
                int iHashCode = banner.hashCode();
                int i5 = onWarmupCompleted + 101;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                i = iHashCode;
            }
            return (i * 31) + Boolean.hashCode(this.isLowApprovalRatioCtaVisible);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "LowApprovalRatioInfo(lowApprovalRatioBannerInfo=" + this.lowApprovalRatioBannerInfo + ", isLowApprovalRatioCtaVisible=" + this.isLowApprovalRatioCtaVisible + ")";
            int i2 = onWarmupCompleted + 75;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002d A[PHI: r1
          0x002d: PHI (r1v6 viva.republica.toss.network.model.loan.LoanComparisonDetailResponse$LowApprovalRatioInfo$Banner) = 
          (r1v4 viva.republica.toss.network.model.loan.LoanComparisonDetailResponse$LowApprovalRatioInfo$Banner)
          (r1v7 viva.republica.toss.network.model.loan.LoanComparisonDetailResponse$LowApprovalRatioInfo$Banner)
         binds: [B:8:0x001e, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
        @Override // android.os.Parcelable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel r5, int r6) {
            /*
                r4 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = viva.republica.toss.network.model.loan.LoanComparisonDetailResponse.LowApprovalRatioInfo.onWarmupCompleted
                int r1 = r1 + 109
                int r2 = r1 % 128
                viva.republica.toss.network.model.loan.LoanComparisonDetailResponse.LowApprovalRatioInfo.onNavigationEvent = r2
                int r1 = r1 % r0
                r2 = 0
                java.lang.String r3 = ""
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
                if (r1 != 0) goto L1c
                viva.republica.toss.network.model.loan.LoanComparisonDetailResponse$LowApprovalRatioInfo$Banner r1 = r4.lowApprovalRatioBannerInfo
                r3 = 46
                int r3 = r3 / r2
                if (r1 != 0) goto L2d
                goto L20
            L1c:
                viva.republica.toss.network.model.loan.LoanComparisonDetailResponse$LowApprovalRatioInfo$Banner r1 = r4.lowApprovalRatioBannerInfo
                if (r1 != 0) goto L2d
            L20:
                r5.writeInt(r2)
                int r6 = viva.republica.toss.network.model.loan.LoanComparisonDetailResponse.LowApprovalRatioInfo.onWarmupCompleted
                int r6 = r6 + 69
                int r1 = r6 % 128
                viva.republica.toss.network.model.loan.LoanComparisonDetailResponse.LowApprovalRatioInfo.onNavigationEvent = r1
                int r6 = r6 % r0
                goto L34
            L2d:
                r2 = 1
                r5.writeInt(r2)
                r1.writeToParcel(r5, r6)
            L34:
                boolean r6 = r4.isLowApprovalRatioCtaVisible
                r5.writeInt(r6)
                int r5 = viva.republica.toss.network.model.loan.LoanComparisonDetailResponse.LowApprovalRatioInfo.onWarmupCompleted
                int r5 = r5 + 53
                int r6 = r5 % 128
                viva.republica.toss.network.model.loan.LoanComparisonDetailResponse.LowApprovalRatioInfo.onNavigationEvent = r6
                int r5 = r5 % r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanComparisonDetailResponse.LowApprovalRatioInfo.writeToParcel(android.os.Parcel, int):void");
        }

        public static final class Companion {
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<LowApprovalRatioInfo> serializer() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 49;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                LoanComparisonDetailResponse$LowApprovalRatioInfo$.serializer serializerVar = LoanComparisonDetailResponse$LowApprovalRatioInfo$.serializer.INSTANCE;
                int i4 = onWarmupCompleted + 49;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return serializerVar;
                }
                throw null;
            }
        }

        public /* synthetic */ LowApprovalRatioInfo(int i, Banner banner, boolean z, okycx okycxVar) {
            Object obj = null;
            this.lowApprovalRatioBannerInfo = (i & 1) == 0 ? null : banner;
            if ((i & 2) == 0) {
                int i2 = onNavigationEvent + 1;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                this.isLowApprovalRatioCtaVisible = false;
                return;
            }
            this.isLowApprovalRatioCtaVisible = z;
            int i4 = onNavigationEvent + 65;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        public LowApprovalRatioInfo(@Nullable Banner banner, boolean z) {
            this.lowApprovalRatioBannerInfo = banner;
            this.isLowApprovalRatioCtaVisible = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void onExtraCallbackWithResult(viva.republica.toss.network.model.loan.LoanComparisonDetailResponse.LowApprovalRatioInfo r4, o.vyl r5, kotlinx.serialization.descriptors.SerialDescriptor r6) {
            /*
                r0 = 2
                int r1 = r0 % r0
                r1 = 0
                boolean r2 = r5.onWarmupCompleted(r6, r1)
                if (r2 != 0) goto L17
                int r2 = viva.republica.toss.network.model.loan.LoanComparisonDetailResponse.LowApprovalRatioInfo.onWarmupCompleted
                int r2 = r2 + 45
                int r3 = r2 % 128
                viva.republica.toss.network.model.loan.LoanComparisonDetailResponse.LowApprovalRatioInfo.onNavigationEvent = r3
                int r2 = r2 % r0
                viva.republica.toss.network.model.loan.LoanComparisonDetailResponse$LowApprovalRatioInfo$Banner r2 = r4.lowApprovalRatioBannerInfo
                if (r2 == 0) goto L1e
            L17:
                viva.republica.toss.network.model.loan.LoanComparisonDetailResponse$LowApprovalRatioInfo$Banner$$serializer r2 = viva.republica.toss.network.model.loan.LoanComparisonDetailResponse$LowApprovalRatioInfo$Banner$.serializer.INSTANCE
                viva.republica.toss.network.model.loan.LoanComparisonDetailResponse$LowApprovalRatioInfo$Banner r3 = r4.lowApprovalRatioBannerInfo
                r5.onExtraCallbackWithResult(r6, r1, r2, r3)
            L1e:
                r1 = 1
                boolean r2 = r5.onWarmupCompleted(r6, r1)
                if (r2 != 0) goto L39
                int r2 = viva.republica.toss.network.model.loan.LoanComparisonDetailResponse.LowApprovalRatioInfo.onNavigationEvent
                int r2 = r2 + 5
                int r3 = r2 % 128
                viva.republica.toss.network.model.loan.LoanComparisonDetailResponse.LowApprovalRatioInfo.onWarmupCompleted = r3
                int r2 = r2 % r0
                if (r2 != 0) goto L35
                boolean r0 = r4.isLowApprovalRatioCtaVisible
                if (r0 == 0) goto L3e
                goto L39
            L35:
                boolean r4 = r4.isLowApprovalRatioCtaVisible
                r4 = 0
                throw r4
            L39:
                boolean r4 = r4.isLowApprovalRatioCtaVisible
                r5.onNavigationEvent(r6, r1, r4)
            L3e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanComparisonDetailResponse.LowApprovalRatioInfo.onExtraCallbackWithResult(viva.republica.toss.network.model.loan.LoanComparisonDetailResponse$LowApprovalRatioInfo, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ LowApprovalRatioInfo(Banner banner, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onNavigationEvent + 79;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
                banner = null;
            }
            if ((i & 2) != 0) {
                int i5 = onWarmupCompleted + 13;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                z = false;
            }
            this(banner, z);
        }

        public final Banner onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 13;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            Banner banner = this.lowApprovalRatioBannerInfo;
            int i5 = i3 + 111;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return banner;
        }

        @liq
        public static final class Banner implements Parcelable {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted = 1;
            private final String iconUrl;
            private final String landingUrl;
            private final String text;
            public static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<Banner> CREATOR = new onExtraCallbackWithResult();

            public static final class onExtraCallbackWithResult implements Parcelable.Creator<Banner> {
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Banner IAuthTabCallback(Parcel parcel) {
                    int i = 2 % 2;
                    Intrinsics.checkNotNullParameter(parcel, "");
                    Banner banner = new Banner(parcel.readString(), parcel.readString(), parcel.readString());
                    int i2 = onExtraCallback + 69;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i3 = 18 / 0;
                    }
                    return banner;
                }

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ Banner createFromParcel(Parcel parcel) {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 25;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    Banner bannerIAuthTabCallback = IAuthTabCallback(parcel);
                    int i4 = onExtraCallback + 115;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 33 / 0;
                    }
                    return bannerIAuthTabCallback;
                }

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ Banner[] newArray(int i) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback + 25;
                    onNavigationEvent = i3 % 128;
                    if (i3 % 2 != 0) {
                        return onWarmupCompleted(i);
                    }
                    onWarmupCompleted(i);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public final Banner[] onWarmupCompleted(int i) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback;
                    int i4 = i3 + 35;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    Banner[] bannerArr = new Banner[i];
                    int i6 = i3 + 99;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    return bannerArr;
                }
            }

            static {
                int i = IAuthTabCallback + 89;
                onNavigationEvent = i % 128;
                if (i % 2 == 0) {
                    int i2 = 15 / 0;
                }
            }

            public Banner() {
                this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 99;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 13;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return 0;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Banner)) {
                    int i2 = onExtraCallbackWithResult + 43;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    return false;
                }
                Banner banner = (Banner) obj;
                if ((!Intrinsics.areEqual(this.text, banner.text)) || !Intrinsics.areEqual(this.iconUrl, banner.iconUrl)) {
                    return false;
                }
                if (Intrinsics.areEqual(this.landingUrl, banner.landingUrl)) {
                    return true;
                }
                int i4 = onWarmupCompleted + 89;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return false;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public int hashCode() {
                int iHashCode;
                int i = 2 % 2;
                int i2 = onWarmupCompleted;
                int i3 = i2 + 111;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                String str = this.text;
                int iHashCode2 = 0;
                if (str == null) {
                    int i5 = i2 + 43;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    iHashCode = 0;
                } else {
                    iHashCode = str.hashCode();
                }
                String str2 = this.iconUrl;
                int iHashCode3 = str2 == null ? 0 : str2.hashCode();
                String str3 = this.landingUrl;
                if (str3 != null) {
                    int i7 = onExtraCallbackWithResult + 43;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    iHashCode2 = str3.hashCode();
                }
                int i9 = (((iHashCode * 31) + iHashCode3) * 31) + iHashCode2;
                int i10 = onWarmupCompleted + 23;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
                return i9;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Banner(text=" + this.text + ", iconUrl=" + this.iconUrl + ", landingUrl=" + this.landingUrl + ")";
                int i2 = onExtraCallbackWithResult + 61;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 105;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.text);
                parcel.writeString(this.iconUrl);
                parcel.writeString(this.landingUrl);
                int i5 = onExtraCallbackWithResult + 81;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
            }

            public static final class Companion {
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Banner> serializer() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 107;
                    IAuthTabCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        LoanComparisonDetailResponse$LowApprovalRatioInfo$Banner$.serializer serializerVar = LoanComparisonDetailResponse$LowApprovalRatioInfo$Banner$.serializer.INSTANCE;
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    LoanComparisonDetailResponse$LowApprovalRatioInfo$Banner$.serializer serializerVar2 = LoanComparisonDetailResponse$LowApprovalRatioInfo$Banner$.serializer.INSTANCE;
                    int i3 = onExtraCallback + 55;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    return serializerVar2;
                }
            }

            public /* synthetic */ Banner(int i, String str, String str2, String str3, okycx okycxVar) {
                if ((i & 1) == 0) {
                    this.text = null;
                } else {
                    this.text = str;
                    int i2 = onWarmupCompleted + 27;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 4 / 5;
                    } else {
                        int i4 = 2 % 2;
                    }
                }
                if ((i & 2) == 0) {
                    this.iconUrl = null;
                    int i5 = onWarmupCompleted + 67;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    int i7 = 2 % 2;
                } else {
                    this.iconUrl = str2;
                }
                if ((i & 4) == 0) {
                    this.landingUrl = null;
                    return;
                }
                this.landingUrl = str3;
                int i8 = onWarmupCompleted + 121;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
            }

            public Banner(@Nullable String str, @Nullable String str2, @Nullable String str3) {
                this.text = str;
                this.iconUrl = str2;
                this.landingUrl = str3;
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
            @kotlin.jvm.JvmStatic
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static final /* synthetic */ void IAuthTabCallback(viva.republica.toss.network.model.loan.LoanComparisonDetailResponse.LowApprovalRatioInfo.Banner r4, o.vyl r5, kotlinx.serialization.descriptors.SerialDescriptor r6) {
                /*
                    r0 = 2
                    int r1 = r0 % r0
                    r1 = 0
                    boolean r2 = r5.onWarmupCompleted(r6, r1)
                    if (r2 != 0) goto L17
                    int r2 = viva.republica.toss.network.model.loan.LoanComparisonDetailResponse.LowApprovalRatioInfo.Banner.onWarmupCompleted
                    int r2 = r2 + 125
                    int r3 = r2 % 128
                    viva.republica.toss.network.model.loan.LoanComparisonDetailResponse.LowApprovalRatioInfo.Banner.onExtraCallbackWithResult = r3
                    int r2 = r2 % r0
                    java.lang.String r2 = r4.text
                    if (r2 == 0) goto L27
                L17:
                    o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
                    java.lang.String r3 = r4.text
                    r5.onExtraCallbackWithResult(r6, r1, r2, r3)
                    int r1 = viva.republica.toss.network.model.loan.LoanComparisonDetailResponse.LowApprovalRatioInfo.Banner.onExtraCallbackWithResult
                    int r1 = r1 + 21
                    int r2 = r1 % 128
                    viva.republica.toss.network.model.loan.LoanComparisonDetailResponse.LowApprovalRatioInfo.Banner.onWarmupCompleted = r2
                    int r1 = r1 % r0
                L27:
                    r1 = 1
                    boolean r2 = r5.onWarmupCompleted(r6, r1)
                    if (r2 != 0) goto L32
                    java.lang.String r2 = r4.iconUrl
                    if (r2 == 0) goto L39
                L32:
                    o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
                    java.lang.String r3 = r4.iconUrl
                    r5.onExtraCallbackWithResult(r6, r1, r2, r3)
                L39:
                    boolean r1 = r5.onWarmupCompleted(r6, r0)
                    if (r1 != 0) goto L43
                    java.lang.String r1 = r4.landingUrl
                    if (r1 == 0) goto L4a
                L43:
                    o.getWriggleLayout r1 = o.getWriggleLayout.onNavigationEvent
                    java.lang.String r4 = r4.landingUrl
                    r5.onExtraCallbackWithResult(r6, r0, r1, r4)
                L4a:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanComparisonDetailResponse.LowApprovalRatioInfo.Banner.IAuthTabCallback(viva.republica.toss.network.model.loan.LoanComparisonDetailResponse$LowApprovalRatioInfo$Banner, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ Banner(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i & 1) != 0) {
                    int i2 = 2 % 2;
                    str = null;
                }
                if ((i & 2) != 0) {
                    int i3 = onWarmupCompleted + 97;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    str2 = null;
                }
                if ((i & 4) != 0) {
                    int i5 = onExtraCallbackWithResult + 7;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    int i7 = 2 % 2;
                    str3 = null;
                }
                this(str, str2, str3);
            }

            public final String onExtraCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 27;
                onWarmupCompleted = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    throw null;
                }
                String str = this.text;
                int i4 = i2 + 79;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return str;
                }
                obj.hashCode();
                throw null;
            }

            public final String IAuthTabCallback() {
                String str;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 53;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    str = this.iconUrl;
                    int i4 = 1 / 0;
                } else {
                    str = this.iconUrl;
                }
                int i5 = i2 + 105;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 46 / 0;
                }
                return str;
            }

            public final String onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 39;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                String str = this.landingUrl;
                int i5 = i2 + 39;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 3 / 0;
                }
                return str;
            }
        }

        public final boolean IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 25;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            boolean z = this.isLowApprovalRatioCtaVisible;
            int i5 = i3 + 123;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 84 / 0;
            }
            return z;
        }
    }
}
