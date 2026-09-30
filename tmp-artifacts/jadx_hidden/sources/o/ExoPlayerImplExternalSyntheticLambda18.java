package o;

import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ExoPlayerImplExternalSyntheticLambda18 extends ExoPlayerImplExternalSyntheticLambda12<ExoPlayerImplExternalSyntheticLambda12> implements ExoPlayerImplExternalSyntheticLambda15 {
    private static int IAuthTabCallbackStub = 0;
    private static int onTransact = 1;
    public final ExoPlayerImplExternalSyntheticLambda12 IAuthTabCallback;
    public byte[] onExtraCallback;
    public ReorderingBufferQueueBuffersWithTimestamp onExtraCallbackWithResult;
    private boolean onNavigationEvent;

    /* synthetic */ ExoPlayerImplExternalSyntheticLambda18(ExoPlayerImplExternalSyntheticLambda14 exoPlayerImplExternalSyntheticLambda14, byte[] bArr, ReorderingBufferQueueBuffersWithTimestamp reorderingBufferQueueBuffersWithTimestamp, byte b) {
        this(exoPlayerImplExternalSyntheticLambda14, bArr, reorderingBufferQueueBuffersWithTimestamp);
    }

    @Override // o.ExoPlayerImplExternalSyntheticLambda12
    public final /* synthetic */ ExoPlayerImplExternalSyntheticLambda12 onExtraCallback() throws IOException {
        int i = 2 % 2;
        int i2 = onTransact + 43;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        ExoPlayerImplExternalSyntheticLambda12 exoPlayerImplExternalSyntheticLambda12OnNavigationEvent = onNavigationEvent();
        int i4 = onTransact + 101;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return exoPlayerImplExternalSyntheticLambda12OnNavigationEvent;
    }

    private ExoPlayerImplExternalSyntheticLambda18(ExoPlayerImplExternalSyntheticLambda14 exoPlayerImplExternalSyntheticLambda14, byte[] bArr, ReorderingBufferQueueBuffersWithTimestamp reorderingBufferQueueBuffersWithTimestamp) {
        super(exoPlayerImplExternalSyntheticLambda14);
        this.onNavigationEvent = true;
        this.onExtraCallback = bArr;
        this.onExtraCallbackWithResult = reorderingBufferQueueBuffersWithTimestamp;
        this.IAuthTabCallback = null;
    }

    public final ExoPlayerImplExternalSyntheticLambda12 onNavigationEvent() throws IOException {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = (i2 & 27) + (i2 | 27);
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        ExoPlayerImplExternalSyntheticLambda12 exoPlayerImplExternalSyntheticLambda12OnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i5 = onTransact;
        int i6 = (i5 & 75) + (i5 | 75);
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return exoPlayerImplExternalSyntheticLambda12OnExtraCallbackWithResult;
    }

    @Override // java.lang.Iterable
    public final Iterator<ExoPlayerImplExternalSyntheticLambda12> iterator() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = (i2 ^ 1) + ((i2 & 1) << 1);
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        ExoPlayerImplExternalSyntheticLambda16 exoPlayerImplExternalSyntheticLambda16 = (ExoPlayerImplExternalSyntheticLambda16) IAuthTabCallback(ExoPlayerImplExternalSyntheticLambda14.asBinder);
        if (i4 == 0) {
            return exoPlayerImplExternalSyntheticLambda16.iterator();
        }
        exoPlayerImplExternalSyntheticLambda16.iterator();
        throw new NullPointerException();
    }

    public static class onExtraCallback extends ByteArrayDataSourceExternalSyntheticLambda0<ExoPlayerImplExternalSyntheticLambda18> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        @Override // o.ByteArrayDataSourceExternalSyntheticLambda0
        public final /* synthetic */ ExoPlayerImplExternalSyntheticLambda12 onNavigationEvent(ExoPlayerImplExternalSyntheticLambda14 exoPlayerImplExternalSyntheticLambda14, byte[] bArr) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = (i2 ^ 19) + ((i2 & 19) << 1);
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            ExoPlayerImplExternalSyntheticLambda18 exoPlayerImplExternalSyntheticLambda18IAuthTabCallback = IAuthTabCallback(exoPlayerImplExternalSyntheticLambda14, bArr);
            int i5 = onExtraCallbackWithResult + 11;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return exoPlayerImplExternalSyntheticLambda18IAuthTabCallback;
            }
            throw new NullPointerException();
        }

        public onExtraCallback(ReorderingBufferQueueBuffersWithTimestamp reorderingBufferQueueBuffersWithTimestamp) {
            super(reorderingBufferQueueBuffersWithTimestamp);
        }

        private ExoPlayerImplExternalSyntheticLambda18 IAuthTabCallback(ExoPlayerImplExternalSyntheticLambda14<ExoPlayerImplExternalSyntheticLambda18> exoPlayerImplExternalSyntheticLambda14, byte[] bArr) {
            int i = 2 % 2;
            ExoPlayerImplExternalSyntheticLambda18 exoPlayerImplExternalSyntheticLambda18 = new ExoPlayerImplExternalSyntheticLambda18(exoPlayerImplExternalSyntheticLambda14, bArr, this.onExtraCallback, (byte) 0);
            int i2 = onWarmupCompleted;
            int i3 = (i2 ^ 43) + ((i2 & 43) << 1);
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return exoPlayerImplExternalSyntheticLambda18;
            }
            throw new NullPointerException();
        }
    }

    private ExoPlayerImplExternalSyntheticLambda12 onExtraCallbackWithResult() throws IOException {
        int i = 2 % 2;
        ReorderingBufferQueueOutputConsumer reorderingBufferQueueOutputConsumer = new ReorderingBufferQueueOutputConsumer(this.onExtraCallbackWithResult, this.onExtraCallback);
        try {
            try {
                ExoPlayerImplExternalSyntheticLambda12 exoPlayerImplExternalSyntheticLambda12OnWarmupCompleted = reorderingBufferQueueOutputConsumer.onWarmupCompleted();
                int i2 = onTransact;
                int i3 = ((i2 | 67) << 1) - (i2 ^ 67);
                IAuthTabCallbackStub = i3 % 128;
                if (i3 % 2 == 0) {
                    return exoPlayerImplExternalSyntheticLambda12OnWarmupCompleted;
                }
                throw new NullPointerException();
            } catch (Exception e) {
                throw new ExoPlayerImplExternalSyntheticLambda11(e);
            }
        } finally {
            try {
                reorderingBufferQueueOutputConsumer.close();
            } catch (IOException unused) {
            }
        }
    }

    private <T extends ExoPlayerImplExternalSyntheticLambda12> T IAuthTabCallback(ExoPlayerImplExternalSyntheticLambda14<T> exoPlayerImplExternalSyntheticLambda14) {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = (i2 ^ 39) + ((i2 & 39) << 1);
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            if (this.onExtraCallback != null) {
                T t = (T) exoPlayerImplExternalSyntheticLambda14.onExtraCallbackWithResult(this.onExtraCallbackWithResult).onNavigationEvent(exoPlayerImplExternalSyntheticLambda14, this.onExtraCallback);
                int i4 = onTransact;
                int i5 = ((i4 | 95) << 1) - (i4 ^ 95);
                IAuthTabCallbackStub = i5 % 128;
                if (i5 % 2 == 0) {
                    return t;
                }
                throw new NullPointerException();
            }
            throw new ExoPlayerImplExternalSyntheticLambda11();
        }
        throw new NullPointerException();
    }
}
