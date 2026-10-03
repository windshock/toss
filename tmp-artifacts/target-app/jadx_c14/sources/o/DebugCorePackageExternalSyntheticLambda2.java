package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DebugCorePackageExternalSyntheticLambda2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DebugCorePackageExternalSyntheticLambda2[] $VALUES;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public static final DebugCorePackageExternalSyntheticLambda2 TERMS_NOT_FOUND = new DebugCorePackageExternalSyntheticLambda2("TERMS_NOT_FOUND", 0);
    public static final DebugCorePackageExternalSyntheticLambda2 NO_WITHDRAWAL_NEEDED = new DebugCorePackageExternalSyntheticLambda2("NO_WITHDRAWAL_NEEDED", 1);
    public static final DebugCorePackageExternalSyntheticLambda2 PERIOD_NOT_EXCEEDED = new DebugCorePackageExternalSyntheticLambda2("PERIOD_NOT_EXCEEDED", 2);
    public static final DebugCorePackageExternalSyntheticLambda2 WITHDRAWN = new DebugCorePackageExternalSyntheticLambda2("WITHDRAWN", 3);

    private static final /* synthetic */ DebugCorePackageExternalSyntheticLambda2[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        DebugCorePackageExternalSyntheticLambda2[] debugCorePackageExternalSyntheticLambda2Arr = {TERMS_NOT_FOUND, NO_WITHDRAWAL_NEEDED, PERIOD_NOT_EXCEEDED, WITHDRAWN};
        int i5 = i3 + 9;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return debugCorePackageExternalSyntheticLambda2Arr;
        }
        throw null;
    }

    public static EnumEntries<DebugCorePackageExternalSyntheticLambda2> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        EnumEntries<DebugCorePackageExternalSyntheticLambda2> enumEntries = $ENTRIES;
        int i5 = i3 + 125;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static DebugCorePackageExternalSyntheticLambda2 valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        DebugCorePackageExternalSyntheticLambda2 debugCorePackageExternalSyntheticLambda2 = (DebugCorePackageExternalSyntheticLambda2) Enum.valueOf(DebugCorePackageExternalSyntheticLambda2.class, str);
        if (i3 == 0) {
            int i4 = 75 / 0;
        }
        return debugCorePackageExternalSyntheticLambda2;
    }

    public static DebugCorePackageExternalSyntheticLambda2[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        DebugCorePackageExternalSyntheticLambda2[] debugCorePackageExternalSyntheticLambda2Arr = $VALUES;
        if (i3 != 0) {
            return (DebugCorePackageExternalSyntheticLambda2[]) debugCorePackageExternalSyntheticLambda2Arr.clone();
        }
        throw null;
    }

    private DebugCorePackageExternalSyntheticLambda2(String str, int i) {
    }

    static {
        DebugCorePackageExternalSyntheticLambda2[] debugCorePackageExternalSyntheticLambda2Arr$values = $values();
        $VALUES = debugCorePackageExternalSyntheticLambda2Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(debugCorePackageExternalSyntheticLambda2Arr$values);
        int i = onNavigationEvent + 65;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }
}
