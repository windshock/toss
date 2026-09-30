package o;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class clearNavigationBar {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ clearNavigationBar[] $VALUES;
    public static final onExtraCallback Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private int type;
    public static final clearNavigationBar BANK = new clearNavigationBar("BANK", 0, 0);
    public static final clearNavigationBar STOCKFIRM = new clearNavigationBar("STOCKFIRM", 1, 1);

    private static final /* synthetic */ clearNavigationBar[] $values() {
        clearNavigationBar[] clearnavigationbarArr;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 41;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            clearnavigationbarArr = new clearNavigationBar[]{STOCKFIRM, BANK};
        } else {
            clearnavigationbarArr = new clearNavigationBar[]{BANK, STOCKFIRM};
        }
        int i4 = i2 + 37;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return clearnavigationbarArr;
    }

    public static EnumEntries<clearNavigationBar> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static clearNavigationBar valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        clearNavigationBar clearnavigationbar = (clearNavigationBar) Enum.valueOf(clearNavigationBar.class, str);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onNavigationEvent + 115;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return clearnavigationbar;
    }

    public static clearNavigationBar[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        clearNavigationBar[] clearnavigationbarArr = $VALUES;
        if (i3 == 0) {
            return (clearNavigationBar[]) clearnavigationbarArr.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private clearNavigationBar(String str, int i, int i2) {
        this.type = i2;
    }

    public final int getType() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.type;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setType(int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 57;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        this.type = i;
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        clearNavigationBar[] clearnavigationbarArr$values = $values();
        $VALUES = clearnavigationbarArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(clearnavigationbarArr$values);
        Companion = new onExtraCallback(null);
        int i = onExtraCallbackWithResult + 21;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 68 / 0;
        }
    }

    public static final class onExtraCallback {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final clearNavigationBar onNavigationEvent(int i) {
            clearNavigationBar[] clearnavigationbarArrValues;
            int length;
            int i2;
            clearNavigationBar clearnavigationbar;
            int i3 = 2 % 2;
            int i4 = IAuthTabCallback + 31;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                clearnavigationbarArrValues = clearNavigationBar.values();
                length = clearnavigationbarArrValues.length;
                i2 = 1;
            } else {
                clearnavigationbarArrValues = clearNavigationBar.values();
                length = clearnavigationbarArrValues.length;
                i2 = 0;
            }
            while (i2 < length) {
                int i5 = IAuthTabCallback + 111;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    clearnavigationbar = clearnavigationbarArrValues[i2];
                    int i6 = 21 / 0;
                    if (clearnavigationbar.getType() == i) {
                        return clearnavigationbar;
                    }
                    i2++;
                    int i7 = onWarmupCompleted + 107;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                } else {
                    clearnavigationbar = clearnavigationbarArrValues[i2];
                    if (clearnavigationbar.getType() == i) {
                        return clearnavigationbar;
                    }
                    i2++;
                    int i72 = onWarmupCompleted + 107;
                    IAuthTabCallback = i72 % 128;
                    int i82 = i72 % 2;
                }
            }
            return null;
        }
    }
}
