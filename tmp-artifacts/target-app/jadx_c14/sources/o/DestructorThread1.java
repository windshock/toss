package o;

import com.google.gson.annotations.SerializedName;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DestructorThread1 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    @SerializedName("funnelId")
    private final long funnelId;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r9 instanceof o.DestructorThread1) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r1 = r1 + 49;
        o.DestructorThread1.onExtraCallback = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r8.funnelId == ((o.DestructorThread1) r9).funnelId) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        r3 = r3 + 47;
        o.DestructorThread1.onNavigationEvent = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        r3 = r3 + 89;
        o.DestructorThread1.onNavigationEvent = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if ((r3 % 2) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r8 == r9) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r8 == r9) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.DestructorThread1.onNavigationEvent
            int r2 = r1 + 111
            int r3 = r2 % 128
            o.DestructorThread1.onExtraCallback = r3
            int r2 = r2 % r0
            r4 = 1
            r5 = 0
            if (r2 != 0) goto L16
            r2 = 49
            int r2 = r2 / r5
            if (r8 != r9) goto L19
            goto L18
        L16:
            if (r8 != r9) goto L19
        L18:
            return r4
        L19:
            boolean r2 = r9 instanceof o.DestructorThread1
            if (r2 != 0) goto L25
            int r1 = r1 + 49
            int r9 = r1 % 128
            o.DestructorThread1.onExtraCallback = r9
            int r1 = r1 % r0
            return r5
        L25:
            o.DestructorThread1 r9 = (o.DestructorThread1) r9
            long r1 = r8.funnelId
            long r6 = r9.funnelId
            int r9 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r9 == 0) goto L37
            int r3 = r3 + 47
            int r9 = r3 % 128
            o.DestructorThread1.onNavigationEvent = r9
            int r3 = r3 % r0
            return r5
        L37:
            int r3 = r3 + 89
            int r9 = r3 % 128
            o.DestructorThread1.onNavigationEvent = r9
            int r3 = r3 % r0
            if (r3 != 0) goto L41
            return r4
        L41:
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DestructorThread1.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return Long.hashCode(this.funnelId);
        }
        Long.hashCode(this.funnelId);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TossOneUserTermsRequest(funnelId=" + this.funnelId + ")";
        int i2 = onExtraCallback + 13;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public DestructorThread1(long j) {
        this.funnelId = j;
    }
}
