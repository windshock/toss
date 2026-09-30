package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class deprecated_proxySelector {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ deprecated_proxySelector[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    public static final deprecated_proxySelector SMALL = new deprecated_proxySelector("SMALL", 0);
    public static final deprecated_proxySelector BIG = new deprecated_proxySelector("BIG", 1);

    private static final /* synthetic */ deprecated_proxySelector[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return new deprecated_proxySelector[]{SMALL, BIG};
        }
        deprecated_proxySelector deprecated_proxyselector = SMALL;
        deprecated_proxySelector deprecated_proxyselector2 = BIG;
        deprecated_proxySelector[] deprecated_proxyselectorArr = new deprecated_proxySelector[2];
        deprecated_proxyselectorArr[0] = deprecated_proxyselector;
        deprecated_proxyselectorArr[0] = deprecated_proxyselector2;
        return deprecated_proxyselectorArr;
    }

    public static EnumEntries<deprecated_proxySelector> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        throw null;
    }

    public static deprecated_proxySelector valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        deprecated_proxySelector deprecated_proxyselector = (deprecated_proxySelector) Enum.valueOf(deprecated_proxySelector.class, str);
        int i4 = IAuthTabCallback + 31;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return deprecated_proxyselector;
    }

    public static deprecated_proxySelector[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        deprecated_proxySelector[] deprecated_proxyselectorArr = (deprecated_proxySelector[]) $VALUES.clone();
        int i4 = IAuthTabCallback + 39;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return deprecated_proxyselectorArr;
    }

    private deprecated_proxySelector(String str, int i) {
    }

    static {
        deprecated_proxySelector[] deprecated_proxyselectorArr$values = $values();
        $VALUES = deprecated_proxyselectorArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(deprecated_proxyselectorArr$values);
        int i = onNavigationEvent + 123;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
