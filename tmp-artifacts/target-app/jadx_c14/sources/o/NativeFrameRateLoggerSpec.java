package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NativeFrameRateLoggerSpec {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NativeFrameRateLoggerSpec[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public static final NativeFrameRateLoggerSpec DEFAULT = new NativeFrameRateLoggerSpec("DEFAULT", 0);
    public static final NativeFrameRateLoggerSpec BLUE_BOLD = new NativeFrameRateLoggerSpec("BLUE_BOLD", 1);

    private static final /* synthetic */ NativeFrameRateLoggerSpec[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 103;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        NativeFrameRateLoggerSpec[] nativeFrameRateLoggerSpecArr = {DEFAULT, BLUE_BOLD};
        int i5 = i2 + 57;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return nativeFrameRateLoggerSpecArr;
    }

    public static EnumEntries<NativeFrameRateLoggerSpec> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 109;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<NativeFrameRateLoggerSpec> enumEntries = $ENTRIES;
        int i5 = i2 + 69;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 70 / 0;
        }
        return enumEntries;
    }

    public static NativeFrameRateLoggerSpec valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        NativeFrameRateLoggerSpec nativeFrameRateLoggerSpec = (NativeFrameRateLoggerSpec) Enum.valueOf(NativeFrameRateLoggerSpec.class, str);
        int i4 = onNavigationEvent + 77;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return nativeFrameRateLoggerSpec;
    }

    public static NativeFrameRateLoggerSpec[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        NativeFrameRateLoggerSpec[] nativeFrameRateLoggerSpecArr = (NativeFrameRateLoggerSpec[]) $VALUES.clone();
        int i3 = onExtraCallbackWithResult + 9;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 49 / 0;
        }
        return nativeFrameRateLoggerSpecArr;
    }

    private NativeFrameRateLoggerSpec(String str, int i) {
    }

    static {
        NativeFrameRateLoggerSpec[] nativeFrameRateLoggerSpecArr$values = $values();
        $VALUES = nativeFrameRateLoggerSpecArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(nativeFrameRateLoggerSpecArr$values);
        int i = IAuthTabCallback + 111;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }
}
