package o;

import android.content.Context;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.tossjni.TossJNI;

/* loaded from: classes.dex */
public final class LocalAsyncImagePreviewHandlerKtExternalSyntheticLambda0 implements RealDrawScopeSizeResolversizeinlinedmapNotNull121 {
    private static final byte[] $$a = {52, -107, 59, -11, 0};
    private static final int $$b = 122;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final TossJNI IAuthTabCallback;
    private final Context onExtraCallbackWithResult;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(byte r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 3
            int r6 = r6 + 116
            int r7 = r7 * 3
            int r0 = r7 + 2
            int r5 = r5 * 2
            int r5 = 4 - r5
            byte[] r1 = o.LocalAsyncImagePreviewHandlerKtExternalSyntheticLambda0.$$a
            byte[] r0 = new byte[r0]
            int r7 = r7 + 1
            r2 = 0
            if (r1 != 0) goto L19
            r4 = r6
            r3 = r2
            r6 = r5
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r5]
        L2b:
            int r5 = r5 + 1
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-13)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.LocalAsyncImagePreviewHandlerKtExternalSyntheticLambda0.a(byte, byte, int, java.lang.Object[]):void");
    }

    @Inject
    public LocalAsyncImagePreviewHandlerKtExternalSyntheticLambda0(@NotNull Context context, @NotNull TossJNI tossJNI) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(tossJNI, "");
        this.onExtraCallbackWithResult = context;
        this.IAuthTabCallback = tossJNI;
    }

    public void onExtraCallbackWithResult() {
        int i = 2 % 2;
        if (!zzaj.onNavigationEvent().onRelationshipValidationResult()) {
            int i2 = onNavigationEvent + 81;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (!zzaj.onNavigationEvent().ICustomTabsCallbackStub()) {
                PausedInDebuggerOverlayDialogManagerExternalSyntheticLambda1 pausedInDebuggerOverlayDialogManagerExternalSyntheticLambda1 = PausedInDebuggerOverlayDialogManagerExternalSyntheticLambda1.IAuthTabCallback;
                byte b = $$a[4];
                byte b2 = b;
                Object[] objArr = new Object[1];
                a(b, b2, b2, objArr);
                pausedInDebuggerOverlayDialogManagerExternalSyntheticLambda1.onWarmupCompleted((String) objArr[0]);
                return;
            }
        }
        int i4 = onWarmupCompleted + 11;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 66 / 0;
        }
    }

    public String IAuthTabCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.IAuthTabCallback.getUserKey(this.onExtraCallbackWithResult, str);
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        String userKey = this.IAuthTabCallback.getUserKey(this.onExtraCallbackWithResult, str);
        int i3 = onNavigationEvent + 33;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return userKey;
    }

    public String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        TossJNI tossJNI = this.IAuthTabCallback;
        if (i3 != 0) {
            return tossJNI.getSeedKey(this.onExtraCallbackWithResult);
        }
        tossJNI.getSeedKey(this.onExtraCallbackWithResult);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String seed = this.IAuthTabCallback.getSeed();
        int i4 = onNavigationEvent + 69;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 12 / 0;
        }
        return seed;
    }

    public String onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            return this.IAuthTabCallback.getWorD(str);
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.IAuthTabCallback.getWorD(str);
        throw null;
    }

    public void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallback.raiseNativeCrash(this.onExtraCallbackWithResult);
        int i4 = onNavigationEvent + 37;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public byte[] onExtraCallbackWithResult(@NotNull byte[] bArr, @NotNull byte[] bArr2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        byte[] bArrTen = this.IAuthTabCallback.ten(bArr, bArr2);
        int i4 = onNavigationEvent + 111;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return bArrTen;
        }
        throw null;
    }

    public byte[] onNavigationEvent(@NotNull byte[] bArr, @NotNull byte[] bArr2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        byte[] bArrTde = this.IAuthTabCallback.tde(bArr, bArr2);
        int i4 = onWarmupCompleted + 17;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return bArrTde;
        }
        throw null;
    }
}
