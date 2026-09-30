package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class fatalError$onExtraCallbackWithResult implements fatalError {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final fatalError$onExtraCallbackWithResult IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;
    private static int onExtraCallback = 0;
    private static boolean onExtraCallbackWithResult = false;
    private static boolean onNavigationEvent = false;
    private static int onTransact = 1;
    private static char[] onWarmupCompleted;

    static {
        onExtraCallbackWithResult();
        IAuthTabCallback = new fatalError$onExtraCallbackWithResult();
        int i = IAuthTabCallbackDefault + 95;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 13;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fatalError$onExtraCallbackWithResult)) {
            int i4 = i3 + 65;
            asBinder = i4 % 128;
            return i4 % 2 != 0;
        }
        int i5 = i3 + 9;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 43;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 43;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return -339538506;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 21;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-121, -122, -123, -124, -125, -126, -127}, 127 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i4 = IAuthTabCallbackStub + 43;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 83 / 0;
        }
        return strIntern;
    }

    private fatalError$onExtraCallbackWithResult() {
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int length;
        char[] cArr2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = onWarmupCompleted;
        long j = 0;
        if (cArr3 != null) {
            int i4 = $10 + 51;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) - 1), Color.rgb(0, 0, 0) + 16777293, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr2[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i5++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), TextUtils.getOffsetBefore("", 0) + 75, (ViewConfiguration.getTapTimeout() >> 16) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        if (onExtraCallbackWithResult) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ImageFormat.getBitsPerPixel(0)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 62, 12214 - View.MeasureSpec.getMode(0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!onNavigationEvent) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i6 = $10 + 95;
        $11 = i6 % 128;
        if (i6 % 2 == 0) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            i2 = defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback;
        } else {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            i2 = defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback;
        }
        char[] cArr6 = new char[i2];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - Process.getGidForName("")), 63 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 12214 - (Process.myTid() >> 22), 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr6);
    }

    static void onExtraCallbackWithResult() {
        onWarmupCompleted = new char[]{32725, 32746, 32760, 32765, 32752, 32747, 32754};
        onExtraCallback = -1184333927;
        onNavigationEvent = true;
        onExtraCallbackWithResult = true;
    }
}
