package o;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.skt.usp.UCPApiConstants;
import java.lang.reflect.Method;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
final class errorLog {
    private final int IAuthTabCallback;
    private final int onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final int onWarmupCompleted;
    private static final byte[] $$a = {35, -11, -97, -73};
    private static final int $$b = 85;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int onTransact = 1;
    private static long onNavigationEvent = 7798559133331975163L;
    private static int IAuthTabCallbackStub = -1776194565;
    private static char asInterface = 56332;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, int i2, byte b) {
        int i3;
        int i4 = i + 109;
        byte[] bArr = $$a;
        int i5 = i2 * 4;
        int i6 = b + 4;
        byte[] bArr2 = new byte[1 - i5];
        int i7 = 0 - i5;
        if (bArr == null) {
            int i8 = i7;
            int i9 = i6;
            i3 = 0;
            int i10 = i6 + i8;
            i6 = i9;
            i4 = i10;
            int i11 = i6 + 1;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
                return new String(bArr2, 0);
            }
            i3++;
            i8 = bArr[i11];
            i6 = i4;
            i9 = i11;
            int i102 = i6 + i8;
            i6 = i9;
            i4 = i102;
            int i112 = i6 + 1;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            int i1122 = i6 + 1;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
            }
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = asBinder + 95;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof errorLog)) {
            return false;
        }
        errorLog errorlog = (errorLog) obj;
        if (this.onExtraCallback != errorlog.onExtraCallback) {
            return false;
        }
        if (this.onExtraCallbackWithResult != errorlog.onExtraCallbackWithResult) {
            int i4 = asBinder + 71;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.onWarmupCompleted == errorlog.onWarmupCompleted) {
            return this.IAuthTabCallback == errorlog.IAuthTabCallback;
        }
        int i6 = onTransact + 17;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onTransact + 83;
        asBinder = i2 % 128;
        return i2 % 2 != 0 ? (((((r0 >> UCPApiConstants.ARAM_TIME_OUT) + Integer.hashCode(this.onExtraCallbackWithResult)) - 60) * Integer.hashCode(this.onWarmupCompleted)) >>> 86) << Integer.hashCode(this.IAuthTabCallback) : (((((Integer.hashCode(this.onExtraCallback) * 31) + Integer.hashCode(this.onExtraCallbackWithResult)) * 31) + Integer.hashCode(this.onWarmupCompleted)) * 31) + Integer.hashCode(this.IAuthTabCallback);
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        int i2 = this.onExtraCallback;
        int i3 = this.onExtraCallbackWithResult;
        int i4 = this.onWarmupCompleted;
        int i5 = this.IAuthTabCallback;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 36555 - AndroidCharacter.getMirror('0'), new char[]{55529, 37967, 31463, 65006, 20541, 14102, 39225, 41337, 32698, 17107, 59241, 26844, 11285, 35834, 31215, 8579, 63961, 22215, 44858, 62289, 34327}, new char[]{0, 0, 0, 0}, new char[]{39880, 41358, 43030, 49676}, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(i2);
        Object[] objArr2 = new Object[1];
        a((char) (ViewConfiguration.getScrollBarSize() >> 8), ViewConfiguration.getTouchSlop() >> 8, new char[]{7239, 13085, 33925, 39444, 53995, 49541, 17006, 19518, 62526, 7543}, new char[]{0, 0, 0, 0}, new char[]{53394, 47328, 9542, 34993}, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(i3);
        Object[] objArr3 = new Object[1];
        a((char) ((-1) - MotionEvent.axisFromString("")), (-225400898) + (ViewConfiguration.getMaximumFlingVelocity() >> 16), new char[]{36271, 15703, 36214, 19750, 4976, 3534, 65274, 36760, 51112}, new char[]{0, 0, 0, 0}, new char[]{48889, 37031, 55794, 1487}, objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(i4);
        Object[] objArr4 = new Object[1];
        a((char) Drawable.resolveOpacity(0, 0), (-63288160) - TextUtils.indexOf("", ""), new char[]{58297, 33068, 150, 31629, 57632, 62276, 37706, 8823, 47178}, new char[]{0, 0, 0, 0}, new char[]{41002, 14924, 61692, 63953}, objArr4);
        sb.append(((String) objArr4[0]).intern());
        sb.append(i5);
        Object[] objArr5 = new Object[1];
        a((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 36689), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 2109174140, new char[]{24865}, new char[]{0, 0, 0, 0}, new char[]{33829, 18574, 21122, 6543}, objArr5);
        sb.append(((String) objArr5[0]).intern());
        String string = sb.toString();
        int i6 = onTransact + 119;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return string;
    }

    public errorLog(int i, int i2, int i3, int i4) {
        this.onExtraCallback = i;
        this.onExtraCallbackWithResult = i2;
        this.onWarmupCompleted = i3;
        this.IAuthTabCallback = i4;
    }

    public final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 125;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.onExtraCallback;
        int i6 = i2 + 89;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int IAuthTabCallback() {
        int i;
        int i2 = 2 % 2;
        int i3 = asBinder;
        int i4 = i3 + 55;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            i = this.onExtraCallbackWithResult;
            int i5 = 84 / 0;
        } else {
            i = this.onExtraCallbackWithResult;
        }
        int i6 = i3 + 107;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public final int onWarmupCompleted() {
        int i;
        int i2 = 2 % 2;
        int i3 = onTransact;
        int i4 = i3 + 5;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            i = this.onWarmupCompleted;
            int i5 = 45 / 0;
        } else {
            i = this.onWarmupCompleted;
        }
        int i6 = i3 + 21;
        asBinder = i6 % 128;
        if (i6 % 2 == 0) {
            return i;
        }
        throw null;
    }

    public final int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 103;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.IAuthTabCallback;
        int i6 = i2 + 27;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 76 / 0;
        }
        return i5;
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
            int i4 = $11 + 45;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char c2 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                    int iBlue = Color.blue(0) + 43;
                    int tapTimeout = 1451 - (ViewConfiguration.getTapTimeout() >> 16);
                    byte b = (byte) ($$b & 3);
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c2, iBlue, tapTimeout, 228868077, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 49124), Drawable.resolveOpacity(0, 0) + 44, 1493 - TextUtils.lastIndexOf("", '0', 0, 0), 1533236389, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 23973), TextUtils.lastIndexOf("", '0', 0) + 51, 22987 - AndroidCharacter.getMirror('0'), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.alpha(0) + 45848), 28 - TextUtils.lastIndexOf("", '0'), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 12576, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onNavigationEvent ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallbackStub ^ 7798559133331975163L))) ^ ((char) (asInterface ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i6 = $10 + 37;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }
}
