package o;

import android.text.TextUtils;
import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.security.impl.malware.MalwareDetectActivity$IAuthTabCallback;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class initDownloadListener {
    private static final byte[] $$a;
    private static final int $$b = 134;
    private static int $10;
    private static int $11;
    private static long IAuthTabCallback;
    private static int onExtraCallback;
    private static int onWarmupCompleted;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r7, byte r8, byte r9) {
        /*
            byte[] r0 = o.initDownloadListener.$$a
            int r7 = r7 + 4
            int r9 = r9 * 2
            int r9 = 102 - r9
            int r8 = r8 * 2
            int r8 = r8 + 11
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r5 = r2
            r9 = r7
            goto L2a
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r6
        L2a:
            int r7 = r7 + r3
            int r7 = r7 + 2
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.initDownloadListener.$$c(short, byte, byte):java.lang.String");
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 121;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(str, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 25;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    private static final Unit onExtraCallback(String str, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 11;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        onNavigationEvent(str, (Function0<Unit>) function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onWarmupCompleted + 45;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 103;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallback = onExtraCallback(str, function0, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallback + 43;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallback;
    }

    public static final /* synthetic */ void onWarmupCompleted(String str, Function0 function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 19;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        onNavigationEvent(str, (Function0<Unit>) function0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 81;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public static native void withResult(int i, int i2);

    private static void a(char[] cArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $11 + 35;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] = MalwareDetectActivity$IAuthTabCallback.onExtraCallback.e(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4], timelineExternalSyntheticLambda0.onExtraCallbackWithResult, IAuthTabCallback);
            tryTriggerOnStart.d(timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0);
            int i5 = $11 + 51;
            $10 = i5 % 128;
            int i6 = i5 % 2;
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    private static final Unit onNavigationEvent(String str, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            int i4 = onExtraCallback + 15;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                int i6 = onWarmupCompleted + 51;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                i2 = 4;
            } else {
                i2 = 2;
            }
            i |= i2;
            int i8 = onWarmupCompleted + 29;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            int i10 = onExtraCallback + 89;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                Object[] objArr = new Object[1];
                a(new char[]{63833, 8877, 63792, 32870, 19555, 11844, 39232, 27035, 52006, 7242, 51981, 7121, 40222, 21093, 64801, 50605, 28424, 32885, 12144, 63417, 12668, 62984, 24922, 41434, 891, 9244, 37709, 21393, 54613, 6700, 50543, 7673, 42828, 18551, 63338, 53242, 27050, 49117, 10688, 64059, 15276, 60874, 23434, 42034, 3484, 9191, 36283, 22045, 57222, 4590, 49136, 'c', 41464, 18311, 61889, 12865, 29680, 46484, 9169, 64586, 17866, 60407, 21934, 44583, 6126, 55733, 34801, 22653, 55352, 3909, 47650, 2698, 43560, 32079, 60443, 13483, 31772, 45946, 7738, 59022, 19978, 57709, 20535, 37033, 4208, 55069, 33367, 17025, 57954, 1293, 46084, 3213, 46081, 31614, 58919}, TextUtils.getCapsMode("", 0, 0), objArr);
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-694887898, i, -1, ((String) objArr[0]).intern());
                int i12 = onWarmupCompleted + 17;
                onExtraCallback = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 3 % 4;
                }
            }
            w5aVar.onExtraCallbackWithResult(str, (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, (i << 6) & 896, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0044 A[PHI: r1
      0x0044: PHI (r1v44 o.CameraCaptureResultEmptyCameraCaptureResult) = (r1v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r1v45 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x002b, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d A[PHI: r1
      0x002d: PHI (r1v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r1v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r1v45 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x002b, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void onNavigationEvent(java.lang.String r25, kotlin.jvm.functions.Function0<kotlin.Unit> r26, o.CameraCaptureResultEmptyCameraCaptureResult r27, int r28) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.initDownloadListener.onNavigationEvent(java.lang.String, kotlin.jvm.functions.Function0, o.CameraCaptureResultEmptyCameraCaptureResult, int):void");
    }

    static {
        byte[] bArr = {111, -17, 11, -125, 1, 3, -12, -26, 27, -9, 14, -19, 15, 5};
        $$a = bArr;
        ClassLoader parent = initDownloadListener.class.getClassLoader().getParent();
        try {
            byte b = (byte) (-bArr[4]);
            byte b2 = (byte) (b + 1);
            Method declaredMethod = ClassLoader.class.getDeclaredMethod($$c(b, b2, b2), String.class);
            declaredMethod.setAccessible(true);
            System.load((String) declaredMethod.invoke(parent, "ea56"));
            $10 = 0;
            $11 = 1;
            onWarmupCompleted = 0;
            onExtraCallback = 1;
            IAuthTabCallback = 1019199683090872200L;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
