package im.toss.rn.toss.core.bridge.module.image;

import android.app.Activity;
import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import im.toss.rn.toss.core.bridge.module.image.FastImageViewModule$;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CarouselKtCarousel4ExternalSyntheticLambda0;
import o.CarouselKtExternalSyntheticLambda8;
import o.MovableContentKtExternalSyntheticLambda13;
import o.PullToRefreshDefaultsExternalSyntheticLambda3;
import o.RecomposerawaitIdle2;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class FastImageViewModule extends ReactContextBaseJavaModule {
    private static final byte[] $$a = {1, -9, -86, 35};
    private static final int $$b = 120;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onWarmupCompleted = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 478309028;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, int i2, byte b) {
        int i3;
        byte[] bArr = $$a;
        int i4 = 4 - (i2 * 2);
        int i5 = i * 3;
        int i6 = (b * 2) + 105;
        byte[] bArr2 = new byte[1 - i5];
        int i7 = 0 - i5;
        if (bArr == null) {
            int i8 = i7;
            int i9 = i4;
            int i10 = 0;
            int i11 = (-i4) + i8;
            int i12 = i9 + 1;
            i3 = i10;
            i6 = i11;
            i4 = i12;
            bArr2[i3] = (byte) i6;
            i10 = i3 + 1;
            if (i3 == i7) {
                return new String(bArr2, 0);
            }
            int i13 = i6;
            i9 = i4;
            i4 = bArr[i4];
            i8 = i13;
            int i112 = (-i4) + i8;
            int i122 = i9 + 1;
            i3 = i10;
            i6 = i112;
            i4 = i122;
            bArr2[i3] = (byte) i6;
            i10 = i3 + 1;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i6;
            i10 = i3 + 1;
            if (i3 == i7) {
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$CY1WlFMiWfU1lQmvSgbAced9Z1s(ReadableArray readableArray, CarouselKtExternalSyntheticLambda8 carouselKtExternalSyntheticLambda8, Activity activity) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        preload$lambda$0(readableArray, carouselKtExternalSyntheticLambda8, activity);
        int i4 = onExtraCallback + 71;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 33 / 0;
        }
    }

    /* renamed from: $r8$lambda$itBVVW_WCpADaSaI-rJ7UKso838, reason: not valid java name */
    public static /* synthetic */ void m6$r8$lambda$itBVVW_WCpADaSaIrJ7UKso838(Activity activity, Promise promise) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        clearMemoryCache$lambda$0(activity, promise);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onWarmupCompleted + 41;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void $r8$lambda$mA45O5i4M4gXVkkskRO7vhxRKjU(Activity activity, Promise promise) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        clearDiskCache$lambda$0(activity, promise);
        int i4 = onExtraCallback + 27;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public FastImageViewModule(@Nullable ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private final Activity getParentActivity() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        int i4 = onExtraCallback + 15;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return currentActivity;
        }
        throw null;
    }

    @ReactMethod
    public final void preload(@NotNull ReadableArray readableArray) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(readableArray, "");
            getParentActivity();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(readableArray, "");
        Activity parentActivity = getParentActivity();
        if (parentActivity == null) {
            int i3 = onWarmupCompleted + 31;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
        } else {
            parentActivity.runOnUiThread(new FastImageViewModule$.ExternalSyntheticLambda1(readableArray, CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(parentActivity), parentActivity));
            int i5 = onWarmupCompleted + 3;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0093 A[PHI: r5
      0x0093: PHI (r5v5 java.lang.String) = (r5v4 java.lang.String), (r5v8 java.lang.String) binds: [B:14:0x0091, B:11:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void preload$lambda$0(ReadableArray readableArray, CarouselKtExternalSyntheticLambda8 carouselKtExternalSyntheticLambda8, Activity activity) throws Throwable {
        String string;
        int i = 2 % 2;
        int size = readableArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = onExtraCallback + 15;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                readableArray.getMap(i2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ReadableMap map = readableArray.getMap(i2);
            if (map != null) {
                int i4 = onExtraCallback + 41;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    Object[] objArr = new Object[1];
                    a(5 % (Process.myPid() << 85), (ViewConfiguration.getScrollBarSize() / 83) * 4, new char[]{65529, 2, 5}, true, 29848 >> (ViewConfiguration.getMaximumDrawingCacheSize() >>> 60), objArr);
                    string = map.getString(((String) objArr[0]).intern());
                    if (string != null) {
                        carouselKtExternalSyntheticLambda8.onWarmupCompleted(new RecomposerawaitIdle2.onNavigationEvent(activity).onExtraCallback(string).onExtraCallbackWithResult());
                    }
                } else {
                    Object[] objArr2 = new Object[1];
                    a((Process.myPid() >> 22) + 3, 3 - (ViewConfiguration.getScrollBarSize() >> 8), new char[]{65529, 2, 5}, true, 253 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr2);
                    string = map.getString(((String) objArr2[0]).intern());
                    if (string != null) {
                    }
                }
            }
        }
    }

    @ReactMethod
    public final void clearMemoryCache(@NotNull Promise promise) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(promise, "");
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            parentActivity.runOnUiThread(new FastImageViewModule$.ExternalSyntheticLambda0(parentActivity, promise));
            return;
        }
        int i4 = onExtraCallback + 91;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            promise.resolve((Object) null);
            int i5 = 72 / 0;
        } else {
            promise.resolve((Object) null);
        }
        int i6 = onWarmupCompleted + 71;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 83 / 0;
        }
    }

    private static final void clearMemoryCache$lambda$0(Activity activity, Promise promise) {
        int i = 2 % 2;
        MovableContentKtExternalSyntheticLambda13 movableContentKtExternalSyntheticLambda13OnWarmupCompleted = CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(activity).onWarmupCompleted();
        if (movableContentKtExternalSyntheticLambda13OnWarmupCompleted != null) {
            int i2 = onExtraCallback + 55;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            movableContentKtExternalSyntheticLambda13OnWarmupCompleted.onExtraCallbackWithResult();
            int i4 = onWarmupCompleted + 77;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        promise.resolve((Object) null);
    }

    @ReactMethod
    public final void clearDiskCache(@NotNull Promise promise) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(promise, "");
        Activity parentActivity = getParentActivity();
        Object obj = null;
        if (parentActivity != null) {
            parentActivity.runOnUiThread(new FastImageViewModule$.ExternalSyntheticLambda2(parentActivity, promise));
            int i2 = onExtraCallback + 81;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int i3 = onWarmupCompleted + 83;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            promise.resolve((Object) null);
        } else {
            promise.resolve((Object) null);
            obj.hashCode();
            throw null;
        }
    }

    private static final void clearDiskCache$lambda$0(Activity activity, Promise promise) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            PullToRefreshDefaultsExternalSyntheticLambda3 pullToRefreshDefaultsExternalSyntheticLambda3OnNavigationEvent = CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(activity).onNavigationEvent();
            if (pullToRefreshDefaultsExternalSyntheticLambda3OnNavigationEvent != null) {
                int i3 = onWarmupCompleted + 21;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    pullToRefreshDefaultsExternalSyntheticLambda3OnNavigationEvent.onExtraCallbackWithResult();
                    int i4 = 45 / 0;
                } else {
                    pullToRefreshDefaultsExternalSyntheticLambda3OnNavigationEvent.onExtraCallbackWithResult();
                }
            }
            promise.resolve((Object) null);
            int i5 = onExtraCallback + 19;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(activity).onNavigationEvent();
        throw null;
    }

    public String getName() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return "FastImageView";
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x018b  */
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
        int i6 = $11 + 1;
        $10 = i6 % 128;
        while (true) {
            int i7 = i6 % 2;
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            int i8 = $10 + 83;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i10 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i10]), Integer.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 35124), 23 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 10278 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i10] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 12844);
                    int maximumFlingVelocity = 55 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int iArgb = Color.argb(0, 0, 0, 0) + 2167;
                    byte b = (byte) ($$a[0] - 1);
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, maximumFlingVelocity, iArgb, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                i6 = $10 + 13;
                $11 = i6 % 128;
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
            int i11 = $11 + 3;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i13 = $10 + 77;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i15 = $11 + 53;
                $10 = i15 % 128;
                if (i15 % 2 != 0) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[i >> simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 12843);
                        int iRed = Color.red(0) + 55;
                        int iAlpha = Color.alpha(0) + 2167;
                        byte b3 = (byte) ($$a[0] - 1);
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(maxKeyCode, iRed, iAlpha, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } else {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    try {
                        Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                        if (objOnExtraCallback4 == null) {
                            char cRed = (char) (Color.red(0) + 12843);
                            int maxKeyCode2 = (KeyEvent.getMaxKeyCode() >> 16) + 55;
                            int threadPriority = 2167 - ((Process.getThreadPriority(0) + 20) >> 6);
                            byte b5 = (byte) ($$a[0] - 1);
                            byte b6 = b5;
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cRed, maxKeyCode2, threadPriority, 1298711993, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }
}
