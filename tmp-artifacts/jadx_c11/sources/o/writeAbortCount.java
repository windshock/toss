package o;

import android.graphics.Color;
import kotlin.ranges.RangesKt;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class writeAbortCount {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    public static final float onExtraCallback(int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 99;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        float fIAuthTabCallback = (float) onWarmupCompleted(i).IAuthTabCallback();
        int i5 = onExtraCallback + 53;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return fIAuthTabCallback;
    }

    public static final int onWarmupCompleted(int i, float f) {
        writeSuccessCount writesuccesscountOnWarmupCompleted;
        float fCoerceIn;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 17;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            writesuccesscountOnWarmupCompleted = onWarmupCompleted(i);
            fCoerceIn = RangesKt.coerceIn(f, 1.0f, 1.0f);
        } else {
            writesuccesscountOnWarmupCompleted = onWarmupCompleted(i);
            fCoerceIn = RangesKt.coerceIn(f, 0.0f, 1.0f);
        }
        int iOnNavigationEvent = onNavigationEvent(onExtraCallbackWithResult(fCoerceIn, writesuccesscountOnWarmupCompleted.onNavigationEvent(), writesuccesscountOnWarmupCompleted.onExtraCallback()), Color.alpha(i));
        int i4 = onWarmupCompleted + 93;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return iOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final writeSuccessCount onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        double dIAuthTabCallback = IAuthTabCallback(Color.red(i));
        double dIAuthTabCallback2 = IAuthTabCallback(Color.green(i));
        double dIAuthTabCallback3 = IAuthTabCallback(Color.blue(i));
        double dCbrt = Math.cbrt((0.4122214708d * dIAuthTabCallback) + (0.5363325363d * dIAuthTabCallback2) + (0.0514459929d * dIAuthTabCallback3));
        double dCbrt2 = Math.cbrt((0.2119034982d * dIAuthTabCallback) + (0.6806995451d * dIAuthTabCallback2) + (0.1073969566d * dIAuthTabCallback3));
        double dCbrt3 = Math.cbrt((dIAuthTabCallback * 0.0883024619d) + (dIAuthTabCallback2 * 0.2817188376d) + (dIAuthTabCallback3 * 0.6299787005d));
        writeSuccessCount writesuccesscount = new writeSuccessCount(((0.2104542553d * dCbrt) + (0.793617785d * dCbrt2)) - (0.0040720468d * dCbrt3), (0.4505937099d * dCbrt3) + ((1.9779984951d * dCbrt) - (2.428592205d * dCbrt2)), ((dCbrt * 0.0259040371d) + (dCbrt2 * 0.7827717662d)) - (dCbrt3 * 0.808675766d));
        int i3 = onExtraCallback + 79;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return writesuccesscount;
    }

    private static final writeSuccessCount onExtraCallbackWithResult(double d, double d2, double d3) {
        int i = 2 % 2;
        writeSuccessCount writesuccesscount = new writeSuccessCount(d, d2, d3);
        if (onExtraCallbackWithResult(writesuccesscount).IAuthTabCallback()) {
            int i2 = onWarmupCompleted + 49;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return writesuccesscount;
            }
            throw null;
        }
        double d4 = 0.0d;
        double d5 = 1.0d;
        for (int i3 = 0; i3 < 16; i3++) {
            double d6 = (d4 + d5) / 2.0d;
            if (onExtraCallbackWithResult(new writeSuccessCount(d, d2 * d6, d3 * d6)).IAuthTabCallback()) {
                int i4 = onExtraCallback + 13;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
                d4 = d6;
            } else {
                d5 = d6;
            }
        }
        return new writeSuccessCount(d, d2 * d4, d3 * d4);
    }

    private static final int onNavigationEvent(writeSuccessCount writesuccesscount, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 19;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            trackResponseokhttp trackresponseokhttpOnExtraCallbackWithResult = onExtraCallbackWithResult(writesuccesscount);
            int iArgb = Color.argb(i, IAuthTabCallback(trackresponseokhttpOnExtraCallbackWithResult.onNavigationEvent()), IAuthTabCallback(trackresponseokhttpOnExtraCallbackWithResult.onExtraCallbackWithResult()), IAuthTabCallback(trackresponseokhttpOnExtraCallbackWithResult.onWarmupCompleted()));
            int i4 = onExtraCallback + 19;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return iArgb;
        }
        trackResponseokhttp trackresponseokhttpOnExtraCallbackWithResult2 = onExtraCallbackWithResult(writesuccesscount);
        Color.argb(i, IAuthTabCallback(trackresponseokhttpOnExtraCallbackWithResult2.onNavigationEvent()), IAuthTabCallback(trackresponseokhttpOnExtraCallbackWithResult2.onExtraCallbackWithResult()), IAuthTabCallback(trackresponseokhttpOnExtraCallbackWithResult2.onWarmupCompleted()));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final trackResponseokhttp onExtraCallbackWithResult(writeSuccessCount writesuccesscount) {
        int i = 2 % 2;
        double dIAuthTabCallback = writesuccesscount.IAuthTabCallback() + (writesuccesscount.onNavigationEvent() * 0.3963377774d) + (writesuccesscount.onExtraCallback() * 0.2158037573d);
        double dIAuthTabCallback2 = (writesuccesscount.IAuthTabCallback() - (writesuccesscount.onNavigationEvent() * 0.1055613458d)) - (writesuccesscount.onExtraCallback() * 0.0638541728d);
        double dIAuthTabCallback3 = (writesuccesscount.IAuthTabCallback() - (writesuccesscount.onNavigationEvent() * 0.0894841775d)) - (writesuccesscount.onExtraCallback() * 1.291485548d);
        double d = dIAuthTabCallback * dIAuthTabCallback * dIAuthTabCallback;
        double d2 = dIAuthTabCallback2 * dIAuthTabCallback2 * dIAuthTabCallback2;
        double d3 = dIAuthTabCallback3 * dIAuthTabCallback3 * dIAuthTabCallback3;
        trackResponseokhttp trackresponseokhttp = new trackResponseokhttp((0.2309699292d * d3) + ((4.0767416621d * d) - (3.3077115913d * d2)), (((-1.2684380046d) * d) + (2.6097574011d * d2)) - (0.3413193965d * d3), ((d * (-0.0041960863d)) - (d2 * 0.7034186147d)) + (d3 * 1.707614701d));
        int i2 = onWarmupCompleted + 7;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return trackresponseokhttp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        return r7 / 12.92d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        r1 = java.lang.Math.pow((r7 + 0.055d) / 1.055d, 2.4d);
        r9 = o.writeAbortCount.onExtraCallback + 61;
        o.writeAbortCount.onWarmupCompleted = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0051, code lost:
    
        if ((r9 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r7 <= 0.04045d) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r7 <= 0.04045d) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        r2 = r2 + 79;
        o.writeAbortCount.onWarmupCompleted = r2 % 128;
        r2 = r2 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final double IAuthTabCallback(int i) {
        double d;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 45;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        if (i3 % 2 != 0) {
            d = i - 255.0d;
        } else {
            d = i / 255.0d;
        }
    }

    private static final int IAuthTabCallback(double d) {
        double dPow;
        int i = 2 % 2;
        double dCoerceIn = RangesKt.coerceIn(d, 0.0d, 1.0d);
        if (dCoerceIn > 0.0031308d) {
            dPow = (Math.pow(dCoerceIn, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            int i2 = onWarmupCompleted + 5;
            onExtraCallback = i2 % 128;
            dPow = i2 % 2 != 0 ? dCoerceIn / 12.92d : dCoerceIn * 12.92d;
        }
        int iCoerceIn = RangesKt.coerceIn(getBacktraceNoteBytes.IAuthTabCallback(dPow * 255.0d), 0, 255);
        int i3 = onExtraCallback + 107;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return iCoerceIn;
    }
}
