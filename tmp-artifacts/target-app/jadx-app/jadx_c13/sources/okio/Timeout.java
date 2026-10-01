package okio;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class Timeout {
    public static final IAuthTabCallback Companion;
    private static int IAuthTabCallbackDefault;
    private static char IAuthTabCallbackStub;
    private static int asBinder;
    private static long asInterface;
    public static final Timeout onNavigationEvent;
    private volatile Object IAuthTabCallback;
    private long onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private long onWarmupCompleted;
    private static final byte[] $$g = {51, -39, 98, -44};
    private static final int $$h = Imgproc.COLOR_RGBA2YUV_YV12;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback_Parcel = 0;
    private static int getInterfaceDescriptor = 1;
    private static int onTransact = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$i(int i, int i2, short s) {
        int i3;
        int i4 = 110 - s;
        int i5 = i * 4;
        byte[] bArr = $$g;
        int i6 = 3 - (i2 * 4);
        byte[] bArr2 = new byte[1 - i5];
        int i7 = 0 - i5;
        if (bArr == null) {
            int i8 = i4;
            i3 = 0;
            i4 = i7;
            i4 += i8;
            bArr2[i3] = (byte) i4;
            i6++;
            if (i3 == i7) {
                return new String(bArr2, 0);
            }
            i8 = bArr[i6];
            i3++;
            i4 += i8;
            bArr2[i3] = (byte) i4;
            i6++;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            i6++;
            if (i3 == i7) {
            }
        }
    }

    public Timeout timeout(long j, @NotNull TimeUnit timeUnit) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 119;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(timeUnit, "");
        if (j < 0) {
            throw new IllegalArgumentException(("timeout < 0: " + j).toString());
        }
        this.onWarmupCompleted = timeUnit.toNanos(j);
        int i4 = getInterfaceDescriptor + 115;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public long timeoutNanos() {
        long j;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 7;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            j = this.onWarmupCompleted;
            int i4 = 40 / 0;
        } else {
            j = this.onWarmupCompleted;
        }
        int i5 = i2 + 1;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 77 / 0;
        }
        return j;
    }

    public boolean hasDeadline() {
        boolean z;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 125;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            z = this.onExtraCallbackWithResult;
            int i4 = 24 / 0;
        } else {
            z = this.onExtraCallbackWithResult;
        }
        int i5 = i2 + 97;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        throw new java.lang.IllegalStateException("No deadline");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r5.onExtraCallbackWithResult != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if ((!r5.onExtraCallbackWithResult) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        r3 = r5.onExtraCallback;
        r2 = r2 + 49;
        okio.Timeout.getInterfaceDescriptor = r2 % 128;
        r2 = r2 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long deadlineNanoTime() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + Imgproc.COLOR_YUV2RGB_YVYU;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        if (i2 % 2 != 0) {
            int i4 = 48 / 0;
        }
    }

    public Timeout deadlineNanoTime(long j) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 79;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        this.onExtraCallbackWithResult = true;
        this.onExtraCallback = j;
        int i5 = i3 + 1;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if ((r1 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        return deadlineNanoTime(java.lang.System.nanoTime() + r6.toNanos(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0064, code lost:
    
        throw new java.lang.IllegalArgumentException(("duration <= 0: " + r4).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        return deadlineNanoTime(r6.toNanos(r4) ^ java.lang.System.nanoTime());
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r4 > 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r4 > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r1 = okio.Timeout.IAuthTabCallback_Parcel + 93;
        okio.Timeout.getInterfaceDescriptor = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Timeout deadline(long j, @NotNull TimeUnit timeUnit) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 49;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(timeUnit, "");
        } else {
            Intrinsics.checkNotNullParameter(timeUnit, "");
        }
    }

    public Timeout clearTimeout() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 83;
        IAuthTabCallback_Parcel = i3 % 128;
        this.onWarmupCompleted = i3 % 2 != 0 ? 1L : 0L;
        int i4 = i2 + 1;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 97 / 0;
        }
        return this;
    }

    public Timeout clearDeadline() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 13;
        IAuthTabCallback_Parcel = i3 % 128;
        this.onExtraCallbackWithResult = i3 % 2 != 0;
        int i4 = i2 + 93;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    public void throwIfReached() throws IOException {
        int i = 2 % 2;
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        int i2 = getInterfaceDescriptor + 45;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        if (this.onExtraCallbackWithResult) {
            int i5 = i3 + 47;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 != 0 ? this.onExtraCallback - System.nanoTime() <= 0 : (this.onExtraCallback ^ System.nanoTime()) <= 1) {
                throw new InterruptedIOException("deadline reached");
            }
        }
        int i6 = IAuthTabCallback_Parcel + 109;
        getInterfaceDescriptor = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    private static void c(char[] cArr, int i, char[] cArr2, char c, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i4 = $10 + 37;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i6 = $10 + 35;
            $11 = i6 % 128;
            int i7 = i6 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), 43 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0') + 1452, 228868077, false, $$i(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - KeyEvent.normalizeMetaState(0)), 44 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET) + 1494, 1533236389, false, $$i(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - (ViewConfiguration.getLongPressTimeout() >> 16)), 50 - (KeyEvent.getMaxKeyCode() >> 16), 22939 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Gravity.getAbsoluteGravity(0, 0) + 45848), 29 - ((Process.getThreadPriority(0) + 20) >> 6), 12577 - Color.green(0), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (asInterface ^ 7798559133331975163L)) ^ ((int) (asBinder ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallbackStub ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i8 = $11 + 27;
        $10 = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    public void cancel() {
        int i = 2 % 2;
        this.IAuthTabCallback = new Object();
        int i2 = IAuthTabCallback_Parcel + 89;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void awaitSignal(@NotNull Condition condition) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(condition, "");
        try {
            boolean zHasDeadline = hasDeadline();
            long jTimeoutNanos = timeoutNanos();
            if (!zHasDeadline) {
                int i2 = IAuthTabCallback_Parcel + 1;
                getInterfaceDescriptor = i2 % 128;
                if (i2 % 2 != 0 ? jTimeoutNanos == 0 : jTimeoutNanos == 0) {
                    condition.await();
                    return;
                }
            }
            if (zHasDeadline) {
                int i3 = getInterfaceDescriptor + 115;
                IAuthTabCallback_Parcel = i3 % 128;
                if (i3 % 2 == 0 ? jTimeoutNanos != 0 : jTimeoutNanos != 1) {
                    jTimeoutNanos = Math.min(jTimeoutNanos, deadlineNanoTime() - System.nanoTime());
                } else if (zHasDeadline) {
                    int i4 = getInterfaceDescriptor + 123;
                    IAuthTabCallback_Parcel = i4 % 128;
                    int i5 = i4 % 2;
                    jTimeoutNanos = deadlineNanoTime() - System.nanoTime();
                    int i6 = IAuthTabCallback_Parcel + 35;
                    getInterfaceDescriptor = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
            if (jTimeoutNanos <= 0) {
                Object[] objArr = new Object[1];
                c(new char[]{20748, 59759, 4283, 48206, 21608, 33466, 63423}, (Process.myTid() >> 22) - 1710943748, new char[]{0, 0, 0, 0}, (char) Color.alpha(0), new char[]{64708, 1297, 41114, 2256}, objArr);
                throw new InterruptedIOException(((String) objArr[0]).intern());
            }
            int i8 = getInterfaceDescriptor + 111;
            IAuthTabCallback_Parcel = i8 % 128;
            int i9 = i8 % 2;
            Object obj = this.IAuthTabCallback;
            if (condition.awaitNanos(jTimeoutNanos) <= 0 && this.IAuthTabCallback == obj) {
                Object[] objArr2 = new Object[1];
                c(new char[]{20748, 59759, 4283, 48206, 21608, 33466, 63423}, (-1710943748) - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0), new char[]{0, 0, 0, 0}, (char) Drawable.resolveOpacity(0, 0), new char[]{64708, 1297, 41114, 2256}, objArr2);
                throw new InterruptedIOException(((String) objArr2[0]).intern());
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public void waitUntilNotified(@NotNull Object obj) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        try {
            boolean zHasDeadline = hasDeadline();
            long jTimeoutNanos = timeoutNanos();
            if (!zHasDeadline) {
                int i2 = IAuthTabCallback_Parcel + 35;
                getInterfaceDescriptor = i2 % 128;
                if (i2 % 2 != 0 ? jTimeoutNanos == 0 : jTimeoutNanos == 0) {
                    obj.wait();
                    return;
                }
            }
            long jNanoTime = System.nanoTime();
            if (zHasDeadline && jTimeoutNanos != 0) {
                jTimeoutNanos = Math.min(jTimeoutNanos, deadlineNanoTime() - jNanoTime);
                int i3 = getInterfaceDescriptor + 109;
                IAuthTabCallback_Parcel = i3 % 128;
                int i4 = i3 % 2;
            } else if (zHasDeadline) {
                jTimeoutNanos = deadlineNanoTime() - jNanoTime;
            }
            if (jTimeoutNanos <= 0) {
                Object[] objArr = new Object[1];
                c(new char[]{20748, 59759, 4283, 48206, 21608, 33466, 63423}, (-1710943747) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), new char[]{0, 0, 0, 0}, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), new char[]{64708, 1297, 41114, 2256}, objArr);
                throw new InterruptedIOException(((String) objArr[0]).intern());
            }
            int i5 = IAuthTabCallback_Parcel + 99;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            Object obj2 = this.IAuthTabCallback;
            long j = jTimeoutNanos / 1000000;
            obj.wait(j, (int) (jTimeoutNanos - (1000000 * j)));
            if (System.nanoTime() - jNanoTime >= jTimeoutNanos && this.IAuthTabCallback == obj2) {
                Object[] objArr2 = new Object[1];
                c(new char[]{20748, 59759, 4283, 48206, 21608, 33466, 63423}, View.getDefaultSize(0, 0) - 1710943748, new char[]{0, 0, 0, 0}, (char) Color.green(0), new char[]{64708, 1297, 41114, 2256}, objArr2);
                throw new InterruptedIOException(((String) objArr2[0]).intern());
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public final <T> T intersectWith(@NotNull Timeout timeout, @NotNull Function0<? extends T> function0) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 109;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(timeout, "");
        Intrinsics.checkNotNullParameter(function0, "");
        long jTimeoutNanos = timeoutNanos();
        long jOnExtraCallbackWithResult = Companion.onExtraCallbackWithResult(timeout.timeoutNanos(), timeoutNanos());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout(jOnExtraCallbackWithResult, timeUnit);
        if (hasDeadline()) {
            int i4 = getInterfaceDescriptor + 57;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            long jDeadlineNanoTime = deadlineNanoTime();
            if (timeout.hasDeadline()) {
                deadlineNanoTime(Math.min(deadlineNanoTime(), timeout.deadlineNanoTime()));
            }
            try {
                T tInvoke = function0.invoke();
                InlineMarker.finallyStart(1);
                timeout(jTimeoutNanos, timeUnit);
                if (timeout.hasDeadline()) {
                    deadlineNanoTime(jDeadlineNanoTime);
                }
                InlineMarker.finallyEnd(1);
                return tInvoke;
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                if (timeout.hasDeadline()) {
                    deadlineNanoTime(jDeadlineNanoTime);
                }
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        if (timeout.hasDeadline()) {
            int i6 = getInterfaceDescriptor + 89;
            IAuthTabCallback_Parcel = i6 % 128;
            int i7 = i6 % 2;
            deadlineNanoTime(timeout.deadlineNanoTime());
        }
        try {
            T tInvoke2 = function0.invoke();
            InlineMarker.finallyStart(1);
            timeout(jTimeoutNanos, timeUnit);
            if (timeout.hasDeadline()) {
                int i8 = getInterfaceDescriptor + 53;
                IAuthTabCallback_Parcel = i8 % 128;
                int i9 = i8 % 2;
                clearDeadline();
                if (i9 != 0) {
                    throw null;
                }
            }
            InlineMarker.finallyEnd(1);
            return tInvoke2;
        } catch (Throwable th2) {
            InlineMarker.finallyStart(1);
            timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
            if (timeout.hasDeadline()) {
                clearDeadline();
            }
            InlineMarker.finallyEnd(1);
            throw th2;
        }
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long onExtraCallbackWithResult(long j, long j2) {
            return (j == 0 || (j2 != 0 && j >= j2)) ? j2 : j;
        }

        private IAuthTabCallback() {
        }
    }

    public static final class onExtraCallback extends Timeout {
        @Override // okio.Timeout
        public Timeout deadlineNanoTime(long j) {
            return this;
        }

        @Override // okio.Timeout
        public void throwIfReached() {
        }

        @Override // okio.Timeout
        public Timeout timeout(long j, TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "");
            return this;
        }

        onExtraCallback() {
        }
    }

    static {
        IAuthTabCallbackDefault = 1;
        IAuthTabCallback();
        Companion = new IAuthTabCallback(null);
        onNavigationEvent = new onExtraCallback();
        int i = onTransact + 101;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 == 0) {
            int i2 = 10 / 0;
        }
    }

    static void IAuthTabCallback() {
        asInterface = 7798559133331975163L;
        asBinder = -1776194565;
        IAuthTabCallbackStub = (char) 2918;
    }
}
