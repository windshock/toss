package im.toss.core.biometric.data;

import kotlin.enums.EnumEntries;
import o.access15300;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ResultStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ResultStatus[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public static final ResultStatus SUCCEEDED = new ResultStatus("SUCCEEDED", 0);
    public static final ResultStatus FAILED = new ResultStatus("FAILED", 1);
    public static final ResultStatus SELECTED_INPUT = new ResultStatus("SELECTED_INPUT", 2);
    public static final ResultStatus USER_CANCELLED = new ResultStatus("USER_CANCELLED", 3);

    private static final /* synthetic */ ResultStatus[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 69;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        ResultStatus[] resultStatusArr = {SUCCEEDED, FAILED, SELECTED_INPUT, USER_CANCELLED};
        int i5 = i2 + 123;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 50 / 0;
        }
        return resultStatusArr;
    }

    public static EnumEntries<ResultStatus> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        EnumEntries<ResultStatus> enumEntries = $ENTRIES;
        int i4 = i3 + 111;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return enumEntries;
    }

    public static ResultStatus valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 53;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ResultStatus resultStatus = (ResultStatus) Enum.valueOf(ResultStatus.class, str);
        int i4 = onExtraCallbackWithResult + 31;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 7 / 0;
        }
        return resultStatus;
    }

    public static ResultStatus[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ResultStatus[] resultStatusArr = (ResultStatus[]) $VALUES.clone();
        int i4 = onExtraCallback + 3;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return resultStatusArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ResultStatus(String str, int i) {
    }

    static {
        ResultStatus[] resultStatusArr$values = $values();
        $VALUES = resultStatusArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(resultStatusArr$values);
        int i = onNavigationEvent + 23;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 97 / 0;
        }
    }
}
