package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import java.lang.reflect.Method;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class viewRangeUpdate {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static int[] onExtraCallback = {1921505560, -1234598002, -701922514, -466228407, -1638558159, 458201001, -2136742966, 1330229547, 2034864134, -1395047868, -912290805, -1357203451, -1226149732, 1623861314, 56356018, 79145643, -439476834, 484687344};
    private static int onNavigationEvent;

    /* JADX WARN: Removed duplicated region for block: B:9:0x0061 A[PHI: r1
      0x0061: PHI (r1v5 com.facebook.react.bridge.WritableMap) = (r1v4 com.facebook.react.bridge.WritableMap), (r1v7 com.facebook.react.bridge.WritableMap) binds: [B:8:0x005f, B:5:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static WritableMap IAuthTabCallback(@Nullable String str, String str2) throws Throwable {
        WritableMap writableMapCreateMap;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            writableMapCreateMap = Arguments.createMap();
            Object[] objArr = new Object[1];
            a(new int[]{-1394148696, 1482157570, 479286693, 28663557}, 0 / (ViewConfiguration.getJumpTapTimeout() * 119), objArr);
            writableMapCreateMap.putString(((String) objArr[0]).intern(), str2);
            if (str != null) {
                int i3 = IAuthTabCallback + 9;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr2 = new Object[1];
                a(new int[]{1303652231, -2139139234}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2, objArr2);
                writableMapCreateMap.putString(((String) objArr2[0]).intern(), str);
            }
        } else {
            writableMapCreateMap = Arguments.createMap();
            Object[] objArr3 = new Object[1];
            a(new int[]{-1394148696, 1482157570, 479286693, 28663557}, 7 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr3);
            writableMapCreateMap.putString(((String) objArr3[0]).intern(), str2);
            if (str != null) {
            }
        }
        return writableMapCreateMap;
    }

    public static WritableMap onExtraCallbackWithResult(@Nullable String str) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(str, "Invalid key");
        }
        IAuthTabCallback(str, "Invalid key");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static WritableMap onNavigationEvent(@Nullable String str) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(str, "Invalid Value");
        }
        IAuthTabCallback(str, "Invalid Value");
        throw null;
    }

    public static WritableMap IAuthTabCallback(@Nullable String str) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        WritableMap writableMapIAuthTabCallback = IAuthTabCallback(str, "Database Error");
        int i4 = onNavigationEvent + 125;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return writableMapIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onExtraCallback;
        int i4 = -1469660336;
        int i5 = 16;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 31;
                $11 = i7 % 128;
                int i8 = i7 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> i5), 72 - ((Process.getThreadPriority(0) + 20) >> 6), 8848 - Color.green(0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i6++;
                    i2 = 2;
                    i5 = 16;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onExtraCallback;
        long j = 0;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                Object[] objArr3 = {Integer.valueOf(iArr5[i9])};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1))), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 72, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i9] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i9++;
                i4 = -1469660336;
                j = 0;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i10 = $10 + 35;
        $11 = i10 % 128;
        int i11 = i10 % 2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i12 = $11 + 11;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i14 = 0;
            for (int i15 = 16; i14 < i15; i15 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i14];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22253 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0) + 40, 10302 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i14++;
                int i16 = $10 + 65;
                $11 = i16 % 128;
                int i17 = i16 % 2;
            }
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i18;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - Color.alpha(0)), 78 - (KeyEvent.getMaxKeyCode() >> 16), 7398 - (ViewConfiguration.getPressedStateDuration() >> 16), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
