package o;

import android.text.AndroidCharacter;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0 extends Thread {
    private static final byte[] $$a;
    private static final int $$b = 94;
    private static int IAuthTabCallbackDefault;
    private static int IAuthTabCallbackStub;
    private static int asInterface;
    private static int onExtraCallback;
    private static long onNavigationEvent;
    private static char[] onWarmupCompleted;
    public final StringBuilder IAuthTabCallback = new StringBuilder();
    private final BufferedReader onExtraCallbackWithResult;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r7, short r8, short r9) {
        /*
            int r9 = r9 * 4
            int r9 = 3 - r9
            int r7 = r7 * 2
            int r7 = r7 + 11
            int r8 = r8 * 4
            int r8 = 102 - r8
            byte[] r0 = o.LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r8 = r9
            r5 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            int r9 = r9 + 1
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L27:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r6
        L2c:
            int r3 = -r3
            int r9 = r9 + r3
            int r9 = r9 + 2
            r3 = r5
            r6 = r9
            r9 = r8
            r8 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.$$c(short, short, short):java.lang.String");
    }

    public static native void i(Object obj, Object obj2);

    public static native byte s(int i);

    public LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0(InputStream inputStream) {
        this.onExtraCallbackWithResult = new BufferedReader(new InputStreamReader(inputStream));
    }

    public String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 79;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallback.toString();
        }
        throw new ArithmeticException();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws IOException {
        int i = 2 % 2;
        while (true) {
            try {
                String line = this.onExtraCallbackWithResult.readLine();
                if (line == null) {
                    this.onExtraCallbackWithResult.close();
                    return;
                }
                StringBuilder sb = this.IAuthTabCallback;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(line);
                Object[] objArr = new Object[1];
                onExtraCallbackWithResult((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), '1' - AndroidCharacter.getMirror('0'), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
                sb2.append((String) objArr[0]);
                sb.append(sb2.toString());
                int i2 = asInterface + 109;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
            } catch (IOException unused) {
                return;
            }
        }
    }

    private static void onExtraCallbackWithResult(int i, int i2, char c, Object[] objArr) {
        int i3 = 2 % 2;
        ListenerSetExternalSyntheticLambda0 listenerSetExternalSyntheticLambda0 = new ListenerSetExternalSyntheticLambda0();
        long[] jArr = new long[i2];
        listenerSetExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (listenerSetExternalSyntheticLambda0.IAuthTabCallback < i2) {
            int i4 = IAuthTabCallbackDefault + 79;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            int i6 = listenerSetExternalSyntheticLambda0.IAuthTabCallback;
            int i7 = onWarmupCompleted[i + i6] & 65535;
            long j = onNavigationEvent;
            jArr[i6] = (((char) ((i7 << 13) | (i7 >>> 3))) ^ (i6 * ((j << 45) | (j >>> 19)))) ^ c;
            listenerSetExternalSyntheticLambda0.IAuthTabCallback++;
        }
        char[] cArr = new char[i2];
        while (true) {
            listenerSetExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (listenerSetExternalSyntheticLambda0.IAuthTabCallback < i2) {
                int i8 = IAuthTabCallbackStub + 105;
                IAuthTabCallbackDefault = i8 % 128;
                if (i8 % 2 == 0) {
                    break;
                }
                cArr[listenerSetExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[listenerSetExternalSyntheticLambda0.IAuthTabCallback];
                listenerSetExternalSyntheticLambda0.IAuthTabCallback++;
            }
            String str = new String(cArr);
            int i9 = IAuthTabCallbackDefault + 95;
            IAuthTabCallbackStub = i9 % 128;
            int i10 = i9 % 2;
            objArr[0] = str;
            return;
            cArr[listenerSetExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[listenerSetExternalSyntheticLambda0.IAuthTabCallback];
            int i11 = listenerSetExternalSyntheticLambda0.IAuthTabCallback;
        }
    }

    static {
        byte[] bArr = {111, -53, -88, 102, -1, -3, 12, 26, -27, 9, -14, 19, -15, -5};
        $$a = bArr;
        ClassLoader parent = LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.class.getClassLoader().getParent();
        try {
            byte b = (byte) (bArr[4] + 1);
            byte b2 = b;
            Method declaredMethod = ClassLoader.class.getDeclaredMethod($$c(b, b2, b2), String.class);
            declaredMethod.setAccessible(true);
            System.load((String) declaredMethod.invoke(parent, "ea56"));
            IAuthTabCallbackStub = 0;
            IAuthTabCallbackDefault = 1;
            onExtraCallback = 0;
            asInterface = 1;
            onWarmupCompleted = new char[]{'P'};
            onNavigationEvent = 7340236253469859848L;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
