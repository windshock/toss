package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaO8mhZM1tNx5SdXxbhA81yZc5uvc implements loadNextAdForAdToken {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r8lambdaO8mhZM1tNx5SdXxbhA81yZc5uvc[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String label;
    public static final r8lambdaO8mhZM1tNx5SdXxbhA81yZc5uvc PASSPORT = new r8lambdaO8mhZM1tNx5SdXxbhA81yZc5uvc("PASSPORT", 0, "PASSPORT");
    public static final r8lambdaO8mhZM1tNx5SdXxbhA81yZc5uvc PHONE = new r8lambdaO8mhZM1tNx5SdXxbhA81yZc5uvc("PHONE", 1, "PHONE");
    public static final r8lambdaO8mhZM1tNx5SdXxbhA81yZc5uvc DRIVER_LICENSE = new r8lambdaO8mhZM1tNx5SdXxbhA81yZc5uvc("DRIVER_LICENSE", 2, "DRIVER_LICENSE");
    public static final r8lambdaO8mhZM1tNx5SdXxbhA81yZc5uvc RRN = new r8lambdaO8mhZM1tNx5SdXxbhA81yZc5uvc("RRN", 3, "RRN");
    public static final r8lambdaO8mhZM1tNx5SdXxbhA81yZc5uvc ACCOUNT_NUMBER = new r8lambdaO8mhZM1tNx5SdXxbhA81yZc5uvc("ACCOUNT_NUMBER", 4, "ACCOUNT_NUMBER");

    private static final /* synthetic */ r8lambdaO8mhZM1tNx5SdXxbhA81yZc5uvc[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 119;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        r8lambdaO8mhZM1tNx5SdXxbhA81yZc5uvc[] r8lambdao8mhzm1tnx5sdxxbha81yzc5uvcArr = {PASSPORT, PHONE, DRIVER_LICENSE, RRN, ACCOUNT_NUMBER};
        int i5 = i2 + 67;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return r8lambdao8mhzm1tnx5sdxxbha81yzc5uvcArr;
    }

    public static EnumEntries<r8lambdaO8mhZM1tNx5SdXxbhA81yZc5uvc> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        throw null;
    }

    public static r8lambdaO8mhZM1tNx5SdXxbhA81yZc5uvc valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaO8mhZM1tNx5SdXxbhA81yZc5uvc r8lambdao8mhzm1tnx5sdxxbha81yzc5uvc = (r8lambdaO8mhZM1tNx5SdXxbhA81yZc5uvc) Enum.valueOf(r8lambdaO8mhZM1tNx5SdXxbhA81yZc5uvc.class, str);
        if (i3 == 0) {
            return r8lambdao8mhzm1tnx5sdxxbha81yzc5uvc;
        }
        throw null;
    }

    public static r8lambdaO8mhZM1tNx5SdXxbhA81yZc5uvc[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaO8mhZM1tNx5SdXxbhA81yZc5uvc[] r8lambdao8mhzm1tnx5sdxxbha81yzc5uvcArr = (r8lambdaO8mhZM1tNx5SdXxbhA81yZc5uvc[]) $VALUES.clone();
        int i4 = onWarmupCompleted + 49;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return r8lambdao8mhzm1tnx5sdxxbha81yzc5uvcArr;
    }

    private r8lambdaO8mhZM1tNx5SdXxbhA81yZc5uvc(String str, int i, String str2) {
        this.label = str2;
    }

    @Override // o.loadNextAdForAdToken
    public String getLabel() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 23;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.label;
        int i5 = i2 + 123;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        r8lambdaO8mhZM1tNx5SdXxbhA81yZc5uvc[] r8lambdao8mhzm1tnx5sdxxbha81yzc5uvcArr$values = $values();
        $VALUES = r8lambdao8mhzm1tnx5sdxxbha81yzc5uvcArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(r8lambdao8mhzm1tnx5sdxxbha81yzc5uvcArr$values);
        int i = onExtraCallback + 35;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }
}
