package o;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getJSCallInvokerHolderannotations {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    @SerializedName("resend")
    private final boolean resend;

    @SerializedName("unifiedId")
    private final long unifiedId;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        r9 = null;
        r9.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if ((r9 instanceof o.getJSCallInvokerHolderannotations) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        r9 = (o.getJSCallInvokerHolderannotations) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r8.resend == r9.resend) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
    
        if (r8.unifiedId == r9.unifiedId) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
    
        r3 = r3 + 23;
        o.getJSCallInvokerHolderannotations.onNavigationEvent = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r8 == r9) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r8 == r9) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r1 = r1 + 99;
        o.getJSCallInvokerHolderannotations.onExtraCallbackWithResult = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if ((r1 % 2) != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 25;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        if (i3 % 2 != 0) {
            int i5 = 16 / 0;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        onNavigationEvent = i2 % 128;
        int iHashCode = (i2 % 2 == 0 ? Boolean.hashCode(this.resend) * 66 : Boolean.hashCode(this.resend) * 31) + Long.hashCode(this.unifiedId);
        int i3 = onExtraCallbackWithResult + 31;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SendSmsResponse(resend=" + this.resend + ", unifiedId=" + this.unifiedId + ")";
        int i2 = onExtraCallbackWithResult + 73;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
