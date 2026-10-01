package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getContentView {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ getContentView[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public static final getContentView DEFAULT = new getContentView("DEFAULT", 0);
    public static final getContentView SMALL = new getContentView("SMALL", 1);
    public static final getContentView BOUNCE = new getContentView("BOUNCE", 2);

    private static final /* synthetic */ getContentView[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 101;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        getContentView[] getcontentviewArr = {DEFAULT, SMALL, BOUNCE};
        int i5 = i2 + 105;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return getcontentviewArr;
    }

    public static EnumEntries<getContentView> getEntries() {
        EnumEntries<getContentView> enumEntries;
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 1;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            enumEntries = $ENTRIES;
            int i4 = 18 / 0;
        } else {
            enumEntries = $ENTRIES;
        }
        int i5 = i2 + 111;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 17 / 0;
        }
        return enumEntries;
    }

    public static getContentView valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getContentView getcontentview = (getContentView) Enum.valueOf(getContentView.class, str);
        if (i3 == 0) {
            int i4 = 70 / 0;
        }
        return getcontentview;
    }

    public static getContentView[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getContentView[] getcontentviewArr = $VALUES;
        if (i3 != 0) {
            return (getContentView[]) getcontentviewArr.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private getContentView(String str, int i) {
    }

    static {
        getContentView[] getcontentviewArr$values = $values();
        $VALUES = getcontentviewArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(getcontentviewArr$values);
        int i = onWarmupCompleted + 25;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }
}
