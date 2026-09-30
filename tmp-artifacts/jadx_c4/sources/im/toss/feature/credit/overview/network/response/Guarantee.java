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
public final class Guarantee {
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.feature.credit.overview.network.response.Guarantee$$ExternalSyntheticLambda0
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 113;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnWarmupCompleted = Guarantee.onWarmupCompleted();
            int i4 = onWarmupCompleted + 19;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 31 / 0;
            }
            return kSerializerOnWarmupCompleted;
        }
    })};
    public static final Companion Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final Long amount;
    private final String contractDate;
    private final String iconUri;
    private final Long id;
    private final String organizationName;
    private final List<CreditTip> tips;

    public Guarantee() {
        this((Long) null, (String) null, (String) null, (String) null, (Long) null, (List) null, 63, (DefaultConstructorMarker) null);
    }

    private static final /* synthetic */ KSerializer onTransact() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(CreditTip$$serializer.INSTANCE);
        int i2 = onExtraCallback + 23;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 53;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnTransact = onTransact();
        int i4 = IAuthTabCallback + 95;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnTransact;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 77;
            onExtraCallback = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof Guarantee)) {
            int i3 = onExtraCallback + 67;
            IAuthTabCallback = i3 % 128;
            return i3 % 2 != 0;
        }
        Guarantee guarantee = (Guarantee) obj;
        if (!Intrinsics.areEqual(this.id, guarantee.id)) {
            int i4 = onExtraCallback + 105;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.organizationName, guarantee.organizationName)) {
            int i6 = onExtraCallback + 123;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.iconUri, guarantee.iconUri) || !Intrinsics.areEqual(this.contractDate, guarantee.contractDate) || !Intrinsics.areEqual(this.amount, guarantee.amount)) {
            return false;
        }
        if (Intrinsics.areEqual(this.tips, guarantee.tips)) {
            return true;
        }
        int i8 = IAuthTabCallback + 115;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c A[PHI: r1 r3
      0x001c: PHI (r1v17 java.lang.Long) = (r1v4 java.lang.Long), (r1v19 java.lang.Long) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]
      0x001c: PHI (r3v8 int) = (r3v0 int), (r3v9 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a A[PHI: r3
      0x001a: PHI (r3v1 int) = (r3v0 int), (r3v9 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int hashCode() {
        Long l;
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            l = this.id;
            iHashCode = 1;
            if (l == null) {
                iHashCode2 = 0;
            } else {
                iHashCode2 = l.hashCode();
                int i3 = onExtraCallback + 7;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
            }
        } else {
            l = this.id;
            iHashCode = 0;
            if (l == null) {
            }
        }
        String str = this.organizationName;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.iconUri;
        if (str2 == null) {
            int i5 = IAuthTabCallback + 31;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str2.hashCode();
        }
        String str3 = this.contractDate;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        Long l2 = this.amount;
        int iHashCode6 = l2 != null ? l2.hashCode() : 0;
        List<CreditTip> list = this.tips;
        if (list != null) {
            int i7 = onExtraCallback + 11;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 != 0) {
                list.hashCode();
                throw null;
            }
            iHashCode = list.hashCode();
        }
        return (((((((((iHashCode2 * 31) + iHashCode4) * 31) + iHashCode3) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Guarantee(id=" + this.id + ", organizationName=" + this.organizationName + ", iconUri=" + this.iconUri + ", contractDate=" + this.contractDate + ", amount=" + this.amount + ", tips=" + this.tips + ")";
        int i2 = IAuthTabCallback + 57;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 90 / 0;
        }
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

        public final KSerializer<Guarantee> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 27;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Guarantee$$serializer guarantee$$serializer = Guarantee$$serializer.INSTANCE;
            int i4 = onExtraCallback + 77;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return guarantee$$serializer;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onExtraCallbackWithResult + 69;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public /* synthetic */ Guarantee(int i, Long l, String str, String str2, String str3, Long l2, List list, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.id = null;
        } else {
            this.id = l;
        }
        int i2 = 2 % 2;
        if ((i & 2) == 0) {
            int i3 = IAuthTabCallback + 107;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            this.organizationName = null;
        } else {
            this.organizationName = str;
        }
        if ((i & 4) == 0) {
            this.iconUri = null;
        } else {
            this.iconUri = str2;
            int i5 = 2 % 2;
        }
        if ((i & 8) == 0) {
            this.contractDate = null;
            int i6 = 2 % 2;
        } else {
            this.contractDate = str3;
        }
        if ((i & 16) == 0) {
            int i7 = onExtraCallback + 125;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            this.amount = null;
            int i9 = 2 % 2;
        } else {
            this.amount = l2;
        }
        if ((i & 32) == 0) {
            this.tips = null;
        } else {
            this.tips = list;
        }
    }

    public Guarantee(@Nullable Long l, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Long l2, @Nullable List<CreditTip> list) {
        this.id = l;
        this.organizationName = str;
        this.iconUri = str2;
        this.contractDate = str3;
        this.amount = l2;
        this.tips = list;
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 71;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024 A[PHI: r1
      0x0024: PHI (r1v7 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v8 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x001e, B:10:0x0022, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r1
      0x0020: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v8 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x001e, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onWarmupCompleted(Guarantee guarantee, vyl vylVar, SerialDescriptor serialDescriptor) {
        Lazy<KSerializer<Object>>[] lazyArr;
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                if (guarantee.id != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 0, oty1.onExtraCallback, guarantee.id);
                }
            }
        } else {
            lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || guarantee.organizationName != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, guarantee.organizationName);
        }
        if (!(!vylVar.onWarmupCompleted(serialDescriptor, 2))) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, guarantee.iconUri);
        } else {
            int i3 = onExtraCallback + 65;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            if (guarantee.iconUri != null) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || guarantee.contractDate != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, guarantee.contractDate);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 4) || guarantee.amount != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 4, oty1.onExtraCallback, guarantee.amount);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 5)) {
            int i5 = onExtraCallback + 47;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            if (guarantee.tips == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 5, (py) lazyArr[5].getValue(), guarantee.tips);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Guarantee(Long l, String str, String str2, String str3, Long l2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Long l3;
        List list2 = null;
        if ((i & 1) != 0) {
            int i2 = onExtraCallback + 101;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 91 / 0;
            }
            int i4 = 2 % 2;
            l = null;
        }
        String str4 = (i & 2) != 0 ? null : str;
        String str5 = (i & 4) != 0 ? null : str2;
        String str6 = (i & 8) != 0 ? null : str3;
        if ((i & 16) != 0) {
            int i5 = IAuthTabCallback + 23;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 3 % 2;
            } else {
                int i7 = 2 % 2;
            }
            l3 = null;
        } else {
            l3 = l2;
        }
        if ((i & 32) != 0) {
            int i8 = onExtraCallback + 31;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 != 0) {
                list2.hashCode();
                throw null;
            }
        } else {
            list2 = list;
        }
        this(l, str4, str5, str6, l3, list2);
    }

    public final Long IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 95;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Long l = this.id;
        int i4 = i2 + 99;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return l;
        }
        throw null;
    }

    public final String asInterface() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 37;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.organizationName;
            int i4 = 91 / 0;
        } else {
            str = this.organizationName;
        }
        int i5 = i2 + 61;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.iconUri;
        int i5 = i3 + 11;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.contractDate;
        int i5 = i3 + 49;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Long onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 25;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Long l = this.amount;
        int i5 = i2 + 59;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return l;
        }
        throw null;
    }
}
