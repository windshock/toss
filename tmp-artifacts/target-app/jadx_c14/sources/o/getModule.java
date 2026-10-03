package o;

import com.google.gson.annotations.SerializedName;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getModule {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    @SerializedName("currentLocation")
    private final String currentLocation;

    @SerializedName("isDeliveredToMailbox")
    private final boolean isDeliveredToMailbox;

    @SerializedName("locatedAt")
    private final String locatedAt;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        if ((r6 instanceof o.getModule) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        r6 = (o.getModule) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.currentLocation, r6.currentLocation) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        r6 = o.getModule.onExtraCallbackWithResult + 81;
        o.getModule.onWarmupCompleted = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.locatedAt, r6.locatedAt) == true) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        r6 = o.getModule.onWarmupCompleted + 89;
        o.getModule.onExtraCallbackWithResult = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        if (r5.isDeliveredToMailbox == r6.isDeliveredToMailbox) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r2 = r2 + 29;
        o.getModule.onWarmupCompleted = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if ((r2 % 2) == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.getModule.onWarmupCompleted
            int r1 = r1 + 71
            int r2 = r1 % 128
            o.getModule.onExtraCallbackWithResult = r2
            int r1 = r1 % r0
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L16
            r1 = 71
            int r1 = r1 / r4
            if (r5 != r6) goto L23
            goto L18
        L16:
            if (r5 != r6) goto L23
        L18:
            int r2 = r2 + 29
            int r6 = r2 % 128
            o.getModule.onWarmupCompleted = r6
            int r2 = r2 % r0
            if (r2 == 0) goto L22
            return r4
        L22:
            return r3
        L23:
            boolean r1 = r6 instanceof o.getModule
            if (r1 != 0) goto L28
            return r4
        L28:
            o.getModule r6 = (o.getModule) r6
            java.lang.String r1 = r5.currentLocation
            java.lang.String r2 = r6.currentLocation
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L3e
            int r6 = o.getModule.onExtraCallbackWithResult
            int r6 = r6 + 81
            int r1 = r6 % 128
            o.getModule.onWarmupCompleted = r1
            int r6 = r6 % r0
            return r4
        L3e:
            java.lang.String r1 = r5.locatedAt
            java.lang.String r2 = r6.locatedAt
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 == r3) goto L52
            int r6 = o.getModule.onWarmupCompleted
            int r6 = r6 + 89
            int r1 = r6 % 128
            o.getModule.onExtraCallbackWithResult = r1
            int r6 = r6 % r0
            return r4
        L52:
            boolean r0 = r5.isDeliveredToMailbox
            boolean r6 = r6.isDeliveredToMailbox
            if (r0 == r6) goto L59
            return r4
        L59:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getModule.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.currentLocation.hashCode() * 31) + this.locatedAt.hashCode()) * 31) + Boolean.hashCode(this.isDeliveredToMailbox);
        int i4 = onExtraCallbackWithResult + 33;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TeensCardShippingInfo(currentLocation=" + this.currentLocation + ", locatedAt=" + this.locatedAt + ", isDeliveredToMailbox=" + this.isDeliveredToMailbox + ")";
        int i2 = onWarmupCompleted + 105;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.currentLocation;
        int i4 = i3 + 7;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.locatedAt;
        int i5 = i3 + 111;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
