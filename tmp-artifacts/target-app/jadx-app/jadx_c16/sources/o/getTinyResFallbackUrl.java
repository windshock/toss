package o;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.loan.comparison.midnight.ComposableSingletons$LoanComparisonMidnightReservedActivityKt$;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getTinyResFallbackUrl {
    public static final getTinyResFallbackUrl IAuthTabCallback;
    private static int IAuthTabCallbackDefault;
    private static getBacktraceNote<AppLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {15, -12, 105, 108};
    private static final int $$b = 12;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onExtraCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, int i2, int i3) {
        int i4;
        int i5 = (i2 * 3) + 105;
        byte[] bArr = $$a;
        int i6 = 3 - (i * 3);
        int i7 = i3 * 4;
        byte[] bArr2 = new byte[i7 + 1];
        if (bArr == null) {
            int i8 = i6;
            int i9 = i7;
            i4 = 0;
            int i10 = i8;
            i5 = i6 + i9;
            i6 = i10;
            bArr2[i4] = (byte) i5;
            if (i4 == i7) {
                return new String(bArr2, 0);
            }
            i4++;
            int i11 = i6 + 1;
            i9 = bArr[i11];
            int i12 = i5;
            i8 = i11;
            i6 = i12;
            int i102 = i8;
            i5 = i6 + i9;
            i6 = i102;
            bArr2[i4] = (byte) i5;
            if (i4 == i7) {
            }
        } else {
            i4 = 0;
            bArr2[i4] = (byte) i5;
            if (i4 == i7) {
            }
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 59;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public final getBacktraceNote<AppLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent;
        }
        throw null;
    }

    static {
        IAuthTabCallbackDefault = 0;
        onExtraCallbackWithResult();
        IAuthTabCallback = new getTinyResFallbackUrl();
        onNavigationEvent = ForwardingCameraControl.onExtraCallbackWithResult(-309117372, false, new ComposableSingletons$LoanComparisonMidnightReservedActivityKt$.ExternalSyntheticLambda0());
        int i = asBinder + 39;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 37;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
            if ((i & 3) == 0) {
                if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda1)) {
                    i2 = 2;
                } else {
                    int i5 = onExtraCallbackWithResult + 45;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    i2 = 4;
                }
                i |= i2;
                int i7 = onExtraCallbackWithResult + 81;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i & 19) != 18) {
            int i9 = onExtraCallback + 81;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = onExtraCallback + 121;
                onExtraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-309117372, i, -1, "im.toss.features.loan.comparison.midnight.ComposableSingletons$LoanComparisonMidnightReservedActivityKt.lambda$-309117372.<anonymous> (LoanComparisonMidnightReservedActivity.kt:50)");
            }
            Object[] objArr = new Object[1];
            a(52 - ExpandableListView.getPackedPositionChild(0L), TextUtils.getOffsetBefore("", 0) + 23, new char[]{65486, '\f', '\b', 65485, 18, 18, 14, 19, 65485, 2, '\b', 19, 0, 19, 18, 65486, 65486, 65497, 18, 15, 19, 19, 7, '\r', 14, 18, '\t', 65485, 19, 14, 15, 18, 65484, '\n', 2, 4, 7, 2, 65486, '\r', 14, '\f', '\f', 14, 2, 65484, 18, 4, '\b', 19, 19, 14, 11}, true, 181 - TextUtils.getCapsMode("", 0, 0), objArr);
            appLovinNativeAdImplExternalSyntheticLambda1.onNavigationEvent(((String) objArr[0]).intern(), (QuirksExternalSyntheticBackport0) null, 0, 0.0f, (QuirkSettingsLoader) null, (immediateFailedFuture) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult, ((i << 21) & 29360128) | 6, 126);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i13 = onExtraCallback + 65;
                onExtraCallbackWithResult = i13 % 128;
                int i14 = i13 % 2;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        long j;
        Throwable cause;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        int i5 = $11 + 113;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (true) {
            j = 0;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i7 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), Color.rgb(0, 0, 0) + 16777239, Color.rgb(0, 0, 0) + 16787494, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12844 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), ((byte) KeyEvent.getModifierMetaStateMask()) + 56, View.combineMeasuredStates(0, 0) + 2167, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
            int i8 = $11 + 21;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i10 = $10 + 105;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionGroup(j) + 12843), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 54, (Process.myPid() >> 22) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                j = 0;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void onExtraCallbackWithResult() {
        onWarmupCompleted = 478308989;
    }
}
