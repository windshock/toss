package o;

import com.google.gson.annotations.SerializedName;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class get2BytesAsInt {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ get2BytesAsInt[] $VALUES;
    private static int IAuthTabCallback = 1;

    @SerializedName("TOSS_BANK")
    public static final get2BytesAsInt TOSS_BANK = new get2BytesAsInt("TOSS_BANK", 0);

    @SerializedName("TOSS_SECURITIES")
    public static final get2BytesAsInt TOSS_SECURITIES = new get2BytesAsInt("TOSS_SECURITIES", 1);
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    private static final /* synthetic */ get2BytesAsInt[] $values() {
        get2BytesAsInt[] get2bytesasintArr;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 7;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            get2BytesAsInt get2bytesasint = TOSS_BANK;
            get2BytesAsInt get2bytesasint2 = TOSS_SECURITIES;
            get2bytesasintArr = new get2BytesAsInt[5];
            get2bytesasintArr[1] = get2bytesasint;
            get2bytesasintArr[0] = get2bytesasint2;
        } else {
            get2bytesasintArr = new get2BytesAsInt[]{TOSS_BANK, TOSS_SECURITIES};
        }
        int i4 = i2 + 59;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return get2bytesasintArr;
    }

    public static EnumEntries<get2BytesAsInt> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        EnumEntries<get2BytesAsInt> enumEntries = $ENTRIES;
        int i5 = i3 + 91;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return enumEntries;
        }
        throw null;
    }

    public static get2BytesAsInt valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        get2BytesAsInt get2bytesasint = (get2BytesAsInt) Enum.valueOf(get2BytesAsInt.class, str);
        if (i3 == 0) {
            int i4 = 25 / 0;
        }
        return get2bytesasint;
    }

    public static get2BytesAsInt[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        get2BytesAsInt[] get2bytesasintArr = $VALUES;
        if (i3 == 0) {
            return (get2BytesAsInt[]) get2bytesasintArr.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private get2BytesAsInt(String str, int i) {
    }

    static {
        get2BytesAsInt[] get2bytesasintArr$values = $values();
        $VALUES = get2bytesasintArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(get2bytesasintArr$values);
        int i = IAuthTabCallback + 57;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }
}
