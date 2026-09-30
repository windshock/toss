package im.toss.securities.widget.overview.ui.small.model;

import com.facebook.imagepipeline.core.ProducerSequenceFactory$;
import im.toss.rn.appsintoss.api.model.contacts_common.PushInfo;
import im.toss.securities.widget.data.model.overview.WidgetOverview;
import im.toss.securities.widget.data.model.overview.WidgetOverview$Overview$$serializer;
import im.toss.securities.widget.overview.ui.small.model.OverviewSmallWidgetState;
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
import o.sp;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface OverviewSmallWidgetState {
    public static final Companion Companion = Companion.onExtraCallback;

    float onNavigationEvent();

    DisplaySetting onWarmupCompleted();

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        static final /* synthetic */ Companion onExtraCallback = new Companion();
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onWarmupCompleted + 75;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        private Companion() {
        }

        public final KSerializer<OverviewSmallWidgetState> serializer() {
            int i = 2 % 2;
            kt ktVar = new kt("im.toss.securities.widget.overview.ui.small.model.OverviewSmallWidgetState", Reflection.getOrCreateKotlinClass(OverviewSmallWidgetState.class), new KClass[]{Reflection.getOrCreateKotlinClass(AllHidden.class), Reflection.getOrCreateKotlinClass(Error.class), Reflection.getOrCreateKotlinClass(Loading.class), Reflection.getOrCreateKotlinClass(Maintenance.class), Reflection.getOrCreateKotlinClass(NetworkError.class), Reflection.getOrCreateKotlinClass(NotTradeableUser.class), Reflection.getOrCreateKotlinClass(Success.class)}, new KSerializer[]{OverviewSmallWidgetState$AllHidden$$serializer.INSTANCE, OverviewSmallWidgetState$Error$$serializer.INSTANCE, OverviewSmallWidgetState$Loading$$serializer.INSTANCE, OverviewSmallWidgetState$Maintenance$$serializer.INSTANCE, OverviewSmallWidgetState$NetworkError$$serializer.INSTANCE, OverviewSmallWidgetState$NotTradeableUser$$serializer.INSTANCE, OverviewSmallWidgetState$Success$$serializer.INSTANCE}, new Annotation[0]);
            int i2 = IAuthTabCallback + 105;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 65 / 0;
            }
            return ktVar;
        }
    }

    @nc(IAuthTabCallback = "Success")
    @liq
    public static final class Success implements OverviewSmallWidgetState {
        private static final Lazy<KSerializer<Object>>[] $childSerializers;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private final String accountKey;
        private final float alpha;
        private final List<String> bitmaps;
        private final Currency currency;
        private final DisplaySetting displaySetting;
        private final String formattedTime;
        private final boolean includeExpense;
        private final WidgetOverview.Overview overview;
        private final boolean showAmount;
        private final HostnamesKt userMode;
        private final String userName;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        public static /* synthetic */ KSerializer IAuthTabCallback() {
            KSerializer kSerializerICustomTabsCallback;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 103;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                kSerializerICustomTabsCallback = ICustomTabsCallback();
                int i3 = 83 / 0;
            } else {
                kSerializerICustomTabsCallback = ICustomTabsCallback();
            }
            int i4 = onNavigationEvent + 65;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerICustomTabsCallback;
        }

        private static final /* synthetic */ KSerializer ICustomTabsCallback() {
            KSerializer kSerializerSerializer;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 71;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                kSerializerSerializer = Currency.Companion.serializer();
                int i3 = 39 / 0;
            } else {
                kSerializerSerializer = Currency.Companion.serializer();
            }
            int i4 = onNavigationEvent + 35;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return kSerializerSerializer;
            }
            throw null;
        }

        private static final /* synthetic */ KSerializer extraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 41;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.tosssecurities.auth.domain.model.SecuritiesUserMode", HostnamesKt.values());
            int i4 = onNavigationEvent + 51;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnExtraCallbackWithResult;
        }

        private static final /* synthetic */ KSerializer extraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 111;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                DisplaySetting.Companion.serializer();
                throw null;
            }
            KSerializer kSerializerSerializer = DisplaySetting.Companion.serializer();
            int i3 = IAuthTabCallback + 21;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return kSerializerSerializer;
            }
            throw null;
        }

        public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
            int i7 = ~i3;
            int i8 = ~i5;
            int i9 = ~i6;
            int i10 = (~(i8 | i9)) | i7;
            int i11 = ~(i5 | i3);
            int i12 = i6 | i11;
            int i13 = (~(i6 | i3)) | (~(i7 | i8 | i9)) | i11 | (~(i5 | i6));
            int i14 = i5 + i3 + i + (1272450877 * i4) + ((-51365948) * i2);
            int i15 = i14 * i14;
            int i16 = ((-261444822) * i5) + 922746880 + ((-1437248296) * i3) + ((-1175803474) * i10) + (i12 * 587901737) + (587901737 * i13) + ((-849346560) * i) + ((-1881145344) * i4) + ((-578813952) * i2) + ((-124846080) * i15);
            int i17 = (i5 * 1187242746) + 1002376400 + (i3 * 1187242392) + (i10 * (-354)) + (i12 * 177) + (i13 * 177) + (i * 1187242569) + (i4 * (-1484311963)) + (i2 * 1141305060) + (i15 * 516358144);
            int i18 = i16 + (i17 * i17 * (-861863936));
            return i18 != 1 ? i18 != 2 ? onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr) : onExtraCallback(objArr);
        }

        public static /* synthetic */ KSerializer onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 79;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerExtraCallback = extraCallback();
            if (i3 == 0) {
                int i4 = 57 / 0;
            }
            return kSerializerExtraCallback;
        }

        public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 19;
            IAuthTabCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                readTypedObject();
                throw null;
            }
            KSerializer typedObject = readTypedObject();
            int i3 = IAuthTabCallback + 5;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return typedObject;
            }
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ KSerializer onTransact() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 33;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                extraCallbackWithResult();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            KSerializer kSerializerExtraCallbackWithResult = extraCallbackWithResult();
            int i3 = onNavigationEvent + 23;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return kSerializerExtraCallbackWithResult;
        }

        private static final /* synthetic */ KSerializer readTypedObject() {
            int i = 2 % 2;
            checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent));
            int i2 = onNavigationEvent + 31;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return checkcanopenlandingpage;
            }
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                int i2 = IAuthTabCallback + 71;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            Success success = (Success) obj;
            if (this.displaySetting != success.displaySetting || Float.compare(this.alpha, success.alpha) != 0 || !Intrinsics.areEqual(this.accountKey, success.accountKey) || (!Intrinsics.areEqual(this.overview, success.overview))) {
                return false;
            }
            if (!Intrinsics.areEqual(this.formattedTime, success.formattedTime)) {
                int i4 = IAuthTabCallback + 85;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 6 / 0;
                }
                return false;
            }
            if (!Intrinsics.areEqual(this.bitmaps, success.bitmaps)) {
                return false;
            }
            if (this.currency != success.currency) {
                int i6 = IAuthTabCallback + 3;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (this.includeExpense != success.includeExpense || this.showAmount != success.showAmount) {
                return false;
            }
            if (!Intrinsics.areEqual(this.userName, success.userName)) {
                int i8 = IAuthTabCallback + 57;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
            if (this.userMode == success.userMode) {
                return true;
            }
            int i10 = IAuthTabCallback + 111;
            onNavigationEvent = i10 % 128;
            return i10 % 2 == 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0032 A[PHI: r1 r3 r4
          0x0032: PHI (r1v28 int) = (r1v5 int), (r1v30 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
          0x0032: PHI (r3v5 int) = (r3v1 int), (r3v7 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
          0x0032: PHI (r4v3 java.lang.String) = (r4v0 java.lang.String), (r4v5 java.lang.String) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0030 A[PHI: r1 r3
          0x0030: PHI (r1v6 int) = (r1v5 int), (r1v30 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
          0x0030: PHI (r3v2 int) = (r3v1 int), (r3v7 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            String str;
            int iHashCode3;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 49;
            onNavigationEvent = i2 % 128;
            int iHashCode4 = 0;
            if (i2 % 2 == 0) {
                iHashCode = this.displaySetting.hashCode();
                iHashCode2 = Float.hashCode(this.alpha);
                str = this.accountKey;
                iHashCode3 = str == null ? 0 : str.hashCode();
            } else {
                iHashCode = this.displaySetting.hashCode();
                iHashCode2 = Float.hashCode(this.alpha);
                str = this.accountKey;
                if (str == null) {
                }
            }
            int iHashCode5 = this.overview.hashCode();
            int iHashCode6 = this.formattedTime.hashCode();
            int iHashCode7 = this.bitmaps.hashCode();
            int iHashCode8 = this.currency.hashCode();
            int iHashCode9 = Boolean.hashCode(this.includeExpense);
            int iHashCode10 = Boolean.hashCode(this.showAmount);
            String str2 = this.userName;
            if (str2 != null) {
                int i3 = IAuthTabCallback + 17;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 41 / 0;
                    iHashCode4 = str2.hashCode();
                } else {
                    iHashCode4 = str2.hashCode();
                }
            }
            int iHashCode11 = (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode4) * 31) + this.userMode.hashCode();
            int i5 = IAuthTabCallback + 49;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return iHashCode11;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Success(displaySetting=" + this.displaySetting + ", alpha=" + this.alpha + ", accountKey=" + this.accountKey + ", overview=" + this.overview + ", formattedTime=" + this.formattedTime + ", bitmaps=" + this.bitmaps + ", currency=" + this.currency + ", includeExpense=" + this.includeExpense + ", showAmount=" + this.showAmount + ", userName=" + this.userName + ", userMode=" + this.userMode + ")";
            int i2 = IAuthTabCallback + 43;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 91 / 0;
            }
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

            public final KSerializer<Success> serializer() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 31;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                OverviewSmallWidgetState$Success$$serializer overviewSmallWidgetState$Success$$serializer = OverviewSmallWidgetState$Success$$serializer.INSTANCE;
                int i4 = IAuthTabCallback + 9;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return overviewSmallWidgetState$Success$$serializer;
            }
        }

        static {
            TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
            $childSerializers = new Lazy[]{LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.securities.widget.overview.ui.small.model.OverviewSmallWidgetState$Success$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 53;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 != 0) {
                        return OverviewSmallWidgetState.Success.onTransact();
                    }
                    OverviewSmallWidgetState.Success.onTransact();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }), null, null, null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.securities.widget.overview.ui.small.model.OverviewSmallWidgetState$Success$$ExternalSyntheticLambda1
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 121;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 != 0) {
                        OverviewSmallWidgetState.Success.onExtraCallbackWithResult();
                        throw null;
                    }
                    KSerializer kSerializerOnExtraCallbackWithResult = OverviewSmallWidgetState.Success.onExtraCallbackWithResult();
                    int i3 = onExtraCallbackWithResult + 123;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    return kSerializerOnExtraCallbackWithResult;
                }
            }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.securities.widget.overview.ui.small.model.OverviewSmallWidgetState$Success$$ExternalSyntheticLambda2
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 9;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 == 0) {
                        OverviewSmallWidgetState.Success.IAuthTabCallback();
                        throw null;
                    }
                    KSerializer kSerializerIAuthTabCallback = OverviewSmallWidgetState.Success.IAuthTabCallback();
                    int i3 = onNavigationEvent + 27;
                    IAuthTabCallback = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 53 / 0;
                    }
                    return kSerializerIAuthTabCallback;
                }
            }), null, null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.securities.widget.overview.ui.small.model.OverviewSmallWidgetState$Success$$ExternalSyntheticLambda3
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 27;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    KSerializer kSerializerOnExtraCallback = OverviewSmallWidgetState.Success.onExtraCallback();
                    int i4 = onWarmupCompleted + 69;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 != 0) {
                        return kSerializerOnExtraCallback;
                    }
                    throw null;
                }
            })};
            int i = onExtraCallback + 3;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        public /* synthetic */ Success(int i, DisplaySetting displaySetting, float f, String str, WidgetOverview.Overview overview, String str2, List list, Currency currency, boolean z, boolean z2, String str3, HostnamesKt hostnamesKt, okycx okycxVar) {
            if (2044 != (i & 2044)) {
                htf31.onExtraCallbackWithResult(i, 2044, OverviewSmallWidgetState$Success$$serializer.INSTANCE.getDescriptor());
            }
            this.displaySetting = (i & 1) == 0 ? DisplaySetting.SYSTEM : displaySetting;
            if ((i & 2) == 0) {
                int i2 = onNavigationEvent + 99;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                this.alpha = 1.0f;
            } else {
                this.alpha = f;
                int i4 = IAuthTabCallback + 57;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            }
            int i6 = 2 % 2;
            this.accountKey = str;
            this.overview = overview;
            this.formattedTime = str2;
            this.bitmaps = list;
            this.currency = currency;
            this.includeExpense = z;
            this.showAmount = z2;
            this.userName = str3;
            this.userMode = hostnamesKt;
        }

        public Success(@NotNull DisplaySetting displaySetting, float f, @Nullable String str, @NotNull WidgetOverview.Overview overview, @NotNull String str2, @NotNull List<String> list, @NotNull Currency currency, boolean z, boolean z2, @Nullable String str3, @NotNull HostnamesKt hostnamesKt) {
            Intrinsics.checkNotNullParameter(displaySetting, "");
            Intrinsics.checkNotNullParameter(overview, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(currency, "");
            Intrinsics.checkNotNullParameter(hostnamesKt, "");
            this.displaySetting = displaySetting;
            this.alpha = f;
            this.accountKey = str;
            this.overview = overview;
            this.formattedTime = str2;
            this.bitmaps = list;
            this.currency = currency;
            this.includeExpense = z;
            this.showAmount = z2;
            this.userName = str3;
            this.userMode = hostnamesKt;
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 13;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (i3 != 0) {
                int i4 = 87 / 0;
            }
            return lazyArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
            Success success = (Success) objArr[0];
            vyl vylVar = (vyl) objArr[1];
            SerialDescriptor serialDescriptor = (SerialDescriptor) objArr[2];
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 25;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                int i4 = IAuthTabCallback + 5;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 57 / 0;
                    if (success.onWarmupCompleted() != DisplaySetting.SYSTEM) {
                        vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[0].getValue(), success.onWarmupCompleted());
                        int i6 = onNavigationEvent + 31;
                        IAuthTabCallback = i6 % 128;
                        if (i6 % 2 != 0) {
                            int i7 = 4 / 2;
                        }
                    }
                } else if (success.onWarmupCompleted() != DisplaySetting.SYSTEM) {
                }
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                int i8 = onNavigationEvent + 117;
                IAuthTabCallback = i8 % 128;
                if (i8 % 2 == 0 ? Float.compare(success.onNavigationEvent(), 1.0f) != 0 : Float.compare(success.onNavigationEvent(), 1.0f) != 0) {
                    vylVar.onExtraCallback(serialDescriptor, 1, success.onNavigationEvent());
                }
            }
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, success.accountKey);
            vylVar.onNavigationEvent(serialDescriptor, 3, WidgetOverview$Overview$$serializer.INSTANCE, success.overview);
            vylVar.onExtraCallback(serialDescriptor, 4, success.formattedTime);
            vylVar.onNavigationEvent(serialDescriptor, 5, (py) lazyArr[5].getValue(), success.bitmaps);
            vylVar.onNavigationEvent(serialDescriptor, 6, (py) lazyArr[6].getValue(), success.currency);
            vylVar.onNavigationEvent(serialDescriptor, 7, success.includeExpense);
            vylVar.onNavigationEvent(serialDescriptor, 8, success.showAmount);
            vylVar.onExtraCallbackWithResult(serialDescriptor, 9, getwrigglelayout, success.userName);
            vylVar.onNavigationEvent(serialDescriptor, 10, (py) lazyArr[10].getValue(), success.userMode);
            return null;
        }

        @Override // im.toss.securities.widget.overview.ui.small.model.OverviewSmallWidgetState
        public DisplaySetting onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 117;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            DisplaySetting displaySetting = this.displaySetting;
            int i5 = i2 + 59;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return displaySetting;
        }

        @Override // im.toss.securities.widget.overview.ui.small.model.OverviewSmallWidgetState
        public float onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 113;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            float f = this.alpha;
            int i4 = i3 + 95;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return f;
        }

        public final String asInterface() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 97;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            String str = this.accountKey;
            int i5 = i3 + 67;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final WidgetOverview.Overview IAuthTabCallback_Parcel() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 99;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            WidgetOverview.Overview overview = this.overview;
            int i4 = i2 + 39;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return overview;
        }

        private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
            Success success = (Success) objArr[0];
            int i = 2 % 2;
            int i2 = onNavigationEvent + 43;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            String str = success.formattedTime;
            if (i3 != 0) {
                int i4 = 26 / 0;
            }
            return str;
        }

        public final List<String> asBinder() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 121;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            List<String> list = this.bitmaps;
            int i5 = i3 + 83;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return list;
        }

        public final Currency IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 21;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.currency;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean IAuthTabCallbackStubProxy() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 87;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            boolean z = this.includeExpense;
            int i5 = i2 + 39;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        public final boolean getInterfaceDescriptor() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 101;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            boolean z = this.showAmount;
            int i5 = i3 + 117;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        public final String writeTypedObject() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 123;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            String str = this.userName;
            int i5 = i3 + 29;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public final HostnamesKt access100() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 91;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            HostnamesKt hostnamesKt = this.userMode;
            int i5 = i2 + 13;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return hostnamesKt;
            }
            throw null;
        }

        public static final /* synthetic */ Lazy[] IAuthTabCallbackDefault() {
            int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
            int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
            int iOnExtraCallback3 = PushInfo.Companion.onExtraCallback();
            return (Lazy[]) onExtraCallback(iOnExtraCallback2, PushInfo.Companion.onExtraCallback(), 462844251, iOnExtraCallback3, -462844250, iOnExtraCallback, new Object[0]);
        }

        @JvmStatic
        public static final /* synthetic */ void onExtraCallbackWithResult(Success success, vyl vylVar, SerialDescriptor serialDescriptor) {
            int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
            int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
            int iOnExtraCallback3 = PushInfo.Companion.onExtraCallback();
            onExtraCallback(iOnExtraCallback2, PushInfo.Companion.onExtraCallback(), -2027997339, iOnExtraCallback3, 2027997341, iOnExtraCallback, new Object[]{success, vylVar, serialDescriptor});
        }

        public final String access000() {
            int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
            int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
            int iOnExtraCallback3 = PushInfo.Companion.onExtraCallback();
            return (String) onExtraCallback(iOnExtraCallback2, PushInfo.Companion.onExtraCallback(), 2004939639, iOnExtraCallback3, -2004939639, iOnExtraCallback, new Object[]{this});
        }
    }

    @liq
    public static final class AllHidden implements OverviewSmallWidgetState {
        private static final Lazy<KSerializer<Object>>[] $childSerializers;
        public static final int $stable = 0;
        public static final Companion Companion;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        private final String accountKey;
        private final float alpha;
        private final DisplaySetting displaySetting;
        private final String formattedTime;
        private final HostnamesKt userMode;
        private final String userName;

        private static final /* synthetic */ KSerializer IAuthTabCallback_Parcel() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 15;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.tosssecurities.auth.domain.model.SecuritiesUserMode", HostnamesKt.values());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.tosssecurities.auth.domain.model.SecuritiesUserMode", HostnamesKt.values());
            int i3 = onExtraCallbackWithResult + 93;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return kSerializerOnExtraCallbackWithResult;
        }

        private static final /* synthetic */ KSerializer asBinder() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 1;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                DisplaySetting.Companion.serializer();
                throw null;
            }
            KSerializer kSerializerSerializer = DisplaySetting.Companion.serializer();
            int i3 = onExtraCallbackWithResult + 95;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return kSerializerSerializer;
        }

        public static /* synthetic */ KSerializer onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 107;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                IAuthTabCallback_Parcel();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            KSerializer kSerializerIAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
            int i3 = onExtraCallback + 117;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return kSerializerIAuthTabCallback_Parcel;
        }

        public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 115;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerAsBinder = asBinder();
            int i4 = onExtraCallbackWithResult + 7;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return kSerializerAsBinder;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
            int i7 = (~((~i4) | i5)) | i;
            int i8 = ~i;
            int i9 = (~(i8 | i5)) | (~(i8 | i4)) | (~(i5 | i4));
            int i10 = (~(i4 | (~i5))) | i8;
            int i11 = i + i5 + i6 + ((-2137991558) * i2) + (111092868 * i3);
            int i12 = i11 * i11;
            int i13 = (((-431794203) * i) - 566755328) + (427185167 * i5) + (i7 * 1717982222) + (1717982222 * i9) + ((-1717982222) * i10) + ((-1290797056) * i6) + ((-1247805440) * i2) + ((-1807745024) * i3) + ((-591921152) * i12);
            int i14 = (i * (-1469267343)) + 1003592187 + (i5 * (-1469268429)) + (i7 * (-362)) + (i9 * (-362)) + (i10 * 362) + (i6 * (-1469268067)) + (i2 * 1951436498) + (i3 * (-746069772)) + (i12 * (-1529348096));
            if (i13 + (i14 * i14 * 1762131968) == 1) {
                return onExtraCallback(objArr);
            }
            AllHidden allHidden = (AllHidden) objArr[0];
            int i15 = 2 % 2;
            int i16 = onExtraCallbackWithResult + 61;
            int i17 = i16 % 128;
            onExtraCallback = i17;
            int i18 = i16 % 2;
            String str = allHidden.formattedTime;
            int i19 = i17 + 51;
            onExtraCallbackWithResult = i19 % 128;
            int i20 = i19 % 2;
            return str;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AllHidden)) {
                int i2 = onExtraCallback + 61;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            AllHidden allHidden = (AllHidden) obj;
            if (this.displaySetting != allHidden.displaySetting || Float.compare(this.alpha, allHidden.alpha) != 0) {
                return false;
            }
            if (!Intrinsics.areEqual(this.accountKey, allHidden.accountKey)) {
                int i4 = onExtraCallbackWithResult + 99;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.formattedTime, allHidden.formattedTime)) {
                int i6 = onExtraCallback + 77;
                onExtraCallbackWithResult = i6 % 128;
                return i6 % 2 != 0;
            }
            if (!Intrinsics.areEqual(this.userName, allHidden.userName)) {
                int i7 = onExtraCallback + 77;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if (this.userMode != allHidden.userMode) {
                int i9 = onExtraCallback + 109;
                onExtraCallbackWithResult = i9 % 128;
                return i9 % 2 != 0;
            }
            int i10 = onExtraCallback + 23;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x003b A[PHI: r1 r3 r4
          0x003b: PHI (r1v18 int) = (r1v5 int), (r1v20 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
          0x003b: PHI (r3v4 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
          0x003b: PHI (r4v6 java.lang.String) = (r4v0 java.lang.String), (r4v8 java.lang.String) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0030 A[PHI: r1 r3
          0x0030: PHI (r1v6 int) = (r1v5 int), (r1v20 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
          0x0030: PHI (r3v2 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            String str;
            int iHashCode3;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 103;
            onExtraCallback = i2 % 128;
            int iHashCode4 = 0;
            if (i2 % 2 == 0) {
                iHashCode = this.displaySetting.hashCode();
                iHashCode2 = Float.hashCode(this.alpha);
                str = this.accountKey;
                if (str == null) {
                    int i3 = onExtraCallback + 45;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    iHashCode3 = 0;
                } else {
                    iHashCode3 = str.hashCode();
                }
            } else {
                iHashCode = this.displaySetting.hashCode();
                iHashCode2 = Float.hashCode(this.alpha);
                str = this.accountKey;
                if (str == null) {
                }
            }
            int iHashCode5 = this.formattedTime.hashCode();
            String str2 = this.userName;
            if (str2 != null) {
                int i5 = onExtraCallbackWithResult + 115;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                iHashCode4 = str2.hashCode();
            }
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode5) * 31) + iHashCode4) * 31) + this.userMode.hashCode();
        }

        public String toString() {
            int i = 2 % 2;
            String str = "AllHidden(displaySetting=" + this.displaySetting + ", alpha=" + this.alpha + ", accountKey=" + this.accountKey + ", formattedTime=" + this.formattedTime + ", userName=" + this.userName + ", userMode=" + this.userMode + ")";
            int i2 = onExtraCallbackWithResult + 73;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 81 / 0;
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
                OverviewSmallWidgetState$AllHidden$$serializer overviewSmallWidgetState$AllHidden$$serializer;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 59;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    overviewSmallWidgetState$AllHidden$$serializer = OverviewSmallWidgetState$AllHidden$$serializer.INSTANCE;
                    int i3 = 99 / 0;
                } else {
                    overviewSmallWidgetState$AllHidden$$serializer = OverviewSmallWidgetState$AllHidden$$serializer.INSTANCE;
                }
                int i4 = IAuthTabCallback + 51;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 91 / 0;
                }
                return overviewSmallWidgetState$AllHidden$$serializer;
            }
        }

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new Companion(defaultConstructorMarker);
            TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
            $childSerializers = new Lazy[]{LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.securities.widget.overview.ui.small.model.OverviewSmallWidgetState$AllHidden$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke() {
                    KSerializer kSerializerOnExtraCallbackWithResult;
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 91;
                    onExtraCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        kSerializerOnExtraCallbackWithResult = OverviewSmallWidgetState.AllHidden.onExtraCallbackWithResult();
                        int i3 = 17 / 0;
                    } else {
                        kSerializerOnExtraCallbackWithResult = OverviewSmallWidgetState.AllHidden.onExtraCallbackWithResult();
                    }
                    int i4 = IAuthTabCallback + 89;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return kSerializerOnExtraCallbackWithResult;
                }
            }), null, null, null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.securities.widget.overview.ui.small.model.OverviewSmallWidgetState$AllHidden$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 83;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    KSerializer kSerializerOnExtraCallback = OverviewSmallWidgetState.AllHidden.onExtraCallback();
                    int i4 = IAuthTabCallback + 7;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return kSerializerOnExtraCallback;
                }
            })};
            int i = onWarmupCompleted + 123;
            IAuthTabCallback = i % 128;
            if (i % 2 == 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }

        public /* synthetic */ AllHidden(int i, DisplaySetting displaySetting, float f, String str, String str2, String str3, HostnamesKt hostnamesKt, okycx okycxVar) {
            if (56 != (i & 56)) {
                htf31.onExtraCallbackWithResult(i, 56, OverviewSmallWidgetState$AllHidden$$serializer.INSTANCE.getDescriptor());
                int i2 = 2 % 2;
            }
            if ((i & 1) == 0) {
                displaySetting = DisplaySetting.SYSTEM;
                int i3 = 2 % 2;
            }
            this.displaySetting = displaySetting;
            if ((i & 2) == 0) {
                int i4 = onExtraCallbackWithResult + 59;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                this.alpha = 1.0f;
            } else {
                this.alpha = f;
            }
            int i6 = 2 % 2;
            if ((i & 4) == 0) {
                int i7 = onExtraCallback + 21;
                int i8 = i7 % 128;
                onExtraCallbackWithResult = i8;
                int i9 = i7 % 2;
                this.accountKey = null;
                if (i9 != 0) {
                    int i10 = 40 / 0;
                }
                int i11 = i8 + 45;
                onExtraCallback = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 2 % 2;
                }
            } else {
                this.accountKey = str;
            }
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

        public static final /* synthetic */ Lazy[] IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 15;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            int i4 = i2 + 13;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return lazyArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onExtraCallback(AllHidden allHidden, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                int i2 = onExtraCallbackWithResult + 119;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 45 / 0;
                    if (allHidden.onWarmupCompleted() != DisplaySetting.SYSTEM) {
                        vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[0].getValue(), allHidden.onWarmupCompleted());
                    }
                } else if (allHidden.onWarmupCompleted() != DisplaySetting.SYSTEM) {
                }
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                int i4 = onExtraCallback + 87;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                if (Float.compare(allHidden.onNavigationEvent(), 1.0f) != 0) {
                    vylVar.onExtraCallback(serialDescriptor, 1, allHidden.onNavigationEvent());
                    int i6 = onExtraCallback + 67;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 2) || allHidden.accountKey != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, allHidden.accountKey);
            }
            vylVar.onExtraCallback(serialDescriptor, 3, allHidden.formattedTime);
            vylVar.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, allHidden.userName);
            vylVar.onNavigationEvent(serialDescriptor, 5, (py) lazyArr[5].getValue(), allHidden.userMode);
        }

        @Override // im.toss.securities.widget.overview.ui.small.model.OverviewSmallWidgetState
        public DisplaySetting onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 19;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return this.displaySetting;
            }
            throw null;
        }

        @Override // im.toss.securities.widget.overview.ui.small.model.OverviewSmallWidgetState
        public float onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 115;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            float f = this.alpha;
            int i5 = i2 + 75;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return f;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 113;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            String str = this.accountKey;
            int i5 = i2 + 109;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
            AllHidden allHidden = (AllHidden) objArr[0];
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 15;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            String str = allHidden.userName;
            int i5 = i3 + 89;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final HostnamesKt onTransact() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 67;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            HostnamesKt hostnamesKt = this.userMode;
            int i4 = i3 + 121;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return hostnamesKt;
            }
            throw null;
        }

        public final String asInterface() {
            return (String) onWarmupCompleted(-1551721137, new Object[]{this}, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 1551721137, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult());
        }

        public final String IAuthTabCallbackStub() {
            return (String) onWarmupCompleted(-252433225, new Object[]{this}, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 252433226, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult());
        }
    }

    @nc(IAuthTabCallback = "NetworkError")
    @liq
    public static final class NetworkError extends Exception implements OverviewSmallWidgetState {
        public static final Companion Companion;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;
        private final float alpha;
        private final DisplaySetting displaySetting;
        public static final int $stable = 8;
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.securities.widget.overview.ui.small.model.OverviewSmallWidgetState$NetworkError$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 113;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    OverviewSmallWidgetState.NetworkError.onExtraCallback();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                KSerializer kSerializerOnExtraCallback = OverviewSmallWidgetState.NetworkError.onExtraCallback();
                int i3 = onExtraCallback + 27;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 34 / 0;
                }
                return kSerializerOnExtraCallback;
            }
        }), null};

        /* JADX WARN: Illegal instructions before constructor call */
        public NetworkError() {
            DisplaySetting displaySetting = null;
            this(displaySetting, 0.0f, 3, (DefaultConstructorMarker) displaySetting);
        }

        private static final /* synthetic */ KSerializer IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 77;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerSerializer = DisplaySetting.Companion.serializer();
            int i4 = IAuthTabCallback + 19;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerSerializer;
        }

        public static /* synthetic */ KSerializer onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 81;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerIAuthTabCallback = IAuthTabCallback();
            int i4 = IAuthTabCallback + 17;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerIAuthTabCallback;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 45;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NetworkError)) {
                int i4 = i2 + 53;
                IAuthTabCallback = i4 % 128;
                return i4 % 2 == 0;
            }
            NetworkError networkError = (NetworkError) obj;
            if (this.displaySetting == networkError.displaySetting) {
                return Float.compare(this.alpha, networkError.alpha) == 0;
            }
            int i5 = i2 + 73;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 13;
            IAuthTabCallback = i2 % 128;
            int iHashCode = i2 % 2 == 0 ? (this.displaySetting.hashCode() >>> 33) * Float.hashCode(this.alpha) : (this.displaySetting.hashCode() * 31) + Float.hashCode(this.alpha);
            int i3 = IAuthTabCallback + 73;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        @Override // java.lang.Throwable
        public String toString() {
            int i = 2 % 2;
            String str = "NetworkError(displaySetting=" + this.displaySetting + ", alpha=" + this.alpha + ")";
            int i2 = IAuthTabCallback + 121;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<NetworkError> serializer() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 79;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                OverviewSmallWidgetState$NetworkError$$serializer overviewSmallWidgetState$NetworkError$$serializer = OverviewSmallWidgetState$NetworkError$$serializer.INSTANCE;
                int i4 = onWarmupCompleted + 77;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return overviewSmallWidgetState$NetworkError$$serializer;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new Companion(defaultConstructorMarker);
            int i = onExtraCallbackWithResult + 83;
            onWarmupCompleted = i % 128;
            if (i % 2 == 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }

        public /* synthetic */ NetworkError(int i, DisplaySetting displaySetting, float f, okycx okycxVar) {
            if ((i & 1) == 0) {
                displaySetting = DisplaySetting.SYSTEM;
                int i2 = IAuthTabCallback + 101;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            }
            this.displaySetting = displaySetting;
            if ((i & 2) != 0) {
                this.alpha = f;
                int i5 = onNavigationEvent + 81;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return;
            }
            int i7 = onNavigationEvent + 51;
            int i8 = i7 % 128;
            IAuthTabCallback = i8;
            int i9 = i7 % 2;
            this.alpha = 1.0f;
            int i10 = i8 + 55;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkError(@NotNull DisplaySetting displaySetting, float f) {
            super("네트워크 오류가 발생했습니다.");
            Intrinsics.checkNotNullParameter(displaySetting, "");
            this.displaySetting = displaySetting;
            this.alpha = f;
        }

        public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 69;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            int i5 = i3 + 67;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return lazyArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onNavigationEvent(NetworkError networkError, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                int i2 = onNavigationEvent + 13;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                if (networkError.onWarmupCompleted() != DisplaySetting.SYSTEM) {
                    vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[0].getValue(), networkError.onWarmupCompleted());
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 1) || Float.compare(networkError.onNavigationEvent(), 1.0f) != 0) {
                vylVar.onExtraCallback(serialDescriptor, 1, networkError.onNavigationEvent());
            }
            int i4 = onNavigationEvent + 61;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ NetworkError(DisplaySetting displaySetting, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = IAuthTabCallback + 75;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    displaySetting = DisplaySetting.SYSTEM;
                    int i3 = 57 / 0;
                } else {
                    displaySetting = DisplaySetting.SYSTEM;
                }
                int i4 = onNavigationEvent + 99;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 2;
                }
            }
            this(displaySetting, (i & 2) != 0 ? 1.0f : f);
        }

        @Override // im.toss.securities.widget.overview.ui.small.model.OverviewSmallWidgetState
        public DisplaySetting onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 91;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return this.displaySetting;
            }
            throw null;
        }

        @Override // im.toss.securities.widget.overview.ui.small.model.OverviewSmallWidgetState
        public float onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 95;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            float f = this.alpha;
            int i5 = i2 + 13;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }
    }

    @nc(IAuthTabCallback = "GuestUser")
    @liq
    public static final class NotTradeableUser extends Exception implements OverviewSmallWidgetState {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final float alpha;
        private final DisplaySetting displaySetting;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.securities.widget.overview.ui.small.model.OverviewSmallWidgetState$NotTradeableUser$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                KSerializer kSerializerOnExtraCallback;
                int i = 2 % 2;
                int i2 = onExtraCallback + 45;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    kSerializerOnExtraCallback = OverviewSmallWidgetState.NotTradeableUser.onExtraCallback();
                    int i3 = 70 / 0;
                } else {
                    kSerializerOnExtraCallback = OverviewSmallWidgetState.NotTradeableUser.onExtraCallback();
                }
                int i4 = onWarmupCompleted + 47;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnExtraCallback;
            }
        }), null};

        /* JADX WARN: Illegal instructions before constructor call */
        public NotTradeableUser() {
            DisplaySetting displaySetting = null;
            this(displaySetting, 0.0f, 3, (DefaultConstructorMarker) displaySetting);
        }

        private static final /* synthetic */ KSerializer IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 107;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            DisplaySetting.Companion companion = DisplaySetting.Companion;
            if (i3 != 0) {
                return companion.serializer();
            }
            companion.serializer();
            throw null;
        }

        public static /* synthetic */ KSerializer onExtraCallback() {
            KSerializer kSerializerIAuthTabCallback;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 9;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                kSerializerIAuthTabCallback = IAuthTabCallback();
                int i3 = 10 / 0;
            } else {
                kSerializerIAuthTabCallback = IAuthTabCallback();
            }
            int i4 = onExtraCallbackWithResult + 5;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return kSerializerIAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 115;
            int i4 = i3 % 128;
            onExtraCallbackWithResult = i4;
            if (i3 % 2 != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this == obj) {
                int i5 = i2 + 77;
                onExtraCallbackWithResult = i5 % 128;
                return i5 % 2 == 0;
            }
            if (!(obj instanceof NotTradeableUser)) {
                int i6 = i4 + 87;
                onNavigationEvent = i6 % 128;
                return i6 % 2 == 0;
            }
            NotTradeableUser notTradeableUser = (NotTradeableUser) obj;
            if (this.displaySetting != notTradeableUser.displaySetting) {
                int i7 = i4 + 39;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if (Float.compare(this.alpha, notTradeableUser.alpha) != 0) {
                int i9 = onExtraCallbackWithResult + 55;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                return false;
            }
            int i11 = onExtraCallbackWithResult + 15;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 91;
            onExtraCallbackWithResult = i2 % 128;
            int iHashCode = i2 % 2 != 0 ? (this.displaySetting.hashCode() - 114) / Float.hashCode(this.alpha) : (this.displaySetting.hashCode() * 31) + Float.hashCode(this.alpha);
            int i3 = onNavigationEvent + 23;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // java.lang.Throwable
        public String toString() {
            int i = 2 % 2;
            String str = "NotTradeableUser(displaySetting=" + this.displaySetting + ", alpha=" + this.alpha + ")";
            int i2 = onExtraCallbackWithResult + 113;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final class Companion {
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<NotTradeableUser> serializer() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 65;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                OverviewSmallWidgetState$NotTradeableUser$$serializer overviewSmallWidgetState$NotTradeableUser$$serializer = OverviewSmallWidgetState$NotTradeableUser$$serializer.INSTANCE;
                int i4 = onExtraCallback + 121;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 57 / 0;
                }
                return overviewSmallWidgetState$NotTradeableUser$$serializer;
            }
        }

        static {
            int i = onExtraCallback + 31;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
                int i2 = 38 / 0;
            }
        }

        public /* synthetic */ NotTradeableUser(int i, DisplaySetting displaySetting, float f, okycx okycxVar) {
            if ((i & 1) == 0) {
                displaySetting = DisplaySetting.SYSTEM;
                int i2 = onNavigationEvent + 13;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 % 2;
                }
            }
            this.displaySetting = displaySetting;
            if ((i & 2) == 0) {
                int i4 = onExtraCallbackWithResult + 119;
                onNavigationEvent = i4 % 128;
                this.alpha = i4 % 2 == 0 ? 0.0f : 1.0f;
            } else {
                this.alpha = f;
                int i5 = onExtraCallbackWithResult + 107;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 84 / 0;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotTradeableUser(@NotNull DisplaySetting displaySetting, float f) {
            super("매매 가능회원이 아님.");
            Intrinsics.checkNotNullParameter(displaySetting, "");
            this.displaySetting = displaySetting;
            this.alpha = f;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onExtraCallbackWithResult(NotTradeableUser notTradeableUser, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 37;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                int i4 = onNavigationEvent + 83;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    notTradeableUser.onWarmupCompleted();
                    DisplaySetting displaySetting = DisplaySetting.SYSTEM;
                    throw null;
                }
                if (notTradeableUser.onWarmupCompleted() != DisplaySetting.SYSTEM) {
                    vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[0].getValue(), notTradeableUser.onWarmupCompleted());
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 1) || Float.compare(notTradeableUser.onNavigationEvent(), 1.0f) != 0) {
                vylVar.onExtraCallback(serialDescriptor, 1, notTradeableUser.onNavigationEvent());
            }
        }

        public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 77;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (i3 != 0) {
                int i4 = 79 / 0;
            }
            return lazyArr;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ NotTradeableUser(DisplaySetting displaySetting, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onNavigationEvent + 43;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                displaySetting = DisplaySetting.SYSTEM;
                int i4 = onExtraCallbackWithResult + 29;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            }
            if ((i & 2) != 0) {
                int i7 = onExtraCallbackWithResult + 121;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 2 / 2;
                } else {
                    int i9 = 2 % 2;
                }
                f = 1.0f;
            }
            this(displaySetting, f);
        }

        @Override // im.toss.securities.widget.overview.ui.small.model.OverviewSmallWidgetState
        public DisplaySetting onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 55;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            DisplaySetting displaySetting = this.displaySetting;
            int i5 = i3 + 81;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return displaySetting;
            }
            throw null;
        }

        @Override // im.toss.securities.widget.overview.ui.small.model.OverviewSmallWidgetState
        public float onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 85;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            float f = this.alpha;
            int i5 = i3 + 7;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }
    }

    @nc(IAuthTabCallback = "Error")
    @liq
    public static final class Error extends Exception implements OverviewSmallWidgetState {
        public static final Companion Companion;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;
        private final float alpha;
        private final DisplaySetting displaySetting;
        private final String message;
        public static final int $stable = 8;
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.securities.widget.overview.ui.small.model.OverviewSmallWidgetState$Error$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 1;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnExtraCallback = OverviewSmallWidgetState.Error.onExtraCallback();
                int i4 = onExtraCallbackWithResult + 63;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return kSerializerOnExtraCallback;
                }
                throw null;
            }
        }), null, null};

        public Error() {
            this((DisplaySetting) null, 0.0f, (String) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ KSerializer onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 107;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i4 = onExtraCallbackWithResult + 39;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnExtraCallbackWithResult;
        }

        private static final /* synthetic */ KSerializer onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 7;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerSerializer = DisplaySetting.Companion.serializer();
            int i4 = onNavigationEvent + 73;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerSerializer;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 83;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            if (this == obj) {
                int i5 = i3 + 53;
                onNavigationEvent = i5 % 128;
                return i5 % 2 == 0;
            }
            if (obj instanceof Error) {
                Error error = (Error) obj;
                return this.displaySetting == error.displaySetting && Float.compare(this.alpha, error.alpha) == 0 && Intrinsics.areEqual(this.message, error.message);
            }
            int i6 = i3 + 9;
            onNavigationEvent = i6 % 128;
            return i6 % 2 != 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x003d A[PHI: r1 r3 r4
          0x003d: PHI (r1v12 int) = (r1v5 int), (r1v14 int) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
          0x003d: PHI (r3v4 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
          0x003d: PHI (r4v4 java.lang.String) = (r4v0 java.lang.String), (r4v5 java.lang.String) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0033 A[PHI: r1 r3
          0x0033: PHI (r1v6 int) = (r1v5 int), (r1v14 int) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
          0x0033: PHI (r3v2 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            String str;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 45;
            onExtraCallbackWithResult = i2 % 128;
            int iHashCode3 = 0;
            if (i2 % 2 == 0) {
                iHashCode = this.displaySetting.hashCode();
                iHashCode2 = Float.hashCode(this.alpha);
                str = this.message;
                int i3 = 81 / 0;
                if (str == null) {
                    int i4 = onNavigationEvent + 101;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    iHashCode3 = str.hashCode();
                }
            } else {
                iHashCode = this.displaySetting.hashCode();
                iHashCode2 = Float.hashCode(this.alpha);
                str = this.message;
                if (str == null) {
                }
            }
            return (((iHashCode * 31) + iHashCode2) * 31) + iHashCode3;
        }

        @Override // java.lang.Throwable
        public String toString() {
            int i = 2 % 2;
            String str = "Error(displaySetting=" + this.displaySetting + ", alpha=" + this.alpha + ", message=" + this.message + ")";
            int i2 = onNavigationEvent + 85;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Error> serializer() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 61;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    OverviewSmallWidgetState$Error$$serializer overviewSmallWidgetState$Error$$serializer = OverviewSmallWidgetState$Error$$serializer.INSTANCE;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                OverviewSmallWidgetState$Error$$serializer overviewSmallWidgetState$Error$$serializer2 = OverviewSmallWidgetState$Error$$serializer.INSTANCE;
                int i3 = onExtraCallbackWithResult + 37;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return overviewSmallWidgetState$Error$$serializer2;
            }
        }

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new Companion(defaultConstructorMarker);
            int i = IAuthTabCallback + 61;
            onWarmupCompleted = i % 128;
            if (i % 2 == 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }

        public /* synthetic */ Error(int i, DisplaySetting displaySetting, float f, String str, okycx okycxVar) {
            if ((i & 1) == 0) {
                displaySetting = DisplaySetting.SYSTEM;
                int i2 = onExtraCallbackWithResult + 1;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 % 2;
                }
            }
            this.displaySetting = displaySetting;
            if ((i & 2) == 0) {
                int i4 = onExtraCallbackWithResult + 21;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                this.alpha = 1.0f;
                int i6 = 2 % 2;
            } else {
                this.alpha = f;
            }
            if ((i & 4) == 0) {
                this.message = null;
            } else {
                this.message = str;
            }
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
            int i2 = onNavigationEvent + 37;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return $childSerializers;
            }
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onExtraCallback(Error error, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (vylVar.onWarmupCompleted(serialDescriptor, 0) || error.onWarmupCompleted() != DisplaySetting.SYSTEM) {
                vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[0].getValue(), error.onWarmupCompleted());
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                int i2 = onNavigationEvent + 33;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                if (Float.compare(error.onNavigationEvent(), 1.0f) != 0) {
                    vylVar.onExtraCallback(serialDescriptor, 1, error.onNavigationEvent());
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 2) || error.getMessage() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, error.getMessage());
                int i4 = onNavigationEvent + 79;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Error(DisplaySetting displaySetting, float f, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onNavigationEvent + 67;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    displaySetting = DisplaySetting.SYSTEM;
                    int i3 = 23 / 0;
                } else {
                    displaySetting = DisplaySetting.SYSTEM;
                }
            }
            f = (i & 2) != 0 ? 1.0f : f;
            if ((i & 4) != 0) {
                int i4 = onNavigationEvent + 1;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
                str = null;
            }
            this(displaySetting, f, str);
        }

        @Override // im.toss.securities.widget.overview.ui.small.model.OverviewSmallWidgetState
        public DisplaySetting onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 109;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            DisplaySetting displaySetting = this.displaySetting;
            int i5 = i3 + 39;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return displaySetting;
        }

        @Override // im.toss.securities.widget.overview.ui.small.model.OverviewSmallWidgetState
        public float onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 81;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            float f = this.alpha;
            int i5 = i3 + 37;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return f;
            }
            throw null;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 1;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return this.message;
            }
            throw null;
        }
    }

    @nc(IAuthTabCallback = "Loading")
    @liq
    public static final class Loading implements OverviewSmallWidgetState {
        public static final int $stable = 0;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private final float alpha;
        private final DisplaySetting displaySetting;
        public static final Companion Companion = new Companion(null);
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.securities.widget.overview.ui.small.model.OverviewSmallWidgetState$Loading$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 93;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return OverviewSmallWidgetState.Loading.IAuthTabCallback();
                }
                OverviewSmallWidgetState.Loading.IAuthTabCallback();
                throw null;
            }
        }), null};

        /* JADX WARN: Illegal instructions before constructor call */
        public Loading() {
            DisplaySetting displaySetting = null;
            this(displaySetting, 0.0f, 3, (DefaultConstructorMarker) displaySetting);
        }

        public static /* synthetic */ KSerializer IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 5;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallback = onExtraCallback();
            int i4 = onNavigationEvent + 123;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnExtraCallback;
        }

        private static final /* synthetic */ KSerializer onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 51;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerSerializer = DisplaySetting.Companion.serializer();
            if (i3 == 0) {
                int i4 = 26 / 0;
            }
            return kSerializerSerializer;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loading)) {
                int i2 = onNavigationEvent + 33;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 95 / 0;
                }
                return false;
            }
            Loading loading = (Loading) obj;
            if (this.displaySetting == loading.displaySetting) {
                return Float.compare(this.alpha, loading.alpha) == 0;
            }
            int i4 = onNavigationEvent + 13;
            IAuthTabCallback = i4 % 128;
            return i4 % 2 != 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 79;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (this.displaySetting.hashCode() * 31) + Float.hashCode(this.alpha);
            int i4 = onNavigationEvent + 59;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Loading(displaySetting=" + this.displaySetting + ", alpha=" + this.alpha + ")";
            int i2 = IAuthTabCallback + 121;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 19 / 0;
            }
            return str;
        }

        public static final class Companion {
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Loading> serializer() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 27;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                OverviewSmallWidgetState$Loading$$serializer overviewSmallWidgetState$Loading$$serializer = OverviewSmallWidgetState$Loading$$serializer.INSTANCE;
                if (i3 == 0) {
                    return overviewSmallWidgetState$Loading$$serializer;
                }
                throw null;
            }
        }

        static {
            int i = onExtraCallback + 13;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 != 0) {
                int i2 = 94 / 0;
            }
        }

        public /* synthetic */ Loading(int i, DisplaySetting displaySetting, float f, okycx okycxVar) {
            this.displaySetting = (i & 1) == 0 ? DisplaySetting.SYSTEM : displaySetting;
            if ((i & 2) != 0) {
                this.alpha = f;
                int i2 = IAuthTabCallback + 45;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return;
            }
            this.alpha = 1.0f;
            int i4 = IAuthTabCallback + 59;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 56 / 0;
            }
        }

        public Loading(@NotNull DisplaySetting displaySetting, float f) {
            Intrinsics.checkNotNullParameter(displaySetting, "");
            this.displaySetting = displaySetting;
            this.alpha = f;
        }

        @JvmStatic
        public static final /* synthetic */ void onExtraCallbackWithResult(Loading loading, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (vylVar.onWarmupCompleted(serialDescriptor, 0) || loading.onWarmupCompleted() != DisplaySetting.SYSTEM) {
                vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[0].getValue(), loading.onWarmupCompleted());
                int i2 = IAuthTabCallback + 113;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                int i4 = IAuthTabCallback + 27;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                float fOnNavigationEvent = loading.onNavigationEvent();
                if (i5 == 0) {
                    if (Float.compare(fOnNavigationEvent, 2.0f) == 0) {
                        return;
                    }
                } else if (Float.compare(fOnNavigationEvent, 1.0f) == 0) {
                    return;
                }
            }
            vylVar.onExtraCallback(serialDescriptor, 1, loading.onNavigationEvent());
        }

        public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 93;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            int i5 = i3 + 7;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return lazyArr;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Loading(DisplaySetting displaySetting, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                displaySetting = DisplaySetting.SYSTEM;
                int i2 = onNavigationEvent + 3;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            }
            if ((i & 2) != 0) {
                int i5 = onNavigationEvent + 3;
                IAuthTabCallback = i5 % 128;
                f = i5 % 2 != 0 ? 0.0f : 1.0f;
            }
            this(displaySetting, f);
        }

        @Override // im.toss.securities.widget.overview.ui.small.model.OverviewSmallWidgetState
        public DisplaySetting onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 17;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            DisplaySetting displaySetting = this.displaySetting;
            int i5 = i3 + 31;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return displaySetting;
        }

        @Override // im.toss.securities.widget.overview.ui.small.model.OverviewSmallWidgetState
        public float onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 45;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            float f = this.alpha;
            if (i3 != 0) {
                int i4 = 1 / 0;
            }
            return f;
        }
    }

    @liq
    public static final class Maintenance implements OverviewSmallWidgetState {
        public static final int $stable = 0;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final float alpha;
        private final DisplaySetting displaySetting;
        public static final Companion Companion = new Companion(null);
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.securities.widget.overview.ui.small.model.OverviewSmallWidgetState$Maintenance$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 105;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnExtraCallback = OverviewSmallWidgetState.Maintenance.onExtraCallback();
                int i4 = onExtraCallbackWithResult + 81;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnExtraCallback;
            }
        }), null};

        /* JADX WARN: Illegal instructions before constructor call */
        public Maintenance() {
            DisplaySetting displaySetting = null;
            this(displaySetting, 0.0f, 3, (DefaultConstructorMarker) displaySetting);
        }

        private static final /* synthetic */ KSerializer IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 97;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                DisplaySetting.Companion.serializer();
                obj.hashCode();
                throw null;
            }
            KSerializer kSerializerSerializer = DisplaySetting.Companion.serializer();
            int i3 = onNavigationEvent + 67;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return kSerializerSerializer;
            }
            throw null;
        }

        public static /* synthetic */ KSerializer onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 17;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerIAuthTabCallback = IAuthTabCallback();
            int i4 = onNavigationEvent + 71;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerIAuthTabCallback;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 75;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Maintenance)) {
                return false;
            }
            Maintenance maintenance = (Maintenance) obj;
            if (this.displaySetting != maintenance.displaySetting) {
                return false;
            }
            if (Float.compare(this.alpha, maintenance.alpha) == 0) {
                return true;
            }
            int i4 = IAuthTabCallback + 89;
            int i5 = i4 % 128;
            onNavigationEvent = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 13;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 13;
            onNavigationEvent = i2 % 128;
            int iHashCode = i2 % 2 == 0 ? (this.displaySetting.hashCode() * 93) - Float.hashCode(this.alpha) : (this.displaySetting.hashCode() * 31) + Float.hashCode(this.alpha);
            int i3 = onNavigationEvent + 7;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Maintenance(displaySetting=" + this.displaySetting + ", alpha=" + this.alpha + ")";
            int i2 = IAuthTabCallback + 79;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Maintenance> serializer() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 113;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                OverviewSmallWidgetState$Maintenance$$serializer overviewSmallWidgetState$Maintenance$$serializer = OverviewSmallWidgetState$Maintenance$$serializer.INSTANCE;
                int i4 = onWarmupCompleted + 67;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return overviewSmallWidgetState$Maintenance$$serializer;
            }
        }

        static {
            int i = onWarmupCompleted + 109;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        public /* synthetic */ Maintenance(int i, DisplaySetting displaySetting, float f, okycx okycxVar) {
            if ((i & 1) == 0) {
                displaySetting = DisplaySetting.SYSTEM;
                int i2 = IAuthTabCallback + 97;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            }
            this.displaySetting = displaySetting;
            if ((i & 2) != 0) {
                this.alpha = f;
                return;
            }
            int i5 = IAuthTabCallback + 69;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            this.alpha = 1.0f;
        }

        public Maintenance(@NotNull DisplaySetting displaySetting, float f) {
            Intrinsics.checkNotNullParameter(displaySetting, "");
            this.displaySetting = displaySetting;
            this.alpha = f;
        }

        @JvmStatic
        public static final /* synthetic */ void onExtraCallbackWithResult(Maintenance maintenance, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (vylVar.onWarmupCompleted(serialDescriptor, 0) || maintenance.onWarmupCompleted() != DisplaySetting.SYSTEM) {
                vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[0].getValue(), maintenance.onWarmupCompleted());
                int i2 = IAuthTabCallback + 47;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                int i4 = IAuthTabCallback + 37;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    if (Float.compare(maintenance.onNavigationEvent(), 1.0f) == 0) {
                        return;
                    }
                } else if (Float.compare(maintenance.onNavigationEvent(), 1.0f) == 0) {
                    return;
                }
            }
            vylVar.onExtraCallback(serialDescriptor, 1, maintenance.onNavigationEvent());
        }

        public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 101;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (i3 == 0) {
                int i4 = 45 / 0;
            }
            return lazyArr;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Maintenance(DisplaySetting displaySetting, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = IAuthTabCallback + 53;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    DisplaySetting displaySetting2 = DisplaySetting.SYSTEM;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                displaySetting = DisplaySetting.SYSTEM;
            }
            if ((i & 2) != 0) {
                int i3 = IAuthTabCallback + 97;
                onNavigationEvent = i3 % 128;
                f = i3 % 2 == 0 ? 0.0f : 1.0f;
                int i4 = 2 % 2;
            }
            this(displaySetting, f);
        }

        @Override // im.toss.securities.widget.overview.ui.small.model.OverviewSmallWidgetState
        public DisplaySetting onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 109;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.displaySetting;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // im.toss.securities.widget.overview.ui.small.model.OverviewSmallWidgetState
        public float onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 49;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.alpha;
            }
            throw null;
        }
    }
}
