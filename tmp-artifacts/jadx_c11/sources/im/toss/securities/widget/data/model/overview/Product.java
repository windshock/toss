package im.toss.securities.widget.data.model.overview;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access15300;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.r2ExternalSyntheticLambda4;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class Product {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final OverviewPrice dailyProfitLossAmount;
    private final OverviewPrice dailyProfitLossRate;
    private final OverviewPrice evaluatedAmount;
    private final OverviewPrice evaluatedAmountAfterFees;
    private final boolean hasDelisting;
    private final List<OverviewItemInfo> items;
    private final onExtraCallback marketType;
    private final OverviewPrice principalAmount;
    private final OverviewPrice profitLossAmount;
    private final OverviewPrice profitLossAmountAfterFees;
    private final OverviewPrice profitLossRate;
    private final OverviewRate profitLossRateAfterFees;
    private final boolean sorted;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.securities.widget.data.model.overview.Product$$ExternalSyntheticLambda0
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 43;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallback = Product.onExtraCallback();
            int i4 = onExtraCallback + 23;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return kSerializerOnExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }), null, null, null, null, null};

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnWarmupCompleted = onWarmupCompleted();
        int i4 = IAuthTabCallback + 9;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnWarmupCompleted;
    }

    private static final /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.securities.widget.data.model.overview.Product.MarketType", onExtraCallback.values());
        }
        updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.securities.widget.data.model.overview.Product.MarketType", onExtraCallback.values());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Product)) {
            return false;
        }
        Product product = (Product) obj;
        if (!Intrinsics.areEqual(this.dailyProfitLossAmount, product.dailyProfitLossAmount)) {
            int i2 = IAuthTabCallback;
            int i3 = i2 + 123;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 45;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.dailyProfitLossRate, product.dailyProfitLossRate) || !Intrinsics.areEqual(this.evaluatedAmount, product.evaluatedAmount) || !Intrinsics.areEqual(this.principalAmount, product.principalAmount) || !Intrinsics.areEqual(this.profitLossAmount, product.profitLossAmount)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.profitLossRate, product.profitLossRate)) {
            int i7 = IAuthTabCallback;
            int i8 = i7 + 109;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            int i10 = i7 + 83;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (this.hasDelisting != product.hasDelisting) {
            int i12 = IAuthTabCallback + 47;
            onNavigationEvent = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (this.marketType == product.marketType) {
            return this.sorted == product.sorted && Intrinsics.areEqual(this.items, product.items) && Intrinsics.areEqual(this.evaluatedAmountAfterFees, product.evaluatedAmountAfterFees) && !(Intrinsics.areEqual(this.profitLossAmountAfterFees, product.profitLossAmountAfterFees) ^ true) && Intrinsics.areEqual(this.profitLossRateAfterFees, product.profitLossRateAfterFees);
        }
        int i14 = IAuthTabCallback + 49;
        onNavigationEvent = i14 % 128;
        if (i14 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int iHashCode4 = this.dailyProfitLossAmount.hashCode();
        int iHashCode5 = this.dailyProfitLossRate.hashCode();
        int iHashCode6 = this.evaluatedAmount.hashCode();
        int iHashCode7 = this.principalAmount.hashCode();
        int iHashCode8 = this.profitLossAmount.hashCode();
        int iHashCode9 = this.profitLossRate.hashCode();
        int iHashCode10 = Boolean.hashCode(this.hasDelisting);
        onExtraCallback onextracallback = this.marketType;
        if (onextracallback == null) {
            int i2 = onNavigationEvent + 61;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = onextracallback.hashCode();
        }
        int iHashCode11 = Boolean.hashCode(this.sorted);
        int iHashCode12 = this.items.hashCode();
        OverviewPrice overviewPrice = this.evaluatedAmountAfterFees;
        if (overviewPrice == null) {
            int i4 = IAuthTabCallback + 85;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = overviewPrice.hashCode();
        }
        OverviewPrice overviewPrice2 = this.profitLossAmountAfterFees;
        if (overviewPrice2 == null) {
            int i6 = onNavigationEvent + 43;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = overviewPrice2.hashCode();
        }
        OverviewRate overviewRate = this.profitLossRateAfterFees;
        return (((((((((((((((((((((((iHashCode4 * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (overviewRate != null ? overviewRate.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Product(dailyProfitLossAmount=" + this.dailyProfitLossAmount + ", dailyProfitLossRate=" + this.dailyProfitLossRate + ", evaluatedAmount=" + this.evaluatedAmount + ", principalAmount=" + this.principalAmount + ", profitLossAmount=" + this.profitLossAmount + ", profitLossRate=" + this.profitLossRate + ", hasDelisting=" + this.hasDelisting + ", marketType=" + this.marketType + ", sorted=" + this.sorted + ", items=" + this.items + ", evaluatedAmountAfterFees=" + this.evaluatedAmountAfterFees + ", profitLossAmountAfterFees=" + this.profitLossAmountAfterFees + ", profitLossRateAfterFees=" + this.profitLossRateAfterFees + ")";
        int i2 = IAuthTabCallback + 51;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<Product> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 19;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Product$$serializer product$$serializer = Product$$serializer.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Product$$serializer product$$serializer2 = Product$$serializer.INSTANCE;
            int i3 = onExtraCallback + 23;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return product$$serializer2;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 123;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            int i2 = 71 / 0;
        }
    }

    public /* synthetic */ Product(int i, OverviewPrice overviewPrice, OverviewPrice overviewPrice2, OverviewPrice overviewPrice3, OverviewPrice overviewPrice4, OverviewPrice overviewPrice5, OverviewPrice overviewPrice6, boolean z, onExtraCallback onextracallback, boolean z2, List list, OverviewPrice overviewPrice7, OverviewPrice overviewPrice8, OverviewRate overviewRate, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 895;
        if (895 != (i & 895)) {
            int i3 = IAuthTabCallback + 17;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                descriptor = Product$$serializer.INSTANCE.getDescriptor();
                i2 = 27411;
            } else {
                descriptor = Product$$serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
        }
        this.dailyProfitLossAmount = overviewPrice;
        this.dailyProfitLossRate = overviewPrice2;
        this.evaluatedAmount = overviewPrice3;
        this.principalAmount = overviewPrice4;
        this.profitLossAmount = overviewPrice5;
        this.profitLossRate = overviewPrice6;
        this.hasDelisting = z;
        if ((i & 128) == 0) {
            this.marketType = null;
            int i4 = 2 % 2;
        } else {
            this.marketType = onextracallback;
        }
        this.sorted = z2;
        this.items = list;
        if ((i & 1024) == 0) {
            int i5 = onNavigationEvent + 1;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            this.evaluatedAmountAfterFees = null;
            if (i6 == 0) {
                throw null;
            }
        } else {
            this.evaluatedAmountAfterFees = overviewPrice7;
        }
        if ((i & 2048) == 0) {
            this.profitLossAmountAfterFees = null;
            int i7 = 2 % 2;
        } else {
            this.profitLossAmountAfterFees = overviewPrice8;
        }
        if ((i & 4096) != 0) {
            this.profitLossRateAfterFees = overviewRate;
            return;
        }
        int i8 = IAuthTabCallback + 111;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        this.profitLossRateAfterFees = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0094  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(Product product, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        OverviewPrice$$serializer overviewPrice$$serializer = OverviewPrice$$serializer.INSTANCE;
        vylVar.onNavigationEvent(serialDescriptor, 0, overviewPrice$$serializer, product.dailyProfitLossAmount);
        vylVar.onNavigationEvent(serialDescriptor, 1, overviewPrice$$serializer, product.dailyProfitLossRate);
        vylVar.onNavigationEvent(serialDescriptor, 2, overviewPrice$$serializer, product.evaluatedAmount);
        vylVar.onNavigationEvent(serialDescriptor, 3, overviewPrice$$serializer, product.principalAmount);
        vylVar.onNavigationEvent(serialDescriptor, 4, overviewPrice$$serializer, product.profitLossAmount);
        vylVar.onNavigationEvent(serialDescriptor, 5, overviewPrice$$serializer, product.profitLossRate);
        vylVar.onNavigationEvent(serialDescriptor, 6, product.hasDelisting);
        if (vylVar.onWarmupCompleted(serialDescriptor, 7) || product.marketType != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 7, (py) lazyArr[7].getValue(), product.marketType);
            int i2 = IAuthTabCallback + 17;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
        }
        vylVar.onNavigationEvent(serialDescriptor, 8, product.sorted);
        vylVar.onNavigationEvent(serialDescriptor, 9, r2ExternalSyntheticLambda4.IAuthTabCallback, product.items);
        if (vylVar.onWarmupCompleted(serialDescriptor, 10) || product.evaluatedAmountAfterFees != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 10, overviewPrice$$serializer, product.evaluatedAmountAfterFees);
            int i4 = IAuthTabCallback + 31;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
        if (!(!vylVar.onWarmupCompleted(serialDescriptor, 11))) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 11, overviewPrice$$serializer, product.profitLossAmountAfterFees);
        } else {
            int i6 = IAuthTabCallback + 25;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                OverviewPrice overviewPrice = product.profitLossAmountAfterFees;
                throw null;
            }
            if (product.profitLossAmountAfterFees != null) {
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 12)) {
            int i7 = onNavigationEvent + 83;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            if (product.profitLossRateAfterFees == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 12, OverviewRate$$serializer.INSTANCE, product.profitLossRateAfterFees);
    }

    public static final /* synthetic */ Lazy[] onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (i3 != 0) {
            int i4 = 44 / 0;
        }
        return lazyArr;
    }

    public final onExtraCallback IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        onExtraCallback onextracallback = this.marketType;
        int i5 = i3 + 121;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return onextracallback;
        }
        throw null;
    }

    public final List<OverviewItemInfo> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 25;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        List<OverviewItemInfo> list = this.items;
        int i5 = i2 + 89;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        public static final onExtraCallback KR_STOCK = new onExtraCallback("KR_STOCK", 0);
        public static final onExtraCallback US_STOCK = new onExtraCallback("US_STOCK", 1);
        public static final onExtraCallback KR_OPTION = new onExtraCallback("KR_OPTION", 2);
        public static final onExtraCallback US_OPTION = new onExtraCallback("US_OPTION", 3);
        public static final onExtraCallback US_BOND = new onExtraCallback("US_BOND", 4);

        private static final /* synthetic */ onExtraCallback[] $values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 33;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            onExtraCallback[] onextracallbackArr = {KR_STOCK, US_STOCK, KR_OPTION, US_OPTION, US_BOND};
            int i5 = i2 + 81;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return onextracallbackArr;
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 67;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            EnumEntries<onExtraCallback> enumEntries = $ENTRIES;
            int i5 = i3 + 39;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static onExtraCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 69;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
            int i4 = onExtraCallback + 33;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return onextracallback;
            }
            throw null;
        }

        public static onExtraCallback[] values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 51;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback[] onextracallbackArr = (onExtraCallback[]) $VALUES.clone();
            int i4 = onExtraCallback + 119;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackArr;
        }

        private onExtraCallback(String str, int i) {
        }

        static {
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
            int i = onExtraCallbackWithResult + 15;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }
    }
}
