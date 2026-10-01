package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class h5ScreenShotObserverOnChangeOpt$onActivityLayout extends h5ScreenShotObserverOnChangeOpt {
    public static final h5ScreenShotObserverOnChangeOpt$onActivityLayout IAuthTabCallback;
    private static int asInterface;
    private static long onExtraCallback;
    public static final String onExtraCallbackWithResult;
    private static char[] onNavigationEvent;
    private static final String onWarmupCompleted;
    private static final byte[] $$d = {110, -114, 93, -109};
    private static final int $$e = 241;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int onTransact = 1;
    private static int IAuthTabCallbackDefault = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$f(int i, short s, short s2) {
        int i2;
        int i3 = 97 - (i * 3);
        byte[] bArr = $$d;
        int i4 = s * 4;
        int i5 = (s2 * 4) + 4;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            int i7 = i5;
            int i8 = 0;
            i3 = (-i3) + i5;
            i5 = i7 + 1;
            i2 = i8;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            byte b = bArr[i5];
            int i9 = i5;
            i5 = i3;
            i3 = b;
            i8 = i2 + 1;
            i7 = i9;
            i3 = (-i3) + i5;
            i5 = i7 + 1;
            i2 = i8;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 65;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        if (this == obj || (obj instanceof h5ScreenShotObserverOnChangeOpt$onActivityLayout)) {
            return true;
        }
        int i5 = i3 + 89;
        onTransact = i5 % 128;
        return i5 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onTransact + 37;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 11;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return 1406796996;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 53;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 49;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return "PlusWebView";
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x021a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, char c, int i2, Object[] objArr) throws Throwable {
        long j;
        Throwable cause;
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (true) {
            j = 0;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i) {
                break;
            }
            int i4 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onNavigationEvent[i2 + i4])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - TextUtils.getCapsMode("", 0, 0)), 17 - (Process.myPid() >> 22), 10973 - KeyEvent.normalizeMetaState(0), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(onExtraCallback), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46133 - ExpandableListView.getPackedPositionChild(0L)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 30, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.alpha(0) + 49123), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 44, 1495 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -1657859959, false, $$f(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i5 = $10 + 95;
                $11 = i5 % 128;
                int i6 = i5 % 2;
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i7 = $10 + 39;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i) {
            int i9 = $11 + 115;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                try {
                    Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - ExpandableListView.getPackedPositionType(j)), 45 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)), 1494 - (ViewConfiguration.getEdgeSlop() >> 16), -1657859959, false, $$f(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    throw null;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr6 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback5 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 49122), 43 - MotionEvent.axisFromString(""), 1494 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -1657859959, false, $$f(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
            j = 0;
        }
        objArr[0] = new String(cArr);
    }

    private h5ScreenShotObserverOnChangeOpt$onActivityLayout() {
        super((DefaultConstructorMarker) null);
    }

    static {
        asInterface = 1;
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        b(22 - Process.getGidForName(""), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), KeyEvent.keyCodeFromString(""), objArr);
        onExtraCallbackWithResult = ((String) objArr[0]).intern();
        IAuthTabCallback = new h5ScreenShotObserverOnChangeOpt$onActivityLayout();
        Object[] objArr2 = new Object[1];
        b(23 - TextUtils.getOffsetAfter("", 0), (char) TextUtils.getOffsetAfter("", 0), (-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr2);
        onWarmupCompleted = ((String) objArr2[0]).intern();
        int i = IAuthTabCallbackDefault + 27;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    protected String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 81;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        String str = onWarmupCompleted;
        int i5 = i2 + 99;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean onWarmupCompleted(@Nullable String str) {
        Uri uri;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 57;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        if (str == null || (uri = Uri.parse(str)) == null) {
            return false;
        }
        int i4 = onTransact + 51;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return filterCreatePageParams.IAuthTabCallback(uri, new String[]{"credit.co.kr"});
    }

    static void IAuthTabCallback() {
        onNavigationEvent = new char[]{60839, 22083, 39520, 56855, 558, 18122, 35575, 52873, 12983, 30492, 47919, 65357, 9007, 26588, 44013, 61326, 21405, 38818, 55327, 7292, 16405, 33853, 51421};
        onExtraCallback = -7628512987713874378L;
    }
}
