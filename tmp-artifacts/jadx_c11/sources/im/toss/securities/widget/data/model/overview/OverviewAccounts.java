package im.toss.securities.widget.data.model.overview;

import im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel;
import im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$;
import im.toss.securities.widget.data.model.overview.OverviewAccounts;
import im.toss.securities.widget.data.model.overview.OverviewAccounts$;
import im.toss.securities.widget.data.model.overview.OverviewItemInfo;
import im.toss.securities.widget.data.model.overview.Product;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.clearRevision;
import o.getBgColor;
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.py;
import o.setVideoListener;
import o.sp;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class OverviewAccounts {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final List<Overview> overview;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.securities.widget.data.model.overview.OverviewAccounts$$ExternalSyntheticLambda5
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 11;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnNavigationEvent = OverviewAccounts.onNavigationEvent();
            int i4 = onNavigationEvent + 9;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnNavigationEvent;
        }
    })};

    /* JADX WARN: Illegal instructions before constructor call */
    public OverviewAccounts() {
        List list = null;
        this(list, 1, (DefaultConstructorMarker) list);
    }

    public static /* synthetic */ boolean IAuthTabCallback(OverviewItemInfo overviewItemInfo) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(overviewItemInfo);
        if (i3 == 0) {
            int i4 = 45 / 0;
        }
        return zOnExtraCallbackWithResult;
    }

    private static final /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(sp.IAuthTabCallback(OverviewAccounts$Overview$$serializer.INSTANCE));
        int i2 = onWarmupCompleted + 99;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(Product product) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = onExtraCallback(product);
        if (i3 == 0) {
            int i4 = 39 / 0;
        }
        int i5 = onWarmupCompleted + 93;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return zOnExtraCallback;
    }

    public static /* synthetic */ String onNavigationEvent(OverviewItemInfo overviewItemInfo) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String strOnWarmupCompleted = onWarmupCompleted(overviewItemInfo);
        int i4 = onExtraCallbackWithResult + 97;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return strOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallback = onExtraCallback();
        int i4 = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Iterable onWarmupCompleted(Overview overview) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {overview};
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        if (i3 != 0) {
            throw null;
        }
        Iterable iterable = (Iterable) onWarmupCompleted(iOnNavigationEvent, objArr, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), 241618425, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), -241618424, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent());
        int i4 = onExtraCallbackWithResult + 1;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iterable;
    }

    public static /* synthetic */ Iterable onWarmupCompleted(Product product) {
        Iterable iterable;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {product};
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent3 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent4 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        if (i3 != 0) {
            iterable = (Iterable) onWarmupCompleted(iOnNavigationEvent, objArr, iOnNavigationEvent2, -1468732649, iOnNavigationEvent3, 1468732651, iOnNavigationEvent4);
            int i4 = 5 / 0;
        } else {
            iterable = (Iterable) onWarmupCompleted(iOnNavigationEvent, objArr, iOnNavigationEvent2, -1468732649, iOnNavigationEvent3, 1468732651, iOnNavigationEvent4);
        }
        int i5 = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return iterable;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a7 A[PHI: r11
      0x00a7: PHI (r11v7 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r11v6 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r11v12 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:12:0x00a5, B:9:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ab A[PHI: r11
      0x00ab: PHI (r11v8 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r11v6 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r11v7 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r11v12 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:12:0x00a5, B:14:0x00a9, B:9:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        Lazy<KSerializer<Object>>[] lazyArr;
        int i7 = ~i3;
        int i8 = ~i5;
        int i9 = ~(i7 | i8);
        int i10 = ~(i3 | i5);
        int i11 = i9 | i10 | (~(i3 | i));
        int i12 = i8 | i3;
        int i13 = (~((~i) | i3)) | i10;
        int i14 = i3 + i5 + i2 + (111814883 * i4) + (1975835455 * i6);
        int i15 = i14 * i14;
        int i16 = (((-1960851331) * i3) - 1583611904) + (47848387 * i5) + (i11 * (-2101222338)) + ((-92522620) * i12) + ((-2101222338) * i13) + ((-2053373952) * i2) + ((-648806400) * i4) + (1432616960 * i6) + (442957824 * i15);
        int i17 = ((i3 * 961080817) - 60187382) + (i5 * 961079119) + (i11 * 566) + (i12 * (-1132)) + (i13 * 566) + (i2 * 961079685) + (i4 * 1618335983) + (i6 * 193609403) + (i15 * 1988296704);
        int i18 = i16 + (i17 * i17 * 176226304);
        if (i18 == 1) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i18 == 2) {
            return IAuthTabCallback(objArr);
        }
        OverviewAccounts overviewAccounts = (OverviewAccounts) objArr[0];
        vyl vylVar = (vyl) objArr[1];
        SerialDescriptor serialDescriptor = (SerialDescriptor) objArr[2];
        int i19 = 2 % 2;
        int i20 = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i20 % 128;
        if (i20 % 2 != 0) {
            lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                if (overviewAccounts.overview != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 0, (py) lazyArr[0].getValue(), overviewAccounts.overview);
                    int i21 = onExtraCallbackWithResult + 107;
                    onWarmupCompleted = i21 % 128;
                    int i22 = i21 % 2;
                }
            }
        } else {
            lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            }
        }
        return null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this != obj) {
            return (obj instanceof OverviewAccounts) && Intrinsics.areEqual(this.overview, ((OverviewAccounts) obj).overview);
        }
        int i4 = i3 + 55;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        List<Overview> list = this.overview;
        if (list == null) {
            int i5 = i3 + 49;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }
        int iHashCode = list.hashCode();
        int i7 = onExtraCallbackWithResult + 21;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OverviewAccounts(overview=" + this.overview + ")";
        int i2 = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OverviewAccounts> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 117;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            OverviewAccounts$.serializer serializerVar = OverviewAccounts$.serializer.INSTANCE;
            int i4 = onWarmupCompleted + 113;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 23 / 0;
            }
            return serializerVar;
        }
    }

    static {
        int i = onExtraCallback + 111;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ OverviewAccounts(int i, List list, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.overview = null;
            int i2 = onWarmupCompleted + 23;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        this.overview = list;
        int i4 = onExtraCallbackWithResult + 21;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public OverviewAccounts(@Nullable List<Overview> list) {
        this.overview = list;
    }

    public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i4 = i3 + 59;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return lazyArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OverviewAccounts(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 7;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            int i3 = 2 % 2;
            list = null;
        }
        this(list);
    }

    @liq
    public static final class Overview {
        private static final Lazy<KSerializer<Object>>[] $childSerializers;
        public static final Companion Companion = new Companion(null);
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        private final String accountSeq;
        private final OverviewPrice evaluatedAmount;
        private final OverviewPrice evaluatedAmountAfterFees;
        private final boolean hasKrStock;
        private final HiddenStock hiddenStock;
        private final Integer itemsCount;
        private final List<String> logoImageUrls;
        private final Integer pollIntervalMillis;
        private final OverviewPrice principalAmount;
        private final List<Product> products;
        private final OverviewPrice profitLossAmount;
        private final OverviewPrice profitLossAmountAfterFees;
        private final OverviewPrice profitLossRate;
        private final OverviewRate profitLossRateAfterFees;
        private final String sortingRule;
        private final OverviewPrice totalCommission;
        private final OverviewPrice totalTax;

        public Overview() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
        }

        public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
            int i7 = ~i3;
            int i8 = ~i5;
            int i9 = (~(i7 | i8)) | (~(i7 | i2)) | (~(i8 | i2));
            int i10 = ~i2;
            int i11 = (~(i10 | i3)) | (~(i8 | i3));
            int i12 = ~(i8 | i7 | i10);
            int i13 = i2 + i3 + i + ((-2109949842) * i4) + (2078889904 * i6);
            int i14 = i13 * i13;
            int i15 = ((-1963971821) * i2) + 932184064 + (61854959 * i3) + (1134570258 * i9) + (i11 * (-1134570258)) + ((-1134570258) * i12) + (1196425216 * i) + (610271232 * i4) + (922746880 * i6) + (671350784 * i14);
            int i16 = (i2 * (-573803825)) + 196542130 + (i3 * (-573802789)) + (i9 * (-518)) + (i11 * 518) + (i12 * 518) + (i * (-573803307)) + (i4 * (-843101306)) + (i6 * (-1524517520)) + (i14 * 458489856);
            int i17 = i15 + (i16 * i16 * 64749568);
            return i17 != 1 ? i17 != 2 ? i17 != 3 ? IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr) : onExtraCallback(objArr) : onWarmupCompleted(objArr);
        }

        private static final /* synthetic */ KSerializer extraCallback() {
            int i = 2 % 2;
            checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(Product$$serializer.INSTANCE);
            int i2 = onWarmupCompleted + 73;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return checkcanopenlandingpage;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 59;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            KSerializer typedObject = readTypedObject();
            int i4 = IAuthTabCallback + 17;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return typedObject;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 33;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return extraCallback();
            }
            extraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final /* synthetic */ KSerializer readTypedObject() {
            int i = 2 % 2;
            checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
            int i2 = onWarmupCompleted + 27;
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
                int i2 = IAuthTabCallback + 1;
                onWarmupCompleted = i2 % 128;
                return i2 % 2 == 0;
            }
            Overview overview = (Overview) obj;
            if (!Intrinsics.areEqual(this.accountSeq, overview.accountSeq)) {
                int i3 = onWarmupCompleted + 65;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.evaluatedAmount, overview.evaluatedAmount)) {
                int i5 = IAuthTabCallback + 117;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.profitLossAmount, overview.profitLossAmount)) {
                int i7 = onWarmupCompleted + 119;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.profitLossRate, overview.profitLossRate) || !Intrinsics.areEqual(this.principalAmount, overview.principalAmount)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.logoImageUrls, overview.logoImageUrls)) {
                int i9 = IAuthTabCallback + 11;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.itemsCount, overview.itemsCount) || !Intrinsics.areEqual(this.totalCommission, overview.totalCommission)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.totalTax, overview.totalTax)) {
                int i11 = onWarmupCompleted + 81;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.products, overview.products) || !Intrinsics.areEqual(this.hiddenStock, overview.hiddenStock)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.pollIntervalMillis, overview.pollIntervalMillis)) {
                int i13 = IAuthTabCallback + 25;
                onWarmupCompleted = i13 % 128;
                int i14 = i13 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.sortingRule, overview.sortingRule) || (!Intrinsics.areEqual(this.evaluatedAmountAfterFees, overview.evaluatedAmountAfterFees)) || !Intrinsics.areEqual(this.profitLossAmountAfterFees, overview.profitLossAmountAfterFees)) {
                return false;
            }
            if (Intrinsics.areEqual(this.profitLossRateAfterFees, overview.profitLossRateAfterFees)) {
                return true;
            }
            int i15 = IAuthTabCallback + 105;
            onWarmupCompleted = i15 % 128;
            int i16 = i15 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            int iHashCode3;
            int i;
            int iHashCode4;
            int i2;
            int iHashCode5;
            int i3 = 2 % 2;
            int i4 = IAuthTabCallback + 111;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            String str = this.accountSeq;
            int iHashCode6 = str == null ? 0 : str.hashCode();
            OverviewPrice overviewPrice = this.evaluatedAmount;
            int iHashCode7 = overviewPrice == null ? 0 : overviewPrice.hashCode();
            OverviewPrice overviewPrice2 = this.profitLossAmount;
            if (overviewPrice2 == null) {
                iHashCode = 0;
            } else {
                iHashCode = overviewPrice2.hashCode();
                int i6 = onWarmupCompleted + 81;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
            }
            OverviewPrice overviewPrice3 = this.profitLossRate;
            int iHashCode8 = overviewPrice3 == null ? 0 : overviewPrice3.hashCode();
            OverviewPrice overviewPrice4 = this.principalAmount;
            int iHashCode9 = overviewPrice4 == null ? 0 : overviewPrice4.hashCode();
            List<String> list = this.logoImageUrls;
            if (list == null) {
                iHashCode2 = 0;
            } else {
                iHashCode2 = list.hashCode();
                int i8 = IAuthTabCallback + 17;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
            }
            Integer num = this.itemsCount;
            int iHashCode10 = num == null ? 0 : num.hashCode();
            OverviewPrice overviewPrice5 = this.totalCommission;
            int iHashCode11 = overviewPrice5 == null ? 0 : overviewPrice5.hashCode();
            OverviewPrice overviewPrice6 = this.totalTax;
            int iHashCode12 = overviewPrice6 == null ? 0 : overviewPrice6.hashCode();
            List<Product> list2 = this.products;
            if (list2 == null) {
                int i10 = IAuthTabCallback + 117;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
                iHashCode3 = 0;
            } else {
                iHashCode3 = list2.hashCode();
            }
            HiddenStock hiddenStock = this.hiddenStock;
            int iHashCode13 = hiddenStock == null ? 0 : hiddenStock.hashCode();
            Integer num2 = this.pollIntervalMillis;
            int iHashCode14 = num2 == null ? 0 : num2.hashCode();
            String str2 = this.sortingRule;
            int iHashCode15 = str2 == null ? 0 : str2.hashCode();
            OverviewPrice overviewPrice7 = this.evaluatedAmountAfterFees;
            if (overviewPrice7 == null) {
                int i12 = IAuthTabCallback + 101;
                i = iHashCode15;
                onWarmupCompleted = i12 % 128;
                int i13 = i12 % 2;
                iHashCode4 = 0;
            } else {
                i = iHashCode15;
                iHashCode4 = overviewPrice7.hashCode();
            }
            OverviewPrice overviewPrice8 = this.profitLossAmountAfterFees;
            int iHashCode16 = overviewPrice8 == null ? 0 : overviewPrice8.hashCode();
            OverviewRate overviewRate = this.profitLossRateAfterFees;
            if (overviewRate != null) {
                int i14 = onWarmupCompleted + 47;
                i2 = iHashCode16;
                IAuthTabCallback = i14 % 128;
                int i15 = i14 % 2;
                iHashCode5 = overviewRate.hashCode();
            } else {
                i2 = iHashCode16;
                iHashCode5 = 0;
            }
            return (((((((((((((((((((((((((((((iHashCode6 * 31) + iHashCode7) * 31) + iHashCode) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode2) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode3) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + i) * 31) + iHashCode4) * 31) + i2) * 31) + iHashCode5;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Overview(accountSeq=" + this.accountSeq + ", evaluatedAmount=" + this.evaluatedAmount + ", profitLossAmount=" + this.profitLossAmount + ", profitLossRate=" + this.profitLossRate + ", principalAmount=" + this.principalAmount + ", logoImageUrls=" + this.logoImageUrls + ", itemsCount=" + this.itemsCount + ", totalCommission=" + this.totalCommission + ", totalTax=" + this.totalTax + ", products=" + this.products + ", hiddenStock=" + this.hiddenStock + ", pollIntervalMillis=" + this.pollIntervalMillis + ", sortingRule=" + this.sortingRule + ", evaluatedAmountAfterFees=" + this.evaluatedAmountAfterFees + ", profitLossAmountAfterFees=" + this.profitLossAmountAfterFees + ", profitLossRateAfterFees=" + this.profitLossRateAfterFees + ")";
            int i2 = IAuthTabCallback + 55;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Overview> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 103;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                OverviewAccounts$Overview$$serializer overviewAccounts$Overview$$serializer = OverviewAccounts$Overview$$serializer.INSTANCE;
                int i4 = onExtraCallbackWithResult + 19;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return overviewAccounts$Overview$$serializer;
            }
        }

        static {
            TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
            $childSerializers = new Lazy[]{null, null, null, null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.securities.widget.data.model.overview.OverviewAccounts$Overview$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 47;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
                    KSerializer kSerializer = (KSerializer) OverviewAccounts.Overview.IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[0], -120009990, 120009993, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
                    int i4 = onExtraCallback + 31;
                    IAuthTabCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        return kSerializer;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }), null, null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.securities.widget.data.model.overview.OverviewAccounts$Overview$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke() {
                    KSerializer kSerializer;
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 45;
                    IAuthTabCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
                        kSerializer = (KSerializer) OverviewAccounts.Overview.IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[0], -1157301028, 1157301029, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
                        int i3 = 34 / 0;
                    } else {
                        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
                        kSerializer = (KSerializer) OverviewAccounts.Overview.IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[0], -1157301028, 1157301029, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted2, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
                    }
                    int i4 = onWarmupCompleted + 103;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return kSerializer;
                }
            }), null, null, null, null, null, null, null};
            int i = onExtraCallbackWithResult + 95;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        public /* synthetic */ Overview(int i, String str, OverviewPrice overviewPrice, OverviewPrice overviewPrice2, OverviewPrice overviewPrice3, OverviewPrice overviewPrice4, List list, Integer num, OverviewPrice overviewPrice5, OverviewPrice overviewPrice6, List list2, HiddenStock hiddenStock, Integer num2, String str2, OverviewPrice overviewPrice7, OverviewPrice overviewPrice8, OverviewRate overviewRate, boolean z, okycx okycxVar) {
            List<OverviewItemInfo> listOnExtraCallbackWithResult;
            Object obj = null;
            if ((i & 1) == 0) {
                this.accountSeq = null;
            } else {
                this.accountSeq = str;
            }
            if ((i & 2) == 0) {
                this.evaluatedAmount = null;
            } else {
                this.evaluatedAmount = overviewPrice;
            }
            if ((i & 4) == 0) {
                this.profitLossAmount = null;
                int i2 = 2 % 2;
            } else {
                this.profitLossAmount = overviewPrice2;
            }
            if ((i & 8) == 0) {
                this.profitLossRate = null;
            } else {
                this.profitLossRate = overviewPrice3;
            }
            if ((i & 16) == 0) {
                this.principalAmount = null;
            } else {
                this.principalAmount = overviewPrice4;
            }
            if ((i & 32) == 0) {
                this.logoImageUrls = null;
                int i3 = 2 % 2;
            } else {
                this.logoImageUrls = list;
            }
            if ((i & 64) == 0) {
                this.itemsCount = null;
            } else {
                this.itemsCount = num;
            }
            if ((i & 128) == 0) {
                int i4 = IAuthTabCallback + 125;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                this.totalCommission = null;
            } else {
                this.totalCommission = overviewPrice5;
                int i6 = 2 % 2;
            }
            if ((i & 256) == 0) {
                int i7 = IAuthTabCallback + 19;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                this.totalTax = null;
                if (i8 == 0) {
                    obj.hashCode();
                    throw null;
                }
            } else {
                this.totalTax = overviewPrice6;
            }
            if ((i & 512) == 0) {
                int i9 = onWarmupCompleted + 91;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                this.products = null;
            } else {
                this.products = list2;
                int i11 = IAuthTabCallback + 73;
                onWarmupCompleted = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 2 % 2;
                }
            }
            if ((i & 1024) == 0) {
                int i13 = IAuthTabCallback + 43;
                onWarmupCompleted = i13 % 128;
                int i14 = i13 % 2;
                this.hiddenStock = null;
            } else {
                this.hiddenStock = hiddenStock;
            }
            boolean z2 = false;
            if ((i & 2048) == 0) {
                int i15 = onWarmupCompleted + 67;
                IAuthTabCallback = i15 % 128;
                int i16 = i15 % 2;
                this.pollIntervalMillis = null;
                if (i16 != 0) {
                    int i17 = 34 / 0;
                }
            } else {
                this.pollIntervalMillis = num2;
            }
            if ((i & 4096) == 0) {
                this.sortingRule = null;
            } else {
                this.sortingRule = str2;
            }
            if ((i & 8192) == 0) {
                this.evaluatedAmountAfterFees = null;
            } else {
                this.evaluatedAmountAfterFees = overviewPrice7;
            }
            if ((i & 16384) == 0) {
                this.profitLossAmountAfterFees = null;
            } else {
                this.profitLossAmountAfterFees = overviewPrice8;
            }
            if ((32768 & i) == 0) {
                this.profitLossRateAfterFees = null;
            } else {
                this.profitLossRateAfterFees = overviewRate;
            }
            if ((i & 65536) != 0) {
                this.hasKrStock = z;
                return;
            }
            List<Product> list3 = this.products;
            if (list3 != null) {
                Iterator<T> it = list3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((Product) next).IAuthTabCallback() == Product.onExtraCallback.KR_STOCK) {
                        obj = next;
                        break;
                    }
                }
                Product product = (Product) obj;
                if (product != null && (listOnExtraCallbackWithResult = product.onExtraCallbackWithResult()) != null) {
                    int i18 = onWarmupCompleted + 11;
                    IAuthTabCallback = i18 % 128;
                    int i19 = i18 % 2;
                    if (!listOnExtraCallbackWithResult.isEmpty()) {
                        z2 = true;
                    }
                }
            }
            this.hasKrStock = z2;
        }

        public Overview(@Nullable String str, @Nullable OverviewPrice overviewPrice, @Nullable OverviewPrice overviewPrice2, @Nullable OverviewPrice overviewPrice3, @Nullable OverviewPrice overviewPrice4, @Nullable List<String> list, @Nullable Integer num, @Nullable OverviewPrice overviewPrice5, @Nullable OverviewPrice overviewPrice6, @Nullable List<Product> list2, @Nullable HiddenStock hiddenStock, @Nullable Integer num2, @Nullable String str2, @Nullable OverviewPrice overviewPrice7, @Nullable OverviewPrice overviewPrice8, @Nullable OverviewRate overviewRate) {
            Object obj;
            List<OverviewItemInfo> listOnExtraCallbackWithResult;
            this.accountSeq = str;
            this.evaluatedAmount = overviewPrice;
            this.profitLossAmount = overviewPrice2;
            this.profitLossRate = overviewPrice3;
            this.principalAmount = overviewPrice4;
            this.logoImageUrls = list;
            this.itemsCount = num;
            this.totalCommission = overviewPrice5;
            this.totalTax = overviewPrice6;
            this.products = list2;
            this.hiddenStock = hiddenStock;
            this.pollIntervalMillis = num2;
            this.sortingRule = str2;
            this.evaluatedAmountAfterFees = overviewPrice7;
            this.profitLossAmountAfterFees = overviewPrice8;
            this.profitLossRateAfterFees = overviewRate;
            boolean z = false;
            if (list2 != null) {
                Iterator<T> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        int i = onWarmupCompleted + 117;
                        IAuthTabCallback = i % 128;
                        int i2 = i % 2;
                        int i3 = 2 % 2;
                        obj = null;
                        break;
                    }
                    Object next = it.next();
                    if (((Product) next).IAuthTabCallback() == Product.onExtraCallback.KR_STOCK) {
                        int i4 = 2 % 2;
                        obj = next;
                        break;
                    }
                }
                Product product = (Product) obj;
                if (product != null && (listOnExtraCallbackWithResult = product.onExtraCallbackWithResult()) != null && (!listOnExtraCallbackWithResult.isEmpty())) {
                    z = true;
                }
            }
            this.hasKrStock = z;
            int i5 = onWarmupCompleted + 95;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }

        public static final /* synthetic */ Lazy[] onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 59;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (i3 == 0) {
                int i4 = 46 / 0;
            }
            return lazyArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0149  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0165  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onExtraCallbackWithResult(Overview overview, vyl vylVar, SerialDescriptor serialDescriptor) {
            Iterator it;
            List<OverviewItemInfo> listOnExtraCallbackWithResult;
            int i = 2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            boolean z = false;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                int i2 = onWarmupCompleted + 97;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                if (overview.accountSeq != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, overview.accountSeq);
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 1) || overview.evaluatedAmount != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 1, OverviewPrice$$serializer.INSTANCE, overview.evaluatedAmount);
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
                int i4 = IAuthTabCallback + 113;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                if (overview.profitLossAmount != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 2, OverviewPrice$$serializer.INSTANCE, overview.profitLossAmount);
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 3) || overview.profitLossRate != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 3, OverviewPrice$$serializer.INSTANCE, overview.profitLossRate);
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 4) || overview.principalAmount != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 4, OverviewPrice$$serializer.INSTANCE, overview.principalAmount);
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 5)) {
                int i6 = onWarmupCompleted + 63;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                if (overview.logoImageUrls != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 5, (py) lazyArr[5].getValue(), overview.logoImageUrls);
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 6) || overview.itemsCount != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 6, getDynamicHeight.onWarmupCompleted, overview.itemsCount);
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 7) || overview.totalCommission != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 7, OverviewPrice$$serializer.INSTANCE, overview.totalCommission);
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 8) || overview.totalTax != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 8, OverviewPrice$$serializer.INSTANCE, overview.totalTax);
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 9) || overview.products != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 9, (py) lazyArr[9].getValue(), overview.products);
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 10) || overview.hiddenStock != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 10, OverviewAccounts$Overview$HiddenStock$$serializer.INSTANCE, overview.hiddenStock);
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 11) || overview.pollIntervalMillis != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 11, getDynamicHeight.onWarmupCompleted, overview.pollIntervalMillis);
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 12) || overview.sortingRule != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 12, getWriggleLayout.onNavigationEvent, overview.sortingRule);
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 13) || overview.evaluatedAmountAfterFees != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 13, OverviewPrice$$serializer.INSTANCE, overview.evaluatedAmountAfterFees);
            }
            Object obj = null;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 14)) {
                int i8 = onWarmupCompleted + 77;
                IAuthTabCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    OverviewPrice overviewPrice = overview.profitLossAmountAfterFees;
                    throw null;
                }
                if (overview.profitLossAmountAfterFees != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 14, OverviewPrice$$serializer.INSTANCE, overview.profitLossAmountAfterFees);
                }
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 15)) {
                int i9 = IAuthTabCallback + 61;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                if (overview.profitLossRateAfterFees != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 15, OverviewRate$$serializer.INSTANCE, overview.profitLossRateAfterFees);
                }
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 16)) {
                boolean z2 = overview.hasKrStock;
                List<Product> list = overview.products;
                if (list != null) {
                    int i11 = IAuthTabCallback + 33;
                    onWarmupCompleted = i11 % 128;
                    if (i11 % 2 == 0) {
                        it = list.iterator();
                        int i12 = 46 / 0;
                    } else {
                        it = list.iterator();
                    }
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (((Product) next).IAuthTabCallback() == Product.onExtraCallback.KR_STOCK) {
                            obj = next;
                            break;
                        }
                    }
                    Product product = (Product) obj;
                    if (product != null && (listOnExtraCallbackWithResult = product.onExtraCallbackWithResult()) != null) {
                        int i13 = IAuthTabCallback + 119;
                        onWarmupCompleted = i13 % 128;
                        if (i13 % 2 == 0) {
                            boolean z3 = !listOnExtraCallbackWithResult.isEmpty();
                        } else if (!listOnExtraCallbackWithResult.isEmpty()) {
                        }
                        z = true;
                    }
                }
                if (z2 == z) {
                    return;
                }
            }
            vylVar.onNavigationEvent(serialDescriptor, 16, overview.hasKrStock);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Overview(String str, OverviewPrice overviewPrice, OverviewPrice overviewPrice2, OverviewPrice overviewPrice3, OverviewPrice overviewPrice4, List list, Integer num, OverviewPrice overviewPrice5, OverviewPrice overviewPrice6, List list2, HiddenStock hiddenStock, Integer num2, String str2, OverviewPrice overviewPrice7, OverviewPrice overviewPrice8, OverviewRate overviewRate, int i, DefaultConstructorMarker defaultConstructorMarker) {
            String str3;
            OverviewPrice overviewPrice9;
            OverviewPrice overviewPrice10;
            OverviewPrice overviewPrice11;
            OverviewPrice overviewPrice12;
            List list3;
            Integer num3;
            String str4;
            OverviewPrice overviewPrice13;
            OverviewPrice overviewPrice14;
            OverviewRate overviewRate2;
            if ((i & 1) != 0) {
                int i2 = onWarmupCompleted + 117;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                str3 = null;
            } else {
                str3 = str;
            }
            if ((i & 2) != 0) {
                int i4 = 2 % 2;
                overviewPrice9 = null;
            } else {
                overviewPrice9 = overviewPrice;
            }
            if ((i & 4) != 0) {
                int i5 = IAuthTabCallback + 59;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 88 / 0;
                }
                overviewPrice10 = null;
            } else {
                overviewPrice10 = overviewPrice2;
            }
            if ((i & 8) != 0) {
                int i7 = 2 % 2;
                overviewPrice11 = null;
            } else {
                overviewPrice11 = overviewPrice3;
            }
            OverviewPrice overviewPrice15 = (i & 16) != 0 ? null : overviewPrice4;
            List list4 = (i & 32) != 0 ? null : list;
            Integer num4 = (i & 64) != 0 ? null : num;
            OverviewPrice overviewPrice16 = (i & 128) != 0 ? null : overviewPrice5;
            if ((i & 256) != 0) {
                int i8 = onWarmupCompleted + 29;
                IAuthTabCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    throw null;
                }
                overviewPrice12 = null;
            } else {
                overviewPrice12 = overviewPrice6;
            }
            if ((i & 512) != 0) {
                int i9 = IAuthTabCallback + 7;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                int i11 = 2 % 2;
                list3 = null;
            } else {
                list3 = list2;
            }
            HiddenStock hiddenStock2 = (i & 1024) != 0 ? null : hiddenStock;
            if ((i & 2048) != 0) {
                int i12 = IAuthTabCallback + 49;
                onWarmupCompleted = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 4 % 2;
                } else {
                    int i14 = 2 % 2;
                }
                num3 = null;
            } else {
                num3 = num2;
            }
            if ((i & 4096) != 0) {
                int i15 = IAuthTabCallback + 111;
                onWarmupCompleted = i15 % 128;
                int i16 = i15 % 2;
                str4 = null;
            } else {
                str4 = str2;
            }
            OverviewPrice overviewPrice17 = (i & 8192) != 0 ? null : overviewPrice7;
            if ((i & 16384) != 0) {
                int i17 = onWarmupCompleted + 31;
                overviewPrice13 = overviewPrice17;
                IAuthTabCallback = i17 % 128;
                int i18 = i17 % 2;
                overviewPrice14 = null;
            } else {
                overviewPrice13 = overviewPrice17;
                overviewPrice14 = overviewPrice8;
            }
            if ((i & 32768) != 0) {
                int i19 = IAuthTabCallback + 21;
                onWarmupCompleted = i19 % 128;
                if (i19 % 2 != 0) {
                    int i20 = 2 % 2;
                }
                overviewRate2 = null;
            } else {
                overviewRate2 = overviewRate;
            }
            this(str3, overviewPrice9, overviewPrice10, overviewPrice11, overviewPrice15, list4, num4, overviewPrice16, overviewPrice12, list3, hiddenStock2, num3, str4, overviewPrice13, overviewPrice14, overviewRate2);
        }

        public final OverviewPrice IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 99;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            OverviewPrice overviewPrice = this.evaluatedAmount;
            int i5 = i3 + 115;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return overviewPrice;
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
            Overview overview = (Overview) objArr[0];
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 119;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            OverviewPrice overviewPrice = overview.profitLossAmount;
            if (i4 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 113;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return overviewPrice;
        }

        public final OverviewPrice access000() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 85;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            OverviewPrice overviewPrice = this.profitLossRate;
            int i5 = i2 + 61;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 99 / 0;
            }
            return overviewPrice;
        }

        public final List<String> asBinder() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 25;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.logoImageUrls;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Integer IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 7;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            Integer num = this.itemsCount;
            int i5 = i3 + 35;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return num;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final OverviewPrice writeTypedObject() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 103;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return this.totalCommission;
            }
            throw null;
        }

        public final OverviewPrice extraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 93;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            OverviewPrice overviewPrice = this.totalTax;
            int i4 = i3 + 85;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return overviewPrice;
        }

        public final List<Product> IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 87;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            List<Product> list = this.products;
            if (i3 == 0) {
                int i4 = 18 / 0;
            }
            return list;
        }

        private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
            Overview overview = (Overview) objArr[0];
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 65;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            HiddenStock hiddenStock = overview.hiddenStock;
            if (i4 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i2 + 13;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return hiddenStock;
        }

        public final String access100() {
            String str;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 111;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 != 0) {
                str = this.sortingRule;
                int i4 = 44 / 0;
            } else {
                str = this.sortingRule;
            }
            int i5 = i3 + 75;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final OverviewPrice onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 15;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            OverviewPrice overviewPrice = this.evaluatedAmountAfterFees;
            int i4 = i2 + 85;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return overviewPrice;
        }

        public final OverviewPrice IAuthTabCallback_Parcel() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 95;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            OverviewPrice overviewPrice = this.profitLossAmountAfterFees;
            int i5 = i3 + 121;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return overviewPrice;
        }

        public final OverviewRate IAuthTabCallbackStubProxy() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 109;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            OverviewRate overviewRate = this.profitLossRateAfterFees;
            int i5 = i2 + 59;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 83 / 0;
            }
            return overviewRate;
        }

        @liq
        public static final class HiddenStock {
            public static final Companion Companion = new Companion(null);
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;
            private static int onNavigationEvent;
            private final Boolean all;
            private final Double amount;
            private final Integer count;

            static {
                int i = onExtraCallbackWithResult + 119;
                onExtraCallback = i % 128;
                int i2 = i % 2;
            }

            public HiddenStock() {
                this((Boolean) null, (Integer) null, (Double) null, 7, (DefaultConstructorMarker) null);
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 39;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof HiddenStock)) {
                    int i5 = i2 + 39;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    return false;
                }
                HiddenStock hiddenStock = (HiddenStock) obj;
                if (!Intrinsics.areEqual(this.all, hiddenStock.all)) {
                    return false;
                }
                if (!Intrinsics.areEqual(this.count, hiddenStock.count)) {
                    int i7 = onNavigationEvent + 17;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.amount, hiddenStock.amount)) {
                    return false;
                }
                int i9 = onNavigationEvent + 111;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                return true;
            }

            public int hashCode() {
                int iHashCode;
                int iHashCode2;
                int i = 2 % 2;
                Boolean bool = this.all;
                int iHashCode3 = 0;
                if (bool == null) {
                    iHashCode = 0;
                } else {
                    iHashCode = bool.hashCode();
                    int i2 = onNavigationEvent + 65;
                    IAuthTabCallback = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i3 = 3 / 3;
                    }
                }
                Integer num = this.count;
                if (num == null) {
                    int i4 = IAuthTabCallback + 101;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    iHashCode2 = 0;
                } else {
                    iHashCode2 = num.hashCode();
                }
                Double d = this.amount;
                if (d != null) {
                    int i6 = onNavigationEvent + 123;
                    IAuthTabCallback = i6 % 128;
                    if (i6 % 2 == 0) {
                        d.hashCode();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    iHashCode3 = d.hashCode();
                }
                return (((iHashCode * 31) + iHashCode2) * 31) + iHashCode3;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "HiddenStock(all=" + this.all + ", count=" + this.count + ", amount=" + this.amount + ")";
                int i2 = IAuthTabCallback + 63;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            public static final class Companion {
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<HiddenStock> serializer() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 35;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    OverviewAccounts$Overview$HiddenStock$$serializer overviewAccounts$Overview$HiddenStock$$serializer = OverviewAccounts$Overview$HiddenStock$$serializer.INSTANCE;
                    int i4 = onNavigationEvent + 125;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 6 / 0;
                    }
                    return overviewAccounts$Overview$HiddenStock$$serializer;
                }
            }

            public /* synthetic */ HiddenStock(int i, Boolean bool, Integer num, Double d, okycx okycxVar) {
                if ((i & 1) == 0) {
                    this.all = null;
                    int i2 = IAuthTabCallback + 1;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i3 = 2 % 2;
                    }
                } else {
                    this.all = bool;
                }
                if ((i & 2) == 0) {
                    int i4 = onNavigationEvent + 111;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    this.count = null;
                } else {
                    this.count = num;
                }
                int i6 = 2 % 2;
                if ((i & 4) != 0) {
                    this.amount = d;
                    return;
                }
                int i7 = onNavigationEvent + 33;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                this.amount = null;
            }

            public HiddenStock(@Nullable Boolean bool, @Nullable Integer num, @Nullable Double d) {
                this.all = bool;
                this.count = num;
                this.amount = d;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
            @JvmStatic
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static final /* synthetic */ void onExtraCallback(HiddenStock hiddenStock, vyl vylVar, SerialDescriptor serialDescriptor) {
                int i = 2 % 2;
                if (vylVar.onWarmupCompleted(serialDescriptor, 0) || hiddenStock.all != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getBgColor.IAuthTabCallback, hiddenStock.all);
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                    int i2 = onNavigationEvent + 17;
                    IAuthTabCallback = i2 % 128;
                    if (i2 % 2 == 0) {
                        Integer num = hiddenStock.count;
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (hiddenStock.count != null) {
                        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getDynamicHeight.onWarmupCompleted, hiddenStock.count);
                        int i3 = IAuthTabCallback + 27;
                        onNavigationEvent = i3 % 128;
                        int i4 = i3 % 2;
                    }
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
                    int i5 = onNavigationEvent + 9;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    if (hiddenStock.amount == null) {
                        return;
                    }
                }
                vylVar.onExtraCallbackWithResult(serialDescriptor, 2, setVideoListener.onWarmupCompleted, hiddenStock.amount);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ HiddenStock(Boolean bool, Integer num, Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i & 1) != 0) {
                    int i2 = IAuthTabCallback + 67;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    int i4 = 2 % 2;
                    bool = null;
                }
                if ((i & 2) != 0) {
                    int i5 = onNavigationEvent + 17;
                    int i6 = i5 % 128;
                    IAuthTabCallback = i6;
                    if (i5 % 2 == 0) {
                        throw null;
                    }
                    int i7 = i6 + 111;
                    onNavigationEvent = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 2 % 2;
                    }
                    num = null;
                }
                if ((i & 4) != 0) {
                    int i9 = IAuthTabCallback + 119;
                    onNavigationEvent = i9 % 128;
                    if (i9 % 2 != 0) {
                        int i10 = 38 / 0;
                    }
                    d = null;
                }
                this(bool, num, d);
            }

            public final Boolean onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 105;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Boolean bool = this.all;
                int i5 = i2 + 37;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    return bool;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public final boolean asInterface() {
            boolean z;
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 1;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                z = this.hasKrStock;
                int i4 = 41 / 0;
            } else {
                z = this.hasKrStock;
            }
            int i5 = i2 + 119;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        public static /* synthetic */ KSerializer onNavigationEvent() {
            int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            return (KSerializer) IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[0], -120009990, 120009993, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
        }

        public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
            int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            return (KSerializer) IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[0], -1157301028, 1157301029, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
        }

        public final HiddenStock onTransact() {
            int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            return (HiddenStock) IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{this}, 1886462183, -1886462183, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
        }

        public final OverviewPrice getInterfaceDescriptor() {
            int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            return (OverviewPrice) IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{this}, 1644305741, -1644305739, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
        }
    }

    public final List<Overview> onWarmupCompleted() {
        List<Overview> list;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 41;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            list = this.overview;
            int i4 = 46 / 0;
        } else {
            list = this.overview;
        }
        int i5 = i2 + 17;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Overview overview = (Overview) objArr[0];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(overview, "");
        List<Product> listIAuthTabCallbackDefault = overview.IAuthTabCallbackDefault();
        if (listIAuthTabCallbackDefault == null) {
            int i2 = onExtraCallbackWithResult + 13;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            listIAuthTabCallbackDefault = CollectionsKt.emptyList();
            int i4 = onExtraCallbackWithResult + 37;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
        List<Product> list = listIAuthTabCallbackDefault;
        int i6 = onWarmupCompleted + 55;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final boolean onExtraCallback(Product product) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(product, "");
            int i3 = 16 / 0;
            if (product.IAuthTabCallback() != Product.onExtraCallback.US_BOND) {
                return true;
            }
        } else {
            Intrinsics.checkNotNullParameter(product, "");
            if (product.IAuthTabCallback() != Product.onExtraCallback.US_BOND) {
                return true;
            }
        }
        int i4 = onWarmupCompleted + 13;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        List<OverviewItemInfo> listOnExtraCallbackWithResult;
        Product product = (Product) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(product, "");
            listOnExtraCallbackWithResult = product.onExtraCallbackWithResult();
            int i3 = 60 / 0;
        } else {
            Intrinsics.checkNotNullParameter(product, "");
            listOnExtraCallbackWithResult = product.onExtraCallbackWithResult();
        }
        int i4 = onWarmupCompleted + 81;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return listOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final boolean onExtraCallbackWithResult(OverviewItemInfo overviewItemInfo) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(overviewItemInfo, "");
        if (overviewItemInfo.IAuthTabCallbackDefault()) {
            return false;
        }
        int i2 = onExtraCallbackWithResult + 17;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        OverviewItemInfo.Stock stock = null;
        if (i2 % 2 != 0) {
            boolean z = overviewItemInfo instanceof OverviewItemInfo.Stock;
            throw null;
        }
        if (overviewItemInfo instanceof OverviewItemInfo.Stock) {
            int i4 = i3 + 69;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            stock = (OverviewItemInfo.Stock) overviewItemInfo;
            int i6 = i3 + 119;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        }
        if (stock != null) {
            int i8 = i3 + 103;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            if (stock.ICustomTabsService()) {
                return false;
            }
        }
        return true;
    }

    private static final String onWarmupCompleted(OverviewItemInfo overviewItemInfo) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(overviewItemInfo, "");
        String strAccess100 = overviewItemInfo.access100();
        int i4 = onExtraCallbackWithResult + 51;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return strAccess100;
    }

    public final List<OverviewItemInfo> IAuthTabCallback() {
        Sequence sequenceOnTransact;
        Sequence sequenceIAuthTabCallbackDefault;
        Sequence sequenceOnWarmupCompleted;
        Sequence sequenceIAuthTabCallbackDefault2;
        Sequence sequenceOnWarmupCompleted2;
        Sequence sequenceIAuthTabCallback;
        List<OverviewItemInfo> listAccess000;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 83;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        List<Overview> list = this.overview;
        if (list != null) {
            int i5 = i2 + 87;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            Sequence sequenceAsSequence = CollectionsKt.asSequence(list);
            if (sequenceAsSequence != null && (sequenceOnTransact = clearRevision.onTransact(sequenceAsSequence)) != null && (sequenceIAuthTabCallbackDefault = clearRevision.IAuthTabCallbackDefault(sequenceOnTransact, new Function1() { // from class: im.toss.securities.widget.data.model.overview.OverviewAccounts$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj) {
                    int i7 = 2 % 2;
                    int i8 = onExtraCallbackWithResult + 119;
                    IAuthTabCallback = i8 % 128;
                    OverviewAccounts.Overview overview = (OverviewAccounts.Overview) obj;
                    if (i8 % 2 != 0) {
                        return OverviewAccounts.onWarmupCompleted(overview);
                    }
                    OverviewAccounts.onWarmupCompleted(overview);
                    throw null;
                }
            })) != null && (sequenceOnWarmupCompleted = clearRevision.onWarmupCompleted(sequenceIAuthTabCallbackDefault, new Function1() { // from class: im.toss.securities.widget.data.model.overview.OverviewAccounts$$ExternalSyntheticLambda1
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj) {
                    int i7 = 2 % 2;
                    int i8 = onWarmupCompleted + 83;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    Boolean boolValueOf = Boolean.valueOf(OverviewAccounts.onExtraCallbackWithResult((Product) obj));
                    int i10 = onWarmupCompleted + 3;
                    onNavigationEvent = i10 % 128;
                    int i11 = i10 % 2;
                    return boolValueOf;
                }
            })) != null && (sequenceIAuthTabCallbackDefault2 = clearRevision.IAuthTabCallbackDefault(sequenceOnWarmupCompleted, new Function1() { // from class: im.toss.securities.widget.data.model.overview.OverviewAccounts$$ExternalSyntheticLambda2
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;

                public final Object invoke(Object obj) {
                    int i7 = 2 % 2;
                    int i8 = IAuthTabCallback + 17;
                    onExtraCallback = i8 % 128;
                    Product product = (Product) obj;
                    if (i8 % 2 != 0) {
                        return OverviewAccounts.onWarmupCompleted(product);
                    }
                    OverviewAccounts.onWarmupCompleted(product);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            })) != null && (sequenceOnWarmupCompleted2 = clearRevision.onWarmupCompleted(sequenceIAuthTabCallbackDefault2, new Function1() { // from class: im.toss.securities.widget.data.model.overview.OverviewAccounts$$ExternalSyntheticLambda3
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj) {
                    int i7 = 2 % 2;
                    int i8 = IAuthTabCallback + 17;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                    Boolean boolValueOf = Boolean.valueOf(OverviewAccounts.IAuthTabCallback((OverviewItemInfo) obj));
                    int i10 = onWarmupCompleted + 103;
                    IAuthTabCallback = i10 % 128;
                    int i11 = i10 % 2;
                    return boolValueOf;
                }
            })) != null && (sequenceIAuthTabCallback = clearRevision.IAuthTabCallback(sequenceOnWarmupCompleted2, new Function1() { // from class: im.toss.securities.widget.data.model.overview.OverviewAccounts$$ExternalSyntheticLambda4
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj) {
                    int i7 = 2 % 2;
                    int i8 = onNavigationEvent + 19;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                    String strOnNavigationEvent = OverviewAccounts.onNavigationEvent((OverviewItemInfo) obj);
                    if (i9 == 0) {
                        int i10 = 31 / 0;
                    }
                    int i11 = onNavigationEvent + 81;
                    IAuthTabCallback = i11 % 128;
                    if (i11 % 2 != 0) {
                        return strOnNavigationEvent;
                    }
                    throw null;
                }
            })) != null && (listAccess000 = clearRevision.access000(sequenceIAuthTabCallback)) != null) {
                return listAccess000;
            }
        }
        return CollectionsKt.emptyList();
    }

    private static final Iterable IAuthTabCallback(Overview overview) {
        return (Iterable) onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{overview}, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), 241618425, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), -241618424, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent());
    }

    private static final Iterable IAuthTabCallback(Product product) {
        return (Iterable) onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{product}, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), -1468732649, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), 1468732651, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent());
    }
}
