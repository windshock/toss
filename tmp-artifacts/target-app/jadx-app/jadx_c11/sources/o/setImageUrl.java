package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class setImageUrl extends isCreativeDebuggerEnabled {
    public /* synthetic */ setImageUrl(Float f, Float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2);
    }

    public static final class onWarmupCompleted extends setImageUrl {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public onWarmupCompleted(@Nullable Float f, @Nullable Float f2) {
            super(f, f2, null);
        }

        @Override // o.isCreativeDebuggerEnabled
        public setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 123;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled setshouldfailaddisplayifdontkeepactivitiesisenabled = setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled.TransformOriginX;
            if (i3 != 0) {
                int i4 = 97 / 0;
            }
            return setshouldfailaddisplayifdontkeepactivitiesisenabled;
        }
    }

    private setImageUrl(Float f, Float f2) {
        super(f, f2, null);
    }

    public static final class onExtraCallbackWithResult extends setImageUrl {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public onExtraCallbackWithResult(@Nullable Float f, @Nullable Float f2) {
            super(f, f2, null);
        }

        @Override // o.isCreativeDebuggerEnabled
        public setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 79;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled setshouldfailaddisplayifdontkeepactivitiesisenabled = setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled.TransformOriginY;
            int i4 = onWarmupCompleted + 25;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return setshouldfailaddisplayifdontkeepactivitiesisenabled;
        }
    }
}
