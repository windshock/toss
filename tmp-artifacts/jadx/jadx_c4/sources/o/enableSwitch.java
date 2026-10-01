package o;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class enableSwitch {
    public static final enableSwitch IAuthTabCallback = new enableSwitch();
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = onNavigationEvent + 85;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private enableSwitch() {
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        if (IAuthTabCallback() % 3 == 1) {
            int i2 = onExtraCallback + 113;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = onExtraCallback + 103;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 11 / 0;
        }
        return false;
    }

    private final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onExtraCallbackWithResult = i2 % 128;
        return ((Number) (i2 % 2 != 0 ? addPolicy.ITrustedWebActivityCallbackDefault().onExtraCallback("KEY_REMINDER_DISPLAY_COUNT", 4) : addPolicy.ITrustedWebActivityCallbackDefault().onExtraCallback("KEY_REMINDER_DISPLAY_COUNT", 3))).intValue();
    }

    public final void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (IAuthTabCallback() >= 0) {
            int i4 = onExtraCallback + 79;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            addPolicy.ITrustedWebActivityCallbackDefault().onExtraCallbackWithResult("KEY_REMINDER_DISPLAY_COUNT", IAuthTabCallback() + 1);
            int i6 = onExtraCallbackWithResult + 59;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public final void onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            addPolicy.ITrustedWebActivityCallbackDefault().onExtraCallbackWithResult("KEY_REMINDER_DISPLAY_COUNT", -1);
            obj.hashCode();
            throw null;
        }
        addPolicy.ITrustedWebActivityCallbackDefault().onExtraCallbackWithResult("KEY_REMINDER_DISPLAY_COUNT", -1);
        int i3 = onExtraCallback + 49;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        addPolicy.ITrustedWebActivityCallbackDefault().onTransact("KEY_REMINDER_DISPLAY_COUNT");
        int i4 = onExtraCallbackWithResult + 59;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
