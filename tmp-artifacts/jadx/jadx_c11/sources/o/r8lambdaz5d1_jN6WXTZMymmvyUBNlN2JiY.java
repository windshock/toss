package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaz5d1_jN6WXTZMymmvyUBNlN2JiY {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r8lambdaz5d1_jN6WXTZMymmvyUBNlN2JiY[] $VALUES;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    public static final r8lambdaz5d1_jN6WXTZMymmvyUBNlN2JiY View = new r8lambdaz5d1_jN6WXTZMymmvyUBNlN2JiY("View", 0);
    public static final r8lambdaz5d1_jN6WXTZMymmvyUBNlN2JiY Impression = new r8lambdaz5d1_jN6WXTZMymmvyUBNlN2JiY("Impression", 1);
    public static final r8lambdaz5d1_jN6WXTZMymmvyUBNlN2JiY Event = new r8lambdaz5d1_jN6WXTZMymmvyUBNlN2JiY("Event", 2);
    public static final r8lambdaz5d1_jN6WXTZMymmvyUBNlN2JiY Analytics = new r8lambdaz5d1_jN6WXTZMymmvyUBNlN2JiY("Analytics", 3);

    private static final /* synthetic */ r8lambdaz5d1_jN6WXTZMymmvyUBNlN2JiY[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaz5d1_jN6WXTZMymmvyUBNlN2JiY r8lambdaz5d1_jn6wxtzmymmvyubnln2jiy = View;
        if (i3 != 0) {
            return new r8lambdaz5d1_jN6WXTZMymmvyUBNlN2JiY[]{r8lambdaz5d1_jn6wxtzmymmvyubnln2jiy, Impression, Event, Analytics};
        }
        r8lambdaz5d1_jN6WXTZMymmvyUBNlN2JiY r8lambdaz5d1_jn6wxtzmymmvyubnln2jiy2 = Impression;
        r8lambdaz5d1_jN6WXTZMymmvyUBNlN2JiY r8lambdaz5d1_jn6wxtzmymmvyubnln2jiy3 = Event;
        r8lambdaz5d1_jN6WXTZMymmvyUBNlN2JiY r8lambdaz5d1_jn6wxtzmymmvyubnln2jiy4 = Analytics;
        r8lambdaz5d1_jN6WXTZMymmvyUBNlN2JiY[] r8lambdaz5d1_jn6wxtzmymmvyubnln2jiyArr = new r8lambdaz5d1_jN6WXTZMymmvyUBNlN2JiY[3];
        r8lambdaz5d1_jn6wxtzmymmvyubnln2jiyArr[1] = r8lambdaz5d1_jn6wxtzmymmvyubnln2jiy;
        r8lambdaz5d1_jn6wxtzmymmvyubnln2jiyArr[1] = r8lambdaz5d1_jn6wxtzmymmvyubnln2jiy2;
        r8lambdaz5d1_jn6wxtzmymmvyubnln2jiyArr[3] = r8lambdaz5d1_jn6wxtzmymmvyubnln2jiy3;
        r8lambdaz5d1_jn6wxtzmymmvyubnln2jiyArr[3] = r8lambdaz5d1_jn6wxtzmymmvyubnln2jiy4;
        return r8lambdaz5d1_jn6wxtzmymmvyubnln2jiyArr;
    }

    public static EnumEntries<r8lambdaz5d1_jN6WXTZMymmvyUBNlN2JiY> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static r8lambdaz5d1_jN6WXTZMymmvyUBNlN2JiY valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaz5d1_jN6WXTZMymmvyUBNlN2JiY r8lambdaz5d1_jn6wxtzmymmvyubnln2jiy = (r8lambdaz5d1_jN6WXTZMymmvyUBNlN2JiY) Enum.valueOf(r8lambdaz5d1_jN6WXTZMymmvyUBNlN2JiY.class, str);
        if (i3 != 0) {
            int i4 = 42 / 0;
        }
        return r8lambdaz5d1_jn6wxtzmymmvyubnln2jiy;
    }

    public static r8lambdaz5d1_jN6WXTZMymmvyUBNlN2JiY[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaz5d1_jN6WXTZMymmvyUBNlN2JiY[] r8lambdaz5d1_jn6wxtzmymmvyubnln2jiyArr = (r8lambdaz5d1_jN6WXTZMymmvyUBNlN2JiY[]) $VALUES.clone();
        int i4 = onWarmupCompleted + 63;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 25 / 0;
        }
        return r8lambdaz5d1_jn6wxtzmymmvyubnln2jiyArr;
    }

    private r8lambdaz5d1_jN6WXTZMymmvyUBNlN2JiY(String str, int i) {
    }

    static {
        r8lambdaz5d1_jN6WXTZMymmvyUBNlN2JiY[] r8lambdaz5d1_jn6wxtzmymmvyubnln2jiyArr$values = $values();
        $VALUES = r8lambdaz5d1_jn6wxtzmymmvyubnln2jiyArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(r8lambdaz5d1_jn6wxtzmymmvyubnln2jiyArr$values);
        int i = onExtraCallbackWithResult + 21;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
