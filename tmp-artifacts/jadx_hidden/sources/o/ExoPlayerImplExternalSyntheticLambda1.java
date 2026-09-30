package o;

/* loaded from: classes.dex */
public final class ExoPlayerImplExternalSyntheticLambda1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public static int onExtraCallbackWithResult(byte b) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = (i2 ^ 31) + ((i2 & 31) << 1);
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        int i6 = b & 192;
        if (i6 == 0) {
            int i7 = i2 + 41;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 == 0) {
                return 1;
            }
            throw new NullPointerException();
        }
        if (i6 == 64) {
            return 2;
        }
        if (i6 == 128) {
            int i8 = (i4 & 71) + (i4 | 71);
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            return 3;
        }
        if (i6 != 192) {
            throw new IllegalStateException();
        }
        int i10 = (i4 ^ 65) + ((i4 & 65) << 1);
        onWarmupCompleted = i10 % 128;
        if (i10 % 2 != 0) {
            return 4;
        }
        throw new ArithmeticException();
    }
}
