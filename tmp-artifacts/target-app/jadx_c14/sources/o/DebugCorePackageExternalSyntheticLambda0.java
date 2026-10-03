package o;

import com.google.gson.annotations.SerializedName;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DebugCorePackageExternalSyntheticLambda0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DebugCorePackageExternalSyntheticLambda0[] $VALUES;

    @SerializedName("MAIL")
    public static final DebugCorePackageExternalSyntheticLambda0 MAIL = new DebugCorePackageExternalSyntheticLambda0("MAIL", 0);

    @SerializedName("REGISTERED_MAIL")
    public static final DebugCorePackageExternalSyntheticLambda0 REGISTERED_MAIL = new DebugCorePackageExternalSyntheticLambda0("REGISTERED_MAIL", 1);

    @SerializedName("SEMI_REGISTERED_MAIL")
    public static final DebugCorePackageExternalSyntheticLambda0 SEMI_REGISTERED_MAIL = new DebugCorePackageExternalSyntheticLambda0("SEMI_REGISTERED_MAIL", 2);
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    private static final /* synthetic */ DebugCorePackageExternalSyntheticLambda0[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        DebugCorePackageExternalSyntheticLambda0 debugCorePackageExternalSyntheticLambda0 = MAIL;
        if (i3 != 0) {
            return new DebugCorePackageExternalSyntheticLambda0[]{debugCorePackageExternalSyntheticLambda0, REGISTERED_MAIL, SEMI_REGISTERED_MAIL};
        }
        DebugCorePackageExternalSyntheticLambda0 debugCorePackageExternalSyntheticLambda02 = REGISTERED_MAIL;
        DebugCorePackageExternalSyntheticLambda0 debugCorePackageExternalSyntheticLambda03 = SEMI_REGISTERED_MAIL;
        DebugCorePackageExternalSyntheticLambda0[] debugCorePackageExternalSyntheticLambda0Arr = new DebugCorePackageExternalSyntheticLambda0[3];
        debugCorePackageExternalSyntheticLambda0Arr[1] = debugCorePackageExternalSyntheticLambda0;
        debugCorePackageExternalSyntheticLambda0Arr[1] = debugCorePackageExternalSyntheticLambda02;
        debugCorePackageExternalSyntheticLambda0Arr[4] = debugCorePackageExternalSyntheticLambda03;
        return debugCorePackageExternalSyntheticLambda0Arr;
    }

    public static EnumEntries<DebugCorePackageExternalSyntheticLambda0> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 97;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<DebugCorePackageExternalSyntheticLambda0> enumEntries = $ENTRIES;
        int i5 = i2 + 57;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return enumEntries;
        }
        throw null;
    }

    public static DebugCorePackageExternalSyntheticLambda0 valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        DebugCorePackageExternalSyntheticLambda0 debugCorePackageExternalSyntheticLambda0 = (DebugCorePackageExternalSyntheticLambda0) Enum.valueOf(DebugCorePackageExternalSyntheticLambda0.class, str);
        if (i3 == 0) {
            int i4 = 58 / 0;
        }
        int i5 = onWarmupCompleted + 59;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 27 / 0;
        }
        return debugCorePackageExternalSyntheticLambda0;
    }

    public static DebugCorePackageExternalSyntheticLambda0[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        DebugCorePackageExternalSyntheticLambda0[] debugCorePackageExternalSyntheticLambda0Arr = $VALUES;
        if (i3 == 0) {
            return (DebugCorePackageExternalSyntheticLambda0[]) debugCorePackageExternalSyntheticLambda0Arr.clone();
        }
        throw null;
    }

    private DebugCorePackageExternalSyntheticLambda0(String str, int i) {
    }

    static {
        DebugCorePackageExternalSyntheticLambda0[] debugCorePackageExternalSyntheticLambda0Arr$values = $values();
        $VALUES = debugCorePackageExternalSyntheticLambda0Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(debugCorePackageExternalSyntheticLambda0Arr$values);
        int i = onExtraCallbackWithResult + 97;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final boolean isMail() {
        int i = 2 % 2;
        if (this != MAIL) {
            return false;
        }
        int i2 = onNavigationEvent;
        int i3 = i2 + 43;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 115;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 64 / 0;
        }
        return true;
    }

    public final boolean isRegisteredMail() {
        int i = 2 % 2;
        if (this == REGISTERED_MAIL) {
            int i2 = onNavigationEvent + 69;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = onNavigationEvent + 51;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 62 / 0;
        }
        return false;
    }

    public final boolean isSemiRegisteredMail() {
        int i = 2 % 2;
        if (this != SEMI_REGISTERED_MAIL) {
            return false;
        }
        int i2 = onNavigationEvent + 55;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 49;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 37 / 0;
        }
        return true;
    }
}
