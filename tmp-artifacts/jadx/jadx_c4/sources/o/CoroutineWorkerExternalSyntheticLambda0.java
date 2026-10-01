package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class CoroutineWorkerExternalSyntheticLambda0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CoroutineWorkerExternalSyntheticLambda0[] $VALUES;
    public static final CoroutineWorkerExternalSyntheticLambda0 BezierRadius = new CoroutineWorkerExternalSyntheticLambda0("BezierRadius", 0);
    public static final CoroutineWorkerExternalSyntheticLambda0 Squircle = new CoroutineWorkerExternalSyntheticLambda0("Squircle", 1);
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    private static final /* synthetic */ CoroutineWorkerExternalSyntheticLambda0[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 99;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        CoroutineWorkerExternalSyntheticLambda0[] coroutineWorkerExternalSyntheticLambda0Arr = {BezierRadius, Squircle};
        int i5 = i2 + 95;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return coroutineWorkerExternalSyntheticLambda0Arr;
    }

    public static EnumEntries<CoroutineWorkerExternalSyntheticLambda0> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        EnumEntries<CoroutineWorkerExternalSyntheticLambda0> enumEntries = $ENTRIES;
        int i5 = i3 + 111;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static CoroutineWorkerExternalSyntheticLambda0 valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        CoroutineWorkerExternalSyntheticLambda0 coroutineWorkerExternalSyntheticLambda0 = (CoroutineWorkerExternalSyntheticLambda0) Enum.valueOf(CoroutineWorkerExternalSyntheticLambda0.class, str);
        if (i3 != 0) {
            return coroutineWorkerExternalSyntheticLambda0;
        }
        throw null;
    }

    public static CoroutineWorkerExternalSyntheticLambda0[] values() {
        CoroutineWorkerExternalSyntheticLambda0[] coroutineWorkerExternalSyntheticLambda0Arr;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            coroutineWorkerExternalSyntheticLambda0Arr = (CoroutineWorkerExternalSyntheticLambda0[]) $VALUES.clone();
            int i3 = 39 / 0;
        } else {
            coroutineWorkerExternalSyntheticLambda0Arr = (CoroutineWorkerExternalSyntheticLambda0[]) $VALUES.clone();
        }
        int i4 = onWarmupCompleted + 99;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return coroutineWorkerExternalSyntheticLambda0Arr;
        }
        throw null;
    }

    private CoroutineWorkerExternalSyntheticLambda0(String str, int i) {
    }

    static {
        CoroutineWorkerExternalSyntheticLambda0[] coroutineWorkerExternalSyntheticLambda0Arr$values = $values();
        $VALUES = coroutineWorkerExternalSyntheticLambda0Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(coroutineWorkerExternalSyntheticLambda0Arr$values);
        int i = onExtraCallback + 53;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
