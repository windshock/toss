package o;

import java.math.BigInteger;

/* loaded from: classes.dex */
public final class ExoPlayerImplExternalSyntheticLambda19 extends ExoPlayerImplExternalSyntheticLambda24<BigInteger> {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final BigInteger onExtraCallback;

    /* synthetic */ ExoPlayerImplExternalSyntheticLambda19(BigInteger bigInteger, byte[] bArr, byte b) {
        this(bigInteger, bArr);
    }

    @Override // o.ExoPlayerImplExternalSyntheticLambda12
    public final /* synthetic */ Object onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        BigInteger bigIntegerIAuthTabCallback = IAuthTabCallback();
        int i4 = onNavigationEvent + 13;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return bigIntegerIAuthTabCallback;
    }

    private ExoPlayerImplExternalSyntheticLambda19(BigInteger bigInteger, byte[] bArr) {
        super(ExoPlayerImplExternalSyntheticLambda14.onExtraCallback, bArr);
        this.onExtraCallback = bigInteger;
    }

    public final BigInteger IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = ((i2 | 57) << 1) - (i2 ^ 57);
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        BigInteger bigInteger = this.onExtraCallback;
        int i5 = i2 + 117;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return bigInteger;
        }
        throw new NullPointerException();
    }

    public static class IAuthTabCallback extends ByteArrayDataSourceExternalSyntheticLambda0<ExoPlayerImplExternalSyntheticLambda19> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        @Override // o.ByteArrayDataSourceExternalSyntheticLambda0
        public final /* synthetic */ ExoPlayerImplExternalSyntheticLambda12 onNavigationEvent(ExoPlayerImplExternalSyntheticLambda14 exoPlayerImplExternalSyntheticLambda14, byte[] bArr) throws ExoPlayerImplExternalSyntheticLambda11 {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = (i2 ^ 33) + ((i2 & 33) << 1);
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19OnExtraCallbackWithResult = onExtraCallbackWithResult(bArr);
            int i5 = onWarmupCompleted;
            int i6 = ((i5 | 37) << 1) - (i5 ^ 37);
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return exoPlayerImplExternalSyntheticLambda19OnExtraCallbackWithResult;
        }

        public IAuthTabCallback(ReorderingBufferQueueBuffersWithTimestamp reorderingBufferQueueBuffersWithTimestamp) {
            super(reorderingBufferQueueBuffersWithTimestamp);
        }

        private static ExoPlayerImplExternalSyntheticLambda19 onExtraCallbackWithResult(byte[] bArr) throws ExoPlayerImplExternalSyntheticLambda11 {
            int i = 2 % 2;
            ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19 = new ExoPlayerImplExternalSyntheticLambda19(new BigInteger(bArr), bArr, (byte) 0);
            int i2 = onWarmupCompleted;
            int i3 = (i2 ^ 87) + ((i2 & 87) << 1);
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return exoPlayerImplExternalSyntheticLambda19;
        }
    }
}
