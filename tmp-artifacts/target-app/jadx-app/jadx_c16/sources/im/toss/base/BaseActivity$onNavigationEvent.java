package im.toss.base;

import kotlin.enums.EnumEntries;
import o.access15300;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class BaseActivity$onNavigationEvent {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BaseActivity$onNavigationEvent[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public static final BaseActivity$onNavigationEvent NO_REDIRECT = new BaseActivity$onNavigationEvent("NO_REDIRECT", 0);
    public static final BaseActivity$onNavigationEvent FINISH_CURRENT_WITH_BACKSTACK_THEN_REDIRECT = new BaseActivity$onNavigationEvent("FINISH_CURRENT_WITH_BACKSTACK_THEN_REDIRECT", 1);
    public static final BaseActivity$onNavigationEvent LAZY_REDIRECT = new BaseActivity$onNavigationEvent("LAZY_REDIRECT", 2);

    private static final /* synthetic */ BaseActivity$onNavigationEvent[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        BaseActivity$onNavigationEvent[] baseActivity$onNavigationEventArr = {NO_REDIRECT, FINISH_CURRENT_WITH_BACKSTACK_THEN_REDIRECT, LAZY_REDIRECT};
        int i5 = i3 + 37;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return baseActivity$onNavigationEventArr;
        }
        throw null;
    }

    public static EnumEntries<BaseActivity$onNavigationEvent> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        EnumEntries<BaseActivity$onNavigationEvent> enumEntries = $ENTRIES;
        int i5 = i3 + 21;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static BaseActivity$onNavigationEvent valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        BaseActivity$onNavigationEvent baseActivity$onNavigationEvent = (BaseActivity$onNavigationEvent) Enum.valueOf(BaseActivity$onNavigationEvent.class, str);
        int i4 = onExtraCallbackWithResult + 29;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return baseActivity$onNavigationEvent;
    }

    public static BaseActivity$onNavigationEvent[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        BaseActivity$onNavigationEvent[] baseActivity$onNavigationEventArr = $VALUES;
        if (i3 != 0) {
            return (BaseActivity$onNavigationEvent[]) baseActivity$onNavigationEventArr.clone();
        }
        throw null;
    }

    private BaseActivity$onNavigationEvent(String str, int i) {
    }

    static {
        BaseActivity$onNavigationEvent[] baseActivity$onNavigationEventArr$values = $values();
        $VALUES = baseActivity$onNavigationEventArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(baseActivity$onNavigationEventArr$values);
        int i = onNavigationEvent + 85;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }
}
