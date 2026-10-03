package o;

import java.util.Locale;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getPadBits {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ getPadBits[] $VALUES;
    public static final onWarmupCompleted Companion;
    public static final getPadBits DEPOSIT_1WON = new getPadBits("DEPOSIT_1WON", 0);
    public static final getPadBits OPEN_BANKING = new getPadBits("OPEN_BANKING", 1);
    public static final getPadBits MYDATA = new getPadBits("MYDATA", 2);

    private static final /* synthetic */ getPadBits[] $values() {
        return new getPadBits[]{DEPOSIT_1WON, OPEN_BANKING, MYDATA};
    }

    public static EnumEntries<getPadBits> getEntries() {
        return $ENTRIES;
    }

    public static getPadBits valueOf(String str) {
        return (getPadBits) Enum.valueOf(getPadBits.class, str);
    }

    public static getPadBits[] values() {
        return (getPadBits[]) $VALUES.clone();
    }

    private getPadBits(String str, int i) {
    }

    static {
        getPadBits[] getpadbitsArr$values = $values();
        $VALUES = getpadbitsArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(getpadbitsArr$values);
        Companion = new onWarmupCompleted(null);
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final getPadBits onNavigationEvent(@Nullable String str) {
            for (getPadBits getpadbits : getPadBits.values()) {
                String strName = getpadbits.name();
                String upperCase = (str == null ? "" : str).toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "");
                if (Intrinsics.areEqual(strName, upperCase)) {
                    return getpadbits;
                }
            }
            return null;
        }
    }
}
