package o;

import im.toss.features.loan.ui.R;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class computeCheckSum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ computeCheckSum[] $VALUES;
    public static final computeCheckSum NOT = new computeCheckSum("NOT", 0, R.string.loan_ui_not_have_it, "99");
    public static final computeCheckSum OWNING = new computeCheckSum("OWNING", 1, R.string.loan_ui_have_it, "01");
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final int displayText;
    private final String value;

    private static final /* synthetic */ computeCheckSum[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        computeCheckSum[] computechecksumArr = {NOT, OWNING};
        int i5 = i3 + 61;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 33 / 0;
        }
        return computechecksumArr;
    }

    public static EnumEntries<computeCheckSum> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        EnumEntries<computeCheckSum> enumEntries = $ENTRIES;
        int i5 = i3 + 7;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 62 / 0;
        }
        return enumEntries;
    }

    public static computeCheckSum valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        computeCheckSum computechecksum = (computeCheckSum) Enum.valueOf(computeCheckSum.class, str);
        int i4 = onExtraCallbackWithResult + 39;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return computechecksum;
        }
        throw null;
    }

    public static computeCheckSum[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        computeCheckSum[] computechecksumArr = (computeCheckSum[]) $VALUES.clone();
        int i4 = onNavigationEvent + 43;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return computechecksumArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private computeCheckSum(String str, int i, int i2, String str2) {
        this.displayText = i2;
        this.value = str2;
    }

    public final int getDisplayText() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        int i5 = this.displayText;
        int i6 = i3 + 113;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getValue() {
        String str;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            str = this.value;
            int i4 = 76 / 0;
        } else {
            str = this.value;
        }
        int i5 = i3 + 5;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        computeCheckSum[] computechecksumArr$values = $values();
        $VALUES = computechecksumArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(computechecksumArr$values);
        int i = onExtraCallback + 55;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }
}
