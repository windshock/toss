package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class n0b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n0b[] $VALUES;
    private static int IAuthTabCallback = 1;
    public static final n0b LocalOrRemoteBundle = new n0b("LocalOrRemoteBundle", 0);
    public static final n0b Metro = new n0b("Metro", 1);
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    private static final /* synthetic */ n0b[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 97;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        n0b[] n0bVarArr = {LocalOrRemoteBundle, Metro};
        int i5 = i2 + 65;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 88 / 0;
        }
        return n0bVarArr;
    }

    public static EnumEntries<n0b> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        EnumEntries<n0b> enumEntries = $ENTRIES;
        int i5 = i3 + 125;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return enumEntries;
        }
        throw null;
    }

    public static n0b valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        n0b n0bVar = (n0b) Enum.valueOf(n0b.class, str);
        int i4 = onNavigationEvent + 71;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return n0bVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static n0b[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        n0b[] n0bVarArr = (n0b[]) $VALUES.clone();
        int i3 = onExtraCallback + 101;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 94 / 0;
        }
        return n0bVarArr;
    }

    private n0b(String str, int i) {
    }

    static {
        n0b[] n0bVarArr$values = $values();
        $VALUES = n0bVarArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(n0bVarArr$values);
        int i = onExtraCallbackWithResult + 5;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }
}
