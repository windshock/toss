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
public final class OverdueStatus {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private final String href;
    private final List<Overdue> items;
    private final String referenceDate;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.feature.credit.overview.network.response.OverdueStatus$$ExternalSyntheticLambda0
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 37;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallback = OverdueStatus.onExtraCallback();
            int i4 = onWarmupCompleted + 13;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return kSerializerOnExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    })};

    public OverdueStatus() {
        this((String) null, (String) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    private static final /* synthetic */ KSerializer asInterface() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(Overdue$$serializer.INSTANCE);
        int i2 = onExtraCallbackWithResult + 81;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return checkcanopenlandingpage;
        }
        throw null;
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerAsInterface = asInterface();
        int i4 = IAuthTabCallback + 121;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerAsInterface;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OverdueStatus)) {
            int i2 = onExtraCallbackWithResult + 115;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 25 / 0;
            }
            return false;
        }
        OverdueStatus overdueStatus = (OverdueStatus) obj;
        if (!Intrinsics.areEqual(this.referenceDate, overdueStatus.referenceDate) || !Intrinsics.areEqual(this.href, overdueStatus.href)) {
            return false;
        }
        if (Intrinsics.areEqual(this.items, overdueStatus.items)) {
            return true;
        }
        int i4 = onExtraCallbackWithResult + 109;
        IAuthTabCallback = i4 % 128;
        return i4 % 2 == 0;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.referenceDate;
        int iHashCode2 = 0;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i2 = IAuthTabCallback + 13;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 3;
            }
        }
        String str2 = this.href;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        List<Overdue> list = this.items;
        if (list != null) {
            int i4 = onExtraCallbackWithResult + 85;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                list.hashCode();
                throw null;
            }
            iHashCode2 = list.hashCode();
        }
        return (((iHashCode * 31) + iHashCode3) * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OverdueStatus(referenceDate=" + this.referenceDate + ", href=" + this.href + ", items=" + this.items + ")";
        int i2 = IAuthTabCallback + 87;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 16 / 0;
        }
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

        public final KSerializer<OverdueStatus> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 89;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            OverdueStatus$$serializer overdueStatus$$serializer = OverdueStatus$$serializer.INSTANCE;
            if (i3 != 0) {
                return overdueStatus$$serializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onExtraCallback + 55;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 2 / 0;
        }
    }

    public /* synthetic */ OverdueStatus(int i, String str, String str2, List list, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.referenceDate = null;
        } else {
            this.referenceDate = str;
            int i2 = IAuthTabCallback + 37;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        if ((i & 2) == 0) {
            int i5 = onExtraCallbackWithResult;
            int i6 = i5 + 115;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            this.href = null;
            int i8 = i5 + 123;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
        } else {
            this.href = str2;
        }
        if ((i & 4) == 0) {
            this.items = null;
        } else {
            this.items = list;
        }
    }

    public OverdueStatus(@Nullable String str, @Nullable String str2, @Nullable List<Overdue> list) {
        this.referenceDate = str;
        this.href = str2;
        this.items = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onNavigationEvent(OverdueStatus overdueStatus, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        Object obj = null;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i4 = IAuthTabCallback + 73;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                String str = overdueStatus.referenceDate;
                obj.hashCode();
                throw null;
            }
            if (overdueStatus.referenceDate != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, overdueStatus.referenceDate);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i5 = onExtraCallbackWithResult + 31;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                String str2 = overdueStatus.href;
                obj.hashCode();
                throw null;
            }
            if (overdueStatus.href != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, overdueStatus.href);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || overdueStatus.items != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, (py) lazyArr[2].getValue(), overdueStatus.items);
            int i6 = IAuthTabCallback + 49;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public static final /* synthetic */ Lazy[] onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 49;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 47;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return lazyArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OverdueStatus(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 63;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str = null;
        }
        str2 = (i & 2) != 0 ? null : str2;
        if ((i & 4) != 0) {
            int i5 = onExtraCallbackWithResult + 3;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            list = null;
        }
        this(str, str2, list);
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = this.referenceDate;
        if (i3 != 0) {
            int i4 = 60 / 0;
        }
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.href;
        }
        throw null;
    }

    public final List<Overdue> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        List<Overdue> list = this.items;
        int i5 = i3 + 13;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }
}
