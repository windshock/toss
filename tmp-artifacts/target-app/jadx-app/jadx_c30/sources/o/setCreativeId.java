package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISO7816;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setCreativeId {
    private static final long IAuthTabCallback;
    private static char[] IAuthTabCallbackDefault;
    private static int asBinder;
    private static final long onExtraCallback;
    private static final String onExtraCallbackWithResult;
    private static final long onNavigationEvent;
    private static long onTransact;
    public static final setCreativeId onWarmupCompleted;
    private static final byte[] $$a = {ISO7816.INS_DECREASE_STAMPED, -107, 59, -11};
    private static final int $$b = 13;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int access000 = 1;
    private static int asInterface = 1;

    public static final class IAuthTabCallback implements HttpLoggingInterceptor.Logger {
        public void log(String str) {
            Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
            ApmHelper.onNavigationEvent("[API] " + str, new Object[0]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, byte b2) {
        int i2;
        int i3;
        int i4 = 3 - (b2 * 2);
        byte[] bArr = $$a;
        int i5 = 1 - (b * 4);
        int i6 = (i * 4) + 97;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i4;
            i3 = 0;
            i6 += i4;
            i4 = i7;
            i2 = i3;
            int i8 = i4 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
                return new String(bArr2, 0);
            }
            i7 = i8;
            i4 = bArr[i8];
            i6 += i4;
            i4 = i7;
            i2 = i3;
            int i82 = i4 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            int i822 = i4 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
            }
        }
    }

    static {
        asBinder = 0;
        onExtraCallback();
        Object[] objArr = new Object[1];
        a(ViewConfiguration.getKeyRepeatTimeout() >> 16, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 21, (char) (Process.getGidForName(BuildConfig.FLAVOR) + 279), objArr);
        onExtraCallbackWithResult = ((String) objArr[0]).intern();
        onWarmupCompleted = new setCreativeId();
        onNavigationEvent = 15L;
        IAuthTabCallback = 15L;
        onExtraCallback = 15L;
        int i = asInterface + 119;
        asBinder = i % 128;
        if (i % 2 != 0) {
            int i2 = 73 / 0;
        }
    }

    private setCreativeId() {
    }

    private final Retrofit onNavigationEvent(setIsAutoPlay setisautoplay) throws Throwable {
        int i = 2 % 2;
        setExt setext = new setExt(setisautoplay);
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new IAuthTabCallback());
        httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.BASIC);
        OkHttpClient.Builder builderAddInterceptor = new OkHttpClient.Builder().addInterceptor(setext).addInterceptor(httpLoggingInterceptor);
        long j = IAuthTabCallback;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient okHttpClientBuild = builderAddInterceptor.writeTimeout(j, timeUnit).readTimeout(onExtraCallback, timeUnit).build();
        Retrofit.Builder builder = new Retrofit.Builder();
        Object[] objArr = new Object[1];
        a(ViewConfiguration.getKeyRepeatDelay() >> 16, 22 - ExpandableListView.getPackedPositionType(0L), (char) (278 - Gravity.getAbsoluteGravity(0, 0)), objArr);
        Retrofit retrofitIAuthTabCallback = builder.IAuthTabCallback(((String) objArr[0]).intern()).onExtraCallback(getExtensionName.onExtraCallback()).onExtraCallbackWithResult(okHttpClientBuild).IAuthTabCallback();
        Intrinsics.checkNotNullExpressionValue(retrofitIAuthTabCallback, BuildConfig.FLAVOR);
        int i2 = access000 + 75;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return retrofitIAuthTabCallback;
    }

    public final getSlot onWarmupCompleted(setIsAutoPlay setisautoplay) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 9;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setisautoplay, BuildConfig.FLAVOR);
        Retrofit retrofitOnNavigationEvent = onNavigationEvent(setisautoplay);
        if (i3 != 0) {
            Object objOnNavigationEvent = retrofitOnNavigationEvent.onNavigationEvent(getSlot.class);
            Intrinsics.checkNotNullExpressionValue(objOnNavigationEvent, BuildConfig.FLAVOR);
            return (getSlot) objOnNavigationEvent;
        }
        Object objOnNavigationEvent2 = retrofitOnNavigationEvent.onNavigationEvent(getSlot.class);
        Intrinsics.checkNotNullExpressionValue(objOnNavigationEvent2, BuildConfig.FLAVOR);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $10 + 47;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(IAuthTabCallbackDefault[i << i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - Color.green(0)), 17 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), ((byte) KeyEvent.getModifierMetaStateMask()) + 10974, 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(onTransact), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString(BuildConfig.FLAVOR) + 46135), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 30, (ViewConfiguration.getTouchSlop() >> 8) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i5] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                        Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                        if (objOnExtraCallback3 == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.red(0) + 49123), 44 - Color.red(0), 1494 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } else {
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                Object[] objArr5 = {Integer.valueOf(IAuthTabCallbackDefault[i + i6])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - View.getDefaultSize(0, 0)), 17 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(onTransact), Integer.valueOf(c)};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), ((Process.getThreadPriority(0) + 20) >> 6) + 31, 20220 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback6 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 49123), Color.argb(0, 0, 0, 0) + 44, 1494 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i7 = $10 + 7;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback7 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.getDefaultSize(0, 0) + 49123), TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0') + 45, 1494 - View.MeasureSpec.getMode(0), -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                Object obj = null;
                ((Method) objOnExtraCallback7).invoke(null, objArr8);
                obj.hashCode();
                throw null;
            }
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr9 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback8 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback8 == null) {
                byte b7 = (byte) 0;
                byte b8 = b7;
                objOnExtraCallback8 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 49123), ((byte) KeyEvent.getModifierMetaStateMask()) + 45, MotionEvent.axisFromString(BuildConfig.FLAVOR) + 1495, -1657859959, false, $$c(b7, b8, b8), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback8).invoke(null, objArr9);
            int i8 = $11 + 13;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 3 % 4;
            }
        }
        objArr[0] = new String(cArr);
    }

    static void onExtraCallback() {
        IAuthTabCallbackDefault = new char[]{60586, 12111, 27460, 42841, 58197, 16165, 31547, 46882, 62329, 3943, 19219, 34655, 49925, 7944, 23342, 38708, 54075, 61223, 11118, 26586, 41945, 65474};
        onTransact = 3036562701783281197L;
    }
}
