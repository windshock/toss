package o;

import java.util.Iterator;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class drawTextProgress {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ drawTextProgress[] $VALUES;
    public static final onExtraCallback Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String code;
    public static final drawTextProgress SESSION_BASED = new drawTextProgress("SESSION_BASED", 0, "S");
    public static final drawTextProgress MANUAL = new drawTextProgress("MANUAL", 1, "M");
    public static final drawTextProgress FALLBACK = new drawTextProgress("FALLBACK", 2, "F");
    public static final drawTextProgress TAIL_BASED = new drawTextProgress("TAIL_BASED", 3, "T");

    private static final /* synthetic */ drawTextProgress[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        drawTextProgress drawtextprogress = SESSION_BASED;
        if (i3 != 0) {
            return new drawTextProgress[]{drawtextprogress, MANUAL, FALLBACK, TAIL_BASED};
        }
        drawTextProgress drawtextprogress2 = MANUAL;
        drawTextProgress drawtextprogress3 = FALLBACK;
        drawTextProgress drawtextprogress4 = TAIL_BASED;
        drawTextProgress[] drawtextprogressArr = new drawTextProgress[4];
        drawtextprogressArr[0] = drawtextprogress;
        drawtextprogressArr[0] = drawtextprogress2;
        drawtextprogressArr[3] = drawtextprogress3;
        drawtextprogressArr[5] = drawtextprogress4;
        return drawtextprogressArr;
    }

    public static EnumEntries<drawTextProgress> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        EnumEntries<drawTextProgress> enumEntries = $ENTRIES;
        int i5 = i3 + 5;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return enumEntries;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static drawTextProgress valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        drawTextProgress drawtextprogress = (drawTextProgress) Enum.valueOf(drawTextProgress.class, str);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallback + 39;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return drawtextprogress;
    }

    public static drawTextProgress[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        drawTextProgress[] drawtextprogressArr = (drawTextProgress[]) $VALUES.clone();
        int i4 = IAuthTabCallback + 75;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return drawtextprogressArr;
    }

    private drawTextProgress(String str, int i, String str2) {
        this.code = str2;
    }

    public final String getCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.code;
        int i5 = i3 + 3;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        drawTextProgress[] drawtextprogressArr$values = $values();
        $VALUES = drawtextprogressArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(drawtextprogressArr$values);
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallback(defaultConstructorMarker);
        int i = onNavigationEvent + 15;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static final class onExtraCallback {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final drawTextProgress onExtraCallback(@NotNull String str) {
            Object next;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 77;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Iterator it = drawTextProgress.getEntries().iterator();
            int i4 = onExtraCallback + 55;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (!(true ^ Intrinsics.areEqual(((drawTextProgress) next).getCode(), str))) {
                    int i6 = onExtraCallbackWithResult + 93;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    break;
                }
            }
            return (drawTextProgress) next;
        }
    }
}
