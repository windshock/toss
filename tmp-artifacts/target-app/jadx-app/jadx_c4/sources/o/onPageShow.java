package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class onPageShow {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ onPageShow[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String id;
    private final String localizedName;
    public static final onPageShow CAMERA = new onPageShow("CAMERA", 0, "android.permission.CAMERA", "카메라");
    public static final onPageShow READ_CONTACTS = new onPageShow("READ_CONTACTS", 1, "android.permission.READ_CONTACTS", "연락처");
    public static final onPageShow FINE_LOCATION = new onPageShow("FINE_LOCATION", 2, "android.permission.ACCESS_FINE_LOCATION", "위치");
    public static final onPageShow WRITE_STORAGE = new onPageShow("WRITE_STORAGE", 3, "android.permission.WRITE_EXTERNAL_STORAGE", "저장공간");

    private static final /* synthetic */ onPageShow[] $values() {
        onPageShow[] onpageshowArr;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            onPageShow onpageshow = CAMERA;
            onPageShow onpageshow2 = READ_CONTACTS;
            onPageShow onpageshow3 = FINE_LOCATION;
            onPageShow onpageshow4 = WRITE_STORAGE;
            onpageshowArr = new onPageShow[4];
            onpageshowArr[0] = onpageshow;
            onpageshowArr[0] = onpageshow2;
            onpageshowArr[5] = onpageshow3;
            onpageshowArr[5] = onpageshow4;
        } else {
            onpageshowArr = new onPageShow[]{CAMERA, READ_CONTACTS, FINE_LOCATION, WRITE_STORAGE};
        }
        int i4 = i3 + 89;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return onpageshowArr;
    }

    public static EnumEntries<onPageShow> getEntries() {
        EnumEntries<onPageShow> enumEntries;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 87;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            enumEntries = $ENTRIES;
            int i4 = 97 / 0;
        } else {
            enumEntries = $ENTRIES;
        }
        int i5 = i2 + 59;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 76 / 0;
        }
        return enumEntries;
    }

    public static onPageShow valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onPageShow onpageshow = (onPageShow) Enum.valueOf(onPageShow.class, str);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onWarmupCompleted + 59;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 56 / 0;
        }
        return onpageshow;
    }

    public static onPageShow[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onPageShow[] onpageshowArr = (onPageShow[]) $VALUES.clone();
        int i4 = onNavigationEvent + 59;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 44 / 0;
        }
        return onpageshowArr;
    }

    private onPageShow(String str, int i, String str2, String str3) {
        this.id = str2;
        this.localizedName = str3;
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.id;
        int i5 = i3 + 15;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getLocalizedName() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.localizedName;
        int i5 = i3 + 21;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    static {
        onPageShow[] onpageshowArr$values = $values();
        $VALUES = onpageshowArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(onpageshowArr$values);
        int i = onExtraCallbackWithResult + 61;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
