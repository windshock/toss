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
import o.py;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SubstitutePaymentStatus {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final String href;
    private final List<SubstitutePayment> items;
    private final String referenceDate;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.feature.credit.overview.network.response.SubstitutePaymentStatus$$ExternalSyntheticLambda0
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 91;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallbackWithResult = SubstitutePaymentStatus.onExtraCallbackWithResult();
            int i4 = onExtraCallback + 119;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return kSerializerOnExtraCallbackWithResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }), null};

    public SubstitutePaymentStatus() {
        this((String) null, (List) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    private static final /* synthetic */ KSerializer asBinder() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(SubstitutePayment$$serializer.INSTANCE);
        int i2 = onWarmupCompleted + 73;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerAsBinder = asBinder();
        int i4 = onWarmupCompleted + 77;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerAsBinder;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 53;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof SubstitutePaymentStatus)) {
            int i4 = IAuthTabCallback + 115;
            int i5 = i4 % 128;
            onWarmupCompleted = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 29;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 == 0) {
                return false;
            }
            throw null;
        }
        SubstitutePaymentStatus substitutePaymentStatus = (SubstitutePaymentStatus) obj;
        if (!Intrinsics.areEqual(this.referenceDate, substitutePaymentStatus.referenceDate) || (!Intrinsics.areEqual(this.items, substitutePaymentStatus.items))) {
            return false;
        }
        if (Intrinsics.areEqual(this.href, substitutePaymentStatus.href)) {
            return true;
        }
        int i8 = IAuthTabCallback + 25;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.referenceDate;
        if (str == null) {
            int i2 = IAuthTabCallback + 23;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        List<SubstitutePayment> list = this.items;
        if (list == null) {
            int i4 = onWarmupCompleted + 125;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = list.hashCode();
        }
        String str2 = this.href;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SubstitutePaymentStatus(referenceDate=" + this.referenceDate + ", items=" + this.items + ", href=" + this.href + ")";
        int i2 = IAuthTabCallback + 97;
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

        public final KSerializer<SubstitutePaymentStatus> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 35;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            SubstitutePaymentStatus$$serializer substitutePaymentStatus$$serializer = SubstitutePaymentStatus$$serializer.INSTANCE;
            int i4 = onWarmupCompleted + 117;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return substitutePaymentStatus$$serializer;
            }
            throw null;
        }
    }

    static {
        int i = onNavigationEvent + 125;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ SubstitutePaymentStatus(int i, String str, List list, String str2, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.referenceDate = null;
        } else {
            this.referenceDate = str;
        }
        int i2 = 2 % 2;
        if ((i & 2) == 0) {
            int i3 = onWarmupCompleted + 27;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            this.items = null;
            if (i4 != 0) {
                throw null;
            }
        } else {
            this.items = list;
            int i5 = 2 % 2;
        }
        if ((i & 4) == 0) {
            int i6 = onWarmupCompleted + 69;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            this.href = null;
            return;
        }
        this.href = str2;
        int i8 = IAuthTabCallback + 93;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
    }

    public SubstitutePaymentStatus(@Nullable String str, @Nullable List<SubstitutePayment> list, @Nullable String str2) {
        this.referenceDate = str;
        this.items = list;
        this.href = str2;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 111;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return lazyArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onNavigationEvent(SubstitutePaymentStatus substitutePaymentStatus, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i2 = onWarmupCompleted + 85;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (substitutePaymentStatus.referenceDate != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, substitutePaymentStatus.referenceDate);
                int i4 = IAuthTabCallback + 107;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || substitutePaymentStatus.items != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, (py) lazyArr[1].getValue(), substitutePaymentStatus.items);
            int i6 = IAuthTabCallback + 81;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 3 % 5;
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || substitutePaymentStatus.href != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, substitutePaymentStatus.href);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SubstitutePaymentStatus(String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i3 = onWarmupCompleted + 119;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            list = null;
        }
        if ((i & 4) != 0) {
            int i5 = onWarmupCompleted + 63;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            str2 = null;
        }
        this(str, list, str2);
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 75;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.referenceDate;
        int i5 = i2 + 123;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 54 / 0;
        }
        return str;
    }

    public final List<SubstitutePayment> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        List<SubstitutePayment> list = this.items;
        int i5 = i3 + 101;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 68 / 0;
        }
        return list;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.href;
        if (i3 != 0) {
            int i4 = 23 / 0;
        }
        return str;
    }
}
