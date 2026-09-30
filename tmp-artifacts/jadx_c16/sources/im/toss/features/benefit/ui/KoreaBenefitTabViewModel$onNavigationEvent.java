package im.toss.features.benefit.ui;

import im.toss.features.benefit.R$string;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import o.access15300;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class KoreaBenefitTabViewModel$onNavigationEvent {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private final onWarmupCompleted onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 71;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i2 + 125;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(obj instanceof KoreaBenefitTabViewModel$onNavigationEvent)) {
            int i8 = i2 + 67;
            onExtraCallback = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 13 / 0;
            }
            return false;
        }
        if (this.onWarmupCompleted == ((KoreaBenefitTabViewModel$onNavigationEvent) obj).onWarmupCompleted) {
            return true;
        }
        int i10 = i4 + 115;
        onNavigationEvent = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            this.onWarmupCompleted.hashCode();
            throw null;
        }
        int iHashCode = this.onWarmupCompleted.hashCode();
        int i3 = onNavigationEvent + 101;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MissionToastEvent(toastType=" + this.onWarmupCompleted + ")";
        int i2 = onExtraCallback + 109;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 34 / 0;
        }
        return str;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onWarmupCompleted {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onWarmupCompleted[] $VALUES;
        private static int IAuthTabCallback = 1;
        public static final onWarmupCompleted MISSION_REWARD_ERROR = new onWarmupCompleted("MISSION_REWARD_ERROR", 0, R.string.error_retry_message);
        public static final onWarmupCompleted MISSION_REWARD_ERROR_DEBUG = new onWarmupCompleted("MISSION_REWARD_ERROR_DEBUG", 1, R$string.benefit_reward_debug);
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private static int onNavigationEvent;
        private final int stringResId;

        private static final /* synthetic */ onWarmupCompleted[] $values() {
            onWarmupCompleted[] onwarmupcompletedArr;
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 77;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                onWarmupCompleted onwarmupcompleted = MISSION_REWARD_ERROR;
                onWarmupCompleted onwarmupcompleted2 = MISSION_REWARD_ERROR_DEBUG;
                onwarmupcompletedArr = new onWarmupCompleted[2];
                onwarmupcompletedArr[1] = onwarmupcompleted;
                onwarmupcompletedArr[1] = onwarmupcompleted2;
            } else {
                onwarmupcompletedArr = new onWarmupCompleted[]{MISSION_REWARD_ERROR, MISSION_REWARD_ERROR_DEBUG};
            }
            int i4 = i2 + 13;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return onwarmupcompletedArr;
            }
            throw null;
        }

        public static EnumEntries<onWarmupCompleted> getEntries() {
            EnumEntries<onWarmupCompleted> enumEntries;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 15;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 != 0) {
                enumEntries = $ENTRIES;
                int i4 = 3 / 0;
            } else {
                enumEntries = $ENTRIES;
            }
            int i5 = i3 + 47;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static onWarmupCompleted valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 9;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
            int i4 = IAuthTabCallback + 7;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return onwarmupcompleted;
            }
            throw null;
        }

        public static onWarmupCompleted[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 121;
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

        private onWarmupCompleted(String str, int i, int i2) {
            this.stringResId = i2;
        }

        public final int getStringResId() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 81;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return this.stringResId;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            onWarmupCompleted[] onwarmupcompletedArr$values = $values();
            $VALUES = onwarmupcompletedArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
            int i = onNavigationEvent + 61;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }
    }

    public KoreaBenefitTabViewModel$onNavigationEvent(@NotNull onWarmupCompleted onwarmupcompleted) {
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        this.onWarmupCompleted = onwarmupcompleted;
    }

    public final onWarmupCompleted onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        onWarmupCompleted onwarmupcompleted = this.onWarmupCompleted;
        int i4 = i3 + 83;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return onwarmupcompleted;
    }
}
