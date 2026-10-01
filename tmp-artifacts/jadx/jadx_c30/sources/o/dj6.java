package o;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Locale;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.function.Consumer;
import net.sf.scuba.smartcards.BuildConfig;
import o.dj6;
import o.djdj;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class dj6 implements djdj {
    private static final String IAuthTabCallback;
    private static int IAuthTabCallbackStub;
    private static int access100;
    private static final String onExtraCallback;
    private static final dj6 onExtraCallbackWithResult;
    private static final String onWarmupCompleted;
    private static final byte[] $$a = {51, -113, 92, 4};
    private static final int $$b = 99;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int asInterface = 0;
    private static int onTransact = 1;
    private final Boolean onNavigationEvent = null;
    private final int IAuthTabCallbackDefault = -1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, short s) {
        int i2;
        int i3 = 105 - (i * 2);
        int i4 = b * 3;
        int i5 = 4 - (s * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i6 = i5;
            int i7 = 0;
            i3 += -i5;
            i5 = i6 + 1;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            if (i2 == i4) {
                return new String(bArr2, 0);
            }
            i6 = i5;
            i5 = bArr[i5];
            i3 += -i5;
            i5 = i6 + 1;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            if (i2 == i4) {
            }
        }
    }

    static {
        access100 = 1;
        IAuthTabCallback();
        onExtraCallbackWithResult = new dj6();
        Object[] objArr = new Object[1];
        a(32 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0'), 10 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), new char[]{'\n', '\b', 65488, 65488, 65499, 20, 17, 21, 21, '\t', 65488, '\n', '\r', 21, 16, 19, 3, 65488, 6, '\r', '\b', 16, 16, '\b', 65488, 14, 16, 4, 65487, 3, 22, '\t', 21}, true, KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 248, objArr);
        IAuthTabCallback = onExtraCallbackWithResult("Google Brotli Dec", ((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        a((ViewConfiguration.getScrollBarSize() >> 8) + 32, TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 2, new char[]{'\r', '\f', '\b', 20, 20, 16, 19, 65498, 65487, 65487, 20, 21, 11, 1, 1, 14, '\t', 65486, 15, 18, 7, 65487, 24, 26, 65487, '\n', 1, 22, 1, 65486, '\b', 20}, false, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 248, objArr2);
        onWarmupCompleted = onExtraCallbackWithResult("XZ for Java", ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a(34 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 4, new char[]{65485, '\n', 14, '\t', '\b', 20, 20, 16, 19, 65498, 65487, 65487, 7, '\t', 20, '\b', 21, 2, 65486, 3, 15, '\r', 65487, '\f', 21, 2, 5, 14, 65487, 26, 19, 20, 4}, false, Color.green(0) + 249, objArr3);
        onExtraCallback = onExtraCallbackWithResult("Zstd JNI", ((String) objArr3[0]).intern());
        int i = asBinder + 45;
        access100 = i % 128;
        if (i % 2 == 0) {
            int i2 = 7 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(IAuthTabCallbackStub)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35124 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0)), 23 - (Process.myPid() >> 22), 10278 - Gravity.getAbsoluteGravity(0, 0), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 55 - (ViewConfiguration.getWindowTouchSlop() >> 8), 2167 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
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
        if (i2 > 0) {
            int i7 = $10 + 17;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            int i9 = $11 + 11;
            $10 = i9 % 128;
            int i10 = i9 % 2;
        }
        if (z) {
            int i11 = $11 + 67;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getEdgeSlop() >> 16)), Color.argb(0, 0, 0, 0) + 55, Color.green(0) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static Iterable<djdj> onTransact() {
        int i = 2 % 2;
        int i2 = onTransact + 115;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ServiceLoader serviceLoaderLoad = ServiceLoader.load(djdj.class, ClassLoader.getSystemClassLoader());
        int i4 = asInterface + 23;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 36 / 0;
        }
        return serviceLoaderLoad;
    }

    public static /* synthetic */ void IAuthTabCallback(TreeMap treeMap, djdj djdjVar) {
        int i = 2 % 2;
        int i2 = asInterface + 99;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(djdjVar.onWarmupCompleted(), djdjVar, treeMap);
        int i4 = asInterface + 15;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ SortedMap onNavigationEvent() {
        int i = 2 % 2;
        final TreeMap treeMap = new TreeMap();
        dj6 dj6Var = onExtraCallbackWithResult;
        IAuthTabCallback(dj6Var.onWarmupCompleted(), dj6Var, treeMap);
        onTransact().forEach(new Consumer() { // from class: org.apache.commons.compress.compressors.CompressorStreamFactory$$ExternalSyntheticLambda0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                dj6.IAuthTabCallback(treeMap, (djdj) obj);
            }
        });
        int i2 = asInterface + 29;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return treeMap;
    }

    public static /* synthetic */ SortedMap onExtraCallback() {
        int i = 2 % 2;
        final TreeMap treeMap = new TreeMap();
        dj6 dj6Var = onExtraCallbackWithResult;
        IAuthTabCallback(dj6Var.onExtraCallbackWithResult(), dj6Var, treeMap);
        onTransact().forEach(new Consumer() { // from class: org.apache.commons.compress.compressors.CompressorStreamFactory$$ExternalSyntheticLambda1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                dj6.onWarmupCompleted(treeMap, (djdj) obj);
            }
        });
        int i2 = asInterface + 31;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return treeMap;
    }

    public static /* synthetic */ void onWarmupCompleted(TreeMap treeMap, djdj djdjVar) {
        int i = 2 % 2;
        int i2 = onTransact + 105;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(djdjVar.onExtraCallbackWithResult(), djdjVar, treeMap);
        int i4 = asInterface + 31;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static void IAuthTabCallback(Set<String> set, final djdj djdjVar, final TreeMap<String, djdj> treeMap) {
        int i = 2 % 2;
        set.forEach(new Consumer() { // from class: org.apache.commons.compress.compressors.CompressorStreamFactory$$ExternalSyntheticLambda4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                dj6.onNavigationEvent(treeMap, djdjVar, (String) obj);
            }
        });
        int i2 = onTransact + 15;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(TreeMap treeMap, djdj djdjVar, String str) {
        int i = 2 % 2;
        int i2 = asInterface + 3;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int i4 = asInterface + 47;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 67 / 0;
        }
    }

    private static String onExtraCallbackWithResult(String str) {
        String upperCase;
        int i = 2 % 2;
        int i2 = asInterface + 81;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            upperCase = str.toUpperCase(Locale.ROOT);
            int i3 = 17 / 0;
        } else {
            upperCase = str.toUpperCase(Locale.ROOT);
        }
        int i4 = onTransact + 51;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return upperCase;
    }

    private static String onExtraCallbackWithResult(String str, String str2) {
        int i = 2 % 2;
        String str3 = " In addition to Apache Commons Compress you need the " + str + " library - see " + str2;
        int i2 = asInterface + 75;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 68 / 0;
        }
        return str3;
    }

    @Override // o.djdj
    public Set<String> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 93;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        HashSet hashSetOnWarmupCompleted = PAGNativeAdDataPAGNativeMediaType.onWarmupCompleted("gz", "br", "bzip2", "xz", "lzma", "pack200", "deflate", "snappy-raw", "snappy-framed", "z", "lz4-block", "lz4-framed", "zstd", "deflate64");
        int i4 = onTransact + 35;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return hashSetOnWarmupCompleted;
        }
        throw null;
    }

    @Override // o.djdj
    public Set<String> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 11;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        HashSet hashSetOnWarmupCompleted = PAGNativeAdDataPAGNativeMediaType.onWarmupCompleted("gz", "bzip2", "xz", "lzma", "pack200", "deflate", "snappy-framed", "lz4-block", "lz4-framed", "zstd");
        int i4 = onTransact + 103;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 70 / 0;
        }
        return hashSetOnWarmupCompleted;
    }

    static void IAuthTabCallback() {
        IAuthTabCallbackStub = 478309040;
    }
}
