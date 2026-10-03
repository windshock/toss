package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getButtonBorderColor {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    @SerializedName("balance")
    private final long balance;

    public getButtonBorderColor() {
        this(0L, 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r10 instanceof o.getButtonBorderColor) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r2 = r2 + 77;
        o.getButtonBorderColor.IAuthTabCallback = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if ((r2 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
    
        return !r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        if (r9.balance == ((o.getButtonBorderColor) r10).balance) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        r10 = r2 + 51;
        o.getButtonBorderColor.IAuthTabCallback = r10 % 128;
        r10 = r10 % 2;
        r2 = r2 + 107;
        o.getButtonBorderColor.IAuthTabCallback = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r9 == r10) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r9 == r10) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.getButtonBorderColor.IAuthTabCallback
            int r1 = r1 + 53
            int r2 = r1 % 128
            o.getButtonBorderColor.onExtraCallback = r2
            int r1 = r1 % r0
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L16
            r1 = 53
            int r1 = r1 / r3
            if (r9 != r10) goto L19
            goto L18
        L16:
            if (r9 != r10) goto L19
        L18:
            return r4
        L19:
            boolean r1 = r10 instanceof o.getButtonBorderColor
            if (r1 != 0) goto L2b
            int r2 = r2 + 77
            int r10 = r2 % 128
            o.getButtonBorderColor.IAuthTabCallback = r10
            int r2 = r2 % r0
            if (r2 == 0) goto L27
            goto L28
        L27:
            r3 = r4
        L28:
            r10 = r3 ^ 1
            return r10
        L2b:
            o.getButtonBorderColor r10 = (o.getButtonBorderColor) r10
            long r5 = r9.balance
            long r7 = r10.balance
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 == 0) goto L44
            int r10 = r2 + 51
            int r1 = r10 % 128
            o.getButtonBorderColor.IAuthTabCallback = r1
            int r10 = r10 % r0
            int r2 = r2 + 107
            int r10 = r2 % 128
            o.getButtonBorderColor.IAuthTabCallback = r10
            int r2 = r2 % r0
            return r3
        L44:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getButtonBorderColor.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Long.hashCode(this.balance);
        int i4 = onExtraCallback + 91;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DepositWaitAccountInfo(balance=" + this.balance + ")";
        int i2 = IAuthTabCallback + 69;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 61 / 0;
        }
        return str;
    }

    public getButtonBorderColor(long j) {
        this.balance = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getButtonBorderColor(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 23;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 7;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            j = 0;
        }
        this(j);
    }

    public final long onWarmupCompleted() {
        long j;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 51;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            j = this.balance;
            int i4 = 3 / 0;
        } else {
            j = this.balance;
        }
        int i5 = i2 + 69;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }
}
