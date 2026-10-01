package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class isAnimating {
    public static int onExtraCallbackWithResult(int i2) {
        switch (i2) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public static int IAuthTabCallback(int i2) {
        int i3 = (i2 + 360) % 360;
        if (i3 == 0) {
            return 1;
        }
        if (i3 == 90) {
            return 6;
        }
        if (i3 == 180) {
            return 3;
        }
        if (i3 == 270) {
            return 8;
        }
        throw new IllegalArgumentException("Invalid orientation: " + i2);
    }
}
