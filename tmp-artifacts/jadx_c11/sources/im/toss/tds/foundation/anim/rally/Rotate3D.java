package im.toss.tds.foundation.anim.rally;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.isCreativeDebuggerEnabled;
import o.setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class Rotate3D extends isCreativeDebuggerEnabled {
    public /* synthetic */ Rotate3D(Float f, isCreativeDebuggerEnabled.onExtraCallback onextracallback, Float f2, isCreativeDebuggerEnabled.onExtraCallback onextracallback2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, onextracallback, f2, onextracallback2);
    }

    public static final class X extends Rotate3D {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public X(@Nullable Float f, @Nullable isCreativeDebuggerEnabled.onExtraCallback onextracallback, @Nullable Float f2, @Nullable isCreativeDebuggerEnabled.onExtraCallback onextracallback2) {
            super(f, onextracallback, f2, onextracallback2, null);
        }

        public X(@Nullable Float f, @Nullable Float f2) {
            this(f, null, f2, null);
        }

        @Override // o.isCreativeDebuggerEnabled
        public setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 47;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled setshouldfailaddisplayifdontkeepactivitiesisenabled = setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled.RotateX;
            int i4 = IAuthTabCallback + 89;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 76 / 0;
            }
            return setshouldfailaddisplayifdontkeepactivitiesisenabled;
        }
    }

    private Rotate3D(Float f, isCreativeDebuggerEnabled.onExtraCallback onextracallback, Float f2, isCreativeDebuggerEnabled.onExtraCallback onextracallback2) {
        super(f, onextracallback, f2, onextracallback2, null);
    }

    public static final class Y extends Rotate3D {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public Y(@Nullable Float f, @Nullable isCreativeDebuggerEnabled.onExtraCallback onextracallback, @Nullable Float f2, @Nullable isCreativeDebuggerEnabled.onExtraCallback onextracallback2) {
            super(f, onextracallback, f2, onextracallback2, null);
        }

        public Y(@Nullable Float f, @Nullable Float f2) {
            this(f, null, f2, null);
        }

        @Override // o.isCreativeDebuggerEnabled
        public setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 77;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled setshouldfailaddisplayifdontkeepactivitiesisenabled = setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled.RotateY;
            int i4 = onWarmupCompleted + 23;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return setshouldfailaddisplayifdontkeepactivitiesisenabled;
        }
    }

    public static final class Z extends Rotate3D {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public Z(@Nullable Float f, @Nullable isCreativeDebuggerEnabled.onExtraCallback onextracallback, @Nullable Float f2, @Nullable isCreativeDebuggerEnabled.onExtraCallback onextracallback2) {
            super(f, onextracallback, f2, onextracallback2, null);
        }

        public Z(@Nullable Float f, @Nullable Float f2) {
            this(f, null, f2, null);
        }

        @Override // o.isCreativeDebuggerEnabled
        public setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 103;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled setshouldfailaddisplayifdontkeepactivitiesisenabled = setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled.RotateZ;
            if (i3 == 0) {
                int i4 = 46 / 0;
            }
            return setshouldfailaddisplayifdontkeepactivitiesisenabled;
        }
    }
}
