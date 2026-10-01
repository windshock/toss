package im.toss.securities.widget.data.model.overview;

import im.toss.features.edoc.register.AptPasswordActivity$;
import im.toss.securities.widget.data.model.overview.WidgetOverview;
import im.toss.securities.widget.data.model.overview.WidgetOverview$;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
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
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.isHealthy;
import o.liq;
import o.okycx;
import o.py;
import o.sp;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class WidgetOverview {
    public static final Companion Companion;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final Overview overview;
    private final Boolean representativeMode;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onNavigationEvent + 25;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WidgetOverview() {
        this((Overview) null, (Boolean) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 95;
        onWarmupCompleted = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 27;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return true;
            }
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof WidgetOverview)) {
            int i5 = i2 + 109;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        WidgetOverview widgetOverview = (WidgetOverview) obj;
        if (!Intrinsics.areEqual(this.overview, widgetOverview.overview)) {
            return false;
        }
        if (Intrinsics.areEqual(this.representativeMode, widgetOverview.representativeMode)) {
            return true;
        }
        int i7 = onExtraCallbackWithResult + 65;
        onWarmupCompleted = i7 % 128;
        return i7 % 2 == 0;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 89;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Overview overview = this.overview;
        int iHashCode2 = 0;
        if (overview == null) {
            int i5 = i2 + 65;
            int i6 = i5 % 128;
            onExtraCallbackWithResult = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 63;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            iHashCode = 0;
        } else {
            iHashCode = overview.hashCode();
        }
        Boolean bool = this.representativeMode;
        if (bool != null) {
            int i10 = onExtraCallbackWithResult + 41;
            onWarmupCompleted = i10 % 128;
            if (i10 % 2 == 0) {
                bool.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            iHashCode2 = bool.hashCode();
        }
        return (iHashCode * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "WidgetOverview(overview=" + this.overview + ", representativeMode=" + this.representativeMode + ")";
        int i2 = onWarmupCompleted + 123;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 28 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<WidgetOverview> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 79;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            WidgetOverview$.serializer serializerVar = WidgetOverview$.serializer.INSTANCE;
            if (i3 == 0) {
                return serializerVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ WidgetOverview(int i, Overview overview, Boolean bool, okycx okycxVar) {
        Object obj = null;
        if ((i & 1) == 0) {
            this.overview = null;
        } else {
            this.overview = overview;
        }
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            this.representativeMode = bool;
            int i3 = onExtraCallbackWithResult + 23;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 43;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        this.representativeMode = null;
        if (i5 == 0) {
            int i6 = 96 / 0;
        }
    }

    public WidgetOverview(@Nullable Overview overview, @Nullable Boolean bool) {
        this.overview = overview;
        this.representativeMode = bool;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onNavigationEvent(WidgetOverview widgetOverview, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i2 = onWarmupCompleted + 23;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (widgetOverview.overview != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 0, WidgetOverview$Overview$$serializer.INSTANCE, widgetOverview.overview);
                int i4 = onExtraCallbackWithResult + 15;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || widgetOverview.representativeMode != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getBgColor.IAuthTabCallback, widgetOverview.representativeMode);
            int i6 = onExtraCallbackWithResult + 67;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WidgetOverview(Overview overview, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 109;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            overview = null;
        }
        if ((i & 2) != 0) {
            int i3 = onWarmupCompleted;
            int i4 = i3 + 29;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 113;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            bool = null;
        }
        this(overview, bool);
    }

    @liq
    public static final class Overview {
        private static final Lazy<KSerializer<Object>>[] $childSerializers;
        public static final Companion Companion = new Companion(null);
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final OverviewPrice evaluatedAmount;
        private final String evaluatedAmountTxt;
        private final Integer itemsCount;
        private final List<String> logoImageUrls;
        private final checkDuration profitChangeType;
        private final OverviewPrice profitLossAmount;
        private final String profitLossAmountRateTxt;
        private final OverviewPrice profitLossRate;
        private final OverviewPrice totalCommission;
        private final OverviewPrice totalTax;

        public Overview() {
            this((OverviewPrice) null, (OverviewPrice) null, (OverviewPrice) null, (String) null, (String) null, (checkDuration) null, (Integer) null, (List) null, (OverviewPrice) null, (OverviewPrice) null, 1023, (DefaultConstructorMarker) null);
        }

        private static final /* synthetic */ KSerializer IAuthTabCallbackStubProxy() {
            int i = 2 % 2;
            checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent));
            int i2 = onNavigationEvent + 59;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return checkcanopenlandingpage;
        }

        private static final /* synthetic */ KSerializer access100() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 23;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.tosssecurities.core.base.ChangeType", checkDuration.values());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.tosssecurities.core.base.ChangeType", checkDuration.values());
            int i3 = onNavigationEvent + 5;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return kSerializerOnExtraCallbackWithResult;
        }

        public static /* synthetic */ Object onExtraCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
            int i7 = ~i2;
            int i8 = ~i3;
            int i9 = ~(i7 | i8);
            int i10 = (~(i7 | i4)) | i9;
            int i11 = (~((~i4) | i7 | i3)) | (~(i8 | i2));
            int i12 = i2 + i3 + i6 + (531708263 * i) + ((-608630064) * i5);
            int i13 = i12 * i12;
            int i14 = (i2 * (-228234701)) + 730857472 + ((-228234701) * i3) + (i9 * (-1010133554)) + (i10 * (-1010133554)) + ((-1010133554) * i11) + ((-1238368256) * i6) + ((-45088768) * i) + ((-419430400) * i5) + ((-1471938560) * i13);
            int i15 = ((i2 * (-1679524527)) - 150938974) + (i3 * (-1679524527)) + (i9 * 282) + (i10 * 282) + (i11 * 282) + (i6 * (-1679524245)) + (i * (-166744051)) + (i5 * 2062148848) + (i13 * (-865337344));
            int i16 = i14 + (i15 * i15 * (-1617166336));
            return i16 != 1 ? i16 != 2 ? onExtraCallback(objArr) : onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr);
        }

        public static /* synthetic */ KSerializer onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 113;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy();
            int i4 = onNavigationEvent + 27;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 8 / 0;
            }
            return kSerializerIAuthTabCallbackStubProxy;
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 27;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                access100();
                throw null;
            }
            KSerializer kSerializerAccess100 = access100();
            int i3 = onNavigationEvent + 123;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                return kSerializerAccess100;
            }
            obj.hashCode();
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Overview)) {
                int i2 = onNavigationEvent + 55;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    return false;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Overview overview = (Overview) obj;
            if (!Intrinsics.areEqual(this.evaluatedAmount, overview.evaluatedAmount) || !Intrinsics.areEqual(this.profitLossAmount, overview.profitLossAmount) || !Intrinsics.areEqual(this.profitLossRate, overview.profitLossRate) || !Intrinsics.areEqual(this.evaluatedAmountTxt, overview.evaluatedAmountTxt)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.profitLossAmountRateTxt, overview.profitLossAmountRateTxt)) {
                int i3 = onWarmupCompleted + 13;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if (this.profitChangeType != overview.profitChangeType) {
                int i5 = onNavigationEvent + 63;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.itemsCount, overview.itemsCount)) {
                return Intrinsics.areEqual(this.logoImageUrls, overview.logoImageUrls) && Intrinsics.areEqual(this.totalCommission, overview.totalCommission) && Intrinsics.areEqual(this.totalTax, overview.totalTax);
            }
            int i7 = onWarmupCompleted + 1;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
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
            int iHashCode6 = overviewPrice == null ? 0 : overviewPrice.hashCode();
            OverviewPrice overviewPrice2 = this.profitLossAmount;
            int iHashCode7 = overviewPrice2 == null ? 0 : overviewPrice2.hashCode();
            OverviewPrice overviewPrice3 = this.profitLossRate;
            if (overviewPrice3 == null) {
                int i2 = onNavigationEvent + 13;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                iHashCode = 0;
            } else {
                iHashCode = overviewPrice3.hashCode();
            }
            String str = this.evaluatedAmountTxt;
            if (str == null) {
                int i4 = onNavigationEvent + 11;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                iHashCode2 = 0;
            } else {
                iHashCode2 = str.hashCode();
            }
            String str2 = this.profitLossAmountRateTxt;
            if (str2 == null) {
                int i6 = onWarmupCompleted + 117;
                onNavigationEvent = i6 % 128;
                iHashCode3 = i6 % 2 == 0 ? 1 : 0;
            } else {
                iHashCode3 = str2.hashCode();
            }
            checkDuration checkduration = this.profitChangeType;
            int iHashCode8 = checkduration == null ? 0 : checkduration.hashCode();
            Integer num = this.itemsCount;
            if (num == null) {
                int i7 = onWarmupCompleted + 85;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                iHashCode4 = 0;
            } else {
                iHashCode4 = num.hashCode();
                int i9 = onWarmupCompleted + 19;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
            }
            List<String> list = this.logoImageUrls;
            int iHashCode9 = list == null ? 0 : list.hashCode();
            OverviewPrice overviewPrice4 = this.totalCommission;
            if (overviewPrice4 == null) {
                int i11 = onNavigationEvent + 125;
                onWarmupCompleted = i11 % 128;
                int i12 = i11 % 2;
                iHashCode5 = 0;
            } else {
                iHashCode5 = overviewPrice4.hashCode();
            }
            OverviewPrice overviewPrice5 = this.totalTax;
            return (((((((((((((((((iHashCode6 * 31) + iHashCode7) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode8) * 31) + iHashCode4) * 31) + iHashCode9) * 31) + iHashCode5) * 31) + (overviewPrice5 != null ? overviewPrice5.hashCode() : 0);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Overview(evaluatedAmount=" + this.evaluatedAmount + ", profitLossAmount=" + this.profitLossAmount + ", profitLossRate=" + this.profitLossRate + ", evaluatedAmountTxt=" + this.evaluatedAmountTxt + ", profitLossAmountRateTxt=" + this.profitLossAmountRateTxt + ", profitChangeType=" + this.profitChangeType + ", itemsCount=" + this.itemsCount + ", logoImageUrls=" + this.logoImageUrls + ", totalCommission=" + this.totalCommission + ", totalTax=" + this.totalTax + ")";
            int i2 = onNavigationEvent + 93;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Overview> serializer() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 83;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                WidgetOverview$Overview$$serializer widgetOverview$Overview$$serializer = WidgetOverview$Overview$$serializer.INSTANCE;
                if (i3 != 0) {
                    return widgetOverview$Overview$$serializer;
                }
                throw null;
            }
        }

        static {
            TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
            $childSerializers = new Lazy[]{null, null, null, null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.securities.widget.data.model.overview.WidgetOverview$Overview$$ExternalSyntheticLambda0
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 65;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
                    int iOnWarmupCompleted2 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
                    KSerializer kSerializer = (KSerializer) WidgetOverview.Overview.onExtraCallback(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -893327751, new Object[0], 893327752, iOnWarmupCompleted, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted2);
                    int i4 = onNavigationEvent + 79;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return kSerializer;
                }
            }), null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.securities.widget.data.model.overview.WidgetOverview$Overview$$ExternalSyntheticLambda1
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 21;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    KSerializer kSerializerOnNavigationEvent = WidgetOverview.Overview.onNavigationEvent();
                    int i4 = onExtraCallback + 43;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return kSerializerOnNavigationEvent;
                }
            }), null, null};
            int i = onExtraCallbackWithResult + 77;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        public /* synthetic */ Overview(int i, OverviewPrice overviewPrice, OverviewPrice overviewPrice2, OverviewPrice overviewPrice3, String str, String str2, checkDuration checkduration, Integer num, List list, OverviewPrice overviewPrice4, OverviewPrice overviewPrice5, okycx okycxVar) {
            if ((i & 1) == 0) {
                this.evaluatedAmount = null;
            } else {
                this.evaluatedAmount = overviewPrice;
            }
            if ((i & 2) == 0) {
                this.profitLossAmount = null;
            } else {
                this.profitLossAmount = overviewPrice2;
                int i2 = 2 % 2;
            }
            if ((i & 4) == 0) {
                this.profitLossRate = null;
            } else {
                this.profitLossRate = overviewPrice3;
            }
            if ((i & 8) == 0) {
                int i3 = onNavigationEvent + 85;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                this.evaluatedAmountTxt = null;
                if (i4 != 0) {
                    int i5 = 28 / 0;
                }
            } else {
                this.evaluatedAmountTxt = str;
            }
            if ((i & 16) == 0) {
                int i6 = onWarmupCompleted + 93;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                this.profitLossAmountRateTxt = null;
            } else {
                this.profitLossAmountRateTxt = str2;
                int i8 = 2 % 2;
            }
            if ((i & 32) == 0) {
                this.profitChangeType = null;
            } else {
                this.profitChangeType = checkduration;
                int i9 = onWarmupCompleted + 45;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                int i11 = 2 % 2;
            }
            if ((i & 64) == 0) {
                this.itemsCount = null;
            } else {
                this.itemsCount = num;
                int i12 = onWarmupCompleted + 67;
                onNavigationEvent = i12 % 128;
                int i13 = i12 % 2;
            }
            int i14 = 2 % 2;
            if ((i & 128) == 0) {
                this.logoImageUrls = null;
            } else {
                this.logoImageUrls = list;
            }
            if ((i & 256) == 0) {
                int i15 = onNavigationEvent + 33;
                onWarmupCompleted = i15 % 128;
                int i16 = i15 % 2;
                this.totalCommission = null;
            } else {
                this.totalCommission = overviewPrice4;
            }
            if ((i & 512) == 0) {
                this.totalTax = null;
            } else {
                this.totalTax = overviewPrice5;
            }
        }

        public Overview(@Nullable OverviewPrice overviewPrice, @Nullable OverviewPrice overviewPrice2, @Nullable OverviewPrice overviewPrice3, @Nullable String str, @Nullable String str2, @Nullable checkDuration checkduration, @Nullable Integer num, @Nullable List<String> list, @Nullable OverviewPrice overviewPrice4, @Nullable OverviewPrice overviewPrice5) {
            this.evaluatedAmount = overviewPrice;
            this.profitLossAmount = overviewPrice2;
            this.profitLossRate = overviewPrice3;
            this.evaluatedAmountTxt = str;
            this.profitLossAmountRateTxt = str2;
            this.profitChangeType = checkduration;
            this.itemsCount = num;
            this.logoImageUrls = list;
            this.totalCommission = overviewPrice4;
            this.totalTax = overviewPrice5;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0024 A[PHI: r1
          0x0024: PHI (r1v17 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
          (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v18 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
         binds: [B:8:0x001e, B:10:0x0022, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00f2  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r1
          0x0020: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
          (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v18 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
         binds: [B:8:0x001e, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onWarmupCompleted(Overview overview, vyl vylVar, SerialDescriptor serialDescriptor) {
            Lazy<KSerializer<Object>>[] lazyArr;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 115;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                lazyArr = $childSerializers;
                if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                    if (overview.evaluatedAmount != null) {
                        vylVar.onExtraCallbackWithResult(serialDescriptor, 0, OverviewPrice$$serializer.INSTANCE, overview.evaluatedAmount);
                    }
                }
            } else {
                lazyArr = $childSerializers;
                if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 1) || overview.profitLossAmount != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 1, OverviewPrice$$serializer.INSTANCE, overview.profitLossAmount);
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
                int i3 = onWarmupCompleted + 103;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                if (overview.profitLossRate != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 2, OverviewPrice$$serializer.INSTANCE, overview.profitLossRate);
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 3) || overview.evaluatedAmountTxt != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, overview.evaluatedAmountTxt);
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 4)) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, overview.profitLossAmountRateTxt);
            } else {
                int i5 = onNavigationEvent + 93;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    String str = overview.profitLossAmountRateTxt;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (overview.profitLossAmountRateTxt != null) {
                }
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 5)) {
                int i6 = onWarmupCompleted + 105;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                if (overview.profitChangeType != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 5, (py) lazyArr[5].getValue(), overview.profitChangeType);
                }
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 6)) {
                int i8 = onWarmupCompleted + 9;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                if (overview.itemsCount != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 6, getDynamicHeight.onWarmupCompleted, overview.itemsCount);
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 7) || overview.logoImageUrls != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 7, (py) lazyArr[7].getValue(), overview.logoImageUrls);
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 8)) {
                int i10 = onWarmupCompleted + 17;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                if (overview.totalCommission != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 8, OverviewPrice$$serializer.INSTANCE, overview.totalCommission);
                }
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 9)) {
                int i12 = onWarmupCompleted + 13;
                onNavigationEvent = i12 % 128;
                int i13 = i12 % 2;
                OverviewPrice overviewPrice = overview.totalTax;
                if (i13 == 0) {
                    int i14 = 55 / 0;
                    if (overviewPrice == null) {
                        return;
                    }
                } else if (overviewPrice == null) {
                    return;
                }
            }
            vylVar.onExtraCallbackWithResult(serialDescriptor, 9, OverviewPrice$$serializer.INSTANCE, overview.totalTax);
        }

        public static final /* synthetic */ Lazy[] onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 49;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            int i5 = i2 + 91;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 59 / 0;
            }
            return lazyArr;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Overview(OverviewPrice overviewPrice, OverviewPrice overviewPrice2, OverviewPrice overviewPrice3, String str, String str2, checkDuration checkduration, Integer num, List list, OverviewPrice overviewPrice4, OverviewPrice overviewPrice5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            OverviewPrice overviewPrice6;
            OverviewPrice overviewPrice7;
            checkDuration checkduration2;
            Integer num2;
            OverviewPrice overviewPrice8 = null;
            if ((i & 1) != 0) {
                int i2 = onWarmupCompleted + 9;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                overviewPrice6 = null;
            } else {
                overviewPrice6 = overviewPrice;
            }
            OverviewPrice overviewPrice9 = (i & 2) != 0 ? null : overviewPrice2;
            if ((i & 4) != 0) {
                int i4 = onNavigationEvent + 11;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 % 2;
                }
                overviewPrice7 = null;
            } else {
                overviewPrice7 = overviewPrice3;
            }
            String str3 = (i & 8) != 0 ? null : str;
            String str4 = (i & 16) != 0 ? null : str2;
            if ((i & 32) != 0) {
                int i6 = onWarmupCompleted + 95;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    throw null;
                }
                checkduration2 = null;
            } else {
                checkduration2 = checkduration;
            }
            if ((i & 64) != 0) {
                int i7 = 2 % 2;
                num2 = null;
            } else {
                num2 = num;
            }
            List list2 = (i & 128) != 0 ? null : list;
            OverviewPrice overviewPrice10 = (i & 256) != 0 ? null : overviewPrice4;
            if ((i & 512) != 0) {
                int i8 = onWarmupCompleted + 95;
                onNavigationEvent = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 56 / 0;
                }
            } else {
                overviewPrice8 = overviewPrice5;
            }
            this(overviewPrice6, overviewPrice9, overviewPrice7, str3, str4, checkduration2, num2, list2, overviewPrice10, overviewPrice8);
        }

        public final OverviewPrice IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 27;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            OverviewPrice overviewPrice = this.evaluatedAmount;
            if (i3 != 0) {
                int i4 = 97 / 0;
            }
            return overviewPrice;
        }

        public final OverviewPrice IAuthTabCallbackStub() {
            OverviewPrice overviewPrice;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 75;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 != 0) {
                overviewPrice = this.profitLossAmount;
                int i4 = 62 / 0;
            } else {
                overviewPrice = this.profitLossAmount;
            }
            int i5 = i3 + 91;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return overviewPrice;
        }

        public final OverviewPrice onTransact() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 121;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            OverviewPrice overviewPrice = this.profitLossRate;
            int i4 = i2 + 71;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 14 / 0;
            }
            return overviewPrice;
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 87;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            String str = this.evaluatedAmountTxt;
            int i5 = i3 + 73;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 29 / 0;
            }
            return str;
        }

        public final String asInterface() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 3;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            String str = this.profitLossAmountRateTxt;
            int i5 = i3 + 23;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 43 / 0;
            }
            return str;
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
            Overview overview = (Overview) objArr[0];
            int i = 2 % 2;
            int i2 = onNavigationEvent + 45;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            checkDuration checkduration = overview.profitChangeType;
            if (i4 != 0) {
                int i5 = 99 / 0;
            }
            int i6 = i3 + 7;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return checkduration;
        }

        public final Integer IAuthTabCallbackDefault() {
            Integer num;
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 25;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                num = this.itemsCount;
                int i4 = 68 / 0;
            } else {
                num = this.itemsCount;
            }
            int i5 = i2 + 55;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return num;
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
            double dDoubleValue;
            double dDoubleValue2;
            Double dOnNavigationEvent;
            Double dIAuthTabCallback;
            Double dIAuthTabCallback2;
            Double dIAuthTabCallback3;
            Overview overview = (Overview) objArr[0];
            int i = 2 % 2;
            if (!((Boolean) objArr[1]).booleanValue()) {
                return overview.evaluatedAmount;
            }
            int i2 = onWarmupCompleted + 95;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            OverviewPrice overviewPrice = overview.evaluatedAmount;
            double dDoubleValue3 = 0.0d;
            double dDoubleValue4 = (overviewPrice == null || (dIAuthTabCallback3 = overviewPrice.IAuthTabCallback()) == null) ? 0.0d : dIAuthTabCallback3.doubleValue();
            OverviewPrice overviewPrice2 = overview.totalTax;
            if (overviewPrice2 == null || (dIAuthTabCallback2 = overviewPrice2.IAuthTabCallback()) == null) {
                dDoubleValue = 0.0d;
            } else {
                int i4 = onWarmupCompleted + 61;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    dIAuthTabCallback2.doubleValue();
                    throw null;
                }
                dDoubleValue = dIAuthTabCallback2.doubleValue();
            }
            OverviewPrice overviewPrice3 = overview.totalCommission;
            double dDoubleValue5 = (overviewPrice3 == null || (dIAuthTabCallback = overviewPrice3.IAuthTabCallback()) == null) ? 0.0d : dIAuthTabCallback.doubleValue();
            OverviewPrice overviewPrice4 = overview.evaluatedAmount;
            double dDoubleValue6 = (overviewPrice4 == null || (dOnNavigationEvent = overviewPrice4.onNavigationEvent()) == null) ? 0.0d : dOnNavigationEvent.doubleValue();
            OverviewPrice overviewPrice5 = overview.totalTax;
            if (overviewPrice5 != null) {
                int i5 = onWarmupCompleted + 119;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                Double dOnNavigationEvent2 = overviewPrice5.onNavigationEvent();
                dDoubleValue2 = dOnNavigationEvent2 != null ? dOnNavigationEvent2.doubleValue() : 0.0d;
            }
            OverviewPrice overviewPrice6 = overview.totalCommission;
            if (overviewPrice6 != null) {
                int i7 = onNavigationEvent + 55;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                Double dOnNavigationEvent3 = overviewPrice6.onNavigationEvent();
                if (dOnNavigationEvent3 != null) {
                    dDoubleValue3 = dOnNavigationEvent3.doubleValue();
                }
            }
            return new OverviewPrice(Double.valueOf((dDoubleValue4 - dDoubleValue) - dDoubleValue5), Double.valueOf((dDoubleValue6 - dDoubleValue2) - dDoubleValue3));
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00a4  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x00ed  */
        @Deprecated
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final OverviewPrice onWarmupCompleted(boolean z) {
            double dDoubleValue;
            double dDoubleValue2;
            double dDoubleValue3;
            double dDoubleValue4;
            double dDoubleValue5;
            double dDoubleValue6;
            Double dOnNavigationEvent;
            Double dIAuthTabCallback;
            int i = 2 % 2;
            Object obj = null;
            if (!z) {
                OverviewPrice overviewPrice = this.profitLossAmount;
                int i2 = onWarmupCompleted + 59;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    return overviewPrice;
                }
                throw null;
            }
            int i3 = onWarmupCompleted;
            int i4 = i3 + 53;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            OverviewPrice overviewPrice2 = this.profitLossAmount;
            if (overviewPrice2 != null) {
                int i5 = i3 + 17;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    overviewPrice2.IAuthTabCallback();
                    throw null;
                }
                Double dIAuthTabCallback2 = overviewPrice2.IAuthTabCallback();
                dDoubleValue = dIAuthTabCallback2 != null ? dIAuthTabCallback2.doubleValue() : 0.0d;
            }
            OverviewPrice overviewPrice3 = this.totalTax;
            if (overviewPrice3 != null) {
                int i6 = onWarmupCompleted + 65;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    overviewPrice3.IAuthTabCallback();
                    throw null;
                }
                Double dIAuthTabCallback3 = overviewPrice3.IAuthTabCallback();
                if (dIAuthTabCallback3 != null) {
                    int i7 = onWarmupCompleted + 33;
                    onNavigationEvent = i7 % 128;
                    if (i7 % 2 == 0) {
                        dIAuthTabCallback3.doubleValue();
                        throw null;
                    }
                    dDoubleValue2 = dIAuthTabCallback3.doubleValue();
                } else {
                    dDoubleValue2 = 0.0d;
                }
            }
            OverviewPrice overviewPrice4 = this.totalCommission;
            if (overviewPrice4 == null || (dIAuthTabCallback = overviewPrice4.IAuthTabCallback()) == null) {
                dDoubleValue3 = 0.0d;
            } else {
                int i8 = onNavigationEvent + 13;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                dDoubleValue3 = dIAuthTabCallback.doubleValue();
                int i10 = onNavigationEvent + 61;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
            }
            OverviewPrice overviewPrice5 = this.profitLossAmount;
            if (overviewPrice5 != null) {
                int i12 = onNavigationEvent + 123;
                onWarmupCompleted = i12 % 128;
                if (i12 % 2 != 0) {
                    overviewPrice5.onNavigationEvent();
                    obj.hashCode();
                    throw null;
                }
                Double dOnNavigationEvent2 = overviewPrice5.onNavigationEvent();
                dDoubleValue4 = dOnNavigationEvent2 != null ? dOnNavigationEvent2.doubleValue() : 0.0d;
            }
            OverviewPrice overviewPrice6 = this.totalTax;
            if (overviewPrice6 != null) {
                int i13 = onNavigationEvent + 103;
                onWarmupCompleted = i13 % 128;
                if (i13 % 2 != 0) {
                    overviewPrice6.onNavigationEvent();
                    obj.hashCode();
                    throw null;
                }
                Double dOnNavigationEvent3 = overviewPrice6.onNavigationEvent();
                dDoubleValue5 = dOnNavigationEvent3 != null ? dOnNavigationEvent3.doubleValue() : 0.0d;
            }
            OverviewPrice overviewPrice7 = this.totalCommission;
            if (overviewPrice7 != null) {
                int i14 = onNavigationEvent + 1;
                onWarmupCompleted = i14 % 128;
                if (i14 % 2 != 0) {
                    dOnNavigationEvent = overviewPrice7.onNavigationEvent();
                    if (dOnNavigationEvent == null) {
                        dDoubleValue6 = 1.0d;
                    }
                } else {
                    dOnNavigationEvent = overviewPrice7.onNavigationEvent();
                    if (dOnNavigationEvent == null) {
                        dDoubleValue6 = 0.0d;
                    }
                }
                dDoubleValue6 = dOnNavigationEvent.doubleValue();
            }
            return new OverviewPrice(Double.valueOf((dDoubleValue - dDoubleValue2) - dDoubleValue3), Double.valueOf((dDoubleValue4 - dDoubleValue5) - dDoubleValue6));
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x006a A[PHI: r4 r13
          0x006a: PHI (r4v3 im.toss.securities.widget.data.model.overview.OverviewPrice) = 
          (r4v2 im.toss.securities.widget.data.model.overview.OverviewPrice)
          (r4v8 im.toss.securities.widget.data.model.overview.OverviewPrice)
         binds: [B:10:0x0068, B:7:0x003c] A[DONT_GENERATE, DONT_INLINE]
          0x006a: PHI (r13v7 im.toss.securities.widget.data.model.overview.OverviewPrice) = 
          (r13v6 im.toss.securities.widget.data.model.overview.OverviewPrice)
          (r13v20 im.toss.securities.widget.data.model.overview.OverviewPrice)
         binds: [B:10:0x0068, B:7:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0087 A[PHI: r4 r13
          0x0087: PHI (r4v5 im.toss.securities.widget.data.model.overview.OverviewPrice) = 
          (r4v2 im.toss.securities.widget.data.model.overview.OverviewPrice)
          (r4v3 im.toss.securities.widget.data.model.overview.OverviewPrice)
          (r4v8 im.toss.securities.widget.data.model.overview.OverviewPrice)
         binds: [B:10:0x0068, B:14:0x0079, B:7:0x003c] A[DONT_GENERATE, DONT_INLINE]
          0x0087: PHI (r13v18 im.toss.securities.widget.data.model.overview.OverviewPrice) = 
          (r13v6 im.toss.securities.widget.data.model.overview.OverviewPrice)
          (r13v7 im.toss.securities.widget.data.model.overview.OverviewPrice)
          (r13v20 im.toss.securities.widget.data.model.overview.OverviewPrice)
         binds: [B:10:0x0068, B:14:0x0079, B:7:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00a4  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00e8  */
        @Deprecated
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final OverviewPrice onExtraCallbackWithResult(boolean z) {
            OverviewPrice overviewPrice;
            OverviewPrice overviewPriceOnWarmupCompleted;
            double dDoubleValue;
            double dDoubleValue2;
            double dDoubleValue3;
            Double dOnNavigationEvent;
            Double dOnNavigationEvent2;
            Double dIAuthTabCallback;
            int i = 2 % 2;
            if (!z) {
                return this.profitLossRate;
            }
            int i2 = onNavigationEvent + 61;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            double dDoubleValue4 = 0.0d;
            if (i2 % 2 != 0) {
                overviewPrice = (OverviewPrice) onExtraCallback(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -922206577, new Object[]{this, false}, 922206579, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted());
                overviewPriceOnWarmupCompleted = onWarmupCompleted(false);
                if (overviewPrice != null) {
                    int i3 = onNavigationEvent + 87;
                    onWarmupCompleted = i3 % 128;
                    if (i3 % 2 != 0) {
                        overviewPrice.IAuthTabCallback();
                        obj.hashCode();
                        throw null;
                    }
                    Double dIAuthTabCallback2 = overviewPrice.IAuthTabCallback();
                    dDoubleValue = dIAuthTabCallback2 != null ? dIAuthTabCallback2.doubleValue() : 0.0d;
                }
            } else {
                overviewPrice = (OverviewPrice) onExtraCallback(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -922206577, new Object[]{this, true}, 922206579, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted());
                overviewPriceOnWarmupCompleted = onWarmupCompleted(true);
                if (overviewPrice != null) {
                }
            }
            if (overviewPriceOnWarmupCompleted != null) {
                int i4 = onNavigationEvent + 61;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    overviewPriceOnWarmupCompleted.IAuthTabCallback();
                    throw null;
                }
                Double dIAuthTabCallback3 = overviewPriceOnWarmupCompleted.IAuthTabCallback();
                dDoubleValue2 = dIAuthTabCallback3 != null ? dIAuthTabCallback3.doubleValue() : 0.0d;
            }
            Double dOnNavigationEvent3 = isHealthy.onNavigationEvent(Double.valueOf(dDoubleValue - dDoubleValue2), Double.valueOf((overviewPrice == null || (dIAuthTabCallback = overviewPrice.IAuthTabCallback()) == null) ? 0.0d : dIAuthTabCallback.doubleValue()));
            if (overviewPrice != null) {
                int i5 = onNavigationEvent + 101;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                Double dOnNavigationEvent4 = overviewPrice.onNavigationEvent();
                if (dOnNavigationEvent4 != null) {
                    int i7 = onNavigationEvent + 39;
                    onWarmupCompleted = i7 % 128;
                    if (i7 % 2 != 0) {
                        dOnNavigationEvent4.doubleValue();
                        obj.hashCode();
                        throw null;
                    }
                    dDoubleValue3 = dOnNavigationEvent4.doubleValue();
                } else {
                    dDoubleValue3 = 0.0d;
                }
            }
            double dDoubleValue5 = (overviewPriceOnWarmupCompleted == null || (dOnNavigationEvent2 = overviewPriceOnWarmupCompleted.onNavigationEvent()) == null) ? 0.0d : dOnNavigationEvent2.doubleValue();
            if (overviewPrice != null) {
                int i8 = onNavigationEvent + 101;
                onWarmupCompleted = i8 % 128;
                if (i8 % 2 == 0 ? (dOnNavigationEvent = overviewPrice.onNavigationEvent()) != null : (dOnNavigationEvent = overviewPrice.onNavigationEvent()) != null) {
                    dDoubleValue4 = dOnNavigationEvent.doubleValue();
                }
            }
            return new OverviewPrice(dOnNavigationEvent3, isHealthy.onNavigationEvent(Double.valueOf(dDoubleValue3 - dDoubleValue5), Double.valueOf(dDoubleValue4)));
        }

        public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
            int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
            int iOnWarmupCompleted2 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
            return (KSerializer) onExtraCallback(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -893327751, new Object[0], 893327752, iOnWarmupCompleted, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted2);
        }

        @Deprecated
        public final OverviewPrice onNavigationEvent(boolean z) {
            return (OverviewPrice) onExtraCallback(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -922206577, new Object[]{this, Boolean.valueOf(z)}, 922206579, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted());
        }

        public final checkDuration asBinder() {
            int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
            int iOnWarmupCompleted2 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
            return (checkDuration) onExtraCallback(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 993684964, new Object[]{this}, -993684964, iOnWarmupCompleted, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted2);
        }
    }
}
