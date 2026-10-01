package o;

import com.google.gson.annotations.SerializedName;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RoundedDrawable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RoundedDrawable[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;

    @SerializedName("UNIT_CHARGE")
    public static final RoundedDrawable UNIT_CHARGE = new RoundedDrawable("UNIT_CHARGE", 0);

    @SerializedName("MONEY_BACK_TYPE")
    public static final RoundedDrawable MONEY_BACK_TYPE = new RoundedDrawable("MONEY_BACK_TYPE", 1);

    @SerializedName("NONE")
    public static final RoundedDrawable NONE = new RoundedDrawable("NONE", 2);

    private static final /* synthetic */ RoundedDrawable[] $values() {
        RoundedDrawable[] roundedDrawableArr;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 9;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            RoundedDrawable roundedDrawable = UNIT_CHARGE;
            RoundedDrawable roundedDrawable2 = MONEY_BACK_TYPE;
            RoundedDrawable roundedDrawable3 = NONE;
            roundedDrawableArr = new RoundedDrawable[3];
            roundedDrawableArr[1] = roundedDrawable;
            roundedDrawableArr[1] = roundedDrawable2;
            roundedDrawableArr[3] = roundedDrawable3;
        } else {
            roundedDrawableArr = new RoundedDrawable[]{UNIT_CHARGE, MONEY_BACK_TYPE, NONE};
        }
        int i4 = i2 + 109;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return roundedDrawableArr;
    }

    public static EnumEntries<RoundedDrawable> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        throw null;
    }

    public static RoundedDrawable valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        RoundedDrawable roundedDrawable = (RoundedDrawable) Enum.valueOf(RoundedDrawable.class, str);
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 5;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return roundedDrawable;
        }
        throw null;
    }

    public static RoundedDrawable[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        RoundedDrawable[] roundedDrawableArr = (RoundedDrawable[]) $VALUES.clone();
        int i4 = onExtraCallbackWithResult + 85;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return roundedDrawableArr;
    }

    private RoundedDrawable(String str, int i) {
    }

    static {
        RoundedDrawable[] roundedDrawableArr$values = $values();
        $VALUES = roundedDrawableArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(roundedDrawableArr$values);
        int i = IAuthTabCallback + 21;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }
}
