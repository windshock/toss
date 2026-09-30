package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class pathMatch {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ pathMatch[] $VALUES;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public static final pathMatch R8 = new pathMatch("R8", 0);
    public static final pathMatch RGBA8 = new pathMatch("RGBA8", 1);
    public static final pathMatch RGB10_A2 = new pathMatch("RGB10_A2", 2);
    public static final pathMatch DEPTH24STENCIL8 = new pathMatch("DEPTH24STENCIL8", 3);

    private static final /* synthetic */ pathMatch[] $values() {
        pathMatch[] pathmatchArr;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 83;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            pathMatch pathmatch = R8;
            pathMatch pathmatch2 = RGBA8;
            pathMatch pathmatch3 = RGB10_A2;
            pathMatch pathmatch4 = DEPTH24STENCIL8;
            pathmatchArr = new pathMatch[4];
            pathmatchArr[0] = pathmatch;
            pathmatchArr[0] = pathmatch2;
            pathmatchArr[3] = pathmatch3;
            pathmatchArr[5] = pathmatch4;
        } else {
            pathmatchArr = new pathMatch[]{R8, RGBA8, RGB10_A2, DEPTH24STENCIL8};
        }
        int i4 = i2 + 55;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return pathmatchArr;
        }
        throw null;
    }

    public static EnumEntries<pathMatch> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static pathMatch valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        pathMatch pathmatch = (pathMatch) Enum.valueOf(pathMatch.class, str);
        if (i3 == 0) {
            return pathmatch;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static pathMatch[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        pathMatch[] pathmatchArr = (pathMatch[]) $VALUES.clone();
        int i4 = onExtraCallbackWithResult + 101;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return pathmatchArr;
        }
        throw null;
    }

    private pathMatch(String str, int i) {
    }

    static {
        pathMatch[] pathmatchArr$values = $values();
        $VALUES = pathmatchArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(pathmatchArr$values);
        int i = onWarmupCompleted + 115;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }
}
