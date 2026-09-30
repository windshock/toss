package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class q3bi {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public static final /* synthetic */ String onExtraCallback(int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 37;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String strOnNavigationEvent = onNavigationEvent(i);
        int i5 = onExtraCallback + 3;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return strOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final String onNavigationEvent(int i) {
        int i2 = 2 % 2;
        if (i <= 0) {
            return "zero";
        }
        if (i <= 10) {
            return "le_10";
        }
        if (i <= 100) {
            int i3 = onExtraCallback + 85;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return "le_100";
        }
        if (i <= 500) {
            int i5 = onNavigationEvent + 7;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return "le_500";
        }
        int i7 = onNavigationEvent + 81;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return "gt_500";
    }
}
