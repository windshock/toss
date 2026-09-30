package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdapher_XsWcKlWwdNoY6vZZ6sfZg {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r8lambdapher_XsWcKlWwdNoY6vZZ6sfZg[] $VALUES;
    public static final r8lambdapher_XsWcKlWwdNoY6vZZ6sfZg CLOSED = new r8lambdapher_XsWcKlWwdNoY6vZZ6sfZg("CLOSED", 0);
    public static final r8lambdapher_XsWcKlWwdNoY6vZZ6sfZg FAULT = new r8lambdapher_XsWcKlWwdNoY6vZZ6sfZg("FAULT", 1);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    private static final /* synthetic */ r8lambdapher_XsWcKlWwdNoY6vZZ6sfZg[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 61;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        r8lambdapher_XsWcKlWwdNoY6vZZ6sfZg[] r8lambdapher_xswcklwwdnoy6vzz6sfzgArr = {CLOSED, FAULT};
        int i5 = i2 + 25;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return r8lambdapher_xswcklwwdnoy6vzz6sfzgArr;
    }

    public static EnumEntries<r8lambdapher_XsWcKlWwdNoY6vZZ6sfZg> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        EnumEntries<r8lambdapher_XsWcKlWwdNoY6vZZ6sfZg> enumEntries = $ENTRIES;
        int i5 = i3 + 97;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return enumEntries;
        }
        throw null;
    }

    public static r8lambdapher_XsWcKlWwdNoY6vZZ6sfZg valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        r8lambdapher_XsWcKlWwdNoY6vZZ6sfZg r8lambdapher_xswcklwwdnoy6vzz6sfzg = (r8lambdapher_XsWcKlWwdNoY6vZZ6sfZg) Enum.valueOf(r8lambdapher_XsWcKlWwdNoY6vZZ6sfZg.class, str);
        int i4 = onWarmupCompleted + 79;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 87 / 0;
        }
        return r8lambdapher_xswcklwwdnoy6vzz6sfzg;
    }

    public static r8lambdapher_XsWcKlWwdNoY6vZZ6sfZg[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        r8lambdapher_XsWcKlWwdNoY6vZZ6sfZg[] r8lambdapher_xswcklwwdnoy6vzz6sfzgArr = (r8lambdapher_XsWcKlWwdNoY6vZZ6sfZg[]) $VALUES.clone();
        int i4 = onExtraCallbackWithResult + 17;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return r8lambdapher_xswcklwwdnoy6vzz6sfzgArr;
    }

    private r8lambdapher_XsWcKlWwdNoY6vZZ6sfZg(String str, int i) {
    }

    static {
        r8lambdapher_XsWcKlWwdNoY6vZZ6sfZg[] r8lambdapher_xswcklwwdnoy6vzz6sfzgArr$values = $values();
        $VALUES = r8lambdapher_xswcklwwdnoy6vzz6sfzgArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(r8lambdapher_xswcklwwdnoy6vzz6sfzgArr$values);
        int i = onExtraCallback + 93;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
