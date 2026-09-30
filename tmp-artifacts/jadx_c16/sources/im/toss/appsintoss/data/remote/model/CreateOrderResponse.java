package im.toss.appsintoss.data.remote.model;

import im.toss.appsintoss.data.remote.model.CreateOrderResponse$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CreateOrderResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final String orderId;
    private final String skuToPurchase;

    static {
        Object obj = null;
        int i = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof im.toss.appsintoss.data.remote.model.CreateOrderResponse) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r6 = r2 + 113;
        im.toss.appsintoss.data.remote.model.CreateOrderResponse.onExtraCallback = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if ((r6 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        r2 = r2 + 25;
        im.toss.appsintoss.data.remote.model.CreateOrderResponse.onExtraCallback = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if ((r2 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        r6 = null;
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.orderId, ((im.toss.appsintoss.data.remote.model.CreateOrderResponse) r6).orderId) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5.skuToPurchase, r6.skuToPurchase)) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        boolean z = true;
        if (i2 % 2 != 0) {
            int i4 = 59 / 0;
        }
    }

    public int hashCode() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onExtraCallback = i2 % 128;
        int iHashCode = 0;
        int iHashCode2 = (i2 % 2 != 0 ? (str = this.orderId) != null : (str = this.orderId) != null) ? str.hashCode() : 0;
        String str2 = this.skuToPurchase;
        if (str2 != null) {
            iHashCode = str2.hashCode();
            int i3 = onExtraCallback + 21;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 4 / 4;
            }
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CreateOrderResponse(orderId=" + this.orderId + ", skuToPurchase=" + this.skuToPurchase + ")";
        int i2 = onExtraCallback + 25;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ CreateOrderResponse(int i, String str, String str2, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 1;
        if (1 != (i & 1)) {
            int i3 = onExtraCallback + 75;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                descriptor = CreateOrderResponse$.serializer.INSTANCE.getDescriptor();
                i2 = 0;
            } else {
                descriptor = CreateOrderResponse$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
        }
        this.orderId = str;
        if ((i & 2) == 0) {
            this.skuToPurchase = null;
            int i4 = onExtraCallback + 109;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        this.skuToPurchase = str2;
        int i6 = onExtraCallback + 31;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002c A[PHI: r1
      0x002c: PHI (r1v5 o.getWriggleLayout) = (r1v4 o.getWriggleLayout), (r1v7 o.getWriggleLayout) binds: [B:8:0x002a, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(CreateOrderResponse createOrderResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        getWriggleLayout getwrigglelayout;
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            getwrigglelayout = getWriggleLayout.onNavigationEvent;
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, createOrderResponse.orderId);
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                if (createOrderResponse.skuToPurchase == null) {
                    return;
                }
            }
        } else {
            getwrigglelayout = getWriggleLayout.onNavigationEvent;
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, createOrderResponse.orderId);
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, createOrderResponse.skuToPurchase);
        int i3 = IAuthTabCallback + 123;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.orderId;
        if (i3 != 0) {
            int i4 = 98 / 0;
        }
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 53;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.skuToPurchase;
        int i5 = i3 + 121;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
