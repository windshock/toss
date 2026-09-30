package o;

import im.toss.appsintoss.game.model.GamePromotionRewardExecutionRequest;
import im.toss.security.impl.malware.MalwareDetectActivity$IAuthTabCallback;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class SafeWindowLayoutComponentProviderExternalSyntheticLambda1 implements SafeWindowLayoutComponentProviderExternalSyntheticLambda2 {
    private static final byte[] $$a;
    private static final int $$b = 136;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault;
    private static int onExtraCallbackWithResult;
    private static long onWarmupCompleted;
    private final OverlayControlleroverlayInfo1ExternalSyntheticLambda0 IAuthTabCallback;
    private final OverlayControlleroverlayInfo1ExternalSyntheticLambda1 onExtraCallback;
    private final SafeWindowLayoutComponentProviderExternalSyntheticLambda5 onNavigationEvent;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, int r7, byte r8) {
        /*
            int r7 = r7 * 4
            int r7 = r7 + 4
            byte[] r0 = o.SafeWindowLayoutComponentProviderExternalSyntheticLambda1.$$a
            int r6 = r6 * 4
            int r1 = 11 - r6
            int r8 = r8 * 4
            int r8 = 102 - r8
            byte[] r1 = new byte[r1]
            int r6 = 10 - r6
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2e
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r7 = -r7
            int r8 = r8 + 1
            int r3 = r3 + r7
            int r7 = r3 + 2
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SafeWindowLayoutComponentProviderExternalSyntheticLambda1.$$c(short, int, byte):java.lang.String");
    }

    public static native void D(Object obj, Object obj2);

    public SafeWindowLayoutComponentProviderExternalSyntheticLambda1(@NotNull SafeWindowLayoutComponentProviderExternalSyntheticLambda5 safeWindowLayoutComponentProviderExternalSyntheticLambda5, @NotNull OverlayControlleroverlayInfo1ExternalSyntheticLambda1 overlayControlleroverlayInfo1ExternalSyntheticLambda1, @NotNull OverlayControlleroverlayInfo1ExternalSyntheticLambda0 overlayControlleroverlayInfo1ExternalSyntheticLambda0) {
        Intrinsics.checkNotNullParameter(safeWindowLayoutComponentProviderExternalSyntheticLambda5, "");
        Intrinsics.checkNotNullParameter(overlayControlleroverlayInfo1ExternalSyntheticLambda1, "");
        Intrinsics.checkNotNullParameter(overlayControlleroverlayInfo1ExternalSyntheticLambda0, "");
        this.onNavigationEvent = safeWindowLayoutComponentProviderExternalSyntheticLambda5;
        this.onExtraCallback = overlayControlleroverlayInfo1ExternalSyntheticLambda1;
        this.IAuthTabCallback = overlayControlleroverlayInfo1ExternalSyntheticLambda0;
    }

    public static final /* synthetic */ Object IAuthTabCallback(SafeWindowLayoutComponentProviderExternalSyntheticLambda1 safeWindowLayoutComponentProviderExternalSyntheticLambda1, String str, String str2, GamePromotionRewardExecutionRequest gamePromotionRewardExecutionRequest, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 109;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return safeWindowLayoutComponentProviderExternalSyntheticLambda1.onExtraCallback(str, str2, gamePromotionRewardExecutionRequest, access13800Var);
        }
        safeWindowLayoutComponentProviderExternalSyntheticLambda1.onExtraCallback(str, str2, gamePromotionRewardExecutionRequest, access13800Var);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ SafeWindowLayoutComponentProviderExternalSyntheticLambda5 onNavigationEvent(SafeWindowLayoutComponentProviderExternalSyntheticLambda1 safeWindowLayoutComponentProviderExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        SafeWindowLayoutComponentProviderExternalSyntheticLambda5 safeWindowLayoutComponentProviderExternalSyntheticLambda5 = safeWindowLayoutComponentProviderExternalSyntheticLambda1.onNavigationEvent;
        int i5 = i3 + 3;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return safeWindowLayoutComponentProviderExternalSyntheticLambda5;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object onExtraCallbackWithResult(@org.jetbrains.annotations.Nullable java.lang.String r8, @org.jetbrains.annotations.Nullable java.lang.String r9, @org.jetbrains.annotations.NotNull o.access13800<? super im.toss.appsintoss.login.model.GameCenterProfile> r10) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SafeWindowLayoutComponentProviderExternalSyntheticLambda1.onExtraCallbackWithResult(java.lang.String, java.lang.String, o.access13800):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object IAuthTabCallback(@org.jetbrains.annotations.Nullable java.lang.String r18, @org.jetbrains.annotations.Nullable java.lang.String r19, @org.jetbrains.annotations.NotNull o.access13800<? super o.OverlayControllerImplExternalSyntheticLambda0> r20) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SafeWindowLayoutComponentProviderExternalSyntheticLambda1.IAuthTabCallback(java.lang.String, java.lang.String, o.access13800):java.lang.Object");
    }

    private static void a(char[] cArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onWarmupCompleted ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $10 + 87;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $11 + 79;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] = MalwareDetectActivity$IAuthTabCallback.onExtraCallback.e(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4], timelineExternalSyntheticLambda0.onExtraCallbackWithResult, onWarmupCompleted);
            tryTriggerOnStart.d(timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0);
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object onWarmupCompleted(@org.jetbrains.annotations.Nullable java.lang.String r20, @org.jetbrains.annotations.Nullable java.lang.String r21, @org.jetbrains.annotations.NotNull java.lang.String r22, int r23, boolean r24, @org.jetbrains.annotations.NotNull o.access13800<? super o.OverlayControllerImplExternalSyntheticLambda1> r25) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SafeWindowLayoutComponentProviderExternalSyntheticLambda1.onWarmupCompleted(java.lang.String, java.lang.String, java.lang.String, int, boolean, o.access13800):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object onExtraCallback(java.lang.String r9, java.lang.String r10, im.toss.appsintoss.game.model.GamePromotionRewardExecutionRequest r11, o.access13800<? super o.OverlayControllerImplExternalSyntheticLambda1> r12) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SafeWindowLayoutComponentProviderExternalSyntheticLambda1.onExtraCallback(java.lang.String, java.lang.String, im.toss.appsintoss.game.model.GamePromotionRewardExecutionRequest, o.access13800):java.lang.Object");
    }

    static {
        byte[] bArr = {57, 126, 65, 8, -1, -3, 12, 26, -27, 9, -14, 19, -15, -5};
        $$a = bArr;
        ClassLoader parent = SafeWindowLayoutComponentProviderExternalSyntheticLambda1.class.getClassLoader().getParent();
        try {
            byte b = (byte) (bArr[4] + 1);
            byte b2 = b;
            Method declaredMethod = ClassLoader.class.getDeclaredMethod($$c(b, b2, b2), String.class);
            declaredMethod.setAccessible(true);
            System.load((String) declaredMethod.invoke(parent, "ea56"));
            onExtraCallbackWithResult = 0;
            IAuthTabCallbackDefault = 1;
            onWarmupCompleted = -8892631059561693782L;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
