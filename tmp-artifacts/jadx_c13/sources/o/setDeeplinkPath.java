package o;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setDeeplinkPath {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ setDeeplinkPath[] $VALUES;
    public static final onExtraCallbackWithResult Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final int index;
    public static final setDeeplinkPath LEFT = new setDeeplinkPath("LEFT", 0, 0);
    public static final setDeeplinkPath RIGHT = new setDeeplinkPath("RIGHT", 1, 2);
    public static final setDeeplinkPath TOP = new setDeeplinkPath("TOP", 2, 1);
    public static final setDeeplinkPath BOTTOM = new setDeeplinkPath("BOTTOM", 3, 3);

    private static final /* synthetic */ setDeeplinkPath[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        setDeeplinkPath[] setdeeplinkpathArr = {LEFT, RIGHT, TOP, BOTTOM};
        int i5 = i3 + 75;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 97 / 0;
        }
        return setdeeplinkpathArr;
    }

    public static EnumEntries<setDeeplinkPath> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 89;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        EnumEntries<setDeeplinkPath> enumEntries = $ENTRIES;
        int i4 = i2 + 119;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return enumEntries;
    }

    public static setDeeplinkPath valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        setDeeplinkPath setdeeplinkpath = (setDeeplinkPath) Enum.valueOf(setDeeplinkPath.class, str);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onNavigationEvent + 57;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return setdeeplinkpath;
    }

    public static setDeeplinkPath[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        setDeeplinkPath[] setdeeplinkpathArr = (setDeeplinkPath[]) $VALUES.clone();
        int i4 = onNavigationEvent + 101;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return setdeeplinkpathArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private setDeeplinkPath(String str, int i, int i2) {
        this.index = i2;
    }

    public final int getIndex() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.index;
        if (i3 != 0) {
            int i5 = 97 / 0;
        }
        return i4;
    }

    static {
        setDeeplinkPath[] setdeeplinkpathArr$values = $values();
        $VALUES = setdeeplinkpathArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(setdeeplinkpathArr$values);
        Companion = new onExtraCallbackWithResult(null);
        int i = IAuthTabCallback + 37;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            int i2 = 37 / 0;
        }
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }
}
