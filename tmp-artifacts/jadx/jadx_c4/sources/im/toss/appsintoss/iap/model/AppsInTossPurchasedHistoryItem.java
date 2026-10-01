package im.toss.appsintoss.iap.model;

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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AppsInTossPurchasedHistoryItem {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;
    private final String appName;
    private final String itemName;
    private final String miniAppIconUrl;
    private final String orderId;
    private final String price;
    private final String productId;
    private final String txDate;
    private final String type;

    static {
        int i = onExtraCallbackWithResult + 69;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 27;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof AppsInTossPurchasedHistoryItem)) {
            int i4 = IAuthTabCallback + 45;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        AppsInTossPurchasedHistoryItem appsInTossPurchasedHistoryItem = (AppsInTossPurchasedHistoryItem) obj;
        if (!Intrinsics.areEqual(this.orderId, appsInTossPurchasedHistoryItem.orderId)) {
            int i6 = onWarmupCompleted + 117;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.miniAppIconUrl, appsInTossPurchasedHistoryItem.miniAppIconUrl)) {
            return Intrinsics.areEqual(this.itemName, appsInTossPurchasedHistoryItem.itemName) && Intrinsics.areEqual(this.productId, appsInTossPurchasedHistoryItem.productId) && Intrinsics.areEqual(this.appName, appsInTossPurchasedHistoryItem.appName) && !(Intrinsics.areEqual(this.price, appsInTossPurchasedHistoryItem.price) ^ true) && Intrinsics.areEqual(this.type, appsInTossPurchasedHistoryItem.type) && Intrinsics.areEqual(this.txDate, appsInTossPurchasedHistoryItem.txDate);
        }
        int i8 = IAuthTabCallback + 115;
        int i9 = i8 % 128;
        onWarmupCompleted = i9;
        int i10 = i8 % 2;
        int i11 = i9 + 113;
        IAuthTabCallback = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 51;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            this.orderId.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.orderId.hashCode();
        String str = this.miniAppIconUrl;
        if (str == null) {
            i = 0;
        } else {
            int iHashCode2 = str.hashCode();
            int i4 = IAuthTabCallback + 79;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            i = iHashCode2;
        }
        return (((((((((((((iHashCode * 31) + i) * 31) + this.itemName.hashCode()) * 31) + this.productId.hashCode()) * 31) + this.appName.hashCode()) * 31) + this.price.hashCode()) * 31) + this.type.hashCode()) * 31) + this.txDate.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AppsInTossPurchasedHistoryItem(orderId=" + this.orderId + ", miniAppIconUrl=" + this.miniAppIconUrl + ", itemName=" + this.itemName + ", productId=" + this.productId + ", appName=" + this.appName + ", price=" + this.price + ", type=" + this.type + ", txDate=" + this.txDate + ")";
        int i2 = onWarmupCompleted + 113;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AppsInTossPurchasedHistoryItem> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 83;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            AppsInTossPurchasedHistoryItem$$serializer appsInTossPurchasedHistoryItem$$serializer = AppsInTossPurchasedHistoryItem$$serializer.INSTANCE;
            if (i3 != 0) {
                return appsInTossPurchasedHistoryItem$$serializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ AppsInTossPurchasedHistoryItem(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, okycx okycxVar) {
        if (255 != (i & 255)) {
            int i2 = onWarmupCompleted + 7;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 255, AppsInTossPurchasedHistoryItem$$serializer.INSTANCE.getDescriptor());
            int i4 = onWarmupCompleted + 69;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        this.orderId = str;
        this.miniAppIconUrl = str2;
        this.itemName = str3;
        this.productId = str4;
        this.appName = str5;
        this.price = str6;
        this.type = str7;
        this.txDate = str8;
    }

    public AppsInTossPurchasedHistoryItem(@NotNull String str, @Nullable String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.orderId = str;
        this.miniAppIconUrl = str2;
        this.itemName = str3;
        this.productId = str4;
        this.appName = str5;
        this.price = str6;
        this.type = str7;
        this.txDate = str8;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(AppsInTossPurchasedHistoryItem appsInTossPurchasedHistoryItem, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, appsInTossPurchasedHistoryItem.orderId);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, appsInTossPurchasedHistoryItem.miniAppIconUrl);
        vylVar.onExtraCallback(serialDescriptor, 2, appsInTossPurchasedHistoryItem.itemName);
        vylVar.onExtraCallback(serialDescriptor, 3, appsInTossPurchasedHistoryItem.productId);
        vylVar.onExtraCallback(serialDescriptor, 4, appsInTossPurchasedHistoryItem.appName);
        vylVar.onExtraCallback(serialDescriptor, 5, appsInTossPurchasedHistoryItem.price);
        vylVar.onExtraCallback(serialDescriptor, 6, appsInTossPurchasedHistoryItem.type);
        vylVar.onExtraCallback(serialDescriptor, 7, appsInTossPurchasedHistoryItem.txDate);
        int i4 = onWarmupCompleted + 125;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 45 / 0;
        }
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 59;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.orderId;
        int i5 = i2 + 117;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.miniAppIconUrl;
        int i4 = i3 + 15;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 31;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.itemName;
        int i4 = i2 + 39;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 117;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.productId;
        int i5 = i2 + 79;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.appName;
        int i5 = i3 + 113;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.price;
        int i5 = i3 + 121;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 72 / 0;
        }
        return str;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.type;
        int i4 = i3 + 91;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.txDate;
        int i5 = i3 + 33;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
