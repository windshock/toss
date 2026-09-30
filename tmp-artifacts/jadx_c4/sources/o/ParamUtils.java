package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ParamUtils {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ParamUtils[] $VALUES;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final long delay;
    public static final ParamUtils EPSILON = new ParamUtils("EPSILON", 0, 500);
    public static final ParamUtils SHORT = new ParamUtils("SHORT", 1, 1000);
    public static final ParamUtils NORMAL = new ParamUtils("NORMAL", 2, 1500);
    public static final ParamUtils LONG = new ParamUtils("LONG", 3, 2000);

    private static final /* synthetic */ ParamUtils[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return new ParamUtils[]{EPSILON, SHORT, NORMAL, LONG};
        }
        ParamUtils paramUtils = EPSILON;
        ParamUtils paramUtils2 = SHORT;
        ParamUtils paramUtils3 = NORMAL;
        ParamUtils paramUtils4 = LONG;
        ParamUtils[] paramUtilsArr = new ParamUtils[4];
        paramUtilsArr[1] = paramUtils;
        paramUtilsArr[1] = paramUtils2;
        paramUtilsArr[2] = paramUtils3;
        paramUtilsArr[5] = paramUtils4;
        return paramUtilsArr;
    }

    public static EnumEntries<ParamUtils> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        EnumEntries<ParamUtils> enumEntries = $ENTRIES;
        int i5 = i3 + 43;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return enumEntries;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ParamUtils valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ParamUtils paramUtils = (ParamUtils) Enum.valueOf(ParamUtils.class, str);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallback + 95;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return paramUtils;
    }

    public static ParamUtils[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        ParamUtils[] paramUtilsArr = (ParamUtils[]) $VALUES.clone();
        int i3 = onWarmupCompleted + 111;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return paramUtilsArr;
        }
        obj.hashCode();
        throw null;
    }

    private ParamUtils(String str, int i, long j) {
        this.delay = j;
    }

    public final long getDelay() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        long j = this.delay;
        int i5 = i3 + 65;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 76 / 0;
        }
        return j;
    }

    static {
        ParamUtils[] paramUtilsArr$values = $values();
        $VALUES = paramUtilsArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(paramUtilsArr$values);
        int i = onNavigationEvent + 5;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }
}
