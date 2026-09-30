package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class httpOnly {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public static final /* synthetic */ long onNavigationEvent(long j) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        long jOnExtraCallbackWithResult = onExtraCallbackWithResult(j);
        int i4 = onExtraCallbackWithResult + 87;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return jOnExtraCallbackWithResult;
    }

    private static final int IAuthTabCallback(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 115;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        int i6 = ((i + 3) / 4) << 2;
        int i7 = i4 + 51;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    private static final long onExtraCallbackWithResult(long j) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        long jOnWarmupCompleted = ExtensionsManager1.onWarmupCompleted((IAuthTabCallback((int) j) & 4294967295L) | (IAuthTabCallback((int) (j >> 32)) << 32));
        int i4 = onExtraCallback + 57;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return jOnWarmupCompleted;
        }
        throw null;
    }
}
