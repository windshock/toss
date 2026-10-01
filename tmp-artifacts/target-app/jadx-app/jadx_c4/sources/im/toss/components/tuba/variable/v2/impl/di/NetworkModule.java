package im.toss.components.tuba.variable.v2.impl.di;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.io.File;
import java.lang.reflect.Method;
import javax.inject.Singleton;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ImageViewTarget;
import o.RoundedCornersTransformation;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.ca;
import o.ea;
import o.g1;
import o.getCacheDir;
import o.zzad;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class NetworkModule {
    public static final NetworkModule IAuthTabCallback;
    private static int onExtraCallback;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {64, -61, 76, -90};
    private static final int $$b = 69;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, short s) {
        int i2;
        byte[] bArr = $$a;
        int i3 = (b * 2) + 105;
        int i4 = i + 4;
        int i5 = s * 4;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        if (bArr == null) {
            int i7 = i6;
            i2 = 0;
            i3 += -i7;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            i4++;
            i2++;
            i7 = bArr[i4];
            i3 += -i7;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        }
    }

    static {
        onWarmupCompleted = 0;
        IAuthTabCallback();
        IAuthTabCallback = new NetworkModule();
        int i = onTransact + 41;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Context context, ea eaVar, OkHttpClient.Builder builder) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(context, eaVar, builder);
        }
        onExtraCallbackWithResult(context, eaVar, builder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(ea eaVar, OkHttpClient.Builder builder) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(eaVar, builder);
        }
        onNavigationEvent(eaVar, builder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Context context, ea eaVar, OkHttpClient.Builder builder) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(context, eaVar, builder);
        int i4 = onExtraCallbackWithResult + 15;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    private NetworkModule() {
    }

    @Singleton
    public final getCacheDir onExtraCallback(@NotNull zzad zzadVar, @NotNull g1 g1Var, @NotNull final ea eaVar) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(zzadVar, "");
        Intrinsics.checkNotNullParameter(g1Var, "");
        Intrinsics.checkNotNullParameter(eaVar, "");
        getCacheDir getcachedir = (getCacheDir) g1.onExtraCallback(g1Var, getCacheDir.class, zzadVar.IAuthTabCallbackStub(), (Long) null, (Long) null, new Function1() { // from class: im.toss.components.tuba.variable.v2.impl.di.NetworkModule$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 67;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                ea eaVar2 = eaVar;
                OkHttpClient.Builder builder = (OkHttpClient.Builder) obj;
                if (i4 == 0) {
                    return NetworkModule.onExtraCallbackWithResult(eaVar2, builder);
                }
                NetworkModule.onExtraCallbackWithResult(eaVar2, builder);
                throw null;
            }
        }, 12, (Object) null);
        int i2 = onNavigationEvent + 117;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return getcachedir;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(ea eaVar, OkHttpClient.Builder builder) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(builder, "");
        builder.dns(eaVar.onNavigationEvent(ca.INFRA));
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 107;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    @Singleton
    public final RoundedCornersTransformation onExtraCallback(@NotNull final Context context, @NotNull zzad zzadVar, @NotNull g1 g1Var, @NotNull final ea eaVar) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(zzadVar, "");
        Intrinsics.checkNotNullParameter(g1Var, "");
        Intrinsics.checkNotNullParameter(eaVar, "");
        RoundedCornersTransformation roundedCornersTransformation = (RoundedCornersTransformation) g1.onExtraCallback(g1Var, RoundedCornersTransformation.class, zzadVar.cancelNotification(), (Long) null, (Long) null, new Function1() { // from class: im.toss.components.tuba.variable.v2.impl.di.NetworkModule$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj) throws Throwable {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 87;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Context context2 = context;
                if (i4 == 0) {
                    return NetworkModule.onExtraCallback(context2, eaVar, (OkHttpClient.Builder) obj);
                }
                NetworkModule.onExtraCallback(context2, eaVar, (OkHttpClient.Builder) obj);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }, 12, (Object) null);
        int i2 = onExtraCallbackWithResult + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return roundedCornersTransformation;
    }

    private static final Unit onExtraCallbackWithResult(Context context, ea eaVar, OkHttpClient.Builder builder) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(builder, "");
        File cacheDir = context.getCacheDir();
        Object[] objArr = new Object[1];
        a(KeyEvent.normalizeMetaState(0) + 22, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 10, new char[]{1, 65534, '\n', '\n', 6, 65525, 65529, 65527, 65529, 65534, 65531, '\n', 5, '\t', '\t', 65525, '\n', 11, 65528, 65527, 65525, 5}, false, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 109, objArr);
        builder.cache(new Cache(new File(cacheDir, ((String) objArr[0]).intern()), 10485760L));
        builder.dns(eaVar.onNavigationEvent(ca.INFRA));
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallbackWithResult + 17;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    @Singleton
    public final ImageViewTarget IAuthTabCallback(@NotNull final Context context, @NotNull zzad zzadVar, @NotNull g1 g1Var, @NotNull final ea eaVar) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(zzadVar, "");
        Intrinsics.checkNotNullParameter(g1Var, "");
        Intrinsics.checkNotNullParameter(eaVar, "");
        ImageViewTarget imageViewTarget = (ImageViewTarget) g1.onExtraCallback(g1Var, ImageViewTarget.class, zzadVar.cancelNotification(), (Long) null, (Long) null, new Function1() { // from class: im.toss.components.tuba.variable.v2.impl.di.NetworkModule$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) throws Throwable {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 67;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Context context2 = context;
                if (i4 == 0) {
                    return NetworkModule.onNavigationEvent(context2, eaVar, (OkHttpClient.Builder) obj);
                }
                Unit unitOnNavigationEvent = NetworkModule.onNavigationEvent(context2, eaVar, (OkHttpClient.Builder) obj);
                int i5 = 49 / 0;
                return unitOnNavigationEvent;
            }
        }, 12, (Object) null);
        int i2 = onNavigationEvent + 27;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return imageViewTarget;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(Context context, ea eaVar, OkHttpClient.Builder builder) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(builder, "");
        File cacheDir = context.getCacheDir();
        Object[] objArr = new Object[1];
        a(26 - View.resolveSizeAndState(0, 0, 0), 16 - ImageFormat.getBitsPerPixel(0), new char[]{65526, 7, 11, 11, 65535, 2, 6, 65526, 65528, 65529, '\f', 11, 65526, '\n', '\n', 6, 11, 65530, 5, 65532, 65526, 65532, 65535, 65530, 65528, 65530}, true, 108 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr);
        builder.cache(new Cache(new File(cacheDir, ((String) objArr[0]).intern()), 10485760L));
        builder.dns(eaVar.onNavigationEvent(ca.INFRA));
        Unit unit = Unit.INSTANCE;
        int i2 = onNavigationEvent + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
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
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetBefore("", 0) + 35125), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 22, TextUtils.indexOf((CharSequence) "", '0', 0) + 10279, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12844 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 54, 2167 - Color.alpha(0), 1298711993, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i2 > 0) {
            int i7 = $11 + 93;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            int i9 = $11 + 115;
            $10 = i9 % 128;
            int i10 = i9 % 2;
        }
        if (z) {
            int i11 = $10 + 99;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i13 = $10 + 21;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                try {
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 - 1);
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 12843), 16777271 + Color.rgb(0, 0, 0), 2167 - (ViewConfiguration.getPressedStateDuration() >> 16), 1298711993, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    i4 = 2083011369;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void IAuthTabCallback() {
        onExtraCallback = 478308906;
    }
}
