package im.toss.securities.widget.overview.ui.medium.model;

import im.toss.core.webkit.bridge.accessarybutton.IconDoubleAccessoryButtonConfiguration;
import im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity;
import im.toss.securities.widget.overview.ui.medium.model.OverviewMediumWidgetState;
import im.toss.tosssecurities.core.currency.domain.Currency;
import im.toss.tosssecurities.host.contracts.DisplaySetting;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.HostnamesKt;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.getWriggleLayout;
import o.htf31;
import o.kt;
import o.liq;
import o.nc;
import o.okycx;
import o.py;
import o.r2ExternalSyntheticLambda1;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface OverviewMediumWidgetState {
    public static final Companion Companion = Companion.IAuthTabCallback;

    DisplaySetting onExtraCallback();

    float onNavigationEvent();

    public static final class Companion {
        static final /* synthetic */ Companion IAuthTabCallback = new Companion();
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;

        static {
            int i = onNavigationEvent + 125;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        private Companion() {
        }

        public final KSerializer<OverviewMediumWidgetState> serializer() {
            int i = 2 % 2;
            kt ktVar = new kt("im.toss.securities.widget.overview.ui.medium.model.OverviewMediumWidgetState", Reflection.getOrCreateKotlinClass(OverviewMediumWidgetState.class), new KClass[]{Reflection.getOrCreateKotlinClass(AllHidden.class), Reflection.getOrCreateKotlinClass(Error.class), Reflection.getOrCreateKotlinClass(Loading.class), Reflection.getOrCreateKotlinClass(Maintenance.class), Reflection.getOrCreateKotlinClass(NetworkError.class), Reflection.getOrCreateKotlinClass(NotTradeableUser.class), Reflection.getOrCreateKotlinClass(Success.class)}, new KSerializer[]{OverviewMediumWidgetState$AllHidden$$serializer.INSTANCE, OverviewMediumWidgetState$Error$$serializer.INSTANCE, OverviewMediumWidgetState$Loading$$serializer.INSTANCE, OverviewMediumWidgetState$Maintenance$$serializer.INSTANCE, OverviewMediumWidgetState$NetworkError$$serializer.INSTANCE, OverviewMediumWidgetState$NotTradeableUser$$serializer.INSTANCE, OverviewMediumWidgetState$Success$$serializer.INSTANCE}, new Annotation[0]);
            int i2 = onExtraCallback + 81;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return ktVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @nc(IAuthTabCallback = "Success")
    @liq
    public static final class Success implements OverviewMediumWidgetState {
        private static final Lazy<KSerializer<Object>>[] $childSerializers;
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final String accountKey;
        private final float alpha;
        private final r2ExternalSyntheticLambda1 bondValuationBasis;
        private final Currency currency;
        private final DisplaySetting displaySetting;
        private final String formattedTime;
        private final List<String> imageUrlList;
        private final boolean includeExpense;
        private final boolean isDaily;
        private final Currency itemCurrency;
        private final OverviewUiData overview;
        private final boolean showAmount;
        private final HostnamesKt userMode;
        private final String userName;

        public static /* synthetic */ KSerializer IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 73;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return onActivityLayout();
            }
            onActivityLayout();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final /* synthetic */ KSerializer ICustomTabsCallbackStubProxy() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 93;
            onExtraCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.securities.widget.data.model.overview.BondValuationBasis", r2ExternalSyntheticLambda1.values());
                obj.hashCode();
                throw null;
            }
            KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.securities.widget.data.model.overview.BondValuationBasis", r2ExternalSyntheticLambda1.values());
            int i3 = onExtraCallback + 91;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return kSerializerOnExtraCallbackWithResult;
            }
            obj.hashCode();
            throw null;
        }

        private static final /* synthetic */ KSerializer onActivityLayout() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 71;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.tosssecurities.auth.domain.model.SecuritiesUserMode", HostnamesKt.values());
            int i4 = onExtraCallback + 99;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnExtraCallbackWithResult;
        }

        private static final /* synthetic */ KSerializer onActivityResized() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 49;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerSerializer = Currency.Companion.serializer();
            int i4 = onNavigationEvent + 9;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerSerializer;
        }

        public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
            int i7 = ~i;
            int i8 = ~(i7 | i6);
            int i9 = (~(i3 | i)) | i8;
            int i10 = (~(i | (~i6))) | (~((~i3) | i7)) | i8;
            int i11 = i7 | i3 | i6;
            int i12 = i3 + i6 + i4 + (1050315579 * i2) + (2086215248 * i5);
            int i13 = i12 * i12;
            int i14 = (i3 * (-1156115713)) + 1671168000 + ((-1156115713) * i6) + ((-1856302338) * i9) + (i10 * 1856302338) + (1856302338 * i11) + (700186624 * i4) + ((-1303117824) * i2) + (314572800 * i5) + (431423488 * i13);
            int i15 = ((i3 * (-961373039)) - 1316831794) + (i6 * (-961373039)) + (i9 * (-990)) + (i10 * 990) + (i11 * 990) + (i4 * (-961372049)) + (i2 * 755842709) + (i5 * (-1858722640)) + (i13 * (-2040987648));
            int i16 = i14 + (i15 * i15 * 1361641472);
            return i16 != 1 ? i16 != 2 ? i16 != 3 ? i16 != 4 ? IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr) : onWarmupCompleted(objArr) : onExtraCallback(objArr);
        }

        private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 7;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                onMessageChannelReady();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            KSerializer kSerializerOnMessageChannelReady = onMessageChannelReady();
            int i3 = onNavigationEvent + 23;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return kSerializerOnMessageChannelReady;
        }

        public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 119;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onPostMessage();
            }
            onPostMessage();
            throw null;
        }

        private static final /* synthetic */ KSerializer onMessageChannelReady() {
            int i = 2 % 2;
            checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
            int i2 = onNavigationEvent + 69;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 30 / 0;
            }
            return checkcanopenlandingpage;
        }

        private static final /* synthetic */ KSerializer onMinimized() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 15;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerSerializer = Currency.Companion.serializer();
            int i4 = onExtraCallback + 17;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerSerializer;
        }

        private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
            KSerializer kSerializerOnActivityResized;
            int i = 2 % 2;
            int i2 = onExtraCallback + 41;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                kSerializerOnActivityResized = onActivityResized();
                int i3 = 53 / 0;
            } else {
                kSerializerOnActivityResized = onActivityResized();
            }
            int i4 = onNavigationEvent + 101;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnActivityResized;
        }

        private static final /* synthetic */ KSerializer onPostMessage() {
            KSerializer kSerializerSerializer;
            int i = 2 % 2;
            int i2 = onExtraCallback + 121;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                kSerializerSerializer = DisplaySetting.Companion.serializer();
                int i3 = 26 / 0;
            } else {
                kSerializerSerializer = DisplaySetting.Companion.serializer();
            }
            int i4 = onExtraCallback + 87;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerSerializer;
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 99;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return onMinimized();
            }
            onMinimized();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ KSerializer onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 81;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerICustomTabsCallbackStubProxy = ICustomTabsCallbackStubProxy();
            int i4 = onNavigationEvent + 37;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerICustomTabsCallbackStubProxy;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            if (this.displaySetting != success.displaySetting || Float.compare(this.alpha, success.alpha) != 0) {
                return false;
            }
            if (!Intrinsics.areEqual(this.accountKey, success.accountKey)) {
                int i2 = onExtraCallback + 39;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.overview, success.overview)) {
                int i4 = onExtraCallback + 81;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.formattedTime, success.formattedTime)) {
                int i6 = onNavigationEvent + 115;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.imageUrlList, success.imageUrlList)) {
                int i8 = onExtraCallback + 117;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
            if (this.currency != success.currency || this.itemCurrency != success.itemCurrency || this.includeExpense != success.includeExpense || this.showAmount != success.showAmount || !Intrinsics.areEqual(this.userName, success.userName)) {
                return false;
            }
            if (this.userMode != success.userMode) {
                int i10 = onNavigationEvent + 119;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
                return false;
            }
            if (this.bondValuationBasis != success.bondValuationBasis) {
                return false;
            }
            if (this.isDaily == success.isDaily) {
                return true;
            }
            int i12 = onExtraCallback + 73;
            onNavigationEvent = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 89;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.displaySetting.hashCode();
            int iHashCode2 = Float.hashCode(this.alpha);
            String str = this.accountKey;
            int iHashCode3 = 0;
            int iHashCode4 = str == null ? 0 : str.hashCode();
            int iHashCode5 = this.overview.hashCode();
            int iHashCode6 = this.formattedTime.hashCode();
            int iHashCode7 = this.imageUrlList.hashCode();
            int iHashCode8 = this.currency.hashCode();
            int iHashCode9 = this.itemCurrency.hashCode();
            int iHashCode10 = Boolean.hashCode(this.includeExpense);
            int iHashCode11 = Boolean.hashCode(this.showAmount);
            String str2 = this.userName;
            if (str2 != null) {
                int i4 = onNavigationEvent + 63;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                iHashCode3 = str2.hashCode();
            }
            return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode3) * 31) + this.userMode.hashCode()) * 31) + this.bondValuationBasis.hashCode()) * 31) + Boolean.hashCode(this.isDaily);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Success(displaySetting=" + this.displaySetting + ", alpha=" + this.alpha + ", accountKey=" + this.accountKey + ", overview=" + this.overview + ", formattedTime=" + this.formattedTime + ", imageUrlList=" + this.imageUrlList + ", currency=" + this.currency + ", itemCurrency=" + this.itemCurrency + ", includeExpense=" + this.includeExpense + ", showAmount=" + this.showAmount + ", userName=" + this.userName + ", userMode=" + this.userMode + ", bondValuationBasis=" + this.bondValuationBasis + ", isDaily=" + this.isDaily + ")";
            int i2 = onExtraCallback + 9;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Success> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 11;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    OverviewMediumWidgetState$Success$$serializer overviewMediumWidgetState$Success$$serializer = OverviewMediumWidgetState$Success$$serializer.INSTANCE;
                    throw null;
                }
                OverviewMediumWidgetState$Success$$serializer overviewMediumWidgetState$Success$$serializer2 = OverviewMediumWidgetState$Success$$serializer.INSTANCE;
                int i3 = IAuthTabCallback + 37;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return overviewMediumWidgetState$Success$$serializer2;
            }
        }

        static {
            TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
            $childSerializers = new Lazy[]{LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.securities.widget.overview.ui.medium.model.OverviewMediumWidgetState$Success$$ExternalSyntheticLambda0
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 57;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    KSerializer kSerializerOnExtraCallbackWithResult = OverviewMediumWidgetState.Success.onExtraCallbackWithResult();
                    int i4 = onExtraCallback + 41;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    return kSerializerOnExtraCallbackWithResult;
                }
            }), null, null, null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.securities.widget.overview.ui.medium.model.OverviewMediumWidgetState$Success$$ExternalSyntheticLambda1
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 17;
                    onWarmupCompleted = i2 % 128;
                    if (i2 % 2 == 0) {
                        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
                        int iOnExtraCallback2 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
                        return (KSerializer) OverviewMediumWidgetState.Success.onExtraCallback(iOnExtraCallback, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1240724154, iOnExtraCallback2, new Object[0], CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1240724150);
                    }
                    int iOnExtraCallback3 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
                    int iOnExtraCallback4 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.securities.widget.overview.ui.medium.model.OverviewMediumWidgetState$Success$$ExternalSyntheticLambda2
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 105;
                    IAuthTabCallback = i2 % 128;
                    if (i2 % 2 == 0) {
                        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
                        int iOnExtraCallback2 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
                        return (KSerializer) OverviewMediumWidgetState.Success.onExtraCallback(iOnExtraCallback, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1205599493, iOnExtraCallback2, new Object[0], CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1205599495);
                    }
                    int iOnExtraCallback3 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
                    int iOnExtraCallback4 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.securities.widget.overview.ui.medium.model.OverviewMediumWidgetState$Success$$ExternalSyntheticLambda3
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke() {
                    KSerializer kSerializer;
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 125;
                    onWarmupCompleted = i2 % 128;
                    if (i2 % 2 == 0) {
                        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
                        int iOnExtraCallback2 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
                        kSerializer = (KSerializer) OverviewMediumWidgetState.Success.onExtraCallback(iOnExtraCallback, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -2070628875, iOnExtraCallback2, new Object[0], CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 2070628878);
                        int i3 = 64 / 0;
                    } else {
                        int iOnExtraCallback3 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
                        int iOnExtraCallback4 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
                        kSerializer = (KSerializer) OverviewMediumWidgetState.Success.onExtraCallback(iOnExtraCallback3, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -2070628875, iOnExtraCallback4, new Object[0], CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 2070628878);
                    }
                    int i4 = onWarmupCompleted + 25;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return kSerializer;
                }
            }), null, null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.securities.widget.overview.ui.medium.model.OverviewMediumWidgetState$Success$$ExternalSyntheticLambda4
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 103;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    KSerializer kSerializerIAuthTabCallback = OverviewMediumWidgetState.Success.IAuthTabCallback();
                    int i4 = onNavigationEvent + 97;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return kSerializerIAuthTabCallback;
                }
            }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.securities.widget.overview.ui.medium.model.OverviewMediumWidgetState$Success$$ExternalSyntheticLambda5
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 105;
                    onWarmupCompleted = i2 % 128;
                    if (i2 % 2 == 0) {
                        return OverviewMediumWidgetState.Success.onWarmupCompleted();
                    }
                    OverviewMediumWidgetState.Success.onWarmupCompleted();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }), null};
            int i = onWarmupCompleted + 73;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                int i2 = 71 / 0;
            }
        }

        public /* synthetic */ Success(int i, DisplaySetting displaySetting, float f, String str, OverviewUiData overviewUiData, String str2, List list, Currency currency, Currency currency2, boolean z, boolean z2, String str3, HostnamesKt hostnamesKt, r2ExternalSyntheticLambda1 r2externalsyntheticlambda1, boolean z3, okycx okycxVar) {
            boolean z4;
            if (8060 != (i & 8060)) {
                htf31.onExtraCallbackWithResult(i, 8060, OverviewMediumWidgetState$Success$$serializer.INSTANCE.getDescriptor());
            }
            this.displaySetting = (i & 1) == 0 ? DisplaySetting.SYSTEM : displaySetting;
            if ((i & 2) == 0) {
                this.alpha = 1.0f;
                int i2 = 2 % 2;
            } else {
                this.alpha = f;
            }
            this.accountKey = str;
            this.overview = overviewUiData;
            this.formattedTime = str2;
            this.imageUrlList = list;
            this.currency = currency;
            if ((i & 128) == 0) {
                this.itemCurrency = currency;
                int i3 = 2 % 2;
            } else {
                this.itemCurrency = currency2;
            }
            this.includeExpense = z;
            this.showAmount = z2;
            this.userName = str3;
            this.userMode = hostnamesKt;
            this.bondValuationBasis = r2externalsyntheticlambda1;
            if ((i & 8192) == 0) {
                int i4 = onNavigationEvent;
                int i5 = i4 + 83;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i4 + 67;
                onExtraCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 2 % 2;
                }
                z4 = false;
            } else {
                z4 = z3;
            }
            this.isDaily = z4;
        }

        public Success(@NotNull DisplaySetting displaySetting, float f, @Nullable String str, @NotNull OverviewUiData overviewUiData, @NotNull String str2, @NotNull List<String> list, @NotNull Currency currency, @NotNull Currency currency2, boolean z, boolean z2, @Nullable String str3, @NotNull HostnamesKt hostnamesKt, @NotNull r2ExternalSyntheticLambda1 r2externalsyntheticlambda1, boolean z3) {
            Intrinsics.checkNotNullParameter(displaySetting, "");
            Intrinsics.checkNotNullParameter(overviewUiData, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(currency, "");
            Intrinsics.checkNotNullParameter(currency2, "");
            Intrinsics.checkNotNullParameter(hostnamesKt, "");
            Intrinsics.checkNotNullParameter(r2externalsyntheticlambda1, "");
            this.displaySetting = displaySetting;
            this.alpha = f;
            this.accountKey = str;
            this.overview = overviewUiData;
            this.formattedTime = str2;
            this.imageUrlList = list;
            this.currency = currency;
            this.itemCurrency = currency2;
            this.includeExpense = z;
            this.showAmount = z2;
            this.userName = str3;
            this.userMode = hostnamesKt;
            this.bondValuationBasis = r2externalsyntheticlambda1;
            this.isDaily = z3;
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x002a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
            Success success = (Success) objArr[0];
            vyl vylVar = (vyl) objArr[1];
            SerialDescriptor serialDescriptor = (SerialDescriptor) objArr[2];
            int i = 2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                int i2 = onExtraCallback + 3;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                if (success.onExtraCallback() != DisplaySetting.SYSTEM) {
                    vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[0].getValue(), success.onExtraCallback());
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 1) || Float.compare(success.onNavigationEvent(), 1.0f) != 0) {
                vylVar.onExtraCallback(serialDescriptor, 1, success.onNavigationEvent());
            }
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, success.accountKey);
            vylVar.onNavigationEvent(serialDescriptor, 3, OverviewUiData$$serializer.INSTANCE, success.overview);
            vylVar.onExtraCallback(serialDescriptor, 4, success.formattedTime);
            vylVar.onNavigationEvent(serialDescriptor, 5, (py) lazyArr[5].getValue(), success.imageUrlList);
            vylVar.onNavigationEvent(serialDescriptor, 6, (py) lazyArr[6].getValue(), success.currency);
            if (vylVar.onWarmupCompleted(serialDescriptor, 7) || success.itemCurrency != success.currency) {
                vylVar.onNavigationEvent(serialDescriptor, 7, (py) lazyArr[7].getValue(), success.itemCurrency);
            }
            vylVar.onNavigationEvent(serialDescriptor, 8, success.includeExpense);
            vylVar.onNavigationEvent(serialDescriptor, 9, success.showAmount);
            vylVar.onExtraCallbackWithResult(serialDescriptor, 10, getwrigglelayout, success.userName);
            vylVar.onNavigationEvent(serialDescriptor, 11, (py) lazyArr[11].getValue(), success.userMode);
            vylVar.onNavigationEvent(serialDescriptor, 12, (py) lazyArr[12].getValue(), success.bondValuationBasis);
            if (!vylVar.onWarmupCompleted(serialDescriptor, 13) && !success.isDaily) {
                return null;
            }
            vylVar.onNavigationEvent(serialDescriptor, 13, success.isDaily);
            int i4 = onExtraCallback + 13;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }

        public static final /* synthetic */ Lazy[] asInterface() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 5;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            int i5 = i3 + 3;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 87 / 0;
            }
            return lazyArr;
        }

        @Override // im.toss.securities.widget.overview.ui.medium.model.OverviewMediumWidgetState
        public DisplaySetting onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 69;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            DisplaySetting displaySetting = this.displaySetting;
            int i5 = i2 + 65;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return displaySetting;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // im.toss.securities.widget.overview.ui.medium.model.OverviewMediumWidgetState
        public float onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 21;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            float f = this.alpha;
            int i5 = i3 + 87;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return f;
            }
            throw null;
        }

        public final String onTransact() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 67;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            String str = this.accountKey;
            int i5 = i2 + 125;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final OverviewUiData ICustomTabsCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 69;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return this.overview;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String IAuthTabCallbackStubProxy() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 13;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            String str = this.formattedTime;
            int i5 = i2 + 21;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public final Currency access000() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 97;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Currency currency = this.currency;
            int i5 = i2 + 117;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return currency;
        }

        public final Currency getInterfaceDescriptor() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 25;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            Currency currency = this.itemCurrency;
            int i5 = i3 + 91;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 52 / 0;
            }
            return currency;
        }

        public final boolean access100() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 71;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            boolean z = this.includeExpense;
            int i5 = i2 + 11;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 9 / 0;
            }
            return z;
        }

        public final boolean extraCallbackWithResult() {
            boolean z;
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 103;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                z = this.showAmount;
                int i4 = 68 / 0;
            } else {
                z = this.showAmount;
            }
            int i5 = i2 + 57;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 94 / 0;
            }
            return z;
        }

        public final String readTypedObject() {
            String str;
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 23;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                str = this.userName;
                int i4 = 31 / 0;
            } else {
                str = this.userName;
            }
            int i5 = i2 + 57;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
            Success success = (Success) objArr[0];
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 79;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            HostnamesKt hostnamesKt = success.userMode;
            int i5 = i2 + 47;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return hostnamesKt;
        }

        public final r2ExternalSyntheticLambda1 IAuthTabCallback_Parcel() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 3;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            r2ExternalSyntheticLambda1 r2externalsyntheticlambda1 = this.bondValuationBasis;
            int i5 = i3 + 41;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return r2externalsyntheticlambda1;
        }

        public final boolean writeTypedObject() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 73;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            boolean z = this.isDaily;
            int i5 = i3 + 33;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        public static /* synthetic */ KSerializer asBinder() {
            int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
            int iOnExtraCallback2 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
            return (KSerializer) onExtraCallback(iOnExtraCallback, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1205599493, iOnExtraCallback2, new Object[0], CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1205599495);
        }

        public static /* synthetic */ KSerializer IAuthTabCallbackStub() {
            int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
            int iOnExtraCallback2 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
            return (KSerializer) onExtraCallback(iOnExtraCallback, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -2070628875, iOnExtraCallback2, new Object[0], CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 2070628878);
        }

        public static /* synthetic */ KSerializer IAuthTabCallbackDefault() {
            int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
            int iOnExtraCallback2 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
            return (KSerializer) onExtraCallback(iOnExtraCallback, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1240724154, iOnExtraCallback2, new Object[0], CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1240724150);
        }

        @JvmStatic
        public static final /* synthetic */ void onNavigationEvent(Success success, vyl vylVar, SerialDescriptor serialDescriptor) {
            int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
            int iOnExtraCallback2 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
            onExtraCallback(iOnExtraCallback, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1598662612, iOnExtraCallback2, new Object[]{success, vylVar, serialDescriptor}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1598662612);
        }

        public final HostnamesKt extraCallback() {
            int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
            int iOnExtraCallback2 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
            return (HostnamesKt) onExtraCallback(iOnExtraCallback, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1011696420, iOnExtraCallback2, new Object[]{this}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1011696421);
        }
    }

    @liq
    public static final class AllHidden implements OverviewMediumWidgetState {
        private static final Lazy<KSerializer<Object>>[] $childSerializers;
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private final String accountKey;
        private final float alpha;
        private final DisplaySetting displaySetting;
        private final String formattedTime;
        private final HostnamesKt userMode;
        private final String userName;

        public static /* synthetic */ KSerializer IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 65;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return IAuthTabCallbackDefault();
            }
            IAuthTabCallbackDefault();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final /* synthetic */ KSerializer IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 111;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerSerializer = DisplaySetting.Companion.serializer();
            int i4 = onExtraCallbackWithResult + 91;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerSerializer;
        }

        private static final /* synthetic */ KSerializer getInterfaceDescriptor() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 29;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.tosssecurities.auth.domain.model.SecuritiesUserMode", HostnamesKt.values());
            }
            int i3 = 98 / 0;
            return updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.tosssecurities.auth.domain.model.SecuritiesUserMode", HostnamesKt.values());
        }

        public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 43;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer interfaceDescriptor = getInterfaceDescriptor();
            int i4 = onExtraCallbackWithResult + 87;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 37 / 0;
            }
            return interfaceDescriptor;
        }

        public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
            int i7 = ~(i3 | i6);
            int i8 = i2 | i7;
            int i9 = (~(i6 | (~i2))) | i3;
            int i10 = i3 + i2 + i + ((-1932811043) * i5) + (1521317780 * i4);
            int i11 = i10 * i10;
            int i12 = ((i3 * (-919556932)) - 154402816) + ((-919556932) * i2) + ((-1121407813) * i7) + (i8 * 1121407813) + (1121407813 * i9) + (201850880 * i) + ((-2098724864) * i5) + ((-1398800384) * i4) + ((-1444151296) * i11);
            int i13 = (i3 * 1794637580) + 2133191799 + (i2 * 1794637580) + (i7 * (-161)) + (i8 * 161) + (i9 * 161) + (i * 1794637741) + (i5 * (-1844343719)) + (i4 * (-1188939004)) + (i11 * (-394526720));
            return i12 + ((i13 * i13) * 821297152) != 1 ? IAuthTabCallback(objArr) : onExtraCallback(objArr);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallbackWithResult + 61;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return true;
                }
                throw null;
            }
            if (!(obj instanceof AllHidden)) {
                return false;
            }
            AllHidden allHidden = (AllHidden) obj;
            if (this.displaySetting != allHidden.displaySetting) {
                return false;
            }
            if (Float.compare(this.alpha, allHidden.alpha) != 0) {
                int i3 = IAuthTabCallback + 43;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.accountKey, allHidden.accountKey)) {
                int i5 = IAuthTabCallback + 37;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.formattedTime, allHidden.formattedTime)) {
                int i7 = onExtraCallbackWithResult + 119;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.userName, allHidden.userName)) {
                int i9 = IAuthTabCallback + 119;
                onExtraCallbackWithResult = i9 % 128;
                return i9 % 2 != 0;
            }
            if (this.userMode == allHidden.userMode) {
                return true;
            }
            int i10 = onExtraCallbackWithResult + 29;
            IAuthTabCallback = i10 % 128;
            return i10 % 2 == 0;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int iHashCode2 = this.displaySetting.hashCode();
            int iHashCode3 = Float.hashCode(this.alpha);
            String str = this.accountKey;
            int iHashCode4 = 0;
            if (str == null) {
                int i2 = IAuthTabCallback + 81;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
                int i4 = IAuthTabCallback + 15;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 3 % 2;
                }
            }
            int iHashCode5 = this.formattedTime.hashCode();
            String str2 = this.userName;
            if (str2 != null) {
                int i6 = onExtraCallbackWithResult + 71;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                iHashCode4 = str2.hashCode();
            }
            return (((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + iHashCode5) * 31) + iHashCode4) * 31) + this.userMode.hashCode();
        }

        public String toString() {
            int i = 2 % 2;
            String str = "AllHidden(displaySetting=" + this.displaySetting + ", alpha=" + this.alpha + ", accountKey=" + this.accountKey + ", formattedTime=" + this.formattedTime + ", userName=" + this.userName + ", userMode=" + this.userMode + ")";
            int i2 = IAuthTabCallback + 17;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 38 / 0;
            }
            return str;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<AllHidden> serializer() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 27;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    OverviewMediumWidgetState$AllHidden$$serializer overviewMediumWidgetState$AllHidden$$serializer = OverviewMediumWidgetState$AllHidden$$serializer.INSTANCE;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                OverviewMediumWidgetState$AllHidden$$serializer overviewMediumWidgetState$AllHidden$$serializer2 = OverviewMediumWidgetState$AllHidden$$serializer.INSTANCE;
                int i3 = IAuthTabCallback + 31;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 24 / 0;
                }
                return overviewMediumWidgetState$AllHidden$$serializer2;
            }
        }

        static {
            TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
            $childSerializers = new Lazy[]{LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.securities.widget.overview.ui.medium.model.OverviewMediumWidgetState$AllHidden$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 37;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    KSerializer kSerializerIAuthTabCallback = OverviewMediumWidgetState.AllHidden.IAuthTabCallback();
                    if (i3 == 0) {
                        int i4 = 36 / 0;
                    }
                    return kSerializerIAuthTabCallback;
                }
            }), null, null, null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.securities.widget.overview.ui.medium.model.OverviewMediumWidgetState$AllHidden$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 97;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    KSerializer kSerializerOnExtraCallbackWithResult = OverviewMediumWidgetState.AllHidden.onExtraCallbackWithResult();
                    int i4 = IAuthTabCallback + 17;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 != 0) {
                        return kSerializerOnExtraCallbackWithResult;
                    }
                    throw null;
                }
            })};
            int i = onExtraCallback + 49;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        public /* synthetic */ AllHidden(int i, DisplaySetting displaySetting, float f, String str, String str2, String str3, HostnamesKt hostnamesKt, okycx okycxVar) {
            if (56 != (i & 56)) {
                int i2 = IAuthTabCallback + 91;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                htf31.onExtraCallbackWithResult(i, 56, OverviewMediumWidgetState$AllHidden$$serializer.INSTANCE.getDescriptor());
                int i4 = 2 % 2;
            }
            if ((i & 1) == 0) {
                displaySetting = DisplaySetting.SYSTEM;
                int i5 = 2 % 2;
            }
            this.displaySetting = displaySetting;
            if ((i & 2) == 0) {
                int i6 = IAuthTabCallback + 51;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                f = 1.0f;
            }
            this.alpha = f;
            if ((i & 4) == 0) {
                int i8 = onExtraCallbackWithResult + 81;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                this.accountKey = null;
            } else {
                this.accountKey = str;
                int i10 = IAuthTabCallback + 55;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
            }
            int i12 = 2 % 2;
            this.formattedTime = str2;
            this.userName = str3;
            this.userMode = hostnamesKt;
        }

        public AllHidden(@NotNull DisplaySetting displaySetting, float f, @Nullable String str, @NotNull String str2, @Nullable String str3, @NotNull HostnamesKt hostnamesKt) {
            Intrinsics.checkNotNullParameter(displaySetting, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(hostnamesKt, "");
            this.displaySetting = displaySetting;
            this.alpha = f;
            this.accountKey = str;
            this.formattedTime = str2;
            this.userName = str3;
            this.userMode = hostnamesKt;
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 45;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            int i5 = i3 + 31;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return lazyArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onWarmupCompleted(AllHidden allHidden, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 53;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!(!vylVar.onWarmupCompleted(serialDescriptor, 0))) {
                vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[0].getValue(), allHidden.onExtraCallback());
                int i4 = IAuthTabCallback + 1;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            } else {
                int i6 = IAuthTabCallback + 23;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    if (allHidden.onExtraCallback() != DisplaySetting.SYSTEM) {
                    }
                } else {
                    allHidden.onExtraCallback();
                    DisplaySetting displaySetting = DisplaySetting.SYSTEM;
                    throw null;
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 1) || Float.compare(allHidden.onNavigationEvent(), 1.0f) != 0) {
                vylVar.onExtraCallback(serialDescriptor, 1, allHidden.onNavigationEvent());
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
                int i7 = IAuthTabCallback + 103;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                if (allHidden.accountKey != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, allHidden.accountKey);
                }
            }
            vylVar.onExtraCallback(serialDescriptor, 3, allHidden.formattedTime);
            vylVar.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, allHidden.userName);
            vylVar.onNavigationEvent(serialDescriptor, 5, (py) lazyArr[5].getValue(), allHidden.userMode);
        }

        @Override // im.toss.securities.widget.overview.ui.medium.model.OverviewMediumWidgetState
        public DisplaySetting onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 95;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return this.displaySetting;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // im.toss.securities.widget.overview.ui.medium.model.OverviewMediumWidgetState
        public float onNavigationEvent() {
            float f;
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 43;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                f = this.alpha;
                int i4 = 74 / 0;
            } else {
                f = this.alpha;
            }
            int i5 = i2 + 111;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return f;
            }
            throw null;
        }

        public final String asInterface() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 123;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            String str = this.accountKey;
            int i5 = i3 + 103;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 63;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            String str = this.formattedTime;
            int i5 = i3 + 35;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }

        private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
            AllHidden allHidden = (AllHidden) objArr[0];
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 79;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            String str = allHidden.userName;
            if (i3 == 0) {
                return str;
            }
            throw null;
        }

        public final HostnamesKt onTransact() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 111;
            IAuthTabCallback = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                throw null;
            }
            HostnamesKt hostnamesKt = this.userMode;
            int i4 = i2 + 75;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return hostnamesKt;
            }
            obj.hashCode();
            throw null;
        }

        public static final /* synthetic */ Lazy[] onWarmupCompleted() {
            int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            return (Lazy[]) onWarmupCompleted(iOnNavigationEvent2, 1025124829, -1025124828, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent3, iOnNavigationEvent, new Object[0]);
        }

        public final String asBinder() {
            int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            return (String) onWarmupCompleted(iOnNavigationEvent2, 1566650418, -1566650418, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent3, iOnNavigationEvent, new Object[]{this});
        }
    }

    @nc(IAuthTabCallback = "NetworkError")
    @liq
    public static final class NetworkError extends Exception implements OverviewMediumWidgetState {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;
        private final float alpha;
        private final DisplaySetting displaySetting;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.securities.widget.overview.ui.medium.model.OverviewMediumWidgetState$NetworkError$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 31;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    return OverviewMediumWidgetState.NetworkError.onWarmupCompleted();
                }
                OverviewMediumWidgetState.NetworkError.onWarmupCompleted();
                throw null;
            }
        }), null};

        /* JADX WARN: Illegal instructions before constructor call */
        public NetworkError() {
            DisplaySetting displaySetting = null;
            this(displaySetting, 0.0f, 3, (DefaultConstructorMarker) displaySetting);
        }

        private static final /* synthetic */ KSerializer onExtraCallbackWithResult() {
            KSerializer kSerializerSerializer;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 45;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                kSerializerSerializer = DisplaySetting.Companion.serializer();
                int i3 = 59 / 0;
            } else {
                kSerializerSerializer = DisplaySetting.Companion.serializer();
            }
            int i4 = onNavigationEvent + 71;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerSerializer;
        }

        public static /* synthetic */ KSerializer onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 67;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return onExtraCallbackWithResult();
            }
            onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 93;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            if (i3 % 2 != 0) {
                throw null;
            }
            if (this == obj) {
                int i5 = i4 + 37;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            if (obj instanceof NetworkError) {
                NetworkError networkError = (NetworkError) obj;
                return this.displaySetting == networkError.displaySetting && Float.compare(this.alpha, networkError.alpha) == 0;
            }
            int i7 = i2 + 73;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 121;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.displaySetting.hashCode();
            return i3 == 0 ? (iHashCode - 15) >>> Float.hashCode(this.alpha) : (iHashCode * 31) + Float.hashCode(this.alpha);
        }

        @Override // java.lang.Throwable
        public String toString() {
            int i = 2 % 2;
            String str = "NetworkError(displaySetting=" + this.displaySetting + ", alpha=" + this.alpha + ")";
            int i2 = IAuthTabCallback + 43;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<NetworkError> serializer() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 105;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                OverviewMediumWidgetState$NetworkError$$serializer overviewMediumWidgetState$NetworkError$$serializer = OverviewMediumWidgetState$NetworkError$$serializer.INSTANCE;
                int i4 = onExtraCallback + 13;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return overviewMediumWidgetState$NetworkError$$serializer;
            }
        }

        static {
            int i = onExtraCallbackWithResult + 97;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        public /* synthetic */ NetworkError(int i, DisplaySetting displaySetting, float f, okycx okycxVar) {
            this.displaySetting = (i & 1) == 0 ? DisplaySetting.SYSTEM : displaySetting;
            if ((i & 2) == 0) {
                int i2 = IAuthTabCallback + 117;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                this.alpha = 1.0f;
                return;
            }
            this.alpha = f;
            int i4 = onNavigationEvent + 9;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkError(@NotNull DisplaySetting displaySetting, float f) {
            super("네트워크 오류가 발생했습니다.");
            Intrinsics.checkNotNullParameter(displaySetting, "");
            this.displaySetting = displaySetting;
            this.alpha = f;
        }

        public static final /* synthetic */ Lazy[] IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 57;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            int i4 = i3 + 29;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return lazyArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0031 A[PHI: r1
          0x0031: PHI (r1v7 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
          (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v14 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
         binds: [B:8:0x001e, B:10:0x002f, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r1
          0x0020: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
          (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v14 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
         binds: [B:8:0x001e, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onExtraCallbackWithResult(NetworkError networkError, vyl vylVar, SerialDescriptor serialDescriptor) {
            Lazy<KSerializer<Object>>[] lazyArr;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 117;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                lazyArr = $childSerializers;
                if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                    int i3 = IAuthTabCallback + 101;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    if (networkError.onExtraCallback() != DisplaySetting.SYSTEM) {
                        vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[0].getValue(), networkError.onExtraCallback());
                        int i5 = onNavigationEvent + 61;
                        IAuthTabCallback = i5 % 128;
                        int i6 = i5 % 2;
                    }
                }
            } else {
                lazyArr = $childSerializers;
                if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                }
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                int i7 = IAuthTabCallback + 53;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 == 0) {
                    if (Float.compare(networkError.onNavigationEvent(), 2.0f) == 0) {
                        return;
                    }
                } else if (Float.compare(networkError.onNavigationEvent(), 1.0f) == 0) {
                    return;
                }
            }
            vylVar.onExtraCallback(serialDescriptor, 1, networkError.onNavigationEvent());
            int i8 = onNavigationEvent + 71;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ NetworkError(DisplaySetting displaySetting, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                displaySetting = DisplaySetting.SYSTEM;
                int i2 = onNavigationEvent + 5;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 % 2;
                }
            }
            if ((i & 2) != 0) {
                int i4 = IAuthTabCallback;
                int i5 = i4 + 51;
                onNavigationEvent = i5 % 128;
                float f2 = i5 % 2 == 0 ? 2.0f : 1.0f;
                int i6 = i4 + 97;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 2 % 2;
                }
                f = f2;
            }
            this(displaySetting, f);
        }

        @Override // im.toss.securities.widget.overview.ui.medium.model.OverviewMediumWidgetState
        public DisplaySetting onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 77;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.displaySetting;
            }
            throw null;
        }

        @Override // im.toss.securities.widget.overview.ui.medium.model.OverviewMediumWidgetState
        public float onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 97;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            float f = this.alpha;
            int i5 = i3 + 83;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }
    }

    @nc(IAuthTabCallback = "Error")
    @liq
    public static final class Error extends Exception implements OverviewMediumWidgetState {
        public static final Companion Companion;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private final float alpha;
        private final DisplaySetting displaySetting;
        private final String message;
        public static final int $stable = 8;
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.securities.widget.overview.ui.medium.model.OverviewMediumWidgetState$Error$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 77;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnWarmupCompleted = OverviewMediumWidgetState.Error.onWarmupCompleted();
                int i4 = onExtraCallback + 101;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 72 / 0;
                }
                return kSerializerOnWarmupCompleted;
            }
        }), null, null};

        public Error() {
            this((DisplaySetting) null, 0.0f, (String) null, 7, (DefaultConstructorMarker) null);
        }

        private static final /* synthetic */ KSerializer onExtraCallbackWithResult() {
            KSerializer kSerializerSerializer;
            int i = 2 % 2;
            int i2 = onExtraCallback + 35;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                kSerializerSerializer = DisplaySetting.Companion.serializer();
                int i3 = 15 / 0;
            } else {
                kSerializerSerializer = DisplaySetting.Companion.serializer();
            }
            int i4 = onExtraCallback + 111;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 97 / 0;
            }
            return kSerializerSerializer;
        }

        public static /* synthetic */ KSerializer onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 5;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i4 = IAuthTabCallback + 13;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return kSerializerOnExtraCallbackWithResult;
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
            if (!(obj instanceof Error)) {
                int i2 = IAuthTabCallback + 59;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 77 / 0;
                }
                return false;
            }
            Error error = (Error) obj;
            if (this.displaySetting != error.displaySetting) {
                return false;
            }
            if (Float.compare(this.alpha, error.alpha) == 0) {
                return Intrinsics.areEqual(this.message, error.message);
            }
            int i4 = IAuthTabCallback + 107;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int iHashCode2 = this.displaySetting.hashCode();
            int iHashCode3 = Float.hashCode(this.alpha);
            String str = this.message;
            if (str == null) {
                int i2 = onExtraCallback + 119;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            int i4 = (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
            int i5 = IAuthTabCallback + 115;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return i4;
        }

        @Override // java.lang.Throwable
        public String toString() {
            int i = 2 % 2;
            String str = "Error(displaySetting=" + this.displaySetting + ", alpha=" + this.alpha + ", message=" + this.message + ")";
            int i2 = onExtraCallback + 71;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Error> serializer() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 65;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    OverviewMediumWidgetState$Error$$serializer overviewMediumWidgetState$Error$$serializer = OverviewMediumWidgetState$Error$$serializer.INSTANCE;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                OverviewMediumWidgetState$Error$$serializer overviewMediumWidgetState$Error$$serializer2 = OverviewMediumWidgetState$Error$$serializer.INSTANCE;
                int i3 = IAuthTabCallback + 87;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return overviewMediumWidgetState$Error$$serializer2;
            }
        }

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new Companion(defaultConstructorMarker);
            int i = onExtraCallbackWithResult + 57;
            onNavigationEvent = i % 128;
            if (i % 2 == 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }

        public /* synthetic */ Error(int i, DisplaySetting displaySetting, float f, String str, okycx okycxVar) {
            this.displaySetting = (i & 1) == 0 ? DisplaySetting.SYSTEM : displaySetting;
            if ((i & 2) == 0) {
                this.alpha = 1.0f;
                int i2 = onExtraCallback + 77;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 2 % 2;
                }
            } else {
                this.alpha = f;
            }
            if ((i & 4) != 0) {
                this.message = str;
                return;
            }
            int i4 = IAuthTabCallback;
            int i5 = i4 + 47;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            this.message = null;
            if (i6 != 0) {
                int i7 = 10 / 0;
            }
            int i8 = i4 + 37;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull DisplaySetting displaySetting, float f, @Nullable String str) {
            super(str);
            Intrinsics.checkNotNullParameter(displaySetting, "");
            this.displaySetting = displaySetting;
            this.alpha = f;
            this.message = str;
        }

        public static final /* synthetic */ Lazy[] IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 17;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            int i4 = i3 + 111;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return lazyArr;
        }

        @JvmStatic
        public static final /* synthetic */ void onWarmupCompleted(Error error, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (vylVar.onWarmupCompleted(serialDescriptor, 0) || error.onExtraCallback() != DisplaySetting.SYSTEM) {
                vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[0].getValue(), error.onExtraCallback());
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 1) || Float.compare(error.onNavigationEvent(), 1.0f) != 0) {
                vylVar.onExtraCallback(serialDescriptor, 1, error.onNavigationEvent());
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
                int i2 = IAuthTabCallback + 89;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                if (error.getMessage() == null) {
                    return;
                }
            }
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, error.getMessage());
            int i4 = onExtraCallback + 11;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Error(DisplaySetting displaySetting, float f, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = IAuthTabCallback + 111;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                displaySetting = DisplaySetting.SYSTEM;
                int i4 = IAuthTabCallback + 79;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            }
            f = (i & 2) != 0 ? 1.0f : f;
            if ((i & 4) != 0) {
                int i7 = onExtraCallback + 25;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 16 / 0;
                }
                str = null;
            }
            this(displaySetting, f, str);
        }

        @Override // im.toss.securities.widget.overview.ui.medium.model.OverviewMediumWidgetState
        public DisplaySetting onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 53;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            DisplaySetting displaySetting = this.displaySetting;
            int i5 = i3 + 103;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return displaySetting;
            }
            throw null;
        }

        @Override // im.toss.securities.widget.overview.ui.medium.model.OverviewMediumWidgetState
        public float onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 29;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            float f = this.alpha;
            int i4 = i3 + 43;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return f;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 31;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.message;
            }
            throw null;
        }
    }

    @nc(IAuthTabCallback = "GuestUser")
    @liq
    public static final class NotTradeableUser extends Exception implements OverviewMediumWidgetState {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private static int onWarmupCompleted;
        private final float alpha;
        private final DisplaySetting displaySetting;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.securities.widget.overview.ui.medium.model.OverviewMediumWidgetState$NotTradeableUser$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 67;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerIAuthTabCallback = OverviewMediumWidgetState.NotTradeableUser.IAuthTabCallback();
                if (i3 == 0) {
                    int i4 = 21 / 0;
                }
                return kSerializerIAuthTabCallback;
            }
        }), null};

        /* JADX WARN: Illegal instructions before constructor call */
        public NotTradeableUser() {
            DisplaySetting displaySetting = null;
            this(displaySetting, 0.0f, 3, (DefaultConstructorMarker) displaySetting);
        }

        public static /* synthetic */ KSerializer IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 121;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i4 = onExtraCallback + 101;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnExtraCallbackWithResult;
        }

        private static final /* synthetic */ KSerializer onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 37;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerSerializer = DisplaySetting.Companion.serializer();
            if (i3 == 0) {
                int i4 = 89 / 0;
            }
            return kSerializerSerializer;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotTradeableUser)) {
                int i2 = onExtraCallback + 93;
                onWarmupCompleted = i2 % 128;
                return i2 % 2 != 0;
            }
            NotTradeableUser notTradeableUser = (NotTradeableUser) obj;
            if (this.displaySetting == notTradeableUser.displaySetting) {
                return Float.compare(this.alpha, notTradeableUser.alpha) == 0;
            }
            int i3 = onWarmupCompleted + 65;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 69;
            onWarmupCompleted = i2 % 128;
            int iHashCode = i2 % 2 != 0 ? (this.displaySetting.hashCode() >> 114) / Float.hashCode(this.alpha) : (this.displaySetting.hashCode() * 31) + Float.hashCode(this.alpha);
            int i3 = onExtraCallback + 65;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        @Override // java.lang.Throwable
        public String toString() {
            int i = 2 % 2;
            String str = "NotTradeableUser(displaySetting=" + this.displaySetting + ", alpha=" + this.alpha + ")";
            int i2 = onExtraCallback + 61;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<NotTradeableUser> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 75;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    OverviewMediumWidgetState$NotTradeableUser$$serializer overviewMediumWidgetState$NotTradeableUser$$serializer = OverviewMediumWidgetState$NotTradeableUser$$serializer.INSTANCE;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                OverviewMediumWidgetState$NotTradeableUser$$serializer overviewMediumWidgetState$NotTradeableUser$$serializer2 = OverviewMediumWidgetState$NotTradeableUser$$serializer.INSTANCE;
                int i3 = onNavigationEvent + 95;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return overviewMediumWidgetState$NotTradeableUser$$serializer2;
            }
        }

        static {
            int i = onExtraCallbackWithResult + 67;
            IAuthTabCallback = i % 128;
            if (i % 2 == 0) {
                int i2 = 3 / 0;
            }
        }

        public /* synthetic */ NotTradeableUser(int i, DisplaySetting displaySetting, float f, okycx okycxVar) {
            if ((i & 1) == 0) {
                displaySetting = DisplaySetting.SYSTEM;
                int i2 = onWarmupCompleted + 7;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            }
            this.displaySetting = displaySetting;
            if ((i & 2) == 0) {
                int i5 = onWarmupCompleted + 41;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                this.alpha = 1.0f;
                return;
            }
            this.alpha = f;
            int i7 = onWarmupCompleted + 31;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotTradeableUser(@NotNull DisplaySetting displaySetting, float f) {
            super("매매 가능회원이 아님.");
            Intrinsics.checkNotNullParameter(displaySetting, "");
            this.displaySetting = displaySetting;
            this.alpha = f;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onExtraCallbackWithResult(NotTradeableUser notTradeableUser, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                int i2 = onWarmupCompleted + 99;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 71 / 0;
                    if (notTradeableUser.onExtraCallback() != DisplaySetting.SYSTEM) {
                        vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[0].getValue(), notTradeableUser.onExtraCallback());
                    }
                } else if (notTradeableUser.onExtraCallback() != DisplaySetting.SYSTEM) {
                }
            }
            if (!(!vylVar.onWarmupCompleted(serialDescriptor, 1)) || Float.compare(notTradeableUser.onNavigationEvent(), 1.0f) != 0) {
                vylVar.onExtraCallback(serialDescriptor, 1, notTradeableUser.onNavigationEvent());
            }
            int i4 = onWarmupCompleted + 15;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        public static final /* synthetic */ Lazy[] onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 9;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            int i5 = i3 + 23;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return lazyArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ NotTradeableUser(DisplaySetting displaySetting, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                displaySetting = DisplaySetting.SYSTEM;
                int i2 = onExtraCallback + 9;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            }
            if ((i & 2) != 0) {
                int i5 = onExtraCallback + 87;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                f = 1.0f;
            }
            this(displaySetting, f);
        }

        @Override // im.toss.securities.widget.overview.ui.medium.model.OverviewMediumWidgetState
        public DisplaySetting onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 95;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            DisplaySetting displaySetting = this.displaySetting;
            int i5 = i2 + 19;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return displaySetting;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // im.toss.securities.widget.overview.ui.medium.model.OverviewMediumWidgetState
        public float onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 47;
            onExtraCallback = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                throw null;
            }
            float f = this.alpha;
            int i4 = i2 + 87;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return f;
            }
            obj.hashCode();
            throw null;
        }
    }

    @nc(IAuthTabCallback = "Loading")
    @liq
    public static final class Loading implements OverviewMediumWidgetState {
        public static final int $stable = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final float alpha;
        private final DisplaySetting displaySetting;
        public static final Companion Companion = new Companion(null);
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.securities.widget.overview.ui.medium.model.OverviewMediumWidgetState$Loading$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 5;
                IAuthTabCallback = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    OverviewMediumWidgetState.Loading.onWarmupCompleted();
                    obj.hashCode();
                    throw null;
                }
                KSerializer kSerializerOnWarmupCompleted = OverviewMediumWidgetState.Loading.onWarmupCompleted();
                int i3 = onWarmupCompleted + 33;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    return kSerializerOnWarmupCompleted;
                }
                throw null;
            }
        }), null};

        /* JADX WARN: Illegal instructions before constructor call */
        public Loading() {
            DisplaySetting displaySetting = null;
            this(displaySetting, 0.0f, 3, (DefaultConstructorMarker) displaySetting);
        }

        private static final /* synthetic */ KSerializer onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 29;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerSerializer = DisplaySetting.Companion.serializer();
            int i4 = onWarmupCompleted + 55;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return kSerializerSerializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ KSerializer onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 117;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                onExtraCallbackWithResult();
                obj.hashCode();
                throw null;
            }
            KSerializer kSerializerOnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i3 = onNavigationEvent + 33;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                return kSerializerOnExtraCallbackWithResult;
            }
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loading)) {
                return false;
            }
            Loading loading = (Loading) obj;
            if (this.displaySetting == loading.displaySetting) {
                if (Float.compare(this.alpha, loading.alpha) == 0) {
                    return true;
                }
                int i2 = onWarmupCompleted + 51;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = onWarmupCompleted + 27;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 37;
            onWarmupCompleted = i2 % 128;
            int iHashCode = i2 % 2 == 0 ? (this.displaySetting.hashCode() >>> 47) << Float.hashCode(this.alpha) : (this.displaySetting.hashCode() * 31) + Float.hashCode(this.alpha);
            int i3 = onNavigationEvent + 55;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Loading(displaySetting=" + this.displaySetting + ", alpha=" + this.alpha + ")";
            int i2 = onWarmupCompleted + 97;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Loading> serializer() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 91;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                OverviewMediumWidgetState$Loading$$serializer overviewMediumWidgetState$Loading$$serializer = OverviewMediumWidgetState$Loading$$serializer.INSTANCE;
                if (i3 != 0) {
                    int i4 = 56 / 0;
                }
                return overviewMediumWidgetState$Loading$$serializer;
            }
        }

        static {
            int i = onExtraCallbackWithResult + 5;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                int i2 = 20 / 0;
            }
        }

        public /* synthetic */ Loading(int i, DisplaySetting displaySetting, float f, okycx okycxVar) {
            if ((i & 1) == 0) {
                displaySetting = DisplaySetting.SYSTEM;
                int i2 = onWarmupCompleted + 81;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            }
            this.displaySetting = displaySetting;
            if ((i & 2) != 0) {
                this.alpha = f;
                return;
            }
            int i5 = onNavigationEvent + 71;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            this.alpha = 1.0f;
        }

        public Loading(@NotNull DisplaySetting displaySetting, float f) {
            Intrinsics.checkNotNullParameter(displaySetting, "");
            this.displaySetting = displaySetting;
            this.alpha = f;
        }

        public static final /* synthetic */ Lazy[] IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 41;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            int i5 = i2 + 119;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return lazyArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onExtraCallback(Loading loading, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                int i2 = onNavigationEvent + 101;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                if (loading.onExtraCallback() != DisplaySetting.SYSTEM) {
                    vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[0].getValue(), loading.onExtraCallback());
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 1) || Float.compare(loading.onNavigationEvent(), 1.0f) != 0) {
                vylVar.onExtraCallback(serialDescriptor, 1, loading.onNavigationEvent());
            }
            int i4 = onNavigationEvent + 75;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Loading(DisplaySetting displaySetting, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onWarmupCompleted + 61;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    displaySetting = DisplaySetting.SYSTEM;
                    int i3 = 2 % 2;
                } else {
                    DisplaySetting displaySetting2 = DisplaySetting.SYSTEM;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
            if ((i & 2) != 0) {
                int i4 = onNavigationEvent + 35;
                onWarmupCompleted = i4 % 128;
                f = i4 % 2 == 0 ? 2.0f : 1.0f;
                int i5 = 2 % 2;
            }
            this(displaySetting, f);
        }

        @Override // im.toss.securities.widget.overview.ui.medium.model.OverviewMediumWidgetState
        public DisplaySetting onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 71;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            DisplaySetting displaySetting = this.displaySetting;
            int i5 = i2 + 85;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return displaySetting;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // im.toss.securities.widget.overview.ui.medium.model.OverviewMediumWidgetState
        public float onNavigationEvent() {
            float f;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 43;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 == 0) {
                f = this.alpha;
                int i4 = 57 / 0;
            } else {
                f = this.alpha;
            }
            int i5 = i3 + 67;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }
    }

    @liq
    public static final class Maintenance implements OverviewMediumWidgetState {
        public static final int $stable = 0;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final float alpha;
        private final DisplaySetting displaySetting;
        public static final Companion Companion = new Companion(null);
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.securities.widget.overview.ui.medium.model.OverviewMediumWidgetState$Maintenance$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 7;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnWarmupCompleted = OverviewMediumWidgetState.Maintenance.onWarmupCompleted();
                int i4 = onExtraCallback + 53;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnWarmupCompleted;
            }
        }), null};

        /* JADX WARN: Illegal instructions before constructor call */
        public Maintenance() {
            DisplaySetting displaySetting = null;
            this(displaySetting, 0.0f, 3, (DefaultConstructorMarker) displaySetting);
        }

        private static final /* synthetic */ KSerializer onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 113;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerSerializer = DisplaySetting.Companion.serializer();
            int i4 = IAuthTabCallback + 69;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 55 / 0;
            }
            return kSerializerSerializer;
        }

        public static /* synthetic */ KSerializer onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 111;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                onExtraCallbackWithResult();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            KSerializer kSerializerOnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i3 = IAuthTabCallback + 57;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 52 / 0;
            }
            return kSerializerOnExtraCallbackWithResult;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onNavigationEvent + 47;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 125;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            if (!(obj instanceof Maintenance)) {
                int i7 = IAuthTabCallback;
                int i8 = i7 + 9;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                int i10 = i7 + 89;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                return false;
            }
            Maintenance maintenance = (Maintenance) obj;
            if (this.displaySetting != maintenance.displaySetting) {
                int i12 = IAuthTabCallback + 75;
                onNavigationEvent = i12 % 128;
                int i13 = i12 % 2;
                return false;
            }
            if (Float.compare(this.alpha, maintenance.alpha) == 0) {
                return true;
            }
            int i14 = onNavigationEvent + 11;
            IAuthTabCallback = i14 % 128;
            if (i14 % 2 != 0) {
                int i15 = 51 / 0;
            }
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 57;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.displaySetting.hashCode();
            return i3 == 0 ? (iHashCode * 20) >>> Float.hashCode(this.alpha) : (iHashCode * 31) + Float.hashCode(this.alpha);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Maintenance(displaySetting=" + this.displaySetting + ", alpha=" + this.alpha + ")";
            int i2 = IAuthTabCallback + 115;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Maintenance> serializer() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 75;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                OverviewMediumWidgetState$Maintenance$$serializer overviewMediumWidgetState$Maintenance$$serializer = OverviewMediumWidgetState$Maintenance$$serializer.INSTANCE;
                int i4 = onExtraCallbackWithResult + 13;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 9 / 0;
                }
                return overviewMediumWidgetState$Maintenance$$serializer;
            }
        }

        static {
            int i = onExtraCallbackWithResult + 37;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        public /* synthetic */ Maintenance(int i, DisplaySetting displaySetting, float f, okycx okycxVar) {
            if ((i & 1) == 0) {
                displaySetting = DisplaySetting.SYSTEM;
                int i2 = IAuthTabCallback + 33;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 2 % 2;
                }
            }
            this.displaySetting = displaySetting;
            if ((i & 2) != 0) {
                this.alpha = f;
                return;
            }
            int i4 = IAuthTabCallback + 125;
            onNavigationEvent = i4 % 128;
            this.alpha = i4 % 2 == 0 ? 2.0f : 1.0f;
        }

        public Maintenance(@NotNull DisplaySetting displaySetting, float f) {
            Intrinsics.checkNotNullParameter(displaySetting, "");
            this.displaySetting = displaySetting;
            this.alpha = f;
        }

        public static final /* synthetic */ Lazy[] IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 31;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return $childSerializers;
            }
            throw null;
        }

        @JvmStatic
        public static final /* synthetic */ void onNavigationEvent(Maintenance maintenance, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 117;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (vylVar.onWarmupCompleted(serialDescriptor, 0) || maintenance.onExtraCallback() != DisplaySetting.SYSTEM) {
                vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[0].getValue(), maintenance.onExtraCallback());
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1) && Float.compare(maintenance.onNavigationEvent(), 1.0f) == 0) {
                return;
            }
            vylVar.onExtraCallback(serialDescriptor, 1, maintenance.onNavigationEvent());
            int i4 = onNavigationEvent + 89;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Maintenance(DisplaySetting displaySetting, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onNavigationEvent + 83;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                displaySetting = DisplaySetting.SYSTEM;
                int i4 = 2 % 2;
            }
            if ((i & 2) != 0) {
                int i5 = onNavigationEvent + 35;
                IAuthTabCallback = i5 % 128;
                f = i5 % 2 != 0 ? 0.0f : 1.0f;
            }
            this(displaySetting, f);
        }

        @Override // im.toss.securities.widget.overview.ui.medium.model.OverviewMediumWidgetState
        public DisplaySetting onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 21;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            DisplaySetting displaySetting = this.displaySetting;
            int i5 = i2 + 41;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return displaySetting;
            }
            throw null;
        }

        @Override // im.toss.securities.widget.overview.ui.medium.model.OverviewMediumWidgetState
        public float onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 67;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            float f = this.alpha;
            int i5 = i2 + 61;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }
    }
}
