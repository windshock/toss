package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class NativeCrashReporter {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NativeCrashReporter[] $VALUES;
    public static final NativeCrashReporter DEFAULT = new NativeCrashReporter("DEFAULT", 0, new long[]{300, 300});
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;
    private final long[] pattern;

    private static final /* synthetic */ NativeCrashReporter[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        NativeCrashReporter nativeCrashReporter = DEFAULT;
        if (i3 != 0) {
            return new NativeCrashReporter[]{nativeCrashReporter};
        }
        NativeCrashReporter[] nativeCrashReporterArr = new NativeCrashReporter[1];
        nativeCrashReporterArr[1] = nativeCrashReporter;
        return nativeCrashReporterArr;
    }

    public static EnumEntries<NativeCrashReporter> getEntries() {
        EnumEntries<NativeCrashReporter> enumEntries;
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            enumEntries = $ENTRIES;
            int i4 = 35 / 0;
        } else {
            enumEntries = $ENTRIES;
        }
        int i5 = i3 + 33;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return enumEntries;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static NativeCrashReporter valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        NativeCrashReporter nativeCrashReporter = (NativeCrashReporter) Enum.valueOf(NativeCrashReporter.class, str);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallback + 95;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return nativeCrashReporter;
    }

    public static NativeCrashReporter[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        NativeCrashReporter[] nativeCrashReporterArr = $VALUES;
        if (i3 == 0) {
            return (NativeCrashReporter[]) nativeCrashReporterArr.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private NativeCrashReporter(String str, int i, long[] jArr) {
        this.pattern = jArr;
    }

    public final long[] getPattern() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 77;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long[] jArr = this.pattern;
        int i4 = i2 + 95;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return jArr;
    }

    static {
        NativeCrashReporter[] nativeCrashReporterArr$values = $values();
        $VALUES = nativeCrashReporterArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(nativeCrashReporterArr$values);
        int i = IAuthTabCallback + 71;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
