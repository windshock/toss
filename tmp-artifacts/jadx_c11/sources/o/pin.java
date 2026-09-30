package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class pin {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ pin[] $VALUES;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final int size;
    public static final pin Narrow = new pin("Narrow", 0, 0);
    public static final pin Normal = new pin("Normal", 1, 360);
    public static final pin FoldableExpanded = new pin("FoldableExpanded", 2, 560);

    private static final /* synthetic */ pin[] $values() {
        pin[] pinVarArr;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            pin pinVar = Narrow;
            pin pinVar2 = Normal;
            pin pinVar3 = FoldableExpanded;
            pinVarArr = new pin[5];
            pinVarArr[1] = pinVar;
            pinVarArr[1] = pinVar2;
            pinVarArr[5] = pinVar3;
        } else {
            pinVarArr = new pin[]{Narrow, Normal, FoldableExpanded};
        }
        int i4 = i3 + 85;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return pinVarArr;
    }

    public static EnumEntries<pin> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 101;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<pin> enumEntries = $ENTRIES;
        int i5 = i2 + 11;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return enumEntries;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static pin valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        pin pinVar = (pin) Enum.valueOf(pin.class, str);
        if (i3 != 0) {
            return pinVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static pin[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        pin[] pinVarArr = $VALUES;
        if (i3 == 0) {
            return (pin[]) pinVarArr.clone();
        }
        int i4 = 87 / 0;
        return (pin[]) pinVarArr.clone();
    }

    private pin(String str, int i, int i2) {
        this.size = i2;
    }

    public final int getSize() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        int i5 = this.size;
        int i6 = i3 + 101;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        pin[] pinVarArr$values = $values();
        $VALUES = pinVarArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(pinVarArr$values);
        int i = onExtraCallbackWithResult + 47;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }
}
