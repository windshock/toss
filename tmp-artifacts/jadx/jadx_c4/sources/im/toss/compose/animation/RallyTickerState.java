package im.toss.compose.animation;

import kotlin.enums.EnumEntries;
import o.access15300;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RallyTickerState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RallyTickerState[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public static final RallyTickerState In = new RallyTickerState("In", 0);
    public static final RallyTickerState Out = new RallyTickerState("Out", 1);
    public static final RallyTickerState None = new RallyTickerState("None", 2);
    public static final RallyTickerState Shown = new RallyTickerState("Shown", 3);

    private static final /* synthetic */ RallyTickerState[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 83;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        RallyTickerState rallyTickerState = In;
        if (i3 != 0) {
            return new RallyTickerState[]{rallyTickerState, Out, None, Shown};
        }
        RallyTickerState rallyTickerState2 = Out;
        RallyTickerState rallyTickerState3 = None;
        RallyTickerState rallyTickerState4 = Shown;
        RallyTickerState[] rallyTickerStateArr = new RallyTickerState[3];
        rallyTickerStateArr[1] = rallyTickerState;
        rallyTickerStateArr[1] = rallyTickerState2;
        rallyTickerStateArr[4] = rallyTickerState3;
        rallyTickerStateArr[3] = rallyTickerState4;
        return rallyTickerStateArr;
    }

    public static EnumEntries<RallyTickerState> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        EnumEntries<RallyTickerState> enumEntries = $ENTRIES;
        int i5 = i3 + 55;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static RallyTickerState valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        RallyTickerState rallyTickerState = (RallyTickerState) Enum.valueOf(RallyTickerState.class, str);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallback + 25;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return rallyTickerState;
        }
        throw null;
    }

    public static RallyTickerState[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        RallyTickerState[] rallyTickerStateArr = (RallyTickerState[]) $VALUES.clone();
        int i4 = onExtraCallback + 57;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return rallyTickerStateArr;
    }

    static {
        RallyTickerState[] rallyTickerStateArr$values = $values();
        $VALUES = rallyTickerStateArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(rallyTickerStateArr$values);
        int i = onNavigationEvent + 63;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            int i2 = 86 / 0;
        }
    }

    private RallyTickerState(String str, int i) {
    }
}
