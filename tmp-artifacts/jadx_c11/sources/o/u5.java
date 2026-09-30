package o;

import kotlin.enums.EnumEntries;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class u5 {
    public static final u5 onExtraCallbackWithResult = new u5();
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    static {
        int i = onWarmupCompleted + 87;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private u5() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onWarmupCompleted implements onPostbackSuccess {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onWarmupCompleted[] $VALUES;
        public static final onWarmupCompleted Content = new onWarmupCompleted("Content", 0);
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        private static final /* synthetic */ onWarmupCompleted[] $values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 11;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            onWarmupCompleted[] onwarmupcompletedArr = {Content};
            int i5 = i3 + 51;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 85 / 0;
            }
            return onwarmupcompletedArr;
        }

        public static EnumEntries<onWarmupCompleted> getEntries() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 33;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return $ENTRIES;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onWarmupCompleted valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 113;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
            if (i3 != 0) {
                int i4 = 74 / 0;
            }
            int i5 = onNavigationEvent + 91;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return onwarmupcompleted;
        }

        public static onWarmupCompleted[] values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 75;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted[] onwarmupcompletedArr = $VALUES;
            if (i3 != 0) {
                return (onWarmupCompleted[]) onwarmupcompletedArr.clone();
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private onWarmupCompleted(String str, int i) {
        }

        static {
            onWarmupCompleted[] onwarmupcompletedArr$values = $values();
            $VALUES = onwarmupcompletedArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
            int i = onWarmupCompleted + 97;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
