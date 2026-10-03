package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CppSystemErrorException {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    @SerializedName("connectTo")
    private final get2BytesAsInt connectTo;

    @SerializedName("isRestrictionViolated")
    private final boolean isRestrictionViolated;

    @SerializedName("terms")
    private final List<accessgetALLcp> terms;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if ((!(r8 instanceof o.CppSystemErrorException)) == true) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r8 = (o.CppSystemErrorException) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if (r7.isRestrictionViolated == r8.isRestrictionViolated) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        r1 = r1 + 1;
        o.CppSystemErrorException.onNavigationEvent = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r7.connectTo == r8.connectTo) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        r3 = r3 + 117;
        o.CppSystemErrorException.onExtraCallbackWithResult = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r7.terms, r8.terms) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        r8 = o.CppSystemErrorException.onNavigationEvent + 113;
        o.CppSystemErrorException.onExtraCallbackWithResult = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        if ((r8 % 2) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r7 == r8) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r7 == r8) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.CppSystemErrorException.onExtraCallbackWithResult
            int r2 = r1 + 35
            int r3 = r2 % 128
            o.CppSystemErrorException.onNavigationEvent = r3
            int r2 = r2 % r0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L16
            r2 = 51
            int r2 = r2 / r4
            if (r7 != r8) goto L19
            goto L18
        L16:
            if (r7 != r8) goto L19
        L18:
            return r5
        L19:
            boolean r2 = r8 instanceof o.CppSystemErrorException
            r2 = r2 ^ r5
            if (r2 == r5) goto L53
            o.CppSystemErrorException r8 = (o.CppSystemErrorException) r8
            boolean r2 = r7.isRestrictionViolated
            boolean r6 = r8.isRestrictionViolated
            if (r2 == r6) goto L2d
            int r1 = r1 + r5
            int r8 = r1 % 128
            o.CppSystemErrorException.onNavigationEvent = r8
            int r1 = r1 % r0
            return r4
        L2d:
            o.get2BytesAsInt r1 = r7.connectTo
            o.get2BytesAsInt r2 = r8.connectTo
            if (r1 == r2) goto L3b
            int r3 = r3 + 117
            int r8 = r3 % 128
            o.CppSystemErrorException.onExtraCallbackWithResult = r8
            int r3 = r3 % r0
            return r4
        L3b:
            java.util.List<o.accessgetALLcp> r1 = r7.terms
            java.util.List<o.accessgetALLcp> r8 = r8.terms
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r8)
            if (r8 != 0) goto L52
            int r8 = o.CppSystemErrorException.onNavigationEvent
            int r8 = r8 + 113
            int r1 = r8 % 128
            o.CppSystemErrorException.onExtraCallbackWithResult = r1
            int r8 = r8 % r0
            if (r8 != 0) goto L51
            return r5
        L51:
            return r4
        L52:
            return r5
        L53:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.CppSystemErrorException.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((Boolean.hashCode(this.isRestrictionViolated) * 31) + this.connectTo.hashCode()) * 31) + this.terms.hashCode();
        int i4 = onExtraCallbackWithResult + 39;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TossOneUserTermsResponse(isRestrictionViolated=" + this.isRestrictionViolated + ", connectTo=" + this.connectTo + ", terms=" + this.terms + ")";
        int i2 = onExtraCallbackWithResult + 53;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final get2BytesAsInt IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        get2BytesAsInt get2bytesasint = this.connectTo;
        int i5 = i3 + 75;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return get2bytesasint;
    }

    public final List<accessgetALLcp> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.terms;
        }
        throw null;
    }
}
