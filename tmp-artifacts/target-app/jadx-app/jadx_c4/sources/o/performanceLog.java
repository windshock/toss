package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class performanceLog {
    private final int IAuthTabCallback;
    private final int onNavigationEvent;
    private static final byte[] $$a = {62, 54, 60, 44};
    private static final int $$b = 52;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int onTransact = 1;
    private static long onExtraCallbackWithResult = 7798559133331975163L;
    private static int onExtraCallback = -1776194565;
    private static char onWarmupCompleted = 32004;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, short s, byte b) {
        int i2;
        int i3 = 1 - (i * 3);
        int i4 = b + 109;
        int i5 = (s * 2) + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i3];
        if (bArr == null) {
            int i6 = i3;
            int i7 = i5;
            i2 = 0;
            int i8 = i7 + 1;
            i4 = i5 + (-i6);
            i5 = i8;
            bArr2[i2] = (byte) i4;
            i2++;
            if (i2 == i3) {
                return new String(bArr2, 0);
            }
            i6 = bArr[i5];
            int i9 = i4;
            i7 = i5;
            i5 = i9;
            int i82 = i7 + 1;
            i4 = i5 + (-i6);
            i5 = i82;
            bArr2[i2] = (byte) i4;
            i2++;
            if (i2 == i3) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i2++;
            if (i2 == i3) {
            }
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 23;
        int i4 = i3 % 128;
        onTransact = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof performanceLog)) {
            int i5 = i2 + 29;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        performanceLog performancelog = (performanceLog) obj;
        if (this.IAuthTabCallback == performancelog.IAuthTabCallback) {
            return this.onNavigationEvent == performancelog.onNavigationEvent;
        }
        int i7 = i4 + 117;
        int i8 = i7 % 128;
        asInterface = i8;
        int i9 = i7 % 2;
        int i10 = i8 + 43;
        onTransact = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 44 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asInterface + 37;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.IAuthTabCallback);
        return i3 == 0 ? (iHashCode + 4) * Integer.hashCode(this.onNavigationEvent) : (iHashCode * 31) + Integer.hashCode(this.onNavigationEvent);
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        int i2 = this.IAuthTabCallback;
        int i3 = this.onNavigationEvent;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a((char) ((Process.myTid() >> 22) + 3862), 1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), new char[]{11448, 1318, 47021, 40647, 11670, 63998, 14495, 29670, 60511, 8709, 52471, 336, 4471, 56875, 38426, 63277, 43552, 13361, 43258, 21701, 10264, 3838, 43176, 20908, 31776, 20058, 20919, 54041, 61086, 25821}, new char[]{0, 0, 0, 0}, new char[]{60385, 34175, 5715, 51215}, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(i2);
        Object[] objArr2 = new Object[1];
        a((char) (13688 - (ViewConfiguration.getTouchSlop() >> 8)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1, new char[]{48282, 23631, 37816, 63680, 51188, 33308, 1706, 53986, 43458, 20951, 50455, 7931, 3182, 57845}, new char[]{0, 0, 0, 0}, new char[]{63187, 46953, 30929, 33589}, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(i3);
        Object[] objArr3 = new Object[1];
        a((char) (Color.green(0) + 6388), 713817992 - (ViewConfiguration.getLongPressTimeout() >> 16), new char[]{28165}, new char[]{0, 0, 0, 0}, new char[]{34821, 35839, 62506, 34328}, objArr3);
        sb.append(((String) objArr3[0]).intern());
        String string = sb.toString();
        int i4 = asInterface + 93;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    public performanceLog(int i, int i2) {
        this.IAuthTabCallback = i;
        this.onNavigationEvent = i2;
    }

    public final int onNavigationEvent() {
        int i;
        int i2 = 2 % 2;
        int i3 = asInterface + 15;
        int i4 = i3 % 128;
        onTransact = i4;
        if (i3 % 2 == 0) {
            i = this.IAuthTabCallback;
            int i5 = 81 / 0;
        } else {
            i = this.IAuthTabCallback;
        }
        int i6 = i4 + 111;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 29;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        int i5 = this.onNavigationEvent;
        int i6 = i3 + 103;
        onTransact = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i4 = $11 + 3;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), 43 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1451 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 228868077, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0) + 49123), TextUtils.indexOf((CharSequence) "", '0', 0) + 45, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1493, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 23973), 50 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 22939 - KeyEvent.getDeadChar(0, 0), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - (KeyEvent.getMaxKeyCode() >> 16)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 29, 12576 - ((byte) KeyEvent.getModifierMetaStateMask()), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallbackWithResult ^ 7798559133331975163L)) ^ ((int) (onExtraCallback ^ 7798559133331975163L))) ^ ((char) (onWarmupCompleted ^ 7798559133331975163L)));
                            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                            int i6 = $10 + 25;
                            $11 = i6 % 128;
                            int i7 = i6 % 2;
                            i2 = 2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr6);
    }
}
