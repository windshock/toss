package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class setUseDecodeBufferHelper {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ setUseDecodeBufferHelper[] $VALUES;
    public static final onExtraCallback Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final int intVal;
    public static final setUseDecodeBufferHelper LOW = new setUseDecodeBufferHelper("LOW", 0, 1);
    public static final setUseDecodeBufferHelper NORMAL = new setUseDecodeBufferHelper("NORMAL", 1, 2);
    public static final setUseDecodeBufferHelper HIGH = new setUseDecodeBufferHelper("HIGH", 2, 3);
    public static final setUseDecodeBufferHelper CUSTOM = new setUseDecodeBufferHelper("CUSTOM", 3, 4);

    public static final /* synthetic */ class onNavigationEvent {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        static {
            int[] iArr = new int[setUseDecodeBufferHelper.values().length];
            try {
                iArr[setUseDecodeBufferHelper.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[setUseDecodeBufferHelper.NORMAL.ordinal()] = 2;
                int i = IAuthTabCallback + 53;
                onExtraCallback = i % 128;
                if (i % 2 == 0) {
                    int i2 = 5 / 2;
                } else {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[setUseDecodeBufferHelper.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[setUseDecodeBufferHelper.CUSTOM.ordinal()] = 4;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int i5 = onExtraCallback + 119;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static final /* synthetic */ setUseDecodeBufferHelper[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        setUseDecodeBufferHelper[] setusedecodebufferhelperArr = {LOW, NORMAL, HIGH, CUSTOM};
        int i5 = i3 + 1;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 73 / 0;
        }
        return setusedecodebufferhelperArr;
    }

    public static EnumEntries<setUseDecodeBufferHelper> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static setUseDecodeBufferHelper valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        setUseDecodeBufferHelper setusedecodebufferhelper = (setUseDecodeBufferHelper) Enum.valueOf(setUseDecodeBufferHelper.class, str);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallback + 41;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return setusedecodebufferhelper;
        }
        throw null;
    }

    public static setUseDecodeBufferHelper[] values() {
        setUseDecodeBufferHelper[] setusedecodebufferhelperArr;
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            setusedecodebufferhelperArr = (setUseDecodeBufferHelper[]) $VALUES.clone();
            int i3 = 33 / 0;
        } else {
            setusedecodebufferhelperArr = (setUseDecodeBufferHelper[]) $VALUES.clone();
        }
        int i4 = onExtraCallback + 23;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return setusedecodebufferhelperArr;
    }

    private setUseDecodeBufferHelper(String str, int i, int i2) {
        this.intVal = i2;
    }

    public final int getIntVal() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.intVal;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        setUseDecodeBufferHelper[] setusedecodebufferhelperArr$values = $values();
        $VALUES = setusedecodebufferhelperArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(setusedecodebufferhelperArr$values);
        Companion = new onExtraCallback(null);
        int i = onWarmupCompleted + 63;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final String toLogValue() throws NoWhenBranchMatchedException {
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 87;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0 ? (i = onNavigationEvent.$EnumSwitchMapping$0[ordinal()]) == 1 : (i = onNavigationEvent.$EnumSwitchMapping$0[ordinal()]) == 1) {
            int i4 = IAuthTabCallback + 95;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return "low";
        }
        if (i == 2) {
            return "medium";
        }
        if (i == 3) {
            return "high";
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return "custom";
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final String toShortText() throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int i4 = onNavigationEvent.$EnumSwitchMapping$0[ordinal()];
        if (i4 == 1) {
            return "조금씩";
        }
        if (i4 == 2) {
            return "적당히";
        }
        int i5 = onExtraCallback + 13;
        int i6 = i5 % 128;
        IAuthTabCallback = i6;
        if (i5 % 2 != 0) {
            if (i4 == 5) {
                return "적극적으로";
            }
        } else if (i4 == 3) {
            return "적극적으로";
        }
        if (i4 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        int i7 = i6 + 23;
        onExtraCallback = i7 % 128;
        if (i7 % 2 != 0) {
            return "직접 정해서";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final String toLongText() throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onNavigationEvent.$EnumSwitchMapping$0[ordinal()];
        if (i2 != 1) {
            int i3 = onExtraCallback;
            int i4 = i3 + 115;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            if (i2 == 2) {
                return "적당히 모으기";
            }
            if (i2 == 3) {
                return "적극적으로 모으기";
            }
            int i6 = i3 + 67;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            int i8 = i3 + 63;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            return "직접 정해서 모으기";
        }
        return "조금씩만 모으기";
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }
}
