package o;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getNativeMethodCallInvokerHolder extends hasRunJSBundle {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    @SerializedName("carrier")
    private final startScroll carrier;

    @SerializedName(PKCS12.KEY_PHONE)
    private final String phone;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if ((!(r6 instanceof o.getNativeMethodCallInvokerHolder)) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        r6 = (o.getNativeMethodCallInvokerHolder) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        if (r5.carrier == r6.carrier) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.phone, r6.phone) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        r6 = o.getNativeMethodCallInvokerHolder.onWarmupCompleted + 67;
        o.getNativeMethodCallInvokerHolder.onNavigationEvent = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
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
        int i2 = onWarmupCompleted + 105;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 44 / 0;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.carrier.hashCode() * 31) + this.phone.hashCode();
        int i4 = onWarmupCompleted + 75;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PrepareArsRequest(carrier=" + this.carrier + ", phone=" + this.phone + ")";
        int i2 = onWarmupCompleted + 111;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
