package viva.republica.toss.network.model.plcc.benefit;

import im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$;
import im.toss.tds.view.component.atom.badge.TdsBadgeV1View;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.EncryptedContentInfoParser;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access15300;
import o.checkCanOpenLandingPage;
import o.getKekid;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp;
import viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$;
import viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$PlccBadge$;
import viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$PlccProgressBar$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PlccBenefitInfoResp {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final PlccBadge badge;
    private final List<PlccBenefitGroup> benefitGroups;
    private final String cancelDescription;
    private final long cardId;
    private final List<PlccSpentTxItem> effectiveSpentTxList;
    private final String headerSubTitle;
    private final String headerTitle;
    private final PlccProgressBar progressBar;
    private final long spentAmount;
    private final String useRegisteredMonth;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public PlccBenefitInfoResp() {
        this(0L, 0L, (String) null, (String) null, (String) null, (PlccBadge) null, (PlccProgressBar) null, (List) null, (List) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    private static final /* synthetic */ KSerializer access000() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(PlccBenefitInfoResp$PlccSpentTxItem$$serializer.INSTANCE);
        int i2 = onNavigationEvent + 81;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 90 / 0;
        }
        return checkcanopenlandingpage;
    }

    private static final /* synthetic */ KSerializer getInterfaceDescriptor() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(PlccBenefitInfoResp$PlccBenefitGroup$$serializer.INSTANCE);
        int i2 = onNavigationEvent + 25;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 60 / 0;
        }
        return checkcanopenlandingpage;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            getInterfaceDescriptor();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer interfaceDescriptor = getInterfaceDescriptor();
        int i3 = onNavigationEvent + 99;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return interfaceDescriptor;
    }

    public static /* synthetic */ Object onNavigationEvent(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i5;
        int i9 = ~(i7 | i8);
        int i10 = ~(i7 | i5);
        int i11 = ~i;
        int i12 = (~(i8 | i11 | i2)) | i10;
        int i13 = (~(i5 | i11)) | (~(i7 | i11));
        int i14 = i2 + i + i3 + (1941422536 * i4) + ((-555707305) * i6);
        int i15 = i14 * i14;
        int i16 = (i2 * (-2131549542)) + 177471488 + ((-2131549542) * i) + (i9 * (-207299225)) + (i12 * (-207299225)) + ((-207299225) * i13) + (1956118528 * i3) + ((-1363148800) * i4) + (2141716480 * i6) + ((-573308928) * i15);
        int i17 = ((i2 * 487360618) - 1291405921) + (i * 487360618) + (i9 * 543) + (i12 * 543) + (i13 * 543) + (i3 * 487361161) + (i4 * (-1188264952)) + (i6 * 624576655) + (i15 * (-25952256));
        int i18 = i16 + (i17 * i17 * 74186752);
        return i18 != 1 ? i18 != 2 ? onExtraCallback(objArr) : onNavigationEvent(objArr) : onWarmupCompleted(objArr);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            access000();
            throw null;
        }
        KSerializer kSerializerAccess000 = access000();
        int i3 = onNavigationEvent + 3;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 4 / 0;
        }
        return kSerializerAccess000;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 23;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof PlccBenefitInfoResp)) {
            int i4 = onWarmupCompleted + 109;
            onNavigationEvent = i4 % 128;
            return i4 % 2 == 0;
        }
        PlccBenefitInfoResp plccBenefitInfoResp = (PlccBenefitInfoResp) obj;
        if (this.cardId != plccBenefitInfoResp.cardId) {
            return false;
        }
        if (this.spentAmount != plccBenefitInfoResp.spentAmount) {
            int i5 = onWarmupCompleted + 29;
            onNavigationEvent = i5 % 128;
            return i5 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.headerTitle, plccBenefitInfoResp.headerTitle)) {
            int i6 = onNavigationEvent + 83;
            onWarmupCompleted = i6 % 128;
            return i6 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.headerSubTitle, plccBenefitInfoResp.headerSubTitle)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.useRegisteredMonth, plccBenefitInfoResp.useRegisteredMonth)) {
            int i7 = onWarmupCompleted + 125;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.badge, plccBenefitInfoResp.badge)) {
            int i9 = onNavigationEvent + 43;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.progressBar, plccBenefitInfoResp.progressBar)) {
            return Intrinsics.areEqual(this.benefitGroups, plccBenefitInfoResp.benefitGroups) && !(Intrinsics.areEqual(this.effectiveSpentTxList, plccBenefitInfoResp.effectiveSpentTxList) ^ true) && Intrinsics.areEqual(this.cancelDescription, plccBenefitInfoResp.cancelDescription);
        }
        int i11 = onWarmupCompleted;
        int i12 = i11 + 111;
        onNavigationEvent = i12 % 128;
        int i13 = i12 % 2;
        int i14 = i11 + 113;
        onNavigationEvent = i14 % 128;
        int i15 = i14 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode3 = Long.hashCode(this.cardId);
        int iHashCode4 = Long.hashCode(this.spentAmount);
        int iHashCode5 = this.headerTitle.hashCode();
        String str = this.headerSubTitle;
        int iHashCode6 = 0;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        int iHashCode8 = this.useRegisteredMonth.hashCode();
        PlccBadge plccBadge = this.badge;
        if (plccBadge == null) {
            int i4 = onWarmupCompleted + 77;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = plccBadge.hashCode();
            int i6 = onNavigationEvent + 73;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
        }
        PlccProgressBar plccProgressBar = this.progressBar;
        if (plccProgressBar == null) {
            int i8 = onNavigationEvent + 105;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = plccProgressBar.hashCode();
        }
        int iHashCode9 = this.benefitGroups.hashCode();
        int iHashCode10 = this.effectiveSpentTxList.hashCode();
        String str2 = this.cancelDescription;
        if (str2 != null) {
            iHashCode6 = str2.hashCode();
            int i10 = onWarmupCompleted + 63;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
        }
        return (((((((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode6;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PlccBenefitInfoResp(cardId=" + this.cardId + ", spentAmount=" + this.spentAmount + ", headerTitle=" + this.headerTitle + ", headerSubTitle=" + this.headerSubTitle + ", useRegisteredMonth=" + this.useRegisteredMonth + ", badge=" + this.badge + ", progressBar=" + this.progressBar + ", benefitGroups=" + this.benefitGroups + ", effectiveSpentTxList=" + this.effectiveSpentTxList + ", cancelDescription=" + this.cancelDescription + ")";
        int i2 = onWarmupCompleted + 87;
        onNavigationEvent = i2 % 128;
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

        public final KSerializer<PlccBenefitInfoResp> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 87;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            PlccBenefitInfoResp$.serializer serializerVar = PlccBenefitInfoResp$.serializer.INSTANCE;
            if (i3 == 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{null, null, null, null, null, null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 37;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializer = (KSerializer) PlccBenefitInfoResp.onNavigationEvent(new Object[0], -1032373837, 1032373839, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
                int i4 = onWarmupCompleted + 97;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return kSerializer;
                }
                throw null;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 75;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = new Object[0];
                int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult4 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
                if (i3 == 0) {
                    throw null;
                }
                KSerializer kSerializer = (KSerializer) PlccBenefitInfoResp.onNavigationEvent(objArr, 139811926, -139811925, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult4);
                int i4 = IAuthTabCallback + 119;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return kSerializer;
            }
        }), null};
        int i = onExtraCallback + 77;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ PlccBenefitInfoResp(int r9, long r10, long r12, java.lang.String r14, java.lang.String r15, java.lang.String r16, viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccBadge r17, viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccProgressBar r18, java.util.List r19, java.util.List r20, java.lang.String r21, o.okycx r22) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.<init>(int, long, long, java.lang.String, java.lang.String, java.lang.String, viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$PlccBadge, viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$PlccProgressBar, java.util.List, java.util.List, java.lang.String, o.okycx):void");
    }

    public PlccBenefitInfoResp(long j, long j2, @NotNull String str, @Nullable String str2, @NotNull String str3, @Nullable PlccBadge plccBadge, @Nullable PlccProgressBar plccProgressBar, @NotNull List<PlccBenefitGroup> list, @NotNull List<PlccSpentTxItem> list2, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.cardId = j;
        this.spentAmount = j2;
        this.headerTitle = str;
        this.headerSubTitle = str2;
        this.useRegisteredMonth = str3;
        this.badge = plccBadge;
        this.progressBar = plccProgressBar;
        this.benefitGroups = list;
        this.effectiveSpentTxList = list2;
        this.cancelDescription = str4;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onNavigationEvent(viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp r8, o.vyl r9, kotlinx.serialization.descriptors.SerialDescriptor r10) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.onNavigationEvent(viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public static final /* synthetic */ Lazy[] onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 73;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 1;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return lazyArr;
        }
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PlccBenefitInfoResp(long j, long j2, String str, String str2, String str3, PlccBadge plccBadge, PlccProgressBar plccProgressBar, List list, List list2, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long j3;
        String str5;
        PlccBadge plccBadge2;
        PlccProgressBar plccProgressBar2;
        long j4 = 0;
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 99;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 83;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            j3 = 0;
        } else {
            j3 = j;
        }
        if ((i & 2) != 0) {
            int i7 = 2 % 2;
        } else {
            j4 = j2;
        }
        if ((i & 4) != 0) {
            int i8 = 2 % 2;
            str5 = "";
        } else {
            str5 = str;
        }
        String str6 = (i & 8) != 0 ? null : str2;
        String str7 = (i & 16) == 0 ? str3 : "";
        if ((i & 32) != 0) {
            int i9 = onWarmupCompleted + 83;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            plccBadge2 = null;
        } else {
            plccBadge2 = plccBadge;
        }
        if ((i & 64) != 0) {
            int i11 = onNavigationEvent + 91;
            onWarmupCompleted = i11 % 128;
            int i12 = i11 % 2;
            plccProgressBar2 = null;
        } else {
            plccProgressBar2 = plccProgressBar;
        }
        this(j3, j4, str5, str6, str7, plccBadge2, plccProgressBar2, (i & 128) != 0 ? CollectionsKt.emptyList() : list, (i & 256) != 0 ? CollectionsKt.emptyList() : list2, (i & 512) == 0 ? str4 : null);
    }

    public final long asInterface() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.cardId;
        }
        int i3 = 22 / 0;
        return this.cardId;
    }

    public final long IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 19;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        long j = this.spentAmount;
        int i5 = i2 + 37;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.headerTitle;
        int i5 = i3 + 47;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.useRegisteredMonth;
        int i5 = i3 + 77;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 50 / 0;
        }
        return str;
    }

    public final PlccBadge onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        PlccBadge plccBadge = this.badge;
        if (i3 == 0) {
            int i4 = 99 / 0;
        }
        return plccBadge;
    }

    public final PlccProgressBar asBinder() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 99;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        PlccProgressBar plccProgressBar = this.progressBar;
        int i5 = i2 + 87;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return plccProgressBar;
    }

    public final List<PlccBenefitGroup> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.benefitGroups;
        }
        throw null;
    }

    public final List<PlccSpentTxItem> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 91;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        List<PlccSpentTxItem> list = this.effectiveSpentTxList;
        int i4 = i2 + 71;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    @liq
    public static final class PlccBadge {
        public static final int $stable = 0;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final IAuthTabCallback color;
        private final String text;
        public static final Companion Companion = new Companion(null);
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$PlccBadge$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 59;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return PlccBenefitInfoResp.PlccBadge.IAuthTabCallback();
                }
                PlccBenefitInfoResp.PlccBadge.IAuthTabCallback();
                throw null;
            }
        })};

        /* JADX WARN: Multi-variable type inference failed */
        public PlccBadge() {
            this((String) null, (IAuthTabCallback) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ KSerializer IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 109;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallback = onExtraCallback();
            int i4 = IAuthTabCallback + 11;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return kSerializerOnExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final /* synthetic */ KSerializer onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 105;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccBadge.PlccBadgeColorType", IAuthTabCallback.values());
            int i4 = IAuthTabCallback + 33;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 86 / 0;
            }
            return kSerializerOnExtraCallbackWithResult;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlccBadge)) {
                return false;
            }
            PlccBadge plccBadge = (PlccBadge) obj;
            if (!Intrinsics.areEqual(this.text, plccBadge.text)) {
                int i2 = IAuthTabCallback + 71;
                onExtraCallback = i2 % 128;
                return i2 % 2 != 0;
            }
            if (this.color != plccBadge.color) {
                int i3 = IAuthTabCallback;
                int i4 = i3 + 63;
                onExtraCallback = i4 % 128;
                z = i4 % 2 != 0;
                int i5 = i3 + 71;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 86 / 0;
                }
            }
            return z;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 123;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (this.text.hashCode() * 31) + this.color.hashCode();
            int i4 = onExtraCallback + 57;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "PlccBadge(text=" + this.text + ", color=" + this.color + ")";
            int i2 = onExtraCallback + 101;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 32 / 0;
            }
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

            public final KSerializer<PlccBadge> serializer() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 91;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                PlccBenefitInfoResp$PlccBadge$.serializer serializerVar = PlccBenefitInfoResp$PlccBadge$.serializer.INSTANCE;
                int i4 = IAuthTabCallback + 89;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return serializerVar;
            }
        }

        static {
            int i = onWarmupCompleted + 57;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                int i2 = 89 / 0;
            }
        }

        public /* synthetic */ PlccBadge(int i, String str, IAuthTabCallback iAuthTabCallback, okycx okycxVar) {
            if ((i & 1) == 0) {
                int i2 = IAuthTabCallback + 51;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 % 2;
                }
                str = "";
            }
            this.text = str;
            if ((i & 2) != 0) {
                this.color = iAuthTabCallback;
                return;
            }
            this.color = IAuthTabCallback.BLUE;
            int i4 = IAuthTabCallback + 31;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        public PlccBadge(@NotNull String str, @NotNull IAuthTabCallback iAuthTabCallback) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            this.text = str;
            this.color = iAuthTabCallback;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[PHI: r1
          0x002b: PHI (r1v7 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
          (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v8 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
         binds: [B:8:0x001f, B:10:0x0029, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r1
          0x0021: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
          (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v8 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
         binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void onNavigationEvent(viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccBadge r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
            /*
                r0 = 2
                int r1 = r0 % r0
                int r1 = viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccBadge.IAuthTabCallback
                int r1 = r1 + 79
                int r2 = r1 % 128
                viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccBadge.onExtraCallback = r2
                int r1 = r1 % r0
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L19
                kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccBadge.$childSerializers
                boolean r4 = r7.onWarmupCompleted(r8, r3)
                if (r4 != 0) goto L2b
                goto L21
            L19:
                kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccBadge.$childSerializers
                boolean r4 = r7.onWarmupCompleted(r8, r3)
                if (r4 == r2) goto L2b
            L21:
                java.lang.String r4 = r6.text
                java.lang.String r5 = ""
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r5)
                if (r4 != 0) goto L30
            L2b:
                java.lang.String r4 = r6.text
                r7.onExtraCallback(r8, r3, r4)
            L30:
                boolean r4 = r7.onWarmupCompleted(r8, r2)
                if (r4 != 0) goto L4f
                int r4 = viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccBadge.IAuthTabCallback
                int r4 = r4 + 55
                int r5 = r4 % 128
                viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccBadge.onExtraCallback = r5
                int r4 = r4 % r0
                viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$PlccBadge$IAuthTabCallback r0 = r6.color
                if (r4 == 0) goto L4b
                viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$PlccBadge$IAuthTabCallback r4 = viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccBadge.IAuthTabCallback.BLUE
                r5 = 58
                int r5 = r5 / r3
                if (r0 == r4) goto L5c
                goto L4f
            L4b:
                viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$PlccBadge$IAuthTabCallback r3 = viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccBadge.IAuthTabCallback.BLUE
                if (r0 == r3) goto L5c
            L4f:
                r0 = r1[r2]
                java.lang.Object r0 = r0.getValue()
                o.py r0 = (o.py) r0
                viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$PlccBadge$IAuthTabCallback r6 = r6.color
                r7.onNavigationEvent(r8, r2, r0, r6)
            L5c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccBadge.onNavigationEvent(viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$PlccBadge, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        public static final /* synthetic */ Lazy[] onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 69;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return $childSerializers;
            }
            throw null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ PlccBadge(String str, IAuthTabCallback iAuthTabCallback, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = IAuthTabCallback + 7;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 % 2;
                }
                str = "";
            }
            if ((i & 2) != 0) {
                iAuthTabCallback = IAuthTabCallback.BLUE;
                int i4 = IAuthTabCallback + 101;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            }
            this(str, iAuthTabCallback);
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 93;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            String str = this.text;
            int i5 = i2 + 111;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class IAuthTabCallback {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ IAuthTabCallback[] $VALUES;
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;
            public static final IAuthTabCallback BLUE = new IAuthTabCallback("BLUE", 0);
            public static final IAuthTabCallback TEAL = new IAuthTabCallback("TEAL", 1);
            public static final IAuthTabCallback GREEN = new IAuthTabCallback("GREEN", 2);
            public static final IAuthTabCallback RED = new IAuthTabCallback("RED", 3);
            public static final IAuthTabCallback YELLOW = new IAuthTabCallback("YELLOW", 4);
            public static final IAuthTabCallback ELEPHANT = new IAuthTabCallback("ELEPHANT", 5);

            private static final /* synthetic */ IAuthTabCallback[] $values() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 105;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                IAuthTabCallback[] iAuthTabCallbackArr = {BLUE, TEAL, GREEN, RED, YELLOW, ELEPHANT};
                int i5 = i2 + 85;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return iAuthTabCallbackArr;
                }
                throw null;
            }

            public static EnumEntries<IAuthTabCallback> getEntries() {
                EnumEntries<IAuthTabCallback> enumEntries;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 27;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                if (i2 % 2 == 0) {
                    enumEntries = $ENTRIES;
                    int i4 = 69 / 0;
                } else {
                    enumEntries = $ENTRIES;
                }
                int i5 = i3 + 5;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return enumEntries;
            }

            public static IAuthTabCallback valueOf(String str) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 11;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
                if (i3 == 0) {
                    int i4 = 6 / 0;
                }
                int i5 = IAuthTabCallback + 123;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return iAuthTabCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static IAuthTabCallback[] values() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 3;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                IAuthTabCallback[] iAuthTabCallbackArr = (IAuthTabCallback[]) $VALUES.clone();
                int i4 = IAuthTabCallback + 67;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return iAuthTabCallbackArr;
            }

            private IAuthTabCallback(String str, int i) {
            }

            static {
                IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
                $VALUES = iAuthTabCallbackArr$values;
                $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
                int i = onWarmupCompleted + 99;
                onNavigationEvent = i % 128;
                int i2 = i % 2;
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final TdsBadgeV1View.onWarmupCompleted onNavigationEvent() throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 103;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                switch (onExtraCallbackWithResult.$EnumSwitchMapping$0[this.color.ordinal()]) {
                    case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                        return TdsBadgeV1View.onWarmupCompleted.BLUE;
                    case 2:
                        return TdsBadgeV1View.onWarmupCompleted.TEAL;
                    case 3:
                        return TdsBadgeV1View.onWarmupCompleted.GREEN;
                    case 4:
                        TdsBadgeV1View.onWarmupCompleted onwarmupcompleted = TdsBadgeV1View.onWarmupCompleted.RED;
                        int i3 = onExtraCallback + 45;
                        IAuthTabCallback = i3 % 128;
                        if (i3 % 2 != 0) {
                            return onwarmupcompleted;
                        }
                        throw null;
                    case 5:
                        return TdsBadgeV1View.onWarmupCompleted.YELLOW;
                    case 6:
                        return TdsBadgeV1View.onWarmupCompleted.ELEPHANT;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            int i4 = onExtraCallbackWithResult.$EnumSwitchMapping$0[this.color.ordinal()];
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        PlccBenefitInfoResp plccBenefitInfoResp = (PlccBenefitInfoResp) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 61;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = plccBenefitInfoResp.cancelDescription;
        int i5 = i2 + 3;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        return (KSerializer) onNavigationEvent(new Object[0], -1032373837, 1032373839, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        return (KSerializer) onNavigationEvent(new Object[0], 139811926, -139811925, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
    }

    public final String IAuthTabCallbackDefault() {
        return (String) onNavigationEvent(new Object[]{this}, -1881522443, 1881522443, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
    }

    @liq
    public static final class PlccProgressBar {
        public static final int $stable = 0;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;
        private final String color;
        private final String description;
        private final String leftValue;
        private final String rightValue;
        private final long targetSpentAmount;
        private final onExtraCallbackWithResult type;
        public static final Companion Companion = new Companion(null);
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$PlccProgressBar$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 75;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    PlccBenefitInfoResp.PlccProgressBar.onNavigationEvent();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                KSerializer kSerializerOnNavigationEvent = PlccBenefitInfoResp.PlccProgressBar.onNavigationEvent();
                int i3 = onExtraCallback + 123;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return kSerializerOnNavigationEvent;
            }
        }), null, null, null, null, null};

        public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
            int i7 = ~i4;
            int i8 = ~i6;
            int i9 = ~(i7 | i8);
            int i10 = ~(i3 | i6);
            int i11 = i9 | i10;
            int i12 = ~i3;
            int i13 = i9 | (~(i12 | i4)) | i10;
            int i14 = (~(i6 | i3 | i4)) | (~(i7 | i12 | i8));
            int i15 = i3 + i4 + i5 + (1322235619 * i2) + (440487356 * i);
            int i16 = i15 * i15;
            int i17 = (((-1102165783) * i3) - 2100690944) + ((-281430247) * i4) + ((-820735536) * i11) + (i13 * 410367768) + (410367768 * i14) + ((-691798016) * i5) + ((-942931968) * i2) + ((-1410334720) * i) + (1251606528 * i16);
            int i18 = (i3 * 157034417) + 1376579869 + (i4 * 157036385) + (i11 * (-1968)) + (i13 * 984) + (i14 * 984) + (i5 * 157035401) + (i2 * (-982187909)) + (i * (-1869533796)) + (i16 * (-899022848));
            return i17 + ((i18 * i18) * (-511311872)) != 1 ? onExtraCallback(objArr) : IAuthTabCallback(objArr);
        }

        private static final /* synthetic */ KSerializer asInterface() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 75;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccProgressBar.PlccProgressType", onExtraCallbackWithResult.values());
            int i4 = onExtraCallback + 109;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnExtraCallbackWithResult;
        }

        public static /* synthetic */ KSerializer onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 33;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerAsInterface = asInterface();
            int i4 = onWarmupCompleted + 115;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return kSerializerAsInterface;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onWarmupCompleted + 75;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return true;
                }
                throw null;
            }
            if (!(obj instanceof PlccProgressBar)) {
                int i3 = onExtraCallback + 107;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            PlccProgressBar plccProgressBar = (PlccProgressBar) obj;
            if (this.type != plccProgressBar.type) {
                return false;
            }
            if (!Intrinsics.areEqual(this.color, plccProgressBar.color)) {
                int i5 = onExtraCallback + 39;
                onWarmupCompleted = i5 % 128;
                return !(i5 % 2 == 0);
            }
            if (this.targetSpentAmount != plccProgressBar.targetSpentAmount || !Intrinsics.areEqual(this.description, plccProgressBar.description) || !Intrinsics.areEqual(this.leftValue, plccProgressBar.leftValue)) {
                return false;
            }
            if (Intrinsics.areEqual(this.rightValue, plccProgressBar.rightValue)) {
                return true;
            }
            int i6 = onWarmupCompleted + 39;
            onExtraCallback = i6 % 128;
            return i6 % 2 == 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0040 A[PHI: r1 r3 r4 r5 r6
          0x0040: PHI (r1v18 int) = (r1v5 int), (r1v20 int) binds: [B:8:0x003c, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
          0x0040: PHI (r3v5 int) = (r3v1 int), (r3v7 int) binds: [B:8:0x003c, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
          0x0040: PHI (r4v4 int) = (r4v1 int), (r4v6 int) binds: [B:8:0x003c, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
          0x0040: PHI (r5v3 java.lang.String) = (r5v0 java.lang.String), (r5v5 java.lang.String) binds: [B:8:0x003c, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
          0x0040: PHI (r6v5 int) = (r6v0 int), (r6v6 int) binds: [B:8:0x003c, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x003e A[PHI: r1 r3 r4 r6
          0x003e: PHI (r1v6 int) = (r1v5 int), (r1v20 int) binds: [B:8:0x003c, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
          0x003e: PHI (r3v2 int) = (r3v1 int), (r3v7 int) binds: [B:8:0x003c, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
          0x003e: PHI (r4v2 int) = (r4v1 int), (r4v6 int) binds: [B:8:0x003c, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
          0x003e: PHI (r6v1 int) = (r6v0 int), (r6v6 int) binds: [B:8:0x003c, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int hashCode() {
            /*
                r9 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccProgressBar.onExtraCallback
                int r1 = r1 + 55
                int r2 = r1 % 128
                viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccProgressBar.onWarmupCompleted = r2
                int r1 = r1 % r0
                r2 = 0
                if (r1 == 0) goto L27
                viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$PlccProgressBar$onExtraCallbackWithResult r1 = r9.type
                int r1 = r1.hashCode()
                java.lang.String r3 = r9.color
                int r3 = r3.hashCode()
                long r4 = r9.targetSpentAmount
                int r4 = java.lang.Long.hashCode(r4)
                java.lang.String r5 = r9.description
                r6 = 1
                if (r5 != 0) goto L40
                goto L3e
            L27:
                viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$PlccProgressBar$onExtraCallbackWithResult r1 = r9.type
                int r1 = r1.hashCode()
                java.lang.String r3 = r9.color
                int r3 = r3.hashCode()
                long r4 = r9.targetSpentAmount
                int r4 = java.lang.Long.hashCode(r4)
                java.lang.String r5 = r9.description
                r6 = r2
                if (r5 != 0) goto L40
            L3e:
                r5 = r2
                goto L44
            L40:
                int r5 = r5.hashCode()
            L44:
                java.lang.String r7 = r9.leftValue
                if (r7 != 0) goto L49
                goto L4d
            L49:
                int r2 = r7.hashCode()
            L4d:
                java.lang.String r7 = r9.rightValue
                if (r7 == 0) goto L5e
                int r6 = r7.hashCode()
                int r7 = viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccProgressBar.onExtraCallback
                int r7 = r7 + 103
                int r8 = r7 % 128
                viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccProgressBar.onWarmupCompleted = r8
                int r7 = r7 % r0
            L5e:
                int r1 = r1 * 31
                int r1 = r1 + r3
                int r1 = r1 * 31
                int r1 = r1 + r4
                int r1 = r1 * 31
                int r1 = r1 + r5
                int r1 = r1 * 31
                int r1 = r1 + r2
                int r1 = r1 * 31
                int r1 = r1 + r6
                int r2 = viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccProgressBar.onExtraCallback
                int r2 = r2 + 41
                int r3 = r2 % 128
                viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccProgressBar.onWarmupCompleted = r3
                int r2 = r2 % r0
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccProgressBar.hashCode():int");
        }

        public String toString() {
            int i = 2 % 2;
            String str = "PlccProgressBar(type=" + this.type + ", color=" + this.color + ", targetSpentAmount=" + this.targetSpentAmount + ", description=" + this.description + ", leftValue=" + this.leftValue + ", rightValue=" + this.rightValue + ")";
            int i2 = onWarmupCompleted + 121;
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

            public final KSerializer<PlccProgressBar> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 117;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                PlccBenefitInfoResp$PlccProgressBar$.serializer serializerVar = PlccBenefitInfoResp$PlccProgressBar$.serializer.INSTANCE;
                if (i3 == 0) {
                    int i4 = 72 / 0;
                }
                return serializerVar;
            }
        }

        static {
            int i = IAuthTabCallback + 31;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ PlccProgressBar(int r3, viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccProgressBar.onExtraCallbackWithResult r4, java.lang.String r5, long r6, java.lang.String r8, java.lang.String r9, java.lang.String r10, o.okycx r11) {
            /*
                r2 = this;
                r11 = r3 & 2
                r0 = 2
                if (r0 == r11) goto L17
                int r11 = viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccProgressBar.onWarmupCompleted
                int r11 = r11 + 75
                int r1 = r11 % 128
                viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccProgressBar.onExtraCallback = r1
                int r11 = r11 % r0
                viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$PlccProgressBar$$serializer r11 = viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$PlccProgressBar$.serializer.INSTANCE
                kotlinx.serialization.descriptors.SerialDescriptor r11 = r11.getDescriptor()
                o.htf31.onExtraCallbackWithResult(r3, r0, r11)
            L17:
                r2.<init>()
                r11 = r3 & 1
                if (r11 != 0) goto L22
                viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$PlccProgressBar$onExtraCallbackWithResult r4 = viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccProgressBar.onExtraCallbackWithResult.IN_PROGRESS
                int r11 = r0 % r0
            L22:
                r2.type = r4
                r2.color = r5
                r4 = r3 & 4
                if (r4 != 0) goto L3d
                int r4 = viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccProgressBar.onWarmupCompleted
                int r4 = r4 + 5
                int r5 = r4 % 128
                viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccProgressBar.onExtraCallback = r5
                int r4 = r4 % r0
                if (r4 != 0) goto L3a
                r4 = 1
            L37:
                r2.targetSpentAmount = r4
                goto L3f
            L3a:
                r4 = 0
                goto L37
            L3d:
                r2.targetSpentAmount = r6
            L3f:
                r4 = r3 & 8
                r5 = 0
                if (r4 != 0) goto L49
                r2.description = r5
            L46:
                int r4 = r0 % r0
                goto L56
            L49:
                r2.description = r8
                int r4 = viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccProgressBar.onWarmupCompleted
                int r4 = r4 + 25
                int r6 = r4 % 128
                viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccProgressBar.onExtraCallback = r6
                int r4 = r4 % r0
                if (r4 != 0) goto L46
            L56:
                r4 = r3 & 16
                if (r4 != 0) goto L5f
                r2.leftValue = r5
            L5c:
                int r4 = r0 % r0
                goto L6c
            L5f:
                r2.leftValue = r9
                int r4 = viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccProgressBar.onExtraCallback
                int r4 = r4 + 31
                int r6 = r4 % 128
                viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccProgressBar.onWarmupCompleted = r6
                int r4 = r4 % r0
                if (r4 == 0) goto L5c
            L6c:
                r3 = r3 & 32
                if (r3 != 0) goto L82
                int r3 = viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccProgressBar.onWarmupCompleted
                int r3 = r3 + 19
                int r4 = r3 % 128
                viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccProgressBar.onExtraCallback = r4
                int r3 = r3 % r0
                r2.rightValue = r5
                if (r3 != 0) goto L81
                r3 = 36
                int r3 = r3 / 0
            L81:
                return
            L82:
                r2.rightValue = r10
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccProgressBar.<init>(int, viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$PlccProgressBar$onExtraCallbackWithResult, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, o.okycx):void");
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 77;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            int i4 = i2 + 111;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return lazyArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void onWarmupCompleted(viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccProgressBar r9, o.vyl r10, kotlinx.serialization.descriptors.SerialDescriptor r11) {
            /*
                r0 = 2
                int r1 = r0 % r0
                kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccProgressBar.$childSerializers
                r2 = 0
                boolean r3 = r10.onWarmupCompleted(r11, r2)
                r4 = 0
                if (r3 != 0) goto L24
                int r3 = viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccProgressBar.onExtraCallback
                int r3 = r3 + 51
                int r5 = r3 % 128
                viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccProgressBar.onWarmupCompleted = r5
                int r3 = r3 % r0
                if (r3 != 0) goto L1f
                viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$PlccProgressBar$onExtraCallbackWithResult r3 = r9.type
                viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$PlccProgressBar$onExtraCallbackWithResult r5 = viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccProgressBar.onExtraCallbackWithResult.IN_PROGRESS
                if (r3 == r5) goto L31
                goto L24
            L1f:
                viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$PlccProgressBar$onExtraCallbackWithResult r9 = r9.type
                viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$PlccProgressBar$onExtraCallbackWithResult r9 = viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccProgressBar.onExtraCallbackWithResult.IN_PROGRESS
                throw r4
            L24:
                r1 = r1[r2]
                java.lang.Object r1 = r1.getValue()
                o.py r1 = (o.py) r1
                viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$PlccProgressBar$onExtraCallbackWithResult r3 = r9.type
                r10.onNavigationEvent(r11, r2, r1, r3)
            L31:
                java.lang.String r1 = r9.color
                r2 = 1
                r10.onExtraCallback(r11, r2, r1)
                boolean r1 = r10.onWarmupCompleted(r11, r0)
                if (r1 != 0) goto L45
                long r5 = r9.targetSpentAmount
                r7 = 0
                int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r1 == 0) goto L53
            L45:
                long r5 = r9.targetSpentAmount
                r10.onExtraCallback(r11, r0, r5)
                int r1 = viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccProgressBar.onWarmupCompleted
                int r1 = r1 + 15
                int r3 = r1 % 128
                viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccProgressBar.onExtraCallback = r3
                int r1 = r1 % r0
            L53:
                r1 = 3
                boolean r3 = r10.onWarmupCompleted(r11, r1)
                r2 = r2 ^ r3
                if (r2 == 0) goto L5f
                java.lang.String r2 = r9.description
                if (r2 == 0) goto L66
            L5f:
                o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
                java.lang.String r3 = r9.description
                r10.onExtraCallbackWithResult(r11, r1, r2, r3)
            L66:
                r1 = 4
                boolean r2 = r10.onWarmupCompleted(r11, r1)
                if (r2 != 0) goto L80
                int r2 = viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccProgressBar.onWarmupCompleted
                int r2 = r2 + 111
                int r3 = r2 % 128
                viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccProgressBar.onExtraCallback = r3
                int r2 = r2 % r0
                if (r2 == 0) goto L7d
                java.lang.String r0 = r9.leftValue
                if (r0 == 0) goto L87
                goto L80
            L7d:
                java.lang.String r9 = r9.leftValue
                throw r4
            L80:
                o.getWriggleLayout r0 = o.getWriggleLayout.onNavigationEvent
                java.lang.String r2 = r9.leftValue
                r10.onExtraCallbackWithResult(r11, r1, r0, r2)
            L87:
                r0 = 5
                boolean r1 = r10.onWarmupCompleted(r11, r0)
                if (r1 != 0) goto L92
                java.lang.String r1 = r9.rightValue
                if (r1 == 0) goto L99
            L92:
                o.getWriggleLayout r1 = o.getWriggleLayout.onNavigationEvent
                java.lang.String r9 = r9.rightValue
                r10.onExtraCallbackWithResult(r11, r0, r1, r9)
            L99:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccProgressBar.onWarmupCompleted(viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$PlccProgressBar, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
            PlccProgressBar plccProgressBar = (PlccProgressBar) objArr[0];
            int i = 2 % 2;
            int i2 = onExtraCallback + 19;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = plccProgressBar.type;
            if (i3 == 0) {
                return onextracallbackwithresult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 113;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            String str = this.color;
            int i5 = i3 + 51;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final long asBinder() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 105;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            long j = this.targetSpentAmount;
            int i4 = i2 + 117;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return j;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 13;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            String str = this.description;
            int i4 = i3 + 111;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 23;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            String str = this.leftValue;
            int i5 = i3 + 81;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String onTransact() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 57;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            String str = this.rightValue;
            int i5 = i3 + 55;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class onExtraCallbackWithResult {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ onExtraCallbackWithResult[] $VALUES;
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            public static final onExtraCallbackWithResult IN_PROGRESS = new onExtraCallbackWithResult("IN_PROGRESS", 0);
            public static final onExtraCallbackWithResult COMPLETE = new onExtraCallbackWithResult("COMPLETE", 1);

            private static final /* synthetic */ onExtraCallbackWithResult[] $values() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 115;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                onExtraCallbackWithResult[] onextracallbackwithresultArr = {IN_PROGRESS, COMPLETE};
                int i5 = i3 + 75;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return onextracallbackwithresultArr;
            }

            public static EnumEntries<onExtraCallbackWithResult> getEntries() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 99;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                EnumEntries<onExtraCallbackWithResult> enumEntries = $ENTRIES;
                int i4 = i2 + 87;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return enumEntries;
            }

            public static onExtraCallbackWithResult valueOf(String str) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 35;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) Enum.valueOf(onExtraCallbackWithResult.class, str);
                int i4 = onExtraCallback + 63;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return onextracallbackwithresult;
            }

            public static onExtraCallbackWithResult[] values() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 95;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                onExtraCallbackWithResult[] onextracallbackwithresultArr = (onExtraCallbackWithResult[]) $VALUES.clone();
                int i3 = onExtraCallback + 49;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return onextracallbackwithresultArr;
            }

            private onExtraCallbackWithResult(String str, int i) {
            }

            static {
                onExtraCallbackWithResult[] onextracallbackwithresultArr$values = $values();
                $VALUES = onextracallbackwithresultArr$values;
                $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackwithresultArr$values);
                int i = IAuthTabCallback + 55;
                onExtraCallbackWithResult = i % 128;
                int i2 = i % 2;
            }
        }

        public static final /* synthetic */ Lazy[] onWarmupCompleted() {
            int iOnExtraCallback = getKekid.onExtraCallback();
            int iOnExtraCallback2 = getKekid.onExtraCallback();
            int iOnExtraCallback3 = getKekid.onExtraCallback();
            return (Lazy[]) IAuthTabCallback(getKekid.onExtraCallback(), iOnExtraCallback3, 795005688, -795005688, iOnExtraCallback2, new Object[0], iOnExtraCallback);
        }

        public final onExtraCallbackWithResult IAuthTabCallbackStub() {
            int iOnExtraCallback = getKekid.onExtraCallback();
            int iOnExtraCallback2 = getKekid.onExtraCallback();
            int iOnExtraCallback3 = getKekid.onExtraCallback();
            return (onExtraCallbackWithResult) IAuthTabCallback(getKekid.onExtraCallback(), iOnExtraCallback3, 43147313, -43147312, iOnExtraCallback2, new Object[]{this}, iOnExtraCallback);
        }
    }

    @liq
    public static final class PlccBenefitGroup {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;
        private final List<PlccBenefitGroupItem> benefits;
        private final String title;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$PlccBenefitGroup$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 103;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnNavigationEvent = PlccBenefitInfoResp.PlccBenefitGroup.onNavigationEvent();
                int i4 = onExtraCallback + 85;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnNavigationEvent;
            }
        })};

        public static /* synthetic */ KSerializer onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 47;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnWarmupCompleted = onWarmupCompleted();
            int i4 = onWarmupCompleted + 93;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnWarmupCompleted;
        }

        private static final /* synthetic */ KSerializer onWarmupCompleted() {
            int i = 2 % 2;
            checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(PlccBenefitGroupItem$$serializer.INSTANCE);
            int i2 = onWarmupCompleted + 33;
            onExtraCallback = i2 % 128;
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
            if (!(obj instanceof PlccBenefitGroup)) {
                int i2 = onExtraCallback + 79;
                onWarmupCompleted = i2 % 128;
                return i2 % 2 != 0;
            }
            PlccBenefitGroup plccBenefitGroup = (PlccBenefitGroup) obj;
            if (!Intrinsics.areEqual(this.title, plccBenefitGroup.title)) {
                int i3 = onExtraCallback + 87;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.benefits, plccBenefitGroup.benefits)) {
                return true;
            }
            int i5 = onWarmupCompleted + 13;
            onExtraCallback = i5 % 128;
            return i5 % 2 == 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 13;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (this.title.hashCode() * 31) + this.benefits.hashCode();
            int i4 = onWarmupCompleted + 105;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "PlccBenefitGroup(title=" + this.title + ", benefits=" + this.benefits + ")";
            int i2 = onExtraCallback + 29;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<PlccBenefitGroup> serializer() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 73;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    PlccBenefitInfoResp$PlccBenefitGroup$$serializer plccBenefitInfoResp$PlccBenefitGroup$$serializer = PlccBenefitInfoResp$PlccBenefitGroup$$serializer.INSTANCE;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                PlccBenefitInfoResp$PlccBenefitGroup$$serializer plccBenefitInfoResp$PlccBenefitGroup$$serializer2 = PlccBenefitInfoResp$PlccBenefitGroup$$serializer.INSTANCE;
                int i3 = IAuthTabCallback + 1;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return plccBenefitInfoResp$PlccBenefitGroup$$serializer2;
            }
        }

        static {
            int i = IAuthTabCallback + 87;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public /* synthetic */ PlccBenefitGroup(int i, String str, List list, okycx okycxVar) {
            if (1 != (i & 1)) {
                int i2 = onWarmupCompleted + 123;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                htf31.onExtraCallbackWithResult(i, 1, PlccBenefitInfoResp$PlccBenefitGroup$$serializer.INSTANCE.getDescriptor());
                int i4 = 2 % 2;
            }
            this.title = str;
            if ((i & 2) == 0) {
                this.benefits = CollectionsKt.emptyList();
                int i5 = onWarmupCompleted + 109;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return;
            }
            this.benefits = list;
            int i7 = onWarmupCompleted + 75;
            onExtraCallback = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void onExtraCallbackWithResult(PlccBenefitGroup plccBenefitGroup, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 23;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            vylVar.onExtraCallback(serialDescriptor, 0, plccBenefitGroup.title);
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                int i4 = onWarmupCompleted + 39;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 89 / 0;
                    if (Intrinsics.areEqual(plccBenefitGroup.benefits, CollectionsKt.emptyList())) {
                        return;
                    }
                } else if (Intrinsics.areEqual(plccBenefitGroup.benefits, CollectionsKt.emptyList())) {
                    return;
                }
            }
            vylVar.onNavigationEvent(serialDescriptor, 1, (py) lazyArr[1].getValue(), plccBenefitGroup.benefits);
            int i6 = onExtraCallback + 71;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
        }

        public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 95;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            int i5 = i3 + 41;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return lazyArr;
        }

        public final String IAuthTabCallback() {
            String str;
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 37;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                str = this.title;
                int i4 = 92 / 0;
            } else {
                str = this.title;
            }
            int i5 = i2 + 61;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final List<PlccBenefitGroupItem> onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 15;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return this.benefits;
            }
            throw null;
        }
    }

    @liq
    public static final class PlccSpentTxItem {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final long amount;
        private final boolean isCancel;
        private final boolean isValid;
        private final String reason;
        private final String salesTs;
        private final String useStore;

        static {
            int i = IAuthTabCallback + 29;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 13;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj) {
                int i5 = i2 + 77;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            if (!(obj instanceof PlccSpentTxItem)) {
                return false;
            }
            PlccSpentTxItem plccSpentTxItem = (PlccSpentTxItem) obj;
            if (this.isValid != plccSpentTxItem.isValid) {
                return false;
            }
            if (!Intrinsics.areEqual(this.salesTs, plccSpentTxItem.salesTs)) {
                int i7 = onWarmupCompleted + 41;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.useStore, plccSpentTxItem.useStore)) {
                return false;
            }
            if (this.amount != plccSpentTxItem.amount) {
                int i9 = onExtraCallback + 87;
                onWarmupCompleted = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 87 / 0;
                }
                return false;
            }
            if (Intrinsics.areEqual(this.reason, plccSpentTxItem.reason)) {
                return this.isCancel == plccSpentTxItem.isCancel;
            }
            int i11 = onExtraCallback + 93;
            onWarmupCompleted = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 33;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((((((((Boolean.hashCode(this.isValid) * 31) + this.salesTs.hashCode()) * 31) + this.useStore.hashCode()) * 31) + Long.hashCode(this.amount)) * 31) + this.reason.hashCode()) * 31) + Boolean.hashCode(this.isCancel);
            int i4 = onExtraCallback + 15;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "PlccSpentTxItem(isValid=" + this.isValid + ", salesTs=" + this.salesTs + ", useStore=" + this.useStore + ", amount=" + this.amount + ", reason=" + this.reason + ", isCancel=" + this.isCancel + ")";
            int i2 = onExtraCallback + 87;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<PlccSpentTxItem> serializer() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 103;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                PlccBenefitInfoResp$PlccSpentTxItem$$serializer plccBenefitInfoResp$PlccSpentTxItem$$serializer = PlccBenefitInfoResp$PlccSpentTxItem$$serializer.INSTANCE;
                int i4 = onExtraCallback + 113;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return plccBenefitInfoResp$PlccSpentTxItem$$serializer;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ PlccSpentTxItem(int r2, boolean r3, java.lang.String r4, java.lang.String r5, long r6, java.lang.String r8, boolean r9, o.okycx r10) {
            /*
                r1 = this;
                r10 = r2 & 1
                r0 = 1
                if (r0 == r10) goto Le
                viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$PlccSpentTxItem$$serializer r10 = viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$PlccSpentTxItem$$serializer.INSTANCE
                kotlinx.serialization.descriptors.SerialDescriptor r10 = r10.getDescriptor()
                o.htf31.onExtraCallbackWithResult(r2, r0, r10)
            Le:
                r1.<init>()
                r1.isValid = r3
                r3 = r2 & 2
                java.lang.String r10 = ""
                if (r3 != 0) goto L1c
                r1.salesTs = r10
                goto L1e
            L1c:
                r1.salesTs = r4
            L1e:
                r3 = r2 & 4
                r4 = 2
                if (r3 != 0) goto L26
                r1.useStore = r10
                goto L2a
            L26:
                r1.useStore = r5
                int r3 = r4 % r4
            L2a:
                r3 = r2 & 8
                if (r3 != 0) goto L45
                int r3 = viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccSpentTxItem.onWarmupCompleted
                int r5 = r3 + 13
                int r6 = r5 % 128
                viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccSpentTxItem.onExtraCallback = r6
                int r5 = r5 % r4
                r5 = 0
                r1.amount = r5
                int r3 = r3 + 49
                int r5 = r3 % 128
                viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccSpentTxItem.onExtraCallback = r5
                int r3 = r3 % r4
                int r3 = r4 % r4
                goto L47
            L45:
                r1.amount = r6
            L47:
                r3 = r2 & 16
                if (r3 != 0) goto L57
                r1.reason = r10
                int r3 = viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccSpentTxItem.onWarmupCompleted
                int r3 = r3 + 111
                int r5 = r3 % 128
                viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccSpentTxItem.onExtraCallback = r5
                int r3 = r3 % r4
                goto L65
            L57:
                r1.reason = r8
                int r3 = viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccSpentTxItem.onWarmupCompleted
                int r3 = r3 + 111
                int r5 = r3 % 128
                viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccSpentTxItem.onExtraCallback = r5
                int r3 = r3 % r4
                if (r3 != 0) goto L65
                goto L66
            L65:
                int r4 = r4 % r4
            L66:
                r2 = r2 & 32
                if (r2 != 0) goto L6e
                r2 = 0
                r1.isCancel = r2
                return
            L6e:
                r1.isCancel = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccSpentTxItem.<init>(int, boolean, java.lang.String, java.lang.String, long, java.lang.String, boolean, o.okycx):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void IAuthTabCallback(viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccSpentTxItem r10, o.vyl r11, kotlinx.serialization.descriptors.SerialDescriptor r12) {
            /*
                r0 = 2
                int r1 = r0 % r0
                r1 = 0
                boolean r2 = r10.isValid
                r11.onNavigationEvent(r12, r1, r2)
                r1 = 1
                boolean r2 = r11.onWarmupCompleted(r12, r1)
                java.lang.String r3 = ""
                if (r2 != 0) goto L1a
                java.lang.String r2 = r10.salesTs
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
                if (r2 != 0) goto L1f
            L1a:
                java.lang.String r2 = r10.salesTs
                r11.onExtraCallback(r12, r1, r2)
            L1f:
                boolean r2 = r11.onWarmupCompleted(r12, r0)
                r4 = 0
                if (r2 != 0) goto L40
                int r2 = viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccSpentTxItem.onExtraCallback
                int r2 = r2 + 17
                int r5 = r2 % 128
                viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccSpentTxItem.onWarmupCompleted = r5
                int r2 = r2 % r0
                if (r2 != 0) goto L3a
                java.lang.String r2 = r10.useStore
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
                if (r2 != 0) goto L45
                goto L40
            L3a:
                java.lang.String r10 = r10.useStore
                kotlin.jvm.internal.Intrinsics.areEqual(r10, r3)
                throw r4
            L40:
                java.lang.String r2 = r10.useStore
                r11.onExtraCallback(r12, r0, r2)
            L45:
                r2 = 3
                boolean r5 = r11.onWarmupCompleted(r12, r2)
                if (r5 == 0) goto L4d
                goto L65
            L4d:
                int r5 = viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccSpentTxItem.onWarmupCompleted
                int r5 = r5 + 55
                int r6 = r5 % 128
                viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccSpentTxItem.onExtraCallback = r6
                int r5 = r5 % r0
                r6 = 0
                long r8 = r10.amount
                if (r5 != 0) goto L61
                int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r5 == 0) goto L6a
                goto L65
            L61:
                int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r5 == 0) goto L6a
            L65:
                long r5 = r10.amount
                r11.onExtraCallback(r12, r2, r5)
            L6a:
                r2 = 4
                boolean r5 = r11.onWarmupCompleted(r12, r2)
                if (r5 != 0) goto L82
                int r5 = viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccSpentTxItem.onExtraCallback
                int r5 = r5 + 9
                int r6 = r5 % 128
                viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccSpentTxItem.onWarmupCompleted = r6
                int r5 = r5 % r0
                java.lang.String r5 = r10.reason
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r3)
                if (r3 != 0) goto L87
            L82:
                java.lang.String r3 = r10.reason
                r11.onExtraCallback(r12, r2, r3)
            L87:
                r2 = 5
                boolean r3 = r11.onWarmupCompleted(r12, r2)
                r1 = r1 ^ r3
                if (r1 == 0) goto La5
                int r1 = viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccSpentTxItem.onExtraCallback
                int r1 = r1 + 117
                int r3 = r1 % 128
                viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccSpentTxItem.onWarmupCompleted = r3
                int r1 = r1 % r0
                if (r1 != 0) goto L9f
                boolean r0 = r10.isCancel
                if (r0 == 0) goto Laa
                goto La5
            L9f:
                boolean r10 = r10.isCancel
                r4.hashCode()
                throw r4
            La5:
                boolean r10 = r10.isCancel
                r11.onNavigationEvent(r12, r2, r10)
            Laa:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccSpentTxItem.IAuthTabCallback(viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$PlccSpentTxItem, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        public final boolean IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 75;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            boolean z = this.isValid;
            int i4 = i2 + 65;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return z;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 113;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            String str = this.salesTs;
            int i5 = i3 + 109;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 101;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            String str = this.useStore;
            int i5 = i3 + 89;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final long IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 33;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            long j = this.amount;
            int i5 = i2 + 107;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return j;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 11;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            String str = this.reason;
            int i5 = i2 + 13;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 87 / 0;
            }
            return str;
        }

        public final boolean onWarmupCompleted() {
            boolean z;
            int i = 2 % 2;
            int i2 = onExtraCallback + 7;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 != 0) {
                z = this.isCancel;
                int i4 = 31 / 0;
            } else {
                z = this.isCancel;
            }
            int i5 = i3 + 97;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }
    }
}
