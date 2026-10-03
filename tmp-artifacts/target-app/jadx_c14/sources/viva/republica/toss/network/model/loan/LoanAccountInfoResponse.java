package viva.republica.toss.network.model.loan;

import android.os.Parcel;
import android.os.Parcelable;
import im.toss.deeplink.ksp.registry.FeaturesMydataKspDeepLinkRegistry$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
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
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class LoanAccountInfoResponse implements Parcelable {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final long accountId;
    private final LoanAccountResponse accountInfo;
    private final List<RefinancingResultResponse> canceledRequests;
    private final long commissionAmount;
    private final List<RefinancingResultResponse> droppedRequests;
    private final List<RefinancingResultResponse> failedRequests;
    private final List<RefinancingResultResponse> inspectRequests;
    private final List<RefinancingResultResponse> preScreenCompleteRequests;
    private final boolean refinancable;
    private final RefinancingAvailableTimeRange refinancingAvailableTimeRange;
    private final LoanRefinancingAccountStatusResponse refinancingStatus;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LoanAccountInfoResponse> CREATOR = new IAuthTabCallback();

    public static final class IAuthTabCallback implements Parcelable.Creator<LoanAccountInfoResponse> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ LoanAccountInfoResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 53;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            LoanAccountInfoResponse loanAccountInfoResponseOnWarmupCompleted = onWarmupCompleted(parcel);
            if (i3 != 0) {
                int i4 = 80 / 0;
            }
            return loanAccountInfoResponseOnWarmupCompleted;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ LoanAccountInfoResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 115;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            LoanAccountInfoResponse[] loanAccountInfoResponseArrOnExtraCallback = onExtraCallback(i);
            int i5 = onWarmupCompleted + 13;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return loanAccountInfoResponseArrOnExtraCallback;
            }
            throw null;
        }

        public final LoanAccountInfoResponse[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback;
            int i4 = i3 + 103;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            LoanAccountInfoResponse[] loanAccountInfoResponseArr = new LoanAccountInfoResponse[i];
            int i6 = i3 + 49;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 42 / 0;
            }
            return loanAccountInfoResponseArr;
        }

        public final LoanAccountInfoResponse onWarmupCompleted(Parcel parcel) {
            boolean z;
            RefinancingAvailableTimeRange refinancingAvailableTimeRangeCreateFromParcel;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            long j = parcel.readLong();
            LoanAccountResponse loanAccountResponseCreateFromParcel = LoanAccountResponse.CREATOR.createFromParcel(parcel);
            LoanRefinancingAccountStatusResponse loanRefinancingAccountStatusResponseCreateFromParcel = LoanRefinancingAccountStatusResponse.CREATOR.createFromParcel(parcel);
            long j2 = parcel.readLong();
            if (parcel.readInt() != 0) {
                int i2 = onWarmupCompleted + 63;
                IAuthTabCallback = i2 % 128;
                z = i2 % 2 != 0;
            } else {
                z = false;
            }
            if (parcel.readInt() == 0) {
                int i3 = onWarmupCompleted + 79;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                refinancingAvailableTimeRangeCreateFromParcel = null;
            } else {
                refinancingAvailableTimeRangeCreateFromParcel = RefinancingAvailableTimeRange.CREATOR.createFromParcel(parcel);
            }
            RefinancingAvailableTimeRange refinancingAvailableTimeRange = refinancingAvailableTimeRangeCreateFromParcel;
            int i5 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i5);
            int i6 = IAuthTabCallback + 51;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            for (int i8 = 0; i8 != i5; i8++) {
                int i9 = IAuthTabCallback + 91;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                arrayList.add(RefinancingResultResponse.CREATOR.createFromParcel(parcel));
            }
            int i11 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList2.add(RefinancingResultResponse.CREATOR.createFromParcel(parcel));
            }
            int i13 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i13);
            int i14 = 0;
            while (i14 != i13) {
                int i15 = IAuthTabCallback + 119;
                onWarmupCompleted = i15 % 128;
                int i16 = i15 % 2;
                arrayList3.add(RefinancingResultResponse.CREATOR.createFromParcel(parcel));
                i14++;
                i13 = i13;
            }
            int i17 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i17);
            for (int i18 = 0; i18 != i17; i18++) {
                arrayList4.add(RefinancingResultResponse.CREATOR.createFromParcel(parcel));
            }
            int i19 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(i19);
            int i20 = 0;
            while (i20 != i19) {
                int i21 = i19;
                int i22 = IAuthTabCallback + 21;
                onWarmupCompleted = i22 % 128;
                int i23 = i22 % 2;
                arrayList5.add(RefinancingResultResponse.CREATOR.createFromParcel(parcel));
                i20++;
                arrayList4 = arrayList4;
                i19 = i21;
            }
            return new LoanAccountInfoResponse(j, loanAccountResponseCreateFromParcel, loanRefinancingAccountStatusResponseCreateFromParcel, j2, z, refinancingAvailableTimeRange, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
        }
    }

    public LoanAccountInfoResponse() {
        this(0L, (LoanAccountResponse) null, (LoanRefinancingAccountStatusResponse) null, 0L, false, (RefinancingAvailableTimeRange) null, (List) null, (List) null, (List) null, (List) null, (List) null, 2047, (DefaultConstructorMarker) null);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            ICustomTabsCallback();
            throw null;
        }
        KSerializer kSerializerICustomTabsCallback = ICustomTabsCallback();
        int i3 = onWarmupCompleted + 31;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return kSerializerICustomTabsCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return onMessageChannelReady();
        }
        onMessageChannelReady();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ KSerializer ICustomTabsCallback() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(RefinancingResultResponse$$serializer.INSTANCE);
        int i2 = onExtraCallbackWithResult + 117;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    private static final /* synthetic */ KSerializer extraCallback() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(RefinancingResultResponse$$serializer.INSTANCE);
        int i2 = onWarmupCompleted + 113;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return checkcanopenlandingpage;
        }
        throw null;
    }

    private static final /* synthetic */ KSerializer onActivityResized() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(RefinancingResultResponse$$serializer.INSTANCE);
        int i2 = onWarmupCompleted + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        LoanAccountInfoResponse loanAccountInfoResponse = (LoanAccountInfoResponse) objArr[0];
        Parcel parcel = (Parcel) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(loanAccountInfoResponse.accountId);
        Object[] objArr2 = {loanAccountInfoResponse.accountInfo, parcel, Integer.valueOf(iIntValue)};
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        LoanAccountResponse.onExtraCallbackWithResult(183453040, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, objArr2, -183453040);
        loanAccountInfoResponse.refinancingStatus.writeToParcel(parcel, iIntValue);
        parcel.writeLong(loanAccountInfoResponse.commissionAmount);
        parcel.writeInt(loanAccountInfoResponse.refinancable ? 1 : 0);
        RefinancingAvailableTimeRange refinancingAvailableTimeRange = loanAccountInfoResponse.refinancingAvailableTimeRange;
        if (refinancingAvailableTimeRange == null) {
            int i4 = onWarmupCompleted + 3;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            refinancingAvailableTimeRange.writeToParcel(parcel, iIntValue);
            int i6 = onWarmupCompleted + 119;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        }
        List<RefinancingResultResponse> list = loanAccountInfoResponse.preScreenCompleteRequests;
        parcel.writeInt(list.size());
        Iterator<RefinancingResultResponse> it = list.iterator();
        while (it.hasNext()) {
            int i8 = onExtraCallbackWithResult + 123;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            it.next().writeToParcel(parcel, iIntValue);
        }
        List<RefinancingResultResponse> list2 = loanAccountInfoResponse.droppedRequests;
        parcel.writeInt(list2.size());
        Iterator<RefinancingResultResponse> it2 = list2.iterator();
        while (true) {
            Object obj = null;
            if (!it2.hasNext()) {
                List<RefinancingResultResponse> list3 = loanAccountInfoResponse.inspectRequests;
                parcel.writeInt(list3.size());
                Iterator<RefinancingResultResponse> it3 = list3.iterator();
                while (it3.hasNext()) {
                    int i10 = onWarmupCompleted + 33;
                    onExtraCallbackWithResult = i10 % 128;
                    if (i10 % 2 != 0) {
                        it3.next().writeToParcel(parcel, iIntValue);
                        throw null;
                    }
                    it3.next().writeToParcel(parcel, iIntValue);
                }
                List<RefinancingResultResponse> list4 = loanAccountInfoResponse.failedRequests;
                parcel.writeInt(list4.size());
                Iterator<RefinancingResultResponse> it4 = list4.iterator();
                while (it4.hasNext()) {
                    it4.next().writeToParcel(parcel, iIntValue);
                }
                List<RefinancingResultResponse> list5 = loanAccountInfoResponse.canceledRequests;
                parcel.writeInt(list5.size());
                Iterator<RefinancingResultResponse> it5 = list5.iterator();
                while (it5.hasNext()) {
                    it5.next().writeToParcel(parcel, iIntValue);
                }
                return null;
            }
            int i11 = onWarmupCompleted + 123;
            onExtraCallbackWithResult = i11 % 128;
            if (i11 % 2 != 0) {
                it2.next().writeToParcel(parcel, iIntValue);
                obj.hashCode();
                throw null;
            }
            it2.next().writeToParcel(parcel, iIntValue);
        }
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        KSerializer kSerializerExtraCallback;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerExtraCallback = extraCallback();
            int i3 = 97 / 0;
        } else {
            kSerializerExtraCallback = extraCallback();
        }
        int i4 = onExtraCallbackWithResult + 93;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerExtraCallback;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onActivityResized();
            obj.hashCode();
            throw null;
        }
        KSerializer kSerializerOnActivityResized = onActivityResized();
        int i3 = onExtraCallbackWithResult + 87;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return kSerializerOnActivityResized;
        }
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ KSerializer onMessageChannelReady() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(RefinancingResultResponse$$serializer.INSTANCE);
        int i2 = onWarmupCompleted + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~((~i4) | i);
        int i8 = ~((~i) | i6);
        int i9 = i8 | i7;
        int i10 = i8 | (~((~i6) | i));
        int i11 = i + i6 + i3 + (762724209 * i2) + (1201824936 * i5);
        int i12 = i11 * i11;
        int i13 = ((-126223985) * i) + 43253760 + (1339426419 * i6) + ((-1465650404) * i7) + (1465650404 * i9) + (1414658446 * i10) + ((-1540882432) * i3) + (1302855680 * i2) + (1514143744 * i5) + (1905524736 * i12);
        int i14 = ((i * 162561953) - 555857873) + (i6 * 162559997) + (i7 * 1956) + (i9 * (-1956)) + (i10 * 978) + (i3 * 162560975) + (i2 * 701011807) + (i5 * 237771736) + (i12 * (-223608832));
        int i15 = i13 + (i14 * i14 * 703332352);
        return i15 != 1 ? i15 != 2 ? i15 != 3 ? i15 != 4 ? onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr) : onExtraCallback(objArr) : IAuthTabCallback(objArr) : onWarmupCompleted(objArr);
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer typedObject = readTypedObject();
        int i4 = onExtraCallbackWithResult + 35;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return typedObject;
        }
        throw null;
    }

    private static final /* synthetic */ KSerializer readTypedObject() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(RefinancingResultResponse$$serializer.INSTANCE);
        int i2 = onWarmupCompleted + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        onWarmupCompleted = i2 % 128;
        return i2 % 2 == 0 ? 1 : 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 51;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof LoanAccountInfoResponse)) {
            int i4 = onWarmupCompleted + 109;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        LoanAccountInfoResponse loanAccountInfoResponse = (LoanAccountInfoResponse) obj;
        if (this.accountId != loanAccountInfoResponse.accountId) {
            int i6 = onExtraCallbackWithResult + 27;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.accountInfo, loanAccountInfoResponse.accountInfo) || !Intrinsics.areEqual(this.refinancingStatus, loanAccountInfoResponse.refinancingStatus)) {
            return false;
        }
        if (this.commissionAmount != loanAccountInfoResponse.commissionAmount) {
            int i8 = onWarmupCompleted + 25;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (this.refinancable != loanAccountInfoResponse.refinancable) {
            int i10 = onExtraCallbackWithResult + 103;
            onWarmupCompleted = i10 % 128;
            return i10 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.refinancingAvailableTimeRange, loanAccountInfoResponse.refinancingAvailableTimeRange) || !Intrinsics.areEqual(this.preScreenCompleteRequests, loanAccountInfoResponse.preScreenCompleteRequests)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.droppedRequests, loanAccountInfoResponse.droppedRequests)) {
            int i11 = onExtraCallbackWithResult + 69;
            onWarmupCompleted = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.inspectRequests, loanAccountInfoResponse.inspectRequests)) {
            return false;
        }
        if (Intrinsics.areEqual(this.failedRequests, loanAccountInfoResponse.failedRequests)) {
            return Intrinsics.areEqual(this.canceledRequests, loanAccountInfoResponse.canceledRequests);
        }
        int i13 = onExtraCallbackWithResult + 105;
        onWarmupCompleted = i13 % 128;
        int i14 = i13 % 2;
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iHashCode = Long.hashCode(this.accountId);
        int iHashCode2 = this.accountInfo.hashCode();
        int iHashCode3 = this.refinancingStatus.hashCode();
        int iHashCode4 = Long.hashCode(this.commissionAmount);
        int iHashCode5 = Boolean.hashCode(this.refinancable);
        RefinancingAvailableTimeRange refinancingAvailableTimeRange = this.refinancingAvailableTimeRange;
        if (refinancingAvailableTimeRange == null) {
            int i3 = onExtraCallbackWithResult + 43;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            i = 0;
        } else {
            int iHashCode6 = refinancingAvailableTimeRange.hashCode();
            int i5 = onExtraCallbackWithResult + 83;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            i = iHashCode6;
        }
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + i) * 31) + this.preScreenCompleteRequests.hashCode()) * 31) + this.droppedRequests.hashCode()) * 31) + this.inspectRequests.hashCode()) * 31) + this.failedRequests.hashCode()) * 31) + this.canceledRequests.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanAccountInfoResponse(accountId=" + this.accountId + ", accountInfo=" + this.accountInfo + ", refinancingStatus=" + this.refinancingStatus + ", commissionAmount=" + this.commissionAmount + ", refinancable=" + this.refinancable + ", refinancingAvailableTimeRange=" + this.refinancingAvailableTimeRange + ", preScreenCompleteRequests=" + this.preScreenCompleteRequests + ", droppedRequests=" + this.droppedRequests + ", inspectRequests=" + this.inspectRequests + ", failedRequests=" + this.failedRequests + ", canceledRequests=" + this.canceledRequests + ")";
        int i2 = onExtraCallbackWithResult + 95;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LoanAccountInfoResponse> serializer() {
            LoanAccountInfoResponse$$serializer loanAccountInfoResponse$$serializer;
            int i = 2 % 2;
            int i2 = onExtraCallback + 107;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                loanAccountInfoResponse$$serializer = LoanAccountInfoResponse$$serializer.INSTANCE;
                int i3 = 72 / 0;
            } else {
                loanAccountInfoResponse$$serializer = LoanAccountInfoResponse$$serializer.INSTANCE;
            }
            int i4 = onExtraCallbackWithResult + 125;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return loanAccountInfoResponse$$serializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{null, null, null, null, null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.loan.LoanAccountInfoResponse$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 103;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnExtraCallback = LoanAccountInfoResponse.onExtraCallback();
                int i4 = onExtraCallbackWithResult + 79;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnExtraCallback;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.loan.LoanAccountInfoResponse$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 81;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    LoanAccountInfoResponse.onNavigationEvent();
                    throw null;
                }
                KSerializer kSerializerOnNavigationEvent = LoanAccountInfoResponse.onNavigationEvent();
                int i3 = onExtraCallbackWithResult + 111;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return kSerializerOnNavigationEvent;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.loan.LoanAccountInfoResponse$$ExternalSyntheticLambda2
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 49;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = new Object[0];
                int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
                if (i3 != 0) {
                    throw null;
                }
                KSerializer kSerializer = (KSerializer) LoanAccountInfoResponse.onNavigationEvent(-1173998098, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 1173998100, objArr);
                int i4 = onNavigationEvent + 119;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return kSerializer;
                }
                throw null;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.loan.LoanAccountInfoResponse$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 11;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerIAuthTabCallback = LoanAccountInfoResponse.IAuthTabCallback();
                if (i3 == 0) {
                    int i4 = 61 / 0;
                }
                return kSerializerIAuthTabCallback;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.loan.LoanAccountInfoResponse$$ExternalSyntheticLambda4
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 99;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    return LoanAccountInfoResponse.onExtraCallbackWithResult();
                }
                LoanAccountInfoResponse.onExtraCallbackWithResult();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        })};
        int i = IAuthTabCallback + 123;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ LoanAccountInfoResponse(int i, long j, LoanAccountResponse loanAccountResponse, LoanRefinancingAccountStatusResponse loanRefinancingAccountStatusResponse, long j2, boolean z, RefinancingAvailableTimeRange refinancingAvailableTimeRange, List list, List list2, List list3, List list4, List list5, okycx okycxVar) {
        long j3;
        long j4;
        boolean z2;
        List listEmptyList;
        List listEmptyList2;
        if ((i & 1) == 0) {
            j3 = -1;
        } else {
            int i2 = 2 % 2;
            j3 = j;
        }
        this.accountId = j3;
        int i3 = onExtraCallbackWithResult + 31;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        this.accountInfo = (i & 2) == 0 ? new LoanAccountResponse(0L, 0L, (String) null, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, 0.0f, false, 32767, (DefaultConstructorMarker) null) : loanAccountResponse;
        if ((i & 4) == 0) {
            this.refinancingStatus = new LoanRefinancingAccountStatusResponse((String) null, (String) null, (LoanRefinancingBottomSheetInfo) null, 7, (DefaultConstructorMarker) null);
            int i5 = onExtraCallbackWithResult + 49;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
        } else {
            this.refinancingStatus = loanRefinancingAccountStatusResponse;
        }
        if ((i & 8) == 0) {
            j4 = 0;
        } else {
            int i7 = onWarmupCompleted + 65;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            j4 = j2;
        }
        this.commissionAmount = j4;
        if ((i & 16) == 0) {
            z2 = false;
        } else {
            int i10 = 2 % 2;
            z2 = z;
        }
        this.refinancable = z2;
        Object obj = null;
        this.refinancingAvailableTimeRange = (i & 32) == 0 ? null : refinancingAvailableTimeRange;
        this.preScreenCompleteRequests = (i & 64) == 0 ? CollectionsKt.emptyList() : list;
        this.droppedRequests = (i & 128) == 0 ? CollectionsKt.emptyList() : list2;
        this.inspectRequests = (i & 256) == 0 ? CollectionsKt.emptyList() : list3;
        int i11 = onExtraCallbackWithResult + 99;
        onWarmupCompleted = i11 % 128;
        int i12 = i11 % 2;
        if ((i & 512) == 0) {
            listEmptyList = CollectionsKt.emptyList();
            int i13 = onWarmupCompleted + 101;
            onExtraCallbackWithResult = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 2 % 2;
            }
        } else {
            listEmptyList = list4;
        }
        this.failedRequests = listEmptyList;
        if ((i & 1024) == 0) {
            int i15 = onWarmupCompleted + 47;
            onExtraCallbackWithResult = i15 % 128;
            if (i15 % 2 != 0) {
                CollectionsKt.emptyList();
                obj.hashCode();
                throw null;
            }
            listEmptyList2 = CollectionsKt.emptyList();
        } else {
            listEmptyList2 = list5;
        }
        this.canceledRequests = listEmptyList2;
    }

    public LoanAccountInfoResponse(long j, @NotNull LoanAccountResponse loanAccountResponse, @NotNull LoanRefinancingAccountStatusResponse loanRefinancingAccountStatusResponse, long j2, boolean z, @Nullable RefinancingAvailableTimeRange refinancingAvailableTimeRange, @NotNull List<RefinancingResultResponse> list, @NotNull List<RefinancingResultResponse> list2, @NotNull List<RefinancingResultResponse> list3, @NotNull List<RefinancingResultResponse> list4, @NotNull List<RefinancingResultResponse> list5) {
        Intrinsics.checkNotNullParameter(loanAccountResponse, "");
        Intrinsics.checkNotNullParameter(loanRefinancingAccountStatusResponse, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        this.accountId = j;
        this.accountInfo = loanAccountResponse;
        this.refinancingStatus = loanRefinancingAccountStatusResponse;
        this.commissionAmount = j2;
        this.refinancable = z;
        this.refinancingAvailableTimeRange = refinancingAvailableTimeRange;
        this.preScreenCompleteRequests = list;
        this.droppedRequests = list2;
        this.inspectRequests = list3;
        this.failedRequests = list4;
        this.canceledRequests = list5;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0157  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(viva.republica.toss.network.model.loan.LoanAccountInfoResponse r27, o.vyl r28, kotlinx.serialization.descriptors.SerialDescriptor r29) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanAccountInfoResponse.onExtraCallbackWithResult(viva.republica.toss.network.model.loan.LoanAccountInfoResponse, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public static final /* synthetic */ Lazy[] onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i4 = i3 + 19;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return lazyArr;
    }

    public final long asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 81;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        long j = this.accountId;
        int i5 = i2 + 27;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        LoanAccountInfoResponse loanAccountInfoResponse = (LoanAccountInfoResponse) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        LoanAccountResponse loanAccountResponse = loanAccountInfoResponse.accountInfo;
        int i5 = i3 + 101;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 46 / 0;
        }
        return loanAccountResponse;
    }

    public final LoanRefinancingAccountStatusResponse extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.refinancingStatus;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        LoanAccountInfoResponse loanAccountInfoResponse = (LoanAccountInfoResponse) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return Long.valueOf(loanAccountInfoResponse.commissionAmount);
        }
        long j = loanAccountInfoResponse.commissionAmount;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 33;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.refinancable;
        int i5 = i2 + 109;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final RefinancingAvailableTimeRange writeTypedObject() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 91;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        RefinancingAvailableTimeRange refinancingAvailableTimeRange = this.refinancingAvailableTimeRange;
        int i5 = i2 + 49;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return refinancingAvailableTimeRange;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<RefinancingResultResponse> access000() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<RefinancingResultResponse> list = this.preScreenCompleteRequests;
        int i4 = i3 + 59;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final List<RefinancingResultResponse> getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 97;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        List<RefinancingResultResponse> list = this.droppedRequests;
        int i5 = i2 + 113;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final List<RefinancingResultResponse> IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        List<RefinancingResultResponse> list = this.inspectRequests;
        if (i3 == 0) {
            int i4 = 1 / 0;
        }
        return list;
    }

    public /* synthetic */ LoanAccountInfoResponse(long j, LoanAccountResponse loanAccountResponse, LoanRefinancingAccountStatusResponse loanRefinancingAccountStatusResponse, long j2, boolean z, RefinancingAvailableTimeRange refinancingAvailableTimeRange, List list, List list2, List list3, List list4, List list5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long j3;
        LoanRefinancingAccountStatusResponse loanRefinancingAccountStatusResponse2;
        long j4;
        boolean z2;
        List listEmptyList;
        List listEmptyList2;
        List listEmptyList3;
        List listEmptyList4;
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 117;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            j3 = -1;
        } else {
            j3 = j;
        }
        LoanAccountResponse loanAccountResponse2 = (i & 2) != 0 ? new LoanAccountResponse(0L, 0L, (String) null, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, 0.0f, false, 32767, (DefaultConstructorMarker) null) : loanAccountResponse;
        if ((i & 4) != 0) {
            loanRefinancingAccountStatusResponse2 = new LoanRefinancingAccountStatusResponse((String) null, (String) null, (LoanRefinancingBottomSheetInfo) null, 7, (DefaultConstructorMarker) null);
            int i3 = 2 % 2;
        } else {
            loanRefinancingAccountStatusResponse2 = loanRefinancingAccountStatusResponse;
        }
        if ((i & 8) != 0) {
            int i4 = onWarmupCompleted + 119;
            int i5 = i4 % 128;
            onExtraCallbackWithResult = i5;
            j4 = i4 % 2 != 0 ? 1L : 0L;
            int i6 = i5 + 41;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        } else {
            j4 = j2;
        }
        if ((i & 16) != 0) {
            int i9 = onWarmupCompleted + 17;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        RefinancingAvailableTimeRange refinancingAvailableTimeRange2 = (i & 32) != 0 ? null : refinancingAvailableTimeRange;
        if ((i & 64) != 0) {
            int i11 = onWarmupCompleted + 67;
            onExtraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
            listEmptyList = CollectionsKt.emptyList();
            int i13 = 2 % 2;
        } else {
            listEmptyList = list;
        }
        if ((i & 128) != 0) {
            listEmptyList2 = CollectionsKt.emptyList();
            int i14 = 2 % 2;
        } else {
            listEmptyList2 = list2;
        }
        if ((i & 256) != 0) {
            int i15 = onExtraCallbackWithResult + 63;
            onWarmupCompleted = i15 % 128;
            int i16 = i15 % 2;
            listEmptyList3 = CollectionsKt.emptyList();
        } else {
            listEmptyList3 = list3;
        }
        if ((i & 512) != 0) {
            int i17 = onWarmupCompleted + 93;
            onExtraCallbackWithResult = i17 % 128;
            if (i17 % 2 != 0) {
                CollectionsKt.emptyList();
                throw null;
            }
            listEmptyList4 = CollectionsKt.emptyList();
        } else {
            listEmptyList4 = list4;
        }
        this(j3, loanAccountResponse2, loanRefinancingAccountStatusResponse2, j4, z2, refinancingAvailableTimeRange2, listEmptyList, listEmptyList2, listEmptyList3, listEmptyList4, (i & 1024) != 0 ? CollectionsKt.emptyList() : list5);
    }

    public final List<RefinancingResultResponse> access100() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 9;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        List<RefinancingResultResponse> list = this.failedRequests;
        int i5 = i2 + 85;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 94 / 0;
        }
        return list;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        LoanAccountInfoResponse loanAccountInfoResponse = (LoanAccountInfoResponse) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        List<RefinancingResultResponse> list = loanAccountInfoResponse.canceledRequests;
        if (i3 == 0) {
            int i4 = 79 / 0;
        }
        return list;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return (KSerializer) onNavigationEvent(-1173998098, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 1173998100, new Object[0]);
    }

    public final LoanAccountResponse IAuthTabCallbackStub() {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return (LoanAccountResponse) onNavigationEvent(-1505249583, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 1505249583, new Object[]{this});
    }

    public final List<RefinancingResultResponse> IAuthTabCallbackDefault() {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return (List) onNavigationEvent(-846480871, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 846480875, new Object[]{this});
    }

    public final long asBinder() {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return ((Long) onNavigationEvent(1913607191, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -1913607190, new Object[]{this})).longValue();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Object[] objArr = {this, parcel, Integer.valueOf(i)};
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        onNavigationEvent(-670116786, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 670116789, objArr);
    }
}
