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
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.oty1;
import o.py;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class Overdue {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    private final String bankType;
    private final String iconUri;
    private final Long id;
    private final Long initialAmount;
    private final String openDate;
    private final String organizationName;
    private final Long remainAmount;
    private final List<CreditTip> tips;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.feature.credit.overview.network.response.Overdue$$ExternalSyntheticLambda0
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 105;
            onExtraCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                Overdue.onExtraCallback();
                obj.hashCode();
                throw null;
            }
            KSerializer kSerializerOnExtraCallback = Overdue.onExtraCallback();
            int i3 = onExtraCallback + 1;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                return kSerializerOnExtraCallback;
            }
            throw null;
        }
    })};

    public Overdue() {
        this((Long) null, (String) null, (String) null, (String) null, (Long) null, (Long) null, (String) null, (List) null, 255, (DefaultConstructorMarker) null);
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackStub() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(CreditTip$$serializer.INSTANCE);
        int i2 = onWarmupCompleted + 95;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return checkcanopenlandingpage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallbackStub = IAuthTabCallbackStub();
        int i4 = onWarmupCompleted + 11;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerIAuthTabCallbackStub;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i6;
        int i9 = ~(i7 | i8 | i);
        int i10 = ~i;
        int i11 = (~(i7 | i10)) | (~(i8 | i3 | i));
        int i12 = (~(i | i7)) | (~(i8 | i10));
        int i13 = i3 + i6 + i4 + ((-1255669517) * i5) + (533247121 * i2);
        int i14 = i13 * i13;
        int i15 = ((i3 * (-1895547823)) - 858849280) + ((-1895547823) * i6) + (i9 * (-204618832)) + (i11 * (-204618832)) + ((-204618832) * i12) + ((-2100166656) * i4) + (760610816 * i5) + ((-1057882112) * i2) + (1344208896 * i14);
        int i16 = ((i3 * (-122328301)) - 2132886715) + (i6 * (-122328301)) + (i9 * 272) + (i11 * 272) + (i12 * 272) + (i4 * (-122328029)) + (i5 * (-1196579527)) + (i2 * 656595923) + (i14 * 138215424);
        return i15 + ((i16 * i16) * (-833028096)) != 1 ? IAuthTabCallback(objArr) : onExtraCallback(objArr);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Overdue)) {
            int i2 = onWarmupCompleted + 91;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        Overdue overdue = (Overdue) obj;
        if (!Intrinsics.areEqual(this.id, overdue.id)) {
            int i4 = IAuthTabCallback + 105;
            onWarmupCompleted = i4 % 128;
            return i4 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.organizationName, overdue.organizationName)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.iconUri, overdue.iconUri)) {
            int i5 = onWarmupCompleted + 77;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.openDate, overdue.openDate) && Intrinsics.areEqual(this.initialAmount, overdue.initialAmount) && !(!Intrinsics.areEqual(this.remainAmount, overdue.remainAmount))) {
            if (!Intrinsics.areEqual(this.bankType, overdue.bankType)) {
                int i7 = onWarmupCompleted + 41;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.tips, overdue.tips)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Long l = this.id;
        int iHashCode5 = l == null ? 0 : l.hashCode();
        String str = this.organizationName;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        String str2 = this.iconUri;
        if (str2 == null) {
            int i4 = onWarmupCompleted + 99;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        String str3 = this.openDate;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        Long l2 = this.initialAmount;
        if (l2 == null) {
            int i6 = IAuthTabCallback + 15;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = l2.hashCode();
        }
        Long l3 = this.remainAmount;
        if (l3 == null) {
            int i8 = onWarmupCompleted + 107;
            IAuthTabCallback = i8 % 128;
            iHashCode3 = i8 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode3 = l3.hashCode();
        }
        String str4 = this.bankType;
        if (str4 == null) {
            iHashCode4 = 0;
        } else {
            iHashCode4 = str4.hashCode();
            int i9 = onWarmupCompleted + 69;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
        }
        List<CreditTip> list = this.tips;
        int iHashCode8 = (((((((((((((iHashCode5 * 31) + iHashCode6) * 31) + iHashCode) * 31) + iHashCode7) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (list != null ? list.hashCode() : 0);
        int i11 = onWarmupCompleted + 55;
        IAuthTabCallback = i11 % 128;
        if (i11 % 2 != 0) {
            return iHashCode8;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Overdue(id=" + this.id + ", organizationName=" + this.organizationName + ", iconUri=" + this.iconUri + ", openDate=" + this.openDate + ", initialAmount=" + this.initialAmount + ", remainAmount=" + this.remainAmount + ", bankType=" + this.bankType + ", tips=" + this.tips + ")";
        int i2 = onWarmupCompleted + 97;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<Overdue> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 89;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Overdue$$serializer overdue$$serializer = Overdue$$serializer.INSTANCE;
            int i4 = onExtraCallback + 27;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return overdue$$serializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 45;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ Overdue(int i, Long l, String str, String str2, String str3, Long l2, Long l3, String str4, List list, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.id = null;
        } else {
            this.id = l;
            int i2 = 2 % 2;
        }
        if ((i & 2) == 0) {
            this.organizationName = null;
        } else {
            this.organizationName = str;
            int i3 = IAuthTabCallback + 27;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = 2 % 2;
        if ((i & 4) == 0) {
            int i6 = IAuthTabCallback + 69;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            this.iconUri = null;
        } else {
            this.iconUri = str2;
        }
        if ((i & 8) == 0) {
            this.openDate = null;
            int i8 = 2 % 2;
        } else {
            this.openDate = str3;
        }
        if ((i & 16) == 0) {
            int i9 = onWarmupCompleted + 31;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            this.initialAmount = null;
            if (i10 == 0) {
                throw null;
            }
        } else {
            this.initialAmount = l2;
        }
        if ((i & 32) == 0) {
            this.remainAmount = null;
        } else {
            this.remainAmount = l3;
            int i11 = onWarmupCompleted + 3;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
            int i13 = 2 % 2;
        }
        if ((i & 64) == 0) {
            int i14 = IAuthTabCallback + 69;
            onWarmupCompleted = i14 % 128;
            int i15 = i14 % 2;
            this.bankType = null;
        } else {
            this.bankType = str4;
        }
        if ((i & 128) == 0) {
            this.tips = null;
        } else {
            this.tips = list;
        }
    }

    public Overdue(@Nullable Long l, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Long l2, @Nullable Long l3, @Nullable String str4, @Nullable List<CreditTip> list) {
        this.id = l;
        this.organizationName = str;
        this.iconUri = str2;
        this.openDate = str3;
        this.initialAmount = l2;
        this.remainAmount = l3;
        this.bankType = str4;
        this.tips = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onNavigationEvent(Overdue overdue, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || overdue.id != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, oty1.onExtraCallback, overdue.id);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || overdue.organizationName != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, overdue.organizationName);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || overdue.iconUri != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, overdue.iconUri);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || overdue.openDate != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, overdue.openDate);
        }
        if (!(!vylVar.onWarmupCompleted(serialDescriptor, 4))) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 4, oty1.onExtraCallback, overdue.initialAmount);
        } else {
            int i4 = onWarmupCompleted + 101;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            if (overdue.initialAmount != null) {
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 5)) {
            int i6 = onWarmupCompleted + 95;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            if (overdue.remainAmount != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 5, oty1.onExtraCallback, overdue.remainAmount);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 6)) {
            int i8 = IAuthTabCallback + 23;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            if (overdue.bankType != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, overdue.bankType);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 7) || overdue.tips != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 7, (py) lazyArr[7].getValue(), overdue.tips);
        }
    }

    public static final /* synthetic */ Lazy[] onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 11;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Overdue(Long l, String str, String str2, String str3, Long l2, Long l3, String str4, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Long l4;
        String str5;
        Long l5;
        String str6;
        List list2 = null;
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 1;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 90 / 0;
            }
            l4 = null;
        } else {
            l4 = l;
        }
        String str7 = (i & 2) != 0 ? null : str;
        String str8 = (i & 4) != 0 ? null : str2;
        if ((i & 8) != 0) {
            int i4 = IAuthTabCallback + 75;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 53 / 0;
            }
            int i6 = 2 % 2;
            str5 = null;
        } else {
            str5 = str3;
        }
        Long l6 = (i & 16) != 0 ? null : l2;
        if ((i & 32) != 0) {
            int i7 = 2 % 2;
            l5 = null;
        } else {
            l5 = l3;
        }
        if ((i & 64) != 0) {
            int i8 = onWarmupCompleted + 71;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 2 % 2;
            }
            str6 = null;
        } else {
            str6 = str4;
        }
        if ((i & 128) != 0) {
            int i10 = IAuthTabCallback + 109;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 2 % 2;
        } else {
            list2 = list;
        }
        this(l4, str7, str8, str5, l6, l5, str6, list2);
    }

    public final Long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Long l = this.id;
        if (i3 == 0) {
            int i4 = 33 / 0;
        }
        return l;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String str = this.organizationName;
        if (i3 != 0) {
            int i4 = 41 / 0;
        }
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 13;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.iconUri;
        int i4 = i2 + 125;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 103;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.openDate;
        int i5 = i2 + 7;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 1 / 0;
        }
        return str;
    }

    public final Long IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 33;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Long l = this.initialAmount;
        int i5 = i2 + 75;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return l;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Overdue overdue = (Overdue) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 115;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Long l = overdue.remainAmount;
        int i5 = i2 + 27;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return l;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Overdue overdue = (Overdue) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = overdue.bankType;
        if (i3 == 0) {
            int i4 = 23 / 0;
        }
        return str;
    }

    public final String IAuthTabCallback() {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (String) onNavigationEvent(iIAuthTabCallback, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -786763252, new Object[]{this}, iIAuthTabCallback2, iIAuthTabCallback3, 786763252);
    }

    public final Long asBinder() {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (Long) onNavigationEvent(iIAuthTabCallback, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 469262310, new Object[]{this}, iIAuthTabCallback2, iIAuthTabCallback3, -469262309);
    }
}
