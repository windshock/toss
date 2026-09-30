package o;

import java.math.BigInteger;

/* loaded from: classes.dex */
public final class onPlaybackInfoUpdate extends ExoPlayerImplExternalSyntheticLambda24<BigInteger> {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private BigInteger onExtraCallback;

    /* synthetic */ onPlaybackInfoUpdate(byte[] bArr, BigInteger bigInteger, byte b) {
        this(bArr, bigInteger);
    }

    @Override // o.ExoPlayerImplExternalSyntheticLambda12
    public final /* synthetic */ Object onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = (i2 & 21) + (i2 | 21);
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return onExtraCallbackWithResult();
        }
        onExtraCallbackWithResult();
        throw new NullPointerException();
    }

    private onPlaybackInfoUpdate(byte[] bArr, BigInteger bigInteger) {
        super(ExoPlayerImplExternalSyntheticLambda14.onNavigationEvent, bArr);
        this.onExtraCallback = bigInteger;
    }

    public final BigInteger onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        BigInteger bigInteger = this.onExtraCallback;
        int i5 = i3 + 47;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return bigInteger;
    }

    public static class onWarmupCompleted extends ByteArrayDataSourceExternalSyntheticLambda0<onPlaybackInfoUpdate> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        @Override // o.ByteArrayDataSourceExternalSyntheticLambda0
        public final /* synthetic */ ExoPlayerImplExternalSyntheticLambda12 onNavigationEvent(ExoPlayerImplExternalSyntheticLambda14 exoPlayerImplExternalSyntheticLambda14, byte[] bArr) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 37;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return onNavigationEvent(bArr);
            }
            onNavigationEvent(bArr);
            throw new ArithmeticException();
        }

        public onWarmupCompleted(ReorderingBufferQueueBuffersWithTimestamp reorderingBufferQueueBuffersWithTimestamp) {
            super(reorderingBufferQueueBuffersWithTimestamp);
        }

        private static onPlaybackInfoUpdate onNavigationEvent(byte[] bArr) {
            int i = 2 % 2;
            onPlaybackInfoUpdate onplaybackinfoupdate = new onPlaybackInfoUpdate(bArr, new BigInteger(bArr), (byte) 0);
            int i2 = onNavigationEvent + 85;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onplaybackinfoupdate;
        }
    }
}
