package im.toss.feature.credit.overview.network.response;

import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelAdapter$;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.checkNavigationBarByWindowManagerService;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.oty1;
import o.py;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class Loan {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private final String bankCode;
    private final String bankType;
    private final Long contractAmount;
    private final String dueDate;
    private final String fillIconUri;
    private final String iconUri;
    private final Long id;
    private final String openDate;
    private final String organizationName;
    private final Long remainAmount;
    private final String shortenedOrganizationName;
    private final List<CreditTip> tips;
    private final String type;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.feature.credit.overview.network.response.Loan$$ExternalSyntheticLambda0
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 75;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializer = (KSerializer) Loan.onExtraCallback(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[0], LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 2008074604, -2008074604, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback());
            int i4 = onExtraCallbackWithResult + 97;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return kSerializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }), null};

    public Loan() {
        this((Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, (Long) null, (String) null, (String) null, (List) null, (String) null, 8191, (DefaultConstructorMarker) null);
    }

    private static final /* synthetic */ KSerializer access000() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(CreditTip$$serializer.INSTANCE);
        int i2 = onExtraCallbackWithResult + 67;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ Object onExtraCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~(i4 | i5 | i);
        int i8 = ~i4;
        int i9 = ~i5;
        int i10 = ~(i8 | i9);
        int i11 = ~i;
        int i12 = (~(i8 | i11)) | i10 | (~(i9 | i11));
        int i13 = i11 | i10;
        int i14 = i4 + i5 + i2 + (105149790 * i3) + ((-719480883) * i6);
        int i15 = i14 * i14;
        int i16 = (i4 * (-424837635)) + 281018368 + ((-424837635) * i5) + (1798143484 * i7) + (i12 * (-1798143484)) + ((-1798143484) * i13) + (2071986176 * i2) + ((-654311424) * i3) + (1702887424 * i6) + ((-155189248) * i15);
        int i17 = (i4 * 910058005) + 1460508013 + (i5 * 910058005) + (i7 * (-484)) + (i12 * 484) + (i13 * 484) + (i2 * 910058489) + (i3 * (-759332242)) + (i6 * (-1121784475)) + (i15 * 1086324736);
        int i18 = i16 + (i17 * i17 * (-1925185536));
        return i18 != 1 ? i18 != 2 ? onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr) : onWarmupCompleted(objArr);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return access000();
        }
        access000();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 105;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Loan)) {
            int i5 = i2 + 17;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        Loan loan = (Loan) obj;
        if (!Intrinsics.areEqual(this.id, loan.id)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.organizationName, loan.organizationName)) {
            int i7 = onExtraCallbackWithResult + 39;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.shortenedOrganizationName, loan.shortenedOrganizationName)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.iconUri, loan.iconUri)) {
            int i9 = onExtraCallbackWithResult + 87;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.fillIconUri, loan.fillIconUri) || !Intrinsics.areEqual(this.openDate, loan.openDate)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.dueDate, loan.dueDate)) {
            int i11 = onExtraCallbackWithResult + 51;
            IAuthTabCallback = i11 % 128;
            return i11 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.contractAmount, loan.contractAmount)) {
            int i12 = onExtraCallbackWithResult + 53;
            IAuthTabCallback = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.remainAmount, loan.remainAmount)) {
            return Intrinsics.areEqual(this.bankType, loan.bankType) && Intrinsics.areEqual(this.type, loan.type) && Intrinsics.areEqual(this.tips, loan.tips) && !(Intrinsics.areEqual(this.bankCode, loan.bankCode) ^ true);
        }
        int i14 = onExtraCallbackWithResult + 93;
        IAuthTabCallback = i14 % 128;
        int i15 = i14 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Long l = this.id;
        int iHashCode4 = 0;
        if (l == null) {
            int i5 = i3 + 31;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = l.hashCode();
            int i7 = onExtraCallbackWithResult + 87;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
        }
        String str = this.organizationName;
        if (str == null) {
            int i9 = IAuthTabCallback + 45;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str.hashCode();
        }
        String str2 = this.shortenedOrganizationName;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.iconUri;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.fillIconUri;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.openDate;
        int iHashCode8 = 1;
        if (str5 == null) {
            int i11 = IAuthTabCallback + 45;
            onExtraCallbackWithResult = i11 % 128;
            iHashCode3 = i11 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode3 = str5.hashCode();
        }
        String str6 = this.dueDate;
        int iHashCode9 = str6 == null ? 0 : str6.hashCode();
        Long l2 = this.contractAmount;
        int iHashCode10 = l2 == null ? 0 : l2.hashCode();
        Long l3 = this.remainAmount;
        if (l3 == null) {
            int i12 = onExtraCallbackWithResult + 61;
            IAuthTabCallback = i12 % 128;
            if (i12 % 2 == 0) {
                iHashCode8 = 0;
            }
        } else {
            iHashCode8 = l3.hashCode();
        }
        String str7 = this.bankType;
        int iHashCode11 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.type;
        int iHashCode12 = str8 == null ? 0 : str8.hashCode();
        List<CreditTip> list = this.tips;
        int iHashCode13 = list == null ? 0 : list.hashCode();
        String str9 = this.bankCode;
        if (str9 != null) {
            int i13 = onExtraCallbackWithResult + 17;
            IAuthTabCallback = i13 % 128;
            if (i13 % 2 != 0) {
                str9.hashCode();
                throw null;
            }
            iHashCode4 = str9.hashCode();
        }
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode3) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode8) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Loan(id=" + this.id + ", organizationName=" + this.organizationName + ", shortenedOrganizationName=" + this.shortenedOrganizationName + ", iconUri=" + this.iconUri + ", fillIconUri=" + this.fillIconUri + ", openDate=" + this.openDate + ", dueDate=" + this.dueDate + ", contractAmount=" + this.contractAmount + ", remainAmount=" + this.remainAmount + ", bankType=" + this.bankType + ", type=" + this.type + ", tips=" + this.tips + ", bankCode=" + this.bankCode + ")";
        int i2 = onExtraCallbackWithResult + 61;
        IAuthTabCallback = i2 % 128;
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

        public final KSerializer<Loan> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 63;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Loan$$serializer loan$$serializer = Loan$$serializer.INSTANCE;
            if (i3 != 0) {
                int i4 = 16 / 0;
            }
            return loan$$serializer;
        }
    }

    static {
        int i = onNavigationEvent + 15;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ Loan(int i, Long l, String str, String str2, String str3, String str4, String str5, String str6, Long l2, Long l3, String str7, String str8, List list, String str9, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.id = null;
            int i2 = 2 % 2;
        } else {
            this.id = l;
        }
        if ((i & 2) == 0) {
            this.organizationName = null;
        } else {
            this.organizationName = str;
        }
        if ((i & 4) == 0) {
            this.shortenedOrganizationName = null;
            int i3 = 2 % 2;
        } else {
            this.shortenedOrganizationName = str2;
        }
        if ((i & 8) == 0) {
            this.iconUri = null;
        } else {
            this.iconUri = str3;
        }
        if ((i & 16) == 0) {
            int i4 = IAuthTabCallback + 119;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            this.fillIconUri = null;
        } else {
            this.fillIconUri = str4;
            int i6 = onExtraCallbackWithResult + 9;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 % 2;
            }
        }
        if ((i & 32) == 0) {
            this.openDate = null;
        } else {
            this.openDate = str5;
        }
        if ((i & 64) == 0) {
            int i8 = onExtraCallbackWithResult + 19;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            this.dueDate = null;
        } else {
            this.dueDate = str6;
        }
        if ((i & 128) == 0) {
            this.contractAmount = null;
        } else {
            this.contractAmount = l2;
        }
        if ((i & 256) == 0) {
            this.remainAmount = null;
        } else {
            this.remainAmount = l3;
        }
        if ((i & 512) == 0) {
            this.bankType = null;
        } else {
            this.bankType = str7;
        }
        if ((i & 1024) == 0) {
            int i10 = onExtraCallbackWithResult + 119;
            int i11 = i10 % 128;
            IAuthTabCallback = i11;
            int i12 = i10 % 2;
            this.type = null;
            int i13 = i11 + 63;
            onExtraCallbackWithResult = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 2 % 2;
            }
        } else {
            this.type = str8;
        }
        if ((i & 2048) == 0) {
            int i15 = IAuthTabCallback + 3;
            onExtraCallbackWithResult = i15 % 128;
            int i16 = i15 % 2;
            this.tips = null;
        } else {
            this.tips = list;
        }
        if ((i & 4096) == 0) {
            this.bankCode = null;
            return;
        }
        this.bankCode = str9;
        int i17 = IAuthTabCallback + 7;
        onExtraCallbackWithResult = i17 % 128;
        int i18 = i17 % 2;
    }

    public Loan(@Nullable Long l, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Long l2, @Nullable Long l3, @Nullable String str7, @Nullable String str8, @Nullable List<CreditTip> list, @Nullable String str9) {
        this.id = l;
        this.organizationName = str;
        this.shortenedOrganizationName = str2;
        this.iconUri = str3;
        this.fillIconUri = str4;
        this.openDate = str5;
        this.dueDate = str6;
        this.contractAmount = l2;
        this.remainAmount = l3;
        this.bankType = str7;
        this.type = str8;
        this.tips = list;
        this.bankCode = str9;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Loan loan = (Loan) objArr[0];
        vyl vylVar = (vyl) objArr[1];
        SerialDescriptor serialDescriptor = (SerialDescriptor) objArr[2];
        int i = 2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || loan.id != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, oty1.onExtraCallback, loan.id);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || loan.organizationName != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, loan.organizationName);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || loan.shortenedOrganizationName != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, loan.shortenedOrganizationName);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
            int i2 = onExtraCallbackWithResult + 81;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                String str = loan.iconUri;
                throw null;
            }
            if (loan.iconUri != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, loan.iconUri);
            }
        }
        if (!(!vylVar.onWarmupCompleted(serialDescriptor, 4)) || loan.fillIconUri != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, loan.fillIconUri);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 5) || loan.openDate != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, loan.openDate);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 6) || loan.dueDate != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, loan.dueDate);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 7) || loan.contractAmount != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 7, oty1.onExtraCallback, loan.contractAmount);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 8)) {
            int i3 = IAuthTabCallback + 113;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            if (loan.remainAmount != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 8, oty1.onExtraCallback, loan.remainAmount);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 9)) {
            int i5 = IAuthTabCallback + 109;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            if (loan.bankType != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 9, getWriggleLayout.onNavigationEvent, loan.bankType);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 10) || loan.type != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 10, getWriggleLayout.onNavigationEvent, loan.type);
            int i7 = onExtraCallbackWithResult + 95;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 11) || loan.tips != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 11, (py) lazyArr[11].getValue(), loan.tips);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 12) || loan.bankCode != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 12, getWriggleLayout.onNavigationEvent, loan.bankCode);
        }
        return null;
    }

    public static final /* synthetic */ Lazy[] onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 103;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return lazyArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Loan(Long l, String str, String str2, String str3, String str4, String str5, String str6, Long l2, Long l3, String str7, String str8, List list, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Long l4;
        String str10;
        String str11;
        String str12;
        Long l5;
        Long l6;
        String str13;
        String str14;
        List list2;
        String str15 = null;
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 121;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            l4 = null;
        } else {
            l4 = l;
        }
        if ((i & 2) != 0) {
            int i4 = onExtraCallbackWithResult + 93;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 32 / 0;
            }
            str10 = null;
        } else {
            str10 = str;
        }
        if ((i & 4) != 0) {
            int i6 = IAuthTabCallback + 45;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 2;
            }
            str11 = null;
        } else {
            str11 = str2;
        }
        String str16 = (i & 8) != 0 ? null : str3;
        String str17 = (i & 16) != 0 ? null : str4;
        if ((i & 32) != 0) {
            int i8 = onExtraCallbackWithResult + 97;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 2 % 2;
            }
            str12 = null;
        } else {
            str12 = str5;
        }
        String str18 = (i & 64) != 0 ? null : str6;
        if ((i & 128) != 0) {
            int i10 = 2 % 2;
            l5 = null;
        } else {
            l5 = l2;
        }
        if ((i & 256) != 0) {
            int i11 = 2 % 2;
            l6 = null;
        } else {
            l6 = l3;
        }
        if ((i & 512) != 0) {
            int i12 = IAuthTabCallback + 99;
            onExtraCallbackWithResult = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 2 % 2;
            }
            str13 = null;
        } else {
            str13 = str7;
        }
        if ((i & 1024) != 0) {
            int i14 = onExtraCallbackWithResult + 83;
            IAuthTabCallback = i14 % 128;
            int i15 = i14 % 2;
            str14 = null;
        } else {
            str14 = str8;
        }
        if ((i & 2048) != 0) {
            int i16 = onExtraCallbackWithResult + 69;
            IAuthTabCallback = i16 % 128;
            int i17 = i16 % 2;
            list2 = null;
        } else {
            list2 = list;
        }
        if ((i & 4096) != 0) {
            int i18 = onExtraCallbackWithResult + 55;
            IAuthTabCallback = i18 % 128;
            int i19 = i18 % 2;
        } else {
            str15 = str9;
        }
        this(l4, str10, str11, str16, str17, str12, str18, l5, l6, str13, str14, list2, str15);
    }

    public final Long asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Long l = this.id;
        int i5 = i3 + 3;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 27 / 0;
        }
        return l;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 87;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.organizationName;
        int i5 = i2 + 5;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.shortenedOrganizationName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 113;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.iconUri;
        int i5 = i2 + 81;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 31 / 0;
        }
        return str;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 111;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.fillIconUri;
        int i4 = i2 + 113;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.openDate;
        int i5 = i3 + 125;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.dueDate;
        }
        throw null;
    }

    public final Long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 39;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Long l = this.contractAmount;
        int i5 = i2 + 37;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return l;
    }

    public final Long access100() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Long l = this.remainAmount;
        int i5 = i3 + 11;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return l;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Loan loan = (Loan) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 97;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = loan.bankType;
        if (i3 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 27;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.type;
        int i4 = i2 + 49;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final boolean getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zAreEqual = Intrinsics.areEqual(this.bankCode, checkNavigationBarByWindowManagerService.TOSS_BANK.getCode());
        int i4 = IAuthTabCallback + 23;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return zAreEqual;
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        return (KSerializer) onExtraCallback(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[0], LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 2008074604, -2008074604, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback());
    }

    public final String onWarmupCompleted() {
        return (String) onExtraCallback(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{this}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 664957711, -664957710, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback());
    }
}
