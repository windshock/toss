package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
final class y1ExternalSyntheticLambda2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ y1ExternalSyntheticLambda2[] $VALUES;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    public static final y1ExternalSyntheticLambda2 Upper = new y1ExternalSyntheticLambda2("Upper", 0);
    public static final y1ExternalSyntheticLambda2 Title = new y1ExternalSyntheticLambda2("Title", 1);
    public static final y1ExternalSyntheticLambda2 Lower = new y1ExternalSyntheticLambda2("Lower", 2);
    public static final y1ExternalSyntheticLambda2 Right = new y1ExternalSyntheticLambda2("Right", 3);
    public static final y1ExternalSyntheticLambda2 AdjustRight = new y1ExternalSyntheticLambda2("AdjustRight", 4);

    private static final /* synthetic */ y1ExternalSyntheticLambda2[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 5;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        y1ExternalSyntheticLambda2[] y1externalsyntheticlambda2Arr = {Upper, Title, Lower, Right, AdjustRight};
        int i5 = i2 + 123;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return y1externalsyntheticlambda2Arr;
    }

    public static EnumEntries<y1ExternalSyntheticLambda2> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 97;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<y1ExternalSyntheticLambda2> enumEntries = $ENTRIES;
        int i5 = i2 + 25;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return enumEntries;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static y1ExternalSyntheticLambda2 valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        y1ExternalSyntheticLambda2 y1externalsyntheticlambda2 = (y1ExternalSyntheticLambda2) Enum.valueOf(y1ExternalSyntheticLambda2.class, str);
        int i4 = onWarmupCompleted + 3;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return y1externalsyntheticlambda2;
        }
        throw null;
    }

    public static y1ExternalSyntheticLambda2[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        y1ExternalSyntheticLambda2[] y1externalsyntheticlambda2Arr = (y1ExternalSyntheticLambda2[]) $VALUES.clone();
        int i4 = onExtraCallback + 55;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 60 / 0;
        }
        return y1externalsyntheticlambda2Arr;
    }

    private y1ExternalSyntheticLambda2(String str, int i) {
    }

    static {
        y1ExternalSyntheticLambda2[] y1externalsyntheticlambda2Arr$values = $values();
        $VALUES = y1externalsyntheticlambda2Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(y1externalsyntheticlambda2Arr$values);
        int i = onExtraCallbackWithResult + 1;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
