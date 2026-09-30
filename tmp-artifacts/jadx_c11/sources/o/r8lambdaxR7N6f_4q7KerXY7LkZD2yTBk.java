package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.isCreativeDebuggerEnabled;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class r8lambdaxR7N6f_4q7KerXY7LkZD2yTBk extends isCreativeDebuggerEnabled {
    public /* synthetic */ r8lambdaxR7N6f_4q7KerXY7LkZD2yTBk(Float f, isCreativeDebuggerEnabled.onExtraCallback onextracallback, Float f2, isCreativeDebuggerEnabled.onExtraCallback onextracallback2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, onextracallback, f2, onextracallback2);
    }

    private r8lambdaxR7N6f_4q7KerXY7LkZD2yTBk(Float f, isCreativeDebuggerEnabled.onExtraCallback onextracallback, Float f2, isCreativeDebuggerEnabled.onExtraCallback onextracallback2) {
        super(f, onextracallback, f2, onextracallback2, null);
    }

    public static final class onWarmupCompleted extends r8lambdaxR7N6f_4q7KerXY7LkZD2yTBk {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public onWarmupCompleted(@Nullable Float f, @Nullable isCreativeDebuggerEnabled.onExtraCallback onextracallback, @Nullable Float f2, @Nullable isCreativeDebuggerEnabled.onExtraCallback onextracallback2) {
            super(f, onextracallback, f2, onextracallback2, null);
        }

        public onWarmupCompleted(@Nullable Float f, @Nullable Float f2) {
            this(f, null, f2, null);
        }

        @Override // o.isCreativeDebuggerEnabled
        public setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 37;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled setshouldfailaddisplayifdontkeepactivitiesisenabled = setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled.TranslatePercentX;
            int i4 = onExtraCallback + 73;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return setshouldfailaddisplayifdontkeepactivitiesisenabled;
            }
            throw null;
        }
    }

    public static final class IAuthTabCallback extends r8lambdaxR7N6f_4q7KerXY7LkZD2yTBk {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public IAuthTabCallback(@Nullable Float f, @Nullable isCreativeDebuggerEnabled.onExtraCallback onextracallback, @Nullable Float f2, @Nullable isCreativeDebuggerEnabled.onExtraCallback onextracallback2) {
            super(f, onextracallback, f2, onextracallback2, null);
        }

        public IAuthTabCallback(@Nullable Float f, @Nullable Float f2) {
            this(f, null, f2, null);
        }

        @Override // o.isCreativeDebuggerEnabled
        public setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 111;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled setshouldfailaddisplayifdontkeepactivitiesisenabled = setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled.TranslatePercentY;
            if (i3 != 0) {
                return setshouldfailaddisplayifdontkeepactivitiesisenabled;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
