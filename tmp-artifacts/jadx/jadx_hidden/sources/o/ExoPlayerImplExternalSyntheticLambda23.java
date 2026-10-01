package o;

/* loaded from: classes.dex */
public final class ExoPlayerImplExternalSyntheticLambda23 extends ExoPlayerImplExternalSyntheticLambda24<Void> {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static final byte[] onExtraCallback = new byte[0];
    private static int IAuthTabCallbackDefault = 63 % 128;

    @Override // o.ExoPlayerImplExternalSyntheticLambda12
    public final /* synthetic */ Object onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            throw new ArithmeticException();
        }
        int i4 = i3 + 75;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    static {
        if (63 % 2 == 0) {
            throw new NullPointerException();
        }
    }

    public ExoPlayerImplExternalSyntheticLambda23() {
        super(ExoPlayerImplExternalSyntheticLambda14.onWarmupCompleted, onExtraCallback);
    }

    public static class onWarmupCompleted extends ByteArrayDataSourceExternalSyntheticLambda0<ExoPlayerImplExternalSyntheticLambda23> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        @Override // o.ByteArrayDataSourceExternalSyntheticLambda0
        public final /* synthetic */ ExoPlayerImplExternalSyntheticLambda12 onNavigationEvent(ExoPlayerImplExternalSyntheticLambda14 exoPlayerImplExternalSyntheticLambda14, byte[] bArr) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 55;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return onNavigationEvent(bArr);
            }
            onNavigationEvent(bArr);
            throw new ArithmeticException();
        }

        public onWarmupCompleted(ReorderingBufferQueueBuffersWithTimestamp reorderingBufferQueueBuffersWithTimestamp) {
            super(reorderingBufferQueueBuffersWithTimestamp);
        }

        private static ExoPlayerImplExternalSyntheticLambda23 onNavigationEvent(byte[] bArr) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            boolean z = true;
            int i3 = (i2 ^ 117) + ((i2 & 117) << 1);
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            if (i3 % 2 == 0) {
                if (bArr.length == 0) {
                    int i5 = (i4 ^ 75) + ((i4 & 75) << 1);
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 4 % 3;
                    }
                } else {
                    int i7 = ((i4 | 61) << 1) - (i4 ^ 61);
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    z = false;
                }
                ExoPlayerImplExternalSyntheticLambda29.onExtraCallback(z);
                return new ExoPlayerImplExternalSyntheticLambda23();
            }
            int length = bArr.length;
            throw new NullPointerException();
        }
    }
}
