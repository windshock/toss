package im.toss.securities.widget.data.model.overview;

import im.toss.featurescommon.overseas.company.presentation.screen.ComposableSingletons$OverseasCompanyInfoScreenKt$;
import im.toss.securities.widget.data.model.overview.OverviewItemInfo;
import im.toss.tosssecurities.core.currency.domain.Currency;
import im.toss.tosssecurities.core.option.domain.model.OptionLiquidation;
import im.toss.tosssecurities.core.option.domain.model.OptionLiquidation$;
import im.toss.tosssecurities.topic.model.MetaData;
import im.toss.tosssecurities.topic.model.StockTic;
import j$.time.ZonedDateTime;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access15300;
import o.delimiterOffset;
import o.edit;
import o.getWriggleLayout;
import o.htf31;
import o.intersect;
import o.kt;
import o.liq;
import o.okycx;
import o.py;
import o.r2ExternalSyntheticLambda1;
import o.setVideoListener;
import o.socketAddress;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface OverviewItemInfo {
    public static final Companion Companion = Companion.$$INSTANCE;

    OverviewPrice IAuthTabCallback();

    boolean IAuthTabCallbackDefault();

    String IAuthTabCallbackStub();

    String IAuthTabCallbackStubProxy();

    OverviewPrice IAuthTabCallback_Parcel();

    Double ICustomTabsCallback();

    OverviewNotice access000();

    String access100();

    OverviewPrice asBinder();

    OverviewPrice asInterface();

    OverviewRate extraCallback();

    ShareHoldingsType extraCallbackWithResult();

    OverviewRate onExtraCallback();

    OverviewPrice onExtraCallbackWithResult();

    OverviewPrice onNavigationEvent();

    boolean onPostMessage();

    String onTransact();

    BadgeIcon onWarmupCompleted();

    OverviewPrice readTypedObject();

    OverviewRate writeTypedObject();

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onWarmupCompleted + 99;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        private Companion() {
        }

        public final KSerializer<OverviewItemInfo> serializer() {
            int i = 2 % 2;
            kt ktVar = new kt("im.toss.securities.widget.data.model.overview.OverviewItemInfo", Reflection.getOrCreateKotlinClass(OverviewItemInfo.class), new KClass[]{Reflection.getOrCreateKotlinClass(Bond.class), Reflection.getOrCreateKotlinClass(Option.class), Reflection.getOrCreateKotlinClass(Stock.class)}, new KSerializer[]{OverviewItemInfo$Bond$$serializer.INSTANCE, OverviewItemInfo$Option$$serializer.INSTANCE, OverviewItemInfo$Stock$$serializer.INSTANCE}, new Annotation[0]);
            int i2 = onExtraCallbackWithResult + 11;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 12 / 0;
            }
            return ktVar;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @liq
    public static final class ShareHoldingsType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ShareHoldingsType[] $VALUES;
        private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
        public static final Companion Companion;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        public static final ShareHoldingsType kr = new ShareHoldingsType("kr", 0);
        public static final ShareHoldingsType us = new ShareHoldingsType("us", 1);
        public static final ShareHoldingsType option = new ShareHoldingsType("option", 2);
        public static final ShareHoldingsType bond = new ShareHoldingsType("bond", 3);

        public static /* synthetic */ KSerializer $r8$lambda$wz_sUvifU9vlqDwCxpNSAaem31o() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 97;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return _init_$_anonymous_();
            }
            _init_$_anonymous_();
            throw null;
        }

        private static final /* synthetic */ ShareHoldingsType[] $values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 117;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            ShareHoldingsType[] shareHoldingsTypeArr = {kr, us, option, bond};
            int i5 = i3 + 3;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return shareHoldingsTypeArr;
        }

        public static EnumEntries<ShareHoldingsType> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 71;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            EnumEntries<ShareHoldingsType> enumEntries = $ENTRIES;
            int i5 = i3 + 125;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return enumEntries;
            }
            throw null;
        }

        public static ShareHoldingsType valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 125;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ShareHoldingsType shareHoldingsType = (ShareHoldingsType) Enum.valueOf(ShareHoldingsType.class, str);
            int i4 = IAuthTabCallback + 57;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return shareHoldingsType;
            }
            throw null;
        }

        public static ShareHoldingsType[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 21;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            ShareHoldingsType[] shareHoldingsTypeArr = (ShareHoldingsType[]) $VALUES.clone();
            int i4 = IAuthTabCallback + 119;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return shareHoldingsTypeArr;
        }

        public static final class Companion {
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            private final /* synthetic */ KSerializer onExtraCallback() {
                KSerializer kSerializer;
                int i = 2 % 2;
                int i2 = onNavigationEvent + 29;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    kSerializer = (KSerializer) ShareHoldingsType.access$get$cachedSerializer$delegate$cp().getValue();
                    int i3 = 89 / 0;
                } else {
                    kSerializer = (KSerializer) ShareHoldingsType.access$get$cachedSerializer$delegate$cp().getValue();
                }
                int i4 = onNavigationEvent + 89;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return kSerializer;
            }

            public final KSerializer<ShareHoldingsType> serializer() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 65;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                KSerializer<ShareHoldingsType> kSerializerOnExtraCallback = onExtraCallback();
                int i4 = onWarmupCompleted + 113;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnExtraCallback;
            }
        }

        private ShareHoldingsType(String str, int i) {
        }

        private static final /* synthetic */ KSerializer _init_$_anonymous_() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 61;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.securities.widget.data.model.overview.OverviewItemInfo.ShareHoldingsType", values());
            int i4 = onExtraCallbackWithResult + 1;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnExtraCallbackWithResult;
        }

        public static final /* synthetic */ Lazy access$get$cachedSerializer$delegate$cp() {
            Lazy<KSerializer<Object>> lazy;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 9;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 == 0) {
                lazy = $cachedSerializer$delegate;
                int i4 = 63 / 0;
            } else {
                lazy = $cachedSerializer$delegate;
            }
            int i5 = i3 + 93;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return lazy;
        }

        static {
            ShareHoldingsType[] shareHoldingsTypeArr$values = $values();
            $VALUES = shareHoldingsTypeArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(shareHoldingsTypeArr$values);
            Companion = new Companion(null);
            $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.securities.widget.data.model.overview.OverviewItemInfo$ShareHoldingsType$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 63;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    KSerializer kSerializer$r8$lambda$wz_sUvifU9vlqDwCxpNSAaem31o = OverviewItemInfo.ShareHoldingsType.$r8$lambda$wz_sUvifU9vlqDwCxpNSAaem31o();
                    int i4 = onExtraCallbackWithResult + 7;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return kSerializer$r8$lambda$wz_sUvifU9vlqDwCxpNSAaem31o;
                }
            });
            int i = onWarmupCompleted + 51;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    default delimiterOffset getInterfaceDescriptor() throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        if (this instanceof Option) {
            return delimiterOffset.OPTION;
        }
        if (this instanceof Stock) {
            return delimiterOffset.STOCK;
        }
        if (this instanceof Bond) {
            return delimiterOffset.BOND;
        }
        throw new NoWhenBranchMatchedException();
    }

    default StockTic onMessageChannelReady() {
        Double d;
        Double d2;
        int i = 2 % 2;
        OverviewPrice overviewPriceIAuthTabCallback = IAuthTabCallback();
        if (overviewPriceIAuthTabCallback == null || (dIAuthTabCallback = overviewPriceIAuthTabCallback.onNavigationEvent()) == null) {
            OverviewPrice overviewPriceIAuthTabCallback2 = IAuthTabCallback();
            if (overviewPriceIAuthTabCallback2 != null) {
                Double dIAuthTabCallback = overviewPriceIAuthTabCallback2.IAuthTabCallback();
                d = dIAuthTabCallback;
            } else {
                d = null;
            }
        } else {
            d = dIAuthTabCallback;
        }
        OverviewPrice overviewPriceOnExtraCallbackWithResult = onExtraCallbackWithResult();
        if (overviewPriceOnExtraCallbackWithResult == null || (dIAuthTabCallback = overviewPriceOnExtraCallbackWithResult.onNavigationEvent()) == null) {
            OverviewPrice overviewPriceOnExtraCallbackWithResult2 = onExtraCallbackWithResult();
            if (overviewPriceOnExtraCallbackWithResult2 != null) {
                Double dIAuthTabCallback2 = overviewPriceOnExtraCallbackWithResult2.IAuthTabCallback();
                d2 = dIAuthTabCallback2;
            } else {
                d2 = null;
            }
        } else {
            d2 = dIAuthTabCallback2;
        }
        OverviewPrice overviewPriceIAuthTabCallback3 = IAuthTabCallback();
        Double dIAuthTabCallback3 = overviewPriceIAuthTabCallback3 != null ? overviewPriceIAuthTabCallback3.IAuthTabCallback() : null;
        OverviewPrice overviewPriceOnExtraCallbackWithResult3 = onExtraCallbackWithResult();
        return new StockTic((String) null, (String) null, d, d2, dIAuthTabCallback3, overviewPriceOnExtraCallbackWithResult3 != null ? overviewPriceOnExtraCallbackWithResult3.IAuthTabCallback() : null, (Double) null, (Double) null, (Long) null, onPostMessage() ? "USD" : "KRW", (String) null, (Double) null, (Long) null, (Double) null, (Double) null, (MetaData) null, (socketAddress) null, 130499, (DefaultConstructorMarker) null);
    }

    default OverviewPrice onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        if (z) {
            OverviewPrice typedObject = readTypedObject();
            return typedObject == null ? OverviewPrice.Companion.onNavigationEvent() : typedObject;
        }
        OverviewPrice overviewPriceIAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
        return overviewPriceIAuthTabCallback_Parcel == null ? OverviewPrice.Companion.onNavigationEvent() : overviewPriceIAuthTabCallback_Parcel;
    }

    default OverviewPrice onExtraCallback(boolean z) {
        int i = 2 % 2;
        if (z) {
            OverviewPrice overviewPriceAsBinder = asBinder();
            return overviewPriceAsBinder == null ? OverviewPrice.Companion.onNavigationEvent() : overviewPriceAsBinder;
        }
        OverviewPrice overviewPriceAsInterface = asInterface();
        return overviewPriceAsInterface == null ? OverviewPrice.Companion.onNavigationEvent() : overviewPriceAsInterface;
    }

    default OverviewRate onNavigationEvent(boolean z) {
        int i = 2 % 2;
        if (z) {
            return writeTypedObject();
        }
        return extraCallback();
    }

    @liq
    public static final class Option implements OverviewItemInfo, edit {
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.securities.widget.data.model.overview.OverviewItemInfo$Option$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 47;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    OverviewItemInfo.Option.onActivityLayout();
                    throw null;
                }
                KSerializer kSerializerOnActivityLayout = OverviewItemInfo.Option.onActivityLayout();
                int i3 = onWarmupCompleted + 85;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return kSerializerOnActivityLayout;
            }
        }), null, null, null, null, null, null, null, null, null};
        public static final Companion Companion;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        private final BadgeIcon badgeIcon;
        private final OverviewPrice basePrice;
        private final OverviewPrice baseWithoutAfter;
        private final OverviewPrice closeWithoutAfter;
        private final OverviewPrice commission;
        private final OverviewPrice currentPrice;
        private final OverviewPrice dailyProfitLossAmount;
        private final OverviewRate dailyProfitLossRate;
        private final boolean delisting;
        private final OverviewPrice evaluatedAmount;
        private final OverviewPrice evaluatedAmountAfterFees;
        private final Lazy isUsStock$delegate;
        private final String key;
        private final String logoImageUrl;
        private final OverviewNotice notice;
        private final OptionLiquidation optionLiquidation;
        private final String optionType;
        private final String productCode;
        private final String productName;
        private final OverviewPrice profitLossAmount;
        private final OverviewPrice profitLossAmountAfterFees;
        private final OverviewRate profitLossRate;
        private final OverviewRate profitLossRateAfterFees;
        private final OverviewPrice purchaseAmount;
        private final OverviewPrice purchasePrice;
        private final ShareHoldingsType shareHoldingsType;
        private final String stockCode;
        private final String stockName;
        private final String stockSymbol;
        private final OverviewPrice tax;
        private final Double tradableQuantity;

        private static final /* synthetic */ KSerializer newSessionWithExtras() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 123;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                ShareHoldingsType.Companion.serializer();
                throw null;
            }
            KSerializer<ShareHoldingsType> kSerializerSerializer = ShareHoldingsType.Companion.serializer();
            int i3 = IAuthTabCallback + 79;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                return kSerializerSerializer;
            }
            throw null;
        }

        public static /* synthetic */ KSerializer onActivityLayout() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 23;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerNewSessionWithExtras = newSessionWithExtras();
            int i4 = onWarmupCompleted + 79;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return kSerializerNewSessionWithExtras;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ boolean onExtraCallback(Option option) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 101;
            IAuthTabCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                onWarmupCompleted(option);
                obj.hashCode();
                throw null;
            }
            boolean zOnWarmupCompleted = onWarmupCompleted(option);
            int i3 = IAuthTabCallback + 49;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                return zOnWarmupCompleted;
            }
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ boolean onExtraCallbackWithResult(Option option) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 9;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            boolean zOnNavigationEvent = onNavigationEvent(option);
            int i4 = IAuthTabCallback + 71;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 / 0;
            }
            return zOnNavigationEvent;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Option)) {
                int i2 = onWarmupCompleted + 1;
                IAuthTabCallback = i2 % 128;
                return i2 % 2 != 0;
            }
            Option option = (Option) obj;
            if ((!Intrinsics.areEqual(this.key, option.key)) || !Intrinsics.areEqual(this.logoImageUrl, option.logoImageUrl) || !Intrinsics.areEqual(this.basePrice, option.basePrice)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.currentPrice, option.currentPrice)) {
                int i3 = onWarmupCompleted + 39;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.dailyProfitLossAmount, option.dailyProfitLossAmount)) {
                int i5 = onWarmupCompleted + 1;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.evaluatedAmount, option.evaluatedAmount) || !Intrinsics.areEqual(this.profitLossAmount, option.profitLossAmount)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.purchaseAmount, option.purchaseAmount)) {
                int i7 = IAuthTabCallback + 65;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.purchasePrice, option.purchasePrice) || !Intrinsics.areEqual(this.dailyProfitLossRate, option.dailyProfitLossRate) || !Intrinsics.areEqual(this.profitLossRate, option.profitLossRate)) {
                return false;
            }
            if (this.delisting != option.delisting) {
                int i9 = onWarmupCompleted + 115;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.tradableQuantity, option.tradableQuantity)) {
                int i11 = IAuthTabCallback + 119;
                onWarmupCompleted = i11 % 128;
                int i12 = i11 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.commission, option.commission) || !Intrinsics.areEqual(this.tax, option.tax)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.stockCode, option.stockCode)) {
                int i13 = onWarmupCompleted + 45;
                IAuthTabCallback = i13 % 128;
                int i14 = i13 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.stockName, option.stockName) || !Intrinsics.areEqual(this.optionLiquidation, option.optionLiquidation) || !Intrinsics.areEqual(this.closeWithoutAfter, option.closeWithoutAfter)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.baseWithoutAfter, option.baseWithoutAfter)) {
                int i15 = IAuthTabCallback + 53;
                onWarmupCompleted = i15 % 128;
                if (i15 % 2 == 0) {
                    int i16 = 89 / 0;
                }
                return false;
            }
            if (this.shareHoldingsType != option.shareHoldingsType) {
                int i17 = IAuthTabCallback + 47;
                onWarmupCompleted = i17 % 128;
                int i18 = i17 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.evaluatedAmountAfterFees, option.evaluatedAmountAfterFees)) {
                return Intrinsics.areEqual(this.profitLossAmountAfterFees, option.profitLossAmountAfterFees) && Intrinsics.areEqual(this.profitLossRateAfterFees, option.profitLossRateAfterFees) && Intrinsics.areEqual(this.badgeIcon, option.badgeIcon) && Intrinsics.areEqual(this.notice, option.notice) && Intrinsics.areEqual(this.stockSymbol, option.stockSymbol) && Intrinsics.areEqual(this.optionType, option.optionType);
            }
            int i19 = IAuthTabCallback + 25;
            onWarmupCompleted = i19 % 128;
            int i20 = i19 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            int iHashCode3;
            int i;
            int iHashCode4;
            int i2;
            int i3;
            int i4;
            int iHashCode5;
            int i5;
            int iHashCode6;
            int i6;
            int iHashCode7;
            int i7;
            int iHashCode8;
            int i8 = 2 % 2;
            int iHashCode9 = this.key.hashCode();
            String str = this.logoImageUrl;
            int iHashCode10 = str == null ? 0 : str.hashCode();
            OverviewPrice overviewPrice = this.basePrice;
            int iHashCode11 = overviewPrice == null ? 0 : overviewPrice.hashCode();
            OverviewPrice overviewPrice2 = this.currentPrice;
            int iHashCode12 = overviewPrice2 == null ? 0 : overviewPrice2.hashCode();
            OverviewPrice overviewPrice3 = this.dailyProfitLossAmount;
            int iHashCode13 = overviewPrice3 == null ? 0 : overviewPrice3.hashCode();
            OverviewPrice overviewPrice4 = this.evaluatedAmount;
            int iHashCode14 = overviewPrice4 == null ? 0 : overviewPrice4.hashCode();
            OverviewPrice overviewPrice5 = this.profitLossAmount;
            if (overviewPrice5 == null) {
                int i9 = IAuthTabCallback;
                int i10 = i9 + 99;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
                int i12 = i9 + 55;
                onWarmupCompleted = i12 % 128;
                int i13 = i12 % 2;
                iHashCode = 0;
            } else {
                iHashCode = overviewPrice5.hashCode();
            }
            OverviewPrice overviewPrice6 = this.purchaseAmount;
            int iHashCode15 = overviewPrice6 == null ? 0 : overviewPrice6.hashCode();
            OverviewPrice overviewPrice7 = this.purchasePrice;
            int iHashCode16 = overviewPrice7 == null ? 0 : overviewPrice7.hashCode();
            OverviewRate overviewRate = this.dailyProfitLossRate;
            if (overviewRate == null) {
                int i14 = onWarmupCompleted + 75;
                IAuthTabCallback = i14 % 128;
                int i15 = i14 % 2;
                iHashCode2 = 0;
            } else {
                iHashCode2 = overviewRate.hashCode();
            }
            OverviewRate overviewRate2 = this.profitLossRate;
            int iHashCode17 = overviewRate2 == null ? 0 : overviewRate2.hashCode();
            int iHashCode18 = Boolean.hashCode(this.delisting);
            Double d = this.tradableQuantity;
            if (d == null) {
                int i16 = onWarmupCompleted + 91;
                IAuthTabCallback = i16 % 128;
                iHashCode3 = i16 % 2 != 0 ? 1 : 0;
            } else {
                iHashCode3 = d.hashCode();
            }
            OverviewPrice overviewPrice8 = this.commission;
            int iHashCode19 = overviewPrice8 == null ? 0 : overviewPrice8.hashCode();
            OverviewPrice overviewPrice9 = this.tax;
            int iHashCode20 = overviewPrice9 == null ? 0 : overviewPrice9.hashCode();
            String str2 = this.stockCode;
            int iHashCode21 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.stockName;
            if (str3 == null) {
                int i17 = onWarmupCompleted + 55;
                i = iHashCode19;
                IAuthTabCallback = i17 % 128;
                int i18 = i17 % 2;
                iHashCode4 = 0;
            } else {
                i = iHashCode19;
                iHashCode4 = str3.hashCode();
            }
            OptionLiquidation optionLiquidation = this.optionLiquidation;
            int iHashCode22 = optionLiquidation == null ? 0 : optionLiquidation.hashCode();
            OverviewPrice overviewPrice10 = this.closeWithoutAfter;
            if (overviewPrice10 == null) {
                i2 = iHashCode4;
                i3 = 0;
            } else {
                int iHashCode23 = overviewPrice10.hashCode();
                int i19 = onWarmupCompleted + 115;
                i2 = iHashCode4;
                IAuthTabCallback = i19 % 128;
                if (i19 % 2 != 0) {
                    int i20 = 2 % 3;
                }
                i3 = iHashCode23;
            }
            OverviewPrice overviewPrice11 = this.baseWithoutAfter;
            int iHashCode24 = overviewPrice11 == null ? 0 : overviewPrice11.hashCode();
            int iHashCode25 = this.shareHoldingsType.hashCode();
            OverviewPrice overviewPrice12 = this.evaluatedAmountAfterFees;
            int iHashCode26 = overviewPrice12 == null ? 0 : overviewPrice12.hashCode();
            OverviewPrice overviewPrice13 = this.profitLossAmountAfterFees;
            int iHashCode27 = overviewPrice13 == null ? 0 : overviewPrice13.hashCode();
            OverviewRate overviewRate3 = this.profitLossRateAfterFees;
            int iHashCode28 = overviewRate3 == null ? 0 : overviewRate3.hashCode();
            BadgeIcon badgeIcon = this.badgeIcon;
            if (badgeIcon == null) {
                int i21 = onWarmupCompleted + 29;
                i4 = i3;
                IAuthTabCallback = i21 % 128;
                int i22 = i21 % 2;
                iHashCode5 = 0;
            } else {
                i4 = i3;
                iHashCode5 = badgeIcon.hashCode();
            }
            OverviewNotice overviewNotice = this.notice;
            if (overviewNotice == null) {
                int i23 = IAuthTabCallback + 125;
                i5 = iHashCode5;
                onWarmupCompleted = i23 % 128;
                int i24 = i23 % 2;
                iHashCode6 = 0;
            } else {
                i5 = iHashCode5;
                iHashCode6 = overviewNotice.hashCode();
            }
            String str4 = this.stockSymbol;
            if (str4 == null) {
                int i25 = onWarmupCompleted + 13;
                i6 = iHashCode6;
                IAuthTabCallback = i25 % 128;
                int i26 = i25 % 2;
                iHashCode7 = 0;
            } else {
                i6 = iHashCode6;
                iHashCode7 = str4.hashCode();
            }
            String str5 = this.optionType;
            if (str5 != null) {
                int i27 = onWarmupCompleted + 9;
                i7 = iHashCode7;
                IAuthTabCallback = i27 % 128;
                if (i27 % 2 != 0) {
                    str5.hashCode();
                    throw null;
                }
                iHashCode8 = str5.hashCode();
            } else {
                i7 = iHashCode7;
                iHashCode8 = 0;
            }
            return (((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode9 * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode2) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode3) * 31) + i) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + i2) * 31) + iHashCode22) * 31) + i4) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + i5) * 31) + i6) * 31) + i7) * 31) + iHashCode8;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Option(key=" + this.key + ", logoImageUrl=" + this.logoImageUrl + ", basePrice=" + this.basePrice + ", currentPrice=" + this.currentPrice + ", dailyProfitLossAmount=" + this.dailyProfitLossAmount + ", evaluatedAmount=" + this.evaluatedAmount + ", profitLossAmount=" + this.profitLossAmount + ", purchaseAmount=" + this.purchaseAmount + ", purchasePrice=" + this.purchasePrice + ", dailyProfitLossRate=" + this.dailyProfitLossRate + ", profitLossRate=" + this.profitLossRate + ", delisting=" + this.delisting + ", tradableQuantity=" + this.tradableQuantity + ", commission=" + this.commission + ", tax=" + this.tax + ", stockCode=" + this.stockCode + ", stockName=" + this.stockName + ", optionLiquidation=" + this.optionLiquidation + ", closeWithoutAfter=" + this.closeWithoutAfter + ", baseWithoutAfter=" + this.baseWithoutAfter + ", shareHoldingsType=" + this.shareHoldingsType + ", evaluatedAmountAfterFees=" + this.evaluatedAmountAfterFees + ", profitLossAmountAfterFees=" + this.profitLossAmountAfterFees + ", profitLossRateAfterFees=" + this.profitLossRateAfterFees + ", badgeIcon=" + this.badgeIcon + ", notice=" + this.notice + ", stockSymbol=" + this.stockSymbol + ", optionType=" + this.optionType + ")";
            int i2 = IAuthTabCallback + 9;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Option> serializer() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 55;
                onNavigationEvent = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    OverviewItemInfo$Option$$serializer overviewItemInfo$Option$$serializer = OverviewItemInfo$Option$$serializer.INSTANCE;
                    obj.hashCode();
                    throw null;
                }
                OverviewItemInfo$Option$$serializer overviewItemInfo$Option$$serializer2 = OverviewItemInfo$Option$$serializer.INSTANCE;
                int i3 = IAuthTabCallback + 35;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    return overviewItemInfo$Option$$serializer2;
                }
                obj.hashCode();
                throw null;
            }
        }

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new Companion(defaultConstructorMarker);
            int i = onExtraCallback + 21;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }

        public /* synthetic */ Option(int i, String str, String str2, OverviewPrice overviewPrice, OverviewPrice overviewPrice2, OverviewPrice overviewPrice3, OverviewPrice overviewPrice4, OverviewPrice overviewPrice5, OverviewPrice overviewPrice6, OverviewPrice overviewPrice7, OverviewRate overviewRate, OverviewRate overviewRate2, boolean z, Double d, OverviewPrice overviewPrice8, OverviewPrice overviewPrice9, String str3, String str4, OptionLiquidation optionLiquidation, OverviewPrice overviewPrice10, OverviewPrice overviewPrice11, ShareHoldingsType shareHoldingsType, OverviewPrice overviewPrice12, OverviewPrice overviewPrice13, OverviewRate overviewRate3, BadgeIcon badgeIcon, OverviewNotice overviewNotice, String str5, String str6, String str7, String str8, okycx okycxVar) {
            boolean z2;
            String strICustomTabsCallback_Parcel;
            if (1048577 != (i & 1048577)) {
                htf31.onExtraCallbackWithResult(i, 1048577, OverviewItemInfo$Option$$serializer.INSTANCE.getDescriptor());
            }
            this.key = str;
            Object obj = null;
            if ((i & 2) == 0) {
                this.logoImageUrl = null;
            } else {
                this.logoImageUrl = str2;
            }
            if ((i & 4) == 0) {
                this.basePrice = null;
            } else {
                this.basePrice = overviewPrice;
            }
            if ((i & 8) == 0) {
                this.currentPrice = null;
            } else {
                this.currentPrice = overviewPrice2;
            }
            if ((i & 16) == 0) {
                this.dailyProfitLossAmount = null;
            } else {
                this.dailyProfitLossAmount = overviewPrice3;
            }
            if ((i & 32) == 0) {
                int i2 = onWarmupCompleted + 1;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                this.evaluatedAmount = null;
                if (i3 != 0) {
                    obj.hashCode();
                    throw null;
                }
            } else {
                this.evaluatedAmount = overviewPrice4;
            }
            if ((i & 64) == 0) {
                this.profitLossAmount = null;
            } else {
                this.profitLossAmount = overviewPrice5;
            }
            if ((i & 128) == 0) {
                this.purchaseAmount = null;
            } else {
                this.purchaseAmount = overviewPrice6;
            }
            if ((i & 256) == 0) {
                int i4 = IAuthTabCallback + 125;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                this.purchasePrice = null;
            } else {
                this.purchasePrice = overviewPrice7;
            }
            if ((i & 512) == 0) {
                int i6 = onWarmupCompleted + 39;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                this.dailyProfitLossRate = null;
                if (i7 != 0) {
                    obj.hashCode();
                    throw null;
                }
            } else {
                this.dailyProfitLossRate = overviewRate;
            }
            if ((i & 1024) == 0) {
                this.profitLossRate = null;
            } else {
                this.profitLossRate = overviewRate2;
            }
            if ((i & 2048) == 0) {
                int i8 = IAuthTabCallback + 95;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                z2 = false;
            } else {
                z2 = z;
            }
            this.delisting = z2;
            if ((i & 4096) == 0) {
                this.tradableQuantity = null;
            } else {
                this.tradableQuantity = d;
            }
            if ((i & 8192) == 0) {
                this.commission = null;
                int i10 = 2 % 2;
            } else {
                this.commission = overviewPrice8;
            }
            if ((i & 16384) == 0) {
                this.tax = null;
            } else {
                this.tax = overviewPrice9;
            }
            if ((32768 & i) == 0) {
                int i11 = onWarmupCompleted + 57;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
                this.stockCode = null;
                if (i12 != 0) {
                    obj.hashCode();
                    throw null;
                }
                int i13 = 2 % 2;
            } else {
                this.stockCode = str3;
            }
            if ((65536 & i) == 0) {
                int i14 = IAuthTabCallback + 125;
                onWarmupCompleted = i14 % 128;
                int i15 = i14 % 2;
                this.stockName = null;
                if (i15 == 0) {
                    obj.hashCode();
                    throw null;
                }
            } else {
                this.stockName = str4;
            }
            if ((131072 & i) == 0) {
                int i16 = IAuthTabCallback + 91;
                onWarmupCompleted = i16 % 128;
                int i17 = i16 % 2;
                this.optionLiquidation = null;
            } else {
                this.optionLiquidation = optionLiquidation;
            }
            if ((262144 & i) == 0) {
                int i18 = onWarmupCompleted + 59;
                IAuthTabCallback = i18 % 128;
                int i19 = i18 % 2;
                this.closeWithoutAfter = null;
                if (i19 != 0) {
                    obj.hashCode();
                    throw null;
                }
            } else {
                this.closeWithoutAfter = overviewPrice10;
            }
            if ((524288 & i) == 0) {
                this.baseWithoutAfter = null;
            } else {
                this.baseWithoutAfter = overviewPrice11;
            }
            this.shareHoldingsType = shareHoldingsType;
            if ((2097152 & i) == 0) {
                this.evaluatedAmountAfterFees = null;
            } else {
                this.evaluatedAmountAfterFees = overviewPrice12;
            }
            if ((4194304 & i) == 0) {
                this.profitLossAmountAfterFees = null;
            } else {
                this.profitLossAmountAfterFees = overviewPrice13;
            }
            if ((8388608 & i) == 0) {
                this.profitLossRateAfterFees = null;
            } else {
                this.profitLossRateAfterFees = overviewRate3;
            }
            if ((16777216 & i) == 0) {
                int i20 = IAuthTabCallback + 71;
                onWarmupCompleted = i20 % 128;
                int i21 = i20 % 2;
                this.badgeIcon = null;
            } else {
                this.badgeIcon = badgeIcon;
            }
            if ((33554432 & i) == 0) {
                this.notice = null;
            } else {
                this.notice = overviewNotice;
            }
            int i22 = 2 % 2;
            if ((67108864 & i) == 0) {
                this.stockSymbol = null;
            } else {
                this.stockSymbol = str5;
                int i23 = 2 % 2;
            }
            if ((134217728 & i) == 0) {
                this.optionType = null;
            } else {
                this.optionType = str6;
            }
            if ((268435456 & i) == 0) {
                strICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel();
                if (strICustomTabsCallback_Parcel == null) {
                    int i24 = IAuthTabCallback + 111;
                    onWarmupCompleted = i24 % 128;
                    if (i24 % 2 == 0) {
                        throw null;
                    }
                    strICustomTabsCallback_Parcel = "";
                }
            } else {
                strICustomTabsCallback_Parcel = str7;
            }
            this.productCode = strICustomTabsCallback_Parcel;
            if ((i & 536870912) == 0) {
                String strICustomTabsService = ICustomTabsService();
                this.productName = strICustomTabsService != null ? strICustomTabsService : "";
            } else {
                this.productName = str8;
            }
            this.isUsStock$delegate = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.securities.widget.data.model.overview.OverviewItemInfo$Option$$ExternalSyntheticLambda2
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke() {
                    int i25 = 2 % 2;
                    int i26 = onExtraCallback + 31;
                    onExtraCallbackWithResult = i26 % 128;
                    int i27 = i26 % 2;
                    Boolean boolValueOf = Boolean.valueOf(OverviewItemInfo.Option.onExtraCallback(this.f$0));
                    int i28 = onExtraCallback + 27;
                    onExtraCallbackWithResult = i28 % 128;
                    if (i28 % 2 == 0) {
                        return boolValueOf;
                    }
                    throw null;
                }
            });
        }

        /* JADX WARN: Removed duplicated region for block: B:121:0x0264  */
        /* JADX WARN: Removed duplicated region for block: B:146:0x02d3  */
        /* JADX WARN: Removed duplicated region for block: B:159:0x030c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00ef  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0171  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0191  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x01b0  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onExtraCallbackWithResult(Option option, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            vylVar.onExtraCallback(serialDescriptor, 0, option.onTransact());
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                int i4 = IAuthTabCallback + 77;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                if (option.IAuthTabCallbackStub() != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, option.IAuthTabCallbackStub());
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 2) || option.IAuthTabCallback() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 2, OverviewPrice$$serializer.INSTANCE, option.IAuthTabCallback());
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 3) || option.onExtraCallbackWithResult() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 3, OverviewPrice$$serializer.INSTANCE, option.onExtraCallbackWithResult());
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 4) || option.onNavigationEvent() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 4, OverviewPrice$$serializer.INSTANCE, option.onNavigationEvent());
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 5)) {
                int i6 = onWarmupCompleted + 63;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                if (option.asInterface() != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 5, OverviewPrice$$serializer.INSTANCE, option.asInterface());
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 6) || option.IAuthTabCallback_Parcel() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 6, OverviewPrice$$serializer.INSTANCE, option.IAuthTabCallback_Parcel());
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 7) || option.isEngagementSignalsApiAvailable() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 7, OverviewPrice$$serializer.INSTANCE, option.isEngagementSignalsApiAvailable());
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 8) || option.mayLaunchUrl() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 8, OverviewPrice$$serializer.INSTANCE, option.mayLaunchUrl());
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 9)) {
                int i8 = onWarmupCompleted + 123;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                if (option.onExtraCallback() != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 9, OverviewRate$$serializer.INSTANCE, option.onExtraCallback());
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 10) || option.extraCallback() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 10, OverviewRate$$serializer.INSTANCE, option.extraCallback());
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 11) || option.IAuthTabCallbackDefault()) {
                vylVar.onNavigationEvent(serialDescriptor, 11, option.IAuthTabCallbackDefault());
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 12) || option.ICustomTabsCallback() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 12, setVideoListener.onWarmupCompleted, option.ICustomTabsCallback());
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 13) || option.ICustomTabsCallbackStubProxy() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 13, OverviewPrice$$serializer.INSTANCE, option.ICustomTabsCallbackStubProxy());
            }
            Object obj = null;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 14)) {
                int i10 = onWarmupCompleted + 111;
                IAuthTabCallback = i10 % 128;
                if (i10 % 2 != 0) {
                    option.newAuthTabSession();
                    throw null;
                }
                if (option.newAuthTabSession() != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 14, OverviewPrice$$serializer.INSTANCE, option.newAuthTabSession());
                }
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 15)) {
                int i11 = onWarmupCompleted + 101;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
                if (option.ICustomTabsCallback_Parcel() != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 15, getWriggleLayout.onNavigationEvent, option.ICustomTabsCallback_Parcel());
                }
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 16)) {
                int i13 = IAuthTabCallback + 5;
                onWarmupCompleted = i13 % 128;
                int i14 = i13 % 2;
                if (option.ICustomTabsService() != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 16, getWriggleLayout.onNavigationEvent, option.ICustomTabsService());
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 17) || option.onUnminimized() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 17, OptionLiquidation$.serializer.INSTANCE, option.onUnminimized());
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 18) || option.ICustomTabsCallbackStub() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 18, OverviewPrice$$serializer.INSTANCE, option.ICustomTabsCallbackStub());
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 19) || option.onActivityResized() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 19, OverviewPrice$$serializer.INSTANCE, option.onActivityResized());
            }
            vylVar.onNavigationEvent(serialDescriptor, 20, (py) lazyArr[20].getValue(), option.extraCallbackWithResult());
            if (vylVar.onWarmupCompleted(serialDescriptor, 21) || option.asBinder() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 21, OverviewPrice$$serializer.INSTANCE, option.asBinder());
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 22) || option.readTypedObject() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 22, OverviewPrice$$serializer.INSTANCE, option.readTypedObject());
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 23)) {
                int i15 = IAuthTabCallback + 49;
                onWarmupCompleted = i15 % 128;
                if (i15 % 2 == 0) {
                    option.writeTypedObject();
                    obj.hashCode();
                    throw null;
                }
                if (option.writeTypedObject() != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 23, OverviewRate$$serializer.INSTANCE, option.writeTypedObject());
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 24) || option.onWarmupCompleted() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 24, BadgeIcon$$serializer.INSTANCE, option.onWarmupCompleted());
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 25) || option.access000() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 25, OverviewNotice$$serializer.INSTANCE, option.access000());
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 26) || option.stockSymbol != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 26, getWriggleLayout.onNavigationEvent, option.stockSymbol);
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 27)) {
                int i16 = onWarmupCompleted + 93;
                IAuthTabCallback = i16 % 128;
                if (i16 % 2 != 0) {
                    int i17 = 12 / 0;
                    if (option.optionType != null) {
                        vylVar.onExtraCallbackWithResult(serialDescriptor, 27, getWriggleLayout.onNavigationEvent, option.optionType);
                    }
                } else if (option.optionType != null) {
                }
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 28)) {
                int i18 = onWarmupCompleted + 39;
                IAuthTabCallback = i18 % 128;
                if (i18 % 2 != 0) {
                    option.access100();
                    option.ICustomTabsCallback_Parcel();
                    obj.hashCode();
                    throw null;
                }
                String strAccess100 = option.access100();
                String strICustomTabsCallback_Parcel = option.ICustomTabsCallback_Parcel();
                if (strICustomTabsCallback_Parcel == null) {
                    strICustomTabsCallback_Parcel = "";
                }
                if (!Intrinsics.areEqual(strAccess100, strICustomTabsCallback_Parcel)) {
                    vylVar.onExtraCallback(serialDescriptor, 28, option.access100());
                }
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 29)) {
                String strIAuthTabCallbackStubProxy = option.IAuthTabCallbackStubProxy();
                String strICustomTabsService = option.ICustomTabsService();
                if (strICustomTabsService == null) {
                    strICustomTabsService = "";
                }
                if (Intrinsics.areEqual(strIAuthTabCallbackStubProxy, strICustomTabsService)) {
                    return;
                }
            }
            vylVar.onExtraCallback(serialDescriptor, 29, option.IAuthTabCallbackStubProxy());
        }

        public static final /* synthetic */ Lazy[] onMinimized() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 19;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            int i4 = i2 + 93;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 87 / 0;
            }
            return lazyArr;
        }

        public /* bridge */ boolean ICustomTabsCallbackDefault() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 51;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return super.ICustomTabsCallbackDefault();
            }
            super.ICustomTabsCallbackDefault();
            throw null;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public /* bridge */ delimiterOffset getInterfaceDescriptor() throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 11;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            delimiterOffset interfaceDescriptor = super.getInterfaceDescriptor();
            int i4 = onWarmupCompleted + 123;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return interfaceDescriptor;
            }
            throw null;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public /* bridge */ OverviewPrice onExtraCallback(boolean z) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 3;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return super.onExtraCallback(z);
            }
            super.onExtraCallback(z);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public /* bridge */ StockTic onMessageChannelReady() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 33;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            StockTic stockTicOnMessageChannelReady = super.onMessageChannelReady();
            int i4 = onWarmupCompleted + 19;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return stockTicOnMessageChannelReady;
            }
            throw null;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public /* bridge */ OverviewRate onNavigationEvent(boolean z) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 51;
            IAuthTabCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                super.onNavigationEvent(z);
                obj.hashCode();
                throw null;
            }
            OverviewRate overviewRateOnNavigationEvent = super.onNavigationEvent(z);
            int i3 = onWarmupCompleted + 95;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return overviewRateOnNavigationEvent;
            }
            obj.hashCode();
            throw null;
        }

        public /* bridge */ ZonedDateTime onRelationshipValidationResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 9;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            ZonedDateTime zonedDateTimeOnRelationshipValidationResult = super.onRelationshipValidationResult();
            int i4 = IAuthTabCallback + 15;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return zonedDateTimeOnRelationshipValidationResult;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public /* bridge */ OverviewPrice onWarmupCompleted(boolean z) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 75;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                super.onWarmupCompleted(z);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            OverviewPrice overviewPriceOnWarmupCompleted = super.onWarmupCompleted(z);
            int i3 = onWarmupCompleted + 29;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return overviewPriceOnWarmupCompleted;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public String onTransact() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 75;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            String str = this.key;
            int i5 = i2 + 113;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public String IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 27;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return this.logoImageUrl;
            }
            throw null;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public OverviewPrice IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.basePrice;
            }
            throw null;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public OverviewPrice onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 7;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            OverviewPrice overviewPrice = this.currentPrice;
            int i4 = i3 + 87;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return overviewPrice;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public OverviewPrice onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 121;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            OverviewPrice overviewPrice = this.dailyProfitLossAmount;
            int i5 = i3 + 117;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return overviewPrice;
            }
            throw null;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public OverviewPrice asInterface() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 53;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            OverviewPrice overviewPrice = this.evaluatedAmount;
            int i4 = i3 + 39;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return overviewPrice;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public OverviewPrice IAuthTabCallback_Parcel() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 75;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return this.profitLossAmount;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public OverviewPrice isEngagementSignalsApiAvailable() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 65;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            OverviewPrice overviewPrice = this.purchaseAmount;
            int i5 = i3 + 3;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return overviewPrice;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public OverviewPrice mayLaunchUrl() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 17;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            OverviewPrice overviewPrice = this.purchasePrice;
            int i5 = i3 + 63;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return overviewPrice;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public OverviewRate onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 57;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            OverviewRate overviewRate = this.dailyProfitLossRate;
            int i5 = i2 + 91;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return overviewRate;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public OverviewRate extraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 101;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            OverviewRate overviewRate = this.profitLossRate;
            if (i3 == 0) {
                int i4 = 93 / 0;
            }
            return overviewRate;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public boolean IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 105;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return this.delisting;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public Double ICustomTabsCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 53;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Double d = this.tradableQuantity;
            int i5 = i2 + 27;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return d;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public OverviewPrice ICustomTabsCallbackStubProxy() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 11;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            OverviewPrice overviewPrice = this.commission;
            int i5 = i2 + 53;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return overviewPrice;
        }

        public OverviewPrice newAuthTabSession() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 21;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            OverviewPrice overviewPrice = this.tax;
            int i4 = i3 + 59;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return overviewPrice;
        }

        public String ICustomTabsCallback_Parcel() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 115;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.stockCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String ICustomTabsService() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 73;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            String str = this.stockName;
            int i5 = i2 + 11;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public OptionLiquidation onUnminimized() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 121;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            OptionLiquidation optionLiquidation = this.optionLiquidation;
            if (i3 != 0) {
                int i4 = 84 / 0;
            }
            return optionLiquidation;
        }

        public OverviewPrice ICustomTabsCallbackStub() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 57;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            OverviewPrice overviewPrice = this.closeWithoutAfter;
            int i4 = i3 + 1;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return overviewPrice;
            }
            obj.hashCode();
            throw null;
        }

        public OverviewPrice onActivityResized() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 5;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            OverviewPrice overviewPrice = this.baseWithoutAfter;
            int i5 = i3 + 105;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return overviewPrice;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public ShareHoldingsType extraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 95;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            ShareHoldingsType shareHoldingsType = this.shareHoldingsType;
            int i5 = i3 + 23;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 27 / 0;
            }
            return shareHoldingsType;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public OverviewPrice asBinder() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 27;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            OverviewPrice overviewPrice = this.evaluatedAmountAfterFees;
            int i5 = i3 + 103;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return overviewPrice;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public OverviewPrice readTypedObject() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 99;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            OverviewPrice overviewPrice = this.profitLossAmountAfterFees;
            int i4 = i3 + 85;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return overviewPrice;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public OverviewRate writeTypedObject() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 61;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            OverviewRate overviewRate = this.profitLossRateAfterFees;
            int i5 = i2 + 9;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return overviewRate;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public BadgeIcon onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 35;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            BadgeIcon badgeIcon = this.badgeIcon;
            int i5 = i3 + 21;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return badgeIcon;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public OverviewNotice access000() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 3;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            OverviewNotice overviewNotice = this.notice;
            int i5 = i2 + 95;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return overviewNotice;
        }

        public final String extraCommand() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 23;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            String str = this.optionType;
            int i5 = i2 + 119;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 81 / 0;
            }
            return str;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public String access100() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 55;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.productCode;
            }
            throw null;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public String IAuthTabCallbackStubProxy() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 119;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            String str = this.productName;
            int i5 = i3 + 67;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        private static final boolean onNavigationEvent(Option option) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 121;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            String strICustomTabsCallback_Parcel = option.ICustomTabsCallback_Parcel();
            if (strICustomTabsCallback_Parcel != null) {
                int i4 = onWarmupCompleted + 109;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return intersect.onExtraCallbackWithResult(strICustomTabsCallback_Parcel);
            }
            int i6 = IAuthTabCallback + 45;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 22 / 0;
            }
            return true;
        }

        private static final boolean onWarmupCompleted(Option option) {
            int i = 2 % 2;
            String strICustomTabsCallback_Parcel = option.ICustomTabsCallback_Parcel();
            if (strICustomTabsCallback_Parcel == null) {
                int i2 = onWarmupCompleted + 69;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            boolean zOnExtraCallbackWithResult = intersect.onExtraCallbackWithResult(strICustomTabsCallback_Parcel);
            int i4 = onWarmupCompleted + 113;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return zOnExtraCallbackWithResult;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public boolean onPostMessage() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 123;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            boolean zBooleanValue = ((Boolean) this.isUsStock$delegate.getValue()).booleanValue();
            int i4 = onWarmupCompleted + 51;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return zBooleanValue;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @liq
    public static final class Stock implements OverviewItemInfo {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private static int onNavigationEvent;
        private final boolean archiving;
        private final BadgeIcon badgeIcon;
        private final OverviewPrice basePrice;
        private final OverviewPrice baseWithoutAfter;
        private final OverviewPrice closeWithoutAfter;
        private final OverviewPrice commission;
        private final OverviewPrice currentPrice;
        private final OverviewPrice dailyProfitLossAmount;
        private final OverviewRate dailyProfitLossRate;
        private final boolean delisting;
        private final OverviewPrice evaluatedAmount;
        private final OverviewPrice evaluatedAmountAfterFees;
        private final Lazy isUsStock$delegate;
        private final String key;
        private final String logoImageUrl;
        private final OverviewNotice notice;
        private final boolean nxtSupported;
        private final String productCode;
        private final String productName;
        private final OverviewPrice profitLossAmount;
        private final OverviewPrice profitLossAmountAfterFees;
        private final OverviewRate profitLossRate;
        private final OverviewRate profitLossRateAfterFees;
        private final OverviewPrice purchaseAmount;
        private final OverviewPrice purchasePrice;
        private final ShareHoldingsType shareHoldingsType;
        private final String stockCode;
        private final String stockName;
        private final String stockSymbol;
        private final OverviewPrice tax;
        private final Double tradableQuantity;
        private final boolean unlisting;
        public static final Companion Companion = new Companion(null);
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.securities.widget.data.model.overview.OverviewItemInfo$Stock$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 51;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return OverviewItemInfo.Stock.onActivityResized();
                }
                OverviewItemInfo.Stock.onActivityResized();
                throw null;
            }
        }), null, null, null, null, null, null, null, null, null, null, null};

        private static final /* synthetic */ KSerializer ICustomTabsCallback_Parcel() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 43;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            KSerializer<ShareHoldingsType> kSerializerSerializer = ShareHoldingsType.Companion.serializer();
            int i4 = onExtraCallback + 27;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerSerializer;
        }

        public static /* synthetic */ KSerializer onActivityResized() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 123;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel();
            if (i3 == 0) {
                int i4 = 98 / 0;
            }
            return kSerializerICustomTabsCallback_Parcel;
        }

        public static /* synthetic */ boolean onExtraCallback(Stock stock) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 33;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                onWarmupCompleted(stock);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            boolean zOnWarmupCompleted = onWarmupCompleted(stock);
            int i3 = onExtraCallbackWithResult + 69;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return zOnWarmupCompleted;
        }

        public static /* synthetic */ boolean onNavigationEvent(Stock stock) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 65;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return IAuthTabCallback(stock);
            }
            IAuthTabCallback(stock);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Stock)) {
                int i2 = onExtraCallbackWithResult + 19;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            Stock stock = (Stock) obj;
            if (!Intrinsics.areEqual(this.key, stock.key) || !Intrinsics.areEqual(this.logoImageUrl, stock.logoImageUrl)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.basePrice, stock.basePrice)) {
                int i4 = onExtraCallbackWithResult + 99;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.currentPrice, stock.currentPrice) || !Intrinsics.areEqual(this.dailyProfitLossAmount, stock.dailyProfitLossAmount) || !Intrinsics.areEqual(this.evaluatedAmount, stock.evaluatedAmount) || !Intrinsics.areEqual(this.profitLossAmount, stock.profitLossAmount) || !Intrinsics.areEqual(this.purchaseAmount, stock.purchaseAmount)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.purchasePrice, stock.purchasePrice)) {
                int i6 = onExtraCallback + 11;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.dailyProfitLossRate, stock.dailyProfitLossRate) || !Intrinsics.areEqual(this.profitLossRate, stock.profitLossRate)) {
                return false;
            }
            if (this.delisting != stock.delisting) {
                int i8 = onExtraCallback + 97;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.commission, stock.commission) || !Intrinsics.areEqual(this.tradableQuantity, stock.tradableQuantity)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.tax, stock.tax)) {
                int i10 = onExtraCallback + 85;
                onExtraCallbackWithResult = i10 % 128;
                return !(i10 % 2 == 0);
            }
            if ((!Intrinsics.areEqual(this.stockCode, stock.stockCode)) || !Intrinsics.areEqual(this.stockName, stock.stockName) || !Intrinsics.areEqual(this.closeWithoutAfter, stock.closeWithoutAfter) || !Intrinsics.areEqual(this.baseWithoutAfter, stock.baseWithoutAfter)) {
                return false;
            }
            if (this.shareHoldingsType != stock.shareHoldingsType) {
                int i11 = onExtraCallback + 11;
                onExtraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.evaluatedAmountAfterFees, stock.evaluatedAmountAfterFees)) {
                int i13 = onExtraCallbackWithResult + 101;
                onExtraCallback = i13 % 128;
                int i14 = i13 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.profitLossAmountAfterFees, stock.profitLossAmountAfterFees) || !Intrinsics.areEqual(this.profitLossRateAfterFees, stock.profitLossRateAfterFees) || !Intrinsics.areEqual(this.badgeIcon, stock.badgeIcon)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.notice, stock.notice)) {
                int i15 = onExtraCallbackWithResult + 45;
                onExtraCallback = i15 % 128;
                int i16 = i15 % 2;
                return false;
            }
            if (!(!Intrinsics.areEqual(this.stockSymbol, stock.stockSymbol))) {
                if (this.unlisting == stock.unlisting) {
                    return this.nxtSupported == stock.nxtSupported && this.archiving == stock.archiving;
                }
                int i17 = onExtraCallbackWithResult;
                int i18 = i17 + 67;
                onExtraCallback = i18 % 128;
                int i19 = i18 % 2;
                int i20 = i17 + 83;
                onExtraCallback = i20 % 128;
                if (i20 % 2 != 0) {
                    return false;
                }
                throw null;
            }
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
            int i3;
            int iHashCode6;
            int i4;
            int iHashCode7;
            int i5;
            int iHashCode8;
            int i6;
            int iHashCode9;
            int i7;
            int i8 = 2 % 2;
            int iHashCode10 = this.key.hashCode();
            String str = this.logoImageUrl;
            int iHashCode11 = str == null ? 0 : str.hashCode();
            OverviewPrice overviewPrice = this.basePrice;
            if (overviewPrice == null) {
                int i9 = onExtraCallback + 101;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                iHashCode = 0;
            } else {
                iHashCode = overviewPrice.hashCode();
            }
            OverviewPrice overviewPrice2 = this.currentPrice;
            if (overviewPrice2 == null) {
                int i11 = onExtraCallback + 3;
                onExtraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
                iHashCode2 = 0;
            } else {
                iHashCode2 = overviewPrice2.hashCode();
            }
            OverviewPrice overviewPrice3 = this.dailyProfitLossAmount;
            int iHashCode12 = overviewPrice3 == null ? 0 : overviewPrice3.hashCode();
            OverviewPrice overviewPrice4 = this.evaluatedAmount;
            int iHashCode13 = overviewPrice4 == null ? 0 : overviewPrice4.hashCode();
            OverviewPrice overviewPrice5 = this.profitLossAmount;
            int iHashCode14 = overviewPrice5 == null ? 0 : overviewPrice5.hashCode();
            OverviewPrice overviewPrice6 = this.purchaseAmount;
            int iHashCode15 = overviewPrice6 == null ? 0 : overviewPrice6.hashCode();
            OverviewPrice overviewPrice7 = this.purchasePrice;
            int iHashCode16 = overviewPrice7 == null ? 0 : overviewPrice7.hashCode();
            OverviewRate overviewRate = this.dailyProfitLossRate;
            int iHashCode17 = overviewRate == null ? 0 : overviewRate.hashCode();
            OverviewRate overviewRate2 = this.profitLossRate;
            int iHashCode18 = overviewRate2 == null ? 0 : overviewRate2.hashCode();
            int iHashCode19 = Boolean.hashCode(this.delisting);
            OverviewPrice overviewPrice8 = this.commission;
            if (overviewPrice8 == null) {
                int i13 = onExtraCallback + 37;
                onExtraCallbackWithResult = i13 % 128;
                int i14 = i13 % 2;
                iHashCode3 = 0;
            } else {
                iHashCode3 = overviewPrice8.hashCode();
            }
            Double d = this.tradableQuantity;
            if (d == null) {
                int i15 = onExtraCallbackWithResult + 71;
                i = iHashCode3;
                onExtraCallback = i15 % 128;
                int i16 = i15 % 2;
                iHashCode4 = 0;
            } else {
                i = iHashCode3;
                iHashCode4 = d.hashCode();
            }
            OverviewPrice overviewPrice9 = this.tax;
            int iHashCode20 = overviewPrice9 == null ? 0 : overviewPrice9.hashCode();
            String str2 = this.stockCode;
            if (str2 == null) {
                int i17 = onExtraCallbackWithResult + 111;
                i2 = iHashCode20;
                onExtraCallback = i17 % 128;
                iHashCode5 = i17 % 2 == 0 ? 1 : 0;
            } else {
                i2 = iHashCode20;
                iHashCode5 = str2.hashCode();
            }
            String str3 = this.stockName;
            int iHashCode21 = str3 == null ? 0 : str3.hashCode();
            OverviewPrice overviewPrice10 = this.closeWithoutAfter;
            if (overviewPrice10 == null) {
                int i18 = onExtraCallbackWithResult + 63;
                i3 = iHashCode5;
                onExtraCallback = i18 % 128;
                int i19 = i18 % 2;
                iHashCode6 = 0;
            } else {
                i3 = iHashCode5;
                iHashCode6 = overviewPrice10.hashCode();
            }
            OverviewPrice overviewPrice11 = this.baseWithoutAfter;
            if (overviewPrice11 == null) {
                int i20 = onExtraCallbackWithResult + 99;
                i4 = iHashCode6;
                onExtraCallback = i20 % 128;
                int i21 = i20 % 2;
                iHashCode7 = 0;
            } else {
                i4 = iHashCode6;
                iHashCode7 = overviewPrice11.hashCode();
            }
            int iHashCode22 = this.shareHoldingsType.hashCode();
            OverviewPrice overviewPrice12 = this.evaluatedAmountAfterFees;
            int iHashCode23 = overviewPrice12 == null ? 0 : overviewPrice12.hashCode();
            OverviewPrice overviewPrice13 = this.profitLossAmountAfterFees;
            int iHashCode24 = overviewPrice13 == null ? 0 : overviewPrice13.hashCode();
            OverviewRate overviewRate3 = this.profitLossRateAfterFees;
            if (overviewRate3 == null) {
                int i22 = onExtraCallback + 77;
                i5 = iHashCode7;
                onExtraCallbackWithResult = i22 % 128;
                int i23 = i22 % 2;
                iHashCode8 = 0;
            } else {
                i5 = iHashCode7;
                iHashCode8 = overviewRate3.hashCode();
            }
            BadgeIcon badgeIcon = this.badgeIcon;
            int iHashCode25 = badgeIcon == null ? 0 : badgeIcon.hashCode();
            OverviewNotice overviewNotice = this.notice;
            if (overviewNotice == null) {
                int i24 = onExtraCallbackWithResult + 23;
                i6 = iHashCode8;
                onExtraCallback = i24 % 128;
                int i25 = i24 % 2;
                iHashCode9 = 0;
            } else {
                i6 = iHashCode8;
                iHashCode9 = overviewNotice.hashCode();
            }
            String str4 = this.stockSymbol;
            if (str4 != null) {
                int iHashCode26 = str4.hashCode();
                int i26 = onExtraCallback + 99;
                onExtraCallbackWithResult = i26 % 128;
                int i27 = i26 % 2;
                i7 = iHashCode26;
            } else {
                i7 = 0;
            }
            return (((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode10 * 31) + iHashCode11) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + i) * 31) + iHashCode4) * 31) + i2) * 31) + i3) * 31) + iHashCode21) * 31) + i4) * 31) + i5) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + i6) * 31) + iHashCode25) * 31) + iHashCode9) * 31) + i7) * 31) + Boolean.hashCode(this.unlisting)) * 31) + Boolean.hashCode(this.nxtSupported)) * 31) + Boolean.hashCode(this.archiving);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Stock(key=" + this.key + ", logoImageUrl=" + this.logoImageUrl + ", basePrice=" + this.basePrice + ", currentPrice=" + this.currentPrice + ", dailyProfitLossAmount=" + this.dailyProfitLossAmount + ", evaluatedAmount=" + this.evaluatedAmount + ", profitLossAmount=" + this.profitLossAmount + ", purchaseAmount=" + this.purchaseAmount + ", purchasePrice=" + this.purchasePrice + ", dailyProfitLossRate=" + this.dailyProfitLossRate + ", profitLossRate=" + this.profitLossRate + ", delisting=" + this.delisting + ", commission=" + this.commission + ", tradableQuantity=" + this.tradableQuantity + ", tax=" + this.tax + ", stockCode=" + this.stockCode + ", stockName=" + this.stockName + ", closeWithoutAfter=" + this.closeWithoutAfter + ", baseWithoutAfter=" + this.baseWithoutAfter + ", shareHoldingsType=" + this.shareHoldingsType + ", evaluatedAmountAfterFees=" + this.evaluatedAmountAfterFees + ", profitLossAmountAfterFees=" + this.profitLossAmountAfterFees + ", profitLossRateAfterFees=" + this.profitLossRateAfterFees + ", badgeIcon=" + this.badgeIcon + ", notice=" + this.notice + ", stockSymbol=" + this.stockSymbol + ", unlisting=" + this.unlisting + ", nxtSupported=" + this.nxtSupported + ", archiving=" + this.archiving + ")";
            int i2 = onExtraCallback + 47;
            onExtraCallbackWithResult = i2 % 128;
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

            public final KSerializer<Stock> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 117;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                OverviewItemInfo$Stock$$serializer overviewItemInfo$Stock$$serializer = OverviewItemInfo$Stock$$serializer.INSTANCE;
                if (i3 != 0) {
                    return overviewItemInfo$Stock$$serializer;
                }
                throw null;
            }
        }

        static {
            int i = onNavigationEvent + 119;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        public /* synthetic */ Stock(int i, String str, String str2, OverviewPrice overviewPrice, OverviewPrice overviewPrice2, OverviewPrice overviewPrice3, OverviewPrice overviewPrice4, OverviewPrice overviewPrice5, OverviewPrice overviewPrice6, OverviewPrice overviewPrice7, OverviewRate overviewRate, OverviewRate overviewRate2, boolean z, OverviewPrice overviewPrice8, Double d, OverviewPrice overviewPrice9, String str3, String str4, OverviewPrice overviewPrice10, OverviewPrice overviewPrice11, ShareHoldingsType shareHoldingsType, OverviewPrice overviewPrice12, OverviewPrice overviewPrice13, OverviewRate overviewRate3, BadgeIcon badgeIcon, OverviewNotice overviewNotice, String str5, boolean z2, boolean z3, boolean z4, String str6, String str7, okycx okycxVar) {
            String strICustomTabsCallbackStub;
            if (524289 != (i & 524289)) {
                htf31.onExtraCallbackWithResult(i, 524289, OverviewItemInfo$Stock$$serializer.INSTANCE.getDescriptor());
            }
            this.key = str;
            Object obj = null;
            if ((i & 2) == 0) {
                this.logoImageUrl = null;
            } else {
                this.logoImageUrl = str2;
            }
            if ((i & 4) == 0) {
                this.basePrice = null;
            } else {
                this.basePrice = overviewPrice;
            }
            if ((i & 8) == 0) {
                this.currentPrice = null;
            } else {
                this.currentPrice = overviewPrice2;
            }
            if ((i & 16) == 0) {
                int i2 = onExtraCallback + 9;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                this.dailyProfitLossAmount = null;
                if (i3 != 0) {
                    int i4 = 29 / 0;
                }
            } else {
                this.dailyProfitLossAmount = overviewPrice3;
            }
            if ((i & 32) == 0) {
                this.evaluatedAmount = null;
            } else {
                this.evaluatedAmount = overviewPrice4;
                int i5 = 2 % 2;
            }
            if ((i & 64) == 0) {
                int i6 = onExtraCallback + 61;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                this.profitLossAmount = null;
                if (i7 != 0) {
                    obj.hashCode();
                    throw null;
                }
            } else {
                this.profitLossAmount = overviewPrice5;
            }
            if ((i & 128) == 0) {
                int i8 = onExtraCallback + 9;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                this.purchaseAmount = null;
            } else {
                this.purchaseAmount = overviewPrice6;
            }
            if ((i & 256) == 0) {
                int i10 = onExtraCallback + 43;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
                this.purchasePrice = null;
                if (i11 != 0) {
                    throw null;
                }
            } else {
                this.purchasePrice = overviewPrice7;
                int i12 = 2 % 2;
            }
            if ((i & 512) == 0) {
                this.dailyProfitLossRate = null;
            } else {
                this.dailyProfitLossRate = overviewRate;
            }
            if ((i & 1024) == 0) {
                this.profitLossRate = null;
            } else {
                this.profitLossRate = overviewRate2;
            }
            if ((i & 2048) == 0) {
                this.delisting = false;
            } else {
                this.delisting = z;
            }
            if ((i & 4096) == 0) {
                this.commission = null;
            } else {
                this.commission = overviewPrice8;
            }
            if ((i & 8192) == 0) {
                this.tradableQuantity = null;
            } else {
                this.tradableQuantity = d;
            }
            if ((i & 16384) == 0) {
                int i13 = onExtraCallback + 45;
                onExtraCallbackWithResult = i13 % 128;
                int i14 = i13 % 2;
                this.tax = null;
            } else {
                this.tax = overviewPrice9;
            }
            if ((32768 & i) == 0) {
                this.stockCode = null;
            } else {
                this.stockCode = str3;
            }
            if ((65536 & i) == 0) {
                this.stockName = null;
            } else {
                this.stockName = str4;
            }
            if ((131072 & i) == 0) {
                this.closeWithoutAfter = null;
            } else {
                this.closeWithoutAfter = overviewPrice10;
            }
            if ((262144 & i) == 0) {
                this.baseWithoutAfter = null;
            } else {
                this.baseWithoutAfter = overviewPrice11;
            }
            this.shareHoldingsType = shareHoldingsType;
            if ((1048576 & i) == 0) {
                this.evaluatedAmountAfterFees = null;
                int i15 = onExtraCallbackWithResult + 123;
                onExtraCallback = i15 % 128;
                int i16 = i15 % 2;
                int i17 = 2 % 2;
            } else {
                this.evaluatedAmountAfterFees = overviewPrice12;
            }
            if ((2097152 & i) == 0) {
                this.profitLossAmountAfterFees = null;
            } else {
                this.profitLossAmountAfterFees = overviewPrice13;
            }
            if ((4194304 & i) == 0) {
                this.profitLossRateAfterFees = null;
            } else {
                this.profitLossRateAfterFees = overviewRate3;
            }
            if ((8388608 & i) == 0) {
                this.badgeIcon = null;
            } else {
                this.badgeIcon = badgeIcon;
            }
            if ((16777216 & i) == 0) {
                this.notice = null;
            } else {
                this.notice = overviewNotice;
            }
            if ((33554432 & i) == 0) {
                int i18 = onExtraCallback + 77;
                onExtraCallbackWithResult = i18 % 128;
                int i19 = i18 % 2;
                this.stockSymbol = null;
                int i20 = 2 % 2;
            } else {
                this.stockSymbol = str5;
            }
            if ((67108864 & i) == 0) {
                this.unlisting = false;
            } else {
                this.unlisting = z2;
            }
            if ((134217728 & i) == 0) {
                this.nxtSupported = false;
            } else {
                this.nxtSupported = z3;
            }
            if ((268435456 & i) == 0) {
                this.archiving = false;
            } else {
                this.archiving = z4;
            }
            if ((536870912 & i) == 0) {
                strICustomTabsCallbackStub = ICustomTabsCallbackStub();
                if (strICustomTabsCallbackStub == null) {
                    strICustomTabsCallbackStub = "";
                }
            } else {
                strICustomTabsCallbackStub = str6;
            }
            this.productCode = strICustomTabsCallbackStub;
            if ((i & 1073741824) == 0) {
                String strMayLaunchUrl = mayLaunchUrl();
                this.productName = strMayLaunchUrl != null ? strMayLaunchUrl : "";
                int i21 = 2 % 2;
            } else {
                this.productName = str7;
            }
            this.isUsStock$delegate = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.securities.widget.data.model.overview.OverviewItemInfo$Stock$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke() {
                    int i22 = 2 % 2;
                    int i23 = onWarmupCompleted + 21;
                    IAuthTabCallback = i23 % 128;
                    int i24 = i23 % 2;
                    Boolean boolValueOf = Boolean.valueOf(OverviewItemInfo.Stock.onExtraCallback(this.f$0));
                    int i25 = IAuthTabCallback + 13;
                    onWarmupCompleted = i25 % 128;
                    int i26 = i25 % 2;
                    return boolValueOf;
                }
            });
        }

        /* JADX WARN: Removed duplicated region for block: B:118:0x0252  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x02a0  */
        /* JADX WARN: Removed duplicated region for block: B:155:0x02f7  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0170  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0191  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x01f0  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onExtraCallback(Stock stock, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 39;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            vylVar.onExtraCallback(serialDescriptor, 0, stock.onTransact());
            if (vylVar.onWarmupCompleted(serialDescriptor, 1) || stock.IAuthTabCallbackStub() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, stock.IAuthTabCallbackStub());
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 2) || stock.IAuthTabCallback() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 2, OverviewPrice$$serializer.INSTANCE, stock.IAuthTabCallback());
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 3) || stock.onExtraCallbackWithResult() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 3, OverviewPrice$$serializer.INSTANCE, stock.onExtraCallbackWithResult());
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 4) || stock.onNavigationEvent() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 4, OverviewPrice$$serializer.INSTANCE, stock.onNavigationEvent());
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 5) || stock.asInterface() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 5, OverviewPrice$$serializer.INSTANCE, stock.asInterface());
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 6) || stock.IAuthTabCallback_Parcel() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 6, OverviewPrice$$serializer.INSTANCE, stock.IAuthTabCallback_Parcel());
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 7) || stock.ICustomTabsCallbackStubProxy() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 7, OverviewPrice$$serializer.INSTANCE, stock.ICustomTabsCallbackStubProxy());
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 8) || stock.ICustomTabsCallbackDefault() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 8, OverviewPrice$$serializer.INSTANCE, stock.ICustomTabsCallbackDefault());
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 9) || stock.onExtraCallback() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 9, OverviewRate$$serializer.INSTANCE, stock.onExtraCallback());
                int i4 = onExtraCallbackWithResult + 95;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 10) || stock.extraCallback() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 10, OverviewRate$$serializer.INSTANCE, stock.extraCallback());
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 11) || stock.IAuthTabCallbackDefault()) {
                vylVar.onNavigationEvent(serialDescriptor, 11, stock.IAuthTabCallbackDefault());
            }
            if (!(!vylVar.onWarmupCompleted(serialDescriptor, 12)) || stock.onRelationshipValidationResult() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 12, OverviewPrice$$serializer.INSTANCE, stock.onRelationshipValidationResult());
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 13) || stock.ICustomTabsCallback() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 13, setVideoListener.onWarmupCompleted, stock.ICustomTabsCallback());
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 14) || stock.isEngagementSignalsApiAvailable() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 14, OverviewPrice$$serializer.INSTANCE, stock.isEngagementSignalsApiAvailable());
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 15)) {
                int i6 = onExtraCallback + 69;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                if (stock.ICustomTabsCallbackStub() != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 15, getWriggleLayout.onNavigationEvent, stock.ICustomTabsCallbackStub());
                }
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 16)) {
                int i8 = onExtraCallback + 17;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                if (stock.mayLaunchUrl() != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 16, getWriggleLayout.onNavigationEvent, stock.mayLaunchUrl());
                }
            }
            if (!(!vylVar.onWarmupCompleted(serialDescriptor, 17)) || stock.onUnminimized() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 17, OverviewPrice$$serializer.INSTANCE, stock.onUnminimized());
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 18) || stock.onActivityLayout() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 18, OverviewPrice$$serializer.INSTANCE, stock.onActivityLayout());
            }
            vylVar.onNavigationEvent(serialDescriptor, 19, (py) lazyArr[19].getValue(), stock.extraCallbackWithResult());
            if (!vylVar.onWarmupCompleted(serialDescriptor, 20)) {
                int i10 = onExtraCallbackWithResult + 53;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
                if (stock.asBinder() != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 20, OverviewPrice$$serializer.INSTANCE, stock.asBinder());
                    int i12 = onExtraCallback + 5;
                    onExtraCallbackWithResult = i12 % 128;
                    int i13 = i12 % 2;
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 21) || stock.readTypedObject() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 21, OverviewPrice$$serializer.INSTANCE, stock.readTypedObject());
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 22) || stock.writeTypedObject() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 22, OverviewRate$$serializer.INSTANCE, stock.writeTypedObject());
            }
            Object obj = null;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 23)) {
                int i14 = onExtraCallback + 89;
                onExtraCallbackWithResult = i14 % 128;
                if (i14 % 2 != 0) {
                    stock.onWarmupCompleted();
                    throw null;
                }
                if (stock.onWarmupCompleted() != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 23, BadgeIcon$$serializer.INSTANCE, stock.onWarmupCompleted());
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 24) || stock.access000() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 24, OverviewNotice$$serializer.INSTANCE, stock.access000());
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 25) || stock.stockSymbol != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 25, getWriggleLayout.onNavigationEvent, stock.stockSymbol);
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 26)) {
                int i15 = onExtraCallbackWithResult + 111;
                onExtraCallback = i15 % 128;
                int i16 = i15 % 2;
                if (stock.unlisting) {
                    vylVar.onNavigationEvent(serialDescriptor, 26, stock.unlisting);
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 27) || stock.nxtSupported) {
                vylVar.onNavigationEvent(serialDescriptor, 27, stock.nxtSupported);
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 28) || stock.archiving) {
                vylVar.onNavigationEvent(serialDescriptor, 28, stock.archiving);
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 29)) {
                String strAccess100 = stock.access100();
                String strICustomTabsCallbackStub = stock.ICustomTabsCallbackStub();
                if (strICustomTabsCallbackStub == null) {
                    int i17 = onExtraCallback + 75;
                    onExtraCallbackWithResult = i17 % 128;
                    if (i17 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    strICustomTabsCallbackStub = "";
                }
                if (!Intrinsics.areEqual(strAccess100, strICustomTabsCallbackStub)) {
                    vylVar.onExtraCallback(serialDescriptor, 29, stock.access100());
                }
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 30)) {
                String strIAuthTabCallbackStubProxy = stock.IAuthTabCallbackStubProxy();
                String strMayLaunchUrl = stock.mayLaunchUrl();
                if (strMayLaunchUrl == null) {
                    int i18 = onExtraCallbackWithResult + 17;
                    onExtraCallback = i18 % 128;
                    if (i18 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    strMayLaunchUrl = "";
                }
                if (Intrinsics.areEqual(strIAuthTabCallbackStubProxy, strMayLaunchUrl)) {
                    return;
                }
            }
            vylVar.onExtraCallback(serialDescriptor, 30, stock.IAuthTabCallbackStubProxy());
        }

        public static final /* synthetic */ Lazy[] onMinimized() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 113;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            int i5 = i3 + 51;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 48 / 0;
            }
            return lazyArr;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public /* bridge */ delimiterOffset getInterfaceDescriptor() throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 109;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            delimiterOffset interfaceDescriptor = super.getInterfaceDescriptor();
            if (i3 == 0) {
                int i4 = 93 / 0;
            }
            return interfaceDescriptor;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public /* bridge */ OverviewPrice onExtraCallback(boolean z) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 15;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            OverviewPrice overviewPriceOnExtraCallback = super.onExtraCallback(z);
            if (i3 == 0) {
                int i4 = 60 / 0;
            }
            int i5 = onExtraCallback + 59;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 53 / 0;
            }
            return overviewPriceOnExtraCallback;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public /* bridge */ StockTic onMessageChannelReady() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 7;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                super.onMessageChannelReady();
                throw null;
            }
            StockTic stockTicOnMessageChannelReady = super.onMessageChannelReady();
            int i3 = onExtraCallback + 41;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return stockTicOnMessageChannelReady;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public /* bridge */ OverviewRate onNavigationEvent(boolean z) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 13;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            OverviewRate overviewRateOnNavigationEvent = super.onNavigationEvent(z);
            int i4 = onExtraCallbackWithResult + 51;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return overviewRateOnNavigationEvent;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public /* bridge */ OverviewPrice onWarmupCompleted(boolean z) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 101;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            OverviewPrice overviewPriceOnWarmupCompleted = super.onWarmupCompleted(z);
            int i4 = onExtraCallbackWithResult + 7;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return overviewPriceOnWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public String onTransact() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 57;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.key;
            int i4 = i3 + 109;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 / 0;
            }
            return str;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public String IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 87;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            String str = this.logoImageUrl;
            int i5 = i3 + 121;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public OverviewPrice IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 109;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            OverviewPrice overviewPrice = this.basePrice;
            int i4 = i2 + 101;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 93 / 0;
            }
            return overviewPrice;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public OverviewPrice onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 49;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return this.currentPrice;
            }
            throw null;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public OverviewPrice onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 95;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            OverviewPrice overviewPrice = this.dailyProfitLossAmount;
            int i5 = i3 + 107;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 66 / 0;
            }
            return overviewPrice;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public OverviewPrice asInterface() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 9;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            OverviewPrice overviewPrice = this.evaluatedAmount;
            int i5 = i3 + 25;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 63 / 0;
            }
            return overviewPrice;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public OverviewPrice IAuthTabCallback_Parcel() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 1;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            OverviewPrice overviewPrice = this.profitLossAmount;
            int i5 = i3 + 71;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return overviewPrice;
        }

        public OverviewPrice ICustomTabsCallbackStubProxy() {
            OverviewPrice overviewPrice;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 121;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 == 0) {
                overviewPrice = this.purchaseAmount;
                int i4 = 19 / 0;
            } else {
                overviewPrice = this.purchaseAmount;
            }
            int i5 = i3 + 91;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 33 / 0;
            }
            return overviewPrice;
        }

        public OverviewPrice ICustomTabsCallbackDefault() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 1;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return this.purchasePrice;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public OverviewRate onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 73;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            OverviewRate overviewRate = this.dailyProfitLossRate;
            int i5 = i2 + 57;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 30 / 0;
            }
            return overviewRate;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public OverviewRate extraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 79;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return this.profitLossRate;
            }
            throw null;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public boolean IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 39;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            boolean z = this.delisting;
            if (i3 == 0) {
                int i4 = 37 / 0;
            }
            return z;
        }

        public OverviewPrice onRelationshipValidationResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 77;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            OverviewPrice overviewPrice = this.commission;
            int i4 = i3 + 31;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return overviewPrice;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public Double ICustomTabsCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 5;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            Double d = this.tradableQuantity;
            int i5 = i3 + 61;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return d;
            }
            throw null;
        }

        public OverviewPrice isEngagementSignalsApiAvailable() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 65;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return this.tax;
            }
            throw null;
        }

        public String ICustomTabsCallbackStub() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 115;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return this.stockCode;
            }
            throw null;
        }

        public String mayLaunchUrl() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 97;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return this.stockName;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public OverviewPrice onUnminimized() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 41;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            OverviewPrice overviewPrice = this.closeWithoutAfter;
            if (i3 == 0) {
                int i4 = 84 / 0;
            }
            return overviewPrice;
        }

        public OverviewPrice onActivityLayout() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 121;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            OverviewPrice overviewPrice = this.baseWithoutAfter;
            int i5 = i3 + 91;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return overviewPrice;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public ShareHoldingsType extraCallbackWithResult() {
            ShareHoldingsType shareHoldingsType;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 31;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 == 0) {
                shareHoldingsType = this.shareHoldingsType;
                int i4 = 17 / 0;
            } else {
                shareHoldingsType = this.shareHoldingsType;
            }
            int i5 = i3 + 49;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return shareHoldingsType;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public OverviewPrice asBinder() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 123;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return this.evaluatedAmountAfterFees;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public OverviewPrice readTypedObject() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 19;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return this.profitLossAmountAfterFees;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public OverviewRate writeTypedObject() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 67;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            OverviewRate overviewRate = this.profitLossRateAfterFees;
            int i5 = i2 + 49;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return overviewRate;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public BadgeIcon onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 35;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            BadgeIcon badgeIcon = this.badgeIcon;
            int i4 = i2 + 73;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return badgeIcon;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public OverviewNotice access000() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 5;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return this.notice;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean ICustomTabsService() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 71;
            onExtraCallback = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            boolean z = this.unlisting;
            int i4 = i2 + 51;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return z;
            }
            obj.hashCode();
            throw null;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public String access100() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 93;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            String str = this.productCode;
            int i5 = i2 + 31;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public String IAuthTabCallbackStubProxy() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 113;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            String str = this.productName;
            int i4 = i3 + 7;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        private static final boolean IAuthTabCallback(Stock stock) {
            int i = 2 % 2;
            String strICustomTabsCallbackStub = stock.ICustomTabsCallbackStub();
            if (strICustomTabsCallbackStub == null) {
                return false;
            }
            int i2 = onExtraCallback + 75;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            boolean zOnExtraCallbackWithResult = intersect.onExtraCallbackWithResult(strICustomTabsCallbackStub);
            int i4 = onExtraCallbackWithResult + 121;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return zOnExtraCallbackWithResult;
            }
            throw null;
        }

        private static final boolean onWarmupCompleted(Stock stock) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 17;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            String strICustomTabsCallbackStub = stock.ICustomTabsCallbackStub();
            if (strICustomTabsCallbackStub == null) {
                return false;
            }
            boolean zOnExtraCallbackWithResult = intersect.onExtraCallbackWithResult(strICustomTabsCallbackStub);
            int i4 = onExtraCallbackWithResult + 3;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return zOnExtraCallbackWithResult;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public boolean onPostMessage() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 85;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            boolean zBooleanValue = ((Boolean) this.isUsStock$delegate.getValue()).booleanValue();
            int i4 = onExtraCallback + 29;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return zBooleanValue;
            }
            throw null;
        }
    }

    @liq
    public static final class Bond implements OverviewItemInfo {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private final BadgeIcon badgeIcon;
        private final OverviewPrice basePrice;
        private final OverviewPrice baseWithoutAfter;
        private final OverviewPrice closeWithoutAfter;
        private final OverviewPrice commission;
        private final OverviewPrice currentPrice;
        private final OverviewPrice dailyProfitLossAmount;
        private final OverviewRate dailyProfitLossRate;
        private final boolean delisting;
        private final String displayName;
        private final String durationToMaturity;
        private final OverviewPrice evaluatedAmount;
        private final OverviewPrice evaluatedAmountAfterFees;
        private final OverviewPrice expectedMaturityAmount;
        private final OverviewPrice expectedMaturityCommission;
        private final OverviewPrice expectedMaturityProfitLoss;
        private final OverviewPrice expectedMaturityProfitLossRate;
        private final OverviewPrice expectedMaturityTax;
        private final String guid;
        private final Lazy isUsStock$delegate;
        private final String isin;
        private final String key;
        private final String logoImageUrl;
        private final OverviewNotice notice;
        private final String productCode;
        private final String productName;
        private final OverviewPrice profitLossAmount;
        private final OverviewPrice profitLossAmountAfterFees;
        private final OverviewRate profitLossRate;
        private final OverviewRate profitLossRateAfterFees;
        private final OverviewPrice purchaseAmount;
        private final OverviewPrice purchasePrice;
        private final ShareHoldingsType shareHoldingsType;
        private final String symbol;
        private final OverviewPrice tax;
        private final double tradableQuantity;
        private final String underlyingGuid;
        public static final Companion Companion = new Companion(null);
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.securities.widget.data.model.overview.OverviewItemInfo$Bond$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 125;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnActivityResized = OverviewItemInfo.Bond.onActivityResized();
                int i4 = onWarmupCompleted + 7;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return kSerializerOnActivityResized;
                }
                throw null;
            }
        }), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

        public static final /* synthetic */ class onNavigationEvent {
            public static final /* synthetic */ int[] onExtraCallbackWithResult;
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            static {
                int[] iArr = new int[r2ExternalSyntheticLambda1.values().length];
                try {
                    iArr[r2ExternalSyntheticLambda1.CURRENT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[r2ExternalSyntheticLambda1.MATURITY.ordinal()] = 2;
                    int i = onWarmupCompleted + 123;
                    onNavigationEvent = i % 128;
                    if (i % 2 == 0) {
                        int i2 = 2 % 2;
                    }
                } catch (NoSuchFieldError unused2) {
                }
                onExtraCallbackWithResult = iArr;
                int i3 = onNavigationEvent + 23;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
            }
        }

        private static final /* synthetic */ KSerializer isEngagementSignalsApiAvailable() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 75;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                ShareHoldingsType.Companion.serializer();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            KSerializer<ShareHoldingsType> kSerializerSerializer = ShareHoldingsType.Companion.serializer();
            int i3 = onNavigationEvent + 81;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return kSerializerSerializer;
        }

        public static /* synthetic */ KSerializer onActivityResized() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 43;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerIsEngagementSignalsApiAvailable = isEngagementSignalsApiAvailable();
            int i4 = onExtraCallback + 63;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 24 / 0;
            }
            return kSerializerIsEngagementSignalsApiAvailable;
        }

        public static /* synthetic */ boolean onNavigationEvent(Bond bond) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 47;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            boolean zOnWarmupCompleted = onWarmupCompleted(bond);
            int i4 = onNavigationEvent + 71;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return zOnWarmupCompleted;
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            Bond bond = (Bond) objArr[0];
            int i = 2 % 2;
            int i2 = onExtraCallback + 103;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            boolean zIAuthTabCallback = IAuthTabCallback(bond);
            int i4 = onExtraCallback + 33;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return Boolean.valueOf(zIAuthTabCallback);
        }

        public static /* synthetic */ Object onWarmupCompleted(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
            int i7 = ~i3;
            int i8 = ~i5;
            int i9 = (~(i7 | i8)) | (~(i7 | i)) | (~(i8 | i));
            int i10 = ~(i5 | i7);
            int i11 = i | i10 | (~(i8 | i3));
            int i12 = i + i3 + i6 + ((-393945980) * i2) + (1728320405 * i4);
            int i13 = i12 * i12;
            int i14 = ((-1552544754) * i) + 1566572544 + ((-1100352524) * i3) + (i9 * (-226096115)) + ((-226096115) * i10) + (226096115 * i11) + ((-1326448640) * i6) + (2076180480 * i2) + ((-877658112) * i4) + (214302720 * i13);
            int i15 = ((i * (-252835662)) - 192251156) + (i3 * (-252834676)) + (i9 * (-493)) + (i10 * (-493)) + (i11 * 493) + (i6 * (-252835169)) + (i2 * 1574575612) + (i4 * 147979147) + (i13 * (-1426456576));
            return i14 + ((i15 * i15) * 2075787264) != 1 ? onNavigationEvent(objArr) : onWarmupCompleted(objArr);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Bond)) {
                return false;
            }
            Bond bond = (Bond) obj;
            if (!Intrinsics.areEqual(this.key, bond.key) || !Intrinsics.areEqual(this.logoImageUrl, bond.logoImageUrl) || !Intrinsics.areEqual(this.basePrice, bond.basePrice) || !Intrinsics.areEqual(this.currentPrice, bond.currentPrice) || !Intrinsics.areEqual(this.commission, bond.commission) || this.delisting != bond.delisting || !Intrinsics.areEqual(this.tax, bond.tax) || Double.compare(this.tradableQuantity, bond.tradableQuantity) != 0) {
                return false;
            }
            if (!Intrinsics.areEqual(this.evaluatedAmount, bond.evaluatedAmount)) {
                int i2 = onNavigationEvent + 103;
                onExtraCallback = i2 % 128;
                return i2 % 2 != 0;
            }
            if (!Intrinsics.areEqual(this.profitLossAmount, bond.profitLossAmount) || !Intrinsics.areEqual(this.profitLossRate, bond.profitLossRate) || !Intrinsics.areEqual(this.purchaseAmount, bond.purchaseAmount)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.purchasePrice, bond.purchasePrice)) {
                int i3 = onExtraCallback + 71;
                onNavigationEvent = i3 % 128;
                return i3 % 2 == 0;
            }
            if (!Intrinsics.areEqual(this.dailyProfitLossAmount, bond.dailyProfitLossAmount)) {
                int i4 = onNavigationEvent + 47;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.dailyProfitLossRate, bond.dailyProfitLossRate) || !Intrinsics.areEqual(this.closeWithoutAfter, bond.closeWithoutAfter) || !Intrinsics.areEqual(this.baseWithoutAfter, bond.baseWithoutAfter) || this.shareHoldingsType != bond.shareHoldingsType || !Intrinsics.areEqual(this.evaluatedAmountAfterFees, bond.evaluatedAmountAfterFees)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.profitLossAmountAfterFees, bond.profitLossAmountAfterFees)) {
                int i6 = onExtraCallback + 69;
                onNavigationEvent = i6 % 128;
                return i6 % 2 == 0;
            }
            if (!Intrinsics.areEqual(this.profitLossRateAfterFees, bond.profitLossRateAfterFees)) {
                int i7 = onNavigationEvent + 97;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.badgeIcon, bond.badgeIcon)) {
                int i9 = onNavigationEvent + 85;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.notice, bond.notice)) {
                int i11 = onNavigationEvent + 57;
                onExtraCallback = i11 % 128;
                return i11 % 2 != 0;
            }
            if (!Intrinsics.areEqual(this.displayName, bond.displayName) || !Intrinsics.areEqual(this.guid, bond.guid) || !Intrinsics.areEqual(this.isin, bond.isin) || !Intrinsics.areEqual(this.durationToMaturity, bond.durationToMaturity) || !Intrinsics.areEqual(this.symbol, bond.symbol) || !Intrinsics.areEqual(this.underlyingGuid, bond.underlyingGuid) || !Intrinsics.areEqual(this.expectedMaturityAmount, bond.expectedMaturityAmount)) {
                return false;
            }
            if (Intrinsics.areEqual(this.expectedMaturityCommission, bond.expectedMaturityCommission)) {
                return Intrinsics.areEqual(this.expectedMaturityProfitLoss, bond.expectedMaturityProfitLoss) && Intrinsics.areEqual(this.expectedMaturityProfitLossRate, bond.expectedMaturityProfitLossRate) && !(Intrinsics.areEqual(this.expectedMaturityTax, bond.expectedMaturityTax) ^ true);
            }
            int i12 = onExtraCallback + 87;
            onNavigationEvent = i12 % 128;
            return i12 % 2 == 0;
        }

        public int hashCode() {
            int i;
            int iHashCode;
            int i2;
            int iHashCode2;
            int i3;
            int iHashCode3;
            int i4;
            int i5;
            int i6 = 2 % 2;
            int iHashCode4 = this.key.hashCode();
            String str = this.logoImageUrl;
            int iHashCode5 = str == null ? 0 : str.hashCode();
            OverviewPrice overviewPrice = this.basePrice;
            int iHashCode6 = overviewPrice == null ? 0 : overviewPrice.hashCode();
            int iHashCode7 = this.currentPrice.hashCode();
            int iHashCode8 = this.commission.hashCode();
            int iHashCode9 = Boolean.hashCode(this.delisting);
            int iHashCode10 = this.tax.hashCode();
            int iHashCode11 = Double.hashCode(this.tradableQuantity);
            int iHashCode12 = this.evaluatedAmount.hashCode();
            int iHashCode13 = this.profitLossAmount.hashCode();
            int iHashCode14 = this.profitLossRate.hashCode();
            int iHashCode15 = this.purchaseAmount.hashCode();
            int iHashCode16 = this.purchasePrice.hashCode();
            int iHashCode17 = this.dailyProfitLossAmount.hashCode();
            int iHashCode18 = this.dailyProfitLossRate.hashCode();
            OverviewPrice overviewPrice2 = this.closeWithoutAfter;
            if (overviewPrice2 == null) {
                int i7 = onNavigationEvent + 115;
                i = iHashCode17;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                iHashCode = 0;
            } else {
                i = iHashCode17;
                iHashCode = overviewPrice2.hashCode();
            }
            OverviewPrice overviewPrice3 = this.baseWithoutAfter;
            int iHashCode19 = overviewPrice3 == null ? 0 : overviewPrice3.hashCode();
            int iHashCode20 = this.shareHoldingsType.hashCode();
            OverviewPrice overviewPrice4 = this.evaluatedAmountAfterFees;
            int iHashCode21 = overviewPrice4 == null ? 0 : overviewPrice4.hashCode();
            OverviewPrice overviewPrice5 = this.profitLossAmountAfterFees;
            int iHashCode22 = overviewPrice5 == null ? 0 : overviewPrice5.hashCode();
            OverviewRate overviewRate = this.profitLossRateAfterFees;
            int iHashCode23 = overviewRate == null ? 0 : overviewRate.hashCode();
            BadgeIcon badgeIcon = this.badgeIcon;
            if (badgeIcon == null) {
                int i9 = onNavigationEvent + 105;
                i2 = iHashCode;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                iHashCode2 = 0;
            } else {
                i2 = iHashCode;
                iHashCode2 = badgeIcon.hashCode();
            }
            OverviewNotice overviewNotice = this.notice;
            if (overviewNotice == null) {
                int i11 = onNavigationEvent + 115;
                i3 = iHashCode2;
                onExtraCallback = i11 % 128;
                int i12 = i11 % 2;
                iHashCode3 = 0;
            } else {
                i3 = iHashCode2;
                iHashCode3 = overviewNotice.hashCode();
            }
            int iHashCode24 = this.displayName.hashCode();
            int iHashCode25 = this.guid.hashCode();
            int iHashCode26 = this.isin.hashCode();
            String str2 = this.durationToMaturity;
            int iHashCode27 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.symbol;
            if (str3 == null) {
                i4 = iHashCode3;
                i5 = 0;
            } else {
                int iHashCode28 = str3.hashCode();
                int i13 = onNavigationEvent + 111;
                i4 = iHashCode3;
                onExtraCallback = i13 % 128;
                int i14 = i13 % 2;
                i5 = iHashCode28;
            }
            String str4 = this.underlyingGuid;
            return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode4 * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + i) * 31) + iHashCode18) * 31) + i2) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + i3) * 31) + i4) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + i5) * 31) + (str4 != null ? str4.hashCode() : 0)) * 31) + this.expectedMaturityAmount.hashCode()) * 31) + this.expectedMaturityCommission.hashCode()) * 31) + this.expectedMaturityProfitLoss.hashCode()) * 31) + this.expectedMaturityProfitLossRate.hashCode()) * 31) + this.expectedMaturityTax.hashCode();
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Bond(key=" + this.key + ", logoImageUrl=" + this.logoImageUrl + ", basePrice=" + this.basePrice + ", currentPrice=" + this.currentPrice + ", commission=" + this.commission + ", delisting=" + this.delisting + ", tax=" + this.tax + ", tradableQuantity=" + this.tradableQuantity + ", evaluatedAmount=" + this.evaluatedAmount + ", profitLossAmount=" + this.profitLossAmount + ", profitLossRate=" + this.profitLossRate + ", purchaseAmount=" + this.purchaseAmount + ", purchasePrice=" + this.purchasePrice + ", dailyProfitLossAmount=" + this.dailyProfitLossAmount + ", dailyProfitLossRate=" + this.dailyProfitLossRate + ", closeWithoutAfter=" + this.closeWithoutAfter + ", baseWithoutAfter=" + this.baseWithoutAfter + ", shareHoldingsType=" + this.shareHoldingsType + ", evaluatedAmountAfterFees=" + this.evaluatedAmountAfterFees + ", profitLossAmountAfterFees=" + this.profitLossAmountAfterFees + ", profitLossRateAfterFees=" + this.profitLossRateAfterFees + ", badgeIcon=" + this.badgeIcon + ", notice=" + this.notice + ", displayName=" + this.displayName + ", guid=" + this.guid + ", isin=" + this.isin + ", durationToMaturity=" + this.durationToMaturity + ", symbol=" + this.symbol + ", underlyingGuid=" + this.underlyingGuid + ", expectedMaturityAmount=" + this.expectedMaturityAmount + ", expectedMaturityCommission=" + this.expectedMaturityCommission + ", expectedMaturityProfitLoss=" + this.expectedMaturityProfitLoss + ", expectedMaturityProfitLossRate=" + this.expectedMaturityProfitLossRate + ", expectedMaturityTax=" + this.expectedMaturityTax + ")";
            int i2 = onNavigationEvent + 27;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public static final class Companion {
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Bond> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 95;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                OverviewItemInfo$Bond$$serializer overviewItemInfo$Bond$$serializer = OverviewItemInfo$Bond$$serializer.INSTANCE;
                int i4 = onNavigationEvent + 47;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return overviewItemInfo$Bond$$serializer;
            }
        }

        static {
            int i = IAuthTabCallback + 31;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        public /* synthetic */ Bond(int i, int i2, String str, String str2, OverviewPrice overviewPrice, OverviewPrice overviewPrice2, OverviewPrice overviewPrice3, boolean z, OverviewPrice overviewPrice4, double d, OverviewPrice overviewPrice5, OverviewPrice overviewPrice6, OverviewRate overviewRate, OverviewPrice overviewPrice7, OverviewPrice overviewPrice8, OverviewPrice overviewPrice9, OverviewRate overviewRate2, OverviewPrice overviewPrice10, OverviewPrice overviewPrice11, ShareHoldingsType shareHoldingsType, OverviewPrice overviewPrice12, OverviewPrice overviewPrice13, OverviewRate overviewRate3, BadgeIcon badgeIcon, OverviewNotice overviewNotice, String str3, String str4, String str5, String str6, String str7, String str8, OverviewPrice overviewPrice14, OverviewPrice overviewPrice15, OverviewPrice overviewPrice16, OverviewPrice overviewPrice17, OverviewPrice overviewPrice18, String str9, String str10, okycx okycxVar) {
            String str11 = str3;
            String str12 = str4;
            if ((!(-8126465 == (i & (-8126465)))) | (3 != (i2 & 3))) {
                int i3 = onExtraCallback + 87;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                htf31.onNavigationEvent(new int[]{i, i2}, new int[]{-8126465, 3}, OverviewItemInfo$Bond$$serializer.INSTANCE.getDescriptor());
            }
            this.key = str;
            this.logoImageUrl = str2;
            this.basePrice = overviewPrice;
            this.currentPrice = overviewPrice2;
            this.commission = overviewPrice3;
            this.delisting = z;
            this.tax = overviewPrice4;
            this.tradableQuantity = d;
            this.evaluatedAmount = overviewPrice5;
            this.profitLossAmount = overviewPrice6;
            this.profitLossRate = overviewRate;
            this.purchaseAmount = overviewPrice7;
            this.purchasePrice = overviewPrice8;
            this.dailyProfitLossAmount = overviewPrice9;
            this.dailyProfitLossRate = overviewRate2;
            this.closeWithoutAfter = overviewPrice10;
            this.baseWithoutAfter = overviewPrice11;
            this.shareHoldingsType = shareHoldingsType;
            if ((262144 & i) == 0) {
                this.evaluatedAmountAfterFees = null;
            } else {
                this.evaluatedAmountAfterFees = overviewPrice12;
            }
            if ((524288 & i) == 0) {
                this.profitLossAmountAfterFees = null;
            } else {
                this.profitLossAmountAfterFees = overviewPrice13;
            }
            if ((1048576 & i) == 0) {
                int i5 = onNavigationEvent + 55;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                this.profitLossRateAfterFees = null;
                if (i6 != 0) {
                    throw null;
                }
            } else {
                this.profitLossRateAfterFees = overviewRate3;
                int i7 = 2 % 2;
            }
            if ((2097152 & i) == 0) {
                this.badgeIcon = null;
            } else {
                this.badgeIcon = badgeIcon;
            }
            int i8 = 2 % 2;
            if ((4194304 & i) == 0) {
                int i9 = onNavigationEvent + 53;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                this.notice = null;
                if (i10 != 0) {
                    throw null;
                }
            } else {
                this.notice = overviewNotice;
            }
            this.displayName = str11;
            this.guid = str12;
            this.isin = str5;
            this.durationToMaturity = str6;
            this.symbol = str7;
            this.underlyingGuid = str8;
            this.expectedMaturityAmount = overviewPrice14;
            this.expectedMaturityCommission = overviewPrice15;
            this.expectedMaturityProfitLoss = overviewPrice16;
            this.expectedMaturityProfitLossRate = overviewPrice17;
            this.expectedMaturityTax = overviewPrice18;
            this.productCode = (i2 & 4) != 0 ? str9 : str12;
            this.productName = (i2 & 8) != 0 ? str10 : str11;
            this.isUsStock$delegate = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.securities.widget.data.model.overview.OverviewItemInfo$Bond$$ExternalSyntheticLambda1
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                public final Object invoke() {
                    int i11 = 2 % 2;
                    int i12 = onNavigationEvent + 91;
                    onWarmupCompleted = i12 % 128;
                    int i13 = i12 % 2;
                    Boolean boolValueOf = Boolean.valueOf(((Boolean) OverviewItemInfo.Bond.onWarmupCompleted(new Object[]{this.f$0}, 1666046189, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1666046188, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent())).booleanValue());
                    int i14 = onWarmupCompleted + 17;
                    onNavigationEvent = i14 % 128;
                    if (i14 % 2 == 0) {
                        int i15 = 56 / 0;
                    }
                    return boolValueOf;
                }
            });
        }

        public static final /* synthetic */ Lazy[] onActivityLayout() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 17;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            int i5 = i2 + 77;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return lazyArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x012a  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0154  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onExtraCallback(Bond bond, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            vylVar.onExtraCallback(serialDescriptor, 0, bond.onTransact());
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, bond.IAuthTabCallbackStub());
            OverviewPrice$$serializer overviewPrice$$serializer = OverviewPrice$$serializer.INSTANCE;
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, overviewPrice$$serializer, bond.IAuthTabCallback());
            vylVar.onNavigationEvent(serialDescriptor, 3, overviewPrice$$serializer, bond.onExtraCallbackWithResult());
            vylVar.onNavigationEvent(serialDescriptor, 4, overviewPrice$$serializer, bond.ICustomTabsCallbackDefault());
            vylVar.onNavigationEvent(serialDescriptor, 5, bond.IAuthTabCallbackDefault());
            vylVar.onNavigationEvent(serialDescriptor, 6, overviewPrice$$serializer, bond.extraCommand());
            vylVar.onExtraCallbackWithResult(serialDescriptor, 7, bond.ICustomTabsCallback().doubleValue());
            vylVar.onNavigationEvent(serialDescriptor, 8, overviewPrice$$serializer, bond.asInterface());
            vylVar.onNavigationEvent(serialDescriptor, 9, overviewPrice$$serializer, bond.IAuthTabCallback_Parcel());
            OverviewRate$$serializer overviewRate$$serializer = OverviewRate$$serializer.INSTANCE;
            vylVar.onNavigationEvent(serialDescriptor, 10, overviewRate$$serializer, bond.extraCallback());
            vylVar.onNavigationEvent(serialDescriptor, 11, overviewPrice$$serializer, bond.onRelationshipValidationResult());
            vylVar.onNavigationEvent(serialDescriptor, 12, overviewPrice$$serializer, bond.ICustomTabsCallback_Parcel());
            vylVar.onNavigationEvent(serialDescriptor, 13, overviewPrice$$serializer, bond.onNavigationEvent());
            vylVar.onNavigationEvent(serialDescriptor, 14, overviewRate$$serializer, bond.onExtraCallback());
            vylVar.onExtraCallbackWithResult(serialDescriptor, 15, overviewPrice$$serializer, bond.onUnminimized());
            vylVar.onExtraCallbackWithResult(serialDescriptor, 16, overviewPrice$$serializer, bond.onMinimized());
            vylVar.onNavigationEvent(serialDescriptor, 17, (py) lazyArr[17].getValue(), bond.extraCallbackWithResult());
            if (vylVar.onWarmupCompleted(serialDescriptor, 18) || bond.asBinder() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 18, overviewPrice$$serializer, bond.asBinder());
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 19) || bond.readTypedObject() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 19, overviewPrice$$serializer, bond.readTypedObject());
                int i2 = onNavigationEvent + 43;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 3 / 5;
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 20) || bond.writeTypedObject() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 20, overviewRate$$serializer, bond.writeTypedObject());
                int i4 = onNavigationEvent + 89;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 3;
                }
            }
            Object obj = null;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 21)) {
                int i6 = onNavigationEvent + 15;
                onExtraCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    bond.onWarmupCompleted();
                    obj.hashCode();
                    throw null;
                }
                if (bond.onWarmupCompleted() != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 21, BadgeIcon$$serializer.INSTANCE, bond.onWarmupCompleted());
                }
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 22)) {
                int i7 = onNavigationEvent + 119;
                onExtraCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    bond.access000();
                    obj.hashCode();
                    throw null;
                }
                if (bond.access000() != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 22, OverviewNotice$$serializer.INSTANCE, bond.access000());
                }
            }
            vylVar.onExtraCallback(serialDescriptor, 23, bond.displayName);
            vylVar.onExtraCallback(serialDescriptor, 24, bond.guid);
            vylVar.onExtraCallback(serialDescriptor, 25, bond.isin);
            vylVar.onExtraCallbackWithResult(serialDescriptor, 26, getwrigglelayout, bond.durationToMaturity);
            vylVar.onExtraCallbackWithResult(serialDescriptor, 27, getwrigglelayout, bond.symbol);
            vylVar.onExtraCallbackWithResult(serialDescriptor, 28, getwrigglelayout, bond.underlyingGuid);
            vylVar.onNavigationEvent(serialDescriptor, 29, overviewPrice$$serializer, bond.expectedMaturityAmount);
            vylVar.onNavigationEvent(serialDescriptor, 30, overviewPrice$$serializer, bond.expectedMaturityCommission);
            vylVar.onNavigationEvent(serialDescriptor, 31, overviewPrice$$serializer, bond.expectedMaturityProfitLoss);
            vylVar.onNavigationEvent(serialDescriptor, 32, overviewPrice$$serializer, bond.expectedMaturityProfitLossRate);
            vylVar.onNavigationEvent(serialDescriptor, 33, overviewPrice$$serializer, bond.expectedMaturityTax);
            if (vylVar.onWarmupCompleted(serialDescriptor, 34) || !Intrinsics.areEqual(bond.access100(), bond.guid)) {
                vylVar.onExtraCallback(serialDescriptor, 34, bond.access100());
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 35) || !Intrinsics.areEqual(bond.IAuthTabCallbackStubProxy(), bond.displayName)) {
                vylVar.onExtraCallback(serialDescriptor, 35, bond.IAuthTabCallbackStubProxy());
            }
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public /* bridge */ delimiterOffset getInterfaceDescriptor() throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 79;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            delimiterOffset interfaceDescriptor = super.getInterfaceDescriptor();
            int i4 = onExtraCallback + 41;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return interfaceDescriptor;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public /* bridge */ OverviewPrice onExtraCallback(boolean z) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 113;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return super.onExtraCallback(z);
            }
            super.onExtraCallback(z);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public /* bridge */ StockTic onMessageChannelReady() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 87;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            StockTic stockTicOnMessageChannelReady = super.onMessageChannelReady();
            int i4 = onNavigationEvent + 61;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return stockTicOnMessageChannelReady;
            }
            throw null;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public /* bridge */ OverviewRate onNavigationEvent(boolean z) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 25;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return super.onNavigationEvent(z);
            }
            super.onNavigationEvent(z);
            throw null;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public /* bridge */ OverviewPrice onWarmupCompleted(boolean z) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 69;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            OverviewPrice overviewPriceOnWarmupCompleted = super.onWarmupCompleted(z);
            if (i3 != 0) {
                int i4 = 30 / 0;
            }
            int i5 = onNavigationEvent + 47;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return overviewPriceOnWarmupCompleted;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public String onTransact() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 39;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            String str = this.key;
            int i5 = i3 + 3;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public String IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 31;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            String str = this.logoImageUrl;
            int i5 = i3 + 55;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 62 / 0;
            }
            return str;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public OverviewPrice IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 83;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            OverviewPrice overviewPrice = this.basePrice;
            int i5 = i2 + 113;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return overviewPrice;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public OverviewPrice onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 111;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            OverviewPrice overviewPrice = this.currentPrice;
            int i5 = i3 + 115;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return overviewPrice;
        }

        public OverviewPrice ICustomTabsCallbackDefault() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 91;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            OverviewPrice overviewPrice = this.commission;
            int i5 = i3 + 61;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return overviewPrice;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public boolean IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 11;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            boolean z = this.delisting;
            int i4 = i3 + 47;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return z;
        }

        public OverviewPrice extraCommand() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 31;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return this.tax;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public Double ICustomTabsCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 115;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Double dValueOf = Double.valueOf(this.tradableQuantity);
            int i4 = onExtraCallback + 63;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return dValueOf;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public OverviewPrice asInterface() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 93;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            OverviewPrice overviewPrice = this.evaluatedAmount;
            if (i3 == 0) {
                int i4 = 99 / 0;
            }
            return overviewPrice;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public OverviewPrice IAuthTabCallback_Parcel() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 57;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.profitLossAmount;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public OverviewRate extraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 19;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.profitLossRate;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public OverviewPrice onRelationshipValidationResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 77;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return this.purchaseAmount;
            }
            throw null;
        }

        public OverviewPrice ICustomTabsCallback_Parcel() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 71;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            OverviewPrice overviewPrice = this.purchasePrice;
            int i5 = i3 + 3;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return overviewPrice;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public OverviewPrice onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 61;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            OverviewPrice overviewPrice = this.dailyProfitLossAmount;
            int i5 = i3 + 67;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return overviewPrice;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public OverviewRate onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 67;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return this.dailyProfitLossRate;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public OverviewPrice onUnminimized() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 123;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            OverviewPrice overviewPrice = this.closeWithoutAfter;
            int i4 = i2 + 77;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 41 / 0;
            }
            return overviewPrice;
        }

        public OverviewPrice onMinimized() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 37;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            OverviewPrice overviewPrice = this.baseWithoutAfter;
            int i5 = i3 + 31;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return overviewPrice;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public ShareHoldingsType extraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 1;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ShareHoldingsType shareHoldingsType = this.shareHoldingsType;
            int i4 = i3 + 75;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return shareHoldingsType;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public OverviewPrice asBinder() {
            OverviewPrice overviewPrice;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 67;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 != 0) {
                overviewPrice = this.evaluatedAmountAfterFees;
                int i4 = 11 / 0;
            } else {
                overviewPrice = this.evaluatedAmountAfterFees;
            }
            int i5 = i3 + 31;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return overviewPrice;
            }
            throw null;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public OverviewPrice readTypedObject() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 99;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            OverviewPrice overviewPrice = this.profitLossAmountAfterFees;
            int i5 = i3 + 87;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return overviewPrice;
            }
            throw null;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public OverviewRate writeTypedObject() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 113;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            OverviewRate overviewRate = this.profitLossRateAfterFees;
            if (i3 == 0) {
                int i4 = 1 / 0;
            }
            return overviewRate;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public BadgeIcon onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 109;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            BadgeIcon badgeIcon = this.badgeIcon;
            int i5 = i3 + 115;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return badgeIcon;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public OverviewNotice access000() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 123;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            OverviewNotice overviewNotice = this.notice;
            int i4 = i3 + 103;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return overviewNotice;
            }
            obj.hashCode();
            throw null;
        }

        public final String ICustomTabsCallbackStub() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 123;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            String str = this.durationToMaturity;
            int i5 = i2 + 13;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 48 / 0;
            }
            return str;
        }

        public final OverviewPrice ICustomTabsCallbackStubProxy() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 45;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                throw null;
            }
            OverviewPrice overviewPrice = this.expectedMaturityProfitLoss;
            int i4 = i3 + 67;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return overviewPrice;
            }
            obj.hashCode();
            throw null;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public String access100() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 51;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            String str = this.productCode;
            int i5 = i2 + 37;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public String IAuthTabCallbackStubProxy() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 119;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            String str = this.productName;
            int i5 = i3 + 13;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 10 / 0;
            }
            return str;
        }

        private static final boolean IAuthTabCallback(Bond bond) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 83;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            String str = bond.guid;
            if (i3 != 0) {
                intersect.onExtraCallbackWithResult(str);
                throw null;
            }
            boolean zOnExtraCallbackWithResult = intersect.onExtraCallbackWithResult(str);
            int i4 = onNavigationEvent + 65;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return zOnExtraCallbackWithResult;
        }

        private static final boolean onWarmupCompleted(Bond bond) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 43;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            boolean zOnExtraCallbackWithResult = intersect.onExtraCallbackWithResult(bond.guid);
            if (i3 != 0) {
                int i4 = 63 / 0;
            }
            return zOnExtraCallbackWithResult;
        }

        @Override // im.toss.securities.widget.data.model.overview.OverviewItemInfo
        public boolean onPostMessage() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 77;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            boolean zBooleanValue = ((Boolean) this.isUsStock$delegate.getValue()).booleanValue();
            if (i3 == 0) {
                int i4 = 60 / 0;
            }
            return zBooleanValue;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws NoWhenBranchMatchedException {
            OverviewPrice overviewPriceOnExtraCallback;
            Bond bond = (Bond) objArr[0];
            boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
            r2ExternalSyntheticLambda1 r2externalsyntheticlambda1 = (r2ExternalSyntheticLambda1) objArr[2];
            Currency currency = (Currency) objArr[3];
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(r2externalsyntheticlambda1, "");
            Intrinsics.checkNotNullParameter(currency, "");
            int i2 = onNavigationEvent.onExtraCallbackWithResult[r2externalsyntheticlambda1.ordinal()];
            if (i2 != 1) {
                int i3 = onExtraCallback;
                int i4 = i3 + 105;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0 ? i2 != 2 : i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                int i5 = i3 + 75;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
                overviewPriceOnExtraCallback = zBooleanValue ? bond.onExtraCallbackWithResult(bond.expectedMaturityTax, bond.expectedMaturityCommission, bond.expectedMaturityAmount) : bond.expectedMaturityAmount;
            } else {
                overviewPriceOnExtraCallback = bond.onExtraCallback(zBooleanValue);
            }
            if (overviewPriceOnExtraCallback == null) {
                return null;
            }
            int i6 = onNavigationEvent + 37;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                return overviewPriceOnExtraCallback.IAuthTabCallback(currency);
            }
            overviewPriceOnExtraCallback.IAuthTabCallback(currency);
            throw null;
        }

        private final OverviewPrice onExtraCallbackWithResult(OverviewPrice overviewPrice, OverviewPrice overviewPrice2, OverviewPrice overviewPrice3) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 13;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Double dValueOf = Double.valueOf(0.0d);
            if (overviewPrice == null) {
                overviewPrice = new OverviewPrice(dValueOf, dValueOf);
            }
            if (overviewPrice2 == null) {
                overviewPrice2 = new OverviewPrice(dValueOf, dValueOf);
                int i4 = onNavigationEvent + 3;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
            }
            if (overviewPrice3 == null) {
                return null;
            }
            int i6 = onExtraCallback + 71;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            OverviewPrice overviewPriceOnWarmupCompleted = overviewPrice3.onWarmupCompleted(overviewPrice).onWarmupCompleted(overviewPrice2);
            if (i7 == 0) {
                int i8 = 75 / 0;
            }
            return overviewPriceOnWarmupCompleted;
        }

        public final Double onWarmupCompleted(boolean z, @NotNull r2ExternalSyntheticLambda1 r2externalsyntheticlambda1, @NotNull Currency currency) {
            return (Double) onWarmupCompleted(new Object[]{this, Boolean.valueOf(z), r2externalsyntheticlambda1, currency}, -895773258, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 895773258, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
        }
    }
}
