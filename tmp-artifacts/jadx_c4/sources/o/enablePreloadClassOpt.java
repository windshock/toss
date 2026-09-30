package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class enablePreloadClassOpt {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ enablePreloadClassOpt[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    public static final enablePreloadClassOpt KCB = new enablePreloadClassOpt("KCB", 0);
    public static final enablePreloadClassOpt NICE = new enablePreloadClassOpt("NICE", 1);
    public static final enablePreloadClassOpt BOTH = new enablePreloadClassOpt("BOTH", 2);
    public static final enablePreloadClassOpt NO_CHANGE = new enablePreloadClassOpt("NO_CHANGE", 3);

    private static final /* synthetic */ enablePreloadClassOpt[] $values() {
        enablePreloadClassOpt[] enablepreloadclassoptArr;
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            enablePreloadClassOpt enablepreloadclassopt = KCB;
            enablePreloadClassOpt enablepreloadclassopt2 = NICE;
            enablePreloadClassOpt enablepreloadclassopt3 = BOTH;
            enablePreloadClassOpt enablepreloadclassopt4 = NO_CHANGE;
            enablepreloadclassoptArr = new enablePreloadClassOpt[]{enablepreloadclassopt2, enablepreloadclassopt};
            enablepreloadclassoptArr[5] = enablepreloadclassopt3;
            enablepreloadclassoptArr[2] = enablepreloadclassopt4;
        } else {
            enablepreloadclassoptArr = new enablePreloadClassOpt[]{KCB, NICE, BOTH, NO_CHANGE};
        }
        int i4 = i3 + 115;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 10 / 0;
        }
        return enablepreloadclassoptArr;
    }

    public static EnumEntries<enablePreloadClassOpt> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static enablePreloadClassOpt valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        enablePreloadClassOpt enablepreloadclassopt = (enablePreloadClassOpt) Enum.valueOf(enablePreloadClassOpt.class, str);
        int i4 = onExtraCallback + 101;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return enablepreloadclassopt;
    }

    public static enablePreloadClassOpt[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        enablePreloadClassOpt[] enablepreloadclassoptArr = (enablePreloadClassOpt[]) $VALUES.clone();
        int i3 = onWarmupCompleted + 17;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return enablepreloadclassoptArr;
        }
        obj.hashCode();
        throw null;
    }

    private enablePreloadClassOpt(String str, int i) {
    }

    static {
        enablePreloadClassOpt[] enablepreloadclassoptArr$values = $values();
        $VALUES = enablepreloadclassoptArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(enablepreloadclassoptArr$values);
        int i = IAuthTabCallback + 77;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
