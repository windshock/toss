package o;

/* loaded from: classes.dex */
public final class ExoPlayerImplExternalSyntheticLambda20 extends ExoPlayerImplExternalSyntheticLambda24<Boolean> {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    private boolean onExtraCallbackWithResult;

    /* synthetic */ ExoPlayerImplExternalSyntheticLambda20(byte[] bArr, boolean z, byte b) {
        this(bArr, z);
    }

    @Override // o.ExoPlayerImplExternalSyntheticLambda12
    public final /* synthetic */ Object onExtraCallback() {
        int i = 2 % 2;
        int iIdentityHashCode = System.identityHashCode(this);
        int i2 = 673693843 - (~((~(((-12617027) & iIdentityHashCode) | (iIdentityHashCode ^ (-12617027)))) * (-301)));
        int i3 = ~((iIdentityHashCode ^ 1791149927) | (iIdentityHashCode & 1791149927));
        int i4 = ~((~iIdentityHashCode) | (-15766867));
        int i5 = -(-(((i3 & i4) | (i3 ^ i4)) * (-301)));
        int i6 = (((i2 | i5) << 1) - (i2 ^ i5)) + (((~((iIdentityHashCode & 15766866) | (iIdentityHashCode ^ 15766866))) | 1791149927) * 301);
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i7 = ~iIdentityHashCode2;
        int i8 = ((i7 & (-1127654983)) | (i7 ^ (-1127654983))) * (-757);
        int i9 = ((((i8 | (-202261006)) << 1) - (i8 ^ (-202261006))) - (~((~(((-295425) & iIdentityHashCode2) | (iIdentityHashCode2 ^ (-295425)))) * 1514))) - 1;
        int i10 = ~iIdentityHashCode2;
        int i11 = ~((i10 & (-545575578)) | (i10 ^ (-545575578)));
        if (i6 > i9 + (((~(iIdentityHashCode2 | (-1127359559))) | (i11 & 545280153) | (i11 ^ 545280153)) * 757)) {
            IAuthTabCallback();
            throw new NullPointerException();
        }
        Boolean boolIAuthTabCallback = IAuthTabCallback();
        System.identityHashCode(this);
        System.identityHashCode(this);
        return boolIAuthTabCallback;
    }

    private ExoPlayerImplExternalSyntheticLambda20(byte[] bArr, boolean z) {
        super(ExoPlayerImplExternalSyntheticLambda14.IAuthTabCallback, bArr);
        this.onExtraCallbackWithResult = z;
    }

    public final Boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = (i2 ^ 77) + ((i2 & 77) << 1);
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Boolean boolValueOf = Boolean.valueOf(this.onExtraCallbackWithResult);
        int i5 = onNavigationEvent + 25;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return boolValueOf;
    }

    public static class onExtraCallback extends ByteArrayDataSourceExternalSyntheticLambda0<ExoPlayerImplExternalSyntheticLambda20> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        @Override // o.ByteArrayDataSourceExternalSyntheticLambda0
        public final /* synthetic */ ExoPlayerImplExternalSyntheticLambda12 onNavigationEvent(ExoPlayerImplExternalSyntheticLambda14 exoPlayerImplExternalSyntheticLambda14, byte[] bArr) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 83;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ExoPlayerImplExternalSyntheticLambda20 exoPlayerImplExternalSyntheticLambda20OnExtraCallback = onExtraCallback(bArr);
            int i4 = onWarmupCompleted + 107;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return exoPlayerImplExternalSyntheticLambda20OnExtraCallback;
        }

        public onExtraCallback(ReorderingBufferQueueBuffersWithTimestamp reorderingBufferQueueBuffersWithTimestamp) {
            super(reorderingBufferQueueBuffersWithTimestamp);
        }

        private static ExoPlayerImplExternalSyntheticLambda20 onExtraCallback(byte[] bArr) {
            byte b = 0;
            ExoPlayerImplExternalSyntheticLambda29.onExtraCallback(bArr.length == 1);
            return new ExoPlayerImplExternalSyntheticLambda20(bArr, bArr[0] != 0, b);
        }
    }
}
