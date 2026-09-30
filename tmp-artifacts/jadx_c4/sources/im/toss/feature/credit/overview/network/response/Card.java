package im.toss.feature.credit.overview.network.response;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.SpannedDataExternalSyntheticLambda0;
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
public final class Card {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final String bankCode;
    private final Long cashAdvanceAmount;
    private final Long cashLimit;
    private final Long creditUsedAmount;
    private final String iconUri;
    private final Long id;
    private final Long installmentAmount;
    private final Long limit;
    private final Long lumpSumAmount;
    private final String openDate;
    private final String organizationName;
    private final Long overdueAmount;
    private final String referenceDate;
    private final String shortenedOrganizationName;
    private final List<CreditTip> tips;
    private final String type;
    private final Long usedAmount;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.feature.credit.overview.network.response.Card$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 21;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Card.onWarmupCompleted();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            KSerializer kSerializerOnWarmupCompleted = Card.onWarmupCompleted();
            int i3 = onExtraCallback + 59;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return kSerializerOnWarmupCompleted;
        }
    }), null};

    public Card() {
        this((Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, (Long) null, (Long) null, (Long) null, (Long) null, (Long) null, (Long) null, (Long) null, (List) null, (String) null, 131071, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i2;
        int i9 = (~(i7 | i8)) | i3;
        int i10 = ~(i5 | i2);
        int i11 = i9 | i10;
        int i12 = ~i3;
        int i13 = (~(i12 | i2)) | (~(i12 | i5)) | i10;
        int i14 = (~(i7 | i2)) | (~(i8 | i5));
        int i15 = i5 + i2 + i + (1040777104 * i6) + ((-1861505373) * i4);
        int i16 = i15 * i15;
        int i17 = (i5 * (-1036928585)) + 527892480 + ((-1036928585) * i2) + ((-562525036) * i11) + (562525036 * i13) + ((-281262518) * i14) + ((-1318191104) * i) + (1608515584 * i6) + ((-1123418112) * i4) + ((-2114519040) * i16);
        int i18 = (i5 * 1703033811) + 1712528133 + (i2 * 1703033811) + (i11 * 1508) + (i13 * (-1508)) + (i14 * 754) + (i * 1703034565) + (i6 * (-2114876976)) + (i4 * 1880022383) + (i16 * (-720175104));
        int i19 = i17 + (i18 * i18 * (-739180544));
        if (i19 != 1) {
            return i19 != 2 ? i19 != 3 ? IAuthTabCallback(objArr) : onExtraCallback(objArr) : onExtraCallbackWithResult(objArr);
        }
        int i20 = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(CreditTip$$serializer.INSTANCE);
        int i21 = onNavigationEvent + 67;
        onExtraCallback = i21 % 128;
        int i22 = i21 % 2;
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        KSerializer kSerializer = (KSerializer) IAuthTabCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[0], -1349215304, iIAuthTabCallback, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1349215305, SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
        int i4 = onExtraCallback + 49;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializer;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 73;
            onNavigationEvent = i5 % 128;
            return i5 % 2 != 0;
        }
        if (!(obj instanceof Card)) {
            return false;
        }
        Card card = (Card) obj;
        if (!Intrinsics.areEqual(this.id, card.id)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.type, card.type)) {
            int i6 = onExtraCallback + 93;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.organizationName, card.organizationName)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.shortenedOrganizationName, card.shortenedOrganizationName)) {
            int i8 = onNavigationEvent + 111;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.iconUri, card.iconUri) || !Intrinsics.areEqual(this.openDate, card.openDate) || !Intrinsics.areEqual(this.referenceDate, card.referenceDate) || !Intrinsics.areEqual(this.limit, card.limit) || !Intrinsics.areEqual(this.cashLimit, card.cashLimit)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.lumpSumAmount, card.lumpSumAmount)) {
            int i10 = onExtraCallback + 99;
            onNavigationEvent = i10 % 128;
            return i10 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.installmentAmount, card.installmentAmount) || !Intrinsics.areEqual(this.cashAdvanceAmount, card.cashAdvanceAmount) || !Intrinsics.areEqual(this.overdueAmount, card.overdueAmount)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.usedAmount, card.usedAmount)) {
            int i11 = onExtraCallback + 13;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.creditUsedAmount, card.creditUsedAmount)) {
            return false;
        }
        if (Intrinsics.areEqual(this.tips, card.tips)) {
            return Intrinsics.areEqual(this.bankCode, card.bankCode);
        }
        int i13 = onNavigationEvent + 35;
        onExtraCallback = i13 % 128;
        int i14 = i13 % 2;
        return false;
    }

    public int hashCode() {
        Long l;
        int i;
        int i2;
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i3;
        int iHashCode4;
        int iHashCode5;
        int i4;
        int iHashCode6;
        int iHashCode7;
        int i5 = 2 % 2;
        int i6 = onExtraCallback + 103;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            l = this.id;
            if (l == null) {
                i2 = 1;
                i = i2;
                iHashCode = 0;
            } else {
                i = 1;
                iHashCode = l.hashCode();
            }
        } else {
            l = this.id;
            if (l == null) {
                i2 = 0;
                i = i2;
                iHashCode = 0;
            } else {
                i = 0;
                iHashCode = l.hashCode();
            }
        }
        String str = this.type;
        int iHashCode8 = str == null ? 0 : str.hashCode();
        String str2 = this.organizationName;
        int iHashCode9 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.shortenedOrganizationName;
        int iHashCode10 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.iconUri;
        int iHashCode11 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.openDate;
        int iHashCode12 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.referenceDate;
        int iHashCode13 = str6 == null ? 0 : str6.hashCode();
        Long l2 = this.limit;
        int iHashCode14 = l2 == null ? 0 : l2.hashCode();
        Long l3 = this.cashLimit;
        int iHashCode15 = l3 == null ? 0 : l3.hashCode();
        Long l4 = this.lumpSumAmount;
        if (l4 == null) {
            int i7 = onExtraCallback + 111;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = l4.hashCode();
        }
        Long l5 = this.installmentAmount;
        int iHashCode16 = l5 == null ? 0 : l5.hashCode();
        Long l6 = this.cashAdvanceAmount;
        if (l6 == null) {
            int i9 = onNavigationEvent + 27;
            onExtraCallback = i9 % 128;
            iHashCode3 = i9 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode3 = l6.hashCode();
        }
        Long l7 = this.overdueAmount;
        if (l7 == null) {
            int i10 = onExtraCallback + 107;
            i3 = i;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            iHashCode4 = 0;
        } else {
            i3 = i;
            iHashCode4 = l7.hashCode();
        }
        Long l8 = this.usedAmount;
        if (l8 == null) {
            int i12 = onNavigationEvent + 61;
            onExtraCallback = i12 % 128;
            iHashCode5 = i12 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode5 = l8.hashCode();
        }
        Long l9 = this.creditUsedAmount;
        if (l9 == null) {
            int i13 = onNavigationEvent + 93;
            i4 = iHashCode5;
            onExtraCallback = i13 % 128;
            iHashCode6 = i13 % 2 != 0 ? 1 : 0;
        } else {
            i4 = iHashCode5;
            iHashCode6 = l9.hashCode();
        }
        List<CreditTip> list = this.tips;
        int iHashCode17 = list == null ? 0 : list.hashCode();
        String str7 = this.bankCode;
        if (str7 != null) {
            int i14 = onExtraCallback + 95;
            onNavigationEvent = i14 % 128;
            if (i14 % 2 == 0) {
                str7.hashCode();
                throw null;
            }
            iHashCode7 = str7.hashCode();
        } else {
            iHashCode7 = i3;
        }
        return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode2) * 31) + iHashCode16) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + i4) * 31) + iHashCode6) * 31) + iHashCode17) * 31) + iHashCode7;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Card(id=" + this.id + ", type=" + this.type + ", organizationName=" + this.organizationName + ", shortenedOrganizationName=" + this.shortenedOrganizationName + ", iconUri=" + this.iconUri + ", openDate=" + this.openDate + ", referenceDate=" + this.referenceDate + ", limit=" + this.limit + ", cashLimit=" + this.cashLimit + ", lumpSumAmount=" + this.lumpSumAmount + ", installmentAmount=" + this.installmentAmount + ", cashAdvanceAmount=" + this.cashAdvanceAmount + ", overdueAmount=" + this.overdueAmount + ", usedAmount=" + this.usedAmount + ", creditUsedAmount=" + this.creditUsedAmount + ", tips=" + this.tips + ", bankCode=" + this.bankCode + ")";
        int i2 = onNavigationEvent + 85;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 15 / 0;
        }
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

        public final KSerializer<Card> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 43;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Card$$serializer card$$serializer = Card$$serializer.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Card$$serializer card$$serializer2 = Card$$serializer.INSTANCE;
            int i3 = IAuthTabCallback + 59;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return card$$serializer2;
        }
    }

    static {
        int i = onWarmupCompleted + 5;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ Card(int i, Long l, String str, String str2, String str3, String str4, String str5, String str6, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, List list, String str7, okycx okycxVar) {
        Object obj = null;
        if ((i & 1) == 0) {
            this.id = null;
        } else {
            this.id = l;
        }
        if ((i & 2) == 0) {
            this.type = null;
        } else {
            this.type = str;
        }
        if ((i & 4) == 0) {
            int i2 = onExtraCallback + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.organizationName = null;
        } else {
            this.organizationName = str2;
        }
        if ((i & 8) == 0) {
            this.shortenedOrganizationName = null;
        } else {
            this.shortenedOrganizationName = str3;
            int i4 = 2 % 2;
        }
        if ((i & 16) == 0) {
            this.iconUri = null;
        } else {
            this.iconUri = str4;
        }
        if ((i & 32) == 0) {
            this.openDate = null;
            int i5 = 2 % 2;
        } else {
            this.openDate = str5;
        }
        if ((i & 64) == 0) {
            int i6 = onNavigationEvent + 63;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            this.referenceDate = null;
            if (i7 != 0) {
                throw null;
            }
        } else {
            this.referenceDate = str6;
            int i8 = 2 % 2;
        }
        if ((i & 128) == 0) {
            this.limit = null;
        } else {
            this.limit = l2;
        }
        if ((i & 256) == 0) {
            this.cashLimit = null;
            int i9 = onExtraCallback + 81;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
        } else {
            this.cashLimit = l3;
        }
        if ((i & 512) == 0) {
            int i12 = onExtraCallback + 65;
            onNavigationEvent = i12 % 128;
            int i13 = i12 % 2;
            this.lumpSumAmount = null;
        } else {
            this.lumpSumAmount = l4;
        }
        if ((i & 1024) == 0) {
            this.installmentAmount = null;
        } else {
            this.installmentAmount = l5;
        }
        if ((i & 2048) == 0) {
            int i14 = onNavigationEvent + 83;
            onExtraCallback = i14 % 128;
            int i15 = i14 % 2;
            this.cashAdvanceAmount = null;
            if (i15 != 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            this.cashAdvanceAmount = l6;
            int i16 = onExtraCallback + 97;
            onNavigationEvent = i16 % 128;
            int i17 = i16 % 2;
            int i18 = 2 % 2;
        }
        if ((i & 4096) == 0) {
            this.overdueAmount = null;
        } else {
            this.overdueAmount = l7;
        }
        if ((i & 8192) == 0) {
            this.usedAmount = null;
        } else {
            this.usedAmount = l8;
        }
        if ((i & 16384) == 0) {
            int i19 = onExtraCallback + 107;
            onNavigationEvent = i19 % 128;
            int i20 = i19 % 2;
            this.creditUsedAmount = null;
        } else {
            this.creditUsedAmount = l9;
        }
        if ((32768 & i) == 0) {
            this.tips = null;
        } else {
            this.tips = list;
        }
        if ((i & 65536) != 0) {
            this.bankCode = str7;
            return;
        }
        int i21 = onNavigationEvent + 93;
        onExtraCallback = i21 % 128;
        int i22 = i21 % 2;
        this.bankCode = null;
        if (i22 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public Card(@Nullable Long l, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Long l2, @Nullable Long l3, @Nullable Long l4, @Nullable Long l5, @Nullable Long l6, @Nullable Long l7, @Nullable Long l8, @Nullable Long l9, @Nullable List<CreditTip> list, @Nullable String str7) {
        this.id = l;
        this.type = str;
        this.organizationName = str2;
        this.shortenedOrganizationName = str3;
        this.iconUri = str4;
        this.openDate = str5;
        this.referenceDate = str6;
        this.limit = l2;
        this.cashLimit = l3;
        this.lumpSumAmount = l4;
        this.installmentAmount = l5;
        this.cashAdvanceAmount = l6;
        this.overdueAmount = l7;
        this.usedAmount = l8;
        this.creditUsedAmount = l9;
        this.tips = list;
        this.bankCode = str7;
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 21;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return lazyArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016f  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onWarmupCompleted(Card card, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || card.id != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, oty1.onExtraCallback, card.id);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || card.type != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, card.type);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || card.organizationName != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, card.organizationName);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || card.shortenedOrganizationName != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, card.shortenedOrganizationName);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 4) || card.iconUri != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, card.iconUri);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 5) || card.openDate != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, card.openDate);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 6) || card.referenceDate != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, card.referenceDate);
            int i4 = onNavigationEvent + 29;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        Object obj = null;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 7)) {
            int i6 = onExtraCallback + 5;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                Long l = card.limit;
                obj.hashCode();
                throw null;
            }
            if (card.limit != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 7, oty1.onExtraCallback, card.limit);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 8)) {
            int i7 = onNavigationEvent + 103;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            if (card.cashLimit != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 8, oty1.onExtraCallback, card.cashLimit);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 9)) {
            int i9 = onNavigationEvent + 95;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            if (card.lumpSumAmount != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 9, oty1.onExtraCallback, card.lumpSumAmount);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 10) || card.installmentAmount != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 10, oty1.onExtraCallback, card.installmentAmount);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 11)) {
            int i11 = onNavigationEvent + 37;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
            if (card.cashAdvanceAmount != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 11, oty1.onExtraCallback, card.cashAdvanceAmount);
            }
        }
        if (!(!vylVar.onWarmupCompleted(serialDescriptor, 12)) || card.overdueAmount != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 12, oty1.onExtraCallback, card.overdueAmount);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 13)) {
            int i13 = onExtraCallback + 47;
            onNavigationEvent = i13 % 128;
            if (i13 % 2 == 0) {
                Long l2 = card.usedAmount;
                obj.hashCode();
                throw null;
            }
            if (card.usedAmount != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 13, oty1.onExtraCallback, card.usedAmount);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 14)) {
            int i14 = onNavigationEvent + 57;
            onExtraCallback = i14 % 128;
            int i15 = i14 % 2;
            if (card.creditUsedAmount != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 14, oty1.onExtraCallback, card.creditUsedAmount);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 15) || card.tips != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 15, (py) lazyArr[15].getValue(), card.tips);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 16) || card.bankCode != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 16, getWriggleLayout.onNavigationEvent, card.bankCode);
            int i16 = onExtraCallback + 79;
            onNavigationEvent = i16 % 128;
            int i17 = i16 % 2;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Card(Long l, String str, String str2, String str3, String str4, String str5, String str6, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, List list, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Long l10;
        String str8;
        String str9;
        String str10;
        String str11;
        Long l11;
        Long l12;
        Long l13;
        Long l14;
        Long l15;
        Long l16;
        List list2;
        String str12;
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 125;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            l10 = null;
        } else {
            l10 = l;
        }
        String str13 = (i & 2) != 0 ? null : str;
        if ((i & 4) != 0) {
            int i3 = onNavigationEvent + 35;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            str8 = null;
        } else {
            str8 = str2;
        }
        if ((i & 8) != 0) {
            int i4 = 2 % 2;
            str9 = null;
        } else {
            str9 = str3;
        }
        String str14 = (i & 16) != 0 ? null : str4;
        if ((i & 32) != 0) {
            int i5 = onNavigationEvent + 13;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            str10 = null;
        } else {
            str10 = str5;
        }
        if ((i & 64) != 0) {
            int i6 = onExtraCallback + 53;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 3 / 0;
            }
            int i8 = 2 % 2;
            str11 = null;
        } else {
            str11 = str6;
        }
        if ((i & 128) != 0) {
            int i9 = onExtraCallback + 125;
            onNavigationEvent = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 2 % 2;
            }
            l11 = null;
        } else {
            l11 = l2;
        }
        if ((i & 256) != 0) {
            int i11 = onExtraCallback + 111;
            onNavigationEvent = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            l12 = null;
        } else {
            l12 = l3;
        }
        if ((i & 512) != 0) {
            int i12 = onNavigationEvent + 61;
            onExtraCallback = i12 % 128;
            int i13 = i12 % 2;
            int i14 = 2 % 2;
            l13 = null;
        } else {
            l13 = l4;
        }
        Long l17 = (i & 1024) != 0 ? null : l5;
        if ((i & 2048) != 0) {
            int i15 = 2 % 2;
            l14 = null;
        } else {
            l14 = l6;
        }
        Long l18 = (i & 4096) != 0 ? null : l7;
        Long l19 = (i & 8192) != 0 ? null : l8;
        if ((i & 16384) != 0) {
            int i16 = onNavigationEvent + 3;
            l15 = l19;
            onExtraCallback = i16 % 128;
            int i17 = i16 % 2;
            l16 = null;
        } else {
            l15 = l19;
            l16 = l9;
        }
        List list3 = (32768 & i) != 0 ? null : list;
        if ((i & 65536) != 0) {
            int i18 = onExtraCallback + 51;
            list2 = list3;
            onNavigationEvent = i18 % 128;
            if (i18 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str12 = null;
        } else {
            list2 = list3;
            str12 = str7;
        }
        this(l10, str13, str8, str9, str14, str10, str11, l11, l12, l13, l17, l14, l18, l15, l16, list2, str12);
    }

    public final Long onTransact() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 103;
        onExtraCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        Long l = this.id;
        int i4 = i2 + 125;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return l;
        }
        obj.hashCode();
        throw null;
    }

    public final String writeTypedObject() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = this.type;
        if (i3 == 0) {
            int i4 = 87 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Card card = (Card) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 47;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = card.organizationName;
        if (i4 != 0) {
            int i5 = 58 / 0;
        }
        int i6 = i2 + 35;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Card card = (Card) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = card.shortenedOrganizationName;
        if (i4 == 0) {
            int i5 = 38 / 0;
        }
        int i6 = i3 + 99;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.iconUri;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.openDate;
        int i4 = i3 + 79;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 7;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.referenceDate;
        int i5 = i2 + 113;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Long asBinder() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.limit;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Card card = (Card) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 13;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        Long l = card.cashLimit;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 3;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return l;
        }
        obj.hashCode();
        throw null;
    }

    public final Long getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 51;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Long l = this.lumpSumAmount;
        int i4 = i2 + 79;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return l;
    }

    public final Long asInterface() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.installmentAmount;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        Long l = this.cashAdvanceAmount;
        int i5 = i3 + 11;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return l;
        }
        throw null;
    }

    public final Long access000() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.overdueAmount;
        }
        throw null;
    }

    public final Long ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 25;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Long l = this.usedAmount;
        int i4 = i2 + 13;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 94 / 0;
        }
        return l;
    }

    public final Long IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        Long l = this.creditUsedAmount;
        int i5 = i3 + 55;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return l;
    }

    public final List<CreditTip> readTypedObject() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 69;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        List<CreditTip> list = this.tips;
        int i5 = i2 + 23;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 81 / 0;
        }
        return list;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.bankCode;
        int i5 = i3 + 89;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean extraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zAreEqual = Intrinsics.areEqual(this.bankCode, checkNavigationBarByWindowManagerService.TOSS_BANK.getCode());
        int i4 = onExtraCallback + 81;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return zAreEqual;
    }

    private static final /* synthetic */ KSerializer onPostMessage() {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (KSerializer) IAuthTabCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[0], -1349215304, iIAuthTabCallback, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1349215305, SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
    }

    public final Long onExtraCallbackWithResult() {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (Long) IAuthTabCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{this}, 290658567, iIAuthTabCallback, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -290658564, SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
    }

    public final String access100() {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (String) IAuthTabCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{this}, 294166631, iIAuthTabCallback, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -294166631, SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
    }

    public final String extraCallbackWithResult() {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (String) IAuthTabCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{this}, 1986919122, iIAuthTabCallback, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -1986919120, SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
    }
}
