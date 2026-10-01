package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdalLFfNkAUsyAZXqx0p6sDgBDY {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r8lambdalLFfNkAUsyAZXqx0p6sDgBDY[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public static final r8lambdalLFfNkAUsyAZXqx0p6sDgBDY Header = new r8lambdalLFfNkAUsyAZXqx0p6sDgBDY("Header", 0);
    public static final r8lambdalLFfNkAUsyAZXqx0p6sDgBDY Body = new r8lambdalLFfNkAUsyAZXqx0p6sDgBDY("Body", 1);
    public static final r8lambdalLFfNkAUsyAZXqx0p6sDgBDY Footer = new r8lambdalLFfNkAUsyAZXqx0p6sDgBDY("Footer", 2);
    public static final r8lambdalLFfNkAUsyAZXqx0p6sDgBDY Whole = new r8lambdalLFfNkAUsyAZXqx0p6sDgBDY("Whole", 3);

    private static final /* synthetic */ r8lambdalLFfNkAUsyAZXqx0p6sDgBDY[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return new r8lambdalLFfNkAUsyAZXqx0p6sDgBDY[]{Header, Body, Footer, Whole};
        }
        r8lambdalLFfNkAUsyAZXqx0p6sDgBDY r8lambdallffnkausyazxqx0p6sdgbdy = Header;
        r8lambdalLFfNkAUsyAZXqx0p6sDgBDY r8lambdallffnkausyazxqx0p6sdgbdy2 = Body;
        r8lambdalLFfNkAUsyAZXqx0p6sDgBDY r8lambdallffnkausyazxqx0p6sdgbdy3 = Footer;
        r8lambdalLFfNkAUsyAZXqx0p6sDgBDY r8lambdallffnkausyazxqx0p6sdgbdy4 = Whole;
        r8lambdalLFfNkAUsyAZXqx0p6sDgBDY[] r8lambdallffnkausyazxqx0p6sdgbdyArr = new r8lambdalLFfNkAUsyAZXqx0p6sDgBDY[3];
        r8lambdallffnkausyazxqx0p6sdgbdyArr[1] = r8lambdallffnkausyazxqx0p6sdgbdy;
        r8lambdallffnkausyazxqx0p6sdgbdyArr[0] = r8lambdallffnkausyazxqx0p6sdgbdy2;
        r8lambdallffnkausyazxqx0p6sdgbdyArr[5] = r8lambdallffnkausyazxqx0p6sdgbdy3;
        r8lambdallffnkausyazxqx0p6sdgbdyArr[2] = r8lambdallffnkausyazxqx0p6sdgbdy4;
        return r8lambdallffnkausyazxqx0p6sdgbdyArr;
    }

    public static EnumEntries<r8lambdalLFfNkAUsyAZXqx0p6sDgBDY> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        EnumEntries<r8lambdalLFfNkAUsyAZXqx0p6sDgBDY> enumEntries = $ENTRIES;
        int i5 = i3 + 31;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return enumEntries;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static r8lambdalLFfNkAUsyAZXqx0p6sDgBDY valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        r8lambdalLFfNkAUsyAZXqx0p6sDgBDY r8lambdallffnkausyazxqx0p6sdgbdy = (r8lambdalLFfNkAUsyAZXqx0p6sDgBDY) Enum.valueOf(r8lambdalLFfNkAUsyAZXqx0p6sDgBDY.class, str);
        int i4 = onExtraCallbackWithResult + 17;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return r8lambdallffnkausyazxqx0p6sdgbdy;
    }

    public static r8lambdalLFfNkAUsyAZXqx0p6sDgBDY[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        r8lambdalLFfNkAUsyAZXqx0p6sDgBDY[] r8lambdallffnkausyazxqx0p6sdgbdyArr = (r8lambdalLFfNkAUsyAZXqx0p6sDgBDY[]) $VALUES.clone();
        int i4 = onWarmupCompleted + 93;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return r8lambdallffnkausyazxqx0p6sdgbdyArr;
        }
        throw null;
    }

    static {
        r8lambdalLFfNkAUsyAZXqx0p6sDgBDY[] r8lambdallffnkausyazxqx0p6sdgbdyArr$values = $values();
        $VALUES = r8lambdallffnkausyazxqx0p6sdgbdyArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(r8lambdallffnkausyazxqx0p6sdgbdyArr$values);
        int i = IAuthTabCallback + 61;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private r8lambdalLFfNkAUsyAZXqx0p6sDgBDY(String str, int i) {
    }
}
