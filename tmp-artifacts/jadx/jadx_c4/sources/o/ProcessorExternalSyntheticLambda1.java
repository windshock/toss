package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ProcessorExternalSyntheticLambda1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ProcessorExternalSyntheticLambda1[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public static final ProcessorExternalSyntheticLambda1 ANDROID = new ProcessorExternalSyntheticLambda1("ANDROID", 0);
    public static final ProcessorExternalSyntheticLambda1 iOS = new ProcessorExternalSyntheticLambda1("iOS", 1);

    private static final /* synthetic */ ProcessorExternalSyntheticLambda1[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        ProcessorExternalSyntheticLambda1[] processorExternalSyntheticLambda1Arr = {i2 % 2 != 0 ? ANDROID : ANDROID, iOS};
        int i4 = i3 + 121;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return processorExternalSyntheticLambda1Arr;
    }

    public static EnumEntries<ProcessorExternalSyntheticLambda1> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        EnumEntries<ProcessorExternalSyntheticLambda1> enumEntries = $ENTRIES;
        int i5 = i3 + 43;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static ProcessorExternalSyntheticLambda1 valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ProcessorExternalSyntheticLambda1 processorExternalSyntheticLambda1 = (ProcessorExternalSyntheticLambda1) Enum.valueOf(ProcessorExternalSyntheticLambda1.class, str);
        int i4 = onNavigationEvent + 9;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return processorExternalSyntheticLambda1;
    }

    public static ProcessorExternalSyntheticLambda1[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        ProcessorExternalSyntheticLambda1[] processorExternalSyntheticLambda1Arr = (ProcessorExternalSyntheticLambda1[]) $VALUES.clone();
        int i4 = onWarmupCompleted + 93;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return processorExternalSyntheticLambda1Arr;
    }

    private ProcessorExternalSyntheticLambda1(String str, int i) {
    }

    static {
        ProcessorExternalSyntheticLambda1[] processorExternalSyntheticLambda1Arr$values = $values();
        $VALUES = processorExternalSyntheticLambda1Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(processorExternalSyntheticLambda1Arr$values);
        int i = IAuthTabCallback + 13;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            int i2 = 47 / 0;
        }
    }
}
