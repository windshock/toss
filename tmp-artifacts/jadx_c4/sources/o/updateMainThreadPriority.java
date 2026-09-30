package o;

import java.util.Locale;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class updateMainThreadPriority {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ updateMainThreadPriority[] $VALUES;
    public static final onWarmupCompleted Companion;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public static final updateMainThreadPriority CARD = new updateMainThreadPriority("CARD", 0);
    public static final updateMainThreadPriority LOAN = new updateMainThreadPriority("LOAN", 1);

    private static final /* synthetic */ updateMainThreadPriority[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        updateMainThreadPriority[] updatemainthreadpriorityArr = {CARD, LOAN};
        int i5 = i3 + 65;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 27 / 0;
        }
        return updatemainthreadpriorityArr;
    }

    public static EnumEntries<updateMainThreadPriority> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 13;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<updateMainThreadPriority> enumEntries = $ENTRIES;
        int i5 = i2 + 17;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static updateMainThreadPriority valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        updateMainThreadPriority updatemainthreadpriority = (updateMainThreadPriority) Enum.valueOf(updateMainThreadPriority.class, str);
        if (i3 == 0) {
            int i4 = 20 / 0;
        }
        int i5 = onWarmupCompleted + 37;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 7 / 0;
        }
        return updatemainthreadpriority;
    }

    public static updateMainThreadPriority[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        updateMainThreadPriority[] updatemainthreadpriorityArr = (updateMainThreadPriority[]) $VALUES.clone();
        int i3 = onNavigationEvent + 119;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return updatemainthreadpriorityArr;
    }

    private updateMainThreadPriority(String str, int i) {
    }

    static {
        updateMainThreadPriority[] updatemainthreadpriorityArr$values = $values();
        $VALUES = updatemainthreadpriorityArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(updatemainthreadpriorityArr$values);
        Companion = new onWarmupCompleted(null);
        int i = onExtraCallbackWithResult + 109;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public static final class onWarmupCompleted {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final updateMainThreadPriority IAuthTabCallback(@Nullable String str) {
            String lowerCase;
            int i = 2 % 2;
            if (str != null) {
                int i2 = onExtraCallback + 27;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                lowerCase = str.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            } else {
                lowerCase = null;
            }
            if (Intrinsics.areEqual(lowerCase, "card")) {
                return updateMainThreadPriority.CARD;
            }
            if (!Intrinsics.areEqual(lowerCase, "loan")) {
                return null;
            }
            updateMainThreadPriority updatemainthreadpriority = updateMainThreadPriority.LOAN;
            int i4 = onWarmupCompleted + 115;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return updatemainthreadpriority;
        }
    }
}
