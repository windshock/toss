package o;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class applyConstraintsFromLayoutParams {
    private static volatile Handler onExtraCallback;
    private static final char[] onExtraCallbackWithResult = "0123456789abcdef".toCharArray();
    private static final char[] onNavigationEvent = new char[64];

    private static boolean onExtraCallback(int i2) {
        return i2 > 0 || i2 == Integer.MIN_VALUE;
    }

    public static int onExtraCallbackWithResult(int i2, int i3) {
        return (i3 * 31) + i2;
    }

    private applyConstraintsFromLayoutParams() {
    }

    public static String onExtraCallback(@NonNull byte[] bArr) {
        String strOnWarmupCompleted;
        char[] cArr = onNavigationEvent;
        synchronized (cArr) {
            strOnWarmupCompleted = onWarmupCompleted(bArr, cArr);
        }
        return strOnWarmupCompleted;
    }

    private static String onWarmupCompleted(@NonNull byte[] bArr, @NonNull char[] cArr) {
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b = bArr[i2];
            int i3 = i2 << 1;
            char[] cArr2 = onExtraCallbackWithResult;
            cArr[i3] = cArr2[(b & 255) >>> 4];
            cArr[i3 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public static int onWarmupCompleted(@NonNull Bitmap bitmap) {
        if (bitmap.isRecycled()) {
            throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (NullPointerException unused) {
            return bitmap.getHeight() * bitmap.getRowBytes();
        }
    }

    public static int onNavigationEvent(int i2, int i3, @Nullable Bitmap.Config config) {
        return i2 * i3 * onWarmupCompleted(config);
    }

    public static int onWarmupCompleted(@Nullable Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i2 = AnonymousClass3.onWarmupCompleted[config.ordinal()];
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2 && i2 != 3) {
                return i2 != 4 ? 4 : 8;
            }
        }
        return i3;
    }

    /* renamed from: o.applyConstraintsFromLayoutParams$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            onWarmupCompleted = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onWarmupCompleted[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                onWarmupCompleted[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                onWarmupCompleted[StabilizationMode.onNavigationEvent().ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                onWarmupCompleted[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static boolean onExtraCallback(int i2, int i3) {
        return onExtraCallback(i2) && onExtraCallback(i3);
    }

    public static void onExtraCallbackWithResult(Runnable runnable) {
        onExtraCallback().post(runnable);
    }

    public static void onNavigationEvent(Runnable runnable) {
        onExtraCallback().removeCallbacks(runnable);
    }

    private static Handler onExtraCallback() {
        if (onExtraCallback == null) {
            synchronized (applyConstraintsFromLayoutParams.class) {
                if (onExtraCallback == null) {
                    onExtraCallback = new Handler(Looper.getMainLooper());
                }
            }
        }
        return onExtraCallback;
    }

    public static void onNavigationEvent() {
        if (!onWarmupCompleted()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static void onExtraCallbackWithResult() {
        if (!IAuthTabCallback()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
    }

    public static boolean onWarmupCompleted() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean IAuthTabCallback() {
        return !onWarmupCompleted();
    }

    public static <T> Queue<T> onWarmupCompleted(int i2) {
        return new ArrayDeque(i2);
    }

    public static <T> List<T> IAuthTabCallback(@NonNull Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t : collection) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static boolean onExtraCallback(@Nullable Object obj, @Nullable Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static boolean IAuthTabCallback(@Nullable Object obj, @Nullable Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        if (obj instanceof TextForegroundStyleExternalSyntheticLambda0) {
            return ((TextForegroundStyleExternalSyntheticLambda0) obj).IAuthTabCallback(obj2);
        }
        return obj.equals(obj2);
    }

    public static int IAuthTabCallback(int i2) {
        return onExtraCallbackWithResult(i2, 17);
    }

    public static int IAuthTabCallback(float f) {
        return onWarmupCompleted(f, 17);
    }

    public static int onWarmupCompleted(float f, int i2) {
        return onExtraCallbackWithResult(Float.floatToIntBits(f), i2);
    }

    public static int onExtraCallbackWithResult(@Nullable Object obj, int i2) {
        return onExtraCallbackWithResult(obj == null ? 0 : obj.hashCode(), i2);
    }

    public static int onExtraCallback(boolean z, int i2) {
        return onExtraCallbackWithResult(z ? 1 : 0, i2);
    }
}
