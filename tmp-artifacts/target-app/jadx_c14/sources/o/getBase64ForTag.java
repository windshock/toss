package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getBase64ForTag {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ getBase64ForTag[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public static final getBase64ForTag INVITED = new getBase64ForTag("INVITED", 0);
    public static final getBase64ForTag NOT_INVITED = new getBase64ForTag("NOT_INVITED", 1);
    public static final getBase64ForTag ACTIVATED = new getBase64ForTag("ACTIVATED", 2);
    public static final getBase64ForTag DEACTIVATED = new getBase64ForTag("DEACTIVATED", 3);
    public static final getBase64ForTag CREATED = new getBase64ForTag("CREATED", 4);

    private static final /* synthetic */ getBase64ForTag[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        getBase64ForTag[] getbase64fortagArr = {INVITED, NOT_INVITED, ACTIVATED, DEACTIVATED, CREATED};
        int i5 = i3 + 95;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return getbase64fortagArr;
    }

    public static EnumEntries<getBase64ForTag> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 113;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        EnumEntries<getBase64ForTag> enumEntries = $ENTRIES;
        int i4 = i2 + 113;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return enumEntries;
        }
        throw null;
    }

    public static getBase64ForTag valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getBase64ForTag getbase64fortag = (getBase64ForTag) Enum.valueOf(getBase64ForTag.class, str);
        int i4 = onExtraCallbackWithResult + 93;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return getbase64fortag;
        }
        throw null;
    }

    public static getBase64ForTag[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getBase64ForTag[] getbase64fortagArr = (getBase64ForTag[]) $VALUES.clone();
        int i4 = onWarmupCompleted + 83;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return getbase64fortagArr;
        }
        throw null;
    }

    private getBase64ForTag(String str, int i) {
    }

    static {
        getBase64ForTag[] getbase64fortagArr$values = $values();
        $VALUES = getbase64fortagArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(getbase64fortagArr$values);
        int i = IAuthTabCallback + 103;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }
}
