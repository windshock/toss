package im.toss.appsintoss.iap.model;

import im.toss.appsintoss.iap.model.AppsInTossPurchaseHistoryInfo$;
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
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AppsInTossPurchaseHistoryInfo {
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.appsintoss.iap.model.AppsInTossPurchaseHistoryInfo$$ExternalSyntheticLambda0
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 7;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                AppsInTossPurchaseHistoryInfo.onWarmupCompleted();
                throw null;
            }
            KSerializer kSerializerOnWarmupCompleted = AppsInTossPurchaseHistoryInfo.onWarmupCompleted();
            int i3 = onWarmupCompleted + 3;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return kSerializerOnWarmupCompleted;
            }
            obj.hashCode();
            throw null;
        }
    }), null, null};
    public static final int $stable = 0;
    public static final Companion Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final boolean hasNext;
    private final List<AppsInTossPurchasedHistoryItem> orders;
    private final String pageKey;

    private static final /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(AppsInTossPurchasedHistoryItem$$serializer.INSTANCE);
        int i2 = onNavigationEvent + 119;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return checkcanopenlandingpage;
        }
        throw null;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback();
        }
        IAuthTabCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsInTossPurchaseHistoryInfo)) {
            int i2 = IAuthTabCallback + 101;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        AppsInTossPurchaseHistoryInfo appsInTossPurchaseHistoryInfo = (AppsInTossPurchaseHistoryInfo) obj;
        if (!Intrinsics.areEqual(this.orders, appsInTossPurchaseHistoryInfo.orders)) {
            int i4 = IAuthTabCallback + 27;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.hasNext == appsInTossPurchaseHistoryInfo.hasNext) {
            return Intrinsics.areEqual(this.pageKey, appsInTossPurchaseHistoryInfo.pageKey);
        }
        int i6 = IAuthTabCallback + 99;
        onNavigationEvent = i6 % 128;
        return i6 % 2 == 0;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 119;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            this.orders.hashCode();
            Boolean.hashCode(this.hasNext);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.orders.hashCode();
        int iHashCode2 = Boolean.hashCode(this.hasNext);
        String str = this.pageKey;
        if (str == null) {
            i = 0;
        } else {
            int iHashCode3 = str.hashCode();
            int i4 = onNavigationEvent + 53;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            i = iHashCode3;
        }
        return (((iHashCode * 31) + iHashCode2) * 31) + i;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AppsInTossPurchaseHistoryInfo(orders=" + this.orders + ", hasNext=" + this.hasNext + ", pageKey=" + this.pageKey + ")";
        int i2 = IAuthTabCallback + 121;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AppsInTossPurchaseHistoryInfo> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 103;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            AppsInTossPurchaseHistoryInfo$.serializer serializerVar = AppsInTossPurchaseHistoryInfo$.serializer.INSTANCE;
            int i4 = onWarmupCompleted + 13;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onWarmupCompleted + 67;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public /* synthetic */ AppsInTossPurchaseHistoryInfo(int i, List list, boolean z, String str, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 7;
        if (7 != (i & 7)) {
            int i3 = onNavigationEvent + 21;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                descriptor = AppsInTossPurchaseHistoryInfo$.serializer.INSTANCE.getDescriptor();
                i2 = 24;
            } else {
                descriptor = AppsInTossPurchaseHistoryInfo$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = 2 % 2;
        }
        this.orders = list;
        this.hasNext = z;
        this.pageKey = str;
    }

    public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 59;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i4 = i2 + 51;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return lazyArr;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(AppsInTossPurchaseHistoryInfo appsInTossPurchaseHistoryInfo, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onNavigationEvent(serialDescriptor, 0, (py) $childSerializers[0].getValue(), appsInTossPurchaseHistoryInfo.orders);
        vylVar.onNavigationEvent(serialDescriptor, 1, appsInTossPurchaseHistoryInfo.hasNext);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, appsInTossPurchaseHistoryInfo.pageKey);
        int i4 = onNavigationEvent + 87;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final List<AppsInTossPurchasedHistoryItem> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 39;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        List<AppsInTossPurchasedHistoryItem> list = this.orders;
        int i5 = i2 + 13;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 63;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.pageKey;
        int i5 = i2 + 49;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
