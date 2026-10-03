package o;

import java.util.Locale;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getAdExperienceType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ getAdExperienceType[] $VALUES;
    public static final onExtraCallbackWithResult Companion;
    public static final String QUERY_KEY = "size";
    public static final getAdExperienceType Half = new getAdExperienceType("Half", 0);
    public static final getAdExperienceType Compact = new getAdExperienceType("Compact", 1);

    private static final /* synthetic */ getAdExperienceType[] $values() {
        return new getAdExperienceType[]{Half, Compact};
    }

    public static EnumEntries<getAdExperienceType> getEntries() {
        return $ENTRIES;
    }

    public static getAdExperienceType valueOf(String str) {
        return (getAdExperienceType) Enum.valueOf(getAdExperienceType.class, str);
    }

    public static getAdExperienceType[] values() {
        return (getAdExperienceType[]) $VALUES.clone();
    }

    private getAdExperienceType(String str, int i) {
    }

    static {
        getAdExperienceType[] getadexperiencetypeArr$values = $values();
        $VALUES = getadexperiencetypeArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(getadexperiencetypeArr$values);
        Companion = new onExtraCallbackWithResult(null);
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final getAdExperienceType onExtraCallbackWithResult(@Nullable String str) {
            String lowerCase;
            String string;
            if (str == null || (string = StringsKt.trim(str).toString()) == null) {
                lowerCase = null;
            } else {
                lowerCase = string.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            }
            return Intrinsics.areEqual(lowerCase, "compact") ? getAdExperienceType.Compact : getAdExperienceType.Half;
        }
    }
}
