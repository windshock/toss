package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class onReceivedEvent extends isCreativeDebuggerEnabled {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final Function1<Float, Unit> IAuthTabCallback;
    private boolean onExtraCallbackWithResult;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public onReceivedEvent(float f, float f2, @NotNull Function1<? super Float, Unit> function1) {
        super(Float.valueOf(f), Float.valueOf(f2), null);
        Intrinsics.checkNotNullParameter(function1, "");
        this.IAuthTabCallback = function1;
    }

    public final Function1<Float, Unit> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 57;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Function1<Float, Unit> function1 = this.IAuthTabCallback;
        int i5 = i2 + 15;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return function1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.isCreativeDebuggerEnabled
    public setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled setshouldfailaddisplayifdontkeepactivitiesisenabled = setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled.Value;
            throw null;
        }
        setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled setshouldfailaddisplayifdontkeepactivitiesisenabled2 = setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled.Value;
        int i3 = onNavigationEvent + 123;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return setshouldfailaddisplayifdontkeepactivitiesisenabled2;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.isCreativeDebuggerEnabled
    public boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
