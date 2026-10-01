package o;

import kotlin.Deprecated;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class maybeTrackAppOpenEvent {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ maybeTrackAppOpenEvent[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final String id;
    public static final maybeTrackAppOpenEvent DEPRECATED_OLD_PEDOMETER = new maybeTrackAppOpenEvent("DEPRECATED_OLD_PEDOMETER", 0, "만보기");
    public static final maybeTrackAppOpenEvent DEPRECATED_CHAT = new maybeTrackAppOpenEvent("DEPRECATED_CHAT", 1, "chat");
    public static final maybeTrackAppOpenEvent DEPRECATED_SILENT = new maybeTrackAppOpenEvent("DEPRECATED_SILENT", 2, "조용한 알림");

    private static final /* synthetic */ maybeTrackAppOpenEvent[] $values() {
        maybeTrackAppOpenEvent[] maybetrackappopeneventArr;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            maybeTrackAppOpenEvent maybetrackappopenevent = DEPRECATED_OLD_PEDOMETER;
            maybeTrackAppOpenEvent maybetrackappopenevent2 = DEPRECATED_CHAT;
            maybeTrackAppOpenEvent maybetrackappopenevent3 = DEPRECATED_SILENT;
            maybetrackappopeneventArr = new maybeTrackAppOpenEvent[4];
            maybetrackappopeneventArr[1] = maybetrackappopenevent;
            maybetrackappopeneventArr[1] = maybetrackappopenevent2;
            maybetrackappopeneventArr[3] = maybetrackappopenevent3;
        } else {
            maybetrackappopeneventArr = new maybeTrackAppOpenEvent[]{DEPRECATED_OLD_PEDOMETER, DEPRECATED_CHAT, DEPRECATED_SILENT};
        }
        int i4 = i3 + 73;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return maybetrackappopeneventArr;
    }

    public static EnumEntries<maybeTrackAppOpenEvent> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 11;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        EnumEntries<maybeTrackAppOpenEvent> enumEntries = $ENTRIES;
        int i4 = i2 + 79;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return enumEntries;
    }

    public static maybeTrackAppOpenEvent valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        maybeTrackAppOpenEvent maybetrackappopenevent = (maybeTrackAppOpenEvent) Enum.valueOf(maybeTrackAppOpenEvent.class, str);
        int i4 = IAuthTabCallback + 15;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 79 / 0;
        }
        return maybetrackappopenevent;
    }

    public static maybeTrackAppOpenEvent[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        maybeTrackAppOpenEvent[] maybetrackappopeneventArr = $VALUES;
        if (i3 == 0) {
            return (maybeTrackAppOpenEvent[]) maybetrackappopeneventArr.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private maybeTrackAppOpenEvent(String str, int i, String str2) {
        this.id = str2;
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 111;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.id;
        int i5 = i2 + 101;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        maybeTrackAppOpenEvent[] maybetrackappopeneventArr$values = $values();
        $VALUES = maybetrackappopeneventArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(maybetrackappopeneventArr$values);
        int i = onNavigationEvent + 15;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }
}
