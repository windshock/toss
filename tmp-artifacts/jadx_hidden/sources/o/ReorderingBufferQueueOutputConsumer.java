package o;

import android.os.Process;
import android.view.ViewConfiguration;
import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class ReorderingBufferQueueOutputConsumer extends FilterInputStream implements Iterable<ExoPlayerImplExternalSyntheticLambda12> {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final ReorderingBufferQueueBuffersWithTimestamp onExtraCallback;

    public ReorderingBufferQueueOutputConsumer(ReorderingBufferQueueBuffersWithTimestamp reorderingBufferQueueBuffersWithTimestamp, byte[] bArr) {
        super(new ByteArrayInputStream(bArr));
        this.onExtraCallback = reorderingBufferQueueBuffersWithTimestamp;
    }

    public final <T extends ExoPlayerImplExternalSyntheticLambda12> T onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        try {
            ExoPlayerImplExternalSyntheticLambda14<? extends ExoPlayerImplExternalSyntheticLambda12> exoPlayerImplExternalSyntheticLambda14OnExtraCallbackWithResult = this.onExtraCallback.onExtraCallbackWithResult(this);
            T t = (T) exoPlayerImplExternalSyntheticLambda14OnExtraCallbackWithResult.onExtraCallbackWithResult(this.onExtraCallback).onNavigationEvent(exoPlayerImplExternalSyntheticLambda14OnExtraCallbackWithResult, this.onExtraCallback.onExtraCallback(this.onExtraCallback.onWarmupCompleted(this), this));
            int i4 = onWarmupCompleted + 3;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return t;
            }
            throw new NullPointerException();
        } catch (Exception e) {
            throw new ExoPlayerImplExternalSyntheticLambda11(e);
        }
    }

    public final byte[] onExtraCallbackWithResult(int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = (i3 ^ 91) + ((i3 & 91) << 1);
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        byte[] bArrOnExtraCallback = this.onExtraCallback.onExtraCallback(i, this);
        int i6 = IAuthTabCallback + 5;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return bArrOnExtraCallback;
    }

    @Override // java.lang.Iterable
    public final Iterator<ExoPlayerImplExternalSyntheticLambda12> iterator() {
        int i = 2 % 2;
        Iterator<ExoPlayerImplExternalSyntheticLambda12> it = new Iterator<ExoPlayerImplExternalSyntheticLambda12>() { // from class: o.ReorderingBufferQueueOutputConsumer.2
            private static int IAuthTabCallbackDefault = 1;
            private static int asBinder;
            private static char[] IAuthTabCallback = {33817, 33808, 33829, 33757, 33819, 33821, 33814, 33795, 33815, 33825, 33822, 33830, 33809, 33812, 33827, 33788, 33826};
            private static int onNavigationEvent = 1131447215;
            private static boolean onExtraCallback = true;
            private static boolean onWarmupCompleted = true;

            @Override // java.util.Iterator
            public final /* synthetic */ ExoPlayerImplExternalSyntheticLambda12 next() throws Throwable {
                int i2 = 2 % 2;
                int i3 = asBinder + 5;
                IAuthTabCallbackDefault = i3 % 128;
                if (i3 % 2 == 0) {
                    IAuthTabCallback();
                    throw new ArithmeticException();
                }
                ExoPlayerImplExternalSyntheticLambda12 exoPlayerImplExternalSyntheticLambda12IAuthTabCallback = IAuthTabCallback();
                int i4 = asBinder;
                int i5 = (i4 & 83) + (i4 | 83);
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
                return exoPlayerImplExternalSyntheticLambda12IAuthTabCallback;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                int i2 = 2 % 2;
                int i3 = asBinder;
                int i4 = ((i3 | 83) << 1) - (i3 ^ 83);
                IAuthTabCallbackDefault = i4 % 128;
                int i5 = i4 % 2;
                try {
                    if (ReorderingBufferQueueOutputConsumer.this.available() > 0) {
                        int i6 = IAuthTabCallbackDefault;
                        int i7 = i6 + 45;
                        asBinder = i7 % 128;
                        int i8 = i7 % 2;
                        int i9 = (i6 ^ 49) + ((i6 & 49) << 1);
                        asBinder = i9 % 128;
                        if (i9 % 2 == 0) {
                            return true;
                        }
                        throw new ArithmeticException();
                    }
                } catch (IOException unused) {
                }
                return false;
            }

            private ExoPlayerImplExternalSyntheticLambda12 IAuthTabCallback() throws Throwable {
                try {
                    return ReorderingBufferQueueOutputConsumer.this.onWarmupCompleted();
                } catch (Exception e) {
                    try {
                        int i2 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        Object[] objArr = new Object[1];
                        onExtraCallbackWithResult((i2 ^ 128) + ((i2 & 128) << 1), null, null, "\u008e\u0085\u008d\u0082\u008c\u008b\u008a\u0089\u0088\u0084\u0087\u0086\u0082\u0085\u0084\u0082\u0083\u0082\u0081", objArr);
                        Class<?> cls = Class.forName((String) objArr[0]);
                        int jumpTapTimeout = ViewConfiguration.getJumpTapTimeout() >> 16;
                        int iIdentityHashCode = System.identityHashCode(this);
                        int i3 = (jumpTapTimeout * (-1335)) - 84709;
                        int i4 = ~((jumpTapTimeout ^ iIdentityHashCode) | (jumpTapTimeout & iIdentityHashCode));
                        int i5 = ((i4 & (-128)) | (i4 ^ (-128))) * (-668);
                        int i6 = (i3 & i5) + (i3 | i5);
                        int i7 = ~((iIdentityHashCode ^ (-128)) | (iIdentityHashCode & (-128)));
                        int i8 = i6 + (((i7 & jumpTapTimeout) | (jumpTapTimeout ^ i7)) * 1336);
                        int i9 = jumpTapTimeout | iIdentityHashCode;
                        int i10 = ((i9 & (-128)) | (i9 ^ (-128))) * 668;
                        Object[] objArr2 = new Object[1];
                        onExtraCallbackWithResult(((i8 | i10) << 1) - (i10 ^ i8), null, null, "\u008e\u0087\u0082\u0091\u0091\u008e\u0090\u008f\u008e\u0087", objArr2);
                        throw new NoSuchElementException((String) cls.getMethod((String) objArr2[0], null).invoke(e, null));
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
            }

            @Override // java.util.Iterator
            public final void remove() {
                int i2 = 2 % 2;
                throw new UnsupportedOperationException();
            }

            private static void onExtraCallbackWithResult(int i2, String str, int[] iArr, String str2, Object[] objArr) throws UnsupportedEncodingException {
                byte[] bytes = str2;
                if (str2 != null) {
                    bytes = str2.getBytes("ISO-8859-1");
                }
                byte[] bArr = bytes;
                char[] charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = charArray;
                UtilExternalSyntheticLambda1 utilExternalSyntheticLambda1 = new UtilExternalSyntheticLambda1();
                char[] cArr2 = IAuthTabCallback;
                if (cArr2 != null) {
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    for (int i3 = 0; i3 < length; i3++) {
                        cArr3[i3] = (char) (cArr2[i3] - 3038365681431118716L);
                    }
                    cArr2 = cArr3;
                }
                int i4 = (int) (onNavigationEvent - 3038365681431118716L);
                if (onWarmupCompleted) {
                    utilExternalSyntheticLambda1.onNavigationEvent = bArr.length;
                    char[] cArr4 = new char[utilExternalSyntheticLambda1.onNavigationEvent];
                    utilExternalSyntheticLambda1.onExtraCallbackWithResult = 0;
                    while (utilExternalSyntheticLambda1.onExtraCallbackWithResult < utilExternalSyntheticLambda1.onNavigationEvent) {
                        cArr4[utilExternalSyntheticLambda1.onExtraCallbackWithResult] = (char) (cArr2[bArr[(utilExternalSyntheticLambda1.onNavigationEvent - 1) - utilExternalSyntheticLambda1.onExtraCallbackWithResult] + i2] - i4);
                        utilExternalSyntheticLambda1.onExtraCallbackWithResult++;
                    }
                    objArr[0] = new String(cArr4);
                    return;
                }
                if (onExtraCallback) {
                    utilExternalSyntheticLambda1.onNavigationEvent = cArr.length;
                    char[] cArr5 = new char[utilExternalSyntheticLambda1.onNavigationEvent];
                    utilExternalSyntheticLambda1.onExtraCallbackWithResult = 0;
                    while (utilExternalSyntheticLambda1.onExtraCallbackWithResult < utilExternalSyntheticLambda1.onNavigationEvent) {
                        cArr5[utilExternalSyntheticLambda1.onExtraCallbackWithResult] = (char) (cArr2[cArr[(utilExternalSyntheticLambda1.onNavigationEvent - 1) - utilExternalSyntheticLambda1.onExtraCallbackWithResult] - i2] - i4);
                        utilExternalSyntheticLambda1.onExtraCallbackWithResult++;
                    }
                    objArr[0] = new String(cArr5);
                    return;
                }
                utilExternalSyntheticLambda1.onNavigationEvent = iArr.length;
                char[] cArr6 = new char[utilExternalSyntheticLambda1.onNavigationEvent];
                utilExternalSyntheticLambda1.onExtraCallbackWithResult = 0;
                while (utilExternalSyntheticLambda1.onExtraCallbackWithResult < utilExternalSyntheticLambda1.onNavigationEvent) {
                    cArr6[utilExternalSyntheticLambda1.onExtraCallbackWithResult] = (char) (cArr2[iArr[(utilExternalSyntheticLambda1.onNavigationEvent - 1) - utilExternalSyntheticLambda1.onExtraCallbackWithResult] - i2] - i4);
                    utilExternalSyntheticLambda1.onExtraCallbackWithResult++;
                }
                objArr[0] = new String(cArr6);
            }
        };
        int i2 = onWarmupCompleted + 25;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return it;
    }

    public final ExoPlayerImplExternalSyntheticLambda14 IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        ExoPlayerImplExternalSyntheticLambda14<? extends ExoPlayerImplExternalSyntheticLambda12> exoPlayerImplExternalSyntheticLambda14OnExtraCallbackWithResult = this.onExtraCallback.onExtraCallbackWithResult(this);
        int i4 = IAuthTabCallback + 73;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return exoPlayerImplExternalSyntheticLambda14OnExtraCallbackWithResult;
    }

    public final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = (i2 & 31) + (i2 | 31);
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int iOnWarmupCompleted = this.onExtraCallback.onWarmupCompleted(this);
        int i5 = onWarmupCompleted + 107;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return iOnWarmupCompleted;
    }
}
