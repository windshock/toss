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
public final class GuaranteeStatus {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final String href;
    private final List<Guarantee> items;
    private final String referenceDate;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.feature.credit.overview.network.response.GuaranteeStatus$$ExternalSyntheticLambda0
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 125;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnNavigationEvent = GuaranteeStatus.onNavigationEvent();
            int i4 = onNavigationEvent + 61;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnNavigationEvent;
        }
    })};

    public GuaranteeStatus() {
        this((String) null, (String) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    private static final /* synthetic */ KSerializer asBinder() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(Guarantee$$serializer.INSTANCE);
        int i2 = onWarmupCompleted + 33;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return checkcanopenlandingpage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerAsBinder = asBinder();
        int i4 = IAuthTabCallback + 123;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 95 / 0;
        }
        return kSerializerAsBinder;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GuaranteeStatus)) {
            return false;
        }
        GuaranteeStatus guaranteeStatus = (GuaranteeStatus) obj;
        if (!Intrinsics.areEqual(this.referenceDate, guaranteeStatus.referenceDate) || (!Intrinsics.areEqual(this.href, guaranteeStatus.href))) {
            return false;
        }
        if (Intrinsics.areEqual(this.items, guaranteeStatus.items)) {
            return true;
        }
        int i4 = onWarmupCompleted + 17;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.referenceDate;
        int i2 = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.href;
        if (str2 == null) {
            int i3 = onWarmupCompleted + 61;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 125;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        List<Guarantee> list = this.items;
        if (list != null) {
            int i8 = IAuthTabCallback + 9;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            int iHashCode3 = list.hashCode();
            if (i9 == 0) {
                int i10 = 25 / 0;
            }
            i2 = iHashCode3;
        }
        return (((iHashCode2 * 31) + iHashCode) * 31) + i2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GuaranteeStatus(referenceDate=" + this.referenceDate + ", href=" + this.href + ", items=" + this.items + ")";
        int i2 = onWarmupCompleted + 49;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 13 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GuaranteeStatus> serializer() {
            GuaranteeStatus$$serializer guaranteeStatus$$serializer;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 53;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                guaranteeStatus$$serializer = GuaranteeStatus$$serializer.INSTANCE;
                int i3 = 67 / 0;
            } else {
                guaranteeStatus$$serializer = GuaranteeStatus$$serializer.INSTANCE;
            }
            int i4 = onNavigationEvent + 23;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return guaranteeStatus$$serializer;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 87;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ GuaranteeStatus(int i, String str, String str2, List list, okycx okycxVar) {
        Object obj = null;
        if ((i & 1) == 0) {
            this.referenceDate = null;
            int i2 = IAuthTabCallback + 11;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        } else {
            this.referenceDate = str;
        }
        if ((i & 2) == 0) {
            int i4 = IAuthTabCallback + 97;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            this.href = null;
            if (i5 == 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            this.href = str2;
        }
        if ((i & 4) != 0) {
            this.items = list;
            return;
        }
        int i6 = IAuthTabCallback + 111;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        this.items = null;
    }

    public GuaranteeStatus(@Nullable String str, @Nullable String str2, @Nullable List<Guarantee> list) {
        this.referenceDate = str;
        this.href = str2;
        this.items = list;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        Lazy<KSerializer<Object>>[] lazyArr;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            lazyArr = $childSerializers;
            int i4 = 24 / 0;
        } else {
            lazyArr = $childSerializers;
        }
        int i5 = i3 + 95;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(GuaranteeStatus guaranteeStatus, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || guaranteeStatus.referenceDate != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, guaranteeStatus.referenceDate);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || guaranteeStatus.href != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, guaranteeStatus.href);
            int i2 = onWarmupCompleted + 43;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i4 = IAuthTabCallback + 23;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 83 / 0;
                if (guaranteeStatus.items == null) {
                    return;
                }
            } else if (guaranteeStatus.items == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 2, (py) lazyArr[2].getValue(), guaranteeStatus.items);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ GuaranteeStatus(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 81;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i3 = 2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i4 = IAuthTabCallback + 53;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            str2 = null;
        }
        if ((i & 4) != 0) {
            int i5 = onWarmupCompleted + 79;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            int i6 = 2 % 2;
            list = null;
        }
        this(str, str2, list);
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 59;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.referenceDate;
        int i4 = i2 + 27;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.href;
        int i4 = i3 + 9;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final List<Guarantee> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        List<Guarantee> list = this.items;
        int i5 = i3 + 117;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }
}
