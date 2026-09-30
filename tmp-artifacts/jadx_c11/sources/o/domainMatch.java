package o;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import kotlin.ranges.RangesKt;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class domainMatch {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public static final /* synthetic */ Rect onExtraCallbackWithResult(Rect rect) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Rect rectOnWarmupCompleted = onWarmupCompleted(rect);
        int i4 = onNavigationEvent + 63;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return rectOnWarmupCompleted;
        }
        throw null;
    }

    public static final /* synthetic */ Rect onNavigationEvent(Rect rect, long j) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Rect rectOnWarmupCompleted = onWarmupCompleted(rect, j);
        if (i3 != 0) {
            int i4 = 51 / 0;
        }
        int i5 = onNavigationEvent + 109;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return rectOnWarmupCompleted;
    }

    static /* synthetic */ boolean onWarmupCompleted(Rect rect, Rect rect2, float f, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 75;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        if (i3 % 2 != 0 ? (i & 4) != 0 : (i & 3) != 0) {
            int i5 = i4 + 39;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            f = 0.5f;
        }
        return IAuthTabCallback(rect, rect2, f);
    }

    private static final boolean onNavigationEvent(float f, float f2, float f3) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            if (Math.abs(f2 % f3) <= f) {
                return true;
            }
        } else if (Math.abs(f2 - f3) <= f) {
            return true;
        }
        int i3 = onNavigationEvent + 121;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 15 / 0;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if (onNavigationEvent(r6, r4.IAuthTabCallbackStubProxy(), r5.IAuthTabCallbackStubProxy()) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        r1 = o.domainMatch.onExtraCallbackWithResult + 95;
        o.domainMatch.onNavigationEvent = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if ((r1 % 2) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (onNavigationEvent(r6, r4.extraCallback(), r5.extraCallback()) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (onNavigationEvent(r6, r4.IAuthTabCallback_Parcel(), r5.IAuthTabCallback_Parcel()) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (onNavigationEvent(r6, r4.IAuthTabCallbackDefault(), r5.IAuthTabCallbackDefault()) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        onNavigationEvent(r6, r4.extraCallback(), r5.extraCallback());
        r4 = null;
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r4 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r4 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final boolean IAuthTabCallback(Rect rect, Rect rect2, float f) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 36 / 0;
        }
    }

    private static final Rect onWarmupCompleted(Rect rect) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        float fMin = Math.min(rect.IAuthTabCallbackStubProxy(), rect.IAuthTabCallback_Parcel());
        float fMax = Math.max(rect.IAuthTabCallbackStubProxy(), rect.IAuthTabCallback_Parcel());
        float fMin2 = Math.min(rect.extraCallback(), rect.IAuthTabCallbackDefault());
        float fMax2 = Math.max(rect.extraCallback(), rect.IAuthTabCallbackDefault());
        long jIAuthTabCallback = setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(fMin) << 32) | (Float.floatToRawIntBits(fMin2) & 4294967295L));
        float fMax3 = Math.max(fMin + 1.0f, fMax);
        float fMax4 = Math.max(fMin2 + 1.0f, fMax2);
        Rect rectOnWarmupCompleted = RectKt.onWarmupCompleted(jIAuthTabCallback, setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(fMax3) << 32) | (Float.floatToRawIntBits(fMax4) & 4294967295L)));
        int i4 = onExtraCallbackWithResult + 21;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return rectOnWarmupCompleted;
    }

    private static final Rect onWarmupCompleted(Rect rect, long j) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        float f = (int) (j >> 32);
        float fCoerceIn = RangesKt.coerceIn(rect.IAuthTabCallbackStubProxy(), 0.0f, f);
        float f2 = (int) j;
        float fCoerceIn2 = RangesKt.coerceIn(rect.extraCallback(), 0.0f, f2);
        float fCoerceIn3 = RangesKt.coerceIn(rect.IAuthTabCallback_Parcel(), 0.0f, f);
        float fCoerceIn4 = RangesKt.coerceIn(rect.IAuthTabCallbackDefault(), 0.0f, f2);
        if (fCoerceIn3 <= fCoerceIn) {
            return null;
        }
        int i4 = onExtraCallbackWithResult + 73;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        if (fCoerceIn4 <= fCoerceIn2) {
            return null;
        }
        return RectKt.onWarmupCompleted(setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(fCoerceIn2) & 4294967295L) | (Float.floatToRawIntBits(fCoerceIn) << 32)), setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(fCoerceIn3) << 32) | (Float.floatToRawIntBits(fCoerceIn4) & 4294967295L)));
    }

    public static final long onExtraCallback(long j, float f) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        long jOnWarmupCompleted = ExtensionsManager1.onWarmupCompleted((((int) (((int) (j >> 32)) * f)) << 32) | (((int) (((int) j) * f)) & 4294967295L));
        int i4 = onNavigationEvent + 81;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return jOnWarmupCompleted;
    }
}
