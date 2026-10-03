package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class onValueUpdate {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ onValueUpdate[] $VALUES;
    private static int IAuthTabCallback = 0;
    public static final onValueUpdate SAMSUNG_RCS = new onValueUpdate("SAMSUNG_RCS", 0);
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    private static final /* synthetic */ onValueUpdate[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        onValueUpdate[] onvalueupdateArr = {SAMSUNG_RCS};
        int i5 = i3 + 107;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return onvalueupdateArr;
    }

    public static EnumEntries<onValueUpdate> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        EnumEntries<onValueUpdate> enumEntries = $ENTRIES;
        int i5 = i3 + 107;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return enumEntries;
        }
        throw null;
    }

    public static onValueUpdate valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onValueUpdate onvalueupdate = (onValueUpdate) Enum.valueOf(onValueUpdate.class, str);
        int i4 = onExtraCallback + 85;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return onvalueupdate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static onValueUpdate[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onValueUpdate[] onvalueupdateArr = $VALUES;
        if (i3 == 0) {
            return (onValueUpdate[]) onvalueupdateArr.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private onValueUpdate(String str, int i) {
    }

    static {
        onValueUpdate[] onvalueupdateArr$values = $values();
        $VALUES = onvalueupdateArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(onvalueupdateArr$values);
        int i = onExtraCallbackWithResult + 95;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
