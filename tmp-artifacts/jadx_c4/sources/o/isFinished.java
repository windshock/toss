package o;

import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class isFinished {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ isFinished[] $VALUES;
    public static final onExtraCallbackWithResult Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public static final isFinished HIGH = new isFinished("HIGH", 0);
    public static final isFinished MEDIUM = new isFinished("MEDIUM", 1);
    public static final isFinished LOW = new isFinished("LOW", 2);

    public static final /* synthetic */ class onNavigationEvent {
        private static int onExtraCallback = 1;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        private static int onWarmupCompleted;

        static {
            int[] iArr = new int[isFinished.values().length];
            try {
                iArr[isFinished.HIGH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[isFinished.MEDIUM.ordinal()] = 2;
                int i = onExtraCallback + 125;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[isFinished.LOW.ordinal()] = 3;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            onExtraCallbackWithResult = iArr;
            int i5 = onWarmupCompleted + 37;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    private static final /* synthetic */ isFinished[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onWarmupCompleted = i2 % 128;
        return new isFinished[]{HIGH, i2 % 2 == 0 ? MEDIUM : MEDIUM, LOW};
    }

    public static EnumEntries<isFinished> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        EnumEntries<isFinished> enumEntries = $ENTRIES;
        int i4 = i3 + 53;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 73 / 0;
        }
        return enumEntries;
    }

    public static isFinished valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        isFinished isfinished = (isFinished) Enum.valueOf(isFinished.class, str);
        if (i3 == 0) {
            int i4 = 20 / 0;
        }
        return isfinished;
    }

    public static isFinished[] values() {
        isFinished[] isfinishedArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            isfinishedArr = (isFinished[]) $VALUES.clone();
            int i3 = 97 / 0;
        } else {
            isfinishedArr = (isFinished[]) $VALUES.clone();
        }
        int i4 = IAuthTabCallback + 41;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return isfinishedArr;
    }

    private isFinished(String str, int i) {
    }

    static {
        isFinished[] isfinishedArr$values = $values();
        $VALUES = isfinishedArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(isfinishedArr$values);
        Companion = new onExtraCallbackWithResult(null);
        int i = onExtraCallback + 73;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 76 / 0;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final int getAdvertisingMode() throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onNavigationEvent.onExtraCallbackWithResult[ordinal()];
        if (i2 == 1) {
            return 2;
        }
        if (i2 == 2) {
            int i3 = onWarmupCompleted + 55;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return 1;
            }
            throw null;
        }
        int i4 = IAuthTabCallback + 49;
        int i5 = i4 % 128;
        onWarmupCompleted = i5;
        int i6 = i4 % 2;
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        int i7 = i5 + 69;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final int getTxPowerLevel() throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onNavigationEvent.onExtraCallbackWithResult[ordinal()];
        if (i2 == 1) {
            return 3;
        }
        if (i2 == 2) {
            return 2;
        }
        int i3 = IAuthTabCallback;
        int i4 = i3 + 61;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0 ? i2 != 3 : i2 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        int i5 = i3 + 15;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return 1;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final int getScanMode() throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int i4 = onNavigationEvent.onExtraCallbackWithResult[ordinal()];
        if (i4 == 1) {
            return 2;
        }
        if (i4 == 2) {
            return 1;
        }
        int i5 = IAuthTabCallback + 105;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            if (i4 == 5) {
                return 0;
            }
        } else if (i4 == 3) {
            return 0;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final class onExtraCallbackWithResult {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final isFinished onWarmupCompleted(@NotNull String str) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            int iHashCode = lowerCase.hashCode();
            if (iHashCode != -1078030475) {
                if (iHashCode != 107348) {
                    if (iHashCode == 3202466 && lowerCase.equals("high")) {
                        return isFinished.HIGH;
                    }
                } else if (!(!lowerCase.equals("low"))) {
                    int i2 = onExtraCallbackWithResult + 61;
                    onExtraCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        return isFinished.LOW;
                    }
                    int i3 = 14 / 0;
                    return isFinished.LOW;
                }
            } else if (lowerCase.equals("medium")) {
                isFinished isfinished = isFinished.MEDIUM;
                int i4 = onExtraCallback + 89;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return isfinished;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            return isFinished.MEDIUM;
        }
    }
}
