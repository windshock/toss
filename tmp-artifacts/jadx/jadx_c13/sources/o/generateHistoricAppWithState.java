package o;

import kotlin.enums.EnumEntries;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class generateHistoricAppWithState {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private int onExtraCallbackWithResult;
    private onNavigationEvent onNavigationEvent = onNavigationEvent.NONE;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onNavigationEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;
        public static final onNavigationEvent NONE = new onNavigationEvent("NONE", 0);
        public static final onNavigationEvent APPLYING_EDGE_TO_EDGE = new onNavigationEvent("APPLYING_EDGE_TO_EDGE", 1);
        public static final onNavigationEvent RESTORING_DECOR_FITS = new onNavigationEvent("RESTORING_DECOR_FITS", 2);

        private static final /* synthetic */ onNavigationEvent[] $values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 51;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            onNavigationEvent[] onnavigationeventArr = {NONE, APPLYING_EDGE_TO_EDGE, RESTORING_DECOR_FITS};
            int i5 = i3 + 109;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 12 / 0;
            }
            return onnavigationeventArr;
        }

        public static EnumEntries<onNavigationEvent> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 75;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            EnumEntries<onNavigationEvent> enumEntries = $ENTRIES;
            int i5 = i3 + 95;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static onNavigationEvent valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 115;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
            int i4 = onWarmupCompleted + 77;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return onnavigationevent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onNavigationEvent[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 33;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent[] onnavigationeventArr = (onNavigationEvent[]) $VALUES.clone();
            int i4 = onWarmupCompleted + 7;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return onnavigationeventArr;
            }
            throw null;
        }

        private onNavigationEvent(String str, int i) {
        }

        static {
            onNavigationEvent[] onnavigationeventArr$values = $values();
            $VALUES = onnavigationeventArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
            int i = onNavigationEvent + 83;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        if (this.onNavigationEvent == onNavigationEvent.RESTORING_DECOR_FITS) {
            int i2 = onWarmupCompleted + 101;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = onWarmupCompleted + 55;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 89 / 0;
        }
        return false;
    }

    public final int onExtraCallbackWithResult() {
        int iOnExtraCallback;
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            iOnExtraCallback = onExtraCallback(onNavigationEvent.APPLYING_EDGE_TO_EDGE);
            int i3 = 67 / 0;
        } else {
            iOnExtraCallback = onExtraCallback(onNavigationEvent.APPLYING_EDGE_TO_EDGE);
        }
        int i4 = onExtraCallback + 125;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iOnExtraCallback;
    }

    public final int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = onExtraCallback(onNavigationEvent.RESTORING_DECOR_FITS);
        int i4 = onExtraCallback + 49;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iOnExtraCallback;
    }

    public final void onExtraCallback(int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 5;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            if (i == this.onExtraCallbackWithResult) {
                int i5 = i3 + 109;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                this.onNavigationEvent = onNavigationEvent.NONE;
                if (i6 != 0) {
                    int i7 = 81 / 0;
                    return;
                }
                return;
            }
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final int onExtraCallback(onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2 != 0 ? this.onExtraCallbackWithResult : this.onExtraCallbackWithResult + 1;
        this.onExtraCallbackWithResult = i3;
        this.onNavigationEvent = onnavigationevent;
        return i3;
    }
}
