package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda0[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public static final ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda0 NORMAL = new ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda0("NORMAL", 0);
    public static final ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda0 LINE_THROUGH = new ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda0("LINE_THROUGH", 1);
    public static final ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda0 TEXT_CTA = new ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda0("TEXT_CTA", 2);
    public static final ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda0 HTML = new ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda0("HTML", 3);

    private static final /* synthetic */ ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda0[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 91;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda0[] reactPackageTurboModuleManagerDelegateExternalSyntheticLambda0Arr = {NORMAL, LINE_THROUGH, TEXT_CTA, HTML};
        int i5 = i2 + 19;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return reactPackageTurboModuleManagerDelegateExternalSyntheticLambda0Arr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda0> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 11;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda0> enumEntries = $ENTRIES;
        int i5 = i2 + 89;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 26 / 0;
        }
        return enumEntries;
    }

    public static ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda0 valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda0 reactPackageTurboModuleManagerDelegateExternalSyntheticLambda0 = (ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda0) Enum.valueOf(ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda0.class, str);
        if (i3 == 0) {
            return reactPackageTurboModuleManagerDelegateExternalSyntheticLambda0;
        }
        throw null;
    }

    public static ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda0[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda0[] reactPackageTurboModuleManagerDelegateExternalSyntheticLambda0Arr = (ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda0[]) $VALUES.clone();
        int i3 = IAuthTabCallback + 57;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return reactPackageTurboModuleManagerDelegateExternalSyntheticLambda0Arr;
        }
        obj.hashCode();
        throw null;
    }

    private ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda0(String str, int i) {
    }

    static {
        ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda0[] reactPackageTurboModuleManagerDelegateExternalSyntheticLambda0Arr$values = $values();
        $VALUES = reactPackageTurboModuleManagerDelegateExternalSyntheticLambda0Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(reactPackageTurboModuleManagerDelegateExternalSyntheticLambda0Arr$values);
        int i = onExtraCallbackWithResult + 45;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
