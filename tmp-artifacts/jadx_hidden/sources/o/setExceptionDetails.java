package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.tossjni.RequiredBridge;
import viva.republica.toss.tossjni.TossJNI;

/* loaded from: classes.dex */
public final class setExceptionDetails {
    private static final byte[] $$a;
    public static final String onExtraCallbackWithResult;
    public static final setExceptionDetails onNavigationEvent;
    private static int onWarmupCompleted;
    private static final int $$b = 4;
    private static int onExtraCallback = 0;
    private static int asInterface = 1;
    private static int IAuthTabCallback = 1;

    static {
        byte[] bArr = {5, -4, -80, 1, -1, 8, 4, -66, 65, 8, -1};
        $$a = bArr;
        onWarmupCompleted = 0;
        byte b = bArr[4];
        byte b2 = (byte) (b + 1);
        Object[] objArr = new Object[1];
        a(b, b2, b2, objArr);
        onExtraCallbackWithResult = (String) objArr[0];
        onNavigationEvent = new setExceptionDetails();
        int i = IAuthTabCallback + 65;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 3
            int r0 = r7 + 8
            int r8 = r8 * 4
            int r8 = r8 + 116
            int r6 = r6 + 4
            byte[] r1 = o.setExceptionDetails.$$a
            byte[] r0 = new byte[r0]
            int r7 = r7 + 7
            r2 = 0
            if (r1 != 0) goto L17
            r8 = r6
            r3 = r7
            r4 = r2
            goto L30
        L17:
            r3 = r2
        L18:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L30:
            int r3 = r3 + r6
            int r6 = r3 + (-4)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setExceptionDetails.a(byte, int, short, java.lang.Object[]):void");
    }

    private setExceptionDetails() {
    }

    public final void IAuthTabCallback(@NotNull RequiredBridge requiredBridge) {
        int i = 2 % 2;
        int i2 = asInterface + 93;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(requiredBridge, "");
        shouldDelayChildPressed.onNavigationEvent.onWarmupCompleted(requiredBridge);
        int i4 = onExtraCallback + 37;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void onNavigationEvent(@NotNull PausedInDebuggerOverlayDialogManagerExternalSyntheticLambda2 pausedInDebuggerOverlayDialogManagerExternalSyntheticLambda2) {
        int i = 2 % 2;
        int i2 = asInterface + 105;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(pausedInDebuggerOverlayDialogManagerExternalSyntheticLambda2, "");
            shouldDelayChildPressed.onNavigationEvent.onExtraCallback(pausedInDebuggerOverlayDialogManagerExternalSyntheticLambda2);
            int i3 = 77 / 0;
        } else {
            Intrinsics.checkNotNullParameter(pausedInDebuggerOverlayDialogManagerExternalSyntheticLambda2, "");
            shouldDelayChildPressed.onNavigationEvent.onExtraCallback(pausedInDebuggerOverlayDialogManagerExternalSyntheticLambda2);
        }
        int i4 = asInterface + 83;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 79 / 0;
        }
    }

    public final TossJNI IAuthTabCallback() {
        int i = 2 % 2;
        TossJNI tossJNI = new TossJNI();
        int i2 = onExtraCallback + 97;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return tossJNI;
        }
        throw null;
    }
}
