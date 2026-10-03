package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class convertToCase {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    @SerializedName("agreementRequired")
    private boolean agreementRequired;

    @SerializedName("needTransitionAgreement")
    private boolean needTransitionAgreement;

    /* JADX WARN: Illegal instructions before constructor call */
    public convertToCase() {
        boolean z = false;
        this(z, z, 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r7 instanceof o.convertToCase) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r2 = r2 + 113;
        o.convertToCase.onExtraCallback = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r7 = (o.convertToCase) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r6.needTransitionAgreement == r7.needTransitionAgreement) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        r2 = r2 + 71;
        o.convertToCase.onExtraCallback = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (r6.agreementRequired == r7.agreementRequired) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.convertToCase.onExtraCallback
            int r1 = r1 + 57
            int r2 = r1 % 128
            o.convertToCase.onNavigationEvent = r2
            int r1 = r1 % r0
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L16
            r1 = 69
            int r1 = r1 / r4
            if (r6 != r7) goto L19
            goto L18
        L16:
            if (r6 != r7) goto L19
        L18:
            return r3
        L19:
            boolean r1 = r7 instanceof o.convertToCase
            if (r1 != 0) goto L25
            int r2 = r2 + 113
            int r7 = r2 % 128
            o.convertToCase.onExtraCallback = r7
            int r2 = r2 % r0
            return r4
        L25:
            o.convertToCase r7 = (o.convertToCase) r7
            boolean r1 = r6.needTransitionAgreement
            boolean r5 = r7.needTransitionAgreement
            if (r1 == r5) goto L35
            int r2 = r2 + 71
            int r7 = r2 % 128
            o.convertToCase.onExtraCallback = r7
            int r2 = r2 % r0
            return r4
        L35:
            boolean r0 = r6.agreementRequired
            boolean r7 = r7.agreementRequired
            if (r0 == r7) goto L3c
            return r4
        L3c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.convertToCase.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (Boolean.hashCode(this.needTransitionAgreement) * 31) + Boolean.hashCode(this.agreementRequired);
        int i4 = onExtraCallback + 25;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OpenBankingTransition(needTransitionAgreement=" + this.needTransitionAgreement + ", agreementRequired=" + this.agreementRequired + ")";
        int i2 = onNavigationEvent + 71;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public convertToCase(boolean z, boolean z2) {
        this.needTransitionAgreement = z;
        this.agreementRequired = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ convertToCase(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 101;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 79;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            z = false;
        }
        if ((i & 2) != 0) {
            int i7 = onNavigationEvent + 9;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            z2 = false;
        }
        this(z, z2);
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.needTransitionAgreement;
        if (i3 == 0) {
            int i4 = 55 / 0;
        }
        return z;
    }

    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.agreementRequired;
        }
        throw null;
    }
}
