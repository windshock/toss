package im.toss.di;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.PausedInDebuggerOverlayDialogManagerExternalSyntheticLambda1;
import o.PausedInDebuggerOverlayDialogManagerExternalSyntheticLambda2;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.tossjni.RequiredBridge;
import viva.republica.toss.tossjni.TossJNI;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class TossJniModule {
    private static int onExtraCallback;
    private static final byte[] $$a = {57, 22, -21, -92, 1, -8, -4, 66, -65, -8, 1};
    private static final int $$b = 19;
    private static int onNavigationEvent = 0;
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted = 0;
    public static final TossJniModule onExtraCallbackWithResult = new TossJniModule();

    static {
        onExtraCallback = 1;
        int i = onWarmupCompleted + 117;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, Object[] objArr) {
        int i2;
        int i3;
        int i4 = (i * 4) + 8;
        int i5 = 3 - (s * 4);
        byte[] bArr = $$a;
        int i6 = 116 - (b * 2);
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i6;
            i3 = 0;
            int i8 = i5;
            int i9 = (i7 + (-i5)) - 4;
            i2 = i3;
            int i10 = i8;
            i6 = i9;
            i5 = i10;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            int i11 = i5 + 1;
            if (i3 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i12 = i6;
            i8 = i11;
            i5 = bArr[i11];
            i7 = i12;
            int i92 = (i7 + (-i5)) - 4;
            i2 = i3;
            int i102 = i8;
            i6 = i92;
            i5 = i102;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            int i112 = i5 + 1;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            int i1122 = i5 + 1;
            if (i3 == i4) {
            }
        }
    }

    private TossJniModule() {
    }

    @Singleton
    public final TossJNI onExtraCallback(@NotNull RequiredBridge requiredBridge, @NotNull PausedInDebuggerOverlayDialogManagerExternalSyntheticLambda2 pausedInDebuggerOverlayDialogManagerExternalSyntheticLambda2) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(requiredBridge, "");
        Intrinsics.checkNotNullParameter(pausedInDebuggerOverlayDialogManagerExternalSyntheticLambda2, "");
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(175791334);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 36116), TextUtils.lastIndexOf("", '0', 0, 0) + 22, 24793 - Color.green(0), 993698422, false, "onNavigationEvent", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object[] objArr = {requiredBridge};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-603856054);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getCapsMode("", 0, 0) + 36115), 20 - ImageFormat.getBitsPerPixel(0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 24793, -314499622, false, "IAuthTabCallback", new Class[]{RequiredBridge.class});
            }
            ((Method) objOnExtraCallback2).invoke(obj, objArr);
            Object[] objArr2 = {pausedInDebuggerOverlayDialogManagerExternalSyntheticLambda2};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1814501460);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (36114 - TextUtils.indexOf((CharSequence) "", '0')), KeyEvent.keyCodeFromString("") + 21, (Process.myTid() >> 22) + 24793, -1567090372, false, "onNavigationEvent", new Class[]{PausedInDebuggerOverlayDialogManagerExternalSyntheticLambda2.class});
            }
            ((Method) objOnExtraCallback3).invoke(obj, objArr2);
            PausedInDebuggerOverlayDialogManagerExternalSyntheticLambda1 pausedInDebuggerOverlayDialogManagerExternalSyntheticLambda1 = PausedInDebuggerOverlayDialogManagerExternalSyntheticLambda1.IAuthTabCallback;
            byte b = (byte) ($$a[4] - 1);
            byte b2 = b;
            Object[] objArr3 = new Object[1];
            a(b, b2, b2, objArr3);
            pausedInDebuggerOverlayDialogManagerExternalSyntheticLambda1.onWarmupCompleted((String) objArr3[0]);
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1554948851);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (36116 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), TextUtils.getOffsetAfter("", 0) + 21, 24794 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 1844337763, false, "IAuthTabCallback", new Class[0]);
            }
            TossJNI tossJNI = (TossJNI) ((Method) objOnExtraCallback4).invoke(obj, null);
            int i4 = onNavigationEvent + 77;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 72 / 0;
            }
            return tossJNI;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
