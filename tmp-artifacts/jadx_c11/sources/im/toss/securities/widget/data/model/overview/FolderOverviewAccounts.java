package im.toss.securities.widget.data.model.overview;

import im.toss.securities.widget.data.model.overview.FolderOverviewAccounts;
import im.toss.securities.widget.data.model.overview.FolderOverviewAccounts$;
import im.toss.securities.widget.data.model.overview.OverviewAccounts;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o._string;
import o.access15300;
import o.checkCanOpenLandingPage;
import o.getBgColor;
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.r2ExternalSyntheticLambda4;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class FolderOverviewAccounts {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final List<Overview> overview;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.securities.widget.data.model.overview.FolderOverviewAccounts$$ExternalSyntheticLambda0
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 67;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                FolderOverviewAccounts.onExtraCallbackWithResult();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            KSerializer kSerializerOnExtraCallbackWithResult = FolderOverviewAccounts.onExtraCallbackWithResult();
            int i3 = onNavigationEvent + 55;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return kSerializerOnExtraCallbackWithResult;
        }
    })};

    /* JADX WARN: Illegal instructions before constructor call */
    public FolderOverviewAccounts() {
        List list = null;
        this(list, 1, (DefaultConstructorMarker) list);
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnWarmupCompleted = onWarmupCompleted();
        if (i3 != 0) {
            int i4 = 91 / 0;
        }
        return kSerializerOnWarmupCompleted;
    }

    private static final /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(FolderOverviewAccounts$Overview$$serializer.INSTANCE);
        int i2 = IAuthTabCallback + 27;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 41 / 0;
        }
        return checkcanopenlandingpage;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 55;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (obj instanceof FolderOverviewAccounts) {
            return Intrinsics.areEqual(this.overview, ((FolderOverviewAccounts) obj).overview);
        }
        int i6 = i3 + 97;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        List<Overview> list = this.overview;
        if (list == null) {
            int i2 = IAuthTabCallback + 7;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return 0;
        }
        int iHashCode = list.hashCode();
        int i4 = IAuthTabCallback + 91;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FolderOverviewAccounts(overview=" + this.overview + ")";
        int i2 = IAuthTabCallback + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FolderOverviewAccounts> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 85;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            FolderOverviewAccounts$.serializer serializerVar = FolderOverviewAccounts$.serializer.INSTANCE;
            if (i3 == 0) {
                int i4 = 45 / 0;
            }
            return serializerVar;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 35;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ FolderOverviewAccounts(int i, List list, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.overview = null;
            int i2 = onNavigationEvent + 27;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.overview = list;
        int i3 = IAuthTabCallback + 109;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 37 / 0;
        }
    }

    public FolderOverviewAccounts(@Nullable List<Overview> list) {
        this.overview = list;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        Lazy<KSerializer<Object>>[] lazyArr;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            lazyArr = $childSerializers;
            int i4 = 7 / 0;
        } else {
            lazyArr = $childSerializers;
        }
        int i5 = i3 + 85;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return lazyArr;
        }
        throw null;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(FolderOverviewAccounts folderOverviewAccounts, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || folderOverviewAccounts.overview != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, (py) lazyArr[0].getValue(), folderOverviewAccounts.overview);
        }
        int i4 = onNavigationEvent + 113;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ FolderOverviewAccounts(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 49;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 93 / 0;
            }
            int i4 = 2 % 2;
            list = null;
        }
        this(list);
    }

    @liq
    public static final class Overview {
        private static final Lazy<KSerializer<Object>>[] $childSerializers;
        public static final Companion Companion;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final String accountSeq;
        private final OverviewPrice evaluatedAmount;
        private final OverviewPrice evaluatedAmountAfterFees;
        private final List<Folder> folders;
        private final Boolean hasKr;
        private final OverviewAccounts.Overview.HiddenStock hiddenStock;
        private final Integer itemsCount;
        private final List<String> logoImageUrls;
        private final Integer pollIntervalMillis;
        private final OverviewPrice principalAmount;
        private final OverviewPrice profitLossAmount;
        private final OverviewPrice profitLossAmountAfterFees;
        private final OverviewPrice profitLossRate;
        private final OverviewRate profitLossRateAfterFees;
        private final String sortingRule;
        private final OverviewPrice totalCommission;
        private final OverviewPrice totalTax;

        public Overview() {
            this((String) null, (OverviewPrice) null, (OverviewPrice) null, (OverviewPrice) null, (OverviewPrice) null, (OverviewPrice) null, (OverviewRate) null, (OverviewPrice) null, (List) null, (Integer) null, (OverviewPrice) null, (OverviewPrice) null, (Boolean) null, (List) null, (OverviewAccounts.Overview.HiddenStock) null, (Integer) null, (String) null, 131071, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ KSerializer IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 41;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerExtraCallbackWithResult = extraCallbackWithResult();
            int i4 = IAuthTabCallback + 51;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerExtraCallbackWithResult;
        }

        private static final /* synthetic */ KSerializer extraCallbackWithResult() {
            int i = 2 % 2;
            checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(FolderOverviewAccounts$Folder$$serializer.INSTANCE);
            int i2 = IAuthTabCallback + 11;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return checkcanopenlandingpage;
        }

        public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
            int i7 = (~((~i5) | i)) | (~(i | i3));
            int i8 = (~i) | (~i3);
            int i9 = i7 | (~(i8 | i5));
            int i10 = (~i8) | i5;
            int i11 = ~(i3 | i5);
            int i12 = i5 + i + i2 + ((-417414852) * i4) + (1247522396 * i6);
            int i13 = i12 * i12;
            int i14 = (i5 * (-1219797419)) + 1526988800 + ((-1219797419) * i) + (825712212 * i9) + ((-1651424424) * i10) + ((-825712212) * i11) + ((-2045509632) * i2) + ((-2135949312) * i4) + ((-953155584) * i6) + ((-430374912) * i13);
            int i15 = ((i5 * 184508743) - 476012450) + (i * 184508743) + (i9 * (-996)) + (i10 * 1992) + (i11 * 996) + (i2 * 184509739) + (i4 * (-953474796)) + (i6 * (-288057996)) + (i13 * (-839712768));
            int i16 = i14 + (i15 * i15 * 1709113344);
            return i16 != 1 ? i16 != 2 ? i16 != 3 ? onExtraCallback(objArr) : onWarmupCompleted(objArr) : onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr);
        }

        public static /* synthetic */ KSerializer onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 89;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerWriteTypedObject = writeTypedObject();
            int i4 = onNavigationEvent + 33;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerWriteTypedObject;
        }

        private static final /* synthetic */ KSerializer writeTypedObject() {
            int i = 2 % 2;
            checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
            int i2 = onNavigationEvent + 19;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return checkcanopenlandingpage;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Overview)) {
                return false;
            }
            Overview overview = (Overview) obj;
            if (Intrinsics.areEqual(this.accountSeq, overview.accountSeq) && Intrinsics.areEqual(this.evaluatedAmount, overview.evaluatedAmount) && !(!Intrinsics.areEqual(this.evaluatedAmountAfterFees, overview.evaluatedAmountAfterFees))) {
                if (!Intrinsics.areEqual(this.profitLossAmount, overview.profitLossAmount)) {
                    int i2 = onNavigationEvent + 107;
                    IAuthTabCallback = i2 % 128;
                    return i2 % 2 == 0;
                }
                if (!(!Intrinsics.areEqual(this.profitLossAmountAfterFees, overview.profitLossAmountAfterFees))) {
                    if (!Intrinsics.areEqual(this.profitLossRate, overview.profitLossRate)) {
                        int i3 = onNavigationEvent + 41;
                        IAuthTabCallback = i3 % 128;
                        int i4 = i3 % 2;
                        return false;
                    }
                    if (!Intrinsics.areEqual(this.profitLossRateAfterFees, overview.profitLossRateAfterFees) || !Intrinsics.areEqual(this.principalAmount, overview.principalAmount)) {
                        return false;
                    }
                    if (!Intrinsics.areEqual(this.logoImageUrls, overview.logoImageUrls)) {
                        int i5 = onNavigationEvent + 9;
                        IAuthTabCallback = i5 % 128;
                        int i6 = i5 % 2;
                        return false;
                    }
                    if (!Intrinsics.areEqual(this.itemsCount, overview.itemsCount)) {
                        int i7 = onNavigationEvent + 65;
                        IAuthTabCallback = i7 % 128;
                        int i8 = i7 % 2;
                        return false;
                    }
                    if (!Intrinsics.areEqual(this.totalCommission, overview.totalCommission) || !Intrinsics.areEqual(this.totalTax, overview.totalTax) || !Intrinsics.areEqual(this.hasKr, overview.hasKr)) {
                        return false;
                    }
                    if (!Intrinsics.areEqual(this.folders, overview.folders)) {
                        int i9 = onNavigationEvent;
                        int i10 = i9 + 21;
                        IAuthTabCallback = i10 % 128;
                        int i11 = i10 % 2;
                        int i12 = i9 + 99;
                        IAuthTabCallback = i12 % 128;
                        int i13 = i12 % 2;
                        return false;
                    }
                    if (!Intrinsics.areEqual(this.hiddenStock, overview.hiddenStock) || !Intrinsics.areEqual(this.pollIntervalMillis, overview.pollIntervalMillis)) {
                        return false;
                    }
                    if (Intrinsics.areEqual(this.sortingRule, overview.sortingRule)) {
                        return true;
                    }
                    int i14 = onNavigationEvent + 75;
                    IAuthTabCallback = i14 % 128;
                    int i15 = i14 % 2;
                    return false;
                }
                int i16 = IAuthTabCallback + 119;
                onNavigationEvent = i16 % 128;
                if (i16 % 2 != 0) {
                    return true;
                }
            }
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
            int i3 = 2 % 2;
            String str = this.accountSeq;
            int iHashCode7 = str == null ? 0 : str.hashCode();
            OverviewPrice overviewPrice = this.evaluatedAmount;
            if (overviewPrice == null) {
                int i4 = IAuthTabCallback + 91;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                iHashCode = 0;
            } else {
                iHashCode = overviewPrice.hashCode();
            }
            OverviewPrice overviewPrice2 = this.evaluatedAmountAfterFees;
            int iHashCode8 = overviewPrice2 == null ? 0 : overviewPrice2.hashCode();
            OverviewPrice overviewPrice3 = this.profitLossAmount;
            int iHashCode9 = overviewPrice3 == null ? 0 : overviewPrice3.hashCode();
            OverviewPrice overviewPrice4 = this.profitLossAmountAfterFees;
            int iHashCode10 = overviewPrice4 == null ? 0 : overviewPrice4.hashCode();
            OverviewPrice overviewPrice5 = this.profitLossRate;
            if (overviewPrice5 == null) {
                int i6 = IAuthTabCallback + 107;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                iHashCode2 = 0;
            } else {
                iHashCode2 = overviewPrice5.hashCode();
            }
            OverviewRate overviewRate = this.profitLossRateAfterFees;
            int iHashCode11 = overviewRate == null ? 0 : overviewRate.hashCode();
            OverviewPrice overviewPrice6 = this.principalAmount;
            if (overviewPrice6 == null) {
                int i8 = IAuthTabCallback + 63;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                iHashCode3 = 0;
            } else {
                iHashCode3 = overviewPrice6.hashCode();
            }
            List<String> list = this.logoImageUrls;
            int iHashCode12 = list == null ? 0 : list.hashCode();
            Integer num = this.itemsCount;
            if (num == null) {
                int i10 = IAuthTabCallback + 11;
                onNavigationEvent = i10 % 128;
                iHashCode4 = i10 % 2 != 0 ? 1 : 0;
            } else {
                iHashCode4 = num.hashCode();
            }
            OverviewPrice overviewPrice7 = this.totalCommission;
            int iHashCode13 = overviewPrice7 == null ? 0 : overviewPrice7.hashCode();
            OverviewPrice overviewPrice8 = this.totalTax;
            int iHashCode14 = overviewPrice8 == null ? 0 : overviewPrice8.hashCode();
            Boolean bool = this.hasKr;
            int iHashCode15 = bool == null ? 0 : bool.hashCode();
            int iHashCode16 = this.folders.hashCode();
            OverviewAccounts.Overview.HiddenStock hiddenStock = this.hiddenStock;
            if (hiddenStock == null) {
                int i11 = IAuthTabCallback + 123;
                i = iHashCode16;
                onNavigationEvent = i11 % 128;
                int i12 = i11 % 2;
                iHashCode5 = 0;
            } else {
                i = iHashCode16;
                iHashCode5 = hiddenStock.hashCode();
            }
            Integer num2 = this.pollIntervalMillis;
            if (num2 == null) {
                int i13 = onNavigationEvent + 69;
                i2 = iHashCode5;
                IAuthTabCallback = i13 % 128;
                int i14 = i13 % 2;
                iHashCode6 = 0;
            } else {
                i2 = iHashCode5;
                iHashCode6 = num2.hashCode();
            }
            String str2 = this.sortingRule;
            return (((((((((((((((((((((((((((((((iHashCode7 * 31) + iHashCode) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode2) * 31) + iHashCode11) * 31) + iHashCode3) * 31) + iHashCode12) * 31) + iHashCode4) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + i) * 31) + i2) * 31) + iHashCode6) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Overview(accountSeq=" + this.accountSeq + ", evaluatedAmount=" + this.evaluatedAmount + ", evaluatedAmountAfterFees=" + this.evaluatedAmountAfterFees + ", profitLossAmount=" + this.profitLossAmount + ", profitLossAmountAfterFees=" + this.profitLossAmountAfterFees + ", profitLossRate=" + this.profitLossRate + ", profitLossRateAfterFees=" + this.profitLossRateAfterFees + ", principalAmount=" + this.principalAmount + ", logoImageUrls=" + this.logoImageUrls + ", itemsCount=" + this.itemsCount + ", totalCommission=" + this.totalCommission + ", totalTax=" + this.totalTax + ", hasKr=" + this.hasKr + ", folders=" + this.folders + ", hiddenStock=" + this.hiddenStock + ", pollIntervalMillis=" + this.pollIntervalMillis + ", sortingRule=" + this.sortingRule + ")";
            int i2 = IAuthTabCallback + 105;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public static final class Companion {
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Overview> serializer() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 23;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                FolderOverviewAccounts$Overview$$serializer folderOverviewAccounts$Overview$$serializer = FolderOverviewAccounts$Overview$$serializer.INSTANCE;
                int i4 = onWarmupCompleted + 57;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return folderOverviewAccounts$Overview$$serializer;
            }
        }

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new Companion(defaultConstructorMarker);
            TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
            $childSerializers = new Lazy[]{null, null, null, null, null, null, null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.securities.widget.data.model.overview.FolderOverviewAccounts$Overview$$ExternalSyntheticLambda0
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 69;
                    onExtraCallback = i2 % 128;
                    Object obj = null;
                    if (i2 % 2 == 0) {
                        FolderOverviewAccounts.Overview.onNavigationEvent();
                        obj.hashCode();
                        throw null;
                    }
                    KSerializer kSerializerOnNavigationEvent = FolderOverviewAccounts.Overview.onNavigationEvent();
                    int i3 = onExtraCallbackWithResult + 41;
                    onExtraCallback = i3 % 128;
                    if (i3 % 2 != 0) {
                        return kSerializerOnNavigationEvent;
                    }
                    throw null;
                }
            }), null, null, null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.securities.widget.data.model.overview.FolderOverviewAccounts$Overview$$ExternalSyntheticLambda1
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 31;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    KSerializer kSerializerIAuthTabCallback = FolderOverviewAccounts.Overview.IAuthTabCallback();
                    int i4 = onExtraCallback + 111;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 86 / 0;
                    }
                    return kSerializerIAuthTabCallback;
                }
            }), null, null, null};
            int i = onWarmupCompleted + 31;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }

        public /* synthetic */ Overview(int i, String str, OverviewPrice overviewPrice, OverviewPrice overviewPrice2, OverviewPrice overviewPrice3, OverviewPrice overviewPrice4, OverviewPrice overviewPrice5, OverviewRate overviewRate, OverviewPrice overviewPrice6, List list, Integer num, OverviewPrice overviewPrice7, OverviewPrice overviewPrice8, Boolean bool, List list2, OverviewAccounts.Overview.HiddenStock hiddenStock, Integer num2, String str2, okycx okycxVar) {
            List listEmptyList;
            if ((i & 1) == 0) {
                this.accountSeq = null;
            } else {
                this.accountSeq = str;
            }
            if ((i & 2) == 0) {
                this.evaluatedAmount = null;
                int i2 = onNavigationEvent + 123;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } else {
                this.evaluatedAmount = overviewPrice;
            }
            if ((i & 4) == 0) {
                this.evaluatedAmountAfterFees = null;
                int i5 = 2 % 2;
            } else {
                this.evaluatedAmountAfterFees = overviewPrice2;
            }
            if ((i & 8) == 0) {
                int i6 = onNavigationEvent + 59;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                this.profitLossAmount = null;
                int i8 = 2 % 2;
            } else {
                this.profitLossAmount = overviewPrice3;
            }
            if ((i & 16) == 0) {
                this.profitLossAmountAfterFees = null;
            } else {
                this.profitLossAmountAfterFees = overviewPrice4;
            }
            if ((i & 32) == 0) {
                this.profitLossRate = null;
            } else {
                this.profitLossRate = overviewPrice5;
            }
            if ((i & 64) == 0) {
                this.profitLossRateAfterFees = null;
            } else {
                this.profitLossRateAfterFees = overviewRate;
            }
            if ((i & 128) == 0) {
                this.principalAmount = null;
            } else {
                this.principalAmount = overviewPrice6;
            }
            if ((i & 256) == 0) {
                this.logoImageUrls = null;
            } else {
                this.logoImageUrls = list;
                int i9 = IAuthTabCallback + 53;
                onNavigationEvent = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 3 / 2;
                } else {
                    int i11 = 2 % 2;
                }
            }
            if ((i & 512) == 0) {
                this.itemsCount = null;
            } else {
                this.itemsCount = num;
            }
            if ((i & 1024) == 0) {
                this.totalCommission = null;
            } else {
                this.totalCommission = overviewPrice7;
            }
            if ((i & 2048) == 0) {
                this.totalTax = null;
            } else {
                this.totalTax = overviewPrice8;
            }
            if ((i & 4096) == 0) {
                this.hasKr = null;
            } else {
                this.hasKr = bool;
            }
            if ((i & 8192) == 0) {
                int i12 = onNavigationEvent + 87;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
                listEmptyList = CollectionsKt.emptyList();
            } else {
                listEmptyList = list2;
            }
            this.folders = listEmptyList;
            int i14 = IAuthTabCallback + 85;
            onNavigationEvent = i14 % 128;
            int i15 = i14 % 2;
            if ((i & 16384) == 0) {
                this.hiddenStock = null;
            } else {
                this.hiddenStock = hiddenStock;
            }
            if ((32768 & i) == 0) {
                this.pollIntervalMillis = null;
            } else {
                this.pollIntervalMillis = num2;
                int i16 = 2 % 2;
            }
            if ((i & 65536) == 0) {
                this.sortingRule = null;
            } else {
                this.sortingRule = str2;
            }
        }

        public Overview(@Nullable String str, @Nullable OverviewPrice overviewPrice, @Nullable OverviewPrice overviewPrice2, @Nullable OverviewPrice overviewPrice3, @Nullable OverviewPrice overviewPrice4, @Nullable OverviewPrice overviewPrice5, @Nullable OverviewRate overviewRate, @Nullable OverviewPrice overviewPrice6, @Nullable List<String> list, @Nullable Integer num, @Nullable OverviewPrice overviewPrice7, @Nullable OverviewPrice overviewPrice8, @Nullable Boolean bool, @NotNull List<Folder> list2, @Nullable OverviewAccounts.Overview.HiddenStock hiddenStock, @Nullable Integer num2, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(list2, "");
            this.accountSeq = str;
            this.evaluatedAmount = overviewPrice;
            this.evaluatedAmountAfterFees = overviewPrice2;
            this.profitLossAmount = overviewPrice3;
            this.profitLossAmountAfterFees = overviewPrice4;
            this.profitLossRate = overviewPrice5;
            this.profitLossRateAfterFees = overviewRate;
            this.principalAmount = overviewPrice6;
            this.logoImageUrls = list;
            this.itemsCount = num;
            this.totalCommission = overviewPrice7;
            this.totalTax = overviewPrice8;
            this.hasKr = bool;
            this.folders = list2;
            this.hiddenStock = hiddenStock;
            this.pollIntervalMillis = num2;
            this.sortingRule = str2;
        }

        public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
            Lazy<KSerializer<Object>>[] lazyArr;
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 53;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                lazyArr = $childSerializers;
                int i4 = 90 / 0;
            } else {
                lazyArr = $childSerializers;
            }
            int i5 = i2 + 85;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return lazyArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x00e4  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0114  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0158  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x0182  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onNavigationEvent(Overview overview, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (vylVar.onWarmupCompleted(serialDescriptor, 0) || overview.accountSeq != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, overview.accountSeq);
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 1) || overview.evaluatedAmount != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 1, OverviewPrice$$serializer.INSTANCE, overview.evaluatedAmount);
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
                int i2 = IAuthTabCallback + 63;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                if (overview.evaluatedAmountAfterFees != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 2, OverviewPrice$$serializer.INSTANCE, overview.evaluatedAmountAfterFees);
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 3) || overview.profitLossAmount != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 3, OverviewPrice$$serializer.INSTANCE, overview.profitLossAmount);
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 4) || overview.profitLossAmountAfterFees != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 4, OverviewPrice$$serializer.INSTANCE, overview.profitLossAmountAfterFees);
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 5) || overview.profitLossRate != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 5, OverviewPrice$$serializer.INSTANCE, overview.profitLossRate);
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 6) || overview.profitLossRateAfterFees != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 6, OverviewRate$$serializer.INSTANCE, overview.profitLossRateAfterFees);
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 7)) {
                int i4 = IAuthTabCallback + 85;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                if (overview.principalAmount != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 7, OverviewPrice$$serializer.INSTANCE, overview.principalAmount);
                }
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 8)) {
                int i6 = onNavigationEvent + 37;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                if (overview.logoImageUrls != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 8, (py) lazyArr[8].getValue(), overview.logoImageUrls);
                }
            }
            Object obj = null;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 9)) {
                int i8 = IAuthTabCallback + 67;
                onNavigationEvent = i8 % 128;
                if (i8 % 2 != 0) {
                    Integer num = overview.itemsCount;
                    throw null;
                }
                if (overview.itemsCount != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 9, getDynamicHeight.onWarmupCompleted, overview.itemsCount);
                }
            }
            if (!(!vylVar.onWarmupCompleted(serialDescriptor, 10)) || overview.totalCommission != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 10, OverviewPrice$$serializer.INSTANCE, overview.totalCommission);
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 11)) {
                int i9 = IAuthTabCallback + 9;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                if (overview.totalTax != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 11, OverviewPrice$$serializer.INSTANCE, overview.totalTax);
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 12) || overview.hasKr != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 12, getBgColor.IAuthTabCallback, overview.hasKr);
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 13)) {
                int i11 = IAuthTabCallback + 101;
                onNavigationEvent = i11 % 128;
                if (i11 % 2 == 0) {
                    if (!Intrinsics.areEqual(overview.folders, CollectionsKt.emptyList())) {
                        vylVar.onNavigationEvent(serialDescriptor, 13, (py) lazyArr[13].getValue(), overview.folders);
                    }
                } else {
                    Intrinsics.areEqual(overview.folders, CollectionsKt.emptyList());
                    throw null;
                }
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 14)) {
                int i12 = onNavigationEvent + 11;
                IAuthTabCallback = i12 % 128;
                if (i12 % 2 == 0) {
                    OverviewAccounts.Overview.HiddenStock hiddenStock = overview.hiddenStock;
                    obj.hashCode();
                    throw null;
                }
                if (overview.hiddenStock != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 14, OverviewAccounts$Overview$HiddenStock$$serializer.INSTANCE, overview.hiddenStock);
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 15) || overview.pollIntervalMillis != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 15, getDynamicHeight.onWarmupCompleted, overview.pollIntervalMillis);
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 16)) {
                int i13 = IAuthTabCallback + 63;
                onNavigationEvent = i13 % 128;
                if (i13 % 2 != 0) {
                    String str = overview.sortingRule;
                    obj.hashCode();
                    throw null;
                }
                if (overview.sortingRule == null) {
                    return;
                }
            }
            vylVar.onExtraCallbackWithResult(serialDescriptor, 16, getWriggleLayout.onNavigationEvent, overview.sortingRule);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Overview(String str, OverviewPrice overviewPrice, OverviewPrice overviewPrice2, OverviewPrice overviewPrice3, OverviewPrice overviewPrice4, OverviewPrice overviewPrice5, OverviewRate overviewRate, OverviewPrice overviewPrice6, List list, Integer num, OverviewPrice overviewPrice7, OverviewPrice overviewPrice8, Boolean bool, List list2, OverviewAccounts.Overview.HiddenStock hiddenStock, Integer num2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            String str3;
            OverviewPrice overviewPrice9;
            List list3;
            Boolean bool2;
            OverviewAccounts.Overview.HiddenStock hiddenStock2;
            List list4;
            Integer num3;
            String str4;
            if ((i & 1) != 0) {
                int i2 = IAuthTabCallback + 85;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
                str3 = null;
            } else {
                str3 = str;
            }
            OverviewPrice overviewPrice10 = (i & 2) != 0 ? null : overviewPrice;
            OverviewPrice overviewPrice11 = (i & 4) != 0 ? null : overviewPrice2;
            OverviewPrice overviewPrice12 = (i & 8) != 0 ? null : overviewPrice3;
            OverviewPrice overviewPrice13 = (i & 16) != 0 ? null : overviewPrice4;
            if ((i & 32) != 0) {
                int i5 = onNavigationEvent + 109;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
                overviewPrice9 = null;
            } else {
                overviewPrice9 = overviewPrice5;
            }
            OverviewRate overviewRate2 = (i & 64) != 0 ? null : overviewRate;
            OverviewPrice overviewPrice14 = (i & 128) != 0 ? null : overviewPrice6;
            if ((i & 256) != 0) {
                int i6 = 2 % 2;
                list3 = null;
            } else {
                list3 = list;
            }
            Integer num4 = (i & 512) != 0 ? null : num;
            OverviewPrice overviewPrice15 = (i & 1024) != 0 ? null : overviewPrice7;
            OverviewPrice overviewPrice16 = (i & 2048) != 0 ? null : overviewPrice8;
            if ((i & 4096) != 0) {
                int i7 = IAuthTabCallback + 81;
                onNavigationEvent = i7 % 128;
                bool2 = null;
                if (i7 % 2 != 0) {
                    bool2.hashCode();
                    throw null;
                }
            } else {
                bool2 = bool;
            }
            List listEmptyList = (i & 8192) != 0 ? CollectionsKt.emptyList() : list2;
            OverviewAccounts.Overview.HiddenStock hiddenStock3 = (i & 16384) != 0 ? null : hiddenStock;
            if ((i & 32768) != 0) {
                hiddenStock2 = hiddenStock3;
                int i8 = IAuthTabCallback + 119;
                list4 = listEmptyList;
                onNavigationEvent = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 62 / 0;
                }
                num3 = null;
            } else {
                hiddenStock2 = hiddenStock3;
                list4 = listEmptyList;
                num3 = num2;
            }
            if ((i & 65536) != 0) {
                int i10 = IAuthTabCallback + 75;
                onNavigationEvent = i10 % 128;
                if (i10 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                str4 = null;
            } else {
                str4 = str2;
            }
            this(str3, overviewPrice10, overviewPrice11, overviewPrice12, overviewPrice13, overviewPrice9, overviewRate2, overviewPrice14, list3, num4, overviewPrice15, overviewPrice16, bool2, list4, hiddenStock2, num3, str4);
        }

        private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
            Overview overview = (Overview) objArr[0];
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 41;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            OverviewPrice overviewPrice = overview.evaluatedAmount;
            if (i3 != 0) {
                int i4 = 98 / 0;
            }
            return overviewPrice;
        }

        public final OverviewPrice onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 59;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return this.evaluatedAmountAfterFees;
            }
            throw null;
        }

        public final OverviewPrice access000() {
            OverviewPrice overviewPrice;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 43;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 != 0) {
                overviewPrice = this.profitLossAmount;
                int i4 = 2 / 0;
            } else {
                overviewPrice = this.profitLossAmount;
            }
            int i5 = i3 + 51;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return overviewPrice;
        }

        public final OverviewPrice IAuthTabCallbackStubProxy() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 23;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            OverviewPrice overviewPrice = this.profitLossAmountAfterFees;
            int i5 = i3 + 21;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return overviewPrice;
        }

        public final OverviewPrice access100() {
            OverviewPrice overviewPrice;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 121;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 != 0) {
                overviewPrice = this.profitLossRate;
                int i4 = 72 / 0;
            } else {
                overviewPrice = this.profitLossRate;
            }
            int i5 = i3 + 5;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return overviewPrice;
        }

        public final OverviewRate getInterfaceDescriptor() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 27;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            OverviewRate overviewRate = this.profitLossRateAfterFees;
            int i5 = i2 + 11;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 55 / 0;
            }
            return overviewRate;
        }

        public final List<String> asInterface() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 9;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            List<String> list = this.logoImageUrls;
            int i5 = i2 + 11;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 59 / 0;
            }
            return list;
        }

        public final Integer IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 19;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            Integer num = this.itemsCount;
            int i5 = i3 + 123;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return num;
        }

        public final OverviewPrice readTypedObject() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 99;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            OverviewPrice overviewPrice = this.totalCommission;
            int i4 = i2 + 95;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return overviewPrice;
        }

        public final OverviewPrice extraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 85;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            OverviewPrice overviewPrice = this.totalTax;
            int i5 = i2 + 79;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return overviewPrice;
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            Overview overview = (Overview) objArr[0];
            int i = 2 % 2;
            int i2 = onNavigationEvent + 71;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            Boolean bool = overview.hasKr;
            if (i4 == 0) {
                int i5 = 29 / 0;
            }
            int i6 = i3 + 55;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return bool;
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
            Overview overview = (Overview) objArr[0];
            int i = 2 % 2;
            int i2 = onNavigationEvent + 39;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            List<Folder> list = overview.folders;
            if (i4 == 0) {
                int i5 = 32 / 0;
            }
            int i6 = i3 + 45;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return list;
        }

        private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
            Overview overview = (Overview) objArr[0];
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 45;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            OverviewAccounts.Overview.HiddenStock hiddenStock = overview.hiddenStock;
            int i5 = i3 + 23;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 50 / 0;
            }
            return hiddenStock;
        }

        public final String IAuthTabCallback_Parcel() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 73;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            String str = this.sortingRule;
            if (i3 != 0) {
                int i4 = 59 / 0;
            }
            return str;
        }

        public final OverviewPrice onWarmupCompleted() {
            int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
            return (OverviewPrice) onExtraCallbackWithResult(-312844636, _string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback, _string.onNavigationEvent.IAuthTabCallback(), 312844637, new Object[]{this}, _string.onNavigationEvent.IAuthTabCallback());
        }

        public final List<Folder> onTransact() {
            int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
            return (List) onExtraCallbackWithResult(-1032588933, _string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback, _string.onNavigationEvent.IAuthTabCallback(), 1032588933, new Object[]{this}, _string.onNavigationEvent.IAuthTabCallback());
        }

        public final Boolean IAuthTabCallbackStub() {
            int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
            return (Boolean) onExtraCallbackWithResult(413752641, _string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback, _string.onNavigationEvent.IAuthTabCallback(), -413752638, new Object[]{this}, _string.onNavigationEvent.IAuthTabCallback());
        }

        public final OverviewAccounts.Overview.HiddenStock asBinder() {
            int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
            return (OverviewAccounts.Overview.HiddenStock) onExtraCallbackWithResult(-317317451, _string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback, _string.onNavigationEvent.IAuthTabCallback(), 317317453, new Object[]{this}, _string.onNavigationEvent.IAuthTabCallback());
        }
    }

    public final List<Overview> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.overview;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @liq
    public static final class Folder {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private final OverviewPrice dailyProfitLossAmount;
        private final OverviewRate dailyProfitLossRate;
        private final String detailType;
        private final OverviewPrice evaluatedAmount;
        private final OverviewPrice evaluatedAmountAfterFees;
        private final String folderKey;
        private final String folderName;
        private final Type folderType;
        private final boolean isDefault;
        private final List<OverviewItemInfo> items;
        private final OverviewPrice principalAmount;
        private final OverviewPrice profitLossAmount;
        private final OverviewPrice profitLossAmountAfterFees;
        private final OverviewRate profitLossRate;
        private final OverviewRate profitLossRateAfterFees;
        public static final Companion Companion = new Companion(null);
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.securities.widget.data.model.overview.FolderOverviewAccounts$Folder$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 19;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerIAuthTabCallback = FolderOverviewAccounts.Folder.IAuthTabCallback();
                int i4 = onNavigationEvent + 91;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerIAuthTabCallback;
            }
        }), null, null, null, null, null, null, null, null, null, null, null, null};

        public static /* synthetic */ KSerializer IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 19;
            onExtraCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                IAuthTabCallbackDefault();
                obj.hashCode();
                throw null;
            }
            KSerializer kSerializerIAuthTabCallbackDefault = IAuthTabCallbackDefault();
            int i3 = onExtraCallbackWithResult + 23;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return kSerializerIAuthTabCallbackDefault;
            }
            throw null;
        }

        private static final /* synthetic */ KSerializer IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 125;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Type.Companion companion = Type.Companion;
            if (i3 != 0) {
                return companion.serializer();
            }
            companion.serializer();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        
            if ((r6 instanceof im.toss.securities.widget.data.model.overview.FolderOverviewAccounts.Folder) != false) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
        
            r6 = (im.toss.securities.widget.data.model.overview.FolderOverviewAccounts.Folder) r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.folderKey, r6.folderKey) != false) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.folderName, r6.folderName) != false) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
        
            if (r5.folderType == r6.folderType) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
        
            if (r5.isDefault == r6.isDefault) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
        
            r6 = im.toss.securities.widget.data.model.overview.FolderOverviewAccounts.Folder.onExtraCallback + 31;
            im.toss.securities.widget.data.model.overview.FolderOverviewAccounts.Folder.onExtraCallbackWithResult = r6 % 128;
            r6 = r6 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x005f, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.detailType, r6.detailType) != false) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0061, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x006a, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.principalAmount, r6.principalAmount) != false) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x006c, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0075, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.evaluatedAmount, r6.evaluatedAmount) != false) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0077, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0080, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.evaluatedAmountAfterFees, r6.evaluatedAmountAfterFees) != false) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0082, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x008b, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.profitLossAmount, r6.profitLossAmount) != false) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x008d, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0096, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.profitLossAmountAfterFees, r6.profitLossAmountAfterFees) != false) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0098, code lost:
        
            r6 = im.toss.securities.widget.data.model.overview.FolderOverviewAccounts.Folder.onExtraCallbackWithResult + 37;
            im.toss.securities.widget.data.model.overview.FolderOverviewAccounts.Folder.onExtraCallback = r6 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00a1, code lost:
        
            if ((r6 % 2) == 0) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00a3, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00a4, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00ad, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.dailyProfitLossAmount, r6.dailyProfitLossAmount) != false) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00af, code lost:
        
            r6 = im.toss.securities.widget.data.model.overview.FolderOverviewAccounts.Folder.onExtraCallbackWithResult + 53;
            im.toss.securities.widget.data.model.overview.FolderOverviewAccounts.Folder.onExtraCallback = r6 % 128;
            r6 = r6 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00b8, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00c1, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.profitLossRate, r6.profitLossRate) != false) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00c3, code lost:
        
            r6 = im.toss.securities.widget.data.model.overview.FolderOverviewAccounts.Folder.onExtraCallbackWithResult + 51;
            im.toss.securities.widget.data.model.overview.FolderOverviewAccounts.Folder.onExtraCallback = r6 % 128;
            r6 = r6 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00cc, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00d5, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.profitLossRateAfterFees, r6.profitLossRateAfterFees) != false) goto L60;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00d7, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00e0, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.dailyProfitLossRate, r6.dailyProfitLossRate) != false) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x00e2, code lost:
        
            r6 = im.toss.securities.widget.data.model.overview.FolderOverviewAccounts.Folder.onExtraCallbackWithResult + 53;
            im.toss.securities.widget.data.model.overview.FolderOverviewAccounts.Folder.onExtraCallback = r6 % 128;
            r6 = r6 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x00eb, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x00f4, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.items, r6.items) != false) goto L67;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x00f6, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x00f7, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            r1 = r1 + 89;
            im.toss.securities.widget.data.model.overview.FolderOverviewAccounts.Folder.onExtraCallback = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        
            if ((r1 % 2) == 0) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 21;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 94 / 0;
            }
        }

        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            int i = 2 % 2;
            int iHashCode3 = this.folderKey.hashCode();
            int iHashCode4 = this.folderName.hashCode();
            int iHashCode5 = this.folderType.hashCode();
            int iHashCode6 = Boolean.hashCode(this.isDefault);
            String str = this.detailType;
            int iHashCode7 = str == null ? 0 : str.hashCode();
            OverviewPrice overviewPrice = this.principalAmount;
            int iHashCode8 = overviewPrice == null ? 0 : overviewPrice.hashCode();
            OverviewPrice overviewPrice2 = this.evaluatedAmount;
            int iHashCode9 = overviewPrice2 == null ? 0 : overviewPrice2.hashCode();
            OverviewPrice overviewPrice3 = this.evaluatedAmountAfterFees;
            int iHashCode10 = overviewPrice3 == null ? 0 : overviewPrice3.hashCode();
            OverviewPrice overviewPrice4 = this.profitLossAmount;
            int iHashCode11 = overviewPrice4 == null ? 0 : overviewPrice4.hashCode();
            OverviewPrice overviewPrice5 = this.profitLossAmountAfterFees;
            int iHashCode12 = overviewPrice5 == null ? 0 : overviewPrice5.hashCode();
            OverviewPrice overviewPrice6 = this.dailyProfitLossAmount;
            int iHashCode13 = overviewPrice6 == null ? 0 : overviewPrice6.hashCode();
            OverviewRate overviewRate = this.profitLossRate;
            int iHashCode14 = overviewRate == null ? 0 : overviewRate.hashCode();
            OverviewRate overviewRate2 = this.profitLossRateAfterFees;
            if (overviewRate2 == null) {
                int i2 = onExtraCallbackWithResult + 121;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 3 / 4;
                }
                iHashCode = 0;
            } else {
                iHashCode = overviewRate2.hashCode();
            }
            OverviewRate overviewRate3 = this.dailyProfitLossRate;
            if (overviewRate3 != null) {
                int i4 = onExtraCallback + 107;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    overviewRate3.hashCode();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                iHashCode2 = overviewRate3.hashCode();
            } else {
                iHashCode2 = 0;
            }
            return (((((((((((((((((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode) * 31) + iHashCode2) * 31) + this.items.hashCode();
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Folder(folderKey=" + this.folderKey + ", folderName=" + this.folderName + ", folderType=" + this.folderType + ", isDefault=" + this.isDefault + ", detailType=" + this.detailType + ", principalAmount=" + this.principalAmount + ", evaluatedAmount=" + this.evaluatedAmount + ", evaluatedAmountAfterFees=" + this.evaluatedAmountAfterFees + ", profitLossAmount=" + this.profitLossAmount + ", profitLossAmountAfterFees=" + this.profitLossAmountAfterFees + ", dailyProfitLossAmount=" + this.dailyProfitLossAmount + ", profitLossRate=" + this.profitLossRate + ", profitLossRateAfterFees=" + this.profitLossRateAfterFees + ", dailyProfitLossRate=" + this.dailyProfitLossRate + ", items=" + this.items + ")";
            int i2 = onExtraCallback + 5;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Folder> serializer() {
                FolderOverviewAccounts$Folder$$serializer folderOverviewAccounts$Folder$$serializer;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 109;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    folderOverviewAccounts$Folder$$serializer = FolderOverviewAccounts$Folder$$serializer.INSTANCE;
                    int i3 = 9 / 0;
                } else {
                    folderOverviewAccounts$Folder$$serializer = FolderOverviewAccounts$Folder$$serializer.INSTANCE;
                }
                int i4 = onExtraCallback + 67;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return folderOverviewAccounts$Folder$$serializer;
            }
        }

        static {
            int i = IAuthTabCallback + 3;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: Removed duplicated region for block: B:60:0x00d4  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x00e5  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00ed  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0101  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Folder(int i, String str, String str2, Type type, boolean z, String str3, OverviewPrice overviewPrice, OverviewPrice overviewPrice2, OverviewPrice overviewPrice3, OverviewPrice overviewPrice4, OverviewPrice overviewPrice5, OverviewPrice overviewPrice6, OverviewRate overviewRate, OverviewRate overviewRate2, OverviewRate overviewRate3, List list, okycx okycxVar) {
            List listEmptyList;
            if (3 != (i & 3)) {
                htf31.onExtraCallbackWithResult(i, 3, FolderOverviewAccounts$Folder$$serializer.INSTANCE.getDescriptor());
            }
            this.folderKey = str;
            this.folderName = str2;
            this.folderType = (i & 4) == 0 ? Type.CUSTOM : type;
            if ((i & 8) == 0) {
                this.isDefault = false;
            } else {
                this.isDefault = z;
            }
            int i2 = 2 % 2;
            Object obj = null;
            if ((i & 16) == 0) {
                int i3 = onExtraCallbackWithResult + 49;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                this.detailType = null;
                if (i4 != 0) {
                    int i5 = 17 / 0;
                }
            } else {
                this.detailType = str3;
            }
            if ((i & 32) == 0) {
                int i6 = onExtraCallback + 69;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                this.principalAmount = null;
            } else {
                this.principalAmount = overviewPrice;
            }
            if ((i & 64) == 0) {
                this.evaluatedAmount = null;
            } else {
                this.evaluatedAmount = overviewPrice2;
            }
            if ((i & 128) == 0) {
                int i8 = onExtraCallbackWithResult + 27;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                this.evaluatedAmountAfterFees = null;
            } else {
                this.evaluatedAmountAfterFees = overviewPrice3;
                int i10 = 2 % 2;
            }
            if ((i & 256) == 0) {
                this.profitLossAmount = null;
            } else {
                this.profitLossAmount = overviewPrice4;
            }
            if ((i & 512) == 0) {
                this.profitLossAmountAfterFees = null;
            } else {
                this.profitLossAmountAfterFees = overviewPrice5;
            }
            if ((i & 1024) == 0) {
                this.dailyProfitLossAmount = null;
            } else {
                this.dailyProfitLossAmount = overviewPrice6;
            }
            if ((i & 2048) == 0) {
                int i11 = onExtraCallback + 13;
                onExtraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
                this.profitLossRate = null;
                if (i12 == 0) {
                    obj.hashCode();
                    throw null;
                }
            } else {
                this.profitLossRate = overviewRate;
            }
            if ((i & 4096) == 0) {
                this.profitLossRateAfterFees = null;
                int i13 = onExtraCallbackWithResult + 31;
                onExtraCallback = i13 % 128;
                if (i13 % 2 == 0) {
                }
                if ((i & 8192) != 0) {
                    int i14 = onExtraCallbackWithResult + 55;
                    onExtraCallback = i14 % 128;
                    int i15 = i14 % 2;
                    this.dailyProfitLossRate = null;
                    if (i15 != 0) {
                        int i16 = 79 / 0;
                    }
                } else {
                    this.dailyProfitLossRate = overviewRate3;
                }
                if ((i & 16384) != 0) {
                    int i17 = onExtraCallback + 83;
                    onExtraCallbackWithResult = i17 % 128;
                    if (i17 % 2 == 0) {
                        CollectionsKt.emptyList();
                        throw null;
                    }
                    listEmptyList = CollectionsKt.emptyList();
                } else {
                    listEmptyList = list;
                }
                this.items = listEmptyList;
            }
            this.profitLossRateAfterFees = overviewRate2;
            int i18 = 2 % 2;
            if ((i & 8192) != 0) {
            }
            if ((i & 16384) != 0) {
            }
            this.items = listEmptyList;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x011c  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void IAuthTabCallback(Folder folder, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            vylVar.onExtraCallback(serialDescriptor, 0, folder.folderKey);
            vylVar.onExtraCallback(serialDescriptor, 1, folder.folderName);
            if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
                int i2 = onExtraCallback + 1;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                if (folder.folderType != Type.CUSTOM) {
                    vylVar.onNavigationEvent(serialDescriptor, 2, (py) lazyArr[2].getValue(), folder.folderType);
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 3) || folder.isDefault) {
                vylVar.onNavigationEvent(serialDescriptor, 3, folder.isDefault);
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 4) || folder.detailType != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, folder.detailType);
            }
            Object obj = null;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 5)) {
                int i4 = onExtraCallback + 81;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    OverviewPrice overviewPrice = folder.principalAmount;
                    obj.hashCode();
                    throw null;
                }
                if (folder.principalAmount != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 5, OverviewPrice$$serializer.INSTANCE, folder.principalAmount);
                }
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 6)) {
                int i5 = onExtraCallback + 99;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 12 / 0;
                    if (folder.evaluatedAmount != null) {
                        vylVar.onExtraCallbackWithResult(serialDescriptor, 6, OverviewPrice$$serializer.INSTANCE, folder.evaluatedAmount);
                    }
                } else if (folder.evaluatedAmount != null) {
                }
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 7)) {
                int i7 = onExtraCallback + 81;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 == 0) {
                    OverviewPrice overviewPrice2 = folder.evaluatedAmountAfterFees;
                    throw null;
                }
                if (folder.evaluatedAmountAfterFees != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 7, OverviewPrice$$serializer.INSTANCE, folder.evaluatedAmountAfterFees);
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 8) || folder.profitLossAmount != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 8, OverviewPrice$$serializer.INSTANCE, folder.profitLossAmount);
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 9) || folder.profitLossAmountAfterFees != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 9, OverviewPrice$$serializer.INSTANCE, folder.profitLossAmountAfterFees);
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 10) || folder.dailyProfitLossAmount != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 10, OverviewPrice$$serializer.INSTANCE, folder.dailyProfitLossAmount);
                int i8 = onExtraCallbackWithResult + 3;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 11)) {
                int i10 = onExtraCallback + 49;
                onExtraCallbackWithResult = i10 % 128;
                if (i10 % 2 == 0) {
                    OverviewRate overviewRate = folder.profitLossRate;
                    throw null;
                }
                if (folder.profitLossRate != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 11, OverviewRate$$serializer.INSTANCE, folder.profitLossRate);
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 12) || folder.profitLossRateAfterFees != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 12, OverviewRate$$serializer.INSTANCE, folder.profitLossRateAfterFees);
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 13) || folder.dailyProfitLossRate != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 13, OverviewRate$$serializer.INSTANCE, folder.dailyProfitLossRate);
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 14)) {
                int i11 = onExtraCallback + 59;
                onExtraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
                if (Intrinsics.areEqual(folder.items, CollectionsKt.emptyList())) {
                    return;
                }
            }
            vylVar.onNavigationEvent(serialDescriptor, 14, r2ExternalSyntheticLambda4.IAuthTabCallback, folder.items);
        }

        public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 13;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return $childSerializers;
            }
            throw null;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 95;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            String str = this.folderKey;
            int i5 = i2 + 13;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 63;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            String str = this.folderName;
            int i5 = i2 + 47;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final OverviewRate asBinder() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 21;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            OverviewRate overviewRate = this.profitLossRate;
            int i5 = i2 + 53;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return overviewRate;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final OverviewRate asInterface() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 7;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            OverviewRate overviewRate = this.profitLossRateAfterFees;
            int i4 = i3 + 85;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return overviewRate;
            }
            throw null;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @liq
        public static final class Type {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
            public static final Companion Companion;
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;
            private static int onNavigationEvent;
            public static final Type DEFAULT = new Type("DEFAULT", 0);
            public static final Type CUSTOM = new Type("CUSTOM", 1);
            public static final Type PRESET = new Type("PRESET", 2);

            public static /* synthetic */ KSerializer $r8$lambda$qhwPFRCcOB5BVGTvDY_OYf0eP0g() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 13;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    _init_$_anonymous_();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                KSerializer kSerializer_init_$_anonymous_ = _init_$_anonymous_();
                int i3 = IAuthTabCallback + 91;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return kSerializer_init_$_anonymous_;
            }

            private static final /* synthetic */ Type[] $values() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 31;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Type[] typeArr = {DEFAULT, CUSTOM, PRESET};
                int i5 = i2 + 35;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return typeArr;
            }

            public static EnumEntries<Type> getEntries() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 119;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                EnumEntries<Type> enumEntries = $ENTRIES;
                int i5 = i2 + 3;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return enumEntries;
                }
                throw null;
            }

            public static Type valueOf(String str) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 15;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Type type = (Type) Enum.valueOf(Type.class, str);
                if (i3 != 0) {
                    int i4 = 17 / 0;
                }
                int i5 = IAuthTabCallback + 33;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    return type;
                }
                throw null;
            }

            public static Type[] values() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 85;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Type[] typeArr = (Type[]) $VALUES.clone();
                int i3 = IAuthTabCallback + 25;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 97 / 0;
                }
                return typeArr;
            }

            public static final class Companion {
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                private final /* synthetic */ KSerializer onNavigationEvent() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 3;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    KSerializer kSerializer = (KSerializer) Type.access$get$cachedSerializer$delegate$cp().getValue();
                    int i4 = onNavigationEvent + 89;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    return kSerializer;
                }

                public final KSerializer<Type> serializer() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 21;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 == 0) {
                        onNavigationEvent();
                        throw null;
                    }
                    KSerializer<Type> kSerializerOnNavigationEvent = onNavigationEvent();
                    int i3 = onNavigationEvent + 29;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    return kSerializerOnNavigationEvent;
                }
            }

            private Type(String str, int i) {
            }

            private static final /* synthetic */ KSerializer _init_$_anonymous_() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 105;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.securities.widget.data.model.overview.FolderOverviewAccounts.Folder.Type", values());
                int i4 = onExtraCallbackWithResult + 91;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return kSerializerOnExtraCallbackWithResult;
                }
                throw null;
            }

            public static final /* synthetic */ Lazy access$get$cachedSerializer$delegate$cp() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 115;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                Lazy<KSerializer<Object>> lazy = $cachedSerializer$delegate;
                int i4 = i2 + 15;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return lazy;
            }

            static {
                Type[] typeArr$values = $values();
                $VALUES = typeArr$values;
                $ENTRIES = access15300.onExtraCallbackWithResult(typeArr$values);
                Companion = new Companion(null);
                $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.securities.widget.data.model.overview.FolderOverviewAccounts$Folder$Type$$ExternalSyntheticLambda0
                    private static int onExtraCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke() {
                        int i = 2 % 2;
                        int i2 = onExtraCallback + 45;
                        onNavigationEvent = i2 % 128;
                        int i3 = i2 % 2;
                        KSerializer kSerializer$r8$lambda$qhwPFRCcOB5BVGTvDY_OYf0eP0g = FolderOverviewAccounts.Folder.Type.$r8$lambda$qhwPFRCcOB5BVGTvDY_OYf0eP0g();
                        int i4 = onNavigationEvent + 13;
                        onExtraCallback = i4 % 128;
                        int i5 = i4 % 2;
                        return kSerializer$r8$lambda$qhwPFRCcOB5BVGTvDY_OYf0eP0g;
                    }
                });
                int i = onExtraCallback + 61;
                onNavigationEvent = i % 128;
                int i2 = i % 2;
            }
        }

        public final List<OverviewItemInfo> onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 55;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            List<OverviewItemInfo> list = this.items;
            int i5 = i2 + 27;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return list;
        }
    }
}
