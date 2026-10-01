package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class n6b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n6b[] $VALUES;
    private static int IAuthTabCallback = 0;
    public static final n6b LocalOrRemoteBundle = new n6b("LocalOrRemoteBundle", 0);
    public static final n6b Metro = new n6b("Metro", 1);
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    private static final /* synthetic */ n6b[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 49;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        n6b[] n6bVarArr = {LocalOrRemoteBundle, Metro};
        int i5 = i2 + 109;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return n6bVarArr;
        }
        throw null;
    }

    public static EnumEntries<n6b> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        EnumEntries<n6b> enumEntries = $ENTRIES;
        if (i3 == 0) {
            int i4 = 50 / 0;
        }
        return enumEntries;
    }

    public static n6b valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        n6b n6bVar = (n6b) Enum.valueOf(n6b.class, str);
        int i4 = onNavigationEvent + 3;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return n6bVar;
    }

    public static n6b[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        n6b[] n6bVarArr = (n6b[]) $VALUES.clone();
        int i4 = onExtraCallback + 73;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return n6bVarArr;
        }
        throw null;
    }

    private n6b(String str, int i) {
    }

    static {
        n6b[] n6bVarArr$values = $values();
        $VALUES = n6bVarArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(n6bVarArr$values);
        int i = IAuthTabCallback + 125;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }
}
