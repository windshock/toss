package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getAppDataMetadata {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ getAppDataMetadata[] $VALUES;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String type;
    public static final getAppDataMetadata USER_TOUCHED = new getAppDataMetadata("USER_TOUCHED", 0, "userTouched");
    public static final getAppDataMetadata REPEAT_FINISHED = new getAppDataMetadata("REPEAT_FINISHED", 1, "repeatFinished");
    public static final getAppDataMetadata ETC = new getAppDataMetadata("ETC", 2, "etc");

    private static final /* synthetic */ getAppDataMetadata[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 109;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        getAppDataMetadata[] getappdatametadataArr = {USER_TOUCHED, REPEAT_FINISHED, ETC};
        int i5 = i2 + 7;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return getappdatametadataArr;
        }
        throw null;
    }

    public static EnumEntries<getAppDataMetadata> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 73;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<getAppDataMetadata> enumEntries = $ENTRIES;
        int i5 = i2 + 57;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static getAppDataMetadata valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getAppDataMetadata getappdatametadata = (getAppDataMetadata) Enum.valueOf(getAppDataMetadata.class, str);
        int i4 = onNavigationEvent + 33;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return getappdatametadata;
    }

    public static getAppDataMetadata[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getAppDataMetadata[] getappdatametadataArr = $VALUES;
        if (i3 != 0) {
            return (getAppDataMetadata[]) getappdatametadataArr.clone();
        }
        throw null;
    }

    private getAppDataMetadata(String str, int i, String str2) {
        this.type = str2;
    }

    public final String getType() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.type;
        int i5 = i3 + 75;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        getAppDataMetadata[] getappdatametadataArr$values = $values();
        $VALUES = getappdatametadataArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(getappdatametadataArr$values);
        int i = onExtraCallbackWithResult + 87;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 99 / 0;
        }
    }
}
