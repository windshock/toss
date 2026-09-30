package o;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdat8liHx0zyKzoz0sXAVj4AicfK_o {
    private static int $10 = 0;
    private static int $11 = 1;
    private static boolean IAuthTabCallback = false;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;
    private static boolean onExtraCallback = false;
    public static final r8lambdat8liHx0zyKzoz0sXAVj4AicfK_o onExtraCallbackWithResult;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    private static char[] onWarmupCompleted;

    static {
        onExtraCallbackWithResult();
        onExtraCallbackWithResult = new r8lambdat8liHx0zyKzoz0sXAVj4AicfK_o();
        int i = IAuthTabCallbackDefault + 81;
        onTransact = i % 128;
        if (i % 2 == 0) {
            int i2 = 16 / 0;
        }
    }

    private r8lambdat8liHx0zyKzoz0sXAVj4AicfK_o() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0062, code lost:
    
        return r14.get(0) + "." + r14.get(1) + ".x";
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0063, code lost:
    
        r2 = new java.lang.Object[1];
        a(null, null, new byte[]{-126, -123, -124, -126, -125, -126, -127}, 126 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0), r2);
        r14 = ((java.lang.String) r2[0]).intern();
        r1 = o.r8lambdat8liHx0zyKzoz0sXAVj4AicfK_o.asBinder + 77;
        o.r8lambdat8liHx0zyKzoz0sXAVj4AicfK_o.IAuthTabCallbackStub = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0088, code lost:
    
        if ((r1 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x008a, code lost:
    
        r0 = 9 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008d, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002a, code lost:
    
        if (r14.size() >= 4) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0041, code lost:
    
        if (r14.size() >= 2) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String onNavigationEvent(@NotNull String str) throws Throwable {
        List listSplit$default;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 75;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            listSplit$default = StringsKt.split$default(str, new String[]{"."}, true, 1, 68, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            listSplit$default = StringsKt.split$default(str, new String[]{"."}, false, 0, 6, (Object) null);
        }
    }

    public final String onExtraCallback(long j) {
        int i = 2 % 2;
        if (j < 500) {
            int i2 = IAuthTabCallbackStub + 17;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                return "lt_500ms";
            }
            int i3 = 54 / 0;
            return "lt_500ms";
        }
        if (j >= 1000) {
            return j < 2000 ? "lt_2s" : j < 5000 ? "lt_5s" : "gte_5s";
        }
        int i4 = IAuthTabCallbackStub + 65;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return "lt_1s";
        }
        throw null;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onWarmupCompleted;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                int i4 = $10 + 7;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) + 76, 20952 - TextUtils.getOffsetBefore("", 0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i3++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 74, 16037 - KeyEvent.getDeadChar(0, 0), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        if (onExtraCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", 0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 62, 12213 - Process.getGidForName(""), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!IAuthTabCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i6 = $10 + 97;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i8 = $11 + 67;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), TextUtils.lastIndexOf("", '0') + 64, 12262 - AndroidCharacter.getMirror('0'), 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr6);
    }

    static void onExtraCallbackWithResult() {
        onWarmupCompleted = new char[]{32497, 32504, 32507, 32511, 32503};
        onNavigationEvent = -1184333970;
        IAuthTabCallback = true;
        onExtraCallback = true;
    }
}
