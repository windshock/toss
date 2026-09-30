package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class StartClientBundle {
    private final int onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private static final byte[] $$a = {112, 44, -46, -27};
    private static final int $$b = 96;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static char[] onWarmupCompleted = {60807, 63747, 50386, 54155, 48996, 35381, 37256, 31886, 18497, 22291, 8927, 2454, 5448, 57423, 60920, 63818, 50399, 54151, 48968, 35350, 37320, 31963, 60925};
    private static long onExtraCallback = -3160439913132459670L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, int i) {
        int i2;
        int i3;
        byte[] bArr = $$a;
        int i4 = 97 - (s2 * 3);
        int i5 = 1 - (s * 3);
        int i6 = 3 - (i * 2);
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i6;
            i3 = 0;
            i4 = (-i4) + i6;
            i6 = i7;
            i2 = i3;
            int i8 = i6 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
                return new String(bArr2, 0);
            }
            byte b = bArr[i8];
            i6 = i4;
            i4 = b;
            i7 = i8;
            i4 = (-i4) + i6;
            i6 = i7;
            i2 = i3;
            int i82 = i6 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            int i822 = i6 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
            }
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StartClientBundle)) {
            int i2 = IAuthTabCallback + 13;
            IAuthTabCallbackDefault = i2 % 128;
            return i2 % 2 == 0;
        }
        StartClientBundle startClientBundle = (StartClientBundle) obj;
        if (this.onNavigationEvent == startClientBundle.onNavigationEvent) {
            if (this.onExtraCallbackWithResult != startClientBundle.onExtraCallbackWithResult) {
                return false;
            }
            int i3 = IAuthTabCallback + 31;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 != 0) {
                return true;
            }
            throw null;
        }
        int i4 = IAuthTabCallbackDefault + 75;
        int i5 = i4 % 128;
        IAuthTabCallback = i5;
        boolean z = i4 % 2 != 0;
        int i6 = i5 + 111;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (Integer.hashCode(this.onNavigationEvent) * 31) + Integer.hashCode(this.onExtraCallbackWithResult);
        int i4 = IAuthTabCallbackDefault + 61;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        int i2 = this.onNavigationEvent;
        int i3 = this.onExtraCallbackWithResult;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 13, (char) KeyEvent.getDeadChar(0, 0), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(i2);
        Object[] objArr2 = new Object[1];
        a(15 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 7, (char) Color.blue(0), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(i3);
        Object[] objArr3 = new Object[1];
        a(21 - MotionEvent.axisFromString(""), 1 - KeyEvent.getDeadChar(0, 0), (char) TextUtils.getTrimmedLength(""), objArr3);
        sb.append(((String) objArr3[0]).intern());
        String string = sb.toString();
        int i4 = IAuthTabCallback + 93;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public StartClientBundle(int i, int i2) {
        this.onNavigationEvent = i;
        this.onExtraCallbackWithResult = i2;
    }

    public final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 37;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = this.onNavigationEvent;
        int i6 = i3 + 109;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 93 / 0;
        }
        return i5;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $10 + 3;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onWarmupCompleted[i + i6])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetBefore("", 0) + 59697), 17 - KeyEvent.keyCodeFromString(""), ((Process.getThreadPriority(0) + 20) >> 6) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(onExtraCallback), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46133 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), View.getDefaultSize(0, 0) + 31, 20220 - Drawable.resolveOpacity(0, 0), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.alpha(0) + 49123), 44 - KeyEvent.keyCodeFromString(""), 1494 - (ViewConfiguration.getScrollBarSize() >> 8), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i7 = $10 + 29;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i9 = $10 + 113;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 44, 1494 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }
}
