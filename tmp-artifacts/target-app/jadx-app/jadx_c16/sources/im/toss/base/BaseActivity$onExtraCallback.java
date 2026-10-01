package im.toss.base;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseActivity$onExtraCallback {
    private static int onExtraCallback = 1;
    public static final /* synthetic */ int[] onExtraCallbackWithResult;
    private static int onWarmupCompleted;

    static {
        int[] iArr = new int[BaseActivity$onNavigationEvent.values().length];
        try {
            iArr[BaseActivity$onNavigationEvent.FINISH_CURRENT_WITH_BACKSTACK_THEN_REDIRECT.ordinal()] = 1;
            int i = onExtraCallback + 1;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BaseActivity$onNavigationEvent.LAZY_REDIRECT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BaseActivity$onNavigationEvent.NO_REDIRECT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        onExtraCallbackWithResult = iArr;
        int i4 = onExtraCallback + 77;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
