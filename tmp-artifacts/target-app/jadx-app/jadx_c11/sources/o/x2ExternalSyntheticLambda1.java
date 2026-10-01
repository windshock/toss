package o;

import kotlin.enums.EnumEntries;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class x2ExternalSyntheticLambda1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public static final x2ExternalSyntheticLambda1 onWarmupCompleted = new x2ExternalSyntheticLambda1();

    static {
        int i = IAuthTabCallback + 15;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private x2ExternalSyntheticLambda1() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onNavigationEvent implements onPostbackSuccess {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private static int onNavigationEvent;
        public static final onNavigationEvent Figure = new onNavigationEvent("Figure", 0);
        public static final onNavigationEvent Title = new onNavigationEvent("Title", 1);
        public static final onNavigationEvent Subtitle = new onNavigationEvent("Subtitle", 2);
        public static final onNavigationEvent Button = new onNavigationEvent("Button", 3);

        private static final /* synthetic */ onNavigationEvent[] $values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 3;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            onNavigationEvent[] onnavigationeventArr = {Figure, Title, Subtitle, Button};
            int i5 = i3 + 67;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return onnavigationeventArr;
        }

        public static EnumEntries<onNavigationEvent> getEntries() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 9;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            EnumEntries<onNavigationEvent> enumEntries = $ENTRIES;
            int i4 = i3 + 49;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 39 / 0;
            }
            return enumEntries;
        }

        public static onNavigationEvent valueOf(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 113;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
            int i4 = IAuthTabCallback + 99;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return onnavigationevent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onNavigationEvent[] values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 19;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent[] onnavigationeventArr = (onNavigationEvent[]) $VALUES.clone();
            int i4 = onNavigationEvent + 55;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return onnavigationeventArr;
        }

        private onNavigationEvent(String str, int i) {
        }

        static {
            onNavigationEvent[] onnavigationeventArr$values = $values();
            $VALUES = onnavigationeventArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
            int i = onExtraCallbackWithResult + 23;
            onExtraCallback = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
