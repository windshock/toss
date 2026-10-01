package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ryzbycx {
    private static final sz1 onExtraCallback;

    static class onNavigationEvent extends sz1 {
        public onNavigationEvent() {
            super("DClass", 2);
            onWarmupCompleted("CLASS");
        }

        @Override // o.sz1
        public void onExtraCallbackWithResult(int i) {
            ryzbycx.IAuthTabCallback(i);
        }
    }

    static {
        onNavigationEvent onnavigationevent = new onNavigationEvent();
        onExtraCallback = onnavigationevent;
        onnavigationevent.IAuthTabCallback(1, "IN");
        onnavigationevent.IAuthTabCallback(3, "CH");
        onnavigationevent.onExtraCallback(3, "CHAOS");
        onnavigationevent.IAuthTabCallback(4, "HS");
        onnavigationevent.onExtraCallback(4, "HESIOD");
        onnavigationevent.IAuthTabCallback(254, "NONE");
        onnavigationevent.IAuthTabCallback(255, "ANY");
    }

    public static void IAuthTabCallback(int i) {
        if (i < 0 || i > 65535) {
            throw new DeviceUtilsycx(i);
        }
    }

    public static String onWarmupCompleted(int i) {
        return onExtraCallback.IAuthTabCallback(i);
    }
}
