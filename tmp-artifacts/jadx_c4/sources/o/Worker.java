package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class Worker {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Worker[] $VALUES;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public static final Worker FOREGROUND = new Worker("FOREGROUND", 0);
    public static final Worker BACKGROUND = new Worker("BACKGROUND", 1);

    private static final /* synthetic */ Worker[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        Worker[] workerArr = {FOREGROUND, BACKGROUND};
        int i5 = i3 + 81;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return workerArr;
        }
        throw null;
    }

    public static EnumEntries<Worker> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 35;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        EnumEntries<Worker> enumEntries = $ENTRIES;
        int i4 = i2 + 39;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 34 / 0;
        }
        return enumEntries;
    }

    public static Worker valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Worker worker = (Worker) Enum.valueOf(Worker.class, str);
        int i4 = onExtraCallback + 33;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return worker;
    }

    public static Worker[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Worker[] workerArr = $VALUES;
        if (i3 == 0) {
            return (Worker[]) workerArr.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private Worker(String str, int i) {
    }

    static {
        Worker[] workerArr$values = $values();
        $VALUES = workerArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(workerArr$values);
        int i = onExtraCallbackWithResult + 109;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }
}
