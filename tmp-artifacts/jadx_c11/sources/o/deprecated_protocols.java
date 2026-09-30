package o;

import kotlin.ranges.RangesKt;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class deprecated_protocols {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final double IAuthTabCallback;
    private final double onWarmupCompleted;

    public deprecated_protocols(double d, double d2) {
        this.onWarmupCompleted = d;
        this.IAuthTabCallback = d2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0053, code lost:
    
        if ((r2 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0055, code lost:
    
        r1 = 89 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0059, code lost:
    
        return r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
    
        if (r16 != 1.0d) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
    
        r2 = o.deprecated_protocols.onNavigationEvent + 1;
        o.deprecated_protocols.onExtraCallbackWithResult = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
    
        if ((r2 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
    
        return r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
    
        r1 = null;
        r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
    
        r9 = r16 - 1.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0091, code lost:
    
        return ((-r5) * java.lang.Math.pow(2.0d, 10.0d * r9)) * java.lang.Math.sin(((r9 - ((r7 / 6.283185307179586d) * java.lang.Math.asin(1.0d / r5))) * 6.283185307179586d) / r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002a, code lost:
    
        if (r16 == 1.0d) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0048, code lost:
    
        if (r16 == 0.0d) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004a, code lost:
    
        r2 = o.deprecated_protocols.onNavigationEvent + 59;
        o.deprecated_protocols.onExtraCallbackWithResult = r2 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final double onExtraCallback(double d) {
        double dCoerceIn;
        double dCoerceIn2;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            dCoerceIn = RangesKt.coerceIn(this.onWarmupCompleted, 0.0d, 10.0d);
            dCoerceIn2 = RangesKt.coerceIn(this.IAuthTabCallback, 0.1d, 2.0d);
        } else {
            dCoerceIn = RangesKt.coerceIn(this.onWarmupCompleted, 1.0d, 10.0d);
            dCoerceIn2 = RangesKt.coerceIn(this.IAuthTabCallback, 0.1d, 2.0d);
        }
    }
}
