package o;

import android.graphics.Rect;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface generateAppWithState {

    public interface onExtraCallbackWithResult {
        void onDismiss(@NotNull getAppDataMetadata getappdatametadata);
    }

    void onExtraCallbackWithResult(@NotNull Rect rect);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onWarmupCompleted {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onWarmupCompleted[] $VALUES;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        public static final onWarmupCompleted TOP = new onWarmupCompleted("TOP", 0);
        public static final onWarmupCompleted BOTTOM = new onWarmupCompleted("BOTTOM", 1);

        private static final /* synthetic */ onWarmupCompleted[] $values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 95;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            onWarmupCompleted[] onwarmupcompletedArr = {TOP, BOTTOM};
            int i5 = i3 + 41;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return onwarmupcompletedArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static EnumEntries<onWarmupCompleted> getEntries() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 5;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<onWarmupCompleted> enumEntries = $ENTRIES;
            int i5 = i2 + 81;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static onWarmupCompleted valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
            if (i3 != 0) {
                return onwarmupcompleted;
            }
            throw null;
        }

        public static onWarmupCompleted[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 85;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted[] onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
            int i4 = onNavigationEvent + 51;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompletedArr;
        }

        private onWarmupCompleted(String str, int i) {
        }

        static {
            onWarmupCompleted[] onwarmupcompletedArr$values = $values();
            $VALUES = onwarmupcompletedArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
            int i = onExtraCallback + 79;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onNavigationEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        public static final onNavigationEvent WEAK = new onNavigationEvent("WEAK", 0);
        public static final onNavigationEvent STRONG = new onNavigationEvent("STRONG", 1);

        private static final /* synthetic */ onNavigationEvent[] $values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 87;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            onNavigationEvent[] onnavigationeventArr = {WEAK, STRONG};
            int i5 = i2 + 29;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return onnavigationeventArr;
            }
            throw null;
        }

        public static EnumEntries<onNavigationEvent> getEntries() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 3;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            EnumEntries<onNavigationEvent> enumEntries = $ENTRIES;
            int i4 = i2 + 21;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return enumEntries;
        }

        public static onNavigationEvent valueOf(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 99;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
            int i4 = onNavigationEvent + 3;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return onnavigationevent;
        }

        public static onNavigationEvent[] values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 77;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent[] onnavigationeventArr = (onNavigationEvent[]) $VALUES.clone();
            int i4 = onNavigationEvent + 93;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 79 / 0;
            }
            return onnavigationeventArr;
        }

        private onNavigationEvent(String str, int i) {
        }

        static {
            onNavigationEvent[] onnavigationeventArr$values = $values();
            $VALUES = onnavigationeventArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
            int i = onWarmupCompleted + 35;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        public static final onExtraCallback LEFT = new onExtraCallback("LEFT", 0);
        public static final onExtraCallback CENTER = new onExtraCallback("CENTER", 1);
        public static final onExtraCallback RIGHT = new onExtraCallback("RIGHT", 2);

        private static final /* synthetic */ onExtraCallback[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 113;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            onExtraCallback[] onextracallbackArr = {LEFT, CENTER, RIGHT};
            int i5 = i2 + 101;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return onextracallbackArr;
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 111;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            EnumEntries<onExtraCallback> enumEntries = $ENTRIES;
            int i5 = i3 + 113;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return enumEntries;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onExtraCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 19;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
            if (i3 == 0) {
                int i4 = 9 / 0;
            }
            int i5 = onExtraCallback + 57;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return onextracallback;
            }
            throw null;
        }

        public static onExtraCallback[] values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 27;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback[] onextracallbackArr = (onExtraCallback[]) $VALUES.clone();
            int i4 = IAuthTabCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackArr;
        }

        private onExtraCallback(String str, int i) {
        }

        static {
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
            int i = onExtraCallbackWithResult + 45;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
    }

    default boolean onExtraCallbackWithResult(@NotNull Rect rect, float f, float f2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(rect, "");
        int i2 = rect.left;
        int i3 = rect.right;
        int i4 = (int) f;
        if (i2 > i4 || i4 > i3) {
            return false;
        }
        int i5 = (int) f2;
        return rect.top <= i5 && i5 <= rect.bottom;
    }
}
