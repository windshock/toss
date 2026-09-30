package o;

import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class DefaultSuitableOutputCheckerImplApi35ExternalSyntheticLambda4 {
    private static int IAuthTabCallback = 0;
    private static long onExtraCallback = -603310744006266614L;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public static boolean IAuthTabCallback(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i = 2 % 2;
        try {
            try {
                Class.forName(str, false, DefaultSuitableOutputCheckerImplApi35ExternalSyntheticLambda4.class.getClassLoader());
                return true;
            } catch (Exception unused) {
                Class.forName(str, false, ClassLoader.getSystemClassLoader());
                return true;
            }
        } catch (Exception unused2) {
            if (new IAuthTabCallback(ClassLoader.getSystemClassLoader()).IAuthTabCallback(str)) {
                return true;
            }
            try {
                if (Build.VERSION.SDK_INT < 28) {
                    int i2 = onNavigationEvent + 101;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    String str2 = Build.VERSION.RELEASE;
                    Object[] objArr = new Object[1];
                    onExtraCallbackWithResult("䵿䴯밶䖑汉", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, objArr);
                    if (!str2.equals((String) objArr[0])) {
                        int i4 = onNavigationEvent + 35;
                        onWarmupCompleted = i4 % 128;
                        int i5 = i4 % 2;
                        Object[] objArr2 = new Object[1];
                        onExtraCallbackWithResult("鷗鶴蜦蚪官륆㽯⽃\ueeec흺ꨩ낊笉䐥⛳쐥", (-1) - TextUtils.indexOf((CharSequence) "", '0', 0), objArr2);
                        Method declaredMethod = Class.class.getDeclaredMethod((String) objArr2[0], String.class, Boolean.TYPE, ClassLoader.class);
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(null, str, Boolean.FALSE, ClassLoader.getSystemClassLoader());
                        return true;
                    }
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused3) {
            }
            return false;
        }
    }

    private static void onExtraCallbackWithResult(String str, int i, Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 39;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        RepeatModeUtil repeatModeUtil = new RepeatModeUtil();
        char[] cArrOnExtraCallback = RepeatModeUtil.onExtraCallback(onExtraCallback ^ 8686948009763778008L, charArray, i);
        repeatModeUtil.IAuthTabCallback = 4;
        while (repeatModeUtil.IAuthTabCallback < cArrOnExtraCallback.length) {
            int i5 = onExtraCallbackWithResult + 85;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            repeatModeUtil.onNavigationEvent = repeatModeUtil.IAuthTabCallback - 4;
            cArrOnExtraCallback[repeatModeUtil.IAuthTabCallback] = (char) ((cArrOnExtraCallback[repeatModeUtil.IAuthTabCallback] ^ cArrOnExtraCallback[repeatModeUtil.IAuthTabCallback % 4]) ^ (repeatModeUtil.onNavigationEvent * (onExtraCallback ^ 8686948009763778008L)));
            repeatModeUtil.IAuthTabCallback++;
        }
        objArr[0] = new String(cArrOnExtraCallback, 4, cArrOnExtraCallback.length - 4);
    }

    public static class IAuthTabCallback extends ClassLoader {
        private static int IAuthTabCallback = 0;
        private static int asInterface = 1;
        private static int onExtraCallback = 0;
        private static int[] onExtraCallbackWithResult = {-867958156, 659146559, 616459091, -918905249, -1118618102, -1865668653, -363721566, -9967679, 2114665329, 1517157626, 1788502951, -1540178140, -1396759078, -28553325, 1771305280, 513386357, 65560955, -1902754735};
        private static int onNavigationEvent = 1;
        private final ClassLoader onWarmupCompleted;

        public IAuthTabCallback(ClassLoader classLoader) {
            super(classLoader);
            this.onWarmupCompleted = classLoader;
        }

        public boolean IAuthTabCallback(String str) throws NoSuchMethodException, SecurityException {
            Method declaredMethod;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 61;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            try {
                Object[] objArr = new Object[1];
                onWarmupCompleted(new int[]{1141326778, -12459271, -298482749, -2067117481, 404641649, -338705812, -496767269, 866767284}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 14, objArr);
                declaredMethod = ClassLoader.class.getDeclaredMethod((String) objArr[0], String.class);
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            if (((Class) declaredMethod.invoke(this.onWarmupCompleted, str)) != null) {
                return true;
            }
            int i4 = onNavigationEvent + 51;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        private static void onWarmupCompleted(int[] iArr, int i, Object[] objArr) {
            int i2 = 2;
            int i3 = 2 % 2;
            UtilExternalSyntheticLambda3 utilExternalSyntheticLambda3 = new UtilExternalSyntheticLambda3();
            char[] cArr = new char[4];
            int i4 = 1;
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = onExtraCallbackWithResult;
            if (iArr2 != null) {
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                for (int i5 = 0; i5 < length; i5++) {
                    iArr3[i5] = (int) (iArr2[i5] ^ (-2238453702121083934L));
                }
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = onExtraCallbackWithResult;
            if (iArr5 != null) {
                int i6 = IAuthTabCallback + 27;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i8 = 0;
                while (i8 < length3) {
                    iArr6[i8] = (int) (iArr5[i8] ^ (-2238453702121083934L));
                    i8++;
                    length2 = length2;
                    i2 = 2;
                    i4 = 1;
                }
                iArr5 = iArr6;
            }
            System.arraycopy(iArr5, 0, iArr4, 0, length2);
            utilExternalSyntheticLambda3.onExtraCallback = 0;
            while (utilExternalSyntheticLambda3.onExtraCallback < iArr.length) {
                cArr[0] = (char) (iArr[utilExternalSyntheticLambda3.onExtraCallback] >> 16);
                cArr[i4] = (char) iArr[utilExternalSyntheticLambda3.onExtraCallback];
                cArr[i2] = (char) (iArr[utilExternalSyntheticLambda3.onExtraCallback + i4] >> 16);
                cArr[3] = (char) iArr[utilExternalSyntheticLambda3.onExtraCallback + i4];
                utilExternalSyntheticLambda3.IAuthTabCallback = (cArr[0] << 16) + cArr[i4];
                utilExternalSyntheticLambda3.onNavigationEvent = (cArr[i2] << 16) + cArr[3];
                UtilExternalSyntheticLambda3.onWarmupCompleted(iArr4);
                for (int i9 = 0; i9 < 16; i9++) {
                    int i10 = asInterface + 21;
                    IAuthTabCallback = i10 % 128;
                    int i11 = i10 % i2;
                    utilExternalSyntheticLambda3.IAuthTabCallback ^= iArr4[i9];
                    utilExternalSyntheticLambda3.onNavigationEvent = UtilExternalSyntheticLambda3.onNavigationEvent(utilExternalSyntheticLambda3.IAuthTabCallback) ^ utilExternalSyntheticLambda3.onNavigationEvent;
                    int i12 = utilExternalSyntheticLambda3.IAuthTabCallback;
                    utilExternalSyntheticLambda3.IAuthTabCallback = utilExternalSyntheticLambda3.onNavigationEvent;
                    utilExternalSyntheticLambda3.onNavigationEvent = i12;
                }
                int i13 = utilExternalSyntheticLambda3.IAuthTabCallback;
                utilExternalSyntheticLambda3.IAuthTabCallback = utilExternalSyntheticLambda3.onNavigationEvent;
                utilExternalSyntheticLambda3.onNavigationEvent = i13;
                utilExternalSyntheticLambda3.onNavigationEvent ^= iArr4[16];
                utilExternalSyntheticLambda3.IAuthTabCallback ^= iArr4[17];
                int i14 = utilExternalSyntheticLambda3.IAuthTabCallback;
                int i15 = utilExternalSyntheticLambda3.onNavigationEvent;
                cArr[0] = (char) (utilExternalSyntheticLambda3.IAuthTabCallback >>> 16);
                cArr[i4] = (char) utilExternalSyntheticLambda3.IAuthTabCallback;
                cArr[i2] = (char) (utilExternalSyntheticLambda3.onNavigationEvent >>> 16);
                cArr[3] = (char) utilExternalSyntheticLambda3.onNavigationEvent;
                UtilExternalSyntheticLambda3.onWarmupCompleted(iArr4);
                cArr2[utilExternalSyntheticLambda3.onExtraCallback << i4] = cArr[0];
                cArr2[(utilExternalSyntheticLambda3.onExtraCallback << i4) + i4] = cArr[i4];
                cArr2[(utilExternalSyntheticLambda3.onExtraCallback << i4) + i2] = cArr[i2];
                cArr2[(utilExternalSyntheticLambda3.onExtraCallback << i4) + 3] = cArr[3];
                utilExternalSyntheticLambda3.onExtraCallback += i2;
            }
            objArr[0] = new String(cArr2, 0, i);
        }
    }
}
