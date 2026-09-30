package o;

import com.google.gson.annotations.SerializedName;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class CppException {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CppException[] $VALUES;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    @SerializedName("TERMS")
    public static final CppException TERMS = new CppException("TERMS", 0);

    @SerializedName("GROUP")
    public static final CppException GROUP = new CppException("GROUP", 1);

    @SerializedName("OPTION")
    public static final CppException OPTION = new CppException("OPTION", 2);

    @SerializedName("SECTION")
    public static final CppException SECTION = new CppException("SECTION", 3);

    private static final /* synthetic */ CppException[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return new CppException[]{TERMS, GROUP, OPTION, SECTION};
        }
        CppException cppException = TERMS;
        CppException cppException2 = GROUP;
        CppException cppException3 = OPTION;
        CppException cppException4 = SECTION;
        CppException[] cppExceptionArr = new CppException[2];
        cppExceptionArr[0] = cppException;
        cppExceptionArr[0] = cppException2;
        cppExceptionArr[5] = cppException3;
        cppExceptionArr[5] = cppException4;
        return cppExceptionArr;
    }

    public static EnumEntries<CppException> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 119;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        EnumEntries<CppException> enumEntries = $ENTRIES;
        int i4 = i2 + 33;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return enumEntries;
    }

    public static CppException valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        CppException cppException = (CppException) Enum.valueOf(CppException.class, str);
        if (i3 != 0) {
            int i4 = 30 / 0;
        }
        return cppException;
    }

    public static CppException[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        CppException[] cppExceptionArr = (CppException[]) $VALUES.clone();
        int i4 = onExtraCallbackWithResult + 111;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return cppExceptionArr;
        }
        throw null;
    }

    private CppException(String str, int i) {
    }

    static {
        CppException[] cppExceptionArr$values = $values();
        $VALUES = cppExceptionArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(cppExceptionArr$values);
        int i = onNavigationEvent + 85;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }
}
