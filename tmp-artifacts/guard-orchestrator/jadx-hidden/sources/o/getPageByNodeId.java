package o;

import android.content.Context;
import com.google.common.collect.Synchronized;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class getPageByNodeId implements getOriginalStartParams {
    private static final byte[] $$a;
    private final getBacktraceNote<getMsgHandler, Boolean, access13800<? super Unit>, Object> IAuthTabCallback;
    private final Function1<Context, Boolean> onExtraCallbackWithResult;
    static int onNavigationEvent = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(getPageByNodeId.class);
    private static final int $$b = 112;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, int r7, int r8) {
        /*
            int r8 = r8 * 3
            int r8 = 3 - r8
            byte[] r0 = o.getPageByNodeId.$$a
            int r7 = r7 * 4
            int r7 = r7 + 102
            int r6 = r6 * 3
            int r1 = 11 - r6
            byte[] r1 = new byte[r1]
            int r6 = 10 - r6
            r2 = 0
            if (r0 != 0) goto L19
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2f
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r8 = r8 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2f:
            int r8 = -r8
            int r7 = r7 + r8
            int r7 = r7 + 2
            r8 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getPageByNodeId.$$c(int, int, int):java.lang.String");
    }

    static {
        byte[] bArr = {4, -80, 45, 109, -1, -3, 12, 26, -27, 9, -14, 19, -15, -5};
        $$a = bArr;
        ClassLoader parent = getPageByNodeId.class.getClassLoader().getParent();
        try {
            byte b = (byte) (bArr[4] + 1);
            byte b2 = b;
            Method declaredMethod = ClassLoader.class.getDeclaredMethod($$c(b, b2, b2), String.class);
            declaredMethod.setAccessible(true);
            System.load((String) declaredMethod.invoke(parent, "ea56"));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public static native long c(int i);

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i5;
        int i9 = (~(i8 | i4)) | i7;
        int i10 = ~i4;
        int i11 = ~(i8 | i10 | i2);
        int i12 = (~(i4 | i7)) | i8 | (~(i10 | i2));
        int i13 = i2 + i5 + i3 + (325770565 * i) + ((-1284996642) * i6);
        int i14 = i13 * i13;
        int i15 = ((789042555 * i2) - 1205338112) + ((-1364710777) * i5) + (i9 * 1076876666) + (1076876666 * i11) + ((-1076876666) * i12) + ((-287834112) * i3) + ((-667418624) * i) + ((-145752064) * i6) + (1116340224 * i14);
        int i16 = (i2 * (-1991011123)) + 595473426 + (i5 * (-1991009311)) + (i9 * (-906)) + (i11 * (-906)) + (i12 * 906) + (i3 * (-1991010217)) + (i * (-1223611789)) + (i6 * (-291900814)) + (i14 * (-1931083776));
        return i15 + ((i16 * i16) * (-1558839296)) != 1 ? IAuthTabCallback(objArr) : onNavigationEvent(objArr);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        getPageByNodeId getpagebynodeid = (getPageByNodeId) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1846);
        int i3 = (~iOnWarmupCompleted) & i2;
        int i4 = (~i2) & iOnWarmupCompleted;
        int i5 = (((i4 & i3) | (i3 ^ i4)) >> 6) & 1;
        Function1<Context, Boolean> function1 = getpagebynodeid.onExtraCallbackWithResult;
        if (i5 == 0) {
            return function1;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        getPageByNodeId getpagebynodeid = (getPageByNodeId) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4780);
        int i3 = i2 & iOnWarmupCompleted;
        int i4 = ((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 23) & 1;
        getBacktraceNote<getMsgHandler, Boolean, access13800<? super Unit>, Object> getbacktracenote = getpagebynodeid.IAuthTabCallback;
        if (i4 != 0) {
            int i5 = 3 / 0;
        }
        return getbacktracenote;
    }

    public final Function1<Context, Boolean> onWarmupCompleted() {
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return (Function1) onWarmupCompleted(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -57038687, iOnNavigationEvent2, iOnNavigationEvent, new Object[]{this}, 57038688, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
    }

    public final getBacktraceNote<getMsgHandler, Boolean, access13800<? super Unit>, Object> IAuthTabCallback() {
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return (getBacktraceNote) onWarmupCompleted(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 25400247, iOnNavigationEvent2, iOnNavigationEvent, new Object[]{this}, -25400247, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
    }
}
