package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class addNewItem {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ addNewItem[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    public static final addNewItem TURNKEY = new addNewItem("TURNKEY", 0);
    public static final addNewItem NATIVE = new addNewItem("NATIVE", 1);

    private static final /* synthetic */ addNewItem[] $values() {
        addNewItem[] addnewitemArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 119;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            addNewItem addnewitem = TURNKEY;
            addNewItem addnewitem2 = NATIVE;
            addnewitemArr = new addNewItem[4];
            addnewitemArr[0] = addnewitem;
            addnewitemArr[0] = addnewitem2;
        } else {
            addnewitemArr = new addNewItem[]{TURNKEY, NATIVE};
        }
        int i4 = i2 + 37;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return addnewitemArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<addNewItem> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        EnumEntries<addNewItem> enumEntries = $ENTRIES;
        int i5 = i3 + 57;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return enumEntries;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static addNewItem valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        addNewItem addnewitem = (addNewItem) Enum.valueOf(addNewItem.class, str);
        if (i3 != 0) {
            return addnewitem;
        }
        throw null;
    }

    public static addNewItem[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        addNewItem[] addnewitemArr = $VALUES;
        if (i3 != 0) {
            return (addNewItem[]) addnewitemArr.clone();
        }
        int i4 = 38 / 0;
        return (addNewItem[]) addnewitemArr.clone();
    }

    private addNewItem(String str, int i) {
    }

    static {
        addNewItem[] addnewitemArr$values = $values();
        $VALUES = addnewitemArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(addnewitemArr$values);
        int i = onExtraCallback + 19;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 90 / 0;
        }
    }

    public final String wireValue() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == NATIVE) {
            String strName = name();
            int i4 = IAuthTabCallback + 51;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return strName;
        }
        int i6 = i3 + 31;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }
}
