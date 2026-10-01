package o;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class StartMotionInteraction {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    public static /* synthetic */ int onWarmupCompleted(int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback;
        int i6 = i5 + 55;
        onExtraCallback = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (i >= 0 && i <= i2) {
            int i7 = i5 + 53;
            int i8 = i7 % 128;
            onExtraCallback = i8;
            int i9 = i7 % 2;
            if (i2 <= i3) {
                int i10 = i8 + 95;
                IAuthTabCallback = i10 % 128;
                if (i10 % 2 != 0) {
                    return i;
                }
                obj.hashCode();
                throw null;
            }
        }
        throw new IndexOutOfBoundsException("Range [" + i + ", " + i2 + ") out of bounds for length " + i3);
    }
}
