package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final String id;
    public static final r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc TOSS = new r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc("TOSS", 0, "toss");
    public static final r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc APPSFLYER = new r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc("APPSFLYER", 1, "appsflyer");
    public static final r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc FACEBOOK = new r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc("FACEBOOK", 2, "facebook");
    public static final r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc FIREBASE = new r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc("FIREBASE", 3, "google_analytics");

    private static final /* synthetic */ r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 61;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc[] r8lambdaqfjxzpq89uignp4inuj4r5tibcArr = {TOSS, APPSFLYER, FACEBOOK, FIREBASE};
        int i5 = i2 + 41;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return r8lambdaqfjxzpq89uignp4inuj4r5tibcArr;
        }
        throw null;
    }

    public static EnumEntries<r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        EnumEntries<r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc> enumEntries = $ENTRIES;
        if (i3 != 0) {
            int i4 = 17 / 0;
        }
        return enumEntries;
    }

    public static r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc r8lambdaqfjxzpq89uignp4inuj4r5tibc = (r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc) Enum.valueOf(r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc.class, str);
        int i4 = IAuthTabCallback + 35;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return r8lambdaqfjxzpq89uignp4inuj4r5tibc;
    }

    public static r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc[] r8lambdaqfjxzpq89uignp4inuj4r5tibcArr = (r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc[]) $VALUES.clone();
        int i3 = onWarmupCompleted + 45;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return r8lambdaqfjxzpq89uignp4inuj4r5tibcArr;
    }

    private r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc(String str, int i, String str2) {
        this.id = str2;
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.id;
        int i5 = i3 + 79;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    static {
        r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc[] r8lambdaqfjxzpq89uignp4inuj4r5tibcArr$values = $values();
        $VALUES = r8lambdaqfjxzpq89uignp4inuj4r5tibcArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(r8lambdaqfjxzpq89uignp4inuj4r5tibcArr$values);
        int i = onExtraCallback + 3;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
