package o;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import im.toss.features.home.core.local.model.dst.element.HomeListHeaderLocal;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ExtHubNodeBinder extends onReceiveCdp<HomeListHeaderLocal.Right> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 0;
    private static int asBinder = 0;
    private static int asInterface = 1;
    public static final ExtHubNodeBinder onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static char onWarmupCompleted;

    static {
        onNavigationEvent();
        onExtraCallback = new ExtHubNodeBinder();
        int i = asInterface + 13;
        asBinder = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private ExtHubNodeBinder() throws Throwable {
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(HomeListHeaderLocal.Right.class);
        Object[] objArr = new Object[1];
        a(new char[]{33403, 26294, 54258, 34989}, (KeyEvent.getMaxKeyCode() >> 16) + 4, objArr);
        super(orCreateKotlinClass, ((String) objArr[0]).intern(), access8100.onNavigationEvent(getWrite.IAuthTabCallback("TEXT", Reflection.getOrCreateKotlinClass(HomeListHeaderLocal.Right.Text.class))), (String) null, 8, (DefaultConstructorMarker) null);
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i5 = $11 + 105;
            $10 = i5 % 128;
            int i6 = 58224;
            if (i5 % 2 != 0) {
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent - 1];
                i2 = 1;
            } else {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                i2 = i4;
            }
            while (i2 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i4];
                int i7 = (c2 + i6) ^ ((c2 << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)));
                int i8 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onNavigationEvent);
                    objArr2[2] = Integer.valueOf(i8);
                    objArr2[1] = Integer.valueOf(i7);
                    objArr2[i4] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 10;
                        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cLastIndexOf, tapTimeout, longPressTimeout, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 10 - (ViewConfiguration.getLongPressTimeout() >> 16), 12434 - ((Process.getThreadPriority(0) + 20) >> 6), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i2++;
                    int i9 = $10 + 13;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    cArr3 = cArr4;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16015 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 14 - (Process.myTid() >> 22), 19901 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onNavigationEvent() {
        onWarmupCompleted = (char) 3596;
        IAuthTabCallback = (char) 11711;
        onExtraCallbackWithResult = (char) 1524;
        onNavigationEvent = (char) 3871;
    }
}
