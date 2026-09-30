package o;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setIsFabric {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    @SerializedName("excluded")
    private boolean excluded;

    @SerializedName("hidden")
    private boolean hidden;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        if ((r7 instanceof o.setIsFabric) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        r7 = (o.setIsFabric) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        if (r6.hidden == r7.hidden) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
    
        if (r6.excluded == r7.excluded) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        r1 = r1 + 87;
        o.setIsFabric.onExtraCallbackWithResult = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 125;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 6 / 0;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        onNavigationEvent = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (Boolean.hashCode(this.hidden) >>> 54) >> Boolean.hashCode(this.excluded) : (Boolean.hashCode(this.hidden) * 31) + Boolean.hashCode(this.excluded);
        int i3 = onNavigationEvent + 89;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TimelineTransactionHiddenRespItem(hidden=" + this.hidden + ", excluded=" + this.excluded + ")";
        int i2 = onNavigationEvent + 59;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 52 / 0;
        }
        return str;
    }
}
