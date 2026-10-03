package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class setIconSizeDp {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ setIconSizeDp[] $VALUES;
    public static final onExtraCallbackWithResult Companion;
    public static final setIconSizeDp Dismissed = new setIconSizeDp("Dismissed", 0);
    public static final setIconSizeDp Half = new setIconSizeDp("Half", 1);
    public static final setIconSizeDp Compact = new setIconSizeDp("Compact", 2);
    public static final setIconSizeDp Fullscreen = new setIconSizeDp("Fullscreen", 3);

    private static final /* synthetic */ setIconSizeDp[] $values() {
        return new setIconSizeDp[]{Dismissed, Half, Compact, Fullscreen};
    }

    public static EnumEntries<setIconSizeDp> getEntries() {
        return $ENTRIES;
    }

    public static setIconSizeDp valueOf(String str) {
        return (setIconSizeDp) Enum.valueOf(setIconSizeDp.class, str);
    }

    public static setIconSizeDp[] values() {
        return (setIconSizeDp[]) $VALUES.clone();
    }

    private setIconSizeDp(String str, int i) {
    }

    static {
        setIconSizeDp[] seticonsizedpArr$values = $values();
        $VALUES = seticonsizedpArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(seticonsizedpArr$values);
        Companion = new onExtraCallbackWithResult(null);
    }

    public static final class onExtraCallbackWithResult {

        public static final /* synthetic */ class onWarmupCompleted {
            public static final /* synthetic */ int[] onExtraCallbackWithResult;

            static {
                int[] iArr = new int[getAdExperienceType.values().length];
                try {
                    iArr[getAdExperienceType.Half.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[getAdExperienceType.Compact.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                onExtraCallbackWithResult = iArr;
            }
        }

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final setIconSizeDp onExtraCallbackWithResult(@NotNull getAdExperienceType getadexperiencetype) throws NoWhenBranchMatchedException {
            Intrinsics.checkNotNullParameter(getadexperiencetype, "");
            int i = onWarmupCompleted.onExtraCallbackWithResult[getadexperiencetype.ordinal()];
            if (i == 1) {
                return setIconSizeDp.Half;
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return setIconSizeDp.Compact;
        }
    }
}
