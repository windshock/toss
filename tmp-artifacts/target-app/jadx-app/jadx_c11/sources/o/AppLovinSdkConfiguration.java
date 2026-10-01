package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinSdkConfiguration extends setCreativeDebuggerEnabled<Function2<? super setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled, ? super Float, ? extends Unit>> {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final Function1<isCreativeDebuggerEnabled, Float> IAuthTabCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AppLovinSdkConfiguration(@NotNull Function1<? super isCreativeDebuggerEnabled, Float> function1, @NotNull Function2<? super setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled, ? super Float, Unit> function2) {
        super(function2);
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.IAuthTabCallback = function1;
    }

    @Override // o.setCreativeDebuggerEnabled
    public void onExtraCallbackWithResult(@NotNull isCreativeDebuggerEnabled iscreativedebuggerenabled, float f) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iscreativedebuggerenabled, "");
        ICustomTabsCallback().invoke(iscreativedebuggerenabled.IAuthTabCallback(), Float.valueOf(f));
        int i4 = onNavigationEvent + 85;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.setCreativeDebuggerEnabled
    public Float onWarmupCompleted(@NotNull isCreativeDebuggerEnabled iscreativedebuggerenabled) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iscreativedebuggerenabled, "");
        Float f = (Float) this.IAuthTabCallback.invoke(iscreativedebuggerenabled);
        int i4 = onExtraCallbackWithResult + 21;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return f;
    }
}
