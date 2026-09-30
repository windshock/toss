package o;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class r8lambdajFbCxNNG8M8fDJH5EMn4xraanAk {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("verifyId")
    private final long verifyId;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if ((r8 instanceof o.r8lambdajFbCxNNG8M8fDJH5EMn4xraanAk) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r7.verifyId == ((o.r8lambdajFbCxNNG8M8fDJH5EMn4xraanAk) r8).verifyId) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r7 == r8) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r7 == r8) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r2 = r2 + 115;
        o.r8lambdajFbCxNNG8M8fDJH5EMn4xraanAk.onNavigationEvent = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            int i4 = 98 / 0;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return Long.hashCode(this.verifyId);
        }
        Long.hashCode(this.verifyId);
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "VerifyRealNameResponse(verifyId=" + this.verifyId + ")";
        int i2 = onNavigationEvent + 43;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
