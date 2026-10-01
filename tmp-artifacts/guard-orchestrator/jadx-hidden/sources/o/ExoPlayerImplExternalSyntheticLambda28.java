package o;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class ExoPlayerImplExternalSyntheticLambda28 extends onSelectedOutputSuitabilityChanged<byte[]> {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    @Override // o.ExoPlayerImplExternalSyntheticLambda12
    public final /* synthetic */ Object onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        byte[] bArrOnNavigationEvent = onNavigationEvent();
        int i4 = onExtraCallbackWithResult + 111;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return bArrOnNavigationEvent;
        }
        throw new NullPointerException();
    }

    public ExoPlayerImplExternalSyntheticLambda28(ExoPlayerImplExternalSyntheticLambda14<?> exoPlayerImplExternalSyntheticLambda14, byte[] bArr) {
        super(exoPlayerImplExternalSyntheticLambda14, bArr);
    }

    public final byte[] onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = ((i2 | 11) << 1) - (i2 ^ 11);
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArrCopyOf = Arrays.copyOf(this.onExtraCallback, this.onExtraCallback.length);
        int i5 = IAuthTabCallback;
        int i6 = (i5 ^ 57) + ((i5 & 57) << 1);
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return bArrCopyOf;
        }
        throw new NullPointerException();
    }

    public static class IAuthTabCallback extends ByteArrayDataSourceExternalSyntheticLambda0<ExoPlayerImplExternalSyntheticLambda28> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        @Override // o.ByteArrayDataSourceExternalSyntheticLambda0
        public final /* synthetic */ ExoPlayerImplExternalSyntheticLambda12 onNavigationEvent(ExoPlayerImplExternalSyntheticLambda14 exoPlayerImplExternalSyntheticLambda14, byte[] bArr) throws ExoPlayerImplExternalSyntheticLambda11 {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 119;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            ExoPlayerImplExternalSyntheticLambda28 exoPlayerImplExternalSyntheticLambda28IAuthTabCallback = IAuthTabCallback(exoPlayerImplExternalSyntheticLambda14, bArr);
            int i4 = IAuthTabCallback + 37;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return exoPlayerImplExternalSyntheticLambda28IAuthTabCallback;
        }

        public IAuthTabCallback(ReorderingBufferQueueBuffersWithTimestamp reorderingBufferQueueBuffersWithTimestamp) {
            super(reorderingBufferQueueBuffersWithTimestamp);
        }

        private static ExoPlayerImplExternalSyntheticLambda28 IAuthTabCallback(ExoPlayerImplExternalSyntheticLambda14<ExoPlayerImplExternalSyntheticLambda28> exoPlayerImplExternalSyntheticLambda14, byte[] bArr) throws ExoPlayerImplExternalSyntheticLambda11 {
            int i = 2 % 2;
            ExoPlayerImplExternalSyntheticLambda28 exoPlayerImplExternalSyntheticLambda28 = new ExoPlayerImplExternalSyntheticLambda28(exoPlayerImplExternalSyntheticLambda14, bArr);
            int i2 = IAuthTabCallback;
            int i3 = (i2 ^ 75) + ((i2 & 75) << 1);
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                return exoPlayerImplExternalSyntheticLambda28;
            }
            throw new ArithmeticException();
        }
    }
}
