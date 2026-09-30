package o;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ExoPlayerImplExternalSyntheticLambda22 extends onSelectedOutputSuitabilityChanged<boolean[]> {
    private static int asInterface = 1;
    private static int onNavigationEvent;
    private boolean[] IAuthTabCallback;
    private int onExtraCallbackWithResult;

    /* synthetic */ ExoPlayerImplExternalSyntheticLambda22(ExoPlayerImplExternalSyntheticLambda14 exoPlayerImplExternalSyntheticLambda14, byte[] bArr, int i, byte b) {
        this(exoPlayerImplExternalSyntheticLambda14, bArr, i);
    }

    @Override // o.ExoPlayerImplExternalSyntheticLambda12
    public final /* synthetic */ Object onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        boolean[] zArrOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = onNavigationEvent;
        int i5 = (i4 ^ 45) + ((i4 & 45) << 1);
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return zArrOnExtraCallbackWithResult;
    }

    private ExoPlayerImplExternalSyntheticLambda22(ExoPlayerImplExternalSyntheticLambda14<ExoPlayerImplExternalSyntheticLambda22> exoPlayerImplExternalSyntheticLambda14, byte[] bArr, int i) {
        super(exoPlayerImplExternalSyntheticLambda14, bArr);
        this.onExtraCallbackWithResult = i;
        this.IAuthTabCallback = IAuthTabCallback();
    }

    private boolean[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = onNavigationEvent();
        boolean[] zArr = new boolean[iOnNavigationEvent];
        int i4 = 0;
        while (i4 < iOnNavigationEvent) {
            int i5 = asInterface;
            int i6 = (i5 & 83) + (i5 | 83);
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            zArr[i4] = onExtraCallbackWithResult(i4);
            int i8 = (i4 ^ (-82)) + ((i4 & (-82)) << 1);
            i4 = (i8 ^ 83) + ((i8 & 83) << 1);
            int i9 = onNavigationEvent;
            int i10 = (i9 ^ 77) + ((i9 & 77) << 1);
            asInterface = i10 % 128;
            int i11 = i10 % 2;
        }
        int i12 = onNavigationEvent;
        int i13 = (i12 ^ 43) + ((i12 & 43) << 1);
        asInterface = i13 % 128;
        if (i13 % 2 != 0) {
            return zArr;
        }
        throw new NullPointerException();
    }

    private boolean[] onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 29;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean[] zArr = this.IAuthTabCallback;
        if (i3 == 0) {
            return Arrays.copyOf(zArr, zArr.length);
        }
        Arrays.copyOf(zArr, zArr.length);
        throw new NullPointerException();
    }

    private boolean onExtraCallbackWithResult(int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = (i3 ^ 55) + ((i3 & 55) << 1);
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            byte b = this.onExtraCallback[i << 69];
            int i5 = i / 118;
        } else {
            byte b2 = this.onExtraCallback[i / 8];
            int i6 = -(i % 8);
            if (((1 << (((i6 | 7) << 1) - (i6 ^ 7))) & b2) != 0) {
                int i7 = onNavigationEvent;
                int i8 = i7 + 29;
                asInterface = i8 % 128;
                int i9 = i8 % 2;
                int i10 = ((i7 | 3) << 1) - (i7 ^ 3);
                asInterface = i10 % 128;
                if (i10 % 2 != 0) {
                    return true;
                }
                throw new NullPointerException();
            }
        }
        int i11 = asInterface + 87;
        onNavigationEvent = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    private int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = (i2 & 5) + (i2 | 5);
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        int length = (this.onExtraCallback.length << 3) - this.onExtraCallbackWithResult;
        int i5 = asInterface + 41;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return length;
    }

    public static class onExtraCallbackWithResult extends ByteArrayDataSourceExternalSyntheticLambda0<ExoPlayerImplExternalSyntheticLambda22> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        @Override // o.ByteArrayDataSourceExternalSyntheticLambda0
        public final /* synthetic */ ExoPlayerImplExternalSyntheticLambda12 onNavigationEvent(ExoPlayerImplExternalSyntheticLambda14 exoPlayerImplExternalSyntheticLambda14, byte[] bArr) throws IOException {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 33;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onWarmupCompleted(exoPlayerImplExternalSyntheticLambda14, bArr);
            }
            onWarmupCompleted(exoPlayerImplExternalSyntheticLambda14, bArr);
            throw new ArithmeticException();
        }

        public onExtraCallbackWithResult(ReorderingBufferQueueBuffersWithTimestamp reorderingBufferQueueBuffersWithTimestamp) {
            super(reorderingBufferQueueBuffersWithTimestamp);
        }

        private ExoPlayerImplExternalSyntheticLambda22 onWarmupCompleted(ExoPlayerImplExternalSyntheticLambda14<ExoPlayerImplExternalSyntheticLambda22> exoPlayerImplExternalSyntheticLambda14, byte[] bArr) throws IOException {
            boolean z;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 7;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            byte b = 0;
            if (!exoPlayerImplExternalSyntheticLambda14.IAuthTabCallback()) {
                ExoPlayerImplExternalSyntheticLambda22 exoPlayerImplExternalSyntheticLambda22 = new ExoPlayerImplExternalSyntheticLambda22(exoPlayerImplExternalSyntheticLambda14, Arrays.copyOfRange(bArr, 1, bArr.length), bArr[0], b);
                int i4 = IAuthTabCallback + 61;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return exoPlayerImplExternalSyntheticLambda22;
            }
            ReorderingBufferQueueOutputConsumer reorderingBufferQueueOutputConsumer = new ReorderingBufferQueueOutputConsumer(this.onExtraCallback, bArr);
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    int i6 = onExtraCallbackWithResult + 75;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    byte b2 = 0;
                    while (reorderingBufferQueueOutputConsumer.available() > 0) {
                        int i8 = onExtraCallbackWithResult + 65;
                        IAuthTabCallback = i8 % 128;
                        int i9 = i8 % 2;
                        if (reorderingBufferQueueOutputConsumer.IAuthTabCallback().onNavigationEvent() == exoPlayerImplExternalSyntheticLambda14.onNavigationEvent()) {
                            int i10 = IAuthTabCallback;
                            int i11 = (i10 ^ 103) + ((i10 & 103) << 1);
                            onExtraCallbackWithResult = i11 % 128;
                            int i12 = i11 % 2;
                            z = true;
                        } else {
                            z = false;
                        }
                        ExoPlayerImplExternalSyntheticLambda29.onExtraCallback(z);
                        byte[] bArrOnExtraCallbackWithResult = reorderingBufferQueueOutputConsumer.onExtraCallbackWithResult(reorderingBufferQueueOutputConsumer.onExtraCallback());
                        byteArrayOutputStream.write(bArrOnExtraCallbackWithResult, 1, bArrOnExtraCallbackWithResult.length - 1);
                        if (reorderingBufferQueueOutputConsumer.available() <= 0) {
                            int i13 = onExtraCallbackWithResult;
                            int i14 = (i13 & 17) + (i13 | 17);
                            IAuthTabCallback = i14 % 128;
                            int i15 = i14 % 2;
                            b2 = bArrOnExtraCallbackWithResult[0];
                        }
                    }
                    return new ExoPlayerImplExternalSyntheticLambda22(exoPlayerImplExternalSyntheticLambda14, byteArrayOutputStream.toByteArray(), b2, b);
                } catch (IOException e) {
                    throw new ExoPlayerImplExternalSyntheticLambda11(e);
                }
            } finally {
                try {
                    reorderingBufferQueueOutputConsumer.close();
                } catch (IOException unused) {
                }
            }
        }
    }
}
