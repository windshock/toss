package o;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import net.sf.scuba.smartcards.BuildConfig;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class setNeedCheckingShow implements dvycx<wiezb1> {
    private static final byte[] $$a = {94, -53, 28, -60};
    private static final int $$b = 27;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private static char[] onExtraCallback = {5918};
    private static long IAuthTabCallback = -3603594813909635006L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, short s, byte b2) {
        int i;
        byte[] bArr = $$a;
        int i2 = b * 3;
        int i3 = b2 + 4;
        int i4 = 97 - (s * 4);
        byte[] bArr2 = new byte[i2 + 1];
        if (bArr == null) {
            i4 = i2;
            int i5 = i3;
            int i6 = 0;
            i4 += i3;
            i3 = i5;
            i = i6;
            bArr2[i] = (byte) i4;
            int i7 = i3 + 1;
            if (i == i2) {
                return new String(bArr2, 0);
            }
            int i8 = i + 1;
            i5 = i7;
            i3 = bArr[i7];
            i6 = i8;
            i4 += i3;
            i3 = i5;
            i = i6;
            bArr2[i] = (byte) i4;
            int i72 = i3 + 1;
            if (i == i2) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i4;
            int i722 = i3 + 1;
            if (i == i2) {
            }
        }
    }

    setNeedCheckingShow() {
    }

    @Override // o.dvycx
    public /* synthetic */ void IAuthTabCallback(wiezb1 wiezb1Var, getJsObject getjsobject) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(wiezb1Var, getjsobject);
        int i4 = onWarmupCompleted + 39;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onNavigationEvent(wiezb1 wiezb1Var, getJsObject getjsobject) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getjsobject.asInterface();
        Object[] objArr = new Object[1];
        a(ViewConfiguration.getKeyRepeatDelay() >> 16, TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 1, (char) (64250 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0)), objArr);
        getjsobject.onNavigationEvent("$minKey", ((String) objArr[0]).intern());
        getjsobject.onWarmupCompleted();
        int i4 = onWarmupCompleted + 85;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 10 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0213  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        long j;
        Throwable cause;
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (true) {
            j = 0;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i4 = $11 + 55;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onExtraCallback[i + i6])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 17 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), View.combineMeasuredStates(0, 0) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(IAuthTabCallback), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46133 - ExpandableListView.getPackedPositionChild(0L)), 30 - Process.getGidForName(BuildConfig.FLAVOR), 20220 - TextUtils.getTrimmedLength(BuildConfig.FLAVOR), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 49123), ExpandableListView.getPackedPositionChild(0L) + 45, 1494 - KeyEvent.getDeadChar(0, 0), -1657859959, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
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
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i7 = $11 + 121;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - View.resolveSize(0, 0)), 44 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1494 - (ViewConfiguration.getWindowTouchSlop() >> 8), -1657859959, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                int i8 = 87 / 0;
            } else {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr6 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getJumpTapTimeout() >> 16)), (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)) + 43, TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 1494, -1657859959, false, $$c(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
                j = 0;
            }
        }
        objArr[0] = new String(cArr);
    }
}
