package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class onlyIfCached {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ onlyIfCached[] $VALUES;
    public static final onlyIfCached BASIC;
    private static int IAuthTabCallback = 1;
    public static final onlyIfCached NONE;
    public static final onlyIfCached STRONG;
    public static final onlyIfCached WEAK;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int[] onNavigationEvent;
    private static int onWarmupCompleted;
    private final String url;

    private static final /* synthetic */ onlyIfCached[] $values() {
        onlyIfCached[] onlyifcachedArr;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            onlyIfCached onlyifcached = NONE;
            onlyIfCached onlyifcached2 = WEAK;
            onlyIfCached onlyifcached3 = BASIC;
            onlyIfCached onlyifcached4 = STRONG;
            onlyifcachedArr = new onlyIfCached[5];
            onlyifcachedArr[0] = onlyifcached;
            onlyifcachedArr[0] = onlyifcached2;
            onlyifcachedArr[2] = onlyifcached3;
            onlyifcachedArr[5] = onlyifcached4;
        } else {
            onlyifcachedArr = new onlyIfCached[]{NONE, WEAK, BASIC, STRONG};
        }
        int i4 = i3 + 59;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return onlyifcachedArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<onlyIfCached> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        EnumEntries<onlyIfCached> enumEntries = $ENTRIES;
        int i5 = i3 + 67;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static onlyIfCached valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onlyIfCached onlyifcached = (onlyIfCached) Enum.valueOf(onlyIfCached.class, str);
        int i4 = onExtraCallbackWithResult + 125;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 33 / 0;
        }
        return onlyifcached;
    }

    public static onlyIfCached[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onlyIfCached[] onlyifcachedArr = $VALUES;
        if (i3 == 0) {
            return (onlyIfCached[]) onlyifcachedArr.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = onNavigationEvent;
        int i3 = -1469660336;
        int i4 = 16;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i5 = 0;
            while (i5 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> i4), Drawable.resolveOpacity(0, 0) + 72, (ViewConfiguration.getScrollBarSize() >> 8) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr4[i5] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i5++;
                    i3 = -1469660336;
                    i4 = 16;
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
        int[] iArr6 = onNavigationEvent;
        long j = 0;
        if (iArr6 != null) {
            int i6 = $11 + 105;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr3 = {Integer.valueOf(iArr6[i7])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) + 71, (-16768368) - Color.rgb(0, 0, 0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i7] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i7++;
                    j = 0;
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
        int i8 = $10 + 97;
        $11 = i8 % 128;
        int i9 = i8 % 2;
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
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i10];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 22253), 40 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) + 10302, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i10++;
            }
            int i12 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i12;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr5[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[17];
            int i13 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
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
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTapTimeout() >> 16) + 4033), 78 - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 7397, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private onlyIfCached(String str, int i, String str2) {
        this.url = str2;
    }

    public String getUrl() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            str = this.url;
            int i4 = 73 / 0;
        } else {
            str = this.url;
        }
        int i5 = i3 + 69;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    static {
        onExtraCallback();
        NONE = new onlyIfCached("NONE", 0, "");
        Object[] objArr = new Object[1];
        a(new int[]{-1414002222, 665044313, 404825905, 1792937258, 1144813287, -789652486, -31512991, 615202870, 385205542, -236547550, -1365666391, 75317066, -2051742731, 933353080, 1115332933, -2132974443, 1713438305, -1532590581, 370218234, 656925979, 1933453348, 1714647276, -207602041, -1926138195, -426952174, -318493600, -973661604, 910207673, 122794901, 526128054, 550532228, -1539076334, -989371564, 1940666677}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 65, objArr);
        WEAK = new onlyIfCached("WEAK", 1, ((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        a(new int[]{-1414002222, 665044313, 404825905, 1792937258, 1144813287, -789652486, -31512991, 615202870, 385205542, -236547550, -1365666391, 75317066, -2051742731, 933353080, 1115332933, -2132974443, 1713438305, -1532590581, 370218234, 656925979, 1933453348, 1714647276, -207602041, -1926138195, -426952174, -318493600, -973661604, 910207673, -2030561080, -644543503, 683415317, -1837040435, -1336876483, -1426345701}, 65 - MotionEvent.axisFromString(""), objArr2);
        BASIC = new onlyIfCached("BASIC", 2, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a(new int[]{-1414002222, 665044313, 404825905, 1792937258, 1144813287, -789652486, -31512991, 615202870, 385205542, -236547550, -1365666391, 75317066, -2051742731, 933353080, 1115332933, -2132974443, 1713438305, -1532590581, 370218234, 656925979, 1933453348, 1714647276, -207602041, -1926138195, -426952174, -318493600, -973661604, 910207673, 9749091, -1559895572, -1584563014, 1640680508, -1961739631, 272487180}, 67 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr3);
        STRONG = new onlyIfCached("STRONG", 3, ((String) objArr3[0]).intern());
        onlyIfCached[] onlyifcachedArr$values = $values();
        $VALUES = onlyifcachedArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(onlyifcachedArr$values);
        int i = onWarmupCompleted + 11;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    static void onExtraCallback() {
        onNavigationEvent = new int[]{1082396367, -1675580019, -494328114, 1780273068, 1962113625, 762764624, -223699774, -630764851, 481796574, -69696508, 1653585501, 1542124898, -875455453, -12597688, 1049807021, -991433495, 1279395567, -99172440};
    }
}
