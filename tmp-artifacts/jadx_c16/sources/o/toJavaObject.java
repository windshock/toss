package o;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.features.mobileid.impl.glance.ui.MobileIdAppWidgetScreenKt$;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.splash.SplashSchemeActivity;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class toJavaObject {
    private static final byte[] $$a = {51, -113, 92, 4};
    private static final int $$b = 115;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int IAuthTabCallback = 1;
    private static char[] onNavigationEvent = {10953, 15582, 1772, 26866, 29340, 17576, 44677, 45150, 39528};
    private static long onWarmupCompleted = 6487102649081854913L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, byte b) {
        int i;
        byte[] bArr = $$a;
        int i2 = (s2 * 4) + 97;
        int i3 = (s * 3) + 4;
        int i4 = b * 3;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i5 = i3;
            int i6 = i4;
            int i7 = 0;
            int i8 = (-i3) + i6;
            int i9 = i5 + 1;
            i = i7;
            i2 = i8;
            i3 = i9;
            bArr2[i] = (byte) i2;
            if (i == i4) {
                return new String(bArr2, 0);
            }
            int i10 = i2;
            i5 = i3;
            i3 = bArr[i3];
            i7 = i + 1;
            i6 = i10;
            int i82 = (-i3) + i6;
            int i92 = i5 + 1;
            i = i7;
            i2 = i82;
            i3 = i92;
            bArr2[i] = (byte) i2;
            if (i == i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            if (i == i4) {
            }
        }
    }

    public static /* synthetic */ Unit onExtraCallback(fatalError fatalerror, boolean z, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 23;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(fatalerror, z, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 != 0) {
            int i6 = 11 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(removeMixInAnnotations removemixinannotations, BigDataProcessController bigDataProcessController, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 119;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(removemixinannotations, bigDataProcessController, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = IAuthTabCallback + 83;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static final Unit onExtraCallbackWithResult(removeMixInAnnotations removemixinannotations, BigDataProcessController bigDataProcessController, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 125;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            i |= 1;
        }
        onExtraCallbackWithResult(removemixinannotations, bigDataProcessController, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i));
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(fatalError fatalerror, boolean z, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 75;
        onExtraCallback = i4 % 128;
        onExtraCallback(fatalerror, z, cameraCaptureResultEmptyCameraCaptureResult, i4 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i) : RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(@NotNull fatalError fatalerror, boolean z, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(fatalerror, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(929772603);
        if ((i & 6) == 0) {
            int i6 = onExtraCallback + 95;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 42 / 0;
                i4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(fatalerror) ? 4 : 2;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(fatalerror)) {
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z))) {
                int i8 = onExtraCallback + 19;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
            int i10 = IAuthTabCallback + 115;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(929772603, i2, -1, "im.toss.features.mobileid.impl.glance.ui.MobileIdAppWidgetScreen (MobileIdAppWidgetScreen.kt:20)");
            }
            Context context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(RowMeasurePolicy.IAuthTabCallback());
            BigDataProcessController bigDataProcessControllerOnExtraCallbackWithResult = BigDataProcessController.Companion.onExtraCallbackWithResult(fatalerror, z);
            removeMixInAnnotations removemixinannotationsOnWarmupCompleted = removeMixInAnnotations.Companion.onWarmupCompleted(bigDataProcessControllerOnExtraCallbackWithResult);
            SplashSchemeActivity.onNavigationEvent onnavigationevent = SplashSchemeActivity.Companion;
            Uri uriIAuthTabCallback = new UST_CERT_GetPublicKey(removemixinannotationsOnWarmupCompleted.getScheme()).IAuthTabCallback();
            Object[] objArr = new Object[1];
            a(Drawable.resolveOpacity(0, 0), View.MeasureSpec.getMode(0) + 9, (char) (Color.alpha(0) + 51056), objArr);
            Intent intentOnExtraCallbackWithResult = SplashSchemeActivity.onNavigationEvent.onExtraCallbackWithResult(onnavigationevent, context, uriIAuthTabCallback, false, new getJSQueueThread(((String) objArr[0]).intern(), (String) null, (String) null, 6, (DefaultConstructorMarker) null), 4, (Object) null);
            intentOnExtraCallbackWithResult.setFlags(335544320);
            intentOnExtraCallbackWithResult.putExtra("appOpenTrigger", "widget");
            if (Intrinsics.areEqual(fatalerror, fatalError$onExtraCallbackWithResult.IAuthTabCallback)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(612177768);
                onExtraCallbackWithResult(removemixinannotationsOnWarmupCompleted, bigDataProcessControllerOnExtraCallbackWithResult, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(612261251);
                toJSONStringWithDateFormat.onWarmupCompleted(removemixinannotationsOnWarmupCompleted.getImageRes(), removemixinannotationsOnWarmupCompleted.getSize-MYxV2XQ(), z, LazyGridStateCompanionExternalSyntheticLambda1.onNavigationEvent(intentOnExtraCallbackWithResult, (WindowInsetsPadding_androidKtExternalSyntheticLambda5) null, 2, (Object) null), fatalerror, (RulerAlignmentKtExternalSyntheticLambda5) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i2 << 12) & 57344) | ((i2 << 3) & 896), 32);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i12 = onExtraCallback + 75;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new MobileIdAppWidgetScreenKt$.ExternalSyntheticLambda1(fatalerror, z, i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallbackWithResult(removeMixInAnnotations removemixinannotations, BigDataProcessController bigDataProcessController, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 107;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(371478732);
        boolean z = false;
        if ((i & 6) == 0) {
            int i6 = onExtraCallback + 1;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 41 / 0;
                if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(removemixinannotations.ordinal()))) {
                    int i8 = IAuthTabCallback + 93;
                    onExtraCallback = i8 % 128;
                    int i9 = i8 % 2 != 0 ? 2 : 4;
                    i2 = i9 | i;
                }
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(removemixinannotations.ordinal())) {
            }
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(bigDataProcessController.ordinal()) ? 32 : 16;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            int i10 = IAuthTabCallback + 49;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(371478732, i2, -1, "im.toss.features.mobileid.impl.glance.ui.MobileIdAppWidgetLoadingContent (MobileIdAppWidgetScreen.kt:52)");
            }
            if (bigDataProcessController == BigDataProcessController.TINY) {
                int i12 = IAuthTabCallback + 61;
                onExtraCallback = i12 % 128;
                if (i12 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1407658461);
                    fluentAddAll.onExtraCallback(removemixinannotations, (RulerAlignmentKtExternalSyntheticLambda5) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i2 & 48, 4);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1407658461);
                    fluentAddAll.onExtraCallback(removemixinannotations, (RulerAlignmentKtExternalSyntheticLambda5) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i2 & 14, 2);
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1407602041);
                fluentAddAll.onNavigationEvent(removemixinannotations, (RulerAlignmentKtExternalSyntheticLambda5) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i2 & 14, 2);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new MobileIdAppWidgetScreenKt$.ExternalSyntheticLambda0(removemixinannotations, bigDataProcessController, i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3;
        char c2;
        Throwable cause;
        int i4 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (true) {
            i3 = -1401950695;
            c2 = '0';
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onNavigationEvent[i + i5])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.combineMeasuredStates(0, 0) + 59697), TextUtils.lastIndexOf("", '0') + 18, TextUtils.getOffsetBefore("", 0) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(onWarmupCompleted), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 31 - TextUtils.getTrimmedLength(""), 20220 - (ViewConfiguration.getLongPressTimeout() >> 16), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49124 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 44 - KeyEvent.keyCodeFromString(""), Color.red(0) + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
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
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i6 = $10 + 111;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", c2, 0) + 49124), 44 - TextUtils.getTrimmedLength(""), TextUtils.indexOf("", "", 0, 0) + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            i3 = -1401950695;
            c2 = '0';
        }
        String str = new String(cArr);
        int i8 = $11 + 85;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }
}
