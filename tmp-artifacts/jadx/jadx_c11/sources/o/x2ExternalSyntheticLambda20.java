package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
final class x2ExternalSyntheticLambda20 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ x2ExternalSyntheticLambda20[] $VALUES;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    public static final x2ExternalSyntheticLambda20 Items = new x2ExternalSyntheticLambda20("Items", 0);
    public static final x2ExternalSyntheticLambda20 FocusBox = new x2ExternalSyntheticLambda20("FocusBox", 1);

    private static final /* synthetic */ x2ExternalSyntheticLambda20[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        x2ExternalSyntheticLambda20[] x2externalsyntheticlambda20Arr = {Items, FocusBox};
        int i5 = i3 + 123;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return x2externalsyntheticlambda20Arr;
    }

    public static EnumEntries<x2ExternalSyntheticLambda20> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        EnumEntries<x2ExternalSyntheticLambda20> enumEntries = $ENTRIES;
        int i4 = i3 + 73;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return enumEntries;
        }
        throw null;
    }

    public static x2ExternalSyntheticLambda20 valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        x2ExternalSyntheticLambda20 x2externalsyntheticlambda20 = (x2ExternalSyntheticLambda20) Enum.valueOf(x2ExternalSyntheticLambda20.class, str);
        int i4 = onExtraCallback + 75;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return x2externalsyntheticlambda20;
        }
        throw null;
    }

    public static x2ExternalSyntheticLambda20[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        x2ExternalSyntheticLambda20[] x2externalsyntheticlambda20Arr = (x2ExternalSyntheticLambda20[]) $VALUES.clone();
        int i4 = onExtraCallback + 69;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 60 / 0;
        }
        return x2externalsyntheticlambda20Arr;
    }

    private x2ExternalSyntheticLambda20(String str, int i) {
    }

    static {
        x2ExternalSyntheticLambda20[] x2externalsyntheticlambda20Arr$values = $values();
        $VALUES = x2externalsyntheticlambda20Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(x2externalsyntheticlambda20Arr$values);
        int i = onNavigationEvent + 41;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            int i2 = 2 / 0;
        }
    }
}
