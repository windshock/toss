package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class deprecated_url {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ deprecated_url[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    public static final deprecated_url Default = new deprecated_url("Default", 0);
    public static final deprecated_url Small = new deprecated_url("Small", 1);
    public static final deprecated_url Bounce = new deprecated_url("Bounce", 2);

    private static final /* synthetic */ deprecated_url[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        deprecated_url[] deprecated_urlVarArr = {Default, Small, Bounce};
        int i5 = i3 + 123;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return deprecated_urlVarArr;
    }

    public static EnumEntries<deprecated_url> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 41;
        onExtraCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        EnumEntries<deprecated_url> enumEntries = $ENTRIES;
        int i4 = i2 + 109;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return enumEntries;
        }
        obj.hashCode();
        throw null;
    }

    public static deprecated_url valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        deprecated_url deprecated_urlVar = (deprecated_url) Enum.valueOf(deprecated_url.class, str);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallback + 89;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return deprecated_urlVar;
        }
        throw null;
    }

    public static deprecated_url[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        deprecated_url[] deprecated_urlVarArr = (deprecated_url[]) $VALUES.clone();
        int i4 = onExtraCallback + 119;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return deprecated_urlVarArr;
        }
        throw null;
    }

    private deprecated_url(String str, int i) {
    }

    static {
        deprecated_url[] deprecated_urlVarArr$values = $values();
        $VALUES = deprecated_urlVarArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(deprecated_urlVarArr$values);
        int i = IAuthTabCallback + 51;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 12 / 0;
        }
    }
}
