package o;

import java.util.Locale;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setCompletableProgress {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ setCompletableProgress[] $VALUES;
    public static final IAuthTabCallback Companion;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String shorten;
    public static final setCompletableProgress FOREGROUND = new setCompletableProgress("FOREGROUND", 0, "FG");
    public static final setCompletableProgress BACKGROUND = new setCompletableProgress("BACKGROUND", 1, "BG");

    private static final /* synthetic */ setCompletableProgress[] $values() {
        setCompletableProgress[] setcompletableprogressArr;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 3;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            setCompletableProgress setcompletableprogress = FOREGROUND;
            setCompletableProgress setcompletableprogress2 = BACKGROUND;
            setcompletableprogressArr = new setCompletableProgress[5];
            setcompletableprogressArr[1] = setcompletableprogress;
            setcompletableprogressArr[1] = setcompletableprogress2;
        } else {
            setcompletableprogressArr = new setCompletableProgress[]{FOREGROUND, BACKGROUND};
        }
        int i4 = i2 + 69;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 30 / 0;
        }
        return setcompletableprogressArr;
    }

    public static EnumEntries<setCompletableProgress> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        EnumEntries<setCompletableProgress> enumEntries = $ENTRIES;
        int i5 = i3 + 75;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return enumEntries;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static setCompletableProgress valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setCompletableProgress setcompletableprogress = (setCompletableProgress) Enum.valueOf(setCompletableProgress.class, str);
        if (i3 == 0) {
            int i4 = 79 / 0;
        }
        int i5 = onExtraCallbackWithResult + 25;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return setcompletableprogress;
    }

    public static setCompletableProgress[] values() {
        setCompletableProgress[] setcompletableprogressArr;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            setcompletableprogressArr = (setCompletableProgress[]) $VALUES.clone();
            int i3 = 85 / 0;
        } else {
            setcompletableprogressArr = (setCompletableProgress[]) $VALUES.clone();
        }
        int i4 = onExtraCallbackWithResult + 35;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 72 / 0;
        }
        return setcompletableprogressArr;
    }

    private setCompletableProgress(String str, int i, String str2) {
        this.shorten = str2;
    }

    public final String getShorten() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.shorten;
        int i4 = i3 + 5;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    static {
        setCompletableProgress[] setcompletableprogressArr$values = $values();
        $VALUES = setcompletableprogressArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(setcompletableprogressArr$values);
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new IAuthTabCallback(defaultConstructorMarker);
        int i = onExtraCallback + 97;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static final class IAuthTabCallback {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public final setCompletableProgress onNavigationEvent(@NotNull String str) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            Intrinsics.checkNotNullExpressionValue(str.toUpperCase(locale), "");
            if (!Intrinsics.areEqual(r4, "FG")) {
                setCompletableProgress setcompletableprogress = setCompletableProgress.BACKGROUND;
                int i2 = onWarmupCompleted + 21;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return setcompletableprogress;
            }
            int i4 = onWarmupCompleted + 23;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return setCompletableProgress.FOREGROUND;
            }
            setCompletableProgress setcompletableprogress2 = setCompletableProgress.FOREGROUND;
            throw null;
        }
    }
}
