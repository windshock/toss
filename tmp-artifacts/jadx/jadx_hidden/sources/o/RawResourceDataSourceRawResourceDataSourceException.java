package o;

import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class RawResourceDataSourceRawResourceDataSourceException {
    private static final byte[] $$a;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    private static final int $$b = 67;
    private static int asBinder = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback = 0;
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 38
            int r8 = r8 + 73
            byte[] r0 = o.RawResourceDataSourceRawResourceDataSourceException.$$a
            int r9 = r9 + 4
            int r7 = r7 * 31
            int r7 = 47 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r8 = r7
            r3 = r9
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            int r9 = r9 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2c:
            int r8 = r8 + r9
            int r8 = r8 + (-6)
            r9 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.RawResourceDataSourceRawResourceDataSourceException.a(int, byte, short, java.lang.Object[]):void");
    }

    static {
        byte[] bArr = {105, -91, -115, 31, -59, 40, 34, -5, 8, 8, 9, 13, 3, -2, 7, 19, -40, 35, 25, -13, -8, 34, 12, 3, -9, 8, -26, 57, 2, -9, 19, 2, -7, 17, -19, 44, -5, 12, -6, 3, 21, -5, 0, -17, 27, 18, -5, 8, 3, -43, -2, 58, 5, -6, -14, 19, 7, -25, 36, 17, 6, -4, 5, 8, 14};
        $$a = bArr;
        onWarmupCompleted = 1;
        IAuthTabCallback();
        try {
            byte b = bArr[42];
            byte b2 = (byte) (b + 1);
            Object[] objArr = new Object[1];
            a(b, b2, (byte) (-b2), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b3 = bArr[42];
            Object[] objArr2 = new Object[1];
            a((byte) (67 & 5), b3, (byte) (b3 | 45), objArr2);
            cls.getMethod((String) objArr2[0], null).invoke(null, null);
            int i = onExtraCallback + 37;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public static String onExtraCallbackWithResult(String str, long j) throws Throwable {
        Process process;
        int i = 2 % 2;
        try {
            Runtime runtime = Runtime.getRuntime();
            Object[] objArr = new Object[1];
            IAuthTabCallback(View.MeasureSpec.getSize(0) + 189, "\ufffb\u0006", -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 2 - (ViewConfiguration.getJumpTapTimeout() >> 16), false, objArr);
            Process processExec = runtime.exec((String) objArr[0], (String[]) null, (File) null);
            LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0 leastRecentlyUsedCacheEvictorExternalSyntheticLambda0 = new LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0(processExec.getInputStream());
            LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0 leastRecentlyUsedCacheEvictorExternalSyntheticLambda02 = new LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0(processExec.getErrorStream());
            DataOutputStream dataOutputStream = new DataOutputStream(processExec.getOutputStream());
            leastRecentlyUsedCacheEvictorExternalSyntheticLambda0.start();
            leastRecentlyUsedCacheEvictorExternalSyntheticLambda02.start();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            Object[] objArr2 = new Object[1];
            IAuthTabCallback(90 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), "\u0000", 1 - View.MeasureSpec.getMode(0), 1 - TextUtils.getOffsetBefore("", 0), true, objArr2);
            sb.append((String) objArr2[0]);
            String string = sb.toString();
            Object[] objArr3 = new Object[1];
            IAuthTabCallback(ExpandableListView.getPackedPositionChild(0L) + 149, "\u0002￩\ufff4\u0011\u0010", ExpandableListView.getPackedPositionChild(0L) + 4, 5 - KeyEvent.normalizeMetaState(0), false, objArr3);
            dataOutputStream.write(string.getBytes((String) objArr3[0]));
            dataOutputStream.flush();
            Object[] objArr4 = new Object[1];
            IAuthTabCallback(218 - AndroidCharacter.getMirror('0'), "\u001e\u000f\u001aﾰ\u000b", 4 - TextUtils.getCapsMode("", 0, 0), View.combineMeasuredStates(0, 0) + 5, false, objArr4);
            String str2 = (String) objArr4[0];
            Object[] objArr5 = new Object[1];
            IAuthTabCallback(148 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), "\u0002￩\ufff4\u0011\u0010", 3 - (ViewConfiguration.getScrollBarSize() >> 8), 5 - KeyEvent.normalizeMetaState(0), false, objArr5);
            dataOutputStream.write(str2.getBytes((String) objArr5[0]));
            dataOutputStream.flush();
            try {
                try {
                    if (j < 0) {
                        processExec.waitFor();
                    } else {
                        long jNanoTime = System.nanoTime();
                        long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                        while (true) {
                            try {
                                processExec.exitValue();
                                break;
                            } catch (IllegalThreadStateException unused) {
                                if (nanos > 0) {
                                    process = processExec;
                                    try {
                                        Thread.sleep(Math.min(TimeUnit.NANOSECONDS.toMillis(nanos) + 1, 3L));
                                        int i2 = onNavigationEvent + 23;
                                        IAuthTabCallback = i2 % 128;
                                        int i3 = i2 % 2;
                                    } catch (Throwable th) {
                                        th = th;
                                        try {
                                            process.destroy();
                                        } catch (Exception unused2) {
                                        }
                                        throw th;
                                    }
                                } else {
                                    process = processExec;
                                }
                                nanos = TimeUnit.MILLISECONDS.toNanos(j) - (System.nanoTime() - jNanoTime);
                                if (nanos > 0) {
                                    processExec = process;
                                }
                            }
                        }
                    }
                    process = processExec;
                    try {
                        dataOutputStream.close();
                    } catch (IOException unused3) {
                    }
                    leastRecentlyUsedCacheEvictorExternalSyntheticLambda0.join(100L);
                    leastRecentlyUsedCacheEvictorExternalSyntheticLambda02.join(10L);
                    try {
                        process.destroy();
                        int i4 = onNavigationEvent + 39;
                        IAuthTabCallback = i4 % 128;
                        int i5 = i4 % 2;
                    } catch (Exception unused4) {
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(leastRecentlyUsedCacheEvictorExternalSyntheticLambda0.IAuthTabCallback());
                    sb2.append(leastRecentlyUsedCacheEvictorExternalSyntheticLambda02.IAuthTabCallback());
                    return sb2.toString();
                } catch (InterruptedException e) {
                    throw e;
                }
            } catch (Throwable th2) {
                th = th2;
                process = processExec;
            }
        } catch (Exception unused5) {
            Object[] objArr6 = new Object[1];
            IAuthTabCallback((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 171, "\n\u0019\u0006\n\u0017\bￅ\u0014\u0019ￅ\t\n\u0011\u000e\u0006￫ￓ\u0018\u0018\n\b\u0014\u0017\u0015ￅ\u0006ￅ", TextUtils.getCapsMode("", 0, 0) + 16, 27 - View.combineMeasuredStates(0, 0), true, objArr6);
            throw new IOException((String) objArr6[0]);
        }
    }

    private static void IAuthTabCallback(int i, String str, int i2, int i3, boolean z, Object[] objArr) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackStub + 65;
        asBinder = i5 % 128;
        char[] charArray = str;
        if (i5 % 2 != 0) {
            throw new NullPointerException();
        }
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        UtilExternalSyntheticLambda2 utilExternalSyntheticLambda2 = new UtilExternalSyntheticLambda2();
        char[] cArr2 = new char[i3];
        utilExternalSyntheticLambda2.IAuthTabCallback = 0;
        while (utilExternalSyntheticLambda2.IAuthTabCallback < i3) {
            int i6 = asBinder + 41;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            utilExternalSyntheticLambda2.onNavigationEvent = cArr[utilExternalSyntheticLambda2.IAuthTabCallback];
            cArr2[utilExternalSyntheticLambda2.IAuthTabCallback] = (char) (utilExternalSyntheticLambda2.onNavigationEvent + i);
            int i8 = utilExternalSyntheticLambda2.IAuthTabCallback;
            cArr2[i8] = (char) (cArr2[i8] - ((int) (onExtraCallbackWithResult - 8081524258474968927L)));
            utilExternalSyntheticLambda2.IAuthTabCallback++;
        }
        if (i2 > 0) {
            utilExternalSyntheticLambda2.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr2, 0, cArr3, 0, i3);
            System.arraycopy(cArr3, 0, cArr2, i3 - utilExternalSyntheticLambda2.onExtraCallbackWithResult, utilExternalSyntheticLambda2.onExtraCallbackWithResult);
            System.arraycopy(cArr3, utilExternalSyntheticLambda2.onExtraCallbackWithResult, cArr2, 0, i3 - utilExternalSyntheticLambda2.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i3];
            utilExternalSyntheticLambda2.IAuthTabCallback = 0;
            while (utilExternalSyntheticLambda2.IAuthTabCallback < i3) {
                cArr4[utilExternalSyntheticLambda2.IAuthTabCallback] = cArr2[(i3 - utilExternalSyntheticLambda2.IAuthTabCallback) - 1];
                utilExternalSyntheticLambda2.IAuthTabCallback++;
                int i9 = asBinder + 55;
                IAuthTabCallbackStub = i9 % 128;
                int i10 = i9 % 2;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void IAuthTabCallback() {
        onExtraCallbackWithResult = -837138513;
    }
}
