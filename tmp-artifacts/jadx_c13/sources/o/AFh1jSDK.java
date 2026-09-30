package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFh1jSDK {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r2 != 6) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r2 == 8) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        r0 = o.AFh1jSDK.onNavigationEvent + 11;
        o.AFh1jSDK.onExtraCallbackWithResult = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0.substring(0, 2), "");
        r11 = java.lang.Integer.parseInt(r2, kotlin.text.CharsKt__CharJVMKt.checkRadix(16)) / 255.0f;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0.substring(2, 4), "");
        r12 = java.lang.Integer.parseInt(r1, kotlin.text.CharsKt__CharJVMKt.checkRadix(16)) / 255.0f;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0.substring(4, 6), "");
        r13 = java.lang.Integer.parseInt(r1, kotlin.text.CharsKt__CharJVMKt.checkRadix(16)) / 255.0f;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0.substring(6, 8), "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009c, code lost:
    
        return o.setByteOrder.onNavigationEvent(o.ByteOrderedDataOutputStream.IAuthTabCallback(r11, r12, r13, java.lang.Integer.parseInt(r0, kotlin.text.CharsKt__CharJVMKt.checkRadix(16)) / 255.0f, (o.getAttribute) null, 16, (java.lang.Object) null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009d, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0.substring(0, 2), "");
        r11 = java.lang.Integer.parseInt(r2, kotlin.text.CharsKt__CharJVMKt.checkRadix(16)) / 255.0f;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0.substring(2, 4), "");
        r12 = java.lang.Integer.parseInt(r1, kotlin.text.CharsKt__CharJVMKt.checkRadix(16)) / 255.0f;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0.substring(4, 6), "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e2, code lost:
    
        return o.setByteOrder.onNavigationEvent(o.ByteOrderedDataOutputStream.IAuthTabCallback(r11, r12, java.lang.Integer.parseInt(r0, kotlin.text.CharsKt__CharJVMKt.checkRadix(16)) / 255.0f, 1.0f, (o.getAttribute) null, 16, (java.lang.Object) null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0029, code lost:
    
        if (r2 != 84) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final setByteOrder onExtraCallback(@NotNull String str) {
        String strRemovePrefix;
        int length;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        onExtraCallbackWithResult = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str, "");
                strRemovePrefix = StringsKt__StringsKt.removePrefix(str, (CharSequence) "#");
                length = strRemovePrefix.length();
            } else {
                Intrinsics.checkNotNullParameter(str, "");
                strRemovePrefix = StringsKt__StringsKt.removePrefix(str, (CharSequence) "#");
                length = strRemovePrefix.length();
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long onNavigationEvent(@NotNull CipherSuiteCompanion cipherSuiteCompanion, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(cipherSuiteCompanion, "");
            CameraConfigExternalSyntheticLambda0.asBinder();
            throw null;
        }
        Intrinsics.checkNotNullParameter(cipherSuiteCompanion, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(627722277, i, -1, "im.toss.tosssecurities.utils.color.adaptive (Color.kt:38)");
        }
        boolean zOnExtraCallbackWithResult = addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0);
        boolean z = (((i & 14) ^ 6) > 4 && cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cipherSuiteCompanion)) || (i & 6) == 4;
        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(zOnExtraCallbackWithResult);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(zOnExtraCallback | z)) {
            int i4 = onExtraCallbackWithResult + 23;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                obj.hashCode();
                throw null;
            }
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = setByteOrder.onNavigationEvent(zOnExtraCallbackWithResult ? ByteOrderedDataOutputStream.onExtraCallback(cipherSuiteCompanion.onExtraCallbackWithResult()) : ByteOrderedDataOutputStream.onExtraCallback(cipherSuiteCompanion.IAuthTabCallback()));
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
        }
        long jAccess100 = ((setByteOrder) objOnMinimized).access100();
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = onExtraCallbackWithResult + 123;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return jAccess100;
    }
}
