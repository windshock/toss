package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.isCreativeDebuggerEnabled;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class AppLovinWebViewActivitya extends isCreativeDebuggerEnabled {
    public /* synthetic */ AppLovinWebViewActivitya(Float f, isCreativeDebuggerEnabled.onExtraCallback onextracallback, Float f2, isCreativeDebuggerEnabled.onExtraCallback onextracallback2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, onextracallback, f2, onextracallback2);
    }

    private AppLovinWebViewActivitya(Float f, isCreativeDebuggerEnabled.onExtraCallback onextracallback, Float f2, isCreativeDebuggerEnabled.onExtraCallback onextracallback2) {
        super(f, onextracallback, f2, onextracallback2, null);
    }

    public static final class onNavigationEvent extends AppLovinWebViewActivitya {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public onNavigationEvent(@Nullable Float f, @Nullable isCreativeDebuggerEnabled.onExtraCallback onextracallback, @Nullable Float f2, @Nullable isCreativeDebuggerEnabled.onExtraCallback onextracallback2) {
            super(f, onextracallback, f2, onextracallback2, null);
        }

        public onNavigationEvent(@Nullable Float f, @Nullable Float f2) {
            this(f, null, f2, null);
        }

        @Override // o.isCreativeDebuggerEnabled
        public setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 31;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled setshouldfailaddisplayifdontkeepactivitiesisenabled = setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled.TranslateX;
            int i4 = onExtraCallback + 35;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return setshouldfailaddisplayifdontkeepactivitiesisenabled;
            }
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult extends AppLovinWebViewActivitya {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public onExtraCallbackWithResult(@Nullable Float f, @Nullable isCreativeDebuggerEnabled.onExtraCallback onextracallback, @Nullable Float f2, @Nullable isCreativeDebuggerEnabled.onExtraCallback onextracallback2) {
            super(f, onextracallback, f2, onextracallback2, null);
        }

        public onExtraCallbackWithResult(@Nullable Float f, @Nullable Float f2) {
            this(f, null, f2, null);
        }

        @Override // o.isCreativeDebuggerEnabled
        public setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 71;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled setshouldfailaddisplayifdontkeepactivitiesisenabled = setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled.TranslateY;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled setshouldfailaddisplayifdontkeepactivitiesisenabled2 = setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled.TranslateY;
            int i3 = onWarmupCompleted + 15;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return setshouldfailaddisplayifdontkeepactivitiesisenabled2;
        }
    }
}
