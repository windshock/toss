package okio;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.TTAppOpenAdActivity6;
import o.TTBaseActivity;
import o.TTHistoryActivity1;
import o.TTHistoryActivity2;
import o.TTHistoryActivity41;
import o.TTHistoryActivity42;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class AsyncTimeout extends Timeout {
    private static final onNavigationEvent Companion;
    private static final long IAuthTabCallback;
    private static final TTHistoryActivity1 IAuthTabCallbackStub;
    private static int IAuthTabCallback_Parcel;
    private static int access000;
    private static final ReentrantLock asBinder;
    private static final Condition onExtraCallback;
    private static AsyncTimeout onTransact;
    private static final long onWarmupCompleted;
    private long IAuthTabCallbackDefault;
    private int asInterface;
    public int onExtraCallbackWithResult = -1;
    private static final byte[] $$d = {13, 38, -109, 117};
    private static final int $$e = 42;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int access100 = 1;
    private static int getInterfaceDescriptor = 0;

    private static String $$f(int i, int i2, int i3) {
        int i4 = i * 4;
        int i5 = 105 - (i3 * 3);
        byte[] bArr = $$d;
        int i6 = i2 + 4;
        byte[] bArr2 = new byte[1 - i4];
        int i7 = 0 - i4;
        int i8 = -1;
        if (bArr == null) {
            i5 += i7;
        }
        while (true) {
            i8++;
            bArr2[i8] = (byte) i5;
            i6++;
            if (i8 == i7) {
                return new String(bArr2, 0);
            }
            i5 += bArr[i6];
        }
    }

    protected void timedOut() {
        int i = 2 % 2;
        int i2 = access100 + 63;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final /* synthetic */ onNavigationEvent access$getCompanion$p() {
        int i = 2 % 2;
        int i2 = access100 + 65;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        onNavigationEvent onnavigationevent = Companion;
        int i5 = i3 + 61;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            return onnavigationevent;
        }
        throw null;
    }

    public static final /* synthetic */ Condition access$getCondition$cp() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 79;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        Condition condition = onExtraCallback;
        int i5 = i3 + 103;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            return condition;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ long access$getIDLE_TIMEOUT_MILLIS$cp() {
        int i = 2 % 2;
        int i2 = access100 + 105;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        long j = onWarmupCompleted;
        int i5 = i3 + 69;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public static final /* synthetic */ long access$getIDLE_TIMEOUT_NANOS$cp() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 97;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        long j = IAuthTabCallback;
        int i5 = i2 + 95;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public static final /* synthetic */ AsyncTimeout access$getIdleSentinel$cp() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 107;
        int i3 = i2 % 128;
        access100 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        AsyncTimeout asyncTimeout = onTransact;
        int i4 = i3 + 37;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return asyncTimeout;
    }

    public static final /* synthetic */ ReentrantLock access$getLock$cp() {
        int i = 2 % 2;
        int i2 = access100 + 53;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        ReentrantLock reentrantLock = asBinder;
        if (i3 != 0) {
            int i4 = 69 / 0;
        }
        return reentrantLock;
    }

    public static final /* synthetic */ TTHistoryActivity1 access$getQueue$cp() {
        int i = 2 % 2;
        int i2 = access100 + 37;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        TTHistoryActivity1 tTHistoryActivity1 = IAuthTabCallbackStub;
        int i5 = i3 + 13;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 26 / 0;
        }
        return tTHistoryActivity1;
    }

    public static final /* synthetic */ void access$setIdleSentinel$cp(AsyncTimeout asyncTimeout) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 47;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        onTransact = asyncTimeout;
        int i5 = i2 + 5;
        access100 = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void access$setState$p(AsyncTimeout asyncTimeout, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 41;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        asyncTimeout.asInterface = i;
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long getTimeoutAt$okio() {
        long j;
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 45;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            j = this.IAuthTabCallbackDefault;
            int i4 = 84 / 0;
        } else {
            j = this.IAuthTabCallbackDefault;
        }
        int i5 = i2 + 51;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 78 / 0;
        }
        return j;
    }

    public final void enter() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 31;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        long jTimeoutNanos = timeoutNanos();
        boolean zHasDeadline = hasDeadline();
        if (jTimeoutNanos == 0) {
            int i4 = IAuthTabCallbackStubProxy + 39;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            if (!zHasDeadline) {
                return;
            }
        }
        ReentrantLock reentrantLock = asBinder;
        reentrantLock.lock();
        try {
            if (this.asInterface != 0) {
                throw new IllegalStateException("Unbalanced enter/exit");
            }
            this.asInterface = 1;
            Companion.IAuthTabCallback(this);
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (r4 == 1) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.concurrent.locks.Lock] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.concurrent.locks.Lock] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean exit() {
        int i;
        ReentrantLock reentrantLock;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 13;
        access100 = i3 % 128;
        ?? r1 = i3 % 2;
        boolean z = false;
        boolean z2 = true;
        try {
            if (r1 != 0) {
                ReentrantLock reentrantLock2 = asBinder;
                reentrantLock2.lock();
                i = this.asInterface;
                this.asInterface = 0;
                reentrantLock = reentrantLock2;
                r1 = reentrantLock2;
            } else {
                ReentrantLock reentrantLock3 = asBinder;
                reentrantLock3.lock();
                i = this.asInterface;
                this.asInterface = 1;
                r1 = reentrantLock3;
                if (i != 1) {
                    z = true;
                    reentrantLock = reentrantLock3;
                    if (i == 2) {
                        int i4 = access100 + 31;
                        IAuthTabCallbackStubProxy = i4 % 128;
                        int i5 = i4 % 2;
                    } else {
                        z2 = z;
                    }
                    return z2;
                }
                IAuthTabCallbackStub.onExtraCallback(this);
                return false;
            }
        } finally {
            r1.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028 A[Catch: all -> 0x003f, PHI: r1
      0x0028: PHI (r1v6 java.util.concurrent.locks.ReentrantLock) = (r1v12 java.util.concurrent.locks.ReentrantLock), (r1v13 java.util.concurrent.locks.ReentrantLock) binds: [B:10:0x0026, B:6:0x0018] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x003f, blocks: (B:5:0x0016, B:13:0x0039, B:11:0x0028, B:9:0x0023), top: B:19:0x000c }] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.concurrent.locks.Lock] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.concurrent.locks.Lock] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // okio.Timeout
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void cancel() {
        ReentrantLock reentrantLock;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + Imgproc.COLOR_YUV2RGBA_YVYU;
        access100 = i2 % 128;
        ?? r1 = i2 % 2;
        try {
            if (r1 == 0) {
                super.cancel();
                ReentrantLock reentrantLock2 = asBinder;
                reentrantLock2.lock();
                r1 = reentrantLock2;
                reentrantLock = reentrantLock2;
                if (this.asInterface == 0) {
                    IAuthTabCallbackStub.onExtraCallback(this);
                    this.asInterface = 3;
                    int i3 = access100 + 55;
                    IAuthTabCallbackStubProxy = i3 % 128;
                    int i4 = i3 % 2;
                    r1 = reentrantLock;
                }
            } else {
                super.cancel();
                ReentrantLock reentrantLock3 = asBinder;
                reentrantLock3.lock();
                r1 = reentrantLock3;
                reentrantLock = reentrantLock3;
                if (this.asInterface == 1) {
                }
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            r1.unlock();
        }
    }

    public final long remainingNanos$okio(long j) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 29;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        long j2 = this.IAuthTabCallbackDefault;
        long j3 = i4 == 0 ? j ^ j2 : j2 - j;
        int i5 = i3 + 93;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 5 / 0;
        }
        return j3;
    }

    public static /* synthetic */ void setTimeoutAt$okio$default(AsyncTimeout asyncTimeout, long j, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setTimeoutAt");
        }
        int i3 = access100 + 81;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            j = System.nanoTime();
            int i4 = IAuthTabCallbackStubProxy + 75;
            access100 = i4 % 128;
            int i5 = i4 % 2;
        }
        asyncTimeout.setTimeoutAt$okio(j);
    }

    public final void setTimeoutAt$okio(long j) {
        int i = 2 % 2;
        long jTimeoutNanos = timeoutNanos();
        boolean zHasDeadline = hasDeadline();
        if (timeoutNanos() != 0) {
            int i2 = access100 + 97;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            if (hasDeadline()) {
                this.IAuthTabCallbackDefault = j + Math.min(jTimeoutNanos, deadlineNanoTime() - j);
                return;
            }
        }
        if (jTimeoutNanos != 0) {
            this.IAuthTabCallbackDefault = j + jTimeoutNanos;
        } else {
            if (!zHasDeadline) {
                throw new AssertionError();
            }
            int i4 = access100 + 5;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            this.IAuthTabCallbackDefault = deadlineNanoTime();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i2];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i2) {
                break;
            }
            int i6 = $11 + 45;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(IAuthTabCallback_Parcel)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - TextUtils.getCapsMode(_UrlKt.FRAGMENT_ENCODE_SET, 0, 0)), 23 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 10279 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback2 == null) {
                        byte b = (byte) 0;
                        byte b2 = (byte) (b - 1);
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getLongPressTimeout() >> 16)), 56 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 2166 - Process.getGidForName(_UrlKt.FRAGMENT_ENCODE_SET), 1298711993, false, $$f(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
                int i9 = $10 + 125;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) % 1];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 - 1);
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - Color.blue(0)), 55 - View.MeasureSpec.getMode(0), 2167 - (Process.myPid() >> 22), 1298711993, false, $$f(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } else {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback4 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 - 1);
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 55 - View.MeasureSpec.makeMeasureSpec(0, 0), 2166 - Process.getGidForName(_UrlKt.FRAGMENT_ENCODE_SET), 1298711993, false, $$f(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                i4 = 2083011369;
            }
            int i10 = $10 + 21;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    public static final class onExtraCallback implements TTHistoryActivity41 {
        final /* synthetic */ TTHistoryActivity41 onWarmupCompleted;

        onExtraCallback(TTHistoryActivity41 tTHistoryActivity41) {
            this.onWarmupCompleted = tTHistoryActivity41;
        }

        @Override // o.TTHistoryActivity41
        public void write(TTBaseActivity tTBaseActivity, long j) throws IOException {
            Intrinsics.checkNotNullParameter(tTBaseActivity, "");
            TTAppOpenAdActivity6.onExtraCallbackWithResult(tTBaseActivity.ICustomTabsCallbackDefault(), 0L, j);
            while (true) {
                long j2 = 0;
                if (j <= 0) {
                    return;
                }
                TTHistoryActivity2 tTHistoryActivity2 = tTBaseActivity.head;
                Intrinsics.checkNotNull(tTHistoryActivity2);
                while (true) {
                    if (j2 >= 65536) {
                        break;
                    }
                    j2 += tTHistoryActivity2.limit - tTHistoryActivity2.pos;
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    } else {
                        tTHistoryActivity2 = tTHistoryActivity2.next;
                        Intrinsics.checkNotNull(tTHistoryActivity2);
                    }
                }
                AsyncTimeout asyncTimeout = AsyncTimeout.this;
                TTHistoryActivity41 tTHistoryActivity41 = this.onWarmupCompleted;
                asyncTimeout.enter();
                try {
                    tTHistoryActivity41.write(tTBaseActivity, j2);
                    Unit unit = Unit.INSTANCE;
                    if (asyncTimeout.exit()) {
                        throw asyncTimeout.access$newTimeoutException(null);
                    }
                    j -= j2;
                } catch (IOException e) {
                    if (!asyncTimeout.exit()) {
                        throw e;
                    }
                    throw asyncTimeout.access$newTimeoutException(e);
                } finally {
                    asyncTimeout.exit();
                }
            }
        }

        @Override // o.TTHistoryActivity41, java.io.Flushable
        public void flush() throws IOException {
            AsyncTimeout asyncTimeout = AsyncTimeout.this;
            TTHistoryActivity41 tTHistoryActivity41 = this.onWarmupCompleted;
            asyncTimeout.enter();
            try {
                tTHistoryActivity41.flush();
                Unit unit = Unit.INSTANCE;
                if (asyncTimeout.exit()) {
                    throw asyncTimeout.access$newTimeoutException(null);
                }
            } catch (IOException e) {
                if (!asyncTimeout.exit()) {
                    throw e;
                }
                throw asyncTimeout.access$newTimeoutException(e);
            } finally {
                asyncTimeout.exit();
            }
        }

        @Override // o.TTHistoryActivity41, java.lang.AutoCloseable, java.nio.channels.Channel
        public void close() throws IOException {
            AsyncTimeout asyncTimeout = AsyncTimeout.this;
            TTHistoryActivity41 tTHistoryActivity41 = this.onWarmupCompleted;
            asyncTimeout.enter();
            try {
                tTHistoryActivity41.close();
                Unit unit = Unit.INSTANCE;
                if (asyncTimeout.exit()) {
                    throw asyncTimeout.access$newTimeoutException(null);
                }
            } catch (IOException e) {
                if (!asyncTimeout.exit()) {
                    throw e;
                }
                throw asyncTimeout.access$newTimeoutException(e);
            } finally {
                asyncTimeout.exit();
            }
        }

        @Override // o.TTHistoryActivity41
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public AsyncTimeout timeout() {
            return AsyncTimeout.this;
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.onWarmupCompleted + ')';
        }
    }

    public final TTHistoryActivity41 sink(@NotNull TTHistoryActivity41 tTHistoryActivity41) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tTHistoryActivity41, "");
        onExtraCallback onextracallback = new onExtraCallback(tTHistoryActivity41);
        int i2 = access100 + 9;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 31 / 0;
        }
        return onextracallback;
    }

    public static final class onExtraCallbackWithResult implements TTHistoryActivity42 {
        final /* synthetic */ TTHistoryActivity42 onWarmupCompleted;

        onExtraCallbackWithResult(TTHistoryActivity42 tTHistoryActivity42) {
            this.onWarmupCompleted = tTHistoryActivity42;
        }

        @Override // o.TTHistoryActivity42
        public long read(TTBaseActivity tTBaseActivity, long j) throws IOException {
            Intrinsics.checkNotNullParameter(tTBaseActivity, "");
            AsyncTimeout asyncTimeout = AsyncTimeout.this;
            TTHistoryActivity42 tTHistoryActivity42 = this.onWarmupCompleted;
            asyncTimeout.enter();
            try {
                long j2 = tTHistoryActivity42.read(tTBaseActivity, j);
                if (asyncTimeout.exit()) {
                    throw asyncTimeout.access$newTimeoutException(null);
                }
                return j2;
            } catch (IOException e) {
                if (asyncTimeout.exit()) {
                    throw asyncTimeout.access$newTimeoutException(e);
                }
                throw e;
            } finally {
                asyncTimeout.exit();
            }
        }

        @Override // o.TTHistoryActivity42, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, o.TTHistoryActivity41
        public void close() throws IOException {
            AsyncTimeout asyncTimeout = AsyncTimeout.this;
            TTHistoryActivity42 tTHistoryActivity42 = this.onWarmupCompleted;
            asyncTimeout.enter();
            try {
                tTHistoryActivity42.close();
                Unit unit = Unit.INSTANCE;
                if (asyncTimeout.exit()) {
                    throw asyncTimeout.access$newTimeoutException(null);
                }
            } catch (IOException e) {
                if (!asyncTimeout.exit()) {
                    throw e;
                }
                throw asyncTimeout.access$newTimeoutException(e);
            } finally {
                asyncTimeout.exit();
            }
        }

        @Override // o.TTHistoryActivity42, o.TTHistoryActivity41
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public AsyncTimeout timeout() {
            return AsyncTimeout.this;
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.onWarmupCompleted + ')';
        }
    }

    public final TTHistoryActivity42 source(@NotNull TTHistoryActivity42 tTHistoryActivity42) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tTHistoryActivity42, "");
        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(tTHistoryActivity42);
        int i2 = IAuthTabCallbackStubProxy + 27;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 74 / 0;
        }
        return onextracallbackwithresult;
    }

    public final <T> T withTimeout(@NotNull Function0<? extends T> function0) throws IOException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        enter();
        try {
            try {
                T tInvoke = function0.invoke();
                InlineMarker.finallyStart(1);
                if (exit()) {
                    throw access$newTimeoutException(null);
                }
                int i2 = IAuthTabCallbackStubProxy + 85;
                access100 = i2 % 128;
                int i3 = i2 % 2;
                InlineMarker.finallyEnd(1);
                return tInvoke;
            } catch (IOException e) {
                if (exit()) {
                    throw access$newTimeoutException(e);
                }
                int i4 = IAuthTabCallbackStubProxy + 107;
                access100 = i4 % 128;
                int i5 = i4 % 2;
                throw e;
            }
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            exit();
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }

    public final IOException access$newTimeoutException(@Nullable IOException iOException) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 21;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        IOException iOExceptionNewTimeoutException = newTimeoutException(iOException);
        int i4 = access100 + 21;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 12 / 0;
        }
        return iOExceptionNewTimeoutException;
    }

    protected IOException newTimeoutException(@Nullable IOException iOException) throws Throwable {
        int i = 2 % 2;
        Object[] objArr = new Object[1];
        b((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 6, new char[]{6, 6, 7, 1, 65527, 65535, 65531}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 269, true, objArr);
        InterruptedIOException interruptedIOException = new InterruptedIOException(((String) objArr[0]).intern());
        if (iOException != null) {
            int i2 = IAuthTabCallbackStubProxy + 45;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            interruptedIOException.initCause(iOException);
        }
        int i4 = access100 + Imgproc.COLOR_YUV2RGB_YVYU;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 21 / 0;
        }
        return interruptedIOException;
    }

    static final class onWarmupCompleted extends Thread {
        public onWarmupCompleted() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ReentrantLock reentrantLockOnWarmupCompleted;
            AsyncTimeout asyncTimeoutOnNavigationEvent;
            while (true) {
                try {
                    reentrantLockOnWarmupCompleted = AsyncTimeout.access$getCompanion$p().onWarmupCompleted();
                    reentrantLockOnWarmupCompleted.lock();
                    try {
                        asyncTimeoutOnNavigationEvent = AsyncTimeout.access$getCompanion$p().onNavigationEvent();
                    } finally {
                        reentrantLockOnWarmupCompleted.unlock();
                    }
                } catch (InterruptedException unused) {
                    continue;
                }
                if (asyncTimeoutOnNavigationEvent == AsyncTimeout.access$getCompanion$p().onExtraCallback()) {
                    AsyncTimeout.access$getCompanion$p().onExtraCallback(null);
                    return;
                }
                Unit unit = Unit.INSTANCE;
                reentrantLockOnWarmupCompleted.unlock();
                if (asyncTimeoutOnNavigationEvent != null) {
                    asyncTimeoutOnNavigationEvent.timedOut();
                }
            }
        }
    }

    static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final TTHistoryActivity1 onExtraCallbackWithResult() {
            return AsyncTimeout.access$getQueue$cp();
        }

        public final AsyncTimeout onExtraCallback() {
            return AsyncTimeout.access$getIdleSentinel$cp();
        }

        public final void onExtraCallback(@Nullable AsyncTimeout asyncTimeout) {
            AsyncTimeout.access$setIdleSentinel$cp(asyncTimeout);
        }

        public final ReentrantLock onWarmupCompleted() {
            return AsyncTimeout.access$getLock$cp();
        }

        public final Condition IAuthTabCallback() {
            return AsyncTimeout.access$getCondition$cp();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void IAuthTabCallback(AsyncTimeout asyncTimeout) {
            if (onExtraCallback() == null) {
                onExtraCallback(new AsyncTimeout());
                new onWarmupCompleted().start();
            }
            AsyncTimeout.setTimeoutAt$okio$default(asyncTimeout, 0L, 1, null);
            onExtraCallbackWithResult().onWarmupCompleted(asyncTimeout);
            if (asyncTimeout.onExtraCallbackWithResult == 1) {
                IAuthTabCallback().signal();
            }
        }

        public final AsyncTimeout onNavigationEvent() throws InterruptedException {
            AsyncTimeout asyncTimeoutOnExtraCallback = onExtraCallbackWithResult().onExtraCallback();
            if (asyncTimeoutOnExtraCallback == null) {
                long jNanoTime = System.nanoTime();
                IAuthTabCallback().await(AsyncTimeout.access$getIDLE_TIMEOUT_MILLIS$cp(), TimeUnit.MILLISECONDS);
                if (onExtraCallbackWithResult().onExtraCallback() != null || System.nanoTime() - jNanoTime < AsyncTimeout.access$getIDLE_TIMEOUT_NANOS$cp()) {
                    return null;
                }
                return onExtraCallback();
            }
            long jRemainingNanos$okio = asyncTimeoutOnExtraCallback.remainingNanos$okio(System.nanoTime());
            if (jRemainingNanos$okio > 0) {
                IAuthTabCallback().await(jRemainingNanos$okio, TimeUnit.NANOSECONDS);
                return null;
            }
            onExtraCallbackWithResult().onExtraCallback(asyncTimeoutOnExtraCallback);
            AsyncTimeout.access$setState$p(asyncTimeoutOnExtraCallback, 2);
            return asyncTimeoutOnExtraCallback;
        }
    }

    static {
        access000 = 1;
        onWarmupCompleted();
        Companion = new onNavigationEvent(null);
        IAuthTabCallbackStub = new TTHistoryActivity1();
        ReentrantLock reentrantLock = new ReentrantLock();
        asBinder = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        Intrinsics.checkNotNullExpressionValue(conditionNewCondition, "");
        onExtraCallback = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        onWarmupCompleted = millis;
        IAuthTabCallback = TimeUnit.MILLISECONDS.toNanos(millis);
        int i = getInterfaceDescriptor + 51;
        access000 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    static void onWarmupCompleted() {
        IAuthTabCallback_Parcel = 478309046;
    }
}
