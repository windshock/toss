package im.toss.appsintoss.data.remote.model;

import im.toss.appsintoss.data.remote.model.AppsInTossPurchaseHistoryListRequest$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AppsInTossPurchaseHistoryListRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String category;
    private final String key;
    private final String miniAppName;

    static {
        int i = onExtraCallback + 39;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsInTossPurchaseHistoryListRequest)) {
            return false;
        }
        AppsInTossPurchaseHistoryListRequest appsInTossPurchaseHistoryListRequest = (AppsInTossPurchaseHistoryListRequest) obj;
        if (!Intrinsics.areEqual(this.category, appsInTossPurchaseHistoryListRequest.category) || !Intrinsics.areEqual(this.miniAppName, appsInTossPurchaseHistoryListRequest.miniAppName)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.key, appsInTossPurchaseHistoryListRequest.key)) {
            int i3 = onExtraCallbackWithResult + 37;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = onExtraCallbackWithResult + 29;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.category;
        int iHashCode2 = 0;
        if (str == null) {
            int i2 = onExtraCallbackWithResult + 69;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.miniAppName;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.key;
        if (str3 != null) {
            int i4 = onNavigationEvent + 7;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = str3.hashCode();
            int i6 = onExtraCallbackWithResult + 29;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
        }
        return (((iHashCode * 31) + iHashCode3) * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AppsInTossPurchaseHistoryListRequest(category=" + this.category + ", miniAppName=" + this.miniAppName + ", key=" + this.key + ")";
        int i2 = onExtraCallbackWithResult + 27;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
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

        public final KSerializer<AppsInTossPurchaseHistoryListRequest> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 3;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                AppsInTossPurchaseHistoryListRequest$.serializer serializerVar = AppsInTossPurchaseHistoryListRequest$.serializer.INSTANCE;
                obj.hashCode();
                throw null;
            }
            AppsInTossPurchaseHistoryListRequest$.serializer serializerVar2 = AppsInTossPurchaseHistoryListRequest$.serializer.INSTANCE;
            int i3 = IAuthTabCallback + 65;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                return serializerVar2;
            }
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ AppsInTossPurchaseHistoryListRequest(int i, String str, String str2, String str3, okycx okycxVar) {
        if (7 != (i & 7)) {
            int i2 = onNavigationEvent + 11;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 7, AppsInTossPurchaseHistoryListRequest$.serializer.INSTANCE.getDescriptor());
            int i4 = onExtraCallbackWithResult + 77;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.category = str;
        this.miniAppName = str2;
        this.key = str3;
    }

    public AppsInTossPurchaseHistoryListRequest(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.category = str;
        this.miniAppName = str2;
        this.key = str3;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(AppsInTossPurchaseHistoryListRequest appsInTossPurchaseHistoryListRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, appsInTossPurchaseHistoryListRequest.category);
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, appsInTossPurchaseHistoryListRequest.miniAppName);
            vylVar.onExtraCallbackWithResult(serialDescriptor, 5, getwrigglelayout, appsInTossPurchaseHistoryListRequest.key);
        } else {
            getWriggleLayout getwrigglelayout2 = getWriggleLayout.onNavigationEvent;
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout2, appsInTossPurchaseHistoryListRequest.category);
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout2, appsInTossPurchaseHistoryListRequest.miniAppName);
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout2, appsInTossPurchaseHistoryListRequest.key);
        }
        int i3 = onExtraCallbackWithResult + 43;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
    }
}
