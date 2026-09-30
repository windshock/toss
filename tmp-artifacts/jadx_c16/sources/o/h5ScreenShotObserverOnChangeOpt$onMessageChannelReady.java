package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class h5ScreenShotObserverOnChangeOpt$onMessageChannelReady extends h5ScreenShotObserverOnChangeOpt {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final h5ScreenShotObserverOnChangeOpt$onMessageChannelReady IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 1;
    private static int asInterface = 0;
    private static int onExtraCallback = 0;
    private static final String onExtraCallbackWithResult;
    public static final String onNavigationEvent;
    private static int onTransact = 1;
    private static int[] onWarmupCompleted;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof o.h5ScreenShotObserverOnChangeOpt$onMessageChannelReady) == true) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r2 = r2 + 67;
        o.h5ScreenShotObserverOnChangeOpt$onMessageChannelReady.asInterface = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if ((r2 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 107;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        if (i2 % 2 == 0) {
            int i4 = 50 / 0;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 9;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 13 / 0;
        }
        int i5 = i2 + 83;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return -1752649975;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 79;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return "PlusRequestReward";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void b(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2 = 2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = onWarmupCompleted;
        int i4 = -1469660336;
        float f = 0.0f;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i5 = 0;
            while (i5 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - Process.getGidForName("")), (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)) + 72, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 8847, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr4[i5] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i5++;
                    i4 = -1469660336;
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = onWarmupCompleted;
        if (iArr6 != null) {
            int i6 = $10 + 93;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 101;
                $10 = i8 % 128;
                int i9 = i8 % i2;
                try {
                    Object[] objArr3 = {Integer.valueOf(iArr6[i7])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 72 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i7] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i7++;
                    i2 = 2;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            iArr6 = iArr2;
        }
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            int i10 = 0;
            for (int i11 = 16; i10 < i11; i11 = 16) {
                int i12 = $11 + 117;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i10];
                try {
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - (KeyEvent.getMaxKeyCode() >> 16)), 39 - (ViewConfiguration.getTapTimeout() >> 16), 10300 - ImageFormat.getBitsPerPixel(0), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i10++;
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i14;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr5[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[17];
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.green(0) + 4033), KeyEvent.getDeadChar(0, 0) + 78, 7398 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private h5ScreenShotObserverOnChangeOpt$onMessageChannelReady() {
        super((DefaultConstructorMarker) null);
    }

    static {
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        b(new int[]{-1211192797, 306896327, 1253323650, 1121505595, 1084608684, -1210211457, -828738522, -1119148501, -240580106, -48066230, 141649109, 1689415434, 1123196683, -737823837, -1285932797, -1816138680, -1900120150, -420287579, -426128989, 2093243459, -1651701666, 965236604}, 41 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr);
        onNavigationEvent = ((String) objArr[0]).intern();
        IAuthTabCallback = new h5ScreenShotObserverOnChangeOpt$onMessageChannelReady();
        Object[] objArr2 = new Object[1];
        b(new int[]{-1211192797, 306896327, 1253323650, 1121505595, 1084608684, -1210211457, -828738522, -1119148501, -240580106, -48066230, 141649109, 1689415434, 1123196683, -737823837, -1285932797, -1816138680, -1900120150, -420287579, -426128989, 2093243459, -1651701666, 965236604}, 40 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr2);
        onExtraCallbackWithResult = ((String) objArr2[0]).intern();
        int i = onExtraCallback + 61;
        onTransact = i % 128;
        if (i % 2 == 0) {
            int i2 = 77 / 0;
        }
    }

    protected String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 37;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        String str = onExtraCallbackWithResult;
        int i5 = i2 + 69;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static void IAuthTabCallback() {
        onWarmupCompleted = new int[]{-894708377, -229415656, 216503836, -285967622, -663493830, 1067216504, -191667830, -1038922212, 101161663, -1769356133, -2121890116, 1039395142, -1362437375, -1138839337, 1794137131, 1500967696, 1662035473, -1652855016};
    }
}
