package o;

import kotlin.enums.EnumEntries;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface p4 {
    default onNavigationEvent onExtraCallback() {
        int i = 2 % 2;
        return onNavigationEvent.WholeSection;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onNavigationEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        public static final onNavigationEvent Header = new onNavigationEvent("Header", 0);
        public static final onNavigationEvent Row = new onNavigationEvent("Row", 1);
        public static final onNavigationEvent Footer = new onNavigationEvent("Footer", 2);
        public static final onNavigationEvent WholeSection = new onNavigationEvent("WholeSection", 3);

        private static final /* synthetic */ onNavigationEvent[] $values() {
            onNavigationEvent[] onnavigationeventArr;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 67;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 == 0) {
                onNavigationEvent onnavigationevent = Header;
                onNavigationEvent onnavigationevent2 = Row;
                onNavigationEvent onnavigationevent3 = Footer;
                onNavigationEvent onnavigationevent4 = WholeSection;
                onnavigationeventArr = new onNavigationEvent[5];
                onnavigationeventArr[0] = onnavigationevent;
                onnavigationeventArr[0] = onnavigationevent2;
                onnavigationeventArr[4] = onnavigationevent3;
                onnavigationeventArr[2] = onnavigationevent4;
            } else {
                onnavigationeventArr = new onNavigationEvent[]{Header, Row, Footer, WholeSection};
            }
            int i4 = i3 + 83;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return onnavigationeventArr;
            }
            throw null;
        }

        public static EnumEntries<onNavigationEvent> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 89;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return $ENTRIES;
            }
            throw null;
        }

        public static onNavigationEvent valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 117;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
            if (i3 == 0) {
                return onnavigationevent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onNavigationEvent[] values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 79;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent[] onnavigationeventArr = (onNavigationEvent[]) $VALUES.clone();
            int i4 = onNavigationEvent + 69;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return onnavigationeventArr;
        }

        private onNavigationEvent(String str, int i) {
        }

        static {
            onNavigationEvent[] onnavigationeventArr$values = $values();
            $VALUES = onnavigationeventArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
            int i = IAuthTabCallback + 75;
            onWarmupCompleted = i % 128;
            if (i % 2 == 0) {
                int i2 = 75 / 0;
            }
        }
    }
}
