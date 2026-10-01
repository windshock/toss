package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class hostnameVerifier {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ hostnameVerifier[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final int value;
    public static final hostnameVerifier DOWN = new hostnameVerifier("DOWN", 0, 1);
    public static final hostnameVerifier UP = new hostnameVerifier("UP", 1, -1);
    public static final hostnameVerifier NONE = new hostnameVerifier("NONE", 2, 0);

    private static final /* synthetic */ hostnameVerifier[] $values() {
        hostnameVerifier[] hostnameverifierArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            hostnameVerifier hostnameverifier = DOWN;
            hostnameVerifier hostnameverifier2 = UP;
            hostnameVerifier hostnameverifier3 = NONE;
            hostnameverifierArr = new hostnameVerifier[3];
            hostnameverifierArr[1] = hostnameverifier;
            hostnameverifierArr[1] = hostnameverifier2;
            hostnameverifierArr[3] = hostnameverifier3;
        } else {
            hostnameverifierArr = new hostnameVerifier[]{DOWN, UP, NONE};
        }
        int i4 = i3 + 17;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return hostnameverifierArr;
    }

    public static EnumEntries<hostnameVerifier> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        EnumEntries<hostnameVerifier> enumEntries = $ENTRIES;
        if (i3 != 0) {
            int i4 = 11 / 0;
        }
        return enumEntries;
    }

    public static hostnameVerifier valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        hostnameVerifier hostnameverifier = (hostnameVerifier) Enum.valueOf(hostnameVerifier.class, str);
        int i4 = IAuthTabCallback + 39;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return hostnameverifier;
        }
        throw null;
    }

    public static hostnameVerifier[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        hostnameVerifier[] hostnameverifierArr = $VALUES;
        if (i3 != 0) {
            return (hostnameVerifier[]) hostnameverifierArr.clone();
        }
        throw null;
    }

    private hostnameVerifier(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = this.value;
        int i6 = i3 + 113;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 22 / 0;
        }
        return i5;
    }

    static {
        hostnameVerifier[] hostnameverifierArr$values = $values();
        $VALUES = hostnameverifierArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(hostnameverifierArr$values);
        int i = onNavigationEvent + 123;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
