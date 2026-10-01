package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getExtraParameters {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ getExtraParameters[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    public static final getExtraParameters Normal = new getExtraParameters("Normal", 0);
    public static final getExtraParameters Alternate = new getExtraParameters("Alternate", 1);

    private static final /* synthetic */ getExtraParameters[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        getExtraParameters[] getextraparametersArr = {Normal, Alternate};
        int i5 = i3 + 71;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 58 / 0;
        }
        return getextraparametersArr;
    }

    public static EnumEntries<getExtraParameters> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 113;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        EnumEntries<getExtraParameters> enumEntries = $ENTRIES;
        int i4 = i2 + 85;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return enumEntries;
        }
        obj.hashCode();
        throw null;
    }

    public static getExtraParameters valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getExtraParameters getextraparameters = (getExtraParameters) Enum.valueOf(getExtraParameters.class, str);
        if (i3 != 0) {
            return getextraparameters;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static getExtraParameters[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getExtraParameters[] getextraparametersArr = $VALUES;
        if (i3 == 0) {
            return (getExtraParameters[]) getextraparametersArr.clone();
        }
        int i4 = 20 / 0;
        return (getExtraParameters[]) getextraparametersArr.clone();
    }

    private getExtraParameters(String str, int i) {
    }

    static {
        getExtraParameters[] getextraparametersArr$values = $values();
        $VALUES = getextraparametersArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(getextraparametersArr$values);
        int i = onExtraCallbackWithResult + 9;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
