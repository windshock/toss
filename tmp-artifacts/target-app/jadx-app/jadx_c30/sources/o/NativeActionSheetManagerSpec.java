package o;

import com.google.gson.annotations.SerializedName;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class NativeActionSheetManagerSpec {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NativeActionSheetManagerSpec[] $VALUES;
    private static int IAuthTabCallback = 1;

    @SerializedName(setGlobalLegacyVisibilityHandlingEnabled.CERTIFY_ALL)
    public static final NativeActionSheetManagerSpec NORMAL = new NativeActionSheetManagerSpec(getUniqueNativeAdCount.NORMAL, 0, 1);
    public static final NativeActionSheetManagerSpec UNDEFINED = new NativeActionSheetManagerSpec(getUniqueNativeAdCount.UNDEFINED, 1, -1);
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final int id;

    private static final /* synthetic */ NativeActionSheetManagerSpec[] $values() {
        NativeActionSheetManagerSpec[] nativeActionSheetManagerSpecArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 89;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            NativeActionSheetManagerSpec nativeActionSheetManagerSpec = NORMAL;
            NativeActionSheetManagerSpec nativeActionSheetManagerSpec2 = UNDEFINED;
            nativeActionSheetManagerSpecArr = new NativeActionSheetManagerSpec[3];
            nativeActionSheetManagerSpecArr[0] = nativeActionSheetManagerSpec;
            nativeActionSheetManagerSpecArr[1] = nativeActionSheetManagerSpec2;
        } else {
            nativeActionSheetManagerSpecArr = new NativeActionSheetManagerSpec[]{NORMAL, UNDEFINED};
        }
        int i4 = i2 + 5;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 18 / 0;
        }
        return nativeActionSheetManagerSpecArr;
    }

    public static EnumEntries<NativeActionSheetManagerSpec> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        throw null;
    }

    public static NativeActionSheetManagerSpec valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        NativeActionSheetManagerSpec nativeActionSheetManagerSpec = (NativeActionSheetManagerSpec) Enum.valueOf(NativeActionSheetManagerSpec.class, str);
        if (i3 != 0) {
            int i4 = 36 / 0;
        }
        return nativeActionSheetManagerSpec;
    }

    public static NativeActionSheetManagerSpec[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        NativeActionSheetManagerSpec[] nativeActionSheetManagerSpecArr = (NativeActionSheetManagerSpec[]) $VALUES.clone();
        int i4 = onNavigationEvent + 23;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return nativeActionSheetManagerSpecArr;
    }

    private NativeActionSheetManagerSpec(String str, int i, int i2) {
        this.id = i2;
    }

    public final int getId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.id;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        NativeActionSheetManagerSpec[] nativeActionSheetManagerSpecArr$values = $values();
        $VALUES = nativeActionSheetManagerSpecArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(nativeActionSheetManagerSpecArr$values);
        int i = onExtraCallback + 103;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }
}
