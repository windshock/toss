package o;

import com.google.gson.annotations.SerializedName;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class WebDialog3 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    @SerializedName("doc")
    private final String doc;

    @SerializedName("signId")
    private final long signId;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r9 instanceof o.WebDialog3) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r9 = (o.WebDialog3) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if (r8.signId == r9.signId) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.doc, r9.doc) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        r9 = o.WebDialog3.onExtraCallback + 1;
        o.WebDialog3.IAuthTabCallback = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        return true;
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
            int r1 = o.WebDialog3.onExtraCallback
            int r1 = r1 + 35
            int r2 = r1 % 128
            o.WebDialog3.IAuthTabCallback = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L16
            r1 = 72
            int r1 = r1 / r3
            if (r8 != r9) goto L19
            goto L18
        L16:
            if (r8 != r9) goto L19
        L18:
            return r2
        L19:
            boolean r1 = r9 instanceof o.WebDialog3
            if (r1 != 0) goto L1e
            return r3
        L1e:
            o.WebDialog3 r9 = (o.WebDialog3) r9
            long r4 = r8.signId
            long r6 = r9.signId
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L29
            return r3
        L29:
            java.lang.String r1 = r8.doc
            java.lang.String r9 = r9.doc
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r9)
            if (r9 != 0) goto L3c
            int r9 = o.WebDialog3.onExtraCallback
            int r9 = r9 + r2
            int r1 = r9 % 128
            o.WebDialog3.IAuthTabCallback = r1
            int r9 = r9 % r0
            return r3
        L3c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.WebDialog3.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        IAuthTabCallback = i2 % 128;
        return i2 % 2 == 0 ? (Long.hashCode(this.signId) + 52) << this.doc.hashCode() : (Long.hashCode(this.signId) * 31) + this.doc.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TossOneUserDocument(signId=" + this.signId + ", doc=" + this.doc + ")";
        int i2 = IAuthTabCallback + 71;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        long j = this.signId;
        int i5 = i3 + 35;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 51 / 0;
        }
        return j;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.doc;
        if (i3 != 0) {
            int i4 = 99 / 0;
        }
        return str;
    }
}
