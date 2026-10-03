package viva.republica.toss.network.model.loan;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.deeplink.ksp.registry.FeaturesMydataKspDeepLinkRegistry$;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ImagePipelineExperimentsBuilderExternalSyntheticLambda23;
import o.ImagePipelineExperimentsBuilderExternalSyntheticLambda8;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access15300;
import o.access8100;
import o.checkCanOpenLandingPage;
import o.getMutilBackgroundDrawable;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.setVisitUrl;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.LoanHomeExtensive;
import viva.republica.toss.network.model.loan.LoanHomeExtensive$;
import viva.republica.toss.network.model.loan.LoanHomeExtensive$ChangeInfo$;
import viva.republica.toss.network.model.loan.LoanHomeExtensive$ComparisonSection$;
import viva.republica.toss.network.model.loan.LoanHomeExtensive$ComparisonSection$ExistingLoan$;
import viva.republica.toss.network.model.loan.LoanHomeExtensive$ComparisonSection$ExistingLoan$ValueContent$;
import viva.republica.toss.network.model.loan.LoanHomeExtensive$ComparisonSection$RecommendedLoan$;
import viva.republica.toss.network.model.loan.LoanHomeExtensive$ComparisonSection$RecommendedLoan$RecommendedContent$;
import viva.republica.toss.network.model.loan.LoanHomeExtensive$DualColumnSection$;
import viva.republica.toss.network.model.loan.LoanHomeExtensive$DualColumnSection$ColumnContent$;
import viva.republica.toss.network.model.loan.LoanHomeExtensive$TopContent$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class LoanHomeExtensive {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final LoanHomeBannerResponse banner;
    private final String disclaimer;
    private final List<MenuSection> menu;
    private final List<MenuSection.MenuItem> recommendedMenuItems;
    private final TopContent top;

    private static final /* synthetic */ KSerializer asInterface() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(LoanHomeExtensive$MenuSection$MenuItem$$serializer.INSTANCE);
        int i2 = IAuthTabCallback + 119;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i5 | i;
        int i8 = ~i2;
        int i9 = i7 | i8;
        int i10 = ~(i8 | i5);
        int i11 = (~i7) | i10;
        int i12 = i10 | (~((~i5) | (~i)));
        int i13 = i5 + i + i6 + (1699743442 * i4) + (2071835342 * i3);
        int i14 = i13 * i13;
        int i15 = ((i5 * (-557635572)) - 1375207424) + ((-557635572) * i) + (i9 * (-2106796043)) + (2106796043 * i11) + ((-2106796043) * i12) + (1630535680 * i6) + ((-648019968) * i4) + ((-1801453568) * i3) + (1296564224 * i14);
        int i16 = ((i5 * (-355764420)) - 259725689) + (i * (-355764420)) + (i9 * 521) + (i11 * (-521)) + (i12 * 521) + (i6 * (-355763899)) + (i4 * 2119243930) + (i3 * (-943812730)) + (i14 * (-597164032));
        return i15 + ((i16 * i16) * 58195968) != 1 ? onNavigationEvent(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 83;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerAsInterface = asInterface();
        if (i3 != 0) {
            int i4 = 70 / 0;
        }
        return kSerializerAsInterface;
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            onTransact();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer kSerializerOnTransact = onTransact();
        int i3 = IAuthTabCallback + 21;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 51 / 0;
        }
        return kSerializerOnTransact;
    }

    private static final /* synthetic */ KSerializer onTransact() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(LoanHomeExtensive$MenuSection$$serializer.INSTANCE);
        int i2 = IAuthTabCallback + 23;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return checkcanopenlandingpage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoanHomeExtensive)) {
            int i5 = i3 + 71;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i3 + 73;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        LoanHomeExtensive loanHomeExtensive = (LoanHomeExtensive) obj;
        if (!Intrinsics.areEqual(this.top, loanHomeExtensive.top) || (!Intrinsics.areEqual(this.menu, loanHomeExtensive.menu)) || !Intrinsics.areEqual(this.recommendedMenuItems, loanHomeExtensive.recommendedMenuItems) || !Intrinsics.areEqual(this.banner, loanHomeExtensive.banner)) {
            return false;
        }
        if (Intrinsics.areEqual(this.disclaimer, loanHomeExtensive.disclaimer)) {
            return true;
        }
        int i9 = onNavigationEvent + 5;
        IAuthTabCallback = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.top.hashCode();
        int iHashCode3 = this.menu.hashCode();
        int iHashCode4 = this.recommendedMenuItems.hashCode();
        LoanHomeBannerResponse loanHomeBannerResponse = this.banner;
        if (loanHomeBannerResponse == null) {
            iHashCode = 0;
        } else {
            iHashCode = loanHomeBannerResponse.hashCode();
            int i2 = IAuthTabCallback + 99;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
        }
        int iHashCode5 = (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode) * 31) + this.disclaimer.hashCode();
        int i4 = IAuthTabCallback + 55;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode5;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanHomeExtensive(top=" + this.top + ", menu=" + this.menu + ", recommendedMenuItems=" + this.recommendedMenuItems + ", banner=" + this.banner + ", disclaimer=" + this.disclaimer + ")";
        int i2 = IAuthTabCallback + 33;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @liq
    public static final class TopContent {
        private static int $10 = 0;
        private static int $11 = 1;
        private static final Lazy<KSerializer<Object>>[] $childSerializers;
        public static final Companion Companion;
        private static int IAuthTabCallback = 0;
        private static int[] onExtraCallback = null;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;
        private final String badgeText;
        private final ComparisonSection comparisonSection;
        private final String ctaText;
        private final String darkAssetUrl;
        private final DualColumnSection dualColumnSection;
        private final List<LoanHomeExtensiveFeature> features;
        private final ImagePipelineExperimentsBuilderExternalSyntheticLambda23 homeServiceType;
        private final boolean isCompareLoanEnabled;
        private final String lightAssetUrl;
        private final String loadingText;
        private final String loanStatus;
        private final Map<String, String> logParams;
        private final String logType;
        private final String scheme;
        private final ImagePipelineExperimentsBuilderExternalSyntheticLambda8 serviceStatus;
        private final String subtitle;
        private final LoanHomeServiceSummaryResult summaryResult;
        private final String title;
        private final String type;

        public TopContent() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 65535, null);
        }

        public static /* synthetic */ Object IAuthTabCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
            int i7 = ~i4;
            int i8 = ~i;
            int i9 = ~(i7 | i8);
            int i10 = ~i2;
            int i11 = i9 | (~(i10 | i));
            int i12 = (~(i | i7)) | (~(i8 | i10));
            int i13 = ~(i4 | i2);
            int i14 = i12 | i13;
            int i15 = i13 | i11;
            int i16 = i4 + i2 + i6 + ((-1585779005) * i3) + (640148872 * i5);
            int i17 = i16 * i16;
            int i18 = (i4 * 308833806) + 153878528 + (308833806 * i2) + ((-448846874) * i11) + ((-224423437) * i14) + (224423437 * i15) + (84410368 * i6) + (1159200768 * i3) + ((-734003200) * i5) + (2089549824 * i17);
            int i19 = (i4 * (-1291220770)) + 263398195 + (i2 * (-1291220770)) + (i11 * (-1802)) + (i14 * (-901)) + (i15 * 901) + (i6 * (-1291221671)) + (i3 * (-1079815989)) + (i5 * 669414472) + (i17 * 145489920);
            int i20 = i18 + (i19 * i19 * (-1699479552));
            return i20 != 1 ? i20 != 2 ? i20 != 3 ? i20 != 4 ? IAuthTabCallback(objArr) : onWarmupCompleted(objArr) : onExtraCallback(objArr) : onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr);
        }

        private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 65;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnActivityResized = onActivityResized();
            int i4 = onNavigationEvent + 59;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnActivityResized;
        }

        private static final /* synthetic */ KSerializer onActivityLayout() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 19;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.loan.LoanServiceStatus", ImagePipelineExperimentsBuilderExternalSyntheticLambda8.values());
            }
            updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.loan.LoanServiceStatus", ImagePipelineExperimentsBuilderExternalSyntheticLambda8.values());
            throw null;
        }

        private static final /* synthetic */ KSerializer onActivityResized() {
            int i = 2 % 2;
            checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(LoanHomeExtensiveFeature$$serializer.INSTANCE);
            int i2 = onExtraCallbackWithResult + 49;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return checkcanopenlandingpage;
            }
            throw null;
        }

        public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 73;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnMinimized = onMinimized();
            int i4 = onNavigationEvent + 13;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return kSerializerOnMinimized;
            }
            throw null;
        }

        public static /* synthetic */ TopContent onExtraCallbackWithResult(TopContent topContent, String str, LoanHomeServiceSummaryResult loanHomeServiceSummaryResult, String str2, String str3, String str4, String str5, String str6, List list, String str7, String str8, String str9, String str10, String str11, ComparisonSection comparisonSection, DualColumnSection dualColumnSection, boolean z, int i, Object obj) {
            String str12;
            String str13;
            String str14;
            String str15;
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult;
            int i4 = i3 + 65;
            onNavigationEvent = i4 % 128;
            String str16 = (i4 % 2 == 0 || (i & 1) == 0) ? str : topContent.loanStatus;
            LoanHomeServiceSummaryResult loanHomeServiceSummaryResult2 = (i & 2) != 0 ? topContent.summaryResult : loanHomeServiceSummaryResult;
            String str17 = (i & 4) != 0 ? topContent.type : str2;
            if ((i & 8) != 0) {
                int i5 = i3 + 79;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                str12 = topContent.title;
            } else {
                str12 = str3;
            }
            if ((i & 16) != 0) {
                str13 = topContent.subtitle;
                int i7 = i3 + 51;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
            } else {
                str13 = str4;
            }
            String str18 = (i & 32) != 0 ? topContent.lightAssetUrl : str5;
            if ((i & 64) != 0) {
                int i9 = i3 + 117;
                onNavigationEvent = i9 % 128;
                if (i9 % 2 == 0) {
                    String str19 = topContent.darkAssetUrl;
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                str14 = topContent.darkAssetUrl;
            } else {
                str14 = str6;
            }
            List list2 = (i & 128) != 0 ? topContent.features : list;
            String str20 = (i & 256) != 0 ? topContent.ctaText : str7;
            String str21 = (i & 512) != 0 ? topContent.scheme : str8;
            String str22 = (i & 1024) != 0 ? topContent.badgeText : str9;
            if ((i & 2048) != 0) {
                int i10 = onNavigationEvent + 17;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
                str15 = topContent.loadingText;
            } else {
                str15 = str10;
            }
            return topContent.onNavigationEvent(str16, loanHomeServiceSummaryResult2, str17, str12, str13, str18, str14, list2, str20, str21, str22, str15, (i & 4096) != 0 ? topContent.logType : str11, (i & 8192) != 0 ? topContent.comparisonSection : comparisonSection, (i & 16384) != 0 ? topContent.dualColumnSection : dualColumnSection, (i & 32768) != 0 ? topContent.isCompareLoanEnabled : z);
        }

        private static final /* synthetic */ KSerializer onMinimized() {
            int i = 2 % 2;
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            getMutilBackgroundDrawable getmutilbackgrounddrawable = new getMutilBackgroundDrawable(getwrigglelayout, getwrigglelayout);
            int i2 = onNavigationEvent + 101;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return getmutilbackgrounddrawable;
            }
            throw null;
        }

        private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 61;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnPostMessage = onPostMessage();
            int i4 = onExtraCallbackWithResult + 125;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return kSerializerOnPostMessage;
            }
            throw null;
        }

        private static final /* synthetic */ KSerializer onPostMessage() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 89;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.loan.LoanHomeServiceType", ImagePipelineExperimentsBuilderExternalSyntheticLambda23.values());
            }
            updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.loan.LoanHomeServiceType", ImagePipelineExperimentsBuilderExternalSyntheticLambda23.values());
            throw null;
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 55;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                onActivityLayout();
                throw null;
            }
            KSerializer kSerializerOnActivityLayout = onActivityLayout();
            int i3 = onExtraCallbackWithResult + 11;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return kSerializerOnActivityLayout;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TopContent)) {
                return false;
            }
            TopContent topContent = (TopContent) obj;
            if (!Intrinsics.areEqual(this.loanStatus, topContent.loanStatus) || (!Intrinsics.areEqual(this.summaryResult, topContent.summaryResult)) || !Intrinsics.areEqual(this.type, topContent.type)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.title, topContent.title)) {
                int i2 = onExtraCallbackWithResult + 73;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.subtitle, topContent.subtitle)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.lightAssetUrl, topContent.lightAssetUrl)) {
                int i4 = onExtraCallbackWithResult + 13;
                onNavigationEvent = i4 % 128;
                return i4 % 2 == 0;
            }
            if (!Intrinsics.areEqual(this.darkAssetUrl, topContent.darkAssetUrl)) {
                int i5 = onExtraCallbackWithResult + 3;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    return false;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (!Intrinsics.areEqual(this.features, topContent.features)) {
                int i6 = onExtraCallbackWithResult + 1;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.ctaText, topContent.ctaText)) {
                int i8 = onNavigationEvent + 117;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
            if ((!Intrinsics.areEqual(this.scheme, topContent.scheme)) || !Intrinsics.areEqual(this.badgeText, topContent.badgeText) || !Intrinsics.areEqual(this.loadingText, topContent.loadingText) || !Intrinsics.areEqual(this.logType, topContent.logType) || !Intrinsics.areEqual(this.comparisonSection, topContent.comparisonSection)) {
                return false;
            }
            if (Intrinsics.areEqual(this.dualColumnSection, topContent.dualColumnSection)) {
                return this.isCompareLoanEnabled == topContent.isCompareLoanEnabled;
            }
            int i10 = onNavigationEvent + 49;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0029 A[PHI: r2 r4 r5
          0x0029: PHI (r2v38 int) = (r2v5 int), (r2v40 int) binds: [B:8:0x0025, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]
          0x0029: PHI (r4v3 viva.republica.toss.network.model.loan.LoanHomeServiceSummaryResult) = 
          (r4v0 viva.republica.toss.network.model.loan.LoanHomeServiceSummaryResult)
          (r4v5 viva.republica.toss.network.model.loan.LoanHomeServiceSummaryResult)
         binds: [B:8:0x0025, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]
          0x0029: PHI (r5v8 int) = (r5v0 int), (r5v9 int) binds: [B:8:0x0025, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r2 r5
          0x0027: PHI (r2v6 int) = (r2v5 int), (r2v40 int) binds: [B:8:0x0025, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]
          0x0027: PHI (r5v1 int) = (r5v0 int), (r5v9 int) binds: [B:8:0x0025, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int hashCode() {
            /*
                Method dump skipped, instructions count: 239
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanHomeExtensive.TopContent.hashCode():int");
        }

        public final TopContent onNavigationEvent(@NotNull String str, @Nullable LoanHomeServiceSummaryResult loanHomeServiceSummaryResult, @NotNull String str2, @NotNull String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @NotNull List<LoanHomeExtensiveFeature> list, @NotNull String str7, @NotNull String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable ComparisonSection comparisonSection, @Nullable DualColumnSection dualColumnSection, boolean z) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            TopContent topContent = new TopContent(str, loanHomeServiceSummaryResult, str2, str3, str4, str5, str6, list, str7, str8, str9, str10, str11, comparisonSection, dualColumnSection, z);
            int i2 = onExtraCallbackWithResult + 125;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return topContent;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "TopContent(loanStatus=" + this.loanStatus + ", summaryResult=" + this.summaryResult + ", type=" + this.type + ", title=" + this.title + ", subtitle=" + this.subtitle + ", lightAssetUrl=" + this.lightAssetUrl + ", darkAssetUrl=" + this.darkAssetUrl + ", features=" + this.features + ", ctaText=" + this.ctaText + ", scheme=" + this.scheme + ", badgeText=" + this.badgeText + ", loadingText=" + this.loadingText + ", logType=" + this.logType + ", comparisonSection=" + this.comparisonSection + ", dualColumnSection=" + this.dualColumnSection + ", isCompareLoanEnabled=" + this.isCompareLoanEnabled + ")";
            int i2 = onNavigationEvent + 75;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = onExtraCallback;
            int i3 = -1469660336;
            long j = 0;
            if (iArr2 != null) {
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i4 = 0;
                while (i4 < length) {
                    int i5 = $11 + 71;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i4])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1))), (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 73, (-16768368) - Color.rgb(0, 0, 0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i4] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i4++;
                        j = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = onExtraCallback;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i7 = 0;
                while (i7 < length3) {
                    Object[] objArr3 = {Integer.valueOf(iArr5[i7])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), View.combineMeasuredStates(0, 0) + 72, View.combineMeasuredStates(0, 0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i7] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i7++;
                    i3 = -1469660336;
                }
                iArr5 = iArr6;
            }
            System.arraycopy(iArr5, 0, iArr4, 0, length2);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                int i8 = $11 + 47;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                int i10 = 0;
                while (i10 < 16) {
                    int i11 = $11 + 23;
                    $10 = i11 % 128;
                    if (i11 % 2 != 0) {
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i10];
                        Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22251), (ViewConfiguration.getScrollBarSize() >> 8) + 39, (Process.myPid() >> 22) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                        i10 += 56;
                    } else {
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i10];
                        Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.red(0) + 22252), 38 - TextUtils.lastIndexOf("", '0'), (KeyEvent.getMaxKeyCode() >> 16) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue2;
                        i10++;
                    }
                }
                int i12 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i12;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
                int i13 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
                cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
                cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
                Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 78 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        public static final class Companion {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<TopContent> serializer() {
                LoanHomeExtensive$TopContent$.serializer serializerVar;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 23;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    serializerVar = LoanHomeExtensive$TopContent$.serializer.INSTANCE;
                    int i3 = 80 / 0;
                } else {
                    serializerVar = LoanHomeExtensive$TopContent$.serializer.INSTANCE;
                }
                int i4 = IAuthTabCallback + 79;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 42 / 0;
                }
                return serializerVar;
            }
        }

        static {
            onMessageChannelReady();
            Companion = new Companion(null);
            TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
            $childSerializers = new Lazy[]{null, null, null, null, null, null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.loan.LoanHomeExtensive$TopContent$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 11;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    Object[] objArr = new Object[0];
                    int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
                    int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
                    int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
                    int iOnNavigationEvent4 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
                    if (i3 == 0) {
                        throw null;
                    }
                    KSerializer kSerializer = (KSerializer) LoanHomeExtensive.TopContent.IAuthTabCallback(iOnNavigationEvent, -844261210, objArr, iOnNavigationEvent3, 844261210, iOnNavigationEvent4, iOnNavigationEvent2);
                    int i4 = IAuthTabCallback + 69;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return kSerializer;
                }
            }), null, null, null, null, null, null, null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.loan.LoanHomeExtensive$TopContent$$ExternalSyntheticLambda1
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 107;
                    onExtraCallback = i2 % 128;
                    if (i2 % 2 == 0) {
                        return (KSerializer) LoanHomeExtensive.TopContent.IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 1836507428, new Object[0], FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -1836507424, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent());
                    }
                    int i3 = 46 / 0;
                    return (KSerializer) LoanHomeExtensive.TopContent.IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 1836507428, new Object[0], FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -1836507424, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent());
                }
            }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.loan.LoanHomeExtensive$TopContent$$ExternalSyntheticLambda2
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 1;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 == 0) {
                        return (KSerializer) LoanHomeExtensive.TopContent.IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -515472809, new Object[0], FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 515472811, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent());
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.loan.LoanHomeExtensive$TopContent$$ExternalSyntheticLambda3
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 73;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    KSerializer kSerializerOnExtraCallbackWithResult = LoanHomeExtensive.TopContent.onExtraCallbackWithResult();
                    if (i3 == 0) {
                        int i4 = 59 / 0;
                    }
                    return kSerializerOnExtraCallbackWithResult;
                }
            })};
            int i = IAuthTabCallback + 89;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        public /* synthetic */ TopContent(int i, String str, LoanHomeServiceSummaryResult loanHomeServiceSummaryResult, String str2, String str3, String str4, String str5, String str6, List list, String str7, String str8, String str9, String str10, String str11, ComparisonSection comparisonSection, DualColumnSection dualColumnSection, boolean z, ImagePipelineExperimentsBuilderExternalSyntheticLambda8 imagePipelineExperimentsBuilderExternalSyntheticLambda8, ImagePipelineExperimentsBuilderExternalSyntheticLambda23 imagePipelineExperimentsBuilderExternalSyntheticLambda23, Map map, okycx okycxVar) throws Throwable {
            Map mapOnExtraCallbackWithResult;
            if ((i & 1) == 0) {
                this.loanStatus = "";
            } else {
                this.loanStatus = str;
            }
            Object obj = null;
            if ((i & 2) == 0) {
                int i2 = onExtraCallbackWithResult + 21;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                this.summaryResult = null;
            } else {
                this.summaryResult = loanHomeServiceSummaryResult;
            }
            if ((i & 4) == 0) {
                int i4 = onExtraCallbackWithResult + 61;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                this.type = "";
            } else {
                this.type = str2;
            }
            if ((i & 8) == 0) {
                this.title = "";
            } else {
                this.title = str3;
                int i6 = 2 % 2;
            }
            if ((i & 16) == 0) {
                this.subtitle = null;
            } else {
                this.subtitle = str4;
            }
            if ((i & 32) == 0) {
                this.lightAssetUrl = null;
            } else {
                this.lightAssetUrl = str5;
            }
            if ((i & 64) == 0) {
                int i7 = onExtraCallbackWithResult + 103;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                this.darkAssetUrl = null;
            } else {
                this.darkAssetUrl = str6;
            }
            if ((i & 128) == 0) {
                int i9 = onExtraCallbackWithResult + 51;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                this.features = CollectionsKt.emptyList();
            } else {
                this.features = list;
                int i11 = 2 % 2;
            }
            if ((i & 256) == 0) {
                int i12 = onExtraCallbackWithResult + 7;
                onNavigationEvent = i12 % 128;
                int i13 = i12 % 2;
                this.ctaText = "";
                if (i13 == 0) {
                    obj.hashCode();
                    throw null;
                }
            } else {
                this.ctaText = str7;
            }
            if ((i & 512) == 0) {
                this.scheme = "";
            } else {
                this.scheme = str8;
            }
            if ((i & 1024) == 0) {
                int i14 = onNavigationEvent + 39;
                onExtraCallbackWithResult = i14 % 128;
                int i15 = i14 % 2;
                this.badgeText = null;
                if (i15 != 0) {
                    int i16 = 81 / 0;
                }
            } else {
                this.badgeText = str9;
            }
            if ((i & 2048) == 0) {
                this.loadingText = null;
            } else {
                this.loadingText = str10;
            }
            if ((i & 4096) == 0) {
                this.logType = null;
            } else {
                this.logType = str11;
                int i17 = 2 % 2;
            }
            if ((i & 8192) == 0) {
                int i18 = onExtraCallbackWithResult + 53;
                onNavigationEvent = i18 % 128;
                int i19 = i18 % 2;
                this.comparisonSection = null;
                if (i19 == 0) {
                    throw null;
                }
            } else {
                this.comparisonSection = comparisonSection;
            }
            if ((i & 16384) == 0) {
                this.dualColumnSection = null;
            } else {
                this.dualColumnSection = dualColumnSection;
            }
            this.isCompareLoanEnabled = (32768 & i) == 0 ? false : z;
            ImagePipelineExperimentsBuilderExternalSyntheticLambda8 imagePipelineExperimentsBuilderExternalSyntheticLambda8OnNavigationEvent = (65536 & i) == 0 ? ImagePipelineExperimentsBuilderExternalSyntheticLambda8.Companion.onNavigationEvent(this.loanStatus) : imagePipelineExperimentsBuilderExternalSyntheticLambda8;
            this.serviceStatus = imagePipelineExperimentsBuilderExternalSyntheticLambda8OnNavigationEvent;
            int i20 = 2 % 2;
            ImagePipelineExperimentsBuilderExternalSyntheticLambda23 imagePipelineExperimentsBuilderExternalSyntheticLambda23IAuthTabCallback = (131072 & i) == 0 ? ImagePipelineExperimentsBuilderExternalSyntheticLambda23.Companion.IAuthTabCallback(this.type) : imagePipelineExperimentsBuilderExternalSyntheticLambda23;
            this.homeServiceType = imagePipelineExperimentsBuilderExternalSyntheticLambda23IAuthTabCallback;
            if ((i & 262144) == 0) {
                Map mapOnExtraCallback = access8100.onExtraCallback();
                mapOnExtraCallback.put("loan_status", imagePipelineExperimentsBuilderExternalSyntheticLambda8OnNavigationEvent.name());
                String logName = imagePipelineExperimentsBuilderExternalSyntheticLambda23IAuthTabCallback.getLogName();
                logName = logName == null ? this.type : logName;
                Object[] objArr = new Object[1];
                a(new int[]{-2115653062, -991906555}, (ViewConfiguration.getPressedStateDuration() >> 16) + 4, objArr);
                mapOnExtraCallback.put(((String) objArr[0]).intern(), logName);
                Object[] objArr2 = new Object[1];
                a(new int[]{1990392686, -838570656, -2066130942, -1833834376}, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 4, objArr2);
                mapOnExtraCallback.put(((String) objArr2[0]).intern(), this.title);
                String str12 = this.logType;
                if (str12 != null) {
                    int i21 = onNavigationEvent + 17;
                    onExtraCallbackWithResult = i21 % 128;
                    int i22 = i21 % 2;
                    mapOnExtraCallback.put("log_type", str12);
                }
                mapOnExtraCallbackWithResult = access8100.onExtraCallbackWithResult(mapOnExtraCallback);
            } else {
                int i23 = onNavigationEvent + 15;
                onExtraCallbackWithResult = i23 % 128;
                int i24 = i23 % 2;
                mapOnExtraCallbackWithResult = map;
            }
            this.logParams = mapOnExtraCallbackWithResult;
        }

        public TopContent(@NotNull String str, @Nullable LoanHomeServiceSummaryResult loanHomeServiceSummaryResult, @NotNull String str2, @NotNull String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @NotNull List<LoanHomeExtensiveFeature> list, @NotNull String str7, @NotNull String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable ComparisonSection comparisonSection, @Nullable DualColumnSection dualColumnSection, boolean z) throws Throwable {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            this.loanStatus = str;
            this.summaryResult = loanHomeServiceSummaryResult;
            this.type = str2;
            this.title = str3;
            this.subtitle = str4;
            this.lightAssetUrl = str5;
            this.darkAssetUrl = str6;
            this.features = list;
            this.ctaText = str7;
            this.scheme = str8;
            this.badgeText = str9;
            this.loadingText = str10;
            this.logType = str11;
            this.comparisonSection = comparisonSection;
            this.dualColumnSection = dualColumnSection;
            this.isCompareLoanEnabled = z;
            ImagePipelineExperimentsBuilderExternalSyntheticLambda8 imagePipelineExperimentsBuilderExternalSyntheticLambda8OnNavigationEvent = ImagePipelineExperimentsBuilderExternalSyntheticLambda8.Companion.onNavigationEvent(str);
            this.serviceStatus = imagePipelineExperimentsBuilderExternalSyntheticLambda8OnNavigationEvent;
            ImagePipelineExperimentsBuilderExternalSyntheticLambda23 imagePipelineExperimentsBuilderExternalSyntheticLambda23IAuthTabCallback = ImagePipelineExperimentsBuilderExternalSyntheticLambda23.Companion.IAuthTabCallback(str2);
            this.homeServiceType = imagePipelineExperimentsBuilderExternalSyntheticLambda23IAuthTabCallback;
            Map mapOnExtraCallback = access8100.onExtraCallback();
            mapOnExtraCallback.put("loan_status", imagePipelineExperimentsBuilderExternalSyntheticLambda8OnNavigationEvent.name());
            String logName = imagePipelineExperimentsBuilderExternalSyntheticLambda23IAuthTabCallback.getLogName();
            if (logName != null) {
                int i = 2 % 2;
            } else {
                logName = str2;
            }
            Object[] objArr = new Object[1];
            a(new int[]{-2115653062, -991906555}, Color.rgb(0, 0, 0) + 16777220, objArr);
            mapOnExtraCallback.put(((String) objArr[0]).intern(), logName);
            Object[] objArr2 = new Object[1];
            a(new int[]{1990392686, -838570656, -2066130942, -1833834376}, '5' - AndroidCharacter.getMirror('0'), objArr2);
            mapOnExtraCallback.put(((String) objArr2[0]).intern(), str3);
            if (str11 != null) {
                int i2 = onNavigationEvent + 43;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                mapOnExtraCallback.put("log_type", str11);
                int i4 = onExtraCallbackWithResult + 77;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 2;
                }
            }
            this.logParams = access8100.onExtraCallbackWithResult(mapOnExtraCallback);
            int i6 = onExtraCallbackWithResult + 85;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:119:0x027d  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00dd  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0124  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x013e  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x017f  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void IAuthTabCallback(viva.republica.toss.network.model.loan.LoanHomeExtensive.TopContent r16, o.vyl r17, kotlinx.serialization.descriptors.SerialDescriptor r18) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 661
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanHomeExtensive.TopContent.IAuthTabCallback(viva.republica.toss.network.model.loan.LoanHomeExtensive$TopContent, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        public static final /* synthetic */ Lazy[] IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 119;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            int i5 = i2 + 97;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return lazyArr;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ TopContent(String str, LoanHomeServiceSummaryResult loanHomeServiceSummaryResult, String str2, String str3, String str4, String str5, String str6, List list, String str7, String str8, String str9, String str10, String str11, ComparisonSection comparisonSection, DualColumnSection dualColumnSection, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            String str12;
            LoanHomeServiceSummaryResult loanHomeServiceSummaryResult2;
            String str13;
            String str14;
            String str15;
            String str16;
            String str17;
            String str18;
            ComparisonSection comparisonSection2;
            int i2;
            boolean z2;
            DualColumnSection dualColumnSection2;
            DualColumnSection dualColumnSection3;
            Object obj = null;
            if ((i & 1) != 0) {
                int i3 = onNavigationEvent + 65;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                str12 = "";
            } else {
                str12 = str;
            }
            if ((i & 2) != 0) {
                int i4 = onExtraCallbackWithResult + 55;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                int i5 = 2 % 2;
                loanHomeServiceSummaryResult2 = null;
            } else {
                loanHomeServiceSummaryResult2 = loanHomeServiceSummaryResult;
            }
            if ((i & 4) != 0) {
                int i6 = onNavigationEvent + 47;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                str13 = "";
            } else {
                str13 = str2;
            }
            if ((i & 8) != 0) {
                int i8 = onNavigationEvent + 55;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 83 / 0;
                }
                str14 = "";
            } else {
                str14 = str3;
            }
            if ((i & 16) != 0) {
                int i10 = onNavigationEvent + 5;
                onExtraCallbackWithResult = i10 % 128;
                if (i10 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                str15 = null;
            } else {
                str15 = str4;
            }
            if ((i & 32) != 0) {
                int i11 = 2 % 2;
                str16 = null;
            } else {
                str16 = str5;
            }
            String str19 = (i & 64) != 0 ? null : str6;
            List listEmptyList = (i & 128) != 0 ? CollectionsKt.emptyList() : list;
            if ((i & 256) != 0) {
                int i12 = onNavigationEvent + 39;
                onExtraCallbackWithResult = i12 % 128;
                int i13 = i12 % 2;
                int i14 = 2 % 2;
                str17 = "";
            } else {
                str17 = str7;
            }
            String str20 = (i & 512) == 0 ? str8 : "";
            if ((i & 1024) != 0) {
                int i15 = onNavigationEvent + 47;
                onExtraCallbackWithResult = i15 % 128;
                int i16 = i15 % 2;
                int i17 = 2 % 2;
                str18 = null;
            } else {
                str18 = str9;
            }
            String str21 = (i & 2048) != 0 ? null : str10;
            String str22 = (i & 4096) != 0 ? null : str11;
            ComparisonSection comparisonSection3 = (i & 8192) != 0 ? null : comparisonSection;
            if ((i & 16384) != 0) {
                int i18 = onNavigationEvent + 5;
                comparisonSection2 = comparisonSection3;
                onExtraCallbackWithResult = i18 % 128;
                i2 = 2;
                if (i18 % 2 != 0) {
                    z2 = false;
                    int i19 = 19 / 0;
                } else {
                    z2 = false;
                }
                int i20 = 2 % 2;
                dualColumnSection2 = null;
            } else {
                comparisonSection2 = comparisonSection3;
                i2 = 2;
                z2 = false;
                dualColumnSection2 = dualColumnSection;
            }
            if ((i & 32768) != 0) {
                int i21 = onNavigationEvent + 5;
                dualColumnSection3 = dualColumnSection2;
                onExtraCallbackWithResult = i21 % 128;
                int i22 = i21 % i2;
            } else {
                dualColumnSection3 = dualColumnSection2;
                z2 = z;
            }
            this(str12, loanHomeServiceSummaryResult2, str13, str14, str15, str16, str19, listEmptyList, str17, str20, str18, str21, str22, comparisonSection2, dualColumnSection3, z2);
        }

        public final LoanHomeServiceSummaryResult ICustomTabsCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 31;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            LoanHomeServiceSummaryResult loanHomeServiceSummaryResult = this.summaryResult;
            int i5 = i3 + 9;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return loanHomeServiceSummaryResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String readTypedObject() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 61;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            String str = this.title;
            int i5 = i3 + 55;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 59 / 0;
            }
            return str;
        }

        public final String extraCallbackWithResult() {
            String str;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 113;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                str = this.subtitle;
                int i4 = 74 / 0;
            } else {
                str = this.subtitle;
            }
            int i5 = i2 + 79;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String IAuthTabCallback_Parcel() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 61;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            String str = this.lightAssetUrl;
            int i5 = i2 + 67;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
            TopContent topContent = (TopContent) objArr[0];
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 109;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            String str = topContent.darkAssetUrl;
            int i5 = i2 + 79;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final List<LoanHomeExtensiveFeature> IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 125;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            List<LoanHomeExtensiveFeature> list = this.features;
            int i4 = i2 + 89;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return list;
        }

        public final String asInterface() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 35;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            String str = this.ctaText;
            int i5 = i3 + 67;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
            TopContent topContent = (TopContent) objArr[0];
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 83;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            String str = topContent.scheme;
            if (i4 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 33;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 83 / 0;
            }
            return str;
        }

        public final String IAuthTabCallbackStubProxy() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 7;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return this.loadingText;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final ComparisonSection asBinder() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 49;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            ComparisonSection comparisonSection = this.comparisonSection;
            if (i3 == 0) {
                int i4 = 34 / 0;
            }
            return comparisonSection;
        }

        public final DualColumnSection onTransact() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 39;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            DualColumnSection dualColumnSection = this.dualColumnSection;
            int i4 = i2 + 49;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return dualColumnSection;
            }
            throw null;
        }

        public final boolean extraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 55;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            boolean z = this.isCompareLoanEnabled;
            int i5 = i2 + 43;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 53 / 0;
            }
            return z;
        }

        public final ImagePipelineExperimentsBuilderExternalSyntheticLambda8 writeTypedObject() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 33;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ImagePipelineExperimentsBuilderExternalSyntheticLambda8 imagePipelineExperimentsBuilderExternalSyntheticLambda8 = this.serviceStatus;
            int i4 = i3 + 95;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return imagePipelineExperimentsBuilderExternalSyntheticLambda8;
        }

        public final ImagePipelineExperimentsBuilderExternalSyntheticLambda23 access000() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 23;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            ImagePipelineExperimentsBuilderExternalSyntheticLambda23 imagePipelineExperimentsBuilderExternalSyntheticLambda23 = this.homeServiceType;
            if (i3 == 0) {
                int i4 = 86 / 0;
            }
            return imagePipelineExperimentsBuilderExternalSyntheticLambda23;
        }

        public final Map<String, String> getInterfaceDescriptor() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 51;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Map<String, String> map = this.logParams;
            int i4 = i3 + 39;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return map;
        }

        public static /* synthetic */ KSerializer onNavigationEvent() {
            return (KSerializer) IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 1836507428, new Object[0], FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -1836507424, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent());
        }

        public static /* synthetic */ KSerializer onExtraCallback() {
            return (KSerializer) IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -844261210, new Object[0], FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 844261210, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent());
        }

        public static /* synthetic */ KSerializer onWarmupCompleted() {
            return (KSerializer) IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -515472809, new Object[0], FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 515472811, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent());
        }

        public final String IAuthTabCallbackStub() {
            return (String) IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -1024079464, new Object[]{this}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 1024079465, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent());
        }

        public final String access100() {
            return (String) IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 619476241, new Object[]{this}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -619476238, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent());
        }

        static void onMessageChannelReady() {
            onExtraCallback = new int[]{1655454740, -69230972, 1767190992, -959671424, -1894893990, 922097049, 744504336, 1538331095, -629255476, -1073098979, -2047489640, 1633369177, -595590474, -429422033, 85443880, -1859664675, -799590045, -621336431};
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

        public final KSerializer<LoanHomeExtensive> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 5;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                LoanHomeExtensive$.serializer serializerVar = LoanHomeExtensive$.serializer.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            LoanHomeExtensive$.serializer serializerVar2 = LoanHomeExtensive$.serializer.INSTANCE;
            int i3 = onWarmupCompleted + 3;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return serializerVar2;
        }
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.loan.LoanHomeExtensive$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 121;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnNavigationEvent = LoanHomeExtensive.onNavigationEvent();
                int i4 = onExtraCallback + 67;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnNavigationEvent;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.loan.LoanHomeExtensive$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 69;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnExtraCallbackWithResult = LoanHomeExtensive.onExtraCallbackWithResult();
                int i4 = onExtraCallback + 85;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnExtraCallbackWithResult;
            }
        }), null, null};
        int i = onExtraCallback + 47;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ LoanHomeExtensive(int i, TopContent topContent, List list, List list2, LoanHomeBannerResponse loanHomeBannerResponse, String str, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = onNavigationEvent + 43;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, LoanHomeExtensive$.serializer.INSTANCE.getDescriptor());
            int i4 = 2 % 2;
        }
        this.top = topContent;
        if ((i & 2) == 0) {
            this.menu = CollectionsKt.emptyList();
        } else {
            this.menu = list;
            int i5 = IAuthTabCallback + 7;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        }
        if ((i & 4) == 0) {
            int i8 = onNavigationEvent + 117;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            this.recommendedMenuItems = CollectionsKt.emptyList();
        } else {
            this.recommendedMenuItems = list2;
        }
        if ((i & 8) == 0) {
            this.banner = null;
            int i10 = 2 % 2;
        } else {
            this.banner = loanHomeBannerResponse;
        }
        if ((i & 16) != 0) {
            this.disclaimer = str;
            return;
        }
        int i11 = IAuthTabCallback + 41;
        int i12 = i11 % 128;
        onNavigationEvent = i12;
        int i13 = i11 % 2;
        this.disclaimer = "";
        int i14 = i12 + 125;
        IAuthTabCallback = i14 % 128;
        int i15 = i14 % 2;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return $childSerializers;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onWarmupCompleted(viva.republica.toss.network.model.loan.LoanHomeExtensive r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.loan.LoanHomeExtensive.$childSerializers
            viva.republica.toss.network.model.loan.LoanHomeExtensive$TopContent$$serializer r2 = viva.republica.toss.network.model.loan.LoanHomeExtensive$TopContent$.serializer.INSTANCE
            viva.republica.toss.network.model.loan.LoanHomeExtensive$TopContent r3 = r6.top
            r4 = 0
            r7.onNavigationEvent(r8, r4, r2, r3)
            r2 = 1
            boolean r3 = r7.onWarmupCompleted(r8, r2)
            r3 = r3 ^ r2
            if (r3 == 0) goto L3c
            int r3 = viva.republica.toss.network.model.loan.LoanHomeExtensive.onNavigationEvent
            int r3 = r3 + 25
            int r5 = r3 % 128
            viva.republica.toss.network.model.loan.LoanHomeExtensive.IAuthTabCallback = r5
            int r3 = r3 % r0
            if (r3 != 0) goto L30
            java.util.List<viva.republica.toss.network.model.loan.LoanHomeExtensive$MenuSection> r3 = r6.menu
            java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r5)
            r5 = 73
            int r5 = r5 / r4
            if (r3 != 0) goto L49
            goto L3c
        L30:
            java.util.List<viva.republica.toss.network.model.loan.LoanHomeExtensive$MenuSection> r3 = r6.menu
            java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r5)
            if (r3 != 0) goto L49
        L3c:
            r3 = r1[r2]
            java.lang.Object r3 = r3.getValue()
            o.py r3 = (o.py) r3
            java.util.List<viva.republica.toss.network.model.loan.LoanHomeExtensive$MenuSection> r5 = r6.menu
            r7.onNavigationEvent(r8, r2, r3, r5)
        L49:
            boolean r2 = r7.onWarmupCompleted(r8, r0)
            if (r2 != 0) goto L64
            int r2 = viva.republica.toss.network.model.loan.LoanHomeExtensive.IAuthTabCallback
            int r2 = r2 + 23
            int r3 = r2 % 128
            viva.republica.toss.network.model.loan.LoanHomeExtensive.onNavigationEvent = r3
            int r2 = r2 % r0
            java.util.List<viva.republica.toss.network.model.loan.LoanHomeExtensive$MenuSection$MenuItem> r2 = r6.recommendedMenuItems
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 != 0) goto L7a
        L64:
            r1 = r1[r0]
            java.lang.Object r1 = r1.getValue()
            o.py r1 = (o.py) r1
            java.util.List<viva.republica.toss.network.model.loan.LoanHomeExtensive$MenuSection$MenuItem> r2 = r6.recommendedMenuItems
            r7.onNavigationEvent(r8, r0, r1, r2)
            int r1 = viva.republica.toss.network.model.loan.LoanHomeExtensive.IAuthTabCallback
            int r1 = r1 + 77
            int r2 = r1 % 128
            viva.republica.toss.network.model.loan.LoanHomeExtensive.onNavigationEvent = r2
            int r1 = r1 % r0
        L7a:
            r1 = 3
            boolean r2 = r7.onWarmupCompleted(r8, r1)
            if (r2 != 0) goto L85
            viva.republica.toss.network.model.loan.LoanHomeBannerResponse r2 = r6.banner
            if (r2 == 0) goto L8c
        L85:
            viva.republica.toss.network.model.loan.LoanHomeBannerResponse$$serializer r2 = viva.republica.toss.network.model.loan.LoanHomeBannerResponse$.serializer.INSTANCE
            viva.republica.toss.network.model.loan.LoanHomeBannerResponse r3 = r6.banner
            r7.onExtraCallbackWithResult(r8, r1, r2, r3)
        L8c:
            r1 = 4
            boolean r2 = r7.onWarmupCompleted(r8, r1)
            if (r2 != 0) goto Lb4
            int r2 = viva.republica.toss.network.model.loan.LoanHomeExtensive.IAuthTabCallback
            int r2 = r2 + 103
            int r3 = r2 % 128
            viva.republica.toss.network.model.loan.LoanHomeExtensive.onNavigationEvent = r3
            int r2 = r2 % r0
            java.lang.String r3 = ""
            if (r2 == 0) goto Lac
            java.lang.String r2 = r6.disclaimer
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            r3 = 47
            int r3 = r3 / r4
            if (r2 != 0) goto Lc2
            goto Lb4
        Lac:
            java.lang.String r2 = r6.disclaimer
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 != 0) goto Lc2
        Lb4:
            java.lang.String r6 = r6.disclaimer
            r7.onExtraCallback(r8, r1, r6)
            int r6 = viva.republica.toss.network.model.loan.LoanHomeExtensive.onNavigationEvent
            int r6 = r6 + 13
            int r7 = r6 % 128
            viva.republica.toss.network.model.loan.LoanHomeExtensive.IAuthTabCallback = r7
            int r6 = r6 % r0
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanHomeExtensive.onWarmupCompleted(viva.republica.toss.network.model.loan.LoanHomeExtensive, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public final TopContent asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 57;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        TopContent topContent = this.top;
        int i5 = i2 + 103;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return topContent;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        LoanHomeExtensive loanHomeExtensive = (LoanHomeExtensive) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 15;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        List<MenuSection> list = loanHomeExtensive.menu;
        int i5 = i2 + 45;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        LoanHomeExtensive loanHomeExtensive = (LoanHomeExtensive) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        Object obj = null;
        List<MenuSection.MenuItem> list = loanHomeExtensive.recommendedMenuItems;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 81;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        obj.hashCode();
        throw null;
    }

    public final LoanHomeBannerResponse IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 99;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        LoanHomeBannerResponse loanHomeBannerResponse = this.banner;
        int i5 = i2 + 107;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 57 / 0;
        }
        return loanHomeBannerResponse;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.disclaimer;
        if (i3 == 0) {
            int i4 = 70 / 0;
        }
        return str;
    }

    public final List<MenuSection> IAuthTabCallbackDefault() {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (List) onExtraCallbackWithResult(-2075911501, new Object[]{this}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 2075911502, iOnExtraCallbackWithResult2);
    }

    public final List<MenuSection.MenuItem> IAuthTabCallbackStub() {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (List) onExtraCallbackWithResult(611263247, new Object[]{this}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -611263247, iOnExtraCallbackWithResult2);
    }

    @liq
    public static final class ComparisonSection {
        public static final Companion Companion = new Companion(null);
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final ExistingLoan existing;
        private final RecommendedLoan recommended;

        static {
            int i = onWarmupCompleted + 17;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ComparisonSection() {
            this((ExistingLoan) null, (RecommendedLoan) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ComparisonSection)) {
                int i2 = onNavigationEvent + 89;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.existing, ((ComparisonSection) obj).existing)) {
                int i4 = IAuthTabCallback + 85;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!(!Intrinsics.areEqual(this.recommended, r6.recommended))) {
                return true;
            }
            int i6 = IAuthTabCallback + 55;
            onNavigationEvent = i6 % 128;
            return !(i6 % 2 != 0);
        }

        public int hashCode() {
            int iHashCode;
            RecommendedLoan recommendedLoan;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 21;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                iHashCode = this.existing.hashCode() - 64;
                recommendedLoan = this.recommended;
            } else {
                iHashCode = this.existing.hashCode() * 31;
                recommendedLoan = this.recommended;
            }
            int iHashCode2 = iHashCode + recommendedLoan.hashCode();
            int i3 = onNavigationEvent + 7;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode2;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ComparisonSection(existing=" + this.existing + ", recommended=" + this.recommended + ")";
            int i2 = IAuthTabCallback + 117;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ComparisonSection> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 55;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                LoanHomeExtensive$ComparisonSection$.serializer serializerVar = LoanHomeExtensive$ComparisonSection$.serializer.INSTANCE;
                if (i3 == 0) {
                    int i4 = 33 / 0;
                }
                return serializerVar;
            }
        }

        public /* synthetic */ ComparisonSection(int i, ExistingLoan existingLoan, RecommendedLoan recommendedLoan, okycx okycxVar) {
            this.existing = (i & 1) == 0 ? new ExistingLoan((String) null, (String) null, (ExistingLoan.ValueContent) null, (ExistingLoan.ValueContent) null, 15, (DefaultConstructorMarker) null) : existingLoan;
            if ((i & 2) == 0) {
                this.recommended = new RecommendedLoan((String) null, (RecommendedLoan.RecommendedContent) null, (RecommendedLoan.RecommendedContent) null, 7, (DefaultConstructorMarker) null);
                int i2 = IAuthTabCallback + 101;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return;
            }
            this.recommended = recommendedLoan;
            int i4 = IAuthTabCallback + 125;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }

        public ComparisonSection(@NotNull ExistingLoan existingLoan, @NotNull RecommendedLoan recommendedLoan) {
            Intrinsics.checkNotNullParameter(existingLoan, "");
            Intrinsics.checkNotNullParameter(recommendedLoan, "");
            this.existing = existingLoan;
            this.recommended = recommendedLoan;
        }

        @JvmStatic
        public static final /* synthetic */ void onWarmupCompleted(ComparisonSection comparisonSection, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 125;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (vylVar.onWarmupCompleted(serialDescriptor, 0) || (!Intrinsics.areEqual(comparisonSection.existing, new ExistingLoan((String) null, (String) null, (ExistingLoan.ValueContent) null, (ExistingLoan.ValueContent) null, 15, (DefaultConstructorMarker) null)))) {
                vylVar.onNavigationEvent(serialDescriptor, 0, LoanHomeExtensive$ComparisonSection$ExistingLoan$.serializer.INSTANCE, comparisonSection.existing);
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 1) || !Intrinsics.areEqual(comparisonSection.recommended, new RecommendedLoan((String) null, (RecommendedLoan.RecommendedContent) null, (RecommendedLoan.RecommendedContent) null, 7, (DefaultConstructorMarker) null))) {
                vylVar.onNavigationEvent(serialDescriptor, 1, LoanHomeExtensive$ComparisonSection$RecommendedLoan$.serializer.INSTANCE, comparisonSection.recommended);
                int i4 = IAuthTabCallback + 67;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            }
        }

        public /* synthetic */ ComparisonSection(ExistingLoan existingLoan, RecommendedLoan recommendedLoan, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                existingLoan = new ExistingLoan((String) null, (String) null, (ExistingLoan.ValueContent) null, (ExistingLoan.ValueContent) null, 15, (DefaultConstructorMarker) null);
                int i2 = IAuthTabCallback + 75;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            }
            this(existingLoan, (i & 2) != 0 ? new RecommendedLoan((String) null, (RecommendedLoan.RecommendedContent) null, (RecommendedLoan.RecommendedContent) null, 7, (DefaultConstructorMarker) null) : recommendedLoan);
        }

        public final ExistingLoan onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 65;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            ExistingLoan existingLoan = this.existing;
            int i5 = i2 + 59;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return existingLoan;
        }

        @liq
        public static final class ExistingLoan {
            public static final Companion Companion = new Companion(null);
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;
            private final ValueContent left;
            private final String logoImageUrl;
            private final ValueContent right;
            private final String title;

            static {
                int i = onExtraCallbackWithResult + 91;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
            }

            public ExistingLoan() {
                this((String) null, (String) null, (ValueContent) null, (ValueContent) null, 15, (DefaultConstructorMarker) null);
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 89;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (this == obj) {
                    return true;
                }
                if (obj instanceof ExistingLoan) {
                    ExistingLoan existingLoan = (ExistingLoan) obj;
                    return Intrinsics.areEqual(this.logoImageUrl, existingLoan.logoImageUrl) && Intrinsics.areEqual(this.title, existingLoan.title) && Intrinsics.areEqual(this.left, existingLoan.left) && Intrinsics.areEqual(this.right, existingLoan.right);
                }
                int i4 = i2 + 85;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 21;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = (((((this.logoImageUrl.hashCode() * 31) + this.title.hashCode()) * 31) + this.left.hashCode()) * 31) + this.right.hashCode();
                int i4 = onExtraCallback + 19;
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
                String str = "ExistingLoan(logoImageUrl=" + this.logoImageUrl + ", title=" + this.title + ", left=" + this.left + ", right=" + this.right + ")";
                int i2 = IAuthTabCallback + 95;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 89 / 0;
                }
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

                public final KSerializer<ExistingLoan> serializer() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 111;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    LoanHomeExtensive$ComparisonSection$ExistingLoan$.serializer serializerVar = LoanHomeExtensive$ComparisonSection$ExistingLoan$.serializer.INSTANCE;
                    int i4 = onNavigationEvent + 125;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    return serializerVar;
                }
            }

            public /* synthetic */ ExistingLoan(int i, String str, String str2, ValueContent valueContent, ValueContent valueContent2, okycx okycxVar) {
                if ((i & 1) == 0) {
                    this.logoImageUrl = "";
                    int i2 = onExtraCallback + 63;
                    IAuthTabCallback = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i3 = 2 % 2;
                    }
                } else {
                    this.logoImageUrl = str;
                }
                if ((i & 2) == 0) {
                    this.title = "";
                } else {
                    this.title = str2;
                }
                int i4 = 1;
                String str3 = null;
                if ((i & 4) == 0) {
                    this.left = new ValueContent(str3, i4, (DefaultConstructorMarker) str3);
                    int i5 = 2 % 2;
                } else {
                    this.left = valueContent;
                }
                if ((i & 8) != 0) {
                    this.right = valueContent2;
                    return;
                }
                this.right = new ValueContent(str3, i4, (DefaultConstructorMarker) str3);
                int i6 = IAuthTabCallback + 47;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
            }

            public ExistingLoan(@NotNull String str, @NotNull String str2, @NotNull ValueContent valueContent, @NotNull ValueContent valueContent2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(valueContent, "");
                Intrinsics.checkNotNullParameter(valueContent2, "");
                this.logoImageUrl = str;
                this.title = str2;
                this.left = valueContent;
                this.right = valueContent2;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
            @kotlin.jvm.JvmStatic
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static final /* synthetic */ void onExtraCallback(viva.republica.toss.network.model.loan.LoanHomeExtensive.ComparisonSection.ExistingLoan r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
                /*
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = viva.republica.toss.network.model.loan.LoanHomeExtensive.ComparisonSection.ExistingLoan.onExtraCallback
                    int r1 = r1 + 107
                    int r2 = r1 % 128
                    viva.republica.toss.network.model.loan.LoanHomeExtensive.ComparisonSection.ExistingLoan.IAuthTabCallback = r2
                    int r1 = r1 % r0
                    r1 = 0
                    boolean r2 = r7.onWarmupCompleted(r8, r1)
                    java.lang.String r3 = ""
                    r4 = 0
                    if (r2 != 0) goto L33
                    int r2 = viva.republica.toss.network.model.loan.LoanHomeExtensive.ComparisonSection.ExistingLoan.IAuthTabCallback
                    int r2 = r2 + 93
                    int r5 = r2 % 128
                    viva.republica.toss.network.model.loan.LoanHomeExtensive.ComparisonSection.ExistingLoan.onExtraCallback = r5
                    int r2 = r2 % r0
                    if (r2 == 0) goto L2a
                    java.lang.String r2 = r6.logoImageUrl
                    boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
                    if (r2 != 0) goto L38
                    goto L33
                L2a:
                    java.lang.String r6 = r6.logoImageUrl
                    kotlin.jvm.internal.Intrinsics.areEqual(r6, r3)
                    r4.hashCode()
                    throw r4
                L33:
                    java.lang.String r2 = r6.logoImageUrl
                    r7.onExtraCallback(r8, r1, r2)
                L38:
                    r1 = 1
                    boolean r2 = r7.onWarmupCompleted(r8, r1)
                    if (r2 != 0) goto L48
                    java.lang.String r2 = r6.title
                    boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
                    r2 = r2 ^ r1
                    if (r2 == 0) goto L4d
                L48:
                    java.lang.String r2 = r6.title
                    r7.onExtraCallback(r8, r1, r2)
                L4d:
                    boolean r2 = r7.onWarmupCompleted(r8, r0)
                    if (r2 != 0) goto L60
                    viva.republica.toss.network.model.loan.LoanHomeExtensive$ComparisonSection$ExistingLoan$ValueContent r2 = r6.left
                    viva.republica.toss.network.model.loan.LoanHomeExtensive$ComparisonSection$ExistingLoan$ValueContent r3 = new viva.republica.toss.network.model.loan.LoanHomeExtensive$ComparisonSection$ExistingLoan$ValueContent
                    r3.<init>(r4, r1, r4)
                    boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
                    if (r2 != 0) goto L70
                L60:
                    viva.republica.toss.network.model.loan.LoanHomeExtensive$ComparisonSection$ExistingLoan$ValueContent$$serializer r2 = viva.republica.toss.network.model.loan.LoanHomeExtensive$ComparisonSection$ExistingLoan$ValueContent$.serializer.INSTANCE
                    viva.republica.toss.network.model.loan.LoanHomeExtensive$ComparisonSection$ExistingLoan$ValueContent r3 = r6.left
                    r7.onNavigationEvent(r8, r0, r2, r3)
                    int r2 = viva.republica.toss.network.model.loan.LoanHomeExtensive.ComparisonSection.ExistingLoan.onExtraCallback
                    int r2 = r2 + 7
                    int r3 = r2 % 128
                    viva.republica.toss.network.model.loan.LoanHomeExtensive.ComparisonSection.ExistingLoan.IAuthTabCallback = r3
                    int r2 = r2 % r0
                L70:
                    r0 = 3
                    boolean r2 = r7.onWarmupCompleted(r8, r0)
                    if (r2 != 0) goto L84
                    viva.republica.toss.network.model.loan.LoanHomeExtensive$ComparisonSection$ExistingLoan$ValueContent r2 = r6.right
                    viva.republica.toss.network.model.loan.LoanHomeExtensive$ComparisonSection$ExistingLoan$ValueContent r3 = new viva.republica.toss.network.model.loan.LoanHomeExtensive$ComparisonSection$ExistingLoan$ValueContent
                    r3.<init>(r4, r1, r4)
                    boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
                    if (r1 != 0) goto L8b
                L84:
                    viva.republica.toss.network.model.loan.LoanHomeExtensive$ComparisonSection$ExistingLoan$ValueContent$$serializer r1 = viva.republica.toss.network.model.loan.LoanHomeExtensive$ComparisonSection$ExistingLoan$ValueContent$.serializer.INSTANCE
                    viva.republica.toss.network.model.loan.LoanHomeExtensive$ComparisonSection$ExistingLoan$ValueContent r6 = r6.right
                    r7.onNavigationEvent(r8, r0, r1, r6)
                L8b:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanHomeExtensive.ComparisonSection.ExistingLoan.onExtraCallback(viva.republica.toss.network.model.loan.LoanHomeExtensive$ComparisonSection$ExistingLoan, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
            }

            public /* synthetic */ ExistingLoan(String str, String str2, ValueContent valueContent, ValueContent valueContent2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i & 1) != 0) {
                    int i2 = IAuthTabCallback + 17;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    str = "";
                }
                if ((i & 2) != 0) {
                    int i4 = onExtraCallback + 39;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    str2 = "";
                }
                int i6 = 1;
                String str3 = null;
                valueContent = (i & 4) != 0 ? new ValueContent(str3, i6, (DefaultConstructorMarker) str3) : valueContent;
                if ((i & 8) != 0) {
                    valueContent2 = new ValueContent(str3, i6, (DefaultConstructorMarker) str3);
                    int i7 = 2 % 2;
                }
                this(str, str2, valueContent, valueContent2);
            }

            public final String onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 45;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                String str = this.logoImageUrl;
                if (i3 != 0) {
                    int i4 = 6 / 0;
                }
                return str;
            }

            public final String onNavigationEvent() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 5;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                String str = this.title;
                int i5 = i2 + 25;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            public final ValueContent onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onExtraCallback;
                int i3 = i2 + 39;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                ValueContent valueContent = this.left;
                int i5 = i2 + 37;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return valueContent;
            }

            @liq
            public static final class ValueContent {
                public static final Companion Companion = new Companion(null);
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;
                private static int onWarmupCompleted;
                private final String value;

                static {
                    int i = onExtraCallbackWithResult + 31;
                    onNavigationEvent = i % 128;
                    int i2 = i % 2;
                }

                /* JADX WARN: Illegal instructions before constructor call */
                public ValueContent() {
                    String str = null;
                    this(str, 1, (DefaultConstructorMarker) str);
                }

                /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
                
                    if ((r5 instanceof viva.republica.toss.network.model.loan.LoanHomeExtensive.ComparisonSection.ExistingLoan.ValueContent) != false) goto L12;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
                
                    return false;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
                
                    if (kotlin.jvm.internal.Intrinsics.areEqual(r4.value, ((viva.republica.toss.network.model.loan.LoanHomeExtensive.ComparisonSection.ExistingLoan.ValueContent) r5).value) != false) goto L16;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
                
                    r5 = viva.republica.toss.network.model.loan.LoanHomeExtensive.ComparisonSection.ExistingLoan.ValueContent.onExtraCallback + 103;
                    viva.republica.toss.network.model.loan.LoanHomeExtensive.ComparisonSection.ExistingLoan.ValueContent.onWarmupCompleted = r5 % 128;
                    r5 = r5 % 2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
                
                    return false;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
                
                    r5 = viva.republica.toss.network.model.loan.LoanHomeExtensive.ComparisonSection.ExistingLoan.ValueContent.onExtraCallback + 23;
                    viva.republica.toss.network.model.loan.LoanHomeExtensive.ComparisonSection.ExistingLoan.ValueContent.onWarmupCompleted = r5 % 128;
                    r5 = r5 % 2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
                
                    return true;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
                
                    if (r4 == r5) goto L8;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
                
                    if (r4 == r5) goto L8;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
                
                    return true;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
                    /*
                        r4 = this;
                        r0 = 2
                        int r1 = r0 % r0
                        int r1 = viva.republica.toss.network.model.loan.LoanHomeExtensive.ComparisonSection.ExistingLoan.ValueContent.onExtraCallback
                        int r1 = r1 + 99
                        int r2 = r1 % 128
                        viva.republica.toss.network.model.loan.LoanHomeExtensive.ComparisonSection.ExistingLoan.ValueContent.onWarmupCompleted = r2
                        int r1 = r1 % r0
                        r2 = 1
                        r3 = 0
                        if (r1 == 0) goto L16
                        r1 = 84
                        int r1 = r1 / r3
                        if (r4 != r5) goto L19
                        goto L18
                    L16:
                        if (r4 != r5) goto L19
                    L18:
                        return r2
                    L19:
                        boolean r1 = r5 instanceof viva.republica.toss.network.model.loan.LoanHomeExtensive.ComparisonSection.ExistingLoan.ValueContent
                        if (r1 != 0) goto L1e
                        return r3
                    L1e:
                        viva.republica.toss.network.model.loan.LoanHomeExtensive$ComparisonSection$ExistingLoan$ValueContent r5 = (viva.republica.toss.network.model.loan.LoanHomeExtensive.ComparisonSection.ExistingLoan.ValueContent) r5
                        java.lang.String r1 = r4.value
                        java.lang.String r5 = r5.value
                        boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
                        if (r5 != 0) goto L34
                        int r5 = viva.republica.toss.network.model.loan.LoanHomeExtensive.ComparisonSection.ExistingLoan.ValueContent.onExtraCallback
                        int r5 = r5 + 103
                        int r1 = r5 % 128
                        viva.republica.toss.network.model.loan.LoanHomeExtensive.ComparisonSection.ExistingLoan.ValueContent.onWarmupCompleted = r1
                        int r5 = r5 % r0
                        return r3
                    L34:
                        int r5 = viva.republica.toss.network.model.loan.LoanHomeExtensive.ComparisonSection.ExistingLoan.ValueContent.onExtraCallback
                        int r5 = r5 + 23
                        int r1 = r5 % 128
                        viva.republica.toss.network.model.loan.LoanHomeExtensive.ComparisonSection.ExistingLoan.ValueContent.onWarmupCompleted = r1
                        int r5 = r5 % r0
                        return r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanHomeExtensive.ComparisonSection.ExistingLoan.ValueContent.equals(java.lang.Object):boolean");
                }

                public int hashCode() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 89;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    int iHashCode = this.value.hashCode();
                    int i4 = onExtraCallback + 119;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 89 / 0;
                    }
                    return iHashCode;
                }

                public String toString() {
                    int i = 2 % 2;
                    String str = "ValueContent(value=" + this.value + ")";
                    int i2 = onExtraCallback + 35;
                    onWarmupCompleted = i2 % 128;
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

                    public final KSerializer<ValueContent> serializer() {
                        int i = 2 % 2;
                        int i2 = IAuthTabCallback + 105;
                        onExtraCallbackWithResult = i2 % 128;
                        int i3 = i2 % 2;
                        LoanHomeExtensive$ComparisonSection$ExistingLoan$ValueContent$.serializer serializerVar = LoanHomeExtensive$ComparisonSection$ExistingLoan$ValueContent$.serializer.INSTANCE;
                        int i4 = IAuthTabCallback + 89;
                        onExtraCallbackWithResult = i4 % 128;
                        int i5 = i4 % 2;
                        return serializerVar;
                    }
                }

                public /* synthetic */ ValueContent(int i, String str, okycx okycxVar) {
                    Object obj = null;
                    if ((i & 1) == 0) {
                        this.value = "";
                        int i2 = onWarmupCompleted + 25;
                        onExtraCallback = i2 % 128;
                        if (i2 % 2 == 0) {
                            throw null;
                        }
                        return;
                    }
                    this.value = str;
                    int i3 = onExtraCallback + 23;
                    onWarmupCompleted = i3 % 128;
                    if (i3 % 2 == 0) {
                        return;
                    }
                    obj.hashCode();
                    throw null;
                }

                public ValueContent(@NotNull String str) {
                    Intrinsics.checkNotNullParameter(str, "");
                    this.value = str;
                }

                @JvmStatic
                public static final /* synthetic */ void onExtraCallbackWithResult(ValueContent valueContent, vyl vylVar, SerialDescriptor serialDescriptor) {
                    int i = 2 % 2;
                    if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                        int i2 = onExtraCallback + 95;
                        onWarmupCompleted = i2 % 128;
                        int i3 = i2 % 2;
                        if (Intrinsics.areEqual(valueContent.value, "")) {
                            return;
                        }
                    }
                    vylVar.onExtraCallback(serialDescriptor, 0, valueContent.value);
                    int i4 = onExtraCallback + 35;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                }

                /* JADX WARN: Illegal instructions before constructor call */
                public /* synthetic */ ValueContent(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    if ((i & 1) != 0) {
                        int i2 = onExtraCallback;
                        int i3 = i2 + 81;
                        onWarmupCompleted = i3 % 128;
                        if (i3 % 2 != 0) {
                            int i4 = 39 / 0;
                        }
                        int i5 = i2 + 103;
                        onWarmupCompleted = i5 % 128;
                        if (i5 % 2 == 0) {
                            int i6 = 2 % 2;
                        }
                        str = "";
                    }
                    this(str);
                }

                public final String onNavigationEvent() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 99;
                    onExtraCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        return this.value;
                    }
                    throw null;
                }
            }

            public final ValueContent onExtraCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 37;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return this.right;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public final RecommendedLoan onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 105;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            RecommendedLoan recommendedLoan = this.recommended;
            if (i3 != 0) {
                int i4 = 70 / 0;
            }
            return recommendedLoan;
        }

        @liq
        public static final class RecommendedLoan {
            public static final Companion Companion = new Companion(null);
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;
            private static int onWarmupCompleted;
            private final RecommendedContent left;
            private final RecommendedContent right;
            private final String title;

            static {
                int i = onNavigationEvent + 101;
                onExtraCallbackWithResult = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
            }

            public RecommendedLoan() {
                this((String) null, (RecommendedContent) null, (RecommendedContent) null, 7, (DefaultConstructorMarker) null);
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    int i2 = IAuthTabCallback + 43;
                    int i3 = i2 % 128;
                    onWarmupCompleted = i3;
                    int i4 = i2 % 2;
                    int i5 = i3 + 103;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return true;
                }
                if (obj instanceof RecommendedLoan) {
                    RecommendedLoan recommendedLoan = (RecommendedLoan) obj;
                    if (!(!Intrinsics.areEqual(this.title, recommendedLoan.title))) {
                        return Intrinsics.areEqual(this.left, recommendedLoan.left) && Intrinsics.areEqual(this.right, recommendedLoan.right);
                    }
                    int i7 = onWarmupCompleted + 87;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    return false;
                }
                int i9 = onWarmupCompleted + 109;
                IAuthTabCallback = i9 % 128;
                if (i9 % 2 != 0) {
                    return false;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public int hashCode() {
                int iHashCode;
                int i = 2 % 2;
                int iHashCode2 = this.title.hashCode();
                int iHashCode3 = this.left.hashCode();
                RecommendedContent recommendedContent = this.right;
                if (recommendedContent == null) {
                    int i2 = IAuthTabCallback + 9;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    iHashCode = 0;
                } else {
                    iHashCode = recommendedContent.hashCode();
                }
                int i4 = (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
                int i5 = IAuthTabCallback + 15;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return i4;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "RecommendedLoan(title=" + this.title + ", left=" + this.left + ", right=" + this.right + ")";
                int i2 = onWarmupCompleted + 85;
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

                public final KSerializer<RecommendedLoan> serializer() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 87;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    LoanHomeExtensive$ComparisonSection$RecommendedLoan$.serializer serializerVar = LoanHomeExtensive$ComparisonSection$RecommendedLoan$.serializer.INSTANCE;
                    int i4 = IAuthTabCallback + 35;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    return serializerVar;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public /* synthetic */ RecommendedLoan(int i, String str, RecommendedContent recommendedContent, RecommendedContent recommendedContent2, okycx okycxVar) {
                if ((i & 1) == 0) {
                    int i2 = IAuthTabCallback + 119;
                    onWarmupCompleted = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i3 = 2 % 2;
                    }
                    str = "";
                }
                this.title = str;
                Object obj = null;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                Object[] objArr3 = 0;
                if ((i & 2) == 0) {
                    this.left = new RecommendedContent((String) (objArr3 == true ? 1 : 0), (ChangeInfo) (objArr2 == true ? 1 : 0), 3, (DefaultConstructorMarker) (objArr == true ? 1 : 0));
                } else {
                    this.left = recommendedContent;
                    int i4 = onWarmupCompleted + 31;
                    IAuthTabCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 2 % 2;
                    }
                }
                if ((i & 4) != 0) {
                    this.right = recommendedContent2;
                    int i6 = onWarmupCompleted + 1;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    return;
                }
                int i8 = onWarmupCompleted + 21;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                this.right = null;
                if (i9 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }

            public RecommendedLoan(@NotNull String str, @NotNull RecommendedContent recommendedContent, @Nullable RecommendedContent recommendedContent2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(recommendedContent, "");
                this.title = str;
                this.left = recommendedContent;
                this.right = recommendedContent2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
            @kotlin.jvm.JvmStatic
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static final /* synthetic */ void onWarmupCompleted(viva.republica.toss.network.model.loan.LoanHomeExtensive.ComparisonSection.RecommendedLoan r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
                /*
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = viva.republica.toss.network.model.loan.LoanHomeExtensive.ComparisonSection.RecommendedLoan.IAuthTabCallback
                    int r1 = r1 + 79
                    int r2 = r1 % 128
                    viva.republica.toss.network.model.loan.LoanHomeExtensive.ComparisonSection.RecommendedLoan.onWarmupCompleted = r2
                    int r1 = r1 % r0
                    r2 = 0
                    if (r1 == 0) goto L16
                    boolean r1 = r7.onWarmupCompleted(r8, r2)
                    if (r1 != 0) goto L26
                    goto L1c
                L16:
                    boolean r1 = r7.onWarmupCompleted(r8, r2)
                    if (r1 != 0) goto L26
                L1c:
                    java.lang.String r1 = r6.title
                    java.lang.String r3 = ""
                    boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
                    if (r1 != 0) goto L34
                L26:
                    java.lang.String r1 = r6.title
                    r7.onExtraCallback(r8, r2, r1)
                    int r1 = viva.republica.toss.network.model.loan.LoanHomeExtensive.ComparisonSection.RecommendedLoan.IAuthTabCallback
                    int r1 = r1 + 29
                    int r2 = r1 % 128
                    viva.republica.toss.network.model.loan.LoanHomeExtensive.ComparisonSection.RecommendedLoan.onWarmupCompleted = r2
                    int r1 = r1 % r0
                L34:
                    r1 = 1
                    boolean r2 = r7.onWarmupCompleted(r8, r1)
                    r3 = 0
                    if (r2 != 0) goto L4a
                    viva.republica.toss.network.model.loan.LoanHomeExtensive$ComparisonSection$RecommendedLoan$RecommendedContent r2 = r6.left
                    viva.republica.toss.network.model.loan.LoanHomeExtensive$ComparisonSection$RecommendedLoan$RecommendedContent r4 = new viva.republica.toss.network.model.loan.LoanHomeExtensive$ComparisonSection$RecommendedLoan$RecommendedContent
                    r5 = 3
                    r4.<init>(r3, r3, r5, r3)
                    boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
                    if (r2 != 0) goto L5a
                L4a:
                    viva.republica.toss.network.model.loan.LoanHomeExtensive$ComparisonSection$RecommendedLoan$RecommendedContent$$serializer r2 = viva.republica.toss.network.model.loan.LoanHomeExtensive$ComparisonSection$RecommendedLoan$RecommendedContent$.serializer.INSTANCE
                    viva.republica.toss.network.model.loan.LoanHomeExtensive$ComparisonSection$RecommendedLoan$RecommendedContent r4 = r6.left
                    r7.onNavigationEvent(r8, r1, r2, r4)
                    int r1 = viva.republica.toss.network.model.loan.LoanHomeExtensive.ComparisonSection.RecommendedLoan.onWarmupCompleted
                    int r1 = r1 + 55
                    int r2 = r1 % 128
                    viva.republica.toss.network.model.loan.LoanHomeExtensive.ComparisonSection.RecommendedLoan.IAuthTabCallback = r2
                    int r1 = r1 % r0
                L5a:
                    boolean r1 = r7.onWarmupCompleted(r8, r0)
                    if (r1 == 0) goto L61
                    goto L70
                L61:
                    int r1 = viva.republica.toss.network.model.loan.LoanHomeExtensive.ComparisonSection.RecommendedLoan.IAuthTabCallback
                    int r1 = r1 + 85
                    int r2 = r1 % 128
                    viva.republica.toss.network.model.loan.LoanHomeExtensive.ComparisonSection.RecommendedLoan.onWarmupCompleted = r2
                    int r1 = r1 % r0
                    if (r1 != 0) goto L78
                    viva.republica.toss.network.model.loan.LoanHomeExtensive$ComparisonSection$RecommendedLoan$RecommendedContent r1 = r6.right
                    if (r1 == 0) goto L77
                L70:
                    viva.republica.toss.network.model.loan.LoanHomeExtensive$ComparisonSection$RecommendedLoan$RecommendedContent$$serializer r1 = viva.republica.toss.network.model.loan.LoanHomeExtensive$ComparisonSection$RecommendedLoan$RecommendedContent$.serializer.INSTANCE
                    viva.republica.toss.network.model.loan.LoanHomeExtensive$ComparisonSection$RecommendedLoan$RecommendedContent r6 = r6.right
                    r7.onExtraCallbackWithResult(r8, r0, r1, r6)
                L77:
                    return
                L78:
                    viva.republica.toss.network.model.loan.LoanHomeExtensive$ComparisonSection$RecommendedLoan$RecommendedContent r6 = r6.right
                    r3.hashCode()
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanHomeExtensive.ComparisonSection.RecommendedLoan.onWarmupCompleted(viva.republica.toss.network.model.loan.LoanHomeExtensive$ComparisonSection$RecommendedLoan, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
            }

            /* JADX WARN: Multi-variable type inference failed */
            public /* synthetic */ RecommendedLoan(String str, RecommendedContent recommendedContent, RecommendedContent recommendedContent2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i & 1) != 0) {
                    int i2 = onWarmupCompleted + 125;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    int i4 = 2 % 2;
                    str = "";
                }
                String str2 = null;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                if ((i & 2) != 0) {
                    recommendedContent = new RecommendedContent(str2, (ChangeInfo) (objArr2 == true ? 1 : 0), 3, (DefaultConstructorMarker) (objArr == true ? 1 : 0));
                    int i5 = 2 % 2;
                }
                if ((i & 4) != 0) {
                    int i6 = onWarmupCompleted;
                    int i7 = i6 + 3;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    int i9 = i6 + 49;
                    IAuthTabCallback = i9 % 128;
                    if (i9 % 2 != 0) {
                        int i10 = 2 % 2;
                    }
                    recommendedContent2 = null;
                }
                this(str, recommendedContent, recommendedContent2);
            }

            public final String onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 109;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return this.title;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final RecommendedContent IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 99;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                int i4 = i2 % 2;
                RecommendedContent recommendedContent = this.left;
                int i5 = i3 + 121;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return recommendedContent;
            }

            @liq
            public static final class RecommendedContent {
                public static final Companion Companion = new Companion(null);
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;
                private final ChangeInfo changeInfo;
                private final String value;

                static {
                    int i = IAuthTabCallback + 125;
                    onExtraCallbackWithResult = i % 128;
                    if (i % 2 == 0) {
                        int i2 = 16 / 0;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public RecommendedContent() {
                    this((String) null, (ChangeInfo) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                }

                public boolean equals(@Nullable Object obj) {
                    int i = 2 % 2;
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof RecommendedContent)) {
                        return false;
                    }
                    RecommendedContent recommendedContent = (RecommendedContent) obj;
                    if (!Intrinsics.areEqual(this.value, recommendedContent.value)) {
                        int i2 = onNavigationEvent + 21;
                        onExtraCallback = i2 % 128;
                        int i3 = i2 % 2;
                        return false;
                    }
                    if (Intrinsics.areEqual(this.changeInfo, recommendedContent.changeInfo)) {
                        return true;
                    }
                    int i4 = onExtraCallback + 25;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }

                public int hashCode() {
                    int iHashCode;
                    int i = 2 % 2;
                    int iHashCode2 = this.value.hashCode();
                    ChangeInfo changeInfo = this.changeInfo;
                    if (changeInfo == null) {
                        int i2 = onExtraCallback + 123;
                        int i3 = i2 % 128;
                        onNavigationEvent = i3;
                        int i4 = i2 % 2;
                        int i5 = i3 + 43;
                        onExtraCallback = i5 % 128;
                        if (i5 % 2 == 0) {
                            int i6 = 5 / 5;
                        }
                        iHashCode = 0;
                    } else {
                        iHashCode = changeInfo.hashCode();
                    }
                    int i7 = (iHashCode2 * 31) + iHashCode;
                    int i8 = onNavigationEvent + 43;
                    onExtraCallback = i8 % 128;
                    int i9 = i8 % 2;
                    return i7;
                }

                public String toString() {
                    int i = 2 % 2;
                    String str = "RecommendedContent(value=" + this.value + ", changeInfo=" + this.changeInfo + ")";
                    int i2 = onNavigationEvent + 49;
                    onExtraCallback = i2 % 128;
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

                    public final KSerializer<RecommendedContent> serializer() {
                        int i = 2 % 2;
                        int i2 = onNavigationEvent + 93;
                        IAuthTabCallback = i2 % 128;
                        int i3 = i2 % 2;
                        LoanHomeExtensive$ComparisonSection$RecommendedLoan$RecommendedContent$.serializer serializerVar = LoanHomeExtensive$ComparisonSection$RecommendedLoan$RecommendedContent$.serializer.INSTANCE;
                        int i4 = onNavigationEvent + 109;
                        IAuthTabCallback = i4 % 128;
                        if (i4 % 2 != 0) {
                            return serializerVar;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                }

                public /* synthetic */ RecommendedContent(int i, String str, ChangeInfo changeInfo, okycx okycxVar) {
                    if ((i & 1) == 0) {
                        int i2 = onExtraCallback + 51;
                        onNavigationEvent = i2 % 128;
                        int i3 = i2 % 2;
                        int i4 = 2 % 2;
                        str = "";
                    }
                    this.value = str;
                    if ((i & 2) == 0) {
                        this.changeInfo = null;
                        return;
                    }
                    this.changeInfo = changeInfo;
                    int i5 = onExtraCallback + 85;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 57 / 0;
                    }
                }

                public RecommendedContent(@NotNull String str, @Nullable ChangeInfo changeInfo) {
                    Intrinsics.checkNotNullParameter(str, "");
                    this.value = str;
                    this.changeInfo = changeInfo;
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
                @kotlin.jvm.JvmStatic
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public static final /* synthetic */ void IAuthTabCallback(viva.republica.toss.network.model.loan.LoanHomeExtensive.ComparisonSection.RecommendedLoan.RecommendedContent r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
                    /*
                        r0 = 2
                        int r1 = r0 % r0
                        r1 = 0
                        boolean r2 = r6.onWarmupCompleted(r7, r1)
                        r3 = 1
                        if (r2 == r3) goto L2c
                        int r2 = viva.republica.toss.network.model.loan.LoanHomeExtensive.ComparisonSection.RecommendedLoan.RecommendedContent.onExtraCallback
                        int r2 = r2 + 45
                        int r4 = r2 % 128
                        viva.republica.toss.network.model.loan.LoanHomeExtensive.ComparisonSection.RecommendedLoan.RecommendedContent.onNavigationEvent = r4
                        int r2 = r2 % r0
                        java.lang.String r4 = ""
                        if (r2 == 0) goto L24
                        java.lang.String r2 = r5.value
                        boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
                        r4 = 83
                        int r4 = r4 / r1
                        if (r2 != 0) goto L3a
                        goto L2c
                    L24:
                        java.lang.String r2 = r5.value
                        boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
                        if (r2 != 0) goto L3a
                    L2c:
                        java.lang.String r2 = r5.value
                        r6.onExtraCallback(r7, r1, r2)
                        int r1 = viva.republica.toss.network.model.loan.LoanHomeExtensive.ComparisonSection.RecommendedLoan.RecommendedContent.onNavigationEvent
                        int r1 = r1 + 13
                        int r2 = r1 % 128
                        viva.republica.toss.network.model.loan.LoanHomeExtensive.ComparisonSection.RecommendedLoan.RecommendedContent.onExtraCallback = r2
                        int r1 = r1 % r0
                    L3a:
                        boolean r0 = r6.onWarmupCompleted(r7, r3)
                        if (r0 != 0) goto L44
                        viva.republica.toss.network.model.loan.LoanHomeExtensive$ChangeInfo r0 = r5.changeInfo
                        if (r0 == 0) goto L4b
                    L44:
                        viva.republica.toss.network.model.loan.LoanHomeExtensive$ChangeInfo$$serializer r0 = viva.republica.toss.network.model.loan.LoanHomeExtensive$ChangeInfo$.serializer.INSTANCE
                        viva.republica.toss.network.model.loan.LoanHomeExtensive$ChangeInfo r5 = r5.changeInfo
                        r6.onExtraCallbackWithResult(r7, r3, r0, r5)
                    L4b:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanHomeExtensive.ComparisonSection.RecommendedLoan.RecommendedContent.IAuthTabCallback(viva.republica.toss.network.model.loan.LoanHomeExtensive$ComparisonSection$RecommendedLoan$RecommendedContent, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
                }

                /* JADX WARN: Illegal instructions before constructor call */
                public /* synthetic */ RecommendedContent(String str, ChangeInfo changeInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    if ((i & 1) != 0) {
                        int i2 = onNavigationEvent + 19;
                        onExtraCallback = i2 % 128;
                        if (i2 % 2 != 0) {
                            int i3 = 2 % 2;
                        }
                        str = "";
                    }
                    if ((i & 2) != 0) {
                        int i4 = onExtraCallback + 107;
                        onNavigationEvent = i4 % 128;
                        int i5 = i4 % 2;
                        changeInfo = null;
                    }
                    this(str, changeInfo);
                }

                public final String onExtraCallbackWithResult() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 101;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 == 0) {
                        return this.value;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public final ChangeInfo IAuthTabCallback() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 13;
                    int i3 = i2 % 128;
                    onExtraCallback = i3;
                    int i4 = i2 % 2;
                    ChangeInfo changeInfo = this.changeInfo;
                    int i5 = i3 + 89;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 == 0) {
                        return changeInfo;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }

            public final RecommendedContent onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 75;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                int i4 = i2 % 2;
                RecommendedContent recommendedContent = this.right;
                int i5 = i3 + 113;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return recommendedContent;
            }
        }
    }

    @liq
    public static final class DualColumnSection {
        public static final Companion Companion = new Companion(null);
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        private final ColumnContent left;
        private final ColumnContent right;

        static {
            int i = onExtraCallback + 93;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public DualColumnSection() {
            ColumnContent columnContent = null;
            this(columnContent, columnContent, 3, (DefaultConstructorMarker) columnContent);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 111;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj) {
                int i5 = i2 + 51;
                onExtraCallbackWithResult = i5 % 128;
                return i5 % 2 != 0;
            }
            if (!(obj instanceof DualColumnSection)) {
                return false;
            }
            DualColumnSection dualColumnSection = (DualColumnSection) obj;
            if (!Intrinsics.areEqual(this.left, dualColumnSection.left)) {
                return false;
            }
            if (Intrinsics.areEqual(this.right, dualColumnSection.right)) {
                return true;
            }
            int i6 = onExtraCallbackWithResult + 49;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 49;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.left.hashCode();
            return i3 == 0 ? (iHashCode + 53) * this.right.hashCode() : (iHashCode * 31) + this.right.hashCode();
        }

        public String toString() {
            int i = 2 % 2;
            String str = "DualColumnSection(left=" + this.left + ", right=" + this.right + ")";
            int i2 = onExtraCallbackWithResult + 121;
            onWarmupCompleted = i2 % 128;
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

            public final KSerializer<DualColumnSection> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 87;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    LoanHomeExtensive$DualColumnSection$.serializer serializerVar = LoanHomeExtensive$DualColumnSection$.serializer.INSTANCE;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                LoanHomeExtensive$DualColumnSection$.serializer serializerVar2 = LoanHomeExtensive$DualColumnSection$.serializer.INSTANCE;
                int i3 = IAuthTabCallback + 89;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return serializerVar2;
            }
        }

        public /* synthetic */ DualColumnSection(int i, ColumnContent columnContent, ColumnContent columnContent2, okycx okycxVar) {
            if ((i & 1) == 0) {
                columnContent = new ColumnContent((String) null, (String) null, (ChangeInfo) null, 7, (DefaultConstructorMarker) null);
                int i2 = onWarmupCompleted + 39;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            }
            this.left = columnContent;
            if ((i & 2) == 0) {
                this.right = new ColumnContent((String) null, (String) null, (ChangeInfo) null, 7, (DefaultConstructorMarker) null);
                return;
            }
            this.right = columnContent2;
            int i5 = onWarmupCompleted + 67;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
        }

        public DualColumnSection(@NotNull ColumnContent columnContent, @NotNull ColumnContent columnContent2) {
            Intrinsics.checkNotNullParameter(columnContent, "");
            Intrinsics.checkNotNullParameter(columnContent2, "");
            this.left = columnContent;
            this.right = columnContent2;
        }

        @JvmStatic
        public static final /* synthetic */ void onExtraCallbackWithResult(DualColumnSection dualColumnSection, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 49;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (vylVar.onWarmupCompleted(serialDescriptor, 0) || (!Intrinsics.areEqual(dualColumnSection.left, new ColumnContent((String) null, (String) null, (ChangeInfo) null, 7, (DefaultConstructorMarker) null)))) {
                vylVar.onNavigationEvent(serialDescriptor, 0, LoanHomeExtensive$DualColumnSection$ColumnContent$.serializer.INSTANCE, dualColumnSection.left);
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 1) || !Intrinsics.areEqual(dualColumnSection.right, new ColumnContent((String) null, (String) null, (ChangeInfo) null, 7, (DefaultConstructorMarker) null))) {
                vylVar.onNavigationEvent(serialDescriptor, 1, LoanHomeExtensive$DualColumnSection$ColumnContent$.serializer.INSTANCE, dualColumnSection.right);
                int i4 = onExtraCallbackWithResult + 17;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            }
        }

        public /* synthetic */ DualColumnSection(ColumnContent columnContent, ColumnContent columnContent2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            columnContent = (i & 1) != 0 ? new ColumnContent((String) null, (String) null, (ChangeInfo) null, 7, (DefaultConstructorMarker) null) : columnContent;
            if ((i & 2) != 0) {
                columnContent2 = new ColumnContent((String) null, (String) null, (ChangeInfo) null, 7, (DefaultConstructorMarker) null);
                int i2 = onExtraCallbackWithResult + 83;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            }
            this(columnContent, columnContent2);
        }

        public final ColumnContent onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 97;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            ColumnContent columnContent = this.left;
            int i5 = i2 + 91;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return columnContent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @liq
        public static final class ColumnContent {
            public static final Companion Companion = new Companion(null);
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent = 1;
            private final ChangeInfo changeInfo;
            private final String title;
            private final String value;

            static {
                int i = onExtraCallbackWithResult + 35;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
            }

            public ColumnContent() {
                this((String) null, (String) null, (ChangeInfo) null, 7, (DefaultConstructorMarker) null);
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ColumnContent)) {
                    int i2 = onNavigationEvent + 21;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    return false;
                }
                ColumnContent columnContent = (ColumnContent) obj;
                if (!Intrinsics.areEqual(this.title, columnContent.title)) {
                    return false;
                }
                if (!(!Intrinsics.areEqual(this.value, columnContent.value))) {
                    return !(Intrinsics.areEqual(this.changeInfo, columnContent.changeInfo) ^ true);
                }
                int i4 = onExtraCallback + 69;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }

            public int hashCode() {
                int iHashCode;
                int i = 2 % 2;
                int i2 = onExtraCallback + 81;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode2 = this.title.hashCode();
                int iHashCode3 = this.value.hashCode();
                ChangeInfo changeInfo = this.changeInfo;
                if (changeInfo == null) {
                    int i4 = onExtraCallback + 47;
                    int i5 = i4 % 128;
                    onNavigationEvent = i5;
                    iHashCode = i4 % 2 == 0 ? 1 : 0;
                    int i6 = i5 + 61;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    iHashCode = changeInfo.hashCode();
                }
                return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "ColumnContent(title=" + this.title + ", value=" + this.value + ", changeInfo=" + this.changeInfo + ")";
                int i2 = onNavigationEvent + 61;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            public static final class Companion {
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<ColumnContent> serializer() {
                    LoanHomeExtensive$DualColumnSection$ColumnContent$.serializer serializerVar;
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 103;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 == 0) {
                        serializerVar = LoanHomeExtensive$DualColumnSection$ColumnContent$.serializer.INSTANCE;
                        int i3 = 30 / 0;
                    } else {
                        serializerVar = LoanHomeExtensive$DualColumnSection$ColumnContent$.serializer.INSTANCE;
                    }
                    int i4 = onExtraCallbackWithResult + 7;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return serializerVar;
                }
            }

            public /* synthetic */ ColumnContent(int i, String str, String str2, ChangeInfo changeInfo, okycx okycxVar) {
                if ((i & 1) == 0) {
                    this.title = "";
                } else {
                    this.title = str;
                }
                if ((i & 2) == 0) {
                    int i2 = onExtraCallback + 117;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    this.value = "";
                    int i4 = 2 % 2;
                } else {
                    this.value = str2;
                }
                if ((i & 4) == 0) {
                    this.changeInfo = null;
                    int i5 = onNavigationEvent + 115;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 24 / 0;
                        return;
                    }
                    return;
                }
                this.changeInfo = changeInfo;
                int i7 = onNavigationEvent + 85;
                onExtraCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 20 / 0;
                }
            }

            public ColumnContent(@NotNull String str, @NotNull String str2, @Nullable ChangeInfo changeInfo) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.title = str;
                this.value = str2;
                this.changeInfo = changeInfo;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
            @kotlin.jvm.JvmStatic
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static final /* synthetic */ void onExtraCallback(viva.republica.toss.network.model.loan.LoanHomeExtensive.DualColumnSection.ColumnContent r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
                /*
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = viva.republica.toss.network.model.loan.LoanHomeExtensive.DualColumnSection.ColumnContent.onNavigationEvent
                    int r1 = r1 + 23
                    int r2 = r1 % 128
                    viva.republica.toss.network.model.loan.LoanHomeExtensive.DualColumnSection.ColumnContent.onExtraCallback = r2
                    int r1 = r1 % r0
                    java.lang.String r2 = ""
                    r3 = 1
                    r4 = 0
                    if (r1 == 0) goto L19
                    boolean r1 = r6.onWarmupCompleted(r7, r4)
                    if (r1 == r3) goto L27
                    goto L1f
                L19:
                    boolean r1 = r6.onWarmupCompleted(r7, r4)
                    if (r1 != 0) goto L27
                L1f:
                    java.lang.String r1 = r5.title
                    boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
                    if (r1 != 0) goto L2c
                L27:
                    java.lang.String r1 = r5.title
                    r6.onExtraCallback(r7, r4, r1)
                L2c:
                    boolean r1 = r6.onWarmupCompleted(r7, r3)
                    if (r1 != 0) goto L3a
                    java.lang.String r1 = r5.value
                    boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
                    if (r1 != 0) goto L48
                L3a:
                    java.lang.String r1 = r5.value
                    r6.onExtraCallback(r7, r3, r1)
                    int r1 = viva.republica.toss.network.model.loan.LoanHomeExtensive.DualColumnSection.ColumnContent.onExtraCallback
                    int r1 = r1 + 71
                    int r2 = r1 % 128
                    viva.republica.toss.network.model.loan.LoanHomeExtensive.DualColumnSection.ColumnContent.onNavigationEvent = r2
                    int r1 = r1 % r0
                L48:
                    boolean r1 = r6.onWarmupCompleted(r7, r0)
                    if (r1 != 0) goto L52
                    viva.republica.toss.network.model.loan.LoanHomeExtensive$ChangeInfo r1 = r5.changeInfo
                    if (r1 == 0) goto L59
                L52:
                    viva.republica.toss.network.model.loan.LoanHomeExtensive$ChangeInfo$$serializer r1 = viva.republica.toss.network.model.loan.LoanHomeExtensive$ChangeInfo$.serializer.INSTANCE
                    viva.republica.toss.network.model.loan.LoanHomeExtensive$ChangeInfo r5 = r5.changeInfo
                    r6.onExtraCallbackWithResult(r7, r0, r1, r5)
                L59:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanHomeExtensive.DualColumnSection.ColumnContent.onExtraCallback(viva.republica.toss.network.model.loan.LoanHomeExtensive$DualColumnSection$ColumnContent, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ ColumnContent(String str, String str2, ChangeInfo changeInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
                str = (i & 1) != 0 ? "" : str;
                if ((i & 2) != 0) {
                    int i2 = onExtraCallback + 29;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 == 0) {
                        throw null;
                    }
                    str2 = "";
                }
                if ((i & 4) != 0) {
                    int i3 = onExtraCallback + 23;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    int i5 = 2 % 2;
                    changeInfo = null;
                }
                this(str, str2, changeInfo);
            }

            public final String onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 1;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                String str = this.title;
                if (i3 == 0) {
                    int i4 = 59 / 0;
                }
                return str;
            }

            public final String IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 23;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return this.value;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final ChangeInfo onExtraCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 51;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                ChangeInfo changeInfo = this.changeInfo;
                int i5 = i3 + 77;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return changeInfo;
                }
                throw null;
            }
        }

        public final ColumnContent onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 97;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            ColumnContent columnContent = this.right;
            int i5 = i2 + 57;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return columnContent;
        }
    }

    @liq
    public static final class ChangeInfo {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final ChangeType type;
        private final String value;
        public static final Companion Companion = new Companion(null);
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.loan.LoanHomeExtensive$ChangeInfo$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 11;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnExtraCallback = LoanHomeExtensive.ChangeInfo.onExtraCallback();
                int i4 = onNavigationEvent + 35;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return kSerializerOnExtraCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }), null};

        /* JADX WARN: Multi-variable type inference failed */
        public ChangeInfo() {
            this((ChangeType) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ KSerializer onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 71;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnNavigationEvent = onNavigationEvent();
            int i4 = onExtraCallbackWithResult + 85;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 73 / 0;
            }
            return kSerializerOnNavigationEvent;
        }

        private static final /* synthetic */ KSerializer onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 3;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                ChangeType.Companion.serializer();
                throw null;
            }
            KSerializer<ChangeType> kSerializerSerializer = ChangeType.Companion.serializer();
            int i3 = onExtraCallbackWithResult + 75;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return kSerializerSerializer;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChangeInfo)) {
                int i2 = onExtraCallbackWithResult + 77;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            ChangeInfo changeInfo = (ChangeInfo) obj;
            if (this.type != changeInfo.type) {
                int i4 = onExtraCallbackWithResult + 97;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.value, changeInfo.value)) {
                return true;
            }
            int i6 = onExtraCallbackWithResult + 65;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0031 A[PHI: r1 r3
          0x0031: PHI (r1v10 int) = (r1v5 int), (r1v12 int) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
          0x0031: PHI (r3v4 java.lang.String) = (r3v0 java.lang.String), (r3v5 java.lang.String) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r1
          0x0027: PHI (r1v6 int) = (r1v5 int), (r1v12 int) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int hashCode() {
            /*
                r5 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = viva.republica.toss.network.model.loan.LoanHomeExtensive.ChangeInfo.onExtraCallbackWithResult
                int r1 = r1 + 45
                int r2 = r1 % 128
                viva.republica.toss.network.model.loan.LoanHomeExtensive.ChangeInfo.onExtraCallback = r2
                int r1 = r1 % r0
                r2 = 0
                if (r1 == 0) goto L1d
                viva.republica.toss.network.model.loan.LoanHomeExtensive$ChangeType r1 = r5.type
                int r1 = r1.hashCode()
                java.lang.String r3 = r5.value
                r4 = 93
                int r4 = r4 / r2
                if (r3 != 0) goto L31
                goto L27
            L1d:
                viva.republica.toss.network.model.loan.LoanHomeExtensive$ChangeType r1 = r5.type
                int r1 = r1.hashCode()
                java.lang.String r3 = r5.value
                if (r3 != 0) goto L31
            L27:
                int r3 = viva.republica.toss.network.model.loan.LoanHomeExtensive.ChangeInfo.onExtraCallbackWithResult
                int r3 = r3 + 109
                int r4 = r3 % 128
                viva.republica.toss.network.model.loan.LoanHomeExtensive.ChangeInfo.onExtraCallback = r4
                int r3 = r3 % r0
                goto L35
            L31:
                int r2 = r3.hashCode()
            L35:
                int r1 = r1 * 31
                int r1 = r1 + r2
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanHomeExtensive.ChangeInfo.hashCode():int");
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ChangeInfo(type=" + this.type + ", value=" + this.value + ")";
            int i2 = onExtraCallback + 27;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ChangeInfo> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 43;
                onExtraCallback = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    LoanHomeExtensive$ChangeInfo$.serializer serializerVar = LoanHomeExtensive$ChangeInfo$.serializer.INSTANCE;
                    throw null;
                }
                LoanHomeExtensive$ChangeInfo$.serializer serializerVar2 = LoanHomeExtensive$ChangeInfo$.serializer.INSTANCE;
                int i3 = onExtraCallbackWithResult + 79;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    return serializerVar2;
                }
                obj.hashCode();
                throw null;
            }
        }

        static {
            int i = onWarmupCompleted + 121;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                int i2 = 90 / 0;
            }
        }

        public /* synthetic */ ChangeInfo(int i, ChangeType changeType, String str, okycx okycxVar) {
            if ((i & 1) == 0) {
                changeType = ChangeType.NONE;
                int i2 = onExtraCallback + 91;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            }
            this.type = changeType;
            if ((i & 2) == 0) {
                this.value = null;
                return;
            }
            this.value = str;
            int i5 = onExtraCallbackWithResult + 61;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        }

        public ChangeInfo(@NotNull ChangeType changeType, @Nullable String str) {
            Intrinsics.checkNotNullParameter(changeType, "");
            this.type = changeType;
            this.value = str;
        }

        public static final /* synthetic */ Lazy[] IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 83;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return $childSerializers;
            }
            throw null;
        }

        @JvmStatic
        public static final /* synthetic */ void onExtraCallbackWithResult(ChangeInfo changeInfo, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (vylVar.onWarmupCompleted(serialDescriptor, 0) || changeInfo.type != ChangeType.NONE) {
                vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[0].getValue(), changeInfo.type);
                int i2 = onExtraCallbackWithResult + 63;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 1) || changeInfo.value != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, changeInfo.value);
            }
            int i4 = onExtraCallback + 41;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ ChangeInfo(ChangeType changeType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                changeType = ChangeType.NONE;
                int i2 = onExtraCallbackWithResult + 61;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 % 2;
                }
            }
            if ((i & 2) != 0) {
                int i4 = onExtraCallback + 23;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 65 / 0;
                }
                int i6 = 2 % 2;
                str = null;
            }
            this(changeType, str);
        }

        public final ChangeType onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 55;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            ChangeType changeType = this.type;
            int i5 = i3 + 113;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return changeType;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 91;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.value;
            int i4 = i3 + 13;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @liq
    public static final class ChangeType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ChangeType[] $VALUES;
        private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
        public static final Companion Companion;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        public static final ChangeType UP = new ChangeType("UP", 0);
        public static final ChangeType DOWN = new ChangeType("DOWN", 1);
        public static final ChangeType NONE = new ChangeType("NONE", 2);

        public static /* synthetic */ KSerializer $r8$lambda$pzkqm0IDlnXVmLXqe8Glesidm6o() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 77;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializer_init_$_anonymous_ = _init_$_anonymous_();
            int i4 = onWarmupCompleted + 77;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return kSerializer_init_$_anonymous_;
        }

        private static final /* synthetic */ ChangeType[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 31;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            ChangeType[] changeTypeArr = {UP, DOWN, NONE};
            int i5 = i2 + 27;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return changeTypeArr;
        }

        public static EnumEntries<ChangeType> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 107;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            EnumEntries<ChangeType> enumEntries = $ENTRIES;
            int i4 = i3 + 11;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return enumEntries;
        }

        public static ChangeType valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 53;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            ChangeType changeType = (ChangeType) Enum.valueOf(ChangeType.class, str);
            int i4 = onExtraCallback + 41;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return changeType;
        }

        public static ChangeType[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 111;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            ChangeType[] changeTypeArr = (ChangeType[]) $VALUES.clone();
            int i4 = onExtraCallback + 41;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return changeTypeArr;
        }

        public static final class Companion {
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            private final /* synthetic */ KSerializer onExtraCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 31;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializer = (KSerializer) ChangeType.access$get$cachedSerializer$delegate$cp().getValue();
                int i4 = onExtraCallback + 43;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 65 / 0;
                }
                return kSerializer;
            }

            public final KSerializer<ChangeType> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 89;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    onExtraCallback();
                    throw null;
                }
                KSerializer<ChangeType> kSerializerOnExtraCallback = onExtraCallback();
                int i3 = onExtraCallback + 9;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return kSerializerOnExtraCallback;
            }
        }

        private ChangeType(String str, int i) {
        }

        private static final /* synthetic */ KSerializer _init_$_anonymous_() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 107;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.loan.LoanHomeExtensive.ChangeType", values());
            int i4 = onWarmupCompleted + 27;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return kSerializerOnExtraCallbackWithResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final /* synthetic */ Lazy access$get$cachedSerializer$delegate$cp() {
            Lazy<KSerializer<Object>> lazy;
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 113;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                lazy = $cachedSerializer$delegate;
                int i4 = 78 / 0;
            } else {
                lazy = $cachedSerializer$delegate;
            }
            int i5 = i2 + 11;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 45 / 0;
            }
            return lazy;
        }

        static {
            ChangeType[] changeTypeArr$values = $values();
            $VALUES = changeTypeArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(changeTypeArr$values);
            Companion = new Companion(null);
            $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.loan.LoanHomeExtensive$ChangeType$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 99;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    KSerializer kSerializer$r8$lambda$pzkqm0IDlnXVmLXqe8Glesidm6o = LoanHomeExtensive.ChangeType.$r8$lambda$pzkqm0IDlnXVmLXqe8Glesidm6o();
                    int i4 = IAuthTabCallback + 23;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    return kSerializer$r8$lambda$pzkqm0IDlnXVmLXqe8Glesidm6o;
                }
            });
            int i = onExtraCallbackWithResult + 53;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }
    }

    @liq
    public static final class MenuSection implements Parcelable {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private static int onNavigationEvent;
        private final Icon icon;
        private final boolean isExpanded;
        private final List<MenuItem> items;
        private final LogInfo logInfo;
        private final String title;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<MenuSection> CREATOR = new IAuthTabCallback();
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.loan.LoanHomeExtensive$MenuSection$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 45;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializer = (KSerializer) LoanHomeExtensive.MenuSection.onWarmupCompleted(1283855117, new Object[0], setVisitUrl.onExtraCallbackWithResult(), -1283855117, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult());
                int i4 = onExtraCallbackWithResult + 125;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 8 / 0;
                }
                return kSerializer;
            }
        }), null, null};

        public static final class IAuthTabCallback implements Parcelable.Creator<MenuSection> {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final MenuSection[] IAuthTabCallback(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 19;
                IAuthTabCallback = i3 % 128;
                MenuSection[] menuSectionArr = new MenuSection[i];
                if (i3 % 2 != 0) {
                    return menuSectionArr;
                }
                throw null;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ MenuSection createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 71;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                MenuSection menuSectionOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
                if (i3 != 0) {
                    int i4 = 61 / 0;
                }
                return menuSectionOnExtraCallbackWithResult;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ MenuSection[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 99;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                MenuSection[] menuSectionArrIAuthTabCallback = IAuthTabCallback(i);
                int i5 = IAuthTabCallback + 91;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return menuSectionArrIAuthTabCallback;
                }
                throw null;
            }

            public final MenuSection onExtraCallbackWithResult(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                String string = parcel.readString();
                LogInfo logInfoCreateFromParcel = null;
                Icon iconCreateFromParcel = parcel.readInt() == 0 ? null : Icon.CREATOR.createFromParcel(parcel);
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int i3 = IAuthTabCallback + 101;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                for (int i5 = 0; i5 != i2; i5++) {
                    int i6 = onExtraCallback + 63;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    arrayList.add(MenuItem.CREATOR.createFromParcel(parcel));
                }
                if (parcel.readInt() == 0) {
                    int i8 = onExtraCallback + 43;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                } else {
                    logInfoCreateFromParcel = LogInfo.CREATOR.createFromParcel(parcel);
                }
                return new MenuSection(string, iconCreateFromParcel, arrayList, logInfoCreateFromParcel, parcel.readInt() != 0);
            }
        }

        private static final /* synthetic */ KSerializer asInterface() {
            int i = 2 % 2;
            checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(LoanHomeExtensive$MenuSection$MenuItem$$serializer.INSTANCE);
            int i2 = onExtraCallback + 15;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 24 / 0;
            }
            return checkcanopenlandingpage;
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 89;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2 == 0 ? 1 : 0;
            int i5 = i3 + 11;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return Integer.valueOf(i4);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onNavigationEvent;
                int i3 = i2 + 51;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 103;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return true;
                }
                throw null;
            }
            if (!(obj instanceof MenuSection)) {
                return false;
            }
            MenuSection menuSection = (MenuSection) obj;
            if (!Intrinsics.areEqual(this.title, menuSection.title)) {
                int i6 = onExtraCallback + 75;
                onNavigationEvent = i6 % 128;
                return i6 % 2 != 0;
            }
            if (Intrinsics.areEqual(this.icon, menuSection.icon)) {
                return Intrinsics.areEqual(this.items, menuSection.items) && Intrinsics.areEqual(this.logInfo, menuSection.logInfo) && this.isExpanded == menuSection.isExpanded;
            }
            int i7 = onExtraCallback + 49;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int iHashCode2 = this.title.hashCode();
            Icon icon = this.icon;
            int iHashCode3 = 0;
            if (icon == null) {
                int i2 = onNavigationEvent + 19;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 25;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 2 % 5;
                }
                iHashCode = 0;
            } else {
                iHashCode = icon.hashCode();
            }
            int iHashCode4 = this.items.hashCode();
            LogInfo logInfo = this.logInfo;
            if (logInfo != null) {
                iHashCode3 = logInfo.hashCode();
                int i7 = onExtraCallback + 77;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
            }
            return (((((((iHashCode2 * 31) + iHashCode) * 31) + iHashCode4) * 31) + iHashCode3) * 31) + Boolean.hashCode(this.isExpanded);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "MenuSection(title=" + this.title + ", icon=" + this.icon + ", items=" + this.items + ", logInfo=" + this.logInfo + ", isExpanded=" + this.isExpanded + ")";
            int i2 = onNavigationEvent + 9;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 49;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i4 == 0) {
                parcel.writeString(this.title);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            parcel.writeString(this.title);
            Icon icon = this.icon;
            if (icon == null) {
                int i5 = onNavigationEvent + 77;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                icon.writeToParcel(parcel, i);
            }
            List<MenuItem> list = this.items;
            parcel.writeInt(list.size());
            Iterator<MenuItem> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
            LogInfo logInfo = this.logInfo;
            if (logInfo == null) {
                int i7 = onNavigationEvent + 83;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                logInfo.writeToParcel(parcel, i);
            }
            parcel.writeInt(this.isExpanded ? 1 : 0);
            int i9 = onNavigationEvent + 45;
            onExtraCallback = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 89 / 0;
            }
        }

        public static final class Companion {
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<MenuSection> serializer() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 115;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                LoanHomeExtensive$MenuSection$$serializer loanHomeExtensive$MenuSection$$serializer = LoanHomeExtensive$MenuSection$$serializer.INSTANCE;
                int i4 = onWarmupCompleted + 71;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return loanHomeExtensive$MenuSection$$serializer;
            }
        }

        static {
            int i = IAuthTabCallback + 63;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        public /* synthetic */ MenuSection(int i, String str, Icon icon, List list, LogInfo logInfo, boolean z, okycx okycxVar) {
            if (4 != (i & 4)) {
                htf31.onExtraCallbackWithResult(i, 4, LoanHomeExtensive$MenuSection$$serializer.INSTANCE.getDescriptor());
                int i2 = onNavigationEvent + 45;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            }
            this.title = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.icon = null;
            } else {
                this.icon = icon;
                int i5 = onExtraCallback + 53;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            }
            int i7 = 2 % 2;
            this.items = list;
            if ((i & 8) == 0) {
                int i8 = onNavigationEvent + 41;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                this.logInfo = null;
                if (i9 == 0) {
                    throw null;
                }
            } else {
                this.logInfo = logInfo;
            }
            if ((i & 16) == 0) {
                this.isExpanded = false;
            } else {
                this.isExpanded = z;
            }
        }

        public MenuSection(@NotNull String str, @Nullable Icon icon, @NotNull List<MenuItem> list, @Nullable LogInfo logInfo, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.title = str;
            this.icon = icon;
            this.items = list;
            this.logInfo = logInfo;
            this.isExpanded = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void IAuthTabCallback(viva.republica.toss.network.model.loan.LoanHomeExtensive.MenuSection r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
            /*
                r0 = 2
                int r1 = r0 % r0
                kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.loan.LoanHomeExtensive.MenuSection.$childSerializers
                r2 = 0
                boolean r3 = r7.onWarmupCompleted(r8, r2)
                if (r3 != 0) goto L29
                int r3 = viva.republica.toss.network.model.loan.LoanHomeExtensive.MenuSection.onExtraCallback
                int r3 = r3 + 79
                int r4 = r3 % 128
                viva.republica.toss.network.model.loan.LoanHomeExtensive.MenuSection.onNavigationEvent = r4
                int r3 = r3 % r0
                java.lang.String r4 = ""
                if (r3 != 0) goto L22
                java.lang.String r3 = r6.title
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
                if (r3 != 0) goto L2e
                goto L29
            L22:
                java.lang.String r6 = r6.title
                kotlin.jvm.internal.Intrinsics.areEqual(r6, r4)
                r6 = 0
                throw r6
            L29:
                java.lang.String r3 = r6.title
                r7.onExtraCallback(r8, r2, r3)
            L2e:
                r3 = 1
                boolean r4 = r7.onWarmupCompleted(r8, r3)
                r4 = r4 ^ r3
                if (r4 == 0) goto L3a
                viva.republica.toss.network.model.loan.LoanHomeExtensive$MenuSection$Icon r4 = r6.icon
                if (r4 == 0) goto L41
            L3a:
                viva.republica.toss.network.model.loan.LoanHomeExtensive$MenuSection$Icon$$serializer r4 = viva.republica.toss.network.model.loan.LoanHomeExtensive$MenuSection$Icon$$serializer.INSTANCE
                viva.republica.toss.network.model.loan.LoanHomeExtensive$MenuSection$Icon r5 = r6.icon
                r7.onExtraCallbackWithResult(r8, r3, r4, r5)
            L41:
                r1 = r1[r0]
                java.lang.Object r1 = r1.getValue()
                o.py r1 = (o.py) r1
                java.util.List<viva.republica.toss.network.model.loan.LoanHomeExtensive$MenuSection$MenuItem> r3 = r6.items
                r7.onNavigationEvent(r8, r0, r1, r3)
                r1 = 3
                boolean r3 = r7.onWarmupCompleted(r8, r1)
                if (r3 != 0) goto L59
                viva.republica.toss.network.model.loan.LoanHomeExtensive$MenuSection$LogInfo r3 = r6.logInfo
                if (r3 == 0) goto L6c
            L59:
                viva.republica.toss.network.model.loan.LoanHomeExtensive$MenuSection$LogInfo$$serializer r3 = viva.republica.toss.network.model.loan.LoanHomeExtensive$MenuSection$LogInfo$$serializer.INSTANCE
                viva.republica.toss.network.model.loan.LoanHomeExtensive$MenuSection$LogInfo r4 = r6.logInfo
                r7.onExtraCallbackWithResult(r8, r1, r3, r4)
                int r3 = viva.republica.toss.network.model.loan.LoanHomeExtensive.MenuSection.onNavigationEvent
                int r3 = r3 + 99
                int r4 = r3 % 128
                viva.republica.toss.network.model.loan.LoanHomeExtensive.MenuSection.onExtraCallback = r4
                int r3 = r3 % r0
                if (r3 != 0) goto L6c
                int r1 = r1 % r1
            L6c:
                r1 = 4
                boolean r3 = r7.onWarmupCompleted(r8, r1)
                if (r3 != 0) goto L88
                int r3 = viva.republica.toss.network.model.loan.LoanHomeExtensive.MenuSection.onNavigationEvent
                int r3 = r3 + 101
                int r4 = r3 % 128
                viva.republica.toss.network.model.loan.LoanHomeExtensive.MenuSection.onExtraCallback = r4
                int r3 = r3 % r0
                boolean r0 = r6.isExpanded
                if (r3 != 0) goto L86
                r3 = 97
                int r3 = r3 / r2
                if (r0 == 0) goto L8d
                goto L88
            L86:
                if (r0 == 0) goto L8d
            L88:
                boolean r6 = r6.isExpanded
                r7.onNavigationEvent(r8, r1, r6)
            L8d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanHomeExtensive.MenuSection.IAuthTabCallback(viva.republica.toss.network.model.loan.LoanHomeExtensive$MenuSection, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        public static final /* synthetic */ Lazy[] onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 33;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            int i4 = i3 + 115;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return lazyArr;
            }
            throw null;
        }

        public final String IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 85;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            String str = this.title;
            int i5 = i3 + 125;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 99 / 0;
            }
            return str;
        }

        public final Icon onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 43;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            Icon icon = this.icon;
            int i5 = i3 + 101;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return icon;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final List<MenuItem> onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 15;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            List<MenuItem> list = this.items;
            int i4 = i2 + 13;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return list;
            }
            throw null;
        }

        public final LogInfo onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 35;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            LogInfo logInfo = this.logInfo;
            int i5 = i3 + 45;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return logInfo;
        }

        @liq
        public static final class Icon implements Parcelable {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;
            private final String color;
            private final String url;
            public static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<Icon> CREATOR = new onExtraCallback();

            public static final class onExtraCallback implements Parcelable.Creator<Icon> {
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ Icon createFromParcel(Parcel parcel) {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 93;
                    IAuthTabCallback = i2 % 128;
                    if (i2 % 2 == 0) {
                        onNavigationEvent(parcel);
                        throw null;
                    }
                    Icon iconOnNavigationEvent = onNavigationEvent(parcel);
                    int i3 = IAuthTabCallback + 31;
                    onNavigationEvent = i3 % 128;
                    if (i3 % 2 == 0) {
                        return iconOnNavigationEvent;
                    }
                    throw null;
                }

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ Icon[] newArray(int i) {
                    int i2 = 2 % 2;
                    int i3 = onNavigationEvent + 109;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    Icon[] iconArrOnNavigationEvent = onNavigationEvent(i);
                    if (i4 == 0) {
                        int i5 = 86 / 0;
                    }
                    return iconArrOnNavigationEvent;
                }

                public final Icon onNavigationEvent(Parcel parcel) {
                    int i = 2 % 2;
                    Intrinsics.checkNotNullParameter(parcel, "");
                    Icon icon = new Icon(parcel.readString(), parcel.readString());
                    int i2 = IAuthTabCallback + 13;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    return icon;
                }

                public final Icon[] onNavigationEvent(int i) {
                    int i2 = 2 % 2;
                    int i3 = onNavigationEvent;
                    int i4 = i3 + 19;
                    IAuthTabCallback = i4 % 128;
                    Icon[] iconArr = new Icon[i];
                    if (i4 % 2 == 0) {
                        int i5 = 67 / 0;
                    }
                    int i6 = i3 + 91;
                    IAuthTabCallback = i6 % 128;
                    if (i6 % 2 != 0) {
                        return iconArr;
                    }
                    throw null;
                }
            }

            static {
                int i = onExtraCallbackWithResult + 19;
                onWarmupCompleted = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public Icon() {
                String str = null;
                this(str, str, 3, (DefaultConstructorMarker) str);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 31;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 85;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return 0;
                }
                throw null;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Icon)) {
                    int i2 = IAuthTabCallback + 101;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    return false;
                }
                Icon icon = (Icon) obj;
                if (!Intrinsics.areEqual(this.url, icon.url)) {
                    int i4 = IAuthTabCallback + 43;
                    onNavigationEvent = i4 % 128;
                    return i4 % 2 != 0;
                }
                if (Intrinsics.areEqual(this.color, icon.color)) {
                    return true;
                }
                int i5 = onNavigationEvent + 57;
                IAuthTabCallback = i5 % 128;
                return i5 % 2 == 0;
            }

            public int hashCode() {
                int iHashCode;
                int i = 2 % 2;
                int iHashCode2 = this.url.hashCode();
                String str = this.color;
                if (str == null) {
                    iHashCode = 0;
                } else {
                    iHashCode = str.hashCode();
                    int i2 = onNavigationEvent + 79;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                }
                int i4 = (iHashCode2 * 31) + iHashCode;
                int i5 = IAuthTabCallback + 123;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    return i4;
                }
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Icon(url=" + this.url + ", color=" + this.color + ")";
                int i2 = onNavigationEvent + 51;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 61;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                if (i4 == 0) {
                    parcel.writeString(this.url);
                    parcel.writeString(this.color);
                    int i5 = 65 / 0;
                } else {
                    parcel.writeString(this.url);
                    parcel.writeString(this.color);
                }
                int i6 = IAuthTabCallback + 81;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
            }

            public static final class Companion {
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Icon> serializer() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 53;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 == 0) {
                        LoanHomeExtensive$MenuSection$Icon$$serializer loanHomeExtensive$MenuSection$Icon$$serializer = LoanHomeExtensive$MenuSection$Icon$$serializer.INSTANCE;
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    LoanHomeExtensive$MenuSection$Icon$$serializer loanHomeExtensive$MenuSection$Icon$$serializer2 = LoanHomeExtensive$MenuSection$Icon$$serializer.INSTANCE;
                    int i3 = IAuthTabCallback + 57;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 23 / 0;
                    }
                    return loanHomeExtensive$MenuSection$Icon$$serializer2;
                }
            }

            public /* synthetic */ Icon(int i, String str, String str2, okycx okycxVar) {
                this.url = (i & 1) == 0 ? "" : str;
                if ((i & 2) == 0) {
                    this.color = null;
                    int i2 = IAuthTabCallback + 9;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 != 0) {
                        throw null;
                    }
                    return;
                }
                this.color = str2;
                int i3 = onNavigationEvent + 117;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 73 / 0;
                }
            }

            public Icon(@NotNull String str, @Nullable String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                this.url = str;
                this.color = str2;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
            @kotlin.jvm.JvmStatic
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static final /* synthetic */ void onExtraCallback(viva.republica.toss.network.model.loan.LoanHomeExtensive.MenuSection.Icon r4, o.vyl r5, kotlinx.serialization.descriptors.SerialDescriptor r6) {
                /*
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = viva.republica.toss.network.model.loan.LoanHomeExtensive.MenuSection.Icon.onNavigationEvent
                    int r1 = r1 + 63
                    int r2 = r1 % 128
                    viva.republica.toss.network.model.loan.LoanHomeExtensive.MenuSection.Icon.IAuthTabCallback = r2
                    int r1 = r1 % r0
                    r2 = 0
                    if (r1 != 0) goto L16
                    boolean r1 = r5.onWarmupCompleted(r6, r2)
                    if (r1 != 0) goto L26
                    goto L1c
                L16:
                    boolean r1 = r5.onWarmupCompleted(r6, r2)
                    if (r1 != 0) goto L26
                L1c:
                    java.lang.String r1 = r4.url
                    java.lang.String r3 = ""
                    boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
                    if (r1 != 0) goto L2b
                L26:
                    java.lang.String r1 = r4.url
                    r5.onExtraCallback(r6, r2, r1)
                L2b:
                    r1 = 1
                    boolean r2 = r5.onWarmupCompleted(r6, r1)
                    if (r2 != 0) goto L36
                    java.lang.String r2 = r4.color
                    if (r2 == 0) goto L46
                L36:
                    o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
                    java.lang.String r4 = r4.color
                    r5.onExtraCallbackWithResult(r6, r1, r2, r4)
                    int r4 = viva.republica.toss.network.model.loan.LoanHomeExtensive.MenuSection.Icon.IAuthTabCallback
                    int r4 = r4 + 21
                    int r5 = r4 % 128
                    viva.republica.toss.network.model.loan.LoanHomeExtensive.MenuSection.Icon.onNavigationEvent = r5
                    int r4 = r4 % r0
                L46:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanHomeExtensive.MenuSection.Icon.onExtraCallback(viva.republica.toss.network.model.loan.LoanHomeExtensive$MenuSection$Icon, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ Icon(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                Object obj = null;
                if ((i & 1) != 0) {
                    int i2 = onNavigationEvent + 121;
                    IAuthTabCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        str = "";
                        int i3 = 2 % 2;
                    } else {
                        obj.hashCode();
                        throw null;
                    }
                }
                if ((i & 2) != 0) {
                    int i4 = IAuthTabCallback + 91;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 != 0) {
                        throw null;
                    }
                    int i5 = 2 % 2;
                    str2 = null;
                }
                this(str, str2);
            }

            public final String IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 21;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    return this.url;
                }
                throw null;
            }

            public final String onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 39;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                String str = this.color;
                int i5 = i2 + 97;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 98 / 0;
                }
                return str;
            }
        }

        public final boolean IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 7;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            boolean z = this.isExpanded;
            int i5 = i3 + 1;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        @liq
        public static final class MenuItem implements Parcelable {
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;
            private static int onWarmupCompleted;
            private final Icon icon;
            private final LogInfo logInfo;
            private final String rightText;
            private final String scheme;
            private final String title;
            public static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<MenuItem> CREATOR = new onNavigationEvent();

            public static final class onNavigationEvent implements Parcelable.Creator<MenuItem> {
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ MenuItem createFromParcel(Parcel parcel) {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 119;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    MenuItem menuItemOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
                    if (i3 != 0) {
                        int i4 = 41 / 0;
                    }
                    int i5 = onExtraCallbackWithResult + 51;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return menuItemOnExtraCallbackWithResult;
                }

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ MenuItem[] newArray(int i) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback + 111;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 == 0) {
                        return onNavigationEvent(i);
                    }
                    onNavigationEvent(i);
                    throw null;
                }

                public final MenuItem onExtraCallbackWithResult(Parcel parcel) {
                    Icon iconCreateFromParcel;
                    int i = 2 % 2;
                    Intrinsics.checkNotNullParameter(parcel, "");
                    LogInfo logInfoCreateFromParcel = null;
                    if (parcel.readInt() == 0) {
                        int i2 = onExtraCallbackWithResult + 45;
                        onExtraCallback = i2 % 128;
                        if (i2 % 2 == 0) {
                            throw null;
                        }
                        iconCreateFromParcel = null;
                    } else {
                        iconCreateFromParcel = Icon.CREATOR.createFromParcel(parcel);
                    }
                    Icon icon = iconCreateFromParcel;
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        int i3 = onExtraCallback + 111;
                        onExtraCallbackWithResult = i3 % 128;
                        if (i3 % 2 != 0) {
                            throw null;
                        }
                    } else {
                        logInfoCreateFromParcel = LogInfo.CREATOR.createFromParcel(parcel);
                    }
                    return new MenuItem(icon, string, string2, string3, logInfoCreateFromParcel);
                }

                public final MenuItem[] onNavigationEvent(int i) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallbackWithResult + 91;
                    int i4 = i3 % 128;
                    onExtraCallback = i4;
                    int i5 = i3 % 2;
                    MenuItem[] menuItemArr = new MenuItem[i];
                    int i6 = i4 + 15;
                    onExtraCallbackWithResult = i6 % 128;
                    if (i6 % 2 == 0) {
                        return menuItemArr;
                    }
                    throw null;
                }
            }

            static {
                int i = onExtraCallback + 119;
                onNavigationEvent = i % 128;
                int i2 = i % 2;
            }

            public MenuItem() {
                this((Icon) null, (String) null, (String) null, (String) null, (LogInfo) null, 31, (DefaultConstructorMarker) null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 109;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 69;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return 0;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MenuItem)) {
                    return false;
                }
                MenuItem menuItem = (MenuItem) obj;
                if ((!Intrinsics.areEqual(this.icon, menuItem.icon)) || !Intrinsics.areEqual(this.title, menuItem.title) || !Intrinsics.areEqual(this.rightText, menuItem.rightText)) {
                    return false;
                }
                if (!Intrinsics.areEqual(this.scheme, menuItem.scheme)) {
                    int i2 = onExtraCallbackWithResult + 49;
                    onWarmupCompleted = i2 % 128;
                    return i2 % 2 != 0;
                }
                if (!Intrinsics.areEqual(this.logInfo, menuItem.logInfo)) {
                    return false;
                }
                int i3 = onWarmupCompleted + 103;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return true;
            }

            public int hashCode() {
                Icon icon;
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 7;
                onExtraCallbackWithResult = i2 % 128;
                int iHashCode = 0;
                int iHashCode2 = (i2 % 2 != 0 ? (icon = this.icon) != null : (icon = this.icon) != null) ? icon.hashCode() : 0;
                int iHashCode3 = this.title.hashCode();
                String str = this.rightText;
                int iHashCode4 = str == null ? 0 : str.hashCode();
                String str2 = this.scheme;
                int iHashCode5 = str2 == null ? 0 : str2.hashCode();
                LogInfo logInfo = this.logInfo;
                if (logInfo != null) {
                    iHashCode = logInfo.hashCode();
                    int i3 = onWarmupCompleted + 95;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                }
                int i5 = (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode;
                int i6 = onExtraCallbackWithResult + 107;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                return i5;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "MenuItem(icon=" + this.icon + ", title=" + this.title + ", rightText=" + this.rightText + ", scheme=" + this.scheme + ", logInfo=" + this.logInfo + ")";
                int i2 = onExtraCallbackWithResult + 57;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 8 / 0;
                }
                return str;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                Icon icon = this.icon;
                if (icon == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    icon.writeToParcel(parcel, i);
                }
                parcel.writeString(this.title);
                parcel.writeString(this.rightText);
                parcel.writeString(this.scheme);
                LogInfo logInfo = this.logInfo;
                if (logInfo == null) {
                    int i3 = onExtraCallbackWithResult + 125;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(1);
                logInfo.writeToParcel(parcel, i);
                int i5 = onExtraCallbackWithResult + 29;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }

            public static final class Companion {
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<MenuItem> serializer() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 47;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    LoanHomeExtensive$MenuSection$MenuItem$$serializer loanHomeExtensive$MenuSection$MenuItem$$serializer = LoanHomeExtensive$MenuSection$MenuItem$$serializer.INSTANCE;
                    int i4 = IAuthTabCallback + 27;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 == 0) {
                        return loanHomeExtensive$MenuSection$MenuItem$$serializer;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }

            public /* synthetic */ MenuItem(int i, Icon icon, String str, String str2, String str3, LogInfo logInfo, okycx okycxVar) {
                if ((i & 1) == 0) {
                    this.icon = null;
                } else {
                    this.icon = icon;
                    int i2 = onExtraCallbackWithResult + 7;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    int i4 = 2 % 2;
                }
                if ((i & 2) == 0) {
                    this.title = "";
                    int i5 = onWarmupCompleted + 89;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    int i7 = 2 % 2;
                } else {
                    this.title = str;
                }
                if ((i & 4) == 0) {
                    this.rightText = null;
                } else {
                    this.rightText = str2;
                    int i8 = onExtraCallbackWithResult + 95;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                }
                int i10 = 2 % 2;
                if ((i & 8) == 0) {
                    int i11 = onExtraCallbackWithResult + 63;
                    onWarmupCompleted = i11 % 128;
                    int i12 = i11 % 2;
                    this.scheme = null;
                } else {
                    this.scheme = str3;
                }
                if ((i & 16) == 0) {
                    this.logInfo = null;
                } else {
                    this.logInfo = logInfo;
                }
            }

            public MenuItem(@Nullable Icon icon, @NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable LogInfo logInfo) {
                Intrinsics.checkNotNullParameter(str, "");
                this.icon = icon;
                this.title = str;
                this.rightText = str2;
                this.scheme = str3;
                this.logInfo = logInfo;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
            @kotlin.jvm.JvmStatic
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static final /* synthetic */ void onNavigationEvent(viva.republica.toss.network.model.loan.LoanHomeExtensive.MenuSection.MenuItem r4, o.vyl r5, kotlinx.serialization.descriptors.SerialDescriptor r6) {
                /*
                    r0 = 2
                    int r1 = r0 % r0
                    r1 = 0
                    boolean r2 = r5.onWarmupCompleted(r6, r1)
                    if (r2 != 0) goto Le
                    viva.republica.toss.network.model.loan.LoanHomeExtensive$MenuSection$Icon r2 = r4.icon
                    if (r2 == 0) goto L15
                Le:
                    viva.republica.toss.network.model.loan.LoanHomeExtensive$MenuSection$Icon$$serializer r2 = viva.republica.toss.network.model.loan.LoanHomeExtensive$MenuSection$Icon$$serializer.INSTANCE
                    viva.republica.toss.network.model.loan.LoanHomeExtensive$MenuSection$Icon r3 = r4.icon
                    r5.onExtraCallbackWithResult(r6, r1, r2, r3)
                L15:
                    r1 = 1
                    boolean r2 = r5.onWarmupCompleted(r6, r1)
                    if (r2 != 0) goto L39
                    int r2 = viva.republica.toss.network.model.loan.LoanHomeExtensive.MenuSection.MenuItem.onWarmupCompleted
                    int r2 = r2 + 21
                    int r3 = r2 % 128
                    viva.republica.toss.network.model.loan.LoanHomeExtensive.MenuSection.MenuItem.onExtraCallbackWithResult = r3
                    int r2 = r2 % r0
                    java.lang.String r3 = ""
                    if (r2 == 0) goto L32
                    java.lang.String r2 = r4.title
                    boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
                    if (r2 != 0) goto L3e
                    goto L39
                L32:
                    java.lang.String r4 = r4.title
                    kotlin.jvm.internal.Intrinsics.areEqual(r4, r3)
                    r4 = 0
                    throw r4
                L39:
                    java.lang.String r2 = r4.title
                    r5.onExtraCallback(r6, r1, r2)
                L3e:
                    boolean r1 = r5.onWarmupCompleted(r6, r0)
                    if (r1 != 0) goto L51
                    int r1 = viva.republica.toss.network.model.loan.LoanHomeExtensive.MenuSection.MenuItem.onWarmupCompleted
                    int r1 = r1 + 11
                    int r2 = r1 % 128
                    viva.republica.toss.network.model.loan.LoanHomeExtensive.MenuSection.MenuItem.onExtraCallbackWithResult = r2
                    int r1 = r1 % r0
                    java.lang.String r1 = r4.rightText
                    if (r1 == 0) goto L58
                L51:
                    o.getWriggleLayout r1 = o.getWriggleLayout.onNavigationEvent
                    java.lang.String r2 = r4.rightText
                    r5.onExtraCallbackWithResult(r6, r0, r1, r2)
                L58:
                    r1 = 3
                    boolean r2 = r5.onWarmupCompleted(r6, r1)
                    if (r2 != 0) goto L6c
                    int r2 = viva.republica.toss.network.model.loan.LoanHomeExtensive.MenuSection.MenuItem.onWarmupCompleted
                    int r2 = r2 + 117
                    int r3 = r2 % 128
                    viva.republica.toss.network.model.loan.LoanHomeExtensive.MenuSection.MenuItem.onExtraCallbackWithResult = r3
                    int r2 = r2 % r0
                    java.lang.String r0 = r4.scheme
                    if (r0 == 0) goto L73
                L6c:
                    o.getWriggleLayout r0 = o.getWriggleLayout.onNavigationEvent
                    java.lang.String r2 = r4.scheme
                    r5.onExtraCallbackWithResult(r6, r1, r0, r2)
                L73:
                    r0 = 4
                    boolean r1 = r5.onWarmupCompleted(r6, r0)
                    if (r1 != 0) goto L7e
                    viva.republica.toss.network.model.loan.LoanHomeExtensive$MenuSection$LogInfo r1 = r4.logInfo
                    if (r1 == 0) goto L85
                L7e:
                    viva.republica.toss.network.model.loan.LoanHomeExtensive$MenuSection$LogInfo$$serializer r1 = viva.republica.toss.network.model.loan.LoanHomeExtensive$MenuSection$LogInfo$$serializer.INSTANCE
                    viva.republica.toss.network.model.loan.LoanHomeExtensive$MenuSection$LogInfo r4 = r4.logInfo
                    r5.onExtraCallbackWithResult(r6, r0, r1, r4)
                L85:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanHomeExtensive.MenuSection.MenuItem.onNavigationEvent(viva.republica.toss.network.model.loan.LoanHomeExtensive$MenuSection$MenuItem, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ MenuItem(Icon icon, String str, String str2, String str3, LogInfo logInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
                String str4;
                if ((i & 1) != 0) {
                    int i2 = onWarmupCompleted + 61;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    icon = null;
                }
                if ((i & 2) != 0) {
                    int i4 = onExtraCallbackWithResult + 87;
                    int i5 = i4 % 128;
                    onWarmupCompleted = i5;
                    int i6 = i4 % 2;
                    int i7 = i5 + 107;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    int i9 = 2 % 2;
                    str = "";
                }
                String str5 = str;
                String str6 = (i & 4) != 0 ? null : str2;
                if ((i & 8) != 0) {
                    int i10 = onExtraCallbackWithResult + 23;
                    onWarmupCompleted = i10 % 128;
                    if (i10 % 2 != 0) {
                        int i11 = 31 / 0;
                    }
                    int i12 = 2 % 2;
                    str4 = null;
                } else {
                    str4 = str3;
                }
                this(icon, str5, str6, str4, (i & 16) == 0 ? logInfo : null);
            }

            public final Icon IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 75;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Icon icon = this.icon;
                if (i3 != 0) {
                    int i4 = 66 / 0;
                }
                return icon;
            }

            public final String onNavigationEvent() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 125;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    return this.title;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final String onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 125;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                String str = this.rightText;
                if (i3 != 0) {
                    int i4 = 25 / 0;
                }
                return str;
            }

            public final String onExtraCallback() {
                String str;
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 33;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                if (i2 % 2 == 0) {
                    str = this.scheme;
                    int i4 = 59 / 0;
                } else {
                    str = this.scheme;
                }
                int i5 = i3 + 15;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    return str;
                }
                throw null;
            }

            public final LogInfo onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 59;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    return this.logInfo;
                }
                throw null;
            }
        }

        @liq
        public static final class LogInfo implements Parcelable {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;
            private static int onNavigationEvent;
            private final long clickLogId;
            private final long impressionLogId;
            private final String loanStatus;
            private final Long menuEntryId;
            private final String type;
            public static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<LogInfo> CREATOR = new onExtraCallback();

            public static final class onExtraCallback implements Parcelable.Creator<LogInfo> {
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;

                public final LogInfo[] IAuthTabCallback(int i) {
                    int i2 = 2 % 2;
                    int i3 = IAuthTabCallback + 103;
                    int i4 = i3 % 128;
                    onNavigationEvent = i4;
                    int i5 = i3 % 2;
                    LogInfo[] logInfoArr = new LogInfo[i];
                    int i6 = i4 + 87;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    return logInfoArr;
                }

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ LogInfo createFromParcel(Parcel parcel) {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 41;
                    IAuthTabCallback = i2 % 128;
                    Object obj = null;
                    if (i2 % 2 == 0) {
                        onWarmupCompleted(parcel);
                        obj.hashCode();
                        throw null;
                    }
                    LogInfo logInfoOnWarmupCompleted = onWarmupCompleted(parcel);
                    int i3 = IAuthTabCallback + 81;
                    onNavigationEvent = i3 % 128;
                    if (i3 % 2 == 0) {
                        return logInfoOnWarmupCompleted;
                    }
                    throw null;
                }

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ LogInfo[] newArray(int i) {
                    int i2 = 2 % 2;
                    int i3 = IAuthTabCallback + 91;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    LogInfo[] logInfoArrIAuthTabCallback = IAuthTabCallback(i);
                    int i5 = onNavigationEvent + 5;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return logInfoArrIAuthTabCallback;
                }

                public final LogInfo onWarmupCompleted(Parcel parcel) {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 121;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    Long lValueOf = null;
                    Intrinsics.checkNotNullParameter(parcel, "");
                    if (i3 == 0) {
                        parcel.readString();
                        parcel.readString();
                        parcel.readLong();
                        parcel.readLong();
                        parcel.readInt();
                        lValueOf.hashCode();
                        throw null;
                    }
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    long j = parcel.readLong();
                    long j2 = parcel.readLong();
                    if (parcel.readInt() == 0) {
                        int i4 = onNavigationEvent + 91;
                        IAuthTabCallback = i4 % 128;
                        int i5 = i4 % 2;
                    } else {
                        lValueOf = Long.valueOf(parcel.readLong());
                    }
                    return new LogInfo(string, string2, j, j2, lValueOf);
                }
            }

            static {
                int i = IAuthTabCallback + 71;
                onNavigationEvent = i % 128;
                int i2 = i % 2;
            }

            public LogInfo() {
                this((String) null, (String) null, 0L, 0L, (Long) null, 31, (DefaultConstructorMarker) null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 83;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 75;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return 0;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 123;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LogInfo)) {
                    return false;
                }
                LogInfo logInfo = (LogInfo) obj;
                if (!Intrinsics.areEqual(this.type, logInfo.type)) {
                    int i3 = onExtraCallback + 105;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.loanStatus, logInfo.loanStatus)) {
                    int i5 = onExtraCallback + 35;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    return false;
                }
                if (this.impressionLogId != logInfo.impressionLogId) {
                    int i7 = onExtraCallback + 97;
                    onExtraCallbackWithResult = i7 % 128;
                    if (i7 % 2 == 0) {
                        return false;
                    }
                    throw null;
                }
                if (this.clickLogId == logInfo.clickLogId) {
                    return Intrinsics.areEqual(this.menuEntryId, logInfo.menuEntryId);
                }
                int i8 = onExtraCallback + 57;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }

            public int hashCode() {
                int iHashCode;
                int i = 2 % 2;
                int i2 = onExtraCallback + 3;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode2 = this.type.hashCode();
                String str = this.loanStatus;
                int iHashCode3 = 0;
                if (str == null) {
                    int i4 = onExtraCallbackWithResult + 125;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    iHashCode = 0;
                } else {
                    iHashCode = str.hashCode();
                }
                int iHashCode4 = Long.hashCode(this.impressionLogId);
                int iHashCode5 = Long.hashCode(this.clickLogId);
                Long l = this.menuEntryId;
                if (l != null) {
                    int i6 = onExtraCallback + 103;
                    onExtraCallbackWithResult = i6 % 128;
                    if (i6 % 2 != 0) {
                        l.hashCode();
                        throw null;
                    }
                    iHashCode3 = l.hashCode();
                }
                return (((((((iHashCode2 * 31) + iHashCode) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode3;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "LogInfo(type=" + this.type + ", loanStatus=" + this.loanStatus + ", impressionLogId=" + this.impressionLogId + ", clickLogId=" + this.clickLogId + ", menuEntryId=" + this.menuEntryId + ")";
                int i2 = onExtraCallback + 71;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x004d, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x004e, code lost:
            
                r4.writeInt(1);
                r4.writeLong(r0.longValue());
                r4 = viva.republica.toss.network.model.loan.LoanHomeExtensive.MenuSection.LogInfo.onExtraCallback + 21;
                viva.republica.toss.network.model.loan.LoanHomeExtensive.MenuSection.LogInfo.onExtraCallbackWithResult = r4 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0062, code lost:
            
                if ((r4 % 2) == 0) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0064, code lost:
            
                r4 = 44 / 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0067, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x002c, code lost:
            
                if (r0 == null) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0048, code lost:
            
                if (r0 == null) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x004a, code lost:
            
                r4.writeInt(0);
             */
            @Override // android.os.Parcelable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel r4, int r5) {
                /*
                    r3 = this;
                    r5 = 2
                    int r0 = r5 % r5
                    int r0 = viva.republica.toss.network.model.loan.LoanHomeExtensive.MenuSection.LogInfo.onExtraCallbackWithResult
                    int r0 = r0 + 89
                    int r1 = r0 % 128
                    viva.republica.toss.network.model.loan.LoanHomeExtensive.MenuSection.LogInfo.onExtraCallback = r1
                    int r0 = r0 % r5
                    java.lang.String r1 = ""
                    r2 = 0
                    if (r0 != 0) goto L2f
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)
                    java.lang.String r0 = r3.type
                    r4.writeString(r0)
                    java.lang.String r0 = r3.loanStatus
                    r4.writeString(r0)
                    long r0 = r3.impressionLogId
                    r4.writeLong(r0)
                    long r0 = r3.clickLogId
                    r4.writeLong(r0)
                    java.lang.Long r0 = r3.menuEntryId
                    r1 = 4
                    int r1 = r1 / r2
                    if (r0 != 0) goto L4e
                    goto L4a
                L2f:
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)
                    java.lang.String r0 = r3.type
                    r4.writeString(r0)
                    java.lang.String r0 = r3.loanStatus
                    r4.writeString(r0)
                    long r0 = r3.impressionLogId
                    r4.writeLong(r0)
                    long r0 = r3.clickLogId
                    r4.writeLong(r0)
                    java.lang.Long r0 = r3.menuEntryId
                    if (r0 != 0) goto L4e
                L4a:
                    r4.writeInt(r2)
                    return
                L4e:
                    r1 = 1
                    r4.writeInt(r1)
                    long r0 = r0.longValue()
                    r4.writeLong(r0)
                    int r4 = viva.republica.toss.network.model.loan.LoanHomeExtensive.MenuSection.LogInfo.onExtraCallback
                    int r4 = r4 + 21
                    int r0 = r4 % 128
                    viva.republica.toss.network.model.loan.LoanHomeExtensive.MenuSection.LogInfo.onExtraCallbackWithResult = r0
                    int r4 = r4 % r5
                    if (r4 == 0) goto L67
                    r4 = 44
                    int r4 = r4 / r2
                L67:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanHomeExtensive.MenuSection.LogInfo.writeToParcel(android.os.Parcel, int):void");
            }

            public static final class Companion {
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<LogInfo> serializer() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 87;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    LoanHomeExtensive$MenuSection$LogInfo$$serializer loanHomeExtensive$MenuSection$LogInfo$$serializer = LoanHomeExtensive$MenuSection$LogInfo$$serializer.INSTANCE;
                    if (i3 == 0) {
                        return loanHomeExtensive$MenuSection$LogInfo$$serializer;
                    }
                    throw null;
                }
            }

            public /* synthetic */ LogInfo(int i, String str, String str2, long j, long j2, Long l, okycx okycxVar) {
                this.type = (i & 1) == 0 ? "" : str;
                if ((i & 2) == 0) {
                    int i2 = onExtraCallbackWithResult + 65;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    this.loanStatus = null;
                    if (i3 == 0) {
                        throw null;
                    }
                } else {
                    this.loanStatus = str2;
                }
                if ((i & 4) == 0) {
                    this.impressionLogId = -1L;
                } else {
                    this.impressionLogId = j;
                }
                int i4 = 2 % 2;
                if ((i & 8) == 0) {
                    this.clickLogId = -1L;
                } else {
                    this.clickLogId = j2;
                    int i5 = onExtraCallbackWithResult + 29;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    int i7 = 2 % 2;
                }
                if ((i & 16) == 0) {
                    this.menuEntryId = null;
                } else {
                    this.menuEntryId = l;
                }
            }

            public LogInfo(@NotNull String str, @Nullable String str2, long j, long j2, @Nullable Long l) {
                Intrinsics.checkNotNullParameter(str, "");
                this.type = str;
                this.loanStatus = str2;
                this.impressionLogId = j;
                this.clickLogId = j2;
                this.menuEntryId = l;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
            @kotlin.jvm.JvmStatic
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static final /* synthetic */ void onExtraCallback(viva.republica.toss.network.model.loan.LoanHomeExtensive.MenuSection.LogInfo r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
                /*
                    r0 = 2
                    int r1 = r0 % r0
                    r1 = 0
                    boolean r2 = r7.onWarmupCompleted(r8, r1)
                    if (r2 != 0) goto L14
                    java.lang.String r2 = r6.type
                    java.lang.String r3 = ""
                    boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
                    if (r2 != 0) goto L19
                L14:
                    java.lang.String r2 = r6.type
                    r7.onExtraCallback(r8, r1, r2)
                L19:
                    r1 = 1
                    boolean r2 = r7.onWarmupCompleted(r8, r1)
                    if (r2 != 0) goto L2d
                    int r2 = viva.republica.toss.network.model.loan.LoanHomeExtensive.MenuSection.LogInfo.onExtraCallback
                    int r2 = r2 + 27
                    int r3 = r2 % 128
                    viva.republica.toss.network.model.loan.LoanHomeExtensive.MenuSection.LogInfo.onExtraCallbackWithResult = r3
                    int r2 = r2 % r0
                    java.lang.String r2 = r6.loanStatus
                    if (r2 == 0) goto L34
                L2d:
                    o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
                    java.lang.String r3 = r6.loanStatus
                    r7.onExtraCallbackWithResult(r8, r1, r2, r3)
                L34:
                    boolean r1 = r7.onWarmupCompleted(r8, r0)
                    r2 = -1
                    if (r1 != 0) goto L42
                    long r4 = r6.impressionLogId
                    int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                    if (r1 == 0) goto L47
                L42:
                    long r4 = r6.impressionLogId
                    r7.onExtraCallback(r8, r0, r4)
                L47:
                    r1 = 3
                    boolean r4 = r7.onWarmupCompleted(r8, r1)
                    if (r4 != 0) goto L5d
                    int r4 = viva.republica.toss.network.model.loan.LoanHomeExtensive.MenuSection.LogInfo.onExtraCallbackWithResult
                    int r4 = r4 + 105
                    int r5 = r4 % 128
                    viva.republica.toss.network.model.loan.LoanHomeExtensive.MenuSection.LogInfo.onExtraCallback = r5
                    int r4 = r4 % r0
                    long r4 = r6.clickLogId
                    int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                    if (r2 == 0) goto L62
                L5d:
                    long r2 = r6.clickLogId
                    r7.onExtraCallback(r8, r1, r2)
                L62:
                    r1 = 4
                    boolean r2 = r7.onWarmupCompleted(r8, r1)
                    if (r2 != 0) goto L6d
                    java.lang.Long r2 = r6.menuEntryId
                    if (r2 == 0) goto L74
                L6d:
                    o.oty1 r2 = o.oty1.onExtraCallback
                    java.lang.Long r6 = r6.menuEntryId
                    r7.onExtraCallbackWithResult(r8, r1, r2, r6)
                L74:
                    int r6 = viva.republica.toss.network.model.loan.LoanHomeExtensive.MenuSection.LogInfo.onExtraCallbackWithResult
                    int r6 = r6 + 111
                    int r7 = r6 % 128
                    viva.republica.toss.network.model.loan.LoanHomeExtensive.MenuSection.LogInfo.onExtraCallback = r7
                    int r6 = r6 % r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanHomeExtensive.MenuSection.LogInfo.onExtraCallback(viva.republica.toss.network.model.loan.LoanHomeExtensive$MenuSection$LogInfo, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ LogInfo(String str, String str2, long j, long j2, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
                String str3;
                long j3;
                if ((i & 1) != 0) {
                    int i2 = onExtraCallbackWithResult + 103;
                    onExtraCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 2 % 2;
                    }
                    str = "";
                }
                if ((i & 2) != 0) {
                    int i4 = 2 % 2;
                    str3 = null;
                } else {
                    str3 = str2;
                }
                long j4 = -1;
                if ((i & 4) != 0) {
                    int i5 = onExtraCallback + 39;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    int i7 = 2 % 2;
                    j3 = -1;
                } else {
                    j3 = j;
                }
                if ((i & 8) != 0) {
                    int i8 = onExtraCallbackWithResult + 1;
                    onExtraCallback = i8 % 128;
                    if (i8 % 2 == 0) {
                        l.hashCode();
                        throw null;
                    }
                } else {
                    j4 = j2;
                }
                this(str, str3, j3, j4, (i & 16) == 0 ? l : null);
            }

            public final String IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 31;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                String str = this.type;
                if (i3 != 0) {
                    int i4 = 0 / 0;
                }
                return str;
            }

            public final String onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 95;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                int i4 = i2 % 2;
                String str = this.loanStatus;
                int i5 = i3 + 61;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    return str;
                }
                throw null;
            }

            public final long onNavigationEvent() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 69;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                long j = this.impressionLogId;
                int i5 = i2 + 101;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return j;
                }
                throw null;
            }

            public final long onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onExtraCallback;
                int i3 = i2 + 63;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                long j = this.clickLogId;
                int i5 = i2 + 115;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    return j;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final Long onExtraCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 83;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return this.menuEntryId;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
            int i7 = ~i3;
            int i8 = ~i2;
            int i9 = (~(i7 | i)) | (~(i7 | i8));
            int i10 = ~i;
            int i11 = (~(i2 | i10 | i3)) | i9;
            int i12 = ~(i8 | i10);
            int i13 = i + i3 + i6 + ((-1228711472) * i4) + ((-141981132) * i5);
            int i14 = i13 * i13;
            int i15 = (((-639131287) * i) - 2072313856) + (1118068377 * i3) + (i11 * (-1268883816)) + ((-1757199664) * i9) + ((-1268883816) * i12) + ((-1908015104) * i6) + ((-287309824) * i4) + ((-1573388288) * i5) + ((-2138374144) * i14);
            int i16 = ((i * (-646461497)) - 273503129) + (i3 * (-646460521)) + (i11 * 488) + (i9 * (-976)) + (i12 * 488) + (i6 * (-646461009)) + (i4 * 1623110960) + (i5 * (-2035004020)) + (i14 * 33882112);
            if (i15 + (i16 * i16 * (-1051394048)) == 1) {
                return onWarmupCompleted(objArr);
            }
            int i17 = 2 % 2;
            int i18 = onNavigationEvent + 91;
            onExtraCallback = i18 % 128;
            int i19 = i18 % 2;
            KSerializer kSerializerAsInterface = asInterface();
            int i20 = onExtraCallback + 47;
            onNavigationEvent = i20 % 128;
            int i21 = i20 % 2;
            return kSerializerAsInterface;
        }

        public static /* synthetic */ KSerializer IAuthTabCallback() {
            return (KSerializer) onWarmupCompleted(1283855117, new Object[0], setVisitUrl.onExtraCallbackWithResult(), -1283855117, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return ((Integer) onWarmupCompleted(1834521267, new Object[]{this}, setVisitUrl.onExtraCallbackWithResult(), -1834521266, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue();
        }
    }
}
