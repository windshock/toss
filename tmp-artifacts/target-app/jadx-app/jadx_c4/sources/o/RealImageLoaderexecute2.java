package o;

import kotlin.enums.EnumEntries;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface RealImageLoaderexecute2 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IAuthTabCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallback[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        public static final IAuthTabCallback LEFT = new IAuthTabCallback("LEFT", 0);
        public static final IAuthTabCallback TOP = new IAuthTabCallback("TOP", 1);
        public static final IAuthTabCallback RIGHT = new IAuthTabCallback("RIGHT", 2);
        public static final IAuthTabCallback BOTTOM = new IAuthTabCallback("BOTTOM", 3);

        private static final /* synthetic */ IAuthTabCallback[] $values() {
            IAuthTabCallback[] iAuthTabCallbackArr;
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 105;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                IAuthTabCallback iAuthTabCallback = LEFT;
                IAuthTabCallback iAuthTabCallback2 = TOP;
                IAuthTabCallback iAuthTabCallback3 = RIGHT;
                IAuthTabCallback iAuthTabCallback4 = BOTTOM;
                iAuthTabCallbackArr = new IAuthTabCallback[4];
                iAuthTabCallbackArr[1] = iAuthTabCallback;
                iAuthTabCallbackArr[0] = iAuthTabCallback2;
                iAuthTabCallbackArr[2] = iAuthTabCallback3;
                iAuthTabCallbackArr[4] = iAuthTabCallback4;
            } else {
                iAuthTabCallbackArr = new IAuthTabCallback[]{LEFT, TOP, RIGHT, BOTTOM};
            }
            int i4 = i2 + 31;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 1 / 0;
            }
            return iAuthTabCallbackArr;
        }

        public static EnumEntries<IAuthTabCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 61;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return $ENTRIES;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static IAuthTabCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 39;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
            if (i3 != 0) {
                return iAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static IAuthTabCallback[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 55;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = (IAuthTabCallback[]) $VALUES.clone();
            int i4 = onExtraCallbackWithResult + 15;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return iAuthTabCallbackArr;
            }
            throw null;
        }

        private IAuthTabCallback(String str, int i) {
        }

        static {
            IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
            $VALUES = iAuthTabCallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
            int i = IAuthTabCallback + 117;
            onNavigationEvent = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onWarmupCompleted {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onWarmupCompleted[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;
        public static final onWarmupCompleted NONE = new onWarmupCompleted("NONE", 0);
        public static final onWarmupCompleted LEFT = new onWarmupCompleted("LEFT", 1);
        public static final onWarmupCompleted RIGHT = new onWarmupCompleted("RIGHT", 2);

        private static final /* synthetic */ onWarmupCompleted[] $values() {
            onWarmupCompleted[] onwarmupcompletedArr;
            int i = 2 % 2;
            int i2 = onExtraCallback + 47;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 != 0) {
                onWarmupCompleted onwarmupcompleted = NONE;
                onWarmupCompleted onwarmupcompleted2 = LEFT;
                onWarmupCompleted onwarmupcompleted3 = RIGHT;
                onwarmupcompletedArr = new onWarmupCompleted[4];
                onwarmupcompletedArr[0] = onwarmupcompleted;
                onwarmupcompletedArr[1] = onwarmupcompleted2;
                onwarmupcompletedArr[3] = onwarmupcompleted3;
            } else {
                onwarmupcompletedArr = new onWarmupCompleted[]{NONE, LEFT, RIGHT};
            }
            int i4 = i3 + 63;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return onwarmupcompletedArr;
            }
            throw null;
        }

        public static EnumEntries<onWarmupCompleted> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 1;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            EnumEntries<onWarmupCompleted> enumEntries = $ENTRIES;
            int i5 = i3 + 83;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 44 / 0;
            }
            return enumEntries;
        }

        public static onWarmupCompleted valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 5;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
            int i4 = onWarmupCompleted + 85;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompleted;
        }

        public static onWarmupCompleted[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 71;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted[] onwarmupcompletedArr = $VALUES;
            if (i3 != 0) {
                return (onWarmupCompleted[]) onwarmupcompletedArr.clone();
            }
            int i4 = 60 / 0;
            return (onWarmupCompleted[]) onwarmupcompletedArr.clone();
        }

        private onWarmupCompleted(String str, int i) {
        }

        static {
            onWarmupCompleted[] onwarmupcompletedArr$values = $values();
            $VALUES = onwarmupcompletedArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
            int i = IAuthTabCallback + 35;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                int i2 = 84 / 0;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallbackWithResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallbackWithResult[] $VALUES;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        public static final onExtraCallbackWithResult SMALL = new onExtraCallbackWithResult("SMALL", 0);
        public static final onExtraCallbackWithResult MEDIUM = new onExtraCallbackWithResult("MEDIUM", 1);
        public static final onExtraCallbackWithResult LARGE = new onExtraCallbackWithResult("LARGE", 2);

        private static final /* synthetic */ onExtraCallbackWithResult[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 35;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = {SMALL, MEDIUM, LARGE};
            int i5 = i2 + 111;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return onextracallbackwithresultArr;
            }
            throw null;
        }

        public static EnumEntries<onExtraCallbackWithResult> getEntries() {
            EnumEntries<onExtraCallbackWithResult> enumEntries;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 61;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                enumEntries = $ENTRIES;
                int i4 = 34 / 0;
            } else {
                enumEntries = $ENTRIES;
            }
            int i5 = i2 + 37;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return enumEntries;
            }
            throw null;
        }

        public static onExtraCallbackWithResult valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 77;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) Enum.valueOf(onExtraCallbackWithResult.class, str);
            if (i3 != 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = onWarmupCompleted + 79;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return onextracallbackwithresult;
            }
            obj.hashCode();
            throw null;
        }

        public static onExtraCallbackWithResult[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 41;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = $VALUES;
            if (i3 == 0) {
                return (onExtraCallbackWithResult[]) onextracallbackwithresultArr.clone();
            }
            throw null;
        }

        private onExtraCallbackWithResult(String str, int i) {
        }

        static {
            onExtraCallbackWithResult[] onextracallbackwithresultArr$values = $values();
            $VALUES = onextracallbackwithresultArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackwithresultArr$values);
            int i = onNavigationEvent + 1;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        public static final onExtraCallback NONE = new onExtraCallback("NONE", 0);
        public static final onExtraCallback SHOW = new onExtraCallback("SHOW", 1);
        public static final onExtraCallback HIDE = new onExtraCallback("HIDE", 2);

        private static final /* synthetic */ onExtraCallback[] $values() {
            onExtraCallback[] onextracallbackArr;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 51;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 != 0) {
                onExtraCallback onextracallback = NONE;
                onExtraCallback onextracallback2 = SHOW;
                onExtraCallback onextracallback3 = HIDE;
                onextracallbackArr = new onExtraCallback[3];
                onextracallbackArr[1] = onextracallback;
                onextracallbackArr[0] = onextracallback2;
                onextracallbackArr[5] = onextracallback3;
            } else {
                onextracallbackArr = new onExtraCallback[]{NONE, SHOW, HIDE};
            }
            int i4 = i3 + 67;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return onextracallbackArr;
            }
            throw null;
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            EnumEntries<onExtraCallback> enumEntries;
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 29;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                enumEntries = $ENTRIES;
                int i4 = 63 / 0;
            } else {
                enumEntries = $ENTRIES;
            }
            int i5 = i2 + 1;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static onExtraCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 51;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
            int i4 = onExtraCallbackWithResult + 43;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 61 / 0;
            }
            return onextracallback;
        }

        public static onExtraCallback[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 37;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback[] onextracallbackArr = (onExtraCallback[]) $VALUES.clone();
            int i4 = onExtraCallbackWithResult + 49;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackArr;
        }

        private onExtraCallback(String str, int i) {
        }

        static {
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
            int i = IAuthTabCallback + 7;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }
    }
}
