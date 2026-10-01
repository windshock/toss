package im.toss.securities.widget.overview.ui.medium.model;

import im.toss.securities.widget.data.model.overview.OverviewItemInfo;
import im.toss.securities.widget.data.model.overview.OverviewPrice;
import im.toss.securities.widget.data.model.overview.OverviewPrice$$serializer;
import im.toss.securities.widget.data.model.overview.OverviewRate;
import im.toss.securities.widget.data.model.overview.OverviewRate$$serializer;
import im.toss.securities.widget.overview.ui.medium.model.OverviewMediumListItem;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.checkDuration;
import o.getBgColor;
import o.getWriggleLayout;
import o.htf31;
import o.isHealthy;
import o.liq;
import o.okycx;
import o.py;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class OverviewUiData {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final OverviewPrice evaluatedAmount;
    private final OverviewPrice evaluatedAmountAfterFees;
    private final String evaluatedAmountTxt;
    private final Boolean hasKr;
    private final List<OverviewItemInfo> items;
    private final List<OverviewMediumListItem> listItems;
    private final List<String> logoImageUrls;
    private final checkDuration profitChangeType;
    private final OverviewPrice profitLossAmount;
    private final OverviewPrice profitLossAmountAfterFees;
    private final String profitLossAmountRateTxt;
    private final OverviewPrice profitLossRate;
    private final OverviewRate profitLossRateAfterFees;
    private final OverviewPrice totalCommission;
    private final OverviewPrice totalTax;

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback_Parcel();
        }
        IAuthTabCallback_Parcel();
        throw null;
    }

    private static final /* synthetic */ KSerializer IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.tosssecurities.core.base.ChangeType", checkDuration.values());
        int i4 = onExtraCallbackWithResult + 95;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        KSerializer kSerializer;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializer = (KSerializer) onNavigationEvent(new Object[0], 1707003565, -1707003565, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
            int i3 = 1 / 0;
        } else {
            kSerializer = (KSerializer) onNavigationEvent(new Object[0], 1707003565, -1707003565, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
        }
        int i4 = onExtraCallbackWithResult + 103;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 23 / 0;
        }
        return kSerializer;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
        int i2 = onExtraCallbackWithResult + 43;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return checkcanopenlandingpage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return (KSerializer) onNavigationEvent(new Object[0], -157121277, 157121278, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
        }
        throw null;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerWriteTypedObject = writeTypedObject();
        int i4 = IAuthTabCallback + 109;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerWriteTypedObject;
    }

    private static final /* synthetic */ KSerializer writeTypedObject() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(OverviewMediumListItem.Companion.serializer());
        int i2 = onExtraCallbackWithResult + 33;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return checkcanopenlandingpage;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OverviewUiData)) {
            return false;
        }
        OverviewUiData overviewUiData = (OverviewUiData) obj;
        if (!Intrinsics.areEqual(this.evaluatedAmount, overviewUiData.evaluatedAmount)) {
            int i2 = IAuthTabCallback + 93;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.profitLossAmount, overviewUiData.profitLossAmount)) {
            int i4 = IAuthTabCallback + 11;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.profitLossRate, overviewUiData.profitLossRate) || !Intrinsics.areEqual(this.evaluatedAmountTxt, overviewUiData.evaluatedAmountTxt) || !Intrinsics.areEqual(this.profitLossAmountRateTxt, overviewUiData.profitLossAmountRateTxt) || this.profitChangeType != overviewUiData.profitChangeType || !Intrinsics.areEqual(this.hasKr, overviewUiData.hasKr) || !Intrinsics.areEqual(this.logoImageUrls, overviewUiData.logoImageUrls) || !Intrinsics.areEqual(this.totalCommission, overviewUiData.totalCommission)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.totalTax, overviewUiData.totalTax)) {
            int i6 = IAuthTabCallback + 83;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.evaluatedAmountAfterFees, overviewUiData.evaluatedAmountAfterFees)) {
            int i8 = IAuthTabCallback + 93;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.profitLossAmountAfterFees, overviewUiData.profitLossAmountAfterFees) || !Intrinsics.areEqual(this.profitLossRateAfterFees, overviewUiData.profitLossRateAfterFees) || !Intrinsics.areEqual(this.items, overviewUiData.items)) {
            return false;
        }
        if (Intrinsics.areEqual(this.listItems, overviewUiData.listItems)) {
            return true;
        }
        int i10 = onExtraCallbackWithResult + 125;
        IAuthTabCallback = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int i = 2 % 2;
        OverviewPrice overviewPrice = this.evaluatedAmount;
        int iHashCode6 = 0;
        int iHashCode7 = overviewPrice == null ? 0 : overviewPrice.hashCode();
        OverviewPrice overviewPrice2 = this.profitLossAmount;
        if (overviewPrice2 == null) {
            int i2 = IAuthTabCallback + 93;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = overviewPrice2.hashCode();
        }
        OverviewPrice overviewPrice3 = this.profitLossRate;
        int iHashCode8 = overviewPrice3 == null ? 0 : overviewPrice3.hashCode();
        String str = this.evaluatedAmountTxt;
        int iHashCode9 = str == null ? 0 : str.hashCode();
        String str2 = this.profitLossAmountRateTxt;
        if (str2 == null) {
            int i4 = onExtraCallbackWithResult + 93;
            int i5 = i4 % 128;
            IAuthTabCallback = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 67;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        checkDuration checkduration = this.profitChangeType;
        int iHashCode10 = checkduration == null ? 0 : checkduration.hashCode();
        Boolean bool = this.hasKr;
        if (bool == null) {
            int i9 = onExtraCallbackWithResult + 19;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = bool.hashCode();
        }
        List<String> list = this.logoImageUrls;
        if (list == null) {
            int i11 = onExtraCallbackWithResult + 27;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = list.hashCode();
        }
        OverviewPrice overviewPrice4 = this.totalCommission;
        int iHashCode11 = overviewPrice4 == null ? 0 : overviewPrice4.hashCode();
        OverviewPrice overviewPrice5 = this.totalTax;
        int iHashCode12 = overviewPrice5 == null ? 0 : overviewPrice5.hashCode();
        OverviewPrice overviewPrice6 = this.evaluatedAmountAfterFees;
        if (overviewPrice6 == null) {
            int i13 = IAuthTabCallback + 87;
            onExtraCallbackWithResult = i13 % 128;
            int i14 = i13 % 2;
            iHashCode5 = 0;
        } else {
            iHashCode5 = overviewPrice6.hashCode();
        }
        OverviewPrice overviewPrice7 = this.profitLossAmountAfterFees;
        int iHashCode13 = overviewPrice7 == null ? 0 : overviewPrice7.hashCode();
        OverviewRate overviewRate = this.profitLossRateAfterFees;
        if (overviewRate != null) {
            int i15 = IAuthTabCallback + 97;
            onExtraCallbackWithResult = i15 % 128;
            if (i15 % 2 != 0) {
                overviewRate.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            iHashCode6 = overviewRate.hashCode();
        }
        return (((((((((((((((((((((((((((iHashCode7 * 31) + iHashCode) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode2) * 31) + iHashCode10) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode5) * 31) + iHashCode13) * 31) + iHashCode6) * 31) + this.items.hashCode()) * 31) + this.listItems.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OverviewUiData(evaluatedAmount=" + this.evaluatedAmount + ", profitLossAmount=" + this.profitLossAmount + ", profitLossRate=" + this.profitLossRate + ", evaluatedAmountTxt=" + this.evaluatedAmountTxt + ", profitLossAmountRateTxt=" + this.profitLossAmountRateTxt + ", profitChangeType=" + this.profitChangeType + ", hasKr=" + this.hasKr + ", logoImageUrls=" + this.logoImageUrls + ", totalCommission=" + this.totalCommission + ", totalTax=" + this.totalTax + ", evaluatedAmountAfterFees=" + this.evaluatedAmountAfterFees + ", profitLossAmountAfterFees=" + this.profitLossAmountAfterFees + ", profitLossRateAfterFees=" + this.profitLossRateAfterFees + ", items=" + this.items + ", listItems=" + this.listItems + ")";
        int i2 = onExtraCallbackWithResult + 91;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OverviewUiData> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 99;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                OverviewUiData$$serializer overviewUiData$$serializer = OverviewUiData$$serializer.INSTANCE;
                throw null;
            }
            OverviewUiData$$serializer overviewUiData$$serializer2 = OverviewUiData$$serializer.INSTANCE;
            int i3 = onWarmupCompleted + 53;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return overviewUiData$$serializer2;
            }
            throw null;
        }
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{null, null, null, null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.securities.widget.overview.ui.medium.model.OverviewUiData$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 117;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return OverviewUiData.IAuthTabCallback();
                }
                OverviewUiData.IAuthTabCallback();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }), null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.securities.widget.overview.ui.medium.model.OverviewUiData$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 15;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnNavigationEvent = OverviewUiData.onNavigationEvent();
                int i4 = onWarmupCompleted + 65;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 14 / 0;
                }
                return kSerializerOnNavigationEvent;
            }
        }), null, null, null, null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.securities.widget.overview.ui.medium.model.OverviewUiData$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                KSerializer kSerializerOnExtraCallbackWithResult;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 85;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    kSerializerOnExtraCallbackWithResult = OverviewUiData.onExtraCallbackWithResult();
                    int i3 = 71 / 0;
                } else {
                    kSerializerOnExtraCallbackWithResult = OverviewUiData.onExtraCallbackWithResult();
                }
                int i4 = IAuthTabCallback + 75;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 81 / 0;
                }
                return kSerializerOnExtraCallbackWithResult;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.securities.widget.overview.ui.medium.model.OverviewUiData$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 5;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnWarmupCompleted = OverviewUiData.onWarmupCompleted();
                int i4 = onWarmupCompleted + 111;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 70 / 0;
                }
                return kSerializerOnWarmupCompleted;
            }
        })};
        int i = onWarmupCompleted + 21;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ OverviewUiData(int i, OverviewPrice overviewPrice, OverviewPrice overviewPrice2, OverviewPrice overviewPrice3, String str, String str2, checkDuration checkduration, Boolean bool, List list, OverviewPrice overviewPrice4, OverviewPrice overviewPrice5, OverviewPrice overviewPrice6, OverviewPrice overviewPrice7, OverviewRate overviewRate, List list2, List list3, okycx okycxVar) {
        if (8192 != (i & 8192)) {
            htf31.onExtraCallbackWithResult(i, 8192, OverviewUiData$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.evaluatedAmount = null;
        } else {
            this.evaluatedAmount = overviewPrice;
        }
        if ((i & 2) == 0) {
            this.profitLossAmount = null;
        } else {
            this.profitLossAmount = overviewPrice2;
        }
        if ((i & 4) == 0) {
            this.profitLossRate = null;
        } else {
            this.profitLossRate = overviewPrice3;
        }
        if ((i & 8) == 0) {
            this.evaluatedAmountTxt = null;
        } else {
            this.evaluatedAmountTxt = str;
            int i2 = 2 % 2;
        }
        if ((i & 16) == 0) {
            this.profitLossAmountRateTxt = null;
            int i3 = 2 % 2;
        } else {
            this.profitLossAmountRateTxt = str2;
        }
        if ((i & 32) == 0) {
            int i4 = IAuthTabCallback;
            int i5 = i4 + 17;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            this.profitChangeType = null;
            int i7 = i4 + 89;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
        } else {
            this.profitChangeType = checkduration;
        }
        if ((i & 64) == 0) {
            this.hasKr = null;
        } else {
            this.hasKr = bool;
        }
        if ((i & 128) == 0) {
            this.logoImageUrls = null;
            int i10 = IAuthTabCallback + 65;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 2 % 2;
        } else {
            this.logoImageUrls = list;
        }
        if ((i & 256) == 0) {
            this.totalCommission = null;
            int i13 = 2 % 2;
        } else {
            this.totalCommission = overviewPrice4;
        }
        if ((i & 512) == 0) {
            this.totalTax = null;
        } else {
            this.totalTax = overviewPrice5;
        }
        if ((i & 1024) == 0) {
            this.evaluatedAmountAfterFees = null;
        } else {
            this.evaluatedAmountAfterFees = overviewPrice6;
        }
        if ((i & 2048) == 0) {
            this.profitLossAmountAfterFees = null;
        } else {
            this.profitLossAmountAfterFees = overviewPrice7;
        }
        if ((i & 4096) == 0) {
            this.profitLossRateAfterFees = null;
        } else {
            this.profitLossRateAfterFees = overviewRate;
        }
        this.items = list2;
        if ((i & 16384) != 0) {
            this.listItems = list3;
            return;
        }
        List list4 = list2;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            arrayList.add(new OverviewMediumListItem.Stock((OverviewItemInfo) it.next()));
        }
        this.listItems = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OverviewUiData(@Nullable OverviewPrice overviewPrice, @Nullable OverviewPrice overviewPrice2, @Nullable OverviewPrice overviewPrice3, @Nullable String str, @Nullable String str2, @Nullable checkDuration checkduration, @Nullable Boolean bool, @Nullable List<String> list, @Nullable OverviewPrice overviewPrice4, @Nullable OverviewPrice overviewPrice5, @Nullable OverviewPrice overviewPrice6, @Nullable OverviewPrice overviewPrice7, @Nullable OverviewRate overviewRate, @NotNull List<? extends OverviewItemInfo> list2, @NotNull List<? extends OverviewMediumListItem> list3) {
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        this.evaluatedAmount = overviewPrice;
        this.profitLossAmount = overviewPrice2;
        this.profitLossRate = overviewPrice3;
        this.evaluatedAmountTxt = str;
        this.profitLossAmountRateTxt = str2;
        this.profitChangeType = checkduration;
        this.hasKr = bool;
        this.logoImageUrls = list;
        this.totalCommission = overviewPrice4;
        this.totalTax = overviewPrice5;
        this.evaluatedAmountAfterFees = overviewPrice6;
        this.profitLossAmountAfterFees = overviewPrice7;
        this.profitLossRateAfterFees = overviewRate;
        this.items = list2;
        this.listItems = list3;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return $childSerializers;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onNavigationEvent(OverviewUiData overviewUiData, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i2 = onExtraCallbackWithResult + 89;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                OverviewPrice overviewPrice = overviewUiData.evaluatedAmount;
                throw null;
            }
            if (overviewUiData.evaluatedAmount != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 0, OverviewPrice$$serializer.INSTANCE, overviewUiData.evaluatedAmount);
                int i3 = onExtraCallbackWithResult + 53;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i5 = onExtraCallbackWithResult + 87;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            if (overviewUiData.profitLossAmount != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 1, OverviewPrice$$serializer.INSTANCE, overviewUiData.profitLossAmount);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || overviewUiData.profitLossRate != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, OverviewPrice$$serializer.INSTANCE, overviewUiData.profitLossRate);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || overviewUiData.evaluatedAmountTxt != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, overviewUiData.evaluatedAmountTxt);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 4) || overviewUiData.profitLossAmountRateTxt != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, overviewUiData.profitLossAmountRateTxt);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 5) || overviewUiData.profitChangeType != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 5, (py) lazyArr[5].getValue(), overviewUiData.profitChangeType);
        }
        if (!(!vylVar.onWarmupCompleted(serialDescriptor, 6)) || overviewUiData.hasKr != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 6, getBgColor.IAuthTabCallback, overviewUiData.hasKr);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 7) || overviewUiData.logoImageUrls != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 7, (py) lazyArr[7].getValue(), overviewUiData.logoImageUrls);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 8) || overviewUiData.totalCommission != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 8, OverviewPrice$$serializer.INSTANCE, overviewUiData.totalCommission);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 9) || overviewUiData.totalTax != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 9, OverviewPrice$$serializer.INSTANCE, overviewUiData.totalTax);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 10) || overviewUiData.evaluatedAmountAfterFees != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 10, OverviewPrice$$serializer.INSTANCE, overviewUiData.evaluatedAmountAfterFees);
        }
        if (!(!vylVar.onWarmupCompleted(serialDescriptor, 11)) || overviewUiData.profitLossAmountAfterFees != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 11, OverviewPrice$$serializer.INSTANCE, overviewUiData.profitLossAmountAfterFees);
            int i7 = IAuthTabCallback + 17;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 12) || overviewUiData.profitLossRateAfterFees != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 12, OverviewRate$$serializer.INSTANCE, overviewUiData.profitLossRateAfterFees);
        }
        vylVar.onNavigationEvent(serialDescriptor, 13, (py) lazyArr[13].getValue(), overviewUiData.items);
        if (!vylVar.onWarmupCompleted(serialDescriptor, 14)) {
            List<OverviewMediumListItem> list = overviewUiData.listItems;
            List<OverviewItemInfo> list2 = overviewUiData.items;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new OverviewMediumListItem.Stock((OverviewItemInfo) it.next()));
            }
            if (Intrinsics.areEqual(list, arrayList)) {
                return;
            }
        }
        vylVar.onNavigationEvent(serialDescriptor, 14, (py) lazyArr[14].getValue(), overviewUiData.listItems);
    }

    public /* synthetic */ OverviewUiData(OverviewPrice overviewPrice, OverviewPrice overviewPrice2, OverviewPrice overviewPrice3, String str, String str2, checkDuration checkduration, Boolean bool, List list, OverviewPrice overviewPrice4, OverviewPrice overviewPrice5, OverviewPrice overviewPrice6, OverviewPrice overviewPrice7, OverviewRate overviewRate, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        OverviewPrice overviewPrice8;
        String str3;
        Boolean bool2;
        List list4;
        OverviewPrice overviewPrice9;
        OverviewPrice overviewPrice10;
        List list5;
        OverviewPrice overviewPrice11 = (i & 1) != 0 ? null : overviewPrice;
        if ((i & 2) != 0) {
            int i2 = IAuthTabCallback + 93;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 97 / 0;
            }
            overviewPrice8 = null;
        } else {
            overviewPrice8 = overviewPrice2;
        }
        OverviewPrice overviewPrice12 = (i & 4) != 0 ? null : overviewPrice3;
        if ((i & 8) != 0) {
            int i4 = IAuthTabCallback + 111;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            str3 = null;
        } else {
            str3 = str;
        }
        String str4 = (i & 16) != 0 ? null : str2;
        checkDuration checkduration2 = (i & 32) != 0 ? null : checkduration;
        if ((i & 64) != 0) {
            int i7 = IAuthTabCallback + 115;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 1 / 0;
            }
            bool2 = null;
        } else {
            bool2 = bool;
        }
        if ((i & 128) != 0) {
            int i9 = IAuthTabCallback + 107;
            onExtraCallbackWithResult = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 49 / 0;
            }
            list4 = null;
        } else {
            list4 = list;
        }
        OverviewPrice overviewPrice13 = (i & 256) != 0 ? null : overviewPrice4;
        OverviewPrice overviewPrice14 = (i & 512) != 0 ? null : overviewPrice5;
        if ((i & 1024) != 0) {
            int i11 = 2 % 2;
            overviewPrice9 = null;
        } else {
            overviewPrice9 = overviewPrice6;
        }
        if ((i & 2048) != 0) {
            int i12 = IAuthTabCallback + 123;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
            int i14 = 2 % 2;
            overviewPrice10 = null;
        } else {
            overviewPrice10 = overviewPrice7;
        }
        OverviewRate overviewRate2 = (i & 4096) != 0 ? null : overviewRate;
        if ((i & 16384) != 0) {
            List list6 = list2;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list6, 10));
            Iterator it = list6.iterator();
            int i15 = 2 % 2;
            while (it.hasNext()) {
                arrayList.add(new OverviewMediumListItem.Stock((OverviewItemInfo) it.next()));
                int i16 = IAuthTabCallback + 117;
                onExtraCallbackWithResult = i16 % 128;
                int i17 = i16 % 2;
            }
            list5 = arrayList;
        } else {
            list5 = list3;
        }
        this(overviewPrice11, overviewPrice8, overviewPrice12, str3, str4, checkduration2, bool2, list4, overviewPrice13, overviewPrice14, overviewPrice9, overviewPrice10, overviewRate2, list2, list5);
    }

    public final OverviewPrice asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.evaluatedAmount;
        }
        throw null;
    }

    public final OverviewPrice access100() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        OverviewPrice overviewPrice = this.profitLossAmount;
        int i5 = i3 + 123;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return overviewPrice;
    }

    public final OverviewPrice IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 51;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        OverviewPrice overviewPrice = this.profitLossRate;
        int i5 = i2 + 85;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return overviewPrice;
        }
        throw null;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 115;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.evaluatedAmountTxt;
        int i5 = i2 + 81;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String access000() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.profitLossAmountRateTxt;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        OverviewUiData overviewUiData = (OverviewUiData) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        checkDuration checkduration = overviewUiData.profitChangeType;
        int i5 = i3 + 67;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return checkduration;
        }
        throw null;
    }

    public final List<OverviewItemInfo> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 87;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        List<OverviewItemInfo> list = this.items;
        int i5 = i2 + 61;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final List<OverviewMediumListItem> asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 33;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<OverviewMediumListItem> list = this.listItems;
        int i4 = i2 + 47;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    @Deprecated
    public final OverviewPrice onWarmupCompleted(boolean z) {
        double dDoubleValue;
        double dDoubleValue2;
        double dDoubleValue3;
        Double dOnNavigationEvent;
        Double dOnNavigationEvent2;
        Double dOnNavigationEvent3;
        Double dIAuthTabCallback;
        Double dIAuthTabCallback2;
        Double dIAuthTabCallback3;
        int i = 2 % 2;
        if (!z) {
            return this.evaluatedAmount;
        }
        OverviewPrice overviewPrice = this.evaluatedAmount;
        double dDoubleValue4 = 0.0d;
        if (overviewPrice == null || (dIAuthTabCallback3 = overviewPrice.IAuthTabCallback()) == null) {
            dDoubleValue = 0.0d;
        } else {
            int i2 = onExtraCallbackWithResult + 89;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                dDoubleValue = dIAuthTabCallback3.doubleValue();
                int i3 = 56 / 0;
            } else {
                dDoubleValue = dIAuthTabCallback3.doubleValue();
            }
        }
        OverviewPrice overviewPrice2 = this.totalTax;
        double dDoubleValue5 = (overviewPrice2 == null || (dIAuthTabCallback2 = overviewPrice2.IAuthTabCallback()) == null) ? 0.0d : dIAuthTabCallback2.doubleValue();
        OverviewPrice overviewPrice3 = this.totalCommission;
        if (overviewPrice3 == null || (dIAuthTabCallback = overviewPrice3.IAuthTabCallback()) == null) {
            dDoubleValue2 = 0.0d;
        } else {
            int i4 = onExtraCallbackWithResult + 97;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                dDoubleValue2 = dIAuthTabCallback.doubleValue();
                int i5 = 34 / 0;
            } else {
                dDoubleValue2 = dIAuthTabCallback.doubleValue();
            }
        }
        OverviewPrice overviewPrice4 = this.evaluatedAmount;
        double dDoubleValue6 = (overviewPrice4 == null || (dOnNavigationEvent3 = overviewPrice4.onNavigationEvent()) == null) ? 0.0d : dOnNavigationEvent3.doubleValue();
        OverviewPrice overviewPrice5 = this.totalTax;
        if (overviewPrice5 == null || (dOnNavigationEvent2 = overviewPrice5.onNavigationEvent()) == null) {
            dDoubleValue3 = 0.0d;
        } else {
            int i6 = IAuthTabCallback + 29;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            dDoubleValue3 = dOnNavigationEvent2.doubleValue();
        }
        OverviewPrice overviewPrice6 = this.totalCommission;
        if (overviewPrice6 != null && (dOnNavigationEvent = overviewPrice6.onNavigationEvent()) != null) {
            dDoubleValue4 = dOnNavigationEvent.doubleValue();
        }
        return new OverviewPrice(Double.valueOf((dDoubleValue - dDoubleValue5) - dDoubleValue2), Double.valueOf((dDoubleValue6 - dDoubleValue3) - dDoubleValue4));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030 A[PHI: r14
      0x0030: PHI (r14v18 java.lang.Double) = (r14v17 java.lang.Double), (r14v19 java.lang.Double) binds: [B:14:0x002e, B:11:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final OverviewPrice onExtraCallback(boolean z) {
        double dDoubleValue;
        double dDoubleValue2;
        double dDoubleValue3;
        double dDoubleValue4;
        Double dOnNavigationEvent;
        Double dOnNavigationEvent2;
        Double dIAuthTabCallback;
        Double dIAuthTabCallback2;
        Double dIAuthTabCallback3;
        int i = 2 % 2;
        if (!z) {
            OverviewPrice overviewPrice = this.profitLossAmount;
            int i2 = onExtraCallbackWithResult + 13;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return overviewPrice;
        }
        int i4 = onExtraCallbackWithResult + 57;
        int i5 = i4 % 128;
        IAuthTabCallback = i5;
        Object obj = null;
        if (i4 % 2 == 0) {
            throw null;
        }
        OverviewPrice overviewPrice2 = this.profitLossAmount;
        double dDoubleValue5 = 0.0d;
        if (overviewPrice2 != null) {
            int i6 = i5 + 65;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                dIAuthTabCallback3 = overviewPrice2.IAuthTabCallback();
                int i7 = 6 / 0;
                dDoubleValue = dIAuthTabCallback3 != null ? dIAuthTabCallback3.doubleValue() : 0.0d;
            } else {
                dIAuthTabCallback3 = overviewPrice2.IAuthTabCallback();
                if (dIAuthTabCallback3 != null) {
                }
            }
        }
        OverviewPrice overviewPrice3 = this.totalTax;
        double dDoubleValue6 = (overviewPrice3 == null || (dIAuthTabCallback2 = overviewPrice3.IAuthTabCallback()) == null) ? 0.0d : dIAuthTabCallback2.doubleValue();
        OverviewPrice overviewPrice4 = this.totalCommission;
        if (overviewPrice4 == null || (dIAuthTabCallback = overviewPrice4.IAuthTabCallback()) == null) {
            dDoubleValue2 = 0.0d;
        } else {
            int i8 = onExtraCallbackWithResult + 75;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            dDoubleValue2 = dIAuthTabCallback.doubleValue();
        }
        OverviewPrice overviewPrice5 = this.profitLossAmount;
        if (overviewPrice5 != null) {
            int i10 = onExtraCallbackWithResult + 69;
            IAuthTabCallback = i10 % 128;
            if (i10 % 2 == 0) {
                overviewPrice5.onNavigationEvent();
                obj.hashCode();
                throw null;
            }
            Double dOnNavigationEvent3 = overviewPrice5.onNavigationEvent();
            dDoubleValue3 = dOnNavigationEvent3 != null ? dOnNavigationEvent3.doubleValue() : 0.0d;
        }
        OverviewPrice overviewPrice6 = this.totalTax;
        if (overviewPrice6 == null || (dOnNavigationEvent2 = overviewPrice6.onNavigationEvent()) == null) {
            dDoubleValue4 = 0.0d;
        } else {
            int i11 = IAuthTabCallback + 35;
            onExtraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
            dDoubleValue4 = dOnNavigationEvent2.doubleValue();
        }
        OverviewPrice overviewPrice7 = this.totalCommission;
        if (overviewPrice7 != null && (dOnNavigationEvent = overviewPrice7.onNavigationEvent()) != null) {
            dDoubleValue5 = dOnNavigationEvent.doubleValue();
        }
        return new OverviewPrice(Double.valueOf((dDoubleValue - dDoubleValue6) - dDoubleValue2), Double.valueOf((dDoubleValue3 - dDoubleValue4) - dDoubleValue5));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[PHI: r1 r12
      0x0035: PHI (r1v3 im.toss.securities.widget.data.model.overview.OverviewPrice) = 
      (r1v2 im.toss.securities.widget.data.model.overview.OverviewPrice)
      (r1v6 im.toss.securities.widget.data.model.overview.OverviewPrice)
     binds: [B:10:0x0033, B:7:0x0028] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r12v9 im.toss.securities.widget.data.model.overview.OverviewPrice) = 
      (r12v8 im.toss.securities.widget.data.model.overview.OverviewPrice)
      (r12v16 im.toss.securities.widget.data.model.overview.OverviewPrice)
     binds: [B:10:0x0033, B:7:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049 A[PHI: r1 r12
      0x0049: PHI (r1v5 im.toss.securities.widget.data.model.overview.OverviewPrice) = 
      (r1v2 im.toss.securities.widget.data.model.overview.OverviewPrice)
      (r1v3 im.toss.securities.widget.data.model.overview.OverviewPrice)
      (r1v6 im.toss.securities.widget.data.model.overview.OverviewPrice)
     binds: [B:10:0x0033, B:12:0x0039, B:7:0x0028] A[DONT_GENERATE, DONT_INLINE]
      0x0049: PHI (r12v15 im.toss.securities.widget.data.model.overview.OverviewPrice) = 
      (r12v8 im.toss.securities.widget.data.model.overview.OverviewPrice)
      (r12v9 im.toss.securities.widget.data.model.overview.OverviewPrice)
      (r12v16 im.toss.securities.widget.data.model.overview.OverviewPrice)
     binds: [B:10:0x0033, B:12:0x0039, B:7:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        OverviewPrice overviewPriceOnWarmupCompleted;
        OverviewPrice overviewPriceOnExtraCallback;
        double dDoubleValue;
        double dDoubleValue2;
        double dDoubleValue3;
        double dDoubleValue4;
        Double dOnNavigationEvent;
        Double dOnNavigationEvent2;
        OverviewUiData overviewUiData = (OverviewUiData) objArr[0];
        int i = 2 % 2;
        if (!((Boolean) objArr[1]).booleanValue()) {
            return overviewUiData.profitLossRate;
        }
        int i2 = IAuthTabCallback + 121;
        onExtraCallbackWithResult = i2 % 128;
        double dDoubleValue5 = 0.0d;
        if (i2 % 2 != 0) {
            overviewPriceOnWarmupCompleted = overviewUiData.onWarmupCompleted(false);
            overviewPriceOnExtraCallback = overviewUiData.onExtraCallback(false);
            if (overviewPriceOnWarmupCompleted != null) {
                Double dIAuthTabCallback = overviewPriceOnWarmupCompleted.IAuthTabCallback();
                if (dIAuthTabCallback != null) {
                    int i3 = onExtraCallbackWithResult + 59;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    dDoubleValue = dIAuthTabCallback.doubleValue();
                } else {
                    dDoubleValue = 0.0d;
                }
            }
        } else {
            overviewPriceOnWarmupCompleted = overviewUiData.onWarmupCompleted(true);
            overviewPriceOnExtraCallback = overviewUiData.onExtraCallback(true);
            if (overviewPriceOnWarmupCompleted != null) {
            }
        }
        if (overviewPriceOnExtraCallback != null) {
            int i5 = IAuthTabCallback + 111;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            Double dIAuthTabCallback2 = overviewPriceOnExtraCallback.IAuthTabCallback();
            if (dIAuthTabCallback2 != null) {
                dDoubleValue2 = dIAuthTabCallback2.doubleValue();
                int i7 = IAuthTabCallback + 123;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
            } else {
                dDoubleValue2 = 0.0d;
            }
        }
        if (overviewPriceOnWarmupCompleted != null) {
            int i9 = IAuthTabCallback + 59;
            onExtraCallbackWithResult = i9 % 128;
            if (i9 % 2 != 0) {
                overviewPriceOnWarmupCompleted.IAuthTabCallback();
                throw null;
            }
            Double dIAuthTabCallback3 = overviewPriceOnWarmupCompleted.IAuthTabCallback();
            dDoubleValue3 = dIAuthTabCallback3 != null ? dIAuthTabCallback3.doubleValue() : 0.0d;
        }
        Double dOnNavigationEvent3 = isHealthy.onNavigationEvent(Double.valueOf(dDoubleValue - dDoubleValue2), Double.valueOf(dDoubleValue3));
        if (overviewPriceOnWarmupCompleted == null || (dOnNavigationEvent2 = overviewPriceOnWarmupCompleted.onNavigationEvent()) == null) {
            dDoubleValue4 = 0.0d;
        } else {
            int i10 = onExtraCallbackWithResult + 85;
            IAuthTabCallback = i10 % 128;
            if (i10 % 2 == 0) {
                dDoubleValue4 = dOnNavigationEvent2.doubleValue();
                int i11 = 24 / 0;
            } else {
                dDoubleValue4 = dOnNavigationEvent2.doubleValue();
            }
        }
        double dDoubleValue6 = (overviewPriceOnExtraCallback == null || (dOnNavigationEvent = overviewPriceOnExtraCallback.onNavigationEvent()) == null) ? 0.0d : dOnNavigationEvent.doubleValue();
        if (overviewPriceOnWarmupCompleted != null) {
            int i12 = IAuthTabCallback + 29;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
            Double dOnNavigationEvent4 = overviewPriceOnWarmupCompleted.onNavigationEvent();
            if (dOnNavigationEvent4 != null) {
                dDoubleValue5 = dOnNavigationEvent4.doubleValue();
            }
        }
        return new OverviewPrice(dOnNavigationEvent3, isHealthy.onNavigationEvent(Double.valueOf(dDoubleValue4 - dDoubleValue6), Double.valueOf(dDoubleValue5)));
    }

    public static /* synthetic */ Object onNavigationEvent(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~(i7 | i2);
        int i9 = ~(i7 | i5);
        int i10 = i8 | i9;
        int i11 = ~i2;
        int i12 = (~((~i5) | i7 | i2)) | (~(i7 | i11 | i5));
        int i13 = i9 | (~(i11 | i));
        int i14 = i + i2 + i6 + ((-1696018712) * i3) + (2108813197 * i4);
        int i15 = i14 * i14;
        int i16 = ((212195308 * i) - 2121662464) + (1221732374 * i2) + (1009537066 * i10) + (i12 * (-504768533)) + ((-504768533) * i13) + (716963840 * i6) + (39845888 * i3) + (227278848 * i4) + ((-1705377792) * i15);
        int i17 = ((i * 362004572) - 1408384217) + (i2 * 362004174) + (i10 * (-398)) + (i12 * 199) + (i13 * 199) + (i6 * 362004373) + (i3 * (-1290304248)) + (i4 * 155295761) + (i15 * (-60686336));
        int i18 = i16 + (i17 * i17 * (-1680474112));
        if (i18 == 1) {
            return onNavigationEvent(objArr);
        }
        if (i18 == 2) {
            return onWarmupCompleted(objArr);
        }
        if (i18 == 3) {
            return onExtraCallbackWithResult(objArr);
        }
        int i19 = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(OverviewItemInfo.Companion.serializer());
        int i20 = IAuthTabCallback + 83;
        onExtraCallbackWithResult = i20 % 128;
        int i21 = i20 % 2;
        return checkcanopenlandingpage;
    }

    private static final /* synthetic */ KSerializer getInterfaceDescriptor() {
        return (KSerializer) onNavigationEvent(new Object[0], -157121277, 157121278, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
    }

    private static final /* synthetic */ KSerializer extraCallback() {
        return (KSerializer) onNavigationEvent(new Object[0], 1707003565, -1707003565, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
    }

    public final checkDuration onTransact() {
        return (checkDuration) onNavigationEvent(new Object[]{this}, -1964713930, 1964713932, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
    }

    @Deprecated
    public final OverviewPrice onExtraCallbackWithResult(boolean z) {
        return (OverviewPrice) onNavigationEvent(new Object[]{this, Boolean.valueOf(z)}, 1240185852, -1240185849, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
    }
}
