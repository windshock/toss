package o;

import com.google.gson.annotations.SerializedName;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NativeAppStateSpec {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NativeAppStateSpec[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;

    @SerializedName("DEFAULT")
    public static final NativeAppStateSpec DEFAULT = new NativeAppStateSpec("DEFAULT", 0);

    @SerializedName("NEGATIVE")
    public static final NativeAppStateSpec NEGATIVE = new NativeAppStateSpec("NEGATIVE", 1);

    @SerializedName("POSITIVE")
    public static final NativeAppStateSpec POSITIVE = new NativeAppStateSpec("POSITIVE", 2);

    @SerializedName("ICON")
    public static final NativeAppStateSpec ICON = new NativeAppStateSpec("ICON", 3);

    private static final /* synthetic */ NativeAppStateSpec[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 83;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return new NativeAppStateSpec[]{DEFAULT, NEGATIVE, POSITIVE, ICON};
        }
        NativeAppStateSpec nativeAppStateSpec = DEFAULT;
        NativeAppStateSpec nativeAppStateSpec2 = NEGATIVE;
        NativeAppStateSpec nativeAppStateSpec3 = POSITIVE;
        NativeAppStateSpec nativeAppStateSpec4 = ICON;
        NativeAppStateSpec[] nativeAppStateSpecArr = new NativeAppStateSpec[2];
        nativeAppStateSpecArr[1] = nativeAppStateSpec;
        nativeAppStateSpecArr[1] = nativeAppStateSpec2;
        nativeAppStateSpecArr[4] = nativeAppStateSpec3;
        nativeAppStateSpecArr[3] = nativeAppStateSpec4;
        return nativeAppStateSpecArr;
    }

    public static EnumEntries<NativeAppStateSpec> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        EnumEntries<NativeAppStateSpec> enumEntries = $ENTRIES;
        int i5 = i3 + 25;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return enumEntries;
        }
        throw null;
    }

    public static NativeAppStateSpec valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        NativeAppStateSpec nativeAppStateSpec = (NativeAppStateSpec) Enum.valueOf(NativeAppStateSpec.class, str);
        int i4 = IAuthTabCallback + 39;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 30 / 0;
        }
        return nativeAppStateSpec;
    }

    public static NativeAppStateSpec[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        NativeAppStateSpec[] nativeAppStateSpecArr = (NativeAppStateSpec[]) $VALUES.clone();
        int i4 = IAuthTabCallback + 97;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return nativeAppStateSpecArr;
    }

    private NativeAppStateSpec(String str, int i) {
    }

    static {
        NativeAppStateSpec[] nativeAppStateSpecArr$values = $values();
        $VALUES = nativeAppStateSpecArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(nativeAppStateSpecArr$values);
        int i = onExtraCallbackWithResult + 13;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }
}
