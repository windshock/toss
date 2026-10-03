package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class resolvedOptions {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ resolvedOptions[] $VALUES;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    public static final resolvedOptions ACCOUNT = new resolvedOptions("ACCOUNT", 0);
    public static final resolvedOptions CONSUMPTION = new resolvedOptions("CONSUMPTION", 1);
    public static final resolvedOptions INTELLIGENCE = new resolvedOptions("INTELLIGENCE", 2);
    public static final resolvedOptions STORE = new resolvedOptions("STORE", 3);
    public static final resolvedOptions DISCOVERY = new resolvedOptions("DISCOVERY", 4);
    public static final resolvedOptions BOTTOM_CTA = new resolvedOptions("BOTTOM_CTA", 5);
    public static final resolvedOptions BOTTOM_SHEET = new resolvedOptions("BOTTOM_SHEET", 6);
    public static final resolvedOptions CONSUMPTION_SUMMARY = new resolvedOptions("CONSUMPTION_SUMMARY", 7);
    public static final resolvedOptions CONSUMPTION_HISTORY = new resolvedOptions("CONSUMPTION_HISTORY", 8);
    public static final resolvedOptions CONSUMPTION_HISTORY_BOTTOM = new resolvedOptions("CONSUMPTION_HISTORY_BOTTOM", 9);
    public static final resolvedOptions MONTHLY_REGULAR = new resolvedOptions("MONTHLY_REGULAR", 10);
    public static final resolvedOptions CONSUMPTION_BY_CATEGORIES = new resolvedOptions("CONSUMPTION_BY_CATEGORIES", 11);
    public static final resolvedOptions TOSS_BANK = new resolvedOptions("TOSS_BANK", 12);
    public static final resolvedOptions NONE = new resolvedOptions("NONE", 13);

    private static final /* synthetic */ resolvedOptions[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 17;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        resolvedOptions[] resolvedoptionsArr = {ACCOUNT, CONSUMPTION, INTELLIGENCE, STORE, DISCOVERY, BOTTOM_CTA, BOTTOM_SHEET, CONSUMPTION_SUMMARY, CONSUMPTION_HISTORY, CONSUMPTION_HISTORY_BOTTOM, MONTHLY_REGULAR, CONSUMPTION_BY_CATEGORIES, TOSS_BANK, NONE};
        int i5 = i2 + 41;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 58 / 0;
        }
        return resolvedoptionsArr;
    }

    public static EnumEntries<resolvedOptions> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        EnumEntries<resolvedOptions> enumEntries = $ENTRIES;
        int i5 = i3 + 117;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static resolvedOptions valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        resolvedOptions resolvedoptions = (resolvedOptions) Enum.valueOf(resolvedOptions.class, str);
        if (i3 != 0) {
            return resolvedoptions;
        }
        throw null;
    }

    public static resolvedOptions[] values() {
        resolvedOptions[] resolvedoptionsArr;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 31;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            resolvedoptionsArr = (resolvedOptions[]) $VALUES.clone();
            int i3 = 73 / 0;
        } else {
            resolvedoptionsArr = (resolvedOptions[]) $VALUES.clone();
        }
        int i4 = onExtraCallbackWithResult + 35;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return resolvedoptionsArr;
        }
        throw null;
    }

    private resolvedOptions(String str, int i) {
    }

    static {
        resolvedOptions[] resolvedoptionsArr$values = $values();
        $VALUES = resolvedoptionsArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(resolvedoptionsArr$values);
        int i = onNavigationEvent + 7;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
