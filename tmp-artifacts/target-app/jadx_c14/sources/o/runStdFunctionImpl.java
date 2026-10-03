package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class runStdFunctionImpl {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ runStdFunctionImpl[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public static final runStdFunctionImpl DEPOSIT = new runStdFunctionImpl("DEPOSIT", 0);
    public static final runStdFunctionImpl WITHDRAW = new runStdFunctionImpl("WITHDRAW", 1);

    private static final /* synthetic */ runStdFunctionImpl[] $values() {
        runStdFunctionImpl[] runstdfunctionimplArr;
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 39;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            runStdFunctionImpl runstdfunctionimpl = DEPOSIT;
            runStdFunctionImpl runstdfunctionimpl2 = WITHDRAW;
            runstdfunctionimplArr = new runStdFunctionImpl[4];
            runstdfunctionimplArr[1] = runstdfunctionimpl;
            runstdfunctionimplArr[1] = runstdfunctionimpl2;
        } else {
            runstdfunctionimplArr = new runStdFunctionImpl[]{DEPOSIT, WITHDRAW};
        }
        int i4 = i2 + 17;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 18 / 0;
        }
        return runstdfunctionimplArr;
    }

    public static EnumEntries<runStdFunctionImpl> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 13;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<runStdFunctionImpl> enumEntries = $ENTRIES;
        int i5 = i2 + 55;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return enumEntries;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static runStdFunctionImpl valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        runStdFunctionImpl runstdfunctionimpl = (runStdFunctionImpl) Enum.valueOf(runStdFunctionImpl.class, str);
        int i4 = IAuthTabCallback + 75;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return runstdfunctionimpl;
        }
        throw null;
    }

    public static runStdFunctionImpl[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 83;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        runStdFunctionImpl[] runstdfunctionimplArr = $VALUES;
        if (i3 != 0) {
            return (runStdFunctionImpl[]) runstdfunctionimplArr.clone();
        }
        throw null;
    }

    private runStdFunctionImpl(String str, int i) {
    }

    static {
        runStdFunctionImpl[] runstdfunctionimplArr$values = $values();
        $VALUES = runstdfunctionimplArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(runstdfunctionimplArr$values);
        int i = onExtraCallbackWithResult + 107;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            int i2 = 70 / 0;
        }
    }
}
