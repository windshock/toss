package o;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class uploadAndStop {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public static final uploadAndStop onWarmupCompleted = new uploadAndStop();

    static {
        int i = onNavigationEvent + 79;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private uploadAndStop() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onNavigationEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        public static final C0033onNavigationEvent Companion;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private final String param;
        public static final onNavigationEvent HIGH = new onNavigationEvent("HIGH", 0, "high");
        public static final onNavigationEvent MID = new onNavigationEvent("MID", 1, "mid");
        public static final onNavigationEvent LOW = new onNavigationEvent("LOW", 2, "low");
        public static final onNavigationEvent EXTREMELY_LOW = new onNavigationEvent("EXTREMELY_LOW", 3, "extremely_low");

        private static final /* synthetic */ onNavigationEvent[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 77;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            onNavigationEvent[] onnavigationeventArr = {HIGH, MID, LOW, EXTREMELY_LOW};
            int i5 = i3 + 95;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return onnavigationeventArr;
            }
            throw null;
        }

        public static EnumEntries<onNavigationEvent> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 79;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            EnumEntries<onNavigationEvent> enumEntries = $ENTRIES;
            int i4 = i3 + 101;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return enumEntries;
        }

        public static onNavigationEvent valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 89;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
            if (i3 != 0) {
                return onnavigationevent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onNavigationEvent[] values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 93;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent[] onnavigationeventArr = (onNavigationEvent[]) $VALUES.clone();
            int i4 = onExtraCallback + 53;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return onnavigationeventArr;
        }

        private onNavigationEvent(String str, int i, String str2) {
            this.param = str2;
        }

        public final String getParam() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 7;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            String str = this.param;
            int i4 = i3 + 93;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return str;
            }
            throw null;
        }

        static {
            onNavigationEvent[] onnavigationeventArr$values = $values();
            $VALUES = onnavigationeventArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
            Companion = new C0033onNavigationEvent(null);
            int i = onExtraCallbackWithResult + 43;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        /* renamed from: o.uploadAndStop$onNavigationEvent$onNavigationEvent, reason: collision with other inner class name */
        public static final class C0033onNavigationEvent {
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public /* synthetic */ C0033onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0033onNavigationEvent() {
            }

            public final onNavigationEvent IAuthTabCallback(int i) {
                int i2 = 2 % 2;
                if (i > 0) {
                    int i3 = onExtraCallback;
                    int i4 = i3 + 9;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    if (i < 4) {
                        int i6 = i3 + 93;
                        onNavigationEvent = i6 % 128;
                        if (i6 % 2 == 0) {
                            return onNavigationEvent.HIGH;
                        }
                        onNavigationEvent onnavigationevent = onNavigationEvent.HIGH;
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                }
                if (4 <= i) {
                    int i7 = onNavigationEvent + 55;
                    int i8 = i7 % 128;
                    onExtraCallback = i8;
                    int i9 = i7 % 2;
                    if (i < 6) {
                        int i10 = i8 + 1;
                        onNavigationEvent = i10 % 128;
                        int i11 = i10 % 2;
                        return onNavigationEvent.MID;
                    }
                }
                if (6 <= i) {
                    int i12 = onNavigationEvent + 97;
                    onExtraCallback = i12 % 128;
                    if (i12 % 2 != 0 ? i < 8 : i < 47) {
                        return onNavigationEvent.LOW;
                    }
                }
                return onNavigationEvent.EXTREMELY_LOW;
            }
        }
    }
}
