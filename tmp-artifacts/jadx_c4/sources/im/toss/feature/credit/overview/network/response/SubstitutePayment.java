package im.toss.feature.credit.overview.network.response;

import com.google.android.gms.internal.ads.zzgc;
import java.util.List;
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
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.oty1;
import o.py;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SubstitutePayment {
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.feature.credit.overview.network.response.SubstitutePayment$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 3;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallbackWithResult = SubstitutePayment.onExtraCallbackWithResult();
            int i4 = onNavigationEvent + 111;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 64 / 0;
            }
            return kSerializerOnExtraCallbackWithResult;
        }
    })};
    public static final Companion Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    private final String createdAt;
    private final String dueDate;
    private final String iconUri;
    private final Long id;
    private final String organizationName;
    private final Long remainAmount;
    private final Long repaidAmount;
    private final List<CreditTip> tips;

    public SubstitutePayment() {
        this((Long) null, (String) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, (List) null, 255, (DefaultConstructorMarker) null);
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackDefault() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(CreditTip$$serializer.INSTANCE);
        int i2 = onExtraCallbackWithResult + 43;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~(i | i4 | i2);
        int i8 = ~i;
        int i9 = ~i4;
        int i10 = ~(i8 | i9);
        int i11 = ~i2;
        int i12 = (~(i8 | i11)) | i10 | (~(i9 | i11));
        int i13 = i11 | i10;
        int i14 = i + i4 + i3 + (105149790 * i6) + ((-719480883) * i5);
        int i15 = i14 * i14;
        int i16 = (i * (-424837635)) + 281018368 + ((-424837635) * i4) + (1798143484 * i7) + (i12 * (-1798143484)) + ((-1798143484) * i13) + (2071986176 * i3) + ((-654311424) * i6) + (1702887424 * i5) + ((-155189248) * i15);
        int i17 = (i * 910058005) + 1460508013 + (i4 * 910058005) + (i7 * (-484)) + (i12 * 484) + (i13 * 484) + (i3 * 910058489) + (i6 * (-759332242)) + (i5 * (-1121784475)) + (i15 * 1086324736);
        return i16 + ((i17 * i17) * (-1925185536)) != 1 ? onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr);
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        int i4 = onExtraCallbackWithResult + 55;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerIAuthTabCallbackDefault;
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
        if (!(obj instanceof SubstitutePayment)) {
            int i2 = onExtraCallbackWithResult + 25;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        SubstitutePayment substitutePayment = (SubstitutePayment) obj;
        if (!Intrinsics.areEqual(this.id, substitutePayment.id) || !Intrinsics.areEqual(this.organizationName, substitutePayment.organizationName) || !Intrinsics.areEqual(this.repaidAmount, substitutePayment.repaidAmount)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.remainAmount, substitutePayment.remainAmount)) {
            int i4 = onExtraCallbackWithResult + 13;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.createdAt, substitutePayment.createdAt)) {
            int i6 = onExtraCallbackWithResult + 47;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.iconUri, substitutePayment.iconUri)) {
            return Intrinsics.areEqual(this.dueDate, substitutePayment.dueDate) && Intrinsics.areEqual(this.tips, substitutePayment.tips);
        }
        int i8 = onExtraCallbackWithResult + 107;
        onExtraCallback = i8 % 128;
        if (i8 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        Long l = this.id;
        int iHashCode4 = 0;
        if (l == null) {
            int i2 = onExtraCallbackWithResult + 81;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 19;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = l.hashCode();
        }
        String str = this.organizationName;
        if (str == null) {
            int i7 = onExtraCallback + 117;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str.hashCode();
        }
        Long l2 = this.repaidAmount;
        int iHashCode5 = l2 == null ? 0 : l2.hashCode();
        Long l3 = this.remainAmount;
        int iHashCode6 = l3 == null ? 0 : l3.hashCode();
        String str2 = this.createdAt;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.iconUri;
        if (str3 == null) {
            int i9 = onExtraCallbackWithResult + 99;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str3.hashCode();
        }
        String str4 = this.dueDate;
        int iHashCode8 = str4 == null ? 0 : str4.hashCode();
        List<CreditTip> list = this.tips;
        if (list != null) {
            int i11 = onExtraCallback + 5;
            onExtraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
            iHashCode4 = list.hashCode();
        }
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode3) * 31) + iHashCode8) * 31) + iHashCode4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SubstitutePayment(id=" + this.id + ", organizationName=" + this.organizationName + ", repaidAmount=" + this.repaidAmount + ", remainAmount=" + this.remainAmount + ", createdAt=" + this.createdAt + ", iconUri=" + this.iconUri + ", dueDate=" + this.dueDate + ", tips=" + this.tips + ")";
        int i2 = onExtraCallback + 101;
        onExtraCallbackWithResult = i2 % 128;
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

        public final KSerializer<SubstitutePayment> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 95;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            SubstitutePayment$$serializer substitutePayment$$serializer = SubstitutePayment$$serializer.INSTANCE;
            if (i3 == 0) {
                int i4 = 33 / 0;
            }
            return substitutePayment$$serializer;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = IAuthTabCallback + 123;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public /* synthetic */ SubstitutePayment(int i, Long l, String str, Long l2, Long l3, String str2, String str3, String str4, List list, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.id = null;
            int i2 = onExtraCallbackWithResult + 27;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        } else {
            this.id = l;
        }
        if ((i & 2) == 0) {
            this.organizationName = null;
        } else {
            this.organizationName = str;
            int i4 = 2 % 2;
        }
        if ((i & 4) == 0) {
            int i5 = onExtraCallback + 111;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            this.repaidAmount = null;
        } else {
            this.repaidAmount = l2;
        }
        if ((i & 8) == 0) {
            this.remainAmount = null;
        } else {
            this.remainAmount = l3;
        }
        if ((i & 16) == 0) {
            int i7 = onExtraCallbackWithResult + 95;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            this.createdAt = null;
            if (i8 == 0) {
                int i9 = 17 / 0;
            }
        } else {
            this.createdAt = str2;
        }
        if ((i & 32) == 0) {
            int i10 = onExtraCallbackWithResult + 95;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            this.iconUri = null;
        } else {
            this.iconUri = str3;
            int i12 = 2 % 2;
        }
        if ((i & 64) == 0) {
            this.dueDate = null;
        } else {
            this.dueDate = str4;
            int i13 = 2 % 2;
        }
        if ((i & 128) != 0) {
            this.tips = list;
            return;
        }
        this.tips = null;
        int i14 = onExtraCallback + 71;
        onExtraCallbackWithResult = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
    }

    public SubstitutePayment(@Nullable Long l, @Nullable String str, @Nullable Long l2, @Nullable Long l3, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable List<CreditTip> list) {
        this.id = l;
        this.organizationName = str;
        this.repaidAmount = l2;
        this.remainAmount = l3;
        this.createdAt = str2;
        this.iconUri = str3;
        this.dueDate = str4;
        this.tips = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(SubstitutePayment substitutePayment, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || substitutePayment.id != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, oty1.onExtraCallback, substitutePayment.id);
            int i4 = onExtraCallback + 83;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 / 2;
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i6 = onExtraCallbackWithResult + 27;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            if (substitutePayment.organizationName != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, substitutePayment.organizationName);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || substitutePayment.repaidAmount != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, oty1.onExtraCallback, substitutePayment.repaidAmount);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || substitutePayment.remainAmount != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 3, oty1.onExtraCallback, substitutePayment.remainAmount);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 4)) {
            int i8 = onExtraCallback + 31;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 85 / 0;
                if (substitutePayment.createdAt != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, substitutePayment.createdAt);
                }
            } else if (substitutePayment.createdAt != null) {
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 5)) {
            int i10 = onExtraCallbackWithResult + 1;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            String str = substitutePayment.iconUri;
            if (i11 == 0) {
                int i12 = 79 / 0;
                if (str != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, substitutePayment.iconUri);
                }
            } else if (str != null) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 6) || substitutePayment.dueDate != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, substitutePayment.dueDate);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 7) || substitutePayment.tips != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 7, (py) lazyArr[7].getValue(), substitutePayment.tips);
        }
    }

    public static final /* synthetic */ Lazy[] onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 35;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 93;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SubstitutePayment(Long l, String str, Long l2, Long l3, String str2, String str3, String str4, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Long l4;
        Long l5;
        String str5;
        String str6;
        List list2 = null;
        if ((i & 1) != 0) {
            int i2 = onExtraCallback + 105;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            l4 = null;
        } else {
            l4 = l;
        }
        String str7 = (i & 2) != 0 ? null : str;
        if ((i & 4) != 0) {
            int i5 = 2 % 2;
            l5 = null;
        } else {
            l5 = l2;
        }
        Long l6 = (i & 8) != 0 ? null : l3;
        if ((i & 16) != 0) {
            int i6 = 2 % 2;
            str5 = null;
        } else {
            str5 = str2;
        }
        String str8 = (i & 32) != 0 ? null : str3;
        if ((i & 64) != 0) {
            int i7 = onExtraCallbackWithResult + 121;
            onExtraCallback = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 2 % 2;
            }
            str6 = null;
        } else {
            str6 = str4;
        }
        if ((i & 128) != 0) {
            int i9 = onExtraCallback + 63;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
        } else {
            list2 = list;
        }
        this(l4, str7, l5, l6, str5, str8, str6, list2);
    }

    public final Long asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 27;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Long l = this.id;
        int i4 = i2 + 99;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 85 / 0;
        }
        return l;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.organizationName;
        int i5 = i3 + 47;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final Long asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 43;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Long l = this.repaidAmount;
        int i5 = i2 + 97;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return l;
    }

    public final Long IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.remainAmount;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        SubstitutePayment substitutePayment = (SubstitutePayment) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 53;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = substitutePayment.createdAt;
        int i5 = i2 + 25;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.iconUri;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        SubstitutePayment substitutePayment = (SubstitutePayment) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = substitutePayment.dueDate;
        int i5 = i3 + 115;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onNavigationEvent() {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzgc.onExtraCallbackWithResult();
        return (String) onExtraCallback(-1618520075, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, 1618520076, zzgc.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult3);
    }

    public final String onExtraCallback() {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzgc.onExtraCallbackWithResult();
        return (String) onExtraCallback(-1217737959, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, 1217737959, zzgc.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult3);
    }
}
