package o;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.copyFile;
import o.getMethodDescriptors;
import o.r8lambda295zAJYjdsl38mfEBnLGXD9CqAA;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getMethodDescriptors extends FirebaseMessagingService {
    private final Lazy IAuthTabCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.push.PushFcmMessagingService$$ExternalSyntheticLambda0
        public final Object invoke() {
            return getMethodDescriptors.onNavigationEvent();
        }
    });
    private static final byte[] $$d = {115, 102, 60, 8};
    private static final int $$e = 18;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onWarmupCompleted = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 478308889;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$f(int i, short s, byte b) {
        int i2;
        int i3 = 105 - (b * 3);
        int i4 = 3 - (i * 3);
        byte[] bArr = $$d;
        int i5 = s * 2;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i6 = i4;
            int i7 = i5;
            int i8 = 0;
            int i9 = i4 + i7;
            i2 = i8;
            int i10 = i6;
            i3 = i9;
            i4 = i10;
            int i11 = i4 + 1;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i5) {
                return new String(bArr2, 0);
            }
            int i12 = i3;
            i6 = i11;
            i4 = bArr[i11];
            i7 = i12;
            int i92 = i4 + i7;
            i2 = i8;
            int i102 = i6;
            i3 = i92;
            i4 = i102;
            int i112 = i4 + 1;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            int i1122 = i4 + 1;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i5) {
            }
        }
    }

    public static /* synthetic */ UST_CERT_SetCertVerifyEnvOCSP onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        UST_CERT_SetCertVerifyEnvOCSP uST_CERT_SetCertVerifyEnvOCSPOnWarmupCompleted = onWarmupCompleted();
        if (i3 != 0) {
            int i4 = 1 / 0;
        }
        return uST_CERT_SetCertVerifyEnvOCSPOnWarmupCompleted;
    }

    private final UST_CERT_SetCertVerifyEnvOCSP IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        UST_CERT_SetCertVerifyEnvOCSP uST_CERT_SetCertVerifyEnvOCSP = (UST_CERT_SetCertVerifyEnvOCSP) this.IAuthTabCallback.getValue();
        int i4 = onExtraCallbackWithResult + 73;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return uST_CERT_SetCertVerifyEnvOCSP;
        }
        throw null;
    }

    private static final UST_CERT_SetCertVerifyEnvOCSP onWarmupCompleted() {
        int i = 2 % 2;
        UST_CERT_SetCertVerifyEnvOCSP uST_CERT_SetCertVerifyEnvOCSP = new UST_CERT_SetCertVerifyEnvOCSP();
        int i2 = onExtraCallbackWithResult + 41;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return uST_CERT_SetCertVerifyEnvOCSP;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMessageReceived(@NotNull RemoteMessage remoteMessage) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(remoteMessage, BuildConfig.FLAVOR);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("push_source", "fcm");
        Object[] objArr = new Object[1];
        b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022911).substring(0, 4).codePointAt(2) - 32, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132020588).substring(1, 2).codePointAt(0) - 55, new char[]{65535, 65529, 2, 0, '\t', 4, 65529, 2}, 160 - View.resolveSize(0, 0), true, objArr);
        Map mapOnWarmupCompleted = access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr[0]).intern(), Integer.valueOf(remoteMessage.getPriority())), getWrite.IAuthTabCallback("original_priority", Integer.valueOf(remoteMessage.getOriginalPriority())), getWrite.IAuthTabCallback("ttl", Integer.valueOf(remoteMessage.getTtl()))});
        r8lambda295zAJYjdsl38mfEBnLGXD9CqAA.onExtraCallback onextracallback = r8lambda295zAJYjdsl38mfEBnLGXD9CqAA.Companion;
        Map data = remoteMessage.getData();
        Intrinsics.checkNotNullExpressionValue(data, BuildConfig.FLAVOR);
        onextracallback.onWarmupCompleted(this, data, mapOnWarmupCompleted);
        IAuthTabCallback().onWarmupCompleted(remoteMessage);
        int i4 = onWarmupCompleted + 95;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onNewToken(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, BuildConfig.FLAVOR);
        copyFile copyfileOnUnminimized = ((copyFile.onWarmupCompleted) Response.onExtraCallback(applicationContext, copyFile.onWarmupCompleted.class)).onUnminimized();
        Context applicationContext2 = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, BuildConfig.FLAVOR);
        copyfileOnUnminimized.onExtraCallback(applicationContext2, str);
        r8lambda295zAJYjdsl38mfEBnLGXD9CqAA.Companion.onNavigationEvent(str, "onNewToken");
        int i4 = onExtraCallbackWithResult + 49;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 21 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i2];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i2) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 35125), Color.red(0) + 23, 10279 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12844 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 55 - ((Process.getThreadPriority(0) + 20) >> 6), KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 2167, 1298711993, false, $$f(b, b2, b2), new Class[]{Object.class, Object.class});
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
        if (i > 0) {
            int i7 = $11 + 59;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            int i9 = $10 + 1;
            $11 = i9 % 128;
            int i10 = i9 % 2;
        }
        if (z) {
            char[] cArr4 = new char[i2];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 12843), Drawable.resolveOpacity(0, 0) + 55, (ViewConfiguration.getJumpTapTimeout() >> 16) + 2167, 1298711993, false, $$f(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        String str = new String(cArr2);
        int i11 = $10 + 79;
        $11 = i11 % 128;
        if (i11 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i12 = 38 / 0;
            objArr[0] = str;
        }
    }

    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = onWarmupCompleted + 15;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 30 / 0;
        }
    }

    public void onCreate() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate();
        int i4 = onExtraCallbackWithResult + 105;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
