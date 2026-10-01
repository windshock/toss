package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg[] $VALUES;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    public static final r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg Completed = new r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg("Completed", 0);
    public static final r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg Active = new r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg("Active", 1);
    public static final r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg Upcoming = new r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg("Upcoming", 2);

    private static final /* synthetic */ r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 103;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg[] r8lambdavmpxq_exjokn3zdd7dsrc7q0ydgArr = {Completed, Active, Upcoming};
        int i5 = i2 + 91;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 26 / 0;
        }
        return r8lambdavmpxq_exjokn3zdd7dsrc7q0ydgArr;
    }

    public static EnumEntries<r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg = (r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg) Enum.valueOf(r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg.class, str);
        int i4 = onExtraCallbackWithResult + 15;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg;
        }
        throw null;
    }

    public static r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg[] r8lambdavmpxq_exjokn3zdd7dsrc7q0ydgArr = (r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg[]) $VALUES.clone();
        int i4 = onWarmupCompleted + 73;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return r8lambdavmpxq_exjokn3zdd7dsrc7q0ydgArr;
    }

    private r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg(String str, int i) {
    }

    static {
        r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg[] r8lambdavmpxq_exjokn3zdd7dsrc7q0ydgArr$values = $values();
        $VALUES = r8lambdavmpxq_exjokn3zdd7dsrc7q0ydgArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(r8lambdavmpxq_exjokn3zdd7dsrc7q0ydgArr$values);
        int i = onExtraCallback + 59;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
