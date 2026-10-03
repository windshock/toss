package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class jniCallJSCallback {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final getNameFromAnnotation status;

    /* JADX WARN: Illegal instructions before constructor call */
    public jniCallJSCallback() {
        getNameFromAnnotation getnamefromannotation = null;
        this(getnamefromannotation, 1, getnamefromannotation);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 55;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof jniCallJSCallback)) {
            int i4 = onWarmupCompleted + 69;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.status == ((jniCallJSCallback) obj).status) {
            return true;
        }
        int i6 = onExtraCallbackWithResult + 5;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 96 / 0;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        return r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r2 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r2 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1 = r1 + 7;
        o.jniCallJSCallback.onWarmupCompleted = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.jniCallJSCallback.onExtraCallbackWithResult
            int r2 = r1 + 105
            int r3 = r2 % 128
            o.jniCallJSCallback.onWarmupCompleted = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 != 0) goto L17
            o.getNameFromAnnotation r2 = r5.status
            r4 = 99
            int r4 = r4 / r3
            if (r2 != 0) goto L23
            goto L1b
        L17:
            o.getNameFromAnnotation r2 = r5.status
            if (r2 != 0) goto L23
        L1b:
            int r1 = r1 + 7
            int r2 = r1 % 128
            o.jniCallJSCallback.onWarmupCompleted = r2
            int r1 = r1 % r0
            return r3
        L23:
            int r0 = r2.hashCode()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.jniCallJSCallback.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GuestGuardianCertifyStatusResponse(status=" + this.status + ")";
        int i2 = onWarmupCompleted + 91;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public jniCallJSCallback(@Nullable getNameFromAnnotation getnamefromannotation) {
        this.status = getnamefromannotation;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ jniCallJSCallback(getNameFromAnnotation getnamefromannotation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 33;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i4 = i2 + 3;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            getnamefromannotation = null;
        }
        this(getnamefromannotation);
    }

    public final getNameFromAnnotation onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 17;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        getNameFromAnnotation getnamefromannotation = this.status;
        int i4 = i2 + 17;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return getnamefromannotation;
    }
}
