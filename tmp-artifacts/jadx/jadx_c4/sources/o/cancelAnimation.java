package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
final class cancelAnimation {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ cancelAnimation[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;
    public static final cancelAnimation TopBar = new cancelAnimation("TopBar", 0);
    public static final cancelAnimation MainContent = new cancelAnimation("MainContent", 1);
    public static final cancelAnimation Snackbar = new cancelAnimation("Snackbar", 2);
    public static final cancelAnimation Fab = new cancelAnimation("Fab", 3);
    public static final cancelAnimation BottomBar = new cancelAnimation("BottomBar", 4);

    private static final /* synthetic */ cancelAnimation[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        cancelAnimation[] cancelanimationArr = {TopBar, MainContent, Snackbar, Fab, BottomBar};
        int i5 = i3 + 3;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return cancelanimationArr;
    }

    public static EnumEntries<cancelAnimation> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        EnumEntries<cancelAnimation> enumEntries = $ENTRIES;
        int i4 = i3 + 63;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return enumEntries;
    }

    public static cancelAnimation valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        cancelAnimation cancelanimation = (cancelAnimation) Enum.valueOf(cancelAnimation.class, str);
        int i4 = onExtraCallback + 121;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return cancelanimation;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static cancelAnimation[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        cancelAnimation[] cancelanimationArr = $VALUES;
        if (i3 == 0) {
            return (cancelAnimation[]) cancelanimationArr.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        cancelAnimation[] cancelanimationArr$values = $values();
        $VALUES = cancelanimationArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(cancelanimationArr$values);
        int i = IAuthTabCallback + 7;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private cancelAnimation(String str, int i) {
    }
}
